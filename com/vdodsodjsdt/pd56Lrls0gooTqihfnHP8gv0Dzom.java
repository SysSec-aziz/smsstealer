package com.vdodsodjsdt;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class pd56Lrls0gooTqihfnHP8gv0Dzom {
    public final int V57tEvNfxZVVcOCAOih5PKr;
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final /* synthetic */ AtomicReferenceArray ZfQNn8hdWlEQ5cR94249PDsLR;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final boolean zzpBGItXfub0yWj;
    public static final /* synthetic */ AtomicReferenceFieldUpdater LaeGQIruHQu81hfJldjMOQSVblH3x = AtomicReferenceFieldUpdater.newUpdater(pd56Lrls0gooTqihfnHP8gv0Dzom.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater zIvmSL0wzmmKGc3X39b2Gw2mUGE = AtomicLongFieldUpdater.newUpdater(pd56Lrls0gooTqihfnHP8gv0Dzom.class, "_state$volatile");
    public static final aqhhl68tQrgIjcMGB3dY2YLK3vN ZLZeBXTMq0zDztBxtRTuCHrapQ = new aqhhl68tQrgIjcMGB3dY2YLK3vN("REMOVE_FROZEN", 2);

    public pd56Lrls0gooTqihfnHP8gv0Dzom(int i, boolean z) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.zzpBGItXfub0yWj = z;
        int i2 = i - 1;
        this.V57tEvNfxZVVcOCAOih5PKr = i2;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final pd56Lrls0gooTqihfnHP8gv0Dzom V57tEvNfxZVVcOCAOih5PKr() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        pd56Lrls0gooTqihfnHP8gv0Dzom pd56lrls0gootqihfnhp8gv0dzom;
        while (true) {
            atomicLongFieldUpdater = zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                pd56lrls0gootqihfnhp8gv0dzom = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            pd56lrls0gootqihfnhp8gv0dzom = this;
            if (atomicLongFieldUpdater.compareAndSet(pd56lrls0gootqihfnhp8gv0dzom, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LaeGQIruHQu81hfJldjMOQSVblH3x;
            pd56Lrls0gooTqihfnHP8gv0Dzom pd56lrls0gootqihfnhp8gv0dzom2 = (pd56Lrls0gooTqihfnHP8gv0Dzom) atomicReferenceFieldUpdater.get(this);
            if (pd56lrls0gootqihfnhp8gv0dzom2 != null) {
                return pd56lrls0gootqihfnhp8gv0dzom2;
            }
            pd56Lrls0gooTqihfnHP8gv0Dzom pd56lrls0gootqihfnhp8gv0dzom3 = new pd56Lrls0gooTqihfnHP8gv0Dzom(pd56lrls0gootqihfnhp8gv0dzom.VxUQ9tBhpHJ2AAEDNW8sghc4m * 2, pd56lrls0gootqihfnhp8gv0dzom.zzpBGItXfub0yWj);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = pd56lrls0gootqihfnhp8gv0dzom.V57tEvNfxZVVcOCAOih5PKr;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object jazcd5wlqi = pd56lrls0gootqihfnhp8gv0dzom.ZfQNn8hdWlEQ5cR94249PDsLR.get(i4);
                if (jazcd5wlqi == null) {
                    jazcd5wlqi = new jAzCD5WlQI(i);
                }
                pd56lrls0gootqihfnhp8gv0dzom3.ZfQNn8hdWlEQ5cR94249PDsLR.set(pd56lrls0gootqihfnhp8gv0dzom3.V57tEvNfxZVVcOCAOih5PKr & i, jazcd5wlqi);
                i++;
            }
            atomicLongFieldUpdater.set(pd56lrls0gootqihfnhp8gv0dzom3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, pd56lrls0gootqihfnhp8gv0dzom3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.V57tEvNfxZVVcOCAOih5PKr;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.zzpBGItXfub0yWj;
            AtomicReferenceArray atomicReferenceArray = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (zIvmSL0wzmmKGc3X39b2Gw2mUGE.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    pd56Lrls0gooTqihfnHP8gv0Dzom pd56lrls0gootqihfnhp8gv0dzomV57tEvNfxZVVcOCAOih5PKr = this;
                    while ((atomicLongFieldUpdater.get(pd56lrls0gootqihfnhp8gv0dzomV57tEvNfxZVVcOCAOih5PKr) & 1152921504606846976L) != 0) {
                        pd56lrls0gootqihfnhp8gv0dzomV57tEvNfxZVVcOCAOih5PKr = pd56lrls0gootqihfnhp8gv0dzomV57tEvNfxZVVcOCAOih5PKr.V57tEvNfxZVVcOCAOih5PKr();
                        AtomicReferenceArray atomicReferenceArray2 = pd56lrls0gootqihfnhp8gv0dzomV57tEvNfxZVVcOCAOih5PKr.ZfQNn8hdWlEQ5cR94249PDsLR;
                        int i4 = pd56lrls0gootqihfnhp8gv0dzomV57tEvNfxZVVcOCAOih5PKr.V57tEvNfxZVVcOCAOih5PKr & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof jAzCD5WlQI) && ((jAzCD5WlQI) obj2).VxUQ9tBhpHJ2AAEDNW8sghc4m == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            pd56lrls0gootqihfnhp8gv0dzomV57tEvNfxZVVcOCAOih5PKr = null;
                        }
                        if (pd56lrls0gootqihfnhp8gv0dzomV57tEvNfxZVVcOCAOih5PKr == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object ZfQNn8hdWlEQ5cR94249PDsLR() {
        /*
            r30 = this;
            r1 = r30
        L2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = com.vdodsodjsdt.pd56Lrls0gooTqihfnHP8gv0Dzom.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            long r2 = r6.get(r1)
            r7 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r7
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L15
            com.vdodsodjsdt.aqhhl68tQrgIjcMGB3dY2YLK3vN r0 = com.vdodsodjsdt.pd56Lrls0gooTqihfnHP8gv0Dzom.ZLZeBXTMq0zDztBxtRTuCHrapQ
            return r0
        L15:
            r11 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r2 & r11
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r13 = 30
            long r4 = r4 >> r13
            int r4 = (int) r4
            int r5 = r1.V57tEvNfxZVVcOCAOih5PKr
            r4 = r4 & r5
            r13 = r0 & r5
            r14 = 0
            if (r4 != r13) goto L2e
            goto L41
        L2e:
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r1.ZfQNn8hdWlEQ5cR94249PDsLR
            java.lang.Object r4 = r15.get(r13)
            boolean r5 = r1.zzpBGItXfub0yWj
            if (r4 != 0) goto L3b
            if (r5 == 0) goto L2
            goto L41
        L3b:
            r16 = r7
            boolean r7 = r4 instanceof com.vdodsodjsdt.jAzCD5WlQI
            if (r7 == 0) goto L42
        L41:
            return r14
        L42:
            int r0 = r0 + 1
            r7 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r7
            r7 = -1073741824(0xffffffffc0000000, double:NaN)
            long r18 = r2 & r7
            r20 = r7
            long r7 = (long) r0
            long r18 = r18 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = com.vdodsodjsdt.pd56Lrls0gooTqihfnHP8gv0Dzom.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            r28 = r18
            r18 = r4
            r19 = r5
            r4 = r28
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L66
            r15.set(r13, r14)
            return r18
        L66:
            r1 = r30
            if (r19 == 0) goto L2
        L6a:
            long r24 = r6.get(r1)
            long r2 = r24 & r11
            int r0 = (int) r2
            long r2 = r24 & r16
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 == 0) goto L7d
            com.vdodsodjsdt.pd56Lrls0gooTqihfnHP8gv0Dzom r0 = r1.V57tEvNfxZVVcOCAOih5PKr()
            r1 = r0
            goto L96
        L7d:
            long r2 = r24 & r20
            long r26 = r2 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r22 = com.vdodsodjsdt.pd56Lrls0gooTqihfnHP8gv0Dzom.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            r23 = r1
            boolean r1 = r22.compareAndSet(r23, r24, r26)
            r2 = r23
            if (r1 == 0) goto L99
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.ZfQNn8hdWlEQ5cR94249PDsLR
            int r2 = r2.V57tEvNfxZVVcOCAOih5PKr
            r0 = r0 & r2
            r1.set(r0, r14)
            r1 = r14
        L96:
            if (r1 != 0) goto L6a
            return r18
        L99:
            r1 = r2
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.pd56Lrls0gooTqihfnHP8gv0Dzom.ZfQNn8hdWlEQ5cR94249PDsLR():java.lang.Object");
    }

    public final boolean zzpBGItXfub0yWj() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }
}
