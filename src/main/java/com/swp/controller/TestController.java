package com.swp.controller;

import com.swp.entity.Test;
import com.swp.service.TestService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Test)表控制层
 *
 * @author makejava
 * @since 2020-11-24 09:56:23
 */
@RestController
@RequestMapping("test")
public class TestController {
    /**
     * 服务对象
     */
    @Resource
    private TestService testService;

    @GetMapping("/queryBySection")
    public List<Test> queryBySection(Test test) {
        return testService.queryBySection(test);
    }


    @PostMapping("insertTest")
    public Integer insertTest(@RequestBody(required = false) Test test){
        return testService.insertTest(test);
    }

}