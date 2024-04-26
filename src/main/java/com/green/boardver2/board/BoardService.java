package com.green.boardver2.board;

import com.green.boardver2.board.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper mapper;

    public int postBoard(BoardPostReq p) {
        return mapper.postBoard(p);
    }

    public List<BoardGetRes> getBoardList(BoardGetReq p) {
        return mapper.getBoardList(p);
    }

    public BoardDetailGetRes getBoardOne(long boardId) {
        return mapper.getBoardOne(boardId);
    }

    public int putBoard(BoardPutReq p) {
        return mapper.putBoard(p);
    }

    public int deleteBoard(long boardId) {
        return mapper.deleteBoard(boardId);
    }
}
