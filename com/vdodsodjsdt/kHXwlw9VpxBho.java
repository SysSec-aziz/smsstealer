package com.vdodsodjsdt;

import android.app.Application;
import android.app.job.JobParameters;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kHXwlw9VpxBho {
    public static int GI83zq0G8e7zkn(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int HzCpKshMOoaw76hFcbOVRYMeRd(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params KUYypEB4eNWOZWVDpH(lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa) {
        return lzuj2xiohpzadsoz1vjvxa.getTextMetricsParams();
    }

    public static String LaeGQIruHQu81hfJldjMOQSVblH3x() {
        String processName = Application.getProcessName();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(processName, "getProcessName()");
        return processName;
    }

    public static int M9e7PWhFYLD2lOGMker(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int NSjgqmGjEzuugn2SsG1mZFP(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static String[] V57tEvNfxZVVcOCAOih5PKr(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static Handler VxUQ9tBhpHJ2AAEDNW8sghc4m(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static int ZLZeBXTMq0zDztBxtRTuCHrapQ(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static void ZfQNn8hdWlEQ5cR94249PDsLR(JobParameters jobParameters) {
        jobParameters.getNetwork();
    }

    public static boolean p59rPv72J9(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static void q1wNbhk2O6(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static int zIvmSL0wzmmKGc3X39b2Gw2mUGE(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static Handler zzpBGItXfub0yWj(Looper looper) {
        return Handler.createAsync(looper);
    }
}
