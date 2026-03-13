package com.vdodsodjsdt;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class gElQ3Q9ZHXy5F6j implements Parcelable {
    public static final Parcelable.Creator<gElQ3Q9ZHXy5F6j> CREATOR = new xwyoXom4A1CgVdlXMk(8);
    public Bundle Ca81ebIan1u;
    public final boolean GI83zq0G8e7zkn;
    public final boolean HzCpKshMOoaw76hFcbOVRYMeRd;
    public final Bundle KUYypEB4eNWOZWVDpH;
    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final boolean M9e7PWhFYLD2lOGMker;
    public final String NSjgqmGjEzuugn2SsG1mZFP;
    public final String V57tEvNfxZVVcOCAOih5PKr;
    public final int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final String ZfQNn8hdWlEQ5cR94249PDsLR;
    public final int p59rPv72J9;
    public final boolean q1wNbhk2O6;
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public gElQ3Q9ZHXy5F6j(dip85SLOWSmNG3 dip85slowsmng3) {
        this.V57tEvNfxZVVcOCAOih5PKr = dip85slowsmng3.getClass().getName();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = dip85slowsmng3.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = dip85slowsmng3.Ca81ebIan1u;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = dip85slowsmng3.q11o1hieEkZDhF1MGOZI26oZiDT;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = dip85slowsmng3.w0Wu95l8dVNw5rZMRu;
        this.NSjgqmGjEzuugn2SsG1mZFP = dip85slowsmng3.RhfGHxtXxy0M0grmp2jkRjQg;
        this.GI83zq0G8e7zkn = dip85slowsmng3.pzqP2AqKW6J5PO8zCKnW;
        this.M9e7PWhFYLD2lOGMker = dip85slowsmng3.p59rPv72J9;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = dip85slowsmng3.SuB3hEmTmbbRGAhtvOOmfKEon;
        this.KUYypEB4eNWOZWVDpH = dip85slowsmng3.NSjgqmGjEzuugn2SsG1mZFP;
        this.q1wNbhk2O6 = dip85slowsmng3.qNPQb1obP7;
        this.p59rPv72J9 = dip85slowsmng3.ymT6yQrus3w.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.V57tEvNfxZVVcOCAOih5PKr);
        sb.append(" (");
        sb.append(this.ZfQNn8hdWlEQ5cR94249PDsLR);
        sb.append(")}:");
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            sb.append(" fromLayout");
        }
        int i = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.GI83zq0G8e7zkn) {
            sb.append(" retainInstance");
        }
        if (this.M9e7PWhFYLD2lOGMker) {
            sb.append(" removing");
        }
        if (this.HzCpKshMOoaw76hFcbOVRYMeRd) {
            sb.append(" detached");
        }
        if (this.q1wNbhk2O6) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.V57tEvNfxZVVcOCAOih5PKr);
        parcel.writeString(this.ZfQNn8hdWlEQ5cR94249PDsLR);
        parcel.writeInt(this.LaeGQIruHQu81hfJldjMOQSVblH3x ? 1 : 0);
        parcel.writeInt(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        parcel.writeInt(this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        parcel.writeString(this.NSjgqmGjEzuugn2SsG1mZFP);
        parcel.writeInt(this.GI83zq0G8e7zkn ? 1 : 0);
        parcel.writeInt(this.M9e7PWhFYLD2lOGMker ? 1 : 0);
        parcel.writeInt(this.HzCpKshMOoaw76hFcbOVRYMeRd ? 1 : 0);
        parcel.writeBundle(this.KUYypEB4eNWOZWVDpH);
        parcel.writeInt(this.q1wNbhk2O6 ? 1 : 0);
        parcel.writeBundle(this.Ca81ebIan1u);
        parcel.writeInt(this.p59rPv72J9);
    }

    public gElQ3Q9ZHXy5F6j(Parcel parcel) {
        this.V57tEvNfxZVVcOCAOih5PKr = parcel.readString();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = parcel.readString();
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = parcel.readInt() != 0;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = parcel.readInt();
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = parcel.readInt();
        this.NSjgqmGjEzuugn2SsG1mZFP = parcel.readString();
        this.GI83zq0G8e7zkn = parcel.readInt() != 0;
        this.M9e7PWhFYLD2lOGMker = parcel.readInt() != 0;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = parcel.readInt() != 0;
        this.KUYypEB4eNWOZWVDpH = parcel.readBundle();
        this.q1wNbhk2O6 = parcel.readInt() != 0;
        this.Ca81ebIan1u = parcel.readBundle();
        this.p59rPv72J9 = parcel.readInt();
    }
}
