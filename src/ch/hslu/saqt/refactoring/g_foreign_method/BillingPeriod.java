package ch.hslu.saqt.refactoring.g_foreign_method;

import java.util.Date;

public class BillingPeriod {

    public void reset() {
        Date previousEnd = new Date();
        Date newStart = new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);
    }

}

// foreign method, should be on date
