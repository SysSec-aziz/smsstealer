package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ngO5JXZkj8nfh41LltHvEjUc extends b3gMCtHb2HlbiFs0vC {
    public static String AFOcXGdvoTMuqwiG8tD(String str, String str2, String str3) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "<this>");
        int iG479XgNG9rK8jPPbSXr = cwhrCnoVJBjJE2CBEAvBopmgF.G479XgNG9rK8jPPbSXr(str, str2, 0, false);
        if (iG479XgNG9rK8jPPbSXr < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iG479XgNG9rK8jPPbSXr);
            sb.append(str3);
            i2 = iG479XgNG9rK8jPPbSXr + length;
            if (iG479XgNG9rK8jPPbSXr >= str.length()) {
                break;
            }
            iG479XgNG9rK8jPPbSXr = cwhrCnoVJBjJE2CBEAvBopmgF.G479XgNG9rK8jPPbSXr(str, str2, iG479XgNG9rK8jPPbSXr + i, false);
        } while (iG479XgNG9rK8jPPbSXr > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "toString(...)");
        return string;
    }

    public static boolean BDoqAMf0rlMRAnVghjC4qjG(String str, String str2, int i, boolean z) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "<this>");
        return !z ? str.startsWith(str2, i) : e1gEV3X9xwmHj(i, 0, str2.length(), str, str2, z);
    }

    public static boolean ByTQIhgl7ezGvHXEd(String str, String str2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "<this>");
        ej6unYlOWMDF.pYmKDYlAmhudp(str2, "suffix");
        return str.endsWith(str2);
    }

    public static boolean e1gEV3X9xwmHj(int i, int i2, int i3, String str, String str2, boolean z) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "<this>");
        ej6unYlOWMDF.pYmKDYlAmhudp(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static boolean lxWWbfAOLs4jWzd7PSIiIJ(String str, String str2, boolean z) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "<this>");
        ej6unYlOWMDF.pYmKDYlAmhudp(str2, "prefix");
        return !z ? str.startsWith(str2) : e1gEV3X9xwmHj(0, 0, str2.length(), str, str2, z);
    }

    public static boolean tpEo0fy9FaoJYrSFHRfIK6(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }
}
