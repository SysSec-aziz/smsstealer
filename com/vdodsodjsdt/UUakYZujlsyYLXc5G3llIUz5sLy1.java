package com.vdodsodjsdt;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class UUakYZujlsyYLXc5G3llIUz5sLy1 extends IkV4ezGzeNOYtcxZs6Kvx9TB3Wzl8 {
    public static final Parcelable.Creator<UUakYZujlsyYLXc5G3llIUz5sLy1> CREATOR = new Y8pBwvBl1WknhcIrzNgOk1StjrB9n(8);
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public UUakYZujlsyYLXc5G3llIUz5sLy1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = parcel.readInt();
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = parcel.readInt() != 0;
    }

    @Override // com.vdodsodjsdt.IkV4ezGzeNOYtcxZs6Kvx9TB3Wzl8, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        parcel.writeInt(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE ? 1 : 0);
    }
}
