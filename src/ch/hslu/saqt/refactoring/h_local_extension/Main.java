package ch.hslu.saqt.refactoring.h_local_extension;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        MyDateSubClass previousEndSubClass = new MyDateSubClass();
        Date newStartSubClass = previousEndSubClass.nextDay();

        MyDateWrapper myDateWrapper = new MyDateWrapper(new Date());
        Date newStartWrapper = myDateWrapper.nextDay();

        // equals nicht wrappen!
    }

}
