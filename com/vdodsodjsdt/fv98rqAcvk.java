package com.vdodsodjsdt;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class fv98rqAcvk implements Collection, X7FI9474k7GlT7TZYuRwmu {
    public final Object[] V57tEvNfxZVVcOCAOih5PKr;
    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR;

    public fv98rqAcvk(Object[] objArr, boolean z) {
        this.V57tEvNfxZVVcOCAOih5PKr = objArr;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = z;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return vmp19D2MODlOL.p6bBrs4p3Ly(this.V57tEvNfxZVVcOCAOih5PKr, obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!vmp19D2MODlOL.p6bBrs4p3Ly(this.V57tEvNfxZVVcOCAOih5PKr, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.V57tEvNfxZVVcOCAOih5PKr.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b5p8GpwErDXqVGUollgu(this.V57tEvNfxZVVcOCAOih5PKr);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.V57tEvNfxZVVcOCAOih5PKr.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        ej6unYlOWMDF.pYmKDYlAmhudp(objArr, "array");
        return sGipz63rTUmSj3uFDvOtzihao.GE1sqSYiEYQO2ew7WEZwTtUeS5(this, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.V57tEvNfxZVVcOCAOih5PKr;
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }
}
