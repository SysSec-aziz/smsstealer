package com.vdodsodjsdt;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class zTm2nzorN9 extends SFaXeG5AhT5EKsg5pAgE implements RandomAccess, Serializable {
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public Object[] V57tEvNfxZVVcOCAOih5PKr;
    public final CdyQYCBK2awPZQYrStW8hpQgDJcqR ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;
    public final zTm2nzorN9 zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public zTm2nzorN9(Object[] objArr, int i, int i2, zTm2nzorN9 ztm2nzorn9, CdyQYCBK2awPZQYrStW8hpQgDJcqR cdyQYCBK2awPZQYrStW8hpQgDJcqR) {
        ej6unYlOWMDF.pYmKDYlAmhudp(objArr, "backing");
        ej6unYlOWMDF.pYmKDYlAmhudp(cdyQYCBK2awPZQYrStW8hpQgDJcqR, "root");
        this.V57tEvNfxZVVcOCAOih5PKr = objArr;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i2;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = ztm2nzorn9;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = cdyQYCBK2awPZQYrStW8hpQgDJcqR;
        ((AbstractList) this).modCount = ((AbstractList) cdyQYCBK2awPZQYrStW8hpQgDJcqR).modCount;
    }

    public final void GI83zq0G8e7zkn(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        zTm2nzorN9 ztm2nzorn9 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (ztm2nzorn9 != null) {
            ztm2nzorn9.GI83zq0G8e7zkn(i, i2);
        } else {
            CdyQYCBK2awPZQYrStW8hpQgDJcqR cdyQYCBK2awPZQYrStW8hpQgDJcqR = CdyQYCBK2awPZQYrStW8hpQgDJcqR.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ.GI83zq0G8e7zkn(i, i2);
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x -= i2;
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(int i, Object obj) {
        ((AbstractList) this).modCount++;
        CdyQYCBK2awPZQYrStW8hpQgDJcqR cdyQYCBK2awPZQYrStW8hpQgDJcqR = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        zTm2nzorN9 ztm2nzorn9 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (ztm2nzorn9 != null) {
            ztm2nzorn9.LaeGQIruHQu81hfJldjMOQSVblH3x(i, obj);
        } else {
            CdyQYCBK2awPZQYrStW8hpQgDJcqR cdyQYCBK2awPZQYrStW8hpQgDJcqR2 = CdyQYCBK2awPZQYrStW8hpQgDJcqR.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            cdyQYCBK2awPZQYrStW8hpQgDJcqR.LaeGQIruHQu81hfJldjMOQSVblH3x(i, obj);
        }
        this.V57tEvNfxZVVcOCAOih5PKr = cdyQYCBK2awPZQYrStW8hpQgDJcqR.V57tEvNfxZVVcOCAOih5PKr;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x++;
    }

    public final int M9e7PWhFYLD2lOGMker(int i, int i2, Collection collection, boolean z) {
        int iM9e7PWhFYLD2lOGMker;
        zTm2nzorN9 ztm2nzorn9 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (ztm2nzorn9 != null) {
            iM9e7PWhFYLD2lOGMker = ztm2nzorn9.M9e7PWhFYLD2lOGMker(i, i2, collection, z);
        } else {
            CdyQYCBK2awPZQYrStW8hpQgDJcqR cdyQYCBK2awPZQYrStW8hpQgDJcqR = CdyQYCBK2awPZQYrStW8hpQgDJcqR.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            iM9e7PWhFYLD2lOGMker = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.M9e7PWhFYLD2lOGMker(i, i2, collection, z);
        }
        if (iM9e7PWhFYLD2lOGMker > 0) {
            ((AbstractList) this).modCount++;
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x -= iM9e7PWhFYLD2lOGMker;
        return iM9e7PWhFYLD2lOGMker;
    }

    public final Object NSjgqmGjEzuugn2SsG1mZFP(int i) {
        Object objNSjgqmGjEzuugn2SsG1mZFP;
        ((AbstractList) this).modCount++;
        zTm2nzorN9 ztm2nzorn9 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (ztm2nzorn9 != null) {
            objNSjgqmGjEzuugn2SsG1mZFP = ztm2nzorn9.NSjgqmGjEzuugn2SsG1mZFP(i);
        } else {
            CdyQYCBK2awPZQYrStW8hpQgDJcqR cdyQYCBK2awPZQYrStW8hpQgDJcqR = CdyQYCBK2awPZQYrStW8hpQgDJcqR.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            objNSjgqmGjEzuugn2SsG1mZFP = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.NSjgqmGjEzuugn2SsG1mZFP(i);
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x--;
        return objNSjgqmGjEzuugn2SsG1mZFP;
    }

    @Override // com.vdodsodjsdt.SFaXeG5AhT5EKsg5pAgE
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new UnsupportedOperationException();
        }
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        CdyQYCBK2awPZQYrStW8hpQgDJcqR cdyQYCBK2awPZQYrStW8hpQgDJcqR = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        zTm2nzorN9 ztm2nzorn9 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (ztm2nzorn9 != null) {
            ztm2nzorn9.ZfQNn8hdWlEQ5cR94249PDsLR(i, collection, i2);
        } else {
            CdyQYCBK2awPZQYrStW8hpQgDJcqR cdyQYCBK2awPZQYrStW8hpQgDJcqR2 = CdyQYCBK2awPZQYrStW8hpQgDJcqR.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            cdyQYCBK2awPZQYrStW8hpQgDJcqR.ZfQNn8hdWlEQ5cR94249PDsLR(i, collection, i2);
        }
        this.V57tEvNfxZVVcOCAOih5PKr = cdyQYCBK2awPZQYrStW8hpQgDJcqR.V57tEvNfxZVVcOCAOih5PKr;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x += i2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ZLZeBXTMq0zDztBxtRTuCHrapQ();
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        LaeGQIruHQu81hfJldjMOQSVblH3x(this.ZfQNn8hdWlEQ5cR94249PDsLR + this.LaeGQIruHQu81hfJldjMOQSVblH3x, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        ZLZeBXTMq0zDztBxtRTuCHrapQ();
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        int size = collection.size();
        ZfQNn8hdWlEQ5cR94249PDsLR(this.ZfQNn8hdWlEQ5cR94249PDsLR + this.LaeGQIruHQu81hfJldjMOQSVblH3x, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        ZLZeBXTMq0zDztBxtRTuCHrapQ();
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        GI83zq0G8e7zkn(this.ZfQNn8hdWlEQ5cR94249PDsLR, this.LaeGQIruHQu81hfJldjMOQSVblH3x);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.V57tEvNfxZVVcOCAOih5PKr;
            int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(objArr[this.ZfQNn8hdWlEQ5cR94249PDsLR + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i, i2, "index: ", ", size: "));
        }
        return this.V57tEvNfxZVVcOCAOih5PKr[this.ZfQNn8hdWlEQ5cR94249PDsLR + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        Object[] objArr = this.V57tEvNfxZVVcOCAOih5PKr;
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.ZfQNn8hdWlEQ5cR94249PDsLR + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        for (int i = 0; i < this.LaeGQIruHQu81hfJldjMOQSVblH3x; i++) {
            if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr[this.ZfQNn8hdWlEQ5cR94249PDsLR + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        for (int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x - 1; i >= 0; i--) {
            if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr[this.ZfQNn8hdWlEQ5cR94249PDsLR + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        ZLZeBXTMq0zDztBxtRTuCHrapQ();
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            zzpBGItXfub0yWj(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        ZLZeBXTMq0zDztBxtRTuCHrapQ();
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        return M9e7PWhFYLD2lOGMker(this.ZfQNn8hdWlEQ5cR94249PDsLR, this.LaeGQIruHQu81hfJldjMOQSVblH3x, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        ZLZeBXTMq0zDztBxtRTuCHrapQ();
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        return M9e7PWhFYLD2lOGMker(this.ZfQNn8hdWlEQ5cR94249PDsLR, this.LaeGQIruHQu81hfJldjMOQSVblH3x, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        ZLZeBXTMq0zDztBxtRTuCHrapQ();
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.V57tEvNfxZVVcOCAOih5PKr;
        int i3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        sGipz63rTUmSj3uFDvOtzihao.M9e7PWhFYLD2lOGMker(i, i2, this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        return new zTm2nzorN9(this.V57tEvNfxZVVcOCAOih5PKr, this.ZfQNn8hdWlEQ5cR94249PDsLR + i, i2 - i, this, this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        ej6unYlOWMDF.pYmKDYlAmhudp(objArr, "array");
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        int length = objArr.length;
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int i2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.V57tEvNfxZVVcOCAOih5PKr, i2, i + i2, objArr.getClass());
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(this.V57tEvNfxZVVcOCAOih5PKr, objArr, 0, i2, i + i2);
        int i3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        return FLWIoSaHb1q8TqFvEBgPyRGrzvi6.zzpBGItXfub0yWj(this.V57tEvNfxZVVcOCAOih5PKr, this.ZfQNn8hdWlEQ5cR94249PDsLR, this.LaeGQIruHQu81hfJldjMOQSVblH3x, this);
    }

    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        if (((AbstractList) this.ZLZeBXTMq0zDztBxtRTuCHrapQ).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // com.vdodsodjsdt.SFaXeG5AhT5EKsg5pAgE
    public final Object zzpBGItXfub0yWj(int i) {
        ZLZeBXTMq0zDztBxtRTuCHrapQ();
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i, i2, "index: ", ", size: "));
        }
        return NSjgqmGjEzuugn2SsG1mZFP(this.ZfQNn8hdWlEQ5cR94249PDsLR + i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i, i2, "index: ", ", size: "));
        }
        return new x5ekJgxcz7e9(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ZLZeBXTMq0zDztBxtRTuCHrapQ();
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i >= 0 && i <= i2) {
            LaeGQIruHQu81hfJldjMOQSVblH3x(this.ZfQNn8hdWlEQ5cR94249PDsLR + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        ZLZeBXTMq0zDztBxtRTuCHrapQ();
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            ZfQNn8hdWlEQ5cR94249PDsLR(this.ZfQNn8hdWlEQ5cR94249PDsLR + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        Object[] objArr = this.V57tEvNfxZVVcOCAOih5PKr;
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int i2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        return vmp19D2MODlOL.AFOcXGdvoTMuqwiG8tD(objArr, i2, i + i2);
    }
}
