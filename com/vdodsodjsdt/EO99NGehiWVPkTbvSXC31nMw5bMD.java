package com.vdodsodjsdt;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class EO99NGehiWVPkTbvSXC31nMw5bMD {
    public static final String VxUQ9tBhpHJ2AAEDNW8sghc4m = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("PackageManagerHelper");

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(Context context, Class cls, boolean z) {
        String str = VxUQ9tBhpHJ2AAEDNW8sghc4m;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z2 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z2 = true;
            }
            if (z == z2) {
                psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(str, "Skipping component enablement for ".concat(cls.getName()));
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            psATg3LCCdmDIiRgW psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x = psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? "enabled" : "disabled");
            psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m(str, sb.toString());
        } catch (Exception e) {
            psATg3LCCdmDIiRgW psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x2 = psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z ? "enabled" : "disabled");
            psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x2.zzpBGItXfub0yWj(str, sb2.toString(), e);
        }
    }
}
