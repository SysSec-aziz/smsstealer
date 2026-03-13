package com.vdodsodjsdt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class cwhrCnoVJBjJE2CBEAvBopmgF extends ngO5JXZkj8nfh41LltHvEjUc {
    public static boolean DNP7yXLsojH0rPMHr8fUY14M(String str) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "<this>");
        for (int i = 0; i < str.length(); i++) {
            if (!F44whnLsbQ.iKANjmyTSxO6v6UuLPdu7DxOjlS(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final int G479XgNG9rK8jPPbSXr(CharSequence charSequence, String str, int i, boolean z) {
        ej6unYlOWMDF.pYmKDYlAmhudp(charSequence, "<this>");
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        stS3uecPKs3MU4EfeT sts3uecpks3mu4efet = new stS3uecPKs3MU4EfeT(i, length, 1);
        boolean z2 = charSequence instanceof String;
        int i2 = sts3uecpks3mu4efet.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int i3 = sts3uecpks3mu4efet.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i4 = sts3uecpks3mu4efet.V57tEvNfxZVVcOCAOih5PKr;
        if (!z2 || !(str instanceof String)) {
            boolean z3 = z;
            if ((i2 <= 0 || i4 > i3) && (i2 >= 0 || i3 > i4)) {
                return -1;
            }
            while (true) {
                CharSequence charSequence2 = charSequence;
                boolean z4 = z3;
                z3 = z4;
                if (Hf6zp5JYLjGyFD2HXbpHA9(str, 0, charSequence2, i4, str.length(), z4)) {
                    return i4;
                }
                if (i4 == i3) {
                    return -1;
                }
                i4 += i2;
                charSequence = charSequence2;
            }
        } else {
            if ((i2 <= 0 || i4 > i3) && (i2 >= 0 || i3 > i4)) {
                return -1;
            }
            int i5 = i4;
            while (true) {
                String str2 = str;
                boolean z5 = z;
                if (ngO5JXZkj8nfh41LltHvEjUc.e1gEV3X9xwmHj(0, i5, str.length(), str2, (String) charSequence, z5)) {
                    return i5;
                }
                if (i5 == i3) {
                    return -1;
                }
                i5 += i2;
                str = str2;
                z = z5;
            }
        }
    }

    public static final boolean Hf6zp5JYLjGyFD2HXbpHA9(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        ej6unYlOWMDF.pYmKDYlAmhudp(charSequence, "<this>");
        ej6unYlOWMDF.pYmKDYlAmhudp(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!F44whnLsbQ.ko09zE6UAgwkV(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final int KMiA9Sqk243eQkFNNoS(CharSequence charSequence, char[] cArr, int i, boolean z) {
        ej6unYlOWMDF.pYmKDYlAmhudp(charSequence, "<this>");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(vmp19D2MODlOL.r0dB0ojIy6g8mnk1(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int iR0dB0ojIy6g8mnk1 = r0dB0ojIy6g8mnk1(charSequence);
        if (i > iR0dB0ojIy6g8mnk1) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (F44whnLsbQ.ko09zE6UAgwkV(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iR0dB0ojIy6g8mnk1) {
                return -1;
            }
            i++;
        }
    }

    public static String N08cqkgagFuPYWJcTFAQVt(String str, stS3uecPKs3MU4EfeT sts3uecpks3mu4efet) {
        ej6unYlOWMDF.pYmKDYlAmhudp(sts3uecpks3mu4efet, "indices");
        if (sts3uecpks3mu4efet.isEmpty()) {
            return "";
        }
        String strSubstring = str.substring(sts3uecpks3mu4efet.V57tEvNfxZVVcOCAOih5PKr, sts3uecpks3mu4efet.ZfQNn8hdWlEQ5cR94249PDsLR + 1);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static int Pf1HsU8AK92buCoUaexm5AC(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        ej6unYlOWMDF.pYmKDYlAmhudp(charSequence, "<this>");
        return !(charSequence instanceof String) ? KMiA9Sqk243eQkFNNoS(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static int PfK8qHOJoCLG(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = r0dB0ojIy6g8mnk1(str);
        }
        return str.lastIndexOf(c, i);
    }

    public static final List QwZcr6V7mfRUaij0Bp3zpr5ClBcxr(CharSequence charSequence, String str) {
        int iG479XgNG9rK8jPPbSXr = G479XgNG9rK8jPPbSXr(charSequence, str, 0, false);
        if (iG479XgNG9rK8jPPbSXr == -1) {
            return KfeOQNOupsCg6878zi4e.HVEwbdULInpTNa0IG(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iG479XgNG9rK8jPPbSXr).toString());
            length = str.length() + iG479XgNG9rK8jPPbSXr;
            iG479XgNG9rK8jPPbSXr = G479XgNG9rK8jPPbSXr(charSequence, str, length, false);
        } while (iG479XgNG9rK8jPPbSXr != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static String ScSj9HEorWkb3bIb1HyeKVoW(String str) {
        CharSequence charSequenceSubSequence;
        if (8 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(8);
            int length = 8 - str.length();
            int i = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static String SdPSMGy13dYOH9CwolJVKu21val(String str, String str2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str2, "delimiter");
        int iZyiF0wv9HozxGOIDt8PvVp = zyiF0wv9HozxGOIDt8PvVp(str, str2, 0, 6);
        if (iZyiF0wv9HozxGOIDt8PvVp == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iZyiF0wv9HozxGOIDt8PvVp, str.length());
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String VAUpruoPNdSAVh(String str, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static boolean VOvSEdhaZyc0oOGQ8(CharSequence charSequence, char c) {
        ej6unYlOWMDF.pYmKDYlAmhudp(charSequence, "<this>");
        return Pf1HsU8AK92buCoUaexm5AC(charSequence, c, 0, 2) >= 0;
    }

    public static boolean h2b7InwIaORKN91X7whfQh4(CharSequence charSequence, String str) {
        ej6unYlOWMDF.pYmKDYlAmhudp(charSequence, "<this>");
        return zyiF0wv9HozxGOIDt8PvVp(charSequence, str, 0, 2) >= 0;
    }

    public static int nNOZCSz1a7S(int i, String str, String str2) {
        int iR0dB0ojIy6g8mnk1 = (i & 2) != 0 ? r0dB0ojIy6g8mnk1(str) : 0;
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "<this>");
        ej6unYlOWMDF.pYmKDYlAmhudp(str2, "string");
        return str.lastIndexOf(str2, iR0dB0ojIy6g8mnk1);
    }

    public static String pCrI77IVeIpJnmCUHd(String str, String str2) {
        if (!ngO5JXZkj8nfh41LltHvEjUc.lxWWbfAOLs4jWzd7PSIiIJ(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int r0dB0ojIy6g8mnk1(CharSequence charSequence) {
        ej6unYlOWMDF.pYmKDYlAmhudp(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static CharSequence tf2p6GzNN7uQY7Lun0pJ(String str) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zIKANjmyTSxO6v6UuLPdu7DxOjlS = F44whnLsbQ.iKANjmyTSxO6v6UuLPdu7DxOjlS(str.charAt(!z ? i : length));
            if (z) {
                if (!zIKANjmyTSxO6v6UuLPdu7DxOjlS) {
                    break;
                }
                length--;
            } else if (zIKANjmyTSxO6v6UuLPdu7DxOjlS) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    public static List uQ30BFNHbnwcS96Dk6jHUECPfOq(String str, char[] cArr) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "<this>");
        if (cArr.length == 1) {
            return QwZcr6V7mfRUaij0Bp3zpr5ClBcxr(str, String.valueOf(cArr[0]));
        }
        EHKKXdpPo0DCa2P eHKKXdpPo0DCa2P = new EHKKXdpPo0DCa2P(new kVCYLXlG6ES6f(str, new jzN8JaOxjw7m3J(1, cArr)));
        ArrayList arrayList = new ArrayList(M5nvSQFWCkc.bjhcQ0u7VT2OYYrwk96HrWoN(eHKKXdpPo0DCa2P));
        Iterator it = eHKKXdpPo0DCa2P.iterator();
        while (true) {
            sBkYA4xAqdoH1yhi2vLUi sbkya4xaqdoh1yhi2vlui = (sBkYA4xAqdoH1yhi2vLUi) it;
            if (!sbkya4xaqdoh1yhi2vlui.hasNext()) {
                return arrayList;
            }
            stS3uecPKs3MU4EfeT sts3uecpks3mu4efet = (stS3uecPKs3MU4EfeT) sbkya4xaqdoh1yhi2vlui.next();
            ej6unYlOWMDF.pYmKDYlAmhudp(sts3uecpks3mu4efet, "range");
            arrayList.add(str.subSequence(sts3uecpks3mu4efet.V57tEvNfxZVVcOCAOih5PKr, sts3uecpks3mu4efet.ZfQNn8hdWlEQ5cR94249PDsLR + 1).toString());
        }
    }

    public static /* synthetic */ int zyiF0wv9HozxGOIDt8PvVp(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return G479XgNG9rK8jPPbSXr(charSequence, str, i, false);
    }
}
