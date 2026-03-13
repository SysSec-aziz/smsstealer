package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.vdodsodjsdt.Ascu2Zs7kzyKFeFdmA;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.WFEUpQgjHl;
import com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class coyP1hCgJ7zr56eqQoO7H04E extends WFEUpQgjHl {
    public final MaterialCalendarGridView TaDO7ogis3aEiWEtq;
    public final TextView vBGA6pPLqSMuYGvprl270j7;

    public coyP1hCgJ7zr56eqQoO7H04E(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.vBGA6pPLqSMuYGvprl270j7 = textView;
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        new Ascu2Zs7kzyKFeFdmA(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).zIvmSL0wzmmKGc3X39b2Gw2mUGE(textView, Boolean.TRUE);
        this.TaDO7ogis3aEiWEtq = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
