package com.vdodsodjsdt;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class sTzYPOTbUD8EG1LT3B extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater HzCpKshMOoaw76hFcbOVRYMeRd = AtomicIntegerFieldUpdater.newUpdater(sTzYPOTbUD8EG1LT3B.class, "workerCtl$volatile");
    public boolean GI83zq0G8e7zkn;
    public VC1L729WjrngBvQu LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ TJ9aZ7994WmF5CLeDt5zNtk2DaKXW M9e7PWhFYLD2lOGMker;
    public int NSjgqmGjEzuugn2SsG1mZFP;
    public final FW3x5e9T3dYt V57tEvNfxZVVcOCAOih5PKr;
    public long ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final coWWo2PO13fOPO ZfQNn8hdWlEQ5cR94249PDsLR;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;
    public long zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public sTzYPOTbUD8EG1LT3B(TJ9aZ7994WmF5CLeDt5zNtk2DaKXW tJ9aZ7994WmF5CLeDt5zNtk2DaKXW, int i) {
        this.M9e7PWhFYLD2lOGMker = tJ9aZ7994WmF5CLeDt5zNtk2DaKXW;
        setDaemon(true);
        setContextClassLoader(TJ9aZ7994WmF5CLeDt5zNtk2DaKXW.class.getClassLoader());
        this.V57tEvNfxZVVcOCAOih5PKr = new FW3x5e9T3dYt();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new coWWo2PO13fOPO();
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = VC1L729WjrngBvQu.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        this.nextParkedWorker = TJ9aZ7994WmF5CLeDt5zNtk2DaKXW.q1wNbhk2O6;
        int iNanoTime = (int) System.nanoTime();
        this.NSjgqmGjEzuugn2SsG1mZFP = iNanoTime == 0 ? 42 : iNanoTime;
        zIvmSL0wzmmKGc3X39b2Gw2mUGE(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a1, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.vdodsodjsdt.t8wLTr4ubNX0huCA8 GI83zq0G8e7zkn(int r26) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.sTzYPOTbUD8EG1LT3B.GI83zq0G8e7zkn(int):com.vdodsodjsdt.t8wLTr4ubNX0huCA8");
    }

    public final t8wLTr4ubNX0huCA8 LaeGQIruHQu81hfJldjMOQSVblH3x() {
        int iZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR(2);
        TJ9aZ7994WmF5CLeDt5zNtk2DaKXW tJ9aZ7994WmF5CLeDt5zNtk2DaKXW = this.M9e7PWhFYLD2lOGMker;
        if (iZfQNn8hdWlEQ5cR94249PDsLR == 0) {
            t8wLTr4ubNX0huCA8 t8wltr4ubnx0huca8 = (t8wLTr4ubNX0huCA8) tJ9aZ7994WmF5CLeDt5zNtk2DaKXW.ZLZeBXTMq0zDztBxtRTuCHrapQ.ZfQNn8hdWlEQ5cR94249PDsLR();
            return t8wltr4ubnx0huca8 != null ? t8wltr4ubnx0huca8 : (t8wLTr4ubNX0huCA8) tJ9aZ7994WmF5CLeDt5zNtk2DaKXW.NSjgqmGjEzuugn2SsG1mZFP.ZfQNn8hdWlEQ5cR94249PDsLR();
        }
        t8wLTr4ubNX0huCA8 t8wltr4ubnx0huca82 = (t8wLTr4ubNX0huCA8) tJ9aZ7994WmF5CLeDt5zNtk2DaKXW.NSjgqmGjEzuugn2SsG1mZFP.ZfQNn8hdWlEQ5cR94249PDsLR();
        return t8wltr4ubnx0huca82 != null ? t8wltr4ubnx0huca82 : (t8wLTr4ubNX0huCA8) tJ9aZ7994WmF5CLeDt5zNtk2DaKXW.ZLZeBXTMq0zDztBxtRTuCHrapQ.ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    public final boolean NSjgqmGjEzuugn2SsG1mZFP(VC1L729WjrngBvQu vC1L729WjrngBvQu) {
        VC1L729WjrngBvQu vC1L729WjrngBvQu2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        boolean z = vC1L729WjrngBvQu2 == VC1L729WjrngBvQu.V57tEvNfxZVVcOCAOih5PKr;
        if (z) {
            TJ9aZ7994WmF5CLeDt5zNtk2DaKXW.HzCpKshMOoaw76hFcbOVRYMeRd.addAndGet(this.M9e7PWhFYLD2lOGMker, 4398046511104L);
        }
        if (vC1L729WjrngBvQu2 != vC1L729WjrngBvQu) {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = vC1L729WjrngBvQu;
        }
        return z;
    }

    public final Object V57tEvNfxZVVcOCAOih5PKr() {
        return this.nextParkedWorker;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r12 = com.vdodsodjsdt.FW3x5e9T3dYt.ZfQNn8hdWlEQ5cR94249PDsLR.get(r9);
        r0 = com.vdodsodjsdt.FW3x5e9T3dYt.V57tEvNfxZVVcOCAOih5PKr.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r12 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (com.vdodsodjsdt.FW3x5e9T3dYt.LaeGQIruHQu81hfJldjMOQSVblH3x.get(r9) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r0 = r0 - 1;
        r1 = r9.V57tEvNfxZVVcOCAOih5PKr(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r7 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.vdodsodjsdt.t8wLTr4ubNX0huCA8 VxUQ9tBhpHJ2AAEDNW8sghc4m(boolean r12) {
        /*
            r11 = this;
            com.vdodsodjsdt.VC1L729WjrngBvQu r0 = r11.LaeGQIruHQu81hfJldjMOQSVblH3x
            com.vdodsodjsdt.TJ9aZ7994WmF5CLeDt5zNtk2DaKXW r2 = r11.M9e7PWhFYLD2lOGMker
            r7 = 0
            r8 = 1
            com.vdodsodjsdt.FW3x5e9T3dYt r9 = r11.V57tEvNfxZVVcOCAOih5PKr
            com.vdodsodjsdt.VC1L729WjrngBvQu r10 = com.vdodsodjsdt.VC1L729WjrngBvQu.V57tEvNfxZVVcOCAOih5PKr
            if (r0 != r10) goto Le
            goto L86
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = com.vdodsodjsdt.TJ9aZ7994WmF5CLeDt5zNtk2DaKXW.HzCpKshMOoaw76hFcbOVRYMeRd
        L10:
            long r3 = r0.get(r2)
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r3
            r1 = 42
            long r5 = r5 >> r1
            int r1 = (int) r5
            if (r1 != 0) goto L75
            r9.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = com.vdodsodjsdt.FW3x5e9T3dYt.zzpBGItXfub0yWj
            java.lang.Object r0 = r12.get(r9)
            com.vdodsodjsdt.t8wLTr4ubNX0huCA8 r0 = (com.vdodsodjsdt.t8wLTr4ubNX0huCA8) r0
            if (r0 != 0) goto L2e
            goto L43
        L2e:
            com.vdodsodjsdt.psATg3LCCdmDIiRgW r1 = r0.ZfQNn8hdWlEQ5cR94249PDsLR
            int r1 = r1.VxUQ9tBhpHJ2AAEDNW8sghc4m
            if (r1 != r8) goto L43
        L34:
            boolean r1 = r12.compareAndSet(r9, r0, r7)
            if (r1 == 0) goto L3c
            r7 = r0
            goto L63
        L3c:
            java.lang.Object r1 = r12.get(r9)
            if (r1 == r0) goto L34
            goto L23
        L43:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = com.vdodsodjsdt.FW3x5e9T3dYt.ZfQNn8hdWlEQ5cR94249PDsLR
            int r12 = r12.get(r9)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = com.vdodsodjsdt.FW3x5e9T3dYt.V57tEvNfxZVVcOCAOih5PKr
            int r0 = r0.get(r9)
        L4f:
            if (r12 == r0) goto L63
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = com.vdodsodjsdt.FW3x5e9T3dYt.LaeGQIruHQu81hfJldjMOQSVblH3x
            int r1 = r1.get(r9)
            if (r1 != 0) goto L5a
            goto L63
        L5a:
            int r0 = r0 + (-1)
            com.vdodsodjsdt.t8wLTr4ubNX0huCA8 r1 = r9.V57tEvNfxZVVcOCAOih5PKr(r0, r8)
            if (r1 == 0) goto L4f
            r7 = r1
        L63:
            if (r7 != 0) goto L74
            com.vdodsodjsdt.NXH9JR4ljoQH r12 = r2.NSjgqmGjEzuugn2SsG1mZFP
            java.lang.Object r12 = r12.ZfQNn8hdWlEQ5cR94249PDsLR()
            com.vdodsodjsdt.t8wLTr4ubNX0huCA8 r12 = (com.vdodsodjsdt.t8wLTr4ubNX0huCA8) r12
            if (r12 != 0) goto L73
            com.vdodsodjsdt.t8wLTr4ubNX0huCA8 r12 = r11.GI83zq0G8e7zkn(r8)
        L73:
            return r12
        L74:
            return r7
        L75:
            r5 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r5 = r3 - r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = com.vdodsodjsdt.TJ9aZ7994WmF5CLeDt5zNtk2DaKXW.HzCpKshMOoaw76hFcbOVRYMeRd
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L10
            r11.LaeGQIruHQu81hfJldjMOQSVblH3x = r10
        L86:
            if (r12 == 0) goto Lba
            int r12 = r2.V57tEvNfxZVVcOCAOih5PKr
            int r12 = r12 * 2
            int r12 = r11.ZfQNn8hdWlEQ5cR94249PDsLR(r12)
            if (r12 != 0) goto L93
            goto L94
        L93:
            r8 = 0
        L94:
            if (r8 == 0) goto L9d
            com.vdodsodjsdt.t8wLTr4ubNX0huCA8 r12 = r11.LaeGQIruHQu81hfJldjMOQSVblH3x()
            if (r12 == 0) goto L9d
            return r12
        L9d:
            r9.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = com.vdodsodjsdt.FW3x5e9T3dYt.zzpBGItXfub0yWj
            java.lang.Object r12 = r12.getAndSet(r9, r7)
            com.vdodsodjsdt.t8wLTr4ubNX0huCA8 r12 = (com.vdodsodjsdt.t8wLTr4ubNX0huCA8) r12
            if (r12 != 0) goto Lae
            com.vdodsodjsdt.t8wLTr4ubNX0huCA8 r12 = r9.zzpBGItXfub0yWj()
        Lae:
            if (r12 == 0) goto Lb1
            return r12
        Lb1:
            if (r8 != 0) goto Lc1
            com.vdodsodjsdt.t8wLTr4ubNX0huCA8 r12 = r11.LaeGQIruHQu81hfJldjMOQSVblH3x()
            if (r12 == 0) goto Lc1
            return r12
        Lba:
            com.vdodsodjsdt.t8wLTr4ubNX0huCA8 r12 = r11.LaeGQIruHQu81hfJldjMOQSVblH3x()
            if (r12 == 0) goto Lc1
            return r12
        Lc1:
            r12 = 3
            com.vdodsodjsdt.t8wLTr4ubNX0huCA8 r12 = r11.GI83zq0G8e7zkn(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.sTzYPOTbUD8EG1LT3B.VxUQ9tBhpHJ2AAEDNW8sghc4m(boolean):com.vdodsodjsdt.t8wLTr4ubNX0huCA8");
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final int ZfQNn8hdWlEQ5cR94249PDsLR(int i) {
        int i2 = this.NSjgqmGjEzuugn2SsG1mZFP;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.NSjgqmGjEzuugn2SsG1mZFP = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.sTzYPOTbUD8EG1LT3B.run():void");
    }

    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.M9e7PWhFYLD2lOGMker.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final int zzpBGItXfub0yWj() {
        return this.indexInArray;
    }
}
