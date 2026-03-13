package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class eaGHbkTa1XoPoKq2zsKZFY implements CharSequence {
    public char[] V57tEvNfxZVVcOCAOih5PKr;
    public String ZfQNn8hdWlEQ5cR94249PDsLR;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.V57tEvNfxZVVcOCAOih5PKr[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.V57tEvNfxZVVcOCAOih5PKr.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new String(this.V57tEvNfxZVVcOCAOih5PKr, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR == null) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = new String(this.V57tEvNfxZVVcOCAOih5PKr);
        }
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }
}
