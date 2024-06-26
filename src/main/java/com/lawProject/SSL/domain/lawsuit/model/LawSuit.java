package com.lawProject.SSL.domain.lawsuit.model;

import com.lawProject.SSL.domain.model.BaseEntity;
import com.lawProject.SSL.domain.user.model.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static jakarta.persistence.FetchType.LAZY;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LawSuit extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "law_suit_id")
    private Long id;

    private String fileUrl;

    private LocalDateTime expireTime;

//    @NotNull
//    private SuitStatus suitStatus;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
