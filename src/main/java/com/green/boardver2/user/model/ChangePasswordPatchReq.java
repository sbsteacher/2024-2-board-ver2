package com.green.boardver2.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

//대상 지정(pk or 아이디), 기존 비밀번호(대상의 원 주인인지 체크), 신규 비밀번호
//pk는 모르기 때문에 아이디를 보낸다.
@Setter
@Getter
public class ChangePasswordPatchReq {
    @JsonIgnore
    private long userId;
    private String uid;
    private String currentPw;
    private String newPw;
}

