package ch.hslu.saqt.refactoring.h_local_extension;

import java.util.Date;

public class MyDateWrapper {

    private Date date;

    public MyDateWrapper(Date date) {
        this.date = date;
    }

    public Date nextDay() {
        return new Date(date.getYear(), date.getMonth(), date.getDate() + 1);
    }

}
