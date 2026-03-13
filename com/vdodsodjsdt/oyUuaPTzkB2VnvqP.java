package com.vdodsodjsdt;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class oyUuaPTzkB2VnvqP extends caFA212npwWVdtc2e6z {
    public int GI83zq0G8e7zkn;
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int M9e7PWhFYLD2lOGMker = Integer.MAX_VALUE;
    public int NSjgqmGjEzuugn2SsG1mZFP;
    public final FileInputStream V57tEvNfxZVVcOCAOih5PKr;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final byte[] ZfQNn8hdWlEQ5cR94249PDsLR;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public oyUuaPTzkB2VnvqP(FileInputStream fileInputStream) {
        Charset charset = iJsJOOjKyWEygkebu5yh4.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        this.V57tEvNfxZVVcOCAOih5PKr = fileInputStream;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new byte[4096];
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
        this.GI83zq0G8e7zkn = 0;
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final int Ca81ebIan1u() {
        return pzqP2AqKW6J5PO8zCKnW();
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final int GI83zq0G8e7zkn() {
        return vE4yDIjexsP2lGjLaTcB();
    }

    public final long HVEwbdULInpTNa0IG() throws tabhAwpQKyJhu24Q {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ == this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                qygqjTppWwx992(1);
            }
            int i2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i2 + 1;
            byte b = this.ZfQNn8hdWlEQ5cR94249PDsLR[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw tabhAwpQKyJhu24Q.V57tEvNfxZVVcOCAOih5PKr();
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final long HzCpKshMOoaw76hFcbOVRYMeRd() {
        return aXO0LSrt8bKV();
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final long Irh5auREsoeV1C1RaBamlmy() {
        return O1xDAlBZZlZdoEf747lCFHld();
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final float KUYypEB4eNWOZWVDpH() {
        return Float.intBitsToFloat(pzqP2AqKW6J5PO8zCKnW());
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x(int i) throws tabhAwpQKyJhu24Q {
        if (i < 0) {
            throw tabhAwpQKyJhu24Q.ZfQNn8hdWlEQ5cR94249PDsLR();
        }
        int i2 = this.GI83zq0G8e7zkn + this.ZLZeBXTMq0zDztBxtRTuCHrapQ + i;
        if (i2 < 0) {
            throw new tabhAwpQKyJhu24Q("Failed to parse the message.");
        }
        int i3 = this.M9e7PWhFYLD2lOGMker;
        if (i2 > i3) {
            throw tabhAwpQKyJhu24Q.LaeGQIruHQu81hfJldjMOQSVblH3x();
        }
        this.M9e7PWhFYLD2lOGMker = i2;
        y1NaPKTl7R18DOr6e8i5();
        return i3;
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final int M9e7PWhFYLD2lOGMker() {
        return pzqP2AqKW6J5PO8zCKnW();
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final double NSjgqmGjEzuugn2SsG1mZFP() {
        return Double.longBitsToDouble(aXO0LSrt8bKV());
    }

    public final long O1xDAlBZZlZdoEf747lCFHld() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            byte b = bArr[i];
            if (b >= 0) {
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i3;
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
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i4;
                return j;
            }
        }
        return HVEwbdULInpTNa0IG();
    }

    public final byte[] RhfGHxtXxy0M0grmp2jkRjQg(int i) throws IOException {
        byte[] bArrQNPQb1obP7 = qNPQb1obP7(i);
        if (bArrQNPQb1obP7 != null) {
            return bArrQNPQb1obP7;
        }
        int i2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int i3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int length = i3 - i2;
        this.GI83zq0G8e7zkn += i3;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
        ArrayList arrayListSuB3hEmTmbbRGAhtvOOmfKEon = SuB3hEmTmbbRGAhtvOOmfKEon(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.ZfQNn8hdWlEQ5cR94249PDsLR, i2, bArr, 0, length);
        int size = arrayListSuB3hEmTmbbRGAhtvOOmfKEon.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListSuB3hEmTmbbRGAhtvOOmfKEon.get(i4);
            i4++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final ArrayList SuB3hEmTmbbRGAhtvOOmfKEon(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.V57tEvNfxZVVcOCAOih5PKr.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw tabhAwpQKyJhu24Q.LaeGQIruHQu81hfJldjMOQSVblH3x();
                }
                this.GI83zq0G8e7zkn += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final int TaDO7ogis3aEiWEtq() {
        return vE4yDIjexsP2lGjLaTcB();
    }

    public final boolean TqcnImqkSWIKht(int i) throws IOException {
        FileInputStream fileInputStream = this.V57tEvNfxZVVcOCAOih5PKr;
        int i2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int i3 = i2 + i;
        int i4 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i3 <= i4) {
            throw new IllegalStateException(u9SlVAuoWhQUfJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.GI83zq0G8e7zkn;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.M9e7PWhFYLD2lOGMker) {
            byte[] bArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.GI83zq0G8e7zkn += i2;
                this.LaeGQIruHQu81hfJldjMOQSVblH3x -= i2;
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
            }
            int i6 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            try {
                int i7 = fileInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.GI83zq0G8e7zkn) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.LaeGQIruHQu81hfJldjMOQSVblH3x += i7;
                    y1NaPKTl7R18DOr6e8i5();
                    if (this.LaeGQIruHQu81hfJldjMOQSVblH3x >= i) {
                        return true;
                    }
                    return TqcnImqkSWIKht(i);
                }
            } catch (tabhAwpQKyJhu24Q e) {
                e.V57tEvNfxZVVcOCAOih5PKr = true;
                throw e;
            }
        }
        return false;
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final boolean V57tEvNfxZVVcOCAOih5PKr() {
        return this.ZLZeBXTMq0zDztBxtRTuCHrapQ == this.LaeGQIruHQu81hfJldjMOQSVblH3x && !TqcnImqkSWIKht(1);
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) throws tabhAwpQKyJhu24Q {
        if (this.NSjgqmGjEzuugn2SsG1mZFP != i) {
            throw new tabhAwpQKyJhu24Q("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final uDRHTE5hsm7JpGOnK7F ZLZeBXTMq0zDztBxtRTuCHrapQ() throws IOException {
        int iVE4yDIjexsP2lGjLaTcB = vE4yDIjexsP2lGjLaTcB();
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int i2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int i3 = i - i2;
        byte[] bArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (iVE4yDIjexsP2lGjLaTcB <= i3 && iVE4yDIjexsP2lGjLaTcB > 0) {
            uDRHTE5hsm7JpGOnK7F udrhte5hsm7jpgonk7fV57tEvNfxZVVcOCAOih5PKr = uDRHTE5hsm7JpGOnK7F.V57tEvNfxZVVcOCAOih5PKr(bArr, i2, iVE4yDIjexsP2lGjLaTcB);
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ += iVE4yDIjexsP2lGjLaTcB;
            return udrhte5hsm7jpgonk7fV57tEvNfxZVVcOCAOih5PKr;
        }
        if (iVE4yDIjexsP2lGjLaTcB == 0) {
            return uDRHTE5hsm7JpGOnK7F.LaeGQIruHQu81hfJldjMOQSVblH3x;
        }
        if (iVE4yDIjexsP2lGjLaTcB < 0) {
            throw tabhAwpQKyJhu24Q.ZfQNn8hdWlEQ5cR94249PDsLR();
        }
        byte[] bArrQNPQb1obP7 = qNPQb1obP7(iVE4yDIjexsP2lGjLaTcB);
        if (bArrQNPQb1obP7 != null) {
            return uDRHTE5hsm7JpGOnK7F.V57tEvNfxZVVcOCAOih5PKr(bArrQNPQb1obP7, 0, bArrQNPQb1obP7.length);
        }
        int i4 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int i5 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int length = i5 - i4;
        this.GI83zq0G8e7zkn += i5;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
        ArrayList arrayListSuB3hEmTmbbRGAhtvOOmfKEon = SuB3hEmTmbbRGAhtvOOmfKEon(iVE4yDIjexsP2lGjLaTcB - length);
        byte[] bArr2 = new byte[iVE4yDIjexsP2lGjLaTcB];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        int size = arrayListSuB3hEmTmbbRGAhtvOOmfKEon.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListSuB3hEmTmbbRGAhtvOOmfKEon.get(i6);
            i6++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        uDRHTE5hsm7JpGOnK7F udrhte5hsm7jpgonk7f = uDRHTE5hsm7JpGOnK7F.LaeGQIruHQu81hfJldjMOQSVblH3x;
        return new uDRHTE5hsm7JpGOnK7F(bArr2);
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(int i) {
        this.M9e7PWhFYLD2lOGMker = i;
        y1NaPKTl7R18DOr6e8i5();
    }

    public final long aXO0LSrt8bKV() throws tabhAwpQKyJhu24Q {
        int i = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x - i < 8) {
            qygqjTppWwx992(8);
            i = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        }
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i + 8;
        byte[] bArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final String f6ZQsR6bPLvvCDNXOUc() throws IOException {
        int iVE4yDIjexsP2lGjLaTcB = vE4yDIjexsP2lGjLaTcB();
        int i = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int i3 = i2 - i;
        byte[] bArrRhfGHxtXxy0M0grmp2jkRjQg = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (iVE4yDIjexsP2lGjLaTcB <= i3 && iVE4yDIjexsP2lGjLaTcB > 0) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i + iVE4yDIjexsP2lGjLaTcB;
        } else {
            if (iVE4yDIjexsP2lGjLaTcB == 0) {
                return "";
            }
            if (iVE4yDIjexsP2lGjLaTcB < 0) {
                throw tabhAwpQKyJhu24Q.ZfQNn8hdWlEQ5cR94249PDsLR();
            }
            i = 0;
            if (iVE4yDIjexsP2lGjLaTcB <= i2) {
                qygqjTppWwx992(iVE4yDIjexsP2lGjLaTcB);
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = iVE4yDIjexsP2lGjLaTcB;
            } else {
                bArrRhfGHxtXxy0M0grmp2jkRjQg = RhfGHxtXxy0M0grmp2jkRjQg(iVE4yDIjexsP2lGjLaTcB);
            }
        }
        return eFgoNcoFBGOQHfSJanp.VxUQ9tBhpHJ2AAEDNW8sghc4m.q1wNbhk2O6(bArrRhfGHxtXxy0M0grmp2jkRjQg, i, iVE4yDIjexsP2lGjLaTcB);
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final long h3jnZRsdwYJfY9UhQCkbvWciwvFHv() {
        return aXO0LSrt8bKV();
    }

    public final void iKANjmyTSxO6v6UuLPdu7DxOjlS(int i) throws tabhAwpQKyJhu24Q {
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int i3 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i < 0) {
            throw tabhAwpQKyJhu24Q.ZfQNn8hdWlEQ5cR94249PDsLR();
        }
        int i5 = this.GI83zq0G8e7zkn;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.M9e7PWhFYLD2lOGMker;
        if (i7 > i8) {
            iKANjmyTSxO6v6UuLPdu7DxOjlS((i8 - i5) - i3);
            throw tabhAwpQKyJhu24Q.LaeGQIruHQu81hfJldjMOQSVblH3x();
        }
        this.GI83zq0G8e7zkn = i6;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = fileInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (tabhAwpQKyJhu24Q e) {
                    e.V57tEvNfxZVVcOCAOih5PKr = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.GI83zq0G8e7zkn += i4;
                y1NaPKTl7R18DOr6e8i5();
                throw th;
            }
        }
        this.GI83zq0G8e7zkn += i4;
        y1NaPKTl7R18DOr6e8i5();
        if (i4 >= i) {
            return;
        }
        int i9 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int i10 = i9 - this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i9;
        qygqjTppWwx992(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (i11 <= i12) {
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i11;
                return;
            } else {
                i10 += i12;
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i12;
                qygqjTppWwx992(1);
            }
        }
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final String jW7EiD0YL6xkbB158jMUzhWNWb1y() throws tabhAwpQKyJhu24Q {
        int iVE4yDIjexsP2lGjLaTcB = vE4yDIjexsP2lGjLaTcB();
        byte[] bArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (iVE4yDIjexsP2lGjLaTcB > 0) {
            int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            int i2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            if (iVE4yDIjexsP2lGjLaTcB <= i - i2) {
                String str = new String(bArr, i2, iVE4yDIjexsP2lGjLaTcB, iJsJOOjKyWEygkebu5yh4.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ += iVE4yDIjexsP2lGjLaTcB;
                return str;
            }
        }
        if (iVE4yDIjexsP2lGjLaTcB == 0) {
            return "";
        }
        if (iVE4yDIjexsP2lGjLaTcB < 0) {
            throw tabhAwpQKyJhu24Q.ZfQNn8hdWlEQ5cR94249PDsLR();
        }
        if (iVE4yDIjexsP2lGjLaTcB > this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return new String(RhfGHxtXxy0M0grmp2jkRjQg(iVE4yDIjexsP2lGjLaTcB), iJsJOOjKyWEygkebu5yh4.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
        qygqjTppWwx992(iVE4yDIjexsP2lGjLaTcB);
        String str2 = new String(bArr, this.ZLZeBXTMq0zDztBxtRTuCHrapQ, iVE4yDIjexsP2lGjLaTcB, iJsJOOjKyWEygkebu5yh4.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ += iVE4yDIjexsP2lGjLaTcB;
        return str2;
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final long ko09zE6UAgwkV() {
        long jO1xDAlBZZlZdoEf747lCFHld = O1xDAlBZZlZdoEf747lCFHld();
        return (-(jO1xDAlBZZlZdoEf747lCFHld & 1)) ^ (jO1xDAlBZZlZdoEf747lCFHld >>> 1);
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final long p59rPv72J9() {
        return O1xDAlBZZlZdoEf747lCFHld();
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final int pYmKDYlAmhudp() {
        int iVE4yDIjexsP2lGjLaTcB = vE4yDIjexsP2lGjLaTcB();
        return (-(iVE4yDIjexsP2lGjLaTcB & 1)) ^ (iVE4yDIjexsP2lGjLaTcB >>> 1);
    }

    public final int pzqP2AqKW6J5PO8zCKnW() throws tabhAwpQKyJhu24Q {
        int i = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x - i < 4) {
            qygqjTppWwx992(4);
            i = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        }
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i + 4;
        byte[] bArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final boolean q11o1hieEkZDhF1MGOZI26oZiDT(int i) throws tabhAwpQKyJhu24Q {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                iKANjmyTSxO6v6UuLPdu7DxOjlS(8);
                return true;
            }
            if (i2 == 2) {
                iKANjmyTSxO6v6UuLPdu7DxOjlS(vE4yDIjexsP2lGjLaTcB());
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
            iKANjmyTSxO6v6UuLPdu7DxOjlS(4);
            return true;
        }
        int i4 = this.LaeGQIruHQu81hfJldjMOQSVblH3x - this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        byte[] bArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw tabhAwpQKyJhu24Q.V57tEvNfxZVVcOCAOih5PKr();
        }
        while (i3 < 10) {
            if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ == this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                qygqjTppWwx992(1);
            }
            int i6 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw tabhAwpQKyJhu24Q.V57tEvNfxZVVcOCAOih5PKr();
        return true;
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final int q1wNbhk2O6() {
        return vE4yDIjexsP2lGjLaTcB();
    }

    public final byte[] qNPQb1obP7(int i) throws IOException {
        if (i == 0) {
            return iJsJOOjKyWEygkebu5yh4.zzpBGItXfub0yWj;
        }
        if (i < 0) {
            throw tabhAwpQKyJhu24Q.ZfQNn8hdWlEQ5cR94249PDsLR();
        }
        int i2 = this.GI83zq0G8e7zkn;
        int i3 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new tabhAwpQKyJhu24Q("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.M9e7PWhFYLD2lOGMker;
        if (i4 > i5) {
            iKANjmyTSxO6v6UuLPdu7DxOjlS((i5 - i2) - i3);
            throw tabhAwpQKyJhu24Q.LaeGQIruHQu81hfJldjMOQSVblH3x();
        }
        int i6 = this.LaeGQIruHQu81hfJldjMOQSVblH3x - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i7 >= 4096) {
            try {
                if (i7 > fileInputStream.available()) {
                    return null;
                }
            } catch (tabhAwpQKyJhu24Q e) {
                e.V57tEvNfxZVVcOCAOih5PKr = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.ZfQNn8hdWlEQ5cR94249PDsLR, this.ZLZeBXTMq0zDztBxtRTuCHrapQ, bArr, 0, i6);
        this.GI83zq0G8e7zkn += this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
        while (i6 < i) {
            try {
                int i8 = fileInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw tabhAwpQKyJhu24Q.LaeGQIruHQu81hfJldjMOQSVblH3x();
                }
                this.GI83zq0G8e7zkn += i8;
                i6 += i8;
            } catch (tabhAwpQKyJhu24Q e2) {
                e2.V57tEvNfxZVVcOCAOih5PKr = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final void qygqjTppWwx992(int i) throws tabhAwpQKyJhu24Q {
        if (TqcnImqkSWIKht(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.GI83zq0G8e7zkn) - this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            throw tabhAwpQKyJhu24Q.LaeGQIruHQu81hfJldjMOQSVblH3x();
        }
        throw new tabhAwpQKyJhu24Q("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final int vBGA6pPLqSMuYGvprl270j7() throws tabhAwpQKyJhu24Q {
        if (V57tEvNfxZVVcOCAOih5PKr()) {
            this.NSjgqmGjEzuugn2SsG1mZFP = 0;
            return 0;
        }
        int iVE4yDIjexsP2lGjLaTcB = vE4yDIjexsP2lGjLaTcB();
        this.NSjgqmGjEzuugn2SsG1mZFP = iVE4yDIjexsP2lGjLaTcB;
        if ((iVE4yDIjexsP2lGjLaTcB >>> 3) != 0) {
            return iVE4yDIjexsP2lGjLaTcB;
        }
        throw new tabhAwpQKyJhu24Q("Protocol message contained an invalid tag (zero).");
    }

    public final int vE4yDIjexsP2lGjLaTcB() {
        int i;
        int i2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int i3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            byte b = bArr[i2];
            if (b >= 0) {
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i4;
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
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i5;
                return i;
            }
        }
        return (int) HVEwbdULInpTNa0IG();
    }

    public final void y1NaPKTl7R18DOr6e8i5() {
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x + this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i;
        int i2 = this.GI83zq0G8e7zkn + i;
        int i3 = this.M9e7PWhFYLD2lOGMker;
        if (i2 <= i3) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i4;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i - i4;
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        return O1xDAlBZZlZdoEf747lCFHld() != 0;
    }

    @Override // com.vdodsodjsdt.caFA212npwWVdtc2e6z
    public final int zzpBGItXfub0yWj() {
        return this.GI83zq0G8e7zkn + this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
    }
}
