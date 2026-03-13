package com.vdodsodjsdt;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class sBkYA4xAqdoH1yhi2vLUi implements Iterator, X7FI9474k7GlT7TZYuRwmu {
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int V57tEvNfxZVVcOCAOih5PKr = -1;
    public final /* synthetic */ kVCYLXlG6ES6f ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public stS3uecPKs3MU4EfeT zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public sBkYA4xAqdoH1yhi2vLUi(kVCYLXlG6ES6f kvcylxlg6es6f) {
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = kvcylxlg6es6f;
        int length = ((CharSequence) kvcylxlg6es6f.zzpBGItXfub0yWj).length();
        if (length < 0) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        length = length >= 0 ? 0 : length;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = length;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = length;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        FgeGQUnjhbxnrwqkj fgeGQUnjhbxnrwqkj;
        kVCYLXlG6ES6f kvcylxlg6es6f = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        CharSequence charSequence = (CharSequence) kvcylxlg6es6f.zzpBGItXfub0yWj;
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i < 0) {
            this.V57tEvNfxZVVcOCAOih5PKr = 0;
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
            return;
        }
        if (i <= charSequence.length() && (fgeGQUnjhbxnrwqkj = (FgeGQUnjhbxnrwqkj) ((MGk7KfXeUv8YAfWiUw5LfOd) kvcylxlg6es6f.V57tEvNfxZVVcOCAOih5PKr).NSjgqmGjEzuugn2SsG1mZFP(charSequence, Integer.valueOf(this.LaeGQIruHQu81hfJldjMOQSVblH3x))) != null) {
            int iIntValue = ((Number) fgeGQUnjhbxnrwqkj.V57tEvNfxZVVcOCAOih5PKr).intValue();
            int iIntValue2 = ((Number) fgeGQUnjhbxnrwqkj.ZfQNn8hdWlEQ5cR94249PDsLR).intValue();
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = F44whnLsbQ.BJQHddi0Plr5ElWetCyaixWOg9(this.ZfQNn8hdWlEQ5cR94249PDsLR, iIntValue);
            int i2 = iIntValue + iIntValue2;
            this.ZfQNn8hdWlEQ5cR94249PDsLR = i2;
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = i2 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new stS3uecPKs3MU4EfeT(this.ZfQNn8hdWlEQ5cR94249PDsLR, cwhrCnoVJBjJE2CBEAvBopmgF.r0dB0ojIy6g8mnk1(charSequence), 1);
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
        }
        this.V57tEvNfxZVVcOCAOih5PKr = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.V57tEvNfxZVVcOCAOih5PKr == -1) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        return this.V57tEvNfxZVVcOCAOih5PKr == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.V57tEvNfxZVVcOCAOih5PKr == -1) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        if (this.V57tEvNfxZVVcOCAOih5PKr == 0) {
            throw new NoSuchElementException();
        }
        stS3uecPKs3MU4EfeT sts3uecpks3mu4efet = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        ej6unYlOWMDF.Ca81ebIan1u(sts3uecpks3mu4efet, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
        this.V57tEvNfxZVVcOCAOih5PKr = -1;
        return sts3uecpks3mu4efet;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
