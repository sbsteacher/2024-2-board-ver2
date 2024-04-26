package com.green.boardver2.board.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardGetReq {
    private int page; //페이지 값
    private int size = 10; //페이지 당 레코드 수

    @JsonIgnore
    private int startIdx;
    @JsonIgnore
    private int len;

}
