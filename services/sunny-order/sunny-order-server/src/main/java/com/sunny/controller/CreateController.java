package com.sunny.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创建控制器
 *
 * @author Jeffrey Liu
 * @date 2022/07/04
 */
@RestController
public class CreateController {

    /**
     * 指数
     *
     * @return {@link String}
     */
    @GetMapping("/")
    public String index(){
        return "hello";
    }

}
