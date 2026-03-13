package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class nyzrqxPnAGamYOnylXLZzssCn {
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final float V57tEvNfxZVVcOCAOih5PKr;
    public final float VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final float ZfQNn8hdWlEQ5cR94249PDsLR;
    public final float zzpBGItXfub0yWj;

    public nyzrqxPnAGamYOnylXLZzssCn(Context context, XmlResourceParser xmlResourceParser) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = Float.NaN;
        this.zzpBGItXfub0yWj = Float.NaN;
        this.V57tEvNfxZVVcOCAOih5PKr = Float.NaN;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = Float.NaN;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), ehtgKpBkv4pNXGKK0RL6dwwx7f.M9e7PWhFYLD2lOGMker);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.LaeGQIruHQu81hfJldjMOQSVblH3x);
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new nUshirpmbH6saVf9I().zzpBGItXfub0yWj((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.ZfQNn8hdWlEQ5cR94249PDsLR = typedArrayObtainStyledAttributes.getDimension(index, this.ZfQNn8hdWlEQ5cR94249PDsLR);
            } else if (index == 2) {
                this.zzpBGItXfub0yWj = typedArrayObtainStyledAttributes.getDimension(index, this.zzpBGItXfub0yWj);
            } else if (index == 3) {
                this.V57tEvNfxZVVcOCAOih5PKr = typedArrayObtainStyledAttributes.getDimension(index, this.V57tEvNfxZVVcOCAOih5PKr);
            } else if (index == 4) {
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = typedArrayObtainStyledAttributes.getDimension(index, this.VxUQ9tBhpHJ2AAEDNW8sghc4m);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
