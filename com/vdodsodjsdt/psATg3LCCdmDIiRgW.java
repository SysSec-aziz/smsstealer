package com.vdodsodjsdt;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class psATg3LCCdmDIiRgW {
    public static volatile psATg3LCCdmDIiRgW V57tEvNfxZVVcOCAOih5PKr;
    public static final Object zzpBGItXfub0yWj = new Object();
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public /* synthetic */ psATg3LCCdmDIiRgW(int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
    }

    public static psATg3LCCdmDIiRgW LaeGQIruHQu81hfJldjMOQSVblH3x() {
        psATg3LCCdmDIiRgW psatg3lccdmdiirgw;
        synchronized (zzpBGItXfub0yWj) {
            try {
                if (V57tEvNfxZVVcOCAOih5PKr == null) {
                    V57tEvNfxZVVcOCAOih5PKr = new psATg3LCCdmDIiRgW(3);
                }
                psatg3lccdmdiirgw = V57tEvNfxZVVcOCAOih5PKr;
            } catch (Throwable th) {
                throw th;
            }
        }
        return psatg3lccdmdiirgw;
    }

    public static String ZLZeBXTMq0zDztBxtRTuCHrapQ(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public void NSjgqmGjEzuugn2SsG1mZFP(String str, String str2) {
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m <= 5) {
            Log.w(str, str2);
        }
    }

    public void V57tEvNfxZVVcOCAOih5PKr(String str, String str2) {
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m <= 6) {
            Log.e(str, str2);
        }
    }

    public void VxUQ9tBhpHJ2AAEDNW8sghc4m(String str, String str2) {
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m <= 3) {
            Log.d(str, str2);
        }
    }

    public void ZfQNn8hdWlEQ5cR94249PDsLR(String str, String str2, Throwable th) {
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m <= 6) {
            Log.e(str, str2, th);
        }
    }

    public void zIvmSL0wzmmKGc3X39b2Gw2mUGE(String str, String str2) {
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m <= 4) {
            Log.i(str, str2);
        }
    }

    public void zzpBGItXfub0yWj(String str, String str2, Throwable th) {
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m <= 3) {
            Log.d(str, str2, th);
        }
    }
}
