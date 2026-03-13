package com.vdodsodjsdt;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class AirzLF6kxtqpnz extends sGipz63rTUmSj3uFDvOtzihao {
    public final X509TrustManagerExtensions GI83zq0G8e7zkn;
    public final X509TrustManager NSjgqmGjEzuugn2SsG1mZFP;

    public AirzLF6kxtqpnz(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.NSjgqmGjEzuugn2SsG1mZFP = x509TrustManager;
        this.GI83zq0G8e7zkn = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AirzLF6kxtqpnz) && ((AirzLF6kxtqpnz) obj).NSjgqmGjEzuugn2SsG1mZFP == this.NSjgqmGjEzuugn2SsG1mZFP;
    }

    public final int hashCode() {
        return System.identityHashCode(this.NSjgqmGjEzuugn2SsG1mZFP);
    }

    @Override // com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao
    public final List q1wNbhk2O6(String str, List list) throws SSLPeerUnverifiedException {
        ej6unYlOWMDF.pYmKDYlAmhudp(list, "chain");
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.GI83zq0G8e7zkn.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(listCheckServerTrusted, "checkServerTrusted(...)");
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
