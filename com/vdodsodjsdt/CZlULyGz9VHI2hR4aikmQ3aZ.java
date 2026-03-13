package com.vdodsodjsdt;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class CZlULyGz9VHI2hR4aikmQ3aZ implements AdapterView.OnItemClickListener {
    public final /* synthetic */ Gt8fhhaURUjWttrW0OXlZUFzhhQB V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ qGYIn01XoNfZuI2hQ0Q ZfQNn8hdWlEQ5cR94249PDsLR;

    public CZlULyGz9VHI2hR4aikmQ3aZ(qGYIn01XoNfZuI2hQ0Q qgyin01xonfzui2hq0q, Gt8fhhaURUjWttrW0OXlZUFzhhQB gt8fhhaURUjWttrW0OXlZUFzhhQB) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = qgyin01xonfzui2hq0q;
        this.V57tEvNfxZVVcOCAOih5PKr = gt8fhhaURUjWttrW0OXlZUFzhhQB;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        qGYIn01XoNfZuI2hQ0Q qgyin01xonfzui2hq0q = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        DialogInterface.OnClickListener onClickListener = qgyin01xonfzui2hq0q.NSjgqmGjEzuugn2SsG1mZFP;
        Gt8fhhaURUjWttrW0OXlZUFzhhQB gt8fhhaURUjWttrW0OXlZUFzhhQB = this.V57tEvNfxZVVcOCAOih5PKr;
        onClickListener.onClick(gt8fhhaURUjWttrW0OXlZUFzhhQB.zzpBGItXfub0yWj, i);
        if (qgyin01xonfzui2hq0q.GI83zq0G8e7zkn) {
            return;
        }
        gt8fhhaURUjWttrW0OXlZUFzhhQB.zzpBGItXfub0yWj.dismiss();
    }
}
