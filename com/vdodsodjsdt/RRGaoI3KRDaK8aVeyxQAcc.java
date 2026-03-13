package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class RRGaoI3KRDaK8aVeyxQAcc {
    public final Object V57tEvNfxZVVcOCAOih5PKr;
    public int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public int zzpBGItXfub0yWj;

    public RRGaoI3KRDaK8aVeyxQAcc(View view) {
        this.V57tEvNfxZVVcOCAOih5PKr = view;
    }

    public RRGaoI3KRDaK8aVeyxQAcc(Context context, XmlResourceParser xmlResourceParser) {
        this.V57tEvNfxZVVcOCAOih5PKr = new ArrayList();
        this.zzpBGItXfub0yWj = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), ehtgKpBkv4pNXGKK0RL6dwwx7f.NSjgqmGjEzuugn2SsG1mZFP);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = typedArrayObtainStyledAttributes.getResourceId(index, this.VxUQ9tBhpHJ2AAEDNW8sghc4m);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.zzpBGItXfub0yWj);
                this.zzpBGItXfub0yWj = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new nUshirpmbH6saVf9I().zzpBGItXfub0yWj((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public RRGaoI3KRDaK8aVeyxQAcc() {
        this.V57tEvNfxZVVcOCAOih5PKr = new RRGaoI3KRDaK8aVeyxQAcc[256];
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
        this.zzpBGItXfub0yWj = 0;
    }

    public RRGaoI3KRDaK8aVeyxQAcc(int i, int i2) {
        this.V57tEvNfxZVVcOCAOih5PKr = null;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        int i3 = i2 & 7;
        this.zzpBGItXfub0yWj = i3 == 0 ? 8 : i3;
    }
}
