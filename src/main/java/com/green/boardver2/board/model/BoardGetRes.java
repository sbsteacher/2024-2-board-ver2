package com.green.boardver2.board.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardGetRes {
    private long boardId;
    private String title;
    private long writerId;
    private String writerNm;
    private int hits;
    private String createdAt;
}
