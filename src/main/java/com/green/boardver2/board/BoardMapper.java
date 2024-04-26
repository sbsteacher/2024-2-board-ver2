package com.green.boardver2.board;

import com.green.boardver2.board.model.BoardDetailGetRes;
import com.green.boardver2.board.model.BoardGetRes;
import com.green.boardver2.board.model.BoardPostReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int postBoard(BoardPostReq p);
    List<BoardGetRes> getBoardList();
    BoardDetailGetRes getBoardOne(long boardId);
}
