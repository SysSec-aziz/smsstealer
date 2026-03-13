package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class fv9JJh60FmoFVsJ3 extends GvuED9Eb9kjnYjng4BPJg7J implements ms7wepD1jVm6vK0NgycK {
    public /* synthetic */ long GI83zq0G8e7zkn;
    public /* synthetic */ Throwable NSjgqmGjEzuugn2SsG1mZFP;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;

    @Override // com.vdodsodjsdt.c2NCuhRgMI2BFzsocC
    public final Object KUYypEB4eNWOZWVDpH(Object obj) throws Throwable {
        int i = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (i == 0) {
            ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
            Throwable th = this.NSjgqmGjEzuugn2SsG1mZFP;
            long j = this.GI83zq0G8e7zkn;
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().ZfQNn8hdWlEQ5cR94249PDsLR(hoeJj79e2a6dO.VxUQ9tBhpHJ2AAEDNW8sghc4m, "Cannot check for unfinished work", th);
            long jMin = Math.min(j * ((long) 30000), hoeJj79e2a6dO.zzpBGItXfub0yWj);
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 1;
            Object objZLZeBXTMq0zDztBxtRTuCHrapQ = hRrPPME7ytOB7ba.ZLZeBXTMq0zDztBxtRTuCHrapQ(jMin, this);
            w0JnONr1KwCkZY9pA0QjUDuh9aMcU w0jnonr1kwckzy9pa0qjuduh9amcu = w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr;
            if (objZLZeBXTMq0zDztBxtRTuCHrapQ == w0jnonr1kwckzy9pa0qjuduh9amcu) {
                return w0jnonr1kwckzy9pa0qjuduh9amcu;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
        }
        return Boolean.TRUE;
    }
}
