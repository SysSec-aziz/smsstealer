package com.vdodsodjsdt;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class GdqWnDxkSxbN8kinzSHUlryQn0WM {
    public static final ArrayList ZfQNn8hdWlEQ5cR94249PDsLR = new ArrayList();
    public WeakReference V57tEvNfxZVVcOCAOih5PKr;
    public WeakHashMap VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public SparseArray zzpBGItXfub0yWj;

    public final View VxUQ9tBhpHJ2AAEDNW8sghc4m(View view) {
        int size;
        WeakHashMap weakHashMap = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m(viewGroup.getChildAt(childCount));
                if (viewVxUQ9tBhpHJ2AAEDNW8sghc4m != null) {
                    return viewVxUQ9tBhpHJ2AAEDNW8sghc4m;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
