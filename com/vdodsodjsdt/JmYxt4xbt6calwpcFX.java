package com.vdodsodjsdt;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class JmYxt4xbt6calwpcFX extends eAZzwKf05brkM {
    public static final iVKrTMqOw0TqCeNN zzpBGItXfub0yWj = new iVKrTMqOw0TqCeNN();
    public final SimpleDateFormat VxUQ9tBhpHJ2AAEDNW8sghc4m;

    /* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
    public class iVKrTMqOw0TqCeNN implements Ke30hT4A8wvbzFUrXgs4BPCTK41Rp {
        @Override // com.vdodsodjsdt.Ke30hT4A8wvbzFUrXgs4BPCTK41Rp
        public final eAZzwKf05brkM VxUQ9tBhpHJ2AAEDNW8sghc4m(Tt3445ZYXN tt3445ZYXN, q898WQEbycPNMnuoo6 q898wqebycpnmnuoo6) {
            if (q898wqebycpnmnuoo6.VxUQ9tBhpHJ2AAEDNW8sghc4m == Date.class) {
                return new JmYxt4xbt6calwpcFX(0);
            }
            return null;
        }
    }

    public /* synthetic */ JmYxt4xbt6calwpcFX(int i) {
        this();
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final void V57tEvNfxZVVcOCAOih5PKr(tVkLQdIevlOoRF1qYmTyvenTzI tvklqdievloorf1qymtyventzi, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            tvklqdievloorf1qymtyventzi.pzqP2AqKW6J5PO8zCKnW();
            return;
        }
        synchronized (this) {
            str = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.format((java.util.Date) date);
        }
        tvklqdievloorf1qymtyventzi.TqcnImqkSWIKht(str);
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final Object zzpBGItXfub0yWj(Gzdlhdn1ss gzdlhdn1ss) throws IOException {
        Date date;
        if (gzdlhdn1ss.wRCD0SdqWCowdYU7bmzN() == 9) {
            gzdlhdn1ss.d9zDyyznnp3oaDT1Ug();
            return null;
        }
        String strYmT6yQrus3w = gzdlhdn1ss.ymT6yQrus3w();
        synchronized (this) {
            TimeZone timeZone = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getTimeZone();
            try {
                try {
                    date = new Date(this.VxUQ9tBhpHJ2AAEDNW8sghc4m.parse(strYmT6yQrus3w).getTime());
                } catch (ParseException e) {
                    throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP("Failed parsing '" + strYmT6yQrus3w + "' as SQL Date; at path " + gzdlhdn1ss.SuB3hEmTmbbRGAhtvOOmfKEon(true), e);
                }
            } finally {
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m.setTimeZone(timeZone);
            }
        }
        return date;
    }

    private JmYxt4xbt6calwpcFX() {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new SimpleDateFormat("MMM d, yyyy");
    }
}
