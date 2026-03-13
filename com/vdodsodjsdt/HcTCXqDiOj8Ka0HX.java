package com.vdodsodjsdt;

import androidx.work.Worker;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class HcTCXqDiOj8Ka0HX extends iR5xCBIVvX5dAZmnw05F0Cv implements EfIvTei3Q8wBNpyLTZJevpFxej {
    public final /* synthetic */ Worker LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int ZfQNn8hdWlEQ5cR94249PDsLR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HcTCXqDiOj8Ka0HX(Worker worker, int i) {
        super(0);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = worker;
    }

    @Override // com.vdodsodjsdt.EfIvTei3Q8wBNpyLTZJevpFxej
    public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        switch (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            case 0:
                this.LaeGQIruHQu81hfJldjMOQSVblH3x.getClass();
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            default:
                return this.LaeGQIruHQu81hfJldjMOQSVblH3x.V57tEvNfxZVVcOCAOih5PKr();
        }
    }
}
