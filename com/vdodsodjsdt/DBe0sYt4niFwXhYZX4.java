package com.vdodsodjsdt;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class DBe0sYt4niFwXhYZX4 extends baaN71QMl7e implements Runnable {
    public static final DBe0sYt4niFwXhYZX4 KUYypEB4eNWOZWVDpH;
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final long q1wNbhk2O6;

    static {
        Long l;
        DBe0sYt4niFwXhYZX4 dBe0sYt4niFwXhYZX4 = new DBe0sYt4niFwXhYZX4();
        KUYypEB4eNWOZWVDpH = dBe0sYt4niFwXhYZX4;
        dBe0sYt4niFwXhYZX4.y1NaPKTl7R18DOr6e8i5(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        q1wNbhk2O6 = timeUnit.toNanos(l.longValue());
    }

    @Override // com.vdodsodjsdt.CwickyU0ZjEG0JwJwvvsOp0vRH0PB
    public final Thread HVEwbdULInpTNa0IG() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(DBe0sYt4niFwXhYZX4.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // com.vdodsodjsdt.CwickyU0ZjEG0JwJwvvsOp0vRH0PB
    public final void TqcnImqkSWIKht(long j, ErBfq9NXKMau0dmIu8LfNce2kOtT erBfq9NXKMau0dmIu8LfNce2kOtT) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // com.vdodsodjsdt.baaN71QMl7e
    public final void d9zDyyznnp3oaDT1Ug(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.d9zDyyznnp3oaDT1Ug(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zYmT6yQrus3w;
        bxg58FPVmiJdXQNjZxsZ.VxUQ9tBhpHJ2AAEDNW8sghc4m.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zYmT6yQrus3w) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jQygqjTppWwx992 = qygqjTppWwx992();
                    if (jQygqjTppWwx992 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = q1wNbhk2O6 + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            wRCD0SdqWCowdYU7bmzN();
                            if (ymT6yQrus3w()) {
                                return;
                            }
                            HVEwbdULInpTNa0IG();
                            return;
                        }
                        if (jQygqjTppWwx992 > j2) {
                            jQygqjTppWwx992 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jQygqjTppWwx992 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            wRCD0SdqWCowdYU7bmzN();
                            if (ymT6yQrus3w()) {
                                return;
                            }
                            HVEwbdULInpTNa0IG();
                            return;
                        }
                        LockSupport.parkNanos(this, jQygqjTppWwx992);
                    }
                }
            }
        } finally {
            _thread = null;
            wRCD0SdqWCowdYU7bmzN();
            if (!ymT6yQrus3w()) {
                HVEwbdULInpTNa0IG();
            }
        }
    }

    @Override // com.vdodsodjsdt.baaN71QMl7e, com.vdodsodjsdt.CwickyU0ZjEG0JwJwvvsOp0vRH0PB
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void wRCD0SdqWCowdYU7bmzN() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            baaN71QMl7e.GI83zq0G8e7zkn.set(this, null);
            baaN71QMl7e.M9e7PWhFYLD2lOGMker.set(this, null);
            notifyAll();
        }
    }
}
