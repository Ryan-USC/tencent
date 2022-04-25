package com.tencent.controller;


import com.tencent.model.A;
import com.tencent.model.B;
import com.tencent.model.C;
import com.tencent.service.AService;
import com.tencent.service.BService;
import com.tencent.service.CService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CController {
    @Resource
    private AService aService;
    @Resource
    private BService bService;
    @Resource
    private CService cService;

    @GetMapping("/C/calculate/{B}")
    public String calculate(@PathVariable("B") String Bid){
        List<B> BList = bService.queryByB(Bid);
        int aaSumA = aService.sumAaa(), bbSumA = aService.sumAbb(), ccSumA = aService.sumAcc(), ddSumA = aService.sumAcc(), eeSumA = aService.sumAee();
        int aaSumB = 0, bbSumB = 0, ccSumB = 0, ddSumB = 0, eeSumB = 0;
        int aaCorrect = 0, bbCorrect = 0, ccCorrect = 0, ddCorrect = 0, eeCorrect = 0;

        for (B b: BList){
            A curA = aService.queryA(b.getA());
            if (b.getAa() == 1 && curA.getAa() == 1) b.setAa_correct(1);
            else b.setAa_correct(0);
            if (b.getBb() == 1 && curA.getBb() == 1) b.setBb_correct(1);
            else b.setBb_correct(0);
            if (b.getCc() == 1 && curA.getCc() == 1) b.setCc_correct(1);
            else b.setCc_correct(0);
            if (b.getDd() == 1 && curA.getDd() == 1) b.setDd_correct(1);
            else b.setDd_correct(0);
            if (b.getEe() == 1 && curA.getEe() == 1) b.setEe_correct(1);
            else b.setEe_correct(0);
            aaSumB += b.getAa();
            bbSumB += b.getBb();
            ccSumB += b.getCc();
            ddSumB += b.getDd();
            eeSumB += b.getEe();
            aaCorrect += b.getAa_correct();
            bbCorrect += b.getBb_correct();
            ccCorrect += b.getCc_correct();
            ddCorrect += b.getDd_correct();
            eeCorrect += b.getEe_correct();
        }

        C result = new C(Bid);

        if (aaSumA == 0) result.setAaS((float) 0);
        else result.setAaS((float) aaCorrect / aaSumA);
        if (bbSumA == 0)result.setBbS((float) 0);
        else result.setBbS((float) bbCorrect / bbSumA);
        if (ccSumA == 0) result.setCcS((float) 0);
        else result.setCcS((float) ccCorrect / ccSumA);
        if (aaSumB == 0) result.setAaA((float) 0);
        else result.setAaA((float) aaCorrect / aaSumB);
        if (bbSumB == 0) result.setBbA((float) 0);
        else result.setBbA((float) bbCorrect / bbSumB);
        if (ccSumB == 0) result.setCcA((float) 0);
        else result.setCcA((float) ccCorrect / ccSumB);
        if (eeSumA == 0) result.setAaSS((float) 0);
        else result.setAaSS((float) eeCorrect / eeSumA);
        if ((aaSumA + eeSumA) == 0) result.setAaC((float) 0);
        else result.setAaC((float) (aaCorrect + eeCorrect) / (aaSumA + eeSumA));
        if (ddSumA == 0) result.setDdS((float) 0);
        else result.setDdS((float) ddCorrect / ddSumA);
        cService.updateC(result);
        return result.toString();
    }
}
