package com.study.solo.web.api.admin;

import com.study.solo.aop.annotation.ValidAspect;
import com.study.solo.service.BookService;
import com.study.solo.web.dto.CMRespDto;
import com.study.solo.web.dto.SearchReqDto;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Api(tags = {"관리자 도서관리 API"})
@RequestMapping("/api/admin")
@RestController
public class BookApi {
    @Autowired
    private BookService bookService;

    @ValidAspect
    @GetMapping("/books")
    public ResponseEntity<CMRespDto<List<BookMstDto>>> searchBook(@Valid SearchReqDto searchReqDto, BindingResult bindingResult) {
        return ResponseEntity
                .ok()
                .body(new CMRespDto<>(HttpStatus.OK.value(), "Successfully", bookService.searchBook(searchReqDto)));
    }
}
