package com.yuanning.backbug.entity.request;

import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * @author shuang.kou
 * @description 用户登录请求DTO
 */
@Data
@AllArgsConstructor
public class LoginRequest {
    private String email;
    private String password;
    private Boolean rememberMe;
}
