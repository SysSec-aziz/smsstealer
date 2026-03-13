package com.vdodsodjsdt;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class tjRpb7ToRqoCUYmbj1m9ZI extends ProxySelector {
    public static final tjRpb7ToRqoCUYmbj1m9ZI VxUQ9tBhpHJ2AAEDNW8sghc4m = new tjRpb7ToRqoCUYmbj1m9ZI();

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return KfeOQNOupsCg6878zi4e.HVEwbdULInpTNa0IG(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
