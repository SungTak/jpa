/*
 * @(#)MemberServiceImpl.java 2018. 04. 12.
 *
 * Copyright 2018 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yst.study.chapter2.service;

import javax.persistence.EntityManager;

import com.yst.study.chapter2.model.Member;

/**
 * @author sungtak.yoon@nhn.com
 * @since 2018. 04. 12.
 */
public class MemberServiceImpl implements MemberService {
	@Override
	public void insert(EntityManager entityManager, Member member) {
		entityManager.persist(member);
	}
}
