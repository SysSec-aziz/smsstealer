package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class u4CfLdq2jiPhh8u implements Runnable {
    public final duIQm3EoNDnZlp6v5euh4x2sg V57tEvNfxZVVcOCAOih5PKr;
    public final AhgUxI6t6E ZfQNn8hdWlEQ5cR94249PDsLR;

    public u4CfLdq2jiPhh8u(duIQm3EoNDnZlp6v5euh4x2sg duiqm3eondnzlp6v5euh4x2sg, AhgUxI6t6E ahgUxI6t6E) {
        this.V57tEvNfxZVVcOCAOih5PKr = duiqm3eondnzlp6v5euh4x2sg;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = ahgUxI6t6E;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.V57tEvNfxZVVcOCAOih5PKr.ZfQNn8hdWlEQ5cR94249PDsLR) {
            try {
                if (((u4CfLdq2jiPhh8u) this.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj.remove(this.ZfQNn8hdWlEQ5cR94249PDsLR)) != null) {
                    D6FjfK6EYPutkH5 d6FjfK6EYPutkH5 = (D6FjfK6EYPutkH5) this.V57tEvNfxZVVcOCAOih5PKr.V57tEvNfxZVVcOCAOih5PKr.remove(this.ZfQNn8hdWlEQ5cR94249PDsLR);
                    if (d6FjfK6EYPutkH5 != null) {
                        AhgUxI6t6E ahgUxI6t6E = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                        mZqjyFvdQeHqw3rquKUibxmksQv mzqjyfvdqehqw3rqukuibxmksqv = (mZqjyFvdQeHqw3rquKUibxmksQv) d6FjfK6EYPutkH5;
                        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(mZqjyFvdQeHqw3rquKUibxmksQv.pYmKDYlAmhudp, "Exceeded time limits on execution for " + ahgUxI6t6E);
                        mzqjyfvdqehqw3rqukuibxmksqv.M9e7PWhFYLD2lOGMker.execute(new g9RrphS8p8FkeTRpnKkKJmWqi2lQ(mzqjyfvdqehqw3rqukuibxmksqv, 0));
                    }
                } else {
                    psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m("WrkTimerRunnable", "Timer with " + this.ZfQNn8hdWlEQ5cR94249PDsLR + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
