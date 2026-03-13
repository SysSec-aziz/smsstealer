package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class WJZtWYAr4vKPgpkod {
    public static final SparseIntArray M9e7PWhFYLD2lOGMker;
    public int GI83zq0G8e7zkn;
    public float LaeGQIruHQu81hfJldjMOQSVblH3x;
    public String NSjgqmGjEzuugn2SsG1mZFP;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public float ZfQNn8hdWlEQ5cR94249PDsLR;
    public float zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public int zzpBGItXfub0yWj;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M9e7PWhFYLD2lOGMker = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ehtgKpBkv4pNXGKK0RL6dwwx7f.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (M9e7PWhFYLD2lOGMker.get(index)) {
                case 1:
                    this.LaeGQIruHQu81hfJldjMOQSVblH3x = typedArrayObtainStyledAttributes.getFloat(index, this.LaeGQIruHQu81hfJldjMOQSVblH3x);
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                    this.V57tEvNfxZVVcOCAOih5PKr = typedArrayObtainStyledAttributes.getInt(index, this.V57tEvNfxZVVcOCAOih5PKr);
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.zzpBGItXfub0yWj[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                    this.VxUQ9tBhpHJ2AAEDNW8sghc4m = nUshirpmbH6saVf9I.zIvmSL0wzmmKGc3X39b2Gw2mUGE(typedArrayObtainStyledAttributes, index, this.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.zzpBGItXfub0yWj = typedArrayObtainStyledAttributes.getInteger(index, this.zzpBGItXfub0yWj);
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                    this.ZfQNn8hdWlEQ5cR94249PDsLR = typedArrayObtainStyledAttributes.getFloat(index, this.ZfQNn8hdWlEQ5cR94249PDsLR);
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.BYTES_FIELD_NUMBER /* 8 */:
                    this.ZLZeBXTMq0zDztBxtRTuCHrapQ = typedArrayObtainStyledAttributes.getInteger(index, this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
                    break;
                case 9:
                    this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = typedArrayObtainStyledAttributes.getFloat(index, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                    break;
                case 10:
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.GI83zq0G8e7zkn = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    } else if (i2 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.NSjgqmGjEzuugn2SsG1mZFP = string;
                        if (string.indexOf("/") > 0) {
                            this.GI83zq0G8e7zkn = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.GI83zq0G8e7zkn);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
