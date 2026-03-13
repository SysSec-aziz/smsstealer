package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class tpWzSW479hfzvFH5 {
    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public final byte[] VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public tpWzSW479hfzvFH5 ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public boolean ZfQNn8hdWlEQ5cR94249PDsLR;
    public tpWzSW479hfzvFH5 zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public int zzpBGItXfub0yWj;

    public tpWzSW479hfzvFH5() {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new byte[8192];
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = false;
    }

    public final tpWzSW479hfzvFH5 V57tEvNfxZVVcOCAOih5PKr() {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = true;
        return new tpWzSW479hfzvFH5(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, this.zzpBGItXfub0yWj, this.V57tEvNfxZVVcOCAOih5PKr, true);
    }

    public final tpWzSW479hfzvFH5 VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (tpwzsw479hfzvfh5 == this) {
            tpwzsw479hfzvfh5 = null;
        }
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh52 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh52);
        tpwzsw479hfzvfh52.zIvmSL0wzmmKGc3X39b2Gw2mUGE = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh53 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh53);
        tpwzsw479hfzvfh53.ZLZeBXTMq0zDztBxtRTuCHrapQ = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = null;
        return tpwzsw479hfzvfh5;
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(tpWzSW479hfzvFH5 tpwzsw479hfzvfh5, int i) {
        ej6unYlOWMDF.pYmKDYlAmhudp(tpwzsw479hfzvfh5, "sink");
        byte[] bArr = tpwzsw479hfzvfh5.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (!tpwzsw479hfzvfh5.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (tpwzsw479hfzvfh5.ZfQNn8hdWlEQ5cR94249PDsLR) {
                throw new IllegalArgumentException();
            }
            int i4 = tpwzsw479hfzvfh5.zzpBGItXfub0yWj;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            vmp19D2MODlOL.wR7sbzHKf9hYV1lxoS6nqyszepWvN(0, i4, i2, bArr, bArr);
            tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr -= tpwzsw479hfzvfh5.zzpBGItXfub0yWj;
            tpwzsw479hfzvfh5.zzpBGItXfub0yWj = 0;
        }
        int i5 = tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr;
        int i6 = this.zzpBGItXfub0yWj;
        vmp19D2MODlOL.wR7sbzHKf9hYV1lxoS6nqyszepWvN(i5, i6, i6 + i, this.VxUQ9tBhpHJ2AAEDNW8sghc4m, bArr);
        tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr += i;
        this.zzpBGItXfub0yWj += i;
    }

    public final void zzpBGItXfub0yWj(tpWzSW479hfzvFH5 tpwzsw479hfzvfh5) {
        ej6unYlOWMDF.pYmKDYlAmhudp(tpwzsw479hfzvfh5, "segment");
        tpwzsw479hfzvfh5.ZLZeBXTMq0zDztBxtRTuCHrapQ = this;
        tpwzsw479hfzvfh5.zIvmSL0wzmmKGc3X39b2Gw2mUGE = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh52 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh52);
        tpwzsw479hfzvfh52.ZLZeBXTMq0zDztBxtRTuCHrapQ = tpwzsw479hfzvfh5;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = tpwzsw479hfzvfh5;
    }

    public tpWzSW479hfzvFH5(byte[] bArr, int i, int i2, boolean z) {
        ej6unYlOWMDF.pYmKDYlAmhudp(bArr, "data");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = bArr;
        this.zzpBGItXfub0yWj = i;
        this.V57tEvNfxZVVcOCAOih5PKr = i2;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = z;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = false;
    }
}
