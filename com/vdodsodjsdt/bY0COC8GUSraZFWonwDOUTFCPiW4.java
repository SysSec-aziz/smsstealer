package com.vdodsodjsdt;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class bY0COC8GUSraZFWonwDOUTFCPiW4 implements Iterator, X7FI9474k7GlT7TZYuRwmu {
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final CharSequence V57tEvNfxZVVcOCAOih5PKr;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public bY0COC8GUSraZFWonwDOUTFCPiW4(CharSequence charSequence) {
        ej6unYlOWMDF.pYmKDYlAmhudp(charSequence, "string");
        this.V57tEvNfxZVVcOCAOih5PKr = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ < 0) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = 2;
            return false;
        }
        CharSequence charSequence = this.V57tEvNfxZVVcOCAOih5PKr;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.LaeGQIruHQu81hfJldjMOQSVblH3x; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.ZfQNn8hdWlEQ5cR94249PDsLR = 1;
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i;
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = length;
                return true;
            }
        }
        i = -1;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = 1;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR = 0;
        int i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = this.ZLZeBXTMq0zDztBxtRTuCHrapQ + i;
        return this.V57tEvNfxZVVcOCAOih5PKr.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
