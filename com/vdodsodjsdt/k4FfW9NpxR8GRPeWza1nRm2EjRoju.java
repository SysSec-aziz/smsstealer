package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class k4FfW9NpxR8GRPeWza1nRm2EjRoju extends uDRHTE5hsm7JpGOnK7F {
    public final int NSjgqmGjEzuugn2SsG1mZFP;
    public final int ZLZeBXTMq0zDztBxtRTuCHrapQ;

    public k4FfW9NpxR8GRPeWza1nRm2EjRoju(byte[] bArr, int i, int i2) {
        super(bArr);
        uDRHTE5hsm7JpGOnK7F.zzpBGItXfub0yWj(i, i + i2, bArr.length);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i;
        this.NSjgqmGjEzuugn2SsG1mZFP = i2;
    }

    @Override // com.vdodsodjsdt.uDRHTE5hsm7JpGOnK7F
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x() {
        return this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    @Override // com.vdodsodjsdt.uDRHTE5hsm7JpGOnK7F
    public final byte VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) {
        int i2 = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.ZfQNn8hdWlEQ5cR94249PDsLR[this.ZLZeBXTMq0zDztBxtRTuCHrapQ + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i, i2, "Index > length: ", ", "));
    }

    @Override // com.vdodsodjsdt.uDRHTE5hsm7JpGOnK7F
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(int i, byte[] bArr) {
        System.arraycopy(this.ZfQNn8hdWlEQ5cR94249PDsLR, this.ZLZeBXTMq0zDztBxtRTuCHrapQ, bArr, 0, i);
    }

    @Override // com.vdodsodjsdt.uDRHTE5hsm7JpGOnK7F
    public final int size() {
        return this.NSjgqmGjEzuugn2SsG1mZFP;
    }

    @Override // com.vdodsodjsdt.uDRHTE5hsm7JpGOnK7F
    public final byte zIvmSL0wzmmKGc3X39b2Gw2mUGE(int i) {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR[this.ZLZeBXTMq0zDztBxtRTuCHrapQ + i];
    }
}
