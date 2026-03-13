package com.vdodsodjsdt;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class neCTKJPHujsSxgUr6c extends View.BaseSavedState {
    public static final Parcelable.Creator<neCTKJPHujsSxgUr6c> CREATOR = new xwyoXom4A1CgVdlXMk(11);
    public int V57tEvNfxZVVcOCAOih5PKr;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.V57tEvNfxZVVcOCAOih5PKr;
        return u9SlVAuoWhQUfJ.HzCpKshMOoaw76hFcbOVRYMeRd(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.V57tEvNfxZVVcOCAOih5PKr));
    }
}
