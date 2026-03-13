package com.vdodsodjsdt;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class GgyFD6Dt3dOkcXL extends AbstractCollection implements Collection, X7FI9474k7GlT7TZYuRwmu {
    public final oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 V57tEvNfxZVVcOCAOih5PKr;

    public GgyFD6Dt3dOkcXL(oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 oyf7tn6zjrnuneifvj8jbjij8nv9) {
        this.V57tEvNfxZVVcOCAOih5PKr = oyf7tn6zjrnuneifvj8jbjij8nv9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.V57tEvNfxZVVcOCAOih5PKr.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.V57tEvNfxZVVcOCAOih5PKr.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.V57tEvNfxZVVcOCAOih5PKr.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 oyf7tn6zjrnuneifvj8jbjij8nv9 = this.V57tEvNfxZVVcOCAOih5PKr;
        oyf7tn6zjrnuneifvj8jbjij8nv9.getClass();
        return new qZMpZ4Tr49rV(oyf7tn6zjrnuneifvj8jbjij8nv9, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 oyf7tn6zjrnuneifvj8jbjij8nv9 = this.V57tEvNfxZVVcOCAOih5PKr;
        oyf7tn6zjrnuneifvj8jbjij8nv9.V57tEvNfxZVVcOCAOih5PKr();
        int iGI83zq0G8e7zkn = oyf7tn6zjrnuneifvj8jbjij8nv9.GI83zq0G8e7zkn(obj);
        if (iGI83zq0G8e7zkn < 0) {
            return false;
        }
        oyf7tn6zjrnuneifvj8jbjij8nv9.KUYypEB4eNWOZWVDpH(iGI83zq0G8e7zkn);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        this.V57tEvNfxZVVcOCAOih5PKr.V57tEvNfxZVVcOCAOih5PKr();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        this.V57tEvNfxZVVcOCAOih5PKr.V57tEvNfxZVVcOCAOih5PKr();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.V57tEvNfxZVVcOCAOih5PKr.HzCpKshMOoaw76hFcbOVRYMeRd;
    }
}
