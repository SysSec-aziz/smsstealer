package com.vdodsodjsdt;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class LNbLc7UMz3g5KbIBk implements Executor {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final Object ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ LNbLc7UMz3g5KbIBk(int i, Object obj) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                Handler handler = (Handler) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                ((Handler) ((nMRZPpfLCgJyuB) this.ZfQNn8hdWlEQ5cR94249PDsLR).LaeGQIruHQu81hfJldjMOQSVblH3x).post(runnable);
                return;
        }
    }
}
