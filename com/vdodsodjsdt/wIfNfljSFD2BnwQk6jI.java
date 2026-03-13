package com.vdodsodjsdt;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class wIfNfljSFD2BnwQk6jI implements Parcelable {
    public static final Parcelable.Creator<wIfNfljSFD2BnwQk6jI> CREATOR = new xwyoXom4A1CgVdlXMk(5);
    public final long V57tEvNfxZVVcOCAOih5PKr;

    public wIfNfljSFD2BnwQk6jI(long j) {
        this.V57tEvNfxZVVcOCAOih5PKr = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wIfNfljSFD2BnwQk6jI) && this.V57tEvNfxZVVcOCAOih5PKr == ((wIfNfljSFD2BnwQk6jI) obj).V57tEvNfxZVVcOCAOih5PKr;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.V57tEvNfxZVVcOCAOih5PKr)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.V57tEvNfxZVVcOCAOih5PKr);
    }
}
