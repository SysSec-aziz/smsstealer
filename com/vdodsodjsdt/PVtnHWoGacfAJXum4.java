package com.vdodsodjsdt;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class PVtnHWoGacfAJXum4 {
    public final List V57tEvNfxZVVcOCAOih5PKr;
    public final V04OhIg9zB VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final FF8k5suM5gFqMXgYVyRy5ASJmO ZfQNn8hdWlEQ5cR94249PDsLR;
    public final E246m2jcOzL76dqF zzpBGItXfub0yWj;

    public PVtnHWoGacfAJXum4(V04OhIg9zB v04OhIg9zB, E246m2jcOzL76dqF e246m2jcOzL76dqF, List list, EfIvTei3Q8wBNpyLTZJevpFxej efIvTei3Q8wBNpyLTZJevpFxej) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = v04OhIg9zB;
        this.zzpBGItXfub0yWj = e246m2jcOzL76dqF;
        this.V57tEvNfxZVVcOCAOih5PKr = list;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new FF8k5suM5gFqMXgYVyRy5ASJmO(new hfnU5q1H9m1kOmNb(0, efIvTei3Q8wBNpyLTZJevpFxej));
    }

    public final List VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return (List) this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PVtnHWoGacfAJXum4)) {
            return false;
        }
        PVtnHWoGacfAJXum4 pVtnHWoGacfAJXum4 = (PVtnHWoGacfAJXum4) obj;
        return pVtnHWoGacfAJXum4.VxUQ9tBhpHJ2AAEDNW8sghc4m == this.VxUQ9tBhpHJ2AAEDNW8sghc4m && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(pVtnHWoGacfAJXum4.zzpBGItXfub0yWj, this.zzpBGItXfub0yWj) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(pVtnHWoGacfAJXum4.VxUQ9tBhpHJ2AAEDNW8sghc4m(), VxUQ9tBhpHJ2AAEDNW8sghc4m()) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(pVtnHWoGacfAJXum4.V57tEvNfxZVVcOCAOih5PKr, this.V57tEvNfxZVVcOCAOih5PKr);
    }

    public final int hashCode() {
        return this.V57tEvNfxZVVcOCAOih5PKr.hashCode() + ((VxUQ9tBhpHJ2AAEDNW8sghc4m().hashCode() + ((this.zzpBGItXfub0yWj.hashCode() + ((this.VxUQ9tBhpHJ2AAEDNW8sghc4m.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m();
        ArrayList arrayList = new ArrayList(M5nvSQFWCkc.bjhcQ0u7VT2OYYrwk96HrWoN(listVxUQ9tBhpHJ2AAEDNW8sghc4m));
        for (Certificate certificate : listVxUQ9tBhpHJ2AAEDNW8sghc4m) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(type2, "getType(...)");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        sb.append(" cipherSuite=");
        sb.append(this.zzpBGItXfub0yWj);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.V57tEvNfxZVVcOCAOih5PKr;
        ArrayList arrayList2 = new ArrayList(M5nvSQFWCkc.bjhcQ0u7VT2OYYrwk96HrWoN(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(type, "getType(...)");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
