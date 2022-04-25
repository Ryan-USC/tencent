package com.tencent.model;

public class C {
    private String B;
    private Float aaS;
    private Float bbS;
    private Float ccS;
    private Float aaA;
    private Float bbA;
    private Float ccA;
    private Float aaSS;
    private Float aaC;
    private Float ddS;


    @Override
    public String toString() {
        return "C{" +
                "B='" + B + '\'' +
                ", aaS=" + aaS +
                ", bbS=" + bbS +
                ", ccS=" + ccS +
                ", aaA=" + aaA +
                ", bbA=" + bbA +
                ", ccA=" + ccA +
                ", aaSS=" + aaSS +
                ", aaC=" + aaC +
                ", ddS=" + ddS +
                '}';
    }

    public C(String b) {
        B = b;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    public Float getAaS() {
        return aaS;
    }

    public void setAaS(Float aaS) {
        this.aaS = aaS;
    }

    public Float getBbS() {
        return bbS;
    }

    public void setBbS(Float bbS) {
        this.bbS = bbS;
    }

    public Float getCcS() {
        return ccS;
    }

    public void setCcS(Float ccS) {
        this.ccS = ccS;
    }

    public Float getAaA() {
        return aaA;
    }

    public void setAaA(Float aaA) {
        this.aaA = aaA;
    }

    public Float getBbA() {
        return bbA;
    }

    public void setBbA(Float bbA) {
        this.bbA = bbA;
    }

    public Float getCcA() {
        return ccA;
    }

    public void setCcA(Float ccA) {
        this.ccA = ccA;
    }

    public Float getAaSS() {
        return aaSS;
    }

    public void setAaSS(Float aaSS) {
        this.aaSS = aaSS;
    }

    public Float getAaC() {
        return aaC;
    }

    public void setAaC(Float aaC) {
        this.aaC = aaC;
    }

    public Float getDdS() {
        return ddS;
    }

    public void setDdS(Float ddS) {
        this.ddS = ddS;
    }
}
