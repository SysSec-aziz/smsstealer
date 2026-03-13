package com.vdodsodjsdt;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class baaN71QMl7e extends CwickyU0ZjEG0JwJwvvsOp0vRH0PB implements w1TUuqPealEllpif2 {
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater GI83zq0G8e7zkn = AtomicReferenceFieldUpdater.newUpdater(baaN71QMl7e.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater M9e7PWhFYLD2lOGMker = AtomicReferenceFieldUpdater.newUpdater(baaN71QMl7e.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater HzCpKshMOoaw76hFcbOVRYMeRd = AtomicIntegerFieldUpdater.newUpdater(baaN71QMl7e.class, "_isCompleted$volatile");

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean CixTK5ZX8oWXHz34qHYV(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = com.vdodsodjsdt.baaN71QMl7e.GI83zq0G8e7zkn
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = com.vdodsodjsdt.baaN71QMl7e.HzCpKshMOoaw76hFcbOVRYMeRd
            int r2 = r2.get(r6)
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            r2 = 1
            if (r1 != 0) goto L22
        L13:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L1b
            goto L62
        L1b:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L13
            goto L0
        L22:
            boolean r4 = r1 instanceof com.vdodsodjsdt.pd56Lrls0gooTqihfnHP8gv0Dzom
            if (r4 == 0) goto L47
            r4 = r1
            com.vdodsodjsdt.pd56Lrls0gooTqihfnHP8gv0Dzom r4 = (com.vdodsodjsdt.pd56Lrls0gooTqihfnHP8gv0Dzom) r4
            int r5 = r4.VxUQ9tBhpHJ2AAEDNW8sghc4m(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            com.vdodsodjsdt.pd56Lrls0gooTqihfnHP8gv0Dzom r3 = r4.V57tEvNfxZVVcOCAOih5PKr()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            com.vdodsodjsdt.aqhhl68tQrgIjcMGB3dY2YLK3vN r4 = com.vdodsodjsdt.KfeOQNOupsCg6878zi4e.ZfQNn8hdWlEQ5cR94249PDsLR
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            com.vdodsodjsdt.pd56Lrls0gooTqihfnHP8gv0Dzom r3 = new com.vdodsodjsdt.pd56Lrls0gooTqihfnHP8gv0Dzom
            r4 = 8
            r3.<init>(r4, r2)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.VxUQ9tBhpHJ2AAEDNW8sghc4m(r4)
            r3.VxUQ9tBhpHJ2AAEDNW8sghc4m(r7)
        L5c:
            boolean r4 = r0.compareAndSet(r6, r1, r3)
            if (r4 == 0) goto L63
        L62:
            return r2
        L63:
            java.lang.Object r4 = r0.get(r6)
            if (r4 == r1) goto L5c
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.baaN71QMl7e.CixTK5ZX8oWXHz34qHYV(java.lang.Runnable):boolean");
    }

    @Override // com.vdodsodjsdt.w1TUuqPealEllpif2
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(long j, YAf4BMDpiCAb4hYaN6VqW yAf4BMDpiCAb4hYaN6VqW) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            w3TLxfZW0FyCJcoYyLvc7v w3tlxfzw0fycjcoyylvc7v = new w3TLxfZW0FyCJcoYyLvc7v(this, j2 + jNanoTime, yAf4BMDpiCAb4hYaN6VqW);
            YdNRGRc4rly(jNanoTime, w3tlxfzw0fycjcoyylvc7v);
            yAf4BMDpiCAb4hYaN6VqW.q11o1hieEkZDhF1MGOZI26oZiDT(new xPJD6zCXsU5TwlX(2, w3tlxfzw0fycjcoyylvc7v));
        }
    }

    @Override // com.vdodsodjsdt.LL6zXCXfmDYzdHCRTT
    public final void SuB3hEmTmbbRGAhtvOOmfKEon(D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW, Runnable runnable) {
        d9zDyyznnp3oaDT1Ug(runnable);
    }

    public final void YdNRGRc4rly(long j, ErBfq9NXKMau0dmIu8LfNce2kOtT erBfq9NXKMau0dmIu8LfNce2kOtT) {
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m;
        Thread threadHVEwbdULInpTNa0IG;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = M9e7PWhFYLD2lOGMker;
        if (HzCpKshMOoaw76hFcbOVRYMeRd.get(this) != 0) {
            iVxUQ9tBhpHJ2AAEDNW8sghc4m = 1;
        } else {
            hM2WrRpV30e0b hm2wrrpv30e0b = (hM2WrRpV30e0b) atomicReferenceFieldUpdater.get(this);
            if (hm2wrrpv30e0b == null) {
                hM2WrRpV30e0b hm2wrrpv30e0b2 = new hM2WrRpV30e0b();
                hm2wrrpv30e0b2.V57tEvNfxZVVcOCAOih5PKr = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, hm2wrrpv30e0b2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                ej6unYlOWMDF.p59rPv72J9(obj);
                hm2wrrpv30e0b = (hM2WrRpV30e0b) obj;
            }
            iVxUQ9tBhpHJ2AAEDNW8sghc4m = erBfq9NXKMau0dmIu8LfNce2kOtT.VxUQ9tBhpHJ2AAEDNW8sghc4m(j, hm2wrrpv30e0b, this);
        }
        if (iVxUQ9tBhpHJ2AAEDNW8sghc4m != 0) {
            if (iVxUQ9tBhpHJ2AAEDNW8sghc4m == 1) {
                TqcnImqkSWIKht(j, erBfq9NXKMau0dmIu8LfNce2kOtT);
                return;
            } else {
                if (iVxUQ9tBhpHJ2AAEDNW8sghc4m != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        hM2WrRpV30e0b hm2wrrpv30e0b3 = (hM2WrRpV30e0b) atomicReferenceFieldUpdater.get(this);
        if (hm2wrrpv30e0b3 != null) {
            synchronized (hm2wrrpv30e0b3) {
                ErBfq9NXKMau0dmIu8LfNce2kOtT[] erBfq9NXKMau0dmIu8LfNce2kOtTArr = hm2wrrpv30e0b3.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                erBfq9NXKMau0dmIu8LfNce2kOtT = erBfq9NXKMau0dmIu8LfNce2kOtTArr != null ? erBfq9NXKMau0dmIu8LfNce2kOtTArr[0] : null;
            }
        }
        if (erBfq9NXKMau0dmIu8LfNce2kOtT != erBfq9NXKMau0dmIu8LfNce2kOtT || Thread.currentThread() == (threadHVEwbdULInpTNa0IG = HVEwbdULInpTNa0IG())) {
            return;
        }
        LockSupport.unpark(threadHVEwbdULInpTNa0IG);
    }

    public void d9zDyyznnp3oaDT1Ug(Runnable runnable) {
        if (!CixTK5ZX8oWXHz34qHYV(runnable)) {
            DBe0sYt4niFwXhYZX4.KUYypEB4eNWOZWVDpH.d9zDyyznnp3oaDT1Ug(runnable);
            return;
        }
        Thread threadHVEwbdULInpTNa0IG = HVEwbdULInpTNa0IG();
        if (Thread.currentThread() != threadHVEwbdULInpTNa0IG) {
            LockSupport.unpark(threadHVEwbdULInpTNa0IG);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        r7 = null;
     */
    @Override // com.vdodsodjsdt.CwickyU0ZjEG0JwJwvvsOp0vRH0PB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long qygqjTppWwx992() {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.baaN71QMl7e.qygqjTppWwx992():long");
    }

    @Override // com.vdodsodjsdt.CwickyU0ZjEG0JwJwvvsOp0vRH0PB
    public void shutdown() {
        ErBfq9NXKMau0dmIu8LfNce2kOtT erBfq9NXKMau0dmIu8LfNce2kOtTZzpBGItXfub0yWj;
        bxg58FPVmiJdXQNjZxsZ.VxUQ9tBhpHJ2AAEDNW8sghc4m.set(null);
        HzCpKshMOoaw76hFcbOVRYMeRd.set(this, 1);
        aqhhl68tQrgIjcMGB3dY2YLK3vN aqhhl68tqrgijcmgb3dy2ylk3vn = KfeOQNOupsCg6878zi4e.ZfQNn8hdWlEQ5cR94249PDsLR;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GI83zq0G8e7zkn;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof pd56Lrls0gooTqihfnHP8gv0Dzom)) {
                    if (obj != aqhhl68tqrgijcmgb3dy2ylk3vn) {
                        pd56Lrls0gooTqihfnHP8gv0Dzom pd56lrls0gootqihfnhp8gv0dzom = new pd56Lrls0gooTqihfnHP8gv0Dzom(8, true);
                        pd56lrls0gootqihfnhp8gv0dzom.VxUQ9tBhpHJ2AAEDNW8sghc4m((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pd56lrls0gootqihfnhp8gv0dzom)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((pd56Lrls0gooTqihfnHP8gv0Dzom) obj).zzpBGItXfub0yWj();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, aqhhl68tqrgijcmgb3dy2ylk3vn)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (qygqjTppWwx992() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            hM2WrRpV30e0b hm2wrrpv30e0b = (hM2WrRpV30e0b) M9e7PWhFYLD2lOGMker.get(this);
            if (hm2wrrpv30e0b == null) {
                return;
            }
            synchronized (hm2wrrpv30e0b) {
                erBfq9NXKMau0dmIu8LfNce2kOtTZzpBGItXfub0yWj = Ra0wxJbsOwDYCmrrSAs.zzpBGItXfub0yWj.get(hm2wrrpv30e0b) > 0 ? hm2wrrpv30e0b.zzpBGItXfub0yWj(0) : null;
            }
            if (erBfq9NXKMau0dmIu8LfNce2kOtTZzpBGItXfub0yWj == null) {
                return;
            } else {
                TqcnImqkSWIKht(jNanoTime, erBfq9NXKMau0dmIu8LfNce2kOtTZzpBGItXfub0yWj);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean ymT6yQrus3w() {
        /*
            r7 = this;
            com.vdodsodjsdt.rOiKJVDHPqqeCfn r0 = r7.ZLZeBXTMq0zDztBxtRTuCHrapQ
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = com.vdodsodjsdt.baaN71QMl7e.M9e7PWhFYLD2lOGMker
            java.lang.Object r0 = r0.get(r7)
            com.vdodsodjsdt.hM2WrRpV30e0b r0 = (com.vdodsodjsdt.hM2WrRpV30e0b) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = com.vdodsodjsdt.Ra0wxJbsOwDYCmrrSAs.zzpBGItXfub0yWj
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = com.vdodsodjsdt.baaN71QMl7e.GI83zq0G8e7zkn
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof com.vdodsodjsdt.pd56Lrls0gooTqihfnHP8gv0Dzom
            if (r3 == 0) goto L4f
            com.vdodsodjsdt.pd56Lrls0gooTqihfnHP8gv0Dzom r0 = (com.vdodsodjsdt.pd56Lrls0gooTqihfnHP8gv0Dzom) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = com.vdodsodjsdt.pd56Lrls0gooTqihfnHP8gv0Dzom.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
            if (r0 != r3) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            com.vdodsodjsdt.aqhhl68tQrgIjcMGB3dY2YLK3vN r3 = com.vdodsodjsdt.KfeOQNOupsCg6878zi4e.ZfQNn8hdWlEQ5cR94249PDsLR
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.baaN71QMl7e.ymT6yQrus3w():boolean");
    }
}
