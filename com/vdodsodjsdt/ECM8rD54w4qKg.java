package com.vdodsodjsdt;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ECM8rD54w4qKg extends YpK8O6cKlAROnyPP26zLuvHCd {
    public static final /* synthetic */ AtomicIntegerFieldUpdater NSjgqmGjEzuugn2SsG1mZFP = AtomicIntegerFieldUpdater.newUpdater(ECM8rD54w4qKg.class, "_invoked$volatile");
    public final y44yd1lomoSgJ ZLZeBXTMq0zDztBxtRTuCHrapQ;
    private volatile /* synthetic */ int _invoked$volatile;

    public ECM8rD54w4qKg(y44yd1lomoSgJ y44yd1lomosgj) {
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = y44yd1lomosgj;
    }

    @Override // com.vdodsodjsdt.y44yd1lomoSgJ
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(Throwable th) {
        if (NSjgqmGjEzuugn2SsG1mZFP.compareAndSet(this, 0, 1)) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ.ZfQNn8hdWlEQ5cR94249PDsLR(th);
        }
    }
}
