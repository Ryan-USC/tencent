package com.tencent.controller;


import com.tencent.model.A;
import com.tencent.model.SumData;
import com.tencent.service.AService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AController {

    @Resource
    private AService aService;

    @GetMapping("/A/query/{id}")
    public String queryA(@PathVariable("id") String id){
        A res = aService.queryA(id);
        return res.toString();
    }

    @GetMapping("/A/fuzzy/{slice}")
    public List<A> fuzzyQuery(@PathVariable("slice") String slice){
        return aService.queryByParameter(slice);
    }

    @PutMapping("/A/insert")
    public void insertA(A record){
        aService.insertA(record);
    }

    @PutMapping("/A/update/{id}")
    public void updateA(@RequestBody A record, @PathVariable("id") String A){
        aService.updateA(record);
    }

    @GetMapping("/A/delete/{id}")
    public void deleteA(@PathVariable("id") String id){
        aService.deleteA(id);
    }




}
