package com.vdodsodjsdt;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class x5ekJgxcz7e9 implements ListIterator, X7FI9474k7GlT7TZYuRwmu {
    public final SFaXeG5AhT5EKsg5pAgE ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr = 1;
    public int LaeGQIruHQu81hfJldjMOQSVblH3x = -1;

    public x5ekJgxcz7e9(CdyQYCBK2awPZQYrStW8hpQgDJcqR cdyQYCBK2awPZQYrStW8hpQgDJcqR, int i) {
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = cdyQYCBK2awPZQYrStW8hpQgDJcqR;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = ((AbstractList) cdyQYCBK2awPZQYrStW8hpQgDJcqR).modCount;
    }

    public void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        if (((AbstractList) ((zTm2nzorN9) this.ZLZeBXTMq0zDztBxtRTuCHrapQ).ZLZeBXTMq0zDztBxtRTuCHrapQ).modCount != this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                VxUQ9tBhpHJ2AAEDNW8sghc4m();
                zTm2nzorN9 ztm2nzorn9 = (zTm2nzorN9) this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                this.ZfQNn8hdWlEQ5cR94249PDsLR = i + 1;
                ztm2nzorn9.add(i, obj);
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = ((AbstractList) ztm2nzorn9).modCount;
                break;
            default:
                zzpBGItXfub0yWj();
                CdyQYCBK2awPZQYrStW8hpQgDJcqR cdyQYCBK2awPZQYrStW8hpQgDJcqR = (CdyQYCBK2awPZQYrStW8hpQgDJcqR) this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                int i2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                this.ZfQNn8hdWlEQ5cR94249PDsLR = i2 + 1;
                cdyQYCBK2awPZQYrStW8hpQgDJcqR.add(i2, obj);
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = ((AbstractList) cdyQYCBK2awPZQYrStW8hpQgDJcqR).modCount;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                if (this.ZfQNn8hdWlEQ5cR94249PDsLR < ((zTm2nzorN9) this.ZLZeBXTMq0zDztBxtRTuCHrapQ).LaeGQIruHQu81hfJldjMOQSVblH3x) {
                }
                break;
            default:
                if (this.ZfQNn8hdWlEQ5cR94249PDsLR < ((CdyQYCBK2awPZQYrStW8hpQgDJcqR) this.ZLZeBXTMq0zDztBxtRTuCHrapQ).ZfQNn8hdWlEQ5cR94249PDsLR) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                if (this.ZfQNn8hdWlEQ5cR94249PDsLR > 0) {
                }
                break;
            default:
                if (this.ZfQNn8hdWlEQ5cR94249PDsLR > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                VxUQ9tBhpHJ2AAEDNW8sghc4m();
                int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                zTm2nzorN9 ztm2nzorn9 = (zTm2nzorN9) this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                if (i >= ztm2nzorn9.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                    throw new NoSuchElementException();
                }
                this.ZfQNn8hdWlEQ5cR94249PDsLR = i + 1;
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = i;
                return ztm2nzorn9.V57tEvNfxZVVcOCAOih5PKr[ztm2nzorn9.ZfQNn8hdWlEQ5cR94249PDsLR + i];
            default:
                zzpBGItXfub0yWj();
                int i2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                CdyQYCBK2awPZQYrStW8hpQgDJcqR cdyQYCBK2awPZQYrStW8hpQgDJcqR = (CdyQYCBK2awPZQYrStW8hpQgDJcqR) this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                if (i2 >= cdyQYCBK2awPZQYrStW8hpQgDJcqR.ZfQNn8hdWlEQ5cR94249PDsLR) {
                    throw new NoSuchElementException();
                }
                this.ZfQNn8hdWlEQ5cR94249PDsLR = i2 + 1;
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = i2;
                return cdyQYCBK2awPZQYrStW8hpQgDJcqR.V57tEvNfxZVVcOCAOih5PKr[i2];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
        }
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                VxUQ9tBhpHJ2AAEDNW8sghc4m();
                int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.ZfQNn8hdWlEQ5cR94249PDsLR = i2;
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = i2;
                zTm2nzorN9 ztm2nzorn9 = (zTm2nzorN9) this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                return ztm2nzorn9.V57tEvNfxZVVcOCAOih5PKr[ztm2nzorn9.ZfQNn8hdWlEQ5cR94249PDsLR + i2];
            default:
                zzpBGItXfub0yWj();
                int i3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (i3 <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i3 - 1;
                this.ZfQNn8hdWlEQ5cR94249PDsLR = i4;
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = i4;
                return ((CdyQYCBK2awPZQYrStW8hpQgDJcqR) this.ZLZeBXTMq0zDztBxtRTuCHrapQ).V57tEvNfxZVVcOCAOih5PKr[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                break;
            default:
                i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                zTm2nzorN9 ztm2nzorn9 = (zTm2nzorN9) this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                VxUQ9tBhpHJ2AAEDNW8sghc4m();
                int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                ztm2nzorn9.zzpBGItXfub0yWj(i);
                this.ZfQNn8hdWlEQ5cR94249PDsLR = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = ((AbstractList) ztm2nzorn9).modCount;
                return;
            default:
                CdyQYCBK2awPZQYrStW8hpQgDJcqR cdyQYCBK2awPZQYrStW8hpQgDJcqR = (CdyQYCBK2awPZQYrStW8hpQgDJcqR) this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                zzpBGItXfub0yWj();
                int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                cdyQYCBK2awPZQYrStW8hpQgDJcqR.zzpBGItXfub0yWj(i2);
                this.ZfQNn8hdWlEQ5cR94249PDsLR = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = ((AbstractList) cdyQYCBK2awPZQYrStW8hpQgDJcqR).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                VxUQ9tBhpHJ2AAEDNW8sghc4m();
                int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((zTm2nzorN9) this.ZLZeBXTMq0zDztBxtRTuCHrapQ).set(i, obj);
                return;
            default:
                zzpBGItXfub0yWj();
                int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((CdyQYCBK2awPZQYrStW8hpQgDJcqR) this.ZLZeBXTMq0zDztBxtRTuCHrapQ).set(i2, obj);
                return;
        }
    }

    public void zzpBGItXfub0yWj() {
        if (((AbstractList) ((CdyQYCBK2awPZQYrStW8hpQgDJcqR) this.ZLZeBXTMq0zDztBxtRTuCHrapQ)).modCount != this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            throw new ConcurrentModificationException();
        }
    }

    public x5ekJgxcz7e9(zTm2nzorN9 ztm2nzorn9, int i) {
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = ztm2nzorn9;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = ((AbstractList) ztm2nzorn9).modCount;
    }
}
