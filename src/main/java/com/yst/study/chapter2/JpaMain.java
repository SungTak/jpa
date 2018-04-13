/*
 * @(#)JpaMain.java 2018. 04. 12.
 *
 * Copyright 2018 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yst.study.chapter2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.yst.study.chapter2.model.Member;
import com.yst.study.chapter2.service.MemberService;
import com.yst.study.chapter2.service.MemberServiceImpl;

/**
 * @author sungtak.yoon@nhn.com
 * @since 2018. 04. 12.
 */
public class JpaMain {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpabook");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();

		try {
			tx.begin();

			Member member = new Member();
			member.setId("id1");
			member.setUserName("지한");
			member.setAge(2);

			MemberService memberService = new MemberServiceImpl();
			memberService.insert(entityManager, member);

			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}
	}
}
