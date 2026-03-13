package com.vdodsodjsdt;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class BIajpH9rKfhy3tkxKeGET7A9E5xV {
    public static final BIajpH9rKfhy3tkxKeGET7A9E5xV zzpBGItXfub0yWj = new BIajpH9rKfhy3tkxKeGET7A9E5xV(new zCWUDzxibeVs(new LocaleList(new Locale[0])));
    public final zCWUDzxibeVs VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public BIajpH9rKfhy3tkxKeGET7A9E5xV(zCWUDzxibeVs zcwudzxibevs) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = zcwudzxibevs;
    }

    public static BIajpH9rKfhy3tkxKeGET7A9E5xV VxUQ9tBhpHJ2AAEDNW8sghc4m(String str) {
        if (str == null || str.isEmpty()) {
            return zzpBGItXfub0yWj;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            int i2 = WxSIbMKH7hazRuKV2ZlXUm.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return new BIajpH9rKfhy3tkxKeGET7A9E5xV(new zCWUDzxibeVs(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BIajpH9rKfhy3tkxKeGET7A9E5xV) {
            return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.equals(((BIajpH9rKfhy3tkxKeGET7A9E5xV) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
        return false;
    }

    public final int hashCode() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m.hashCode();
    }

    public final String toString() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m.toString();
    }
}
