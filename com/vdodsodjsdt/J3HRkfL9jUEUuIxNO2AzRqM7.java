package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class J3HRkfL9jUEUuIxNO2AzRqM7 extends LinearLayout {
    public wL6lQKsoxy GI83zq0G8e7zkn;
    public XzG3TQCrw9CYO6IfOT7jYKxnGPWU HzCpKshMOoaw76hFcbOVRYMeRd;
    public boolean KUYypEB4eNWOZWVDpH;
    public final Skgk8FYn8b4TvRiBOsElZw4XkNLhQ LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int M9e7PWhFYLD2lOGMker;
    public p4ej2wQUoGVPNvYl4WCI1bg3E NSjgqmGjEzuugn2SsG1mZFP;
    public final ArrayList V57tEvNfxZVVcOCAOih5PKr;
    public Integer[] ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final ArrayList ZfQNn8hdWlEQ5cR94249PDsLR;
    public final bMAlpZGjk9r zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    /* JADX WARN: Type inference failed for: r13v5, types: [com.vdodsodjsdt.bMAlpZGjk9r] */
    public J3HRkfL9jUEUuIxNO2AzRqM7(Context context, AttributeSet attributeSet) {
        p4ej2wQUoGVPNvYl4WCI1bg3E p4ej2wquogvpnvyl4wci1bg3eZzpBGItXfub0yWj;
        XmlResourceParser xml;
        int next;
        XzG3TQCrw9CYO6IfOT7jYKxnGPWU xzG3TQCrw9CYO6IfOT7jYKxnGPWU;
        AttributeSet attributeSetAsAttributeSet;
        int next2;
        super(sGipz63rTUmSj3uFDvOtzihao.bjhcQ0u7VT2OYYrwk96HrWoN(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.V57tEvNfxZVVcOCAOih5PKr = new ArrayList();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new ArrayList();
        final MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(25, materialButtonToggleGroup);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new Comparator() { // from class: com.vdodsodjsdt.bMAlpZGjk9r
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.pYmKDYlAmhudp).compareTo(Boolean.valueOf(materialButton2.pYmKDYlAmhudp));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup2 = materialButtonToggleGroup;
                return Integer.compare(materialButtonToggleGroup2.indexOfChild(materialButton), materialButtonToggleGroup2.indexOfChild(materialButton2));
            }
        };
        this.KUYypEB4eNWOZWVDpH = true;
        Context context2 = getContext();
        TypedArray typedArrayVE4yDIjexsP2lGjLaTcB = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.vE4yDIjexsP2lGjLaTcB(context2, attributeSet, PGobtLpyfPC4TCnlq740.HzCpKshMOoaw76hFcbOVRYMeRd, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayVE4yDIjexsP2lGjLaTcB.hasValue(2)) {
            int resourceId = typedArrayVE4yDIjexsP2lGjLaTcB.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        xzG3TQCrw9CYO6IfOT7jYKxnGPWU = new XzG3TQCrw9CYO6IfOT7jYKxnGPWU();
                        xzG3TQCrw9CYO6IfOT7jYKxnGPWU.V57tEvNfxZVVcOCAOih5PKr = new int[10][];
                        xzG3TQCrw9CYO6IfOT7jYKxnGPWU.ZfQNn8hdWlEQ5cR94249PDsLR = new qF22Y620JkFyombtDYw0h0h8Rxpja[10];
                        attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                    xzG3TQCrw9CYO6IfOT7jYKxnGPWU = null;
                }
                if (next2 != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    xzG3TQCrw9CYO6IfOT7jYKxnGPWU.VxUQ9tBhpHJ2AAEDNW8sghc4m(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                }
                xml.close();
                this.HzCpKshMOoaw76hFcbOVRYMeRd = xzG3TQCrw9CYO6IfOT7jYKxnGPWU;
            } else {
                xzG3TQCrw9CYO6IfOT7jYKxnGPWU = null;
                this.HzCpKshMOoaw76hFcbOVRYMeRd = xzG3TQCrw9CYO6IfOT7jYKxnGPWU;
            }
        }
        if (typedArrayVE4yDIjexsP2lGjLaTcB.hasValue(4)) {
            wL6lQKsoxy wl6lqksoxyZzpBGItXfub0yWj = wL6lQKsoxy.zzpBGItXfub0yWj(context2, typedArrayVE4yDIjexsP2lGjLaTcB, 4);
            this.GI83zq0G8e7zkn = wl6lqksoxyZzpBGItXfub0yWj;
            if (wl6lqksoxyZzpBGItXfub0yWj == null) {
                oLPwQu4XgJ olpwqu4xgj = new oLPwQu4XgJ(XdVIZOnOVHGi6uYUaae4zAI94b.VxUQ9tBhpHJ2AAEDNW8sghc4m(context2, typedArrayVE4yDIjexsP2lGjLaTcB.getResourceId(4, 0), typedArrayVE4yDIjexsP2lGjLaTcB.getResourceId(5, 0), new ZOzTbMJxsw(0)).VxUQ9tBhpHJ2AAEDNW8sghc4m());
                this.GI83zq0G8e7zkn = olpwqu4xgj.zzpBGItXfub0yWj != 0 ? new wL6lQKsoxy(olpwqu4xgj) : null;
            }
        }
        if (typedArrayVE4yDIjexsP2lGjLaTcB.hasValue(3)) {
            ZOzTbMJxsw zOzTbMJxsw = new ZOzTbMJxsw(0.0f);
            int resourceId2 = typedArrayVE4yDIjexsP2lGjLaTcB.getResourceId(3, 0);
            if (resourceId2 != 0 && context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId2);
                    try {
                        p4ej2wquogvpnvyl4wci1bg3eZzpBGItXfub0yWj = new p4ej2wQUoGVPNvYl4WCI1bg3E();
                        AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml);
                        do {
                            next = xml.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            p4ej2wquogvpnvyl4wci1bg3eZzpBGItXfub0yWj.ZfQNn8hdWlEQ5cR94249PDsLR(context2, xml, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    p4ej2wquogvpnvyl4wci1bg3eZzpBGItXfub0yWj = p4ej2wQUoGVPNvYl4WCI1bg3E.zzpBGItXfub0yWj(zOzTbMJxsw);
                }
            } else {
                p4ej2wquogvpnvyl4wci1bg3eZzpBGItXfub0yWj = p4ej2wQUoGVPNvYl4WCI1bg3E.zzpBGItXfub0yWj(XdVIZOnOVHGi6uYUaae4zAI94b.V57tEvNfxZVVcOCAOih5PKr(typedArrayVE4yDIjexsP2lGjLaTcB, 3, zOzTbMJxsw));
            }
            this.NSjgqmGjEzuugn2SsG1mZFP = p4ej2wquogvpnvyl4wci1bg3eZzpBGItXfub0yWj;
        }
        this.M9e7PWhFYLD2lOGMker = typedArrayVE4yDIjexsP2lGjLaTcB.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayVE4yDIjexsP2lGjLaTcB.getBoolean(0, true));
        typedArrayVE4yDIjexsP2lGjLaTcB.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (V57tEvNfxZVVcOCAOih5PKr(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (V57tEvNfxZVVcOCAOih5PKr(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.vdodsodjsdt.XdVIZOnOVHGi6uYUaae4zAI94b[], java.io.Serializable] */
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        oLPwQu4XgJ olpwqu4xgj;
        int i;
        if (!(this.NSjgqmGjEzuugn2SsG1mZFP == null && this.GI83zq0G8e7zkn == null) && this.KUYypEB4eNWOZWVDpH) {
            this.KUYypEB4eNWOZWVDpH = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    wL6lQKsoxy wl6lqksoxy = this.GI83zq0G8e7zkn;
                    if (wl6lqksoxy == null || (!z && !z2)) {
                        wl6lqksoxy = (wL6lQKsoxy) this.ZfQNn8hdWlEQ5cR94249PDsLR.get(i2);
                    }
                    if (wl6lqksoxy == null) {
                        olpwqu4xgj = new oLPwQu4XgJ((XdVIZOnOVHGi6uYUaae4zAI94b) this.V57tEvNfxZVVcOCAOih5PKr.get(i2));
                    } else {
                        oLPwQu4XgJ olpwqu4xgj2 = new oLPwQu4XgJ(1);
                        int i3 = wl6lqksoxy.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        olpwqu4xgj2.zzpBGItXfub0yWj = i3;
                        olpwqu4xgj2.V57tEvNfxZVVcOCAOih5PKr = wl6lqksoxy.zzpBGItXfub0yWj;
                        int[][] iArr = wl6lqksoxy.V57tEvNfxZVVcOCAOih5PKr;
                        ?? r14 = new int[iArr.length][];
                        olpwqu4xgj2.ZfQNn8hdWlEQ5cR94249PDsLR = r14;
                        XdVIZOnOVHGi6uYUaae4zAI94b[] xdVIZOnOVHGi6uYUaae4zAI94bArr = wl6lqksoxy.ZfQNn8hdWlEQ5cR94249PDsLR;
                        olpwqu4xgj2.LaeGQIruHQu81hfJldjMOQSVblH3x = new XdVIZOnOVHGi6uYUaae4zAI94b[xdVIZOnOVHGi6uYUaae4zAI94bArr.length];
                        System.arraycopy(iArr, 0, r14, 0, i3);
                        System.arraycopy(xdVIZOnOVHGi6uYUaae4zAI94bArr, 0, (XdVIZOnOVHGi6uYUaae4zAI94b[]) olpwqu4xgj2.LaeGQIruHQu81hfJldjMOQSVblH3x, 0, olpwqu4xgj2.zzpBGItXfub0yWj);
                        olpwqu4xgj2.zIvmSL0wzmmKGc3X39b2Gw2mUGE = wl6lqksoxy.LaeGQIruHQu81hfJldjMOQSVblH3x;
                        olpwqu4xgj2.ZLZeBXTMq0zDztBxtRTuCHrapQ = wl6lqksoxy.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                        olpwqu4xgj2.NSjgqmGjEzuugn2SsG1mZFP = wl6lqksoxy.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                        olpwqu4xgj2.GI83zq0G8e7zkn = wl6lqksoxy.NSjgqmGjEzuugn2SsG1mZFP;
                        olpwqu4xgj = olpwqu4xgj2;
                    }
                    boolean z3 = getOrientation() == 0;
                    boolean z4 = getLayoutDirection() == 1;
                    if (z3) {
                        i = z ? 5 : 0;
                        if (z2) {
                            i |= 10;
                        }
                        if (z4) {
                            i = ((i & 10) >> 1) | ((i & 5) << 1);
                        }
                    } else {
                        i = z ? 3 : 0;
                        if (z2) {
                            i |= 12;
                        }
                    }
                    int i4 = ~i;
                    p4ej2wQUoGVPNvYl4WCI1bg3E p4ej2wquogvpnvyl4wci1bg3e = this.NSjgqmGjEzuugn2SsG1mZFP;
                    if ((i4 | 1) == i4) {
                        olpwqu4xgj.zIvmSL0wzmmKGc3X39b2Gw2mUGE = p4ej2wquogvpnvyl4wci1bg3e;
                    }
                    if ((i4 | 2) == i4) {
                        olpwqu4xgj.ZLZeBXTMq0zDztBxtRTuCHrapQ = p4ej2wquogvpnvyl4wci1bg3e;
                    }
                    if ((i4 | 4) == i4) {
                        olpwqu4xgj.NSjgqmGjEzuugn2SsG1mZFP = p4ej2wquogvpnvyl4wci1bg3e;
                    }
                    if ((i4 | 8) == i4) {
                        olpwqu4xgj.GI83zq0G8e7zkn = p4ej2wquogvpnvyl4wci1bg3e;
                    }
                    wL6lQKsoxy wl6lqksoxy2 = olpwqu4xgj.zzpBGItXfub0yWj == 0 ? null : new wL6lQKsoxy(olpwqu4xgj);
                    if (wl6lqksoxy2.ZfQNn8hdWlEQ5cR94249PDsLR()) {
                        materialButton.setStateListShapeAppearanceModel(wl6lqksoxy2);
                    } else {
                        materialButton.setShapeAppearanceModel(wl6lqksoxy2.V57tEvNfxZVVcOCAOih5PKr());
                    }
                }
                i2++;
            }
        }
    }

    public final boolean V57tEvNfxZVVcOCAOih5PKr(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i - 1);
            if (this.M9e7PWhFYLD2lOGMker <= 0) {
                iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                materialButton.setShouldDrawSurfaceColorStroke(true);
                materialButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButton.setShouldDrawSurfaceColorStroke(false);
                materialButton2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.M9e7PWhFYLD2lOGMker - iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.M9e7PWhFYLD2lOGMker - iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.q11o1hieEkZDhF1MGOZI26oZiDT;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.q11o1hieEkZDhF1MGOZI26oZiDT = null;
                materialButton.vBGA6pPLqSMuYGvprl270j7 = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        ZfQNn8hdWlEQ5cR94249PDsLR();
        this.KUYypEB4eNWOZWVDpH = true;
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        this.V57tEvNfxZVVcOCAOih5PKr.add(materialButton.getShapeAppearanceModel());
        this.ZfQNn8hdWlEQ5cR94249PDsLR.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public XzG3TQCrw9CYO6IfOT7jYKxnGPWU getButtonSizeChange() {
        return this.HzCpKshMOoaw76hFcbOVRYMeRd;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    public WBbGwHQ7q5Zp0OIijyR getInnerCornerSize() {
        return this.NSjgqmGjEzuugn2SsG1mZFP.zzpBGItXfub0yWj;
    }

    public p4ej2wQUoGVPNvYl4WCI1bg3E getInnerCornerSizeStateList() {
        return this.NSjgqmGjEzuugn2SsG1mZFP;
    }

    public XdVIZOnOVHGi6uYUaae4zAI94b getShapeAppearance() {
        wL6lQKsoxy wl6lqksoxy = this.GI83zq0G8e7zkn;
        if (wl6lqksoxy == null) {
            return null;
        }
        return wl6lqksoxy.V57tEvNfxZVVcOCAOih5PKr();
    }

    public int getSpacing() {
        return this.M9e7PWhFYLD2lOGMker;
    }

    public wL6lQKsoxy getStateListShapeAppearance() {
        return this.GI83zq0G8e7zkn;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            ZfQNn8hdWlEQ5cR94249PDsLR();
            zzpBGItXfub0yWj();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        LaeGQIruHQu81hfJldjMOQSVblH3x();
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.V57tEvNfxZVVcOCAOih5PKr.remove(iIndexOfChild);
            this.ZfQNn8hdWlEQ5cR94249PDsLR.remove(iIndexOfChild);
        }
        this.KUYypEB4eNWOZWVDpH = true;
        LaeGQIruHQu81hfJldjMOQSVblH3x();
        ZfQNn8hdWlEQ5cR94249PDsLR();
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    public void setButtonSizeChange(XzG3TQCrw9CYO6IfOT7jYKxnGPWU xzG3TQCrw9CYO6IfOT7jYKxnGPWU) {
        if (this.HzCpKshMOoaw76hFcbOVRYMeRd != xzG3TQCrw9CYO6IfOT7jYKxnGPWU) {
            this.HzCpKshMOoaw76hFcbOVRYMeRd = xzG3TQCrw9CYO6IfOT7jYKxnGPWU;
            zzpBGItXfub0yWj();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setInnerCornerSize(WBbGwHQ7q5Zp0OIijyR wBbGwHQ7q5Zp0OIijyR) {
        this.NSjgqmGjEzuugn2SsG1mZFP = p4ej2wQUoGVPNvYl4WCI1bg3E.zzpBGItXfub0yWj(wBbGwHQ7q5Zp0OIijyR);
        this.KUYypEB4eNWOZWVDpH = true;
        LaeGQIruHQu81hfJldjMOQSVblH3x();
        invalidate();
    }

    public void setInnerCornerSizeStateList(p4ej2wQUoGVPNvYl4WCI1bg3E p4ej2wquogvpnvyl4wci1bg3e) {
        this.NSjgqmGjEzuugn2SsG1mZFP = p4ej2wquogvpnvyl4wci1bg3e;
        this.KUYypEB4eNWOZWVDpH = true;
        LaeGQIruHQu81hfJldjMOQSVblH3x();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.KUYypEB4eNWOZWVDpH = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b) {
        oLPwQu4XgJ olpwqu4xgj = new oLPwQu4XgJ(xdVIZOnOVHGi6uYUaae4zAI94b);
        this.GI83zq0G8e7zkn = olpwqu4xgj.zzpBGItXfub0yWj == 0 ? null : new wL6lQKsoxy(olpwqu4xgj);
        this.KUYypEB4eNWOZWVDpH = true;
        LaeGQIruHQu81hfJldjMOQSVblH3x();
        invalidate();
    }

    public void setSpacing(int i) {
        this.M9e7PWhFYLD2lOGMker = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(wL6lQKsoxy wl6lqksoxy) {
        this.GI83zq0G8e7zkn = wl6lqksoxy;
        this.KUYypEB4eNWOZWVDpH = true;
        LaeGQIruHQu81hfJldjMOQSVblH3x();
        invalidate();
    }

    public final void zzpBGItXfub0yWj() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float fMax;
        if (this.HzCpKshMOoaw76hFcbOVRYMeRd == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i = firstVisibleChildIndex; i <= lastVisibleChildIndex; i++) {
            if (V57tEvNfxZVVcOCAOih5PKr(i)) {
                if (V57tEvNfxZVVcOCAOih5PKr(i) && this.HzCpKshMOoaw76hFcbOVRYMeRd != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i);
                    XzG3TQCrw9CYO6IfOT7jYKxnGPWU xzG3TQCrw9CYO6IfOT7jYKxnGPWU = this.HzCpKshMOoaw76hFcbOVRYMeRd;
                    int width = materialButton3.getWidth();
                    int i2 = -width;
                    for (int i3 = 0; i3 < xzG3TQCrw9CYO6IfOT7jYKxnGPWU.VxUQ9tBhpHJ2AAEDNW8sghc4m; i3++) {
                        YA9VQr52hzmd yA9VQr52hzmd = (YA9VQr52hzmd) xzG3TQCrw9CYO6IfOT7jYKxnGPWU.ZfQNn8hdWlEQ5cR94249PDsLR[i3].V57tEvNfxZVVcOCAOih5PKr;
                        int i4 = yA9VQr52hzmd.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        float f = yA9VQr52hzmd.zzpBGItXfub0yWj;
                        if (i4 == 2) {
                            fMax = Math.max(i2, f);
                        } else if (i4 == 1) {
                            fMax = Math.max(i2, width * f);
                        }
                        i2 = (int) fMax;
                    }
                    int iMax = Math.max(0, i2);
                    int i5 = i - 1;
                    while (true) {
                        materialButton = null;
                        if (i5 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (V57tEvNfxZVVcOCAOih5PKr(i5)) {
                                materialButton2 = (MaterialButton) getChildAt(i5);
                                break;
                            }
                            i5--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    int i6 = i + 1;
                    while (true) {
                        if (i6 >= childCount) {
                            break;
                        }
                        if (V57tEvNfxZVVcOCAOih5PKr(i6)) {
                            materialButton = (MaterialButton) getChildAt(i6);
                            break;
                        }
                        i6++;
                    }
                    iMin = Math.min(iMax, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i != firstVisibleChildIndex && i != lastVisibleChildIndex) {
                    iMin /= 2;
                }
                iMin = Math.min(iMin, iMin);
            }
        }
        int i7 = firstVisibleChildIndex;
        while (i7 <= lastVisibleChildIndex) {
            if (V57tEvNfxZVVcOCAOih5PKr(i7)) {
                ((MaterialButton) getChildAt(i7)).setSizeChange(this.HzCpKshMOoaw76hFcbOVRYMeRd);
                ((MaterialButton) getChildAt(i7)).setWidthChangeMax((i7 == firstVisibleChildIndex || i7 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i7++;
        }
    }
}
