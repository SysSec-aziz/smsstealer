package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class bH916XNpUQyRtvyPZq {
    public static final SparseIntArray p59rPv72J9;
    public float GI83zq0G8e7zkn;
    public float HzCpKshMOoaw76hFcbOVRYMeRd;
    public boolean KUYypEB4eNWOZWVDpH;
    public float LaeGQIruHQu81hfJldjMOQSVblH3x;
    public float M9e7PWhFYLD2lOGMker;
    public int NSjgqmGjEzuugn2SsG1mZFP;
    public float V57tEvNfxZVVcOCAOih5PKr;
    public float VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public float ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public float ZfQNn8hdWlEQ5cR94249PDsLR;
    public float q1wNbhk2O6;
    public float zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public float zzpBGItXfub0yWj;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        p59rPv72J9 = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ehtgKpBkv4pNXGKK0RL6dwwx7f.GI83zq0G8e7zkn);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (p59rPv72J9.get(index)) {
                case 1:
                    this.VxUQ9tBhpHJ2AAEDNW8sghc4m = typedArrayObtainStyledAttributes.getFloat(index, this.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                    this.zzpBGItXfub0yWj = typedArrayObtainStyledAttributes.getFloat(index, this.zzpBGItXfub0yWj);
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                    this.V57tEvNfxZVVcOCAOih5PKr = typedArrayObtainStyledAttributes.getFloat(index, this.V57tEvNfxZVVcOCAOih5PKr);
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                    this.ZfQNn8hdWlEQ5cR94249PDsLR = typedArrayObtainStyledAttributes.getFloat(index, this.ZfQNn8hdWlEQ5cR94249PDsLR);
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                    this.LaeGQIruHQu81hfJldjMOQSVblH3x = typedArrayObtainStyledAttributes.getFloat(index, this.LaeGQIruHQu81hfJldjMOQSVblH3x);
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = typedArrayObtainStyledAttributes.getDimension(index, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                    this.ZLZeBXTMq0zDztBxtRTuCHrapQ = typedArrayObtainStyledAttributes.getDimension(index, this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.BYTES_FIELD_NUMBER /* 8 */:
                    this.GI83zq0G8e7zkn = typedArrayObtainStyledAttributes.getDimension(index, this.GI83zq0G8e7zkn);
                    break;
                case 9:
                    this.M9e7PWhFYLD2lOGMker = typedArrayObtainStyledAttributes.getDimension(index, this.M9e7PWhFYLD2lOGMker);
                    break;
                case 10:
                    this.HzCpKshMOoaw76hFcbOVRYMeRd = typedArrayObtainStyledAttributes.getDimension(index, this.HzCpKshMOoaw76hFcbOVRYMeRd);
                    break;
                case 11:
                    this.KUYypEB4eNWOZWVDpH = true;
                    this.q1wNbhk2O6 = typedArrayObtainStyledAttributes.getDimension(index, this.q1wNbhk2O6);
                    break;
                case 12:
                    this.NSjgqmGjEzuugn2SsG1mZFP = nUshirpmbH6saVf9I.zIvmSL0wzmmKGc3X39b2Gw2mUGE(typedArrayObtainStyledAttributes, index, this.NSjgqmGjEzuugn2SsG1mZFP);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
