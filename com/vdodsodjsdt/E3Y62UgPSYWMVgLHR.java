package com.vdodsodjsdt;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class E3Y62UgPSYWMVgLHR {
    public static final char[] VxUQ9tBhpHJ2AAEDNW8sghc4m;

    static {
        char[] cArr = new char[80];
        VxUQ9tBhpHJ2AAEDNW8sghc4m = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void V57tEvNfxZVVcOCAOih5PKr(com.vdodsodjsdt.EDuXvmY6CU2gSBB r21, java.lang.StringBuilder r22, int r23) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.E3Y62UgPSYWMVgLHR.V57tEvNfxZVVcOCAOih5PKr(com.vdodsodjsdt.EDuXvmY6CU2gSBB, java.lang.StringBuilder, int):void");
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(VxUQ9tBhpHJ2AAEDNW8sghc4m, 0, i2);
            i -= i2;
        }
    }

    public static void zzpBGItXfub0yWj(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzpBGItXfub0yWj(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzpBGItXfub0yWj(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        VxUQ9tBhpHJ2AAEDNW8sghc4m(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            uDRHTE5hsm7JpGOnK7F udrhte5hsm7jpgonk7f = uDRHTE5hsm7JpGOnK7F.LaeGQIruHQu81hfJldjMOQSVblH3x;
            sb.append(FLWIoSaHb1q8TqFvEBgPyRGrzvi6.vBGA6pPLqSMuYGvprl270j7(new uDRHTE5hsm7JpGOnK7F(((String) obj).getBytes(iJsJOOjKyWEygkebu5yh4.VxUQ9tBhpHJ2AAEDNW8sghc4m))));
            sb.append('\"');
            return;
        }
        if (obj instanceof uDRHTE5hsm7JpGOnK7F) {
            sb.append(": \"");
            sb.append(FLWIoSaHb1q8TqFvEBgPyRGrzvi6.vBGA6pPLqSMuYGvprl270j7((uDRHTE5hsm7JpGOnK7F) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof EDuXvmY6CU2gSBB) {
            sb.append(" {");
            V57tEvNfxZVVcOCAOih5PKr((EDuXvmY6CU2gSBB) obj, sb, i + 2);
            sb.append("\n");
            VxUQ9tBhpHJ2AAEDNW8sghc4m(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        zzpBGItXfub0yWj(sb, i3, "key", entry.getKey());
        zzpBGItXfub0yWj(sb, i3, "value", entry.getValue());
        sb.append("\n");
        VxUQ9tBhpHJ2AAEDNW8sghc4m(i, sb);
        sb.append("}");
    }
}
