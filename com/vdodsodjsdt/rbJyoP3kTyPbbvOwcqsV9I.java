package com.vdodsodjsdt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class rbJyoP3kTyPbbvOwcqsV9I extends YrYFQ7bf7bxLdH {
    public final ddDbMgQuo9affXXIMNMhQZaG3 ZfQNn8hdWlEQ5cR94249PDsLR;

    public rbJyoP3kTyPbbvOwcqsV9I(ddDbMgQuo9affXXIMNMhQZaG3 dddbmgquo9affxximnmhqzag3) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = dddbmgquo9affxximnmhqzag3;
    }

    @Override // com.vdodsodjsdt.YrYFQ7bf7bxLdH
    public final void V57tEvNfxZVVcOCAOih5PKr(WFEUpQgjHl wFEUpQgjHl, int i) {
        ddDbMgQuo9affXXIMNMhQZaG3 dddbmgquo9affxximnmhqzag3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = dddbmgquo9affxximnmhqzag3.wdI7vzA3Qmcwd.V57tEvNfxZVVcOCAOih5PKr.LaeGQIruHQu81hfJldjMOQSVblH3x + i;
        TextView textView = ((r3prOkl6iMarOCmDEBj) wFEUpQgjHl).vBGA6pPLqSMuYGvprl270j7;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(mkWvedkJ40E0CXleCgI.zzpBGItXfub0yWj().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        o0x3OWMw3He o0x3owmw3he = dddbmgquo9affxximnmhqzag3.GE1sqSYiEYQO2ew7WEZwTtUeS5;
        if (mkWvedkJ40E0CXleCgI.zzpBGItXfub0yWj().get(1) == i2) {
            Object obj = o0x3owmw3he.V57tEvNfxZVVcOCAOih5PKr;
        } else {
            Object obj2 = o0x3owmw3he.zzpBGItXfub0yWj;
        }
        throw null;
    }

    @Override // com.vdodsodjsdt.YrYFQ7bf7bxLdH
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.wdI7vzA3Qmcwd.NSjgqmGjEzuugn2SsG1mZFP;
    }

    @Override // com.vdodsodjsdt.YrYFQ7bf7bxLdH
    public final WFEUpQgjHl ZfQNn8hdWlEQ5cR94249PDsLR(ViewGroup viewGroup) {
        return new r3prOkl6iMarOCmDEBj((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
