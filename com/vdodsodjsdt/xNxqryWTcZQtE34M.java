package com.vdodsodjsdt;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class xNxqryWTcZQtE34M implements Map.Entry, Comparable {
    public final /* synthetic */ TkF9tg2fr9JpHc2wR2tV7BbN LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final Comparable V57tEvNfxZVVcOCAOih5PKr;
    public Object ZfQNn8hdWlEQ5cR94249PDsLR;

    public xNxqryWTcZQtE34M(TkF9tg2fr9JpHc2wR2tV7BbN tkF9tg2fr9JpHc2wR2tV7BbN, Comparable comparable, Object obj) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = tkF9tg2fr9JpHc2wR2tV7BbN;
        this.V57tEvNfxZVVcOCAOih5PKr = comparable;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.V57tEvNfxZVVcOCAOih5PKr.compareTo(((xNxqryWTcZQtE34M) obj).V57tEvNfxZVVcOCAOih5PKr);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.V57tEvNfxZVVcOCAOih5PKr;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
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
        Comparable comparable = this.V57tEvNfxZVVcOCAOih5PKr;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.zzpBGItXfub0yWj();
        Object obj2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj;
        return obj2;
    }

    public final String toString() {
        return this.V57tEvNfxZVVcOCAOih5PKr + "=" + this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }
}
