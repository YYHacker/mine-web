package com.main.web.dao;

public class Menu {
	private Long id;
	
	private String MenuCode;
	
	private String MenuName;
	
	private boolean leaf;
	
	private Long fatherId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMenuCode() {
		return MenuCode;
	}

	public void setMenuCode(String menuCode) {
		MenuCode = menuCode;
	}

	public String getMenuName() {
		return MenuName;
	}

	public void setMenuName(String menuName) {
		MenuName = menuName;
	}

	public boolean isLeaf() {
		return leaf;
	}

	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}

	public Long getFatherId() {
		return fatherId;
	}

	public void setFatherId(Long fatherId) {
		this.fatherId = fatherId;
	}
}
