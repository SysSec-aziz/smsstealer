package com.vdodsodjsdt;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class D0vuyCrFBAWQbRciLh0X {
    public static final /* synthetic */ AtomicReferenceFieldUpdater VxUQ9tBhpHJ2AAEDNW8sghc4m = AtomicReferenceFieldUpdater.newUpdater(D0vuyCrFBAWQbRciLh0X.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater zzpBGItXfub0yWj = AtomicReferenceFieldUpdater.newUpdater(D0vuyCrFBAWQbRciLh0X.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public D0vuyCrFBAWQbRciLh0X(fw6arzf1nhE87EaA fw6arzf1nhe87eaa) {
        this._prev$volatile = fw6arzf1nhe87eaa;
    }

    public abstract boolean V57tEvNfxZVVcOCAOih5PKr();

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        zzpBGItXfub0yWj.set(this, null);
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR() {
        D0vuyCrFBAWQbRciLh0X d0vuyCrFBAWQbRciLh0XZzpBGItXfub0yWj;
        if (zzpBGItXfub0yWj() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zzpBGItXfub0yWj;
            D0vuyCrFBAWQbRciLh0X d0vuyCrFBAWQbRciLh0X = (D0vuyCrFBAWQbRciLh0X) atomicReferenceFieldUpdater.get(this);
            while (d0vuyCrFBAWQbRciLh0X != null && d0vuyCrFBAWQbRciLh0X.V57tEvNfxZVVcOCAOih5PKr()) {
                d0vuyCrFBAWQbRciLh0X = (D0vuyCrFBAWQbRciLh0X) atomicReferenceFieldUpdater.get(d0vuyCrFBAWQbRciLh0X);
            }
            D0vuyCrFBAWQbRciLh0X d0vuyCrFBAWQbRciLh0XZzpBGItXfub0yWj2 = zzpBGItXfub0yWj();
            ej6unYlOWMDF.p59rPv72J9(d0vuyCrFBAWQbRciLh0XZzpBGItXfub0yWj2);
            while (d0vuyCrFBAWQbRciLh0XZzpBGItXfub0yWj2.V57tEvNfxZVVcOCAOih5PKr() && (d0vuyCrFBAWQbRciLh0XZzpBGItXfub0yWj = d0vuyCrFBAWQbRciLh0XZzpBGItXfub0yWj2.zzpBGItXfub0yWj()) != null) {
                d0vuyCrFBAWQbRciLh0XZzpBGItXfub0yWj2 = d0vuyCrFBAWQbRciLh0XZzpBGItXfub0yWj;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(d0vuyCrFBAWQbRciLh0XZzpBGItXfub0yWj2);
                D0vuyCrFBAWQbRciLh0X d0vuyCrFBAWQbRciLh0X2 = ((D0vuyCrFBAWQbRciLh0X) obj) == null ? null : d0vuyCrFBAWQbRciLh0X;
                while (!atomicReferenceFieldUpdater.compareAndSet(d0vuyCrFBAWQbRciLh0XZzpBGItXfub0yWj2, obj, d0vuyCrFBAWQbRciLh0X2)) {
                    if (atomicReferenceFieldUpdater.get(d0vuyCrFBAWQbRciLh0XZzpBGItXfub0yWj2) != obj) {
                        break;
                    }
                }
            }
            if (d0vuyCrFBAWQbRciLh0X != null) {
                VxUQ9tBhpHJ2AAEDNW8sghc4m.set(d0vuyCrFBAWQbRciLh0X, d0vuyCrFBAWQbRciLh0XZzpBGItXfub0yWj2);
            }
            if (!d0vuyCrFBAWQbRciLh0XZzpBGItXfub0yWj2.V57tEvNfxZVVcOCAOih5PKr() || d0vuyCrFBAWQbRciLh0XZzpBGItXfub0yWj2.zzpBGItXfub0yWj() == null) {
                if (d0vuyCrFBAWQbRciLh0X == null || !d0vuyCrFBAWQbRciLh0X.V57tEvNfxZVVcOCAOih5PKr()) {
                    return;
                }
            }
        }
    }

    public final D0vuyCrFBAWQbRciLh0X zzpBGItXfub0yWj() {
        Object obj = VxUQ9tBhpHJ2AAEDNW8sghc4m.get(this);
        if (obj == KfeOQNOupsCg6878zi4e.zzpBGItXfub0yWj) {
            return null;
        }
        return (D0vuyCrFBAWQbRciLh0X) obj;
    }
}
