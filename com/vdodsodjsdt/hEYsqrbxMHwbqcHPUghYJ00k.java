package com.vdodsodjsdt;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class hEYsqrbxMHwbqcHPUghYJ00k extends IkV4ezGzeNOYtcxZs6Kvx9TB3Wzl8 {
    public static final Parcelable.Creator<hEYsqrbxMHwbqcHPUghYJ00k> CREATOR = new Y8pBwvBl1WknhcIrzNgOk1StjrB9n(3);
    public SparseArray LaeGQIruHQu81hfJldjMOQSVblH3x;

    public hEYsqrbxMHwbqcHPUghYJ00k(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new SparseArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x.append(iArr[i2], parcelableArray[i2]);
        }
    }

    @Override // com.vdodsodjsdt.IkV4ezGzeNOYtcxZs6Kvx9TB3Wzl8, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.LaeGQIruHQu81hfJldjMOQSVblH3x.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.LaeGQIruHQu81hfJldjMOQSVblH3x.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
