package com.vdodsodjsdt;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class JOx6bG7C3UqtU5xE9gpYRyQ3 extends IkV4ezGzeNOYtcxZs6Kvx9TB3Wzl8 {
    public static final Parcelable.Creator<JOx6bG7C3UqtU5xE9gpYRyQ3> CREATOR = new Y8pBwvBl1WknhcIrzNgOk1StjrB9n(4);
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;

    public JOx6bG7C3UqtU5xE9gpYRyQ3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            JOx6bG7C3UqtU5xE9gpYRyQ3.class.getClassLoader();
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = parcel.readInt() == 1;
    }

    @Override // com.vdodsodjsdt.IkV4ezGzeNOYtcxZs6Kvx9TB3Wzl8, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.LaeGQIruHQu81hfJldjMOQSVblH3x ? 1 : 0);
    }
}
