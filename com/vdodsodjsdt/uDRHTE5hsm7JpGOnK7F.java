package com.vdodsodjsdt;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class uDRHTE5hsm7JpGOnK7F implements Iterable, Serializable {
    public static final uDRHTE5hsm7JpGOnK7F LaeGQIruHQu81hfJldjMOQSVblH3x = new uDRHTE5hsm7JpGOnK7F(iJsJOOjKyWEygkebu5yh4.zzpBGItXfub0yWj);
    public static final uQmaiFOQCFgLCkx8 zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public int V57tEvNfxZVVcOCAOih5PKr = 0;
    public final byte[] ZfQNn8hdWlEQ5cR94249PDsLR;

    static {
        zIvmSL0wzmmKGc3X39b2Gw2mUGE = veLfYgyb53a07Ze9LkDO.VxUQ9tBhpHJ2AAEDNW8sghc4m() ? new IN79WcIk5xB4t0GjRT43qPLs5(26) : new IN79WcIk5xB4t0GjRT43qPLs5(24);
    }

    public uDRHTE5hsm7JpGOnK7F(byte[] bArr) {
        bArr.getClass();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = bArr;
    }

    public static uDRHTE5hsm7JpGOnK7F V57tEvNfxZVVcOCAOih5PKr(byte[] bArr, int i, int i2) {
        zzpBGItXfub0yWj(i, i + i2, bArr.length);
        return new uDRHTE5hsm7JpGOnK7F(zIvmSL0wzmmKGc3X39b2Gw2mUGE.V57tEvNfxZVVcOCAOih5PKr(bArr, i, i2));
    }

    public static int zzpBGItXfub0yWj(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i, i2, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i2, i3, "End index: ", " >= "));
    }

    public int LaeGQIruHQu81hfJldjMOQSVblH3x() {
        return 0;
    }

    public byte VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR[i];
    }

    public void ZfQNn8hdWlEQ5cR94249PDsLR(int i, byte[] bArr) {
        System.arraycopy(this.ZfQNn8hdWlEQ5cR94249PDsLR, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uDRHTE5hsm7JpGOnK7F) || size() != ((uDRHTE5hsm7JpGOnK7F) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof uDRHTE5hsm7JpGOnK7F)) {
            return obj.equals(this);
        }
        uDRHTE5hsm7JpGOnK7F udrhte5hsm7jpgonk7f = (uDRHTE5hsm7JpGOnK7F) obj;
        int i = this.V57tEvNfxZVVcOCAOih5PKr;
        int i2 = udrhte5hsm7jpgonk7f.V57tEvNfxZVVcOCAOih5PKr;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > udrhte5hsm7jpgonk7f.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > udrhte5hsm7jpgonk7f.size()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + udrhte5hsm7jpgonk7f.size());
        }
        byte[] bArr = udrhte5hsm7jpgonk7f.ZfQNn8hdWlEQ5cR94249PDsLR;
        int iLaeGQIruHQu81hfJldjMOQSVblH3x = LaeGQIruHQu81hfJldjMOQSVblH3x() + size;
        int iLaeGQIruHQu81hfJldjMOQSVblH3x2 = LaeGQIruHQu81hfJldjMOQSVblH3x();
        int iLaeGQIruHQu81hfJldjMOQSVblH3x3 = udrhte5hsm7jpgonk7f.LaeGQIruHQu81hfJldjMOQSVblH3x();
        while (iLaeGQIruHQu81hfJldjMOQSVblH3x2 < iLaeGQIruHQu81hfJldjMOQSVblH3x) {
            if (this.ZfQNn8hdWlEQ5cR94249PDsLR[iLaeGQIruHQu81hfJldjMOQSVblH3x2] != bArr[iLaeGQIruHQu81hfJldjMOQSVblH3x3]) {
                return false;
            }
            iLaeGQIruHQu81hfJldjMOQSVblH3x2++;
            iLaeGQIruHQu81hfJldjMOQSVblH3x3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iLaeGQIruHQu81hfJldjMOQSVblH3x = LaeGQIruHQu81hfJldjMOQSVblH3x();
        int i2 = size;
        for (int i3 = iLaeGQIruHQu81hfJldjMOQSVblH3x; i3 < iLaeGQIruHQu81hfJldjMOQSVblH3x + size; i3++) {
            i2 = (i2 * 31) + this.ZfQNn8hdWlEQ5cR94249PDsLR[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.V57tEvNfxZVVcOCAOih5PKr = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c1M0l9URu5Xm(this);
    }

    public int size() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.length;
    }

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.vBGA6pPLqSMuYGvprl270j7(this);
        } else {
            StringBuilder sb = new StringBuilder();
            int iZzpBGItXfub0yWj = zzpBGItXfub0yWj(0, 47, size());
            sb.append(FLWIoSaHb1q8TqFvEBgPyRGrzvi6.vBGA6pPLqSMuYGvprl270j7(iZzpBGItXfub0yWj == 0 ? LaeGQIruHQu81hfJldjMOQSVblH3x : new k4FfW9NpxR8GRPeWza1nRm2EjRoju(this.ZfQNn8hdWlEQ5cR94249PDsLR, LaeGQIruHQu81hfJldjMOQSVblH3x(), iZzpBGItXfub0yWj)));
            sb.append("...");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return u9SlVAuoWhQUfJ.HzCpKshMOoaw76hFcbOVRYMeRd(sb2, string, "\">");
    }

    public byte zIvmSL0wzmmKGc3X39b2Gw2mUGE(int i) {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR[i];
    }
}
