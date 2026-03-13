package com.vdodsodjsdt;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class gjJSYRXNQYALPwuWEJb5HLx implements Parcelable {
    public static final Parcelable.Creator<gjJSYRXNQYALPwuWEJb5HLx> CREATOR = new xwyoXom4A1CgVdlXMk(9);
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final IntentSender V57tEvNfxZVVcOCAOih5PKr;
    public final Intent ZfQNn8hdWlEQ5cR94249PDsLR;
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public gjJSYRXNQYALPwuWEJb5HLx(IntentSender intentSender, Intent intent, int i, int i2) {
        this.V57tEvNfxZVVcOCAOih5PKr = intentSender;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = intent;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ej6unYlOWMDF.pYmKDYlAmhudp(parcel, "dest");
        parcel.writeParcelable(this.V57tEvNfxZVVcOCAOih5PKr, i);
        parcel.writeParcelable(this.ZfQNn8hdWlEQ5cR94249PDsLR, i);
        parcel.writeInt(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        parcel.writeInt(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
    }
}
