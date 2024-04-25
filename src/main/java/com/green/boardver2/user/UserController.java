package com.green.boardver2.user;

import com.green.boardver2.common.ResultDto;
import com.green.boardver2.user.model.UserPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {
    private final UserService service;

    @PostMapping
    public ResponseEntity<ResultDto<Integer>> postUser(@RequestBody UserPostReq p) {
        int result = service.postUser(p);

        return ResponseEntity.ok(ResultDto.<Integer>builder()
                                        .statusCode(HttpStatus.OK)
                                        .resultMsg(HttpStatus.OK.toString())
                                        .resultData(result).build()
        );
    }
}
