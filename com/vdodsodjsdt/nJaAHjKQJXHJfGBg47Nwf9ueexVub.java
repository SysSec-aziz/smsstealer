package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class nJaAHjKQJXHJfGBg47Nwf9ueexVub {

    @gONlSwuqWpO("branch")
    private final String V57tEvNfxZVVcOCAOih5PKr;

    @gONlSwuqWpO("uid")
    private final String VxUQ9tBhpHJ2AAEDNW8sghc4m;

    @gONlSwuqWpO("phone")
    private final String zzpBGItXfub0yWj;

    public nJaAHjKQJXHJfGBg47Nwf9ueexVub(String str, String str2, String str3) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "uid");
        ej6unYlOWMDF.pYmKDYlAmhudp(str3, "branch");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = str;
        this.zzpBGItXfub0yWj = str2;
        this.V57tEvNfxZVVcOCAOih5PKr = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nJaAHjKQJXHJfGBg47Nwf9ueexVub)) {
            return false;
        }
        nJaAHjKQJXHJfGBg47Nwf9ueexVub njaahjkqjxhjfgbg47nwf9ueexvub = (nJaAHjKQJXHJfGBg47Nwf9ueexVub) obj;
        return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, njaahjkqjxhjfgbg47nwf9ueexvub.VxUQ9tBhpHJ2AAEDNW8sghc4m) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.zzpBGItXfub0yWj, njaahjkqjxhjfgbg47nwf9ueexvub.zzpBGItXfub0yWj) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr, njaahjkqjxhjfgbg47nwf9ueexvub.V57tEvNfxZVVcOCAOih5PKr);
    }

    public final int hashCode() {
        return this.V57tEvNfxZVVcOCAOih5PKr.hashCode() + u9SlVAuoWhQUfJ.LaeGQIruHQu81hfJldjMOQSVblH3x(this.zzpBGItXfub0yWj, this.VxUQ9tBhpHJ2AAEDNW8sghc4m.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        String str2 = this.zzpBGItXfub0yWj;
        String str3 = this.V57tEvNfxZVVcOCAOih5PKr;
        StringBuilder sb = new StringBuilder("CallInfo(uid=");
        sb.append(str);
        sb.append(", phone=");
        sb.append(str2);
        sb.append(", branch=");
        return u9SlVAuoWhQUfJ.HzCpKshMOoaw76hFcbOVRYMeRd(sb, str3, ")");
    }
}
