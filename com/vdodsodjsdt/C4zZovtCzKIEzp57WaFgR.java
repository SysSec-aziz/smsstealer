package com.vdodsodjsdt;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4zZovtCzKIEzp57WaFgR implements eQ4t6yhV4vxJ5QNjrzzBTCQF3Nw {
    public final CopyOnWriteArrayList LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final long V57tEvNfxZVVcOCAOih5PKr;
    public final A3cppuj9wGt VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public long ZfQNn8hdWlEQ5cR94249PDsLR;
    public final LinkedBlockingDeque zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final j5jyRGaw4k zzpBGItXfub0yWj;

    public C4zZovtCzKIEzp57WaFgR(A3cppuj9wGt a3cppuj9wGt, j5jyRGaw4k j5jyrgaw4k) {
        ej6unYlOWMDF.pYmKDYlAmhudp(j5jyrgaw4k, "taskRunner");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = a3cppuj9wGt;
        this.zzpBGItXfub0yWj = j5jyrgaw4k;
        this.V57tEvNfxZVVcOCAOih5PKr = TimeUnit.MILLISECONDS.toNanos(250L);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = Long.MIN_VALUE;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new CopyOnWriteArrayList();
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new LinkedBlockingDeque();
    }

    public final void V57tEvNfxZVVcOCAOih5PKr() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        Iterator it = copyOnWriteArrayList.iterator();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(it, "iterator(...)");
        while (it.hasNext()) {
            AkpQfjiBveZX5wDhj0 akpQfjiBveZX5wDhj0 = (AkpQfjiBveZX5wDhj0) it.next();
            akpQfjiBveZX5wDhj0.cancel();
            AkpQfjiBveZX5wDhj0 akpQfjiBveZX5wDhj0VxUQ9tBhpHJ2AAEDNW8sghc4m = akpQfjiBveZX5wDhj0.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            if (akpQfjiBveZX5wDhj0VxUQ9tBhpHJ2AAEDNW8sghc4m != null) {
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR().addLast(akpQfjiBveZX5wDhj0VxUQ9tBhpHJ2AAEDNW8sghc4m);
            }
        }
        copyOnWriteArrayList.clear();
    }

    @Override // com.vdodsodjsdt.eQ4t6yhV4vxJ5QNjrzzBTCQF3Nw
    public final ozyMFBfTwKTRwifTDHYB8VGdyq VxUQ9tBhpHJ2AAEDNW8sghc4m() throws IOException {
        j3soyeolow j3soyeolowVarZfQNn8hdWlEQ5cR94249PDsLR;
        CopyOnWriteArrayList copyOnWriteArrayList = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        IOException iOException = null;
        while (true) {
            try {
                boolean zIsEmpty = copyOnWriteArrayList.isEmpty();
                A3cppuj9wGt a3cppuj9wGt = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                if (zIsEmpty && !a3cppuj9wGt.V57tEvNfxZVVcOCAOih5PKr(null)) {
                    V57tEvNfxZVVcOCAOih5PKr();
                    ej6unYlOWMDF.p59rPv72J9(iOException);
                    throw iOException;
                }
                if (a3cppuj9wGt.NSjgqmGjEzuugn2SsG1mZFP()) {
                    throw new IOException("Canceled");
                }
                qF22Y620JkFyombtDYw0h0h8Rxpja qf22y620jkfyombtdyw0h0h8rxpja = this.zzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                long jNanoTime = System.nanoTime();
                long j = this.ZfQNn8hdWlEQ5cR94249PDsLR - jNanoTime;
                if (copyOnWriteArrayList.isEmpty() || j <= 0) {
                    j3soyeolowVarZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR();
                    j = this.V57tEvNfxZVVcOCAOih5PKr;
                    this.ZfQNn8hdWlEQ5cR94249PDsLR = jNanoTime + j;
                } else {
                    j3soyeolowVarZfQNn8hdWlEQ5cR94249PDsLR = null;
                }
                if (j3soyeolowVarZfQNn8hdWlEQ5cR94249PDsLR == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    if (copyOnWriteArrayList.isEmpty() || (j3soyeolowVarZfQNn8hdWlEQ5cR94249PDsLR = (j3soyeolow) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.poll(j, timeUnit)) == null) {
                        j3soyeolowVarZfQNn8hdWlEQ5cR94249PDsLR = null;
                    } else {
                        copyOnWriteArrayList.remove(j3soyeolowVarZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                    }
                    if (j3soyeolowVarZfQNn8hdWlEQ5cR94249PDsLR == null) {
                    }
                }
                AkpQfjiBveZX5wDhj0 akpQfjiBveZX5wDhj0 = j3soyeolowVarZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                boolean z = false;
                if (j3soyeolowVarZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj == null && j3soyeolowVarZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr == null) {
                    V57tEvNfxZVVcOCAOih5PKr();
                    if (!akpQfjiBveZX5wDhj0.LaeGQIruHQu81hfJldjMOQSVblH3x()) {
                        j3soyeolowVarZfQNn8hdWlEQ5cR94249PDsLR = akpQfjiBveZX5wDhj0.zzpBGItXfub0yWj();
                    }
                    if (j3soyeolowVarZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj == null && j3soyeolowVarZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr == null) {
                        z = true;
                    }
                    if (z) {
                        return j3soyeolowVarZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr();
                    }
                }
                Throwable th = j3soyeolowVarZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        sGipz63rTUmSj3uFDvOtzihao.LaeGQIruHQu81hfJldjMOQSVblH3x(iOException, th);
                    }
                }
                AkpQfjiBveZX5wDhj0 akpQfjiBveZX5wDhj02 = j3soyeolowVarZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj;
                if (akpQfjiBveZX5wDhj02 != null) {
                    a3cppuj9wGt.ZfQNn8hdWlEQ5cR94249PDsLR().addFirst(akpQfjiBveZX5wDhj02);
                }
            } finally {
                V57tEvNfxZVVcOCAOih5PKr();
            }
        }
    }

    public final j3soyeolow ZfQNn8hdWlEQ5cR94249PDsLR() {
        AkpQfjiBveZX5wDhj0 gjxx7grzfsle2;
        A3cppuj9wGt a3cppuj9wGt = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (a3cppuj9wGt.V57tEvNfxZVVcOCAOih5PKr(null)) {
            try {
                gjxx7grzfsle2 = a3cppuj9wGt.LaeGQIruHQu81hfJldjMOQSVblH3x();
            } catch (Throwable th) {
                gjxx7grzfsle2 = new gJXx7GrZFSlE2(th);
            }
            if (gjxx7grzfsle2.LaeGQIruHQu81hfJldjMOQSVblH3x()) {
                return new j3soyeolow(gjxx7grzfsle2, (Throwable) null, 6);
            }
            if (gjxx7grzfsle2 instanceof gJXx7GrZFSlE2) {
                return ((gJXx7GrZFSlE2) gjxx7grzfsle2).VxUQ9tBhpHJ2AAEDNW8sghc4m;
            }
            this.LaeGQIruHQu81hfJldjMOQSVblH3x.add(gjxx7grzfsle2);
            this.zzpBGItXfub0yWj.ZfQNn8hdWlEQ5cR94249PDsLR().V57tEvNfxZVVcOCAOih5PKr(new YnQPtHUv8fhQGME5Uj(U7JVXX1Kyh43VgUF.zzpBGItXfub0yWj + " connect " + a3cppuj9wGt.ZLZeBXTMq0zDztBxtRTuCHrapQ().GI83zq0G8e7zkn.ZLZeBXTMq0zDztBxtRTuCHrapQ(), gjxx7grzfsle2, this), 0L);
        }
        return null;
    }

    @Override // com.vdodsodjsdt.eQ4t6yhV4vxJ5QNjrzzBTCQF3Nw
    public final A3cppuj9wGt zzpBGItXfub0yWj() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }
}
