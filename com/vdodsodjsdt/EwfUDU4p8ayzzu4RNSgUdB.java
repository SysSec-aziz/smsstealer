package com.vdodsodjsdt;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class EwfUDU4p8ayzzu4RNSgUdB implements Cloneable {
    public volatile boolean Ca81ebIan1u;
    public eQ4t6yhV4vxJ5QNjrzzBTCQF3Nw GI83zq0G8e7zkn;
    public Zqam9EI4z3IGnFKq HzCpKshMOoaw76hFcbOVRYMeRd;
    public boolean KUYypEB4eNWOZWVDpH;
    public final IBo1UM4YpEOkefD LaeGQIruHQu81hfJldjMOQSVblH3x;
    public ozyMFBfTwKTRwifTDHYB8VGdyq M9e7PWhFYLD2lOGMker;
    public Object NSjgqmGjEzuugn2SsG1mZFP;
    public final o8p4Xhf9gKH3WuUFc74 V57tEvNfxZVVcOCAOih5PKr;
    public final AtomicBoolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final tpLngQCdAeyjjtxlI ZfQNn8hdWlEQ5cR94249PDsLR;
    public volatile Zqam9EI4z3IGnFKq h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public boolean p59rPv72J9;
    public final CopyOnWriteArrayList pYmKDYlAmhudp;
    public boolean q1wNbhk2O6;
    public final RpM8PhcGvxtJQZ zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public EwfUDU4p8ayzzu4RNSgUdB(o8p4Xhf9gKH3WuUFc74 o8p4xhf9gkh3wuufc74, tpLngQCdAeyjjtxlI tplngqcdaeyjjtxli) {
        this.V57tEvNfxZVVcOCAOih5PKr = o8p4xhf9gkh3wuufc74;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = tplngqcdaeyjjtxli;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = (IBo1UM4YpEOkefD) o8p4xhf9gkh3wuufc74.pzqP2AqKW6J5PO8zCKnW.ZfQNn8hdWlEQ5cR94249PDsLR;
        o8p4xhf9gkh3wuufc74.ZfQNn8hdWlEQ5cR94249PDsLR.getClass();
        RpM8PhcGvxtJQZ rpM8PhcGvxtJQZ = new RpM8PhcGvxtJQZ(this);
        long j = o8p4xhf9gkh3wuufc74.Irh5auREsoeV1C1RaBamlmy;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        rpM8PhcGvxtJQZ.ZLZeBXTMq0zDztBxtRTuCHrapQ(j);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = rpM8PhcGvxtJQZ;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new AtomicBoolean();
        this.p59rPv72J9 = true;
        this.pYmKDYlAmhudp = new CopyOnWriteArrayList();
    }

    public final IOException LaeGQIruHQu81hfJldjMOQSVblH3x(Zqam9EI4z3IGnFKq zqam9EI4z3IGnFKq, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        ej6unYlOWMDF.pYmKDYlAmhudp(zqam9EI4z3IGnFKq, "exchange");
        if (zqam9EI4z3IGnFKq.equals(this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (!this.KUYypEB4eNWOZWVDpH) {
                            if (z2 || !this.q1wNbhk2O6) {
                                z4 = false;
                            }
                        }
                        if (z) {
                            this.KUYypEB4eNWOZWVDpH = false;
                        }
                        if (z2) {
                            this.q1wNbhk2O6 = false;
                        }
                        boolean z5 = this.KUYypEB4eNWOZWVDpH;
                        boolean z6 = (z5 || this.q1wNbhk2O6) ? false : true;
                        if (!z5 && !this.q1wNbhk2O6) {
                            if (!this.p59rPv72J9) {
                                z3 = true;
                            }
                        }
                        z4 = z3;
                        z3 = z6;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z2) {
                    }
                    z4 = false;
                }
            }
            if (z3) {
                this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = null;
                ozyMFBfTwKTRwifTDHYB8VGdyq ozymfbftwktrwiftdhyb8vgdyq = this.M9e7PWhFYLD2lOGMker;
                if (ozymfbftwktrwiftdhyb8vgdyq != null) {
                    synchronized (ozymfbftwktrwiftdhyb8vgdyq) {
                        ozymfbftwktrwiftdhyb8vgdyq.h3jnZRsdwYJfY9UhQCkbvWciwvFHv++;
                    }
                }
            }
            if (z4) {
                return VxUQ9tBhpHJ2AAEDNW8sghc4m(iOException);
            }
        }
        return iOException;
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(boolean z) {
        Zqam9EI4z3IGnFKq zqam9EI4z3IGnFKq;
        synchronized (this) {
            if (!this.p59rPv72J9) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (zqam9EI4z3IGnFKq = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) != null) {
            ((cWn2EVjHRjuSHU5xQi) zqam9EI4z3IGnFKq.ZfQNn8hdWlEQ5cR94249PDsLR).cancel();
            ((EwfUDU4p8ayzzu4RNSgUdB) zqam9EI4z3IGnFKq.zzpBGItXfub0yWj).LaeGQIruHQu81hfJldjMOQSVblH3x(zqam9EI4z3IGnFKq, true, true, null);
        }
        this.HzCpKshMOoaw76hFcbOVRYMeRd = null;
    }

    public final IOException VxUQ9tBhpHJ2AAEDNW8sghc4m(IOException iOException) {
        IOException interruptedIOException;
        Socket socketZLZeBXTMq0zDztBxtRTuCHrapQ;
        TimeZone timeZone = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        ozyMFBfTwKTRwifTDHYB8VGdyq ozymfbftwktrwiftdhyb8vgdyq = this.M9e7PWhFYLD2lOGMker;
        if (ozymfbftwktrwiftdhyb8vgdyq != null) {
            synchronized (ozymfbftwktrwiftdhyb8vgdyq) {
                socketZLZeBXTMq0zDztBxtRTuCHrapQ = ZLZeBXTMq0zDztBxtRTuCHrapQ();
            }
            if (this.M9e7PWhFYLD2lOGMker == null) {
                if (socketZLZeBXTMq0zDztBxtRTuCHrapQ != null) {
                    U7JVXX1Kyh43VgUF.zzpBGItXfub0yWj(socketZLZeBXTMq0zDztBxtRTuCHrapQ);
                }
            } else if (socketZLZeBXTMq0zDztBxtRTuCHrapQ != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.GI83zq0G8e7zkn()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            ej6unYlOWMDF.p59rPv72J9(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Socket ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        ozyMFBfTwKTRwifTDHYB8VGdyq ozymfbftwktrwiftdhyb8vgdyq = this.M9e7PWhFYLD2lOGMker;
        ej6unYlOWMDF.p59rPv72J9(ozymfbftwktrwiftdhyb8vgdyq);
        TimeZone timeZone = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        ArrayList arrayList = ozymfbftwktrwiftdhyb8vgdyq.jW7EiD0YL6xkbB158jMUzhWNWb1y;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.M9e7PWhFYLD2lOGMker = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        ozymfbftwktrwiftdhyb8vgdyq.f6ZQsR6bPLvvCDNXOUc = System.nanoTime();
        IBo1UM4YpEOkefD iBo1UM4YpEOkefD = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        ConcurrentLinkedQueue concurrentLinkedQueue = iBo1UM4YpEOkefD.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        TimeZone timeZone2 = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (!ozymfbftwktrwiftdhyb8vgdyq.q1wNbhk2O6) {
            iBo1UM4YpEOkefD.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr(iBo1UM4YpEOkefD.LaeGQIruHQu81hfJldjMOQSVblH3x, 0L);
            return null;
        }
        ozymfbftwktrwiftdhyb8vgdyq.q1wNbhk2O6 = true;
        concurrentLinkedQueue.remove(ozymfbftwktrwiftdhyb8vgdyq);
        if (concurrentLinkedQueue.isEmpty()) {
            MpsgFCfSVNxgvcBlEbc8Iuyh3Obq mpsgFCfSVNxgvcBlEbc8Iuyh3Obq = iBo1UM4YpEOkefD.ZfQNn8hdWlEQ5cR94249PDsLR;
            synchronized (mpsgFCfSVNxgvcBlEbc8Iuyh3Obq.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                if (mpsgFCfSVNxgvcBlEbc8Iuyh3Obq.VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
                    mpsgFCfSVNxgvcBlEbc8Iuyh3Obq.VxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr(mpsgFCfSVNxgvcBlEbc8Iuyh3Obq);
                }
            }
        }
        xJilh3An9LAykwTqP7vc xjilh3an9laykwtqp7vc = ozymfbftwktrwiftdhyb8vgdyq.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        ej6unYlOWMDF.pYmKDYlAmhudp(xjilh3an9laykwtqp7vc, "address");
        if (iBo1UM4YpEOkefD.V57tEvNfxZVVcOCAOih5PKr.get(xjilh3an9laykwtqp7vc) == null) {
            return ozymfbftwktrwiftdhyb8vgdyq.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        }
        throw new ClassCastException();
    }

    public final vQITfhejPO ZfQNn8hdWlEQ5cR94249PDsLR() {
        ArrayList arrayList = new ArrayList();
        gYXV3FZbh17i6ocMo1T.BJQHddi0Plr5ElWetCyaixWOg9(arrayList, this.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj);
        arrayList.add(new VGiQ6HkHYAFCj1vfm4vwyq2V(this.V57tEvNfxZVVcOCAOih5PKr));
        arrayList.add(new VGiQ6HkHYAFCj1vfm4vwyq2V(this.V57tEvNfxZVVcOCAOih5PKr.M9e7PWhFYLD2lOGMker));
        arrayList.add(new Eng1CeVjwJuPlsZEAACAL6ZEw(1));
        arrayList.add(Eng1CeVjwJuPlsZEAACAL6ZEw.zzpBGItXfub0yWj);
        gYXV3FZbh17i6ocMo1T.BJQHddi0Plr5ElWetCyaixWOg9(arrayList, this.V57tEvNfxZVVcOCAOih5PKr.V57tEvNfxZVVcOCAOih5PKr);
        arrayList.add(new Eng1CeVjwJuPlsZEAACAL6ZEw(2));
        tpLngQCdAeyjjtxlI tplngqcdaeyjjtxli = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        o8p4Xhf9gKH3WuUFc74 o8p4xhf9gkh3wuufc74 = this.V57tEvNfxZVVcOCAOih5PKr;
        try {
            try {
                vQITfhejPO vqitfhejpoZzpBGItXfub0yWj = new bwXjL2AsSEgcpqgRMvOZqEV9(this, arrayList, 0, null, tplngqcdaeyjjtxli, o8p4xhf9gkh3wuufc74.q11o1hieEkZDhF1MGOZI26oZiDT, o8p4xhf9gkh3wuufc74.w0Wu95l8dVNw5rZMRu, o8p4xhf9gkh3wuufc74.RhfGHxtXxy0M0grmp2jkRjQg).zzpBGItXfub0yWj(tplngqcdaeyjjtxli);
                if (this.Ca81ebIan1u) {
                    jHlOQHj3hlCsydfI7r5ApVdQjYvKf.zzpBGItXfub0yWj(vqitfhejpoZzpBGItXfub0yWj);
                    throw new IOException("Canceled");
                }
                zIvmSL0wzmmKGc3X39b2Gw2mUGE(null);
                return vqitfhejpoZzpBGItXfub0yWj;
            } catch (IOException e) {
                IOException iOExceptionZIvmSL0wzmmKGc3X39b2Gw2mUGE = zIvmSL0wzmmKGc3X39b2Gw2mUGE(e);
                ej6unYlOWMDF.Ca81ebIan1u(iOExceptionZIvmSL0wzmmKGc3X39b2Gw2mUGE, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionZIvmSL0wzmmKGc3X39b2Gw2mUGE;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                zIvmSL0wzmmKGc3X39b2Gw2mUGE(null);
            }
            throw th;
        }
    }

    public final Object clone() {
        return new EwfUDU4p8ayzzu4RNSgUdB(this.V57tEvNfxZVVcOCAOih5PKr, this.ZfQNn8hdWlEQ5cR94249PDsLR);
    }

    public final IOException zIvmSL0wzmmKGc3X39b2Gw2mUGE(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.p59rPv72J9) {
                this.p59rPv72J9 = false;
                if (!this.KUYypEB4eNWOZWVDpH) {
                    if (!this.q1wNbhk2O6) {
                        z = true;
                    }
                }
            }
        }
        return z ? VxUQ9tBhpHJ2AAEDNW8sghc4m(iOException) : iOException;
    }

    public final vQITfhejPO zzpBGItXfub0yWj() {
        if (!this.ZLZeBXTMq0zDztBxtRTuCHrapQ.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.NSjgqmGjEzuugn2SsG1mZFP();
        O510kkNvCgHHMXIbKz1NqEFfrmj o510kkNvCgHHMXIbKz1NqEFfrmj = O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        this.NSjgqmGjEzuugn2SsG1mZFP = O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m.NSjgqmGjEzuugn2SsG1mZFP();
        try {
            nMRZPpfLCgJyuB nmrzppflcgjyub = this.V57tEvNfxZVVcOCAOih5PKr.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            synchronized (nmrzppflcgjyub) {
                ((ArrayDeque) nmrzppflcgjyub.zIvmSL0wzmmKGc3X39b2Gw2mUGE).add(this);
            }
            return ZfQNn8hdWlEQ5cR94249PDsLR();
        } finally {
            this.V57tEvNfxZVVcOCAOih5PKr.VxUQ9tBhpHJ2AAEDNW8sghc4m.NSjgqmGjEzuugn2SsG1mZFP(this);
        }
    }
}
