package com.vdodsodjsdt;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class gQlBB3OHfTjE extends Y5mpEs4XqQ8WYSIF {
    public final CwickyU0ZjEG0JwJwvvsOp0vRH0PB ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final Thread zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public gQlBB3OHfTjE(D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW, Thread thread, CwickyU0ZjEG0JwJwvvsOp0vRH0PB cwickyU0ZjEG0JwJwvvsOp0vRH0PB) {
        super(d73WsmU258PapcWZb45SFW, true);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = thread;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = cwickyU0ZjEG0JwJwvvsOp0vRH0PB;
    }

    @Override // com.vdodsodjsdt.fXGTDnUxIdCVHFvA63E
    public final void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
