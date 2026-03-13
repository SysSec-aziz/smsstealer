package com.vdodsodjsdt;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class XMlqHp2sNChQxkYAA implements Parcelable {
    public static final Parcelable.Creator<XMlqHp2sNChQxkYAA> CREATOR = new xwyoXom4A1CgVdlXMk(4);
    public final int GI83zq0G8e7zkn;
    public final wIfNfljSFD2BnwQk6jI LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final int NSjgqmGjEzuugn2SsG1mZFP;
    public final TOzjEyj2IN5fWYir V57tEvNfxZVVcOCAOih5PKr;
    public final int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final TOzjEyj2IN5fWYir ZfQNn8hdWlEQ5cR94249PDsLR;
    public final TOzjEyj2IN5fWYir zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public XMlqHp2sNChQxkYAA(TOzjEyj2IN5fWYir tOzjEyj2IN5fWYir, TOzjEyj2IN5fWYir tOzjEyj2IN5fWYir2, wIfNfljSFD2BnwQk6jI wifnfljsfd2bnwqk6ji, TOzjEyj2IN5fWYir tOzjEyj2IN5fWYir3, int i) {
        Objects.requireNonNull(tOzjEyj2IN5fWYir, "start cannot be null");
        Objects.requireNonNull(tOzjEyj2IN5fWYir2, "end cannot be null");
        Objects.requireNonNull(wifnfljsfd2bnwqk6ji, "validator cannot be null");
        this.V57tEvNfxZVVcOCAOih5PKr = tOzjEyj2IN5fWYir;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = tOzjEyj2IN5fWYir2;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = tOzjEyj2IN5fWYir3;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = wifnfljsfd2bnwqk6ji;
        if (tOzjEyj2IN5fWYir3 != null && tOzjEyj2IN5fWYir.V57tEvNfxZVVcOCAOih5PKr.compareTo(tOzjEyj2IN5fWYir3.V57tEvNfxZVVcOCAOih5PKr) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (tOzjEyj2IN5fWYir3 != null && tOzjEyj2IN5fWYir3.V57tEvNfxZVVcOCAOih5PKr.compareTo(tOzjEyj2IN5fWYir2.V57tEvNfxZVVcOCAOih5PKr) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > mkWvedkJ40E0CXleCgI.V57tEvNfxZVVcOCAOih5PKr(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.GI83zq0G8e7zkn = tOzjEyj2IN5fWYir.ZfQNn8hdWlEQ5cR94249PDsLR(tOzjEyj2IN5fWYir2) + 1;
        this.NSjgqmGjEzuugn2SsG1mZFP = (tOzjEyj2IN5fWYir2.LaeGQIruHQu81hfJldjMOQSVblH3x - tOzjEyj2IN5fWYir.LaeGQIruHQu81hfJldjMOQSVblH3x) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XMlqHp2sNChQxkYAA)) {
            return false;
        }
        XMlqHp2sNChQxkYAA xMlqHp2sNChQxkYAA = (XMlqHp2sNChQxkYAA) obj;
        return this.V57tEvNfxZVVcOCAOih5PKr.equals(xMlqHp2sNChQxkYAA.V57tEvNfxZVVcOCAOih5PKr) && this.ZfQNn8hdWlEQ5cR94249PDsLR.equals(xMlqHp2sNChQxkYAA.ZfQNn8hdWlEQ5cR94249PDsLR) && Objects.equals(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, xMlqHp2sNChQxkYAA.zIvmSL0wzmmKGc3X39b2Gw2mUGE) && this.ZLZeBXTMq0zDztBxtRTuCHrapQ == xMlqHp2sNChQxkYAA.ZLZeBXTMq0zDztBxtRTuCHrapQ && this.LaeGQIruHQu81hfJldjMOQSVblH3x.equals(xMlqHp2sNChQxkYAA.LaeGQIruHQu81hfJldjMOQSVblH3x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.V57tEvNfxZVVcOCAOih5PKr, this.ZfQNn8hdWlEQ5cR94249PDsLR, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, Integer.valueOf(this.ZLZeBXTMq0zDztBxtRTuCHrapQ), this.LaeGQIruHQu81hfJldjMOQSVblH3x});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.V57tEvNfxZVVcOCAOih5PKr, 0);
        parcel.writeParcelable(this.ZfQNn8hdWlEQ5cR94249PDsLR, 0);
        parcel.writeParcelable(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, 0);
        parcel.writeParcelable(this.LaeGQIruHQu81hfJldjMOQSVblH3x, 0);
        parcel.writeInt(this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
    }
}
