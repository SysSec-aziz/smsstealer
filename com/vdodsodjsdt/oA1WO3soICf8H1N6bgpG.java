package com.vdodsodjsdt;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class oA1WO3soICf8H1N6bgpG implements Serializable, Comparable {
    public static final oA1WO3soICf8H1N6bgpG zIvmSL0wzmmKGc3X39b2Gw2mUGE = new oA1WO3soICf8H1N6bgpG(new byte[0]);
    public transient String LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final byte[] V57tEvNfxZVVcOCAOih5PKr;
    public transient int ZfQNn8hdWlEQ5cR94249PDsLR;

    public oA1WO3soICf8H1N6bgpG(byte[] bArr) {
        ej6unYlOWMDF.pYmKDYlAmhudp(bArr, "data");
        this.V57tEvNfxZVVcOCAOih5PKr = bArr;
    }

    public oA1WO3soICf8H1N6bgpG GI83zq0G8e7zkn() {
        int i = 0;
        while (true) {
            byte[] bArr = this.V57tEvNfxZVVcOCAOih5PKr;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new oA1WO3soICf8H1N6bgpG(bArrCopyOf);
            }
            i++;
        }
    }

    public void HzCpKshMOoaw76hFcbOVRYMeRd(EouCzLZsW9ynithduh eouCzLZsW9ynithduh, int i) {
        eouCzLZsW9ynithduh.aXO0LSrt8bKV(i, this.V57tEvNfxZVVcOCAOih5PKr);
    }

    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x(int i, byte[] bArr, int i2, int i3) {
        ej6unYlOWMDF.pYmKDYlAmhudp(bArr, "other");
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.V57tEvNfxZVVcOCAOih5PKr;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && FLWIoSaHb1q8TqFvEBgPyRGrzvi6.V57tEvNfxZVVcOCAOih5PKr(i, i2, i3, bArr2, bArr);
    }

    public final String M9e7PWhFYLD2lOGMker() {
        String str = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (str != null) {
            return str;
        }
        byte[] bArrV57tEvNfxZVVcOCAOih5PKr = V57tEvNfxZVVcOCAOih5PKr();
        ej6unYlOWMDF.pYmKDYlAmhudp(bArrV57tEvNfxZVVcOCAOih5PKr, "<this>");
        String str2 = new String(bArrV57tEvNfxZVVcOCAOih5PKr, DEYHHOT0rxPFnkgGJgP0ym2DRq1.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = str2;
        return str2;
    }

    public oA1WO3soICf8H1N6bgpG NSjgqmGjEzuugn2SsG1mZFP(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i2 <= bArr.length) {
            if (i2 - i >= 0) {
                return (i == 0 && i2 == bArr.length) ? this : new oA1WO3soICf8H1N6bgpG(vmp19D2MODlOL.e1gEV3X9xwmHj(bArr, i, i2));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
    }

    public byte[] V57tEvNfxZVVcOCAOih5PKr() {
        return this.V57tEvNfxZVVcOCAOih5PKr;
    }

    public int VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return this.V57tEvNfxZVVcOCAOih5PKr.length;
    }

    public String ZLZeBXTMq0zDztBxtRTuCHrapQ(Charset charset) {
        ej6unYlOWMDF.pYmKDYlAmhudp(charset, "charset");
        return new String(this.V57tEvNfxZVVcOCAOih5PKr, charset);
    }

    public byte ZfQNn8hdWlEQ5cR94249PDsLR(int i) {
        return this.V57tEvNfxZVVcOCAOih5PKr[i];
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg = (oA1WO3soICf8H1N6bgpG) obj;
        ej6unYlOWMDF.pYmKDYlAmhudp(oa1wo3soicf8h1n6bgpg, "other");
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m();
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m2 = oa1wo3soicf8h1n6bgpg.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        int iMin = Math.min(iVxUQ9tBhpHJ2AAEDNW8sghc4m, iVxUQ9tBhpHJ2AAEDNW8sghc4m2);
        for (int i = 0; i < iMin; i++) {
            int iZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR(i) & 255;
            int iZfQNn8hdWlEQ5cR94249PDsLR2 = oa1wo3soicf8h1n6bgpg.ZfQNn8hdWlEQ5cR94249PDsLR(i) & 255;
            if (iZfQNn8hdWlEQ5cR94249PDsLR != iZfQNn8hdWlEQ5cR94249PDsLR2) {
                return iZfQNn8hdWlEQ5cR94249PDsLR < iZfQNn8hdWlEQ5cR94249PDsLR2 ? -1 : 1;
            }
        }
        if (iVxUQ9tBhpHJ2AAEDNW8sghc4m == iVxUQ9tBhpHJ2AAEDNW8sghc4m2) {
            return 0;
        }
        return iVxUQ9tBhpHJ2AAEDNW8sghc4m < iVxUQ9tBhpHJ2AAEDNW8sghc4m2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oA1WO3soICf8H1N6bgpG) {
            oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg = (oA1WO3soICf8H1N6bgpG) obj;
            int iVxUQ9tBhpHJ2AAEDNW8sghc4m = oa1wo3soicf8h1n6bgpg.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            byte[] bArr = this.V57tEvNfxZVVcOCAOih5PKr;
            if (iVxUQ9tBhpHJ2AAEDNW8sghc4m == bArr.length && oa1wo3soicf8h1n6bgpg.LaeGQIruHQu81hfJldjMOQSVblH3x(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.V57tEvNfxZVVcOCAOih5PKr);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = iHashCode;
        return iHashCode;
    }

    public String toString() {
        byte b;
        int i;
        byte[] bArr = this.V57tEvNfxZVVcOCAOih5PKr;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (127 <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i3 += b2 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (127 <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        i3 += b < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b3 = bArr[i6];
                    if ((b3 & 192) == 128) {
                        int i7 = (b3 ^ 3968) ^ (b2 << 6);
                        if (i7 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                break;
                            }
                            i3 += i7 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if ((b2 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b4 = bArr[i2 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i8];
                        if ((b5 & 192) == 128) {
                            int i9 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i9 < 2048) {
                                if (i4 != 64) {
                                    break;
                                }
                            } else if (55296 > i9 || i9 >= 57344) {
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                    break;
                                }
                                i3 += i9 < 65536 ? 1 : 2;
                                i2 += 3;
                                i4 = i;
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if ((b2 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b6 = bArr[i2 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i2 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & 192) == 128) {
                                int i11 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i11 > 1114111) {
                                    if (i4 != 64) {
                                        break;
                                    }
                                } else if (55296 > i11 || i11 >= 57344) {
                                    if (i11 >= 65536) {
                                        i = i4 + 1;
                                        if (i4 == 64) {
                                            break;
                                        }
                                        if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                            break;
                                        }
                                        i3 += i11 < 65536 ? 1 : 2;
                                        i2 += 4;
                                        i4 = i;
                                    } else if (i4 != 64) {
                                        break;
                                    }
                                } else if (i4 != 64) {
                                    break;
                                }
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if (i4 != 64) {
                break;
            }
        }
        i3 = -1;
        if (i3 != -1) {
            String strM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker();
            String strSubstring = strM9e7PWhFYLD2lOGMker.substring(0, i3);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
            String strAFOcXGdvoTMuqwiG8tD = ngO5JXZkj8nfh41LltHvEjUc.AFOcXGdvoTMuqwiG8tD(ngO5JXZkj8nfh41LltHvEjUc.AFOcXGdvoTMuqwiG8tD(ngO5JXZkj8nfh41LltHvEjUc.AFOcXGdvoTMuqwiG8tD(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= strM9e7PWhFYLD2lOGMker.length()) {
                return "[text=" + strAFOcXGdvoTMuqwiG8tD + ']';
            }
            return "[size=" + bArr.length + " text=" + strAFOcXGdvoTMuqwiG8tD + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + zzpBGItXfub0yWj() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 <= bArr.length) {
            sb.append((64 == bArr.length ? this : new oA1WO3soICf8H1N6bgpG(vmp19D2MODlOL.e1gEV3X9xwmHj(bArr, 0, 64))).zzpBGItXfub0yWj());
            sb.append("…]");
            return sb.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
    }

    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg, int i) {
        ej6unYlOWMDF.pYmKDYlAmhudp(oa1wo3soicf8h1n6bgpg, "other");
        return oa1wo3soicf8h1n6bgpg.LaeGQIruHQu81hfJldjMOQSVblH3x(0, this.V57tEvNfxZVVcOCAOih5PKr, 0, i);
    }

    public String zzpBGItXfub0yWj() {
        byte[] bArr = this.V57tEvNfxZVVcOCAOih5PKr;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = KfeOQNOupsCg6878zi4e.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
