package com.vdodsodjsdt;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class tIoCdOjAo1z1QrB2Y4Mg8vc extends Oki2m5F921vF {
    public final /* synthetic */ yVilYaP7xC LaeGQIruHQu81hfJldjMOQSVblH3x;
    public bE55L7xKBxF2zT0ulQLMWyBrJjkx V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ fXGTDnUxIdCVHFvA63E ZfQNn8hdWlEQ5cR94249PDsLR;
    public final WQoBeERitBjo zzpBGItXfub0yWj;

    public tIoCdOjAo1z1QrB2Y4Mg8vc(WQoBeERitBjo wQoBeERitBjo, fXGTDnUxIdCVHFvA63E fxgtdnuxidcvhfva63e, yVilYaP7xC yvilyap7xc) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = fxgtdnuxidcvhfva63e;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = yvilyap7xc;
        this.zzpBGItXfub0yWj = wQoBeERitBjo;
    }

    @Override // com.vdodsodjsdt.Oki2m5F921vF
    public final aqhhl68tQrgIjcMGB3dY2YLK3vN V57tEvNfxZVVcOCAOih5PKr(Object obj) {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR.O1xDAlBZZlZdoEf747lCFHld() == this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return null;
        }
        return F44whnLsbQ.ZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    @Override // com.vdodsodjsdt.Oki2m5F921vF
    public final void zzpBGItXfub0yWj(Object obj, Object obj2) {
        MkvBTCkp5aUsEYdslusuFmia mkvBTCkp5aUsEYdslusuFmia = (MkvBTCkp5aUsEYdslusuFmia) obj;
        boolean z = obj2 == null;
        WQoBeERitBjo wQoBeERitBjo = this.zzpBGItXfub0yWj;
        yVilYaP7xC yvilyap7xc = z ? wQoBeERitBjo : this.V57tEvNfxZVVcOCAOih5PKr;
        if (yvilyap7xc != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MkvBTCkp5aUsEYdslusuFmia.V57tEvNfxZVVcOCAOih5PKr;
            while (!atomicReferenceFieldUpdater.compareAndSet(mkvBTCkp5aUsEYdslusuFmia, this, yvilyap7xc)) {
                if (atomicReferenceFieldUpdater.get(mkvBTCkp5aUsEYdslusuFmia) != this) {
                    return;
                }
            }
            if (z) {
                bE55L7xKBxF2zT0ulQLMWyBrJjkx be55l7xkbxf2zt0ulqlmwybrjjkx = this.V57tEvNfxZVVcOCAOih5PKr;
                ej6unYlOWMDF.p59rPv72J9(be55l7xkbxf2zt0ulqlmwybrjjkx);
                wQoBeERitBjo.ZLZeBXTMq0zDztBxtRTuCHrapQ(be55l7xkbxf2zt0ulqlmwybrjjkx);
            }
        }
    }
}
