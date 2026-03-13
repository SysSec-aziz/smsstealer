package com.vdodsodjsdt;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BNx7YAOy6zSdxROhZx2 {
    public static void LaeGQIruHQu81hfJldjMOQSVblH3x(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        try {
            systemForegroundService.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            psATg3LCCdmDIiRgW psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x = psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x();
            String str = SystemForegroundService.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            if (psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m <= 5) {
                Log.w(str, "Unable to start foreground service", e);
            }
        } catch (SecurityException e2) {
            psATg3LCCdmDIiRgW psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x2 = psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x();
            String str2 = SystemForegroundService.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            if (psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x2.VxUQ9tBhpHJ2AAEDNW8sghc4m <= 5) {
                Log.w(str2, "Unable to start foreground service", e2);
            }
        }
    }

    public static void V57tEvNfxZVVcOCAOih5PKr(Resources.Theme theme) {
        theme.rebase();
    }

    public static String VxUQ9tBhpHJ2AAEDNW8sghc4m(Context context) {
        return context.getOpPackageName();
    }

    public static void ZfQNn8hdWlEQ5cR94249PDsLR(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        systemForegroundService.startForeground(i, notification, i2);
    }

    public static Insets zzpBGItXfub0yWj(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }
}
