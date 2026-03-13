package com.vdodsodjsdt;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class iJsJOOjKyWEygkebu5yh4 {
    public static final Charset VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public static final byte[] zzpBGItXfub0yWj;

    static {
        Charset.forName("US-ASCII");
        VxUQ9tBhpHJ2AAEDNW8sghc4m = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzpBGItXfub0yWj = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new M1rKSeNX0CtO8b805z1g0ktU(bArr, 0, 0, false).LaeGQIruHQu81hfJldjMOQSVblH3x(0);
        } catch (tabhAwpQKyJhu24Q e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int zzpBGItXfub0yWj(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
