package org.atomsk.domain;

import java.util.Date;
//가게정보를 불러오기
public class MenuVO {

    private int mno, sno;
    private String mname;
    private int price;
    private Date regdate;

    @Override
    public String toString() {
        return "MenuVO{" +
                "mno=" + mno +
                ", sno=" + sno +
                ", mname='" + mname + '\'' +
                ", price=" + price +
                ", regdate=" + regdate +
                '}';
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }
}
