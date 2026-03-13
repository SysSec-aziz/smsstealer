package com.vdodsodjsdt;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class UHvbXkh4dyB077F7trAwSu implements View.OnClickListener {
    public final /* synthetic */ Object LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final Object ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ UHvbXkh4dyB077F7trAwSu(ddDbMgQuo9affXXIMNMhQZaG3 dddbmgquo9affxximnmhqzag3, com.google.android.material.datepicker.zApUME12W6SOuCVHxVPKvzGb3V zapume12w6soucvhxvpkvzgb3v, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = dddbmgquo9affxximnmhqzag3;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = zapume12w6soucvhxvpkvzgb3v;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                ddDbMgQuo9affXXIMNMhQZaG3 dddbmgquo9affxximnmhqzag3 = (ddDbMgQuo9affXXIMNMhQZaG3) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                int iTf2p6GzNN7uQY7Lun0pJ = ((LinearLayoutManager) dddbmgquo9affxximnmhqzag3.H2VFYNJEVGAX.getLayoutManager()).tf2p6GzNN7uQY7Lun0pJ();
                Calendar calendarVxUQ9tBhpHJ2AAEDNW8sghc4m = mkWvedkJ40E0CXleCgI.VxUQ9tBhpHJ2AAEDNW8sghc4m(((com.google.android.material.datepicker.zApUME12W6SOuCVHxVPKvzGb3V) this.ZfQNn8hdWlEQ5cR94249PDsLR).ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr.V57tEvNfxZVVcOCAOih5PKr);
                calendarVxUQ9tBhpHJ2AAEDNW8sghc4m.add(2, iTf2p6GzNN7uQY7Lun0pJ - 1);
                dddbmgquo9affxximnmhqzag3.O1xDAlBZZlZdoEf747lCFHld(new TOzjEyj2IN5fWYir(calendarVxUQ9tBhpHJ2AAEDNW8sghc4m));
                break;
            case 1:
                ddDbMgQuo9affXXIMNMhQZaG3 dddbmgquo9affxximnmhqzag32 = (ddDbMgQuo9affXXIMNMhQZaG3) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) dddbmgquo9affxximnmhqzag32.H2VFYNJEVGAX.getLayoutManager();
                View viewDUIkOzkuF3hUt = linearLayoutManager.DUIkOzkuF3hUt(0, linearLayoutManager.TaDO7ogis3aEiWEtq(), false);
                int iY1NaPKTl7R18DOr6e8i5 = viewDUIkOzkuF3hUt == null ? -1 : wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(viewDUIkOzkuF3hUt);
                Calendar calendarVxUQ9tBhpHJ2AAEDNW8sghc4m2 = mkWvedkJ40E0CXleCgI.VxUQ9tBhpHJ2AAEDNW8sghc4m(((com.google.android.material.datepicker.zApUME12W6SOuCVHxVPKvzGb3V) this.ZfQNn8hdWlEQ5cR94249PDsLR).ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr.V57tEvNfxZVVcOCAOih5PKr);
                calendarVxUQ9tBhpHJ2AAEDNW8sghc4m2.add(2, iY1NaPKTl7R18DOr6e8i5 + 1);
                dddbmgquo9affxximnmhqzag32.O1xDAlBZZlZdoEf747lCFHld(new TOzjEyj2IN5fWYir(calendarVxUQ9tBhpHJ2AAEDNW8sghc4m2));
                break;
            default:
                oD78NtkeSuRtaWUfMs1KgLg1WoWNL od78ntkesurtawufms1kglg1wownl = (oD78NtkeSuRtaWUfMs1KgLg1WoWNL) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                Window.Callback callback = od78ntkesurtawufms1kglg1wownl.HzCpKshMOoaw76hFcbOVRYMeRd;
                if (callback != null && od78ntkesurtawufms1kglg1wownl.KUYypEB4eNWOZWVDpH) {
                    callback.onMenuItemSelected(0, (DDMnpisYE4ucYu) this.ZfQNn8hdWlEQ5cR94249PDsLR);
                    break;
                }
                break;
        }
    }

    public UHvbXkh4dyB077F7trAwSu(oD78NtkeSuRtaWUfMs1KgLg1WoWNL od78ntkesurtawufms1kglg1wownl) {
        this.V57tEvNfxZVVcOCAOih5PKr = 2;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = od78ntkesurtawufms1kglg1wownl;
        Context context = od78ntkesurtawufms1kglg1wownl.VxUQ9tBhpHJ2AAEDNW8sghc4m.getContext();
        CharSequence charSequence = od78ntkesurtawufms1kglg1wownl.NSjgqmGjEzuugn2SsG1mZFP;
        DDMnpisYE4ucYu dDMnpisYE4ucYu = new DDMnpisYE4ucYu();
        dDMnpisYE4ucYu.LaeGQIruHQu81hfJldjMOQSVblH3x = 4096;
        dDMnpisYE4ucYu.ZLZeBXTMq0zDztBxtRTuCHrapQ = 4096;
        dDMnpisYE4ucYu.KUYypEB4eNWOZWVDpH = null;
        dDMnpisYE4ucYu.q1wNbhk2O6 = null;
        dDMnpisYE4ucYu.p59rPv72J9 = false;
        dDMnpisYE4ucYu.Ca81ebIan1u = false;
        dDMnpisYE4ucYu.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = 16;
        dDMnpisYE4ucYu.GI83zq0G8e7zkn = context;
        dDMnpisYE4ucYu.VxUQ9tBhpHJ2AAEDNW8sghc4m = charSequence;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = dDMnpisYE4ucYu;
    }
}
