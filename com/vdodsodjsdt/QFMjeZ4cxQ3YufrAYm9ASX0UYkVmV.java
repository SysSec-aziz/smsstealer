package com.vdodsodjsdt;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class QFMjeZ4cxQ3YufrAYm9ASX0UYkVmV implements Parcelable {
    public static final Parcelable.Creator<QFMjeZ4cxQ3YufrAYm9ASX0UYkVmV> CREATOR = new xwyoXom4A1CgVdlXMk(15);
    public int[] LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.V57tEvNfxZVVcOCAOih5PKr + ", mGapDir=" + this.ZfQNn8hdWlEQ5cR94249PDsLR + ", mHasUnwantedGapAfter=" + this.zIvmSL0wzmmKGc3X39b2Gw2mUGE + ", mGapPerSpan=" + Arrays.toString(this.LaeGQIruHQu81hfJldjMOQSVblH3x) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.V57tEvNfxZVVcOCAOih5PKr);
        parcel.writeInt(this.ZfQNn8hdWlEQ5cR94249PDsLR);
        parcel.writeInt(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE ? 1 : 0);
        int[] iArr = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        }
    }
}
