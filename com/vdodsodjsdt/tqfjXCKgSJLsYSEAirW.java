package com.vdodsodjsdt;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class tqfjXCKgSJLsYSEAirW implements RSSn7Y5tk2UmJ {
    public final kJnadvTP3Pg VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public RSSn7Y5tk2UmJ zzpBGItXfub0yWj;

    public tqfjXCKgSJLsYSEAirW(kJnadvTP3Pg kjnadvtp3pg) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = kjnadvtp3pg;
    }

    public final synchronized RSSn7Y5tk2UmJ LaeGQIruHQu81hfJldjMOQSVblH3x(SSLSocket sSLSocket) {
        try {
            if (this.zzpBGItXfub0yWj == null && this.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m(sSLSocket)) {
                this.zzpBGItXfub0yWj = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzpBGItXfub0yWj;
    }

    @Override // com.vdodsodjsdt.RSSn7Y5tk2UmJ
    public final boolean V57tEvNfxZVVcOCAOih5PKr() {
        return true;
    }

    @Override // com.vdodsodjsdt.RSSn7Y5tk2UmJ
    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(SSLSocket sSLSocket) {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m(sSLSocket);
    }

    @Override // com.vdodsodjsdt.RSSn7Y5tk2UmJ
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(SSLSocket sSLSocket, String str, List list) {
        ej6unYlOWMDF.pYmKDYlAmhudp(list, "protocols");
        RSSn7Y5tk2UmJ rSSn7Y5tk2UmJLaeGQIruHQu81hfJldjMOQSVblH3x = LaeGQIruHQu81hfJldjMOQSVblH3x(sSLSocket);
        if (rSSn7Y5tk2UmJLaeGQIruHQu81hfJldjMOQSVblH3x != null) {
            rSSn7Y5tk2UmJLaeGQIruHQu81hfJldjMOQSVblH3x.ZfQNn8hdWlEQ5cR94249PDsLR(sSLSocket, str, list);
        }
    }

    @Override // com.vdodsodjsdt.RSSn7Y5tk2UmJ
    public final String zzpBGItXfub0yWj(SSLSocket sSLSocket) {
        RSSn7Y5tk2UmJ rSSn7Y5tk2UmJLaeGQIruHQu81hfJldjMOQSVblH3x = LaeGQIruHQu81hfJldjMOQSVblH3x(sSLSocket);
        if (rSSn7Y5tk2UmJLaeGQIruHQu81hfJldjMOQSVblH3x != null) {
            return rSSn7Y5tk2UmJLaeGQIruHQu81hfJldjMOQSVblH3x.zzpBGItXfub0yWj(sSLSocket);
        }
        return null;
    }
}
