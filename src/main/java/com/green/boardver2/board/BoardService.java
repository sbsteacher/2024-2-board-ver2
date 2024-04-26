package com.green.boardver2.board;

import com.green.boardver2.board.model.BoardDetailGetRes;
import com.green.boardver2.board.model.BoardGetRes;
import com.green.boardver2.board.model.BoardPostReq;
import com.green.boardver2.board.model.BoardPutReq;
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

    public List<BoardGetRes> getBoardList() {
        return mapper.getBoardList();
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
