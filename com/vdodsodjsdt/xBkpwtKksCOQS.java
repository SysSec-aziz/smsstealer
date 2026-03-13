package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class xBkpwtKksCOQS {
    public Object V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public long zzpBGItXfub0yWj;

    public xBkpwtKksCOQS(hy3v1zJcCYok89Y1iAeFhN66 hy3v1zjccyok89y1iaefhn66) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 1;
        ej6unYlOWMDF.pYmKDYlAmhudp(hy3v1zjccyok89y1iaefhn66, "source");
        this.V57tEvNfxZVVcOCAOih5PKr = hy3v1zjccyok89y1iaefhn66;
        this.zzpBGItXfub0yWj = 262144L;
    }

    public void GI83zq0G8e7zkn(int i) {
        if (i < 64) {
            this.zzpBGItXfub0yWj |= 1 << i;
        } else {
            V57tEvNfxZVVcOCAOih5PKr();
            ((xBkpwtKksCOQS) this.V57tEvNfxZVVcOCAOih5PKr).GI83zq0G8e7zkn(i - 64);
        }
    }

    public void LaeGQIruHQu81hfJldjMOQSVblH3x(int i, boolean z) {
        if (i >= 64) {
            V57tEvNfxZVVcOCAOih5PKr();
            ((xBkpwtKksCOQS) this.V57tEvNfxZVVcOCAOih5PKr).LaeGQIruHQu81hfJldjMOQSVblH3x(i - 64, z);
            return;
        }
        long j = this.zzpBGItXfub0yWj;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.zzpBGItXfub0yWj = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            GI83zq0G8e7zkn(i);
        } else {
            VxUQ9tBhpHJ2AAEDNW8sghc4m(i);
        }
        if (z2 || ((xBkpwtKksCOQS) this.V57tEvNfxZVVcOCAOih5PKr) != null) {
            V57tEvNfxZVVcOCAOih5PKr();
            ((xBkpwtKksCOQS) this.V57tEvNfxZVVcOCAOih5PKr).LaeGQIruHQu81hfJldjMOQSVblH3x(0, z2);
        }
    }

    public void NSjgqmGjEzuugn2SsG1mZFP() {
        this.zzpBGItXfub0yWj = 0L;
        xBkpwtKksCOQS xbkpwtkkscoqs = (xBkpwtKksCOQS) this.V57tEvNfxZVVcOCAOih5PKr;
        if (xbkpwtkkscoqs != null) {
            xbkpwtkkscoqs.NSjgqmGjEzuugn2SsG1mZFP();
        }
    }

    public void V57tEvNfxZVVcOCAOih5PKr() {
        if (((xBkpwtKksCOQS) this.V57tEvNfxZVVcOCAOih5PKr) == null) {
            this.V57tEvNfxZVVcOCAOih5PKr = new xBkpwtKksCOQS();
        }
    }

    public void VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) {
        if (i < 64) {
            this.zzpBGItXfub0yWj &= ~(1 << i);
            return;
        }
        xBkpwtKksCOQS xbkpwtkkscoqs = (xBkpwtKksCOQS) this.V57tEvNfxZVVcOCAOih5PKr;
        if (xbkpwtkkscoqs != null) {
            xbkpwtkkscoqs.VxUQ9tBhpHJ2AAEDNW8sghc4m(i - 64);
        }
    }

    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(int i) {
        if (i >= 64) {
            V57tEvNfxZVVcOCAOih5PKr();
            return ((xBkpwtKksCOQS) this.V57tEvNfxZVVcOCAOih5PKr).ZLZeBXTMq0zDztBxtRTuCHrapQ(i - 64);
        }
        long j = 1 << i;
        long j2 = this.zzpBGItXfub0yWj;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.zzpBGItXfub0yWj = j3;
        long j4 = j - 1;
        this.zzpBGItXfub0yWj = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        xBkpwtKksCOQS xbkpwtkkscoqs = (xBkpwtKksCOQS) this.V57tEvNfxZVVcOCAOih5PKr;
        if (xbkpwtkkscoqs != null) {
            if (xbkpwtkkscoqs.ZfQNn8hdWlEQ5cR94249PDsLR(0)) {
                GI83zq0G8e7zkn(63);
            }
            ((xBkpwtKksCOQS) this.V57tEvNfxZVVcOCAOih5PKr).ZLZeBXTMq0zDztBxtRTuCHrapQ(0);
        }
        return z;
    }

    public boolean ZfQNn8hdWlEQ5cR94249PDsLR(int i) {
        if (i < 64) {
            return (this.zzpBGItXfub0yWj & (1 << i)) != 0;
        }
        V57tEvNfxZVVcOCAOih5PKr();
        return ((xBkpwtKksCOQS) this.V57tEvNfxZVVcOCAOih5PKr).ZfQNn8hdWlEQ5cR94249PDsLR(i - 64);
    }

    public String toString() {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                if (((xBkpwtKksCOQS) this.V57tEvNfxZVVcOCAOih5PKr) == null) {
                    return Long.toBinaryString(this.zzpBGItXfub0yWj);
                }
                return ((xBkpwtKksCOQS) this.V57tEvNfxZVVcOCAOih5PKr).toString() + "xx" + Long.toBinaryString(this.zzpBGItXfub0yWj);
            default:
                return super.toString();
        }
    }

    public EUSG2RPrSQzuno7qTyOhv0Az zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        yxp1I6Gr2tLDD3dH0UsMPMDr7 yxp1i6gr2tldd3dh0usmpmdr7 = new yxp1I6Gr2tLDD3dH0UsMPMDr7();
        while (true) {
            String strQ1wNbhk2O6 = ((hy3v1zJcCYok89Y1iAeFhN66) this.V57tEvNfxZVVcOCAOih5PKr).q1wNbhk2O6(this.zzpBGItXfub0yWj);
            this.zzpBGItXfub0yWj -= (long) strQ1wNbhk2O6.length();
            if (strQ1wNbhk2O6.length() == 0) {
                return yxp1i6gr2tldd3dh0usmpmdr7.zzpBGItXfub0yWj();
            }
            int iPf1HsU8AK92buCoUaexm5AC = cwhrCnoVJBjJE2CBEAvBopmgF.Pf1HsU8AK92buCoUaexm5AC(strQ1wNbhk2O6, ':', 1, 4);
            if (iPf1HsU8AK92buCoUaexm5AC != -1) {
                String strSubstring = strQ1wNbhk2O6.substring(0, iPf1HsU8AK92buCoUaexm5AC);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
                String strSubstring2 = strQ1wNbhk2O6.substring(iPf1HsU8AK92buCoUaexm5AC + 1);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring2, "substring(...)");
                zonOxHotd3BwAPJcwqr6I6uQNngg4.NSjgqmGjEzuugn2SsG1mZFP(yxp1i6gr2tldd3dh0usmpmdr7, strSubstring, strSubstring2);
            } else if (strQ1wNbhk2O6.charAt(0) == ':') {
                String strSubstring3 = strQ1wNbhk2O6.substring(1);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring3, "substring(...)");
                zonOxHotd3BwAPJcwqr6I6uQNngg4.NSjgqmGjEzuugn2SsG1mZFP(yxp1i6gr2tldd3dh0usmpmdr7, "", strSubstring3);
            } else {
                zonOxHotd3BwAPJcwqr6I6uQNngg4.NSjgqmGjEzuugn2SsG1mZFP(yxp1i6gr2tldd3dh0usmpmdr7, "", strQ1wNbhk2O6);
            }
        }
    }

    public int zzpBGItXfub0yWj(int i) {
        xBkpwtKksCOQS xbkpwtkkscoqs = (xBkpwtKksCOQS) this.V57tEvNfxZVVcOCAOih5PKr;
        if (xbkpwtkkscoqs == null) {
            return i >= 64 ? Long.bitCount(this.zzpBGItXfub0yWj) : Long.bitCount(this.zzpBGItXfub0yWj & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.zzpBGItXfub0yWj & ((1 << i) - 1));
        }
        return Long.bitCount(this.zzpBGItXfub0yWj) + xbkpwtkkscoqs.zzpBGItXfub0yWj(i - 64);
    }

    public xBkpwtKksCOQS() {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
        this.zzpBGItXfub0yWj = 0L;
    }
}
