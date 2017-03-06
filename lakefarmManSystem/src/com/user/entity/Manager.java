package com.user.entity;

/**
 * @author hpf
 * @remark 后台管理员bean
 */
public class Manager {
	private int man_id;
	private String man_managername;
	private String man_password;
	private String man_identity;
	private String man_true_name;
	private String man_email;
	private String man_icon;

	public int getMan_id() {
		return man_id;
	}

	public void setMan_id(int man_id) {
		this.man_id = man_id;
	}

	public String getMan_managername() {
		return man_managername;
	}

	public void setMan_managername(String man_managername) {
		this.man_managername = man_managername;
	}

	public String getMan_password() {
		return man_password;
	}

	public void setMan_password(String man_password) {
		this.man_password = man_password;
	}

	public String getMan_identity() {
		return man_identity;
	}

	public void setMan_identity(String man_identity) {
		this.man_identity = man_identity;
	}

	public String getMan_true_name() {
		return man_true_name;
	}

	public void setMan_true_name(String man_true_name) {
		this.man_true_name = man_true_name;
	}

	public String getMan_email() {
		return man_email;
	}

	public void setMan_email(String man_email) {
		this.man_email = man_email;
	}

	public String getMan_icon() {
		return man_icon;
	}

	public void setMan_icon(String man_icon) {
		this.man_icon = man_icon;
	}
}
