package com.tencent.controller;


import com.tencent.model.A;
import com.tencent.model.B;
import com.tencent.service.BService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class BController {
    @Resource
    private BService bService;

    @GetMapping("/B/query/{A}/{B}")
    public String queryB(@PathVariable("A") String A, @PathVariable("B") String B){
        return bService.queryB(A,B).toString();
    }

    @PutMapping("/B/insert")
    public void insertB(B record){
        bService.insertB(record);
    }

    @PutMapping("/B/update/{A}")
    public void updateB(@RequestBody B record, @PathVariable("A") String A){
        bService.updateB(record);
    }

    @GetMapping("/B/delete/{A}/{B}")
    public void deleteB(@PathVariable("A") String A, @PathVariable("B") String B){
        bService.deleteB(A,B);
    }

    @GetMapping("/B/queryAll")
    public void queryAll(){
        bService.queryAll();
    }

    @GetMapping("/B/delete/{B}")
    public void batchDelete(@PathVariable("B") String B){
        bService.batchDelete(B);
    }
}
