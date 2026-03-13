package com.vdodsodjsdt;

import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class hZGwZLSkscFiWiqL implements A3cppuj9wGt {
    public final rOiKJVDHPqqeCfn Ca81ebIan1u;
    public final xJilh3An9LAykwTqP7vc GI83zq0G8e7zkn;
    public final ixvYVtn9EMRQ7IMkUn6Ak2pqJO6h HzCpKshMOoaw76hFcbOVRYMeRd;
    public z8uyl4sTQr2O9dK1e KUYypEB4eNWOZWVDpH;
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final qF22Y620JkFyombtDYw0h0h8Rxpja M9e7PWhFYLD2lOGMker;
    public final boolean NSjgqmGjEzuugn2SsG1mZFP;
    public final int V57tEvNfxZVVcOCAOih5PKr;
    public final j5jyRGaw4k VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;
    public nS5othbQ44GTnNo3dq p59rPv72J9;
    public FjwWjQVIrVOuY6M4QzKm0L q1wNbhk2O6;
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final IBo1UM4YpEOkefD zzpBGItXfub0yWj;

    public hZGwZLSkscFiWiqL(j5jyRGaw4k j5jyrgaw4k, IBo1UM4YpEOkefD iBo1UM4YpEOkefD, int i, int i2, int i3, int i4, boolean z, boolean z2, xJilh3An9LAykwTqP7vc xjilh3an9laykwtqp7vc, qF22Y620JkFyombtDYw0h0h8Rxpja qf22y620jkfyombtdyw0h0h8rxpja, ixvYVtn9EMRQ7IMkUn6Ak2pqJO6h ixvyvtn9emrq7imkun6ak2pqjo6h) {
        ej6unYlOWMDF.pYmKDYlAmhudp(j5jyrgaw4k, "taskRunner");
        ej6unYlOWMDF.pYmKDYlAmhudp(iBo1UM4YpEOkefD, "connectionPool");
        ej6unYlOWMDF.pYmKDYlAmhudp(xjilh3an9laykwtqp7vc, "address");
        ej6unYlOWMDF.pYmKDYlAmhudp(qf22y620jkfyombtdyw0h0h8rxpja, "routeDatabase");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = j5jyrgaw4k;
        this.zzpBGItXfub0yWj = iBo1UM4YpEOkefD;
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i2;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i3;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i4;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = z;
        this.NSjgqmGjEzuugn2SsG1mZFP = z2;
        this.GI83zq0G8e7zkn = xjilh3an9laykwtqp7vc;
        this.M9e7PWhFYLD2lOGMker = qf22y620jkfyombtdyw0h0h8rxpja;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = ixvyvtn9emrq7imkun6ak2pqjo6h;
        this.Ca81ebIan1u = new rOiKJVDHPqqeCfn();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:14:0x003f, B:22:0x004c, B:25:0x0053), top: B:51:0x003f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.vdodsodjsdt.nBojUdSb9rEPk97FtkPeDVu GI83zq0G8e7zkn(com.vdodsodjsdt.JkEUIOeQEWq0UUU r11, java.util.List r12) {
        /*
            r10 = this;
            com.vdodsodjsdt.IBo1UM4YpEOkefD r0 = r10.zzpBGItXfub0yWj
            com.vdodsodjsdt.ixvYVtn9EMRQ7IMkUn6Ak2pqJO6h r1 = r10.HzCpKshMOoaw76hFcbOVRYMeRd
            boolean r1 = r1.KUYypEB4eNWOZWVDpH()
            com.vdodsodjsdt.xJilh3An9LAykwTqP7vc r2 = r10.GI83zq0G8e7zkn
            com.vdodsodjsdt.ixvYVtn9EMRQ7IMkUn6Ak2pqJO6h r3 = r10.HzCpKshMOoaw76hFcbOVRYMeRd
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L18
            boolean r6 = r11.LaeGQIruHQu81hfJldjMOQSVblH3x()
            if (r6 == 0) goto L18
            r6 = r5
            goto L19
        L18:
            r6 = r4
        L19:
            r0.getClass()
            java.lang.String r7 = "address"
            com.vdodsodjsdt.ej6unYlOWMDF.pYmKDYlAmhudp(r2, r7)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r7 = "iterator(...)"
            com.vdodsodjsdt.ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(r0, r7)
        L2c:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L74
            java.lang.Object r7 = r0.next()
            com.vdodsodjsdt.ozyMFBfTwKTRwifTDHYB8VGdyq r7 = (com.vdodsodjsdt.ozyMFBfTwKTRwifTDHYB8VGdyq) r7
            com.vdodsodjsdt.ej6unYlOWMDF.p59rPv72J9(r7)
            monitor-enter(r7)
            if (r6 == 0) goto L4c
            com.vdodsodjsdt.aLVvFTl6cTT r9 = r7.KUYypEB4eNWOZWVDpH     // Catch: java.lang.Throwable -> L4a
            if (r9 == 0) goto L45
            r9 = r5
            goto L46
        L45:
            r9 = r4
        L46:
            if (r9 != 0) goto L4c
        L48:
            r9 = r4
            goto L57
        L4a:
            r11 = move-exception
            goto L72
        L4c:
            boolean r9 = r7.LaeGQIruHQu81hfJldjMOQSVblH3x(r2, r12)     // Catch: java.lang.Throwable -> L4a
            if (r9 != 0) goto L53
            goto L48
        L53:
            r3.VxUQ9tBhpHJ2AAEDNW8sghc4m(r7)     // Catch: java.lang.Throwable -> L4a
            r9 = r5
        L57:
            monitor-exit(r7)
            if (r9 == 0) goto L2c
            boolean r9 = r7.ZLZeBXTMq0zDztBxtRTuCHrapQ(r1)
            if (r9 == 0) goto L61
            goto L75
        L61:
            monitor-enter(r7)
            r7.q1wNbhk2O6 = r5     // Catch: java.lang.Throwable -> L6f
            java.net.Socket r8 = r3.Ca81ebIan1u()     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r7)
            if (r8 == 0) goto L2c
            com.vdodsodjsdt.U7JVXX1Kyh43VgUF.zzpBGItXfub0yWj(r8)
            goto L2c
        L6f:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        L72:
            monitor-exit(r7)
            throw r11
        L74:
            r7 = r8
        L75:
            if (r7 != 0) goto L78
            return r8
        L78:
            if (r11 == 0) goto L85
            com.vdodsodjsdt.nS5othbQ44GTnNo3dq r12 = r11.M9e7PWhFYLD2lOGMker
            r10.p59rPv72J9 = r12
            java.net.Socket r11 = r11.pYmKDYlAmhudp
            if (r11 == 0) goto L85
            com.vdodsodjsdt.U7JVXX1Kyh43VgUF.zzpBGItXfub0yWj(r11)
        L85:
            com.vdodsodjsdt.ixvYVtn9EMRQ7IMkUn6Ak2pqJO6h r11 = r10.HzCpKshMOoaw76hFcbOVRYMeRd
            r11.LaeGQIruHQu81hfJldjMOQSVblH3x(r7)
            com.vdodsodjsdt.ixvYVtn9EMRQ7IMkUn6Ak2pqJO6h r11 = r10.HzCpKshMOoaw76hFcbOVRYMeRd
            r11.zIvmSL0wzmmKGc3X39b2Gw2mUGE(r7)
            com.vdodsodjsdt.nBojUdSb9rEPk97FtkPeDVu r11 = new com.vdodsodjsdt.nBojUdSb9rEPk97FtkPeDVu
            r11.<init>(r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.hZGwZLSkscFiWiqL.GI83zq0G8e7zkn(com.vdodsodjsdt.JkEUIOeQEWq0UUU, java.util.List):com.vdodsodjsdt.nBojUdSb9rEPk97FtkPeDVu");
    }

    @Override // com.vdodsodjsdt.A3cppuj9wGt
    public final AkpQfjiBveZX5wDhj0 LaeGQIruHQu81hfJldjMOQSVblH3x() throws IOException {
        Socket socketCa81ebIan1u;
        boolean z;
        nBojUdSb9rEPk97FtkPeDVu nbojudsb9repk97ftkpedvu;
        ozyMFBfTwKTRwifTDHYB8VGdyq ozymfbftwktrwiftdhyb8vgdyqV57tEvNfxZVVcOCAOih5PKr = this.HzCpKshMOoaw76hFcbOVRYMeRd.V57tEvNfxZVVcOCAOih5PKr();
        if (ozymfbftwktrwiftdhyb8vgdyqV57tEvNfxZVVcOCAOih5PKr == null) {
            nbojudsb9repk97ftkpedvu = null;
        } else {
            boolean zZLZeBXTMq0zDztBxtRTuCHrapQ = ozymfbftwktrwiftdhyb8vgdyqV57tEvNfxZVVcOCAOih5PKr.ZLZeBXTMq0zDztBxtRTuCHrapQ(this.HzCpKshMOoaw76hFcbOVRYMeRd.KUYypEB4eNWOZWVDpH());
            synchronized (ozymfbftwktrwiftdhyb8vgdyqV57tEvNfxZVVcOCAOih5PKr) {
                try {
                    if (!zZLZeBXTMq0zDztBxtRTuCHrapQ) {
                        z = !ozymfbftwktrwiftdhyb8vgdyqV57tEvNfxZVVcOCAOih5PKr.q1wNbhk2O6;
                        ozymfbftwktrwiftdhyb8vgdyqV57tEvNfxZVVcOCAOih5PKr.q1wNbhk2O6 = true;
                        socketCa81ebIan1u = this.HzCpKshMOoaw76hFcbOVRYMeRd.Ca81ebIan1u();
                    } else if (ozymfbftwktrwiftdhyb8vgdyqV57tEvNfxZVVcOCAOih5PKr.q1wNbhk2O6 || !zIvmSL0wzmmKGc3X39b2Gw2mUGE(ozymfbftwktrwiftdhyb8vgdyqV57tEvNfxZVVcOCAOih5PKr.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.GI83zq0G8e7zkn)) {
                        socketCa81ebIan1u = this.HzCpKshMOoaw76hFcbOVRYMeRd.Ca81ebIan1u();
                        z = false;
                    } else {
                        z = false;
                        socketCa81ebIan1u = null;
                    }
                } finally {
                }
            }
            if (this.HzCpKshMOoaw76hFcbOVRYMeRd.V57tEvNfxZVVcOCAOih5PKr() == null) {
                if (socketCa81ebIan1u != null) {
                    U7JVXX1Kyh43VgUF.zzpBGItXfub0yWj(socketCa81ebIan1u);
                }
                this.HzCpKshMOoaw76hFcbOVRYMeRd.getClass();
                this.HzCpKshMOoaw76hFcbOVRYMeRd.getClass();
                if (socketCa81ebIan1u != null || z) {
                    this.HzCpKshMOoaw76hFcbOVRYMeRd.getClass();
                }
                nbojudsb9repk97ftkpedvu = null;
            } else {
                if (socketCa81ebIan1u != null) {
                    throw new IllegalStateException("Check failed.");
                }
                nbojudsb9repk97ftkpedvu = new nBojUdSb9rEPk97FtkPeDVu(ozymfbftwktrwiftdhyb8vgdyqV57tEvNfxZVVcOCAOih5PKr);
            }
        }
        if (nbojudsb9repk97ftkpedvu != null) {
            return nbojudsb9repk97ftkpedvu;
        }
        nBojUdSb9rEPk97FtkPeDVu nbojudsb9repk97ftkpedvuGI83zq0G8e7zkn = GI83zq0G8e7zkn(null, null);
        if (nbojudsb9repk97ftkpedvuGI83zq0G8e7zkn != null) {
            return nbojudsb9repk97ftkpedvuGI83zq0G8e7zkn;
        }
        if (!this.Ca81ebIan1u.isEmpty()) {
            return (AkpQfjiBveZX5wDhj0) this.Ca81ebIan1u.removeFirst();
        }
        JkEUIOeQEWq0UUU jkEUIOeQEWq0UUUVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m();
        nBojUdSb9rEPk97FtkPeDVu nbojudsb9repk97ftkpedvuGI83zq0G8e7zkn2 = GI83zq0G8e7zkn(jkEUIOeQEWq0UUUVxUQ9tBhpHJ2AAEDNW8sghc4m, jkEUIOeQEWq0UUUVxUQ9tBhpHJ2AAEDNW8sghc4m.HzCpKshMOoaw76hFcbOVRYMeRd);
        return nbojudsb9repk97ftkpedvuGI83zq0G8e7zkn2 != null ? nbojudsb9repk97ftkpedvuGI83zq0G8e7zkn2 : jkEUIOeQEWq0UUUVxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    @Override // com.vdodsodjsdt.A3cppuj9wGt
    public final boolean NSjgqmGjEzuugn2SsG1mZFP() {
        return this.HzCpKshMOoaw76hFcbOVRYMeRd.q1wNbhk2O6();
    }

    @Override // com.vdodsodjsdt.A3cppuj9wGt
    public final boolean V57tEvNfxZVVcOCAOih5PKr(ozyMFBfTwKTRwifTDHYB8VGdyq ozymfbftwktrwiftdhyb8vgdyq) {
        FjwWjQVIrVOuY6M4QzKm0L fjwWjQVIrVOuY6M4QzKm0L;
        nS5othbQ44GTnNo3dq ns5othbq44gtnno3dq;
        if (this.Ca81ebIan1u.isEmpty() && this.p59rPv72J9 == null) {
            if (ozymfbftwktrwiftdhyb8vgdyq != null) {
                synchronized (ozymfbftwktrwiftdhyb8vgdyq) {
                    ns5othbq44gtnno3dq = null;
                    if (ozymfbftwktrwiftdhyb8vgdyq.Ca81ebIan1u == 0 && ozymfbftwktrwiftdhyb8vgdyq.q1wNbhk2O6 && U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m(ozymfbftwktrwiftdhyb8vgdyq.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.GI83zq0G8e7zkn, this.GI83zq0G8e7zkn.GI83zq0G8e7zkn)) {
                        ns5othbq44gtnno3dq = ozymfbftwktrwiftdhyb8vgdyq.ZfQNn8hdWlEQ5cR94249PDsLR;
                    }
                }
                if (ns5othbq44gtnno3dq != null) {
                    this.p59rPv72J9 = ns5othbq44gtnno3dq;
                    return true;
                }
            }
            z8uyl4sTQr2O9dK1e z8uyl4stqr2o9dk1e = this.KUYypEB4eNWOZWVDpH;
            if ((z8uyl4stqr2o9dk1e == null || z8uyl4stqr2o9dk1e.V57tEvNfxZVVcOCAOih5PKr >= ((ArrayList) z8uyl4stqr2o9dk1e.ZfQNn8hdWlEQ5cR94249PDsLR).size()) && (fjwWjQVIrVOuY6M4QzKm0L = this.q1wNbhk2O6) != null) {
                return fjwWjQVIrVOuY6M4QzKm0L.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, java.util.List] */
    public final JkEUIOeQEWq0UUU VxUQ9tBhpHJ2AAEDNW8sghc4m() throws IOException {
        String hostAddress;
        int port;
        List listV57tEvNfxZVVcOCAOih5PKr;
        boolean zContains;
        nS5othbQ44GTnNo3dq ns5othbq44gtnno3dq = this.p59rPv72J9;
        if (ns5othbq44gtnno3dq != null) {
            this.p59rPv72J9 = null;
            return zzpBGItXfub0yWj(ns5othbq44gtnno3dq, null);
        }
        z8uyl4sTQr2O9dK1e z8uyl4stqr2o9dk1e = this.KUYypEB4eNWOZWVDpH;
        if (z8uyl4stqr2o9dk1e != null && z8uyl4stqr2o9dk1e.V57tEvNfxZVVcOCAOih5PKr < ((ArrayList) z8uyl4stqr2o9dk1e.ZfQNn8hdWlEQ5cR94249PDsLR).size()) {
            int i = z8uyl4stqr2o9dk1e.V57tEvNfxZVVcOCAOih5PKr;
            ArrayList arrayList = (ArrayList) z8uyl4stqr2o9dk1e.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (i >= arrayList.size()) {
                throw new NoSuchElementException();
            }
            int i2 = z8uyl4stqr2o9dk1e.V57tEvNfxZVVcOCAOih5PKr;
            z8uyl4stqr2o9dk1e.V57tEvNfxZVVcOCAOih5PKr = i2 + 1;
            return zzpBGItXfub0yWj((nS5othbQ44GTnNo3dq) arrayList.get(i2), null);
        }
        FjwWjQVIrVOuY6M4QzKm0L fjwWjQVIrVOuY6M4QzKm0L = this.q1wNbhk2O6;
        if (fjwWjQVIrVOuY6M4QzKm0L == null) {
            fjwWjQVIrVOuY6M4QzKm0L = new FjwWjQVIrVOuY6M4QzKm0L(this.GI83zq0G8e7zkn, this.M9e7PWhFYLD2lOGMker, this.HzCpKshMOoaw76hFcbOVRYMeRd, this.NSjgqmGjEzuugn2SsG1mZFP);
            this.q1wNbhk2O6 = fjwWjQVIrVOuY6M4QzKm0L;
        }
        if (!fjwWjQVIrVOuY6M4QzKm0L.VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
            throw new IOException("exhausted all routes");
        }
        if (!fjwWjQVIrVOuY6M4QzKm0L.VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        while (fjwWjQVIrVOuY6M4QzKm0L.zIvmSL0wzmmKGc3X39b2Gw2mUGE < fjwWjQVIrVOuY6M4QzKm0L.LaeGQIruHQu81hfJldjMOQSVblH3x.size()) {
            xJilh3An9LAykwTqP7vc xjilh3an9laykwtqp7vc = fjwWjQVIrVOuY6M4QzKm0L.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (fjwWjQVIrVOuY6M4QzKm0L.zIvmSL0wzmmKGc3X39b2Gw2mUGE >= fjwWjQVIrVOuY6M4QzKm0L.LaeGQIruHQu81hfJldjMOQSVblH3x.size()) {
                throw new SocketException("No route to " + xjilh3an9laykwtqp7vc.GI83zq0G8e7zkn.ZfQNn8hdWlEQ5cR94249PDsLR + "; exhausted proxy configurations: " + fjwWjQVIrVOuY6M4QzKm0L.LaeGQIruHQu81hfJldjMOQSVblH3x);
            }
            List list = fjwWjQVIrVOuY6M4QzKm0L.LaeGQIruHQu81hfJldjMOQSVblH3x;
            int i3 = fjwWjQVIrVOuY6M4QzKm0L.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            fjwWjQVIrVOuY6M4QzKm0L.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i3 + 1;
            Proxy proxy = (Proxy) list.get(i3);
            ixvYVtn9EMRQ7IMkUn6Ak2pqJO6h ixvyvtn9emrq7imkun6ak2pqjo6h = fjwWjQVIrVOuY6M4QzKm0L.V57tEvNfxZVVcOCAOih5PKr;
            ArrayList arrayList3 = new ArrayList();
            fjwWjQVIrVOuY6M4QzKm0L.ZLZeBXTMq0zDztBxtRTuCHrapQ = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                sveu0WcbYc1gIe sveu0wcbyc1gie = xjilh3an9laykwtqp7vc.GI83zq0G8e7zkn;
                hostAddress = sveu0wcbyc1gie.ZfQNn8hdWlEQ5cR94249PDsLR;
                port = sveu0wcbyc1gie.LaeGQIruHQu81hfJldjMOQSVblH3x;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                InetAddress address = inetSocketAddress.getAddress();
                if (address == null) {
                    hostAddress = inetSocketAddress.getHostName();
                    ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(hostAddress, "getHostName(...)");
                } else {
                    hostAddress = address.getHostAddress();
                    ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(hostAddress, "getHostAddress(...)");
                }
                port = inetSocketAddress.getPort();
            }
            if (1 > port || port >= 65536) {
                throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(hostAddress, port));
            } else {
                u3oM4Jia4hn5PHaSzj7t25fUwRg7 u3om4jia4hn5phaszj7t25fuwrg7 = IQjv3jTNogGqr6Koi5AtfzaT9p.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                ej6unYlOWMDF.pYmKDYlAmhudp(hostAddress, "<this>");
                u3oM4Jia4hn5PHaSzj7t25fUwRg7 u3om4jia4hn5phaszj7t25fuwrg72 = IQjv3jTNogGqr6Koi5AtfzaT9p.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                u3om4jia4hn5phaszj7t25fuwrg72.getClass();
                if (u3om4jia4hn5phaszj7t25fuwrg72.V57tEvNfxZVVcOCAOih5PKr.matcher(hostAddress).matches()) {
                    listV57tEvNfxZVVcOCAOih5PKr = KfeOQNOupsCg6878zi4e.HVEwbdULInpTNa0IG(InetAddress.getByName(hostAddress));
                } else {
                    ixvyvtn9emrq7imkun6ak2pqjo6h.getClass();
                    xjilh3an9laykwtqp7vc.VxUQ9tBhpHJ2AAEDNW8sghc4m.getClass();
                    try {
                        InetAddress[] allByName = InetAddress.getAllByName(hostAddress);
                        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(allByName, "getAllByName(...)");
                        int length = allByName.length;
                        List arrayList4 = length != 0 ? length != 1 ? new ArrayList(new fv98rqAcvk(allByName, false)) : KfeOQNOupsCg6878zi4e.HVEwbdULInpTNa0IG(allByName[0]) : zyfAMJWWt8IroEev2OgKlBxvdV.V57tEvNfxZVVcOCAOih5PKr;
                        if (arrayList4.isEmpty()) {
                            throw new UnknownHostException(xjilh3an9laykwtqp7vc.VxUQ9tBhpHJ2AAEDNW8sghc4m + " returned no addresses for " + hostAddress);
                        }
                        ixvyvtn9emrq7imkun6ak2pqjo6h.getClass();
                        listV57tEvNfxZVVcOCAOih5PKr = arrayList4;
                    } catch (NullPointerException e) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostAddress));
                        unknownHostException.initCause(e);
                        throw unknownHostException;
                    }
                }
                if (fjwWjQVIrVOuY6M4QzKm0L.ZfQNn8hdWlEQ5cR94249PDsLR && listV57tEvNfxZVVcOCAOih5PKr.size() >= 2) {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj : listV57tEvNfxZVVcOCAOih5PKr) {
                        if (((InetAddress) obj) instanceof Inet6Address) {
                            arrayList5.add(obj);
                        } else {
                            arrayList6.add(obj);
                        }
                    }
                    if (!arrayList5.isEmpty() && !arrayList6.isEmpty()) {
                        byte[] bArr = jHlOQHj3hlCsydfI7r5ApVdQjYvKf.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        Iterator it = arrayList5.iterator();
                        Iterator it2 = arrayList6.iterator();
                        CdyQYCBK2awPZQYrStW8hpQgDJcqR cdyQYCBK2awPZQYrStW8hpQgDJcqR = new CdyQYCBK2awPZQYrStW8hpQgDJcqR(10);
                        while (true) {
                            if (!it.hasNext() && !it2.hasNext()) {
                                break;
                            }
                            if (it.hasNext()) {
                                cdyQYCBK2awPZQYrStW8hpQgDJcqR.add(it.next());
                            }
                            if (it2.hasNext()) {
                                cdyQYCBK2awPZQYrStW8hpQgDJcqR.add(it2.next());
                            }
                        }
                        listV57tEvNfxZVVcOCAOih5PKr = KfeOQNOupsCg6878zi4e.V57tEvNfxZVVcOCAOih5PKr(cdyQYCBK2awPZQYrStW8hpQgDJcqR);
                    }
                }
                Iterator it3 = listV57tEvNfxZVVcOCAOih5PKr.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new InetSocketAddress((InetAddress) it3.next(), port));
                }
            }
            Iterator it4 = fjwWjQVIrVOuY6M4QzKm0L.ZLZeBXTMq0zDztBxtRTuCHrapQ.iterator();
            while (it4.hasNext()) {
                nS5othbQ44GTnNo3dq ns5othbq44gtnno3dq2 = new nS5othbQ44GTnNo3dq(fjwWjQVIrVOuY6M4QzKm0L.VxUQ9tBhpHJ2AAEDNW8sghc4m, proxy, (InetSocketAddress) it4.next());
                qF22Y620JkFyombtDYw0h0h8Rxpja qf22y620jkfyombtdyw0h0h8rxpja = fjwWjQVIrVOuY6M4QzKm0L.zzpBGItXfub0yWj;
                synchronized (qf22y620jkfyombtdyw0h0h8rxpja) {
                    zContains = ((LinkedHashSet) qf22y620jkfyombtdyw0h0h8rxpja.V57tEvNfxZVVcOCAOih5PKr).contains(ns5othbq44gtnno3dq2);
                }
                if (zContains) {
                    fjwWjQVIrVOuY6M4QzKm0L.NSjgqmGjEzuugn2SsG1mZFP.add(ns5othbq44gtnno3dq2);
                } else {
                    arrayList2.add(ns5othbq44gtnno3dq2);
                }
            }
            if (!arrayList2.isEmpty()) {
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            gYXV3FZbh17i6ocMo1T.BJQHddi0Plr5ElWetCyaixWOg9(arrayList2, fjwWjQVIrVOuY6M4QzKm0L.NSjgqmGjEzuugn2SsG1mZFP);
            fjwWjQVIrVOuY6M4QzKm0L.NSjgqmGjEzuugn2SsG1mZFP.clear();
        }
        z8uyl4sTQr2O9dK1e z8uyl4stqr2o9dk1e2 = new z8uyl4sTQr2O9dK1e(arrayList2, 3);
        this.KUYypEB4eNWOZWVDpH = z8uyl4stqr2o9dk1e2;
        if (this.HzCpKshMOoaw76hFcbOVRYMeRd.q1wNbhk2O6()) {
            throw new IOException("Canceled");
        }
        if (z8uyl4stqr2o9dk1e2.V57tEvNfxZVVcOCAOih5PKr >= arrayList2.size()) {
            throw new NoSuchElementException();
        }
        int i4 = z8uyl4stqr2o9dk1e2.V57tEvNfxZVVcOCAOih5PKr;
        z8uyl4stqr2o9dk1e2.V57tEvNfxZVVcOCAOih5PKr = i4 + 1;
        return zzpBGItXfub0yWj((nS5othbQ44GTnNo3dq) arrayList2.get(i4), arrayList2);
    }

    @Override // com.vdodsodjsdt.A3cppuj9wGt
    public final xJilh3An9LAykwTqP7vc ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        return this.GI83zq0G8e7zkn;
    }

    @Override // com.vdodsodjsdt.A3cppuj9wGt
    public final rOiKJVDHPqqeCfn ZfQNn8hdWlEQ5cR94249PDsLR() {
        return this.Ca81ebIan1u;
    }

    @Override // com.vdodsodjsdt.A3cppuj9wGt
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(sveu0WcbYc1gIe sveu0wcbyc1gie) {
        ej6unYlOWMDF.pYmKDYlAmhudp(sveu0wcbyc1gie, "url");
        sveu0WcbYc1gIe sveu0wcbyc1gie2 = this.GI83zq0G8e7zkn.GI83zq0G8e7zkn;
        return sveu0wcbyc1gie.LaeGQIruHQu81hfJldjMOQSVblH3x == sveu0wcbyc1gie2.LaeGQIruHQu81hfJldjMOQSVblH3x && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(sveu0wcbyc1gie.ZfQNn8hdWlEQ5cR94249PDsLR, sveu0wcbyc1gie2.ZfQNn8hdWlEQ5cR94249PDsLR);
    }

    public final JkEUIOeQEWq0UUU zzpBGItXfub0yWj(nS5othbQ44GTnNo3dq ns5othbq44gtnno3dq, ArrayList arrayList) throws UnknownServiceException {
        ZQ5iEBLmvObelGeRgKLPRxHbZEk zQ5iEBLmvObelGeRgKLPRxHbZEk = ZQ5iEBLmvObelGeRgKLPRxHbZEk.GI83zq0G8e7zkn;
        ej6unYlOWMDF.pYmKDYlAmhudp(ns5othbq44gtnno3dq, "route");
        xJilh3An9LAykwTqP7vc xjilh3an9laykwtqp7vc = ns5othbq44gtnno3dq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (xjilh3an9laykwtqp7vc.V57tEvNfxZVVcOCAOih5PKr == null) {
            if (!xjilh3an9laykwtqp7vc.HzCpKshMOoaw76hFcbOVRYMeRd.contains(aloYcuoPLQwNUIx6IjuQPANqqGRoM.zIvmSL0wzmmKGc3X39b2Gw2mUGE)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = ns5othbq44gtnno3dq.VxUQ9tBhpHJ2AAEDNW8sghc4m.GI83zq0G8e7zkn.ZfQNn8hdWlEQ5cR94249PDsLR;
            O510kkNvCgHHMXIbKz1NqEFfrmj o510kkNvCgHHMXIbKz1NqEFfrmj = O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (!O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m.GI83zq0G8e7zkn(str)) {
                throw new UnknownServiceException(u9SlVAuoWhQUfJ.M9e7PWhFYLD2lOGMker("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (xjilh3an9laykwtqp7vc.M9e7PWhFYLD2lOGMker.contains(zQ5iEBLmvObelGeRgKLPRxHbZEk)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        tpLngQCdAeyjjtxlI tplngqcdaeyjjtxli = null;
        if (ns5othbq44gtnno3dq.zzpBGItXfub0yWj.type() == Proxy.Type.HTTP) {
            xJilh3An9LAykwTqP7vc xjilh3an9laykwtqp7vc2 = ns5othbq44gtnno3dq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (xjilh3an9laykwtqp7vc2.V57tEvNfxZVVcOCAOih5PKr != null || xjilh3an9laykwtqp7vc2.M9e7PWhFYLD2lOGMker.contains(zQ5iEBLmvObelGeRgKLPRxHbZEk)) {
                UL4JI0eLnaD84py2JT uL4JI0eLnaD84py2JT = new UL4JI0eLnaD84py2JT(2);
                sveu0WcbYc1gIe sveu0wcbyc1gie = ns5othbq44gtnno3dq.VxUQ9tBhpHJ2AAEDNW8sghc4m.GI83zq0G8e7zkn;
                ej6unYlOWMDF.pYmKDYlAmhudp(sveu0wcbyc1gie, "url");
                uL4JI0eLnaD84py2JT.VxUQ9tBhpHJ2AAEDNW8sghc4m = sveu0wcbyc1gie;
                uL4JI0eLnaD84py2JT.GI83zq0G8e7zkn("CONNECT", null);
                xJilh3An9LAykwTqP7vc xjilh3an9laykwtqp7vc3 = ns5othbq44gtnno3dq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                uL4JI0eLnaD84py2JT.ZLZeBXTMq0zDztBxtRTuCHrapQ("Host", U7JVXX1Kyh43VgUF.ZLZeBXTMq0zDztBxtRTuCHrapQ(xjilh3an9laykwtqp7vc3.GI83zq0G8e7zkn, true));
                uL4JI0eLnaD84py2JT.ZLZeBXTMq0zDztBxtRTuCHrapQ("Proxy-Connection", "Keep-Alive");
                uL4JI0eLnaD84py2JT.ZLZeBXTMq0zDztBxtRTuCHrapQ("User-Agent", "okhttp/5.1.0");
                tplngqcdaeyjjtxli = new tpLngQCdAeyjjtxlI(uL4JI0eLnaD84py2JT);
                FLvrlZkJs3awN6tkCl92IG fLvrlZkJs3awN6tkCl92IG = vMNcbMafUgq.V57tEvNfxZVVcOCAOih5PKr;
                yxp1I6Gr2tLDD3dH0UsMPMDr7 yxp1i6gr2tldd3dh0usmpmdr7 = new yxp1I6Gr2tLDD3dH0UsMPMDr7();
                zonOxHotd3BwAPJcwqr6I6uQNngg4.aXO0LSrt8bKV("Proxy-Authenticate");
                zonOxHotd3BwAPJcwqr6I6uQNngg4.vE4yDIjexsP2lGjLaTcB("OkHttp-Preemptive", "Proxy-Authenticate");
                yxp1i6gr2tldd3dh0usmpmdr7.V57tEvNfxZVVcOCAOih5PKr("Proxy-Authenticate");
                zonOxHotd3BwAPJcwqr6I6uQNngg4.NSjgqmGjEzuugn2SsG1mZFP(yxp1i6gr2tldd3dh0usmpmdr7, "Proxy-Authenticate", "OkHttp-Preemptive");
                yxp1i6gr2tldd3dh0usmpmdr7.zzpBGItXfub0yWj();
                ej6unYlOWMDF.pYmKDYlAmhudp(fLvrlZkJs3awN6tkCl92IG, "body");
                xjilh3an9laykwtqp7vc3.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getClass();
            }
        }
        return new JkEUIOeQEWq0UUU(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, this.zzpBGItXfub0yWj, this.V57tEvNfxZVVcOCAOih5PKr, this.ZfQNn8hdWlEQ5cR94249PDsLR, this.LaeGQIruHQu81hfJldjMOQSVblH3x, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, this.ZLZeBXTMq0zDztBxtRTuCHrapQ, this.HzCpKshMOoaw76hFcbOVRYMeRd, this, ns5othbq44gtnno3dq, arrayList, tplngqcdaeyjjtxli, -1, false);
    }
}
