package com.vdodsodjsdt;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class EouCzLZsW9ynithduh implements hy3v1zJcCYok89Y1iAeFhN66, zvqhqc7YVxGqa3qIRo, Cloneable, ByteChannel {
    public tpWzSW479hfzvFH5 V57tEvNfxZVVcOCAOih5PKr;
    public long ZfQNn8hdWlEQ5cR94249PDsLR;

    @Override // com.vdodsodjsdt.CZ74FjSsfST8z15SHXk
    public final void Ca81ebIan1u(long j, EouCzLZsW9ynithduh eouCzLZsW9ynithduh) {
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5ZzpBGItXfub0yWj;
        ej6unYlOWMDF.pYmKDYlAmhudp(eouCzLZsW9ynithduh, "source");
        if (eouCzLZsW9ynithduh == this) {
            throw new IllegalArgumentException("source == this");
        }
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.ZLZeBXTMq0zDztBxtRTuCHrapQ(eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR, 0L, j);
        while (j > 0) {
            tpWzSW479hfzvFH5 tpwzsw479hfzvfh5 = eouCzLZsW9ynithduh.V57tEvNfxZVVcOCAOih5PKr;
            ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
            int i = tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr;
            tpWzSW479hfzvFH5 tpwzsw479hfzvfh52 = eouCzLZsW9ynithduh.V57tEvNfxZVVcOCAOih5PKr;
            ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh52);
            long j2 = i - tpwzsw479hfzvfh52.zzpBGItXfub0yWj;
            int i2 = 0;
            if (j < j2) {
                tpWzSW479hfzvFH5 tpwzsw479hfzvfh53 = this.V57tEvNfxZVVcOCAOih5PKr;
                tpWzSW479hfzvFH5 tpwzsw479hfzvfh54 = tpwzsw479hfzvfh53 != null ? tpwzsw479hfzvfh53.ZLZeBXTMq0zDztBxtRTuCHrapQ : null;
                if (tpwzsw479hfzvfh54 != null && tpwzsw479hfzvfh54.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                    if ((((long) tpwzsw479hfzvfh54.V57tEvNfxZVVcOCAOih5PKr) + j) - ((long) (tpwzsw479hfzvfh54.ZfQNn8hdWlEQ5cR94249PDsLR ? 0 : tpwzsw479hfzvfh54.zzpBGItXfub0yWj)) <= 8192) {
                        tpWzSW479hfzvFH5 tpwzsw479hfzvfh55 = eouCzLZsW9ynithduh.V57tEvNfxZVVcOCAOih5PKr;
                        ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh55);
                        tpwzsw479hfzvfh55.ZfQNn8hdWlEQ5cR94249PDsLR(tpwzsw479hfzvfh54, (int) j);
                        eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR -= j;
                        this.ZfQNn8hdWlEQ5cR94249PDsLR += j;
                        return;
                    }
                }
                tpWzSW479hfzvFH5 tpwzsw479hfzvfh56 = eouCzLZsW9ynithduh.V57tEvNfxZVVcOCAOih5PKr;
                ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh56);
                int i3 = (int) j;
                if (i3 <= 0 || i3 > tpwzsw479hfzvfh56.V57tEvNfxZVVcOCAOih5PKr - tpwzsw479hfzvfh56.zzpBGItXfub0yWj) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    tpwzsw479hfzvfh5ZzpBGItXfub0yWj = tpwzsw479hfzvfh56.V57tEvNfxZVVcOCAOih5PKr();
                } else {
                    tpwzsw479hfzvfh5ZzpBGItXfub0yWj = XV5lwP1ltOyG6fBWn0goPh0ZOfW9.zzpBGItXfub0yWj();
                    byte[] bArr = tpwzsw479hfzvfh56.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    byte[] bArr2 = tpwzsw479hfzvfh5ZzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    int i4 = tpwzsw479hfzvfh56.zzpBGItXfub0yWj;
                    vmp19D2MODlOL.wR7sbzHKf9hYV1lxoS6nqyszepWvN(0, i4, i4 + i3, bArr, bArr2);
                }
                tpwzsw479hfzvfh5ZzpBGItXfub0yWj.V57tEvNfxZVVcOCAOih5PKr = tpwzsw479hfzvfh5ZzpBGItXfub0yWj.zzpBGItXfub0yWj + i3;
                tpwzsw479hfzvfh56.zzpBGItXfub0yWj += i3;
                tpWzSW479hfzvFH5 tpwzsw479hfzvfh57 = tpwzsw479hfzvfh56.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh57);
                tpwzsw479hfzvfh57.zzpBGItXfub0yWj(tpwzsw479hfzvfh5ZzpBGItXfub0yWj);
                eouCzLZsW9ynithduh.V57tEvNfxZVVcOCAOih5PKr = tpwzsw479hfzvfh5ZzpBGItXfub0yWj;
            }
            tpWzSW479hfzvFH5 tpwzsw479hfzvfh58 = eouCzLZsW9ynithduh.V57tEvNfxZVVcOCAOih5PKr;
            ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh58);
            long j3 = tpwzsw479hfzvfh58.V57tEvNfxZVVcOCAOih5PKr - tpwzsw479hfzvfh58.zzpBGItXfub0yWj;
            eouCzLZsW9ynithduh.V57tEvNfxZVVcOCAOih5PKr = tpwzsw479hfzvfh58.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            tpWzSW479hfzvFH5 tpwzsw479hfzvfh59 = this.V57tEvNfxZVVcOCAOih5PKr;
            if (tpwzsw479hfzvfh59 == null) {
                this.V57tEvNfxZVVcOCAOih5PKr = tpwzsw479hfzvfh58;
                tpwzsw479hfzvfh58.ZLZeBXTMq0zDztBxtRTuCHrapQ = tpwzsw479hfzvfh58;
                tpwzsw479hfzvfh58.zIvmSL0wzmmKGc3X39b2Gw2mUGE = tpwzsw479hfzvfh58;
            } else {
                tpWzSW479hfzvFH5 tpwzsw479hfzvfh510 = tpwzsw479hfzvfh59.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh510);
                tpwzsw479hfzvfh510.zzpBGItXfub0yWj(tpwzsw479hfzvfh58);
                tpWzSW479hfzvFH5 tpwzsw479hfzvfh511 = tpwzsw479hfzvfh58.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                if (tpwzsw479hfzvfh511 == tpwzsw479hfzvfh58) {
                    throw new IllegalStateException("cannot compact");
                }
                ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh511);
                if (tpwzsw479hfzvfh511.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                    int i5 = tpwzsw479hfzvfh58.V57tEvNfxZVVcOCAOih5PKr - tpwzsw479hfzvfh58.zzpBGItXfub0yWj;
                    tpWzSW479hfzvFH5 tpwzsw479hfzvfh512 = tpwzsw479hfzvfh58.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                    ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh512);
                    int i6 = 8192 - tpwzsw479hfzvfh512.V57tEvNfxZVVcOCAOih5PKr;
                    tpWzSW479hfzvFH5 tpwzsw479hfzvfh513 = tpwzsw479hfzvfh58.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                    ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh513);
                    if (!tpwzsw479hfzvfh513.ZfQNn8hdWlEQ5cR94249PDsLR) {
                        tpWzSW479hfzvFH5 tpwzsw479hfzvfh514 = tpwzsw479hfzvfh58.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                        ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh514);
                        i2 = tpwzsw479hfzvfh514.zzpBGItXfub0yWj;
                    }
                    if (i5 <= i6 + i2) {
                        tpWzSW479hfzvFH5 tpwzsw479hfzvfh515 = tpwzsw479hfzvfh58.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                        ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh515);
                        tpwzsw479hfzvfh58.ZfQNn8hdWlEQ5cR94249PDsLR(tpwzsw479hfzvfh515, i5);
                        tpwzsw479hfzvfh58.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                        XV5lwP1ltOyG6fBWn0goPh0ZOfW9.VxUQ9tBhpHJ2AAEDNW8sghc4m(tpwzsw479hfzvfh58);
                    }
                }
            }
            eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR -= j3;
            this.ZfQNn8hdWlEQ5cR94249PDsLR += j3;
            j -= j3;
        }
    }

    public final void CixTK5ZX8oWXHz34qHYV(int i) {
        if (i < 128) {
            O1xDAlBZZlZdoEf747lCFHld(i);
            return;
        }
        if (i < 2048) {
            tpWzSW479hfzvFH5 tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW = pzqP2AqKW6J5PO8zCKnW(2);
            byte[] bArr = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            int i2 = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr = i2 + 2;
            this.ZfQNn8hdWlEQ5cR94249PDsLR += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            O1xDAlBZZlZdoEf747lCFHld(63);
            return;
        }
        if (i < 65536) {
            tpWzSW479hfzvFH5 tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW2 = pzqP2AqKW6J5PO8zCKnW(3);
            byte[] bArr2 = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW2.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            int i3 = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW2.V57tEvNfxZVVcOCAOih5PKr;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW2.V57tEvNfxZVVcOCAOih5PKr = i3 + 3;
            this.ZfQNn8hdWlEQ5cR94249PDsLR += 3;
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(FLWIoSaHb1q8TqFvEBgPyRGrzvi6.wRCD0SdqWCowdYU7bmzN(i)));
        }
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW3 = pzqP2AqKW6J5PO8zCKnW(4);
        byte[] bArr3 = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW3.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i4 = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW3.V57tEvNfxZVVcOCAOih5PKr;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW3.V57tEvNfxZVVcOCAOih5PKr = i4 + 4;
        this.ZfQNn8hdWlEQ5cR94249PDsLR += 4;
    }

    public final void HVEwbdULInpTNa0IG(long j) {
        boolean z;
        if (j == 0) {
            O1xDAlBZZlZdoEf747lCFHld(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                TqcnImqkSWIKht("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = coyP1hCgJ7zr56eqQoO7H04E.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > coyP1hCgJ7zr56eqQoO7H04E.zzpBGItXfub0yWj[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW = pzqP2AqKW6J5PO8zCKnW(i);
        byte[] bArr2 = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i2 = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr2[i2] = coyP1hCgJ7zr56eqQoO7H04E.VxUQ9tBhpHJ2AAEDNW8sghc4m[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr += i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR += (long) i;
    }

    @Override // com.vdodsodjsdt.hy3v1zJcCYok89Y1iAeFhN66
    public final boolean HzCpKshMOoaw76hFcbOVRYMeRd() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR == 0;
    }

    @Override // com.vdodsodjsdt.zvqhqc7YVxGqa3qIRo
    public final /* bridge */ /* synthetic */ zvqhqc7YVxGqa3qIRo Irh5auREsoeV1C1RaBamlmy(String str) {
        TqcnImqkSWIKht(str);
        return this;
    }

    public final byte[] KUYypEB4eNWOZWVDpH(long j) throws EOFException {
        int iMin;
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            FLWIoSaHb1q8TqFvEBgPyRGrzvi6.ZLZeBXTMq0zDztBxtRTuCHrapQ(i, i2, i3);
            tpWzSW479hfzvFH5 tpwzsw479hfzvfh5 = this.V57tEvNfxZVVcOCAOih5PKr;
            if (tpwzsw479hfzvfh5 == null) {
                iMin = -1;
            } else {
                iMin = Math.min(i3, tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr - tpwzsw479hfzvfh5.zzpBGItXfub0yWj);
                byte[] bArr2 = tpwzsw479hfzvfh5.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                int i4 = tpwzsw479hfzvfh5.zzpBGItXfub0yWj;
                vmp19D2MODlOL.wR7sbzHKf9hYV1lxoS6nqyszepWvN(i2, i4, i4 + iMin, bArr2, bArr);
                int i5 = tpwzsw479hfzvfh5.zzpBGItXfub0yWj + iMin;
                tpwzsw479hfzvfh5.zzpBGItXfub0yWj = i5;
                this.ZfQNn8hdWlEQ5cR94249PDsLR -= (long) iMin;
                if (i5 == tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr) {
                    this.V57tEvNfxZVVcOCAOih5PKr = tpwzsw479hfzvfh5.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                    XV5lwP1ltOyG6fBWn0goPh0ZOfW9.VxUQ9tBhpHJ2AAEDNW8sghc4m(tpwzsw479hfzvfh5);
                }
            }
            if (iMin == -1) {
                throw new EOFException();
            }
            i2 += iMin;
        }
        return bArr;
    }

    public final byte LaeGQIruHQu81hfJldjMOQSVblH3x(long j) {
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.ZLZeBXTMq0zDztBxtRTuCHrapQ(this.ZfQNn8hdWlEQ5cR94249PDsLR, j, 1L);
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (tpwzsw479hfzvfh5 == null) {
            ej6unYlOWMDF.p59rPv72J9(null);
            throw null;
        }
        long j2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (j2 - j < j) {
            while (j2 > j) {
                tpwzsw479hfzvfh5 = tpwzsw479hfzvfh5.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
                j2 -= (long) (tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr - tpwzsw479hfzvfh5.zzpBGItXfub0yWj);
            }
            return tpwzsw479hfzvfh5.VxUQ9tBhpHJ2AAEDNW8sghc4m[(int) ((((long) tpwzsw479hfzvfh5.zzpBGItXfub0yWj) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr;
            int i2 = tpwzsw479hfzvfh5.zzpBGItXfub0yWj;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return tpwzsw479hfzvfh5.VxUQ9tBhpHJ2AAEDNW8sghc4m[(int) ((((long) i2) + j) - j3)];
            }
            tpwzsw479hfzvfh5 = tpwzsw479hfzvfh5.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
            j3 = j4;
        }
    }

    public final long M9e7PWhFYLD2lOGMker(byte b, long j, long j2) {
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.ZfQNn8hdWlEQ5cR94249PDsLR + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (tpwzsw479hfzvfh5 = this.V57tEvNfxZVVcOCAOih5PKr) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                tpwzsw479hfzvfh5 = tpwzsw479hfzvfh5.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
                j4 -= (long) (tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr - tpwzsw479hfzvfh5.zzpBGItXfub0yWj);
            }
            while (j4 < j2) {
                byte[] bArr = tpwzsw479hfzvfh5.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                int iMin = (int) Math.min(tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr, (((long) tpwzsw479hfzvfh5.zzpBGItXfub0yWj) + j2) - j4);
                for (int i = (int) ((((long) tpwzsw479hfzvfh5.zzpBGItXfub0yWj) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - tpwzsw479hfzvfh5.zzpBGItXfub0yWj)) + j4;
                    }
                }
                j4 += (long) (tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr - tpwzsw479hfzvfh5.zzpBGItXfub0yWj);
                tpwzsw479hfzvfh5 = tpwzsw479hfzvfh5.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr - tpwzsw479hfzvfh5.zzpBGItXfub0yWj)) + j3;
            if (j5 > j) {
                break;
            }
            tpwzsw479hfzvfh5 = tpwzsw479hfzvfh5.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = tpwzsw479hfzvfh5.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            int iMin2 = (int) Math.min(tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr, (((long) tpwzsw479hfzvfh5.zzpBGItXfub0yWj) + j2) - j3);
            for (int i2 = (int) ((((long) tpwzsw479hfzvfh5.zzpBGItXfub0yWj) + j) - j3); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - tpwzsw479hfzvfh5.zzpBGItXfub0yWj)) + j3;
                }
            }
            j3 += (long) (tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr - tpwzsw479hfzvfh5.zzpBGItXfub0yWj);
            tpwzsw479hfzvfh5 = tpwzsw479hfzvfh5.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
            j = j3;
        }
        return -1L;
    }

    @Override // com.vdodsodjsdt.hy3v1zJcCYok89Y1iAeFhN66
    public final String NSjgqmGjEzuugn2SsG1mZFP() {
        return q1wNbhk2O6(Long.MAX_VALUE);
    }

    public final void O1xDAlBZZlZdoEf747lCFHld(int i) {
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW = pzqP2AqKW6J5PO8zCKnW(1);
        byte[] bArr = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i2 = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr;
        tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr = i2 + 1;
        bArr[i2] = (byte) i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR++;
    }

    public final String RhfGHxtXxy0M0grmp2jkRjQg() {
        return q11o1hieEkZDhF1MGOZI26oZiDT(this.ZfQNn8hdWlEQ5cR94249PDsLR, DEYHHOT0rxPFnkgGJgP0ym2DRq1.VxUQ9tBhpHJ2AAEDNW8sghc4m);
    }

    public final oA1WO3soICf8H1N6bgpG SuB3hEmTmbbRGAhtvOOmfKEon(int i) {
        if (i == 0) {
            return oA1WO3soICf8H1N6bgpG.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        }
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.ZLZeBXTMq0zDztBxtRTuCHrapQ(this.ZfQNn8hdWlEQ5cR94249PDsLR, 0L, i);
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5 = this.V57tEvNfxZVVcOCAOih5PKr;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
            int i5 = tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr;
            int i6 = tpwzsw479hfzvfh5.zzpBGItXfub0yWj;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            tpwzsw479hfzvfh5 = tpwzsw479hfzvfh5.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh52 = this.V57tEvNfxZVVcOCAOih5PKr;
        int i7 = 0;
        while (i2 < i) {
            ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh52);
            bArr[i7] = tpwzsw479hfzvfh52.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            i2 += tpwzsw479hfzvfh52.V57tEvNfxZVVcOCAOih5PKr - tpwzsw479hfzvfh52.zzpBGItXfub0yWj;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = tpwzsw479hfzvfh52.zzpBGItXfub0yWj;
            tpwzsw479hfzvfh52.ZfQNn8hdWlEQ5cR94249PDsLR = true;
            i7++;
            tpwzsw479hfzvfh52 = tpwzsw479hfzvfh52.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        }
        return new PPtIx4psoo4sPV6C2irfHMJrxl(bArr, iArr);
    }

    @Override // com.vdodsodjsdt.hy3v1zJcCYok89Y1iAeFhN66
    public final void TaDO7ogis3aEiWEtq(long j) throws EOFException {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR < j) {
            throw new EOFException();
        }
    }

    public final void TqcnImqkSWIKht(String str) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "string");
        d9zDyyznnp3oaDT1Ug(str, 0, str.length());
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(EouCzLZsW9ynithduh eouCzLZsW9ynithduh, long j, long j2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(eouCzLZsW9ynithduh, "out");
        long j3 = j;
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.ZLZeBXTMq0zDztBxtRTuCHrapQ(this.ZfQNn8hdWlEQ5cR94249PDsLR, j3, j2);
        if (j2 == 0) {
            return;
        }
        eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR += j2;
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5 = this.V57tEvNfxZVVcOCAOih5PKr;
        while (true) {
            ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
            long j4 = tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr - tpwzsw479hfzvfh5.zzpBGItXfub0yWj;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            tpwzsw479hfzvfh5 = tpwzsw479hfzvfh5.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        }
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh52 = tpwzsw479hfzvfh5;
        long j5 = j2;
        while (j5 > 0) {
            ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh52);
            tpWzSW479hfzvFH5 tpwzsw479hfzvfh5V57tEvNfxZVVcOCAOih5PKr = tpwzsw479hfzvfh52.V57tEvNfxZVVcOCAOih5PKr();
            int i = tpwzsw479hfzvfh5V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj + ((int) j3);
            tpwzsw479hfzvfh5V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj = i;
            tpwzsw479hfzvfh5V57tEvNfxZVVcOCAOih5PKr.V57tEvNfxZVVcOCAOih5PKr = Math.min(i + ((int) j5), tpwzsw479hfzvfh5V57tEvNfxZVVcOCAOih5PKr.V57tEvNfxZVVcOCAOih5PKr);
            tpWzSW479hfzvFH5 tpwzsw479hfzvfh53 = eouCzLZsW9ynithduh.V57tEvNfxZVVcOCAOih5PKr;
            if (tpwzsw479hfzvfh53 == null) {
                tpwzsw479hfzvfh5V57tEvNfxZVVcOCAOih5PKr.ZLZeBXTMq0zDztBxtRTuCHrapQ = tpwzsw479hfzvfh5V57tEvNfxZVVcOCAOih5PKr;
                tpwzsw479hfzvfh5V57tEvNfxZVVcOCAOih5PKr.zIvmSL0wzmmKGc3X39b2Gw2mUGE = tpwzsw479hfzvfh5V57tEvNfxZVVcOCAOih5PKr;
                eouCzLZsW9ynithduh.V57tEvNfxZVVcOCAOih5PKr = tpwzsw479hfzvfh5V57tEvNfxZVVcOCAOih5PKr;
            } else {
                tpWzSW479hfzvFH5 tpwzsw479hfzvfh54 = tpwzsw479hfzvfh53.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh54);
                tpwzsw479hfzvfh54.zzpBGItXfub0yWj(tpwzsw479hfzvfh5V57tEvNfxZVVcOCAOih5PKr);
            }
            j5 -= (long) (tpwzsw479hfzvfh5V57tEvNfxZVVcOCAOih5PKr.V57tEvNfxZVVcOCAOih5PKr - tpwzsw479hfzvfh5V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj);
            tpwzsw479hfzvfh52 = tpwzsw479hfzvfh52.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            j3 = 0;
        }
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() throws EOFException {
        skip(this.ZfQNn8hdWlEQ5cR94249PDsLR);
    }

    @Override // com.vdodsodjsdt.zvqhqc7YVxGqa3qIRo
    public final /* bridge */ /* synthetic */ zvqhqc7YVxGqa3qIRo ZfQNn8hdWlEQ5cR94249PDsLR(long j) {
        y1NaPKTl7R18DOr6e8i5(j);
        return this;
    }

    public final void aXO0LSrt8bKV(int i, byte[] bArr) {
        ej6unYlOWMDF.pYmKDYlAmhudp(bArr, "source");
        int i2 = 0;
        long j = i;
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.ZLZeBXTMq0zDztBxtRTuCHrapQ(bArr.length, 0, j);
        while (i2 < i) {
            tpWzSW479hfzvFH5 tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW = pzqP2AqKW6J5PO8zCKnW(1);
            int iMin = Math.min(i - i2, 8192 - tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr);
            int i3 = i2 + iMin;
            vmp19D2MODlOL.wR7sbzHKf9hYV1lxoS6nqyszepWvN(tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr, i2, i3, bArr, tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.VxUQ9tBhpHJ2AAEDNW8sghc4m);
            tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr += iMin;
            i2 = i3;
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR += j;
    }

    public final Object clone() {
        EouCzLZsW9ynithduh eouCzLZsW9ynithduh = new EouCzLZsW9ynithduh();
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR == 0) {
            return eouCzLZsW9ynithduh;
        }
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5 = this.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5V57tEvNfxZVVcOCAOih5PKr = tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr();
        eouCzLZsW9ynithduh.V57tEvNfxZVVcOCAOih5PKr = tpwzsw479hfzvfh5V57tEvNfxZVVcOCAOih5PKr;
        tpwzsw479hfzvfh5V57tEvNfxZVVcOCAOih5PKr.ZLZeBXTMq0zDztBxtRTuCHrapQ = tpwzsw479hfzvfh5V57tEvNfxZVVcOCAOih5PKr;
        tpwzsw479hfzvfh5V57tEvNfxZVVcOCAOih5PKr.zIvmSL0wzmmKGc3X39b2Gw2mUGE = tpwzsw479hfzvfh5V57tEvNfxZVVcOCAOih5PKr;
        for (tpWzSW479hfzvFH5 tpwzsw479hfzvfh52 = tpwzsw479hfzvfh5.zIvmSL0wzmmKGc3X39b2Gw2mUGE; tpwzsw479hfzvfh52 != tpwzsw479hfzvfh5; tpwzsw479hfzvfh52 = tpwzsw479hfzvfh52.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            tpWzSW479hfzvFH5 tpwzsw479hfzvfh53 = tpwzsw479hfzvfh5V57tEvNfxZVVcOCAOih5PKr.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh53);
            ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh52);
            tpwzsw479hfzvfh53.zzpBGItXfub0yWj(tpwzsw479hfzvfh52.V57tEvNfxZVVcOCAOih5PKr());
        }
        eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        return eouCzLZsW9ynithduh;
    }

    public final void d9zDyyznnp3oaDT1Ug(String str, int i, int i2) {
        char cCharAt;
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("beginIndex < 0: ", i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i2, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                tpWzSW479hfzvFH5 tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW = pzqP2AqKW6J5PO8zCKnW(1);
                byte[] bArr = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                int i3 = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr;
                int i6 = (i3 + i) - i5;
                tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr = i5 + i6;
                this.ZfQNn8hdWlEQ5cR94249PDsLR += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    tpWzSW479hfzvFH5 tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW2 = pzqP2AqKW6J5PO8zCKnW(2);
                    byte[] bArr2 = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW2.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    int i7 = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW2.V57tEvNfxZVVcOCAOih5PKr;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW2.V57tEvNfxZVVcOCAOih5PKr = i7 + 2;
                    this.ZfQNn8hdWlEQ5cR94249PDsLR += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    tpWzSW479hfzvFH5 tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW3 = pzqP2AqKW6J5PO8zCKnW(3);
                    byte[] bArr3 = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW3.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    int i8 = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW3.V57tEvNfxZVVcOCAOih5PKr;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW3.V57tEvNfxZVVcOCAOih5PKr = i8 + 3;
                    this.ZfQNn8hdWlEQ5cR94249PDsLR += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        O1xDAlBZZlZdoEf747lCFHld(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW4 = pzqP2AqKW6J5PO8zCKnW(4);
                        byte[] bArr4 = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW4.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        int i11 = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW4.V57tEvNfxZVVcOCAOih5PKr;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW4.V57tEvNfxZVVcOCAOih5PKr = i11 + 4;
                        this.ZfQNn8hdWlEQ5cR94249PDsLR += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EouCzLZsW9ynithduh)) {
            return false;
        }
        long j = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        EouCzLZsW9ynithduh eouCzLZsW9ynithduh = (EouCzLZsW9ynithduh) obj;
        if (j != eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5 = this.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh52 = eouCzLZsW9ynithduh.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh52);
        int i = tpwzsw479hfzvfh5.zzpBGItXfub0yWj;
        int i2 = tpwzsw479hfzvfh52.zzpBGItXfub0yWj;
        long j2 = 0;
        while (j2 < this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            long jMin = Math.min(tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr - i, tpwzsw479hfzvfh52.V57tEvNfxZVVcOCAOih5PKr - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (tpwzsw479hfzvfh5.VxUQ9tBhpHJ2AAEDNW8sghc4m[i] != tpwzsw479hfzvfh52.VxUQ9tBhpHJ2AAEDNW8sghc4m[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr) {
                tpwzsw479hfzvfh5 = tpwzsw479hfzvfh5.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
                i = tpwzsw479hfzvfh5.zzpBGItXfub0yWj;
            }
            if (i2 == tpwzsw479hfzvfh52.V57tEvNfxZVVcOCAOih5PKr) {
                tpwzsw479hfzvfh52 = tpwzsw479hfzvfh52.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh52);
                i2 = tpwzsw479hfzvfh52.zzpBGItXfub0yWj;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // com.vdodsodjsdt.zvqhqc7YVxGqa3qIRo
    public final long h3jnZRsdwYJfY9UhQCkbvWciwvFHv(iIBl3qIny2 iibl3qiny2) {
        long j = 0;
        while (true) {
            long jKo09zE6UAgwkV = iibl3qiny2.ko09zE6UAgwkV(8192L, this);
            if (jKo09zE6UAgwkV == -1) {
                return j;
            }
            j += jKo09zE6UAgwkV;
        }
    }

    public final int hashCode() {
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (tpwzsw479hfzvfh5 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr;
            for (int i3 = tpwzsw479hfzvfh5.zzpBGItXfub0yWj; i3 < i2; i3++) {
                i = (i * 31) + tpwzsw479hfzvfh5.VxUQ9tBhpHJ2AAEDNW8sghc4m[i3];
            }
            tpwzsw479hfzvfh5 = tpwzsw479hfzvfh5.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
        } while (tpwzsw479hfzvfh5 != this.V57tEvNfxZVVcOCAOih5PKr);
        return i;
    }

    public final void iKANjmyTSxO6v6UuLPdu7DxOjlS(int i) {
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW = pzqP2AqKW6J5PO8zCKnW(2);
        byte[] bArr = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i2 = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr = i2 + 2;
        this.ZfQNn8hdWlEQ5cR94249PDsLR += 2;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // com.vdodsodjsdt.iIBl3qIny2
    public final long ko09zE6UAgwkV(long j, EouCzLZsW9ynithduh eouCzLZsW9ynithduh) {
        ej6unYlOWMDF.pYmKDYlAmhudp(eouCzLZsW9ynithduh, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        long j2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        eouCzLZsW9ynithduh.Ca81ebIan1u(j, this);
        return j;
    }

    @Override // com.vdodsodjsdt.zvqhqc7YVxGqa3qIRo
    public final /* bridge */ /* synthetic */ zvqhqc7YVxGqa3qIRo pYmKDYlAmhudp(oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg) {
        vE4yDIjexsP2lGjLaTcB(oa1wo3soicf8h1n6bgpg);
        return this;
    }

    public final tpWzSW479hfzvFH5 pzqP2AqKW6J5PO8zCKnW(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (tpwzsw479hfzvfh5 == null) {
            tpWzSW479hfzvFH5 tpwzsw479hfzvfh5ZzpBGItXfub0yWj = XV5lwP1ltOyG6fBWn0goPh0ZOfW9.zzpBGItXfub0yWj();
            this.V57tEvNfxZVVcOCAOih5PKr = tpwzsw479hfzvfh5ZzpBGItXfub0yWj;
            tpwzsw479hfzvfh5ZzpBGItXfub0yWj.ZLZeBXTMq0zDztBxtRTuCHrapQ = tpwzsw479hfzvfh5ZzpBGItXfub0yWj;
            tpwzsw479hfzvfh5ZzpBGItXfub0yWj.zIvmSL0wzmmKGc3X39b2Gw2mUGE = tpwzsw479hfzvfh5ZzpBGItXfub0yWj;
            return tpwzsw479hfzvfh5ZzpBGItXfub0yWj;
        }
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh52 = tpwzsw479hfzvfh5.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh52);
        if (tpwzsw479hfzvfh52.V57tEvNfxZVVcOCAOih5PKr + i <= 8192 && tpwzsw479hfzvfh52.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return tpwzsw479hfzvfh52;
        }
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5ZzpBGItXfub0yWj2 = XV5lwP1ltOyG6fBWn0goPh0ZOfW9.zzpBGItXfub0yWj();
        tpwzsw479hfzvfh52.zzpBGItXfub0yWj(tpwzsw479hfzvfh5ZzpBGItXfub0yWj2);
        return tpwzsw479hfzvfh5ZzpBGItXfub0yWj2;
    }

    public final String q11o1hieEkZDhF1MGOZI26oZiDT(long j, Charset charset) throws EOFException {
        ej6unYlOWMDF.pYmKDYlAmhudp(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5 = this.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
        int i = tpwzsw479hfzvfh5.zzpBGItXfub0yWj;
        if (((long) i) + j > tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr) {
            return new String(KUYypEB4eNWOZWVDpH(j), charset);
        }
        int i2 = (int) j;
        String str = new String(tpwzsw479hfzvfh5.VxUQ9tBhpHJ2AAEDNW8sghc4m, i, i2, charset);
        int i3 = tpwzsw479hfzvfh5.zzpBGItXfub0yWj + i2;
        tpwzsw479hfzvfh5.zzpBGItXfub0yWj = i3;
        this.ZfQNn8hdWlEQ5cR94249PDsLR -= j;
        if (i3 == tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr) {
            this.V57tEvNfxZVVcOCAOih5PKr = tpwzsw479hfzvfh5.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            XV5lwP1ltOyG6fBWn0goPh0ZOfW9.VxUQ9tBhpHJ2AAEDNW8sghc4m(tpwzsw479hfzvfh5);
        }
        return str;
    }

    @Override // com.vdodsodjsdt.hy3v1zJcCYok89Y1iAeFhN66
    public final String q1wNbhk2O6(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker((byte) 10, 0L, j2);
        if (jM9e7PWhFYLD2lOGMker != -1) {
            return coyP1hCgJ7zr56eqQoO7H04E.VxUQ9tBhpHJ2AAEDNW8sghc4m(jM9e7PWhFYLD2lOGMker, this);
        }
        if (j2 < this.ZfQNn8hdWlEQ5cR94249PDsLR && LaeGQIruHQu81hfJldjMOQSVblH3x(j2 - 1) == 13 && LaeGQIruHQu81hfJldjMOQSVblH3x(j2) == 10) {
            return coyP1hCgJ7zr56eqQoO7H04E.VxUQ9tBhpHJ2AAEDNW8sghc4m(j2, this);
        }
        EouCzLZsW9ynithduh eouCzLZsW9ynithduh = new EouCzLZsW9ynithduh();
        V57tEvNfxZVVcOCAOih5PKr(eouCzLZsW9ynithduh, 0L, Math.min(32, this.ZfQNn8hdWlEQ5cR94249PDsLR));
        throw new EOFException("\\n not found: limit=" + Math.min(this.ZfQNn8hdWlEQ5cR94249PDsLR, j) + " content=" + eouCzLZsW9ynithduh.zIvmSL0wzmmKGc3X39b2Gw2mUGE(eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR).zzpBGItXfub0yWj() + (char) 8230);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:38:0x00a2 BREAK  A[LOOP:0: B:5:0x000c->B:46:?], SYNTHETIC] */
    @Override // com.vdodsodjsdt.hy3v1zJcCYok89Y1iAeFhN66
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long qNPQb1obP7() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.ZfQNn8hdWlEQ5cR94249PDsLR
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La9
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            com.vdodsodjsdt.tpWzSW479hfzvFH5 r7 = r15.V57tEvNfxZVVcOCAOih5PKr
            com.vdodsodjsdt.ej6unYlOWMDF.p59rPv72J9(r7)
            byte[] r8 = r7.VxUQ9tBhpHJ2AAEDNW8sghc4m
            int r9 = r7.zzpBGItXfub0yWj
            int r10 = r7.V57tEvNfxZVVcOCAOih5PKr
        L17:
            if (r9 >= r10) goto L8e
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L26
            r12 = 57
            if (r11 > r12) goto L26
            int r12 = r11 + (-48)
            goto L3b
        L26:
            r12 = 97
            if (r11 < r12) goto L31
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L31
            int r12 = r11 + (-87)
            goto L3b
        L31:
            r12 = 65
            if (r11 < r12) goto L66
            r12 = 70
            if (r11 > r12) goto L66
            int r12 = r11 + (-55)
        L3b:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L4b
            r11 = 4
            long r4 = r4 << r11
            long r11 = (long) r12
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L17
        L4b:
            com.vdodsodjsdt.EouCzLZsW9ynithduh r0 = new com.vdodsodjsdt.EouCzLZsW9ynithduh
            r0.<init>()
            r0.y1NaPKTl7R18DOr6e8i5(r4)
            r0.O1xDAlBZZlZdoEf747lCFHld(r11)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.RhfGHxtXxy0M0grmp2jkRjQg()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L66:
            r6 = 1
            if (r1 == 0) goto L6a
            goto L8e
        L6a:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            char[] r2 = com.vdodsodjsdt.KfeOQNOupsCg6878zi4e.VxUQ9tBhpHJ2AAEDNW8sghc4m
            int r3 = r11 >> 4
            r3 = r3 & 15
            char r3 = r2[r3]
            r4 = r11 & 15
            char r2 = r2[r4]
            r4 = 2
            char[] r4 = new char[r4]
            r4[r0] = r3
            r4[r6] = r2
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L8e:
            if (r9 != r10) goto L9a
            com.vdodsodjsdt.tpWzSW479hfzvFH5 r8 = r7.VxUQ9tBhpHJ2AAEDNW8sghc4m()
            r15.V57tEvNfxZVVcOCAOih5PKr = r8
            com.vdodsodjsdt.XV5lwP1ltOyG6fBWn0goPh0ZOfW9.VxUQ9tBhpHJ2AAEDNW8sghc4m(r7)
            goto L9c
        L9a:
            r7.zzpBGItXfub0yWj = r9
        L9c:
            if (r6 != 0) goto La2
            com.vdodsodjsdt.tpWzSW479hfzvFH5 r7 = r15.V57tEvNfxZVVcOCAOih5PKr
            if (r7 != 0) goto Lc
        La2:
            long r2 = r15.ZfQNn8hdWlEQ5cR94249PDsLR
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.ZfQNn8hdWlEQ5cR94249PDsLR = r2
            return r4
        La9:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.EouCzLZsW9ynithduh.qNPQb1obP7():long");
    }

    public final void qygqjTppWwx992(int i) {
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW = pzqP2AqKW6J5PO8zCKnW(4);
        byte[] bArr = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i2 = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr = i2 + 4;
        this.ZfQNn8hdWlEQ5cR94249PDsLR += 4;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        ej6unYlOWMDF.pYmKDYlAmhudp(byteBuffer, "sink");
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (tpwzsw479hfzvfh5 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr - tpwzsw479hfzvfh5.zzpBGItXfub0yWj);
        byteBuffer.put(tpwzsw479hfzvfh5.VxUQ9tBhpHJ2AAEDNW8sghc4m, tpwzsw479hfzvfh5.zzpBGItXfub0yWj, iMin);
        int i = tpwzsw479hfzvfh5.zzpBGItXfub0yWj + iMin;
        tpwzsw479hfzvfh5.zzpBGItXfub0yWj = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR -= (long) iMin;
        if (i == tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr) {
            this.V57tEvNfxZVVcOCAOih5PKr = tpwzsw479hfzvfh5.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            XV5lwP1ltOyG6fBWn0goPh0ZOfW9.VxUQ9tBhpHJ2AAEDNW8sghc4m(tpwzsw479hfzvfh5);
        }
        return iMin;
    }

    @Override // com.vdodsodjsdt.hy3v1zJcCYok89Y1iAeFhN66
    public final byte readByte() {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR == 0) {
            throw new EOFException();
        }
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5 = this.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
        int i = tpwzsw479hfzvfh5.zzpBGItXfub0yWj;
        int i2 = tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr;
        int i3 = i + 1;
        byte b = tpwzsw479hfzvfh5.VxUQ9tBhpHJ2AAEDNW8sghc4m[i];
        this.ZfQNn8hdWlEQ5cR94249PDsLR--;
        if (i3 != i2) {
            tpwzsw479hfzvfh5.zzpBGItXfub0yWj = i3;
            return b;
        }
        this.V57tEvNfxZVVcOCAOih5PKr = tpwzsw479hfzvfh5.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        XV5lwP1ltOyG6fBWn0goPh0ZOfW9.VxUQ9tBhpHJ2AAEDNW8sghc4m(tpwzsw479hfzvfh5);
        return b;
    }

    @Override // com.vdodsodjsdt.hy3v1zJcCYok89Y1iAeFhN66
    public final int readInt() throws EOFException {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR < 4) {
            throw new EOFException();
        }
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5 = this.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
        int i = tpwzsw479hfzvfh5.zzpBGItXfub0yWj;
        int i2 = tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = tpwzsw479hfzvfh5.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.ZfQNn8hdWlEQ5cR94249PDsLR -= 4;
        if (i5 != i2) {
            tpwzsw479hfzvfh5.zzpBGItXfub0yWj = i5;
            return i6;
        }
        this.V57tEvNfxZVVcOCAOih5PKr = tpwzsw479hfzvfh5.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        XV5lwP1ltOyG6fBWn0goPh0ZOfW9.VxUQ9tBhpHJ2AAEDNW8sghc4m(tpwzsw479hfzvfh5);
        return i6;
    }

    @Override // com.vdodsodjsdt.hy3v1zJcCYok89Y1iAeFhN66
    public final short readShort() throws EOFException {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR < 2) {
            throw new EOFException();
        }
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5 = this.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
        int i = tpwzsw479hfzvfh5.zzpBGItXfub0yWj;
        int i2 = tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = tpwzsw479hfzvfh5.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.ZfQNn8hdWlEQ5cR94249PDsLR -= 2;
        if (i5 == i2) {
            this.V57tEvNfxZVVcOCAOih5PKr = tpwzsw479hfzvfh5.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            XV5lwP1ltOyG6fBWn0goPh0ZOfW9.VxUQ9tBhpHJ2AAEDNW8sghc4m(tpwzsw479hfzvfh5);
        } else {
            tpwzsw479hfzvfh5.zzpBGItXfub0yWj = i5;
        }
        return (short) i6;
    }

    @Override // com.vdodsodjsdt.hy3v1zJcCYok89Y1iAeFhN66
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            tpWzSW479hfzvFH5 tpwzsw479hfzvfh5 = this.V57tEvNfxZVVcOCAOih5PKr;
            if (tpwzsw479hfzvfh5 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr - tpwzsw479hfzvfh5.zzpBGItXfub0yWj);
            long j2 = iMin;
            this.ZfQNn8hdWlEQ5cR94249PDsLR -= j2;
            j -= j2;
            int i = tpwzsw479hfzvfh5.zzpBGItXfub0yWj + iMin;
            tpwzsw479hfzvfh5.zzpBGItXfub0yWj = i;
            if (i == tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr) {
                this.V57tEvNfxZVVcOCAOih5PKr = tpwzsw479hfzvfh5.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                XV5lwP1ltOyG6fBWn0goPh0ZOfW9.VxUQ9tBhpHJ2AAEDNW8sghc4m(tpwzsw479hfzvfh5);
            }
        }
    }

    public final String toString() {
        long j = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (j <= 2147483647L) {
            return SuB3hEmTmbbRGAhtvOOmfKEon((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.ZfQNn8hdWlEQ5cR94249PDsLR).toString());
    }

    @Override // com.vdodsodjsdt.zvqhqc7YVxGqa3qIRo
    public final /* bridge */ /* synthetic */ zvqhqc7YVxGqa3qIRo vBGA6pPLqSMuYGvprl270j7(int i, byte[] bArr) {
        aXO0LSrt8bKV(i, bArr);
        return this;
    }

    public final void vE4yDIjexsP2lGjLaTcB(oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg) {
        ej6unYlOWMDF.pYmKDYlAmhudp(oa1wo3soicf8h1n6bgpg, "byteString");
        oa1wo3soicf8h1n6bgpg.HzCpKshMOoaw76hFcbOVRYMeRd(this, oa1wo3soicf8h1n6bgpg.VxUQ9tBhpHJ2AAEDNW8sghc4m());
    }

    @Override // com.vdodsodjsdt.zvqhqc7YVxGqa3qIRo
    public final zvqhqc7YVxGqa3qIRo write(byte[] bArr) {
        ej6unYlOWMDF.pYmKDYlAmhudp(bArr, "source");
        aXO0LSrt8bKV(bArr.length, bArr);
        return this;
    }

    @Override // com.vdodsodjsdt.zvqhqc7YVxGqa3qIRo
    public final /* bridge */ /* synthetic */ zvqhqc7YVxGqa3qIRo writeByte(int i) {
        O1xDAlBZZlZdoEf747lCFHld(i);
        return this;
    }

    @Override // com.vdodsodjsdt.zvqhqc7YVxGqa3qIRo
    public final /* bridge */ /* synthetic */ zvqhqc7YVxGqa3qIRo writeInt(int i) {
        qygqjTppWwx992(i);
        return this;
    }

    @Override // com.vdodsodjsdt.zvqhqc7YVxGqa3qIRo
    public final /* bridge */ /* synthetic */ zvqhqc7YVxGqa3qIRo writeShort(int i) {
        iKANjmyTSxO6v6UuLPdu7DxOjlS(i);
        return this;
    }

    public final void y1NaPKTl7R18DOr6e8i5(long j) {
        if (j == 0) {
            O1xDAlBZZlZdoEf747lCFHld(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW = pzqP2AqKW6J5PO8zCKnW(i);
        byte[] bArr = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i2 = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = coyP1hCgJ7zr56eqQoO7H04E.VxUQ9tBhpHJ2AAEDNW8sghc4m[(int) (15 & j)];
            j >>>= 4;
        }
        tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr += i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR += (long) i;
    }

    @Override // com.vdodsodjsdt.hy3v1zJcCYok89Y1iAeFhN66
    public final oA1WO3soICf8H1N6bgpG zIvmSL0wzmmKGc3X39b2Gw2mUGE(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new oA1WO3soICf8H1N6bgpG(KUYypEB4eNWOZWVDpH(j));
        }
        oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpgSuB3hEmTmbbRGAhtvOOmfKEon = SuB3hEmTmbbRGAhtvOOmfKEon((int) j);
        skip(j);
        return oa1wo3soicf8h1n6bgpgSuB3hEmTmbbRGAhtvOOmfKEon;
    }

    @Override // com.vdodsodjsdt.iIBl3qIny2, com.vdodsodjsdt.CZ74FjSsfST8z15SHXk
    public final Rls9YNaGzWVnzvwT zzpBGItXfub0yWj() {
        return Rls9YNaGzWVnzvwT.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        ej6unYlOWMDF.pYmKDYlAmhudp(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            tpWzSW479hfzvFH5 tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW = pzqP2AqKW6J5PO8zCKnW(1);
            int iMin = Math.min(i, 8192 - tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr);
            byteBuffer.get(tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.VxUQ9tBhpHJ2AAEDNW8sghc4m, tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr, iMin);
            i -= iMin;
            tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr += iMin;
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR += (long) iRemaining;
        return iRemaining;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, com.vdodsodjsdt.CZ74FjSsfST8z15SHXk
    public final void close() {
    }

    @Override // com.vdodsodjsdt.zvqhqc7YVxGqa3qIRo, com.vdodsodjsdt.CZ74FjSsfST8z15SHXk, java.io.Flushable
    public final void flush() {
    }
}
