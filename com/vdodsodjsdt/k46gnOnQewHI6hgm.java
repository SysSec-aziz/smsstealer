package com.vdodsodjsdt;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class k46gnOnQewHI6hgm extends ClickableSpan {
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final int V57tEvNfxZVVcOCAOih5PKr;
    public final wzEak8ZKpNWHd4RKPYQ ZfQNn8hdWlEQ5cR94249PDsLR;

    public k46gnOnQewHI6hgm(int i, wzEak8ZKpNWHd4RKPYQ wzeak8zkpnwhd4rkpyq, int i2) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = wzeak8zkpnwhd4rkpyq;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.V57tEvNfxZVVcOCAOih5PKr);
        this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.performAction(this.LaeGQIruHQu81hfJldjMOQSVblH3x, bundle);
    }
}
