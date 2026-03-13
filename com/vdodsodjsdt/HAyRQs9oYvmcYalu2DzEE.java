package com.vdodsodjsdt;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class HAyRQs9oYvmcYalu2DzEE {
    public final nfXvCNpsFLQkxk3Wa V57tEvNfxZVVcOCAOih5PKr;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public int VxUQ9tBhpHJ2AAEDNW8sghc4m = 4096;
    public final ArrayList zzpBGItXfub0yWj = new ArrayList();
    public KK6EHiwUVZvS[] ZfQNn8hdWlEQ5cR94249PDsLR = new KK6EHiwUVZvS[8];
    public int LaeGQIruHQu81hfJldjMOQSVblH3x = 7;

    public HAyRQs9oYvmcYalu2DzEE(hNZ9PZz5j6U2tWOncQywik7NKu hnz9pzz5j6u2twoncqywik7nku) {
        this.V57tEvNfxZVVcOCAOih5PKr = new nfXvCNpsFLQkxk3Wa(hnz9pzz5j6u2twoncqywik7nku);
    }

    public final int LaeGQIruHQu81hfJldjMOQSVblH3x(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.V57tEvNfxZVVcOCAOih5PKr.readByte();
            byte[] bArr = jHlOQHj3hlCsydfI7r5ApVdQjYvKf.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            int i5 = b & 255;
            if ((b & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & 127) << i4;
            i4 += 7;
        }
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(KK6EHiwUVZvS kK6EHiwUVZvS) {
        this.zzpBGItXfub0yWj.add(kK6EHiwUVZvS);
        int i = kK6EHiwUVZvS.V57tEvNfxZVVcOCAOih5PKr;
        int i2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (i > i2) {
            KK6EHiwUVZvS[] kK6EHiwUVZvSArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            vmp19D2MODlOL.BDoqAMf0rlMRAnVghjC4qjG(kK6EHiwUVZvSArr, null, 0, kK6EHiwUVZvSArr.length);
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = this.ZfQNn8hdWlEQ5cR94249PDsLR.length - 1;
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
            return;
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m((this.ZLZeBXTMq0zDztBxtRTuCHrapQ + i) - i2);
        int i3 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE + 1;
        KK6EHiwUVZvS[] kK6EHiwUVZvSArr2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i3 > kK6EHiwUVZvSArr2.length) {
            KK6EHiwUVZvS[] kK6EHiwUVZvSArr3 = new KK6EHiwUVZvS[kK6EHiwUVZvSArr2.length * 2];
            System.arraycopy(kK6EHiwUVZvSArr2, 0, kK6EHiwUVZvSArr3, kK6EHiwUVZvSArr2.length, kK6EHiwUVZvSArr2.length);
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = this.ZfQNn8hdWlEQ5cR94249PDsLR.length - 1;
            this.ZfQNn8hdWlEQ5cR94249PDsLR = kK6EHiwUVZvSArr3;
        }
        int i4 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i4 - 1;
        this.ZfQNn8hdWlEQ5cR94249PDsLR[i4] = kK6EHiwUVZvS;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE++;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ += i;
    }

    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.ZfQNn8hdWlEQ5cR94249PDsLR.length;
            while (true) {
                length--;
                i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (length < i2 || i <= 0) {
                    break;
                }
                KK6EHiwUVZvS kK6EHiwUVZvS = this.ZfQNn8hdWlEQ5cR94249PDsLR[length];
                ej6unYlOWMDF.p59rPv72J9(kK6EHiwUVZvS);
                int i4 = kK6EHiwUVZvS.V57tEvNfxZVVcOCAOih5PKr;
                i -= i4;
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ -= i4;
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE--;
                i3++;
            }
            KK6EHiwUVZvS[] kK6EHiwUVZvSArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            System.arraycopy(kK6EHiwUVZvSArr, i2 + 1, kK6EHiwUVZvSArr, i2 + 1 + i3, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
            this.LaeGQIruHQu81hfJldjMOQSVblH3x += i3;
        }
        return i3;
    }

    public final oA1WO3soICf8H1N6bgpG ZfQNn8hdWlEQ5cR94249PDsLR() {
        nfXvCNpsFLQkxk3Wa nfxvcnpsflqkxk3wa = this.V57tEvNfxZVVcOCAOih5PKr;
        byte b = nfxvcnpsflqkxk3wa.readByte();
        byte[] bArr = jHlOQHj3hlCsydfI7r5ApVdQjYvKf.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i = b & 255;
        int i2 = 0;
        boolean z = (b & 128) == 128;
        long jLaeGQIruHQu81hfJldjMOQSVblH3x = LaeGQIruHQu81hfJldjMOQSVblH3x(i, 127);
        if (!z) {
            return nfxvcnpsflqkxk3wa.zIvmSL0wzmmKGc3X39b2Gw2mUGE(jLaeGQIruHQu81hfJldjMOQSVblH3x);
        }
        EouCzLZsW9ynithduh eouCzLZsW9ynithduh = new EouCzLZsW9ynithduh();
        int[] iArr = YqaZUk4hZHKckJn.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        ej6unYlOWMDF.pYmKDYlAmhudp(nfxvcnpsflqkxk3wa, "source");
        RRGaoI3KRDaK8aVeyxQAcc rRGaoI3KRDaK8aVeyxQAcc = YqaZUk4hZHKckJn.V57tEvNfxZVVcOCAOih5PKr;
        RRGaoI3KRDaK8aVeyxQAcc rRGaoI3KRDaK8aVeyxQAcc2 = rRGaoI3KRDaK8aVeyxQAcc;
        int i3 = 0;
        for (long j = 0; j < jLaeGQIruHQu81hfJldjMOQSVblH3x; j++) {
            byte b2 = nfxvcnpsflqkxk3wa.readByte();
            byte[] bArr2 = jHlOQHj3hlCsydfI7r5ApVdQjYvKf.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            i2 = (i2 << 8) | (b2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                RRGaoI3KRDaK8aVeyxQAcc[] rRGaoI3KRDaK8aVeyxQAccArr = (RRGaoI3KRDaK8aVeyxQAcc[]) rRGaoI3KRDaK8aVeyxQAcc2.V57tEvNfxZVVcOCAOih5PKr;
                ej6unYlOWMDF.p59rPv72J9(rRGaoI3KRDaK8aVeyxQAccArr);
                rRGaoI3KRDaK8aVeyxQAcc2 = rRGaoI3KRDaK8aVeyxQAccArr[(i2 >>> (i3 - 8)) & 255];
                ej6unYlOWMDF.p59rPv72J9(rRGaoI3KRDaK8aVeyxQAcc2);
                if (((RRGaoI3KRDaK8aVeyxQAcc[]) rRGaoI3KRDaK8aVeyxQAcc2.V57tEvNfxZVVcOCAOih5PKr) == null) {
                    eouCzLZsW9ynithduh.O1xDAlBZZlZdoEf747lCFHld(rRGaoI3KRDaK8aVeyxQAcc2.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                    i3 -= rRGaoI3KRDaK8aVeyxQAcc2.zzpBGItXfub0yWj;
                    rRGaoI3KRDaK8aVeyxQAcc2 = rRGaoI3KRDaK8aVeyxQAcc;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            RRGaoI3KRDaK8aVeyxQAcc[] rRGaoI3KRDaK8aVeyxQAccArr2 = (RRGaoI3KRDaK8aVeyxQAcc[]) rRGaoI3KRDaK8aVeyxQAcc2.V57tEvNfxZVVcOCAOih5PKr;
            ej6unYlOWMDF.p59rPv72J9(rRGaoI3KRDaK8aVeyxQAccArr2);
            RRGaoI3KRDaK8aVeyxQAcc rRGaoI3KRDaK8aVeyxQAcc3 = rRGaoI3KRDaK8aVeyxQAccArr2[(i2 << (8 - i3)) & 255];
            ej6unYlOWMDF.p59rPv72J9(rRGaoI3KRDaK8aVeyxQAcc3);
            int i4 = rRGaoI3KRDaK8aVeyxQAcc3.zzpBGItXfub0yWj;
            if (((RRGaoI3KRDaK8aVeyxQAcc[]) rRGaoI3KRDaK8aVeyxQAcc3.V57tEvNfxZVVcOCAOih5PKr) != null || i4 > i3) {
                break;
            }
            eouCzLZsW9ynithduh.O1xDAlBZZlZdoEf747lCFHld(rRGaoI3KRDaK8aVeyxQAcc3.VxUQ9tBhpHJ2AAEDNW8sghc4m);
            i3 -= i4;
            rRGaoI3KRDaK8aVeyxQAcc2 = rRGaoI3KRDaK8aVeyxQAcc;
        }
        return eouCzLZsW9ynithduh.zIvmSL0wzmmKGc3X39b2Gw2mUGE(eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR);
    }

    public final oA1WO3soICf8H1N6bgpG zzpBGItXfub0yWj(int i) throws IOException {
        if (i >= 0) {
            KK6EHiwUVZvS[] kK6EHiwUVZvSArr = wVqVa59Q8TrUUQ.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (i <= kK6EHiwUVZvSArr.length - 1) {
                return kK6EHiwUVZvSArr[i].VxUQ9tBhpHJ2AAEDNW8sghc4m;
            }
        }
        int length = this.LaeGQIruHQu81hfJldjMOQSVblH3x + 1 + (i - wVqVa59Q8TrUUQ.VxUQ9tBhpHJ2AAEDNW8sghc4m.length);
        if (length >= 0) {
            KK6EHiwUVZvS[] kK6EHiwUVZvSArr2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (length < kK6EHiwUVZvSArr2.length) {
                KK6EHiwUVZvS kK6EHiwUVZvS = kK6EHiwUVZvSArr2[length];
                ej6unYlOWMDF.p59rPv72J9(kK6EHiwUVZvS);
                return kK6EHiwUVZvS.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }
}
