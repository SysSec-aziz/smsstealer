package com.vdodsodjsdt;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class VRRoEUs5qUhd5lP2 implements Iterator, X7FI9474k7GlT7TZYuRwmu {
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final int V57tEvNfxZVVcOCAOih5PKr;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public VRRoEUs5qUhd5lP2(int i, int i2, int i3) {
        this.V57tEvNfxZVVcOCAOih5PKr = i3;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = z;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (i != this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = this.V57tEvNfxZVVcOCAOih5PKr + i;
        } else {
            if (!this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                throw new NoSuchElementException();
            }
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = false;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
