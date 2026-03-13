package com.vdodsodjsdt;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class LWcyhQFsn8EAAdNGJ extends cY8zPHnUdezl implements w1TUuqPealEllpif2 {
    public final Executor LaeGQIruHQu81hfJldjMOQSVblH3x;

    public LWcyhQFsn8EAAdNGJ(Executor executor) {
        Method method;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = executor;
        Method method2 = wm7yfoz7I91cOUfAa0PJhzMP838l.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = wm7yfoz7I91cOUfAa0PJhzMP838l.VxUQ9tBhpHJ2AAEDNW8sghc4m) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.vdodsodjsdt.w1TUuqPealEllpif2
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(long j, YAf4BMDpiCAb4hYaN6VqW yAf4BMDpiCAb4hYaN6VqW) {
        Executor executor = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            gZVesoHrfMaGvAvfBsRIr gzvesohrfmagvavfbsrir = new gZVesoHrfMaGvAvfBsRIr(this, yAf4BMDpiCAb4hYaN6VqW, 10, false);
            D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW = yAf4BMDpiCAb4hYaN6VqW.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(gzvesohrfmagvavfbsrir, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                hRrPPME7ytOB7ba.V57tEvNfxZVVcOCAOih5PKr(d73WsmU258PapcWZb45SFW, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            yAf4BMDpiCAb4hYaN6VqW.q11o1hieEkZDhF1MGOZI26oZiDT(new xPJD6zCXsU5TwlX(0, scheduledFutureSchedule));
        } else {
            DBe0sYt4niFwXhYZX4.KUYypEB4eNWOZWVDpH.LaeGQIruHQu81hfJldjMOQSVblH3x(j, yAf4BMDpiCAb4hYaN6VqW);
        }
    }

    @Override // com.vdodsodjsdt.LL6zXCXfmDYzdHCRTT
    public final void SuB3hEmTmbbRGAhtvOOmfKEon(D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW, Runnable runnable) {
        try {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            hRrPPME7ytOB7ba.V57tEvNfxZVVcOCAOih5PKr(d73WsmU258PapcWZb45SFW, cancellationException);
            wRXy41zFnpLczeVR.zzpBGItXfub0yWj.SuB3hEmTmbbRGAhtvOOmfKEon(d73WsmU258PapcWZb45SFW, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof LWcyhQFsn8EAAdNGJ) && ((LWcyhQFsn8EAAdNGJ) obj).LaeGQIruHQu81hfJldjMOQSVblH3x == this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    public final int hashCode() {
        return System.identityHashCode(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
    }

    @Override // com.vdodsodjsdt.LL6zXCXfmDYzdHCRTT
    public final String toString() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x.toString();
    }
}
