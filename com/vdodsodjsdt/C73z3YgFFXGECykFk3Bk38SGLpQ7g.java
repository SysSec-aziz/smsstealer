package com.vdodsodjsdt;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class C73z3YgFFXGECykFk3Bk38SGLpQ7g extends ALJgALwYYFtLBM6dfUwef implements RandomAccess {
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final ALJgALwYYFtLBM6dfUwef V57tEvNfxZVVcOCAOih5PKr;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;

    public C73z3YgFFXGECykFk3Bk38SGLpQ7g(ALJgALwYYFtLBM6dfUwef aLJgALwYYFtLBM6dfUwef, int i, int i2) {
        this.V57tEvNfxZVVcOCAOih5PKr = aLJgALwYYFtLBM6dfUwef;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        sGipz63rTUmSj3uFDvOtzihao.M9e7PWhFYLD2lOGMker(i, i2, aLJgALwYYFtLBM6dfUwef.VxUQ9tBhpHJ2AAEDNW8sghc4m());
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i2 - i;
    }

    @Override // com.vdodsodjsdt.I7XxpUEW0N
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i, i2, "index: ", ", size: "));
        }
        return this.V57tEvNfxZVVcOCAOih5PKr.get(this.ZfQNn8hdWlEQ5cR94249PDsLR + i);
    }

    @Override // com.vdodsodjsdt.ALJgALwYYFtLBM6dfUwef, java.util.List
    public final List subList(int i, int i2) {
        sGipz63rTUmSj3uFDvOtzihao.M9e7PWhFYLD2lOGMker(i, i2, this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        int i3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        return new C73z3YgFFXGECykFk3Bk38SGLpQ7g(this.V57tEvNfxZVVcOCAOih5PKr, i + i3, i3 + i2);
    }
}
