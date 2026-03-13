package com.vdodsodjsdt;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class uJFrNRCSV6rHsO implements RSSn7Y5tk2UmJ {
    public static final AWi57DovArIU5TVULM2EfK2LG VxUQ9tBhpHJ2AAEDNW8sghc4m = new AWi57DovArIU5TVULM2EfK2LG();
    public static final boolean zzpBGItXfub0yWj;

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, KfeOQNOupsCg6878zi4e.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        zzpBGItXfub0yWj = z;
    }

    @Override // com.vdodsodjsdt.RSSn7Y5tk2UmJ
    public final boolean V57tEvNfxZVVcOCAOih5PKr() {
        return zzpBGItXfub0yWj;
    }

    @Override // com.vdodsodjsdt.RSSn7Y5tk2UmJ
    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(SSLSocket sSLSocket) {
        return false;
    }

    @Override // com.vdodsodjsdt.RSSn7Y5tk2UmJ
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(SSLSocket sSLSocket, String str, List list) {
        ej6unYlOWMDF.pYmKDYlAmhudp(list, "protocols");
        if (VxUQ9tBhpHJ2AAEDNW8sghc4m(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            O510kkNvCgHHMXIbKz1NqEFfrmj o510kkNvCgHHMXIbKz1NqEFfrmj = O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            parameters.setApplicationProtocols((String[]) FG8LIxsgYiLSfhN0jYKIKr.ZLZeBXTMq0zDztBxtRTuCHrapQ(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // com.vdodsodjsdt.RSSn7Y5tk2UmJ
    public final String zzpBGItXfub0yWj(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }
}
