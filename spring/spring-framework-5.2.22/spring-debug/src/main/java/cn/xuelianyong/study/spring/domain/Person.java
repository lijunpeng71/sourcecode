package cn.xuelianyong.study.spring.domain;

import java.io.Serializable;

/**
 * @author lijunpeng
 * 2022/11/29 20:04
 */
public class Person implements Serializable {

	private static final long serialVersionUID = 0L;

	private String username;

	private int age;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
