package com.vdodsodjsdt;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class wuozGDdFQbclf3NoOJ1I implements Iterator, X7FI9474k7GlT7TZYuRwmu {
    public final Iterator V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ kVCYLXlG6ES6f ZfQNn8hdWlEQ5cR94249PDsLR;

    public wuozGDdFQbclf3NoOJ1I(kVCYLXlG6ES6f kvcylxlg6es6f) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = kvcylxlg6es6f;
        this.V57tEvNfxZVVcOCAOih5PKr = ((Iterable) ((YGu77UzqV7U) kvcylxlg6es6f.zzpBGItXfub0yWj).zzpBGItXfub0yWj).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.V57tEvNfxZVVcOCAOih5PKr.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((t95KFNzc2QFE) this.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr).GI83zq0G8e7zkn(this.V57tEvNfxZVVcOCAOih5PKr.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
