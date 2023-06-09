package com.study.solo.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RoleDtlDto {
    private int roleDtlId;

    private int userId;
    private int roleId;

    private RoleMstDto roleMstDto;

    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}