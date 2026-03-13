package com.vdodsodjsdt;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ssIlBIazVyEpdtn9SOpMLpu7YjIT3 {
    public final Notification V57tEvNfxZVVcOCAOih5PKr;
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final int zzpBGItXfub0yWj;

    public ssIlBIazVyEpdtn9SOpMLpu7YjIT3(int i, Notification notification, int i2) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.V57tEvNfxZVVcOCAOih5PKr = notification;
        this.zzpBGItXfub0yWj = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ssIlBIazVyEpdtn9SOpMLpu7YjIT3.class != obj.getClass()) {
            return false;
        }
        ssIlBIazVyEpdtn9SOpMLpu7YjIT3 ssilbiazvyepdtn9sopmlpu7yjit3 = (ssIlBIazVyEpdtn9SOpMLpu7YjIT3) obj;
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m == ssilbiazvyepdtn9sopmlpu7yjit3.VxUQ9tBhpHJ2AAEDNW8sghc4m && this.zzpBGItXfub0yWj == ssilbiazvyepdtn9sopmlpu7yjit3.zzpBGItXfub0yWj) {
            return this.V57tEvNfxZVVcOCAOih5PKr.equals(ssilbiazvyepdtn9sopmlpu7yjit3.V57tEvNfxZVVcOCAOih5PKr);
        }
        return false;
    }

    public final int hashCode() {
        return this.V57tEvNfxZVVcOCAOih5PKr.hashCode() + (((this.VxUQ9tBhpHJ2AAEDNW8sghc4m * 31) + this.zzpBGItXfub0yWj) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + ", mForegroundServiceType=" + this.zzpBGItXfub0yWj + ", mNotification=" + this.V57tEvNfxZVVcOCAOih5PKr + '}';
    }
}
