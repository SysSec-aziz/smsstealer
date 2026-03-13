package com.vdodsodjsdt;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class s1HWM1e1d8DbWRjBkwUg1fGy extends IkV4ezGzeNOYtcxZs6Kvx9TB3Wzl8 {
    public static final Parcelable.Creator<s1HWM1e1d8DbWRjBkwUg1fGy> CREATOR = new Y8pBwvBl1WknhcIrzNgOk1StjrB9n(5);
    public Parcelable LaeGQIruHQu81hfJldjMOQSVblH3x;

    public s1HWM1e1d8DbWRjBkwUg1fGy(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = parcel.readParcelable(classLoader == null ? wbBBe1vAdVO1DmSg1odNaySAYTu.class.getClassLoader() : classLoader);
    }

    @Override // com.vdodsodjsdt.IkV4ezGzeNOYtcxZs6Kvx9TB3Wzl8, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.LaeGQIruHQu81hfJldjMOQSVblH3x, 0);
    }
}
