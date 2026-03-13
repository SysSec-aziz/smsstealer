package com.vdodsodjsdt;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class t7eI2PwFOa extends IkV4ezGzeNOYtcxZs6Kvx9TB3Wzl8 {
    public static final Parcelable.Creator<t7eI2PwFOa> CREATOR = new Y8pBwvBl1WknhcIrzNgOk1StjrB9n(7);
    public CharSequence LaeGQIruHQu81hfJldjMOQSVblH3x;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public t7eI2PwFOa(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.LaeGQIruHQu81hfJldjMOQSVblH3x) + "}";
    }

    @Override // com.vdodsodjsdt.IkV4ezGzeNOYtcxZs6Kvx9TB3Wzl8, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.LaeGQIruHQu81hfJldjMOQSVblH3x, parcel, i);
        parcel.writeInt(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE ? 1 : 0);
    }
}
