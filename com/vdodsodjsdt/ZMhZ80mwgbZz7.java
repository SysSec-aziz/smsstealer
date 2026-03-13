package com.vdodsodjsdt;

import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ZMhZ80mwgbZz7 implements CZ74FjSsfST8z15SHXk {
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final boolean V57tEvNfxZVVcOCAOih5PKr;
    public final EouCzLZsW9ynithduh ZfQNn8hdWlEQ5cR94249PDsLR = new EouCzLZsW9ynithduh();
    public final /* synthetic */ AIQ3M1G7NlBb9nFUZAGJvkBOAC zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public ZMhZ80mwgbZz7(AIQ3M1G7NlBb9nFUZAGJvkBOAC aIQ3M1G7NlBb9nFUZAGJvkBOAC, boolean z) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = aIQ3M1G7NlBb9nFUZAGJvkBOAC;
        this.V57tEvNfxZVVcOCAOih5PKr = z;
    }

    @Override // com.vdodsodjsdt.CZ74FjSsfST8z15SHXk
    public final void Ca81ebIan1u(long j, EouCzLZsW9ynithduh eouCzLZsW9ynithduh) throws SocketTimeoutException {
        TimeZone timeZone = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        EouCzLZsW9ynithduh eouCzLZsW9ynithduh2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        eouCzLZsW9ynithduh2.Ca81ebIan1u(j, eouCzLZsW9ynithduh);
        while (eouCzLZsW9ynithduh2.ZfQNn8hdWlEQ5cR94249PDsLR >= 16384) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m(false);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(boolean z) throws SocketTimeoutException {
        long jMin;
        boolean z2;
        AIQ3M1G7NlBb9nFUZAGJvkBOAC aIQ3M1G7NlBb9nFUZAGJvkBOAC = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        synchronized (aIQ3M1G7NlBb9nFUZAGJvkBOAC) {
            aIQ3M1G7NlBb9nFUZAGJvkBOAC.HzCpKshMOoaw76hFcbOVRYMeRd.NSjgqmGjEzuugn2SsG1mZFP();
            while (aIQ3M1G7NlBb9nFUZAGJvkBOAC.ZfQNn8hdWlEQ5cR94249PDsLR >= aIQ3M1G7NlBb9nFUZAGJvkBOAC.LaeGQIruHQu81hfJldjMOQSVblH3x && !this.V57tEvNfxZVVcOCAOih5PKr && !this.LaeGQIruHQu81hfJldjMOQSVblH3x && aIQ3M1G7NlBb9nFUZAGJvkBOAC.zIvmSL0wzmmKGc3X39b2Gw2mUGE() == null) {
                try {
                    try {
                        aIQ3M1G7NlBb9nFUZAGJvkBOAC.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    aIQ3M1G7NlBb9nFUZAGJvkBOAC.HzCpKshMOoaw76hFcbOVRYMeRd.HzCpKshMOoaw76hFcbOVRYMeRd();
                    throw th;
                }
            }
            aIQ3M1G7NlBb9nFUZAGJvkBOAC.HzCpKshMOoaw76hFcbOVRYMeRd.HzCpKshMOoaw76hFcbOVRYMeRd();
            aIQ3M1G7NlBb9nFUZAGJvkBOAC.zzpBGItXfub0yWj();
            jMin = Math.min(aIQ3M1G7NlBb9nFUZAGJvkBOAC.LaeGQIruHQu81hfJldjMOQSVblH3x - aIQ3M1G7NlBb9nFUZAGJvkBOAC.ZfQNn8hdWlEQ5cR94249PDsLR, this.ZfQNn8hdWlEQ5cR94249PDsLR.ZfQNn8hdWlEQ5cR94249PDsLR);
            aIQ3M1G7NlBb9nFUZAGJvkBOAC.ZfQNn8hdWlEQ5cR94249PDsLR += jMin;
            z2 = z && jMin == this.ZfQNn8hdWlEQ5cR94249PDsLR.ZfQNn8hdWlEQ5cR94249PDsLR;
        }
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.HzCpKshMOoaw76hFcbOVRYMeRd.NSjgqmGjEzuugn2SsG1mZFP();
        try {
            AIQ3M1G7NlBb9nFUZAGJvkBOAC aIQ3M1G7NlBb9nFUZAGJvkBOAC2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            aIQ3M1G7NlBb9nFUZAGJvkBOAC2.zzpBGItXfub0yWj.q11o1hieEkZDhF1MGOZI26oZiDT(aIQ3M1G7NlBb9nFUZAGJvkBOAC2.VxUQ9tBhpHJ2AAEDNW8sghc4m, z2, this.ZfQNn8hdWlEQ5cR94249PDsLR, jMin);
        } finally {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.HzCpKshMOoaw76hFcbOVRYMeRd.HzCpKshMOoaw76hFcbOVRYMeRd();
        }
    }

    @Override // com.vdodsodjsdt.CZ74FjSsfST8z15SHXk, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws SocketTimeoutException {
        AIQ3M1G7NlBb9nFUZAGJvkBOAC aIQ3M1G7NlBb9nFUZAGJvkBOAC = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        TimeZone timeZone = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        synchronized (aIQ3M1G7NlBb9nFUZAGJvkBOAC) {
            if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                return;
            }
            boolean z = aIQ3M1G7NlBb9nFUZAGJvkBOAC.zIvmSL0wzmmKGc3X39b2Gw2mUGE() == null;
            AIQ3M1G7NlBb9nFUZAGJvkBOAC aIQ3M1G7NlBb9nFUZAGJvkBOAC2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (!aIQ3M1G7NlBb9nFUZAGJvkBOAC2.GI83zq0G8e7zkn.V57tEvNfxZVVcOCAOih5PKr) {
                if (this.ZfQNn8hdWlEQ5cR94249PDsLR.ZfQNn8hdWlEQ5cR94249PDsLR > 0) {
                    while (this.ZfQNn8hdWlEQ5cR94249PDsLR.ZfQNn8hdWlEQ5cR94249PDsLR > 0) {
                        VxUQ9tBhpHJ2AAEDNW8sghc4m(true);
                    }
                } else if (z) {
                    aIQ3M1G7NlBb9nFUZAGJvkBOAC2.zzpBGItXfub0yWj.q11o1hieEkZDhF1MGOZI26oZiDT(aIQ3M1G7NlBb9nFUZAGJvkBOAC2.VxUQ9tBhpHJ2AAEDNW8sghc4m, true, null, 0L);
                }
            }
            AIQ3M1G7NlBb9nFUZAGJvkBOAC aIQ3M1G7NlBb9nFUZAGJvkBOAC3 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            synchronized (aIQ3M1G7NlBb9nFUZAGJvkBOAC3) {
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
                aIQ3M1G7NlBb9nFUZAGJvkBOAC3.notifyAll();
            }
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.zzpBGItXfub0yWj.flush();
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
    }

    @Override // com.vdodsodjsdt.CZ74FjSsfST8z15SHXk, java.io.Flushable
    public final void flush() throws SocketTimeoutException {
        AIQ3M1G7NlBb9nFUZAGJvkBOAC aIQ3M1G7NlBb9nFUZAGJvkBOAC = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        TimeZone timeZone = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        synchronized (aIQ3M1G7NlBb9nFUZAGJvkBOAC) {
            aIQ3M1G7NlBb9nFUZAGJvkBOAC.zzpBGItXfub0yWj();
        }
        while (this.ZfQNn8hdWlEQ5cR94249PDsLR.ZfQNn8hdWlEQ5cR94249PDsLR > 0) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m(false);
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.zzpBGItXfub0yWj.flush();
        }
    }

    @Override // com.vdodsodjsdt.CZ74FjSsfST8z15SHXk
    public final Rls9YNaGzWVnzvwT zzpBGItXfub0yWj() {
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.HzCpKshMOoaw76hFcbOVRYMeRd;
    }
}
