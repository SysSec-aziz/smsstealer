package com.vdodsodjsdt;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class dxywz4LlA5tIpL6szWECx7Qp0 extends BaseAdapter {
    public static final int ZfQNn8hdWlEQ5cR94249PDsLR;
    public final int V57tEvNfxZVVcOCAOih5PKr;
    public final Calendar VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final int zzpBGItXfub0yWj;

    static {
        ZfQNn8hdWlEQ5cR94249PDsLR = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public dxywz4LlA5tIpL6szWECx7Qp0() {
        Calendar calendarV57tEvNfxZVVcOCAOih5PKr = mkWvedkJ40E0CXleCgI.V57tEvNfxZVVcOCAOih5PKr(null);
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = calendarV57tEvNfxZVVcOCAOih5PKr;
        this.zzpBGItXfub0yWj = calendarV57tEvNfxZVVcOCAOih5PKr.getMaximum(7);
        this.V57tEvNfxZVVcOCAOih5PKr = calendarV57tEvNfxZVVcOCAOih5PKr.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.zzpBGItXfub0yWj;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.zzpBGItXfub0yWj;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.V57tEvNfxZVVcOCAOih5PKr;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.V57tEvNfxZVVcOCAOih5PKr;
        int i3 = this.zzpBGItXfub0yWj;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, ZfQNn8hdWlEQ5cR94249PDsLR, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public dxywz4LlA5tIpL6szWECx7Qp0(int i) {
        Calendar calendarV57tEvNfxZVVcOCAOih5PKr = mkWvedkJ40E0CXleCgI.V57tEvNfxZVVcOCAOih5PKr(null);
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = calendarV57tEvNfxZVVcOCAOih5PKr;
        this.zzpBGItXfub0yWj = calendarV57tEvNfxZVVcOCAOih5PKr.getMaximum(7);
        this.V57tEvNfxZVVcOCAOih5PKr = i;
    }
}
