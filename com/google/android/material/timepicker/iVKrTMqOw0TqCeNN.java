package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import com.vdodsodjsdt.nmrvjd1tZpYZBkhEzGo;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class iVKrTMqOw0TqCeNN extends nmrvjd1tZpYZBkhEzGo {
    public final /* synthetic */ ChipTextInputComboView V57tEvNfxZVVcOCAOih5PKr;

    public iVKrTMqOw0TqCeNN(ChipTextInputComboView chipTextInputComboView) {
        this.V57tEvNfxZVVcOCAOih5PKr = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.V57tEvNfxZVVcOCAOih5PKr;
        if (zIsEmpty) {
            chipTextInputComboView.V57tEvNfxZVVcOCAOih5PKr.setText(ChipTextInputComboView.VxUQ9tBhpHJ2AAEDNW8sghc4m(chipTextInputComboView, "00"));
            return;
        }
        String strVxUQ9tBhpHJ2AAEDNW8sghc4m = ChipTextInputComboView.VxUQ9tBhpHJ2AAEDNW8sghc4m(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.V57tEvNfxZVVcOCAOih5PKr;
        if (TextUtils.isEmpty(strVxUQ9tBhpHJ2AAEDNW8sghc4m)) {
            strVxUQ9tBhpHJ2AAEDNW8sghc4m = ChipTextInputComboView.VxUQ9tBhpHJ2AAEDNW8sghc4m(chipTextInputComboView, "00");
        }
        chip.setText(strVxUQ9tBhpHJ2AAEDNW8sghc4m);
    }
}
