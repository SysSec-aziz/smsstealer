package com.vdodsodjsdt;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class lJlNvDyl5huSZi3 implements ThreadFactory {
    public final AtomicInteger VxUQ9tBhpHJ2AAEDNW8sghc4m = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getAndIncrement());
        return thread;
    }
}
