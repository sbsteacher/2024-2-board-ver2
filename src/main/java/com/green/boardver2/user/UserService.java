package com.green.boardver2.user;

import com.green.boardver2.user.model.SignInPostReq;
import com.green.boardver2.user.model.UserEntity;
import com.green.boardver2.user.model.UserPostReq;
import lombok.RequiredArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper mapper;

    public int postUser(UserPostReq p) {
        //비밀번호 암호화
        String hashedPassword = BCrypt.hashpw(p.getUpw(), BCrypt.gensalt());
        p.setUpw(hashedPassword);
        return mapper.postUser(p);
    }

    //1: 로그인 성공, 2: 아이디 없음, 3: 비밀번호 다름
    public int postSignIn(SignInPostReq p) {
        UserEntity entity = mapper.getUserById(p.getUid());
        if(entity == null) { return 2; }
        //BCrypt.
        return 0;
    }
}
