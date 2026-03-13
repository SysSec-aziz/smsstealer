package com.vdodsodjsdt;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class qZMpZ4Tr49rV extends IS7DVWqtgrLtXifZ0j304X implements Iterator, X7FI9474k7GlT7TZYuRwmu {
    public final /* synthetic */ int ZLZeBXTMq0zDztBxtRTuCHrapQ;

    public qZMpZ4Tr49rV(oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 oyf7tn6zjrnuneifvj8jbjij8nv9, int i) {
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i;
        ej6unYlOWMDF.pYmKDYlAmhudp(oyf7tn6zjrnuneifvj8jbjij8nv9, "map");
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = oyf7tn6zjrnuneifvj8jbjij8nv9;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = -1;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = oyf7tn6zjrnuneifvj8jbjij8nv9.M9e7PWhFYLD2lOGMker;
        LaeGQIruHQu81hfJldjMOQSVblH3x();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            case 0:
                zzpBGItXfub0yWj();
                int i = this.V57tEvNfxZVVcOCAOih5PKr;
                oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 oyf7tn6zjrnuneifvj8jbjij8nv9 = (oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                if (i >= oyf7tn6zjrnuneifvj8jbjij8nv9.NSjgqmGjEzuugn2SsG1mZFP) {
                    throw new NoSuchElementException();
                }
                this.V57tEvNfxZVVcOCAOih5PKr = i + 1;
                this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
                TsDuwufu2EdZk2MF tsDuwufu2EdZk2MF = new TsDuwufu2EdZk2MF(oyf7tn6zjrnuneifvj8jbjij8nv9, i);
                LaeGQIruHQu81hfJldjMOQSVblH3x();
                return tsDuwufu2EdZk2MF;
            case 1:
                zzpBGItXfub0yWj();
                int i2 = this.V57tEvNfxZVVcOCAOih5PKr;
                oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 oyf7tn6zjrnuneifvj8jbjij8nv92 = (oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                if (i2 >= oyf7tn6zjrnuneifvj8jbjij8nv92.NSjgqmGjEzuugn2SsG1mZFP) {
                    throw new NoSuchElementException();
                }
                this.V57tEvNfxZVVcOCAOih5PKr = i2 + 1;
                this.ZfQNn8hdWlEQ5cR94249PDsLR = i2;
                Object obj = oyf7tn6zjrnuneifvj8jbjij8nv92.V57tEvNfxZVVcOCAOih5PKr[i2];
                LaeGQIruHQu81hfJldjMOQSVblH3x();
                return obj;
            default:
                zzpBGItXfub0yWj();
                int i3 = this.V57tEvNfxZVVcOCAOih5PKr;
                oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 oyf7tn6zjrnuneifvj8jbjij8nv93 = (oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                if (i3 >= oyf7tn6zjrnuneifvj8jbjij8nv93.NSjgqmGjEzuugn2SsG1mZFP) {
                    throw new NoSuchElementException();
                }
                this.V57tEvNfxZVVcOCAOih5PKr = i3 + 1;
                this.ZfQNn8hdWlEQ5cR94249PDsLR = i3;
                Object[] objArr = oyf7tn6zjrnuneifvj8jbjij8nv93.ZfQNn8hdWlEQ5cR94249PDsLR;
                ej6unYlOWMDF.p59rPv72J9(objArr);
                Object obj2 = objArr[this.ZfQNn8hdWlEQ5cR94249PDsLR];
                LaeGQIruHQu81hfJldjMOQSVblH3x();
                return obj2;
        }
    }
}
