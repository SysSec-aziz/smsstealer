package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class hdKGVRpn3DqhXUHXyNOxMgD {
    public float V57tEvNfxZVVcOCAOih5PKr;
    public int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public float ZfQNn8hdWlEQ5cR94249PDsLR;
    public int zzpBGItXfub0yWj;

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ehtgKpBkv4pNXGKK0RL6dwwx7f.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.V57tEvNfxZVVcOCAOih5PKr = typedArrayObtainStyledAttributes.getFloat(index, this.V57tEvNfxZVVcOCAOih5PKr);
            } else if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i2;
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = nUshirpmbH6saVf9I.ZfQNn8hdWlEQ5cR94249PDsLR[i2];
            } else if (index == 4) {
                this.zzpBGItXfub0yWj = typedArrayObtainStyledAttributes.getInt(index, this.zzpBGItXfub0yWj);
            } else if (index == 3) {
                this.ZfQNn8hdWlEQ5cR94249PDsLR = typedArrayObtainStyledAttributes.getFloat(index, this.ZfQNn8hdWlEQ5cR94249PDsLR);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
