package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Ic53uc1TSX1PhLp3lGbBDfNitR extends Number {
    public final String V57tEvNfxZVVcOCAOih5PKr;

    public Ic53uc1TSX1PhLp3lGbBDfNitR(String str) {
        this.V57tEvNfxZVVcOCAOih5PKr = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.V57tEvNfxZVVcOCAOih5PKr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Ic53uc1TSX1PhLp3lGbBDfNitR) {
            return this.V57tEvNfxZVVcOCAOih5PKr.equals(((Ic53uc1TSX1PhLp3lGbBDfNitR) obj).V57tEvNfxZVVcOCAOih5PKr);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.V57tEvNfxZVVcOCAOih5PKr);
    }

    public final int hashCode() {
        return this.V57tEvNfxZVVcOCAOih5PKr.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.V57tEvNfxZVVcOCAOih5PKr;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return sGipz63rTUmSj3uFDvOtzihao.d9zDyyznnp3oaDT1Ug(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.V57tEvNfxZVVcOCAOih5PKr;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return sGipz63rTUmSj3uFDvOtzihao.d9zDyyznnp3oaDT1Ug(str).longValue();
        }
    }

    public final String toString() {
        return this.V57tEvNfxZVVcOCAOih5PKr;
    }
}
