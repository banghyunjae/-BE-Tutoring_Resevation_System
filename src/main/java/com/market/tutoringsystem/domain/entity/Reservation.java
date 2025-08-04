package com.market.tutoringsystem.domain.entity;

import com.market.tutoringsystem.global.BaseEntity;
import com.market.tutoringsystem.global.enums.ReservationStatus;
import com.market.tutoringsystem.global.enums.ReservationType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
public class Reservation extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID reservationId;

    // 신청 제목
    private String name;

    // 신청자
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Account user;
    // 튜터
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Account tutor;

    private ReservationType type;

    // 일자
    private Date date;

    // 시작시간
    private Time startTime;
    // 종료시간
    private Time endTime;

    // 신청 메세지
    private String content;

    // 신청 상태
    private ReservationStatus status;

    private String reject;

}
