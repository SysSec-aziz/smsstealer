package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class UdolbJMuTFGlV extends em9CQSm1f1lSysM22u {
    public Drawable Ca81ebIan1u;
    public ColorStateList GI83zq0G8e7zkn;
    public boolean HzCpKshMOoaw76hFcbOVRYMeRd;
    public CharSequence Irh5auREsoeV1C1RaBamlmy;
    public boolean KUYypEB4eNWOZWVDpH;
    public boolean M9e7PWhFYLD2lOGMker;
    public final LinkedHashSet NSjgqmGjEzuugn2SsG1mZFP;
    public final gRx9aVOIySZIg2M5dXBALHfl RhfGHxtXxy0M0grmp2jkRjQg;
    public boolean TaDO7ogis3aEiWEtq;
    public final LinkedHashSet ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int f6ZQsR6bPLvvCDNXOUc;
    public boolean h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public PorterDuff.Mode jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public ColorStateList ko09zE6UAgwkV;
    public Drawable p59rPv72J9;
    public ColorStateList pYmKDYlAmhudp;
    public CompoundButton.OnCheckedChangeListener q11o1hieEkZDhF1MGOZI26oZiDT;
    public CharSequence q1wNbhk2O6;
    public int[] vBGA6pPLqSMuYGvprl270j7;
    public final q0pWTaFdtfarfiKiJ0i30WR w0Wu95l8dVNw5rZMRu;
    public static final int[] qNPQb1obP7 = {R.attr.state_indeterminate};
    public static final int[] SuB3hEmTmbbRGAhtvOOmfKEon = {R.attr.state_error};
    public static final int[][] pzqP2AqKW6J5PO8zCKnW = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int aXO0LSrt8bKV = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public UdolbJMuTFGlV(Context context, AttributeSet attributeSet) {
        super(sGipz63rTUmSj3uFDvOtzihao.bjhcQ0u7VT2OYYrwk96HrWoN(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new LinkedHashSet();
        this.NSjgqmGjEzuugn2SsG1mZFP = new LinkedHashSet();
        Context context2 = getContext();
        q0pWTaFdtfarfiKiJ0i30WR q0pwtafdtfarfikij0i30wr = new q0pWTaFdtfarfiKiJ0i30WR(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = h88a6weV7Lqlrc7J4ND8e7Rcl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        q0pwtafdtfarfikij0i30wr.V57tEvNfxZVVcOCAOih5PKr = drawable;
        drawable.setCallback(q0pwtafdtfarfikij0i30wr.NSjgqmGjEzuugn2SsG1mZFP);
        new uZkG4KR26RHbX77LZ98AY8m(q0pwtafdtfarfikij0i30wr.V57tEvNfxZVVcOCAOih5PKr.getConstantState());
        this.w0Wu95l8dVNw5rZMRu = q0pwtafdtfarfikij0i30wr;
        this.RhfGHxtXxy0M0grmp2jkRjQg = new gRx9aVOIySZIg2M5dXBALHfl(this);
        Context context3 = getContext();
        this.p59rPv72J9 = getButtonDrawable();
        this.pYmKDYlAmhudp = getSuperButtonTintList();
        setSupportButtonTintList(null);
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.LaeGQIruHQu81hfJldjMOQSVblH3x(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = PGobtLpyfPC4TCnlq740.Ca81ebIan1u;
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.NSjgqmGjEzuugn2SsG1mZFP(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM = new NrjuzzioPqfttNRptBDpZDzSYUrcM(context3, typedArrayObtainStyledAttributes);
        this.Ca81ebIan1u = nrjuzzioPqfttNRptBDpZDzSYUrcM.pYmKDYlAmhudp(2);
        if (this.p59rPv72J9 != null && ej6unYlOWMDF.ItrQwCXbty5PZtje5JS(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == aXO0LSrt8bKV && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.p59rPv72J9 = KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(context3, R.drawable.mtrl_checkbox_button);
                this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = true;
                if (this.Ca81ebIan1u == null) {
                    this.Ca81ebIan1u = KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.ko09zE6UAgwkV = F44whnLsbQ.TaDO7ogis3aEiWEtq(context3, nrjuzzioPqfttNRptBDpZDzSYUrcM, 3);
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = KfeOQNOupsCg6878zi4e.d9zDyyznnp3oaDT1Ug(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.M9e7PWhFYLD2lOGMker = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.HzCpKshMOoaw76hFcbOVRYMeRd = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.KUYypEB4eNWOZWVDpH = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.q1wNbhk2O6 = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        nrjuzzioPqfttNRptBDpZDzSYUrcM.aXO0LSrt8bKV();
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    private String getButtonStateDescription() {
        int i = this.f6ZQsR6bPLvvCDNXOUc;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.GI83zq0G8e7zkn == null) {
            int iVBGA6pPLqSMuYGvprl270j7 = zonOxHotd3BwAPJcwqr6I6uQNngg4.vBGA6pPLqSMuYGvprl270j7(this, R.attr.colorControlActivated);
            int iVBGA6pPLqSMuYGvprl270j72 = zonOxHotd3BwAPJcwqr6I6uQNngg4.vBGA6pPLqSMuYGvprl270j7(this, R.attr.colorError);
            int iVBGA6pPLqSMuYGvprl270j73 = zonOxHotd3BwAPJcwqr6I6uQNngg4.vBGA6pPLqSMuYGvprl270j7(this, R.attr.colorSurface);
            int iVBGA6pPLqSMuYGvprl270j74 = zonOxHotd3BwAPJcwqr6I6uQNngg4.vBGA6pPLqSMuYGvprl270j7(this, R.attr.colorOnSurface);
            this.GI83zq0G8e7zkn = new ColorStateList(pzqP2AqKW6J5PO8zCKnW, new int[]{zonOxHotd3BwAPJcwqr6I6uQNngg4.iKANjmyTSxO6v6UuLPdu7DxOjlS(iVBGA6pPLqSMuYGvprl270j73, iVBGA6pPLqSMuYGvprl270j72, 1.0f), zonOxHotd3BwAPJcwqr6I6uQNngg4.iKANjmyTSxO6v6UuLPdu7DxOjlS(iVBGA6pPLqSMuYGvprl270j73, iVBGA6pPLqSMuYGvprl270j7, 1.0f), zonOxHotd3BwAPJcwqr6I6uQNngg4.iKANjmyTSxO6v6UuLPdu7DxOjlS(iVBGA6pPLqSMuYGvprl270j73, iVBGA6pPLqSMuYGvprl270j74, 0.54f), zonOxHotd3BwAPJcwqr6I6uQNngg4.iKANjmyTSxO6v6UuLPdu7DxOjlS(iVBGA6pPLqSMuYGvprl270j73, iVBGA6pPLqSMuYGvprl270j74, 0.38f), zonOxHotd3BwAPJcwqr6I6uQNngg4.iKANjmyTSxO6v6UuLPdu7DxOjlS(iVBGA6pPLqSMuYGvprl270j73, iVBGA6pPLqSMuYGvprl270j74, 0.38f)});
        }
        return this.GI83zq0G8e7zkn;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.pYmKDYlAmhudp;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        LJ0avg2f37zqC lJ0avg2f37zqC;
        Drawable drawableMutate = this.p59rPv72J9;
        ColorStateList colorStateList3 = this.pYmKDYlAmhudp;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.p59rPv72J9 = drawableMutate;
        Drawable drawableMutate2 = this.Ca81ebIan1u;
        ColorStateList colorStateList4 = this.ko09zE6UAgwkV;
        PorterDuff.Mode mode = this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.Ca81ebIan1u = drawableMutate2;
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) {
            q0pWTaFdtfarfiKiJ0i30WR q0pwtafdtfarfikij0i30wr = this.w0Wu95l8dVNw5rZMRu;
            if (q0pwtafdtfarfikij0i30wr != null) {
                lMWs8BoetIVDONVmx lmws8boetivdonvmx = q0pwtafdtfarfikij0i30wr.ZfQNn8hdWlEQ5cR94249PDsLR;
                Drawable drawable = q0pwtafdtfarfikij0i30wr.V57tEvNfxZVVcOCAOih5PKr;
                gRx9aVOIySZIg2M5dXBALHfl grx9avoiyszig2m5dxbalhfl = this.RhfGHxtXxy0M0grmp2jkRjQg;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (grx9avoiyszig2m5dxbalhfl.VxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
                        grx9avoiyszig2m5dxbalhfl.VxUQ9tBhpHJ2AAEDNW8sghc4m = new W4jfetXW2DemIO(grx9avoiyszig2m5dxbalhfl);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(grx9avoiyszig2m5dxbalhfl.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                }
                ArrayList arrayList = q0pwtafdtfarfikij0i30wr.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                if (arrayList != null && grx9avoiyszig2m5dxbalhfl != null) {
                    arrayList.remove(grx9avoiyszig2m5dxbalhfl);
                    if (q0pwtafdtfarfikij0i30wr.ZLZeBXTMq0zDztBxtRTuCHrapQ.size() == 0 && (lJ0avg2f37zqC = q0pwtafdtfarfikij0i30wr.zIvmSL0wzmmKGc3X39b2Gw2mUGE) != null) {
                        lmws8boetivdonvmx.zzpBGItXfub0yWj.removeListener(lJ0avg2f37zqC);
                        q0pwtafdtfarfikij0i30wr.zIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
                    }
                }
                Drawable drawable2 = q0pwtafdtfarfikij0i30wr.V57tEvNfxZVVcOCAOih5PKr;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (grx9avoiyszig2m5dxbalhfl.VxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
                        grx9avoiyszig2m5dxbalhfl.VxUQ9tBhpHJ2AAEDNW8sghc4m = new W4jfetXW2DemIO(grx9avoiyszig2m5dxbalhfl);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(grx9avoiyszig2m5dxbalhfl.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                } else if (grx9avoiyszig2m5dxbalhfl != null) {
                    if (q0pwtafdtfarfikij0i30wr.ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
                        q0pwtafdtfarfikij0i30wr.ZLZeBXTMq0zDztBxtRTuCHrapQ = new ArrayList();
                    }
                    if (!q0pwtafdtfarfikij0i30wr.ZLZeBXTMq0zDztBxtRTuCHrapQ.contains(grx9avoiyszig2m5dxbalhfl)) {
                        q0pwtafdtfarfikij0i30wr.ZLZeBXTMq0zDztBxtRTuCHrapQ.add(grx9avoiyszig2m5dxbalhfl);
                        if (q0pwtafdtfarfikij0i30wr.zIvmSL0wzmmKGc3X39b2Gw2mUGE == null) {
                            q0pwtafdtfarfikij0i30wr.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new LJ0avg2f37zqC(1, q0pwtafdtfarfikij0i30wr);
                        }
                        lmws8boetivdonvmx.zzpBGItXfub0yWj.addListener(q0pwtafdtfarfikij0i30wr.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                    }
                }
            }
            Drawable drawable3 = this.p59rPv72J9;
            if ((drawable3 instanceof AnimatedStateListDrawable) && q0pwtafdtfarfikij0i30wr != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, q0pwtafdtfarfikij0i30wr, false);
                ((AnimatedStateListDrawable) this.p59rPv72J9).addTransition(R.id.indeterminate, R.id.unchecked, q0pwtafdtfarfikij0i30wr, false);
            }
        }
        Drawable drawable4 = this.p59rPv72J9;
        if (drawable4 != null && (colorStateList2 = this.pYmKDYlAmhudp) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.Ca81ebIan1u;
        if (drawable5 != null && (colorStateList = this.ko09zE6UAgwkV) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.p59rPv72J9;
        Drawable drawable7 = this.Ca81ebIan1u;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.p59rPv72J9;
    }

    public Drawable getButtonIconDrawable() {
        return this.Ca81ebIan1u;
    }

    public ColorStateList getButtonIconTintList() {
        return this.ko09zE6UAgwkV;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.pYmKDYlAmhudp;
    }

    public int getCheckedState() {
        return this.f6ZQsR6bPLvvCDNXOUc;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.q1wNbhk2O6;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f6ZQsR6bPLvvCDNXOUc == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.M9e7PWhFYLD2lOGMker && this.pYmKDYlAmhudp == null && this.ko09zE6UAgwkV == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, qNPQb1obP7);
        }
        if (this.KUYypEB4eNWOZWVDpH) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, SuB3hEmTmbbRGAhtvOOmfKEon);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.vBGA6pPLqSMuYGvprl270j7 = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.HzCpKshMOoaw76hFcbOVRYMeRd || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.KUYypEB4eNWOZWVDpH) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.q1wNbhk2O6));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof neCTKJPHujsSxgUr6c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        neCTKJPHujsSxgUr6c nectkjphujssxgur6c = (neCTKJPHujsSxgUr6c) parcelable;
        super.onRestoreInstanceState(nectkjphujssxgur6c.getSuperState());
        setCheckedState(nectkjphujssxgur6c.V57tEvNfxZVVcOCAOih5PKr);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        neCTKJPHujsSxgUr6c nectkjphujssxgur6c = new neCTKJPHujsSxgUr6c(super.onSaveInstanceState());
        nectkjphujssxgur6c.V57tEvNfxZVVcOCAOih5PKr = getCheckedState();
        return nectkjphujssxgur6c;
    }

    @Override // com.vdodsodjsdt.em9CQSm1f1lSysM22u, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.Ca81ebIan1u = drawable;
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.ko09zE6UAgwkV == colorStateList) {
            return;
        }
        this.ko09zE6UAgwkV = colorStateList;
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.jW7EiD0YL6xkbB158jMUzhWNWb1y == mode) {
            return;
        }
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = mode;
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.pYmKDYlAmhudp == colorStateList) {
            return;
        }
        this.pYmKDYlAmhudp = colorStateList;
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.HzCpKshMOoaw76hFcbOVRYMeRd = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f6ZQsR6bPLvvCDNXOUc != i) {
            this.f6ZQsR6bPLvvCDNXOUc = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.Irh5auREsoeV1C1RaBamlmy == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.TaDO7ogis3aEiWEtq) {
                return;
            }
            this.TaDO7ogis3aEiWEtq = true;
            LinkedHashSet linkedHashSet = this.NSjgqmGjEzuugn2SsG1mZFP;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f6ZQsR6bPLvvCDNXOUc != 2 && (onCheckedChangeListener = this.q11o1hieEkZDhF1MGOZI26oZiDT) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i2 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.TaDO7ogis3aEiWEtq = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.q1wNbhk2O6 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.KUYypEB4eNWOZWVDpH == z) {
            return;
        }
        this.KUYypEB4eNWOZWVDpH = z;
        refreshDrawableState();
        Iterator it = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.q11o1hieEkZDhF1MGOZI26oZiDT = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.Irh5auREsoeV1C1RaBamlmy = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.M9e7PWhFYLD2lOGMker = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // com.vdodsodjsdt.em9CQSm1f1lSysM22u, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.p59rPv72J9 = drawable;
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = false;
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }
}
