package com.vdodsodjsdt;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class OwOLjYacvvUWq extends IQRsugNnXB80dqGd2fwF implements Serializable {
    public static final OwOLjYacvvUWq ZfQNn8hdWlEQ5cR94249PDsLR;
    public final oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 V57tEvNfxZVVcOCAOih5PKr;

    static {
        oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 oyf7tn6zjrnuneifvj8jbjij8nv9 = oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        ZfQNn8hdWlEQ5cR94249PDsLR = new OwOLjYacvvUWq(oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv);
    }

    public OwOLjYacvvUWq(oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 oyf7tn6zjrnuneifvj8jbjij8nv9) {
        ej6unYlOWMDF.pYmKDYlAmhudp(oyf7tn6zjrnuneifvj8jbjij8nv9, "backing");
        this.V57tEvNfxZVVcOCAOih5PKr = oyf7tn6zjrnuneifvj8jbjij8nv9;
    }

    @Override // com.vdodsodjsdt.IQRsugNnXB80dqGd2fwF
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return this.V57tEvNfxZVVcOCAOih5PKr.HzCpKshMOoaw76hFcbOVRYMeRd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.V57tEvNfxZVVcOCAOih5PKr.VxUQ9tBhpHJ2AAEDNW8sghc4m(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        this.V57tEvNfxZVVcOCAOih5PKr.V57tEvNfxZVVcOCAOih5PKr();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.V57tEvNfxZVVcOCAOih5PKr.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.V57tEvNfxZVVcOCAOih5PKr.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.V57tEvNfxZVVcOCAOih5PKr.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 oyf7tn6zjrnuneifvj8jbjij8nv9 = this.V57tEvNfxZVVcOCAOih5PKr;
        oyf7tn6zjrnuneifvj8jbjij8nv9.getClass();
        return new qZMpZ4Tr49rV(oyf7tn6zjrnuneifvj8jbjij8nv9, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 oyf7tn6zjrnuneifvj8jbjij8nv9 = this.V57tEvNfxZVVcOCAOih5PKr;
        oyf7tn6zjrnuneifvj8jbjij8nv9.V57tEvNfxZVVcOCAOih5PKr();
        int iNSjgqmGjEzuugn2SsG1mZFP = oyf7tn6zjrnuneifvj8jbjij8nv9.NSjgqmGjEzuugn2SsG1mZFP(obj);
        if (iNSjgqmGjEzuugn2SsG1mZFP < 0) {
            return false;
        }
        oyf7tn6zjrnuneifvj8jbjij8nv9.KUYypEB4eNWOZWVDpH(iNSjgqmGjEzuugn2SsG1mZFP);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        this.V57tEvNfxZVVcOCAOih5PKr.V57tEvNfxZVVcOCAOih5PKr();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        this.V57tEvNfxZVVcOCAOih5PKr.V57tEvNfxZVVcOCAOih5PKr();
        return super.retainAll(collection);
    }

    public OwOLjYacvvUWq() {
        this(new oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9());
    }
}
