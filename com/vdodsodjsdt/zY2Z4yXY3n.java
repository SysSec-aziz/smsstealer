package com.vdodsodjsdt;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class zY2Z4yXY3n implements Set {
    public final /* synthetic */ qKXCIJM1cKNm0a1RAvamOBOVLgp V57tEvNfxZVVcOCAOih5PKr;

    public zY2Z4yXY3n(qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp) {
        this.V57tEvNfxZVVcOCAOih5PKr = qkxcijm1cknm0a1ravamobovlgp;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.V57tEvNfxZVVcOCAOih5PKr.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.V57tEvNfxZVVcOCAOih5PKr.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.V57tEvNfxZVVcOCAOih5PKr.M9e7PWhFYLD2lOGMker(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp = this.V57tEvNfxZVVcOCAOih5PKr;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (qkxcijm1cknm0a1ravamobovlgp.LaeGQIruHQu81hfJldjMOQSVblH3x == set.size()) {
                return qkxcijm1cknm0a1ravamobovlgp.M9e7PWhFYLD2lOGMker(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp = this.V57tEvNfxZVVcOCAOih5PKr;
        int iHashCode = 0;
        for (int i = qkxcijm1cknm0a1ravamobovlgp.LaeGQIruHQu81hfJldjMOQSVblH3x - 1; i >= 0; i--) {
            Object objZIvmSL0wzmmKGc3X39b2Gw2mUGE = qkxcijm1cknm0a1ravamobovlgp.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i);
            iHashCode += objZIvmSL0wzmmKGc3X39b2Gw2mUGE == null ? 0 : objZIvmSL0wzmmKGc3X39b2Gw2mUGE.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.V57tEvNfxZVVcOCAOih5PKr.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new YZGEqxBO83YadVVg(this.V57tEvNfxZVVcOCAOih5PKr, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp = this.V57tEvNfxZVVcOCAOih5PKr;
        int iZfQNn8hdWlEQ5cR94249PDsLR = qkxcijm1cknm0a1ravamobovlgp.ZfQNn8hdWlEQ5cR94249PDsLR(obj);
        if (iZfQNn8hdWlEQ5cR94249PDsLR < 0) {
            return false;
        }
        qkxcijm1cknm0a1ravamobovlgp.ZLZeBXTMq0zDztBxtRTuCHrapQ(iZfQNn8hdWlEQ5cR94249PDsLR);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.V57tEvNfxZVVcOCAOih5PKr.HzCpKshMOoaw76hFcbOVRYMeRd(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp = this.V57tEvNfxZVVcOCAOih5PKr;
        int i = qkxcijm1cknm0a1ravamobovlgp.LaeGQIruHQu81hfJldjMOQSVblH3x;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(qkxcijm1cknm0a1ravamobovlgp.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i2))) {
                qkxcijm1cknm0a1ravamobovlgp.ZLZeBXTMq0zDztBxtRTuCHrapQ(i2);
            }
        }
        return i != qkxcijm1cknm0a1ravamobovlgp.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.V57tEvNfxZVVcOCAOih5PKr.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp = this.V57tEvNfxZVVcOCAOih5PKr;
        int i = qkxcijm1cknm0a1ravamobovlgp.LaeGQIruHQu81hfJldjMOQSVblH3x;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = qkxcijm1cknm0a1ravamobovlgp.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i2);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp = this.V57tEvNfxZVVcOCAOih5PKr;
        int i = qkxcijm1cknm0a1ravamobovlgp.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = qkxcijm1cknm0a1ravamobovlgp.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
