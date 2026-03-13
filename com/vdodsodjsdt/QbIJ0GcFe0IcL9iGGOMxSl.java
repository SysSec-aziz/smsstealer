package com.vdodsodjsdt;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class QbIJ0GcFe0IcL9iGGOMxSl extends eb3lIx1g1S4TGeJI46hOG7Bd {
    public final /* synthetic */ int LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
    public final /* synthetic */ Object zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QbIJ0GcFe0IcL9iGGOMxSl(IBo1UM4YpEOkefD iBo1UM4YpEOkefD, String str) {
        super(str);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = iBo1UM4YpEOkefD;
    }

    @Override // com.vdodsodjsdt.eb3lIx1g1S4TGeJI46hOG7Bd
    public final long VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        switch (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            case 0:
                IBo1UM4YpEOkefD iBo1UM4YpEOkefD = (IBo1UM4YpEOkefD) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                long jNanoTime = System.nanoTime();
                Map map = iBo1UM4YpEOkefD.V57tEvNfxZVVcOCAOih5PKr;
                Iterator it = map.values().iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                Iterator it2 = iBo1UM4YpEOkefD.zIvmSL0wzmmKGc3X39b2Gw2mUGE.iterator();
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(it2, "iterator(...)");
                while (it2.hasNext()) {
                    if (map.get(((ozyMFBfTwKTRwifTDHYB8VGdyq) it2.next()).ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m) != null) {
                        throw new ClassCastException();
                    }
                }
                long j = (jNanoTime - iBo1UM4YpEOkefD.zzpBGItXfub0yWj) + 1;
                Iterator it3 = iBo1UM4YpEOkefD.zIvmSL0wzmmKGc3X39b2Gw2mUGE.iterator();
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(it3, "iterator(...)");
                int i = 0;
                long j2 = Long.MAX_VALUE;
                ozyMFBfTwKTRwifTDHYB8VGdyq ozymfbftwktrwiftdhyb8vgdyq = null;
                ozyMFBfTwKTRwifTDHYB8VGdyq ozymfbftwktrwiftdhyb8vgdyq2 = null;
                int i2 = 0;
                while (it3.hasNext()) {
                    ozyMFBfTwKTRwifTDHYB8VGdyq ozymfbftwktrwiftdhyb8vgdyq3 = (ozyMFBfTwKTRwifTDHYB8VGdyq) it3.next();
                    ej6unYlOWMDF.p59rPv72J9(ozymfbftwktrwiftdhyb8vgdyq3);
                    synchronized (ozymfbftwktrwiftdhyb8vgdyq3) {
                        if (iBo1UM4YpEOkefD.VxUQ9tBhpHJ2AAEDNW8sghc4m(ozymfbftwktrwiftdhyb8vgdyq3, jNanoTime) > 0) {
                            i2++;
                        } else {
                            int i3 = i2;
                            long j3 = ozymfbftwktrwiftdhyb8vgdyq3.f6ZQsR6bPLvvCDNXOUc;
                            if (j3 < j) {
                                j = j3;
                                ozymfbftwktrwiftdhyb8vgdyq = ozymfbftwktrwiftdhyb8vgdyq3;
                            }
                            if (map.get(ozymfbftwktrwiftdhyb8vgdyq3.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m) != null) {
                                throw new ClassCastException();
                            }
                            i++;
                            if (j3 < j2) {
                                j2 = j3;
                                ozymfbftwktrwiftdhyb8vgdyq2 = ozymfbftwktrwiftdhyb8vgdyq3;
                            }
                            i2 = i3;
                        }
                    }
                }
                int i4 = i2;
                if (ozymfbftwktrwiftdhyb8vgdyq == null) {
                    if (i > 5) {
                        j = j2;
                        ozymfbftwktrwiftdhyb8vgdyq = ozymfbftwktrwiftdhyb8vgdyq2;
                    } else {
                        j = -1;
                        ozymfbftwktrwiftdhyb8vgdyq = null;
                    }
                }
                if (ozymfbftwktrwiftdhyb8vgdyq == null) {
                    if (ozymfbftwktrwiftdhyb8vgdyq2 != null) {
                        return (j2 + iBo1UM4YpEOkefD.zzpBGItXfub0yWj) - jNanoTime;
                    }
                    if (i4 > 0) {
                        return iBo1UM4YpEOkefD.zzpBGItXfub0yWj;
                    }
                    return -1L;
                }
                synchronized (ozymfbftwktrwiftdhyb8vgdyq) {
                    if (!ozymfbftwktrwiftdhyb8vgdyq.jW7EiD0YL6xkbB158jMUzhWNWb1y.isEmpty()) {
                        return 0L;
                    }
                    if (ozymfbftwktrwiftdhyb8vgdyq.f6ZQsR6bPLvvCDNXOUc != j) {
                        return 0L;
                    }
                    ozymfbftwktrwiftdhyb8vgdyq.q1wNbhk2O6 = true;
                    iBo1UM4YpEOkefD.zIvmSL0wzmmKGc3X39b2Gw2mUGE.remove(ozymfbftwktrwiftdhyb8vgdyq);
                    if (map.get(ozymfbftwktrwiftdhyb8vgdyq.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m) != null) {
                        throw new ClassCastException();
                    }
                    U7JVXX1Kyh43VgUF.zzpBGItXfub0yWj(ozymfbftwktrwiftdhyb8vgdyq.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                    if (!iBo1UM4YpEOkefD.zIvmSL0wzmmKGc3X39b2Gw2mUGE.isEmpty()) {
                        return 0L;
                    }
                    MpsgFCfSVNxgvcBlEbc8Iuyh3Obq mpsgFCfSVNxgvcBlEbc8Iuyh3Obq = iBo1UM4YpEOkefD.ZfQNn8hdWlEQ5cR94249PDsLR;
                    synchronized (mpsgFCfSVNxgvcBlEbc8Iuyh3Obq.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                        if (mpsgFCfSVNxgvcBlEbc8Iuyh3Obq.VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
                            mpsgFCfSVNxgvcBlEbc8Iuyh3Obq.VxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr(mpsgFCfSVNxgvcBlEbc8Iuyh3Obq);
                        }
                        break;
                    }
                    return 0L;
                }
            default:
                ((EfIvTei3Q8wBNpyLTZJevpFxej) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE).VxUQ9tBhpHJ2AAEDNW8sghc4m();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QbIJ0GcFe0IcL9iGGOMxSl(String str, EfIvTei3Q8wBNpyLTZJevpFxej efIvTei3Q8wBNpyLTZJevpFxej) {
        super(str);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = efIvTei3Q8wBNpyLTZJevpFxej;
    }
}
