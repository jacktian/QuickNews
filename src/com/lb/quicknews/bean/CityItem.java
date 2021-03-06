package com.lb.quicknews.bean;

import com.lb.quicknews.wedget.city.ContactItemInterface;

public class CityItem implements ContactItemInterface {
	private String nickName;
	private String fullName;

	public CityItem(String nickName, String fullName) {
		super();
		this.nickName = nickName;
		this.fullName = fullName;
	}

	@Override
	public String getItemForIndex() {
		return fullName;
	}

	@Override
	public String getDisplayInfo() {
		return nickName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
