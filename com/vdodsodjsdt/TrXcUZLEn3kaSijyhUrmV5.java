package com.vdodsodjsdt;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class TrXcUZLEn3kaSijyhUrmV5 {
    public static final long LaeGQIruHQu81hfJldjMOQSVblH3x;
    public static final psATg3LCCdmDIiRgW NSjgqmGjEzuugn2SsG1mZFP;
    public static final int V57tEvNfxZVVcOCAOih5PKr;
    public static final String VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public static final psATg3LCCdmDIiRgW ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public static final int ZfQNn8hdWlEQ5cR94249PDsLR;
    public static final IN79WcIk5xB4t0GjRT43qPLs5 zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public static final long zzpBGItXfub0yWj;

    static {
        String property;
        int i = ursTu5yfUDTCBVzqCa.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m = property;
        zzpBGItXfub0yWj = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.d9zDyyznnp3oaDT1Ug("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = ursTu5yfUDTCBVzqCa.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (i2 < 2) {
            i2 = 2;
        }
        V57tEvNfxZVVcOCAOih5PKr = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.CixTK5ZX8oWXHz34qHYV("kotlinx.coroutines.scheduler.core.pool.size", i2, 8);
        ZfQNn8hdWlEQ5cR94249PDsLR = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.CixTK5ZX8oWXHz34qHYV("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        LaeGQIruHQu81hfJldjMOQSVblH3x = TimeUnit.SECONDS.toNanos(FLWIoSaHb1q8TqFvEBgPyRGrzvi6.d9zDyyznnp3oaDT1Ug("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        zIvmSL0wzmmKGc3X39b2Gw2mUGE = IN79WcIk5xB4t0GjRT43qPLs5.KUYypEB4eNWOZWVDpH;
        ZLZeBXTMq0zDztBxtRTuCHrapQ = new psATg3LCCdmDIiRgW(0);
        NSjgqmGjEzuugn2SsG1mZFP = new psATg3LCCdmDIiRgW(1);
    }
}
