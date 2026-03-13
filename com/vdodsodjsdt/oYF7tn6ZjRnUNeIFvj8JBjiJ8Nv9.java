package com.vdodsodjsdt;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 implements Map, Serializable, CFVmEEraGs6EYyW {
    public static final oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public boolean Ca81ebIan1u;
    public int GI83zq0G8e7zkn;
    public int HzCpKshMOoaw76hFcbOVRYMeRd;
    public m6tsNVK6MskpxlNvPNQgbR18 KUYypEB4eNWOZWVDpH;
    public int[] LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int M9e7PWhFYLD2lOGMker;
    public int NSjgqmGjEzuugn2SsG1mZFP;
    public Object[] V57tEvNfxZVVcOCAOih5PKr;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public Object[] ZfQNn8hdWlEQ5cR94249PDsLR;
    public m6tsNVK6MskpxlNvPNQgbR18 p59rPv72J9;
    public GgyFD6Dt3dOkcXL q1wNbhk2O6;
    public int[] zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    static {
        oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 oyf7tn6zjrnuneifvj8jbjij8nv9 = new oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9(0);
        oyf7tn6zjrnuneifvj8jbjij8nv9.Ca81ebIan1u = true;
        h3jnZRsdwYJfY9UhQCkbvWciwvFHv = oyf7tn6zjrnuneifvj8jbjij8nv9;
    }

    public oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9() {
        this(8);
    }

    public final int GI83zq0G8e7zkn(Object obj) {
        int i = this.NSjgqmGjEzuugn2SsG1mZFP;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.LaeGQIruHQu81hfJldjMOQSVblH3x[i] >= 0) {
                Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                ej6unYlOWMDF.p59rPv72J9(objArr);
                if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.LaeGQIruHQu81hfJldjMOQSVblH3x[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void HzCpKshMOoaw76hFcbOVRYMeRd(int r6) {
        /*
            r5 = this;
            int r0 = r5.M9e7PWhFYLD2lOGMker
            int r0 = r0 + 1
            r5.M9e7PWhFYLD2lOGMker = r0
            int r0 = r5.NSjgqmGjEzuugn2SsG1mZFP
            int r1 = r5.HzCpKshMOoaw76hFcbOVRYMeRd
            r2 = 0
            if (r0 <= r1) goto L10
            r5.ZfQNn8hdWlEQ5cR94249PDsLR(r2)
        L10:
            int[] r0 = new int[r6]
            r5.zIvmSL0wzmmKGc3X39b2Gw2mUGE = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.GI83zq0G8e7zkn = r6
        L1c:
            int r6 = r5.NSjgqmGjEzuugn2SsG1mZFP
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.V57tEvNfxZVVcOCAOih5PKr
            r0 = r0[r2]
            int r0 = r5.M9e7PWhFYLD2lOGMker(r0)
            int r1 = r5.ZLZeBXTMq0zDztBxtRTuCHrapQ
        L2c:
            int[] r3 = r5.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.LaeGQIruHQu81hfJldjMOQSVblH3x
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9.HzCpKshMOoaw76hFcbOVRYMeRd(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0024->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void KUYypEB4eNWOZWVDpH(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.V57tEvNfxZVVcOCAOih5PKr
            java.lang.String r1 = "<this>"
            com.vdodsodjsdt.ej6unYlOWMDF.pYmKDYlAmhudp(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.ZfQNn8hdWlEQ5cR94249PDsLR
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.LaeGQIruHQu81hfJldjMOQSVblH3x
            r0 = r0[r12]
            int r1 = r11.ZLZeBXTMq0zDztBxtRTuCHrapQ
            int r1 = r1 * 2
            int[] r2 = r11.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2e
            int[] r0 = r11.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.ZLZeBXTMq0zDztBxtRTuCHrapQ
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            r7 = r5[r0]
            if (r7 != 0) goto L44
            r5[r1] = r2
            goto L6c
        L44:
            if (r7 >= 0) goto L4b
            r5[r1] = r6
        L48:
            r1 = r0
            r4 = r2
            goto L65
        L4b:
            java.lang.Object[] r5 = r11.V57tEvNfxZVVcOCAOih5PKr
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.M9e7PWhFYLD2lOGMker(r5)
            int r5 = r5 - r0
            int[] r9 = r11.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.LaeGQIruHQu81hfJldjMOQSVblH3x
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            r0[r1] = r6
        L6c:
            int[] r0 = r11.LaeGQIruHQu81hfJldjMOQSVblH3x
            r0[r12] = r6
            int r12 = r11.HzCpKshMOoaw76hFcbOVRYMeRd
            int r12 = r12 + r6
            r11.HzCpKshMOoaw76hFcbOVRYMeRd = r12
            int r12 = r11.M9e7PWhFYLD2lOGMker
            int r12 = r12 + 1
            r11.M9e7PWhFYLD2lOGMker = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9.KUYypEB4eNWOZWVDpH(int):void");
    }

    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x(Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!zIvmSL0wzmmKGc3X39b2Gw2mUGE((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final int M9e7PWhFYLD2lOGMker(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.GI83zq0G8e7zkn;
    }

    public final int NSjgqmGjEzuugn2SsG1mZFP(Object obj) {
        int iM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker(obj);
        int i = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        while (true) {
            int i2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[iM9e7PWhFYLD2lOGMker];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM9e7PWhFYLD2lOGMker = iM9e7PWhFYLD2lOGMker == 0 ? this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.length - 1 : iM9e7PWhFYLD2lOGMker - 1;
        }
    }

    public final void V57tEvNfxZVVcOCAOih5PKr() {
        if (this.Ca81ebIan1u) {
            throw new UnsupportedOperationException();
        }
    }

    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m(Object obj) {
        V57tEvNfxZVVcOCAOih5PKr();
        while (true) {
            int iM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker(obj);
            int i = this.ZLZeBXTMq0zDztBxtRTuCHrapQ * 2;
            int length = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                int i3 = iArr[iM9e7PWhFYLD2lOGMker];
                if (i3 <= 0) {
                    int i4 = this.NSjgqmGjEzuugn2SsG1mZFP;
                    Object[] objArr = this.V57tEvNfxZVVcOCAOih5PKr;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.NSjgqmGjEzuugn2SsG1mZFP = i5;
                        objArr[i4] = obj;
                        this.LaeGQIruHQu81hfJldjMOQSVblH3x[i4] = iM9e7PWhFYLD2lOGMker;
                        iArr[iM9e7PWhFYLD2lOGMker] = i5;
                        this.HzCpKshMOoaw76hFcbOVRYMeRd++;
                        this.M9e7PWhFYLD2lOGMker++;
                        if (i2 > this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i2;
                        }
                        return i4;
                    }
                    ZLZeBXTMq0zDztBxtRTuCHrapQ(1);
                } else {
                    if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        HzCpKshMOoaw76hFcbOVRYMeRd(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.length * 2);
                        break;
                    }
                    iM9e7PWhFYLD2lOGMker = iM9e7PWhFYLD2lOGMker == 0 ? this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.length - 1 : iM9e7PWhFYLD2lOGMker - 1;
                }
            }
        }
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.V57tEvNfxZVVcOCAOih5PKr;
        int length = objArr.length;
        int i2 = this.NSjgqmGjEzuugn2SsG1mZFP;
        int i3 = length - i2;
        int i4 = i2 - this.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            ZfQNn8hdWlEQ5cR94249PDsLR(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i6);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objArrCopyOf2, "copyOf(...)");
            this.V57tEvNfxZVVcOCAOih5PKr = objArrCopyOf2;
            Object[] objArr2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i6);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.ZfQNn8hdWlEQ5cR94249PDsLR = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.LaeGQIruHQu81hfJldjMOQSVblH3x, i6);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(iArrCopyOf, "copyOf(...)");
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.length) {
                HzCpKshMOoaw76hFcbOVRYMeRd(iHighestOneBit);
            }
        }
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(boolean z) {
        int i;
        Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.NSjgqmGjEzuugn2SsG1mZFP;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.V57tEvNfxZVVcOCAOih5PKr;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.HVEwbdULInpTNa0IG(this.V57tEvNfxZVVcOCAOih5PKr, i3, i);
        if (objArr != null) {
            FLWIoSaHb1q8TqFvEBgPyRGrzvi6.HVEwbdULInpTNa0IG(objArr, i3, this.NSjgqmGjEzuugn2SsG1mZFP);
        }
        this.NSjgqmGjEzuugn2SsG1mZFP = i3;
    }

    @Override // java.util.Map
    public final void clear() {
        V57tEvNfxZVVcOCAOih5PKr();
        int i = this.NSjgqmGjEzuugn2SsG1mZFP - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.HVEwbdULInpTNa0IG(this.V57tEvNfxZVVcOCAOih5PKr, 0, this.NSjgqmGjEzuugn2SsG1mZFP);
        Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (objArr != null) {
            FLWIoSaHb1q8TqFvEBgPyRGrzvi6.HVEwbdULInpTNa0IG(objArr, 0, this.NSjgqmGjEzuugn2SsG1mZFP);
        }
        this.HzCpKshMOoaw76hFcbOVRYMeRd = 0;
        this.NSjgqmGjEzuugn2SsG1mZFP = 0;
        this.M9e7PWhFYLD2lOGMker++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return NSjgqmGjEzuugn2SsG1mZFP(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return GI83zq0G8e7zkn(obj) >= 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        m6tsNVK6MskpxlNvPNQgbR18 m6tsnvk6mskpxlnvpnqgbr18 = this.p59rPv72J9;
        if (m6tsnvk6mskpxlnvpnqgbr18 != null) {
            return m6tsnvk6mskpxlnvpnqgbr18;
        }
        m6tsNVK6MskpxlNvPNQgbR18 m6tsnvk6mskpxlnvpnqgbr182 = new m6tsNVK6MskpxlNvPNQgbR18(this, 0);
        this.p59rPv72J9 = m6tsnvk6mskpxlnvpnqgbr182;
        return m6tsnvk6mskpxlnvpnqgbr182;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.HzCpKshMOoaw76hFcbOVRYMeRd == map.size() && LaeGQIruHQu81hfJldjMOQSVblH3x(map.entrySet());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP(obj);
        if (iNSjgqmGjEzuugn2SsG1mZFP < 0) {
            return null;
        }
        Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        ej6unYlOWMDF.p59rPv72J9(objArr);
        return objArr[iNSjgqmGjEzuugn2SsG1mZFP];
    }

    @Override // java.util.Map
    public final int hashCode() {
        qZMpZ4Tr49rV qzmpz4tr49rv = new qZMpZ4Tr49rV(this, 0);
        int i = 0;
        while (qzmpz4tr49rv.hasNext()) {
            int i2 = qzmpz4tr49rv.V57tEvNfxZVVcOCAOih5PKr;
            oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 oyf7tn6zjrnuneifvj8jbjij8nv9 = (oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9) qzmpz4tr49rv.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (i2 >= oyf7tn6zjrnuneifvj8jbjij8nv9.NSjgqmGjEzuugn2SsG1mZFP) {
                throw new NoSuchElementException();
            }
            qzmpz4tr49rv.V57tEvNfxZVVcOCAOih5PKr = i2 + 1;
            qzmpz4tr49rv.ZfQNn8hdWlEQ5cR94249PDsLR = i2;
            Object obj = oyf7tn6zjrnuneifvj8jbjij8nv9.V57tEvNfxZVVcOCAOih5PKr[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = oyf7tn6zjrnuneifvj8jbjij8nv9.ZfQNn8hdWlEQ5cR94249PDsLR;
            ej6unYlOWMDF.p59rPv72J9(objArr);
            Object obj2 = objArr[qzmpz4tr49rv.ZfQNn8hdWlEQ5cR94249PDsLR];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            qzmpz4tr49rv.LaeGQIruHQu81hfJldjMOQSVblH3x();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.HzCpKshMOoaw76hFcbOVRYMeRd == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        m6tsNVK6MskpxlNvPNQgbR18 m6tsnvk6mskpxlnvpnqgbr18 = this.KUYypEB4eNWOZWVDpH;
        if (m6tsnvk6mskpxlnvpnqgbr18 != null) {
            return m6tsnvk6mskpxlnvpnqgbr18;
        }
        m6tsNVK6MskpxlNvPNQgbR18 m6tsnvk6mskpxlnvpnqgbr182 = new m6tsNVK6MskpxlNvPNQgbR18(this, 1);
        this.KUYypEB4eNWOZWVDpH = m6tsnvk6mskpxlnvpnqgbr182;
        return m6tsnvk6mskpxlnvpnqgbr182;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        V57tEvNfxZVVcOCAOih5PKr();
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m(obj);
        Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (objArr == null) {
            int length = this.V57tEvNfxZVVcOCAOih5PKr.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.ZfQNn8hdWlEQ5cR94249PDsLR = objArr;
        }
        if (iVxUQ9tBhpHJ2AAEDNW8sghc4m >= 0) {
            objArr[iVxUQ9tBhpHJ2AAEDNW8sghc4m] = obj2;
            return null;
        }
        int i = (-iVxUQ9tBhpHJ2AAEDNW8sghc4m) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        ej6unYlOWMDF.pYmKDYlAmhudp(map, "from");
        V57tEvNfxZVVcOCAOih5PKr();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        ZLZeBXTMq0zDztBxtRTuCHrapQ(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m(entry.getKey());
            Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (objArr == null) {
                int length = this.V57tEvNfxZVVcOCAOih5PKr.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.ZfQNn8hdWlEQ5cR94249PDsLR = objArr;
            }
            if (iVxUQ9tBhpHJ2AAEDNW8sghc4m >= 0) {
                objArr[iVxUQ9tBhpHJ2AAEDNW8sghc4m] = entry.getValue();
            } else {
                int i = (-iVxUQ9tBhpHJ2AAEDNW8sghc4m) - 1;
                if (!ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        V57tEvNfxZVVcOCAOih5PKr();
        int iNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP(obj);
        if (iNSjgqmGjEzuugn2SsG1mZFP < 0) {
            return null;
        }
        Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        ej6unYlOWMDF.p59rPv72J9(objArr);
        Object obj2 = objArr[iNSjgqmGjEzuugn2SsG1mZFP];
        KUYypEB4eNWOZWVDpH(iNSjgqmGjEzuugn2SsG1mZFP);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.HzCpKshMOoaw76hFcbOVRYMeRd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.HzCpKshMOoaw76hFcbOVRYMeRd * 3) + 2);
        sb.append("{");
        int i = 0;
        qZMpZ4Tr49rV qzmpz4tr49rv = new qZMpZ4Tr49rV(this, 0);
        while (qzmpz4tr49rv.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = qzmpz4tr49rv.V57tEvNfxZVVcOCAOih5PKr;
            oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 oyf7tn6zjrnuneifvj8jbjij8nv9 = (oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9) qzmpz4tr49rv.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (i2 >= oyf7tn6zjrnuneifvj8jbjij8nv9.NSjgqmGjEzuugn2SsG1mZFP) {
                throw new NoSuchElementException();
            }
            qzmpz4tr49rv.V57tEvNfxZVVcOCAOih5PKr = i2 + 1;
            qzmpz4tr49rv.ZfQNn8hdWlEQ5cR94249PDsLR = i2;
            Object obj = oyf7tn6zjrnuneifvj8jbjij8nv9.V57tEvNfxZVVcOCAOih5PKr[i2];
            if (obj == oyf7tn6zjrnuneifvj8jbjij8nv9) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = oyf7tn6zjrnuneifvj8jbjij8nv9.ZfQNn8hdWlEQ5cR94249PDsLR;
            ej6unYlOWMDF.p59rPv72J9(objArr);
            Object obj2 = objArr[qzmpz4tr49rv.ZfQNn8hdWlEQ5cR94249PDsLR];
            if (obj2 == oyf7tn6zjrnuneifvj8jbjij8nv9) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            qzmpz4tr49rv.LaeGQIruHQu81hfJldjMOQSVblH3x();
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        GgyFD6Dt3dOkcXL ggyFD6Dt3dOkcXL = this.q1wNbhk2O6;
        if (ggyFD6Dt3dOkcXL != null) {
            return ggyFD6Dt3dOkcXL;
        }
        GgyFD6Dt3dOkcXL ggyFD6Dt3dOkcXL2 = new GgyFD6Dt3dOkcXL(this);
        this.q1wNbhk2O6 = ggyFD6Dt3dOkcXL2;
        return ggyFD6Dt3dOkcXL2;
    }

    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(Map.Entry entry) {
        ej6unYlOWMDF.pYmKDYlAmhudp(entry, "entry");
        int iNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP(entry.getKey());
        if (iNSjgqmGjEzuugn2SsG1mZFP < 0) {
            return false;
        }
        Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        ej6unYlOWMDF.p59rPv72J9(objArr);
        return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(objArr[iNSjgqmGjEzuugn2SsG1mZFP], entry.getValue());
    }

    public final oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 zzpBGItXfub0yWj() {
        V57tEvNfxZVVcOCAOih5PKr();
        this.Ca81ebIan1u = true;
        if (this.HzCpKshMOoaw76hFcbOVRYMeRd > 0) {
            return this;
        }
        oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 oyf7tn6zjrnuneifvj8jbjij8nv9 = h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        ej6unYlOWMDF.Ca81ebIan1u(oyf7tn6zjrnuneifvj8jbjij8nv9, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return oyf7tn6zjrnuneifvj8jbjij8nv9;
    }

    public oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.V57tEvNfxZVVcOCAOih5PKr = objArr;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = null;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = iArr;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new int[iHighestOneBit];
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 2;
        this.NSjgqmGjEzuugn2SsG1mZFP = 0;
        this.GI83zq0G8e7zkn = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
