package com.vdodsodjsdt;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class kxD7lnfhVByiEwFdNtrRslxulbe implements Cloneable {
    public /* synthetic */ Object[] LaeGQIruHQu81hfJldjMOQSVblH3x;
    public /* synthetic */ boolean V57tEvNfxZVVcOCAOih5PKr;
    public /* synthetic */ long[] ZfQNn8hdWlEQ5cR94249PDsLR;
    public /* synthetic */ int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public kxD7lnfhVByiEwFdNtrRslxulbe() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new long[i4];
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new Object[i4];
    }

    public final int LaeGQIruHQu81hfJldjMOQSVblH3x() {
        if (this.V57tEvNfxZVVcOCAOih5PKr) {
            int i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            long[] jArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            Object[] objArr = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != FLWIoSaHb1q8TqFvEBgPyRGrzvi6.V57tEvNfxZVVcOCAOih5PKr) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.V57tEvNfxZVVcOCAOih5PKr = false;
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i2;
        }
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    public final long V57tEvNfxZVVcOCAOih5PKr(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE)) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        if (this.V57tEvNfxZVVcOCAOih5PKr) {
            long[] jArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            Object[] objArr = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != FLWIoSaHb1q8TqFvEBgPyRGrzvi6.V57tEvNfxZVVcOCAOih5PKr) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.V57tEvNfxZVVcOCAOih5PKr = false;
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i3;
        }
        return this.ZfQNn8hdWlEQ5cR94249PDsLR[i];
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        int i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        Object[] objArr = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
        this.V57tEvNfxZVVcOCAOih5PKr = false;
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(long j, Object obj) {
        Object obj2 = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.V57tEvNfxZVVcOCAOih5PKr;
        int iHzCpKshMOoaw76hFcbOVRYMeRd = ej6unYlOWMDF.HzCpKshMOoaw76hFcbOVRYMeRd(this.ZfQNn8hdWlEQ5cR94249PDsLR, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, j);
        if (iHzCpKshMOoaw76hFcbOVRYMeRd >= 0) {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x[iHzCpKshMOoaw76hFcbOVRYMeRd] = obj;
            return;
        }
        int i = ~iHzCpKshMOoaw76hFcbOVRYMeRd;
        int i2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (i < i2) {
            Object[] objArr = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (objArr[i] == obj2) {
                this.ZfQNn8hdWlEQ5cR94249PDsLR[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.V57tEvNfxZVVcOCAOih5PKr) {
            long[] jArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.V57tEvNfxZVVcOCAOih5PKr = false;
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i3;
                i = ~ej6unYlOWMDF.HzCpKshMOoaw76hFcbOVRYMeRd(this.ZfQNn8hdWlEQ5cR94249PDsLR, i3, j);
            }
        }
        int i5 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (i5 >= this.ZfQNn8hdWlEQ5cR94249PDsLR.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.ZfQNn8hdWlEQ5cR94249PDsLR, i9);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(jArrCopyOf, "copyOf(this, newSize)");
            this.ZfQNn8hdWlEQ5cR94249PDsLR = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.LaeGQIruHQu81hfJldjMOQSVblH3x, i9);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objArrCopyOf, "copyOf(this, newSize)");
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = objArrCopyOf;
        }
        int i10 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE - i;
        if (i10 != 0) {
            long[] jArr2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            int i11 = i + 1;
            ej6unYlOWMDF.pYmKDYlAmhudp(jArr2, "<this>");
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr3, objArr3, i11, i, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR[i] = j;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x[i] = obj;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE++;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        ej6unYlOWMDF.Ca81ebIan1u(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        kxD7lnfhVByiEwFdNtrRslxulbe kxd7lnfhvbyiewfdntrrslxulbe = (kxD7lnfhVByiEwFdNtrRslxulbe) objClone;
        kxd7lnfhvbyiewfdntrrslxulbe.ZfQNn8hdWlEQ5cR94249PDsLR = (long[]) this.ZfQNn8hdWlEQ5cR94249PDsLR.clone();
        kxd7lnfhvbyiewfdntrrslxulbe.LaeGQIruHQu81hfJldjMOQSVblH3x = (Object[]) this.LaeGQIruHQu81hfJldjMOQSVblH3x.clone();
        return kxd7lnfhvbyiewfdntrrslxulbe;
    }

    public final String toString() {
        if (LaeGQIruHQu81hfJldjMOQSVblH3x() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE * 28);
        sb.append('{');
        int i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(V57tEvNfxZVVcOCAOih5PKr(i2));
            sb.append('=');
            Object objZIvmSL0wzmmKGc3X39b2Gw2mUGE = zIvmSL0wzmmKGc3X39b2Gw2mUGE(i2);
            if (objZIvmSL0wzmmKGc3X39b2Gw2mUGE != sb) {
                sb.append(objZIvmSL0wzmmKGc3X39b2Gw2mUGE);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final Object zIvmSL0wzmmKGc3X39b2Gw2mUGE(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE)) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        if (this.V57tEvNfxZVVcOCAOih5PKr) {
            long[] jArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            Object[] objArr = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != FLWIoSaHb1q8TqFvEBgPyRGrzvi6.V57tEvNfxZVVcOCAOih5PKr) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.V57tEvNfxZVVcOCAOih5PKr = false;
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i3;
        }
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x[i];
    }

    public final Object zzpBGItXfub0yWj(long j) {
        Object obj;
        int iHzCpKshMOoaw76hFcbOVRYMeRd = ej6unYlOWMDF.HzCpKshMOoaw76hFcbOVRYMeRd(this.ZfQNn8hdWlEQ5cR94249PDsLR, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, j);
        if (iHzCpKshMOoaw76hFcbOVRYMeRd < 0 || (obj = this.LaeGQIruHQu81hfJldjMOQSVblH3x[iHzCpKshMOoaw76hFcbOVRYMeRd]) == FLWIoSaHb1q8TqFvEBgPyRGrzvi6.V57tEvNfxZVVcOCAOih5PKr) {
            return null;
        }
        return obj;
    }
}
