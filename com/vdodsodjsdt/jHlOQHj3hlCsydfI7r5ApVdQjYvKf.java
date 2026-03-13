package com.vdodsodjsdt;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jHlOQHj3hlCsydfI7r5ApVdQjYvKf {
    public static final byte[] VxUQ9tBhpHJ2AAEDNW8sghc4m = new byte[0];

    /* JADX WARN: Code restructure failed: missing block: B:76:0x014e, code lost:
    
        continue;
     */
    static {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.jHlOQHj3hlCsydfI7r5ApVdQjYvKf.<clinit>():void");
    }

    public static final String[] GI83zq0G8e7zkn(String[] strArr, String[] strArr2, Comparator comparator) {
        ej6unYlOWMDF.pYmKDYlAmhudp(strArr, "<this>");
        ej6unYlOWMDF.pYmKDYlAmhudp(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final int HzCpKshMOoaw76hFcbOVRYMeRd(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final int KUYypEB4eNWOZWVDpH(hy3v1zJcCYok89Y1iAeFhN66 hy3v1zjccyok89y1iaefhn66) {
        ej6unYlOWMDF.pYmKDYlAmhudp(hy3v1zjccyok89y1iaefhn66, "<this>");
        return (hy3v1zjccyok89y1iaefhn66.readByte() & 255) | ((hy3v1zjccyok89y1iaefhn66.readByte() & 255) << 16) | ((hy3v1zjccyok89y1iaefhn66.readByte() & 255) << 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean LaeGQIruHQu81hfJldjMOQSVblH3x(java.lang.String[] r7, java.lang.String[] r8, java.util.Comparator r9) {
        /*
            java.lang.String r0 = "<this>"
            com.vdodsodjsdt.ej6unYlOWMDF.pYmKDYlAmhudp(r7, r0)
            int r0 = r7.length
            r1 = 0
            if (r0 != 0) goto La
            goto L3b
        La:
            if (r8 == 0) goto L3b
            int r0 = r8.length
            if (r0 != 0) goto L10
            goto L3b
        L10:
            int r0 = r7.length
            r2 = r1
        L12:
            if (r2 >= r0) goto L3b
            r3 = r7[r2]
            r4 = r1
        L17:
            int r5 = r8.length
            r6 = 1
            if (r4 >= r5) goto L1d
            r5 = r6
            goto L1e
        L1d:
            r5 = r1
        L1e:
            if (r5 == 0) goto L38
            int r5 = r4 + 1
            r4 = r8[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2d
            int r4 = r9.compare(r3, r4)
            if (r4 != 0) goto L2b
            return r6
        L2b:
            r4 = r5
            goto L17
        L2d:
            r7 = move-exception
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r7)
            throw r8
        L38:
            int r2 = r2 + 1
            goto L12
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.jHlOQHj3hlCsydfI7r5ApVdQjYvKf.LaeGQIruHQu81hfJldjMOQSVblH3x(java.lang.String[], java.lang.String[], java.util.Comparator):boolean");
    }

    public static final boolean M9e7PWhFYLD2lOGMker(String str) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "name");
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int NSjgqmGjEzuugn2SsG1mZFP(String str, int i, int i2) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final int V57tEvNfxZVVcOCAOih5PKr(int i, int i2, String str, String str2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "<this>");
        while (i < i2) {
            if (cwhrCnoVJBjJE2CBEAvBopmgF.VOvSEdhaZyc0oOGQ8(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final void VxUQ9tBhpHJ2AAEDNW8sghc4m(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("length=" + j + ", offset=" + j2 + ", count=" + j2);
        }
    }

    public static final int ZLZeBXTMq0zDztBxtRTuCHrapQ(String str, int i, int i2) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int ZfQNn8hdWlEQ5cR94249PDsLR(String str, char c, int i, int i2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "<this>");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final String p59rPv72J9(String str, int i, int i2) {
        int iZLZeBXTMq0zDztBxtRTuCHrapQ = ZLZeBXTMq0zDztBxtRTuCHrapQ(str, i, i2);
        String strSubstring = str.substring(iZLZeBXTMq0zDztBxtRTuCHrapQ, NSjgqmGjEzuugn2SsG1mZFP(str, iZLZeBXTMq0zDztBxtRTuCHrapQ, i2));
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int q1wNbhk2O6(String str, int i) {
        if (str != null) {
            try {
                long j = Long.parseLong(str);
                if (j > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j < 0) {
                    return 0;
                }
                return (int) j;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final int zIvmSL0wzmmKGc3X39b2Gw2mUGE(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (ej6unYlOWMDF.ko09zE6UAgwkV(cCharAt, 31) <= 0 || ej6unYlOWMDF.ko09zE6UAgwkV(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final void zzpBGItXfub0yWj(Closeable closeable) {
        ej6unYlOWMDF.pYmKDYlAmhudp(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }
}
