package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.yV4xSSte4LNL7uLy9zrc8x;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int f6ZQsR6bPLvvCDNXOUc = 0;
    public final Chip jW7EiD0YL6xkbB158jMUzhWNWb1y;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Y8pBwvBl1WknhcIrzNgOk1StjrB9n y8pBwvBl1WknhcIrzNgOk1StjrB9n = new Y8pBwvBl1WknhcIrzNgOk1StjrB9n(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        materialButtonToggleGroup.q1wNbhk2O6.add(new RzPJ8ECazBwP4lkyzH4NnWLfDRtzV());
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = chip2;
        yV4xSSte4LNL7uLy9zrc8x yv4xsste4lnl7uly9zrc8x = new yV4xSSte4LNL7uLy9zrc8x(1, new GestureDetector(getContext(), new IkV4ezGzeNOYtcxZs6Kvx9TB3Wzl8(this)));
        chip.setOnTouchListener(yv4xsste4lnl7uly9zrc8x);
        chip2.setOnTouchListener(yv4xsste4lnl7uly9zrc8x);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(y8pBwvBl1WknhcIrzNgOk1StjrB9n);
        chip2.setOnClickListener(y8pBwvBl1WknhcIrzNgOk1StjrB9n);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.jW7EiD0YL6xkbB158jMUzhWNWb1y.sendAccessibilityEvent(8);
        }
    }
}
