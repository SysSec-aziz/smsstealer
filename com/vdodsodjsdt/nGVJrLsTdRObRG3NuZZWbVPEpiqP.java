package com.vdodsodjsdt;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nGVJrLsTdRObRG3NuZZWbVPEpiqP {
    public static final Field VxUQ9tBhpHJ2AAEDNW8sghc4m;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m = declaredField;
    }
}
