package com.study.solo.repository;

import com.study.solo.web.dto.SearchReqDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookRepository {
    public List<BookMstDto> searchBook(SearchReqDto searchReqDto);
}
