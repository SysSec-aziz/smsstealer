package com.vdodsodjsdt;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class qQf7ruwSWB8KVubfdB8OCaar implements Iterator {
    public Iterator LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int V57tEvNfxZVVcOCAOih5PKr = -1;
    public boolean ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ TkF9tg2fr9JpHc2wR2tV7BbN zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public qQf7ruwSWB8KVubfdB8OCaar(TkF9tg2fr9JpHc2wR2tV7BbN tkF9tg2fr9JpHc2wR2tV7BbN) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = tkF9tg2fr9JpHc2wR2tV7BbN;
    }

    public final Iterator VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x == null) {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.ZfQNn8hdWlEQ5cR94249PDsLR.entrySet().iterator();
        }
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.V57tEvNfxZVVcOCAOih5PKr + 1;
        TkF9tg2fr9JpHc2wR2tV7BbN tkF9tg2fr9JpHc2wR2tV7BbN = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        return i < tkF9tg2fr9JpHc2wR2tV7BbN.V57tEvNfxZVVcOCAOih5PKr.size() || (!tkF9tg2fr9JpHc2wR2tV7BbN.ZfQNn8hdWlEQ5cR94249PDsLR.isEmpty() && VxUQ9tBhpHJ2AAEDNW8sghc4m().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = true;
        int i = this.V57tEvNfxZVVcOCAOih5PKr + 1;
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        TkF9tg2fr9JpHc2wR2tV7BbN tkF9tg2fr9JpHc2wR2tV7BbN = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        return i < tkF9tg2fr9JpHc2wR2tV7BbN.V57tEvNfxZVVcOCAOih5PKr.size() ? (Map.Entry) tkF9tg2fr9JpHc2wR2tV7BbN.V57tEvNfxZVVcOCAOih5PKr.get(this.V57tEvNfxZVVcOCAOih5PKr) : (Map.Entry) VxUQ9tBhpHJ2AAEDNW8sghc4m().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR = false;
        int i = TkF9tg2fr9JpHc2wR2tV7BbN.NSjgqmGjEzuugn2SsG1mZFP;
        TkF9tg2fr9JpHc2wR2tV7BbN tkF9tg2fr9JpHc2wR2tV7BbN = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        tkF9tg2fr9JpHc2wR2tV7BbN.zzpBGItXfub0yWj();
        if (this.V57tEvNfxZVVcOCAOih5PKr >= tkF9tg2fr9JpHc2wR2tV7BbN.V57tEvNfxZVVcOCAOih5PKr.size()) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m().remove();
            return;
        }
        int i2 = this.V57tEvNfxZVVcOCAOih5PKr;
        this.V57tEvNfxZVVcOCAOih5PKr = i2 - 1;
        tkF9tg2fr9JpHc2wR2tV7BbN.NSjgqmGjEzuugn2SsG1mZFP(i2);
    }
}
