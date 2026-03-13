package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.vdodsodjsdt.BbDqqUJpcZ8e;
import com.vdodsodjsdt.kQWyfLhecC6My1rEG579CENmQ1k;
import com.vdodsodjsdt.xwyoXom4A1CgVdlXMk;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new xwyoXom4A1CgVdlXMk(14);
    public final BbDqqUJpcZ8e V57tEvNfxZVVcOCAOih5PKr;

    public ParcelImpl(Parcel parcel) {
        this.V57tEvNfxZVVcOCAOih5PKr = new kQWyfLhecC6My1rEG579CENmQ1k(parcel).ZLZeBXTMq0zDztBxtRTuCHrapQ();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new kQWyfLhecC6My1rEG579CENmQ1k(parcel).GI83zq0G8e7zkn(this.V57tEvNfxZVVcOCAOih5PKr);
    }
}
