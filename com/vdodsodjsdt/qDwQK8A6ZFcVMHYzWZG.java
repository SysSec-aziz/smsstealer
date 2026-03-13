package com.vdodsodjsdt;

import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class qDwQK8A6ZFcVMHYzWZG {
    public static final /* synthetic */ int[] VxUQ9tBhpHJ2AAEDNW8sghc4m;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        try {
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m = iArr;
    }
}
