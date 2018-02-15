package com.demospringsecurity2.demospringsecurity2.domain.models;

import com.demospringsecurity2.demospringsecurity2.domain.models.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/*
Create By: Ron Rith
Create Date: 1/2/2018
*/
@Entity
@Table(name = "role")
public class Role extends BaseEntity{
	@Column(name="role")
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
