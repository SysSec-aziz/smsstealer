package com.vdodsodjsdt;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class YZGEqxBO83YadVVg implements Iterator, X7FI9474k7GlT7TZYuRwmu {
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ Object ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public YZGEqxBO83YadVVg(int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR < this.V57tEvNfxZVVcOCAOih5PKr;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objZIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        switch (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            case 0:
                objZIvmSL0wzmmKGc3X39b2Gw2mUGE = ((qKXCIJM1cKNm0a1RAvamOBOVLgp) this.ZLZeBXTMq0zDztBxtRTuCHrapQ).zIvmSL0wzmmKGc3X39b2Gw2mUGE(i);
                break;
            case 1:
                objZIvmSL0wzmmKGc3X39b2Gw2mUGE = ((qKXCIJM1cKNm0a1RAvamOBOVLgp) this.ZLZeBXTMq0zDztBxtRTuCHrapQ).GI83zq0G8e7zkn(i);
                break;
            default:
                objZIvmSL0wzmmKGc3X39b2Gw2mUGE = ((DBkPCwg2bk) this.ZLZeBXTMq0zDztBxtRTuCHrapQ).ZfQNn8hdWlEQ5cR94249PDsLR[i];
                break;
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR++;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
        return objZIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR - 1;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        switch (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            case 0:
                ((qKXCIJM1cKNm0a1RAvamOBOVLgp) this.ZLZeBXTMq0zDztBxtRTuCHrapQ).ZLZeBXTMq0zDztBxtRTuCHrapQ(i);
                break;
            case 1:
                ((qKXCIJM1cKNm0a1RAvamOBOVLgp) this.ZLZeBXTMq0zDztBxtRTuCHrapQ).ZLZeBXTMq0zDztBxtRTuCHrapQ(i);
                break;
            default:
                ((DBkPCwg2bk) this.ZLZeBXTMq0zDztBxtRTuCHrapQ).VxUQ9tBhpHJ2AAEDNW8sghc4m(i);
                break;
        }
        this.V57tEvNfxZVVcOCAOih5PKr--;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YZGEqxBO83YadVVg(DBkPCwg2bk dBkPCwg2bk) {
        this(dBkPCwg2bk.LaeGQIruHQu81hfJldjMOQSVblH3x);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 2;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = dBkPCwg2bk;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YZGEqxBO83YadVVg(qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp, int i) {
        this(qkxcijm1cknm0a1ravamobovlgp.LaeGQIruHQu81hfJldjMOQSVblH3x);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i;
        switch (i) {
            case 1:
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = qkxcijm1cknm0a1ravamobovlgp;
                this(qkxcijm1cknm0a1ravamobovlgp.LaeGQIruHQu81hfJldjMOQSVblH3x);
                break;
            default:
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = qkxcijm1cknm0a1ravamobovlgp;
                break;
        }
    }
}
