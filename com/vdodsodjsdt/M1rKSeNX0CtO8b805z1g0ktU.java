package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class M1rKSeNX0CtO8b805z1g0ktU extends caFA212npwWVdtc2e6z {
    public int GI83zq0G8e7zkn = Integer.MAX_VALUE;
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int NSjgqmGjEzuugn2SsG1mZFP;
    public final byte[] V57tEvNfxZVVcOCAOih5PKr;
    public final int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public M1rKSeNX0CtO8b805z1g0ktU(byte[] bArr, int i, int i2, boolean z) {
        this.V57tEvNfxZVVcOCAOih5PKr = bArr;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i2 + i;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i;
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final int Ca81ebIan1u() {
        return RhfGHxtXxy0M0grmp2jkRjQg();
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final int GI83zq0G8e7zkn() {
        return SuB3hEmTmbbRGAhtvOOmfKEon();
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final long HzCpKshMOoaw76hFcbOVRYMeRd() {
        return qNPQb1obP7();
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final long Irh5auREsoeV1C1RaBamlmy() {
        return pzqP2AqKW6J5PO8zCKnW();
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final float KUYypEB4eNWOZWVDpH() {
        return Float.intBitsToFloat(RhfGHxtXxy0M0grmp2jkRjQg());
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x(int i) {
        if (i < 0) {
            throw tabhAwpQKyJhu24Q.ZfQNn8hdWlEQ5cR94249PDsLR();
        }
        int iZzpBGItXfub0yWj = zzpBGItXfub0yWj() + i;
        if (iZzpBGItXfub0yWj < 0) {
            throw new tabhAwpQKyJhu24Q("Failed to parse the message.");
        }
        int i2 = this.GI83zq0G8e7zkn;
        if (iZzpBGItXfub0yWj > i2) {
            throw tabhAwpQKyJhu24Q.LaeGQIruHQu81hfJldjMOQSVblH3x();
        }
        this.GI83zq0G8e7zkn = iZzpBGItXfub0yWj;
        vE4yDIjexsP2lGjLaTcB();
        return i2;
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final int M9e7PWhFYLD2lOGMker() {
        return RhfGHxtXxy0M0grmp2jkRjQg();
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final double NSjgqmGjEzuugn2SsG1mZFP() {
        return Double.longBitsToDouble(qNPQb1obP7());
    }

    public final void O1xDAlBZZlZdoEf747lCFHld(int i) throws tabhAwpQKyJhu24Q {
        if (i >= 0) {
            int i2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            int i3 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (i <= i2 - i3) {
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw tabhAwpQKyJhu24Q.LaeGQIruHQu81hfJldjMOQSVblH3x();
        }
        throw tabhAwpQKyJhu24Q.ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    public final int RhfGHxtXxy0M0grmp2jkRjQg() throws tabhAwpQKyJhu24Q {
        int i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR - i < 4) {
            throw tabhAwpQKyJhu24Q.LaeGQIruHQu81hfJldjMOQSVblH3x();
        }
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i + 4;
        byte[] bArr = this.V57tEvNfxZVVcOCAOih5PKr;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final int SuB3hEmTmbbRGAhtvOOmfKEon() {
        int i;
        int i2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        int i3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.V57tEvNfxZVVcOCAOih5PKr;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i5;
                return i;
            }
        }
        return (int) aXO0LSrt8bKV();
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final int TaDO7ogis3aEiWEtq() {
        return SuB3hEmTmbbRGAhtvOOmfKEon();
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final boolean V57tEvNfxZVVcOCAOih5PKr() {
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE == this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) throws tabhAwpQKyJhu24Q {
        if (this.NSjgqmGjEzuugn2SsG1mZFP != i) {
            throw new tabhAwpQKyJhu24Q("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.vdodsodjsdt.uDRHTE5hsm7JpGOnK7F ZLZeBXTMq0zDztBxtRTuCHrapQ() throws com.vdodsodjsdt.tabhAwpQKyJhu24Q {
        /*
            r4 = this;
            int r0 = r4.SuB3hEmTmbbRGAhtvOOmfKEon()
            byte[] r1 = r4.V57tEvNfxZVVcOCAOih5PKr
            if (r0 <= 0) goto L19
            int r2 = r4.ZfQNn8hdWlEQ5cR94249PDsLR
            int r3 = r4.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            com.vdodsodjsdt.uDRHTE5hsm7JpGOnK7F r1 = com.vdodsodjsdt.uDRHTE5hsm7JpGOnK7F.V57tEvNfxZVVcOCAOih5PKr(r1, r3, r0)
            int r2 = r4.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            int r2 = r2 + r0
            r4.zIvmSL0wzmmKGc3X39b2Gw2mUGE = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            com.vdodsodjsdt.uDRHTE5hsm7JpGOnK7F r0 = com.vdodsodjsdt.uDRHTE5hsm7JpGOnK7F.LaeGQIruHQu81hfJldjMOQSVblH3x
            return r0
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.ZfQNn8hdWlEQ5cR94249PDsLR
            int r3 = r4.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.zIvmSL0wzmmKGc3X39b2Gw2mUGE = r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r0 = com.vdodsodjsdt.iJsJOOjKyWEygkebu5yh4.zzpBGItXfub0yWj
        L35:
            com.vdodsodjsdt.uDRHTE5hsm7JpGOnK7F r1 = com.vdodsodjsdt.uDRHTE5hsm7JpGOnK7F.LaeGQIruHQu81hfJldjMOQSVblH3x
            com.vdodsodjsdt.uDRHTE5hsm7JpGOnK7F r1 = new com.vdodsodjsdt.uDRHTE5hsm7JpGOnK7F
            r1.<init>(r0)
            return r1
        L3d:
            com.vdodsodjsdt.tabhAwpQKyJhu24Q r0 = com.vdodsodjsdt.tabhAwpQKyJhu24Q.ZfQNn8hdWlEQ5cR94249PDsLR()
            throw r0
        L42:
            com.vdodsodjsdt.tabhAwpQKyJhu24Q r0 = com.vdodsodjsdt.tabhAwpQKyJhu24Q.LaeGQIruHQu81hfJldjMOQSVblH3x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.M1rKSeNX0CtO8b805z1g0ktU.ZLZeBXTMq0zDztBxtRTuCHrapQ():com.vdodsodjsdt.uDRHTE5hsm7JpGOnK7F");
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(int i) {
        this.GI83zq0G8e7zkn = i;
        vE4yDIjexsP2lGjLaTcB();
    }

    public final long aXO0LSrt8bKV() throws tabhAwpQKyJhu24Q {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (i2 == this.ZfQNn8hdWlEQ5cR94249PDsLR) {
                throw tabhAwpQKyJhu24Q.LaeGQIruHQu81hfJldjMOQSVblH3x();
            }
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i2 + 1;
            byte b = this.V57tEvNfxZVVcOCAOih5PKr[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw tabhAwpQKyJhu24Q.V57tEvNfxZVVcOCAOih5PKr();
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final String f6ZQsR6bPLvvCDNXOUc() throws tabhAwpQKyJhu24Q {
        int iSuB3hEmTmbbRGAhtvOOmfKEon = SuB3hEmTmbbRGAhtvOOmfKEon();
        if (iSuB3hEmTmbbRGAhtvOOmfKEon > 0) {
            int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            int i2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (iSuB3hEmTmbbRGAhtvOOmfKEon <= i - i2) {
                String strQ1wNbhk2O6 = eFgoNcoFBGOQHfSJanp.VxUQ9tBhpHJ2AAEDNW8sghc4m.q1wNbhk2O6(this.V57tEvNfxZVVcOCAOih5PKr, i2, iSuB3hEmTmbbRGAhtvOOmfKEon);
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE += iSuB3hEmTmbbRGAhtvOOmfKEon;
                return strQ1wNbhk2O6;
            }
        }
        if (iSuB3hEmTmbbRGAhtvOOmfKEon == 0) {
            return "";
        }
        if (iSuB3hEmTmbbRGAhtvOOmfKEon <= 0) {
            throw tabhAwpQKyJhu24Q.ZfQNn8hdWlEQ5cR94249PDsLR();
        }
        throw tabhAwpQKyJhu24Q.LaeGQIruHQu81hfJldjMOQSVblH3x();
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final long h3jnZRsdwYJfY9UhQCkbvWciwvFHv() {
        return qNPQb1obP7();
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final String jW7EiD0YL6xkbB158jMUzhWNWb1y() throws tabhAwpQKyJhu24Q {
        int iSuB3hEmTmbbRGAhtvOOmfKEon = SuB3hEmTmbbRGAhtvOOmfKEon();
        if (iSuB3hEmTmbbRGAhtvOOmfKEon > 0) {
            int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            int i2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (iSuB3hEmTmbbRGAhtvOOmfKEon <= i - i2) {
                String str = new String(this.V57tEvNfxZVVcOCAOih5PKr, i2, iSuB3hEmTmbbRGAhtvOOmfKEon, iJsJOOjKyWEygkebu5yh4.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE += iSuB3hEmTmbbRGAhtvOOmfKEon;
                return str;
            }
        }
        if (iSuB3hEmTmbbRGAhtvOOmfKEon == 0) {
            return "";
        }
        if (iSuB3hEmTmbbRGAhtvOOmfKEon < 0) {
            throw tabhAwpQKyJhu24Q.ZfQNn8hdWlEQ5cR94249PDsLR();
        }
        throw tabhAwpQKyJhu24Q.LaeGQIruHQu81hfJldjMOQSVblH3x();
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final long ko09zE6UAgwkV() {
        long jPzqP2AqKW6J5PO8zCKnW = pzqP2AqKW6J5PO8zCKnW();
        return (-(jPzqP2AqKW6J5PO8zCKnW & 1)) ^ (jPzqP2AqKW6J5PO8zCKnW >>> 1);
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final long p59rPv72J9() {
        return pzqP2AqKW6J5PO8zCKnW();
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final int pYmKDYlAmhudp() {
        int iSuB3hEmTmbbRGAhtvOOmfKEon = SuB3hEmTmbbRGAhtvOOmfKEon();
        return (-(iSuB3hEmTmbbRGAhtvOOmfKEon & 1)) ^ (iSuB3hEmTmbbRGAhtvOOmfKEon >>> 1);
    }

    public final long pzqP2AqKW6J5PO8zCKnW() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        int i2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.V57tEvNfxZVVcOCAOih5PKr;
            byte b = bArr[i];
            if (b >= 0) {
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i4;
                return j;
            }
        }
        return aXO0LSrt8bKV();
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final boolean q11o1hieEkZDhF1MGOZI26oZiDT(int i) throws tabhAwpQKyJhu24Q {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                O1xDAlBZZlZdoEf747lCFHld(8);
                return true;
            }
            if (i2 == 2) {
                O1xDAlBZZlZdoEf747lCFHld(SuB3hEmTmbbRGAhtvOOmfKEon());
                return true;
            }
            if (i2 == 3) {
                w0Wu95l8dVNw5rZMRu();
                VxUQ9tBhpHJ2AAEDNW8sghc4m(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw tabhAwpQKyJhu24Q.zzpBGItXfub0yWj();
            }
            O1xDAlBZZlZdoEf747lCFHld(4);
            return true;
        }
        int i4 = this.ZfQNn8hdWlEQ5cR94249PDsLR - this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        byte[] bArr = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw tabhAwpQKyJhu24Q.V57tEvNfxZVVcOCAOih5PKr();
        }
        while (i3 < 10) {
            int i6 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (i6 == this.ZfQNn8hdWlEQ5cR94249PDsLR) {
                throw tabhAwpQKyJhu24Q.LaeGQIruHQu81hfJldjMOQSVblH3x();
            }
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw tabhAwpQKyJhu24Q.V57tEvNfxZVVcOCAOih5PKr();
        return true;
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final int q1wNbhk2O6() {
        return SuB3hEmTmbbRGAhtvOOmfKEon();
    }

    public final long qNPQb1obP7() throws tabhAwpQKyJhu24Q {
        int i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR - i < 8) {
            throw tabhAwpQKyJhu24Q.LaeGQIruHQu81hfJldjMOQSVblH3x();
        }
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i + 8;
        byte[] bArr = this.V57tEvNfxZVVcOCAOih5PKr;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final int vBGA6pPLqSMuYGvprl270j7() throws tabhAwpQKyJhu24Q {
        if (V57tEvNfxZVVcOCAOih5PKr()) {
            this.NSjgqmGjEzuugn2SsG1mZFP = 0;
            return 0;
        }
        int iSuB3hEmTmbbRGAhtvOOmfKEon = SuB3hEmTmbbRGAhtvOOmfKEon();
        this.NSjgqmGjEzuugn2SsG1mZFP = iSuB3hEmTmbbRGAhtvOOmfKEon;
        if ((iSuB3hEmTmbbRGAhtvOOmfKEon >>> 3) != 0) {
            return iSuB3hEmTmbbRGAhtvOOmfKEon;
        }
        throw new tabhAwpQKyJhu24Q("Protocol message contained an invalid tag (zero).");
    }

    public final void vE4yDIjexsP2lGjLaTcB() {
        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR + this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        int i2 = i - this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int i3 = this.GI83zq0G8e7zkn;
        if (i2 <= i3) {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
            return;
        }
        int i4 = i2 - i3;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i4;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i - i4;
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        return pzqP2AqKW6J5PO8zCKnW() != 0;
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final int zzpBGItXfub0yWj() {
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE - this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
    }
}
