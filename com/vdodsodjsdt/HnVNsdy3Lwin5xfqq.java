package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class HnVNsdy3Lwin5xfqq extends View {
    public HashMap GI83zq0G8e7zkn;
    public Context LaeGQIruHQu81hfJldjMOQSVblH3x;
    public String NSjgqmGjEzuugn2SsG1mZFP;
    public int[] V57tEvNfxZVVcOCAOih5PKr;
    public String ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public NENDPFFAZXAw zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public final void GI83zq0G8e7zkn() {
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ZtjVvctVhW3SMibpO0L8oqBK) {
            ((ZtjVvctVhW3SMibpO0L8oqBK) layoutParams).e1gEV3X9xwmHj = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        }
    }

    public abstract void NSjgqmGjEzuugn2SsG1mZFP(IPwvkMKvXW4H2mJtQ4szs9vgoyzLD iPwvkMKvXW4H2mJtQ4szs9vgoyzLD, boolean z);

    public final void V57tEvNfxZVVcOCAOih5PKr(String str) {
        if (str == null || str.length() == 0 || this.LaeGQIruHQu81hfJldjMOQSVblH3x == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ZtjVvctVhW3SMibpO0L8oqBK) && strTrim.equals(((ZtjVvctVhW3SMibpO0L8oqBK) layoutParams).KYZ9RyuOc42A2J)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    zzpBGItXfub0yWj(childAt.getId());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(java.lang.String r6) {
        /*
            r5 = this;
            android.content.Context r0 = r5.LaeGQIruHQu81hfJldjMOQSVblH3x
            if (r6 == 0) goto L98
            int r1 = r6.length()
            if (r1 != 0) goto Lc
            goto L98
        Lc:
            if (r0 != 0) goto L10
            goto L98
        L10:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L24
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L25
        L24:
            r1 = r2
        L25:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L4c
            if (r1 == 0) goto L4c
            if (r6 == 0) goto L40
            java.util.HashMap r3 = r1.Ca81ebIan1u
            if (r3 == 0) goto L40
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L40
            java.util.HashMap r3 = r1.Ca81ebIan1u
            java.lang.Object r3 = r3.get(r6)
            goto L41
        L40:
            r3 = r2
        L41:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L4c
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L4d
        L4c:
            r3 = 0
        L4d:
            if (r3 != 0) goto L55
            if (r1 == 0) goto L55
            int r3 = r5.zIvmSL0wzmmKGc3X39b2Gw2mUGE(r1, r6)
        L55:
            if (r3 != 0) goto L61
            java.lang.Class<com.vdodsodjsdt.dQe4GlYslGx26Y6hUeth> r1 = com.vdodsodjsdt.dQe4GlYslGx26Y6hUeth.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L61
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L61
        L61:
            if (r3 != 0) goto L71
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L71:
            if (r3 == 0) goto L80
            java.util.HashMap r0 = r5.GI83zq0G8e7zkn
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.zzpBGItXfub0yWj(r3)
            goto L98
        L80:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.HnVNsdy3Lwin5xfqq.VxUQ9tBhpHJ2AAEDNW8sghc4m(java.lang.String):void");
    }

    public void ZLZeBXTMq0zDztBxtRTuCHrapQ(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ehtgKpBkv4pNXGKK0RL6dwwx7f.zzpBGItXfub0yWj);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.ZLZeBXTMq0zDztBxtRTuCHrapQ = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.NSjgqmGjEzuugn2SsG1mZFP = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.ZfQNn8hdWlEQ5cR94249PDsLR; i++) {
            View view = (View) constraintLayout.V57tEvNfxZVVcOCAOih5PKr.get(this.V57tEvNfxZVVcOCAOih5PKr[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.V57tEvNfxZVVcOCAOih5PKr, this.ZfQNn8hdWlEQ5cR94249PDsLR);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                VxUQ9tBhpHJ2AAEDNW8sghc4m(str.substring(i));
                return;
            } else {
                VxUQ9tBhpHJ2AAEDNW8sghc4m(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.NSjgqmGjEzuugn2SsG1mZFP = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                V57tEvNfxZVVcOCAOih5PKr(str.substring(i));
                return;
            } else {
                V57tEvNfxZVVcOCAOih5PKr(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = null;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = 0;
        for (int i : iArr) {
            zzpBGItXfub0yWj(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
            zzpBGItXfub0yWj(i);
        }
    }

    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.LaeGQIruHQu81hfJldjMOQSVblH3x.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public final void zzpBGItXfub0yWj(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.ZfQNn8hdWlEQ5cR94249PDsLR + 1;
        int[] iArr = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i2 > iArr.length) {
            this.V57tEvNfxZVVcOCAOih5PKr = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.V57tEvNfxZVVcOCAOih5PKr;
        int i3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        iArr2[i3] = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i3 + 1;
    }

    public void LaeGQIruHQu81hfJldjMOQSVblH3x(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
