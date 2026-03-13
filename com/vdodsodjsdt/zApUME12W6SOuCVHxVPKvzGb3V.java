package com.vdodsodjsdt;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class zApUME12W6SOuCVHxVPKvzGb3V extends CancellationException {
    public final transient Object V57tEvNfxZVVcOCAOih5PKr;

    public zApUME12W6SOuCVHxVPKvzGb3V(Q1zAhWfgG5v13hOK q1zAhWfgG5v13hOK) {
        super("Flow was aborted, no more elements needed");
        this.V57tEvNfxZVVcOCAOih5PKr = q1zAhWfgG5v13hOK;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
