package com.vdodsodjsdt;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class PPtIx4psoo4sPV6C2irfHMJrxl extends oA1WO3soICf8H1N6bgpG {
    public final transient int[] NSjgqmGjEzuugn2SsG1mZFP;
    public final transient byte[][] ZLZeBXTMq0zDztBxtRTuCHrapQ;

    public PPtIx4psoo4sPV6C2irfHMJrxl(byte[][] bArr, int[] iArr) {
        super(oA1WO3soICf8H1N6bgpG.zIvmSL0wzmmKGc3X39b2Gw2mUGE.V57tEvNfxZVVcOCAOih5PKr);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = bArr;
        this.NSjgqmGjEzuugn2SsG1mZFP = iArr;
    }

    @Override // com.vdodsodjsdt.oA1WO3soICf8H1N6bgpG
    public final oA1WO3soICf8H1N6bgpG GI83zq0G8e7zkn() {
        return new oA1WO3soICf8H1N6bgpG(KUYypEB4eNWOZWVDpH()).GI83zq0G8e7zkn();
    }

    @Override // com.vdodsodjsdt.oA1WO3soICf8H1N6bgpG
    public final void HzCpKshMOoaw76hFcbOVRYMeRd(EouCzLZsW9ynithduh eouCzLZsW9ynithduh, int i) {
        int iZOk739gUM7zIZC25HHUxoiyixWFjn = F44whnLsbQ.zOk739gUM7zIZC25HHUxoiyixWFjn(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.NSjgqmGjEzuugn2SsG1mZFP;
            int i3 = iZOk739gUM7zIZC25HHUxoiyixWFjn == 0 ? 0 : iArr[iZOk739gUM7zIZC25HHUxoiyixWFjn - 1];
            int i4 = iArr[iZOk739gUM7zIZC25HHUxoiyixWFjn] - i3;
            byte[][] bArr = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            int i5 = iArr[bArr.length + iZOk739gUM7zIZC25HHUxoiyixWFjn];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            tpWzSW479hfzvFH5 tpwzsw479hfzvfh5 = new tpWzSW479hfzvFH5(bArr[iZOk739gUM7zIZC25HHUxoiyixWFjn], i6, i6 + iMin, true);
            tpWzSW479hfzvFH5 tpwzsw479hfzvfh52 = eouCzLZsW9ynithduh.V57tEvNfxZVVcOCAOih5PKr;
            if (tpwzsw479hfzvfh52 == null) {
                tpwzsw479hfzvfh5.ZLZeBXTMq0zDztBxtRTuCHrapQ = tpwzsw479hfzvfh5;
                tpwzsw479hfzvfh5.zIvmSL0wzmmKGc3X39b2Gw2mUGE = tpwzsw479hfzvfh5;
                eouCzLZsW9ynithduh.V57tEvNfxZVVcOCAOih5PKr = tpwzsw479hfzvfh5;
            } else {
                tpWzSW479hfzvFH5 tpwzsw479hfzvfh53 = tpwzsw479hfzvfh52.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh53);
                tpwzsw479hfzvfh53.zzpBGItXfub0yWj(tpwzsw479hfzvfh5);
            }
            i2 += iMin;
            iZOk739gUM7zIZC25HHUxoiyixWFjn++;
        }
        eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR += (long) i;
    }

    public final byte[] KUYypEB4eNWOZWVDpH() {
        byte[] bArr = new byte[VxUQ9tBhpHJ2AAEDNW8sghc4m()];
        byte[][] bArr2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.NSjgqmGjEzuugn2SsG1mZFP;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            vmp19D2MODlOL.wR7sbzHKf9hYV1lxoS6nqyszepWvN(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // com.vdodsodjsdt.oA1WO3soICf8H1N6bgpG
    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x(int i, byte[] bArr, int i2, int i3) {
        ej6unYlOWMDF.pYmKDYlAmhudp(bArr, "other");
        if (i < 0 || i > VxUQ9tBhpHJ2AAEDNW8sghc4m() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iZOk739gUM7zIZC25HHUxoiyixWFjn = F44whnLsbQ.zOk739gUM7zIZC25HHUxoiyixWFjn(this, i);
        while (i < i4) {
            int[] iArr = this.NSjgqmGjEzuugn2SsG1mZFP;
            int i5 = iZOk739gUM7zIZC25HHUxoiyixWFjn == 0 ? 0 : iArr[iZOk739gUM7zIZC25HHUxoiyixWFjn - 1];
            int i6 = iArr[iZOk739gUM7zIZC25HHUxoiyixWFjn] - i5;
            byte[][] bArr2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            int i7 = iArr[bArr2.length + iZOk739gUM7zIZC25HHUxoiyixWFjn];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!FLWIoSaHb1q8TqFvEBgPyRGrzvi6.V57tEvNfxZVVcOCAOih5PKr((i - i5) + i7, i2, iMin, bArr2[iZOk739gUM7zIZC25HHUxoiyixWFjn], bArr)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iZOk739gUM7zIZC25HHUxoiyixWFjn++;
        }
        return true;
    }

    @Override // com.vdodsodjsdt.oA1WO3soICf8H1N6bgpG
    public final oA1WO3soICf8H1N6bgpG NSjgqmGjEzuugn2SsG1mZFP(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        if (i < 0) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(i, "beginIndex=", " < 0").toString());
        }
        if (i2 > VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
            throw new IllegalArgumentException(("endIndex=" + i2 + " > length(" + VxUQ9tBhpHJ2AAEDNW8sghc4m() + ')').toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i2, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && i2 == VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
            return this;
        }
        if (i == i2) {
            return oA1WO3soICf8H1N6bgpG.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        }
        int iZOk739gUM7zIZC25HHUxoiyixWFjn = F44whnLsbQ.zOk739gUM7zIZC25HHUxoiyixWFjn(this, i);
        int iZOk739gUM7zIZC25HHUxoiyixWFjn2 = F44whnLsbQ.zOk739gUM7zIZC25HHUxoiyixWFjn(this, i2 - 1);
        byte[][] bArr = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        byte[][] bArr2 = (byte[][]) vmp19D2MODlOL.AFOcXGdvoTMuqwiG8tD(bArr, iZOk739gUM7zIZC25HHUxoiyixWFjn, iZOk739gUM7zIZC25HHUxoiyixWFjn2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (iZOk739gUM7zIZC25HHUxoiyixWFjn <= iZOk739gUM7zIZC25HHUxoiyixWFjn2) {
            int i4 = iZOk739gUM7zIZC25HHUxoiyixWFjn;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iZOk739gUM7zIZC25HHUxoiyixWFjn2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iZOk739gUM7zIZC25HHUxoiyixWFjn != 0 ? iArr2[iZOk739gUM7zIZC25HHUxoiyixWFjn - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new PPtIx4psoo4sPV6C2irfHMJrxl(bArr2, iArr);
    }

    @Override // com.vdodsodjsdt.oA1WO3soICf8H1N6bgpG
    public final byte[] V57tEvNfxZVVcOCAOih5PKr() {
        return KUYypEB4eNWOZWVDpH();
    }

    @Override // com.vdodsodjsdt.oA1WO3soICf8H1N6bgpG
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return this.NSjgqmGjEzuugn2SsG1mZFP[this.ZLZeBXTMq0zDztBxtRTuCHrapQ.length - 1];
    }

    @Override // com.vdodsodjsdt.oA1WO3soICf8H1N6bgpG
    public final String ZLZeBXTMq0zDztBxtRTuCHrapQ(Charset charset) {
        ej6unYlOWMDF.pYmKDYlAmhudp(charset, "charset");
        return new oA1WO3soICf8H1N6bgpG(KUYypEB4eNWOZWVDpH()).ZLZeBXTMq0zDztBxtRTuCHrapQ(charset);
    }

    @Override // com.vdodsodjsdt.oA1WO3soICf8H1N6bgpG
    public final byte ZfQNn8hdWlEQ5cR94249PDsLR(int i) {
        byte[][] bArr = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int length = bArr.length - 1;
        int[] iArr = this.NSjgqmGjEzuugn2SsG1mZFP;
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.ZLZeBXTMq0zDztBxtRTuCHrapQ(iArr[length], i, 1L);
        int iZOk739gUM7zIZC25HHUxoiyixWFjn = F44whnLsbQ.zOk739gUM7zIZC25HHUxoiyixWFjn(this, i);
        return bArr[iZOk739gUM7zIZC25HHUxoiyixWFjn][(i - (iZOk739gUM7zIZC25HHUxoiyixWFjn == 0 ? 0 : iArr[iZOk739gUM7zIZC25HHUxoiyixWFjn - 1])) + iArr[bArr.length + iZOk739gUM7zIZC25HHUxoiyixWFjn]];
    }

    @Override // com.vdodsodjsdt.oA1WO3soICf8H1N6bgpG
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oA1WO3soICf8H1N6bgpG)) {
            return false;
        }
        oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg = (oA1WO3soICf8H1N6bgpG) obj;
        return oa1wo3soicf8h1n6bgpg.VxUQ9tBhpHJ2AAEDNW8sghc4m() == VxUQ9tBhpHJ2AAEDNW8sghc4m() && zIvmSL0wzmmKGc3X39b2Gw2mUGE(oa1wo3soicf8h1n6bgpg, VxUQ9tBhpHJ2AAEDNW8sghc4m());
    }

    @Override // com.vdodsodjsdt.oA1WO3soICf8H1N6bgpG
    public final int hashCode() {
        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.NSjgqmGjEzuugn2SsG1mZFP;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i3;
        return i3;
    }

    @Override // com.vdodsodjsdt.oA1WO3soICf8H1N6bgpG
    public final String toString() {
        return new oA1WO3soICf8H1N6bgpG(KUYypEB4eNWOZWVDpH()).toString();
    }

    @Override // com.vdodsodjsdt.oA1WO3soICf8H1N6bgpG
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg, int i) {
        ej6unYlOWMDF.pYmKDYlAmhudp(oa1wo3soicf8h1n6bgpg, "other");
        if (VxUQ9tBhpHJ2AAEDNW8sghc4m() - i >= 0) {
            int iZOk739gUM7zIZC25HHUxoiyixWFjn = F44whnLsbQ.zOk739gUM7zIZC25HHUxoiyixWFjn(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.NSjgqmGjEzuugn2SsG1mZFP;
                int i4 = iZOk739gUM7zIZC25HHUxoiyixWFjn == 0 ? 0 : iArr[iZOk739gUM7zIZC25HHUxoiyixWFjn - 1];
                int i5 = iArr[iZOk739gUM7zIZC25HHUxoiyixWFjn] - i4;
                byte[][] bArr = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                int i6 = iArr[bArr.length + iZOk739gUM7zIZC25HHUxoiyixWFjn];
                int iMin = Math.min(i, i5 + i4) - i2;
                if (oa1wo3soicf8h1n6bgpg.LaeGQIruHQu81hfJldjMOQSVblH3x(i3, bArr[iZOk739gUM7zIZC25HHUxoiyixWFjn], (i2 - i4) + i6, iMin)) {
                    i3 += iMin;
                    i2 += iMin;
                    iZOk739gUM7zIZC25HHUxoiyixWFjn++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.vdodsodjsdt.oA1WO3soICf8H1N6bgpG
    public final String zzpBGItXfub0yWj() {
        return new oA1WO3soICf8H1N6bgpG(KUYypEB4eNWOZWVDpH()).zzpBGItXfub0yWj();
    }
}
