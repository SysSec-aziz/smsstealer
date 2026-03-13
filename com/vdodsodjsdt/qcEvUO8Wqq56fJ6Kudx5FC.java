package com.vdodsodjsdt;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class qcEvUO8Wqq56fJ6Kudx5FC extends sGipz63rTUmSj3uFDvOtzihao {
    public final jp0UKjTOIOtU NSjgqmGjEzuugn2SsG1mZFP;

    public qcEvUO8Wqq56fJ6Kudx5FC(jp0UKjTOIOtU jp0ukjtoiotu) {
        ej6unYlOWMDF.pYmKDYlAmhudp(jp0ukjtoiotu, "trustRootIndex");
        this.NSjgqmGjEzuugn2SsG1mZFP = jp0ukjtoiotu;
    }

    public static boolean ByTQIhgl7ezGvHXEd(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i) {
        if (!ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof qcEvUO8Wqq56fJ6Kudx5FC) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(((qcEvUO8Wqq56fJ6Kudx5FC) obj).NSjgqmGjEzuugn2SsG1mZFP, this.NSjgqmGjEzuugn2SsG1mZFP);
    }

    public final int hashCode() {
        return this.NSjgqmGjEzuugn2SsG1mZFP.hashCode();
    }

    @Override // com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao
    public final List q1wNbhk2O6(String str, List list) throws SSLPeerUnverifiedException {
        ej6unYlOWMDF.pYmKDYlAmhudp(list, "chain");
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objRemoveFirst, "removeFirst(...)");
        arrayList.add(objRemoveFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            ej6unYlOWMDF.Ca81ebIan1u(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateVxUQ9tBhpHJ2AAEDNW8sghc4m = this.NSjgqmGjEzuugn2SsG1mZFP.VxUQ9tBhpHJ2AAEDNW8sghc4m(x509Certificate);
            if (x509CertificateVxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
                Iterator it = arrayDeque.iterator();
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    ej6unYlOWMDF.Ca81ebIan1u(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (ByTQIhgl7ezGvHXEd(x509Certificate, x509Certificate2, arrayList.size() - 1)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateVxUQ9tBhpHJ2AAEDNW8sghc4m)) {
                arrayList.add(x509CertificateVxUQ9tBhpHJ2AAEDNW8sghc4m);
            }
            if (ByTQIhgl7ezGvHXEd(x509CertificateVxUQ9tBhpHJ2AAEDNW8sghc4m, x509CertificateVxUQ9tBhpHJ2AAEDNW8sghc4m, arrayList.size() - 2)) {
                return arrayList;
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
