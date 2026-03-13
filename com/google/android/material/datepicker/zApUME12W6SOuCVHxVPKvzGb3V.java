package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.Skgk8FYn8b4TvRiBOsElZw4XkNLhQ;
import com.vdodsodjsdt.TOzjEyj2IN5fWYir;
import com.vdodsodjsdt.WFEUpQgjHl;
import com.vdodsodjsdt.XMlqHp2sNChQxkYAA;
import com.vdodsodjsdt.YoYMmBKQmkacZj7lMi9c;
import com.vdodsodjsdt.YrYFQ7bf7bxLdH;
import com.vdodsodjsdt.gT3fv8cpdkqxygz;
import com.vdodsodjsdt.mkWvedkJ40E0CXleCgI;
import com.vdodsodjsdt.w2TYlQMpBW0H;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class zApUME12W6SOuCVHxVPKvzGb3V extends YrYFQ7bf7bxLdH {
    public final Skgk8FYn8b4TvRiBOsElZw4XkNLhQ LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final XMlqHp2sNChQxkYAA ZfQNn8hdWlEQ5cR94249PDsLR;
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public zApUME12W6SOuCVHxVPKvzGb3V(ContextThemeWrapper contextThemeWrapper, XMlqHp2sNChQxkYAA xMlqHp2sNChQxkYAA, Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ) {
        TOzjEyj2IN5fWYir tOzjEyj2IN5fWYir = xMlqHp2sNChQxkYAA.V57tEvNfxZVVcOCAOih5PKr;
        TOzjEyj2IN5fWYir tOzjEyj2IN5fWYir2 = xMlqHp2sNChQxkYAA.ZfQNn8hdWlEQ5cR94249PDsLR;
        TOzjEyj2IN5fWYir tOzjEyj2IN5fWYir3 = xMlqHp2sNChQxkYAA.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (tOzjEyj2IN5fWYir.V57tEvNfxZVVcOCAOih5PKr.compareTo(tOzjEyj2IN5fWYir3.V57tEvNfxZVVcOCAOih5PKr) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (tOzjEyj2IN5fWYir3.V57tEvNfxZVVcOCAOih5PKr.compareTo(tOzjEyj2IN5fWYir2.V57tEvNfxZVVcOCAOih5PKr) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * gT3fv8cpdkqxygz.ZfQNn8hdWlEQ5cR94249PDsLR) + (w2TYlQMpBW0H.qygqjTppWwx992(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = xMlqHp2sNChQxkYAA;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = skgk8FYn8b4TvRiBOsElZw4XkNLhQ;
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.zzpBGItXfub0yWj = true;
    }

    @Override // com.vdodsodjsdt.YrYFQ7bf7bxLdH
    public final void V57tEvNfxZVVcOCAOih5PKr(WFEUpQgjHl wFEUpQgjHl, int i) {
        coyP1hCgJ7zr56eqQoO7H04E coyp1hcgj7zr56eqqoo7h04e = (coyP1hCgJ7zr56eqQoO7H04E) wFEUpQgjHl;
        XMlqHp2sNChQxkYAA xMlqHp2sNChQxkYAA = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        Calendar calendarVxUQ9tBhpHJ2AAEDNW8sghc4m = mkWvedkJ40E0CXleCgI.VxUQ9tBhpHJ2AAEDNW8sghc4m(xMlqHp2sNChQxkYAA.V57tEvNfxZVVcOCAOih5PKr.V57tEvNfxZVVcOCAOih5PKr);
        calendarVxUQ9tBhpHJ2AAEDNW8sghc4m.add(2, i);
        TOzjEyj2IN5fWYir tOzjEyj2IN5fWYir = new TOzjEyj2IN5fWYir(calendarVxUQ9tBhpHJ2AAEDNW8sghc4m);
        coyp1hcgj7zr56eqqoo7h04e.vBGA6pPLqSMuYGvprl270j7.setText(tOzjEyj2IN5fWYir.V57tEvNfxZVVcOCAOih5PKr());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) coyp1hcgj7zr56eqqoo7h04e.TaDO7ogis3aEiWEtq.findViewById(R.id.month_grid);
        if (materialCalendarGridView.VxUQ9tBhpHJ2AAEDNW8sghc4m() == null || !tOzjEyj2IN5fWYir.equals(materialCalendarGridView.VxUQ9tBhpHJ2AAEDNW8sghc4m().VxUQ9tBhpHJ2AAEDNW8sghc4m)) {
            new gT3fv8cpdkqxygz(tOzjEyj2IN5fWYir, xMlqHp2sNChQxkYAA);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.VxUQ9tBhpHJ2AAEDNW8sghc4m().getClass();
        throw null;
    }

    @Override // com.vdodsodjsdt.YrYFQ7bf7bxLdH
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.GI83zq0G8e7zkn;
    }

    @Override // com.vdodsodjsdt.YrYFQ7bf7bxLdH
    public final WFEUpQgjHl ZfQNn8hdWlEQ5cR94249PDsLR(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!w2TYlQMpBW0H.qygqjTppWwx992(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new coyP1hCgJ7zr56eqQoO7H04E(linearLayout, false);
        }
        linearLayout.setLayoutParams(new YoYMmBKQmkacZj7lMi9c(-1, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE));
        return new coyP1hCgJ7zr56eqQoO7H04E(linearLayout, true);
    }

    @Override // com.vdodsodjsdt.YrYFQ7bf7bxLdH
    public final long zzpBGItXfub0yWj(int i) {
        Calendar calendarVxUQ9tBhpHJ2AAEDNW8sghc4m = mkWvedkJ40E0CXleCgI.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr.V57tEvNfxZVVcOCAOih5PKr);
        calendarVxUQ9tBhpHJ2AAEDNW8sghc4m.add(2, i);
        calendarVxUQ9tBhpHJ2AAEDNW8sghc4m.set(5, 1);
        Calendar calendarVxUQ9tBhpHJ2AAEDNW8sghc4m2 = mkWvedkJ40E0CXleCgI.VxUQ9tBhpHJ2AAEDNW8sghc4m(calendarVxUQ9tBhpHJ2AAEDNW8sghc4m);
        calendarVxUQ9tBhpHJ2AAEDNW8sghc4m2.get(2);
        calendarVxUQ9tBhpHJ2AAEDNW8sghc4m2.get(1);
        calendarVxUQ9tBhpHJ2AAEDNW8sghc4m2.getMaximum(7);
        calendarVxUQ9tBhpHJ2AAEDNW8sghc4m2.getActualMaximum(5);
        calendarVxUQ9tBhpHJ2AAEDNW8sghc4m2.getTimeInMillis();
        return calendarVxUQ9tBhpHJ2AAEDNW8sghc4m2.getTimeInMillis();
    }
}
