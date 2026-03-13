package com.vdodsodjsdt;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mkWvedkJ40E0CXleCgI {
    public static final AtomicReference VxUQ9tBhpHJ2AAEDNW8sghc4m = new AtomicReference();

    public static Calendar V57tEvNfxZVVcOCAOih5PKr(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    public static Calendar VxUQ9tBhpHJ2AAEDNW8sghc4m(Calendar calendar) {
        Calendar calendarV57tEvNfxZVVcOCAOih5PKr = V57tEvNfxZVVcOCAOih5PKr(calendar);
        Calendar calendarV57tEvNfxZVVcOCAOih5PKr2 = V57tEvNfxZVVcOCAOih5PKr(null);
        calendarV57tEvNfxZVVcOCAOih5PKr2.set(calendarV57tEvNfxZVVcOCAOih5PKr.get(1), calendarV57tEvNfxZVVcOCAOih5PKr.get(2), calendarV57tEvNfxZVVcOCAOih5PKr.get(5));
        return calendarV57tEvNfxZVVcOCAOih5PKr2;
    }

    public static Calendar zzpBGItXfub0yWj() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }
}
