package com.vdodsodjsdt;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mBO0VNMBTnz implements RsZYdPZzPnvxFX2Iwr2ecGA {
    public static final Object GI83zq0G8e7zkn;
    public static final KfeOQNOupsCg6878zi4e NSjgqmGjEzuugn2SsG1mZFP;
    public volatile pjNHP1KyCckTb7 LaeGQIruHQu81hfJldjMOQSVblH3x;
    public volatile Object V57tEvNfxZVVcOCAOih5PKr;
    public volatile yOuYFVCVfzcehN7zbUPS9Gj0l8 ZfQNn8hdWlEQ5cR94249PDsLR;
    public static final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger ZLZeBXTMq0zDztBxtRTuCHrapQ = Logger.getLogger(mBO0VNMBTnz.class.getName());

    static {
        KfeOQNOupsCg6878zi4e roFlHbZvtV2ac;
        try {
            roFlHbZvtV2ac = new FvJSxCBFhRZxgWDJOOeqcs8r(AtomicReferenceFieldUpdater.newUpdater(pjNHP1KyCckTb7.class, Thread.class, "VxUQ9tBhpHJ2AAEDNW8sghc4m"), AtomicReferenceFieldUpdater.newUpdater(pjNHP1KyCckTb7.class, pjNHP1KyCckTb7.class, "zzpBGItXfub0yWj"), AtomicReferenceFieldUpdater.newUpdater(mBO0VNMBTnz.class, pjNHP1KyCckTb7.class, "LaeGQIruHQu81hfJldjMOQSVblH3x"), AtomicReferenceFieldUpdater.newUpdater(mBO0VNMBTnz.class, yOuYFVCVfzcehN7zbUPS9Gj0l8.class, "ZfQNn8hdWlEQ5cR94249PDsLR"), AtomicReferenceFieldUpdater.newUpdater(mBO0VNMBTnz.class, Object.class, "V57tEvNfxZVVcOCAOih5PKr"));
            th = null;
        } catch (Throwable th) {
            th = th;
            roFlHbZvtV2ac = new RoFlHbZvtV2ac();
        }
        NSjgqmGjEzuugn2SsG1mZFP = roFlHbZvtV2ac;
        if (th != null) {
            ZLZeBXTMq0zDztBxtRTuCHrapQ.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        GI83zq0G8e7zkn = new Object();
    }

    public static Object LaeGQIruHQu81hfJldjMOQSVblH3x(Object obj) throws ExecutionException {
        if (obj instanceof sFL9PivMTCLItVt5L) {
            Throwable th = ((sFL9PivMTCLItVt5L) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof UZtxSg2Wpl5vob) {
            throw new ExecutionException(((UZtxSg2Wpl5vob) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
        if (obj == GI83zq0G8e7zkn) {
            return null;
        }
        return obj;
    }

    public static void V57tEvNfxZVVcOCAOih5PKr(mBO0VNMBTnz mbo0vnmbtnz) {
        pjNHP1KyCckTb7 pjnhp1kyccktb7;
        yOuYFVCVfzcehN7zbUPS9Gj0l8 youyfvcvfzcehn7zbups9gj0l8;
        yOuYFVCVfzcehN7zbUPS9Gj0l8 youyfvcvfzcehn7zbups9gj0l82;
        yOuYFVCVfzcehN7zbUPS9Gj0l8 youyfvcvfzcehn7zbups9gj0l83;
        do {
            pjnhp1kyccktb7 = mbo0vnmbtnz.LaeGQIruHQu81hfJldjMOQSVblH3x;
        } while (!NSjgqmGjEzuugn2SsG1mZFP.GI83zq0G8e7zkn(mbo0vnmbtnz, pjnhp1kyccktb7, pjNHP1KyCckTb7.V57tEvNfxZVVcOCAOih5PKr));
        while (true) {
            youyfvcvfzcehn7zbups9gj0l8 = null;
            if (pjnhp1kyccktb7 == null) {
                break;
            }
            Thread thread = pjnhp1kyccktb7.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (thread != null) {
                pjnhp1kyccktb7.VxUQ9tBhpHJ2AAEDNW8sghc4m = null;
                LockSupport.unpark(thread);
            }
            pjnhp1kyccktb7 = pjnhp1kyccktb7.zzpBGItXfub0yWj;
        }
        do {
            youyfvcvfzcehn7zbups9gj0l82 = mbo0vnmbtnz.ZfQNn8hdWlEQ5cR94249PDsLR;
        } while (!NSjgqmGjEzuugn2SsG1mZFP.ZLZeBXTMq0zDztBxtRTuCHrapQ(mbo0vnmbtnz, youyfvcvfzcehn7zbups9gj0l82, yOuYFVCVfzcehN7zbUPS9Gj0l8.ZfQNn8hdWlEQ5cR94249PDsLR));
        while (true) {
            youyfvcvfzcehn7zbups9gj0l83 = youyfvcvfzcehn7zbups9gj0l8;
            youyfvcvfzcehn7zbups9gj0l8 = youyfvcvfzcehn7zbups9gj0l82;
            if (youyfvcvfzcehn7zbups9gj0l8 == null) {
                break;
            }
            youyfvcvfzcehn7zbups9gj0l82 = youyfvcvfzcehn7zbups9gj0l8.V57tEvNfxZVVcOCAOih5PKr;
            youyfvcvfzcehn7zbups9gj0l8.V57tEvNfxZVVcOCAOih5PKr = youyfvcvfzcehn7zbups9gj0l83;
        }
        while (youyfvcvfzcehn7zbups9gj0l83 != null) {
            yOuYFVCVfzcehN7zbUPS9Gj0l8 youyfvcvfzcehn7zbups9gj0l84 = youyfvcvfzcehn7zbups9gj0l83.V57tEvNfxZVVcOCAOih5PKr;
            ZfQNn8hdWlEQ5cR94249PDsLR(youyfvcvfzcehn7zbups9gj0l83.VxUQ9tBhpHJ2AAEDNW8sghc4m, youyfvcvfzcehn7zbups9gj0l83.zzpBGItXfub0yWj);
            youyfvcvfzcehn7zbups9gj0l83 = youyfvcvfzcehn7zbups9gj0l84;
        }
    }

    public static void ZfQNn8hdWlEQ5cR94249PDsLR(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            ZLZeBXTMq0zDztBxtRTuCHrapQ.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object zIvmSL0wzmmKGc3X39b2Gw2mUGE(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public boolean GI83zq0G8e7zkn(Throwable th) {
        if (!NSjgqmGjEzuugn2SsG1mZFP.NSjgqmGjEzuugn2SsG1mZFP(this, null, new UZtxSg2Wpl5vob(th))) {
            return false;
        }
        V57tEvNfxZVVcOCAOih5PKr(this);
        return true;
    }

    public final void NSjgqmGjEzuugn2SsG1mZFP(pjNHP1KyCckTb7 pjnhp1kyccktb7) {
        pjnhp1kyccktb7.VxUQ9tBhpHJ2AAEDNW8sghc4m = null;
        while (true) {
            pjNHP1KyCckTb7 pjnhp1kyccktb72 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (pjnhp1kyccktb72 == pjNHP1KyCckTb7.V57tEvNfxZVVcOCAOih5PKr) {
                return;
            }
            pjNHP1KyCckTb7 pjnhp1kyccktb73 = null;
            while (pjnhp1kyccktb72 != null) {
                pjNHP1KyCckTb7 pjnhp1kyccktb74 = pjnhp1kyccktb72.zzpBGItXfub0yWj;
                if (pjnhp1kyccktb72.VxUQ9tBhpHJ2AAEDNW8sghc4m != null) {
                    pjnhp1kyccktb73 = pjnhp1kyccktb72;
                } else if (pjnhp1kyccktb73 != null) {
                    pjnhp1kyccktb73.zzpBGItXfub0yWj = pjnhp1kyccktb74;
                    if (pjnhp1kyccktb73.VxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
                        break;
                    }
                } else if (!NSjgqmGjEzuugn2SsG1mZFP.GI83zq0G8e7zkn(this, pjnhp1kyccktb72, pjnhp1kyccktb74)) {
                    break;
                }
                pjnhp1kyccktb72 = pjnhp1kyccktb74;
            }
            return;
        }
    }

    @Override // com.vdodsodjsdt.RsZYdPZzPnvxFX2Iwr2ecGA
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(Runnable runnable, Executor executor) {
        executor.getClass();
        yOuYFVCVfzcehN7zbUPS9Gj0l8 youyfvcvfzcehn7zbups9gj0l8 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        yOuYFVCVfzcehN7zbUPS9Gj0l8 youyfvcvfzcehn7zbups9gj0l82 = yOuYFVCVfzcehN7zbUPS9Gj0l8.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (youyfvcvfzcehn7zbups9gj0l8 != youyfvcvfzcehn7zbups9gj0l82) {
            yOuYFVCVfzcehN7zbUPS9Gj0l8 youyfvcvfzcehn7zbups9gj0l83 = new yOuYFVCVfzcehN7zbUPS9Gj0l8(runnable, executor);
            do {
                youyfvcvfzcehn7zbups9gj0l83.V57tEvNfxZVVcOCAOih5PKr = youyfvcvfzcehn7zbups9gj0l8;
                if (NSjgqmGjEzuugn2SsG1mZFP.ZLZeBXTMq0zDztBxtRTuCHrapQ(this, youyfvcvfzcehn7zbups9gj0l8, youyfvcvfzcehn7zbups9gj0l83)) {
                    return;
                } else {
                    youyfvcvfzcehn7zbups9gj0l8 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                }
            } while (youyfvcvfzcehn7zbups9gj0l8 != youyfvcvfzcehn7zbups9gj0l82);
        }
        ZfQNn8hdWlEQ5cR94249PDsLR(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.V57tEvNfxZVVcOCAOih5PKr;
        if (obj != null) {
            return false;
        }
        if (!NSjgqmGjEzuugn2SsG1mZFP.NSjgqmGjEzuugn2SsG1mZFP(this, obj, zIvmSL0wzmmKGc3X39b2Gw2mUGE ? new sFL9PivMTCLItVt5L(new CancellationException("Future.cancel() was called."), z) : z ? sFL9PivMTCLItVt5L.zzpBGItXfub0yWj : sFL9PivMTCLItVt5L.V57tEvNfxZVVcOCAOih5PKr)) {
            return false;
        }
        V57tEvNfxZVVcOCAOih5PKr(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        pjNHP1KyCckTb7 pjnhp1kyccktb7 = pjNHP1KyCckTb7.V57tEvNfxZVVcOCAOih5PKr;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.V57tEvNfxZVVcOCAOih5PKr;
        if (obj != null) {
            return LaeGQIruHQu81hfJldjMOQSVblH3x(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            pjNHP1KyCckTb7 pjnhp1kyccktb72 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (pjnhp1kyccktb72 != pjnhp1kyccktb7) {
                pjNHP1KyCckTb7 pjnhp1kyccktb73 = new pjNHP1KyCckTb7();
                do {
                    KfeOQNOupsCg6878zi4e kfeOQNOupsCg6878zi4e = NSjgqmGjEzuugn2SsG1mZFP;
                    kfeOQNOupsCg6878zi4e.ymT6yQrus3w(pjnhp1kyccktb73, pjnhp1kyccktb72);
                    if (kfeOQNOupsCg6878zi4e.GI83zq0G8e7zkn(this, pjnhp1kyccktb72, pjnhp1kyccktb73)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                NSjgqmGjEzuugn2SsG1mZFP(pjnhp1kyccktb73);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.V57tEvNfxZVVcOCAOih5PKr;
                            if (obj2 != null) {
                                return LaeGQIruHQu81hfJldjMOQSVblH3x(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        NSjgqmGjEzuugn2SsG1mZFP(pjnhp1kyccktb73);
                    } else {
                        pjnhp1kyccktb72 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                    }
                } while (pjnhp1kyccktb72 != pjnhp1kyccktb7);
            }
            return LaeGQIruHQu81hfJldjMOQSVblH3x(this.V57tEvNfxZVVcOCAOih5PKr);
        }
        while (nanos > 0) {
            Object obj3 = this.V57tEvNfxZVVcOCAOih5PKr;
            if (obj3 != null) {
                return LaeGQIruHQu81hfJldjMOQSVblH3x(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strGI83zq0G8e7zkn = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strGI83zq0G8e7zkn2 = u9SlVAuoWhQUfJ.GI83zq0G8e7zkn(strGI83zq0G8e7zkn, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strGI83zq0G8e7zkn3 = strGI83zq0G8e7zkn2 + jConvert + " " + lowerCase;
                if (z) {
                    strGI83zq0G8e7zkn3 = u9SlVAuoWhQUfJ.GI83zq0G8e7zkn(strGI83zq0G8e7zkn3, ",");
                }
                strGI83zq0G8e7zkn2 = u9SlVAuoWhQUfJ.GI83zq0G8e7zkn(strGI83zq0G8e7zkn3, " ");
            }
            if (z) {
                strGI83zq0G8e7zkn2 = strGI83zq0G8e7zkn2 + nanos2 + " nanoseconds ";
            }
            strGI83zq0G8e7zkn = u9SlVAuoWhQUfJ.GI83zq0G8e7zkn(strGI83zq0G8e7zkn2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(u9SlVAuoWhQUfJ.GI83zq0G8e7zkn(strGI83zq0G8e7zkn, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strGI83zq0G8e7zkn + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.V57tEvNfxZVVcOCAOih5PKr instanceof sFL9PivMTCLItVt5L;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.V57tEvNfxZVVcOCAOih5PKr != null;
    }

    public final String toString() {
        String strZLZeBXTMq0zDztBxtRTuCHrapQ;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.V57tEvNfxZVVcOCAOih5PKr instanceof sFL9PivMTCLItVt5L) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzpBGItXfub0yWj(sb);
        } else {
            try {
                strZLZeBXTMq0zDztBxtRTuCHrapQ = ZLZeBXTMq0zDztBxtRTuCHrapQ();
            } catch (RuntimeException e) {
                strZLZeBXTMq0zDztBxtRTuCHrapQ = "Exception thrown from implementation: " + e.getClass();
            }
            if (strZLZeBXTMq0zDztBxtRTuCHrapQ != null && !strZLZeBXTMq0zDztBxtRTuCHrapQ.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strZLZeBXTMq0zDztBxtRTuCHrapQ);
                sb.append("]");
            } else if (isDone()) {
                zzpBGItXfub0yWj(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void zzpBGItXfub0yWj(StringBuilder sb) {
        try {
            Object objZIvmSL0wzmmKGc3X39b2Gw2mUGE = zIvmSL0wzmmKGc3X39b2Gw2mUGE(this);
            sb.append("SUCCESS, result=[");
            sb.append(objZIvmSL0wzmmKGc3X39b2Gw2mUGE == this ? "this future" : String.valueOf(objZIvmSL0wzmmKGc3X39b2Gw2mUGE));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        pjNHP1KyCckTb7 pjnhp1kyccktb7 = pjNHP1KyCckTb7.V57tEvNfxZVVcOCAOih5PKr;
        if (!Thread.interrupted()) {
            Object obj2 = this.V57tEvNfxZVVcOCAOih5PKr;
            if (obj2 != null) {
                return LaeGQIruHQu81hfJldjMOQSVblH3x(obj2);
            }
            pjNHP1KyCckTb7 pjnhp1kyccktb72 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (pjnhp1kyccktb72 != pjnhp1kyccktb7) {
                pjNHP1KyCckTb7 pjnhp1kyccktb73 = new pjNHP1KyCckTb7();
                do {
                    KfeOQNOupsCg6878zi4e kfeOQNOupsCg6878zi4e = NSjgqmGjEzuugn2SsG1mZFP;
                    kfeOQNOupsCg6878zi4e.ymT6yQrus3w(pjnhp1kyccktb73, pjnhp1kyccktb72);
                    if (kfeOQNOupsCg6878zi4e.GI83zq0G8e7zkn(this, pjnhp1kyccktb72, pjnhp1kyccktb73)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.V57tEvNfxZVVcOCAOih5PKr;
                            } else {
                                NSjgqmGjEzuugn2SsG1mZFP(pjnhp1kyccktb73);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return LaeGQIruHQu81hfJldjMOQSVblH3x(obj);
                    }
                    pjnhp1kyccktb72 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                } while (pjnhp1kyccktb72 != pjnhp1kyccktb7);
            }
            return LaeGQIruHQu81hfJldjMOQSVblH3x(this.V57tEvNfxZVVcOCAOih5PKr);
        }
        throw new InterruptedException();
    }
}
