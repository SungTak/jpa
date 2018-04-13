/*
 * @(#)Member.java 2018. 04. 12.
 *
 * Copyright 2018 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yst.study.chapter2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author sungtak.yoon@nhn.com
 * @since 2018. 04. 12.
 */
@Getter
@Setter
@Entity
@Table(name = Member.TABLE_NAME)
public class Member {
	public static final String TABLE_NAME = "MEMBER";
	private static final String COLUMN_ID = "ID";
	private static final String COLUMN_NAME = "NAME";

	@Id
	@Column(name = COLUMN_ID)
	private String id;
	@Column(name = COLUMN_NAME)
	private String userName;
	// 직접 매핑하지 않으면 필드명으로 매핑
	private Integer age;
}
