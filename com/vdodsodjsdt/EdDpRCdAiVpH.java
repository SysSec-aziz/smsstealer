package com.vdodsodjsdt;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class EdDpRCdAiVpH extends XpG0A5IpJsSX9uJPSmP4WwTAl {
    public static final /* synthetic */ AtomicIntegerFieldUpdater V57tEvNfxZVVcOCAOih5PKr = AtomicIntegerFieldUpdater.newUpdater(EdDpRCdAiVpH.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public EdDpRCdAiVpH(YAf4BMDpiCAb4hYaN6VqW yAf4BMDpiCAb4hYaN6VqW, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + yAf4BMDpiCAb4hYaN6VqW + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }
}
