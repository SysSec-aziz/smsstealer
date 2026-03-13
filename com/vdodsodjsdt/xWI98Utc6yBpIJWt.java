package com.vdodsodjsdt;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xWI98Utc6yBpIJWt {
    public static void V57tEvNfxZVVcOCAOih5PKr(Object obj, Object obj2) {
        EBfqDxdS0YGkkVoUMoy1NAa7.zIvmSL0wzmmKGc3X39b2Gw2mUGE(obj).unregisterOnBackInvokedCallback(EBfqDxdS0YGkkVoUMoy1NAa7.V57tEvNfxZVVcOCAOih5PKr(obj2));
    }

    public static OnBackInvokedDispatcher VxUQ9tBhpHJ2AAEDNW8sghc4m(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback zzpBGItXfub0yWj(Object obj, BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY) {
        Objects.requireNonNull(bbqUXujjobWQwx4SY);
        EdfWbt9ctq5AGWMF3kpLJDSdqhku edfWbt9ctq5AGWMF3kpLJDSdqhku = new EdfWbt9ctq5AGWMF3kpLJDSdqhku(0, bbqUXujjobWQwx4SY);
        EBfqDxdS0YGkkVoUMoy1NAa7.zIvmSL0wzmmKGc3X39b2Gw2mUGE(obj).registerOnBackInvokedCallback(1000000, edfWbt9ctq5AGWMF3kpLJDSdqhku);
        return edfWbt9ctq5AGWMF3kpLJDSdqhku;
    }
}
