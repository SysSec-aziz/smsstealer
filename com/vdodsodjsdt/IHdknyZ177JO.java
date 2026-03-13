package com.vdodsodjsdt;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class IHdknyZ177JO implements Collection {
    public final /* synthetic */ qKXCIJM1cKNm0a1RAvamOBOVLgp V57tEvNfxZVVcOCAOih5PKr;

    public IHdknyZ177JO(qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp) {
        this.V57tEvNfxZVVcOCAOih5PKr = qkxcijm1cknm0a1ravamobovlgp;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.V57tEvNfxZVVcOCAOih5PKr.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.V57tEvNfxZVVcOCAOih5PKr.VxUQ9tBhpHJ2AAEDNW8sghc4m(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.V57tEvNfxZVVcOCAOih5PKr.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new YZGEqxBO83YadVVg(this.V57tEvNfxZVVcOCAOih5PKr, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp = this.V57tEvNfxZVVcOCAOih5PKr;
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = qkxcijm1cknm0a1ravamobovlgp.VxUQ9tBhpHJ2AAEDNW8sghc4m(obj);
        if (iVxUQ9tBhpHJ2AAEDNW8sghc4m < 0) {
            return false;
        }
        qkxcijm1cknm0a1ravamobovlgp.ZLZeBXTMq0zDztBxtRTuCHrapQ(iVxUQ9tBhpHJ2AAEDNW8sghc4m);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp = this.V57tEvNfxZVVcOCAOih5PKr;
        int i = qkxcijm1cknm0a1ravamobovlgp.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(qkxcijm1cknm0a1ravamobovlgp.GI83zq0G8e7zkn(i2))) {
                qkxcijm1cknm0a1ravamobovlgp.ZLZeBXTMq0zDztBxtRTuCHrapQ(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp = this.V57tEvNfxZVVcOCAOih5PKr;
        int i = qkxcijm1cknm0a1ravamobovlgp.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(qkxcijm1cknm0a1ravamobovlgp.GI83zq0G8e7zkn(i2))) {
                qkxcijm1cknm0a1ravamobovlgp.ZLZeBXTMq0zDztBxtRTuCHrapQ(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.V57tEvNfxZVVcOCAOih5PKr.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp = this.V57tEvNfxZVVcOCAOih5PKr;
        int i = qkxcijm1cknm0a1ravamobovlgp.LaeGQIruHQu81hfJldjMOQSVblH3x;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = qkxcijm1cknm0a1ravamobovlgp.GI83zq0G8e7zkn(i2);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp = this.V57tEvNfxZVVcOCAOih5PKr;
        int i = qkxcijm1cknm0a1ravamobovlgp.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = qkxcijm1cknm0a1ravamobovlgp.GI83zq0G8e7zkn(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
