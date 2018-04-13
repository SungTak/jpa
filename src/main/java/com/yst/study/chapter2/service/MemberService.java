package com.yst.study.chapter2.service;

import javax.persistence.EntityManager;

import com.yst.study.chapter2.model.Member;

/**
 *
 */
public interface MemberService {
	void insert(EntityManager entityManager, Member member);
}
