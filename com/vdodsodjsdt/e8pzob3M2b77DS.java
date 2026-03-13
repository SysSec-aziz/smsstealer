package com.vdodsodjsdt;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class e8pzob3M2b77DS implements ThreadFactory {
    public final AtomicInteger VxUQ9tBhpHJ2AAEDNW8sghc4m = new AtomicInteger(0);
    public final /* synthetic */ boolean zzpBGItXfub0yWj;

    public e8pzob3M2b77DS(boolean z) {
        this.zzpBGItXfub0yWj = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        ej6unYlOWMDF.pYmKDYlAmhudp(runnable, "runnable");
        return new Thread(runnable, (this.zzpBGItXfub0yWj ? "WM.task-" : "androidx.work-") + this.VxUQ9tBhpHJ2AAEDNW8sghc4m.incrementAndGet());
    }
}
