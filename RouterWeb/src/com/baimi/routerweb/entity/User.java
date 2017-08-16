package com.baimi.routerweb.entity;

public class User {
	private int userId;// 用户ID
	private int compId;
	private String euserName;
	private String euserPhone;
	private int euserStatus;
	private String eAddTime;
	private String eLeaveTime;
	private String eUserNameCn;
	private int cUserId;// 创建人ID
	private String scDown;
	private String userDesc;// 备注信息

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCompId() {
		return compId;
	}

	public void setCompId(int compId) {
		this.compId = compId;
	}

	public String getEuserName() {
		return euserName;
	}

	public void setEuserName(String euserName) {
		this.euserName = euserName;
	}

	public String getEuserPhone() {
		return euserPhone;
	}

	public void setEuserPhone(String euserPhone) {
		this.euserPhone = euserPhone;
	}

	public int getEuserStatus() {
		return euserStatus;
	}

	public void setEuserStatus(int euserStatus) {
		this.euserStatus = euserStatus;
	}

	public String geteAddTime() {
		return eAddTime;
	}

	public void seteAddTime(String eAddTime) {
		this.eAddTime = eAddTime;
	}

	public String geteLeaveTime() {
		return eLeaveTime;
	}

	public void seteLeaveTime(String eLeaveTime) {
		this.eLeaveTime = eLeaveTime;
	}

	public String geteUserNameCn() {
		return eUserNameCn;
	}

	public void seteUserNameCn(String eUserNameCn) {
		this.eUserNameCn = eUserNameCn;
	}

	public int getcUserId() {
		return cUserId;
	}

	public void setcUserId(int cUserId) {
		this.cUserId = cUserId;
	}

	public String getScDown() {
		return scDown;
	}

	public void setScDown(String scDown) {
		this.scDown = scDown;
	}

	public String getUserDesc() {
		return userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", compId=" + compId + ", euserName="
				+ euserName + ", euserPhone=" + euserPhone + ", euserStatus="
				+ euserStatus + ", eAddTime=" + eAddTime + ", eLeaveTime="
				+ eLeaveTime + ", eUserNameCn=" + eUserNameCn + ", cUserId="
				+ cUserId + ", scDown=" + scDown + ", userDesc=" + userDesc
				+ "]";
	}


}
