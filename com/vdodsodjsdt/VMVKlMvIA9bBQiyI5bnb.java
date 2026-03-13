package com.vdodsodjsdt;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class VMVKlMvIA9bBQiyI5bnb {
    public static final Method V57tEvNfxZVVcOCAOih5PKr;
    public static final Method VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public static final boolean ZfQNn8hdWlEQ5cR94249PDsLR;
    public static final Method zzpBGItXfub0yWj;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            VxUQ9tBhpHJ2AAEDNW8sghc4m = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            zzpBGItXfub0yWj = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            V57tEvNfxZVVcOCAOih5PKr = declaredMethod3;
            declaredMethod3.setAccessible(true);
            ZfQNn8hdWlEQ5cR94249PDsLR = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
