package com.vdodsodjsdt;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class nFFJFOn6wSChD0eG {
    public int NSjgqmGjEzuugn2SsG1mZFP;
    public boolean V57tEvNfxZVVcOCAOih5PKr;
    public final EouCzLZsW9ynithduh VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int zzpBGItXfub0yWj = Integer.MAX_VALUE;
    public int ZfQNn8hdWlEQ5cR94249PDsLR = 4096;
    public KK6EHiwUVZvS[] LaeGQIruHQu81hfJldjMOQSVblH3x = new KK6EHiwUVZvS[8];
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE = 7;

    public nFFJFOn6wSChD0eG(EouCzLZsW9ynithduh eouCzLZsW9ynithduh) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = eouCzLZsW9ynithduh;
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(int i, int i2, int i3) {
        EouCzLZsW9ynithduh eouCzLZsW9ynithduh = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (i < i2) {
            eouCzLZsW9ynithduh.O1xDAlBZZlZdoEf747lCFHld(i | i3);
            return;
        }
        eouCzLZsW9ynithduh.O1xDAlBZZlZdoEf747lCFHld(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            eouCzLZsW9ynithduh.O1xDAlBZZlZdoEf747lCFHld(128 | (i4 & 127));
            i4 >>>= 7;
        }
        eouCzLZsW9ynithduh.O1xDAlBZZlZdoEf747lCFHld(i4);
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg) throws EOFException {
        ej6unYlOWMDF.pYmKDYlAmhudp(oa1wo3soicf8h1n6bgpg, "data");
        int[] iArr = YqaZUk4hZHKckJn.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = oa1wo3soicf8h1n6bgpg.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iVxUQ9tBhpHJ2AAEDNW8sghc4m; i++) {
            byte bZfQNn8hdWlEQ5cR94249PDsLR = oa1wo3soicf8h1n6bgpg.ZfQNn8hdWlEQ5cR94249PDsLR(i);
            byte[] bArr = jHlOQHj3hlCsydfI7r5ApVdQjYvKf.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            j2 += (long) YqaZUk4hZHKckJn.zzpBGItXfub0yWj[bZfQNn8hdWlEQ5cR94249PDsLR & 255];
        }
        int i2 = (int) ((j2 + ((long) 7)) >> 3);
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m2 = oa1wo3soicf8h1n6bgpg.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        EouCzLZsW9ynithduh eouCzLZsW9ynithduh = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (i2 >= iVxUQ9tBhpHJ2AAEDNW8sghc4m2) {
            LaeGQIruHQu81hfJldjMOQSVblH3x(oa1wo3soicf8h1n6bgpg.VxUQ9tBhpHJ2AAEDNW8sghc4m(), 127, 0);
            eouCzLZsW9ynithduh.vE4yDIjexsP2lGjLaTcB(oa1wo3soicf8h1n6bgpg);
            return;
        }
        EouCzLZsW9ynithduh eouCzLZsW9ynithduh2 = new EouCzLZsW9ynithduh();
        int[] iArr2 = YqaZUk4hZHKckJn.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m3 = oa1wo3soicf8h1n6bgpg.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        int i3 = 0;
        for (int i4 = 0; i4 < iVxUQ9tBhpHJ2AAEDNW8sghc4m3; i4++) {
            byte bZfQNn8hdWlEQ5cR94249PDsLR2 = oa1wo3soicf8h1n6bgpg.ZfQNn8hdWlEQ5cR94249PDsLR(i4);
            byte[] bArr2 = jHlOQHj3hlCsydfI7r5ApVdQjYvKf.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            int i5 = bZfQNn8hdWlEQ5cR94249PDsLR2 & 255;
            int i6 = YqaZUk4hZHKckJn.VxUQ9tBhpHJ2AAEDNW8sghc4m[i5];
            byte b = YqaZUk4hZHKckJn.zzpBGItXfub0yWj[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                eouCzLZsW9ynithduh2.O1xDAlBZZlZdoEf747lCFHld((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            eouCzLZsW9ynithduh2.O1xDAlBZZlZdoEf747lCFHld((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpgZIvmSL0wzmmKGc3X39b2Gw2mUGE = eouCzLZsW9ynithduh2.zIvmSL0wzmmKGc3X39b2Gw2mUGE(eouCzLZsW9ynithduh2.ZfQNn8hdWlEQ5cR94249PDsLR);
        LaeGQIruHQu81hfJldjMOQSVblH3x(oa1wo3soicf8h1n6bgpgZIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m(), 127, 128);
        eouCzLZsW9ynithduh.vE4yDIjexsP2lGjLaTcB(oa1wo3soicf8h1n6bgpgZIvmSL0wzmmKGc3X39b2Gw2mUGE);
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) {
        int i2;
        if (i > 0) {
            int length = this.LaeGQIruHQu81hfJldjMOQSVblH3x.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                if (length < i2 || i <= 0) {
                    break;
                }
                KK6EHiwUVZvS kK6EHiwUVZvS = this.LaeGQIruHQu81hfJldjMOQSVblH3x[length];
                ej6unYlOWMDF.p59rPv72J9(kK6EHiwUVZvS);
                i -= kK6EHiwUVZvS.V57tEvNfxZVVcOCAOih5PKr;
                int i4 = this.NSjgqmGjEzuugn2SsG1mZFP;
                KK6EHiwUVZvS kK6EHiwUVZvS2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x[length];
                ej6unYlOWMDF.p59rPv72J9(kK6EHiwUVZvS2);
                this.NSjgqmGjEzuugn2SsG1mZFP = i4 - kK6EHiwUVZvS2.V57tEvNfxZVVcOCAOih5PKr;
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ--;
                i3++;
                length--;
            }
            KK6EHiwUVZvS[] kK6EHiwUVZvSArr = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            int i5 = i2 + 1;
            System.arraycopy(kK6EHiwUVZvSArr, i5, kK6EHiwUVZvSArr, i5 + i3, this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
            KK6EHiwUVZvS[] kK6EHiwUVZvSArr2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            int i6 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE + 1;
            Arrays.fill(kK6EHiwUVZvSArr2, i6, i6 + i3, (Object) null);
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE += i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.nFFJFOn6wSChD0eG.ZfQNn8hdWlEQ5cR94249PDsLR(java.util.ArrayList):void");
    }

    public final void zzpBGItXfub0yWj(KK6EHiwUVZvS kK6EHiwUVZvS) {
        int i = kK6EHiwUVZvS.V57tEvNfxZVVcOCAOih5PKr;
        int i2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i > i2) {
            KK6EHiwUVZvS[] kK6EHiwUVZvSArr = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            vmp19D2MODlOL.BDoqAMf0rlMRAnVghjC4qjG(kK6EHiwUVZvSArr, null, 0, kK6EHiwUVZvSArr.length);
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = this.LaeGQIruHQu81hfJldjMOQSVblH3x.length - 1;
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
            this.NSjgqmGjEzuugn2SsG1mZFP = 0;
            return;
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m((this.NSjgqmGjEzuugn2SsG1mZFP + i) - i2);
        int i3 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ + 1;
        KK6EHiwUVZvS[] kK6EHiwUVZvSArr2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i3 > kK6EHiwUVZvSArr2.length) {
            KK6EHiwUVZvS[] kK6EHiwUVZvSArr3 = new KK6EHiwUVZvS[kK6EHiwUVZvSArr2.length * 2];
            System.arraycopy(kK6EHiwUVZvSArr2, 0, kK6EHiwUVZvSArr3, kK6EHiwUVZvSArr2.length, kK6EHiwUVZvSArr2.length);
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = this.LaeGQIruHQu81hfJldjMOQSVblH3x.length - 1;
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = kK6EHiwUVZvSArr3;
        }
        int i4 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i4 - 1;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x[i4] = kK6EHiwUVZvS;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ++;
        this.NSjgqmGjEzuugn2SsG1mZFP += i;
    }
}
