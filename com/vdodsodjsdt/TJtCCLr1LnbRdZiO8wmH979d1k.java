package com.vdodsodjsdt;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class TJtCCLr1LnbRdZiO8wmH979d1k implements UiKibUXaicctwiwbr8Jrmq2BMS {
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final Object zzpBGItXfub0yWj;

    public TJtCCLr1LnbRdZiO8wmH979d1k(ALnH3AptNOGA7UbXGxOl2SnVeZ aLnH3AptNOGA7UbXGxOl2SnVeZ) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 1;
        this.zzpBGItXfub0yWj = new LinkedHashSet();
        aLnH3AptNOGA7UbXGxOl2SnVeZ.LaeGQIruHQu81hfJldjMOQSVblH3x("androidx.savedstate.Restarter", this);
    }

    @Override // com.vdodsodjsdt.UiKibUXaicctwiwbr8Jrmq2BMS
    public final Bundle VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                Bundle bundle = new Bundle();
                ((MainActivity) this.zzpBGItXfub0yWj).HzCpKshMOoaw76hFcbOVRYMeRd().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.zzpBGItXfub0yWj));
                return bundle2;
        }
    }

    public TJtCCLr1LnbRdZiO8wmH979d1k(MainActivity mainActivity) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
        this.zzpBGItXfub0yWj = mainActivity;
    }
}
