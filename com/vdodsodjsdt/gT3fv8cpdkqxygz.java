package com.vdodsodjsdt;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class gT3fv8cpdkqxygz extends BaseAdapter {
    public final XMlqHp2sNChQxkYAA V57tEvNfxZVVcOCAOih5PKr;
    public final TOzjEyj2IN5fWYir VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public o0x3OWMw3He zzpBGItXfub0yWj;
    public static final int ZfQNn8hdWlEQ5cR94249PDsLR = mkWvedkJ40E0CXleCgI.V57tEvNfxZVVcOCAOih5PKr(null).getMaximum(4);
    public static final int LaeGQIruHQu81hfJldjMOQSVblH3x = (mkWvedkJ40E0CXleCgI.V57tEvNfxZVVcOCAOih5PKr(null).getMaximum(7) + mkWvedkJ40E0CXleCgI.V57tEvNfxZVVcOCAOih5PKr(null).getMaximum(5)) - 1;

    public gT3fv8cpdkqxygz(TOzjEyj2IN5fWYir tOzjEyj2IN5fWYir, XMlqHp2sNChQxkYAA xMlqHp2sNChQxkYAA) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = tOzjEyj2IN5fWYir;
        this.V57tEvNfxZVVcOCAOih5PKr = xMlqHp2sNChQxkYAA;
        throw null;
    }

    public final int V57tEvNfxZVVcOCAOih5PKr() {
        return (VxUQ9tBhpHJ2AAEDNW8sghc4m() + this.VxUQ9tBhpHJ2AAEDNW8sghc4m.ZLZeBXTMq0zDztBxtRTuCHrapQ) - 1;
    }

    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        int firstDayOfWeek = this.V57tEvNfxZVVcOCAOih5PKr.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        TOzjEyj2IN5fWYir tOzjEyj2IN5fWYir = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Calendar calendar = tOzjEyj2IN5fWYir.V57tEvNfxZVVcOCAOih5PKr;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + tOzjEyj2IN5fWYir.zIvmSL0wzmmKGc3X39b2Gw2mUGE : i2;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.VxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            com.vdodsodjsdt.o0x3OWMw3He r1 = r4.zzpBGItXfub0yWj
            if (r1 != 0) goto Lf
            com.vdodsodjsdt.o0x3OWMw3He r1 = new com.vdodsodjsdt.o0x3OWMw3He
            r1.<init>(r0)
            r4.zzpBGItXfub0yWj = r1
        Lf:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L27
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = 2131427493(0x7f0b00a5, float:1.8476604E38)
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r6 = r4.VxUQ9tBhpHJ2AAEDNW8sghc4m()
            int r6 = r5 - r6
            if (r6 < 0) goto L5d
            com.vdodsodjsdt.TOzjEyj2IN5fWYir r7 = r4.VxUQ9tBhpHJ2AAEDNW8sghc4m
            int r2 = r7.ZLZeBXTMq0zDztBxtRTuCHrapQ
            if (r6 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r3 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r3, r6)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L65
        L5d:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L65:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L6c
            goto L6e
        L6c:
            if (r0 != 0) goto L6f
        L6e:
            return r0
        L6f:
            r0.getContext()
            java.util.Calendar r5 = com.vdodsodjsdt.mkWvedkJ40E0CXleCgI.zzpBGItXfub0yWj()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.gT3fv8cpdkqxygz.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: zzpBGItXfub0yWj, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < VxUQ9tBhpHJ2AAEDNW8sghc4m() || i > V57tEvNfxZVVcOCAOih5PKr()) {
            return null;
        }
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = (i - VxUQ9tBhpHJ2AAEDNW8sghc4m()) + 1;
        Calendar calendarVxUQ9tBhpHJ2AAEDNW8sghc4m = mkWvedkJ40E0CXleCgI.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.VxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr);
        calendarVxUQ9tBhpHJ2AAEDNW8sghc4m.set(5, iVxUQ9tBhpHJ2AAEDNW8sghc4m);
        return Long.valueOf(calendarVxUQ9tBhpHJ2AAEDNW8sghc4m.getTimeInMillis());
    }
}
