package com.vdodsodjsdt;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class rER8RCI8e7U94QVUg implements Iterable, X7FI9474k7GlT7TZYuRwmu {
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final int V57tEvNfxZVVcOCAOih5PKr;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;

    public rER8RCI8e7U94QVUg(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = zonOxHotd3BwAPJcwqr6I6uQNngg4.w0Wu95l8dVNw5rZMRu(i, i2, i3);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof rER8RCI8e7U94QVUg)) {
            return false;
        }
        if (isEmpty() && ((rER8RCI8e7U94QVUg) obj).isEmpty()) {
            return true;
        }
        rER8RCI8e7U94QVUg rer8rci8e7u94qvug = (rER8RCI8e7U94QVUg) obj;
        return this.V57tEvNfxZVVcOCAOih5PKr == rer8rci8e7u94qvug.V57tEvNfxZVVcOCAOih5PKr && this.ZfQNn8hdWlEQ5cR94249PDsLR == rer8rci8e7u94qvug.ZfQNn8hdWlEQ5cR94249PDsLR && this.LaeGQIruHQu81hfJldjMOQSVblH3x == rer8rci8e7u94qvug.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.V57tEvNfxZVVcOCAOih5PKr * 31) + this.ZfQNn8hdWlEQ5cR94249PDsLR) * 31) + this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    public boolean isEmpty() {
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int i2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i3 = this.V57tEvNfxZVVcOCAOih5PKr;
        return i > 0 ? i3 > i2 : i3 < i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new VRRoEUs5qUhd5lP2(this.V57tEvNfxZVVcOCAOih5PKr, this.ZfQNn8hdWlEQ5cR94249PDsLR, this.LaeGQIruHQu81hfJldjMOQSVblH3x);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = this.V57tEvNfxZVVcOCAOih5PKr;
        int i3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
