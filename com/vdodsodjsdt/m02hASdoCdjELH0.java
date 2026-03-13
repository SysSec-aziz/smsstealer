package com.vdodsodjsdt;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class m02hASdoCdjELH0 extends View.BaseSavedState {
    public static final Parcelable.Creator<m02hASdoCdjELH0> CREATOR = new xwyoXom4A1CgVdlXMk(13);
    public int V57tEvNfxZVVcOCAOih5PKr;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.V57tEvNfxZVVcOCAOih5PKr + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.V57tEvNfxZVVcOCAOih5PKr);
    }
}
