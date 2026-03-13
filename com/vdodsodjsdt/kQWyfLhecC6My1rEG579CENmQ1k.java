package com.vdodsodjsdt;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class kQWyfLhecC6My1rEG579CENmQ1k extends xQQ50DM9zLYsxAJkRLNUyO9l8Max {
    public int GI83zq0G8e7zkn;
    public int HzCpKshMOoaw76hFcbOVRYMeRd;
    public final Parcel LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int M9e7PWhFYLD2lOGMker;
    public final String NSjgqmGjEzuugn2SsG1mZFP;
    public final int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final SparseIntArray ZfQNn8hdWlEQ5cR94249PDsLR;
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public kQWyfLhecC6My1rEG579CENmQ1k(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new qKXCIJM1cKNm0a1RAvamOBOVLgp(0), new qKXCIJM1cKNm0a1RAvamOBOVLgp(0), new qKXCIJM1cKNm0a1RAvamOBOVLgp(0));
    }

    @Override // com.vdodsodjsdt.xQQ50DM9zLYsxAJkRLNUyO9l8Max
    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x(int i) {
        while (this.M9e7PWhFYLD2lOGMker < this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            int i2 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.M9e7PWhFYLD2lOGMker;
            Parcel parcel = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.HzCpKshMOoaw76hFcbOVRYMeRd = parcel.readInt();
            this.M9e7PWhFYLD2lOGMker += i4;
        }
        return this.HzCpKshMOoaw76hFcbOVRYMeRd == i;
    }

    @Override // com.vdodsodjsdt.xQQ50DM9zLYsxAJkRLNUyO9l8Max
    public final void NSjgqmGjEzuugn2SsG1mZFP(int i) {
        int i2 = this.GI83zq0G8e7zkn;
        SparseIntArray sparseIntArray = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        Parcel parcel = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.GI83zq0G8e7zkn = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    @Override // com.vdodsodjsdt.xQQ50DM9zLYsxAJkRLNUyO9l8Max
    public final kQWyfLhecC6My1rEG579CENmQ1k VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        Parcel parcel = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int iDataPosition = parcel.dataPosition();
        int i = this.M9e7PWhFYLD2lOGMker;
        if (i == this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            i = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        }
        return new kQWyfLhecC6My1rEG579CENmQ1k(parcel, iDataPosition, i, u9SlVAuoWhQUfJ.HzCpKshMOoaw76hFcbOVRYMeRd(new StringBuilder(), this.NSjgqmGjEzuugn2SsG1mZFP, "  "), this.VxUQ9tBhpHJ2AAEDNW8sghc4m, this.zzpBGItXfub0yWj, this.V57tEvNfxZVVcOCAOih5PKr);
    }

    public kQWyfLhecC6My1rEG579CENmQ1k(Parcel parcel, int i, int i2, String str, qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp, qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp2, qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp3) {
        super(qkxcijm1cknm0a1ravamobovlgp, qkxcijm1cknm0a1ravamobovlgp2, qkxcijm1cknm0a1ravamobovlgp3);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new SparseIntArray();
        this.GI83zq0G8e7zkn = -1;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = -1;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = parcel;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i2;
        this.M9e7PWhFYLD2lOGMker = i;
        this.NSjgqmGjEzuugn2SsG1mZFP = str;
    }
}
