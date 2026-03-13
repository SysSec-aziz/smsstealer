package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class xXAKJ3PJCCrkt6iLyU implements Runnable {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ uLXxmkdsO6wfrm ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ xXAKJ3PJCCrkt6iLyU(uLXxmkdsO6wfrm ulxxmkdso6wfrm, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = ulxxmkdso6wfrm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                aVXgxTePUTvRAcd avxgxteputvracd = this.ZfQNn8hdWlEQ5cR94249PDsLR.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (avxgxteputvracd != null) {
                    avxgxteputvracd.setListSelectionHidden(true);
                    avxgxteputvracd.requestLayout();
                }
                break;
            default:
                uLXxmkdsO6wfrm ulxxmkdso6wfrm = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                aVXgxTePUTvRAcd avxgxteputvracd2 = ulxxmkdso6wfrm.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (avxgxteputvracd2 != null && avxgxteputvracd2.isAttachedToWindow() && ulxxmkdso6wfrm.LaeGQIruHQu81hfJldjMOQSVblH3x.getCount() > ulxxmkdso6wfrm.LaeGQIruHQu81hfJldjMOQSVblH3x.getChildCount() && ulxxmkdso6wfrm.LaeGQIruHQu81hfJldjMOQSVblH3x.getChildCount() <= ulxxmkdso6wfrm.Ca81ebIan1u) {
                    ulxxmkdso6wfrm.SuB3hEmTmbbRGAhtvOOmfKEon.setInputMethodMode(2);
                    ulxxmkdso6wfrm.ZfQNn8hdWlEQ5cR94249PDsLR();
                    break;
                }
                break;
        }
    }
}
