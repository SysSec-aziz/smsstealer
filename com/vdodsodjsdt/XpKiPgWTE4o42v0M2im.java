package com.vdodsodjsdt;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class XpKiPgWTE4o42v0M2im implements Parcelable {
    public static final Parcelable.Creator<XpKiPgWTE4o42v0M2im> CREATOR = new xwyoXom4A1CgVdlXMk(16);
    public ArrayList GI83zq0G8e7zkn;
    public boolean HzCpKshMOoaw76hFcbOVRYMeRd;
    public boolean KUYypEB4eNWOZWVDpH;
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public boolean M9e7PWhFYLD2lOGMker;
    public int[] NSjgqmGjEzuugn2SsG1mZFP;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public int[] zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.V57tEvNfxZVVcOCAOih5PKr);
        parcel.writeInt(this.ZfQNn8hdWlEQ5cR94249PDsLR);
        parcel.writeInt(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x > 0) {
            parcel.writeIntArray(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        }
        parcel.writeInt(this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ > 0) {
            parcel.writeIntArray(this.NSjgqmGjEzuugn2SsG1mZFP);
        }
        parcel.writeInt(this.M9e7PWhFYLD2lOGMker ? 1 : 0);
        parcel.writeInt(this.HzCpKshMOoaw76hFcbOVRYMeRd ? 1 : 0);
        parcel.writeInt(this.KUYypEB4eNWOZWVDpH ? 1 : 0);
        parcel.writeList(this.GI83zq0G8e7zkn);
    }
}
