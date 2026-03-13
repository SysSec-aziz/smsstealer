package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.mlFPz0SY9o7oN;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public TextView V57tEvNfxZVVcOCAOih5PKr;
    public Button ZfQNn8hdWlEQ5cR94249PDsLR;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ej6unYlOWMDF.vXWl0o6I4U59CgHs9(context, R.attr.motionEasingEmphasizedInterpolator, mlFPz0SY9o7oN.zzpBGItXfub0yWj);
    }

    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.V57tEvNfxZVVcOCAOih5PKr.getPaddingTop() == i2 && this.V57tEvNfxZVVcOCAOih5PKr.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.V57tEvNfxZVVcOCAOih5PKr;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public TextView getMessageView() {
        return this.V57tEvNfxZVVcOCAOih5PKr;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.V57tEvNfxZVVcOCAOih5PKr = (TextView) findViewById(R.id.snackbar_text);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.V57tEvNfxZVVcOCAOih5PKr.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.LaeGQIruHQu81hfJldjMOQSVblH3x <= 0 || this.ZfQNn8hdWlEQ5cR94249PDsLR.getMeasuredWidth() <= this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!VxUQ9tBhpHJ2AAEDNW8sghc4m(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!VxUQ9tBhpHJ2AAEDNW8sghc4m(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i;
    }
}
