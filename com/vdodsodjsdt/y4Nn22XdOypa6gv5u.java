package com.vdodsodjsdt;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class y4Nn22XdOypa6gv5u implements Iterator, X7FI9474k7GlT7TZYuRwmu {
    public final /* synthetic */ kVCYLXlG6ES6f LaeGQIruHQu81hfJldjMOQSVblH3x;
    public Object V57tEvNfxZVVcOCAOih5PKr;
    public int ZfQNn8hdWlEQ5cR94249PDsLR = -2;

    public y4Nn22XdOypa6gv5u(kVCYLXlG6ES6f kvcylxlg6es6f) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = kvcylxlg6es6f;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        Object objGI83zq0G8e7zkn;
        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        kVCYLXlG6ES6f kvcylxlg6es6f = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i == -2) {
            objGI83zq0G8e7zkn = ((dVgcA03YsKXhpp8H) kvcylxlg6es6f.zzpBGItXfub0yWj).VxUQ9tBhpHJ2AAEDNW8sghc4m();
        } else {
            t95KFNzc2QFE t95kfnzc2qfe = (t95KFNzc2QFE) kvcylxlg6es6f.V57tEvNfxZVVcOCAOih5PKr;
            Object obj = this.V57tEvNfxZVVcOCAOih5PKr;
            ej6unYlOWMDF.p59rPv72J9(obj);
            objGI83zq0G8e7zkn = t95kfnzc2qfe.GI83zq0G8e7zkn(obj);
        }
        this.V57tEvNfxZVVcOCAOih5PKr = objGI83zq0G8e7zkn;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = objGI83zq0G8e7zkn == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR < 0) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        return this.ZfQNn8hdWlEQ5cR94249PDsLR == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR < 0) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.Ca81ebIan1u(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.ZfQNn8hdWlEQ5cR94249PDsLR = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
