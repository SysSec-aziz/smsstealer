package com.vdodsodjsdt;

import java.io.Closeable;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class Gzdlhdn1ss implements Closeable {
    public String[] Ca81ebIan1u;
    public int HzCpKshMOoaw76hFcbOVRYMeRd;
    public String KUYypEB4eNWOZWVDpH;
    public long M9e7PWhFYLD2lOGMker;
    public final StringReader V57tEvNfxZVVcOCAOih5PKr;
    public int[] h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public int[] q1wNbhk2O6;
    public int pYmKDYlAmhudp = 2;
    public final char[] ZfQNn8hdWlEQ5cR94249PDsLR = new char[1024];
    public int LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
    public int NSjgqmGjEzuugn2SsG1mZFP = 0;
    public int GI83zq0G8e7zkn = 0;
    public int p59rPv72J9 = 1;

    static {
        FG8LIxsgYiLSfhN0jYKIKr.ZfQNn8hdWlEQ5cR94249PDsLR = new FG8LIxsgYiLSfhN0jYKIKr(15);
    }

    public Gzdlhdn1ss(StringReader stringReader) {
        int[] iArr = new int[32];
        this.q1wNbhk2O6 = iArr;
        iArr[0] = 6;
        this.Ca81ebIan1u = new String[32];
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = new int[32];
        this.V57tEvNfxZVVcOCAOih5PKr = stringReader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r11.LaeGQIruHQu81hfJldjMOQSVblH3x = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r11.LaeGQIruHQu81hfJldjMOQSVblH3x = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String CixTK5ZX8oWXHz34qHYV(char r12) throws com.vdodsodjsdt.UW0OfzFGj7 {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.LaeGQIruHQu81hfJldjMOQSVblH3x
            int r3 = r11.zIvmSL0wzmmKGc3X39b2Gw2mUGE
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r11.ZfQNn8hdWlEQ5cR94249PDsLR
            if (r2 >= r4) goto L6b
            int r8 = r2 + 1
            char r2 = r7[r2]
            int r9 = r11.pYmKDYlAmhudp
            r10 = 3
            if (r9 != r10) goto L23
            r9 = 32
            if (r2 < r9) goto L1d
            goto L23
        L1d:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.vXWl0o6I4U59CgHs9(r12)
            throw r0
        L23:
            if (r2 != r12) goto L39
            r11.LaeGQIruHQu81hfJldjMOQSVblH3x = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L31
            java.lang.String r12 = new java.lang.String
            r12.<init>(r7, r3, r8)
            return r12
        L31:
            r1.append(r7, r3, r8)
            java.lang.String r12 = r1.toString()
            return r12
        L39:
            r9 = 92
            if (r2 != r9) goto L5e
            r11.LaeGQIruHQu81hfJldjMOQSVblH3x = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L4f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L4f:
            r1.append(r7, r3, r2)
            char r2 = r11.L8DMw02rUTs2w()
            r1.append(r2)
            int r2 = r11.LaeGQIruHQu81hfJldjMOQSVblH3x
            int r3 = r11.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            goto L6
        L5e:
            r5 = 10
            if (r2 != r5) goto L69
            int r2 = r11.ZLZeBXTMq0zDztBxtRTuCHrapQ
            int r2 = r2 + r6
            r11.ZLZeBXTMq0zDztBxtRTuCHrapQ = r2
            r11.NSjgqmGjEzuugn2SsG1mZFP = r8
        L69:
            r2 = r8
            goto L8
        L6b:
            if (r1 != 0) goto L7b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7b:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r11.LaeGQIruHQu81hfJldjMOQSVblH3x = r2
            boolean r2 = r11.RhfGHxtXxy0M0grmp2jkRjQg(r6)
            if (r2 == 0) goto L8a
            goto L2
        L8a:
            java.lang.String r12 = "Unterminated string"
            r11.vXWl0o6I4U59CgHs9(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.Gzdlhdn1ss.CixTK5ZX8oWXHz34qHYV(char):java.lang.String");
    }

    public final double HVEwbdULInpTNa0IG() throws IOException {
        int iM9e7PWhFYLD2lOGMker = this.GI83zq0G8e7zkn;
        if (iM9e7PWhFYLD2lOGMker == 0) {
            iM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker();
        }
        if (iM9e7PWhFYLD2lOGMker == 15) {
            this.GI83zq0G8e7zkn = 0;
            int[] iArr = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
            int i = this.p59rPv72J9 - 1;
            iArr[i] = iArr[i] + 1;
            return this.M9e7PWhFYLD2lOGMker;
        }
        if (iM9e7PWhFYLD2lOGMker == 16) {
            this.KUYypEB4eNWOZWVDpH = new String(this.ZfQNn8hdWlEQ5cR94249PDsLR, this.LaeGQIruHQu81hfJldjMOQSVblH3x, this.HzCpKshMOoaw76hFcbOVRYMeRd);
            this.LaeGQIruHQu81hfJldjMOQSVblH3x += this.HzCpKshMOoaw76hFcbOVRYMeRd;
        } else if (iM9e7PWhFYLD2lOGMker == 8 || iM9e7PWhFYLD2lOGMker == 9) {
            this.KUYypEB4eNWOZWVDpH = CixTK5ZX8oWXHz34qHYV(iM9e7PWhFYLD2lOGMker == 8 ? '\'' : '\"');
        } else if (iM9e7PWhFYLD2lOGMker == 10) {
            this.KUYypEB4eNWOZWVDpH = YdNRGRc4rly();
        } else if (iM9e7PWhFYLD2lOGMker != 11) {
            throw wdI7vzA3Qmcwd("a double");
        }
        this.GI83zq0G8e7zkn = 11;
        double d = Double.parseDouble(this.KUYypEB4eNWOZWVDpH);
        if (this.pYmKDYlAmhudp != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
            vXWl0o6I4U59CgHs9("JSON forbids NaN and infinities: " + d);
            throw null;
        }
        this.KUYypEB4eNWOZWVDpH = null;
        this.GI83zq0G8e7zkn = 0;
        int[] iArr2 = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        int i2 = this.p59rPv72J9 - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        LaeGQIruHQu81hfJldjMOQSVblH3x();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ItrQwCXbty5PZtje5JS() throws com.vdodsodjsdt.UW0OfzFGj7 {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.LaeGQIruHQu81hfJldjMOQSVblH3x
            int r2 = r1 + r0
            int r3 = r4.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            if (r2 >= r3) goto L51
            char[] r2 = r4.ZfQNn8hdWlEQ5cR94249PDsLR
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.LaeGQIruHQu81hfJldjMOQSVblH3x()
        L4b:
            int r1 = r4.LaeGQIruHQu81hfJldjMOQSVblH3x
            int r1 = r1 + r0
            r4.LaeGQIruHQu81hfJldjMOQSVblH3x = r1
            return
        L51:
            int r1 = r1 + r0
            r4.LaeGQIruHQu81hfJldjMOQSVblH3x = r1
            r0 = 1
            boolean r0 = r4.RhfGHxtXxy0M0grmp2jkRjQg(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.Gzdlhdn1ss.ItrQwCXbty5PZtje5JS():void");
    }

    public final void JUdwvN8LfOMa() {
        char c;
        do {
            if (this.LaeGQIruHQu81hfJldjMOQSVblH3x >= this.zIvmSL0wzmmKGc3X39b2Gw2mUGE && !RhfGHxtXxy0M0grmp2jkRjQg(1)) {
                return;
            }
            int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            int i2 = i + 1;
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = i2;
            c = this.ZfQNn8hdWlEQ5cR94249PDsLR[i];
            if (c == '\n') {
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ++;
                this.NSjgqmGjEzuugn2SsG1mZFP = i2;
                return;
            }
        } while (c != '\r');
    }

    public final void KUYypEB4eNWOZWVDpH() throws IOException {
        int iM9e7PWhFYLD2lOGMker = this.GI83zq0G8e7zkn;
        if (iM9e7PWhFYLD2lOGMker == 0) {
            iM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker();
        }
        if (iM9e7PWhFYLD2lOGMker != 4) {
            throw wdI7vzA3Qmcwd("END_ARRAY");
        }
        int i = this.p59rPv72J9;
        this.p59rPv72J9 = i - 1;
        int[] iArr = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.GI83zq0G8e7zkn = 0;
    }

    public final char L8DMw02rUTs2w() throws UW0OfzFGj7 {
        int i;
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x == this.zIvmSL0wzmmKGc3X39b2Gw2mUGE && !RhfGHxtXxy0M0grmp2jkRjQg(1)) {
            vXWl0o6I4U59CgHs9("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int i3 = i2 + 1;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i3;
        char[] cArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c == 'b') {
                            return '\b';
                        }
                        if (c == 'f') {
                            return '\f';
                        }
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c == 'r') {
                            return '\r';
                        }
                        if (c == 't') {
                            return '\t';
                        }
                        if (c != 'u') {
                            vXWl0o6I4U59CgHs9("Invalid escape sequence");
                            throw null;
                        }
                        if (i2 + 5 > this.zIvmSL0wzmmKGc3X39b2Gw2mUGE && !RhfGHxtXxy0M0grmp2jkRjQg(4)) {
                            vXWl0o6I4U59CgHs9("Unterminated escape sequence");
                            throw null;
                        }
                        int i4 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                        int i5 = i4 + 4;
                        int i6 = 0;
                        while (i4 < i5) {
                            char c2 = cArr[i4];
                            int i7 = i6 << 4;
                            if (c2 >= '0' && c2 <= '9') {
                                i = c2 - '0';
                            } else if (c2 >= 'a' && c2 <= 'f') {
                                i = c2 - 'W';
                            } else {
                                if (c2 < 'A' || c2 > 'F') {
                                    vXWl0o6I4U59CgHs9("Malformed Unicode escape \\u".concat(new String(cArr, this.LaeGQIruHQu81hfJldjMOQSVblH3x, 4)));
                                    throw null;
                                }
                                i = c2 - '7';
                            }
                            i6 = i + i7;
                            i4++;
                        }
                        this.LaeGQIruHQu81hfJldjMOQSVblH3x += 4;
                        return (char) i6;
                    }
                }
            }
            return c;
        }
        if (this.pYmKDYlAmhudp == 3) {
            vXWl0o6I4U59CgHs9("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ++;
        this.NSjgqmGjEzuugn2SsG1mZFP = i3;
        if (this.pYmKDYlAmhudp == 3) {
            vXWl0o6I4U59CgHs9("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() throws UW0OfzFGj7 {
        if (this.pYmKDYlAmhudp == 1) {
            return;
        }
        vXWl0o6I4U59CgHs9("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0218, code lost:
    
        if (aXO0LSrt8bKV(r12) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0270 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int M9e7PWhFYLD2lOGMker() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.Gzdlhdn1ss.M9e7PWhFYLD2lOGMker():int");
    }

    public final boolean O1xDAlBZZlZdoEf747lCFHld() throws IOException {
        int iM9e7PWhFYLD2lOGMker = this.GI83zq0G8e7zkn;
        if (iM9e7PWhFYLD2lOGMker == 0) {
            iM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker();
        }
        if (iM9e7PWhFYLD2lOGMker == 5) {
            this.GI83zq0G8e7zkn = 0;
            int[] iArr = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
            int i = this.p59rPv72J9 - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM9e7PWhFYLD2lOGMker != 6) {
            throw wdI7vzA3Qmcwd("a boolean");
        }
        this.GI83zq0G8e7zkn = 0;
        int[] iArr2 = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        int i2 = this.p59rPv72J9 - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public final boolean RhfGHxtXxy0M0grmp2jkRjQg(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.NSjgqmGjEzuugn2SsG1mZFP;
        int i5 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        this.NSjgqmGjEzuugn2SsG1mZFP = i4 - i5;
        int i6 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        char[] cArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
        do {
            int i8 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            int i9 = this.V57tEvNfxZVVcOCAOih5PKr.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE + i9;
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i2;
            if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ == 0 && (i3 = this.NSjgqmGjEzuugn2SsG1mZFP) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.LaeGQIruHQu81hfJldjMOQSVblH3x++;
                this.NSjgqmGjEzuugn2SsG1mZFP = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final String SuB3hEmTmbbRGAhtvOOmfKEon(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.p59rPv72J9;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.q1wNbhk2O6[i];
            switch (i3) {
                case 1:
                case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                    int i4 = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                    sb.append('.');
                    String str = this.Ca81ebIan1u[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                case g8kevnL6UKpr15IYtcPJXuLo1L4.BYTES_FIELD_NUMBER /* 8 */:
                    break;
                default:
                    throw new AssertionError(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Unknown scope value: ", i3));
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int TqcnImqkSWIKht(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.Gzdlhdn1ss.TqcnImqkSWIKht(boolean):int");
    }

    public final void V57tEvNfxZVVcOCAOih5PKr() throws IOException {
        int iM9e7PWhFYLD2lOGMker = this.GI83zq0G8e7zkn;
        if (iM9e7PWhFYLD2lOGMker == 0) {
            iM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker();
        }
        if (iM9e7PWhFYLD2lOGMker != 1) {
            throw wdI7vzA3Qmcwd("BEGIN_OBJECT");
        }
        gBaBUmihn5l4u(3);
        this.GI83zq0G8e7zkn = 0;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() throws IOException {
        int iM9e7PWhFYLD2lOGMker = this.GI83zq0G8e7zkn;
        if (iM9e7PWhFYLD2lOGMker == 0) {
            iM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker();
        }
        if (iM9e7PWhFYLD2lOGMker != 3) {
            throw wdI7vzA3Qmcwd("BEGIN_ARRAY");
        }
        gBaBUmihn5l4u(1);
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv[this.p59rPv72J9 - 1] = 0;
        this.GI83zq0G8e7zkn = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        LaeGQIruHQu81hfJldjMOQSVblH3x();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String YdNRGRc4rly() throws com.vdodsodjsdt.UW0OfzFGj7 {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.LaeGQIruHQu81hfJldjMOQSVblH3x
            int r4 = r3 + r2
            int r5 = r7.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            char[] r6 = r7.ZfQNn8hdWlEQ5cR94249PDsLR
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.LaeGQIruHQu81hfJldjMOQSVblH3x()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.RhfGHxtXxy0M0grmp2jkRjQg(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.LaeGQIruHQu81hfJldjMOQSVblH3x
            r0.append(r6, r3, r2)
            int r3 = r7.LaeGQIruHQu81hfJldjMOQSVblH3x
            int r3 = r3 + r2
            r7.LaeGQIruHQu81hfJldjMOQSVblH3x = r3
            r2 = 1
            boolean r2 = r7.RhfGHxtXxy0M0grmp2jkRjQg(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.LaeGQIruHQu81hfJldjMOQSVblH3x
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.LaeGQIruHQu81hfJldjMOQSVblH3x
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.LaeGQIruHQu81hfJldjMOQSVblH3x
            int r2 = r2 + r1
            r7.LaeGQIruHQu81hfJldjMOQSVblH3x = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.Gzdlhdn1ss.YdNRGRc4rly():java.lang.String");
    }

    public final boolean aXO0LSrt8bKV(char c) throws UW0OfzFGj7 {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        LaeGQIruHQu81hfJldjMOQSVblH3x();
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.GI83zq0G8e7zkn = 0;
        this.q1wNbhk2O6[0] = 8;
        this.p59rPv72J9 = 1;
        this.V57tEvNfxZVVcOCAOih5PKr.close();
    }

    public final void d9zDyyznnp3oaDT1Ug() throws IOException {
        int iM9e7PWhFYLD2lOGMker = this.GI83zq0G8e7zkn;
        if (iM9e7PWhFYLD2lOGMker == 0) {
            iM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker();
        }
        if (iM9e7PWhFYLD2lOGMker != 7) {
            throw wdI7vzA3Qmcwd("null");
        }
        this.GI83zq0G8e7zkn = 0;
        int[] iArr = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        int i = this.p59rPv72J9 - 1;
        iArr[i] = iArr[i] + 1;
    }

    public final void gBaBUmihn5l4u(int i) throws UW0OfzFGj7 {
        int i2 = this.p59rPv72J9;
        if (i2 - 1 >= 255) {
            throw new UW0OfzFGj7("Nesting limit 255 reached" + vE4yDIjexsP2lGjLaTcB());
        }
        int[] iArr = this.q1wNbhk2O6;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.q1wNbhk2O6 = Arrays.copyOf(iArr, i3);
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = Arrays.copyOf(this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv, i3);
            this.Ca81ebIan1u = (String[]) Arrays.copyOf(this.Ca81ebIan1u, i3);
        }
        int[] iArr2 = this.q1wNbhk2O6;
        int i4 = this.p59rPv72J9;
        this.p59rPv72J9 = i4 + 1;
        iArr2[i4] = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void hKs1wlZyvtUNaW1f5ABIGacfPcvX() throws IOException {
        int i = 0;
        do {
            int iM9e7PWhFYLD2lOGMker = this.GI83zq0G8e7zkn;
            if (iM9e7PWhFYLD2lOGMker == 0) {
                iM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker();
            }
            switch (iM9e7PWhFYLD2lOGMker) {
                case 1:
                    gBaBUmihn5l4u(3);
                    i++;
                    this.GI83zq0G8e7zkn = 0;
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                    if (i == 0) {
                        this.Ca81ebIan1u[this.p59rPv72J9 - 1] = null;
                    }
                    this.p59rPv72J9--;
                    i--;
                    this.GI83zq0G8e7zkn = 0;
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                    gBaBUmihn5l4u(1);
                    i++;
                    this.GI83zq0G8e7zkn = 0;
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                    this.p59rPv72J9--;
                    i--;
                    this.GI83zq0G8e7zkn = 0;
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                case 11:
                case 15:
                default:
                    this.GI83zq0G8e7zkn = 0;
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.BYTES_FIELD_NUMBER /* 8 */:
                    lQ0rO9lhQIyVe7Rp6('\'');
                    this.GI83zq0G8e7zkn = 0;
                    break;
                case 9:
                    lQ0rO9lhQIyVe7Rp6('\"');
                    this.GI83zq0G8e7zkn = 0;
                    break;
                case 10:
                    ItrQwCXbty5PZtje5JS();
                    this.GI83zq0G8e7zkn = 0;
                    break;
                case 12:
                    lQ0rO9lhQIyVe7Rp6('\'');
                    if (i == 0) {
                        this.Ca81ebIan1u[this.p59rPv72J9 - 1] = "<skipped>";
                    }
                    this.GI83zq0G8e7zkn = 0;
                    break;
                case 13:
                    lQ0rO9lhQIyVe7Rp6('\"');
                    if (i == 0) {
                        this.Ca81ebIan1u[this.p59rPv72J9 - 1] = "<skipped>";
                    }
                    this.GI83zq0G8e7zkn = 0;
                    break;
                case 14:
                    ItrQwCXbty5PZtje5JS();
                    if (i == 0) {
                        this.Ca81ebIan1u[this.p59rPv72J9 - 1] = "<skipped>";
                    }
                    this.GI83zq0G8e7zkn = 0;
                    break;
                case 16:
                    this.LaeGQIruHQu81hfJldjMOQSVblH3x += this.HzCpKshMOoaw76hFcbOVRYMeRd;
                    this.GI83zq0G8e7zkn = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        int i2 = this.p59rPv72J9 - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    public final String iKANjmyTSxO6v6UuLPdu7DxOjlS() throws IOException {
        String strCixTK5ZX8oWXHz34qHYV;
        int iM9e7PWhFYLD2lOGMker = this.GI83zq0G8e7zkn;
        if (iM9e7PWhFYLD2lOGMker == 0) {
            iM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker();
        }
        if (iM9e7PWhFYLD2lOGMker == 14) {
            strCixTK5ZX8oWXHz34qHYV = YdNRGRc4rly();
        } else if (iM9e7PWhFYLD2lOGMker == 12) {
            strCixTK5ZX8oWXHz34qHYV = CixTK5ZX8oWXHz34qHYV('\'');
        } else {
            if (iM9e7PWhFYLD2lOGMker != 13) {
                throw wdI7vzA3Qmcwd("a name");
            }
            strCixTK5ZX8oWXHz34qHYV = CixTK5ZX8oWXHz34qHYV('\"');
        }
        this.GI83zq0G8e7zkn = 0;
        this.Ca81ebIan1u[this.p59rPv72J9 - 1] = strCixTK5ZX8oWXHz34qHYV;
        return strCixTK5ZX8oWXHz34qHYV;
    }

    public final void lQ0rO9lhQIyVe7Rp6(char c) throws UW0OfzFGj7 {
        do {
            int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            int i2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.ZfQNn8hdWlEQ5cR94249PDsLR[i];
                if (c2 == c) {
                    this.LaeGQIruHQu81hfJldjMOQSVblH3x = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.LaeGQIruHQu81hfJldjMOQSVblH3x = i3;
                    L8DMw02rUTs2w();
                    i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                    i2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                } else {
                    if (c2 == '\n') {
                        this.ZLZeBXTMq0zDztBxtRTuCHrapQ++;
                        this.NSjgqmGjEzuugn2SsG1mZFP = i3;
                    }
                    i = i3;
                }
            }
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = i;
        } while (RhfGHxtXxy0M0grmp2jkRjQg(1));
        vXWl0o6I4U59CgHs9("Unterminated string");
        throw null;
    }

    public final boolean pzqP2AqKW6J5PO8zCKnW() throws IOException {
        int iM9e7PWhFYLD2lOGMker = this.GI83zq0G8e7zkn;
        if (iM9e7PWhFYLD2lOGMker == 0) {
            iM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker();
        }
        return (iM9e7PWhFYLD2lOGMker == 2 || iM9e7PWhFYLD2lOGMker == 4 || iM9e7PWhFYLD2lOGMker == 17) ? false : true;
    }

    public final void q11o1hieEkZDhF1MGOZI26oZiDT() throws IOException {
        int iM9e7PWhFYLD2lOGMker = this.GI83zq0G8e7zkn;
        if (iM9e7PWhFYLD2lOGMker == 0) {
            iM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker();
        }
        if (iM9e7PWhFYLD2lOGMker != 2) {
            throw wdI7vzA3Qmcwd("END_OBJECT");
        }
        int i = this.p59rPv72J9;
        int i2 = i - 1;
        this.p59rPv72J9 = i2;
        this.Ca81ebIan1u[i2] = null;
        int[] iArr = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.GI83zq0G8e7zkn = 0;
    }

    public final long qygqjTppWwx992() throws IOException {
        int iM9e7PWhFYLD2lOGMker = this.GI83zq0G8e7zkn;
        if (iM9e7PWhFYLD2lOGMker == 0) {
            iM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker();
        }
        if (iM9e7PWhFYLD2lOGMker == 15) {
            this.GI83zq0G8e7zkn = 0;
            int[] iArr = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
            int i = this.p59rPv72J9 - 1;
            iArr[i] = iArr[i] + 1;
            return this.M9e7PWhFYLD2lOGMker;
        }
        if (iM9e7PWhFYLD2lOGMker == 16) {
            this.KUYypEB4eNWOZWVDpH = new String(this.ZfQNn8hdWlEQ5cR94249PDsLR, this.LaeGQIruHQu81hfJldjMOQSVblH3x, this.HzCpKshMOoaw76hFcbOVRYMeRd);
            this.LaeGQIruHQu81hfJldjMOQSVblH3x += this.HzCpKshMOoaw76hFcbOVRYMeRd;
        } else {
            if (iM9e7PWhFYLD2lOGMker != 8 && iM9e7PWhFYLD2lOGMker != 9 && iM9e7PWhFYLD2lOGMker != 10) {
                throw wdI7vzA3Qmcwd("a long");
            }
            if (iM9e7PWhFYLD2lOGMker == 10) {
                this.KUYypEB4eNWOZWVDpH = YdNRGRc4rly();
            } else {
                this.KUYypEB4eNWOZWVDpH = CixTK5ZX8oWXHz34qHYV(iM9e7PWhFYLD2lOGMker == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.KUYypEB4eNWOZWVDpH);
                this.GI83zq0G8e7zkn = 0;
                int[] iArr2 = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                int i2 = this.p59rPv72J9 - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.GI83zq0G8e7zkn = 11;
        double d = Double.parseDouble(this.KUYypEB4eNWOZWVDpH);
        long j2 = (long) d;
        if (j2 != d) {
            throw new NumberFormatException("Expected a long but was " + this.KUYypEB4eNWOZWVDpH + vE4yDIjexsP2lGjLaTcB());
        }
        this.KUYypEB4eNWOZWVDpH = null;
        this.GI83zq0G8e7zkn = 0;
        int[] iArr3 = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        int i3 = this.p59rPv72J9 - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    public final String toString() {
        return Gzdlhdn1ss.class.getSimpleName() + vE4yDIjexsP2lGjLaTcB();
    }

    public final String vE4yDIjexsP2lGjLaTcB() {
        return " at line " + (this.ZLZeBXTMq0zDztBxtRTuCHrapQ + 1) + " column " + ((this.LaeGQIruHQu81hfJldjMOQSVblH3x - this.NSjgqmGjEzuugn2SsG1mZFP) + 1) + " path " + SuB3hEmTmbbRGAhtvOOmfKEon(false);
    }

    public final void vXWl0o6I4U59CgHs9(String str) throws UW0OfzFGj7 {
        throw new UW0OfzFGj7(str + vE4yDIjexsP2lGjLaTcB() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
    }

    public final int wRCD0SdqWCowdYU7bmzN() throws IOException {
        int iM9e7PWhFYLD2lOGMker = this.GI83zq0G8e7zkn;
        if (iM9e7PWhFYLD2lOGMker == 0) {
            iM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker();
        }
        switch (iM9e7PWhFYLD2lOGMker) {
            case 1:
                return 3;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                return 4;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                return 1;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                return 2;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                return 8;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                return 9;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final IllegalStateException wdI7vzA3Qmcwd(String str) {
        String str2 = wRCD0SdqWCowdYU7bmzN() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbKUYypEB4eNWOZWVDpH = u9SlVAuoWhQUfJ.KUYypEB4eNWOZWVDpH("Expected ", str, " but was ");
        sbKUYypEB4eNWOZWVDpH.append(u9SlVAuoWhQUfJ.pYmKDYlAmhudp(wRCD0SdqWCowdYU7bmzN()));
        sbKUYypEB4eNWOZWVDpH.append(vE4yDIjexsP2lGjLaTcB());
        sbKUYypEB4eNWOZWVDpH.append("\nSee ");
        sbKUYypEB4eNWOZWVDpH.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbKUYypEB4eNWOZWVDpH.toString());
    }

    public final int y1NaPKTl7R18DOr6e8i5() throws IOException {
        int iM9e7PWhFYLD2lOGMker = this.GI83zq0G8e7zkn;
        if (iM9e7PWhFYLD2lOGMker == 0) {
            iM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker();
        }
        if (iM9e7PWhFYLD2lOGMker == 15) {
            long j = this.M9e7PWhFYLD2lOGMker;
            int i = (int) j;
            if (j != i) {
                throw new NumberFormatException("Expected an int but was " + this.M9e7PWhFYLD2lOGMker + vE4yDIjexsP2lGjLaTcB());
            }
            this.GI83zq0G8e7zkn = 0;
            int[] iArr = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
            int i2 = this.p59rPv72J9 - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iM9e7PWhFYLD2lOGMker == 16) {
            this.KUYypEB4eNWOZWVDpH = new String(this.ZfQNn8hdWlEQ5cR94249PDsLR, this.LaeGQIruHQu81hfJldjMOQSVblH3x, this.HzCpKshMOoaw76hFcbOVRYMeRd);
            this.LaeGQIruHQu81hfJldjMOQSVblH3x += this.HzCpKshMOoaw76hFcbOVRYMeRd;
        } else {
            if (iM9e7PWhFYLD2lOGMker != 8 && iM9e7PWhFYLD2lOGMker != 9 && iM9e7PWhFYLD2lOGMker != 10) {
                throw wdI7vzA3Qmcwd("an int");
            }
            if (iM9e7PWhFYLD2lOGMker == 10) {
                this.KUYypEB4eNWOZWVDpH = YdNRGRc4rly();
            } else {
                this.KUYypEB4eNWOZWVDpH = CixTK5ZX8oWXHz34qHYV(iM9e7PWhFYLD2lOGMker == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.KUYypEB4eNWOZWVDpH);
                this.GI83zq0G8e7zkn = 0;
                int[] iArr2 = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                int i4 = this.p59rPv72J9 - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.GI83zq0G8e7zkn = 11;
        double d = Double.parseDouble(this.KUYypEB4eNWOZWVDpH);
        int i5 = (int) d;
        if (i5 != d) {
            throw new NumberFormatException("Expected an int but was " + this.KUYypEB4eNWOZWVDpH + vE4yDIjexsP2lGjLaTcB());
        }
        this.KUYypEB4eNWOZWVDpH = null;
        this.GI83zq0G8e7zkn = 0;
        int[] iArr3 = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        int i6 = this.p59rPv72J9 - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    public final String ymT6yQrus3w() throws IOException {
        String str;
        int iM9e7PWhFYLD2lOGMker = this.GI83zq0G8e7zkn;
        if (iM9e7PWhFYLD2lOGMker == 0) {
            iM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker();
        }
        if (iM9e7PWhFYLD2lOGMker == 10) {
            str = YdNRGRc4rly();
        } else if (iM9e7PWhFYLD2lOGMker == 8) {
            str = CixTK5ZX8oWXHz34qHYV('\'');
        } else if (iM9e7PWhFYLD2lOGMker == 9) {
            str = CixTK5ZX8oWXHz34qHYV('\"');
        } else if (iM9e7PWhFYLD2lOGMker == 11) {
            str = this.KUYypEB4eNWOZWVDpH;
            this.KUYypEB4eNWOZWVDpH = null;
        } else if (iM9e7PWhFYLD2lOGMker == 15) {
            str = Long.toString(this.M9e7PWhFYLD2lOGMker);
        } else {
            if (iM9e7PWhFYLD2lOGMker != 16) {
                throw wdI7vzA3Qmcwd("a string");
            }
            str = new String(this.ZfQNn8hdWlEQ5cR94249PDsLR, this.LaeGQIruHQu81hfJldjMOQSVblH3x, this.HzCpKshMOoaw76hFcbOVRYMeRd);
            this.LaeGQIruHQu81hfJldjMOQSVblH3x += this.HzCpKshMOoaw76hFcbOVRYMeRd;
        }
        this.GI83zq0G8e7zkn = 0;
        int[] iArr = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        int i = this.p59rPv72J9 - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }
}
