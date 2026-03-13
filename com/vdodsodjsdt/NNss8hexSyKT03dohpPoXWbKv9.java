package com.vdodsodjsdt;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class NNss8hexSyKT03dohpPoXWbKv9 implements Iterator {
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public AFFHICUFcvabTydqa5fiI V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public AFFHICUFcvabTydqa5fiI ZfQNn8hdWlEQ5cR94249PDsLR = null;
    public final /* synthetic */ qghLaWjSIb75x516bG5Bx3f6NsAy zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public NNss8hexSyKT03dohpPoXWbKv9(qghLaWjSIb75x516bG5Bx3f6NsAy qghlawjsib75x516bg5bx3f6nsay, int i) {
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = qghlawjsib75x516bg5bx3f6nsay;
        this.V57tEvNfxZVVcOCAOih5PKr = qghlawjsib75x516bg5bx3f6nsay.NSjgqmGjEzuugn2SsG1mZFP.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = qghlawjsib75x516bg5bx3f6nsay.ZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return zzpBGItXfub0yWj();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.V57tEvNfxZVVcOCAOih5PKr != this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.NSjgqmGjEzuugn2SsG1mZFP;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            case 1:
                return zzpBGItXfub0yWj().NSjgqmGjEzuugn2SsG1mZFP;
            default:
                return VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        AFFHICUFcvabTydqa5fiI aFFHICUFcvabTydqa5fiI = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (aFFHICUFcvabTydqa5fiI == null) {
            throw new IllegalStateException();
        }
        qghLaWjSIb75x516bG5Bx3f6NsAy qghlawjsib75x516bg5bx3f6nsay = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        qghlawjsib75x516bg5bx3f6nsay.V57tEvNfxZVVcOCAOih5PKr(aFFHICUFcvabTydqa5fiI, true);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = null;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = qghlawjsib75x516bg5bx3f6nsay.ZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    public final AFFHICUFcvabTydqa5fiI zzpBGItXfub0yWj() {
        AFFHICUFcvabTydqa5fiI aFFHICUFcvabTydqa5fiI = this.V57tEvNfxZVVcOCAOih5PKr;
        qghLaWjSIb75x516bG5Bx3f6NsAy qghlawjsib75x516bg5bx3f6nsay = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (aFFHICUFcvabTydqa5fiI == qghlawjsib75x516bg5bx3f6nsay.NSjgqmGjEzuugn2SsG1mZFP) {
            throw new NoSuchElementException();
        }
        if (qghlawjsib75x516bg5bx3f6nsay.ZLZeBXTMq0zDztBxtRTuCHrapQ != this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new ConcurrentModificationException();
        }
        this.V57tEvNfxZVVcOCAOih5PKr = aFFHICUFcvabTydqa5fiI.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = aFFHICUFcvabTydqa5fiI;
        return aFFHICUFcvabTydqa5fiI;
    }
}
