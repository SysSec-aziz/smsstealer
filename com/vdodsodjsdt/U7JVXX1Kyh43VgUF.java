package com.vdodsodjsdt;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class U7JVXX1Kyh43VgUF {
    public static final TimeZone VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public static final String zzpBGItXfub0yWj;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        ej6unYlOWMDF.p59rPv72J9(timeZone);
        VxUQ9tBhpHJ2AAEDNW8sghc4m = timeZone;
        String strPCrI77IVeIpJnmCUHd = cwhrCnoVJBjJE2CBEAvBopmgF.pCrI77IVeIpJnmCUHd(o8p4Xhf9gKH3WuUFc74.class.getName(), "okhttp3.");
        if (ngO5JXZkj8nfh41LltHvEjUc.ByTQIhgl7ezGvHXEd(strPCrI77IVeIpJnmCUHd, "Client")) {
            strPCrI77IVeIpJnmCUHd = strPCrI77IVeIpJnmCUHd.substring(0, strPCrI77IVeIpJnmCUHd.length() - 6);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strPCrI77IVeIpJnmCUHd, "substring(...)");
        }
        zzpBGItXfub0yWj = strPCrI77IVeIpJnmCUHd;
    }

    public static final List GI83zq0G8e7zkn(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return zyfAMJWWt8IroEev2OgKlBxvdV.V57tEvNfxZVVcOCAOih5PKr;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        List listUnmodifiableList = Collections.unmodifiableList(vmp19D2MODlOL.rE05n5RsRkyWKIeA9cmLXAKv4Hze((Object[]) objArr.clone()));
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final boolean LaeGQIruHQu81hfJldjMOQSVblH3x(iIBl3qIny2 iibl3qiny2, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ej6unYlOWMDF.pYmKDYlAmhudp(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jV57tEvNfxZVVcOCAOih5PKr = iibl3qiny2.zzpBGItXfub0yWj().LaeGQIruHQu81hfJldjMOQSVblH3x() ? iibl3qiny2.zzpBGItXfub0yWj().V57tEvNfxZVVcOCAOih5PKr() - jNanoTime : Long.MAX_VALUE;
        iibl3qiny2.zzpBGItXfub0yWj().ZfQNn8hdWlEQ5cR94249PDsLR(Math.min(jV57tEvNfxZVVcOCAOih5PKr, timeUnit.toNanos(i)) + jNanoTime);
        try {
            EouCzLZsW9ynithduh eouCzLZsW9ynithduh = new EouCzLZsW9ynithduh();
            while (iibl3qiny2.ko09zE6UAgwkV(8192L, eouCzLZsW9ynithduh) != -1) {
                eouCzLZsW9ynithduh.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            }
            if (jV57tEvNfxZVVcOCAOih5PKr == Long.MAX_VALUE) {
                iibl3qiny2.zzpBGItXfub0yWj().VxUQ9tBhpHJ2AAEDNW8sghc4m();
                return true;
            }
            iibl3qiny2.zzpBGItXfub0yWj().ZfQNn8hdWlEQ5cR94249PDsLR(jNanoTime + jV57tEvNfxZVVcOCAOih5PKr);
            return true;
        } catch (InterruptedIOException unused) {
            if (jV57tEvNfxZVVcOCAOih5PKr == Long.MAX_VALUE) {
                iibl3qiny2.zzpBGItXfub0yWj().VxUQ9tBhpHJ2AAEDNW8sghc4m();
                return false;
            }
            iibl3qiny2.zzpBGItXfub0yWj().ZfQNn8hdWlEQ5cR94249PDsLR(jNanoTime + jV57tEvNfxZVVcOCAOih5PKr);
            return false;
        } catch (Throwable th) {
            if (jV57tEvNfxZVVcOCAOih5PKr == Long.MAX_VALUE) {
                iibl3qiny2.zzpBGItXfub0yWj().VxUQ9tBhpHJ2AAEDNW8sghc4m();
            } else {
                iibl3qiny2.zzpBGItXfub0yWj().ZfQNn8hdWlEQ5cR94249PDsLR(jNanoTime + jV57tEvNfxZVVcOCAOih5PKr);
            }
            throw th;
        }
    }

    public static final List NSjgqmGjEzuugn2SsG1mZFP(List list) {
        ej6unYlOWMDF.pYmKDYlAmhudp(list, "<this>");
        if (list.isEmpty()) {
            return zyfAMJWWt8IroEev2OgKlBxvdV.V57tEvNfxZVVcOCAOih5PKr;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        Object[] array = list.toArray();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(array, "toArray(...)");
        List listUnmodifiableList = Collections.unmodifiableList(vmp19D2MODlOL.rE05n5RsRkyWKIeA9cmLXAKv4Hze(array));
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final String V57tEvNfxZVVcOCAOih5PKr(String str, Object... objArr) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(sveu0WcbYc1gIe sveu0wcbyc1gie, sveu0WcbYc1gIe sveu0wcbyc1gie2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(sveu0wcbyc1gie, "<this>");
        ej6unYlOWMDF.pYmKDYlAmhudp(sveu0wcbyc1gie2, "other");
        return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(sveu0wcbyc1gie.ZfQNn8hdWlEQ5cR94249PDsLR, sveu0wcbyc1gie2.ZfQNn8hdWlEQ5cR94249PDsLR) && sveu0wcbyc1gie.LaeGQIruHQu81hfJldjMOQSVblH3x == sveu0wcbyc1gie2.LaeGQIruHQu81hfJldjMOQSVblH3x && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(sveu0wcbyc1gie.VxUQ9tBhpHJ2AAEDNW8sghc4m, sveu0wcbyc1gie2.VxUQ9tBhpHJ2AAEDNW8sghc4m);
    }

    public static final String ZLZeBXTMq0zDztBxtRTuCHrapQ(sveu0WcbYc1gIe sveu0wcbyc1gie, boolean z) {
        ej6unYlOWMDF.pYmKDYlAmhudp(sveu0wcbyc1gie, "<this>");
        int i = sveu0wcbyc1gie.LaeGQIruHQu81hfJldjMOQSVblH3x;
        String str = sveu0wcbyc1gie.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (cwhrCnoVJBjJE2CBEAvBopmgF.h2b7InwIaORKN91X7whfQh4(str, ":")) {
            str = "[" + str + ']';
        }
        if (!z) {
            String str2 = sveu0wcbyc1gie.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            ej6unYlOWMDF.pYmKDYlAmhudp(str2, "scheme");
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final long ZfQNn8hdWlEQ5cR94249PDsLR(vQITfhejPO vqitfhejpo) {
        String strVxUQ9tBhpHJ2AAEDNW8sghc4m = vqitfhejpo.NSjgqmGjEzuugn2SsG1mZFP.VxUQ9tBhpHJ2AAEDNW8sghc4m("Content-Length");
        if (strVxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
            return -1L;
        }
        byte[] bArr = jHlOQHj3hlCsydfI7r5ApVdQjYvKf.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        try {
            return Long.parseLong(strVxUQ9tBhpHJ2AAEDNW8sghc4m);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final EUSG2RPrSQzuno7qTyOhv0Az zIvmSL0wzmmKGc3X39b2Gw2mUGE(List list) {
        yxp1I6Gr2tLDD3dH0UsMPMDr7 yxp1i6gr2tldd3dh0usmpmdr7 = new yxp1I6Gr2tLDD3dH0UsMPMDr7();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            KK6EHiwUVZvS kK6EHiwUVZvS = (KK6EHiwUVZvS) it.next();
            zonOxHotd3BwAPJcwqr6I6uQNngg4.NSjgqmGjEzuugn2SsG1mZFP(yxp1i6gr2tldd3dh0usmpmdr7, kK6EHiwUVZvS.VxUQ9tBhpHJ2AAEDNW8sghc4m.M9e7PWhFYLD2lOGMker(), kK6EHiwUVZvS.zzpBGItXfub0yWj.M9e7PWhFYLD2lOGMker());
        }
        return yxp1i6gr2tldd3dh0usmpmdr7.zzpBGItXfub0yWj();
    }

    public static final void zzpBGItXfub0yWj(Socket socket) {
        ej6unYlOWMDF.pYmKDYlAmhudp(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }
}
