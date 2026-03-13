package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tFVUzh05cCwb {
    public static final String[] V57tEvNfxZVVcOCAOih5PKr;
    public static final oA1WO3soICf8H1N6bgpG VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public static final String[] ZfQNn8hdWlEQ5cR94249PDsLR;
    public static final String[] zzpBGItXfub0yWj;

    static {
        oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg = oA1WO3soICf8H1N6bgpG.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        VxUQ9tBhpHJ2AAEDNW8sghc4m = IN79WcIk5xB4t0GjRT43qPLs5.HzCpKshMOoaw76hFcbOVRYMeRd("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        zzpBGItXfub0yWj = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        V57tEvNfxZVVcOCAOih5PKr = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(binaryString, "toBinaryString(...)");
            String strReplace = U7JVXX1Kyh43VgUF.V57tEvNfxZVVcOCAOih5PKr("%8s", binaryString).replace(' ', '0');
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strReplace, "replace(...)");
            strArr[i] = strReplace;
        }
        ZfQNn8hdWlEQ5cR94249PDsLR = strArr;
        String[] strArr2 = V57tEvNfxZVVcOCAOih5PKr;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = u9SlVAuoWhQUfJ.HzCpKshMOoaw76hFcbOVRYMeRd(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = V57tEvNfxZVVcOCAOih5PKr;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = u9SlVAuoWhQUfJ.HzCpKshMOoaw76hFcbOVRYMeRd(sb, strArr3[i4], "|PADDED");
        }
        int length = V57tEvNfxZVVcOCAOih5PKr.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = V57tEvNfxZVVcOCAOih5PKr;
            if (strArr4[i7] == null) {
                strArr4[i7] = ZfQNn8hdWlEQ5cR94249PDsLR[i7];
            }
        }
    }

    public static String V57tEvNfxZVVcOCAOih5PKr(boolean z, int i, int i2, long j) {
        return U7JVXX1Kyh43VgUF.V57tEvNfxZVVcOCAOih5PKr("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), VxUQ9tBhpHJ2AAEDNW8sghc4m(8), Long.valueOf(j));
    }

    public static String VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) {
        String[] strArr = zzpBGItXfub0yWj;
        return i < strArr.length ? strArr[i] : U7JVXX1Kyh43VgUF.V57tEvNfxZVVcOCAOih5PKr("0x%02x", Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String zzpBGItXfub0yWj(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            java.lang.String r0 = VxUQ9tBhpHJ2AAEDNW8sghc4m(r7)
            if (r8 != 0) goto L9
            java.lang.String r7 = ""
            goto L57
        L9:
            r1 = 2
            java.lang.String[] r2 = com.vdodsodjsdt.tFVUzh05cCwb.ZfQNn8hdWlEQ5cR94249PDsLR
            if (r7 == r1) goto L55
            r1 = 3
            if (r7 == r1) goto L55
            r1 = 4
            if (r7 == r1) goto L4c
            r1 = 6
            if (r7 == r1) goto L4c
            r1 = 7
            if (r7 == r1) goto L55
            r1 = 8
            if (r7 == r1) goto L55
            java.lang.String[] r1 = com.vdodsodjsdt.tFVUzh05cCwb.V57tEvNfxZVVcOCAOih5PKr
            int r3 = r1.length
            if (r8 >= r3) goto L29
            r1 = r1[r8]
            com.vdodsodjsdt.ej6unYlOWMDF.p59rPv72J9(r1)
            goto L2b
        L29:
            r1 = r2[r8]
        L2b:
            r2 = 5
            if (r7 != r2) goto L3b
            r2 = r8 & 4
            if (r2 == 0) goto L3b
            java.lang.String r7 = "HEADERS"
            java.lang.String r8 = "PUSH_PROMISE"
            java.lang.String r7 = com.vdodsodjsdt.ngO5JXZkj8nfh41LltHvEjUc.AFOcXGdvoTMuqwiG8tD(r1, r7, r8)
            goto L57
        L3b:
            if (r7 != 0) goto L4a
            r7 = r8 & 32
            if (r7 == 0) goto L4a
            java.lang.String r7 = "PRIORITY"
            java.lang.String r8 = "COMPRESSED"
            java.lang.String r7 = com.vdodsodjsdt.ngO5JXZkj8nfh41LltHvEjUc.AFOcXGdvoTMuqwiG8tD(r1, r7, r8)
            goto L57
        L4a:
            r7 = r1
            goto L57
        L4c:
            r7 = 1
            if (r8 != r7) goto L52
            java.lang.String r7 = "ACK"
            goto L57
        L52:
            r7 = r2[r8]
            goto L57
        L55:
            r7 = r2[r8]
        L57:
            if (r4 == 0) goto L5c
            java.lang.String r4 = "<<"
            goto L5e
        L5c:
            java.lang.String r4 = ">>"
        L5e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r0, r7}
            java.lang.String r5 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r4 = com.vdodsodjsdt.U7JVXX1Kyh43VgUF.V57tEvNfxZVVcOCAOih5PKr(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.tFVUzh05cCwb.zzpBGItXfub0yWj(boolean, int, int, int, int):java.lang.String");
    }
}
