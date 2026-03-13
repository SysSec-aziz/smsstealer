package com.vdodsodjsdt;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class MpsgFCfSVNxgvcBlEbc8Iuyh3Obq {
    public final ArrayList LaeGQIruHQu81hfJldjMOQSVblH3x;
    public boolean V57tEvNfxZVVcOCAOih5PKr;
    public final j5jyRGaw4k VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public eb3lIx1g1S4TGeJI46hOG7Bd ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final String zzpBGItXfub0yWj;

    public MpsgFCfSVNxgvcBlEbc8Iuyh3Obq(j5jyRGaw4k j5jyrgaw4k, String str) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "name");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = j5jyrgaw4k;
        this.zzpBGItXfub0yWj = str;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new ArrayList();
    }

    public static void zzpBGItXfub0yWj(MpsgFCfSVNxgvcBlEbc8Iuyh3Obq mpsgFCfSVNxgvcBlEbc8Iuyh3Obq, String str, EfIvTei3Q8wBNpyLTZJevpFxej efIvTei3Q8wBNpyLTZJevpFxej) {
        mpsgFCfSVNxgvcBlEbc8Iuyh3Obq.getClass();
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "name");
        ej6unYlOWMDF.pYmKDYlAmhudp(efIvTei3Q8wBNpyLTZJevpFxej, "block");
        mpsgFCfSVNxgvcBlEbc8Iuyh3Obq.V57tEvNfxZVVcOCAOih5PKr(new QbIJ0GcFe0IcL9iGGOMxSl(str, efIvTei3Q8wBNpyLTZJevpFxej), 0L);
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        j5jyRGaw4k j5jyrgaw4k = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        TimeZone timeZone = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        synchronized (j5jyrgaw4k) {
            this.V57tEvNfxZVVcOCAOih5PKr = true;
            if (VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr(this);
            }
        }
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(eb3lIx1g1S4TGeJI46hOG7Bd eb3lix1g1s4tgeji46hog7bd, long j) {
        ej6unYlOWMDF.pYmKDYlAmhudp(eb3lix1g1s4tgeji46hog7bd, "task");
        synchronized (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            if (!this.V57tEvNfxZVVcOCAOih5PKr) {
                if (ZfQNn8hdWlEQ5cR94249PDsLR(eb3lix1g1s4tgeji46hog7bd, j, false)) {
                    this.VxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr(this);
                }
            } else if (eb3lix1g1s4tgeji46hog7bd.zzpBGItXfub0yWj) {
                Logger logger = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj;
                if (logger.isLoggable(Level.FINE)) {
                    ej6unYlOWMDF.zIvmSL0wzmmKGc3X39b2Gw2mUGE(logger, eb3lix1g1s4tgeji46hog7bd, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj;
                if (logger2.isLoggable(Level.FINE)) {
                    ej6unYlOWMDF.zIvmSL0wzmmKGc3X39b2Gw2mUGE(logger2, eb3lix1g1s4tgeji46hog7bd, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        eb3lIx1g1S4TGeJI46hOG7Bd eb3lix1g1s4tgeji46hog7bd = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (eb3lix1g1s4tgeji46hog7bd != null && eb3lix1g1s4tgeji46hog7bd.zzpBGItXfub0yWj) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
        }
        ArrayList arrayList = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((eb3lIx1g1S4TGeJI46hOG7Bd) arrayList.get(size)).zzpBGItXfub0yWj) {
                Logger logger = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj;
                eb3lIx1g1S4TGeJI46hOG7Bd eb3lix1g1s4tgeji46hog7bd2 = (eb3lIx1g1S4TGeJI46hOG7Bd) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    ej6unYlOWMDF.zIvmSL0wzmmKGc3X39b2Gw2mUGE(logger, eb3lix1g1s4tgeji46hog7bd2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR(com.vdodsodjsdt.eb3lIx1g1S4TGeJI46hOG7Bd r12, long r13, boolean r15) {
        /*
            r11 = this;
            com.vdodsodjsdt.j5jyRGaw4k r0 = r11.VxUQ9tBhpHJ2AAEDNW8sghc4m
            java.util.logging.Logger r0 = r0.zzpBGItXfub0yWj
            java.lang.String r1 = "task"
            com.vdodsodjsdt.ej6unYlOWMDF.pYmKDYlAmhudp(r12, r1)
            com.vdodsodjsdt.MpsgFCfSVNxgvcBlEbc8Iuyh3Obq r1 = r12.V57tEvNfxZVVcOCAOih5PKr
            if (r1 != r11) goto Le
            goto L12
        Le:
            if (r1 != 0) goto L89
            r12.V57tEvNfxZVVcOCAOih5PKr = r11
        L12:
            long r1 = java.lang.System.nanoTime()
            long r3 = r1 + r13
            java.util.ArrayList r5 = r11.LaeGQIruHQu81hfJldjMOQSVblH3x
            int r6 = r5.indexOf(r12)
            r7 = -1
            r8 = 0
            if (r6 == r7) goto L39
            long r9 = r12.ZfQNn8hdWlEQ5cR94249PDsLR
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L36
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r13 = r0.isLoggable(r13)
            if (r13 == 0) goto L88
            java.lang.String r13 = "already scheduled"
            com.vdodsodjsdt.ej6unYlOWMDF.zIvmSL0wzmmKGc3X39b2Gw2mUGE(r0, r12, r11, r13)
            return r8
        L36:
            r5.remove(r6)
        L39:
            r12.ZfQNn8hdWlEQ5cR94249PDsLR = r3
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            boolean r6 = r0.isLoggable(r6)
            if (r6 == 0) goto L5f
            if (r15 == 0) goto L51
            long r3 = r3 - r1
            java.lang.String r15 = com.vdodsodjsdt.ej6unYlOWMDF.q11o1hieEkZDhF1MGOZI26oZiDT(r3)
            java.lang.String r3 = "run again after "
            java.lang.String r15 = r3.concat(r15)
            goto L5c
        L51:
            long r3 = r3 - r1
            java.lang.String r15 = com.vdodsodjsdt.ej6unYlOWMDF.q11o1hieEkZDhF1MGOZI26oZiDT(r3)
            java.lang.String r3 = "scheduled after "
            java.lang.String r15 = r3.concat(r15)
        L5c:
            com.vdodsodjsdt.ej6unYlOWMDF.zIvmSL0wzmmKGc3X39b2Gw2mUGE(r0, r12, r11, r15)
        L5f:
            int r15 = r5.size()
            r0 = r8
            r3 = r0
        L65:
            if (r3 >= r15) goto L7a
            java.lang.Object r4 = r5.get(r3)
            int r3 = r3 + 1
            com.vdodsodjsdt.eb3lIx1g1S4TGeJI46hOG7Bd r4 = (com.vdodsodjsdt.eb3lIx1g1S4TGeJI46hOG7Bd) r4
            long r9 = r4.ZfQNn8hdWlEQ5cR94249PDsLR
            long r9 = r9 - r1
            int r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r4 <= 0) goto L77
            goto L7b
        L77:
            int r0 = r0 + 1
            goto L65
        L7a:
            r0 = r7
        L7b:
            if (r0 != r7) goto L81
            int r0 = r5.size()
        L81:
            r5.add(r0, r12)
            if (r0 != 0) goto L88
            r12 = 1
            return r12
        L88:
            return r8
        L89:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "task is in multiple queues"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.MpsgFCfSVNxgvcBlEbc8Iuyh3Obq.ZfQNn8hdWlEQ5cR94249PDsLR(com.vdodsodjsdt.eb3lIx1g1S4TGeJI46hOG7Bd, long, boolean):boolean");
    }

    public final String toString() {
        return this.zzpBGItXfub0yWj;
    }
}
