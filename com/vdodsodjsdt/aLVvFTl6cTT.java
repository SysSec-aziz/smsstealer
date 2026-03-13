package com.vdodsodjsdt;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class aLVvFTl6cTT implements Closeable {
    public static final bof4DtY4zFmy9PX46PcOrxENM SuB3hEmTmbbRGAhtvOOmfKEon;
    public long Ca81ebIan1u;
    public final j5jyRGaw4k GI83zq0G8e7zkn;
    public final MpsgFCfSVNxgvcBlEbc8Iuyh3Obq HzCpKshMOoaw76hFcbOVRYMeRd;
    public long Irh5auREsoeV1C1RaBamlmy;
    public final MpsgFCfSVNxgvcBlEbc8Iuyh3Obq KUYypEB4eNWOZWVDpH;
    public final String LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final MpsgFCfSVNxgvcBlEbc8Iuyh3Obq M9e7PWhFYLD2lOGMker;
    public boolean NSjgqmGjEzuugn2SsG1mZFP;
    public final hGzyxEAtPzT RhfGHxtXxy0M0grmp2jkRjQg;
    public long TaDO7ogis3aEiWEtq;
    public final SBvbXpgT6Ff7FomWxrO V57tEvNfxZVVcOCAOih5PKr;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final LinkedHashMap ZfQNn8hdWlEQ5cR94249PDsLR = new LinkedHashMap();
    public bof4DtY4zFmy9PX46PcOrxENM f6ZQsR6bPLvvCDNXOUc;
    public long h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public final bof4DtY4zFmy9PX46PcOrxENM jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public final UFiflNDkv7brFTbpqA3 ko09zE6UAgwkV;
    public long p59rPv72J9;
    public long pYmKDYlAmhudp;
    public final Socket q11o1hieEkZDhF1MGOZI26oZiDT;
    public final IN79WcIk5xB4t0GjRT43qPLs5 q1wNbhk2O6;
    public final LinkedHashSet qNPQb1obP7;
    public final FJ9L7VU9VoIgEkU9qrt8Dm vBGA6pPLqSMuYGvprl270j7;
    public final bECpBnb6LRshlhGU1tvHCJd w0Wu95l8dVNw5rZMRu;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    static {
        bof4DtY4zFmy9PX46PcOrxENM bof4dty4zfmy9px46pcorxenm = new bof4DtY4zFmy9PX46PcOrxENM();
        bof4dty4zfmy9px46pcorxenm.V57tEvNfxZVVcOCAOih5PKr(4, 65535);
        bof4dty4zfmy9px46pcorxenm.V57tEvNfxZVVcOCAOih5PKr(5, 16384);
        SuB3hEmTmbbRGAhtvOOmfKEon = bof4dty4zfmy9px46pcorxenm;
    }

    public aLVvFTl6cTT(JsnZMsYEp5ShmM4 jsnZMsYEp5ShmM4) {
        this.V57tEvNfxZVVcOCAOih5PKr = (SBvbXpgT6Ff7FomWxrO) jsnZMsYEp5ShmM4.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        String str = (String) jsnZMsYEp5ShmM4.V57tEvNfxZVVcOCAOih5PKr;
        if (str == null) {
            ej6unYlOWMDF.BJQHddi0Plr5ElWetCyaixWOg9("connectionName");
            throw null;
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = str;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 3;
        j5jyRGaw4k j5jyrgaw4k = (j5jyRGaw4k) jsnZMsYEp5ShmM4.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        this.GI83zq0G8e7zkn = j5jyrgaw4k;
        this.M9e7PWhFYLD2lOGMker = j5jyrgaw4k.ZfQNn8hdWlEQ5cR94249PDsLR();
        this.HzCpKshMOoaw76hFcbOVRYMeRd = j5jyrgaw4k.ZfQNn8hdWlEQ5cR94249PDsLR();
        this.KUYypEB4eNWOZWVDpH = j5jyrgaw4k.ZfQNn8hdWlEQ5cR94249PDsLR();
        this.q1wNbhk2O6 = IN79WcIk5xB4t0GjRT43qPLs5.Ca81ebIan1u;
        this.ko09zE6UAgwkV = (UFiflNDkv7brFTbpqA3) jsnZMsYEp5ShmM4.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        bof4DtY4zFmy9PX46PcOrxENM bof4dty4zfmy9px46pcorxenm = new bof4DtY4zFmy9PX46PcOrxENM();
        bof4dty4zfmy9px46pcorxenm.V57tEvNfxZVVcOCAOih5PKr(4, 16777216);
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = bof4dty4zfmy9px46pcorxenm;
        this.f6ZQsR6bPLvvCDNXOUc = SuB3hEmTmbbRGAhtvOOmfKEon;
        this.vBGA6pPLqSMuYGvprl270j7 = new FJ9L7VU9VoIgEkU9qrt8Dm(0);
        this.Irh5auREsoeV1C1RaBamlmy = r0.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        Socket socket = (Socket) jsnZMsYEp5ShmM4.zzpBGItXfub0yWj;
        if (socket == null) {
            ej6unYlOWMDF.BJQHddi0Plr5ElWetCyaixWOg9("socket");
            throw null;
        }
        this.q11o1hieEkZDhF1MGOZI26oZiDT = socket;
        zvqhqc7YVxGqa3qIRo zvqhqc7yvxgqa3qiro = (zvqhqc7YVxGqa3qIRo) jsnZMsYEp5ShmM4.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (zvqhqc7yvxgqa3qiro == null) {
            ej6unYlOWMDF.BJQHddi0Plr5ElWetCyaixWOg9("sink");
            throw null;
        }
        this.w0Wu95l8dVNw5rZMRu = new bECpBnb6LRshlhGU1tvHCJd(zvqhqc7yvxgqa3qiro);
        hy3v1zJcCYok89Y1iAeFhN66 hy3v1zjccyok89y1iaefhn66 = (hy3v1zJcCYok89Y1iAeFhN66) jsnZMsYEp5ShmM4.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (hy3v1zjccyok89y1iaefhn66 == null) {
            ej6unYlOWMDF.BJQHddi0Plr5ElWetCyaixWOg9("source");
            throw null;
        }
        this.RhfGHxtXxy0M0grmp2jkRjQg = new hGzyxEAtPzT(this, new fwzr2yRMgOq0UE8cQLHe(hy3v1zjccyok89y1iaefhn66));
        this.qNPQb1obP7 = new LinkedHashSet();
    }

    public final void KUYypEB4eNWOZWVDpH(long j) {
        synchronized (this) {
            try {
                FJ9L7VU9VoIgEkU9qrt8Dm.V57tEvNfxZVVcOCAOih5PKr(this.vBGA6pPLqSMuYGvprl270j7, j, 0L, 2);
                long jZzpBGItXfub0yWj = this.vBGA6pPLqSMuYGvprl270j7.zzpBGItXfub0yWj();
                if (jZzpBGItXfub0yWj >= this.jW7EiD0YL6xkbB158jMUzhWNWb1y.VxUQ9tBhpHJ2AAEDNW8sghc4m() / 2) {
                    SuB3hEmTmbbRGAhtvOOmfKEon(0, jZzpBGItXfub0yWj);
                    FJ9L7VU9VoIgEkU9qrt8Dm.V57tEvNfxZVVcOCAOih5PKr(this.vBGA6pPLqSMuYGvprl270j7, 0L, jZzpBGItXfub0yWj, 1);
                }
                UFiflNDkv7brFTbpqA3 uFiflNDkv7brFTbpqA3 = this.ko09zE6UAgwkV;
                FJ9L7VU9VoIgEkU9qrt8Dm fJ9L7VU9VoIgEkU9qrt8Dm = this.vBGA6pPLqSMuYGvprl270j7;
                uFiflNDkv7brFTbpqA3.getClass();
                ej6unYlOWMDF.pYmKDYlAmhudp(fJ9L7VU9VoIgEkU9qrt8Dm, "windowCounter");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AIQ3M1G7NlBb9nFUZAGJvkBOAC LaeGQIruHQu81hfJldjMOQSVblH3x(int i) {
        AIQ3M1G7NlBb9nFUZAGJvkBOAC aIQ3M1G7NlBb9nFUZAGJvkBOAC;
        synchronized (this) {
            aIQ3M1G7NlBb9nFUZAGJvkBOAC = (AIQ3M1G7NlBb9nFUZAGJvkBOAC) this.ZfQNn8hdWlEQ5cR94249PDsLR.remove(Integer.valueOf(i));
            notifyAll();
        }
        return aIQ3M1G7NlBb9nFUZAGJvkBOAC;
    }

    public final void M9e7PWhFYLD2lOGMker(sRSjJ4B4UdKzPCFBE srsjj4b4udkzpcfbe) {
        synchronized (this.w0Wu95l8dVNw5rZMRu) {
            synchronized (this) {
                if (this.NSjgqmGjEzuugn2SsG1mZFP) {
                    return;
                }
                this.NSjgqmGjEzuugn2SsG1mZFP = true;
                this.w0Wu95l8dVNw5rZMRu.M9e7PWhFYLD2lOGMker(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, srsjj4b4udkzpcfbe, jHlOQHj3hlCsydfI7r5ApVdQjYvKf.VxUQ9tBhpHJ2AAEDNW8sghc4m);
            }
        }
    }

    public final void RhfGHxtXxy0M0grmp2jkRjQg(final int i, final sRSjJ4B4UdKzPCFBE srsjj4b4udkzpcfbe) {
        MpsgFCfSVNxgvcBlEbc8Iuyh3Obq.zzpBGItXfub0yWj(this.M9e7PWhFYLD2lOGMker, this.LaeGQIruHQu81hfJldjMOQSVblH3x + '[' + i + "] writeSynReset", new EfIvTei3Q8wBNpyLTZJevpFxej() { // from class: com.vdodsodjsdt.gjqsbrmwNETcp2NWeIRkv1r1po
            @Override // com.vdodsodjsdt.EfIvTei3Q8wBNpyLTZJevpFxej
            public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m() {
                aLVvFTl6cTT alvvftl6ctt = this.V57tEvNfxZVVcOCAOih5PKr;
                try {
                    alvvftl6ctt.w0Wu95l8dVNw5rZMRu.RhfGHxtXxy0M0grmp2jkRjQg(i, srsjj4b4udkzpcfbe);
                } catch (IOException e) {
                    sRSjJ4B4UdKzPCFBE srsjj4b4udkzpcfbe2 = sRSjJ4B4UdKzPCFBE.PROTOCOL_ERROR;
                    alvvftl6ctt.VxUQ9tBhpHJ2AAEDNW8sghc4m(srsjj4b4udkzpcfbe2, srsjj4b4udkzpcfbe2, e);
                }
                return hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            }
        });
    }

    public final void SuB3hEmTmbbRGAhtvOOmfKEon(final int i, final long j) {
        MpsgFCfSVNxgvcBlEbc8Iuyh3Obq.zzpBGItXfub0yWj(this.M9e7PWhFYLD2lOGMker, this.LaeGQIruHQu81hfJldjMOQSVblH3x + '[' + i + "] windowUpdate", new EfIvTei3Q8wBNpyLTZJevpFxej() { // from class: com.vdodsodjsdt.oXJZNTwYRFYd0eJhKQ4I5u69rke1H
            @Override // com.vdodsodjsdt.EfIvTei3Q8wBNpyLTZJevpFxej
            public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m() {
                aLVvFTl6cTT alvvftl6ctt = this.V57tEvNfxZVVcOCAOih5PKr;
                try {
                    alvvftl6ctt.w0Wu95l8dVNw5rZMRu.SuB3hEmTmbbRGAhtvOOmfKEon(i, j);
                } catch (IOException e) {
                    sRSjJ4B4UdKzPCFBE srsjj4b4udkzpcfbe = sRSjJ4B4UdKzPCFBE.PROTOCOL_ERROR;
                    alvvftl6ctt.VxUQ9tBhpHJ2AAEDNW8sghc4m(srsjj4b4udkzpcfbe, srsjj4b4udkzpcfbe, e);
                }
                return hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            }
        });
    }

    public final AIQ3M1G7NlBb9nFUZAGJvkBOAC V57tEvNfxZVVcOCAOih5PKr(int i) {
        AIQ3M1G7NlBb9nFUZAGJvkBOAC aIQ3M1G7NlBb9nFUZAGJvkBOAC;
        synchronized (this) {
            aIQ3M1G7NlBb9nFUZAGJvkBOAC = (AIQ3M1G7NlBb9nFUZAGJvkBOAC) this.ZfQNn8hdWlEQ5cR94249PDsLR.get(Integer.valueOf(i));
        }
        return aIQ3M1G7NlBb9nFUZAGJvkBOAC;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(sRSjJ4B4UdKzPCFBE srsjj4b4udkzpcfbe, sRSjJ4B4UdKzPCFBE srsjj4b4udkzpcfbe2, IOException iOException) {
        int i;
        Object[] array;
        TimeZone timeZone = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        try {
            M9e7PWhFYLD2lOGMker(srsjj4b4udkzpcfbe);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.ZfQNn8hdWlEQ5cR94249PDsLR.isEmpty()) {
                array = null;
            } else {
                array = this.ZfQNn8hdWlEQ5cR94249PDsLR.values().toArray(new AIQ3M1G7NlBb9nFUZAGJvkBOAC[0]);
                this.ZfQNn8hdWlEQ5cR94249PDsLR.clear();
            }
        }
        AIQ3M1G7NlBb9nFUZAGJvkBOAC[] aIQ3M1G7NlBb9nFUZAGJvkBOACArr = (AIQ3M1G7NlBb9nFUZAGJvkBOAC[]) array;
        if (aIQ3M1G7NlBb9nFUZAGJvkBOACArr != null) {
            for (AIQ3M1G7NlBb9nFUZAGJvkBOAC aIQ3M1G7NlBb9nFUZAGJvkBOAC : aIQ3M1G7NlBb9nFUZAGJvkBOACArr) {
                try {
                    aIQ3M1G7NlBb9nFUZAGJvkBOAC.V57tEvNfxZVVcOCAOih5PKr(srsjj4b4udkzpcfbe2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.w0Wu95l8dVNw5rZMRu.close();
        } catch (IOException unused3) {
        }
        try {
            this.q11o1hieEkZDhF1MGOZI26oZiDT.close();
        } catch (IOException unused4) {
        }
        this.M9e7PWhFYLD2lOGMker.LaeGQIruHQu81hfJldjMOQSVblH3x();
        this.HzCpKshMOoaw76hFcbOVRYMeRd.LaeGQIruHQu81hfJldjMOQSVblH3x();
        this.KUYypEB4eNWOZWVDpH.LaeGQIruHQu81hfJldjMOQSVblH3x();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        VxUQ9tBhpHJ2AAEDNW8sghc4m(sRSjJ4B4UdKzPCFBE.NO_ERROR, sRSjJ4B4UdKzPCFBE.CANCEL, null);
    }

    public final void flush() {
        this.w0Wu95l8dVNw5rZMRu.flush();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.w0Wu95l8dVNw5rZMRu.LaeGQIruHQu81hfJldjMOQSVblH3x);
        r6 = r2;
        r8.TaDO7ogis3aEiWEtq += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q11o1hieEkZDhF1MGOZI26oZiDT(int r9, boolean r10, com.vdodsodjsdt.EouCzLZsW9ynithduh r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            com.vdodsodjsdt.bECpBnb6LRshlhGU1tvHCJd r12 = r8.w0Wu95l8dVNw5rZMRu
            r12.V57tEvNfxZVVcOCAOih5PKr(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.TaDO7ogis3aEiWEtq     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.Irh5auREsoeV1C1RaBamlmy     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.ZfQNn8hdWlEQ5cR94249PDsLR     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            com.vdodsodjsdt.bECpBnb6LRshlhGU1tvHCJd r4 = r8.w0Wu95l8dVNw5rZMRu     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.LaeGQIruHQu81hfJldjMOQSVblH3x     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.TaDO7ogis3aEiWEtq     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.TaDO7ogis3aEiWEtq = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            com.vdodsodjsdt.bECpBnb6LRshlhGU1tvHCJd r4 = r8.w0Wu95l8dVNw5rZMRu
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.V57tEvNfxZVVcOCAOih5PKr(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.aLVvFTl6cTT.q11o1hieEkZDhF1MGOZI26oZiDT(int, boolean, com.vdodsodjsdt.EouCzLZsW9ynithduh, long):void");
    }
}
