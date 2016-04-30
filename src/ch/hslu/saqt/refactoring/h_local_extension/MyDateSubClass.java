package ch.hslu.saqt.refactoring.h_local_extension;

import java.util.Date;

public class MyDateSubClass extends Date {

    public Date nextDay() {
        return new Date(getYear(), getMonth(), getDate() + 1);
    }

}
