package com.vdodsodjsdt;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class DBkPCwg2bk implements Collection, Set, X7FI9474k7GlT7TZYuRwmu {
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int[] V57tEvNfxZVVcOCAOih5PKr = ej6unYlOWMDF.ZfQNn8hdWlEQ5cR94249PDsLR;
    public Object[] ZfQNn8hdWlEQ5cR94249PDsLR = ej6unYlOWMDF.LaeGQIruHQu81hfJldjMOQSVblH3x;

    public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) {
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.V57tEvNfxZVVcOCAOih5PKr;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                vmp19D2MODlOL.HAPpjhiCsV9ONY23505HCBI9IX(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr2, objArr2, i, i4, i2);
            }
            this.ZfQNn8hdWlEQ5cR94249PDsLR[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.V57tEvNfxZVVcOCAOih5PKr = iArr2;
            this.ZfQNn8hdWlEQ5cR94249PDsLR = new Object[i5];
            if (i > 0) {
                vmp19D2MODlOL.HAPpjhiCsV9ONY23505HCBI9IX(0, 0, i, iArr, iArr2);
                vmp19D2MODlOL.tpEo0fy9FaoJYrSFHRfIK6(objArr, this.ZfQNn8hdWlEQ5cR94249PDsLR, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                vmp19D2MODlOL.HAPpjhiCsV9ONY23505HCBI9IX(i, i6, i2, iArr, this.V57tEvNfxZVVcOCAOih5PKr);
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr, this.ZfQNn8hdWlEQ5cR94249PDsLR, i, i6, i2);
            }
        }
        if (i2 != this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new ConcurrentModificationException();
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iKo09zE6UAgwkV;
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (obj == null) {
            iKo09zE6UAgwkV = hRrPPME7ytOB7ba.ko09zE6UAgwkV(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iKo09zE6UAgwkV = hRrPPME7ytOB7ba.ko09zE6UAgwkV(this, obj, iHashCode);
        }
        if (iKo09zE6UAgwkV >= 0) {
            return false;
        }
        int i3 = ~iKo09zE6UAgwkV;
        int[] iArr = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            int[] iArr2 = new int[i4];
            this.V57tEvNfxZVVcOCAOih5PKr = iArr2;
            this.ZfQNn8hdWlEQ5cR94249PDsLR = new Object[i4];
            if (i2 != this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                vmp19D2MODlOL.HAPpjhiCsV9ONY23505HCBI9IX(0, 0, iArr.length, iArr, iArr2);
                vmp19D2MODlOL.tpEo0fy9FaoJYrSFHRfIK6(objArr, this.ZfQNn8hdWlEQ5cR94249PDsLR, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.V57tEvNfxZVVcOCAOih5PKr;
            int i5 = i3 + 1;
            vmp19D2MODlOL.HAPpjhiCsV9ONY23505HCBI9IX(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i2 == i6) {
            int[] iArr4 = this.V57tEvNfxZVVcOCAOih5PKr;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.ZfQNn8hdWlEQ5cR94249PDsLR[i3] = obj;
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        int size = collection.size() + this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int[] iArr = this.V57tEvNfxZVVcOCAOih5PKr;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            int[] iArr2 = new int[size];
            this.V57tEvNfxZVVcOCAOih5PKr = iArr2;
            this.ZfQNn8hdWlEQ5cR94249PDsLR = new Object[size];
            if (i > 0) {
                vmp19D2MODlOL.HAPpjhiCsV9ONY23505HCBI9IX(0, 0, i, iArr, iArr2);
                vmp19D2MODlOL.tpEo0fy9FaoJYrSFHRfIK6(objArr, this.ZfQNn8hdWlEQ5cR94249PDsLR, 0, this.LaeGQIruHQu81hfJldjMOQSVblH3x, 6);
            }
        }
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x != 0) {
            this.V57tEvNfxZVVcOCAOih5PKr = ej6unYlOWMDF.ZfQNn8hdWlEQ5cR94249PDsLR;
            this.ZfQNn8hdWlEQ5cR94249PDsLR = ej6unYlOWMDF.LaeGQIruHQu81hfJldjMOQSVblH3x;
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
        }
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? hRrPPME7ytOB7ba.ko09zE6UAgwkV(this, null, 0) : hRrPPME7ytOB7ba.ko09zE6UAgwkV(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.LaeGQIruHQu81hfJldjMOQSVblH3x != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.ZfQNn8hdWlEQ5cR94249PDsLR[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.V57tEvNfxZVVcOCAOih5PKr;
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new YZGEqxBO83YadVVg(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iKo09zE6UAgwkV = obj == null ? hRrPPME7ytOB7ba.ko09zE6UAgwkV(this, null, 0) : hRrPPME7ytOB7ba.ko09zE6UAgwkV(this, obj, obj.hashCode());
        if (iKo09zE6UAgwkV < 0) {
            return false;
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m(iKo09zE6UAgwkV);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        boolean z = false;
        for (int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x - 1; -1 < i; i--) {
            if (!collection.contains(this.ZfQNn8hdWlEQ5cR94249PDsLR[i])) {
                VxUQ9tBhpHJ2AAEDNW8sghc4m(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return vmp19D2MODlOL.AFOcXGdvoTMuqwiG8tD(this.ZfQNn8hdWlEQ5cR94249PDsLR, 0, this.LaeGQIruHQu81hfJldjMOQSVblH3x);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.LaeGQIruHQu81hfJldjMOQSVblH3x * 14);
        sb.append('{');
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.ZfQNn8hdWlEQ5cR94249PDsLR[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        ej6unYlOWMDF.pYmKDYlAmhudp(objArr, "array");
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(this.ZfQNn8hdWlEQ5cR94249PDsLR, objArr, 0, 0, this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        return objArr;
    }
}
