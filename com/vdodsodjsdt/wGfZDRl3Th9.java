package com.vdodsodjsdt;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class wGfZDRl3Th9 implements View.OnClickListener {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ Object ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ wGfZDRl3Th9(int i, Object obj) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                ((KoccBHOLe4XJgL) this.ZfQNn8hdWlEQ5cR94249PDsLR).VxUQ9tBhpHJ2AAEDNW8sghc4m();
                break;
            case 1:
                Gt8fhhaURUjWttrW0OXlZUFzhhQB gt8fhhaURUjWttrW0OXlZUFzhhQB = (Gt8fhhaURUjWttrW0OXlZUFzhhQB) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                gt8fhhaURUjWttrW0OXlZUFzhhQB.TaDO7ogis3aEiWEtq.obtainMessage(1, gt8fhhaURUjWttrW0OXlZUFzhhQB.zzpBGItXfub0yWj).sendToTarget();
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                ddDbMgQuo9affXXIMNMhQZaG3 dddbmgquo9affxximnmhqzag3 = (ddDbMgQuo9affXXIMNMhQZaG3) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                int i = dddbmgquo9affxximnmhqzag3.zOk739gUM7zIZC25HHUxoiyixWFjn;
                if (i == 2) {
                    dddbmgquo9affxximnmhqzag3.HVEwbdULInpTNa0IG(1);
                    dddbmgquo9affxximnmhqzag3.H2VFYNJEVGAX.announceForAccessibility(dddbmgquo9affxximnmhqzag3.SuB3hEmTmbbRGAhtvOOmfKEon().getResources().getString(R.string.mtrl_picker_toggled_to_day_selection));
                } else if (i == 1) {
                    dddbmgquo9affxximnmhqzag3.HVEwbdULInpTNa0IG(2);
                    dddbmgquo9affxximnmhqzag3.rERAmyEtGV6ANGszuKcQI.announceForAccessibility(dddbmgquo9affxximnmhqzag3.SuB3hEmTmbbRGAhtvOOmfKEon().getResources().getString(R.string.mtrl_picker_toggled_to_year_selection));
                }
                break;
            default:
                qE1OfTIjlj6BdfNlBJklCURi qe1oftijlj6bdfnlbjklcuri = ((Toolbar) this.ZfQNn8hdWlEQ5cR94249PDsLR).ymT6yQrus3w;
                rkuo6pAmWq0N rkuo6pamwq0n = qe1oftijlj6bdfnlbjklcuri == null ? null : qe1oftijlj6bdfnlbjklcuri.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (rkuo6pamwq0n != null) {
                    rkuo6pamwq0n.collapseActionView();
                }
                break;
        }
    }
}
