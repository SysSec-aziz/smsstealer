package com.vdodsodjsdt;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class kal4xJfPKIlh8G5H109B7a18Hkv implements RSSn7Y5tk2UmJ {
    @Override // com.vdodsodjsdt.RSSn7Y5tk2UmJ
    public final boolean V57tEvNfxZVVcOCAOih5PKr() {
        O510kkNvCgHHMXIbKz1NqEFfrmj o510kkNvCgHHMXIbKz1NqEFfrmj = O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // com.vdodsodjsdt.RSSn7Y5tk2UmJ
    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // com.vdodsodjsdt.RSSn7Y5tk2UmJ
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(SSLSocket sSLSocket, String str, List list) throws IOException {
        ej6unYlOWMDF.pYmKDYlAmhudp(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            O510kkNvCgHHMXIbKz1NqEFfrmj o510kkNvCgHHMXIbKz1NqEFfrmj = O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            sSLParameters.setApplicationProtocols((String[]) FG8LIxsgYiLSfhN0jYKIKr.ZLZeBXTMq0zDztBxtRTuCHrapQ(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // com.vdodsodjsdt.RSSn7Y5tk2UmJ
    public final String zzpBGItXfub0yWj(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
