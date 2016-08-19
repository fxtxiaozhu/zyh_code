package com.xuefeng.ssh.action;

import com.opensymphony.xwork2.Action;
import com.xuefeng.ssh.service.LoginService;

public class LoginAction implements Action {

	// 对应于login.jsp的输入，�?��getter和setter
	private String username;

	private String password;

	/**
	 * 验证登录的�?�?
	 */
	private LoginService loginService;
	
	public LoginAction() {
//		loginService = new LoginServiceImpl();
	}

	public String execute() throws Exception {
		if (loginService != null && loginService.validate(username, password)) {
			return SUCCESS;
		}
		return INPUT;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
}
