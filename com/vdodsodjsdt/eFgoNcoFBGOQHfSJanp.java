package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class eFgoNcoFBGOQHfSJanp {
    public static final zonOxHotd3BwAPJcwqr6I6uQNngg4 VxUQ9tBhpHJ2AAEDNW8sghc4m;

    static {
        VxUQ9tBhpHJ2AAEDNW8sghc4m = (VFd9YrZLozMNzEwgrLgkRG.LaeGQIruHQu81hfJldjMOQSVblH3x && VFd9YrZLozMNzEwgrLgkRG.ZfQNn8hdWlEQ5cR94249PDsLR && !veLfYgyb53a07Ze9LkDO.VxUQ9tBhpHJ2AAEDNW8sghc4m()) ? new LCyLEojX1Em7Dwcfus(1) : new LCyLEojX1Em7Dwcfus(0);
    }

    public static int VxUQ9tBhpHJ2AAEDNW8sghc4m(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new dGW2434XmPszy6t(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }
}
