package com.vdodsodjsdt;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class WMrYE5mAr1lCj64D implements Parcelable {
    public static final Parcelable.Creator<WMrYE5mAr1lCj64D> CREATOR = new xwyoXom4A1CgVdlXMk(10);
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.V57tEvNfxZVVcOCAOih5PKr);
        parcel.writeInt(this.ZfQNn8hdWlEQ5cR94249PDsLR);
        parcel.writeInt(this.LaeGQIruHQu81hfJldjMOQSVblH3x ? 1 : 0);
    }
}
