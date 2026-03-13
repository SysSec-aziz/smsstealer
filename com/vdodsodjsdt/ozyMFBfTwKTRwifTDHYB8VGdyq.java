package com.vdodsodjsdt;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ozyMFBfTwKTRwifTDHYB8VGdyq extends SBvbXpgT6Ff7FomWxrO implements ohjB5lavt9Gy1qVLWRd {
    public int Ca81ebIan1u;
    public final hy3v1zJcCYok89Y1iAeFhN66 GI83zq0G8e7zkn;
    public final IN79WcIk5xB4t0GjRT43qPLs5 HzCpKshMOoaw76hFcbOVRYMeRd;
    public aLVvFTl6cTT KUYypEB4eNWOZWVDpH;
    public final Socket LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final zvqhqc7YVxGqa3qIRo M9e7PWhFYLD2lOGMker;
    public final ZQ5iEBLmvObelGeRgKLPRxHbZEk NSjgqmGjEzuugn2SsG1mZFP;
    public final IBo1UM4YpEOkefD V57tEvNfxZVVcOCAOih5PKr;
    public final PVtnHWoGacfAJXum4 ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final nS5othbQ44GTnNo3dq ZfQNn8hdWlEQ5cR94249PDsLR;
    public long f6ZQsR6bPLvvCDNXOUc;
    public int h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public final ArrayList jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public int ko09zE6UAgwkV;
    public boolean p59rPv72J9;
    public int pYmKDYlAmhudp;
    public boolean q1wNbhk2O6;
    public final Socket zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final j5jyRGaw4k zzpBGItXfub0yWj;

    public ozyMFBfTwKTRwifTDHYB8VGdyq(j5jyRGaw4k j5jyrgaw4k, IBo1UM4YpEOkefD iBo1UM4YpEOkefD, nS5othbQ44GTnNo3dq ns5othbq44gtnno3dq, Socket socket, Socket socket2, PVtnHWoGacfAJXum4 pVtnHWoGacfAJXum4, ZQ5iEBLmvObelGeRgKLPRxHbZEk zQ5iEBLmvObelGeRgKLPRxHbZEk, nfXvCNpsFLQkxk3Wa nfxvcnpsflqkxk3wa, j8cYbznT7ugZEUE04S8p0 j8cybznt7ugzeue04s8p0, IN79WcIk5xB4t0GjRT43qPLs5 iN79WcIk5xB4t0GjRT43qPLs5) {
        ej6unYlOWMDF.pYmKDYlAmhudp(j5jyrgaw4k, "taskRunner");
        ej6unYlOWMDF.pYmKDYlAmhudp(iBo1UM4YpEOkefD, "connectionPool");
        ej6unYlOWMDF.pYmKDYlAmhudp(ns5othbq44gtnno3dq, "route");
        ej6unYlOWMDF.pYmKDYlAmhudp(socket, "rawSocket");
        ej6unYlOWMDF.pYmKDYlAmhudp(socket2, "socket");
        ej6unYlOWMDF.pYmKDYlAmhudp(zQ5iEBLmvObelGeRgKLPRxHbZEk, "protocol");
        ej6unYlOWMDF.pYmKDYlAmhudp(nfxvcnpsflqkxk3wa, "source");
        ej6unYlOWMDF.pYmKDYlAmhudp(j8cybznt7ugzeue04s8p0, "sink");
        this.zzpBGItXfub0yWj = j5jyrgaw4k;
        this.V57tEvNfxZVVcOCAOih5PKr = iBo1UM4YpEOkefD;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = ns5othbq44gtnno3dq;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = socket;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = socket2;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = pVtnHWoGacfAJXum4;
        this.NSjgqmGjEzuugn2SsG1mZFP = zQ5iEBLmvObelGeRgKLPRxHbZEk;
        this.GI83zq0G8e7zkn = nfxvcnpsflqkxk3wa;
        this.M9e7PWhFYLD2lOGMker = j8cybznt7ugzeue04s8p0;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = iN79WcIk5xB4t0GjRT43qPLs5;
        this.ko09zE6UAgwkV = 1;
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = new ArrayList();
        this.f6ZQsR6bPLvvCDNXOUc = Long.MAX_VALUE;
    }

    public static void V57tEvNfxZVVcOCAOih5PKr(o8p4Xhf9gKH3WuUFc74 o8p4xhf9gkh3wuufc74, nS5othbQ44GTnNo3dq ns5othbq44gtnno3dq, IOException iOException) {
        ej6unYlOWMDF.pYmKDYlAmhudp(ns5othbq44gtnno3dq, "failedRoute");
        ej6unYlOWMDF.pYmKDYlAmhudp(iOException, "failure");
        if (ns5othbq44gtnno3dq.zzpBGItXfub0yWj.type() != Proxy.Type.DIRECT) {
            xJilh3An9LAykwTqP7vc xjilh3an9laykwtqp7vc = ns5othbq44gtnno3dq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            xjilh3an9laykwtqp7vc.NSjgqmGjEzuugn2SsG1mZFP.connectFailed(xjilh3an9laykwtqp7vc.GI83zq0G8e7zkn.NSjgqmGjEzuugn2SsG1mZFP(), ns5othbq44gtnno3dq.zzpBGItXfub0yWj.address(), iOException);
        }
        qF22Y620JkFyombtDYw0h0h8Rxpja qf22y620jkfyombtdyw0h0h8rxpja = o8p4xhf9gkh3wuufc74.qNPQb1obP7;
        synchronized (qf22y620jkfyombtdyw0h0h8rxpja) {
            ((LinkedHashSet) qf22y620jkfyombtdyw0h0h8rxpja.V57tEvNfxZVVcOCAOih5PKr).add(ns5othbq44gtnno3dq);
        }
    }

    public final void GI83zq0G8e7zkn() throws SocketException {
        this.f6ZQsR6bPLvvCDNXOUc = System.nanoTime();
        ZQ5iEBLmvObelGeRgKLPRxHbZEk zQ5iEBLmvObelGeRgKLPRxHbZEk = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (zQ5iEBLmvObelGeRgKLPRxHbZEk == ZQ5iEBLmvObelGeRgKLPRxHbZEk.NSjgqmGjEzuugn2SsG1mZFP || zQ5iEBLmvObelGeRgKLPRxHbZEk == ZQ5iEBLmvObelGeRgKLPRxHbZEk.GI83zq0G8e7zkn) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setSoTimeout(0);
            UFiflNDkv7brFTbpqA3 uFiflNDkv7brFTbpqA3 = UFiflNDkv7brFTbpqA3.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            JsnZMsYEp5ShmM4 jsnZMsYEp5ShmM4 = new JsnZMsYEp5ShmM4(this.zzpBGItXfub0yWj);
            Socket socket = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            String str = this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.GI83zq0G8e7zkn.ZfQNn8hdWlEQ5cR94249PDsLR;
            hy3v1zJcCYok89Y1iAeFhN66 hy3v1zjccyok89y1iaefhn66 = this.GI83zq0G8e7zkn;
            zvqhqc7YVxGqa3qIRo zvqhqc7yvxgqa3qiro = this.M9e7PWhFYLD2lOGMker;
            ej6unYlOWMDF.pYmKDYlAmhudp(socket, "socket");
            ej6unYlOWMDF.pYmKDYlAmhudp(str, "peerName");
            ej6unYlOWMDF.pYmKDYlAmhudp(hy3v1zjccyok89y1iaefhn66, "source");
            ej6unYlOWMDF.pYmKDYlAmhudp(zvqhqc7yvxgqa3qiro, "sink");
            jsnZMsYEp5ShmM4.zzpBGItXfub0yWj = socket;
            String str2 = U7JVXX1Kyh43VgUF.zzpBGItXfub0yWj + ' ' + str;
            ej6unYlOWMDF.pYmKDYlAmhudp(str2, "<set-?>");
            jsnZMsYEp5ShmM4.V57tEvNfxZVVcOCAOih5PKr = str2;
            jsnZMsYEp5ShmM4.ZfQNn8hdWlEQ5cR94249PDsLR = hy3v1zjccyok89y1iaefhn66;
            jsnZMsYEp5ShmM4.LaeGQIruHQu81hfJldjMOQSVblH3x = zvqhqc7yvxgqa3qiro;
            jsnZMsYEp5ShmM4.zIvmSL0wzmmKGc3X39b2Gw2mUGE = this;
            jsnZMsYEp5ShmM4.ZLZeBXTMq0zDztBxtRTuCHrapQ = uFiflNDkv7brFTbpqA3;
            aLVvFTl6cTT alvvftl6ctt = new aLVvFTl6cTT(jsnZMsYEp5ShmM4);
            this.KUYypEB4eNWOZWVDpH = alvvftl6ctt;
            bof4DtY4zFmy9PX46PcOrxENM bof4dty4zfmy9px46pcorxenm = aLVvFTl6cTT.SuB3hEmTmbbRGAhtvOOmfKEon;
            this.ko09zE6UAgwkV = (bof4dty4zfmy9px46pcorxenm.VxUQ9tBhpHJ2AAEDNW8sghc4m & 8) != 0 ? bof4dty4zfmy9px46pcorxenm.zzpBGItXfub0yWj[3] : Integer.MAX_VALUE;
            bECpBnb6LRshlhGU1tvHCJd becpbnb6lrshlhgu1tvhcjd = alvvftl6ctt.w0Wu95l8dVNw5rZMRu;
            synchronized (becpbnb6lrshlhgu1tvhcjd) {
                try {
                    if (becpbnb6lrshlhgu1tvhcjd.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                        throw new IOException("closed");
                    }
                    Logger logger = bECpBnb6LRshlhGU1tvHCJd.NSjgqmGjEzuugn2SsG1mZFP;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(U7JVXX1Kyh43VgUF.V57tEvNfxZVVcOCAOih5PKr(">> CONNECTION " + tFVUzh05cCwb.VxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj(), new Object[0]));
                    }
                    becpbnb6lrshlhgu1tvhcjd.V57tEvNfxZVVcOCAOih5PKr.pYmKDYlAmhudp(tFVUzh05cCwb.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                    becpbnb6lrshlhgu1tvhcjd.V57tEvNfxZVVcOCAOih5PKr.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            bECpBnb6LRshlhGU1tvHCJd becpbnb6lrshlhgu1tvhcjd2 = alvvftl6ctt.w0Wu95l8dVNw5rZMRu;
            bof4DtY4zFmy9PX46PcOrxENM bof4dty4zfmy9px46pcorxenm2 = alvvftl6ctt.jW7EiD0YL6xkbB158jMUzhWNWb1y;
            becpbnb6lrshlhgu1tvhcjd2.getClass();
            ej6unYlOWMDF.pYmKDYlAmhudp(bof4dty4zfmy9px46pcorxenm2, "settings");
            synchronized (becpbnb6lrshlhgu1tvhcjd2) {
                try {
                    if (becpbnb6lrshlhgu1tvhcjd2.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                        throw new IOException("closed");
                    }
                    becpbnb6lrshlhgu1tvhcjd2.LaeGQIruHQu81hfJldjMOQSVblH3x(0, Integer.bitCount(bof4dty4zfmy9px46pcorxenm2.VxUQ9tBhpHJ2AAEDNW8sghc4m) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & bof4dty4zfmy9px46pcorxenm2.VxUQ9tBhpHJ2AAEDNW8sghc4m) == 0) {
                            z = false;
                        }
                        if (z) {
                            becpbnb6lrshlhgu1tvhcjd2.V57tEvNfxZVVcOCAOih5PKr.writeShort(i);
                            becpbnb6lrshlhgu1tvhcjd2.V57tEvNfxZVVcOCAOih5PKr.writeInt(bof4dty4zfmy9px46pcorxenm2.zzpBGItXfub0yWj[i]);
                        }
                    }
                    becpbnb6lrshlhgu1tvhcjd2.V57tEvNfxZVVcOCAOih5PKr.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (alvvftl6ctt.jW7EiD0YL6xkbB158jMUzhWNWb1y.VxUQ9tBhpHJ2AAEDNW8sghc4m() != 65535) {
                alvvftl6ctt.w0Wu95l8dVNw5rZMRu.SuB3hEmTmbbRGAhtvOOmfKEon(0, r2 - 65535);
            }
            MpsgFCfSVNxgvcBlEbc8Iuyh3Obq.zzpBGItXfub0yWj(alvvftl6ctt.GI83zq0G8e7zkn.ZfQNn8hdWlEQ5cR94249PDsLR(), alvvftl6ctt.LaeGQIruHQu81hfJldjMOQSVblH3x, alvvftl6ctt.RhfGHxtXxy0M0grmp2jkRjQg);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x(com.vdodsodjsdt.xJilh3An9LAykwTqP7vc r11, java.util.List r12) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.ozyMFBfTwKTRwifTDHYB8VGdyq.LaeGQIruHQu81hfJldjMOQSVblH3x(com.vdodsodjsdt.xJilh3An9LAykwTqP7vc, java.util.List):boolean");
    }

    @Override // com.vdodsodjsdt.ohjB5lavt9Gy1qVLWRd
    public final void NSjgqmGjEzuugn2SsG1mZFP() {
        synchronized (this) {
            this.q1wNbhk2O6 = true;
        }
        this.HzCpKshMOoaw76hFcbOVRYMeRd.getClass();
    }

    @Override // com.vdodsodjsdt.SBvbXpgT6Ff7FomWxrO
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(aLVvFTl6cTT alvvftl6ctt, bof4DtY4zFmy9PX46PcOrxENM bof4dty4zfmy9px46pcorxenm) {
        ej6unYlOWMDF.pYmKDYlAmhudp(bof4dty4zfmy9px46pcorxenm, "settings");
        synchronized (this) {
            try {
                int i = this.ko09zE6UAgwkV;
                int i2 = (bof4dty4zfmy9px46pcorxenm.VxUQ9tBhpHJ2AAEDNW8sghc4m & 8) != 0 ? bof4dty4zfmy9px46pcorxenm.zzpBGItXfub0yWj[3] : Integer.MAX_VALUE;
                this.ko09zE6UAgwkV = i2;
                if (i2 < i) {
                    IBo1UM4YpEOkefD iBo1UM4YpEOkefD = this.V57tEvNfxZVVcOCAOih5PKr;
                    xJilh3An9LAykwTqP7vc xjilh3an9laykwtqp7vc = this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    iBo1UM4YpEOkefD.getClass();
                    ej6unYlOWMDF.pYmKDYlAmhudp(xjilh3an9laykwtqp7vc, "address");
                    if (iBo1UM4YpEOkefD.V57tEvNfxZVVcOCAOih5PKr.get(xjilh3an9laykwtqp7vc) != null) {
                        throw new ClassCastException();
                    }
                } else if (i2 > i) {
                    IBo1UM4YpEOkefD iBo1UM4YpEOkefD2 = this.V57tEvNfxZVVcOCAOih5PKr;
                    iBo1UM4YpEOkefD2.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr(iBo1UM4YpEOkefD2.LaeGQIruHQu81hfJldjMOQSVblH3x, 0L);
                }
            } finally {
            }
        }
    }

    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(boolean z) {
        long j;
        TimeZone timeZone = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        long jNanoTime = System.nanoTime();
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x.isClosed() || this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.isClosed() || this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.isInputShutdown() || this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.isOutputShutdown()) {
            return false;
        }
        aLVvFTl6cTT alvvftl6ctt = this.KUYypEB4eNWOZWVDpH;
        if (alvvftl6ctt != null) {
            synchronized (alvvftl6ctt) {
                if (alvvftl6ctt.NSjgqmGjEzuugn2SsG1mZFP) {
                    return false;
                }
                if (alvvftl6ctt.h3jnZRsdwYJfY9UhQCkbvWciwvFHv < alvvftl6ctt.Ca81ebIan1u) {
                    if (jNanoTime >= alvvftl6ctt.pYmKDYlAmhudp) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.f6ZQsR6bPLvvCDNXOUc;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        hy3v1zJcCYok89Y1iAeFhN66 hy3v1zjccyok89y1iaefhn66 = this.GI83zq0G8e7zkn;
        ej6unYlOWMDF.pYmKDYlAmhudp(socket, "<this>");
        ej6unYlOWMDF.pYmKDYlAmhudp(hy3v1zjccyok89y1iaefhn66, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !hy3v1zjccyok89y1iaefhn66.HzCpKshMOoaw76hFcbOVRYMeRd();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // com.vdodsodjsdt.ohjB5lavt9Gy1qVLWRd
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(EwfUDU4p8ayzzu4RNSgUdB ewfUDU4p8ayzzu4RNSgUdB, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof w0WH4NylajCPMZqvIXwTlpjfN)) {
                    if (!(this.KUYypEB4eNWOZWVDpH != null) || (iOException instanceof kkiT8rKj7EFntQLbevG0m)) {
                        this.q1wNbhk2O6 = true;
                        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == 0) {
                            if (iOException != null) {
                                V57tEvNfxZVVcOCAOih5PKr(ewfUDU4p8ayzzu4RNSgUdB.V57tEvNfxZVVcOCAOih5PKr, this.ZfQNn8hdWlEQ5cR94249PDsLR, iOException);
                            }
                            this.Ca81ebIan1u++;
                        }
                    }
                } else if (((w0WH4NylajCPMZqvIXwTlpjfN) iOException).V57tEvNfxZVVcOCAOih5PKr == sRSjJ4B4UdKzPCFBE.REFUSED_STREAM) {
                    int i = this.pYmKDYlAmhudp + 1;
                    this.pYmKDYlAmhudp = i;
                    if (i > 1) {
                        this.q1wNbhk2O6 = true;
                        this.Ca81ebIan1u++;
                    }
                } else if (((w0WH4NylajCPMZqvIXwTlpjfN) iOException).V57tEvNfxZVVcOCAOih5PKr != sRSjJ4B4UdKzPCFBE.CANCEL || !ewfUDU4p8ayzzu4RNSgUdB.Ca81ebIan1u) {
                    this.q1wNbhk2O6 = true;
                    this.Ca81ebIan1u++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.vdodsodjsdt.ohjB5lavt9Gy1qVLWRd
    public final void cancel() {
        U7JVXX1Kyh43VgUF.zzpBGItXfub0yWj(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        nS5othbQ44GTnNo3dq ns5othbq44gtnno3dq = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        sb.append(ns5othbq44gtnno3dq.VxUQ9tBhpHJ2AAEDNW8sghc4m.GI83zq0G8e7zkn.ZfQNn8hdWlEQ5cR94249PDsLR);
        sb.append(':');
        sb.append(ns5othbq44gtnno3dq.VxUQ9tBhpHJ2AAEDNW8sghc4m.GI83zq0G8e7zkn.LaeGQIruHQu81hfJldjMOQSVblH3x);
        sb.append(", proxy=");
        sb.append(ns5othbq44gtnno3dq.zzpBGItXfub0yWj);
        sb.append(" hostAddress=");
        sb.append(ns5othbq44gtnno3dq.V57tEvNfxZVVcOCAOih5PKr);
        sb.append(" cipherSuite=");
        PVtnHWoGacfAJXum4 pVtnHWoGacfAJXum4 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (pVtnHWoGacfAJXum4 == null || (obj = pVtnHWoGacfAJXum4.zzpBGItXfub0yWj) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.NSjgqmGjEzuugn2SsG1mZFP);
        sb.append('}');
        return sb.toString();
    }

    @Override // com.vdodsodjsdt.ohjB5lavt9Gy1qVLWRd
    public final nS5othbQ44GTnNo3dq zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    @Override // com.vdodsodjsdt.SBvbXpgT6Ff7FomWxrO
    public final void zzpBGItXfub0yWj(AIQ3M1G7NlBb9nFUZAGJvkBOAC aIQ3M1G7NlBb9nFUZAGJvkBOAC) {
        aIQ3M1G7NlBb9nFUZAGJvkBOAC.V57tEvNfxZVVcOCAOih5PKr(sRSjJ4B4UdKzPCFBE.REFUSED_STREAM, null);
    }
}
