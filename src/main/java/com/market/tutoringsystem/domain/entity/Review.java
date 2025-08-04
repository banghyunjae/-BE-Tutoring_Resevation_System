package com.market.tutoringsystem.domain.entity;

import com.market.tutoringsystem.global.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
public class Review extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID reviewId;

    @OneToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

    private Long rating;

    private String content;
}
