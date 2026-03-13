package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.vdodsodjsdt.Dmzo35pQOGmZtDTYIDW;
import com.vdodsodjsdt.F44whnLsbQ;
import com.vdodsodjsdt.LofngUTEmVOfi2SbomD3ONlMmDH;
import com.vdodsodjsdt.PGobtLpyfPC4TCnlq740;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.n5xs98JjLwCWfr8;
import com.vdodsodjsdt.nUshirpmbH6saVf9I;
import com.vdodsodjsdt.siyClBnOpLkmTPckcsOgX;
import com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8;
import com.vdodsodjsdt.zonOxHotd3BwAPJcwqr6I6uQNngg4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends n5xs98JjLwCWfr8 implements Dmzo35pQOGmZtDTYIDW {
    public final int HVEwbdULInpTNa0IG;
    public final Rect Irh5auREsoeV1C1RaBamlmy;
    public final int O1xDAlBZZlZdoEf747lCFHld;
    public final SparseArray RhfGHxtXxy0M0grmp2jkRjQg;
    public final int[] SuB3hEmTmbbRGAhtvOOmfKEon;
    public final ClockHandView TaDO7ogis3aEiWEtq;
    public final int aXO0LSrt8bKV;
    public final ColorStateList iKANjmyTSxO6v6UuLPdu7DxOjlS;
    public final float[] pzqP2AqKW6J5PO8zCKnW;
    public final RectF q11o1hieEkZDhF1MGOZI26oZiDT;
    public final zApUME12W6SOuCVHxVPKvzGb3V qNPQb1obP7;
    public float qygqjTppWwx992;
    public final int vE4yDIjexsP2lGjLaTcB;
    public final Rect w0Wu95l8dVNw5rZMRu;
    public final String[] y1NaPKTl7R18DOr6e8i5;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Irh5auREsoeV1C1RaBamlmy = new Rect();
        this.q11o1hieEkZDhF1MGOZI26oZiDT = new RectF();
        this.w0Wu95l8dVNw5rZMRu = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.RhfGHxtXxy0M0grmp2jkRjQg = sparseArray;
        this.pzqP2AqKW6J5PO8zCKnW = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, PGobtLpyfPC4TCnlq740.ZfQNn8hdWlEQ5cR94249PDsLR, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListVBGA6pPLqSMuYGvprl270j7 = F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context, typedArrayObtainStyledAttributes, 1);
        this.iKANjmyTSxO6v6UuLPdu7DxOjlS = colorStateListVBGA6pPLqSMuYGvprl270j7;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.TaDO7ogis3aEiWEtq = clockHandView;
        this.aXO0LSrt8bKV = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListVBGA6pPLqSMuYGvprl270j7.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListVBGA6pPLqSMuYGvprl270j7.getDefaultColor());
        this.SuB3hEmTmbbRGAhtvOOmfKEon = new int[]{colorForState, colorForState, colorStateListVBGA6pPLqSMuYGvprl270j7.getDefaultColor()};
        clockHandView.LaeGQIruHQu81hfJldjMOQSVblH3x.add(this);
        int defaultColor = zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListVBGA6pPLqSMuYGvprl270j72 = F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListVBGA6pPLqSMuYGvprl270j72 != null ? colorStateListVBGA6pPLqSMuYGvprl270j72.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new coyP1hCgJ7zr56eqQoO7H04E(this));
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.qNPQb1obP7 = new zApUME12W6SOuCVHxVPKvzGb3V(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.y1NaPKTl7R18DOr6e8i5 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.y1NaPKTl7R18DOr6e8i5.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.y1NaPKTl7R18DOr6e8i5.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.y1NaPKTl7R18DOr6e8i5[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z = i2 > 1 ? true : z;
                xb0r6yEzq0tw9m7nTWG5BFR8.q1wNbhk2O6(textView, this.qNPQb1obP7);
                textView.setTextColor(this.iKANjmyTSxO6v6UuLPdu7DxOjlS);
            }
        }
        ClockHandView clockHandView2 = this.TaDO7ogis3aEiWEtq;
        if (clockHandView2.ZfQNn8hdWlEQ5cR94249PDsLR && !z) {
            clockHandView2.Ca81ebIan1u = 1;
        }
        clockHandView2.ZfQNn8hdWlEQ5cR94249PDsLR = z;
        clockHandView2.invalidate();
        this.vE4yDIjexsP2lGjLaTcB = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.O1xDAlBZZlZdoEf747lCFHld = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.HVEwbdULInpTNa0IG = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.y1NaPKTl7R18DOr6e8i5.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        p59rPv72J9();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.HVEwbdULInpTNa0IG / Math.max(Math.max(this.vE4yDIjexsP2lGjLaTcB / displayMetrics.heightPixels, this.O1xDAlBZZlZdoEf747lCFHld / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public final void p59rPv72J9() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.TaDO7ogis3aEiWEtq.GI83zq0G8e7zkn;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.RhfGHxtXxy0M0grmp2jkRjQg;
            int size = sparseArray.size();
            rect = this.Irh5auREsoeV1C1RaBamlmy;
            rectF = this.q11o1hieEkZDhF1MGOZI26oZiDT;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.w0Wu95l8dVNw5rZMRu);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.SuB3hEmTmbbRGAhtvOOmfKEon, this.pzqP2AqKW6J5PO8zCKnW, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // com.vdodsodjsdt.n5xs98JjLwCWfr8
    public final void q1wNbhk2O6() {
        nUshirpmbH6saVf9I nushirpmbh6savf9i = new nUshirpmbH6saVf9I();
        nushirpmbh6savf9i.zzpBGItXfub0yWj(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f6ZQsR6bPLvvCDNXOUc * 0.66f) : this.f6ZQsR6bPLvvCDNXOUc;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer numValueOf = Integer.valueOf(id);
                HashMap map2 = nushirpmbh6savf9i.V57tEvNfxZVVcOCAOih5PKr;
                if (!map2.containsKey(numValueOf)) {
                    map2.put(Integer.valueOf(id), new LofngUTEmVOfi2SbomD3ONlMmDH());
                }
                siyClBnOpLkmTPckcsOgX siyclbnoplkmtpckcsogx = ((LofngUTEmVOfi2SbomD3ONlMmDH) map2.get(Integer.valueOf(id))).ZfQNn8hdWlEQ5cR94249PDsLR;
                siyclbnoplkmtpckcsogx.RhfGHxtXxy0M0grmp2jkRjQg = R.id.circle_center;
                siyclbnoplkmtpckcsogx.qNPQb1obP7 = iRound;
                siyclbnoplkmtpckcsogx.SuB3hEmTmbbRGAhtvOOmfKEon = size;
                size += 360.0f / list.size();
            }
        }
        nushirpmbh6savf9i.VxUQ9tBhpHJ2AAEDNW8sghc4m(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.RhfGHxtXxy0M0grmp2jkRjQg;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }
}
