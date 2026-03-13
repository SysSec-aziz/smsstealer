package com.vdodsodjsdt;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Oki2m5F921vF extends ZWTS2K4yymjCBrc {
    public static final /* synthetic */ AtomicReferenceFieldUpdater VxUQ9tBhpHJ2AAEDNW8sghc4m = AtomicReferenceFieldUpdater.newUpdater(Oki2m5F921vF.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = zonOxHotd3BwAPJcwqr6I6uQNngg4.VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public abstract aqhhl68tQrgIjcMGB3dY2YLK3vN V57tEvNfxZVVcOCAOih5PKr(Object obj);

    @Override // com.vdodsodjsdt.ZWTS2K4yymjCBrc
    public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        aqhhl68tQrgIjcMGB3dY2YLK3vN aqhhl68tqrgijcmgb3dy2ylk3vn = zonOxHotd3BwAPJcwqr6I6uQNngg4.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (obj2 == aqhhl68tqrgijcmgb3dy2ylk3vn) {
            aqhhl68tQrgIjcMGB3dY2YLK3vN aqhhl68tqrgijcmgb3dy2ylk3vnV57tEvNfxZVVcOCAOih5PKr = V57tEvNfxZVVcOCAOih5PKr(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == aqhhl68tqrgijcmgb3dy2ylk3vn) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, aqhhl68tqrgijcmgb3dy2ylk3vn, aqhhl68tqrgijcmgb3dy2ylk3vnV57tEvNfxZVVcOCAOih5PKr)) {
                        obj2 = aqhhl68tqrgijcmgb3dy2ylk3vnV57tEvNfxZVVcOCAOih5PKr;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != aqhhl68tqrgijcmgb3dy2ylk3vn) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        zzpBGItXfub0yWj(obj, obj2);
        return obj2;
    }

    public abstract void zzpBGItXfub0yWj(Object obj, Object obj2);
}
