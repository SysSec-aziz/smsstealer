package com.vdodsodjsdt;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class YL0QkPiwQTRZsjsmHhw9bLuQHa1h extends eAZzwKf05brkM {
    public static final o2gEUbIIQK15X0tZCc V57tEvNfxZVVcOCAOih5PKr = new o2gEUbIIQK15X0tZCc();
    public final uYcghEwaCDl7XDJKY3gWL1 VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final ArrayList zzpBGItXfub0yWj;

    public YL0QkPiwQTRZsjsmHhw9bLuQHa1h(uYcghEwaCDl7XDJKY3gWL1 uycghewacdl7xdjky3gwl1) {
        ArrayList arrayList = new ArrayList();
        this.zzpBGItXfub0yWj = arrayList;
        Objects.requireNonNull(uycghewacdl7xdjky3gwl1);
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = uycghewacdl7xdjky3gwl1;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (GdRNPvsJeyAZobrxcbCaCCH.VxUQ9tBhpHJ2AAEDNW8sghc4m >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final void V57tEvNfxZVVcOCAOih5PKr(tVkLQdIevlOoRF1qYmTyvenTzI tvklqdievloorf1qymtyventzi, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            tvklqdievloorf1qymtyventzi.pzqP2AqKW6J5PO8zCKnW();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.zzpBGItXfub0yWj.get(0);
        synchronized (this.zzpBGItXfub0yWj) {
            str = dateFormat.format(date);
        }
        tvklqdievloorf1qymtyventzi.TqcnImqkSWIKht(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.zzpBGItXfub0yWj.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final Object zzpBGItXfub0yWj(Gzdlhdn1ss gzdlhdn1ss) throws IOException {
        Date dateZzpBGItXfub0yWj;
        if (gzdlhdn1ss.wRCD0SdqWCowdYU7bmzN() == 9) {
            gzdlhdn1ss.d9zDyyznnp3oaDT1Ug();
            return null;
        }
        String strYmT6yQrus3w = gzdlhdn1ss.ymT6yQrus3w();
        synchronized (this.zzpBGItXfub0yWj) {
            try {
                ArrayList arrayList = this.zzpBGItXfub0yWj;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        try {
                            dateZzpBGItXfub0yWj = cQEUtUnYEmzIak.zzpBGItXfub0yWj(strYmT6yQrus3w, new ParsePosition(0));
                            break;
                        } catch (ParseException e) {
                            StringBuilder sbKUYypEB4eNWOZWVDpH = u9SlVAuoWhQUfJ.KUYypEB4eNWOZWVDpH("Failed parsing '", strYmT6yQrus3w, "' as Date; at path ");
                            sbKUYypEB4eNWOZWVDpH.append(gzdlhdn1ss.SuB3hEmTmbbRGAhtvOOmfKEon(true));
                            throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP(sbKUYypEB4eNWOZWVDpH.toString(), e);
                        }
                    }
                    Object obj = arrayList.get(i);
                    i++;
                    DateFormat dateFormat = (DateFormat) obj;
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateZzpBGItXfub0yWj = dateFormat.parse(strYmT6yQrus3w);
                            break;
                        } catch (ParseException unused) {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } finally {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m(dateZzpBGItXfub0yWj);
    }
}
