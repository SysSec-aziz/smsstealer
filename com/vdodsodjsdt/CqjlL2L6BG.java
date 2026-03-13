package com.vdodsodjsdt;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class CqjlL2L6BG extends b5p8GpwErDXqVGUollgu implements ListIterator {
    public final /* synthetic */ ALJgALwYYFtLBM6dfUwef zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CqjlL2L6BG(ALJgALwYYFtLBM6dfUwef aLJgALwYYFtLBM6dfUwef, int i) {
        super(aLJgALwYYFtLBM6dfUwef);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = aLJgALwYYFtLBM6dfUwef;
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = aLJgALwYYFtLBM6dfUwef.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        if (i < 0 || i > iVxUQ9tBhpHJ2AAEDNW8sghc4m) {
            throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i, iVxUQ9tBhpHJ2AAEDNW8sghc4m, "index: ", ", size: "));
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR - 1;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
