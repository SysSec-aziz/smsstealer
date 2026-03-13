package com.vdodsodjsdt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class c9cdYDXIxS3U {
    public static final c9cdYDXIxS3U zzpBGItXfub0yWj;
    public final HashMap VxUQ9tBhpHJ2AAEDNW8sghc4m;

    static {
        c9cdYDXIxS3U c9cdydxixs3u = new c9cdYDXIxS3U(new LinkedHashMap());
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.ymT6yQrus3w(c9cdydxixs3u);
        zzpBGItXfub0yWj = c9cdydxixs3u;
    }

    public c9cdYDXIxS3U(c9cdYDXIxS3U c9cdydxixs3u) {
        ej6unYlOWMDF.pYmKDYlAmhudp(c9cdydxixs3u, "other");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new HashMap(c9cdydxixs3u.VxUQ9tBhpHJ2AAEDNW8sghc4m);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.vdodsodjsdt.c9cdYDXIxS3U VxUQ9tBhpHJ2AAEDNW8sghc4m(byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            java.lang.String r1 = "bytes"
            com.vdodsodjsdt.ej6unYlOWMDF.pYmKDYlAmhudp(r7, r1)
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto Lb2
            int r1 = r7.length
            if (r1 != 0) goto L12
            com.vdodsodjsdt.c9cdYDXIxS3U r7 = com.vdodsodjsdt.c9cdYDXIxS3U.zzpBGItXfub0yWj
            return r7
        L12:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.ClassNotFoundException -> L5e java.io.IOException -> L60
            r2.<init>(r7)     // Catch: java.lang.ClassNotFoundException -> L5e java.io.IOException -> L60
            r7 = 2
            byte[] r7 = new byte[r7]     // Catch: java.lang.ClassNotFoundException -> L5e java.io.IOException -> L60
            r2.read(r7)     // Catch: java.lang.ClassNotFoundException -> L5e java.io.IOException -> L60
            r3 = -21267(0xffffffffffffaced, float:NaN)
            byte r3 = (byte) r3     // Catch: java.lang.ClassNotFoundException -> L5e java.io.IOException -> L60
            r4 = 16777132(0xffffac, float:2.350977E-38)
            byte r4 = (byte) r4     // Catch: java.lang.ClassNotFoundException -> L5e java.io.IOException -> L60
            r5 = 0
            r6 = r7[r5]     // Catch: java.lang.ClassNotFoundException -> L5e java.io.IOException -> L60
            if (r6 != r4) goto L34
            r4 = 1
            r7 = r7[r4]     // Catch: java.lang.ClassNotFoundException -> L5e java.io.IOException -> L60
            if (r7 != r3) goto L34
            goto L35
        L34:
            r4 = r5
        L35:
            r2.reset()     // Catch: java.lang.ClassNotFoundException -> L5e java.io.IOException -> L60
            if (r4 == 0) goto L68
            java.io.ObjectInputStream r7 = new java.io.ObjectInputStream     // Catch: java.lang.ClassNotFoundException -> L5e java.io.IOException -> L60
            r7.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L5e java.io.IOException -> L60
            int r2 = r7.readInt()     // Catch: java.lang.Throwable -> L58
        L43:
            if (r5 >= r2) goto L5a
            java.lang.String r3 = r7.readUTF()     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = "readUTF()"
            com.vdodsodjsdt.ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(r3, r4)     // Catch: java.lang.Throwable -> L58
            java.lang.Object r4 = r7.readObject()     // Catch: java.lang.Throwable -> L58
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L58
            int r5 = r5 + 1
            goto L43
        L58:
            r2 = move-exception
            goto L62
        L5a:
            r7.close()     // Catch: java.lang.ClassNotFoundException -> L5e java.io.IOException -> L60
            goto Lac
        L5e:
            r7 = move-exception
            goto L99
        L60:
            r7 = move-exception
            goto La3
        L62:
            throw r2     // Catch: java.lang.Throwable -> L63
        L63:
            r3 = move-exception
            com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.p59rPv72J9(r7, r2)     // Catch: java.lang.ClassNotFoundException -> L5e java.io.IOException -> L60
            throw r3     // Catch: java.lang.ClassNotFoundException -> L5e java.io.IOException -> L60
        L68:
            java.io.DataInputStream r7 = new java.io.DataInputStream     // Catch: java.lang.ClassNotFoundException -> L5e java.io.IOException -> L60
            r7.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L5e java.io.IOException -> L60
            com.vdodsodjsdt.FLWIoSaHb1q8TqFvEBgPyRGrzvi6.TaDO7ogis3aEiWEtq(r7)     // Catch: java.lang.Throwable -> L8d
            int r2 = r7.readInt()     // Catch: java.lang.Throwable -> L8d
        L74:
            if (r5 >= r2) goto L8f
            byte r3 = r7.readByte()     // Catch: java.lang.Throwable -> L8d
            java.io.Serializable r3 = com.vdodsodjsdt.FLWIoSaHb1q8TqFvEBgPyRGrzvi6.Irh5auREsoeV1C1RaBamlmy(r7, r3)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = r7.readUTF()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r6 = "key"
            com.vdodsodjsdt.ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(r4, r6)     // Catch: java.lang.Throwable -> L8d
            r1.put(r4, r3)     // Catch: java.lang.Throwable -> L8d
            int r5 = r5 + 1
            goto L74
        L8d:
            r2 = move-exception
            goto L93
        L8f:
            r7.close()     // Catch: java.lang.ClassNotFoundException -> L5e java.io.IOException -> L60
            goto Lac
        L93:
            throw r2     // Catch: java.lang.Throwable -> L94
        L94:
            r3 = move-exception
            com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.p59rPv72J9(r7, r2)     // Catch: java.lang.ClassNotFoundException -> L5e java.io.IOException -> L60
            throw r3     // Catch: java.lang.ClassNotFoundException -> L5e java.io.IOException -> L60
        L99:
            java.lang.String r2 = com.vdodsodjsdt.aKozz2KH3TgtX7U19.VxUQ9tBhpHJ2AAEDNW8sghc4m
            com.vdodsodjsdt.psATg3LCCdmDIiRgW r3 = com.vdodsodjsdt.psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x()
            r3.ZfQNn8hdWlEQ5cR94249PDsLR(r2, r0, r7)
            goto Lac
        La3:
            java.lang.String r2 = com.vdodsodjsdt.aKozz2KH3TgtX7U19.VxUQ9tBhpHJ2AAEDNW8sghc4m
            com.vdodsodjsdt.psATg3LCCdmDIiRgW r3 = com.vdodsodjsdt.psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x()
            r3.ZfQNn8hdWlEQ5cR94249PDsLR(r2, r0, r7)
        Lac:
            com.vdodsodjsdt.c9cdYDXIxS3U r7 = new com.vdodsodjsdt.c9cdYDXIxS3U
            r7.<init>(r1)
            return r7
        Lb2:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.c9cdYDXIxS3U.VxUQ9tBhpHJ2AAEDNW8sghc4m(byte[]):com.vdodsodjsdt.c9cdYDXIxS3U");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L5
            goto L66
        L5:
            r1 = 0
            if (r9 == 0) goto L67
            java.lang.Class<com.vdodsodjsdt.c9cdYDXIxS3U> r2 = com.vdodsodjsdt.c9cdYDXIxS3U.class
            java.lang.Class r3 = r9.getClass()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L15
            goto L67
        L15:
            com.vdodsodjsdt.c9cdYDXIxS3U r9 = (com.vdodsodjsdt.c9cdYDXIxS3U) r9
            java.util.HashMap r9 = r9.VxUQ9tBhpHJ2AAEDNW8sghc4m
            java.util.HashMap r2 = r8.VxUQ9tBhpHJ2AAEDNW8sghc4m
            java.util.Set r3 = r2.keySet()
            java.util.Set r4 = r9.keySet()
            boolean r4 = com.vdodsodjsdt.ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(r3, r4)
            if (r4 != 0) goto L2a
            goto L67
        L2a:
            java.util.Iterator r3 = r3.iterator()
        L2e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L66
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.get(r4)
            java.lang.Object r4 = r9.get(r4)
            if (r5 == 0) goto L5e
            if (r4 != 0) goto L47
            goto L5e
        L47:
            boolean r6 = r5 instanceof java.lang.Object[]
            if (r6 == 0) goto L59
            r6 = r5
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            boolean r7 = r4 instanceof java.lang.Object[]
            if (r7 == 0) goto L59
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            boolean r4 = com.vdodsodjsdt.vmp19D2MODlOL.ubNpdCC1pl7L(r6, r4)
            goto L63
        L59:
            boolean r4 = r5.equals(r4)
            goto L63
        L5e:
            if (r5 != r4) goto L62
            r4 = r0
            goto L63
        L62:
            r4 = r1
        L63:
            if (r4 != 0) goto L2e
            goto L67
        L66:
            return r0
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.c9cdYDXIxS3U.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.VxUQ9tBhpHJ2AAEDNW8sghc4m.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        String str = "Data {" + gYXV3FZbh17i6ocMo1T.rE05n5RsRkyWKIeA9cmLXAKv4Hze(this.VxUQ9tBhpHJ2AAEDNW8sghc4m.entrySet(), null, null, null, BIhaoaY7PwYE.zIvmSL0wzmmKGc3X39b2Gw2mUGE, 31) + "}";
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    public final boolean zzpBGItXfub0yWj(String str) {
        Object obj = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    public c9cdYDXIxS3U(LinkedHashMap linkedHashMap) {
        ej6unYlOWMDF.pYmKDYlAmhudp(linkedHashMap, "values");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new HashMap(linkedHashMap);
    }
}
