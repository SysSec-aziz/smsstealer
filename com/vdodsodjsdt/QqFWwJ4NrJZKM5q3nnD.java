package com.vdodsodjsdt;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class QqFWwJ4NrJZKM5q3nnD extends ACHQH4O0M6xZgdzgI5gPCN435AVw {
    public MCkc9XaOBWJ3kr1ZFUGL46e9N p59rPv72J9;

    public QqFWwJ4NrJZKM5q3nnD(pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq, WindowInsets windowInsets) {
        super(pmjh8rqwiwrth8coqq, windowInsets);
        this.p59rPv72J9 = null;
    }

    @Override // com.vdodsodjsdt.ueiyNUHTUsoj16g9F
    public final MCkc9XaOBWJ3kr1ZFUGL46e9N NSjgqmGjEzuugn2SsG1mZFP() {
        if (this.p59rPv72J9 == null) {
            WindowInsets windowInsets = this.V57tEvNfxZVVcOCAOih5PKr;
            this.p59rPv72J9 = MCkc9XaOBWJ3kr1ZFUGL46e9N.zzpBGItXfub0yWj(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.p59rPv72J9;
    }

    @Override // com.vdodsodjsdt.ueiyNUHTUsoj16g9F
    public pmJH8rqWIwRth8COqq V57tEvNfxZVVcOCAOih5PKr() {
        return pmJH8rqWIwRth8COqq.ZLZeBXTMq0zDztBxtRTuCHrapQ(null, this.V57tEvNfxZVVcOCAOih5PKr.consumeSystemWindowInsets());
    }

    @Override // com.vdodsodjsdt.ueiyNUHTUsoj16g9F
    public void pYmKDYlAmhudp(MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9N) {
        this.p59rPv72J9 = mCkc9XaOBWJ3kr1ZFUGL46e9N;
    }

    @Override // com.vdodsodjsdt.ueiyNUHTUsoj16g9F
    public boolean q1wNbhk2O6() {
        return this.V57tEvNfxZVVcOCAOih5PKr.isConsumed();
    }

    @Override // com.vdodsodjsdt.ueiyNUHTUsoj16g9F
    public pmJH8rqWIwRth8COqq zzpBGItXfub0yWj() {
        return pmJH8rqWIwRth8COqq.ZLZeBXTMq0zDztBxtRTuCHrapQ(null, this.V57tEvNfxZVVcOCAOih5PKr.consumeStableInsets());
    }
}
