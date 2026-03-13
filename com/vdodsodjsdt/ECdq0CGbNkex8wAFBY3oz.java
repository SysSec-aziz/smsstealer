package com.vdodsodjsdt;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ECdq0CGbNkex8wAFBY3oz implements Parcelable {
    public static final Parcelable.Creator<ECdq0CGbNkex8wAFBY3oz> CREATOR = new xwyoXom4A1CgVdlXMk(3);
    public final ArrayList V57tEvNfxZVVcOCAOih5PKr;
    public final ArrayList ZfQNn8hdWlEQ5cR94249PDsLR;

    public ECdq0CGbNkex8wAFBY3oz(Parcel parcel) {
        this.V57tEvNfxZVVcOCAOih5PKr = parcel.createStringArrayList();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = parcel.createTypedArrayList(oEBm3iLeh42WChsi.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.V57tEvNfxZVVcOCAOih5PKr);
        parcel.writeTypedList(this.ZfQNn8hdWlEQ5cR94249PDsLR);
    }
}
