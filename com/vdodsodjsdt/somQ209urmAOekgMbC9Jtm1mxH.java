package com.vdodsodjsdt;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class somQ209urmAOekgMbC9Jtm1mxH extends InputConnectionWrapper {
    public final /* synthetic */ Jc01di1Hsv VxUQ9tBhpHJ2AAEDNW8sghc4m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public somQ209urmAOekgMbC9Jtm1mxH(InputConnection inputConnection, Jc01di1Hsv jc01di1Hsv) {
        super(inputConnection, false);
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = jc01di1Hsv;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            skgk8FYn8b4TvRiBOsElZw4XkNLhQ = new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(23, new aOO0ZIJUTem4dsrnzqehnx(inputContentInfo));
        }
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR(skgk8FYn8b4TvRiBOsElZw4XkNLhQ, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
