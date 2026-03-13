package com.vdodsodjsdt;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class wPzckzzcoD extends UdNpBSaUQhOqU {
    public final Object LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr = 0;
    public final /* synthetic */ BbqUXujjobWQwx4SY ZfQNn8hdWlEQ5cR94249PDsLR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wPzckzzcoD(BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY, NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM) {
        super(bbqUXujjobWQwx4SY);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = bbqUXujjobWQwx4SY;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = nrjuzzioPqfttNRptBDpZDzSYUrcM;
    }

    @Override // com.vdodsodjsdt.UdNpBSaUQhOqU
    public final IntentFilter LaeGQIruHQu81hfJldjMOQSVblH3x() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // com.vdodsodjsdt.UdNpBSaUQhOqU
    public final void NSjgqmGjEzuugn2SsG1mZFP() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                this.ZfQNn8hdWlEQ5cR94249PDsLR.q1wNbhk2O6(true, true);
                break;
            default:
                this.ZfQNn8hdWlEQ5cR94249PDsLR.q1wNbhk2O6(true, true);
                break;
        }
    }

    @Override // com.vdodsodjsdt.UdNpBSaUQhOqU
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        Location location;
        boolean z;
        long j;
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                return CJLX0IyjlE6CM.VxUQ9tBhpHJ2AAEDNW8sghc4m((PowerManager) this.LaeGQIruHQu81hfJldjMOQSVblH3x) ? 2 : 1;
            default:
                NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM = (NrjuzzioPqfttNRptBDpZDzSYUrcM) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                ybRhOpYXFhEPd ybrhopyxfhepd = (ybRhOpYXFhEPd) nrjuzzioPqfttNRptBDpZDzSYUrcM.ZfQNn8hdWlEQ5cR94249PDsLR;
                LocationManager locationManager = (LocationManager) nrjuzzioPqfttNRptBDpZDzSYUrcM.V57tEvNfxZVVcOCAOih5PKr;
                if (ybrhopyxfhepd.zzpBGItXfub0yWj <= System.currentTimeMillis()) {
                    Context context = (Context) nrjuzzioPqfttNRptBDpZDzSYUrcM.zzpBGItXfub0yWj;
                    Location lastKnownLocation = null;
                    if (sGipz63rTUmSj3uFDvOtzihao.HzCpKshMOoaw76hFcbOVRYMeRd(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        location = lastKnownLocation2;
                    } else {
                        location = null;
                    }
                    if (sGipz63rTUmSj3uFDvOtzihao.HzCpKshMOoaw76hFcbOVRYMeRd(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                        location = lastKnownLocation;
                    }
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (FJ9L7VU9VoIgEkU9qrt8Dm.LaeGQIruHQu81hfJldjMOQSVblH3x == null) {
                            FJ9L7VU9VoIgEkU9qrt8Dm.LaeGQIruHQu81hfJldjMOQSVblH3x = new FJ9L7VU9VoIgEkU9qrt8Dm();
                        }
                        FJ9L7VU9VoIgEkU9qrt8Dm fJ9L7VU9VoIgEkU9qrt8Dm = FJ9L7VU9VoIgEkU9qrt8Dm.LaeGQIruHQu81hfJldjMOQSVblH3x;
                        fJ9L7VU9VoIgEkU9qrt8Dm.VxUQ9tBhpHJ2AAEDNW8sghc4m(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        fJ9L7VU9VoIgEkU9qrt8Dm.VxUQ9tBhpHJ2AAEDNW8sghc4m(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z = fJ9L7VU9VoIgEkU9qrt8Dm.zzpBGItXfub0yWj == 1;
                        long j2 = fJ9L7VU9VoIgEkU9qrt8Dm.ZfQNn8hdWlEQ5cR94249PDsLR;
                        long j3 = fJ9L7VU9VoIgEkU9qrt8Dm.V57tEvNfxZVVcOCAOih5PKr;
                        fJ9L7VU9VoIgEkU9qrt8Dm.VxUQ9tBhpHJ2AAEDNW8sghc4m(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j4 = fJ9L7VU9VoIgEkU9qrt8Dm.ZfQNn8hdWlEQ5cR94249PDsLR;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j3) {
                                j2 = j4;
                            } else if (jCurrentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        ybrhopyxfhepd.VxUQ9tBhpHJ2AAEDNW8sghc4m = z;
                        ybrhopyxfhepd.zzpBGItXfub0yWj = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z = true;
                        }
                    }
                    break;
                } else {
                    z = ybrhopyxfhepd.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                }
                return z ? 2 : 1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wPzckzzcoD(BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY, Context context) {
        super(bbqUXujjobWQwx4SY);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = bbqUXujjobWQwx4SY;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
