package com.example.demo.Board;

import com.example.demo.entity.BaseTimeEntity;
import com.example.demo.enums.BoardType;


import lombok.*;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter @Setter
@ToString
@AllArgsConstructor
@Builder
@Entity
public class Board extends BaseTimeEntity{

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String title;

    @Column
    private String subTitle;

    @Column
    private String content;

    @Column
    @Enumerated(EnumType.STRING)
    private BoardType boardType;

    //@OneToOne(fetch= FetchType.LAZY)
    //private User user;

    @Builder
    public Board(String title, String subTitle, String content, BoardType boardType) {
        this.title = title;
        this.subTitle = subTitle;
        this.content = content;
        this.boardType = boardType;
        
        //this.user = user;
    }
}

