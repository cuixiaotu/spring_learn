package com.xiaotu.spring5;

public class Book {
    private String bname;
    private String bauther;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauther(String bauther) {
        this.bauther = bauther;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", bauther='" + bauther + '\'' +
                '}';
    }
}
