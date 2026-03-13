package com.vdodsodjsdt;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class I7XxpUEW0N implements Collection, X7FI9474k7GlT7TZYuRwmu {
    public abstract int VxUQ9tBhpHJ2AAEDNW8sghc4m();

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
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return VxUQ9tBhpHJ2AAEDNW8sghc4m() == 0;
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
    public final /* bridge */ int size() {
        return VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return sGipz63rTUmSj3uFDvOtzihao.zOk739gUM7zIZC25HHUxoiyixWFjn(this);
    }

    public final String toString() {
        return gYXV3FZbh17i6ocMo1T.rE05n5RsRkyWKIeA9cmLXAKv4Hze(this, ", ", "[", "]", new t95KFNzc2QFE(0, this), 24);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        ej6unYlOWMDF.pYmKDYlAmhudp(objArr, "array");
        return sGipz63rTUmSj3uFDvOtzihao.GE1sqSYiEYQO2ew7WEZwTtUeS5(this, objArr);
    }
}
