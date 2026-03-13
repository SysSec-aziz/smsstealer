package com.vdodsodjsdt;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class TsDuwufu2EdZk2MF implements Map.Entry, X7FI9474k7GlT7TZYuRwmu {
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 V57tEvNfxZVVcOCAOih5PKr;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;

    public TsDuwufu2EdZk2MF(oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 oyf7tn6zjrnuneifvj8jbjij8nv9, int i) {
        ej6unYlOWMDF.pYmKDYlAmhudp(oyf7tn6zjrnuneifvj8jbjij8nv9, "map");
        this.V57tEvNfxZVVcOCAOih5PKr = oyf7tn6zjrnuneifvj8jbjij8nv9;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = oyf7tn6zjrnuneifvj8jbjij8nv9.M9e7PWhFYLD2lOGMker;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        if (this.V57tEvNfxZVVcOCAOih5PKr.M9e7PWhFYLD2lOGMker != this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(entry.getKey(), getKey()) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        return this.V57tEvNfxZVVcOCAOih5PKr.V57tEvNfxZVVcOCAOih5PKr[this.ZfQNn8hdWlEQ5cR94249PDsLR];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        Object[] objArr = this.V57tEvNfxZVVcOCAOih5PKr.ZfQNn8hdWlEQ5cR94249PDsLR;
        ej6unYlOWMDF.p59rPv72J9(objArr);
        return objArr[this.ZfQNn8hdWlEQ5cR94249PDsLR];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 oyf7tn6zjrnuneifvj8jbjij8nv9 = this.V57tEvNfxZVVcOCAOih5PKr;
        oyf7tn6zjrnuneifvj8jbjij8nv9.V57tEvNfxZVVcOCAOih5PKr();
        Object[] objArr = oyf7tn6zjrnuneifvj8jbjij8nv9.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (objArr == null) {
            int length = oyf7tn6zjrnuneifvj8jbjij8nv9.V57tEvNfxZVVcOCAOih5PKr.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            oyf7tn6zjrnuneifvj8jbjij8nv9.ZfQNn8hdWlEQ5cR94249PDsLR = objArr;
        }
        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
