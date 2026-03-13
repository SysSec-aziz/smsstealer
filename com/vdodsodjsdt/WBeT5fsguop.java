package com.vdodsodjsdt;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class WBeT5fsguop extends ViewOutlineProvider {
    public final /* synthetic */ Chip VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public WBeT5fsguop(Chip chip) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
