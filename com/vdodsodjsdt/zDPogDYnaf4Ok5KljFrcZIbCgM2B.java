package com.vdodsodjsdt;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class zDPogDYnaf4Ok5KljFrcZIbCgM2B {
    public final String LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final String V57tEvNfxZVVcOCAOih5PKr;
    public final String VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final String ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final List ZfQNn8hdWlEQ5cR94249PDsLR;
    public final String zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final String zzpBGItXfub0yWj;

    public zDPogDYnaf4Ok5KljFrcZIbCgM2B(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = str;
        str2.getClass();
        this.zzpBGItXfub0yWj = str2;
        this.V57tEvNfxZVVcOCAOih5PKr = str3;
        list.getClass();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = list;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = str4;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = str5;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + ", mProviderPackage: " + this.zzpBGItXfub0yWj + ", mQuery: " + this.V57tEvNfxZVVcOCAOih5PKr + ", mSystemFont: " + this.LaeGQIruHQu81hfJldjMOQSVblH3x + ", mVariationSettings: " + this.zIvmSL0wzmmKGc3X39b2Gw2mUGE + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
