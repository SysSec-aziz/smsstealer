package com.vdodsodjsdt;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class oEBm3iLeh42WChsi implements Parcelable {
    public static final Parcelable.Creator<oEBm3iLeh42WChsi> CREATOR = new xwyoXom4A1CgVdlXMk(2);
    public final ArrayList Ca81ebIan1u;
    public final int GI83zq0G8e7zkn;
    public final CharSequence HzCpKshMOoaw76hFcbOVRYMeRd;
    public final int KUYypEB4eNWOZWVDpH;
    public final int[] LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final int M9e7PWhFYLD2lOGMker;
    public final String NSjgqmGjEzuugn2SsG1mZFP;
    public final int[] V57tEvNfxZVVcOCAOih5PKr;
    public final int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final ArrayList ZfQNn8hdWlEQ5cR94249PDsLR;
    public final boolean h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public final ArrayList p59rPv72J9;
    public final CharSequence q1wNbhk2O6;
    public final int[] zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public oEBm3iLeh42WChsi(DerC1yFc8TaMSlgxC6TqZtz9 derC1yFc8TaMSlgxC6TqZtz9) {
        int size = derC1yFc8TaMSlgxC6TqZtz9.VxUQ9tBhpHJ2AAEDNW8sghc4m.size();
        this.V57tEvNfxZVVcOCAOih5PKr = new int[size * 6];
        if (!derC1yFc8TaMSlgxC6TqZtz9.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            throw new IllegalStateException("Not on back stack");
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new ArrayList(size);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new int[size];
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            QOMlgg2N3CPFvlf qOMlgg2N3CPFvlf = (QOMlgg2N3CPFvlf) derC1yFc8TaMSlgxC6TqZtz9.VxUQ9tBhpHJ2AAEDNW8sghc4m.get(i2);
            int i3 = i + 1;
            this.V57tEvNfxZVVcOCAOih5PKr[i] = qOMlgg2N3CPFvlf.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            ArrayList arrayList = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            dip85SLOWSmNG3 dip85slowsmng3 = qOMlgg2N3CPFvlf.zzpBGItXfub0yWj;
            arrayList.add(dip85slowsmng3 != null ? dip85slowsmng3.ZLZeBXTMq0zDztBxtRTuCHrapQ : null);
            int[] iArr = this.V57tEvNfxZVVcOCAOih5PKr;
            iArr[i3] = qOMlgg2N3CPFvlf.V57tEvNfxZVVcOCAOih5PKr ? 1 : 0;
            iArr[i + 2] = qOMlgg2N3CPFvlf.ZfQNn8hdWlEQ5cR94249PDsLR;
            iArr[i + 3] = qOMlgg2N3CPFvlf.LaeGQIruHQu81hfJldjMOQSVblH3x;
            int i4 = i + 5;
            iArr[i + 4] = qOMlgg2N3CPFvlf.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            i += 6;
            iArr[i4] = qOMlgg2N3CPFvlf.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            this.LaeGQIruHQu81hfJldjMOQSVblH3x[i2] = qOMlgg2N3CPFvlf.NSjgqmGjEzuugn2SsG1mZFP.ordinal();
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i2] = qOMlgg2N3CPFvlf.GI83zq0G8e7zkn.ordinal();
        }
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = derC1yFc8TaMSlgxC6TqZtz9.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        this.NSjgqmGjEzuugn2SsG1mZFP = derC1yFc8TaMSlgxC6TqZtz9.NSjgqmGjEzuugn2SsG1mZFP;
        this.GI83zq0G8e7zkn = derC1yFc8TaMSlgxC6TqZtz9.ko09zE6UAgwkV;
        this.M9e7PWhFYLD2lOGMker = derC1yFc8TaMSlgxC6TqZtz9.GI83zq0G8e7zkn;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = derC1yFc8TaMSlgxC6TqZtz9.M9e7PWhFYLD2lOGMker;
        this.KUYypEB4eNWOZWVDpH = derC1yFc8TaMSlgxC6TqZtz9.HzCpKshMOoaw76hFcbOVRYMeRd;
        this.q1wNbhk2O6 = derC1yFc8TaMSlgxC6TqZtz9.KUYypEB4eNWOZWVDpH;
        this.p59rPv72J9 = derC1yFc8TaMSlgxC6TqZtz9.q1wNbhk2O6;
        this.Ca81ebIan1u = derC1yFc8TaMSlgxC6TqZtz9.p59rPv72J9;
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = derC1yFc8TaMSlgxC6TqZtz9.Ca81ebIan1u;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.V57tEvNfxZVVcOCAOih5PKr);
        parcel.writeStringList(this.ZfQNn8hdWlEQ5cR94249PDsLR);
        parcel.writeIntArray(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        parcel.writeIntArray(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        parcel.writeInt(this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        parcel.writeString(this.NSjgqmGjEzuugn2SsG1mZFP);
        parcel.writeInt(this.GI83zq0G8e7zkn);
        parcel.writeInt(this.M9e7PWhFYLD2lOGMker);
        TextUtils.writeToParcel(this.HzCpKshMOoaw76hFcbOVRYMeRd, parcel, 0);
        parcel.writeInt(this.KUYypEB4eNWOZWVDpH);
        TextUtils.writeToParcel(this.q1wNbhk2O6, parcel, 0);
        parcel.writeStringList(this.p59rPv72J9);
        parcel.writeStringList(this.Ca81ebIan1u);
        parcel.writeInt(this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv ? 1 : 0);
    }

    public oEBm3iLeh42WChsi(Parcel parcel) {
        this.V57tEvNfxZVVcOCAOih5PKr = parcel.createIntArray();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = parcel.createStringArrayList();
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = parcel.createIntArray();
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = parcel.createIntArray();
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = parcel.readInt();
        this.NSjgqmGjEzuugn2SsG1mZFP = parcel.readString();
        this.GI83zq0G8e7zkn = parcel.readInt();
        this.M9e7PWhFYLD2lOGMker = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = (CharSequence) creator.createFromParcel(parcel);
        this.KUYypEB4eNWOZWVDpH = parcel.readInt();
        this.q1wNbhk2O6 = (CharSequence) creator.createFromParcel(parcel);
        this.p59rPv72J9 = parcel.createStringArrayList();
        this.Ca81ebIan1u = parcel.createStringArrayList();
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = parcel.readInt() != 0;
    }
}
