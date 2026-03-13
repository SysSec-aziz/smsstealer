package com.vdodsodjsdt;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class EtMSUTyuo3<S> extends cL3uFygUcBAb {
    public int vXWl0o6I4U59CgHs9;
    public XMlqHp2sNChQxkYAA wdI7vzA3Qmcwd;

    @Override // com.vdodsodjsdt.dip85SLOWSmNG3
    public final void Irh5auREsoeV1C1RaBamlmy(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.vXWl0o6I4U59CgHs9);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.wdI7vzA3Qmcwd);
    }

    @Override // com.vdodsodjsdt.dip85SLOWSmNG3
    public final View jW7EiD0YL6xkbB158jMUzhWNWb1y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(NSjgqmGjEzuugn2SsG1mZFP(), this.vXWl0o6I4U59CgHs9));
        throw null;
    }

    @Override // com.vdodsodjsdt.dip85SLOWSmNG3
    public final void ko09zE6UAgwkV(Bundle bundle) {
        super.ko09zE6UAgwkV(bundle);
        if (bundle == null) {
            bundle = this.NSjgqmGjEzuugn2SsG1mZFP;
        }
        this.vXWl0o6I4U59CgHs9 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.wdI7vzA3Qmcwd = (XMlqHp2sNChQxkYAA) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }
}
