package com.vdodsodjsdt;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class rOiKJVDHPqqeCfn extends SFaXeG5AhT5EKsg5pAgE {
    public static final Object[] zIvmSL0wzmmKGc3X39b2Gw2mUGE = new Object[0];
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public Object[] ZfQNn8hdWlEQ5cR94249PDsLR = zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public final void GI83zq0G8e7zkn() {
        ((AbstractList) this).modCount++;
    }

    public final int LaeGQIruHQu81hfJldjMOQSVblH3x(int i) {
        ej6unYlOWMDF.pYmKDYlAmhudp(this.ZfQNn8hdWlEQ5cR94249PDsLR, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int NSjgqmGjEzuugn2SsG1mZFP(int i) {
        Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.ZfQNn8hdWlEQ5cR94249PDsLR.length;
        while (i < length && it.hasNext()) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR[i] = it.next();
            i++;
        }
        int i2 = this.V57tEvNfxZVVcOCAOih5PKr;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR[i3] = it.next();
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = collection.size() + this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // com.vdodsodjsdt.SFaXeG5AhT5EKsg5pAgE
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(int i, int i2) {
        if (i < i2) {
            vmp19D2MODlOL.BDoqAMf0rlMRAnVghjC4qjG(this.ZfQNn8hdWlEQ5cR94249PDsLR, null, i, i2);
            return;
        }
        Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        vmp19D2MODlOL.BDoqAMf0rlMRAnVghjC4qjG(objArr, null, i, objArr.length);
        vmp19D2MODlOL.BDoqAMf0rlMRAnVghjC4qjG(this.ZfQNn8hdWlEQ5cR94249PDsLR, null, 0, i2);
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            if (i < 10) {
                i = 10;
            }
            this.ZfQNn8hdWlEQ5cR94249PDsLR = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr, objArr2, 0, this.V57tEvNfxZVVcOCAOih5PKr, objArr.length);
        Object[] objArr3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int length2 = objArr3.length;
        int i3 = this.V57tEvNfxZVVcOCAOih5PKr;
        vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr3, objArr2, length2 - i3, 0, i3);
        this.V57tEvNfxZVVcOCAOih5PKr = 0;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i, i2, "index: ", ", size: "));
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        GI83zq0G8e7zkn();
        ZfQNn8hdWlEQ5cR94249PDsLR(this.LaeGQIruHQu81hfJldjMOQSVblH3x + 1);
        int iNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr + i);
        int i3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i < ((i3 + 1) >> 1)) {
            if (iNSjgqmGjEzuugn2SsG1mZFP == 0) {
                Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                ej6unYlOWMDF.pYmKDYlAmhudp(objArr, "<this>");
                iNSjgqmGjEzuugn2SsG1mZFP = objArr.length;
            }
            int i4 = iNSjgqmGjEzuugn2SsG1mZFP - 1;
            int i5 = this.V57tEvNfxZVVcOCAOih5PKr;
            if (i5 == 0) {
                Object[] objArr2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                ej6unYlOWMDF.pYmKDYlAmhudp(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i5 - 1;
            }
            int i6 = this.V57tEvNfxZVVcOCAOih5PKr;
            if (i4 >= i6) {
                Object[] objArr3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                objArr3[length] = objArr3[i6];
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr3, objArr3, i6, i6 + 1, i4 + 1);
            } else {
                Object[] objArr4 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr4, objArr4, i6 - 1, i6, objArr4.length);
                Object[] objArr5 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                objArr5[objArr5.length - 1] = objArr5[0];
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr5, objArr5, 0, 1, i4 + 1);
            }
            this.ZfQNn8hdWlEQ5cR94249PDsLR[i4] = obj;
            this.V57tEvNfxZVVcOCAOih5PKr = length;
        } else {
            int iNSjgqmGjEzuugn2SsG1mZFP2 = NSjgqmGjEzuugn2SsG1mZFP(i3 + this.V57tEvNfxZVVcOCAOih5PKr);
            if (iNSjgqmGjEzuugn2SsG1mZFP < iNSjgqmGjEzuugn2SsG1mZFP2) {
                Object[] objArr6 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr6, objArr6, iNSjgqmGjEzuugn2SsG1mZFP + 1, iNSjgqmGjEzuugn2SsG1mZFP, iNSjgqmGjEzuugn2SsG1mZFP2);
            } else {
                Object[] objArr7 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr7, objArr7, 1, 0, iNSjgqmGjEzuugn2SsG1mZFP2);
                Object[] objArr8 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                objArr8[0] = objArr8[objArr8.length - 1];
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr8, objArr8, iNSjgqmGjEzuugn2SsG1mZFP + 1, iNSjgqmGjEzuugn2SsG1mZFP, objArr8.length - 1);
            }
            this.ZfQNn8hdWlEQ5cR94249PDsLR[iNSjgqmGjEzuugn2SsG1mZFP] = obj;
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i, i2, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return addAll(collection);
        }
        GI83zq0G8e7zkn();
        ZfQNn8hdWlEQ5cR94249PDsLR(collection.size() + this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        int iNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP(this.LaeGQIruHQu81hfJldjMOQSVblH3x + this.V57tEvNfxZVVcOCAOih5PKr);
        int iNSjgqmGjEzuugn2SsG1mZFP2 = NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr + i);
        int size = collection.size();
        if (i >= ((this.LaeGQIruHQu81hfJldjMOQSVblH3x + 1) >> 1)) {
            int i3 = iNSjgqmGjEzuugn2SsG1mZFP2 + size;
            if (iNSjgqmGjEzuugn2SsG1mZFP2 < iNSjgqmGjEzuugn2SsG1mZFP) {
                int i4 = size + iNSjgqmGjEzuugn2SsG1mZFP;
                Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (i4 <= objArr.length) {
                    vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr, objArr, i3, iNSjgqmGjEzuugn2SsG1mZFP2, iNSjgqmGjEzuugn2SsG1mZFP);
                } else if (i3 >= objArr.length) {
                    vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr, objArr, i3 - objArr.length, iNSjgqmGjEzuugn2SsG1mZFP2, iNSjgqmGjEzuugn2SsG1mZFP);
                } else {
                    int length = iNSjgqmGjEzuugn2SsG1mZFP - (i4 - objArr.length);
                    vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr, objArr, 0, length, iNSjgqmGjEzuugn2SsG1mZFP);
                    Object[] objArr2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                    vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr2, objArr2, i3, iNSjgqmGjEzuugn2SsG1mZFP2, length);
                }
            } else {
                Object[] objArr3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr3, objArr3, size, 0, iNSjgqmGjEzuugn2SsG1mZFP);
                Object[] objArr4 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (i3 >= objArr4.length) {
                    vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr4, objArr4, i3 - objArr4.length, iNSjgqmGjEzuugn2SsG1mZFP2, objArr4.length);
                } else {
                    vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                    vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr5, objArr5, i3, iNSjgqmGjEzuugn2SsG1mZFP2, objArr5.length - size);
                }
            }
            V57tEvNfxZVVcOCAOih5PKr(iNSjgqmGjEzuugn2SsG1mZFP2, collection);
            return true;
        }
        int i5 = this.V57tEvNfxZVVcOCAOih5PKr;
        int length2 = i5 - size;
        if (iNSjgqmGjEzuugn2SsG1mZFP2 < i5) {
            Object[] objArr6 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr6, objArr6, length2, i5, objArr6.length);
            if (size >= iNSjgqmGjEzuugn2SsG1mZFP2) {
                Object[] objArr7 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr7, objArr7, objArr7.length - size, 0, iNSjgqmGjEzuugn2SsG1mZFP2);
            } else {
                Object[] objArr8 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr9, objArr9, 0, size, iNSjgqmGjEzuugn2SsG1mZFP2);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr10, objArr10, length2, i5, iNSjgqmGjEzuugn2SsG1mZFP2);
        } else {
            Object[] objArr11 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            length2 += objArr11.length;
            int i6 = iNSjgqmGjEzuugn2SsG1mZFP2 - i5;
            int length3 = objArr11.length - length2;
            if (length3 >= i6) {
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr11, objArr11, length2, i5, iNSjgqmGjEzuugn2SsG1mZFP2);
            } else {
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr11, objArr11, length2, i5, i5 + length3);
                Object[] objArr12 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr12, objArr12, 0, this.V57tEvNfxZVVcOCAOih5PKr + length3, iNSjgqmGjEzuugn2SsG1mZFP2);
            }
        }
        this.V57tEvNfxZVVcOCAOih5PKr = length2;
        V57tEvNfxZVVcOCAOih5PKr(zIvmSL0wzmmKGc3X39b2Gw2mUGE(iNSjgqmGjEzuugn2SsG1mZFP2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        GI83zq0G8e7zkn();
        ZfQNn8hdWlEQ5cR94249PDsLR(this.LaeGQIruHQu81hfJldjMOQSVblH3x + 1);
        int length = this.V57tEvNfxZVVcOCAOih5PKr;
        if (length == 0) {
            Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            ej6unYlOWMDF.pYmKDYlAmhudp(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR[i] = obj;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x++;
    }

    public final void addLast(Object obj) {
        GI83zq0G8e7zkn();
        ZfQNn8hdWlEQ5cR94249PDsLR(VxUQ9tBhpHJ2AAEDNW8sghc4m() + 1);
        this.ZfQNn8hdWlEQ5cR94249PDsLR[NSjgqmGjEzuugn2SsG1mZFP(VxUQ9tBhpHJ2AAEDNW8sghc4m() + this.V57tEvNfxZVVcOCAOih5PKr)] = obj;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = VxUQ9tBhpHJ2AAEDNW8sghc4m() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            GI83zq0G8e7zkn();
            ZLZeBXTMq0zDztBxtRTuCHrapQ(this.V57tEvNfxZVVcOCAOih5PKr, NSjgqmGjEzuugn2SsG1mZFP(VxUQ9tBhpHJ2AAEDNW8sghc4m() + this.V57tEvNfxZVVcOCAOih5PKr));
        }
        this.V57tEvNfxZVVcOCAOih5PKr = 0;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m();
        if (i < 0 || i >= iVxUQ9tBhpHJ2AAEDNW8sghc4m) {
            throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i, iVxUQ9tBhpHJ2AAEDNW8sghc4m, "index: ", ", size: "));
        }
        return this.ZfQNn8hdWlEQ5cR94249PDsLR[NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP(VxUQ9tBhpHJ2AAEDNW8sghc4m() + this.V57tEvNfxZVVcOCAOih5PKr);
        int length = this.V57tEvNfxZVVcOCAOih5PKr;
        if (length < iNSjgqmGjEzuugn2SsG1mZFP) {
            while (length < iNSjgqmGjEzuugn2SsG1mZFP) {
                if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(obj, this.ZfQNn8hdWlEQ5cR94249PDsLR[length])) {
                    i = this.V57tEvNfxZVVcOCAOih5PKr;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iNSjgqmGjEzuugn2SsG1mZFP) {
            return -1;
        }
        int length2 = this.ZfQNn8hdWlEQ5cR94249PDsLR.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iNSjgqmGjEzuugn2SsG1mZFP; i2++) {
                    if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(obj, this.ZfQNn8hdWlEQ5cR94249PDsLR[i2])) {
                        length = i2 + this.ZfQNn8hdWlEQ5cR94249PDsLR.length;
                        i = this.V57tEvNfxZVVcOCAOih5PKr;
                    }
                }
                return -1;
            }
            if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(obj, this.ZfQNn8hdWlEQ5cR94249PDsLR[length])) {
                i = this.V57tEvNfxZVVcOCAOih5PKr;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return VxUQ9tBhpHJ2AAEDNW8sghc4m() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP(this.LaeGQIruHQu81hfJldjMOQSVblH3x + this.V57tEvNfxZVVcOCAOih5PKr);
        int i2 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i2 < iNSjgqmGjEzuugn2SsG1mZFP) {
            length = iNSjgqmGjEzuugn2SsG1mZFP - 1;
            if (i2 <= length) {
                while (!ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(obj, this.ZfQNn8hdWlEQ5cR94249PDsLR[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.V57tEvNfxZVVcOCAOih5PKr;
                return length - i;
            }
            return -1;
        }
        if (i2 > iNSjgqmGjEzuugn2SsG1mZFP) {
            int i3 = iNSjgqmGjEzuugn2SsG1mZFP - 1;
            while (true) {
                if (-1 >= i3) {
                    Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                    ej6unYlOWMDF.pYmKDYlAmhudp(objArr, "<this>");
                    length = objArr.length - 1;
                    int i4 = this.V57tEvNfxZVVcOCAOih5PKr;
                    if (i4 <= length) {
                        while (!ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(obj, this.ZfQNn8hdWlEQ5cR94249PDsLR[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.V57tEvNfxZVVcOCAOih5PKr;
                    }
                } else {
                    if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(obj, this.ZfQNn8hdWlEQ5cR94249PDsLR[i3])) {
                        length = i3 + this.ZfQNn8hdWlEQ5cR94249PDsLR.length;
                        i = this.V57tEvNfxZVVcOCAOih5PKr;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        zzpBGItXfub0yWj(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iNSjgqmGjEzuugn2SsG1mZFP;
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.ZfQNn8hdWlEQ5cR94249PDsLR.length != 0) {
            int iNSjgqmGjEzuugn2SsG1mZFP2 = NSjgqmGjEzuugn2SsG1mZFP(VxUQ9tBhpHJ2AAEDNW8sghc4m() + this.V57tEvNfxZVVcOCAOih5PKr);
            int i = this.V57tEvNfxZVVcOCAOih5PKr;
            if (i < iNSjgqmGjEzuugn2SsG1mZFP2) {
                iNSjgqmGjEzuugn2SsG1mZFP = i;
                while (i < iNSjgqmGjEzuugn2SsG1mZFP2) {
                    Object obj = this.ZfQNn8hdWlEQ5cR94249PDsLR[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.ZfQNn8hdWlEQ5cR94249PDsLR[iNSjgqmGjEzuugn2SsG1mZFP] = obj;
                        iNSjgqmGjEzuugn2SsG1mZFP++;
                    }
                    i++;
                }
                vmp19D2MODlOL.BDoqAMf0rlMRAnVghjC4qjG(this.ZfQNn8hdWlEQ5cR94249PDsLR, null, iNSjgqmGjEzuugn2SsG1mZFP, iNSjgqmGjEzuugn2SsG1mZFP2);
            } else {
                int length = this.ZfQNn8hdWlEQ5cR94249PDsLR.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.ZfQNn8hdWlEQ5cR94249PDsLR[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP(i2);
                for (int i3 = 0; i3 < iNSjgqmGjEzuugn2SsG1mZFP2; i3++) {
                    Object[] objArr2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.ZfQNn8hdWlEQ5cR94249PDsLR[iNSjgqmGjEzuugn2SsG1mZFP] = obj3;
                        iNSjgqmGjEzuugn2SsG1mZFP = LaeGQIruHQu81hfJldjMOQSVblH3x(iNSjgqmGjEzuugn2SsG1mZFP);
                    }
                }
                z = z2;
            }
            if (z) {
                GI83zq0G8e7zkn();
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = zIvmSL0wzmmKGc3X39b2Gw2mUGE(iNSjgqmGjEzuugn2SsG1mZFP - this.V57tEvNfxZVVcOCAOih5PKr);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        GI83zq0G8e7zkn();
        Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i = this.V57tEvNfxZVVcOCAOih5PKr;
        Object obj = objArr[i];
        objArr[i] = null;
        this.V57tEvNfxZVVcOCAOih5PKr = LaeGQIruHQu81hfJldjMOQSVblH3x(i);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = VxUQ9tBhpHJ2AAEDNW8sghc4m() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        GI83zq0G8e7zkn();
        int iNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP(kzhIjSJtHYuLoiUgKqSRIck3W8.rERAmyEtGV6ANGszuKcQI(this) + this.V57tEvNfxZVVcOCAOih5PKr);
        Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        Object obj = objArr[iNSjgqmGjEzuugn2SsG1mZFP];
        objArr[iNSjgqmGjEzuugn2SsG1mZFP] = null;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = VxUQ9tBhpHJ2AAEDNW8sghc4m() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        sGipz63rTUmSj3uFDvOtzihao.M9e7PWhFYLD2lOGMker(i, i2, this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            clear();
            return;
        }
        if (i3 == 1) {
            zzpBGItXfub0yWj(i);
            return;
        }
        GI83zq0G8e7zkn();
        if (i < this.LaeGQIruHQu81hfJldjMOQSVblH3x - i2) {
            int iNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr + (i - 1));
            int iNSjgqmGjEzuugn2SsG1mZFP2 = NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr + (i2 - 1));
            while (i > 0) {
                int i4 = iNSjgqmGjEzuugn2SsG1mZFP + 1;
                int iMin = Math.min(i, Math.min(i4, iNSjgqmGjEzuugn2SsG1mZFP2 + 1));
                Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                int i5 = iNSjgqmGjEzuugn2SsG1mZFP2 - iMin;
                int i6 = iNSjgqmGjEzuugn2SsG1mZFP - iMin;
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr, objArr, i5 + 1, i6 + 1, i4);
                iNSjgqmGjEzuugn2SsG1mZFP = zIvmSL0wzmmKGc3X39b2Gw2mUGE(i6);
                iNSjgqmGjEzuugn2SsG1mZFP2 = zIvmSL0wzmmKGc3X39b2Gw2mUGE(i5);
                i -= iMin;
            }
            int iNSjgqmGjEzuugn2SsG1mZFP3 = NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr + i3);
            ZLZeBXTMq0zDztBxtRTuCHrapQ(this.V57tEvNfxZVVcOCAOih5PKr, iNSjgqmGjEzuugn2SsG1mZFP3);
            this.V57tEvNfxZVVcOCAOih5PKr = iNSjgqmGjEzuugn2SsG1mZFP3;
        } else {
            int iNSjgqmGjEzuugn2SsG1mZFP4 = NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr + i2);
            int iNSjgqmGjEzuugn2SsG1mZFP5 = NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr + i);
            int i7 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                i2 = Math.min(i7, Math.min(objArr2.length - iNSjgqmGjEzuugn2SsG1mZFP4, objArr2.length - iNSjgqmGjEzuugn2SsG1mZFP5));
                Object[] objArr3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                int i8 = iNSjgqmGjEzuugn2SsG1mZFP4 + i2;
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr3, objArr3, iNSjgqmGjEzuugn2SsG1mZFP5, iNSjgqmGjEzuugn2SsG1mZFP4, i8);
                iNSjgqmGjEzuugn2SsG1mZFP4 = NSjgqmGjEzuugn2SsG1mZFP(i8);
                iNSjgqmGjEzuugn2SsG1mZFP5 = NSjgqmGjEzuugn2SsG1mZFP(iNSjgqmGjEzuugn2SsG1mZFP5 + i2);
            }
            int iNSjgqmGjEzuugn2SsG1mZFP6 = NSjgqmGjEzuugn2SsG1mZFP(this.LaeGQIruHQu81hfJldjMOQSVblH3x + this.V57tEvNfxZVVcOCAOih5PKr);
            ZLZeBXTMq0zDztBxtRTuCHrapQ(zIvmSL0wzmmKGc3X39b2Gw2mUGE(iNSjgqmGjEzuugn2SsG1mZFP6 - i3), iNSjgqmGjEzuugn2SsG1mZFP6);
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iNSjgqmGjEzuugn2SsG1mZFP;
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.ZfQNn8hdWlEQ5cR94249PDsLR.length != 0) {
            int iNSjgqmGjEzuugn2SsG1mZFP2 = NSjgqmGjEzuugn2SsG1mZFP(VxUQ9tBhpHJ2AAEDNW8sghc4m() + this.V57tEvNfxZVVcOCAOih5PKr);
            int i = this.V57tEvNfxZVVcOCAOih5PKr;
            if (i < iNSjgqmGjEzuugn2SsG1mZFP2) {
                iNSjgqmGjEzuugn2SsG1mZFP = i;
                while (i < iNSjgqmGjEzuugn2SsG1mZFP2) {
                    Object obj = this.ZfQNn8hdWlEQ5cR94249PDsLR[i];
                    if (collection.contains(obj)) {
                        this.ZfQNn8hdWlEQ5cR94249PDsLR[iNSjgqmGjEzuugn2SsG1mZFP] = obj;
                        iNSjgqmGjEzuugn2SsG1mZFP++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                vmp19D2MODlOL.BDoqAMf0rlMRAnVghjC4qjG(this.ZfQNn8hdWlEQ5cR94249PDsLR, null, iNSjgqmGjEzuugn2SsG1mZFP, iNSjgqmGjEzuugn2SsG1mZFP2);
            } else {
                int length = this.ZfQNn8hdWlEQ5cR94249PDsLR.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.ZfQNn8hdWlEQ5cR94249PDsLR[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP(i2);
                for (int i3 = 0; i3 < iNSjgqmGjEzuugn2SsG1mZFP2; i3++) {
                    Object[] objArr2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.ZfQNn8hdWlEQ5cR94249PDsLR[iNSjgqmGjEzuugn2SsG1mZFP] = obj3;
                        iNSjgqmGjEzuugn2SsG1mZFP = LaeGQIruHQu81hfJldjMOQSVblH3x(iNSjgqmGjEzuugn2SsG1mZFP);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                GI83zq0G8e7zkn();
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = zIvmSL0wzmmKGc3X39b2Gw2mUGE(iNSjgqmGjEzuugn2SsG1mZFP - this.V57tEvNfxZVVcOCAOih5PKr);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m();
        if (i < 0 || i >= iVxUQ9tBhpHJ2AAEDNW8sghc4m) {
            throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i, iVxUQ9tBhpHJ2AAEDNW8sghc4m, "index: ", ", size: "));
        }
        int iNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr + i);
        Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        Object obj2 = objArr[iNSjgqmGjEzuugn2SsG1mZFP];
        objArr[iNSjgqmGjEzuugn2SsG1mZFP] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[VxUQ9tBhpHJ2AAEDNW8sghc4m()]);
    }

    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE(int i) {
        return i < 0 ? i + this.ZfQNn8hdWlEQ5cR94249PDsLR.length : i;
    }

    @Override // com.vdodsodjsdt.SFaXeG5AhT5EKsg5pAgE
    public final Object zzpBGItXfub0yWj(int i) {
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i, i2, "index: ", ", size: "));
        }
        if (i == size() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        GI83zq0G8e7zkn();
        int iNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr + i);
        Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        Object obj = objArr[iNSjgqmGjEzuugn2SsG1mZFP];
        if (i < (this.LaeGQIruHQu81hfJldjMOQSVblH3x >> 1)) {
            int i3 = this.V57tEvNfxZVVcOCAOih5PKr;
            if (iNSjgqmGjEzuugn2SsG1mZFP >= i3) {
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr, objArr, i3 + 1, i3, iNSjgqmGjEzuugn2SsG1mZFP);
            } else {
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr, objArr, 1, 0, iNSjgqmGjEzuugn2SsG1mZFP);
                Object[] objArr2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.V57tEvNfxZVVcOCAOih5PKr;
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr2, objArr2, i4 + 1, i4, objArr2.length - 1);
            }
            Object[] objArr3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            int i5 = this.V57tEvNfxZVVcOCAOih5PKr;
            objArr3[i5] = null;
            this.V57tEvNfxZVVcOCAOih5PKr = LaeGQIruHQu81hfJldjMOQSVblH3x(i5);
        } else {
            int iNSjgqmGjEzuugn2SsG1mZFP2 = NSjgqmGjEzuugn2SsG1mZFP((size() - 1) + this.V57tEvNfxZVVcOCAOih5PKr);
            if (iNSjgqmGjEzuugn2SsG1mZFP <= iNSjgqmGjEzuugn2SsG1mZFP2) {
                Object[] objArr4 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr4, objArr4, iNSjgqmGjEzuugn2SsG1mZFP, iNSjgqmGjEzuugn2SsG1mZFP + 1, iNSjgqmGjEzuugn2SsG1mZFP2 + 1);
            } else {
                Object[] objArr5 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr5, objArr5, iNSjgqmGjEzuugn2SsG1mZFP, iNSjgqmGjEzuugn2SsG1mZFP + 1, objArr5.length);
                Object[] objArr6 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                objArr6[objArr6.length - 1] = objArr6[0];
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr6, objArr6, 0, 1, iNSjgqmGjEzuugn2SsG1mZFP2 + 1);
            }
            this.ZfQNn8hdWlEQ5cR94249PDsLR[iNSjgqmGjEzuugn2SsG1mZFP2] = null;
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        ej6unYlOWMDF.pYmKDYlAmhudp(objArr, "array");
        int length = objArr.length;
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            ej6unYlOWMDF.Ca81ebIan1u(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP(this.LaeGQIruHQu81hfJldjMOQSVblH3x + this.V57tEvNfxZVVcOCAOih5PKr);
        int i2 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i2 < iNSjgqmGjEzuugn2SsG1mZFP) {
            vmp19D2MODlOL.tpEo0fy9FaoJYrSFHRfIK6(this.ZfQNn8hdWlEQ5cR94249PDsLR, objArr, i2, iNSjgqmGjEzuugn2SsG1mZFP, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr2, objArr, 0, this.V57tEvNfxZVVcOCAOih5PKr, objArr2.length);
            Object[] objArr3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr3, objArr, objArr3.length - this.V57tEvNfxZVVcOCAOih5PKr, 0, iNSjgqmGjEzuugn2SsG1mZFP);
        }
        int i3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        GI83zq0G8e7zkn();
        ZfQNn8hdWlEQ5cR94249PDsLR(collection.size() + VxUQ9tBhpHJ2AAEDNW8sghc4m());
        V57tEvNfxZVVcOCAOih5PKr(NSjgqmGjEzuugn2SsG1mZFP(VxUQ9tBhpHJ2AAEDNW8sghc4m() + this.V57tEvNfxZVVcOCAOih5PKr), collection);
        return true;
    }
}
