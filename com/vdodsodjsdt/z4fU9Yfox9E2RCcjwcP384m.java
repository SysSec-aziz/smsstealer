package com.vdodsodjsdt;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class z4fU9Yfox9E2RCcjwcP384m implements Cloneable {
    public /* synthetic */ int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public /* synthetic */ int[] V57tEvNfxZVVcOCAOih5PKr;
    public /* synthetic */ Object[] ZfQNn8hdWlEQ5cR94249PDsLR;

    public z4fU9Yfox9E2RCcjwcP384m() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.V57tEvNfxZVVcOCAOih5PKr = new int[i4];
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new Object[i4];
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(int i, Object obj) {
        int iM9e7PWhFYLD2lOGMker = ej6unYlOWMDF.M9e7PWhFYLD2lOGMker(this.LaeGQIruHQu81hfJldjMOQSVblH3x, i, this.V57tEvNfxZVVcOCAOih5PKr);
        if (iM9e7PWhFYLD2lOGMker >= 0) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR[iM9e7PWhFYLD2lOGMker] = obj;
            return;
        }
        int i2 = ~iM9e7PWhFYLD2lOGMker;
        int i3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i2 < i3) {
            Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (objArr[i2] == zonOxHotd3BwAPJcwqr6I6uQNngg4.KUYypEB4eNWOZWVDpH) {
                this.V57tEvNfxZVVcOCAOih5PKr[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.V57tEvNfxZVVcOCAOih5PKr.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.V57tEvNfxZVVcOCAOih5PKr, i7);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(iArrCopyOf, "copyOf(this, newSize)");
            this.V57tEvNfxZVVcOCAOih5PKr = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.ZfQNn8hdWlEQ5cR94249PDsLR, i7);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objArrCopyOf, "copyOf(this, newSize)");
            this.ZfQNn8hdWlEQ5cR94249PDsLR = objArrCopyOf;
        }
        int i8 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i8 - i2 != 0) {
            int[] iArr = this.V57tEvNfxZVVcOCAOih5PKr;
            int i9 = i2 + 1;
            vmp19D2MODlOL.HAPpjhiCsV9ONY23505HCBI9IX(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr2, objArr2, i9, i2, this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        }
        this.V57tEvNfxZVVcOCAOih5PKr[i2] = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR[i2] = obj;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x++;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(int i, Object obj) {
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i2 != 0 && i <= this.V57tEvNfxZVVcOCAOih5PKr[i2 - 1]) {
            V57tEvNfxZVVcOCAOih5PKr(i, obj);
            return;
        }
        if (i2 >= this.V57tEvNfxZVVcOCAOih5PKr.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.V57tEvNfxZVVcOCAOih5PKr, i6);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(iArrCopyOf, "copyOf(this, newSize)");
            this.V57tEvNfxZVVcOCAOih5PKr = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.ZfQNn8hdWlEQ5cR94249PDsLR, i6);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objArrCopyOf, "copyOf(this, newSize)");
            this.ZfQNn8hdWlEQ5cR94249PDsLR = objArrCopyOf;
        }
        this.V57tEvNfxZVVcOCAOih5PKr[i2] = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR[i2] = obj;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i2 + 1;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        ej6unYlOWMDF.Ca81ebIan1u(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        z4fU9Yfox9E2RCcjwcP384m z4fu9yfox9e2rccjwcp384m = (z4fU9Yfox9E2RCcjwcP384m) objClone;
        z4fu9yfox9e2rccjwcp384m.V57tEvNfxZVVcOCAOih5PKr = (int[]) this.V57tEvNfxZVVcOCAOih5PKr.clone();
        z4fu9yfox9e2rccjwcp384m.ZfQNn8hdWlEQ5cR94249PDsLR = (Object[]) this.ZfQNn8hdWlEQ5cR94249PDsLR.clone();
        return z4fu9yfox9e2rccjwcp384m;
    }

    public final String toString() {
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.V57tEvNfxZVVcOCAOih5PKr[i3]);
            sb.append('=');
            Object obj = this.ZfQNn8hdWlEQ5cR94249PDsLR[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "buffer.toString()");
        return string;
    }

    public final Object zzpBGItXfub0yWj(int i) {
        Object obj;
        int iM9e7PWhFYLD2lOGMker = ej6unYlOWMDF.M9e7PWhFYLD2lOGMker(this.LaeGQIruHQu81hfJldjMOQSVblH3x, i, this.V57tEvNfxZVVcOCAOih5PKr);
        if (iM9e7PWhFYLD2lOGMker < 0 || (obj = this.ZfQNn8hdWlEQ5cR94249PDsLR[iM9e7PWhFYLD2lOGMker]) == zonOxHotd3BwAPJcwqr6I6uQNngg4.KUYypEB4eNWOZWVDpH) {
            return null;
        }
        return obj;
    }
}
