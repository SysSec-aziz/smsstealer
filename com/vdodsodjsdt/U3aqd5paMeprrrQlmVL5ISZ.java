package com.vdodsodjsdt;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class U3aqd5paMeprrrQlmVL5ISZ {
    public static void V57tEvNfxZVVcOCAOih5PKr(BIajpH9rKfhy3tkxKeGET7A9E5xV bIajpH9rKfhy3tkxKeGET7A9E5xV) {
        LocaleList.setDefault(LocaleList.forLanguageTags(bIajpH9rKfhy3tkxKeGET7A9E5xV.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m.toLanguageTags()));
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static void ZfQNn8hdWlEQ5cR94249PDsLR(Configuration configuration, BIajpH9rKfhy3tkxKeGET7A9E5xV bIajpH9rKfhy3tkxKeGET7A9E5xV) {
        configuration.setLocales(LocaleList.forLanguageTags(bIajpH9rKfhy3tkxKeGET7A9E5xV.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m.toLanguageTags()));
    }

    public static BIajpH9rKfhy3tkxKeGET7A9E5xV zzpBGItXfub0yWj(Configuration configuration) {
        return BIajpH9rKfhy3tkxKeGET7A9E5xV.VxUQ9tBhpHJ2AAEDNW8sghc4m(configuration.getLocales().toLanguageTags());
    }
}
