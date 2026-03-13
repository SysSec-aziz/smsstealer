package com.vdodsodjsdt;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Z0OX6z1l2xDfdav8X implements Iterator, Map.Entry {
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public int ZfQNn8hdWlEQ5cR94249PDsLR = -1;
    public final /* synthetic */ qKXCIJM1cKNm0a1RAvamOBOVLgp zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public Z0OX6z1l2xDfdav8X(qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = qkxcijm1cknm0a1ravamobovlgp;
        this.V57tEvNfxZVVcOCAOih5PKr = qkxcijm1cknm0a1ravamobovlgp.LaeGQIruHQu81hfJldjMOQSVblH3x - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(key, qkxcijm1cknm0a1ravamobovlgp.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i)) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(entry.getValue(), qkxcijm1cknm0a1ravamobovlgp.GI83zq0G8e7zkn(this.ZfQNn8hdWlEQ5cR94249PDsLR));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.zIvmSL0wzmmKGc3X39b2Gw2mUGE(this.ZfQNn8hdWlEQ5cR94249PDsLR);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.GI83zq0G8e7zkn(this.ZfQNn8hdWlEQ5cR94249PDsLR);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR < this.V57tEvNfxZVVcOCAOih5PKr;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        Object objZIvmSL0wzmmKGc3X39b2Gw2mUGE = qkxcijm1cknm0a1ravamobovlgp.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i);
        Object objGI83zq0G8e7zkn = qkxcijm1cknm0a1ravamobovlgp.GI83zq0G8e7zkn(this.ZfQNn8hdWlEQ5cR94249PDsLR);
        return (objZIvmSL0wzmmKGc3X39b2Gw2mUGE == null ? 0 : objZIvmSL0wzmmKGc3X39b2Gw2mUGE.hashCode()) ^ (objGI83zq0G8e7zkn != null ? objGI83zq0G8e7zkn.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR++;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException();
        }
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.ZLZeBXTMq0zDztBxtRTuCHrapQ(this.ZfQNn8hdWlEQ5cR94249PDsLR);
        this.ZfQNn8hdWlEQ5cR94249PDsLR--;
        this.V57tEvNfxZVVcOCAOih5PKr--;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.NSjgqmGjEzuugn2SsG1mZFP(this.ZfQNn8hdWlEQ5cR94249PDsLR, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
