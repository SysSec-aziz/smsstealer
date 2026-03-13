package com.vdodsodjsdt;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class d8WTYkar9kx5DB extends eAZzwKf05brkM {
    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final void V57tEvNfxZVVcOCAOih5PKr(tVkLQdIevlOoRF1qYmTyvenTzI tvklqdievloorf1qymtyventzi, Object obj) throws IOException {
        if (((Calendar) obj) == null) {
            tvklqdievloorf1qymtyventzi.pzqP2AqKW6J5PO8zCKnW();
            return;
        }
        tvklqdievloorf1qymtyventzi.LaeGQIruHQu81hfJldjMOQSVblH3x();
        tvklqdievloorf1qymtyventzi.RhfGHxtXxy0M0grmp2jkRjQg("year");
        tvklqdievloorf1qymtyventzi.qygqjTppWwx992(r4.get(1));
        tvklqdievloorf1qymtyventzi.RhfGHxtXxy0M0grmp2jkRjQg("month");
        tvklqdievloorf1qymtyventzi.qygqjTppWwx992(r4.get(2));
        tvklqdievloorf1qymtyventzi.RhfGHxtXxy0M0grmp2jkRjQg("dayOfMonth");
        tvklqdievloorf1qymtyventzi.qygqjTppWwx992(r4.get(5));
        tvklqdievloorf1qymtyventzi.RhfGHxtXxy0M0grmp2jkRjQg("hourOfDay");
        tvklqdievloorf1qymtyventzi.qygqjTppWwx992(r4.get(11));
        tvklqdievloorf1qymtyventzi.RhfGHxtXxy0M0grmp2jkRjQg("minute");
        tvklqdievloorf1qymtyventzi.qygqjTppWwx992(r4.get(12));
        tvklqdievloorf1qymtyventzi.RhfGHxtXxy0M0grmp2jkRjQg("second");
        tvklqdievloorf1qymtyventzi.qygqjTppWwx992(r4.get(13));
        tvklqdievloorf1qymtyventzi.q11o1hieEkZDhF1MGOZI26oZiDT();
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final Object zzpBGItXfub0yWj(Gzdlhdn1ss gzdlhdn1ss) throws IOException {
        int iY1NaPKTl7R18DOr6e8i5;
        if (gzdlhdn1ss.wRCD0SdqWCowdYU7bmzN() == 9) {
            gzdlhdn1ss.d9zDyyznnp3oaDT1Ug();
            return null;
        }
        gzdlhdn1ss.V57tEvNfxZVVcOCAOih5PKr();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (gzdlhdn1ss.wRCD0SdqWCowdYU7bmzN() == 4) {
                gzdlhdn1ss.q11o1hieEkZDhF1MGOZI26oZiDT();
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }
            String strIKANjmyTSxO6v6UuLPdu7DxOjlS = gzdlhdn1ss.iKANjmyTSxO6v6UuLPdu7DxOjlS();
            iY1NaPKTl7R18DOr6e8i5 = gzdlhdn1ss.y1NaPKTl7R18DOr6e8i5();
            strIKANjmyTSxO6v6UuLPdu7DxOjlS.getClass();
            switch (strIKANjmyTSxO6v6UuLPdu7DxOjlS) {
                case "dayOfMonth":
                    i3 = iY1NaPKTl7R18DOr6e8i5;
                    break;
                case "minute":
                    i5 = iY1NaPKTl7R18DOr6e8i5;
                    break;
                case "second":
                    i6 = iY1NaPKTl7R18DOr6e8i5;
                    break;
                case "year":
                    i = iY1NaPKTl7R18DOr6e8i5;
                    break;
                case "month":
                    i2 = iY1NaPKTl7R18DOr6e8i5;
                    break;
                case "hourOfDay":
                    i4 = iY1NaPKTl7R18DOr6e8i5;
                    break;
            }
        }
    }
}
