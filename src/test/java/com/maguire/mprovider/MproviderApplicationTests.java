package com.maguire.mprovider;

import com.maguire.mprovider.dao.Repository.MemberRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MproviderApplicationTests {

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void contextLoads() {
        System.out.println(memberRepository.findAll());
    }

}
