package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.RzPJ8ECazBwP4lkyzH4NnWLfDRtzV;
import com.vdodsodjsdt.FLWIoSaHb1q8TqFvEBgPyRGrzvi6;
import com.vdodsodjsdt.J3HRkfL9jUEUuIxNO2AzRqM7;
import com.vdodsodjsdt.PGobtLpyfPC4TCnlq740;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.ZOzTbMJxsw;
import com.vdodsodjsdt.p4ej2wQUoGVPNvYl4WCI1bg3E;
import com.vdodsodjsdt.powVRICeb3L1;
import com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao;
import com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends J3HRkfL9jUEUuIxNO2AzRqM7 {
    public static final /* synthetic */ int jW7EiD0YL6xkbB158jMUzhWNWb1y = 0;
    public boolean Ca81ebIan1u;
    public boolean h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public HashSet ko09zE6UAgwkV;
    public boolean p59rPv72J9;
    public final int pYmKDYlAmhudp;
    public final LinkedHashSet q1wNbhk2O6;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(sGipz63rTUmSj3uFDvOtzihao.bjhcQ0u7VT2OYYrwk96HrWoN(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet);
        this.q1wNbhk2O6 = new LinkedHashSet();
        this.p59rPv72J9 = false;
        this.ko09zE6UAgwkV = new HashSet();
        TypedArray typedArrayVE4yDIjexsP2lGjLaTcB = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.vE4yDIjexsP2lGjLaTcB(getContext(), attributeSet, PGobtLpyfPC4TCnlq740.KUYypEB4eNWOZWVDpH, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayVE4yDIjexsP2lGjLaTcB.getBoolean(7, false));
        this.pYmKDYlAmhudp = typedArrayVE4yDIjexsP2lGjLaTcB.getResourceId(2, -1);
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = typedArrayVE4yDIjexsP2lGjLaTcB.getBoolean(4, false);
        if (this.NSjgqmGjEzuugn2SsG1mZFP == null) {
            this.NSjgqmGjEzuugn2SsG1mZFP = p4ej2wQUoGVPNvYl4WCI1bg3E.zzpBGItXfub0yWj(new ZOzTbMJxsw(0.0f));
        }
        setEnabled(typedArrayVE4yDIjexsP2lGjLaTcB.getBoolean(0, true));
        typedArrayVE4yDIjexsP2lGjLaTcB.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.Ca81ebIan1u ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && getChildAt(i2).getVisibility() != 8) {
                i++;
            }
        }
        return i;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(Set set) {
        HashSet hashSet = this.ko09zE6UAgwkV;
        this.ko09zE6UAgwkV = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.p59rPv72J9 = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.p59rPv72J9 = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.q1wNbhk2O6.iterator();
                while (it.hasNext()) {
                    ((RzPJ8ECazBwP4lkyzH4NnWLfDRtzV) it.next()).VxUQ9tBhpHJ2AAEDNW8sghc4m();
                }
            }
        }
        invalidate();
    }

    @Override // com.vdodsodjsdt.J3HRkfL9jUEUuIxNO2AzRqM7, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        zIvmSL0wzmmKGc3X39b2Gw2mUGE(materialButton.getId(), materialButton.pYmKDYlAmhudp);
        xb0r6yEzq0tw9m7nTWG5BFR8.q1wNbhk2O6(materialButton, new powVRICeb3L1(1, this));
    }

    public int getCheckedButtonId() {
        if (!this.Ca81ebIan1u || this.ko09zE6UAgwkV.isEmpty()) {
            return -1;
        }
        return ((Integer) this.ko09zE6UAgwkV.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.ko09zE6UAgwkV.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.pYmKDYlAmhudp;
        if (i != -1) {
            ZLZeBXTMq0zDztBxtRTuCHrapQ(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.Ca81ebIan1u ? 1 : 2));
    }

    public void setSelectionRequired(boolean z) {
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.Ca81ebIan1u != z) {
            this.Ca81ebIan1u = z;
            ZLZeBXTMq0zDztBxtRTuCHrapQ(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName(childrenA11yClassName);
        }
    }

    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.ko09zE6UAgwkV);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.Ca81ebIan1u && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        ZLZeBXTMq0zDztBxtRTuCHrapQ(hashSet);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
