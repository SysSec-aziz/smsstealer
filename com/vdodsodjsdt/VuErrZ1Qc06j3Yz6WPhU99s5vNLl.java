package com.vdodsodjsdt;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class VuErrZ1Qc06j3Yz6WPhU99s5vNLl extends IkV4ezGzeNOYtcxZs6Kvx9TB3Wzl8 {
    public static final Parcelable.Creator<VuErrZ1Qc06j3Yz6WPhU99s5vNLl> CREATOR = new Y8pBwvBl1WknhcIrzNgOk1StjrB9n(6);
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x;

    public VuErrZ1Qc06j3Yz6WPhU99s5vNLl(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = parcel.readInt();
    }

    @Override // com.vdodsodjsdt.IkV4ezGzeNOYtcxZs6Kvx9TB3Wzl8, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
    }

    public VuErrZ1Qc06j3Yz6WPhU99s5vNLl(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = sideSheetBehavior.NSjgqmGjEzuugn2SsG1mZFP;
    }
}
