package com.maguire.mprovider.model.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@Entity // JPA @Entity
@Table(name="tbl_members")
public class Member {
    // @Id는 필수 나머지 @GeneratedValue, @Column 는 DDL 생성용
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long memberNo;

    @Column(nullable = false)
    private String name;

    @NotNull
    @Column(nullable = false, length = 60)
    private String password;


}
