package com.vdodsodjsdt;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class YAf4BMDpiCAb4hYaN6VqW extends jVaNsOYs2UVt implements Z1jxNQy7ZL, fqQIeYf1n7m, jJewgcdeJJkpBkFlty5mYj6fPQ1lg {
    public final D73WsmU258PapcWZb45SFW ZLZeBXTMq0zDztBxtRTuCHrapQ;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final IvfXhmjM3e3K zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public static final /* synthetic */ AtomicIntegerFieldUpdater NSjgqmGjEzuugn2SsG1mZFP = AtomicIntegerFieldUpdater.newUpdater(YAf4BMDpiCAb4hYaN6VqW.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater GI83zq0G8e7zkn = AtomicReferenceFieldUpdater.newUpdater(YAf4BMDpiCAb4hYaN6VqW.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater M9e7PWhFYLD2lOGMker = AtomicReferenceFieldUpdater.newUpdater(YAf4BMDpiCAb4hYaN6VqW.class, Object.class, "_parentHandle$volatile");

    public YAf4BMDpiCAb4hYaN6VqW(int i, IvfXhmjM3e3K ivfXhmjM3e3K) {
        super(i);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = ivfXhmjM3e3K;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = ivfXhmjM3e3K.LaeGQIruHQu81hfJldjMOQSVblH3x();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = f3m9Wb7qofjtR8jYjIKdaE7fk.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public static Object O1xDAlBZZlZdoEf747lCFHld(EbZPfT79guDT ebZPfT79guDT, Object obj, int i, vP57smEEh3YGCxzJ vp57smeeh3ygcxzj) {
        if (obj instanceof XpG0A5IpJsSX9uJPSmP4WwTAl) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (vp57smeeh3ygcxzj != null || (ebZPfT79guDT instanceof xPJD6zCXsU5TwlX)) {
            return new sLGv12xZEa(obj, ebZPfT79guDT instanceof xPJD6zCXsU5TwlX ? (xPJD6zCXsU5TwlX) ebZPfT79guDT : null, vp57smeeh3ygcxzj, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void RhfGHxtXxy0M0grmp2jkRjQg(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void Ca81ebIan1u(fw6arzf1nhE87EaA fw6arzf1nhe87eaa, Throwable th) {
        D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int i = NSjgqmGjEzuugn2SsG1mZFP.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            fw6arzf1nhe87eaa.ZLZeBXTMq0zDztBxtRTuCHrapQ(i, d73WsmU258PapcWZb45SFW);
        } catch (Throwable th2) {
            ej6unYlOWMDF.O1xDAlBZZlZdoEf747lCFHld(d73WsmU258PapcWZb45SFW, new Eyg9qHiQ9Ki1REKbbd3J("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [com.vdodsodjsdt.iR5xCBIVvX5dAZmnw05F0Cv, com.vdodsodjsdt.vP57smEEh3YGCxzJ] */
    public final void HzCpKshMOoaw76hFcbOVRYMeRd(xPJD6zCXsU5TwlX xpjd6zcxsu5twlx, Throwable th) {
        try {
            switch (xpjd6zcxsu5twlx.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                case 0:
                    if (th != null) {
                        ((ScheduledFuture) xpjd6zcxsu5twlx.zzpBGItXfub0yWj).cancel(false);
                    }
                    break;
                case 1:
                    ((iR5xCBIVvX5dAZmnw05F0Cv) xpjd6zcxsu5twlx.zzpBGItXfub0yWj).GI83zq0G8e7zkn(th);
                    break;
                default:
                    ((c5ORlH4Pzc4yAttMD7dLGkl48Uya) xpjd6zcxsu5twlx.zzpBGItXfub0yWj).zzpBGItXfub0yWj();
                    break;
            }
        } catch (Throwable th2) {
            ej6unYlOWMDF.O1xDAlBZZlZdoEf747lCFHld(this.ZLZeBXTMq0zDztBxtRTuCHrapQ, new Eyg9qHiQ9Ki1REKbbd3J("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void Irh5auREsoeV1C1RaBamlmy(vP57smEEh3YGCxzJ vp57smeeh3ygcxzj) {
        q11o1hieEkZDhF1MGOZI26oZiDT(new xPJD6zCXsU5TwlX(vp57smeeh3ygcxzj));
    }

    public final void KUYypEB4eNWOZWVDpH(vP57smEEh3YGCxzJ vp57smeeh3ygcxzj, Throwable th) {
        try {
            vp57smeeh3ygcxzj.GI83zq0G8e7zkn(th);
        } catch (Throwable th2) {
            ej6unYlOWMDF.O1xDAlBZZlZdoEf747lCFHld(this.ZLZeBXTMq0zDztBxtRTuCHrapQ, new Eyg9qHiQ9Ki1REKbbd3J("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // com.vdodsodjsdt.IvfXhmjM3e3K
    public final D73WsmU258PapcWZb45SFW LaeGQIruHQu81hfJldjMOQSVblH3x() {
        return this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    @Override // com.vdodsodjsdt.jVaNsOYs2UVt
    public final Object M9e7PWhFYLD2lOGMker() {
        return GI83zq0G8e7zkn.get(this);
    }

    @Override // com.vdodsodjsdt.jVaNsOYs2UVt
    public final Object NSjgqmGjEzuugn2SsG1mZFP(Object obj) {
        return obj instanceof sLGv12xZEa ? ((sLGv12xZEa) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m : obj;
    }

    public final void SuB3hEmTmbbRGAhtvOOmfKEon() {
        IvfXhmjM3e3K ivfXhmjM3e3K = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        Throwable th = null;
        j0kIeYozLt6jOglJu j0kieyozlt6joglju = ivfXhmjM3e3K instanceof j0kIeYozLt6jOglJu ? (j0kIeYozLt6jOglJu) ivfXhmjM3e3K : null;
        if (j0kieyozlt6joglju != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j0kIeYozLt6jOglJu.M9e7PWhFYLD2lOGMker;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(j0kieyozlt6joglju);
                aqhhl68tQrgIjcMGB3dY2YLK3vN aqhhl68tqrgijcmgb3dy2ylk3vn = F44whnLsbQ.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                if (obj == aqhhl68tqrgijcmgb3dy2ylk3vn) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(j0kieyozlt6joglju, aqhhl68tqrgijcmgb3dy2ylk3vn, this)) {
                        if (atomicReferenceFieldUpdater.get(j0kieyozlt6joglju) != aqhhl68tqrgijcmgb3dy2ylk3vn) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(j0kieyozlt6joglju, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(j0kieyozlt6joglju) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            pYmKDYlAmhudp();
            h3jnZRsdwYJfY9UhQCkbvWciwvFHv(th);
        }
    }

    public final c5ORlH4Pzc4yAttMD7dLGkl48Uya TaDO7ogis3aEiWEtq() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        sJ612dvaOBrP4lDkAwxzLpcxONSSp sj612dvaobrp4ldkawxzlpcxonssp = (sJ612dvaOBrP4lDkAwxzLpcxONSSp) this.ZLZeBXTMq0zDztBxtRTuCHrapQ.q11o1hieEkZDhF1MGOZI26oZiDT(IN79WcIk5xB4t0GjRT43qPLs5.HzCpKshMOoaw76hFcbOVRYMeRd);
        if (sj612dvaobrp4ldkawxzlpcxonssp == null) {
            return null;
        }
        c5ORlH4Pzc4yAttMD7dLGkl48Uya c5orlh4pzc4yattmd7dlgkl48uyaJW7EiD0YL6xkbB158jMUzhWNWb1y = hRrPPME7ytOB7ba.jW7EiD0YL6xkbB158jMUzhWNWb1y(sj612dvaobrp4ldkawxzlpcxonssp, true, new UMGmPoqGybR1aVaZzKjL7I6DAND(this), 2);
        do {
            atomicReferenceFieldUpdater = M9e7PWhFYLD2lOGMker;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, c5orlh4pzc4yattmd7dlgkl48uyaJW7EiD0YL6xkbB158jMUzhWNWb1y)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return c5orlh4pzc4yattmd7dlgkl48uyaJW7EiD0YL6xkbB158jMUzhWNWb1y;
    }

    @Override // com.vdodsodjsdt.jVaNsOYs2UVt
    public final IvfXhmjM3e3K V57tEvNfxZVVcOCAOih5PKr() {
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    @Override // com.vdodsodjsdt.jJewgcdeJJkpBkFlty5mYj6fPQ1lg
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(fw6arzf1nhE87EaA fw6arzf1nhe87eaa, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = NSjgqmGjEzuugn2SsG1mZFP;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        q11o1hieEkZDhF1MGOZI26oZiDT(fw6arzf1nhe87eaa);
    }

    @Override // com.vdodsodjsdt.IvfXhmjM3e3K
    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(Object obj) {
        Throwable thVxUQ9tBhpHJ2AAEDNW8sghc4m = irzKrQ86nQxhDp2QXhxUmPnyA6TkB.VxUQ9tBhpHJ2AAEDNW8sghc4m(obj);
        if (thVxUQ9tBhpHJ2AAEDNW8sghc4m != null) {
            obj = new XpG0A5IpJsSX9uJPSmP4WwTAl(thVxUQ9tBhpHJ2AAEDNW8sghc4m, false);
        }
        aXO0LSrt8bKV(this.LaeGQIruHQu81hfJldjMOQSVblH3x, null, obj);
    }

    @Override // com.vdodsodjsdt.fqQIeYf1n7m
    public final fqQIeYf1n7m ZfQNn8hdWlEQ5cR94249PDsLR() {
        IvfXhmjM3e3K ivfXhmjM3e3K = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (ivfXhmjM3e3K instanceof fqQIeYf1n7m) {
            return (fqQIeYf1n7m) ivfXhmjM3e3K;
        }
        return null;
    }

    public final void aXO0LSrt8bKV(int i, vP57smEEh3YGCxzJ vp57smeeh3ygcxzj, Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GI83zq0G8e7zkn;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof EbZPfT79guDT) {
                Object objO1xDAlBZZlZdoEf747lCFHld = O1xDAlBZZlZdoEf747lCFHld((EbZPfT79guDT) obj2, obj, i, vp57smeeh3ygcxzj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objO1xDAlBZZlZdoEf747lCFHld)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w0Wu95l8dVNw5rZMRu()) {
                    pYmKDYlAmhudp();
                }
                ko09zE6UAgwkV(i);
                return;
            }
            if (obj2 instanceof EdDpRCdAiVpH) {
                EdDpRCdAiVpH edDpRCdAiVpH = (EdDpRCdAiVpH) obj2;
                if (EdDpRCdAiVpH.V57tEvNfxZVVcOCAOih5PKr.compareAndSet(edDpRCdAiVpH, 0, 1)) {
                    if (vp57smeeh3ygcxzj != null) {
                        KUYypEB4eNWOZWVDpH(vp57smeeh3ygcxzj, edDpRCdAiVpH.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final Object f6ZQsR6bPLvvCDNXOUc() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        sJ612dvaOBrP4lDkAwxzLpcxONSSp sj612dvaobrp4ldkawxzlpcxonssp;
        boolean zW0Wu95l8dVNw5rZMRu = w0Wu95l8dVNw5rZMRu();
        do {
            atomicIntegerFieldUpdater = NSjgqmGjEzuugn2SsG1mZFP;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zW0Wu95l8dVNw5rZMRu) {
                    SuB3hEmTmbbRGAhtvOOmfKEon();
                }
                Object obj = GI83zq0G8e7zkn.get(this);
                if (obj instanceof XpG0A5IpJsSX9uJPSmP4WwTAl) {
                    throw ((XpG0A5IpJsSX9uJPSmP4WwTAl) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m;
                }
                int i3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if ((i3 != 1 && i3 != 2) || (sj612dvaobrp4ldkawxzlpcxonssp = (sJ612dvaOBrP4lDkAwxzLpcxONSSp) this.ZLZeBXTMq0zDztBxtRTuCHrapQ.q11o1hieEkZDhF1MGOZI26oZiDT(IN79WcIk5xB4t0GjRT43qPLs5.HzCpKshMOoaw76hFcbOVRYMeRd)) == null || sj612dvaobrp4ldkawxzlpcxonssp.VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
                    return NSjgqmGjEzuugn2SsG1mZFP(obj);
                }
                CancellationException cancellationExceptionSuB3hEmTmbbRGAhtvOOmfKEon = ((fXGTDnUxIdCVHFvA63E) sj612dvaobrp4ldkawxzlpcxonssp).SuB3hEmTmbbRGAhtvOOmfKEon();
                zzpBGItXfub0yWj(obj, cancellationExceptionSuB3hEmTmbbRGAhtvOOmfKEon);
                throw cancellationExceptionSuB3hEmTmbbRGAhtvOOmfKEon;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((c5ORlH4Pzc4yAttMD7dLGkl48Uya) M9e7PWhFYLD2lOGMker.get(this)) == null) {
            TaDO7ogis3aEiWEtq();
        }
        if (zW0Wu95l8dVNw5rZMRu) {
            SuB3hEmTmbbRGAhtvOOmfKEon();
        }
        return w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr;
    }

    public final boolean h3jnZRsdwYJfY9UhQCkbvWciwvFHv(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GI83zq0G8e7zkn;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof EbZPfT79guDT)) {
                return false;
            }
            EdDpRCdAiVpH edDpRCdAiVpH = new EdDpRCdAiVpH(this, th, (obj instanceof xPJD6zCXsU5TwlX) || (obj instanceof fw6arzf1nhE87EaA));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, edDpRCdAiVpH)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            EbZPfT79guDT ebZPfT79guDT = (EbZPfT79guDT) obj;
            if (ebZPfT79guDT instanceof xPJD6zCXsU5TwlX) {
                HzCpKshMOoaw76hFcbOVRYMeRd((xPJD6zCXsU5TwlX) obj, th);
            } else if (ebZPfT79guDT instanceof fw6arzf1nhE87EaA) {
                Ca81ebIan1u((fw6arzf1nhE87EaA) obj, th);
            }
            if (!w0Wu95l8dVNw5rZMRu()) {
                pYmKDYlAmhudp();
            }
            ko09zE6UAgwkV(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
            return true;
        }
    }

    public Throwable jW7EiD0YL6xkbB158jMUzhWNWb1y(fXGTDnUxIdCVHFvA63E fxgtdnuxidcvhfva63e) {
        return fxgtdnuxidcvhfva63e.SuB3hEmTmbbRGAhtvOOmfKEon();
    }

    public final void ko09zE6UAgwkV(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = NSjgqmGjEzuugn2SsG1mZFP;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i == 4;
                IvfXhmjM3e3K ivfXhmjM3e3K = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                if (!z && (ivfXhmjM3e3K instanceof j0kIeYozLt6jOglJu)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        j0kIeYozLt6jOglJu j0kieyozlt6joglju = (j0kIeYozLt6jOglJu) ivfXhmjM3e3K;
                        LL6zXCXfmDYzdHCRTT lL6zXCXfmDYzdHCRTT = j0kieyozlt6joglju.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                        D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFWLaeGQIruHQu81hfJldjMOQSVblH3x = j0kieyozlt6joglju.ZLZeBXTMq0zDztBxtRTuCHrapQ.LaeGQIruHQu81hfJldjMOQSVblH3x();
                        if (lL6zXCXfmDYzdHCRTT.aXO0LSrt8bKV(d73WsmU258PapcWZb45SFWLaeGQIruHQu81hfJldjMOQSVblH3x)) {
                            lL6zXCXfmDYzdHCRTT.SuB3hEmTmbbRGAhtvOOmfKEon(d73WsmU258PapcWZb45SFWLaeGQIruHQu81hfJldjMOQSVblH3x, this);
                            return;
                        }
                        CwickyU0ZjEG0JwJwvvsOp0vRH0PB cwickyU0ZjEG0JwJwvvsOp0vRH0PBVxUQ9tBhpHJ2AAEDNW8sghc4m = bxg58FPVmiJdXQNjZxsZ.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                        if (cwickyU0ZjEG0JwJwvvsOp0vRH0PBVxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x >= 4294967296L) {
                            cwickyU0ZjEG0JwJwvvsOp0vRH0PBVxUQ9tBhpHJ2AAEDNW8sghc4m.O1xDAlBZZlZdoEf747lCFHld(this);
                            return;
                        }
                        cwickyU0ZjEG0JwJwvvsOp0vRH0PBVxUQ9tBhpHJ2AAEDNW8sghc4m.y1NaPKTl7R18DOr6e8i5(true);
                        try {
                            ej6unYlOWMDF.KYZ9RyuOc42A2J(this, ivfXhmjM3e3K, true);
                            do {
                            } while (cwickyU0ZjEG0JwJwvvsOp0vRH0PBVxUQ9tBhpHJ2AAEDNW8sghc4m.iKANjmyTSxO6v6UuLPdu7DxOjlS());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                ej6unYlOWMDF.KYZ9RyuOc42A2J(this, ivfXhmjM3e3K, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    @Override // com.vdodsodjsdt.Z1jxNQy7ZL
    public final void p59rPv72J9(Object obj) {
        ko09zE6UAgwkV(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
    }

    public final void pYmKDYlAmhudp() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = M9e7PWhFYLD2lOGMker;
        c5ORlH4Pzc4yAttMD7dLGkl48Uya c5orlh4pzc4yattmd7dlgkl48uya = (c5ORlH4Pzc4yAttMD7dLGkl48Uya) atomicReferenceFieldUpdater.get(this);
        if (c5orlh4pzc4yattmd7dlgkl48uya == null) {
            return;
        }
        c5orlh4pzc4yattmd7dlgkl48uya.zzpBGItXfub0yWj();
        atomicReferenceFieldUpdater.set(this, YiXsAgAUc8R5atJu.V57tEvNfxZVVcOCAOih5PKr);
    }

    public final void pzqP2AqKW6J5PO8zCKnW(Object obj, vP57smEEh3YGCxzJ vp57smeeh3ygcxzj) {
        aXO0LSrt8bKV(this.LaeGQIruHQu81hfJldjMOQSVblH3x, vp57smeeh3ygcxzj, obj);
    }

    public final void q11o1hieEkZDhF1MGOZI26oZiDT(EbZPfT79guDT ebZPfT79guDT) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GI83zq0G8e7zkn;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof f3m9Wb7qofjtR8jYjIKdaE7fk) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ebZPfT79guDT)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            boolean z = true;
            if (obj instanceof xPJD6zCXsU5TwlX ? true : obj instanceof fw6arzf1nhE87EaA) {
                RhfGHxtXxy0M0grmp2jkRjQg(ebZPfT79guDT, obj);
                throw null;
            }
            if (obj instanceof XpG0A5IpJsSX9uJPSmP4WwTAl) {
                XpG0A5IpJsSX9uJPSmP4WwTAl xpG0A5IpJsSX9uJPSmP4WwTAl = (XpG0A5IpJsSX9uJPSmP4WwTAl) obj;
                if (!XpG0A5IpJsSX9uJPSmP4WwTAl.zzpBGItXfub0yWj.compareAndSet(xpG0A5IpJsSX9uJPSmP4WwTAl, 0, 1)) {
                    RhfGHxtXxy0M0grmp2jkRjQg(ebZPfT79guDT, obj);
                    throw null;
                }
                if (obj instanceof EdDpRCdAiVpH) {
                    Throwable th = xpG0A5IpJsSX9uJPSmP4WwTAl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    if (ebZPfT79guDT instanceof xPJD6zCXsU5TwlX) {
                        HzCpKshMOoaw76hFcbOVRYMeRd((xPJD6zCXsU5TwlX) ebZPfT79guDT, th);
                        return;
                    } else {
                        ej6unYlOWMDF.Ca81ebIan1u(ebZPfT79guDT, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        Ca81ebIan1u((fw6arzf1nhE87EaA) ebZPfT79guDT, th);
                        return;
                    }
                }
                return;
            }
            if (obj instanceof sLGv12xZEa) {
                sLGv12xZEa slgv12xzea = (sLGv12xZEa) obj;
                if (slgv12xzea.zzpBGItXfub0yWj != null) {
                    RhfGHxtXxy0M0grmp2jkRjQg(ebZPfT79guDT, obj);
                    throw null;
                }
                if (ebZPfT79guDT instanceof fw6arzf1nhE87EaA) {
                    return;
                }
                ej6unYlOWMDF.Ca81ebIan1u(ebZPfT79guDT, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                xPJD6zCXsU5TwlX xpjd6zcxsu5twlx = (xPJD6zCXsU5TwlX) ebZPfT79guDT;
                Throwable th2 = slgv12xzea.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (th2 != null) {
                    HzCpKshMOoaw76hFcbOVRYMeRd(xpjd6zcxsu5twlx, th2);
                    return;
                }
                sLGv12xZEa slgv12xzeaVxUQ9tBhpHJ2AAEDNW8sghc4m = sLGv12xZEa.VxUQ9tBhpHJ2AAEDNW8sghc4m(slgv12xzea, xpjd6zcxsu5twlx, null, 29);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, slgv12xzeaVxUQ9tBhpHJ2AAEDNW8sghc4m)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else {
                if (ebZPfT79guDT instanceof fw6arzf1nhE87EaA) {
                    return;
                }
                ej6unYlOWMDF.Ca81ebIan1u(ebZPfT79guDT, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                sLGv12xZEa slgv12xzea2 = new sLGv12xZEa(obj, (xPJD6zCXsU5TwlX) ebZPfT79guDT, (vP57smEEh3YGCxzJ) null, (CancellationException) null, 28);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, slgv12xzea2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            }
        }
    }

    @Override // com.vdodsodjsdt.Z1jxNQy7ZL
    public final aqhhl68tQrgIjcMGB3dY2YLK3vN q1wNbhk2O6(Object obj, vP57smEEh3YGCxzJ vp57smeeh3ygcxzj) {
        aqhhl68tQrgIjcMGB3dY2YLK3vN aqhhl68tqrgijcmgb3dy2ylk3vn = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GI83zq0G8e7zkn;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof EbZPfT79guDT)) {
                return null;
            }
            Object objO1xDAlBZZlZdoEf747lCFHld = O1xDAlBZZlZdoEf747lCFHld((EbZPfT79guDT) obj2, obj, this.LaeGQIruHQu81hfJldjMOQSVblH3x, vp57smeeh3ygcxzj);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objO1xDAlBZZlZdoEf747lCFHld)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!w0Wu95l8dVNw5rZMRu()) {
                pYmKDYlAmhudp();
            }
            return aqhhl68tqrgijcmgb3dy2ylk3vn;
        }
    }

    public String qNPQb1obP7() {
        return "CancellableContinuation";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qNPQb1obP7());
        sb.append('(');
        sb.append(hRrPPME7ytOB7ba.O1xDAlBZZlZdoEf747lCFHld(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE));
        sb.append("){");
        Object obj = GI83zq0G8e7zkn.get(this);
        sb.append(obj instanceof EbZPfT79guDT ? "Active" : obj instanceof EdDpRCdAiVpH ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(hRrPPME7ytOB7ba.KUYypEB4eNWOZWVDpH(this));
        return sb.toString();
    }

    public final void vBGA6pPLqSMuYGvprl270j7() {
        c5ORlH4Pzc4yAttMD7dLGkl48Uya c5orlh4pzc4yattmd7dlgkl48uyaTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq();
        if (c5orlh4pzc4yattmd7dlgkl48uyaTaDO7ogis3aEiWEtq == null || (GI83zq0G8e7zkn.get(this) instanceof EbZPfT79guDT)) {
            return;
        }
        c5orlh4pzc4yattmd7dlgkl48uyaTaDO7ogis3aEiWEtq.zzpBGItXfub0yWj();
        M9e7PWhFYLD2lOGMker.set(this, YiXsAgAUc8R5atJu.V57tEvNfxZVVcOCAOih5PKr);
    }

    public final void vE4yDIjexsP2lGjLaTcB(LL6zXCXfmDYzdHCRTT lL6zXCXfmDYzdHCRTT) {
        IvfXhmjM3e3K ivfXhmjM3e3K = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        j0kIeYozLt6jOglJu j0kieyozlt6joglju = ivfXhmjM3e3K instanceof j0kIeYozLt6jOglJu ? (j0kIeYozLt6jOglJu) ivfXhmjM3e3K : null;
        aXO0LSrt8bKV((j0kieyozlt6joglju != null ? j0kieyozlt6joglju.zIvmSL0wzmmKGc3X39b2Gw2mUGE : null) == lL6zXCXfmDYzdHCRTT ? 4 : this.LaeGQIruHQu81hfJldjMOQSVblH3x, null, hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m);
    }

    public final boolean w0Wu95l8dVNw5rZMRu() {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x != 2) {
            return false;
        }
        IvfXhmjM3e3K ivfXhmjM3e3K = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        ej6unYlOWMDF.Ca81ebIan1u(ivfXhmjM3e3K, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return j0kIeYozLt6jOglJu.M9e7PWhFYLD2lOGMker.get((j0kIeYozLt6jOglJu) ivfXhmjM3e3K) != null;
    }

    @Override // com.vdodsodjsdt.jVaNsOYs2UVt
    public final Throwable zIvmSL0wzmmKGc3X39b2Gw2mUGE(Object obj) {
        Throwable thZIvmSL0wzmmKGc3X39b2Gw2mUGE = super.zIvmSL0wzmmKGc3X39b2Gw2mUGE(obj);
        if (thZIvmSL0wzmmKGc3X39b2Gw2mUGE != null) {
            return thZIvmSL0wzmmKGc3X39b2Gw2mUGE;
        }
        return null;
    }

    @Override // com.vdodsodjsdt.jVaNsOYs2UVt
    public final void zzpBGItXfub0yWj(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GI83zq0G8e7zkn;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof EbZPfT79guDT) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof XpG0A5IpJsSX9uJPSmP4WwTAl) {
                return;
            }
            if (!(obj2 instanceof sLGv12xZEa)) {
                cancellationException2 = cancellationException;
                sLGv12xZEa slgv12xzea = new sLGv12xZEa(obj2, (xPJD6zCXsU5TwlX) null, (vP57smEEh3YGCxzJ) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, slgv12xzea)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            sLGv12xZEa slgv12xzea2 = (sLGv12xZEa) obj2;
            if (slgv12xzea2.LaeGQIruHQu81hfJldjMOQSVblH3x != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            sLGv12xZEa slgv12xzeaVxUQ9tBhpHJ2AAEDNW8sghc4m = sLGv12xZEa.VxUQ9tBhpHJ2AAEDNW8sghc4m(slgv12xzea2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, slgv12xzeaVxUQ9tBhpHJ2AAEDNW8sghc4m)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    cancellationException2 = cancellationException;
                }
            }
            xPJD6zCXsU5TwlX xpjd6zcxsu5twlx = slgv12xzea2.zzpBGItXfub0yWj;
            if (xpjd6zcxsu5twlx != null) {
                HzCpKshMOoaw76hFcbOVRYMeRd(xpjd6zcxsu5twlx, cancellationException);
            }
            vP57smEEh3YGCxzJ vp57smeeh3ygcxzj = slgv12xzea2.V57tEvNfxZVVcOCAOih5PKr;
            if (vp57smeeh3ygcxzj != null) {
                KUYypEB4eNWOZWVDpH(vp57smeeh3ygcxzj, cancellationException);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }
}
