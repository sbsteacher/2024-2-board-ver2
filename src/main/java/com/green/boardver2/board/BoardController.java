package com.green.boardver2.board;

import com.green.boardver2.board.model.BoardDetailGetRes;
import com.green.boardver2.board.model.BoardGetRes;
import com.green.boardver2.board.model.BoardPostReq;
import com.green.boardver2.board.model.BoardPutReq;
import com.green.boardver2.common.ResultDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("board")
public class BoardController {
    private final BoardService service;

    @PostMapping
    public ResultDto<Integer> postBoard(@RequestBody BoardPostReq p) {
        int result = service.postBoard(p);

        return ResultDto.<Integer>builder()
                .statusCode(HttpStatus.OK)
                .resultMsg("")
                .resultData(result).build();
    }

    @GetMapping
    public ResultDto<List<BoardGetRes>> getBoardList() {
        List<BoardGetRes> list = service.getBoardList();

        return ResultDto.<List<BoardGetRes>>builder()
                .statusCode(HttpStatus.OK)
                .resultMsg(String.format("rowCount: %d", list.size()))
                .resultData(list).build();
    }

    @GetMapping("{board_id}")
    public ResultDto<BoardDetailGetRes> getBoardOne(@PathVariable(name = "board_id") long boardId) {
        BoardDetailGetRes result = service.getBoardOne(boardId);

        return ResultDto.<BoardDetailGetRes>builder()
                .statusCode(HttpStatus.OK)
                .resultMsg(result == null ? "내용을 찾을 수 없습니다." : HttpStatus.OK.toString())
                .resultData(result).build();
    }

    @PutMapping
    public ResultDto<Integer> putBoard(@RequestBody BoardPutReq p) {
        int result = service.putBoard(p);
        return ResultDto.<Integer>builder()
                .statusCode(HttpStatus.OK)
                .resultMsg(HttpStatus.OK.toString())
                .resultData(result).build();
    }

    @DeleteMapping
    public ResultDto<Integer> deleteBoard(@RequestParam(name = "board_id") long boardId) {
        int result = service.deleteBoard(boardId);
        return ResultDto.<Integer>builder()
                .statusCode(HttpStatus.OK)
                .resultMsg(HttpStatus.OK.toString())
                .resultData(result).build();
    }
}
