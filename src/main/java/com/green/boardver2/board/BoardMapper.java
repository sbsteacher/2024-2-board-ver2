package com.green.boardver2.board;

import com.green.boardver2.board.model.BoardPostReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    int postBoard(BoardPostReq p);
}
