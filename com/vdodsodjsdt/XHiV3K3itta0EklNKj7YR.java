package com.vdodsodjsdt;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class XHiV3K3itta0EklNKj7YR extends L2xGLj001m6N5u {
    @Override // com.vdodsodjsdt.L2xGLj001m6N5u, com.vdodsodjsdt.JT6PXd38CBi5tHeMfMxSsi
    public void VxUQ9tBhpHJ2AAEDNW8sghc4m(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // com.vdodsodjsdt.JT6PXd38CBi5tHeMfMxSsi
    public boolean zzpBGItXfub0yWj(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
