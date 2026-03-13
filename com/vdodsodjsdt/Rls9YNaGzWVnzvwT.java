package com.vdodsodjsdt;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class Rls9YNaGzWVnzvwT {
    public static final ajUGiGTHZ5remakrqL ZfQNn8hdWlEQ5cR94249PDsLR = new ajUGiGTHZ5remakrqL();
    public long V57tEvNfxZVVcOCAOih5PKr;
    public boolean VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public long zzpBGItXfub0yWj;

    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public long V57tEvNfxZVVcOCAOih5PKr() {
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            return this.zzpBGItXfub0yWj;
        }
        throw new IllegalStateException("No deadline");
    }

    public Rls9YNaGzWVnzvwT VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = false;
        return this;
    }

    public Rls9YNaGzWVnzvwT ZLZeBXTMq0zDztBxtRTuCHrapQ(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ej6unYlOWMDF.pYmKDYlAmhudp(timeUnit, "unit");
        if (j >= 0) {
            this.V57tEvNfxZVVcOCAOih5PKr = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }

    public Rls9YNaGzWVnzvwT ZfQNn8hdWlEQ5cR94249PDsLR(long j) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = true;
        this.zzpBGItXfub0yWj = j;
        return this;
    }

    public void zIvmSL0wzmmKGc3X39b2Gw2mUGE() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m && this.zzpBGItXfub0yWj - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public Rls9YNaGzWVnzvwT zzpBGItXfub0yWj() {
        this.V57tEvNfxZVVcOCAOih5PKr = 0L;
        return this;
    }
}
