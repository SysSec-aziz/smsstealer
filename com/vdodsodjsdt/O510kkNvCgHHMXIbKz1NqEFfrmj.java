package com.vdodsodjsdt;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class O510kkNvCgHHMXIbKz1NqEFfrmj {
    public static volatile O510kkNvCgHHMXIbKz1NqEFfrmj VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public static final Logger zzpBGItXfub0yWj;

    static {
        try {
            for (Map.Entry entry : a8IKGxZ7ZrNFkaHe62tpu.zzpBGItXfub0yWj.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (a8IKGxZ7ZrNFkaHe62tpu.VxUQ9tBhpHJ2AAEDNW8sghc4m.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(IwDYrXcjEGO15dAXoQSBk.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                }
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        O510kkNvCgHHMXIbKz1NqEFfrmj mAyerWsKHN = MAyerWsKHN.LaeGQIruHQu81hfJldjMOQSVblH3x ? new MAyerWsKHN() : null;
        if (mAyerWsKHN == null) {
            mAyerWsKHN = qOcMPzWPfB7z.LaeGQIruHQu81hfJldjMOQSVblH3x ? new qOcMPzWPfB7z() : null;
        }
        if (mAyerWsKHN == null) {
            throw new IllegalStateException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Expected Android API level 21+ but was ", Build.VERSION.SDK_INT));
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m = mAyerWsKHN;
        zzpBGItXfub0yWj = Logger.getLogger(o8p4Xhf9gKH3WuUFc74.class.getName());
    }

    public abstract boolean GI83zq0G8e7zkn(String str);

    public void HzCpKshMOoaw76hFcbOVRYMeRd(Object obj, String str) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        M9e7PWhFYLD2lOGMker(str, 5, (Throwable) obj);
    }

    public SSLContext KUYypEB4eNWOZWVDpH() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public abstract void LaeGQIruHQu81hfJldjMOQSVblH3x(SSLSocket sSLSocket, String str, List list);

    public void M9e7PWhFYLD2lOGMker(String str, int i, Throwable th) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "message");
        zzpBGItXfub0yWj.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public Object NSjgqmGjEzuugn2SsG1mZFP() {
        if (zzpBGItXfub0yWj.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public abstract sGipz63rTUmSj3uFDvOtzihao V57tEvNfxZVVcOCAOih5PKr(X509TrustManager x509TrustManager);

    public abstract String ZLZeBXTMq0zDztBxtRTuCHrapQ(SSLSocket sSLSocket);

    public jp0UKjTOIOtU ZfQNn8hdWlEQ5cR94249PDsLR(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new LR9iJhvTmSe6VG0thsBZJxPpAx((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void zIvmSL0wzmmKGc3X39b2Gw2mUGE(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        ej6unYlOWMDF.pYmKDYlAmhudp(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }
}
