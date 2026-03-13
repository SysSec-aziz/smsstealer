package com.vdodsodjsdt;

import android.util.StateSet;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class oLPwQu4XgJ {
    public Object GI83zq0G8e7zkn;
    public Serializable LaeGQIruHQu81hfJldjMOQSVblH3x;
    public Object NSjgqmGjEzuugn2SsG1mZFP;
    public Object V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public Object ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public Serializable ZfQNn8hdWlEQ5cR94249PDsLR;
    public Object zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public int zzpBGItXfub0yWj;

    public oLPwQu4XgJ(XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 1;
        LaeGQIruHQu81hfJldjMOQSVblH3x();
        zzpBGItXfub0yWj(StateSet.WILD_CARD, xdVIZOnOVHGi6uYUaae4zAI94b);
    }

    public static ArrayList ZLZeBXTMq0zDztBxtRTuCHrapQ(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iPf1HsU8AK92buCoUaexm5AC = cwhrCnoVJBjJE2CBEAvBopmgF.Pf1HsU8AK92buCoUaexm5AC(str, '&', i, 4);
            if (iPf1HsU8AK92buCoUaexm5AC == -1) {
                iPf1HsU8AK92buCoUaexm5AC = str.length();
            }
            int iPf1HsU8AK92buCoUaexm5AC2 = cwhrCnoVJBjJE2CBEAvBopmgF.Pf1HsU8AK92buCoUaexm5AC(str, '=', i, 4);
            if (iPf1HsU8AK92buCoUaexm5AC2 == -1 || iPf1HsU8AK92buCoUaexm5AC2 > iPf1HsU8AK92buCoUaexm5AC) {
                String strSubstring = str.substring(i, iPf1HsU8AK92buCoUaexm5AC);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i, iPf1HsU8AK92buCoUaexm5AC2);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring2, "substring(...)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iPf1HsU8AK92buCoUaexm5AC2 + 1, iPf1HsU8AK92buCoUaexm5AC);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring3, "substring(...)");
                arrayList.add(strSubstring3);
            }
            i = iPf1HsU8AK92buCoUaexm5AC + 1;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vdodsodjsdt.XdVIZOnOVHGi6uYUaae4zAI94b[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    public void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        this.V57tEvNfxZVVcOCAOih5PKr = new XdVIZOnOVHGi6uYUaae4zAI94b();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new int[10][];
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new XdVIZOnOVHGi6uYUaae4zAI94b[10];
    }

    public sveu0WcbYc1gIe V57tEvNfxZVVcOCAOih5PKr() {
        ArrayList arrayList;
        String str = (String) this.V57tEvNfxZVVcOCAOih5PKr;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strWRCD0SdqWCowdYU7bmzN = ej6unYlOWMDF.wRCD0SdqWCowdYU7bmzN((String) this.ZfQNn8hdWlEQ5cR94249PDsLR, 0, 0, 7);
        String strWRCD0SdqWCowdYU7bmzN2 = ej6unYlOWMDF.wRCD0SdqWCowdYU7bmzN((String) this.LaeGQIruHQu81hfJldjMOQSVblH3x, 0, 0, 7);
        String str2 = (String) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR();
        ArrayList arrayList2 = (ArrayList) this.NSjgqmGjEzuugn2SsG1mZFP;
        ArrayList arrayList3 = new ArrayList(M5nvSQFWCkc.bjhcQ0u7VT2OYYrwk96HrWoN(arrayList2));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(ej6unYlOWMDF.wRCD0SdqWCowdYU7bmzN((String) obj, 0, 0, 7));
        }
        ArrayList arrayList4 = (ArrayList) this.GI83zq0G8e7zkn;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(M5nvSQFWCkc.bjhcQ0u7VT2OYYrwk96HrWoN(arrayList4));
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                String str3 = (String) obj2;
                arrayList5.add(str3 != null ? ej6unYlOWMDF.wRCD0SdqWCowdYU7bmzN(str3, 0, 0, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        return new sveu0WcbYc1gIe(str, strWRCD0SdqWCowdYU7bmzN, strWRCD0SdqWCowdYU7bmzN2, str2, iZfQNn8hdWlEQ5cR94249PDsLR, arrayList, str4 != null ? ej6unYlOWMDF.wRCD0SdqWCowdYU7bmzN(str4, 0, 0, 7) : null, toString());
    }

    public void VxUQ9tBhpHJ2AAEDNW8sghc4m(String str, String str2) {
        if (((ArrayList) this.GI83zq0G8e7zkn) == null) {
            this.GI83zq0G8e7zkn = new ArrayList();
        }
        ArrayList arrayList = (ArrayList) this.GI83zq0G8e7zkn;
        ej6unYlOWMDF.p59rPv72J9(arrayList);
        arrayList.add(ej6unYlOWMDF.q1wNbhk2O6(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91));
        ArrayList arrayList2 = (ArrayList) this.GI83zq0G8e7zkn;
        ej6unYlOWMDF.p59rPv72J9(arrayList2);
        arrayList2.add(str2 != null ? ej6unYlOWMDF.q1wNbhk2O6(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91) : null);
    }

    public int ZfQNn8hdWlEQ5cR94249PDsLR() {
        int i = this.zzpBGItXfub0yWj;
        if (i != -1) {
            return i;
        }
        String str = (String) this.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.p59rPv72J9(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.oLPwQu4XgJ.toString():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zIvmSL0wzmmKGc3X39b2Gw2mUGE(com.vdodsodjsdt.sveu0WcbYc1gIe r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.oLPwQu4XgJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(com.vdodsodjsdt.sveu0WcbYc1gIe, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.vdodsodjsdt.XdVIZOnOVHGi6uYUaae4zAI94b[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.io.Serializable, java.lang.Object] */
    public void zzpBGItXfub0yWj(int[] iArr, XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b) {
        int i = this.zzpBGItXfub0yWj;
        if (i == 0 || iArr.length == 0) {
            this.V57tEvNfxZVVcOCAOih5PKr = xdVIZOnOVHGi6uYUaae4zAI94b;
        }
        int[][] iArr2 = (int[][]) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            ?? r3 = new int[i2][];
            System.arraycopy(iArr2, 0, r3, 0, i);
            this.ZfQNn8hdWlEQ5cR94249PDsLR = r3;
            ?? r1 = new XdVIZOnOVHGi6uYUaae4zAI94b[i2];
            System.arraycopy((XdVIZOnOVHGi6uYUaae4zAI94b[]) this.LaeGQIruHQu81hfJldjMOQSVblH3x, 0, r1, 0, i);
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = r1;
        }
        int[][] iArr3 = (int[][]) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i3 = this.zzpBGItXfub0yWj;
        iArr3[i3] = iArr;
        ((XdVIZOnOVHGi6uYUaae4zAI94b[]) this.LaeGQIruHQu81hfJldjMOQSVblH3x)[i3] = xdVIZOnOVHGi6uYUaae4zAI94b;
        this.zzpBGItXfub0yWj = i3 + 1;
    }

    public oLPwQu4XgJ(int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        switch (i) {
            case 1:
                break;
            default:
                this.ZfQNn8hdWlEQ5cR94249PDsLR = "";
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = "";
                this.zzpBGItXfub0yWj = -1;
                this.NSjgqmGjEzuugn2SsG1mZFP = kzhIjSJtHYuLoiUgKqSRIck3W8.H2VFYNJEVGAX("");
                break;
        }
    }
}
