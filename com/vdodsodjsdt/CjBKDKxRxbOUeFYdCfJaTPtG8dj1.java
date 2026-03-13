package com.vdodsodjsdt;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class CjBKDKxRxbOUeFYdCfJaTPtG8dj1 extends IkV4ezGzeNOYtcxZs6Kvx9TB3Wzl8 {
    public static final Parcelable.Creator<CjBKDKxRxbOUeFYdCfJaTPtG8dj1> CREATOR = new Y8pBwvBl1WknhcIrzNgOk1StjrB9n(1);
    public final boolean GI83zq0G8e7zkn;
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final boolean NSjgqmGjEzuugn2SsG1mZFP;
    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public CjBKDKxRxbOUeFYdCfJaTPtG8dj1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = parcel.readInt();
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = parcel.readInt();
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = parcel.readInt() == 1;
        this.NSjgqmGjEzuugn2SsG1mZFP = parcel.readInt() == 1;
        this.GI83zq0G8e7zkn = parcel.readInt() == 1;
    }

    @Override // com.vdodsodjsdt.IkV4ezGzeNOYtcxZs6Kvx9TB3Wzl8, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        parcel.writeInt(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        parcel.writeInt(this.ZLZeBXTMq0zDztBxtRTuCHrapQ ? 1 : 0);
        parcel.writeInt(this.NSjgqmGjEzuugn2SsG1mZFP ? 1 : 0);
        parcel.writeInt(this.GI83zq0G8e7zkn ? 1 : 0);
    }

    public CjBKDKxRxbOUeFYdCfJaTPtG8dj1(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = bottomSheetBehavior.ymT6yQrus3w;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = bottomSheetBehavior.LaeGQIruHQu81hfJldjMOQSVblH3x;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = bottomSheetBehavior.zzpBGItXfub0yWj;
        this.NSjgqmGjEzuugn2SsG1mZFP = bottomSheetBehavior.qygqjTppWwx992;
        this.GI83zq0G8e7zkn = bottomSheetBehavior.iKANjmyTSxO6v6UuLPdu7DxOjlS;
    }
}
