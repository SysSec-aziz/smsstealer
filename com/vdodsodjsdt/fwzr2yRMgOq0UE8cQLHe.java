package com.vdodsodjsdt;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class fwzr2yRMgOq0UE8cQLHe implements Closeable {
    public static final Logger zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final HAyRQs9oYvmcYalu2DzEE LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final hy3v1zJcCYok89Y1iAeFhN66 V57tEvNfxZVVcOCAOih5PKr;
    public final hNZ9PZz5j6U2tWOncQywik7NKu ZfQNn8hdWlEQ5cR94249PDsLR;

    static {
        Logger logger = Logger.getLogger(tFVUzh05cCwb.class.getName());
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(logger, "getLogger(...)");
        zIvmSL0wzmmKGc3X39b2Gw2mUGE = logger;
    }

    public fwzr2yRMgOq0UE8cQLHe(hy3v1zJcCYok89Y1iAeFhN66 hy3v1zjccyok89y1iaefhn66) {
        ej6unYlOWMDF.pYmKDYlAmhudp(hy3v1zjccyok89y1iaefhn66, "source");
        this.V57tEvNfxZVVcOCAOih5PKr = hy3v1zjccyok89y1iaefhn66;
        hNZ9PZz5j6U2tWOncQywik7NKu hnz9pzz5j6u2twoncqywik7nku = new hNZ9PZz5j6U2tWOncQywik7NKu(hy3v1zjccyok89y1iaefhn66);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = hnz9pzz5j6u2twoncqywik7nku;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new HAyRQs9oYvmcYalu2DzEE(hnz9pzz5j6u2twoncqywik7nku);
    }

    public final void KUYypEB4eNWOZWVDpH(hGzyxEAtPzT hgzyxeatpzt, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int i5 = 0;
        if ((i2 & 8) != 0) {
            byte b = this.V57tEvNfxZVVcOCAOih5PKr.readByte();
            byte[] bArr = jHlOQHj3hlCsydfI7r5ApVdQjYvKf.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i6 = this.V57tEvNfxZVVcOCAOih5PKr.readInt() & Integer.MAX_VALUE;
        List listLaeGQIruHQu81hfJldjMOQSVblH3x = LaeGQIruHQu81hfJldjMOQSVblH3x(KfeOQNOupsCg6878zi4e.O1xDAlBZZlZdoEf747lCFHld(i - 4, i2, i4), i4, i2, i3);
        aLVvFTl6cTT alvvftl6ctt = hgzyxeatpzt.ZfQNn8hdWlEQ5cR94249PDsLR;
        synchronized (alvvftl6ctt) {
            if (alvvftl6ctt.qNPQb1obP7.contains(Integer.valueOf(i6))) {
                alvvftl6ctt.RhfGHxtXxy0M0grmp2jkRjQg(i6, sRSjJ4B4UdKzPCFBE.PROTOCOL_ERROR);
                return;
            }
            alvvftl6ctt.qNPQb1obP7.add(Integer.valueOf(i6));
            MpsgFCfSVNxgvcBlEbc8Iuyh3Obq.zzpBGItXfub0yWj(alvvftl6ctt.HzCpKshMOoaw76hFcbOVRYMeRd, alvvftl6ctt.LaeGQIruHQu81hfJldjMOQSVblH3x + '[' + i6 + "] onRequest", new cSwIPlfRCNj2NmWBjP4tsYO(alvvftl6ctt, i6, listLaeGQIruHQu81hfJldjMOQSVblH3x, i5));
        }
    }

    public final List LaeGQIruHQu81hfJldjMOQSVblH3x(int i, int i2, int i3, int i4) throws IOException {
        hNZ9PZz5j6U2tWOncQywik7NKu hnz9pzz5j6u2twoncqywik7nku = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        hnz9pzz5j6u2twoncqywik7nku.ZLZeBXTMq0zDztBxtRTuCHrapQ = i;
        hnz9pzz5j6u2twoncqywik7nku.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        hnz9pzz5j6u2twoncqywik7nku.NSjgqmGjEzuugn2SsG1mZFP = i2;
        hnz9pzz5j6u2twoncqywik7nku.LaeGQIruHQu81hfJldjMOQSVblH3x = i3;
        hnz9pzz5j6u2twoncqywik7nku.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i4;
        HAyRQs9oYvmcYalu2DzEE hAyRQs9oYvmcYalu2DzEE = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        nfXvCNpsFLQkxk3Wa nfxvcnpsflqkxk3wa = hAyRQs9oYvmcYalu2DzEE.V57tEvNfxZVVcOCAOih5PKr;
        ArrayList arrayList = hAyRQs9oYvmcYalu2DzEE.zzpBGItXfub0yWj;
        while (!nfxvcnpsflqkxk3wa.HzCpKshMOoaw76hFcbOVRYMeRd()) {
            byte b = nfxvcnpsflqkxk3wa.readByte();
            byte[] bArr = jHlOQHj3hlCsydfI7r5ApVdQjYvKf.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            int i5 = b & 255;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            if ((b & 128) == 128) {
                int iLaeGQIruHQu81hfJldjMOQSVblH3x = hAyRQs9oYvmcYalu2DzEE.LaeGQIruHQu81hfJldjMOQSVblH3x(i5, 127);
                int i6 = iLaeGQIruHQu81hfJldjMOQSVblH3x - 1;
                if (i6 >= 0) {
                    KK6EHiwUVZvS[] kK6EHiwUVZvSArr = wVqVa59Q8TrUUQ.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    if (i6 <= kK6EHiwUVZvSArr.length - 1) {
                        arrayList.add(kK6EHiwUVZvSArr[i6]);
                    }
                }
                int length = hAyRQs9oYvmcYalu2DzEE.LaeGQIruHQu81hfJldjMOQSVblH3x + 1 + (i6 - wVqVa59Q8TrUUQ.VxUQ9tBhpHJ2AAEDNW8sghc4m.length);
                if (length >= 0) {
                    KK6EHiwUVZvS[] kK6EHiwUVZvSArr2 = hAyRQs9oYvmcYalu2DzEE.ZfQNn8hdWlEQ5cR94249PDsLR;
                    if (length < kK6EHiwUVZvSArr2.length) {
                        KK6EHiwUVZvS kK6EHiwUVZvS = kK6EHiwUVZvSArr2[length];
                        ej6unYlOWMDF.p59rPv72J9(kK6EHiwUVZvS);
                        arrayList.add(kK6EHiwUVZvS);
                    }
                }
                throw new IOException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Header index too large ", iLaeGQIruHQu81hfJldjMOQSVblH3x));
            }
            if (i5 == 64) {
                KK6EHiwUVZvS[] kK6EHiwUVZvSArr3 = wVqVa59Q8TrUUQ.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpgZfQNn8hdWlEQ5cR94249PDsLR = hAyRQs9oYvmcYalu2DzEE.ZfQNn8hdWlEQ5cR94249PDsLR();
                wVqVa59Q8TrUUQ.VxUQ9tBhpHJ2AAEDNW8sghc4m(oa1wo3soicf8h1n6bgpgZfQNn8hdWlEQ5cR94249PDsLR);
                hAyRQs9oYvmcYalu2DzEE.V57tEvNfxZVVcOCAOih5PKr(new KK6EHiwUVZvS(oa1wo3soicf8h1n6bgpgZfQNn8hdWlEQ5cR94249PDsLR, hAyRQs9oYvmcYalu2DzEE.ZfQNn8hdWlEQ5cR94249PDsLR()));
            } else if ((b & 64) == 64) {
                hAyRQs9oYvmcYalu2DzEE.V57tEvNfxZVVcOCAOih5PKr(new KK6EHiwUVZvS(hAyRQs9oYvmcYalu2DzEE.zzpBGItXfub0yWj(hAyRQs9oYvmcYalu2DzEE.LaeGQIruHQu81hfJldjMOQSVblH3x(i5, 63) - 1), hAyRQs9oYvmcYalu2DzEE.ZfQNn8hdWlEQ5cR94249PDsLR()));
            } else if ((b & 32) == 32) {
                int iLaeGQIruHQu81hfJldjMOQSVblH3x2 = hAyRQs9oYvmcYalu2DzEE.LaeGQIruHQu81hfJldjMOQSVblH3x(i5, 31);
                hAyRQs9oYvmcYalu2DzEE.VxUQ9tBhpHJ2AAEDNW8sghc4m = iLaeGQIruHQu81hfJldjMOQSVblH3x2;
                if (iLaeGQIruHQu81hfJldjMOQSVblH3x2 < 0 || iLaeGQIruHQu81hfJldjMOQSVblH3x2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + hAyRQs9oYvmcYalu2DzEE.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                }
                int i7 = hAyRQs9oYvmcYalu2DzEE.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                if (iLaeGQIruHQu81hfJldjMOQSVblH3x2 < i7) {
                    if (iLaeGQIruHQu81hfJldjMOQSVblH3x2 == 0) {
                        KK6EHiwUVZvS[] kK6EHiwUVZvSArr4 = hAyRQs9oYvmcYalu2DzEE.ZfQNn8hdWlEQ5cR94249PDsLR;
                        vmp19D2MODlOL.BDoqAMf0rlMRAnVghjC4qjG(kK6EHiwUVZvSArr4, null, 0, kK6EHiwUVZvSArr4.length);
                        hAyRQs9oYvmcYalu2DzEE.LaeGQIruHQu81hfJldjMOQSVblH3x = hAyRQs9oYvmcYalu2DzEE.ZfQNn8hdWlEQ5cR94249PDsLR.length - 1;
                        hAyRQs9oYvmcYalu2DzEE.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
                        hAyRQs9oYvmcYalu2DzEE.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
                    } else {
                        hAyRQs9oYvmcYalu2DzEE.VxUQ9tBhpHJ2AAEDNW8sghc4m(i7 - iLaeGQIruHQu81hfJldjMOQSVblH3x2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                KK6EHiwUVZvS[] kK6EHiwUVZvSArr5 = wVqVa59Q8TrUUQ.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpgZfQNn8hdWlEQ5cR94249PDsLR2 = hAyRQs9oYvmcYalu2DzEE.ZfQNn8hdWlEQ5cR94249PDsLR();
                wVqVa59Q8TrUUQ.VxUQ9tBhpHJ2AAEDNW8sghc4m(oa1wo3soicf8h1n6bgpgZfQNn8hdWlEQ5cR94249PDsLR2);
                arrayList.add(new KK6EHiwUVZvS(oa1wo3soicf8h1n6bgpgZfQNn8hdWlEQ5cR94249PDsLR2, hAyRQs9oYvmcYalu2DzEE.ZfQNn8hdWlEQ5cR94249PDsLR()));
            } else {
                arrayList.add(new KK6EHiwUVZvS(hAyRQs9oYvmcYalu2DzEE.zzpBGItXfub0yWj(hAyRQs9oYvmcYalu2DzEE.LaeGQIruHQu81hfJldjMOQSVblH3x(i5, 15) - 1), hAyRQs9oYvmcYalu2DzEE.ZfQNn8hdWlEQ5cR94249PDsLR()));
            }
        }
        List listByTQIhgl7ezGvHXEd = gYXV3FZbh17i6ocMo1T.ByTQIhgl7ezGvHXEd(arrayList);
        arrayList.clear();
        return listByTQIhgl7ezGvHXEd;
    }

    public final void M9e7PWhFYLD2lOGMker(hGzyxEAtPzT hgzyxeatpzt, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i5 = 0;
        boolean z = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.V57tEvNfxZVVcOCAOih5PKr.readByte();
            byte[] bArr = jHlOQHj3hlCsydfI7r5ApVdQjYvKf.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            hy3v1zJcCYok89Y1iAeFhN66 hy3v1zjccyok89y1iaefhn66 = this.V57tEvNfxZVVcOCAOih5PKr;
            hy3v1zjccyok89y1iaefhn66.readInt();
            hy3v1zjccyok89y1iaefhn66.readByte();
            byte[] bArr2 = jHlOQHj3hlCsydfI7r5ApVdQjYvKf.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            i -= 5;
        }
        List listLaeGQIruHQu81hfJldjMOQSVblH3x = LaeGQIruHQu81hfJldjMOQSVblH3x(KfeOQNOupsCg6878zi4e.O1xDAlBZZlZdoEf747lCFHld(i, i2, i4), i4, i2, i3);
        aLVvFTl6cTT alvvftl6ctt = hgzyxeatpzt.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i3 != 0 && (i3 & 1) == 0) {
            MpsgFCfSVNxgvcBlEbc8Iuyh3Obq.zzpBGItXfub0yWj(alvvftl6ctt.HzCpKshMOoaw76hFcbOVRYMeRd, alvvftl6ctt.LaeGQIruHQu81hfJldjMOQSVblH3x + '[' + i3 + "] onHeaders", new cSwIPlfRCNj2NmWBjP4tsYO(alvvftl6ctt, i3, listLaeGQIruHQu81hfJldjMOQSVblH3x, z));
            return;
        }
        synchronized (alvvftl6ctt) {
            AIQ3M1G7NlBb9nFUZAGJvkBOAC aIQ3M1G7NlBb9nFUZAGJvkBOACV57tEvNfxZVVcOCAOih5PKr = alvvftl6ctt.V57tEvNfxZVVcOCAOih5PKr(i3);
            if (aIQ3M1G7NlBb9nFUZAGJvkBOACV57tEvNfxZVVcOCAOih5PKr != null) {
                aIQ3M1G7NlBb9nFUZAGJvkBOACV57tEvNfxZVVcOCAOih5PKr.GI83zq0G8e7zkn(U7JVXX1Kyh43VgUF.zIvmSL0wzmmKGc3X39b2Gw2mUGE(listLaeGQIruHQu81hfJldjMOQSVblH3x), z);
                return;
            }
            if (alvvftl6ctt.NSjgqmGjEzuugn2SsG1mZFP) {
                return;
            }
            if (i3 <= alvvftl6ctt.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                return;
            }
            if (i3 % 2 == alvvftl6ctt.ZLZeBXTMq0zDztBxtRTuCHrapQ % 2) {
                return;
            }
            AIQ3M1G7NlBb9nFUZAGJvkBOAC aIQ3M1G7NlBb9nFUZAGJvkBOAC = new AIQ3M1G7NlBb9nFUZAGJvkBOAC(i3, alvvftl6ctt, false, z, U7JVXX1Kyh43VgUF.zIvmSL0wzmmKGc3X39b2Gw2mUGE(listLaeGQIruHQu81hfJldjMOQSVblH3x));
            alvvftl6ctt.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i3;
            alvvftl6ctt.ZfQNn8hdWlEQ5cR94249PDsLR.put(Integer.valueOf(i3), aIQ3M1G7NlBb9nFUZAGJvkBOAC);
            MpsgFCfSVNxgvcBlEbc8Iuyh3Obq.zzpBGItXfub0yWj(alvvftl6ctt.GI83zq0G8e7zkn.ZfQNn8hdWlEQ5cR94249PDsLR(), alvvftl6ctt.LaeGQIruHQu81hfJldjMOQSVblH3x + '[' + i3 + "] onStream", new nbGMJM8h0wuRlAsv8TH(i5, alvvftl6ctt, aIQ3M1G7NlBb9nFUZAGJvkBOAC));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0117, code lost:
    
        if (r19 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0119, code lost:
    
        r9.GI83zq0G8e7zkn(com.vdodsodjsdt.EUSG2RPrSQzuno7qTyOhv0Az.ZfQNn8hdWlEQ5cR94249PDsLR, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V57tEvNfxZVVcOCAOih5PKr(com.vdodsodjsdt.hGzyxEAtPzT r17, int r18, int r19, final int r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.fwzr2yRMgOq0UE8cQLHe.V57tEvNfxZVVcOCAOih5PKr(com.vdodsodjsdt.hGzyxEAtPzT, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0251, code lost:
    
        throw new java.io.IOException(com.vdodsodjsdt.u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r6));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(boolean r14, com.vdodsodjsdt.hGzyxEAtPzT r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.fwzr2yRMgOq0UE8cQLHe.VxUQ9tBhpHJ2AAEDNW8sghc4m(boolean, com.vdodsodjsdt.hGzyxEAtPzT):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.V57tEvNfxZVVcOCAOih5PKr.close();
    }
}
