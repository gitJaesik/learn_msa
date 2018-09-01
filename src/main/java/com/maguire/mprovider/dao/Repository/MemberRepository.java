package com.maguire.mprovider.dao.Repository;

import com.maguire.mprovider.model.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

// member repository 세팅
public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByName(String name);

    @Query(value = "select m from Member m where m.name = :name", nativeQuery = false)
    List<Member> selectByName(@Param("name") String name);
}
