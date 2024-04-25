package com.green.boardver2.user.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SignInPostReq {
    private String uid;
    private String upw;
}
