package com.vdodsodjsdt;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class oSxBDDVoR8J7pe6iX1zsMApcaW {
    public static final ThreadLocal ZfQNn8hdWlEQ5cR94249PDsLR = new ThreadLocal();
    public volatile int V57tEvNfxZVVcOCAOih5PKr = 0;
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final nMRZPpfLCgJyuB zzpBGItXfub0yWj;

    public oSxBDDVoR8J7pe6iX1zsMApcaW(nMRZPpfLCgJyuB nmrzppflcgjyub, int i) {
        this.zzpBGItXfub0yWj = nmrzppflcgjyub;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
    }

    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) {
        plKpuT2Rxr1dLc54nNo2wqG4RbP plkput2rxr1dlc54nno2wqg4rbpZzpBGItXfub0yWj = zzpBGItXfub0yWj();
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = plkput2rxr1dlc54nno2wqg4rbpZzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m(16);
        if (iVxUQ9tBhpHJ2AAEDNW8sghc4m == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) plkput2rxr1dlc54nno2wqg4rbpZzpBGItXfub0yWj.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        int i2 = iVxUQ9tBhpHJ2AAEDNW8sghc4m + plkput2rxr1dlc54nno2wqg4rbpZzpBGItXfub0yWj.V57tEvNfxZVVcOCAOih5PKr;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        plKpuT2Rxr1dLc54nNo2wqG4RbP plkput2rxr1dlc54nno2wqg4rbpZzpBGItXfub0yWj = zzpBGItXfub0yWj();
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = plkput2rxr1dlc54nno2wqg4rbpZzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m(4);
        sb.append(Integer.toHexString(iVxUQ9tBhpHJ2AAEDNW8sghc4m != 0 ? ((ByteBuffer) plkput2rxr1dlc54nno2wqg4rbpZzpBGItXfub0yWj.zIvmSL0wzmmKGc3X39b2Gw2mUGE).getInt(iVxUQ9tBhpHJ2AAEDNW8sghc4m + plkput2rxr1dlc54nno2wqg4rbpZzpBGItXfub0yWj.V57tEvNfxZVVcOCAOih5PKr) : 0));
        sb.append(", codepoints:");
        plKpuT2Rxr1dLc54nNo2wqG4RbP plkput2rxr1dlc54nno2wqg4rbpZzpBGItXfub0yWj2 = zzpBGItXfub0yWj();
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m2 = plkput2rxr1dlc54nno2wqg4rbpZzpBGItXfub0yWj2.VxUQ9tBhpHJ2AAEDNW8sghc4m(16);
        if (iVxUQ9tBhpHJ2AAEDNW8sghc4m2 != 0) {
            int i2 = iVxUQ9tBhpHJ2AAEDNW8sghc4m2 + plkput2rxr1dlc54nno2wqg4rbpZzpBGItXfub0yWj2.V57tEvNfxZVVcOCAOih5PKr;
            i = ((ByteBuffer) plkput2rxr1dlc54nno2wqg4rbpZzpBGItXfub0yWj2.zIvmSL0wzmmKGc3X39b2Gw2mUGE).getInt(((ByteBuffer) plkput2rxr1dlc54nno2wqg4rbpZzpBGItXfub0yWj2.zIvmSL0wzmmKGc3X39b2Gw2mUGE).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(VxUQ9tBhpHJ2AAEDNW8sghc4m(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }

    public final plKpuT2Rxr1dLc54nNo2wqG4RbP zzpBGItXfub0yWj() {
        ThreadLocal threadLocal = ZfQNn8hdWlEQ5cR94249PDsLR;
        plKpuT2Rxr1dLc54nNo2wqG4RbP plkput2rxr1dlc54nno2wqg4rbp = (plKpuT2Rxr1dLc54nNo2wqG4RbP) threadLocal.get();
        if (plkput2rxr1dlc54nno2wqg4rbp == null) {
            plkput2rxr1dlc54nno2wqg4rbp = new plKpuT2Rxr1dLc54nNo2wqG4RbP();
            threadLocal.set(plkput2rxr1dlc54nno2wqg4rbp);
        }
        pt4pjl1pNXdDyK812k pt4pjl1pnxddyk812k = (pt4pjl1pNXdDyK812k) this.zzpBGItXfub0yWj.V57tEvNfxZVVcOCAOih5PKr;
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = pt4pjl1pnxddyk812k.VxUQ9tBhpHJ2AAEDNW8sghc4m(6);
        if (iVxUQ9tBhpHJ2AAEDNW8sghc4m != 0) {
            int i = iVxUQ9tBhpHJ2AAEDNW8sghc4m + pt4pjl1pnxddyk812k.V57tEvNfxZVVcOCAOih5PKr;
            int i2 = (this.VxUQ9tBhpHJ2AAEDNW8sghc4m * 4) + ((ByteBuffer) pt4pjl1pnxddyk812k.zIvmSL0wzmmKGc3X39b2Gw2mUGE).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) pt4pjl1pnxddyk812k.zIvmSL0wzmmKGc3X39b2Gw2mUGE).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) pt4pjl1pnxddyk812k.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            plkput2rxr1dlc54nno2wqg4rbp.zIvmSL0wzmmKGc3X39b2Gw2mUGE = byteBuffer;
            if (byteBuffer != null) {
                plkput2rxr1dlc54nno2wqg4rbp.V57tEvNfxZVVcOCAOih5PKr = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                plkput2rxr1dlc54nno2wqg4rbp.ZfQNn8hdWlEQ5cR94249PDsLR = i4;
                plkput2rxr1dlc54nno2wqg4rbp.LaeGQIruHQu81hfJldjMOQSVblH3x = ((ByteBuffer) plkput2rxr1dlc54nno2wqg4rbp.zIvmSL0wzmmKGc3X39b2Gw2mUGE).getShort(i4);
                return plkput2rxr1dlc54nno2wqg4rbp;
            }
            plkput2rxr1dlc54nno2wqg4rbp.V57tEvNfxZVVcOCAOih5PKr = 0;
            plkput2rxr1dlc54nno2wqg4rbp.ZfQNn8hdWlEQ5cR94249PDsLR = 0;
            plkput2rxr1dlc54nno2wqg4rbp.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
        }
        return plkput2rxr1dlc54nno2wqg4rbp;
    }
}
