package com.vdodsodjsdt;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class hy5mi4r2tCUt8XWYMONXrnOpOrTV implements HostnameVerifier {
    public static final hy5mi4r2tCUt8XWYMONXrnOpOrTV VxUQ9tBhpHJ2AAEDNW8sghc4m = new hy5mi4r2tCUt8XWYMONXrnOpOrTV();

    /* JADX WARN: Removed duplicated region for block: B:59:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean V57tEvNfxZVVcOCAOih5PKr(java.lang.String r11, java.security.cert.X509Certificate r12) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.hy5mi4r2tCUt8XWYMONXrnOpOrTV.V57tEvNfxZVVcOCAOih5PKr(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public static List VxUQ9tBhpHJ2AAEDNW8sghc4m(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return zyfAMJWWt8IroEev2OgKlBxvdV.V57tEvNfxZVVcOCAOih5PKr;
    }

    public static boolean zzpBGItXfub0yWj(String str) {
        int i;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + length2 + " > " + str.length()).toString());
        }
        long j = 0;
        int i2 = 0;
        while (i2 < length2) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i = 3;
                } else {
                    int i3 = i2 + 1;
                    char cCharAt2 = i3 < length2 ? str.charAt(i3) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i2 = i3;
                    } else {
                        j += (long) 4;
                        i2 += 2;
                    }
                }
                j += (long) i;
            }
            i2++;
        }
        return length == ((int) j);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "host");
        ej6unYlOWMDF.pYmKDYlAmhudp(sSLSession, "session");
        if (zzpBGItXfub0yWj(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                ej6unYlOWMDF.Ca81ebIan1u(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return V57tEvNfxZVVcOCAOih5PKr(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
