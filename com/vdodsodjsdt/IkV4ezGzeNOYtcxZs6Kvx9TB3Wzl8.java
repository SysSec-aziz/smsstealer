package com.vdodsodjsdt;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class IkV4ezGzeNOYtcxZs6Kvx9TB3Wzl8 implements Parcelable {
    public final Parcelable V57tEvNfxZVVcOCAOih5PKr;
    public static final RzPJ8ECazBwP4lkyzH4NnWLfDRtzV ZfQNn8hdWlEQ5cR94249PDsLR = new RzPJ8ECazBwP4lkyzH4NnWLfDRtzV();
    public static final Parcelable.Creator<IkV4ezGzeNOYtcxZs6Kvx9TB3Wzl8> CREATOR = new Y8pBwvBl1WknhcIrzNgOk1StjrB9n(0);

    public IkV4ezGzeNOYtcxZs6Kvx9TB3Wzl8() {
        this.V57tEvNfxZVVcOCAOih5PKr = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.V57tEvNfxZVVcOCAOih5PKr, i);
    }

    public IkV4ezGzeNOYtcxZs6Kvx9TB3Wzl8(Parcelable parcelable) {
        if (parcelable != null) {
            this.V57tEvNfxZVVcOCAOih5PKr = parcelable == ZfQNn8hdWlEQ5cR94249PDsLR ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public IkV4ezGzeNOYtcxZs6Kvx9TB3Wzl8(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.V57tEvNfxZVVcOCAOih5PKr = parcelable == null ? ZfQNn8hdWlEQ5cR94249PDsLR : parcelable;
    }
}
