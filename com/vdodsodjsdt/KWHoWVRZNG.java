package com.vdodsodjsdt;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class KWHoWVRZNG implements RSSn7Y5tk2UmJ {
    public static final vGJtE6tM07pm VxUQ9tBhpHJ2AAEDNW8sghc4m = new vGJtE6tM07pm();
    public static final boolean zzpBGItXfub0yWj;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, NQp0my81gE85raF3N1YrKg.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (NQp0my81gE85raF3N1YrKg.VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        zzpBGItXfub0yWj = z;
    }

    @Override // com.vdodsodjsdt.RSSn7Y5tk2UmJ
    public final boolean V57tEvNfxZVVcOCAOih5PKr() {
        return zzpBGItXfub0yWj;
    }

    @Override // com.vdodsodjsdt.RSSn7Y5tk2UmJ
    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // com.vdodsodjsdt.RSSn7Y5tk2UmJ
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(SSLSocket sSLSocket, String str, List list) {
        ej6unYlOWMDF.pYmKDYlAmhudp(list, "protocols");
        if (VxUQ9tBhpHJ2AAEDNW8sghc4m(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            O510kkNvCgHHMXIbKz1NqEFfrmj o510kkNvCgHHMXIbKz1NqEFfrmj = O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) FG8LIxsgYiLSfhN0jYKIKr.ZLZeBXTMq0zDztBxtRTuCHrapQ(list).toArray(new String[0]));
        }
    }

    @Override // com.vdodsodjsdt.RSSn7Y5tk2UmJ
    public final String zzpBGItXfub0yWj(SSLSocket sSLSocket) {
        if (VxUQ9tBhpHJ2AAEDNW8sghc4m(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }
}
