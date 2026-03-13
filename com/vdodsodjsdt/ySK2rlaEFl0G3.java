package com.vdodsodjsdt;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ySK2rlaEFl0G3 implements ThreadFactory {
    public final /* synthetic */ String VxUQ9tBhpHJ2AAEDNW8sghc4m;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        thread.setPriority(10);
        return thread;
    }
}
