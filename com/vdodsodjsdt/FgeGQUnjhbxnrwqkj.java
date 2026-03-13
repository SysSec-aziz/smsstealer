package com.vdodsodjsdt;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class FgeGQUnjhbxnrwqkj implements Serializable {
    public final Object V57tEvNfxZVVcOCAOih5PKr;
    public final Object ZfQNn8hdWlEQ5cR94249PDsLR;

    public FgeGQUnjhbxnrwqkj(Object obj, Object obj2) {
        this.V57tEvNfxZVVcOCAOih5PKr = obj;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FgeGQUnjhbxnrwqkj)) {
            return false;
        }
        FgeGQUnjhbxnrwqkj fgeGQUnjhbxnrwqkj = (FgeGQUnjhbxnrwqkj) obj;
        return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr, fgeGQUnjhbxnrwqkj.V57tEvNfxZVVcOCAOih5PKr) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.ZfQNn8hdWlEQ5cR94249PDsLR, fgeGQUnjhbxnrwqkj.ZfQNn8hdWlEQ5cR94249PDsLR);
    }

    public final int hashCode() {
        Object obj = this.V57tEvNfxZVVcOCAOih5PKr;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.V57tEvNfxZVVcOCAOih5PKr + ", " + this.ZfQNn8hdWlEQ5cR94249PDsLR + ')';
    }
}
