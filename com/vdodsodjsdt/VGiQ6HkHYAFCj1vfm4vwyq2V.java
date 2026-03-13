package com.vdodsodjsdt;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class VGiQ6HkHYAFCj1vfm4vwyq2V implements KkbWjTE2UaMlxoZQ9Ll {
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
    public final Object zzpBGItXfub0yWj;

    public VGiQ6HkHYAFCj1vfm4vwyq2V(IN79WcIk5xB4t0GjRT43qPLs5 iN79WcIk5xB4t0GjRT43qPLs5) {
        ej6unYlOWMDF.pYmKDYlAmhudp(iN79WcIk5xB4t0GjRT43qPLs5, "cookieJar");
        this.zzpBGItXfub0yWj = iN79WcIk5xB4t0GjRT43qPLs5;
    }

    public static int ZfQNn8hdWlEQ5cR94249PDsLR(vQITfhejPO vqitfhejpo, int i) {
        String strVxUQ9tBhpHJ2AAEDNW8sghc4m = vqitfhejpo.NSjgqmGjEzuugn2SsG1mZFP.VxUQ9tBhpHJ2AAEDNW8sghc4m("Retry-After");
        if (strVxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
            strVxUQ9tBhpHJ2AAEDNW8sghc4m = null;
        }
        if (strVxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strVxUQ9tBhpHJ2AAEDNW8sghc4m).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strVxUQ9tBhpHJ2AAEDNW8sghc4m);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(numValueOf, "valueOf(...)");
        return numValueOf.intValue();
    }

    public boolean V57tEvNfxZVVcOCAOih5PKr(IOException iOException, EwfUDU4p8ayzzu4RNSgUdB ewfUDU4p8ayzzu4RNSgUdB, tpLngQCdAeyjjtxlI tplngqcdaeyjjtxli) {
        EOksdALzG1YtVRjkh eOksdALzG1YtVRjkh;
        boolean z = iOException instanceof kkiT8rKj7EFntQLbevG0m;
        if (!((o8p4Xhf9gKH3WuUFc74) this.zzpBGItXfub0yWj).LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return false;
        }
        if ((!z && (((eOksdALzG1YtVRjkh = (EOksdALzG1YtVRjkh) tplngqcdaeyjjtxli.LaeGQIruHQu81hfJldjMOQSVblH3x) != null && eOksdALzG1YtVRjkh.V57tEvNfxZVVcOCAOih5PKr()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        Zqam9EI4z3IGnFKq zqam9EI4z3IGnFKq = ewfUDU4p8ayzzu4RNSgUdB.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        if (zqam9EI4z3IGnFKq == null || !zqam9EI4z3IGnFKq.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            return false;
        }
        eQ4t6yhV4vxJ5QNjrzzBTCQF3Nw eq4t6yhv4vxj5qnjrzzbtcqf3nw = ewfUDU4p8ayzzu4RNSgUdB.GI83zq0G8e7zkn;
        ej6unYlOWMDF.p59rPv72J9(eq4t6yhv4vxj5qnjrzzbtcqf3nw);
        A3cppuj9wGt a3cppuj9wGtZzpBGItXfub0yWj = eq4t6yhv4vxj5qnjrzzbtcqf3nw.zzpBGItXfub0yWj();
        Zqam9EI4z3IGnFKq zqam9EI4z3IGnFKq2 = ewfUDU4p8ayzzu4RNSgUdB.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        return a3cppuj9wGtZzpBGItXfub0yWj.V57tEvNfxZVVcOCAOih5PKr(zqam9EI4z3IGnFKq2 != null ? zqam9EI4z3IGnFKq2.zzpBGItXfub0yWj() : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ef, code lost:
    
        r6.V57tEvNfxZVVcOCAOih5PKr(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0101, code lost:
    
        return r9;
     */
    @Override // com.vdodsodjsdt.KkbWjTE2UaMlxoZQ9Ll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.vdodsodjsdt.vQITfhejPO VxUQ9tBhpHJ2AAEDNW8sghc4m(com.vdodsodjsdt.bwXjL2AsSEgcpqgRMvOZqEV9 r37) {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.VGiQ6HkHYAFCj1vfm4vwyq2V.VxUQ9tBhpHJ2AAEDNW8sghc4m(com.vdodsodjsdt.bwXjL2AsSEgcpqgRMvOZqEV9):com.vdodsodjsdt.vQITfhejPO");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.vdodsodjsdt.tpLngQCdAeyjjtxlI zzpBGItXfub0yWj(com.vdodsodjsdt.vQITfhejPO r13, com.vdodsodjsdt.Zqam9EI4z3IGnFKq r14) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.VGiQ6HkHYAFCj1vfm4vwyq2V.zzpBGItXfub0yWj(com.vdodsodjsdt.vQITfhejPO, com.vdodsodjsdt.Zqam9EI4z3IGnFKq):com.vdodsodjsdt.tpLngQCdAeyjjtxlI");
    }

    public VGiQ6HkHYAFCj1vfm4vwyq2V(o8p4Xhf9gKH3WuUFc74 o8p4xhf9gkh3wuufc74) {
        this.zzpBGItXfub0yWj = o8p4xhf9gkh3wuufc74;
    }
}
