package com.vdodsodjsdt;

import android.view.inputmethod.InputMethodManager;
import androidx.activity.ImmLeaksCleaner;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dVgcA03YsKXhpp8H implements EfIvTei3Q8wBNpyLTZJevpFxej {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;

    @Override // com.vdodsodjsdt.EfIvTei3Q8wBNpyLTZJevpFxej
    public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                vmZtTJzdHHijKcwQjnkTuR vmzttjzdhhijkcwqjnktur = RM9XTcU4nZHdiezbC1.V57tEvNfxZVVcOCAOih5PKr;
                return Integer.valueOf(RM9XTcU4nZHdiezbC1.V57tEvNfxZVVcOCAOih5PKr.VxUQ9tBhpHJ2AAEDNW8sghc4m().nextInt(2147418112) + 65536);
            default:
                int i = ImmLeaksCleaner.V57tEvNfxZVVcOCAOih5PKr;
                try {
                    InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                    return new uIgaOLYldzFP8RVBcY8v();
                } catch (NoSuchFieldException unused) {
                    return uIgaOLYldzFP8RVBcY8v.HzCpKshMOoaw76hFcbOVRYMeRd;
                }
        }
    }
}
