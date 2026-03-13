package com.vdodsodjsdt;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class TJ9aZ7994WmF5CLeDt5zNtk2DaKXW implements Executor, Closeable {
    public final Mw5vHRo4LaQY00jiXFZzZGjJzcG GI83zq0G8e7zkn;
    public final long LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final NXH9JR4ljoQH NSjgqmGjEzuugn2SsG1mZFP;
    public final int V57tEvNfxZVVcOCAOih5PKr;
    public final NXH9JR4ljoQH ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final String zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public static final /* synthetic */ AtomicLongFieldUpdater M9e7PWhFYLD2lOGMker = AtomicLongFieldUpdater.newUpdater(TJ9aZ7994WmF5CLeDt5zNtk2DaKXW.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater HzCpKshMOoaw76hFcbOVRYMeRd = AtomicLongFieldUpdater.newUpdater(TJ9aZ7994WmF5CLeDt5zNtk2DaKXW.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater KUYypEB4eNWOZWVDpH = AtomicIntegerFieldUpdater.newUpdater(TJ9aZ7994WmF5CLeDt5zNtk2DaKXW.class, "_isTerminated$volatile");
    public static final aqhhl68tQrgIjcMGB3dY2YLK3vN q1wNbhk2O6 = new aqhhl68tQrgIjcMGB3dY2YLK3vN("NOT_IN_STACK", 2);

    public TJ9aZ7994WmF5CLeDt5zNtk2DaKXW(int i, int i2, long j, String str) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i2;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = j;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = str;
        if (i < 1) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i2, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new NXH9JR4ljoQH();
        this.NSjgqmGjEzuugn2SsG1mZFP = new NXH9JR4ljoQH();
        this.GI83zq0G8e7zkn = new Mw5vHRo4LaQY00jiXFZzZGjJzcG((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void LaeGQIruHQu81hfJldjMOQSVblH3x(TJ9aZ7994WmF5CLeDt5zNtk2DaKXW tJ9aZ7994WmF5CLeDt5zNtk2DaKXW, Runnable runnable, int i) {
        tJ9aZ7994WmF5CLeDt5zNtk2DaKXW.V57tEvNfxZVVcOCAOih5PKr(runnable, TrXcUZLEn3kaSijyhUrmV5.ZLZeBXTMq0zDztBxtRTuCHrapQ, (i & 4) == 0);
    }

    public final boolean KUYypEB4eNWOZWVDpH(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i < i2) {
            int iVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m();
            if (iVxUQ9tBhpHJ2AAEDNW8sghc4m == 1 && i2 > 1) {
                VxUQ9tBhpHJ2AAEDNW8sghc4m();
            }
            if (iVxUQ9tBhpHJ2AAEDNW8sghc4m > 0) {
                return true;
            }
        }
        return false;
    }

    public final void M9e7PWhFYLD2lOGMker(sTzYPOTbUD8EG1LT3B stzypotbud8eg1lt3b, int i, int i2) {
        while (true) {
            long j = M9e7PWhFYLD2lOGMker.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objV57tEvNfxZVVcOCAOih5PKr = stzypotbud8eg1lt3b.V57tEvNfxZVVcOCAOih5PKr();
                    while (true) {
                        if (objV57tEvNfxZVVcOCAOih5PKr == q1wNbhk2O6) {
                            i3 = -1;
                            break;
                        }
                        if (objV57tEvNfxZVVcOCAOih5PKr == null) {
                            i3 = 0;
                            break;
                        }
                        sTzYPOTbUD8EG1LT3B stzypotbud8eg1lt3b2 = (sTzYPOTbUD8EG1LT3B) objV57tEvNfxZVVcOCAOih5PKr;
                        int iZzpBGItXfub0yWj = stzypotbud8eg1lt3b2.zzpBGItXfub0yWj();
                        if (iZzpBGItXfub0yWj != 0) {
                            i3 = iZzpBGItXfub0yWj;
                            break;
                        }
                        objV57tEvNfxZVVcOCAOih5PKr = stzypotbud8eg1lt3b2.V57tEvNfxZVVcOCAOih5PKr();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (M9e7PWhFYLD2lOGMker.compareAndSet(this, j, ((long) i3) | j2)) {
                    return;
                }
            }
        }
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(Runnable runnable, psATg3LCCdmDIiRgW psatg3lccdmdiirgw, boolean z) {
        t8wLTr4ubNX0huCA8 fuqlp6r9cknhk;
        VC1L729WjrngBvQu vC1L729WjrngBvQu;
        TrXcUZLEn3kaSijyhUrmV5.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof t8wLTr4ubNX0huCA8) {
            fuqlp6r9cknhk = (t8wLTr4ubNX0huCA8) runnable;
            fuqlp6r9cknhk.V57tEvNfxZVVcOCAOih5PKr = jNanoTime;
            fuqlp6r9cknhk.ZfQNn8hdWlEQ5cR94249PDsLR = psatg3lccdmdiirgw;
        } else {
            fuqlp6r9cknhk = new fUqLP6r9ckNHK(runnable, jNanoTime, psatg3lccdmdiirgw);
        }
        boolean z2 = false;
        boolean z3 = fuqlp6r9cknhk.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = HzCpKshMOoaw76hFcbOVRYMeRd;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        sTzYPOTbUD8EG1LT3B stzypotbud8eg1lt3b = threadCurrentThread instanceof sTzYPOTbUD8EG1LT3B ? (sTzYPOTbUD8EG1LT3B) threadCurrentThread : null;
        if (stzypotbud8eg1lt3b == null || !ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(stzypotbud8eg1lt3b.M9e7PWhFYLD2lOGMker, this)) {
            stzypotbud8eg1lt3b = null;
        }
        if (stzypotbud8eg1lt3b != null && (vC1L729WjrngBvQu = stzypotbud8eg1lt3b.LaeGQIruHQu81hfJldjMOQSVblH3x) != VC1L729WjrngBvQu.ZLZeBXTMq0zDztBxtRTuCHrapQ && (fuqlp6r9cknhk.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m != 0 || vC1L729WjrngBvQu != VC1L729WjrngBvQu.ZfQNn8hdWlEQ5cR94249PDsLR)) {
            stzypotbud8eg1lt3b.GI83zq0G8e7zkn = true;
            FW3x5e9T3dYt fW3x5e9T3dYt = stzypotbud8eg1lt3b.V57tEvNfxZVVcOCAOih5PKr;
            if (z) {
                fuqlp6r9cknhk = fW3x5e9T3dYt.VxUQ9tBhpHJ2AAEDNW8sghc4m(fuqlp6r9cknhk);
            } else {
                fW3x5e9T3dYt.getClass();
                t8wLTr4ubNX0huCA8 t8wltr4ubnx0huca8 = (t8wLTr4ubNX0huCA8) FW3x5e9T3dYt.zzpBGItXfub0yWj.getAndSet(fW3x5e9T3dYt, fuqlp6r9cknhk);
                fuqlp6r9cknhk = t8wltr4ubnx0huca8 == null ? null : fW3x5e9T3dYt.VxUQ9tBhpHJ2AAEDNW8sghc4m(t8wltr4ubnx0huca8);
            }
        }
        if (fuqlp6r9cknhk != null) {
            if (!(fuqlp6r9cknhk.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m == 1 ? this.NSjgqmGjEzuugn2SsG1mZFP.VxUQ9tBhpHJ2AAEDNW8sghc4m(fuqlp6r9cknhk) : this.ZLZeBXTMq0zDztBxtRTuCHrapQ.VxUQ9tBhpHJ2AAEDNW8sghc4m(fuqlp6r9cknhk))) {
                throw new RejectedExecutionException(u9SlVAuoWhQUfJ.HzCpKshMOoaw76hFcbOVRYMeRd(new StringBuilder(), this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, " was terminated"));
            }
        }
        if (z && stzypotbud8eg1lt3b != null) {
            z2 = true;
        }
        if (z3) {
            if (z2 || q11o1hieEkZDhF1MGOZI26oZiDT() || KUYypEB4eNWOZWVDpH(jAddAndGet)) {
                return;
            }
            q11o1hieEkZDhF1MGOZI26oZiDT();
            return;
        }
        if (z2 || q11o1hieEkZDhF1MGOZI26oZiDT() || KUYypEB4eNWOZWVDpH(atomicLongFieldUpdater.get(this))) {
            return;
        }
        q11o1hieEkZDhF1MGOZI26oZiDT();
    }

    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        synchronized (this.GI83zq0G8e7zkn) {
            try {
                if (KUYypEB4eNWOZWVDpH.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = HzCpKshMOoaw76hFcbOVRYMeRd;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.V57tEvNfxZVVcOCAOih5PKr) {
                    return 0;
                }
                if (i >= this.ZfQNn8hdWlEQ5cR94249PDsLR) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.GI83zq0G8e7zkn.zzpBGItXfub0yWj(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                sTzYPOTbUD8EG1LT3B stzypotbud8eg1lt3b = new sTzYPOTbUD8EG1LT3B(this, i3);
                this.GI83zq0G8e7zkn.V57tEvNfxZVVcOCAOih5PKr(i3, stzypotbud8eg1lt3b);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                stzypotbud8eg1lt3b.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = com.vdodsodjsdt.TJ9aZ7994WmF5CLeDt5zNtk2DaKXW.KUYypEB4eNWOZWVDpH
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof com.vdodsodjsdt.sTzYPOTbUD8EG1LT3B
            r3 = 0
            if (r1 == 0) goto L17
            com.vdodsodjsdt.sTzYPOTbUD8EG1LT3B r0 = (com.vdodsodjsdt.sTzYPOTbUD8EG1LT3B) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            com.vdodsodjsdt.TJ9aZ7994WmF5CLeDt5zNtk2DaKXW r1 = r0.M9e7PWhFYLD2lOGMker
            boolean r1 = com.vdodsodjsdt.ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            com.vdodsodjsdt.Mw5vHRo4LaQY00jiXFZzZGjJzcG r1 = r8.GI83zq0G8e7zkn
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = com.vdodsodjsdt.TJ9aZ7994WmF5CLeDt5zNtk2DaKXW.HzCpKshMOoaw76hFcbOVRYMeRd     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            com.vdodsodjsdt.Mw5vHRo4LaQY00jiXFZzZGjJzcG r5 = r8.GI83zq0G8e7zkn
            java.lang.Object r5 = r5.zzpBGItXfub0yWj(r1)
            com.vdodsodjsdt.ej6unYlOWMDF.p59rPv72J9(r5)
            com.vdodsodjsdt.sTzYPOTbUD8EG1LT3B r5 = (com.vdodsodjsdt.sTzYPOTbUD8EG1LT3B) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            com.vdodsodjsdt.FW3x5e9T3dYt r5 = r5.V57tEvNfxZVVcOCAOih5PKr
            com.vdodsodjsdt.NXH9JR4ljoQH r6 = r8.NSjgqmGjEzuugn2SsG1mZFP
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = com.vdodsodjsdt.FW3x5e9T3dYt.zzpBGItXfub0yWj
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            com.vdodsodjsdt.t8wLTr4ubNX0huCA8 r7 = (com.vdodsodjsdt.t8wLTr4ubNX0huCA8) r7
            if (r7 == 0) goto L68
            r6.VxUQ9tBhpHJ2AAEDNW8sghc4m(r7)
        L68:
            com.vdodsodjsdt.t8wLTr4ubNX0huCA8 r7 = r5.zzpBGItXfub0yWj()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.VxUQ9tBhpHJ2AAEDNW8sghc4m(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            com.vdodsodjsdt.NXH9JR4ljoQH r1 = r8.NSjgqmGjEzuugn2SsG1mZFP
            r1.zzpBGItXfub0yWj()
            com.vdodsodjsdt.NXH9JR4ljoQH r1 = r8.ZLZeBXTMq0zDztBxtRTuCHrapQ
            r1.zzpBGItXfub0yWj()
        L82:
            if (r0 == 0) goto L8a
            com.vdodsodjsdt.t8wLTr4ubNX0huCA8 r1 = r0.VxUQ9tBhpHJ2AAEDNW8sghc4m(r2)
            if (r1 != 0) goto Lb2
        L8a:
            com.vdodsodjsdt.NXH9JR4ljoQH r1 = r8.ZLZeBXTMq0zDztBxtRTuCHrapQ
            java.lang.Object r1 = r1.ZfQNn8hdWlEQ5cR94249PDsLR()
            com.vdodsodjsdt.t8wLTr4ubNX0huCA8 r1 = (com.vdodsodjsdt.t8wLTr4ubNX0huCA8) r1
            if (r1 != 0) goto Lb2
            com.vdodsodjsdt.NXH9JR4ljoQH r1 = r8.NSjgqmGjEzuugn2SsG1mZFP
            java.lang.Object r1 = r1.ZfQNn8hdWlEQ5cR94249PDsLR()
            com.vdodsodjsdt.t8wLTr4ubNX0huCA8 r1 = (com.vdodsodjsdt.t8wLTr4ubNX0huCA8) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            com.vdodsodjsdt.VC1L729WjrngBvQu r1 = com.vdodsodjsdt.VC1L729WjrngBvQu.ZLZeBXTMq0zDztBxtRTuCHrapQ
            r0.NSjgqmGjEzuugn2SsG1mZFP(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = com.vdodsodjsdt.TJ9aZ7994WmF5CLeDt5zNtk2DaKXW.M9e7PWhFYLD2lOGMker
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = com.vdodsodjsdt.TJ9aZ7994WmF5CLeDt5zNtk2DaKXW.HzCpKshMOoaw76hFcbOVRYMeRd
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.TJ9aZ7994WmF5CLeDt5zNtk2DaKXW.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        LaeGQIruHQu81hfJldjMOQSVblH3x(this, runnable, 6);
    }

    public final boolean q11o1hieEkZDhF1MGOZI26oZiDT() {
        aqhhl68tQrgIjcMGB3dY2YLK3vN aqhhl68tqrgijcmgb3dy2ylk3vn;
        int iZzpBGItXfub0yWj;
        while (true) {
            long j = M9e7PWhFYLD2lOGMker.get(this);
            sTzYPOTbUD8EG1LT3B stzypotbud8eg1lt3b = (sTzYPOTbUD8EG1LT3B) this.GI83zq0G8e7zkn.zzpBGItXfub0yWj((int) (2097151 & j));
            if (stzypotbud8eg1lt3b == null) {
                stzypotbud8eg1lt3b = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objV57tEvNfxZVVcOCAOih5PKr = stzypotbud8eg1lt3b.V57tEvNfxZVVcOCAOih5PKr();
                while (true) {
                    aqhhl68tqrgijcmgb3dy2ylk3vn = q1wNbhk2O6;
                    if (objV57tEvNfxZVVcOCAOih5PKr == aqhhl68tqrgijcmgb3dy2ylk3vn) {
                        iZzpBGItXfub0yWj = -1;
                        break;
                    }
                    if (objV57tEvNfxZVVcOCAOih5PKr == null) {
                        iZzpBGItXfub0yWj = 0;
                        break;
                    }
                    sTzYPOTbUD8EG1LT3B stzypotbud8eg1lt3b2 = (sTzYPOTbUD8EG1LT3B) objV57tEvNfxZVVcOCAOih5PKr;
                    iZzpBGItXfub0yWj = stzypotbud8eg1lt3b2.zzpBGItXfub0yWj();
                    if (iZzpBGItXfub0yWj != 0) {
                        break;
                    }
                    objV57tEvNfxZVVcOCAOih5PKr = stzypotbud8eg1lt3b2.V57tEvNfxZVVcOCAOih5PKr();
                }
                if (iZzpBGItXfub0yWj >= 0) {
                    if (M9e7PWhFYLD2lOGMker.compareAndSet(this, j, ((long) iZzpBGItXfub0yWj) | j2)) {
                        stzypotbud8eg1lt3b.ZLZeBXTMq0zDztBxtRTuCHrapQ(aqhhl68tqrgijcmgb3dy2ylk3vn);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (stzypotbud8eg1lt3b == null) {
                return false;
            }
            if (sTzYPOTbUD8EG1LT3B.HzCpKshMOoaw76hFcbOVRYMeRd.compareAndSet(stzypotbud8eg1lt3b, -1, 0)) {
                LockSupport.unpark(stzypotbud8eg1lt3b);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Mw5vHRo4LaQY00jiXFZzZGjJzcG mw5vHRo4LaQY00jiXFZzZGjJzcG = this.GI83zq0G8e7zkn;
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = mw5vHRo4LaQY00jiXFZzZGjJzcG.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iVxUQ9tBhpHJ2AAEDNW8sghc4m; i6++) {
            sTzYPOTbUD8EG1LT3B stzypotbud8eg1lt3b = (sTzYPOTbUD8EG1LT3B) mw5vHRo4LaQY00jiXFZzZGjJzcG.zzpBGItXfub0yWj(i6);
            if (stzypotbud8eg1lt3b != null) {
                FW3x5e9T3dYt fW3x5e9T3dYt = stzypotbud8eg1lt3b.V57tEvNfxZVVcOCAOih5PKr;
                fW3x5e9T3dYt.getClass();
                int i7 = FW3x5e9T3dYt.zzpBGItXfub0yWj.get(fW3x5e9T3dYt) != null ? (FW3x5e9T3dYt.V57tEvNfxZVVcOCAOih5PKr.get(fW3x5e9T3dYt) - FW3x5e9T3dYt.ZfQNn8hdWlEQ5cR94249PDsLR.get(fW3x5e9T3dYt)) + 1 : FW3x5e9T3dYt.V57tEvNfxZVVcOCAOih5PKr.get(fW3x5e9T3dYt) - FW3x5e9T3dYt.ZfQNn8hdWlEQ5cR94249PDsLR.get(fW3x5e9T3dYt);
                int iOrdinal = stzypotbud8eg1lt3b.LaeGQIruHQu81hfJldjMOQSVblH3x.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (iOrdinal == 4) {
                    i5++;
                }
            }
        }
        long j = HzCpKshMOoaw76hFcbOVRYMeRd.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        sb4.append('@');
        sb4.append(hRrPPME7ytOB7ba.KUYypEB4eNWOZWVDpH(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.V57tEvNfxZVVcOCAOih5PKr;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.ZfQNn8hdWlEQ5cR94249PDsLR);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.ZLZeBXTMq0zDztBxtRTuCHrapQ.V57tEvNfxZVVcOCAOih5PKr());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.NSjgqmGjEzuugn2SsG1mZFP.V57tEvNfxZVVcOCAOih5PKr());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
