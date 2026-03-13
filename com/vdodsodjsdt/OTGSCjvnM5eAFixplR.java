package com.vdodsodjsdt;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class OTGSCjvnM5eAFixplR implements jp0UKjTOIOtU {
    public final X509TrustManager VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final Method zzpBGItXfub0yWj;

    public OTGSCjvnM5eAFixplR(X509TrustManager x509TrustManager, Method method) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = x509TrustManager;
        this.zzpBGItXfub0yWj = method;
    }

    @Override // com.vdodsodjsdt.jp0UKjTOIOtU
    public final X509Certificate VxUQ9tBhpHJ2AAEDNW8sghc4m(X509Certificate x509Certificate) {
        try {
            Object objInvoke = this.zzpBGItXfub0yWj.invoke(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, x509Certificate);
            ej6unYlOWMDF.Ca81ebIan1u(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OTGSCjvnM5eAFixplR)) {
            return false;
        }
        OTGSCjvnM5eAFixplR oTGSCjvnM5eAFixplR = (OTGSCjvnM5eAFixplR) obj;
        return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, oTGSCjvnM5eAFixplR.VxUQ9tBhpHJ2AAEDNW8sghc4m) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.zzpBGItXfub0yWj, oTGSCjvnM5eAFixplR.zzpBGItXfub0yWj);
    }

    public final int hashCode() {
        return this.zzpBGItXfub0yWj.hashCode() + (this.VxUQ9tBhpHJ2AAEDNW8sghc4m.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + ", findByIssuerAndSignatureMethod=" + this.zzpBGItXfub0yWj + ')';
    }
}
