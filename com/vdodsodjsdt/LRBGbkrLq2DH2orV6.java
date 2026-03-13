package com.vdodsodjsdt;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class LRBGbkrLq2DH2orV6 extends KfeOQNOupsCg6878zi4e {
    public final /* synthetic */ int Ca81ebIan1u;
    public final /* synthetic */ int h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public final /* synthetic */ lVmDeTGg7MOWpV ko09zE6UAgwkV;
    public final /* synthetic */ WeakReference pYmKDYlAmhudp;

    public LRBGbkrLq2DH2orV6(lVmDeTGg7MOWpV lvmdetgg7mowpv, int i, int i2, WeakReference weakReference) {
        this.ko09zE6UAgwkV = lvmdetgg7mowpv;
        this.Ca81ebIan1u = i;
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = i2;
        this.pYmKDYlAmhudp = weakReference;
    }

    @Override // com.vdodsodjsdt.KfeOQNOupsCg6878zi4e
    public final void qygqjTppWwx992(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.Ca81ebIan1u) != -1) {
            typeface = Wmi1EviNhH.VxUQ9tBhpHJ2AAEDNW8sghc4m(typeface, i, (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv & 2) != 0);
        }
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ko09zE6UAgwkV;
        if (lvmdetgg7mowpv.q1wNbhk2O6) {
            lvmdetgg7mowpv.KUYypEB4eNWOZWVDpH = typeface;
            TextView textView = (TextView) this.pYmKDYlAmhudp.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new QXRsDWGmFmSzZT6WcvPRDxeKS8(lvmdetgg7mowpv.M9e7PWhFYLD2lOGMker, 0, textView, typeface));
                } else {
                    textView.setTypeface(typeface, lvmdetgg7mowpv.M9e7PWhFYLD2lOGMker);
                }
            }
        }
    }

    @Override // com.vdodsodjsdt.KfeOQNOupsCg6878zi4e
    public final void y1NaPKTl7R18DOr6e8i5(int i) {
    }
}
