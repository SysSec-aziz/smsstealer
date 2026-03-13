package com.vdodsodjsdt;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class CdyQYCBK2awPZQYrStW8hpQgDJcqR extends SFaXeG5AhT5EKsg5pAgE implements RandomAccess, Serializable {
    public static final CdyQYCBK2awPZQYrStW8hpQgDJcqR zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public Object[] V57tEvNfxZVVcOCAOih5PKr;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;

    static {
        CdyQYCBK2awPZQYrStW8hpQgDJcqR cdyQYCBK2awPZQYrStW8hpQgDJcqR = new CdyQYCBK2awPZQYrStW8hpQgDJcqR(0);
        cdyQYCBK2awPZQYrStW8hpQgDJcqR.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
        zIvmSL0wzmmKGc3X39b2Gw2mUGE = cdyQYCBK2awPZQYrStW8hpQgDJcqR;
    }

    public CdyQYCBK2awPZQYrStW8hpQgDJcqR(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.V57tEvNfxZVVcOCAOih5PKr = new Object[i];
    }

    public final void GI83zq0G8e7zkn(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.V57tEvNfxZVVcOCAOih5PKr;
        vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr, objArr, i, i + i2, this.ZfQNn8hdWlEQ5cR94249PDsLR);
        Object[] objArr2 = this.V57tEvNfxZVVcOCAOih5PKr;
        int i3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.HVEwbdULInpTNa0IG(objArr2, i3 - i2, i3);
        this.ZfQNn8hdWlEQ5cR94249PDsLR -= i2;
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(int i, Object obj) {
        ((AbstractList) this).modCount++;
        ZLZeBXTMq0zDztBxtRTuCHrapQ(i, 1);
        this.V57tEvNfxZVVcOCAOih5PKr[i] = obj;
    }

    public final int M9e7PWhFYLD2lOGMker(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.V57tEvNfxZVVcOCAOih5PKr[i5]) == z) {
                Object[] objArr = this.V57tEvNfxZVVcOCAOih5PKr;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.V57tEvNfxZVVcOCAOih5PKr;
        vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr2, objArr2, i + i4, i2 + i, this.ZfQNn8hdWlEQ5cR94249PDsLR);
        Object[] objArr3 = this.V57tEvNfxZVVcOCAOih5PKr;
        int i7 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.HVEwbdULInpTNa0IG(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR -= i6;
        return i6;
    }

    public final Object NSjgqmGjEzuugn2SsG1mZFP(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.V57tEvNfxZVVcOCAOih5PKr;
        Object obj = objArr[i];
        vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr, objArr, i, i + 1, this.ZfQNn8hdWlEQ5cR94249PDsLR);
        Object[] objArr2 = this.V57tEvNfxZVVcOCAOih5PKr;
        int i2 = this.ZfQNn8hdWlEQ5cR94249PDsLR - 1;
        ej6unYlOWMDF.pYmKDYlAmhudp(objArr2, "<this>");
        objArr2[i2] = null;
        this.ZfQNn8hdWlEQ5cR94249PDsLR--;
        return obj;
    }

    @Override // com.vdodsodjsdt.SFaXeG5AhT5EKsg5pAgE
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(int i, int i2) {
        int i3 = this.ZfQNn8hdWlEQ5cR94249PDsLR + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i4);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objArrCopyOf, "copyOf(...)");
            this.V57tEvNfxZVVcOCAOih5PKr = objArrCopyOf;
        }
        Object[] objArr2 = this.V57tEvNfxZVVcOCAOih5PKr;
        vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr2, objArr2, i + i2, i, this.ZfQNn8hdWlEQ5cR94249PDsLR);
        this.ZfQNn8hdWlEQ5cR94249PDsLR += i2;
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        ZLZeBXTMq0zDztBxtRTuCHrapQ(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.V57tEvNfxZVVcOCAOih5PKr[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        ((AbstractList) this).modCount++;
        ZLZeBXTMq0zDztBxtRTuCHrapQ(i, 1);
        this.V57tEvNfxZVVcOCAOih5PKr[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        int size = collection.size();
        ZfQNn8hdWlEQ5cR94249PDsLR(this.ZfQNn8hdWlEQ5cR94249PDsLR, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        GI83zq0G8e7zkn(0, this.ZfQNn8hdWlEQ5cR94249PDsLR);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.V57tEvNfxZVVcOCAOih5PKr;
            int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i, i2, "index: ", ", size: "));
        }
        return this.V57tEvNfxZVVcOCAOih5PKr[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.V57tEvNfxZVVcOCAOih5PKr;
        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.ZfQNn8hdWlEQ5cR94249PDsLR; i++) {
            if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.ZfQNn8hdWlEQ5cR94249PDsLR - 1; i >= 0; i--) {
            if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr[i], obj)) {
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
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        return M9e7PWhFYLD2lOGMker(0, this.ZfQNn8hdWlEQ5cR94249PDsLR, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        return M9e7PWhFYLD2lOGMker(0, this.ZfQNn8hdWlEQ5cR94249PDsLR, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        int i2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.V57tEvNfxZVVcOCAOih5PKr;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        sGipz63rTUmSj3uFDvOtzihao.M9e7PWhFYLD2lOGMker(i, i2, this.ZfQNn8hdWlEQ5cR94249PDsLR);
        return new zTm2nzorN9(this.V57tEvNfxZVVcOCAOih5PKr, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        ej6unYlOWMDF.pYmKDYlAmhudp(objArr, "array");
        int length = objArr.length;
        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.V57tEvNfxZVVcOCAOih5PKr, 0, i, objArr.getClass());
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(this.V57tEvNfxZVVcOCAOih5PKr, objArr, 0, 0, i);
        int i2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return FLWIoSaHb1q8TqFvEBgPyRGrzvi6.zzpBGItXfub0yWj(this.V57tEvNfxZVVcOCAOih5PKr, 0, this.ZfQNn8hdWlEQ5cR94249PDsLR, this);
    }

    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.vdodsodjsdt.SFaXeG5AhT5EKsg5pAgE
    public final Object zzpBGItXfub0yWj(int i) {
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        int i2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i, i2, "index: ", ", size: "));
        }
        return NSjgqmGjEzuugn2SsG1mZFP(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i, i2, "index: ", ", size: "));
        }
        return new x5ekJgxcz7e9(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        int i2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            ZfQNn8hdWlEQ5cR94249PDsLR(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        int i2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i >= 0 && i <= i2) {
            ((AbstractList) this).modCount++;
            ZLZeBXTMq0zDztBxtRTuCHrapQ(i, 1);
            this.V57tEvNfxZVVcOCAOih5PKr[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return vmp19D2MODlOL.AFOcXGdvoTMuqwiG8tD(this.V57tEvNfxZVVcOCAOih5PKr, 0, this.ZfQNn8hdWlEQ5cR94249PDsLR);
    }
}
