package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class R6BDn45IG0t extends ArrayAdapter {
    public final /* synthetic */ hEYFkY0Pa5rIEBwb4kWhO0E74Dn V57tEvNfxZVVcOCAOih5PKr;
    public ColorStateList VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public ColorStateList zzpBGItXfub0yWj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R6BDn45IG0t(hEYFkY0Pa5rIEBwb4kWhO0E74Dn heyfky0pa5riebwb4kwho0e74dn, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.V57tEvNfxZVVcOCAOih5PKr = heyfky0pa5riebwb4kwho0e74dn;
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        ColorStateList colorStateList;
        hEYFkY0Pa5rIEBwb4kWhO0E74Dn heyfky0pa5riebwb4kwho0e74dn = this.V57tEvNfxZVVcOCAOih5PKr;
        ColorStateList colorStateList2 = heyfky0pa5riebwb4kwho0e74dn.p59rPv72J9;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {android.R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.zzpBGItXfub0yWj = colorStateList;
        if (heyfky0pa5riebwb4kwho0e74dn.q1wNbhk2O6 != 0 && heyfky0pa5riebwb4kwho0e74dn.p59rPv72J9 != null) {
            int[] iArr2 = {android.R.attr.state_hovered, -16842919};
            int[] iArr3 = {android.R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{PyYsF2FE67iANgZ0fDkVtNG5uhA.zzpBGItXfub0yWj(heyfky0pa5riebwb4kwho0e74dn.p59rPv72J9.getColorForState(iArr3, 0), heyfky0pa5riebwb4kwho0e74dn.q1wNbhk2O6), PyYsF2FE67iANgZ0fDkVtNG5uhA.zzpBGItXfub0yWj(heyfky0pa5riebwb4kwho0e74dn.p59rPv72J9.getColorForState(iArr2, 0), heyfky0pa5riebwb4kwho0e74dn.q1wNbhk2O6), heyfky0pa5riebwb4kwho0e74dn.q1wNbhk2O6});
        }
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            hEYFkY0Pa5rIEBwb4kWhO0E74Dn heyfky0pa5riebwb4kwho0e74dn = this.V57tEvNfxZVVcOCAOih5PKr;
            Drawable rippleDrawable = null;
            if (heyfky0pa5riebwb4kwho0e74dn.getText().toString().contentEquals(textView.getText()) && heyfky0pa5riebwb4kwho0e74dn.q1wNbhk2O6 != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(heyfky0pa5riebwb4kwho0e74dn.q1wNbhk2O6);
                if (this.zzpBGItXfub0yWj != null) {
                    colorDrawable.setTintList(this.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                    rippleDrawable = new RippleDrawable(this.zzpBGItXfub0yWj, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
