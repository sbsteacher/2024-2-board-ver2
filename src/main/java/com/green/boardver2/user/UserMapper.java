package com.green.boardver2.user;

import com.green.boardver2.user.model.UserPostReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int postUser(UserPostReq p);
}
