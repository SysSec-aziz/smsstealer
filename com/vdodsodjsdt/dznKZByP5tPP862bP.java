package com.vdodsodjsdt;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class dznKZByP5tPP862bP extends GvuED9Eb9kjnYjng4BPJg7J implements MGk7KfXeUv8YAfWiUw5LfOd {
    public final /* synthetic */ int GI83zq0G8e7zkn;
    public final /* synthetic */ AQYAU4MRDJq HzCpKshMOoaw76hFcbOVRYMeRd;
    public final /* synthetic */ AtomicInteger M9e7PWhFYLD2lOGMker;
    public final /* synthetic */ jDNq5zhgCb57UDl[] NSjgqmGjEzuugn2SsG1mZFP;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dznKZByP5tPP862bP(jDNq5zhgCb57UDl[] jdnq5zhgcb57udlArr, int i, AtomicInteger atomicInteger, AQYAU4MRDJq aQYAU4MRDJq, IvfXhmjM3e3K ivfXhmjM3e3K) {
        super(2, ivfXhmjM3e3K);
        this.NSjgqmGjEzuugn2SsG1mZFP = jdnq5zhgcb57udlArr;
        this.GI83zq0G8e7zkn = i;
        this.M9e7PWhFYLD2lOGMker = atomicInteger;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = aQYAU4MRDJq;
    }

    @Override // com.vdodsodjsdt.c2NCuhRgMI2BFzsocC
    public final Object KUYypEB4eNWOZWVDpH(Object obj) throws Throwable {
        int i = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        AtomicInteger atomicInteger = this.M9e7PWhFYLD2lOGMker;
        AQYAU4MRDJq aQYAU4MRDJq = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        try {
            if (i == 0) {
                ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                jDNq5zhgCb57UDl[] jdnq5zhgcb57udlArr = this.NSjgqmGjEzuugn2SsG1mZFP;
                int i2 = this.GI83zq0G8e7zkn;
                jDNq5zhgCb57UDl jdnq5zhgcb57udl = jdnq5zhgcb57udlArr[i2];
                kncktowTVSGcjqqJwZszwTVWcYgfY kncktowtvsgcjqqjwzszwtvwcygfy = new kncktowTVSGcjqqJwZszwTVWcYgfY(aQYAU4MRDJq, i2);
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 1;
                Object objVxUQ9tBhpHJ2AAEDNW8sghc4m = jdnq5zhgcb57udl.VxUQ9tBhpHJ2AAEDNW8sghc4m(kncktowtvsgcjqqjwzszwtvwcygfy, this);
                w0JnONr1KwCkZY9pA0QjUDuh9aMcU w0jnonr1kwckzy9pa0qjuduh9amcu = w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr;
                if (objVxUQ9tBhpHJ2AAEDNW8sghc4m == w0jnonr1kwckzy9pa0qjuduh9amcu) {
                    return w0jnonr1kwckzy9pa0qjuduh9amcu;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                aQYAU4MRDJq.ZLZeBXTMq0zDztBxtRTuCHrapQ(null);
            }
            return hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                aQYAU4MRDJq.ZLZeBXTMq0zDztBxtRTuCHrapQ(null);
            }
        }
    }

    @Override // com.vdodsodjsdt.c2NCuhRgMI2BFzsocC
    public final IvfXhmjM3e3K M9e7PWhFYLD2lOGMker(IvfXhmjM3e3K ivfXhmjM3e3K, Object obj) {
        return new dznKZByP5tPP862bP(this.NSjgqmGjEzuugn2SsG1mZFP, this.GI83zq0G8e7zkn, this.M9e7PWhFYLD2lOGMker, this.HzCpKshMOoaw76hFcbOVRYMeRd, ivfXhmjM3e3K);
    }

    @Override // com.vdodsodjsdt.MGk7KfXeUv8YAfWiUw5LfOd
    public final Object NSjgqmGjEzuugn2SsG1mZFP(Object obj, Object obj2) {
        return ((dznKZByP5tPP862bP) M9e7PWhFYLD2lOGMker((IvfXhmjM3e3K) obj2, (jG2FHg9iAk) obj)).KUYypEB4eNWOZWVDpH(hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m);
    }
}
