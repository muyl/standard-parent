package com.github.web;

import com.github.api.UidGenService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 拓仲 on 2020/4/7
 */
@RestController
public class TestController {

    @Reference(version = "1.0.0")
    private UidGenService uidGenService;


    @GetMapping("getUid")
    public Long getUid(){
        return uidGenService.getUid();
    }
}
