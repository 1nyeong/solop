package com.study.solo.repository;

import com.study.solo.web.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountRepository {

    public UserDto findUserByUserId(int userId);
    public UserDto findUserByUsername(String username);

    public int saveUser(UserDto user);

    public int saveRole(UserDto role);


}
