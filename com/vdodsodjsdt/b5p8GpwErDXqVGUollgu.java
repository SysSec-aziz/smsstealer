package com.vdodsodjsdt;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class b5p8GpwErDXqVGUollgu implements Iterator, X7FI9474k7GlT7TZYuRwmu {
    public final Object LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr = 0;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;

    public b5p8GpwErDXqVGUollgu(Object[] objArr) {
        ej6unYlOWMDF.pYmKDYlAmhudp(objArr, "array");
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                return this.ZfQNn8hdWlEQ5cR94249PDsLR < ((ALJgALwYYFtLBM6dfUwef) this.LaeGQIruHQu81hfJldjMOQSVblH3x).VxUQ9tBhpHJ2AAEDNW8sghc4m();
            case 1:
                return this.ZfQNn8hdWlEQ5cR94249PDsLR < ((Object[]) this.LaeGQIruHQu81hfJldjMOQSVblH3x).length;
            default:
                Iterator it = (Iterator) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                while (this.ZfQNn8hdWlEQ5cR94249PDsLR > 0 && it.hasNext()) {
                    it.next();
                    this.ZfQNn8hdWlEQ5cR94249PDsLR--;
                }
                return it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                ALJgALwYYFtLBM6dfUwef aLJgALwYYFtLBM6dfUwef = (ALJgALwYYFtLBM6dfUwef) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                this.ZfQNn8hdWlEQ5cR94249PDsLR = i + 1;
                return aLJgALwYYFtLBM6dfUwef.get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                    int i2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                    this.ZfQNn8hdWlEQ5cR94249PDsLR = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.ZfQNn8hdWlEQ5cR94249PDsLR--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                Iterator it = (Iterator) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                while (this.ZfQNn8hdWlEQ5cR94249PDsLR > 0 && it.hasNext()) {
                    it.next();
                    this.ZfQNn8hdWlEQ5cR94249PDsLR--;
                }
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b5p8GpwErDXqVGUollgu(ALJgALwYYFtLBM6dfUwef aLJgALwYYFtLBM6dfUwef) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = aLJgALwYYFtLBM6dfUwef;
    }

    public b5p8GpwErDXqVGUollgu(zYf3BBuL0DDx zyf3bbul0ddx) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = zyf3bbul0ddx.VxUQ9tBhpHJ2AAEDNW8sghc4m.iterator();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = zyf3bbul0ddx.zzpBGItXfub0yWj;
    }
}
