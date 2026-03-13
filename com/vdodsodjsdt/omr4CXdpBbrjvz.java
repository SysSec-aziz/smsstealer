package com.vdodsodjsdt;

import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class omr4CXdpBbrjvz extends eAZzwKf05brkM {
    public static final iVKrTMqOw0TqCeNN zzpBGItXfub0yWj = new iVKrTMqOw0TqCeNN();
    public final SimpleDateFormat VxUQ9tBhpHJ2AAEDNW8sghc4m;

    /* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
    public class iVKrTMqOw0TqCeNN implements Ke30hT4A8wvbzFUrXgs4BPCTK41Rp {
        @Override // com.vdodsodjsdt.Ke30hT4A8wvbzFUrXgs4BPCTK41Rp
        public final eAZzwKf05brkM VxUQ9tBhpHJ2AAEDNW8sghc4m(Tt3445ZYXN tt3445ZYXN, q898WQEbycPNMnuoo6 q898wqebycpnmnuoo6) {
            if (q898wqebycpnmnuoo6.VxUQ9tBhpHJ2AAEDNW8sghc4m == Time.class) {
                return new omr4CXdpBbrjvz(0);
            }
            return null;
        }
    }

    public /* synthetic */ omr4CXdpBbrjvz(int i) {
        this();
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final void V57tEvNfxZVVcOCAOih5PKr(tVkLQdIevlOoRF1qYmTyvenTzI tvklqdievloorf1qymtyventzi, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            tvklqdievloorf1qymtyventzi.pzqP2AqKW6J5PO8zCKnW();
            return;
        }
        synchronized (this) {
            str = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.format((Date) time);
        }
        tvklqdievloorf1qymtyventzi.TqcnImqkSWIKht(str);
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final Object zzpBGItXfub0yWj(Gzdlhdn1ss gzdlhdn1ss) throws IOException {
        Time time;
        if (gzdlhdn1ss.wRCD0SdqWCowdYU7bmzN() == 9) {
            gzdlhdn1ss.d9zDyyznnp3oaDT1Ug();
            return null;
        }
        String strYmT6yQrus3w = gzdlhdn1ss.ymT6yQrus3w();
        synchronized (this) {
            TimeZone timeZone = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getTimeZone();
            try {
                try {
                    time = new Time(this.VxUQ9tBhpHJ2AAEDNW8sghc4m.parse(strYmT6yQrus3w).getTime());
                } catch (ParseException e) {
                    throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP("Failed parsing '" + strYmT6yQrus3w + "' as SQL Time; at path " + gzdlhdn1ss.SuB3hEmTmbbRGAhtvOOmfKEon(true), e);
                }
            } finally {
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m.setTimeZone(timeZone);
            }
        }
        return time;
    }

    private omr4CXdpBbrjvz() {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new SimpleDateFormat("hh:mm:ss a");
    }
}
