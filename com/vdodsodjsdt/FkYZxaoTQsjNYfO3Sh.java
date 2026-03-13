package com.vdodsodjsdt;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class FkYZxaoTQsjNYfO3Sh extends YSt4yvIps7DNt8 implements RandomAccess {
    public static final FkYZxaoTQsjNYfO3Sh zIvmSL0wzmmKGc3X39b2Gw2mUGE = new FkYZxaoTQsjNYfO3Sh(new Object[0], 0, false);
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public Object[] ZfQNn8hdWlEQ5cR94249PDsLR;

    public FkYZxaoTQsjNYfO3Sh(Object[] objArr, int i, boolean z) {
        this.V57tEvNfxZVVcOCAOih5PKr = z;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = objArr;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i;
    }

    public final FkYZxaoTQsjNYfO3Sh V57tEvNfxZVVcOCAOih5PKr(int i) {
        if (i >= this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return new FkYZxaoTQsjNYfO3Sh(Arrays.copyOf(this.ZfQNn8hdWlEQ5cR94249PDsLR, i), this.LaeGQIruHQu81hfJldjMOQSVblH3x, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i == objArr.length) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzpBGItXfub0yWj(i);
        return this.ZfQNn8hdWlEQ5cR94249PDsLR[i];
    }

    @Override // com.vdodsodjsdt.YSt4yvIps7DNt8, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        zzpBGItXfub0yWj(i);
        Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        Object obj = objArr[i];
        if (i < this.LaeGQIruHQu81hfJldjMOQSVblH3x - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        zzpBGItXfub0yWj(i);
        Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    public final void zzpBGItXfub0yWj(int i) {
        if (i < 0 || i >= this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IndexOutOfBoundsException("Index:" + i + ", Size:" + this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        if (i >= 0 && i <= (i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x)) {
            Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.ZfQNn8hdWlEQ5cR94249PDsLR, i, objArr2, i + 1, this.LaeGQIruHQu81hfJldjMOQSVblH3x - i);
                this.ZfQNn8hdWlEQ5cR94249PDsLR = objArr2;
            }
            this.ZfQNn8hdWlEQ5cR94249PDsLR[i] = obj;
            this.LaeGQIruHQu81hfJldjMOQSVblH3x++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index:" + i + ", Size:" + this.LaeGQIruHQu81hfJldjMOQSVblH3x);
    }
}
