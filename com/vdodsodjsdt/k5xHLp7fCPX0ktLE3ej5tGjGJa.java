package com.vdodsodjsdt;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class k5xHLp7fCPX0ktLE3ej5tGjGJa implements RsZYdPZzPnvxFX2Iwr2ecGA {
    public final WeakReference V57tEvNfxZVVcOCAOih5PKr;
    public final nnQ69x5lIMfKNCc3neN ZfQNn8hdWlEQ5cR94249PDsLR = new nnQ69x5lIMfKNCc3neN(this);

    public k5xHLp7fCPX0ktLE3ej5tGjGJa(VhYG3Kn7PElrnIYowGX3UR vhYG3Kn7PElrnIYowGX3UR) {
        this.V57tEvNfxZVVcOCAOih5PKr = new WeakReference(vhYG3Kn7PElrnIYowGX3UR);
    }

    @Override // com.vdodsodjsdt.RsZYdPZzPnvxFX2Iwr2ecGA
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(Runnable runnable, Executor executor) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        VhYG3Kn7PElrnIYowGX3UR vhYG3Kn7PElrnIYowGX3UR = (VhYG3Kn7PElrnIYowGX3UR) this.V57tEvNfxZVVcOCAOih5PKr.get();
        boolean zCancel = this.ZfQNn8hdWlEQ5cR94249PDsLR.cancel(z);
        if (zCancel && vhYG3Kn7PElrnIYowGX3UR != null) {
            vhYG3Kn7PElrnIYowGX3UR.VxUQ9tBhpHJ2AAEDNW8sghc4m = null;
            vhYG3Kn7PElrnIYowGX3UR.zzpBGItXfub0yWj = null;
            vhYG3Kn7PElrnIYowGX3UR.V57tEvNfxZVVcOCAOih5PKr.M9e7PWhFYLD2lOGMker(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr instanceof sFL9PivMTCLItVt5L;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.isDone();
    }

    public final String toString() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.get(j, timeUnit);
    }
}
