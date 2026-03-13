package com.vdodsodjsdt;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class JkEUIOeQEWq0UUU implements AkpQfjiBveZX5wDhj0, ohjB5lavt9Gy1qVLWRd {
    public volatile boolean Ca81ebIan1u;
    public final hZGwZLSkscFiWiqL GI83zq0G8e7zkn;
    public final List HzCpKshMOoaw76hFcbOVRYMeRd;
    public final tpLngQCdAeyjjtxlI KUYypEB4eNWOZWVDpH;
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final nS5othbQ44GTnNo3dq M9e7PWhFYLD2lOGMker;
    public final ixvYVtn9EMRQ7IMkUn6Ak2pqJO6h NSjgqmGjEzuugn2SsG1mZFP;
    public ozyMFBfTwKTRwifTDHYB8VGdyq TaDO7ogis3aEiWEtq;
    public final int V57tEvNfxZVVcOCAOih5PKr;
    public final j5jyRGaw4k VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;
    public nfXvCNpsFLQkxk3Wa f6ZQsR6bPLvvCDNXOUc;
    public Socket h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public ZQ5iEBLmvObelGeRgKLPRxHbZEk jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public PVtnHWoGacfAJXum4 ko09zE6UAgwkV;
    public final boolean p59rPv72J9;
    public Socket pYmKDYlAmhudp;
    public final int q1wNbhk2O6;
    public j8cYbznT7ugZEUE04S8p0 vBGA6pPLqSMuYGvprl270j7;
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final IBo1UM4YpEOkefD zzpBGItXfub0yWj;

    public JkEUIOeQEWq0UUU(j5jyRGaw4k j5jyrgaw4k, IBo1UM4YpEOkefD iBo1UM4YpEOkefD, int i, int i2, int i3, int i4, boolean z, ixvYVtn9EMRQ7IMkUn6Ak2pqJO6h ixvyvtn9emrq7imkun6ak2pqjo6h, hZGwZLSkscFiWiqL hzgwzlskscfiwiql, nS5othbQ44GTnNo3dq ns5othbq44gtnno3dq, List list, tpLngQCdAeyjjtxlI tplngqcdaeyjjtxli, int i5, boolean z2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(j5jyrgaw4k, "taskRunner");
        ej6unYlOWMDF.pYmKDYlAmhudp(iBo1UM4YpEOkefD, "connectionPool");
        ej6unYlOWMDF.pYmKDYlAmhudp(ns5othbq44gtnno3dq, "route");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = j5jyrgaw4k;
        this.zzpBGItXfub0yWj = iBo1UM4YpEOkefD;
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i2;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i3;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i4;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = z;
        this.NSjgqmGjEzuugn2SsG1mZFP = ixvyvtn9emrq7imkun6ak2pqjo6h;
        this.GI83zq0G8e7zkn = hzgwzlskscfiwiql;
        this.M9e7PWhFYLD2lOGMker = ns5othbq44gtnno3dq;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = list;
        this.KUYypEB4eNWOZWVDpH = tplngqcdaeyjjtxli;
        this.q1wNbhk2O6 = i5;
        this.p59rPv72J9 = z2;
    }

    public final void GI83zq0G8e7zkn() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.M9e7PWhFYLD2lOGMker.zzpBGItXfub0yWj.type();
        int i = type == null ? -1 : qDwQK8A6ZFcVMHYzWZG.VxUQ9tBhpHJ2AAEDNW8sghc4m[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.M9e7PWhFYLD2lOGMker.VxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj.createSocket();
            ej6unYlOWMDF.p59rPv72J9(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(this.M9e7PWhFYLD2lOGMker.zzpBGItXfub0yWj);
        }
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = socketCreateSocket;
        if (this.Ca81ebIan1u) {
            throw new IOException("canceled");
        }
        socketCreateSocket.setSoTimeout(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        try {
            O510kkNvCgHHMXIbKz1NqEFfrmj o510kkNvCgHHMXIbKz1NqEFfrmj = O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE(socketCreateSocket, this.M9e7PWhFYLD2lOGMker.V57tEvNfxZVVcOCAOih5PKr, this.LaeGQIruHQu81hfJldjMOQSVblH3x);
            try {
                this.f6ZQsR6bPLvvCDNXOUc = new nfXvCNpsFLQkxk3Wa(KfeOQNOupsCg6878zi4e.wdI7vzA3Qmcwd(socketCreateSocket));
                this.vBGA6pPLqSMuYGvprl270j7 = new j8cYbznT7ugZEUE04S8p0(KfeOQNOupsCg6878zi4e.hKs1wlZyvtUNaW1f5ABIGacfPcvX(socketCreateSocket));
            } catch (NullPointerException e) {
                if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.M9e7PWhFYLD2lOGMker.V57tEvNfxZVVcOCAOih5PKr);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final j3soyeolow HzCpKshMOoaw76hFcbOVRYMeRd() throws IOException {
        tpLngQCdAeyjjtxlI tplngqcdaeyjjtxli = this.KUYypEB4eNWOZWVDpH;
        ej6unYlOWMDF.p59rPv72J9(tplngqcdaeyjjtxli);
        nS5othbQ44GTnNo3dq ns5othbq44gtnno3dq = this.M9e7PWhFYLD2lOGMker;
        String str = "CONNECT " + U7JVXX1Kyh43VgUF.ZLZeBXTMq0zDztBxtRTuCHrapQ(ns5othbq44gtnno3dq.VxUQ9tBhpHJ2AAEDNW8sghc4m.GI83zq0G8e7zkn, true) + " HTTP/1.1";
        nfXvCNpsFLQkxk3Wa nfxvcnpsflqkxk3wa = this.f6ZQsR6bPLvvCDNXOUc;
        if (nfxvcnpsflqkxk3wa == null) {
            ej6unYlOWMDF.BJQHddi0Plr5ElWetCyaixWOg9("source");
            throw null;
        }
        j8cYbznT7ugZEUE04S8p0 j8cybznt7ugzeue04s8p0 = this.vBGA6pPLqSMuYGvprl270j7;
        if (j8cybznt7ugzeue04s8p0 == null) {
            ej6unYlOWMDF.BJQHddi0Plr5ElWetCyaixWOg9("sink");
            throw null;
        }
        U4Gf2WRl4jA30QHPc u4Gf2WRl4jA30QHPc = new U4Gf2WRl4jA30QHPc(null, this, nfxvcnpsflqkxk3wa, j8cybznt7ugzeue04s8p0);
        nfXvCNpsFLQkxk3Wa nfxvcnpsflqkxk3wa2 = this.f6ZQsR6bPLvvCDNXOUc;
        if (nfxvcnpsflqkxk3wa2 == null) {
            ej6unYlOWMDF.BJQHddi0Plr5ElWetCyaixWOg9("source");
            throw null;
        }
        Rls9YNaGzWVnzvwT rls9YNaGzWVnzvwTZzpBGItXfub0yWj = nfxvcnpsflqkxk3wa2.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj();
        long j = this.V57tEvNfxZVVcOCAOih5PKr;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        rls9YNaGzWVnzvwTZzpBGItXfub0yWj.ZLZeBXTMq0zDztBxtRTuCHrapQ(j);
        j8cYbznT7ugZEUE04S8p0 j8cybznt7ugzeue04s8p02 = this.vBGA6pPLqSMuYGvprl270j7;
        if (j8cybznt7ugzeue04s8p02 == null) {
            ej6unYlOWMDF.BJQHddi0Plr5ElWetCyaixWOg9("sink");
            throw null;
        }
        j8cybznt7ugzeue04s8p02.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj().ZLZeBXTMq0zDztBxtRTuCHrapQ(this.ZfQNn8hdWlEQ5cR94249PDsLR);
        u4Gf2WRl4jA30QHPc.HzCpKshMOoaw76hFcbOVRYMeRd((EUSG2RPrSQzuno7qTyOhv0Az) tplngqcdaeyjjtxli.ZfQNn8hdWlEQ5cR94249PDsLR, str);
        u4Gf2WRl4jA30QHPc.zzpBGItXfub0yWj();
        GPbzGuds6T72DsvjLiqOziy8CFcNt gPbzGuds6T72DsvjLiqOziy8CFcNtGI83zq0G8e7zkn = u4Gf2WRl4jA30QHPc.GI83zq0G8e7zkn(false);
        ej6unYlOWMDF.p59rPv72J9(gPbzGuds6T72DsvjLiqOziy8CFcNtGI83zq0G8e7zkn);
        gPbzGuds6T72DsvjLiqOziy8CFcNtGI83zq0G8e7zkn.VxUQ9tBhpHJ2AAEDNW8sghc4m = tplngqcdaeyjjtxli;
        vQITfhejPO vqitfhejpoVxUQ9tBhpHJ2AAEDNW8sghc4m = gPbzGuds6T72DsvjLiqOziy8CFcNtGI83zq0G8e7zkn.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        int i = vqitfhejpoVxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        long jZfQNn8hdWlEQ5cR94249PDsLR = U7JVXX1Kyh43VgUF.ZfQNn8hdWlEQ5cR94249PDsLR(vqitfhejpoVxUQ9tBhpHJ2AAEDNW8sghc4m);
        if (jZfQNn8hdWlEQ5cR94249PDsLR != -1) {
            aUMGpK2XTYCqkTc7b aumgpk2xtycqktc7bM9e7PWhFYLD2lOGMker = u4Gf2WRl4jA30QHPc.M9e7PWhFYLD2lOGMker((sveu0WcbYc1gIe) vqitfhejpoVxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj, jZfQNn8hdWlEQ5cR94249PDsLR);
            U7JVXX1Kyh43VgUF.LaeGQIruHQu81hfJldjMOQSVblH3x(aumgpk2xtycqktc7bM9e7PWhFYLD2lOGMker, Integer.MAX_VALUE);
            aumgpk2xtycqktc7bM9e7PWhFYLD2lOGMker.close();
        }
        if (i == 200) {
            return new j3soyeolow(this, (Throwable) null, 6);
        }
        if (i != 407) {
            throw new IOException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Unexpected response code for CONNECT: ", i));
        }
        ns5othbq44gtnno3dq.VxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getClass();
        throw new IOException("Failed to authenticate with proxy");
    }

    public final JkEUIOeQEWq0UUU KUYypEB4eNWOZWVDpH(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        ej6unYlOWMDF.pYmKDYlAmhudp(list, "connectionSpecs");
        int i = this.q1wNbhk2O6;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            aloYcuoPLQwNUIx6IjuQPANqqGRoM aloycuoplqwnuix6ijuqpanqqgrom = (aloYcuoPLQwNUIx6IjuQPANqqGRoM) list.get(i2);
            aloycuoplqwnuix6ijuqpanqqgrom.getClass();
            if (aloycuoplqwnuix6ijuqpanqqgrom.VxUQ9tBhpHJ2AAEDNW8sghc4m && (((strArr = aloycuoplqwnuix6ijuqpanqqgrom.ZfQNn8hdWlEQ5cR94249PDsLR) == null || jHlOQHj3hlCsydfI7r5ApVdQjYvKf.LaeGQIruHQu81hfJldjMOQSVblH3x(strArr, sSLSocket.getEnabledProtocols(), j3NzRnoMyBCEhiCckdVbKvM2dMf.zzpBGItXfub0yWj)) && ((strArr2 = aloycuoplqwnuix6ijuqpanqqgrom.V57tEvNfxZVVcOCAOih5PKr) == null || jHlOQHj3hlCsydfI7r5ApVdQjYvKf.LaeGQIruHQu81hfJldjMOQSVblH3x(strArr2, sSLSocket.getEnabledCipherSuites(), E246m2jcOzL76dqF.V57tEvNfxZVVcOCAOih5PKr)))) {
                return new JkEUIOeQEWq0UUU(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, this.zzpBGItXfub0yWj, this.V57tEvNfxZVVcOCAOih5PKr, this.ZfQNn8hdWlEQ5cR94249PDsLR, this.LaeGQIruHQu81hfJldjMOQSVblH3x, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, this.ZLZeBXTMq0zDztBxtRTuCHrapQ, this.NSjgqmGjEzuugn2SsG1mZFP, this.GI83zq0G8e7zkn, this.M9e7PWhFYLD2lOGMker, this.HzCpKshMOoaw76hFcbOVRYMeRd, this.KUYypEB4eNWOZWVDpH, i2, i != -1);
            }
        }
        return null;
    }

    @Override // com.vdodsodjsdt.AkpQfjiBveZX5wDhj0
    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x() {
        return this.jW7EiD0YL6xkbB158jMUzhWNWb1y != null;
    }

    public final void M9e7PWhFYLD2lOGMker(SSLSocket sSLSocket, aloYcuoPLQwNUIx6IjuQPANqqGRoM aloycuoplqwnuix6ijuqpanqqgrom) {
        String strZLZeBXTMq0zDztBxtRTuCHrapQ;
        ZQ5iEBLmvObelGeRgKLPRxHbZEk zQ5iEBLmvObelGeRgKLPRxHbZEkGI83zq0G8e7zkn;
        final xJilh3An9LAykwTqP7vc xjilh3an9laykwtqp7vc = this.M9e7PWhFYLD2lOGMker.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        try {
            if (aloycuoplqwnuix6ijuqpanqqgrom.zzpBGItXfub0yWj) {
                O510kkNvCgHHMXIbKz1NqEFfrmj o510kkNvCgHHMXIbKz1NqEFfrmj = O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x(sSLSocket, xjilh3an9laykwtqp7vc.GI83zq0G8e7zkn.ZfQNn8hdWlEQ5cR94249PDsLR, xjilh3an9laykwtqp7vc.M9e7PWhFYLD2lOGMker);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            ej6unYlOWMDF.p59rPv72J9(session);
            final PVtnHWoGacfAJXum4 pVtnHWoGacfAJXum4Q11o1hieEkZDhF1MGOZI26oZiDT = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.q11o1hieEkZDhF1MGOZI26oZiDT(session);
            HostnameVerifier hostnameVerifier = xjilh3an9laykwtqp7vc.ZfQNn8hdWlEQ5cR94249PDsLR;
            ej6unYlOWMDF.p59rPv72J9(hostnameVerifier);
            if (!hostnameVerifier.verify(xjilh3an9laykwtqp7vc.GI83zq0G8e7zkn.ZfQNn8hdWlEQ5cR94249PDsLR, session)) {
                List listVxUQ9tBhpHJ2AAEDNW8sghc4m = pVtnHWoGacfAJXum4Q11o1hieEkZDhF1MGOZI26oZiDT.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                if (listVxUQ9tBhpHJ2AAEDNW8sghc4m.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + xjilh3an9laykwtqp7vc.GI83zq0G8e7zkn.ZfQNn8hdWlEQ5cR94249PDsLR + " not verified (no certificates)");
                }
                Object obj = listVxUQ9tBhpHJ2AAEDNW8sghc4m.get(0);
                ej6unYlOWMDF.Ca81ebIan1u(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n            |Hostname ");
                sb.append(xjilh3an9laykwtqp7vc.GI83zq0G8e7zkn.ZfQNn8hdWlEQ5cR94249PDsLR);
                sb.append(" not verified:\n            |    certificate: ");
                PZstJ1QixRNRG4lJj4zCb3 pZstJ1QixRNRG4lJj4zCb3 = PZstJ1QixRNRG4lJj4zCb3.V57tEvNfxZVVcOCAOih5PKr;
                sb.append(KfeOQNOupsCg6878zi4e.CixTK5ZX8oWXHz34qHYV(x509Certificate));
                sb.append("\n            |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                sb.append(gYXV3FZbh17i6ocMo1T.p6bBrs4p3Ly(hy5mi4r2tCUt8XWYMONXrnOpOrTV.VxUQ9tBhpHJ2AAEDNW8sghc4m(x509Certificate, 7), hy5mi4r2tCUt8XWYMONXrnOpOrTV.VxUQ9tBhpHJ2AAEDNW8sghc4m(x509Certificate, 2)));
                sb.append("\n            ");
                throw new SSLPeerUnverifiedException(cOlXApCgdZbIeiSW0kkEbYYt6zIn.HAPpjhiCsV9ONY23505HCBI9IX(sb.toString()));
            }
            final PZstJ1QixRNRG4lJj4zCb3 pZstJ1QixRNRG4lJj4zCb32 = xjilh3an9laykwtqp7vc.LaeGQIruHQu81hfJldjMOQSVblH3x;
            ej6unYlOWMDF.p59rPv72J9(pZstJ1QixRNRG4lJj4zCb32);
            this.ko09zE6UAgwkV = new PVtnHWoGacfAJXum4(pVtnHWoGacfAJXum4Q11o1hieEkZDhF1MGOZI26oZiDT.VxUQ9tBhpHJ2AAEDNW8sghc4m, pVtnHWoGacfAJXum4Q11o1hieEkZDhF1MGOZI26oZiDT.zzpBGItXfub0yWj, pVtnHWoGacfAJXum4Q11o1hieEkZDhF1MGOZI26oZiDT.V57tEvNfxZVVcOCAOih5PKr, new EfIvTei3Q8wBNpyLTZJevpFxej() { // from class: com.vdodsodjsdt.j6YyEENrsJT6ngCOB
                @Override // com.vdodsodjsdt.EfIvTei3Q8wBNpyLTZJevpFxej
                public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m() {
                    sGipz63rTUmSj3uFDvOtzihao sgipz63rtumsj3ufdvotzihao = pZstJ1QixRNRG4lJj4zCb32.zzpBGItXfub0yWj;
                    ej6unYlOWMDF.p59rPv72J9(sgipz63rtumsj3ufdvotzihao);
                    return sgipz63rtumsj3ufdvotzihao.q1wNbhk2O6(xjilh3an9laykwtqp7vc.GI83zq0G8e7zkn.ZfQNn8hdWlEQ5cR94249PDsLR, pVtnHWoGacfAJXum4Q11o1hieEkZDhF1MGOZI26oZiDT.VxUQ9tBhpHJ2AAEDNW8sghc4m());
                }
            });
            ej6unYlOWMDF.pYmKDYlAmhudp(xjilh3an9laykwtqp7vc.GI83zq0G8e7zkn.ZfQNn8hdWlEQ5cR94249PDsLR, "hostname");
            Iterator it = pZstJ1QixRNRG4lJj4zCb32.VxUQ9tBhpHJ2AAEDNW8sghc4m.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            if (aloycuoplqwnuix6ijuqpanqqgrom.zzpBGItXfub0yWj) {
                O510kkNvCgHHMXIbKz1NqEFfrmj o510kkNvCgHHMXIbKz1NqEFfrmj2 = O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                strZLZeBXTMq0zDztBxtRTuCHrapQ = O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m.ZLZeBXTMq0zDztBxtRTuCHrapQ(sSLSocket);
            } else {
                strZLZeBXTMq0zDztBxtRTuCHrapQ = null;
            }
            this.pYmKDYlAmhudp = sSLSocket;
            this.f6ZQsR6bPLvvCDNXOUc = new nfXvCNpsFLQkxk3Wa(KfeOQNOupsCg6878zi4e.wdI7vzA3Qmcwd(sSLSocket));
            this.vBGA6pPLqSMuYGvprl270j7 = new j8cYbznT7ugZEUE04S8p0(KfeOQNOupsCg6878zi4e.hKs1wlZyvtUNaW1f5ABIGacfPcvX(sSLSocket));
            if (strZLZeBXTMq0zDztBxtRTuCHrapQ != null) {
                ZQ5iEBLmvObelGeRgKLPRxHbZEk.ZfQNn8hdWlEQ5cR94249PDsLR.getClass();
                zQ5iEBLmvObelGeRgKLPRxHbZEkGI83zq0G8e7zkn = FG8LIxsgYiLSfhN0jYKIKr.GI83zq0G8e7zkn(strZLZeBXTMq0zDztBxtRTuCHrapQ);
            } else {
                zQ5iEBLmvObelGeRgKLPRxHbZEkGI83zq0G8e7zkn = ZQ5iEBLmvObelGeRgKLPRxHbZEk.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            }
            this.jW7EiD0YL6xkbB158jMUzhWNWb1y = zQ5iEBLmvObelGeRgKLPRxHbZEkGI83zq0G8e7zkn;
            O510kkNvCgHHMXIbKz1NqEFfrmj o510kkNvCgHHMXIbKz1NqEFfrmj3 = O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m.getClass();
        } catch (Throwable th) {
            O510kkNvCgHHMXIbKz1NqEFfrmj o510kkNvCgHHMXIbKz1NqEFfrmj4 = O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m.getClass();
            U7JVXX1Kyh43VgUF.zzpBGItXfub0yWj(sSLSocket);
            throw th;
        }
    }

    @Override // com.vdodsodjsdt.AkpQfjiBveZX5wDhj0
    public final ozyMFBfTwKTRwifTDHYB8VGdyq V57tEvNfxZVVcOCAOih5PKr() {
        ixvYVtn9EMRQ7IMkUn6Ak2pqJO6h ixvyvtn9emrq7imkun6ak2pqjo6h = this.NSjgqmGjEzuugn2SsG1mZFP;
        nS5othbQ44GTnNo3dq ns5othbq44gtnno3dq = this.M9e7PWhFYLD2lOGMker;
        ixvyvtn9emrq7imkun6ak2pqjo6h.getClass();
        ej6unYlOWMDF.pYmKDYlAmhudp(ns5othbq44gtnno3dq, "route");
        qF22Y620JkFyombtDYw0h0h8Rxpja qf22y620jkfyombtdyw0h0h8rxpja = ixvyvtn9emrq7imkun6ak2pqjo6h.VxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr.qNPQb1obP7;
        synchronized (qf22y620jkfyombtdyw0h0h8rxpja) {
            ((LinkedHashSet) qf22y620jkfyombtdyw0h0h8rxpja.V57tEvNfxZVVcOCAOih5PKr).remove(ns5othbq44gtnno3dq);
        }
        ozyMFBfTwKTRwifTDHYB8VGdyq ozymfbftwktrwiftdhyb8vgdyq = this.TaDO7ogis3aEiWEtq;
        ej6unYlOWMDF.p59rPv72J9(ozymfbftwktrwiftdhyb8vgdyq);
        ixvYVtn9EMRQ7IMkUn6Ak2pqJO6h ixvyvtn9emrq7imkun6ak2pqjo6h2 = this.NSjgqmGjEzuugn2SsG1mZFP;
        nS5othbQ44GTnNo3dq ns5othbq44gtnno3dq2 = this.M9e7PWhFYLD2lOGMker;
        ixvyvtn9emrq7imkun6ak2pqjo6h2.getClass();
        ej6unYlOWMDF.pYmKDYlAmhudp(ozymfbftwktrwiftdhyb8vgdyq, "connection");
        ej6unYlOWMDF.pYmKDYlAmhudp(ns5othbq44gtnno3dq2, "route");
        IN79WcIk5xB4t0GjRT43qPLs5 iN79WcIk5xB4t0GjRT43qPLs5 = ixvyvtn9emrq7imkun6ak2pqjo6h2.zzpBGItXfub0yWj;
        EwfUDU4p8ayzzu4RNSgUdB ewfUDU4p8ayzzu4RNSgUdB = ixvyvtn9emrq7imkun6ak2pqjo6h2.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        iN79WcIk5xB4t0GjRT43qPLs5.getClass();
        ej6unYlOWMDF.pYmKDYlAmhudp(ewfUDU4p8ayzzu4RNSgUdB, "call");
        nBojUdSb9rEPk97FtkPeDVu nbojudsb9repk97ftkpedvuGI83zq0G8e7zkn = this.GI83zq0G8e7zkn.GI83zq0G8e7zkn(this, this.HzCpKshMOoaw76hFcbOVRYMeRd);
        if (nbojudsb9repk97ftkpedvuGI83zq0G8e7zkn != null) {
            return nbojudsb9repk97ftkpedvuGI83zq0G8e7zkn.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        }
        synchronized (ozymfbftwktrwiftdhyb8vgdyq) {
            IBo1UM4YpEOkefD iBo1UM4YpEOkefD = this.zzpBGItXfub0yWj;
            iBo1UM4YpEOkefD.getClass();
            TimeZone timeZone = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            iBo1UM4YpEOkefD.zIvmSL0wzmmKGc3X39b2Gw2mUGE.add(ozymfbftwktrwiftdhyb8vgdyq);
            iBo1UM4YpEOkefD.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr(iBo1UM4YpEOkefD.LaeGQIruHQu81hfJldjMOQSVblH3x, 0L);
            this.NSjgqmGjEzuugn2SsG1mZFP.VxUQ9tBhpHJ2AAEDNW8sghc4m(ozymfbftwktrwiftdhyb8vgdyq);
        }
        this.NSjgqmGjEzuugn2SsG1mZFP.LaeGQIruHQu81hfJldjMOQSVblH3x(ozymfbftwktrwiftdhyb8vgdyq);
        this.NSjgqmGjEzuugn2SsG1mZFP.zIvmSL0wzmmKGc3X39b2Gw2mUGE(ozymfbftwktrwiftdhyb8vgdyq);
        return ozymfbftwktrwiftdhyb8vgdyq;
    }

    @Override // com.vdodsodjsdt.AkpQfjiBveZX5wDhj0
    public final AkpQfjiBveZX5wDhj0 VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return new JkEUIOeQEWq0UUU(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, this.zzpBGItXfub0yWj, this.V57tEvNfxZVVcOCAOih5PKr, this.ZfQNn8hdWlEQ5cR94249PDsLR, this.LaeGQIruHQu81hfJldjMOQSVblH3x, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, this.ZLZeBXTMq0zDztBxtRTuCHrapQ, this.NSjgqmGjEzuugn2SsG1mZFP, this.GI83zq0G8e7zkn, this.M9e7PWhFYLD2lOGMker, this.HzCpKshMOoaw76hFcbOVRYMeRd, this.KUYypEB4eNWOZWVDpH, this.q1wNbhk2O6, this.p59rPv72J9);
    }

    @Override // com.vdodsodjsdt.AkpQfjiBveZX5wDhj0
    public final j3soyeolow ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        Socket socket;
        Socket socket2;
        nS5othbQ44GTnNo3dq ns5othbq44gtnno3dq = this.M9e7PWhFYLD2lOGMker;
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv != null) {
            throw new IllegalStateException("TCP already connected");
        }
        ixvYVtn9EMRQ7IMkUn6Ak2pqJO6h ixvyvtn9emrq7imkun6ak2pqjo6h = this.NSjgqmGjEzuugn2SsG1mZFP;
        ixvyvtn9emrq7imkun6ak2pqjo6h.zzpBGItXfub0yWj(this);
        boolean z = false;
        try {
            try {
                ixvyvtn9emrq7imkun6ak2pqjo6h.getClass();
                ej6unYlOWMDF.pYmKDYlAmhudp(ns5othbq44gtnno3dq, "route");
                ej6unYlOWMDF.pYmKDYlAmhudp(ns5othbq44gtnno3dq.V57tEvNfxZVVcOCAOih5PKr, "inetSocketAddress");
                GI83zq0G8e7zkn();
                z = true;
                j3soyeolow j3soyeolowVar = new j3soyeolow(this, (Throwable) null, 6);
                ixvyvtn9emrq7imkun6ak2pqjo6h.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(this);
                return j3soyeolowVar;
            } catch (IOException e) {
                if (ns5othbq44gtnno3dq.VxUQ9tBhpHJ2AAEDNW8sghc4m.ZLZeBXTMq0zDztBxtRTuCHrapQ == null && ns5othbq44gtnno3dq.zzpBGItXfub0yWj.type() != Proxy.Type.DIRECT) {
                    xJilh3An9LAykwTqP7vc xjilh3an9laykwtqp7vc = ns5othbq44gtnno3dq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    xjilh3an9laykwtqp7vc.NSjgqmGjEzuugn2SsG1mZFP.connectFailed(xjilh3an9laykwtqp7vc.GI83zq0G8e7zkn.NSjgqmGjEzuugn2SsG1mZFP(), ns5othbq44gtnno3dq.zzpBGItXfub0yWj.address(), e);
                }
                ixvyvtn9emrq7imkun6ak2pqjo6h.ZfQNn8hdWlEQ5cR94249PDsLR(ns5othbq44gtnno3dq, e);
                j3soyeolow j3soyeolowVar2 = new j3soyeolow(this, e, 2);
                ixvyvtn9emrq7imkun6ak2pqjo6h.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(this);
                if (!z && (socket = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) != null) {
                    U7JVXX1Kyh43VgUF.zzpBGItXfub0yWj(socket);
                }
                return j3soyeolowVar2;
            }
        } catch (Throwable th) {
            ixvyvtn9emrq7imkun6ak2pqjo6h.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(this);
            if (!z && (socket2 = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) != null) {
                U7JVXX1Kyh43VgUF.zzpBGItXfub0yWj(socket2);
            }
            throw th;
        }
    }

    @Override // com.vdodsodjsdt.AkpQfjiBveZX5wDhj0, com.vdodsodjsdt.ohjB5lavt9Gy1qVLWRd
    public final void cancel() {
        this.Ca81ebIan1u = true;
        Socket socket = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        if (socket != null) {
            U7JVXX1Kyh43VgUF.zzpBGItXfub0yWj(socket);
        }
    }

    public final JkEUIOeQEWq0UUU q1wNbhk2O6(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        ej6unYlOWMDF.pYmKDYlAmhudp(list, "connectionSpecs");
        if (this.q1wNbhk2O6 != -1) {
            return this;
        }
        JkEUIOeQEWq0UUU jkEUIOeQEWq0UUUKUYypEB4eNWOZWVDpH = KUYypEB4eNWOZWVDpH(list, sSLSocket);
        if (jkEUIOeQEWq0UUUKUYypEB4eNWOZWVDpH != null) {
            return jkEUIOeQEWq0UUUKUYypEB4eNWOZWVDpH;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.p59rPv72J9);
        sb.append(", modes=");
        sb.append(list);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        ej6unYlOWMDF.p59rPv72J9(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "toString(...)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // com.vdodsodjsdt.ohjB5lavt9Gy1qVLWRd
    public final nS5othbQ44GTnNo3dq zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        return this.M9e7PWhFYLD2lOGMker;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0176  */
    @Override // com.vdodsodjsdt.AkpQfjiBveZX5wDhj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.vdodsodjsdt.j3soyeolow zzpBGItXfub0yWj() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.JkEUIOeQEWq0UUU.zzpBGItXfub0yWj():com.vdodsodjsdt.j3soyeolow");
    }

    @Override // com.vdodsodjsdt.ohjB5lavt9Gy1qVLWRd
    public final void NSjgqmGjEzuugn2SsG1mZFP() {
    }

    @Override // com.vdodsodjsdt.ohjB5lavt9Gy1qVLWRd
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(EwfUDU4p8ayzzu4RNSgUdB ewfUDU4p8ayzzu4RNSgUdB, IOException iOException) {
    }
}
