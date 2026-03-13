package com.vdodsodjsdt;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class j5jyRGaw4k {
    public static final Logger HzCpKshMOoaw76hFcbOVRYMeRd;
    public static final j5jyRGaw4k KUYypEB4eNWOZWVDpH;
    public final ArrayList GI83zq0G8e7zkn;
    public long LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final RfOSIaL6qUBGKJY9MSCBP5ba M9e7PWhFYLD2lOGMker;
    public final ArrayList NSjgqmGjEzuugn2SsG1mZFP;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public final qF22Y620JkFyombtDYw0h0h8Rxpja VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public boolean ZfQNn8hdWlEQ5cR94249PDsLR;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final Logger zzpBGItXfub0yWj;

    static {
        Logger logger = Logger.getLogger(j5jyRGaw4k.class.getName());
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(logger, "getLogger(...)");
        HzCpKshMOoaw76hFcbOVRYMeRd = logger;
        String str = U7JVXX1Kyh43VgUF.zzpBGItXfub0yWj + " TaskRunner";
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "name");
        zn3tA1DF6ZMjT9y zn3ta1df6zmjt9y = new zn3tA1DF6ZMjT9y(str, true);
        qF22Y620JkFyombtDYw0h0h8Rxpja qf22y620jkfyombtdyw0h0h8rxpja = new qF22Y620JkFyombtDYw0h0h8Rxpja();
        qf22y620jkfyombtdyw0h0h8rxpja.V57tEvNfxZVVcOCAOih5PKr = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), zn3ta1df6zmjt9y);
        KUYypEB4eNWOZWVDpH = new j5jyRGaw4k(qf22y620jkfyombtdyw0h0h8rxpja);
    }

    public j5jyRGaw4k(qF22Y620JkFyombtDYw0h0h8Rxpja qf22y620jkfyombtdyw0h0h8rxpja) {
        Logger logger = HzCpKshMOoaw76hFcbOVRYMeRd;
        ej6unYlOWMDF.pYmKDYlAmhudp(logger, "logger");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = qf22y620jkfyombtdyw0h0h8rxpja;
        this.zzpBGItXfub0yWj = logger;
        this.V57tEvNfxZVVcOCAOih5PKr = 10000;
        this.NSjgqmGjEzuugn2SsG1mZFP = new ArrayList();
        this.GI83zq0G8e7zkn = new ArrayList();
        this.M9e7PWhFYLD2lOGMker = new RfOSIaL6qUBGKJY9MSCBP5ba(12, this);
    }

    public static final void VxUQ9tBhpHJ2AAEDNW8sghc4m(j5jyRGaw4k j5jyrgaw4k, eb3lIx1g1S4TGeJI46hOG7Bd eb3lix1g1s4tgeji46hog7bd, long j, boolean z) {
        TimeZone timeZone = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        MpsgFCfSVNxgvcBlEbc8Iuyh3Obq mpsgFCfSVNxgvcBlEbc8Iuyh3Obq = eb3lix1g1s4tgeji46hog7bd.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.p59rPv72J9(mpsgFCfSVNxgvcBlEbc8Iuyh3Obq);
        if (mpsgFCfSVNxgvcBlEbc8Iuyh3Obq.ZfQNn8hdWlEQ5cR94249PDsLR != eb3lix1g1s4tgeji46hog7bd) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = mpsgFCfSVNxgvcBlEbc8Iuyh3Obq.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        mpsgFCfSVNxgvcBlEbc8Iuyh3Obq.zIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
        mpsgFCfSVNxgvcBlEbc8Iuyh3Obq.ZfQNn8hdWlEQ5cR94249PDsLR = null;
        j5jyrgaw4k.NSjgqmGjEzuugn2SsG1mZFP.remove(mpsgFCfSVNxgvcBlEbc8Iuyh3Obq);
        if (j != -1 && !z2 && !mpsgFCfSVNxgvcBlEbc8Iuyh3Obq.V57tEvNfxZVVcOCAOih5PKr) {
            mpsgFCfSVNxgvcBlEbc8Iuyh3Obq.ZfQNn8hdWlEQ5cR94249PDsLR(eb3lix1g1s4tgeji46hog7bd, j, true);
        }
        if (mpsgFCfSVNxgvcBlEbc8Iuyh3Obq.LaeGQIruHQu81hfJldjMOQSVblH3x.isEmpty()) {
            return;
        }
        j5jyrgaw4k.GI83zq0G8e7zkn.add(mpsgFCfSVNxgvcBlEbc8Iuyh3Obq);
        if (z) {
            return;
        }
        j5jyrgaw4k.LaeGQIruHQu81hfJldjMOQSVblH3x();
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        TimeZone timeZone = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (i > this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            return;
        }
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i + 1;
        RfOSIaL6qUBGKJY9MSCBP5ba rfOSIaL6qUBGKJY9MSCBP5ba = this.M9e7PWhFYLD2lOGMker;
        ej6unYlOWMDF.pYmKDYlAmhudp(rfOSIaL6qUBGKJY9MSCBP5ba, "runnable");
        ((ThreadPoolExecutor) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr).execute(rfOSIaL6qUBGKJY9MSCBP5ba);
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(MpsgFCfSVNxgvcBlEbc8Iuyh3Obq mpsgFCfSVNxgvcBlEbc8Iuyh3Obq) {
        ej6unYlOWMDF.pYmKDYlAmhudp(mpsgFCfSVNxgvcBlEbc8Iuyh3Obq, "taskQueue");
        TimeZone timeZone = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (mpsgFCfSVNxgvcBlEbc8Iuyh3Obq.ZfQNn8hdWlEQ5cR94249PDsLR == null) {
            boolean zIsEmpty = mpsgFCfSVNxgvcBlEbc8Iuyh3Obq.LaeGQIruHQu81hfJldjMOQSVblH3x.isEmpty();
            ArrayList arrayList = this.GI83zq0G8e7zkn;
            if (zIsEmpty) {
                arrayList.remove(mpsgFCfSVNxgvcBlEbc8Iuyh3Obq);
            } else {
                byte[] bArr = jHlOQHj3hlCsydfI7r5ApVdQjYvKf.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                ej6unYlOWMDF.pYmKDYlAmhudp(arrayList, "<this>");
                if (!arrayList.contains(mpsgFCfSVNxgvcBlEbc8Iuyh3Obq)) {
                    arrayList.add(mpsgFCfSVNxgvcBlEbc8Iuyh3Obq);
                }
            }
        }
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            notify();
        } else {
            LaeGQIruHQu81hfJldjMOQSVblH3x();
        }
    }

    public final MpsgFCfSVNxgvcBlEbc8Iuyh3Obq ZfQNn8hdWlEQ5cR94249PDsLR() {
        int i;
        synchronized (this) {
            i = this.V57tEvNfxZVVcOCAOih5PKr;
            this.V57tEvNfxZVVcOCAOih5PKr = i + 1;
        }
        return new MpsgFCfSVNxgvcBlEbc8Iuyh3Obq(this, u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Q", i));
    }

    public final eb3lIx1g1S4TGeJI46hOG7Bd zzpBGItXfub0yWj() {
        long j;
        eb3lIx1g1S4TGeJI46hOG7Bd eb3lix1g1s4tgeji46hog7bd;
        boolean z;
        TimeZone timeZone = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        while (true) {
            ArrayList arrayList = this.GI83zq0G8e7zkn;
            if (arrayList.isEmpty()) {
                return null;
            }
            long jNanoTime = System.nanoTime();
            int size = arrayList.size();
            long jMin = Long.MAX_VALUE;
            int i = 0;
            eb3lIx1g1S4TGeJI46hOG7Bd eb3lix1g1s4tgeji46hog7bd2 = null;
            while (true) {
                if (i >= size) {
                    j = jNanoTime;
                    eb3lix1g1s4tgeji46hog7bd = null;
                    z = false;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                eb3lIx1g1S4TGeJI46hOG7Bd eb3lix1g1s4tgeji46hog7bd3 = (eb3lIx1g1S4TGeJI46hOG7Bd) ((MpsgFCfSVNxgvcBlEbc8Iuyh3Obq) obj).LaeGQIruHQu81hfJldjMOQSVblH3x.get(0);
                j = jNanoTime;
                eb3lix1g1s4tgeji46hog7bd = null;
                long jMax = Math.max(0L, eb3lix1g1s4tgeji46hog7bd3.ZfQNn8hdWlEQ5cR94249PDsLR - j);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (eb3lix1g1s4tgeji46hog7bd2 != null) {
                        z = true;
                        break;
                    }
                    eb3lix1g1s4tgeji46hog7bd2 = eb3lix1g1s4tgeji46hog7bd3;
                }
                jNanoTime = j;
            }
            ArrayList arrayList2 = this.NSjgqmGjEzuugn2SsG1mZFP;
            if (eb3lix1g1s4tgeji46hog7bd2 != null) {
                TimeZone timeZone2 = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                eb3lix1g1s4tgeji46hog7bd2.ZfQNn8hdWlEQ5cR94249PDsLR = -1L;
                MpsgFCfSVNxgvcBlEbc8Iuyh3Obq mpsgFCfSVNxgvcBlEbc8Iuyh3Obq = eb3lix1g1s4tgeji46hog7bd2.V57tEvNfxZVVcOCAOih5PKr;
                ej6unYlOWMDF.p59rPv72J9(mpsgFCfSVNxgvcBlEbc8Iuyh3Obq);
                mpsgFCfSVNxgvcBlEbc8Iuyh3Obq.LaeGQIruHQu81hfJldjMOQSVblH3x.remove(eb3lix1g1s4tgeji46hog7bd2);
                arrayList.remove(mpsgFCfSVNxgvcBlEbc8Iuyh3Obq);
                mpsgFCfSVNxgvcBlEbc8Iuyh3Obq.ZfQNn8hdWlEQ5cR94249PDsLR = eb3lix1g1s4tgeji46hog7bd2;
                arrayList2.add(mpsgFCfSVNxgvcBlEbc8Iuyh3Obq);
                if (z || (!this.ZfQNn8hdWlEQ5cR94249PDsLR && !arrayList.isEmpty())) {
                    LaeGQIruHQu81hfJldjMOQSVblH3x();
                }
                return eb3lix1g1s4tgeji46hog7bd2;
            }
            if (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
                if (jMin >= this.LaeGQIruHQu81hfJldjMOQSVblH3x - j) {
                    return eb3lix1g1s4tgeji46hog7bd;
                }
                notify();
                return eb3lix1g1s4tgeji46hog7bd;
            }
            this.ZfQNn8hdWlEQ5cR94249PDsLR = true;
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = j + jMin;
            try {
                try {
                    TimeZone timeZone3 = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    if (jMin > 0) {
                        long j2 = jMin / 1000000;
                        long j3 = jMin - (1000000 * j2);
                        if (j2 > 0 || jMin > 0) {
                            wait(j2, (int) j3);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((MpsgFCfSVNxgvcBlEbc8Iuyh3Obq) arrayList2.get(size2)).VxUQ9tBhpHJ2AAEDNW8sghc4m();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        MpsgFCfSVNxgvcBlEbc8Iuyh3Obq mpsgFCfSVNxgvcBlEbc8Iuyh3Obq2 = (MpsgFCfSVNxgvcBlEbc8Iuyh3Obq) arrayList.get(size3);
                        mpsgFCfSVNxgvcBlEbc8Iuyh3Obq2.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                        if (mpsgFCfSVNxgvcBlEbc8Iuyh3Obq2.LaeGQIruHQu81hfJldjMOQSVblH3x.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.ZfQNn8hdWlEQ5cR94249PDsLR = false;
            }
        }
    }
}
