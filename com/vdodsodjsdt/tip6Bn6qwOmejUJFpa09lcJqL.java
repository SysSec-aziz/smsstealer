package com.vdodsodjsdt;

import androidx.work.CoroutineWorker;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class tip6Bn6qwOmejUJFpa09lcJqL extends GvuED9Eb9kjnYjng4BPJg7J implements MGk7KfXeUv8YAfWiUw5LfOd {
    public final /* synthetic */ CoroutineWorker GI83zq0G8e7zkn;
    public int NSjgqmGjEzuugn2SsG1mZFP;
    public final /* synthetic */ int ZLZeBXTMq0zDztBxtRTuCHrapQ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tip6Bn6qwOmejUJFpa09lcJqL(CoroutineWorker coroutineWorker, IvfXhmjM3e3K ivfXhmjM3e3K, int i) {
        super(2, ivfXhmjM3e3K);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i;
        this.GI83zq0G8e7zkn = coroutineWorker;
    }

    @Override // com.vdodsodjsdt.c2NCuhRgMI2BFzsocC
    public final Object KUYypEB4eNWOZWVDpH(Object obj) throws Throwable {
        switch (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            case 0:
                int i = this.NSjgqmGjEzuugn2SsG1mZFP;
                if (i == 0) {
                    ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                    this.NSjgqmGjEzuugn2SsG1mZFP = 1;
                    throw new IllegalStateException("Not implemented");
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                return obj;
            default:
                int i2 = this.NSjgqmGjEzuugn2SsG1mZFP;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                    return obj;
                }
                ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                this.NSjgqmGjEzuugn2SsG1mZFP = 1;
                Object objV57tEvNfxZVVcOCAOih5PKr = this.GI83zq0G8e7zkn.V57tEvNfxZVVcOCAOih5PKr(this);
                w0JnONr1KwCkZY9pA0QjUDuh9aMcU w0jnonr1kwckzy9pa0qjuduh9amcu = w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr;
                return objV57tEvNfxZVVcOCAOih5PKr == w0jnonr1kwckzy9pa0qjuduh9amcu ? w0jnonr1kwckzy9pa0qjuduh9amcu : objV57tEvNfxZVVcOCAOih5PKr;
        }
    }

    @Override // com.vdodsodjsdt.c2NCuhRgMI2BFzsocC
    public final IvfXhmjM3e3K M9e7PWhFYLD2lOGMker(IvfXhmjM3e3K ivfXhmjM3e3K, Object obj) {
        switch (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            case 0:
                return new tip6Bn6qwOmejUJFpa09lcJqL(this.GI83zq0G8e7zkn, ivfXhmjM3e3K, 0);
            default:
                return new tip6Bn6qwOmejUJFpa09lcJqL(this.GI83zq0G8e7zkn, ivfXhmjM3e3K, 1);
        }
    }

    @Override // com.vdodsodjsdt.MGk7KfXeUv8YAfWiUw5LfOd
    public final Object NSjgqmGjEzuugn2SsG1mZFP(Object obj, Object obj2) throws Throwable {
        jG2FHg9iAk jg2fhg9iak = (jG2FHg9iAk) obj;
        IvfXhmjM3e3K ivfXhmjM3e3K = (IvfXhmjM3e3K) obj2;
        switch (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            case 0:
                tip6Bn6qwOmejUJFpa09lcJqL tip6bn6qwomejujfpa09lcjql = (tip6Bn6qwOmejUJFpa09lcJqL) M9e7PWhFYLD2lOGMker(ivfXhmjM3e3K, jg2fhg9iak);
                hMtEZx9LFZEOBsEChkiRKnXNYh1GG hmtezx9lfzeobsechkirknxnyh1gg = hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                tip6bn6qwomejujfpa09lcjql.KUYypEB4eNWOZWVDpH(hmtezx9lfzeobsechkirknxnyh1gg);
                return hmtezx9lfzeobsechkirknxnyh1gg;
            default:
                return ((tip6Bn6qwOmejUJFpa09lcJqL) M9e7PWhFYLD2lOGMker(ivfXhmjM3e3K, jg2fhg9iak)).KUYypEB4eNWOZWVDpH(hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
    }
}
