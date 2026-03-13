package com.vdodsodjsdt;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class fMipVc9GFHAwh7dXz8 extends sGipz63rTUmSj3uFDvOtzihao {
    public final byte[] GI83zq0G8e7zkn;
    public int HzCpKshMOoaw76hFcbOVRYMeRd;
    public final utw5QZ2bV5OFu23kHkuL67s KUYypEB4eNWOZWVDpH;
    public final int M9e7PWhFYLD2lOGMker;
    public Skgk8FYn8b4TvRiBOsElZw4XkNLhQ NSjgqmGjEzuugn2SsG1mZFP;
    public static final Logger q1wNbhk2O6 = Logger.getLogger(fMipVc9GFHAwh7dXz8.class.getName());
    public static final boolean p59rPv72J9 = VFd9YrZLozMNzEwgrLgkRG.LaeGQIruHQu81hfJldjMOQSVblH3x;

    public fMipVc9GFHAwh7dXz8(utw5QZ2bV5OFu23kHkuL67s utw5qz2bv5ofu23khkul67s, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.GI83zq0G8e7zkn = new byte[iMax];
        this.M9e7PWhFYLD2lOGMker = iMax;
        this.KUYypEB4eNWOZWVDpH = utw5qz2bv5ofu23khkul67s;
    }

    public static int G479XgNG9rK8jPPbSXr(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int VOvSEdhaZyc0oOGQ8(String str) {
        int length;
        try {
            length = eFgoNcoFBGOQHfSJanp.VxUQ9tBhpHJ2AAEDNW8sghc4m(str);
        } catch (dGW2434XmPszy6t unused) {
            length = str.getBytes(iJsJOOjKyWEygkebu5yh4.VxUQ9tBhpHJ2AAEDNW8sghc4m).length;
        }
        return r0dB0ojIy6g8mnk1(length) + length;
    }

    public static int h2b7InwIaORKN91X7whfQh4(int i) {
        return r0dB0ojIy6g8mnk1(i << 3);
    }

    public static int lxWWbfAOLs4jWzd7PSIiIJ(int i, uDRHTE5hsm7JpGOnK7F udrhte5hsm7jpgonk7f) {
        int iH2b7InwIaORKN91X7whfQh4 = h2b7InwIaORKN91X7whfQh4(i);
        int size = udrhte5hsm7jpgonk7f.size();
        return r0dB0ojIy6g8mnk1(size) + size + iH2b7InwIaORKN91X7whfQh4;
    }

    public static int r0dB0ojIy6g8mnk1(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void AFOcXGdvoTMuqwiG8tD(int i) {
        boolean z = p59rPv72J9;
        byte[] bArr = this.GI83zq0G8e7zkn;
        if (z) {
            while ((i & (-128)) != 0) {
                int i2 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
                this.HzCpKshMOoaw76hFcbOVRYMeRd = i2 + 1;
                VFd9YrZLozMNzEwgrLgkRG.M9e7PWhFYLD2lOGMker(bArr, i2, (byte) ((i | 128) & 255));
                i >>>= 7;
            }
            int i3 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
            this.HzCpKshMOoaw76hFcbOVRYMeRd = i3 + 1;
            VFd9YrZLozMNzEwgrLgkRG.M9e7PWhFYLD2lOGMker(bArr, i3, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i4 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
            this.HzCpKshMOoaw76hFcbOVRYMeRd = i4 + 1;
            bArr[i4] = (byte) ((i | 128) & 255);
            i >>>= 7;
        }
        int i5 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = i5 + 1;
        bArr[i5] = (byte) i;
    }

    public final void BDoqAMf0rlMRAnVghjC4qjG(long j) {
        boolean z = p59rPv72J9;
        byte[] bArr = this.GI83zq0G8e7zkn;
        if (z) {
            while ((j & (-128)) != 0) {
                int i = this.HzCpKshMOoaw76hFcbOVRYMeRd;
                this.HzCpKshMOoaw76hFcbOVRYMeRd = i + 1;
                VFd9YrZLozMNzEwgrLgkRG.M9e7PWhFYLD2lOGMker(bArr, i, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            int i2 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
            this.HzCpKshMOoaw76hFcbOVRYMeRd = i2 + 1;
            VFd9YrZLozMNzEwgrLgkRG.M9e7PWhFYLD2lOGMker(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i3 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
            this.HzCpKshMOoaw76hFcbOVRYMeRd = i3 + 1;
            bArr[i3] = (byte) ((((int) j) | 128) & 255);
            j >>>= 7;
        }
        int i4 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = i4 + 1;
        bArr[i4] = (byte) j;
    }

    public final void ByTQIhgl7ezGvHXEd(int i) {
        int i2 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        int i3 = i2 + 1;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = i3;
        byte[] bArr = this.GI83zq0G8e7zkn;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.HzCpKshMOoaw76hFcbOVRYMeRd = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public final void DNP7yXLsojH0rPMHr8fUY14M(byte[] bArr, int i, int i2) {
        int i3 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        int i4 = this.M9e7PWhFYLD2lOGMker;
        int i5 = i4 - i3;
        byte[] bArr2 = this.GI83zq0G8e7zkn;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.HzCpKshMOoaw76hFcbOVRYMeRd += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = i4;
        Pf1HsU8AK92buCoUaexm5AC();
        if (i7 > i4) {
            this.KUYypEB4eNWOZWVDpH.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.HzCpKshMOoaw76hFcbOVRYMeRd = i7;
        }
    }

    public final void DUIkOzkuF3hUt(int i, int i2) {
        u04PSKYidgCYrHk5CAtyMkPOXcY((i << 3) | i2);
    }

    public final void Hf6zp5JYLjGyFD2HXbpHA9(int i, int i2) {
        zyiF0wv9HozxGOIDt8PvVp(14);
        e1gEV3X9xwmHj(i, 5);
        ByTQIhgl7ezGvHXEd(i2);
    }

    public final void KMiA9Sqk243eQkFNNoS(byte b) {
        if (this.HzCpKshMOoaw76hFcbOVRYMeRd == this.M9e7PWhFYLD2lOGMker) {
            Pf1HsU8AK92buCoUaexm5AC();
        }
        int i = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = i + 1;
        this.GI83zq0G8e7zkn[i] = b;
    }

    public final void MnclyDIMxkCs4NkUREm(String str) throws TaCpbqw4AFIDupGJUuKvDdfZ {
        try {
            int length = str.length() * 3;
            int iR0dB0ojIy6g8mnk1 = r0dB0ojIy6g8mnk1(length);
            int i = iR0dB0ojIy6g8mnk1 + length;
            int i2 = this.M9e7PWhFYLD2lOGMker;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iKo09zE6UAgwkV = eFgoNcoFBGOQHfSJanp.VxUQ9tBhpHJ2AAEDNW8sghc4m.ko09zE6UAgwkV(str, bArr, 0, length);
                u04PSKYidgCYrHk5CAtyMkPOXcY(iKo09zE6UAgwkV);
                DNP7yXLsojH0rPMHr8fUY14M(bArr, 0, iKo09zE6UAgwkV);
                return;
            }
            if (i > i2 - this.HzCpKshMOoaw76hFcbOVRYMeRd) {
                Pf1HsU8AK92buCoUaexm5AC();
            }
            int iR0dB0ojIy6g8mnk12 = r0dB0ojIy6g8mnk1(str.length());
            int i3 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
            byte[] bArr2 = this.GI83zq0G8e7zkn;
            try {
                if (iR0dB0ojIy6g8mnk12 == iR0dB0ojIy6g8mnk1) {
                    int i4 = i3 + iR0dB0ojIy6g8mnk12;
                    this.HzCpKshMOoaw76hFcbOVRYMeRd = i4;
                    int iKo09zE6UAgwkV2 = eFgoNcoFBGOQHfSJanp.VxUQ9tBhpHJ2AAEDNW8sghc4m.ko09zE6UAgwkV(str, bArr2, i4, i2 - i4);
                    this.HzCpKshMOoaw76hFcbOVRYMeRd = i3;
                    AFOcXGdvoTMuqwiG8tD((iKo09zE6UAgwkV2 - i3) - iR0dB0ojIy6g8mnk12);
                    this.HzCpKshMOoaw76hFcbOVRYMeRd = iKo09zE6UAgwkV2;
                } else {
                    int iVxUQ9tBhpHJ2AAEDNW8sghc4m = eFgoNcoFBGOQHfSJanp.VxUQ9tBhpHJ2AAEDNW8sghc4m(str);
                    AFOcXGdvoTMuqwiG8tD(iVxUQ9tBhpHJ2AAEDNW8sghc4m);
                    this.HzCpKshMOoaw76hFcbOVRYMeRd = eFgoNcoFBGOQHfSJanp.VxUQ9tBhpHJ2AAEDNW8sghc4m.ko09zE6UAgwkV(str, bArr2, this.HzCpKshMOoaw76hFcbOVRYMeRd, iVxUQ9tBhpHJ2AAEDNW8sghc4m);
                }
            } catch (dGW2434XmPszy6t e) {
                this.HzCpKshMOoaw76hFcbOVRYMeRd = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new TaCpbqw4AFIDupGJUuKvDdfZ(e2);
            }
        } catch (dGW2434XmPszy6t e3) {
            q1wNbhk2O6.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(iJsJOOjKyWEygkebu5yh4.VxUQ9tBhpHJ2AAEDNW8sghc4m);
            try {
                u04PSKYidgCYrHk5CAtyMkPOXcY(bytes.length);
                rE05n5RsRkyWKIeA9cmLXAKv4Hze(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new TaCpbqw4AFIDupGJUuKvDdfZ(e4);
            }
        }
    }

    public final void N08cqkgagFuPYWJcTFAQVt(int i, long j) {
        zyiF0wv9HozxGOIDt8PvVp(18);
        e1gEV3X9xwmHj(i, 1);
        tpEo0fy9FaoJYrSFHRfIK6(j);
    }

    public final void Pf1HsU8AK92buCoUaexm5AC() {
        this.KUYypEB4eNWOZWVDpH.write(this.GI83zq0G8e7zkn, 0, this.HzCpKshMOoaw76hFcbOVRYMeRd);
        this.HzCpKshMOoaw76hFcbOVRYMeRd = 0;
    }

    public final void PfK8qHOJoCLG(int i, uDRHTE5hsm7JpGOnK7F udrhte5hsm7jpgonk7f) {
        DUIkOzkuF3hUt(i, 2);
        ScSj9HEorWkb3bIb1HyeKVoW(udrhte5hsm7jpgonk7f);
    }

    public final void QwZcr6V7mfRUaij0Bp3zpr5ClBcxr(long j) {
        zyiF0wv9HozxGOIDt8PvVp(8);
        tpEo0fy9FaoJYrSFHRfIK6(j);
    }

    public final void ScSj9HEorWkb3bIb1HyeKVoW(uDRHTE5hsm7JpGOnK7F udrhte5hsm7jpgonk7f) {
        u04PSKYidgCYrHk5CAtyMkPOXcY(udrhte5hsm7jpgonk7f.size());
        rE05n5RsRkyWKIeA9cmLXAKv4Hze(udrhte5hsm7jpgonk7f.ZfQNn8hdWlEQ5cR94249PDsLR, udrhte5hsm7jpgonk7f.LaeGQIruHQu81hfJldjMOQSVblH3x(), udrhte5hsm7jpgonk7f.size());
    }

    public final void SdPSMGy13dYOH9CwolJVKu21val(int i) {
        if (i >= 0) {
            u04PSKYidgCYrHk5CAtyMkPOXcY(i);
        } else {
            W5cWMjmJv6kqhapkBbKZYxBWC2p(i);
        }
    }

    public final void VAUpruoPNdSAVh(int i, hKY45oVk0UzhW2UdRV hky45ovk0uzhw2udrv, daoEmhfC82oCShPhDmB3 daoemhfc82ocshphdmb3) {
        DUIkOzkuF3hUt(i, 2);
        u04PSKYidgCYrHk5CAtyMkPOXcY(hky45ovk0uzhw2udrv.VxUQ9tBhpHJ2AAEDNW8sghc4m(daoemhfc82ocshphdmb3));
        daoemhfc82ocshphdmb3.LaeGQIruHQu81hfJldjMOQSVblH3x(hky45ovk0uzhw2udrv, this.NSjgqmGjEzuugn2SsG1mZFP);
    }

    public final void W5cWMjmJv6kqhapkBbKZYxBWC2p(long j) {
        zyiF0wv9HozxGOIDt8PvVp(10);
        BDoqAMf0rlMRAnVghjC4qjG(j);
    }

    public final void dWgUTvLDR2aOE7pFLrMrHP(int i, long j) {
        zyiF0wv9HozxGOIDt8PvVp(20);
        e1gEV3X9xwmHj(i, 0);
        BDoqAMf0rlMRAnVghjC4qjG(j);
    }

    public final void e1gEV3X9xwmHj(int i, int i2) {
        AFOcXGdvoTMuqwiG8tD((i << 3) | i2);
    }

    public final void nNOZCSz1a7S(int i, boolean z) {
        zyiF0wv9HozxGOIDt8PvVp(11);
        e1gEV3X9xwmHj(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = i2 + 1;
        this.GI83zq0G8e7zkn[i2] = b;
    }

    public final void pCrI77IVeIpJnmCUHd(int i) {
        zyiF0wv9HozxGOIDt8PvVp(4);
        ByTQIhgl7ezGvHXEd(i);
    }

    @Override // com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao
    public final void rE05n5RsRkyWKIeA9cmLXAKv4Hze(byte[] bArr, int i, int i2) {
        DNP7yXLsojH0rPMHr8fUY14M(bArr, i, i2);
    }

    public final void tf2p6GzNN7uQY7Lun0pJ(String str, int i) throws TaCpbqw4AFIDupGJUuKvDdfZ {
        DUIkOzkuF3hUt(i, 2);
        MnclyDIMxkCs4NkUREm(str);
    }

    public final void tpEo0fy9FaoJYrSFHRfIK6(long j) {
        int i = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        int i2 = i + 1;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = i2;
        byte[] bArr = this.GI83zq0G8e7zkn;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.HzCpKshMOoaw76hFcbOVRYMeRd = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void u04PSKYidgCYrHk5CAtyMkPOXcY(int i) {
        zyiF0wv9HozxGOIDt8PvVp(5);
        AFOcXGdvoTMuqwiG8tD(i);
    }

    public final void uQ30BFNHbnwcS96Dk6jHUECPfOq(int i, int i2) {
        zyiF0wv9HozxGOIDt8PvVp(20);
        e1gEV3X9xwmHj(i, 0);
        if (i2 >= 0) {
            AFOcXGdvoTMuqwiG8tD(i2);
        } else {
            BDoqAMf0rlMRAnVghjC4qjG(i2);
        }
    }

    public final void w45GC0xYcf4u8gmC(int i, int i2) {
        zyiF0wv9HozxGOIDt8PvVp(20);
        e1gEV3X9xwmHj(i, 0);
        AFOcXGdvoTMuqwiG8tD(i2);
    }

    public final void zyiF0wv9HozxGOIDt8PvVp(int i) {
        if (this.M9e7PWhFYLD2lOGMker - this.HzCpKshMOoaw76hFcbOVRYMeRd < i) {
            Pf1HsU8AK92buCoUaexm5AC();
        }
    }
}
