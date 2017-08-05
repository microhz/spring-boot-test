package com.spring.boot.test.transaction;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author micro
 * @date 2017年8月5日
 * @description :
 */
@Entity
public class Log {
	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String title;

	@Column
	private String content;

	@Column
	private Long userId;

	@Column
	private Date createTime;

	@Column
	private Integer status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
