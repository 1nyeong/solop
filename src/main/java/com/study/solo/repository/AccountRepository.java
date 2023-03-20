package com.study.solo.repository;

import com.study.solo.web.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountRepository {
    public UserDto findUserByUsername(String username);
}
