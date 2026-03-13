package com.vdodsodjsdt;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class NTPz9pwQeCq8XcusVSo9VJ implements R7HIv9FSowFmMzxDvYq6jskIyefYM {
    public final ScrollFeedbackProvider V57tEvNfxZVVcOCAOih5PKr;

    public NTPz9pwQeCq8XcusVSo9VJ(NestedScrollView nestedScrollView) {
        this.V57tEvNfxZVVcOCAOih5PKr = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // com.vdodsodjsdt.R7HIv9FSowFmMzxDvYq6jskIyefYM
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.V57tEvNfxZVVcOCAOih5PKr.onScrollLimit(i, i2, i3, z);
    }

    @Override // com.vdodsodjsdt.R7HIv9FSowFmMzxDvYq6jskIyefYM
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.V57tEvNfxZVVcOCAOih5PKr.onScrollProgress(i, i2, i3, i4);
    }
}
