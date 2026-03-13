package com.vdodsodjsdt;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class AIQ3M1G7NlBb9nFUZAGJvkBOAC {
    public final ZMhZ80mwgbZz7 GI83zq0G8e7zkn;
    public final KPkneIxcKCnItD3 HzCpKshMOoaw76hFcbOVRYMeRd;
    public sRSjJ4B4UdKzPCFBE KUYypEB4eNWOZWVDpH;
    public long LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final KPkneIxcKCnItD3 M9e7PWhFYLD2lOGMker;
    public final dXHMYjwYri NSjgqmGjEzuugn2SsG1mZFP;
    public final FJ9L7VU9VoIgEkU9qrt8Dm V57tEvNfxZVVcOCAOih5PKr;
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public long ZfQNn8hdWlEQ5cR94249PDsLR;
    public IOException q1wNbhk2O6;
    public final ArrayDeque zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final aLVvFTl6cTT zzpBGItXfub0yWj;

    public AIQ3M1G7NlBb9nFUZAGJvkBOAC(int i, aLVvFTl6cTT alvvftl6ctt, boolean z, boolean z2, EUSG2RPrSQzuno7qTyOhv0Az eUSG2RPrSQzuno7qTyOhv0Az) {
        ej6unYlOWMDF.pYmKDYlAmhudp(alvvftl6ctt, "connection");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.zzpBGItXfub0yWj = alvvftl6ctt;
        this.V57tEvNfxZVVcOCAOih5PKr = new FJ9L7VU9VoIgEkU9qrt8Dm(i);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = alvvftl6ctt.f6ZQsR6bPLvvCDNXOUc.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = arrayDeque;
        this.NSjgqmGjEzuugn2SsG1mZFP = new dXHMYjwYri(this, alvvftl6ctt.jW7EiD0YL6xkbB158jMUzhWNWb1y.VxUQ9tBhpHJ2AAEDNW8sghc4m(), z2);
        this.GI83zq0G8e7zkn = new ZMhZ80mwgbZz7(this, z);
        this.M9e7PWhFYLD2lOGMker = new KPkneIxcKCnItD3(this);
        this.HzCpKshMOoaw76hFcbOVRYMeRd = new KPkneIxcKCnItD3(this);
        if (eUSG2RPrSQzuno7qTyOhv0Az == null) {
            if (!ZLZeBXTMq0zDztBxtRTuCHrapQ()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (ZLZeBXTMq0zDztBxtRTuCHrapQ()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(eUSG2RPrSQzuno7qTyOhv0Az);
        }
    }

    public final void GI83zq0G8e7zkn(EUSG2RPrSQzuno7qTyOhv0Az eUSG2RPrSQzuno7qTyOhv0Az, boolean z) {
        boolean zNSjgqmGjEzuugn2SsG1mZFP;
        ej6unYlOWMDF.pYmKDYlAmhudp(eUSG2RPrSQzuno7qTyOhv0Az, "headers");
        TimeZone timeZone = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        synchronized (this) {
            try {
                if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ && eUSG2RPrSQzuno7qTyOhv0Az.VxUQ9tBhpHJ2AAEDNW8sghc4m(":status") == null && eUSG2RPrSQzuno7qTyOhv0Az.VxUQ9tBhpHJ2AAEDNW8sghc4m(":method") == null) {
                    this.NSjgqmGjEzuugn2SsG1mZFP.getClass();
                } else {
                    this.ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
                    this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.add(eUSG2RPrSQzuno7qTyOhv0Az);
                }
                if (z) {
                    this.NSjgqmGjEzuugn2SsG1mZFP.ZfQNn8hdWlEQ5cR94249PDsLR = true;
                }
                zNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zNSjgqmGjEzuugn2SsG1mZFP) {
            return;
        }
        this.zzpBGItXfub0yWj.LaeGQIruHQu81hfJldjMOQSVblH3x(this.VxUQ9tBhpHJ2AAEDNW8sghc4m);
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(sRSjJ4B4UdKzPCFBE srsjj4b4udkzpcfbe) {
        if (ZfQNn8hdWlEQ5cR94249PDsLR(srsjj4b4udkzpcfbe, null)) {
            this.zzpBGItXfub0yWj.RhfGHxtXxy0M0grmp2jkRjQg(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, srsjj4b4udkzpcfbe);
        }
    }

    public final boolean NSjgqmGjEzuugn2SsG1mZFP() {
        synchronized (this) {
            try {
                if (zIvmSL0wzmmKGc3X39b2Gw2mUGE() != null) {
                    return false;
                }
                dXHMYjwYri dxhmyjwyri = this.NSjgqmGjEzuugn2SsG1mZFP;
                if (dxhmyjwyri.ZfQNn8hdWlEQ5cR94249PDsLR || dxhmyjwyri.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                    ZMhZ80mwgbZz7 zMhZ80mwgbZz7 = this.GI83zq0G8e7zkn;
                    if (zMhZ80mwgbZz7.V57tEvNfxZVVcOCAOih5PKr || zMhZ80mwgbZz7.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(sRSjJ4B4UdKzPCFBE srsjj4b4udkzpcfbe, IOException iOException) {
        if (ZfQNn8hdWlEQ5cR94249PDsLR(srsjj4b4udkzpcfbe, iOException)) {
            this.zzpBGItXfub0yWj.w0Wu95l8dVNw5rZMRu.RhfGHxtXxy0M0grmp2jkRjQg(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, srsjj4b4udkzpcfbe);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        /*
            r2 = this;
            java.util.TimeZone r0 = com.vdodsodjsdt.U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m
            monitor-enter(r2)
            com.vdodsodjsdt.dXHMYjwYri r0 = r2.NSjgqmGjEzuugn2SsG1mZFP     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.ZfQNn8hdWlEQ5cR94249PDsLR     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.ZLZeBXTMq0zDztBxtRTuCHrapQ     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            com.vdodsodjsdt.ZMhZ80mwgbZz7 r0 = r2.GI83zq0G8e7zkn     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.V57tEvNfxZVVcOCAOih5PKr     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.LaeGQIruHQu81hfJldjMOQSVblH3x     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L35
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r2.NSjgqmGjEzuugn2SsG1mZFP()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L2b
            com.vdodsodjsdt.sRSjJ4B4UdKzPCFBE r0 = com.vdodsodjsdt.sRSjJ4B4UdKzPCFBE.CANCEL
            r1 = 0
            r2.V57tEvNfxZVVcOCAOih5PKr(r0, r1)
            return
        L2b:
            if (r1 != 0) goto L34
            com.vdodsodjsdt.aLVvFTl6cTT r0 = r2.zzpBGItXfub0yWj
            int r1 = r2.VxUQ9tBhpHJ2AAEDNW8sghc4m
            r0.LaeGQIruHQu81hfJldjMOQSVblH3x(r1)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.AIQ3M1G7NlBb9nFUZAGJvkBOAC.VxUQ9tBhpHJ2AAEDNW8sghc4m():void");
    }

    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        boolean z = (this.VxUQ9tBhpHJ2AAEDNW8sghc4m & 1) == 1;
        this.zzpBGItXfub0yWj.getClass();
        return true == z;
    }

    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR(sRSjJ4B4UdKzPCFBE srsjj4b4udkzpcfbe, IOException iOException) {
        TimeZone timeZone = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        synchronized (this) {
            if (zIvmSL0wzmmKGc3X39b2Gw2mUGE() != null) {
                return false;
            }
            this.KUYypEB4eNWOZWVDpH = srsjj4b4udkzpcfbe;
            this.q1wNbhk2O6 = iOException;
            notifyAll();
            if (this.NSjgqmGjEzuugn2SsG1mZFP.ZfQNn8hdWlEQ5cR94249PDsLR) {
                if (this.GI83zq0G8e7zkn.V57tEvNfxZVVcOCAOih5PKr) {
                    return false;
                }
            }
            this.zzpBGItXfub0yWj.LaeGQIruHQu81hfJldjMOQSVblH3x(this.VxUQ9tBhpHJ2AAEDNW8sghc4m);
            return true;
        }
    }

    public final sRSjJ4B4UdKzPCFBE zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        sRSjJ4B4UdKzPCFBE srsjj4b4udkzpcfbe;
        synchronized (this) {
            srsjj4b4udkzpcfbe = this.KUYypEB4eNWOZWVDpH;
        }
        return srsjj4b4udkzpcfbe;
    }

    public final void zzpBGItXfub0yWj() throws IOException {
        ZMhZ80mwgbZz7 zMhZ80mwgbZz7 = this.GI83zq0G8e7zkn;
        if (zMhZ80mwgbZz7.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IOException("stream closed");
        }
        if (zMhZ80mwgbZz7.V57tEvNfxZVVcOCAOih5PKr) {
            throw new IOException("stream finished");
        }
        if (zIvmSL0wzmmKGc3X39b2Gw2mUGE() != null) {
            IOException iOException = this.q1wNbhk2O6;
            if (iOException != null) {
                throw iOException;
            }
            sRSjJ4B4UdKzPCFBE srsjj4b4udkzpcfbeZIvmSL0wzmmKGc3X39b2Gw2mUGE = zIvmSL0wzmmKGc3X39b2Gw2mUGE();
            ej6unYlOWMDF.p59rPv72J9(srsjj4b4udkzpcfbeZIvmSL0wzmmKGc3X39b2Gw2mUGE);
            throw new w0WH4NylajCPMZqvIXwTlpjfN(srsjj4b4udkzpcfbeZIvmSL0wzmmKGc3X39b2Gw2mUGE);
        }
    }
}
