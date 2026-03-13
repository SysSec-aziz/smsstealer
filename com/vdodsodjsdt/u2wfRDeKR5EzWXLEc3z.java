package com.vdodsodjsdt;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u2wfRDeKR5EzWXLEc3z {
    public static final Object V57tEvNfxZVVcOCAOih5PKr;
    public static final OBsbe4YQtB2vgUFxLzO6ssT0 VxUQ9tBhpHJ2AAEDNW8sghc4m = new OBsbe4YQtB2vgUFxLzO6ssT0(16);
    public static final sSTjsLE9Ugp7iXfnwi18Akn1Jt ZfQNn8hdWlEQ5cR94249PDsLR;
    public static final ThreadPoolExecutor zzpBGItXfub0yWj;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new PQ5ya4bWwBY75J5Dh());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        zzpBGItXfub0yWj = threadPoolExecutor;
        V57tEvNfxZVVcOCAOih5PKr = new Object();
        ZfQNn8hdWlEQ5cR94249PDsLR = new sSTjsLE9Ugp7iXfnwi18Akn1Jt(0);
    }

    public static String VxUQ9tBhpHJ2AAEDNW8sghc4m(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((zDPogDYnaf4Ok5KljFrcZIbCgM2B) list.get(i2)).ZLZeBXTMq0zDztBxtRTuCHrapQ);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static CfP1VFxsaWESDSF2SWQq zzpBGItXfub0yWj(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceHzCpKshMOoaw76hFcbOVRYMeRd;
        OBsbe4YQtB2vgUFxLzO6ssT0 oBsbe4YQtB2vgUFxLzO6ssT0 = VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Trace.beginSection(hRrPPME7ytOB7ba.HVEwbdULInpTNa0IG("getFontSync"));
        try {
            Typeface typeface = (Typeface) oBsbe4YQtB2vgUFxLzO6ssT0.zIvmSL0wzmmKGc3X39b2Gw2mUGE(str);
            if (typeface != null) {
                return new CfP1VFxsaWESDSF2SWQq(typeface);
            }
            z8uyl4sTQr2O9dK1e z8uyl4stqr2o9dk1eVxUQ9tBhpHJ2AAEDNW8sghc4m = xpKXrogL5QN2Ln5bIc.VxUQ9tBhpHJ2AAEDNW8sghc4m(context, list);
            List list2 = (List) z8uyl4stqr2o9dk1eVxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR;
            int i3 = z8uyl4stqr2o9dk1eVxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr;
            if (i3 != 0) {
                i2 = i3 != 1 ? -3 : -2;
            } else {
                j5O1PfCuTxZKdtuvF7[] j5o1pfcutxzkdtuvf7Arr = (j5O1PfCuTxZKdtuvF7[]) list2.get(0);
                if (j5o1pfcutxzkdtuvf7Arr == null || j5o1pfcutxzkdtuvf7Arr.length == 0) {
                    i2 = 1;
                } else {
                    int length = j5o1pfcutxzkdtuvf7Arr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            i2 = 0;
                            break;
                        }
                        int i5 = j5o1pfcutxzkdtuvf7Arr[i4].zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                        if (i5 == 0) {
                            i4++;
                        } else if (i5 >= 0) {
                            i2 = i5;
                        }
                    }
                }
            }
            if (i2 != 0) {
                return new CfP1VFxsaWESDSF2SWQq(i2);
            }
            if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                j5O1PfCuTxZKdtuvF7[] j5o1pfcutxzkdtuvf7Arr2 = (j5O1PfCuTxZKdtuvF7[]) list2.get(0);
                F44whnLsbQ f44whnLsbQ = NHtvgmV6EG3jwD4PpLqRhQi.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                Trace.beginSection(hRrPPME7ytOB7ba.HVEwbdULInpTNa0IG("TypefaceCompat.createFromFontInfo"));
                typefaceHzCpKshMOoaw76hFcbOVRYMeRd = NHtvgmV6EG3jwD4PpLqRhQi.VxUQ9tBhpHJ2AAEDNW8sghc4m.HzCpKshMOoaw76hFcbOVRYMeRd(context, j5o1pfcutxzkdtuvf7Arr2, i);
                Trace.endSection();
            } else {
                F44whnLsbQ f44whnLsbQ2 = NHtvgmV6EG3jwD4PpLqRhQi.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                Trace.beginSection(hRrPPME7ytOB7ba.HVEwbdULInpTNa0IG("TypefaceCompat.createFromFontInfoWithFallback"));
                typefaceHzCpKshMOoaw76hFcbOVRYMeRd = NHtvgmV6EG3jwD4PpLqRhQi.VxUQ9tBhpHJ2AAEDNW8sghc4m.KUYypEB4eNWOZWVDpH(context, list2, i);
                Trace.endSection();
            }
            if (typefaceHzCpKshMOoaw76hFcbOVRYMeRd == null) {
                return new CfP1VFxsaWESDSF2SWQq(-3);
            }
            oBsbe4YQtB2vgUFxLzO6ssT0.M9e7PWhFYLD2lOGMker(str, typefaceHzCpKshMOoaw76hFcbOVRYMeRd);
            return new CfP1VFxsaWESDSF2SWQq(typefaceHzCpKshMOoaw76hFcbOVRYMeRd);
        } catch (PackageManager.NameNotFoundException unused) {
            return new CfP1VFxsaWESDSF2SWQq(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }
}
