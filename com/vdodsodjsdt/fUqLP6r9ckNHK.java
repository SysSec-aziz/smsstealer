package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class fUqLP6r9ckNHK extends t8wLTr4ubNX0huCA8 {
    public final Runnable LaeGQIruHQu81hfJldjMOQSVblH3x;

    public fUqLP6r9ckNHK(Runnable runnable, long j, psATg3LCCdmDIiRgW psatg3lccdmdiirgw) {
        super(j, psatg3lccdmdiirgw);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x.run();
        } finally {
            this.ZfQNn8hdWlEQ5cR94249PDsLR.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(hRrPPME7ytOB7ba.KUYypEB4eNWOZWVDpH(runnable));
        sb.append(", ");
        sb.append(this.V57tEvNfxZVVcOCAOih5PKr);
        sb.append(", ");
        sb.append(this.ZfQNn8hdWlEQ5cR94249PDsLR);
        sb.append(']');
        return sb.toString();
    }
}
