package com.vdodsodjsdt;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class c1M0l9URu5Xm implements Iterator {
    public final /* synthetic */ uDRHTE5hsm7JpGOnK7F LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int V57tEvNfxZVVcOCAOih5PKr = 0;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;

    public c1M0l9URu5Xm(uDRHTE5hsm7JpGOnK7F udrhte5hsm7jpgonk7f) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = udrhte5hsm7jpgonk7f;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = udrhte5hsm7jpgonk7f.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.V57tEvNfxZVVcOCAOih5PKr < this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i >= this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            throw new NoSuchElementException();
        }
        this.V57tEvNfxZVVcOCAOih5PKr = i + 1;
        return Byte.valueOf(this.LaeGQIruHQu81hfJldjMOQSVblH3x.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
