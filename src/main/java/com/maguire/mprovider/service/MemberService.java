package com.maguire.mprovider.service;

import com.maguire.mprovider.dao.Repository.MemberRepository;
import com.maguire.mprovider.model.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // memberRepository가 기본 제공하는 findOne, getOne
//    public Member getByNoAtJpaDefault(Long no) {
//
//        return memberRepository.findOne(no);
//    }

    public List<Member> findAll() {
        return memberRepository.findAll();
    }

}

