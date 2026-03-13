package com.vdodsodjsdt;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class XpG0A5IpJsSX9uJPSmP4WwTAl {
    public static final /* synthetic */ AtomicIntegerFieldUpdater zzpBGItXfub0yWj = AtomicIntegerFieldUpdater.newUpdater(XpG0A5IpJsSX9uJPSmP4WwTAl.class, "_handled$volatile");
    public final Throwable VxUQ9tBhpHJ2AAEDNW8sghc4m;
    private volatile /* synthetic */ int _handled$volatile;

    public XpG0A5IpJsSX9uJPSmP4WwTAl(Throwable th, boolean z) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + ']';
    }
}
