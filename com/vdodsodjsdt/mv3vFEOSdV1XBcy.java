package com.vdodsodjsdt;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class mv3vFEOSdV1XBcy extends RTPFSJiwiLgiPf implements fYvyQNs44sUa {
    public static final /* synthetic */ AtomicReferenceFieldUpdater ZLZeBXTMq0zDztBxtRTuCHrapQ = AtomicReferenceFieldUpdater.newUpdater(mv3vFEOSdV1XBcy.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = hRrPPME7ytOB7ba.GI83zq0G8e7zkn;

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(Object obj) {
        while (Math.max(RTPFSJiwiLgiPf.zIvmSL0wzmmKGc3X39b2Gw2mUGE.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ZLZeBXTMq0zDztBxtRTuCHrapQ;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            aqhhl68tQrgIjcMGB3dY2YLK3vN aqhhl68tqrgijcmgb3dy2ylk3vn = hRrPPME7ytOB7ba.GI83zq0G8e7zkn;
            if (obj2 != aqhhl68tqrgijcmgb3dy2ylk3vn) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, aqhhl68tqrgijcmgb3dy2ylk3vn)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    zzpBGItXfub0yWj();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final Object V57tEvNfxZVVcOCAOih5PKr(tfu79AIgc4CGAZaxd4HhD tfu79aigc4cgazaxd4hhd) {
        boolean zZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR();
        hMtEZx9LFZEOBsEChkiRKnXNYh1GG hmtezx9lfzeobsechkirknxnyh1gg = hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (!zZfQNn8hdWlEQ5cR94249PDsLR) {
            YAf4BMDpiCAb4hYaN6VqW yAf4BMDpiCAb4hYaN6VqWRhfGHxtXxy0M0grmp2jkRjQg = F44whnLsbQ.RhfGHxtXxy0M0grmp2jkRjQg(sGipz63rTUmSj3uFDvOtzihao.qNPQb1obP7(tfu79aigc4cgazaxd4hhd));
            try {
                VxUQ9tBhpHJ2AAEDNW8sghc4m(new vSoeLg9O51k4mCoTrC0t0oz7gxJ(this, yAf4BMDpiCAb4hYaN6VqWRhfGHxtXxy0M0grmp2jkRjQg));
                Object objF6ZQsR6bPLvvCDNXOUc = yAf4BMDpiCAb4hYaN6VqWRhfGHxtXxy0M0grmp2jkRjQg.f6ZQsR6bPLvvCDNXOUc();
                w0JnONr1KwCkZY9pA0QjUDuh9aMcU w0jnonr1kwckzy9pa0qjuduh9amcu = w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr;
                if (objF6ZQsR6bPLvvCDNXOUc != w0jnonr1kwckzy9pa0qjuduh9amcu) {
                    objF6ZQsR6bPLvvCDNXOUc = hmtezx9lfzeobsechkirknxnyh1gg;
                }
                if (objF6ZQsR6bPLvvCDNXOUc == w0jnonr1kwckzy9pa0qjuduh9amcu) {
                    return objF6ZQsR6bPLvvCDNXOUc;
                }
            } catch (Throwable th) {
                yAf4BMDpiCAb4hYaN6VqWRhfGHxtXxy0M0grmp2jkRjQg.SuB3hEmTmbbRGAhtvOOmfKEon();
                throw th;
            }
        }
        return hmtezx9lfzeobsechkirknxnyh1gg;
    }

    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = RTPFSJiwiLgiPf.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                if (i2 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    ZLZeBXTMq0zDztBxtRTuCHrapQ.set(this, null);
                    return true;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(hRrPPME7ytOB7ba.KUYypEB4eNWOZWVDpH(this));
        sb.append("[isLocked=");
        sb.append(Math.max(RTPFSJiwiLgiPf.zIvmSL0wzmmKGc3X39b2Gw2mUGE.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(ZLZeBXTMq0zDztBxtRTuCHrapQ.get(this));
        sb.append(']');
        return sb.toString();
    }
}
