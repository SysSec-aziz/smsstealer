package com.vdodsodjsdt;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class rmGC46IMKtRlsjzf4LFnjhjpsz implements Parcelable {
    public static final Parcelable.Creator<rmGC46IMKtRlsjzf4LFnjhjpsz> CREATOR = new xwyoXom4A1CgVdlXMk(7);
    public ArrayList GI83zq0G8e7zkn;
    public oEBm3iLeh42WChsi[] LaeGQIruHQu81hfJldjMOQSVblH3x;
    public ArrayList M9e7PWhFYLD2lOGMker;
    public ArrayList NSjgqmGjEzuugn2SsG1mZFP;
    public ArrayList V57tEvNfxZVVcOCAOih5PKr;
    public String ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public ArrayList ZfQNn8hdWlEQ5cR94249PDsLR;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.V57tEvNfxZVVcOCAOih5PKr);
        parcel.writeStringList(this.ZfQNn8hdWlEQ5cR94249PDsLR);
        parcel.writeTypedArray(this.LaeGQIruHQu81hfJldjMOQSVblH3x, i);
        parcel.writeInt(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        parcel.writeString(this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        parcel.writeStringList(this.NSjgqmGjEzuugn2SsG1mZFP);
        parcel.writeTypedList(this.GI83zq0G8e7zkn);
        parcel.writeTypedList(this.M9e7PWhFYLD2lOGMker);
    }
}
