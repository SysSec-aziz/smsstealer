package com.vdodsodjsdt;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class o8p4Xhf9gKH3WuUFc74 {
    public static final List aXO0LSrt8bKV = U7JVXX1Kyh43VgUF.GI83zq0G8e7zkn(new ZQ5iEBLmvObelGeRgKLPRxHbZEk[]{ZQ5iEBLmvObelGeRgKLPRxHbZEk.NSjgqmGjEzuugn2SsG1mZFP, ZQ5iEBLmvObelGeRgKLPRxHbZEk.zIvmSL0wzmmKGc3X39b2Gw2mUGE});
    public static final List vE4yDIjexsP2lGjLaTcB = U7JVXX1Kyh43VgUF.GI83zq0G8e7zkn(new aloYcuoPLQwNUIx6IjuQPANqqGRoM[]{aloYcuoPLQwNUIx6IjuQPANqqGRoM.LaeGQIruHQu81hfJldjMOQSVblH3x, aloYcuoPLQwNUIx6IjuQPANqqGRoM.zIvmSL0wzmmKGc3X39b2Gw2mUGE});
    public final SocketFactory Ca81ebIan1u;
    public final boolean GI83zq0G8e7zkn;
    public final IN79WcIk5xB4t0GjRT43qPLs5 HzCpKshMOoaw76hFcbOVRYMeRd;
    public final int Irh5auREsoeV1C1RaBamlmy;
    public final Proxy KUYypEB4eNWOZWVDpH;
    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final IN79WcIk5xB4t0GjRT43qPLs5 M9e7PWhFYLD2lOGMker;
    public final boolean NSjgqmGjEzuugn2SsG1mZFP;
    public final int RhfGHxtXxy0M0grmp2jkRjQg;
    public final j5jyRGaw4k SuB3hEmTmbbRGAhtvOOmfKEon;
    public final sGipz63rTUmSj3uFDvOtzihao TaDO7ogis3aEiWEtq;
    public final List V57tEvNfxZVVcOCAOih5PKr;
    public final nMRZPpfLCgJyuB VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final IN79WcIk5xB4t0GjRT43qPLs5 ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final ojJdkROPjZ ZfQNn8hdWlEQ5cR94249PDsLR;
    public final hy5mi4r2tCUt8XWYMONXrnOpOrTV f6ZQsR6bPLvvCDNXOUc;
    public final SSLSocketFactory h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public final List jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public final List ko09zE6UAgwkV;
    public final IN79WcIk5xB4t0GjRT43qPLs5 p59rPv72J9;
    public final X509TrustManager pYmKDYlAmhudp;
    public final Skgk8FYn8b4TvRiBOsElZw4XkNLhQ pzqP2AqKW6J5PO8zCKnW;
    public final int q11o1hieEkZDhF1MGOZI26oZiDT;
    public final ProxySelector q1wNbhk2O6;
    public final qF22Y620JkFyombtDYw0h0h8Rxpja qNPQb1obP7;
    public final PZstJ1QixRNRG4lJj4zCb3 vBGA6pPLqSMuYGvprl270j7;
    public final int w0Wu95l8dVNw5rZMRu;
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final List zzpBGItXfub0yWj;

    public o8p4Xhf9gKH3WuUFc74(TyHzuUhySkdm8S tyHzuUhySkdm8S) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = tyHzuUhySkdm8S.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        this.zzpBGItXfub0yWj = U7JVXX1Kyh43VgUF.NSjgqmGjEzuugn2SsG1mZFP(tyHzuUhySkdm8S.V57tEvNfxZVVcOCAOih5PKr);
        this.V57tEvNfxZVVcOCAOih5PKr = U7JVXX1Kyh43VgUF.NSjgqmGjEzuugn2SsG1mZFP(tyHzuUhySkdm8S.ZfQNn8hdWlEQ5cR94249PDsLR);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = tyHzuUhySkdm8S.LaeGQIruHQu81hfJldjMOQSVblH3x;
        boolean z = tyHzuUhySkdm8S.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = z;
        boolean z2 = tyHzuUhySkdm8S.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = z2;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = tyHzuUhySkdm8S.NSjgqmGjEzuugn2SsG1mZFP;
        this.NSjgqmGjEzuugn2SsG1mZFP = tyHzuUhySkdm8S.GI83zq0G8e7zkn;
        this.GI83zq0G8e7zkn = tyHzuUhySkdm8S.M9e7PWhFYLD2lOGMker;
        this.M9e7PWhFYLD2lOGMker = tyHzuUhySkdm8S.HzCpKshMOoaw76hFcbOVRYMeRd;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = tyHzuUhySkdm8S.KUYypEB4eNWOZWVDpH;
        Proxy proxy = tyHzuUhySkdm8S.q1wNbhk2O6;
        this.KUYypEB4eNWOZWVDpH = proxy;
        if (proxy != null || (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = tjRpb7ToRqoCUYmbj1m9ZI.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        }
        this.q1wNbhk2O6 = proxySelector;
        this.p59rPv72J9 = tyHzuUhySkdm8S.p59rPv72J9;
        this.Ca81ebIan1u = tyHzuUhySkdm8S.Ca81ebIan1u;
        List list = tyHzuUhySkdm8S.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        this.ko09zE6UAgwkV = list;
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = tyHzuUhySkdm8S.pYmKDYlAmhudp;
        this.f6ZQsR6bPLvvCDNXOUc = tyHzuUhySkdm8S.ko09zE6UAgwkV;
        this.Irh5auREsoeV1C1RaBamlmy = tyHzuUhySkdm8S.f6ZQsR6bPLvvCDNXOUc;
        int i = tyHzuUhySkdm8S.vBGA6pPLqSMuYGvprl270j7;
        this.q11o1hieEkZDhF1MGOZI26oZiDT = i;
        int i2 = tyHzuUhySkdm8S.TaDO7ogis3aEiWEtq;
        this.w0Wu95l8dVNw5rZMRu = i2;
        int i3 = tyHzuUhySkdm8S.Irh5auREsoeV1C1RaBamlmy;
        this.RhfGHxtXxy0M0grmp2jkRjQg = i3;
        qF22Y620JkFyombtDYw0h0h8Rxpja qf22y620jkfyombtdyw0h0h8rxpja = new qF22Y620JkFyombtDYw0h0h8Rxpja();
        qf22y620jkfyombtdyw0h0h8rxpja.V57tEvNfxZVVcOCAOih5PKr = new LinkedHashSet();
        this.qNPQb1obP7 = qf22y620jkfyombtdyw0h0h8rxpja;
        this.SuB3hEmTmbbRGAhtvOOmfKEon = j5jyRGaw4k.KUYypEB4eNWOZWVDpH;
        Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ = tyHzuUhySkdm8S.zzpBGItXfub0yWj;
        if (skgk8FYn8b4TvRiBOsElZw4XkNLhQ == null) {
            skgk8FYn8b4TvRiBOsElZw4XkNLhQ = new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(i2, i3, i, i2, z, z2, qf22y620jkfyombtdyw0h0h8rxpja);
            tyHzuUhySkdm8S.zzpBGItXfub0yWj = skgk8FYn8b4TvRiBOsElZw4XkNLhQ;
        }
        this.pzqP2AqKW6J5PO8zCKnW = skgk8FYn8b4TvRiBOsElZw4XkNLhQ;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((aloYcuoPLQwNUIx6IjuQPANqqGRoM) it.next()).VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                    O510kkNvCgHHMXIbKz1NqEFfrmj o510kkNvCgHHMXIbKz1NqEFfrmj = O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m.getClass();
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((KeyStore) null);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    ej6unYlOWMDF.p59rPv72J9(trustManagers);
                    if (trustManagers.length == 1) {
                        TrustManager trustManager = trustManagers[0];
                        if (trustManager instanceof X509TrustManager) {
                            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                            this.pYmKDYlAmhudp = x509TrustManager;
                            O510kkNvCgHHMXIbKz1NqEFfrmj o510kkNvCgHHMXIbKz1NqEFfrmj2 = O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                            o510kkNvCgHHMXIbKz1NqEFfrmj2.getClass();
                            try {
                                SSLContext sSLContextKUYypEB4eNWOZWVDpH = o510kkNvCgHHMXIbKz1NqEFfrmj2.KUYypEB4eNWOZWVDpH();
                                sSLContextKUYypEB4eNWOZWVDpH.init(null, new TrustManager[]{x509TrustManager}, null);
                                SSLSocketFactory socketFactory = sSLContextKUYypEB4eNWOZWVDpH.getSocketFactory();
                                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(socketFactory, "getSocketFactory(...)");
                                this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = socketFactory;
                                sGipz63rTUmSj3uFDvOtzihao sgipz63rtumsj3ufdvotzihaoV57tEvNfxZVVcOCAOih5PKr = O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr(x509TrustManager);
                                this.TaDO7ogis3aEiWEtq = sgipz63rtumsj3ufdvotzihaoV57tEvNfxZVVcOCAOih5PKr;
                                PZstJ1QixRNRG4lJj4zCb3 pZstJ1QixRNRG4lJj4zCb3 = tyHzuUhySkdm8S.jW7EiD0YL6xkbB158jMUzhWNWb1y;
                                this.vBGA6pPLqSMuYGvprl270j7 = ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(pZstJ1QixRNRG4lJj4zCb3.zzpBGItXfub0yWj, sgipz63rtumsj3ufdvotzihaoV57tEvNfxZVVcOCAOih5PKr) ? pZstJ1QixRNRG4lJj4zCb3 : new PZstJ1QixRNRG4lJj4zCb3(pZstJ1QixRNRG4lJj4zCb3.VxUQ9tBhpHJ2AAEDNW8sghc4m, sgipz63rtumsj3ufdvotzihaoV57tEvNfxZVVcOCAOih5PKr);
                            } catch (GeneralSecurityException e) {
                                throw new AssertionError("No System TLS: " + e, e);
                            }
                        }
                    }
                    String string = Arrays.toString(trustManagers);
                    ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "toString(...)");
                    throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
                }
            }
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = null;
            this.TaDO7ogis3aEiWEtq = null;
            this.pYmKDYlAmhudp = null;
            this.vBGA6pPLqSMuYGvprl270j7 = PZstJ1QixRNRG4lJj4zCb3.V57tEvNfxZVVcOCAOih5PKr;
        } else {
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = null;
            this.TaDO7ogis3aEiWEtq = null;
            this.pYmKDYlAmhudp = null;
            this.vBGA6pPLqSMuYGvprl270j7 = PZstJ1QixRNRG4lJj4zCb3.V57tEvNfxZVVcOCAOih5PKr;
        }
        X509TrustManager x509TrustManager2 = this.pYmKDYlAmhudp;
        sGipz63rTUmSj3uFDvOtzihao sgipz63rtumsj3ufdvotzihao = this.TaDO7ogis3aEiWEtq;
        SSLSocketFactory sSLSocketFactory = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        List list2 = this.V57tEvNfxZVVcOCAOih5PKr;
        List list3 = this.zzpBGItXfub0yWj;
        ej6unYlOWMDF.Ca81ebIan1u(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        ej6unYlOWMDF.Ca81ebIan1u(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list2).toString());
        }
        List list4 = this.ko09zE6UAgwkV;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((aloYcuoPLQwNUIx6IjuQPANqqGRoM) it2.next()).VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                    if (sSLSocketFactory == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (sgipz63rtumsj3ufdvotzihao == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (sgipz63rtumsj3ufdvotzihao != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.vBGA6pPLqSMuYGvprl270j7, PZstJ1QixRNRG4lJj4zCb3.V57tEvNfxZVVcOCAOih5PKr)) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
