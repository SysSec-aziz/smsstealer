package com.vdodsodjsdt;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class dM53lf8lG1colTg6WZKfLwi3o extends GvuED9Eb9kjnYjng4BPJg7J implements MGk7KfXeUv8YAfWiUw5LfOd {
    public final /* synthetic */ miZQAIwqUtukbpjcHsFxaDq57gE GI83zq0G8e7zkn;
    public int NSjgqmGjEzuugn2SsG1mZFP;
    public final /* synthetic */ int ZLZeBXTMq0zDztBxtRTuCHrapQ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dM53lf8lG1colTg6WZKfLwi3o(miZQAIwqUtukbpjcHsFxaDq57gE mizqaiwqutukbpjchsfxadq57ge, IvfXhmjM3e3K ivfXhmjM3e3K, int i) {
        super(2, ivfXhmjM3e3K);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i;
        this.GI83zq0G8e7zkn = mizqaiwqutukbpjchsfxadq57ge;
    }

    @Override // com.vdodsodjsdt.c2NCuhRgMI2BFzsocC
    public final Object KUYypEB4eNWOZWVDpH(Object obj) throws Throwable {
        final HveQpOpyKg7NSru rD0jnASpsPzAlaI;
        switch (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            case 0:
                int i = this.NSjgqmGjEzuugn2SsG1mZFP;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                    return obj;
                }
                ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                this.NSjgqmGjEzuugn2SsG1mZFP = 1;
                Object objVxUQ9tBhpHJ2AAEDNW8sghc4m = miZQAIwqUtukbpjcHsFxaDq57gE.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.GI83zq0G8e7zkn, this);
                w0JnONr1KwCkZY9pA0QjUDuh9aMcU w0jnonr1kwckzy9pa0qjuduh9amcu = w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr;
                return objVxUQ9tBhpHJ2AAEDNW8sghc4m == w0jnonr1kwckzy9pa0qjuduh9amcu ? w0jnonr1kwckzy9pa0qjuduh9amcu : objVxUQ9tBhpHJ2AAEDNW8sghc4m;
            default:
                int i2 = this.NSjgqmGjEzuugn2SsG1mZFP;
                final miZQAIwqUtukbpjcHsFxaDq57gE mizqaiwqutukbpjchsfxadq57ge = this.GI83zq0G8e7zkn;
                try {
                    if (i2 == 0) {
                        ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                        aGLXkGgj9ZepFnRvHMEtzaaSY aglxkggj9zepfnrvhmetzaasy = mizqaiwqutukbpjchsfxadq57ge.q1wNbhk2O6;
                        dM53lf8lG1colTg6WZKfLwi3o dm53lf8lg1coltg6wzkflwi3o = new dM53lf8lG1colTg6WZKfLwi3o(mizqaiwqutukbpjchsfxadq57ge, null, 0);
                        this.NSjgqmGjEzuugn2SsG1mZFP = 1;
                        obj = F44whnLsbQ.mhUCRR8ceqc7mAozW(aglxkggj9zepfnrvhmetzaasy, dm53lf8lg1coltg6wzkflwi3o, this);
                        w0JnONr1KwCkZY9pA0QjUDuh9aMcU w0jnonr1kwckzy9pa0qjuduh9amcu2 = w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr;
                        if (obj == w0jnonr1kwckzy9pa0qjuduh9amcu2) {
                            return w0jnonr1kwckzy9pa0qjuduh9amcu2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                    }
                    rD0jnASpsPzAlaI = (HveQpOpyKg7NSru) obj;
                    break;
                } catch (cMGD2iotsUUez1oRroMIB e) {
                    rD0jnASpsPzAlaI = new S93Un44BeNcKwzHE(e.V57tEvNfxZVVcOCAOih5PKr);
                } catch (CancellationException unused) {
                    rD0jnASpsPzAlaI = new RD0jnASpsPzAlaI();
                } catch (Throwable th) {
                    psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().ZfQNn8hdWlEQ5cR94249PDsLR(WymhoAQMxaR.VxUQ9tBhpHJ2AAEDNW8sghc4m, "Unexpected error in WorkerWrapper", th);
                    rD0jnASpsPzAlaI = new RD0jnASpsPzAlaI();
                }
                Object objP59rPv72J9 = mizqaiwqutukbpjchsfxadq57ge.NSjgqmGjEzuugn2SsG1mZFP.p59rPv72J9(new Callable() { // from class: com.vdodsodjsdt.XiWoORFAxriXReOyEVrGOIn
                    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object call() {
                        /*
                            Method dump skipped, instruction units count: 453
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.XiWoORFAxriXReOyEVrGOIn.call():java.lang.Object");
                    }
                });
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objP59rPv72J9, "workDatabase.runInTransa…          }\n            )");
                return objP59rPv72J9;
        }
    }

    @Override // com.vdodsodjsdt.c2NCuhRgMI2BFzsocC
    public final IvfXhmjM3e3K M9e7PWhFYLD2lOGMker(IvfXhmjM3e3K ivfXhmjM3e3K, Object obj) {
        switch (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            case 0:
                return new dM53lf8lG1colTg6WZKfLwi3o(this.GI83zq0G8e7zkn, ivfXhmjM3e3K, 0);
            default:
                return new dM53lf8lG1colTg6WZKfLwi3o(this.GI83zq0G8e7zkn, ivfXhmjM3e3K, 1);
        }
    }

    @Override // com.vdodsodjsdt.MGk7KfXeUv8YAfWiUw5LfOd
    public final Object NSjgqmGjEzuugn2SsG1mZFP(Object obj, Object obj2) {
        jG2FHg9iAk jg2fhg9iak = (jG2FHg9iAk) obj;
        IvfXhmjM3e3K ivfXhmjM3e3K = (IvfXhmjM3e3K) obj2;
        switch (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
        }
        return ((dM53lf8lG1colTg6WZKfLwi3o) M9e7PWhFYLD2lOGMker(ivfXhmjM3e3K, jg2fhg9iak)).KUYypEB4eNWOZWVDpH(hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m);
    }
}
