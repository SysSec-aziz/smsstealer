package com.vdodsodjsdt;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class LR9iJhvTmSe6VG0thsBZJxPpAx implements jp0UKjTOIOtU {
    public final LinkedHashMap VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public LR9iJhvTmSe6VG0thsBZJxPpAx(X509Certificate... x509CertificateArr) {
        ej6unYlOWMDF.pYmKDYlAmhudp(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = linkedHashMap;
    }

    @Override // com.vdodsodjsdt.jp0UKjTOIOtU
    public final X509Certificate VxUQ9tBhpHJ2AAEDNW8sghc4m(X509Certificate x509Certificate) {
        Set set = (Set) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                x509Certificate.verify(((X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof LR9iJhvTmSe6VG0thsBZJxPpAx) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(((LR9iJhvTmSe6VG0thsBZJxPpAx) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m, this.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
        return true;
    }

    public final int hashCode() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.hashCode();
    }
}
