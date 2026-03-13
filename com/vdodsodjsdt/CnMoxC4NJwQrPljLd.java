package com.vdodsodjsdt;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class CnMoxC4NJwQrPljLd {
    public final String LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final boolean V57tEvNfxZVVcOCAOih5PKr;
    public final String VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final String zzpBGItXfub0yWj;

    public CnMoxC4NJwQrPljLd(String str, String str2, boolean z, int i, String str3, int i2) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = str;
        this.zzpBGItXfub0yWj = str2;
        this.V57tEvNfxZVVcOCAOih5PKr = z;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = str3;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i2;
        Locale locale = Locale.US;
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(locale, "US");
        String upperCase = str2.toUpperCase(locale);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = cwhrCnoVJBjJE2CBEAvBopmgF.h2b7InwIaORKN91X7whfQh4(upperCase, "INT") ? 3 : (cwhrCnoVJBjJE2CBEAvBopmgF.h2b7InwIaORKN91X7whfQh4(upperCase, "CHAR") || cwhrCnoVJBjJE2CBEAvBopmgF.h2b7InwIaORKN91X7whfQh4(upperCase, "CLOB") || cwhrCnoVJBjJE2CBEAvBopmgF.h2b7InwIaORKN91X7whfQh4(upperCase, "TEXT")) ? 2 : cwhrCnoVJBjJE2CBEAvBopmgF.h2b7InwIaORKN91X7whfQh4(upperCase, "BLOB") ? 5 : (cwhrCnoVJBjJE2CBEAvBopmgF.h2b7InwIaORKN91X7whfQh4(upperCase, "REAL") || cwhrCnoVJBjJE2CBEAvBopmgF.h2b7InwIaORKN91X7whfQh4(upperCase, "FLOA") || cwhrCnoVJBjJE2CBEAvBopmgF.h2b7InwIaORKN91X7whfQh4(upperCase, "DOUB")) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CnMoxC4NJwQrPljLd)) {
                return false;
            }
            CnMoxC4NJwQrPljLd cnMoxC4NJwQrPljLd = (CnMoxC4NJwQrPljLd) obj;
            if (this.ZfQNn8hdWlEQ5cR94249PDsLR != cnMoxC4NJwQrPljLd.ZfQNn8hdWlEQ5cR94249PDsLR) {
                return false;
            }
            int i = cnMoxC4NJwQrPljLd.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            String str = cnMoxC4NJwQrPljLd.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (!this.VxUQ9tBhpHJ2AAEDNW8sghc4m.equals(cnMoxC4NJwQrPljLd.VxUQ9tBhpHJ2AAEDNW8sghc4m) || this.V57tEvNfxZVVcOCAOih5PKr != cnMoxC4NJwQrPljLd.V57tEvNfxZVVcOCAOih5PKr) {
                return false;
            }
            String str2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            int i2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (i2 == 1 && i == 2 && str2 != null && !sGipz63rTUmSj3uFDvOtzihao.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(str2, str)) {
                return false;
            }
            if (i2 == 2 && i == 1 && str != null && !sGipz63rTUmSj3uFDvOtzihao.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(str, str2)) {
                return false;
            }
            if (i2 != 0 && i2 == i) {
                if (str2 != null) {
                    if (!sGipz63rTUmSj3uFDvOtzihao.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(str2, str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
            }
            if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ != cnMoxC4NJwQrPljLd.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.VxUQ9tBhpHJ2AAEDNW8sghc4m.hashCode() * 31) + this.ZLZeBXTMq0zDztBxtRTuCHrapQ) * 31) + (this.V57tEvNfxZVVcOCAOih5PKr ? 1231 : 1237)) * 31) + this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        sb.append("', type='");
        sb.append(this.zzpBGItXfub0yWj);
        sb.append("', affinity='");
        sb.append(this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        sb.append("', notNull=");
        sb.append(this.V57tEvNfxZVVcOCAOih5PKr);
        sb.append(", primaryKeyPosition=");
        sb.append(this.ZfQNn8hdWlEQ5cR94249PDsLR);
        sb.append(", defaultValue='");
        String str = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (str == null) {
            str = "undefined";
        }
        return u9SlVAuoWhQUfJ.HzCpKshMOoaw76hFcbOVRYMeRd(sb, str, "'}");
    }
}
