package com.vdodsodjsdt;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class RYrcWqAmRWNPbPL1pDGl1X implements RSSn7Y5tk2UmJ {
    public static final IN79WcIk5xB4t0GjRT43qPLs5 LaeGQIruHQu81hfJldjMOQSVblH3x = new IN79WcIk5xB4t0GjRT43qPLs5(19);
    public final Method V57tEvNfxZVVcOCAOih5PKr;
    public final Class VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final Method ZfQNn8hdWlEQ5cR94249PDsLR;
    public final Method zzpBGItXfub0yWj;

    public RYrcWqAmRWNPbPL1pDGl1X(Class cls) throws NoSuchMethodException {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(declaredMethod, "getDeclaredMethod(...)");
        this.zzpBGItXfub0yWj = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.V57tEvNfxZVVcOCAOih5PKr = cls.getMethod("getAlpnSelectedProtocol", null);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // com.vdodsodjsdt.RSSn7Y5tk2UmJ
    public final boolean V57tEvNfxZVVcOCAOih5PKr() {
        boolean z = qOcMPzWPfB7z.LaeGQIruHQu81hfJldjMOQSVblH3x;
        return qOcMPzWPfB7z.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // com.vdodsodjsdt.RSSn7Y5tk2UmJ
    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(SSLSocket sSLSocket) {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.isInstance(sSLSocket);
    }

    @Override // com.vdodsodjsdt.RSSn7Y5tk2UmJ
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(SSLSocket sSLSocket, String str, List list) {
        ej6unYlOWMDF.pYmKDYlAmhudp(list, "protocols");
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m.isInstance(sSLSocket)) {
            try {
                this.zzpBGItXfub0yWj.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                O510kkNvCgHHMXIbKz1NqEFfrmj o510kkNvCgHHMXIbKz1NqEFfrmj = O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                method.invoke(sSLSocket, FG8LIxsgYiLSfhN0jYKIKr.NSjgqmGjEzuugn2SsG1mZFP(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // com.vdodsodjsdt.RSSn7Y5tk2UmJ
    public final String zzpBGItXfub0yWj(SSLSocket sSLSocket) {
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.V57tEvNfxZVVcOCAOih5PKr.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, DEYHHOT0rxPFnkgGJgP0ym2DRq1.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e2);
                }
            }
        }
        return null;
    }
}
