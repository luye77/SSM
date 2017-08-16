package com.baimi.routerweb.common;

import net.sf.json.JSONObject;

/**
 * @ClassName: ErrorHandle
 * @Description:返回错误信息给客户端的处理类
 * @author: libiao
 * @date: 2015-12-15 上午10:54:26
 */
public class ErrorHandle {
	public static final int SERVICE_UNRESPONSE = 400000;// 服务器未响应
	public static final int INVALID_CODE = 400101;// 无效的code
	public static final int INVALID_TOKEN = 400102;// 无效的token
	public static final int INVALID_USER=400103;//无效用户

	public static String getError(int errorCode, String errorMsg) {
		JSONObject obj = new JSONObject();
		obj.put("result", false);
		obj.put("msg", errorMsg);
		obj.put("code", errorCode);
		return obj.toString();
	}
}
