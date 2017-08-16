package com.baimi.routerweb.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baimi.routerweb.common.Constant;
import com.baimi.routerweb.common.ErrorHandle;
import com.baimi.routerweb.datasource.DataSourceContextHolder;
import com.baimi.routerweb.datasource.DataSourceType;
import com.baimi.routerweb.entity.User;
import com.baimi.routerweb.service.UserService;
import com.baimi.routerweb.util.HttpUtil;

@Controller
public class MainController {

	@Resource(name = "userServiceImpl")
	private UserService userService;

	@RequestMapping("/login.do")
	public String login(HttpServletRequest request, HttpServletResponse response) {
		// 获取客户端传过来的code的值
		String code = request.getParameter("code");
		if (code == null || "".equals(code)) {
			return ErrorHandle.getError(ErrorHandle.INVALID_TOKEN,"invalid token");
		}
		// 从微信得到token的值
		JSONObject objToken = HttpUtil.httpRequest(Constant.URL_WEIXIN_TOKEN,"GET", null);
		if (objToken == null || "".equals(objToken)) {
			return ErrorHandle.getError(ErrorHandle.SERVICE_UNRESPONSE,"service unresponse");
		}
		if (!objToken.has("access_token")) {
			return ErrorHandle.getError(ErrorHandle.INVALID_TOKEN,"invalid token");
		}
		//根据token和code得到UserId
		JSONObject objUser = HttpUtil.httpRequest(Constant.URL_GET_USERID,
				"POST", "access_token=" + objToken.getString("access_token")+ "&code=" + code + "&agentid=1");
		if(objUser==null||"".equals(objUser)){
			return ErrorHandle.getError(ErrorHandle.SERVICE_UNRESPONSE,"service unresponse");
		}
		if(!objUser.has("UserId")){
			return ErrorHandle.getError(ErrorHandle.INVALID_TOKEN,"invalid token");
		}
		String userId=objUser.getString("UserId");
		//切换数据库
		DataSourceContextHolder.setDbType(DataSourceType.SOURCE_MOP);
		//从数据库中得到该用户的数据
		User user=userService.getUser(userId);
		if(user!=null){
			JSONObject rtObj = new JSONObject();
			rtObj.put("userId", String.valueOf(user.getUserId()));
			return rtObj.toString();	
		}
		 return ErrorHandle.getError(ErrorHandle.INVALID_USER,"invalid user");
	}
}
