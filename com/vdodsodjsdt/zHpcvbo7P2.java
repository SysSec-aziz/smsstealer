package com.vdodsodjsdt;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class zHpcvbo7P2 implements Parcelable {
    public static final Parcelable.Creator<zHpcvbo7P2> CREATOR = new xwyoXom4A1CgVdlXMk(0);
    public final int V57tEvNfxZVVcOCAOih5PKr;
    public final Intent ZfQNn8hdWlEQ5cR94249PDsLR;

    public zHpcvbo7P2(Intent intent, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.V57tEvNfxZVVcOCAOih5PKr;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.ZfQNn8hdWlEQ5cR94249PDsLR);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ej6unYlOWMDF.pYmKDYlAmhudp(parcel, "dest");
        parcel.writeInt(this.V57tEvNfxZVVcOCAOih5PKr);
        Intent intent = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
