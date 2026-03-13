package com.vdodsodjsdt;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class BzqvZe2HlF1ngslPHZd implements Map.Entry {
    public BzqvZe2HlF1ngslPHZd LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final Object V57tEvNfxZVVcOCAOih5PKr;
    public final Object ZfQNn8hdWlEQ5cR94249PDsLR;
    public BzqvZe2HlF1ngslPHZd zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public BzqvZe2HlF1ngslPHZd(Object obj, Object obj2) {
        this.V57tEvNfxZVVcOCAOih5PKr = obj;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BzqvZe2HlF1ngslPHZd)) {
            return false;
        }
        BzqvZe2HlF1ngslPHZd bzqvZe2HlF1ngslPHZd = (BzqvZe2HlF1ngslPHZd) obj;
        return this.V57tEvNfxZVVcOCAOih5PKr.equals(bzqvZe2HlF1ngslPHZd.V57tEvNfxZVVcOCAOih5PKr) && this.ZfQNn8hdWlEQ5cR94249PDsLR.equals(bzqvZe2HlF1ngslPHZd.ZfQNn8hdWlEQ5cR94249PDsLR);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.V57tEvNfxZVVcOCAOih5PKr;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.V57tEvNfxZVVcOCAOih5PKr.hashCode() ^ this.ZfQNn8hdWlEQ5cR94249PDsLR.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.V57tEvNfxZVVcOCAOih5PKr + "=" + this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }
}
