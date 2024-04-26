package com.green.boardver2.board;

import com.green.boardver2.board.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int postBoard(BoardPostReq p);
    List<BoardGetRes> getBoardList(BoardGetReq p);
    BoardDetailGetRes getBoardOne(long boardId);
    int putBoard(BoardPutReq p);
    int deleteBoard(long boardId);
}
