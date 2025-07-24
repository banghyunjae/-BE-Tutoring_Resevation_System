package com.market.tutoringsystem.domain;

import com.market.tutoringsystem.global.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Admin extends BaseEntity {

    @Id
    private UUID adminId;

    @Column(nullable = false, length = 50)
    private String kakaoId;

    @Column(nullable = false, length = 20)
    private String name;
}
