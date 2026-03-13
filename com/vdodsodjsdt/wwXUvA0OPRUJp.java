package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class wwXUvA0OPRUJp {
    public static final byte[] LaeGQIruHQu81hfJldjMOQSVblH3x = new byte[1792];
    public int V57tEvNfxZVVcOCAOih5PKr;
    public final CharSequence VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public char ZfQNn8hdWlEQ5cR94249PDsLR;
    public final int zzpBGItXfub0yWj;

    static {
        for (int i = 0; i < 1792; i++) {
            LaeGQIruHQu81hfJldjMOQSVblH3x[i] = Character.getDirectionality(i);
        }
    }

    public wwXUvA0OPRUJp(CharSequence charSequence) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = charSequence;
        this.zzpBGItXfub0yWj = charSequence.length();
    }

    public final byte VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        int i = this.V57tEvNfxZVVcOCAOih5PKr - 1;
        CharSequence charSequence = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        char cCharAt = charSequence.charAt(i);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.V57tEvNfxZVVcOCAOih5PKr);
            this.V57tEvNfxZVVcOCAOih5PKr -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.V57tEvNfxZVVcOCAOih5PKr--;
        char c = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        return c < 1792 ? LaeGQIruHQu81hfJldjMOQSVblH3x[c] : Character.getDirectionality(c);
    }
}
