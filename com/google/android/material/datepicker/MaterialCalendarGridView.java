package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.vdodsodjsdt.H1cfFcamW7T7;
import com.vdodsodjsdt.gT3fv8cpdkqxygz;
import com.vdodsodjsdt.mkWvedkJ40E0CXleCgI;
import com.vdodsodjsdt.w2TYlQMpBW0H;
import com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    public final boolean V57tEvNfxZVVcOCAOih5PKr;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        mkWvedkJ40E0CXleCgI.V57tEvNfxZVVcOCAOih5PKr(null);
        if (w2TYlQMpBW0H.qygqjTppWwx992(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.vdodsodjsdt.R.id.cancel_button);
            setNextFocusRightId(com.vdodsodjsdt.R.id.confirm_button);
        }
        this.V57tEvNfxZVVcOCAOih5PKr = w2TYlQMpBW0H.qygqjTppWwx992(getContext(), com.vdodsodjsdt.R.attr.nestedScrollable);
        xb0r6yEzq0tw9m7nTWG5BFR8.q1wNbhk2O6(this, new H1cfFcamW7T7(2));
    }

    public final gT3fv8cpdkqxygz VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return (gT3fv8cpdkqxygz) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (gT3fv8cpdkqxygz) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((gT3fv8cpdkqxygz) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        gT3fv8cpdkqxygz gt3fv8cpdkqxygz = (gT3fv8cpdkqxygz) super.getAdapter();
        gt3fv8cpdkqxygz.getClass();
        int iMax = Math.max(gt3fv8cpdkqxygz.VxUQ9tBhpHJ2AAEDNW8sghc4m(), getFirstVisiblePosition());
        int iMin = Math.min(gt3fv8cpdkqxygz.V57tEvNfxZVVcOCAOih5PKr(), getLastVisiblePosition());
        gt3fv8cpdkqxygz.getItem(iMax);
        gt3fv8cpdkqxygz.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((gT3fv8cpdkqxygz) super.getAdapter()).V57tEvNfxZVVcOCAOih5PKr());
        } else if (i == 130) {
            setSelection(((gT3fv8cpdkqxygz) super.getAdapter()).VxUQ9tBhpHJ2AAEDNW8sghc4m());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= ((gT3fv8cpdkqxygz) super.getAdapter()).VxUQ9tBhpHJ2AAEDNW8sghc4m() && selectedItemPosition <= ((gT3fv8cpdkqxygz) super.getAdapter()).V57tEvNfxZVVcOCAOih5PKr())) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((gT3fv8cpdkqxygz) super.getAdapter()).VxUQ9tBhpHJ2AAEDNW8sghc4m());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.V57tEvNfxZVVcOCAOih5PKr) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((gT3fv8cpdkqxygz) super.getAdapter()).VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
            super.setSelection(((gT3fv8cpdkqxygz) super.getAdapter()).VxUQ9tBhpHJ2AAEDNW8sghc4m());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (gT3fv8cpdkqxygz) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof gT3fv8cpdkqxygz)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), gT3fv8cpdkqxygz.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
