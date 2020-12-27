package com.moolng.controller;


import com.moolng.entity.UserAO;
import org.springframework.web.bind.annotation.*;

/**
 * @author 306548063@qq.com
 * @Desc
 * @date 2020/12/26 23:53
 */
@RestController()
@RequestMapping("/s1")
public class IndexController {

    @GetMapping(value = "/index/{str}")
    public String index(@PathVariable String str){
        return "{\"message\":\"success==>"+str+"\"}";
    }

    @PostMapping(value = "/postIndex")
    public String postIndex(@RequestBody UserAO userAO){
        System.out.println(userAO.toString());
        return "{\"message\":\"post success\"}";
    }
}
