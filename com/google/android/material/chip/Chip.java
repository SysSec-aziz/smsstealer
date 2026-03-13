package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.vdodsodjsdt.Ace4xmNA0QbdiSLPz;
import com.vdodsodjsdt.F44whnLsbQ;
import com.vdodsodjsdt.FLWIoSaHb1q8TqFvEBgPyRGrzvi6;
import com.vdodsodjsdt.GXZVLd372jtPv6;
import com.vdodsodjsdt.KfeOQNOupsCg6878zi4e;
import com.vdodsodjsdt.OCSrCLuM8BRmWzDT5ywLgVbh6OiHg;
import com.vdodsodjsdt.PGobtLpyfPC4TCnlq740;
import com.vdodsodjsdt.PkBeXXwxWaGrzNHNG1JbWG5uMRK;
import com.vdodsodjsdt.WBeT5fsguop;
import com.vdodsodjsdt.XdVIZOnOVHGi6uYUaae4zAI94b;
import com.vdodsodjsdt.avPAxXGaxsbfwFXxj;
import com.vdodsodjsdt.doTXiy1qUXQYn;
import com.vdodsodjsdt.dqrRplqyPGe;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.em9CQSm1f1lSysM22u;
import com.vdodsodjsdt.fIFi1mbkcdIKNsFz5uhziRB4UH;
import com.vdodsodjsdt.ji7HCOeNEno1mYLq3Mn8d;
import com.vdodsodjsdt.kuNd5HLEtGyow6v2XZnS;
import com.vdodsodjsdt.pDEkAB1gLwlZIS;
import com.vdodsodjsdt.r3Z3A1GlT1xNo;
import com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao;
import com.vdodsodjsdt.wxy8N6DDawGP6J;
import com.vdodsodjsdt.xEETVD81ziRcL5BcSKUT7ajvxHmaB;
import com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8;
import com.vdodsodjsdt.zonOxHotd3BwAPJcwqr6I6uQNngg4;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class Chip extends em9CQSm1f1lSysM22u implements OCSrCLuM8BRmWzDT5ywLgVbh6OiHg, dqrRplqyPGe, Checkable {
    public boolean Ca81ebIan1u;
    public RippleDrawable GI83zq0G8e7zkn;
    public CompoundButton.OnCheckedChangeListener HzCpKshMOoaw76hFcbOVRYMeRd;
    public final RectF Irh5auREsoeV1C1RaBamlmy;
    public boolean KUYypEB4eNWOZWVDpH;
    public View.OnClickListener M9e7PWhFYLD2lOGMker;
    public InsetDrawable NSjgqmGjEzuugn2SsG1mZFP;
    public final Rect TaDO7ogis3aEiWEtq;
    public avPAxXGaxsbfwFXxj ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final PkBeXXwxWaGrzNHNG1JbWG5uMRK f6ZQsR6bPLvvCDNXOUc;
    public boolean h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public CharSequence jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public int ko09zE6UAgwkV;
    public boolean p59rPv72J9;
    public int pYmKDYlAmhudp;
    public final r3Z3A1GlT1xNo q11o1hieEkZDhF1MGOZI26oZiDT;
    public boolean q1wNbhk2O6;
    public boolean vBGA6pPLqSMuYGvprl270j7;
    public static final Rect w0Wu95l8dVNw5rZMRu = new Rect();
    public static final int[] RhfGHxtXxy0M0grmp2jkRjQg = {R.attr.state_selected};
    public static final int[] qNPQb1obP7 = {R.attr.state_checkable};

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(sGipz63rTUmSj3uFDvOtzihao.bjhcQ0u7VT2OYYrwk96HrWoN(context, attributeSet, com.vdodsodjsdt.R.attr.chipStyle, com.vdodsodjsdt.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.vdodsodjsdt.R.attr.chipStyle);
        this.TaDO7ogis3aEiWEtq = new Rect();
        this.Irh5auREsoeV1C1RaBamlmy = new RectF();
        this.q11o1hieEkZDhF1MGOZI26oZiDT = new r3Z3A1GlT1xNo(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = new avPAxXGaxsbfwFXxj(context2, attributeSet);
        Context context3 = avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj;
        int[] iArr = PGobtLpyfPC4TCnlq740.V57tEvNfxZVVcOCAOih5PKr;
        TypedArray typedArrayVE4yDIjexsP2lGjLaTcB = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.vE4yDIjexsP2lGjLaTcB(context3, attributeSet, iArr, com.vdodsodjsdt.R.attr.chipStyle, com.vdodsodjsdt.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        avpaxxgaxsbfwfxxj.u04PSKYidgCYrHk5CAtyMkPOXcY = typedArrayVE4yDIjexsP2lGjLaTcB.hasValue(37);
        Context context4 = avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj;
        ColorStateList colorStateListVBGA6pPLqSMuYGvprl270j7 = F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context4, typedArrayVE4yDIjexsP2lGjLaTcB, 24);
        if (avpaxxgaxsbfwfxxj.qygqjTppWwx992 != colorStateListVBGA6pPLqSMuYGvprl270j7) {
            avpaxxgaxsbfwfxxj.qygqjTppWwx992 = colorStateListVBGA6pPLqSMuYGvprl270j7;
            avpaxxgaxsbfwfxxj.onStateChange(avpaxxgaxsbfwfxxj.getState());
        }
        ColorStateList colorStateListVBGA6pPLqSMuYGvprl270j72 = F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context4, typedArrayVE4yDIjexsP2lGjLaTcB, 11);
        if (avpaxxgaxsbfwfxxj.iKANjmyTSxO6v6UuLPdu7DxOjlS != colorStateListVBGA6pPLqSMuYGvprl270j72) {
            avpaxxgaxsbfwfxxj.iKANjmyTSxO6v6UuLPdu7DxOjlS = colorStateListVBGA6pPLqSMuYGvprl270j72;
            avpaxxgaxsbfwfxxj.onStateChange(avpaxxgaxsbfwfxxj.getState());
        }
        float dimension = typedArrayVE4yDIjexsP2lGjLaTcB.getDimension(19, 0.0f);
        if (avpaxxgaxsbfwfxxj.TqcnImqkSWIKht != dimension) {
            avpaxxgaxsbfwfxxj.TqcnImqkSWIKht = dimension;
            avpaxxgaxsbfwfxxj.invalidateSelf();
            avpaxxgaxsbfwfxxj.qNPQb1obP7();
        }
        if (typedArrayVE4yDIjexsP2lGjLaTcB.hasValue(12)) {
            avpaxxgaxsbfwfxxj.HVEwbdULInpTNa0IG(typedArrayVE4yDIjexsP2lGjLaTcB.getDimension(12, 0.0f));
        }
        avpaxxgaxsbfwfxxj.d9zDyyznnp3oaDT1Ug(F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context4, typedArrayVE4yDIjexsP2lGjLaTcB, 22));
        avpaxxgaxsbfwfxxj.CixTK5ZX8oWXHz34qHYV(typedArrayVE4yDIjexsP2lGjLaTcB.getDimension(23, 0.0f));
        avpaxxgaxsbfwfxxj.vXWl0o6I4U59CgHs9(F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context4, typedArrayVE4yDIjexsP2lGjLaTcB, 36));
        String text = typedArrayVE4yDIjexsP2lGjLaTcB.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(avpaxxgaxsbfwfxxj.wRCD0SdqWCowdYU7bmzN, text)) {
            avpaxxgaxsbfwfxxj.wRCD0SdqWCowdYU7bmzN = text;
            avpaxxgaxsbfwfxxj.r0dB0ojIy6g8mnk1.ZfQNn8hdWlEQ5cR94249PDsLR = true;
            avpaxxgaxsbfwfxxj.invalidateSelf();
            avpaxxgaxsbfwfxxj.qNPQb1obP7();
        }
        GXZVLd372jtPv6 gXZVLd372jtPv6 = (!typedArrayVE4yDIjexsP2lGjLaTcB.hasValue(0) || (resourceId3 = typedArrayVE4yDIjexsP2lGjLaTcB.getResourceId(0, 0)) == 0) ? null : new GXZVLd372jtPv6(context4, resourceId3);
        gXZVLd372jtPv6.KUYypEB4eNWOZWVDpH = typedArrayVE4yDIjexsP2lGjLaTcB.getDimension(1, gXZVLd372jtPv6.KUYypEB4eNWOZWVDpH);
        avpaxxgaxsbfwfxxj.wdI7vzA3Qmcwd(gXZVLd372jtPv6);
        int i = typedArrayVE4yDIjexsP2lGjLaTcB.getInt(3, 0);
        if (i == 1) {
            avpaxxgaxsbfwfxxj.MnclyDIMxkCs4NkUREm = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            avpaxxgaxsbfwfxxj.MnclyDIMxkCs4NkUREm = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            avpaxxgaxsbfwfxxj.MnclyDIMxkCs4NkUREm = TextUtils.TruncateAt.END;
        }
        avpaxxgaxsbfwfxxj.TqcnImqkSWIKht(typedArrayVE4yDIjexsP2lGjLaTcB.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            avpaxxgaxsbfwfxxj.TqcnImqkSWIKht(typedArrayVE4yDIjexsP2lGjLaTcB.getBoolean(15, false));
        }
        avpaxxgaxsbfwfxxj.y1NaPKTl7R18DOr6e8i5(F44whnLsbQ.w0Wu95l8dVNw5rZMRu(context4, typedArrayVE4yDIjexsP2lGjLaTcB, 14));
        if (typedArrayVE4yDIjexsP2lGjLaTcB.hasValue(17)) {
            avpaxxgaxsbfwfxxj.iKANjmyTSxO6v6UuLPdu7DxOjlS(F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context4, typedArrayVE4yDIjexsP2lGjLaTcB, 17));
        }
        avpaxxgaxsbfwfxxj.qygqjTppWwx992(typedArrayVE4yDIjexsP2lGjLaTcB.getDimension(16, -1.0f));
        avpaxxgaxsbfwfxxj.JUdwvN8LfOMa(typedArrayVE4yDIjexsP2lGjLaTcB.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            avpaxxgaxsbfwfxxj.JUdwvN8LfOMa(typedArrayVE4yDIjexsP2lGjLaTcB.getBoolean(26, false));
        }
        avpaxxgaxsbfwfxxj.ymT6yQrus3w(F44whnLsbQ.w0Wu95l8dVNw5rZMRu(context4, typedArrayVE4yDIjexsP2lGjLaTcB, 25));
        avpaxxgaxsbfwfxxj.lQ0rO9lhQIyVe7Rp6(F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context4, typedArrayVE4yDIjexsP2lGjLaTcB, 30));
        avpaxxgaxsbfwfxxj.wRCD0SdqWCowdYU7bmzN(typedArrayVE4yDIjexsP2lGjLaTcB.getDimension(28, 0.0f));
        avpaxxgaxsbfwfxxj.pzqP2AqKW6J5PO8zCKnW(typedArrayVE4yDIjexsP2lGjLaTcB.getBoolean(6, false));
        avpaxxgaxsbfwfxxj.O1xDAlBZZlZdoEf747lCFHld(typedArrayVE4yDIjexsP2lGjLaTcB.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            avpaxxgaxsbfwfxxj.O1xDAlBZZlZdoEf747lCFHld(typedArrayVE4yDIjexsP2lGjLaTcB.getBoolean(8, false));
        }
        avpaxxgaxsbfwfxxj.aXO0LSrt8bKV(F44whnLsbQ.w0Wu95l8dVNw5rZMRu(context4, typedArrayVE4yDIjexsP2lGjLaTcB, 7));
        if (typedArrayVE4yDIjexsP2lGjLaTcB.hasValue(9)) {
            avpaxxgaxsbfwfxxj.vE4yDIjexsP2lGjLaTcB(F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context4, typedArrayVE4yDIjexsP2lGjLaTcB, 9));
        }
        avpaxxgaxsbfwfxxj.BJQHddi0Plr5ElWetCyaixWOg9 = (!typedArrayVE4yDIjexsP2lGjLaTcB.hasValue(39) || (resourceId2 = typedArrayVE4yDIjexsP2lGjLaTcB.getResourceId(39, 0)) == 0) ? null : wxy8N6DDawGP6J.VxUQ9tBhpHJ2AAEDNW8sghc4m(context4, resourceId2);
        avpaxxgaxsbfwfxxj.tFRdVJAePmTx77bP7FAN0uI = (!typedArrayVE4yDIjexsP2lGjLaTcB.hasValue(33) || (resourceId = typedArrayVE4yDIjexsP2lGjLaTcB.getResourceId(33, 0)) == 0) ? null : wxy8N6DDawGP6J.VxUQ9tBhpHJ2AAEDNW8sghc4m(context4, resourceId);
        float dimension2 = typedArrayVE4yDIjexsP2lGjLaTcB.getDimension(21, 0.0f);
        if (avpaxxgaxsbfwfxxj.mhUCRR8ceqc7mAozW != dimension2) {
            avpaxxgaxsbfwfxxj.mhUCRR8ceqc7mAozW = dimension2;
            avpaxxgaxsbfwfxxj.invalidateSelf();
            avpaxxgaxsbfwfxxj.qNPQb1obP7();
        }
        avpaxxgaxsbfwfxxj.hKs1wlZyvtUNaW1f5ABIGacfPcvX(typedArrayVE4yDIjexsP2lGjLaTcB.getDimension(35, 0.0f));
        avpaxxgaxsbfwfxxj.ItrQwCXbty5PZtje5JS(typedArrayVE4yDIjexsP2lGjLaTcB.getDimension(34, 0.0f));
        float dimension3 = typedArrayVE4yDIjexsP2lGjLaTcB.getDimension(41, 0.0f);
        if (avpaxxgaxsbfwfxxj.ubNpdCC1pl7L != dimension3) {
            avpaxxgaxsbfwfxxj.ubNpdCC1pl7L = dimension3;
            avpaxxgaxsbfwfxxj.invalidateSelf();
            avpaxxgaxsbfwfxxj.qNPQb1obP7();
        }
        float dimension4 = typedArrayVE4yDIjexsP2lGjLaTcB.getDimension(40, 0.0f);
        if (avpaxxgaxsbfwfxxj.wR7sbzHKf9hYV1lxoS6nqyszepWvN != dimension4) {
            avpaxxgaxsbfwfxxj.wR7sbzHKf9hYV1lxoS6nqyszepWvN = dimension4;
            avpaxxgaxsbfwfxxj.invalidateSelf();
            avpaxxgaxsbfwfxxj.qNPQb1obP7();
        }
        avpaxxgaxsbfwfxxj.gBaBUmihn5l4u(typedArrayVE4yDIjexsP2lGjLaTcB.getDimension(29, 0.0f));
        avpaxxgaxsbfwfxxj.YdNRGRc4rly(typedArrayVE4yDIjexsP2lGjLaTcB.getDimension(27, 0.0f));
        float dimension5 = typedArrayVE4yDIjexsP2lGjLaTcB.getDimension(13, 0.0f);
        if (avpaxxgaxsbfwfxxj.tpEo0fy9FaoJYrSFHRfIK6 != dimension5) {
            avpaxxgaxsbfwfxxj.tpEo0fy9FaoJYrSFHRfIK6 = dimension5;
            avpaxxgaxsbfwfxxj.invalidateSelf();
            avpaxxgaxsbfwfxxj.qNPQb1obP7();
        }
        avpaxxgaxsbfwfxxj.w45GC0xYcf4u8gmC = typedArrayVE4yDIjexsP2lGjLaTcB.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayVE4yDIjexsP2lGjLaTcB.recycle();
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.LaeGQIruHQu81hfJldjMOQSVblH3x(context2, attributeSet, com.vdodsodjsdt.R.attr.chipStyle, com.vdodsodjsdt.R.style.Widget_MaterialComponents_Chip_Action);
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.NSjgqmGjEzuugn2SsG1mZFP(context2, attributeSet, iArr, com.vdodsodjsdt.R.attr.chipStyle, com.vdodsodjsdt.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.vdodsodjsdt.R.attr.chipStyle, com.vdodsodjsdt.R.style.Widget_MaterialComponents_Chip_Action);
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = typedArrayObtainStyledAttributes.getBoolean(32, false);
        TypedValue typedValueJUdwvN8LfOMa = ej6unYlOWMDF.JUdwvN8LfOMa(context2, com.vdodsodjsdt.R.attr.minTouchTargetSize);
        this.ko09zE6UAgwkV = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (int) ((typedValueJUdwvN8LfOMa == null || typedValueJUdwvN8LfOMa.type != 5) ? context2.getResources().getDimension(com.vdodsodjsdt.R.dimen.mtrl_min_touch_target_size) : typedValueJUdwvN8LfOMa.getDimension(context2.getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(avpaxxgaxsbfwfxxj);
        avpaxxgaxsbfwfxxj.q1wNbhk2O6(getElevation());
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.LaeGQIruHQu81hfJldjMOQSVblH3x(context2, attributeSet, com.vdodsodjsdt.R.attr.chipStyle, com.vdodsodjsdt.R.style.Widget_MaterialComponents_Chip_Action);
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.NSjgqmGjEzuugn2SsG1mZFP(context2, attributeSet, iArr, com.vdodsodjsdt.R.attr.chipStyle, com.vdodsodjsdt.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.vdodsodjsdt.R.attr.chipStyle, com.vdodsodjsdt.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f6ZQsR6bPLvvCDNXOUc = new PkBeXXwxWaGrzNHNG1JbWG5uMRK(this, this);
        ZfQNn8hdWlEQ5cR94249PDsLR();
        if (!zHasValue) {
            setOutlineProvider(new WBeT5fsguop(this));
        }
        setChecked(this.KUYypEB4eNWOZWVDpH);
        setText(avpaxxgaxsbfwfxxj.wRCD0SdqWCowdYU7bmzN);
        setEllipsize(avpaxxgaxsbfwfxxj.MnclyDIMxkCs4NkUREm);
        ZLZeBXTMq0zDztBxtRTuCHrapQ();
        if (!this.ZLZeBXTMq0zDztBxtRTuCHrapQ.DUIkOzkuF3hUt) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) {
            setMinHeight(this.ko09zE6UAgwkV);
        }
        this.pYmKDYlAmhudp = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.vdodsodjsdt.dBcGMLnUb7TnYop
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.HzCpKshMOoaw76hFcbOVRYMeRd;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.Irh5auREsoeV1C1RaBamlmy;
        rectF.setEmpty();
        if (V57tEvNfxZVVcOCAOih5PKr() && this.M9e7PWhFYLD2lOGMker != null) {
            avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            Rect bounds = avpaxxgaxsbfwfxxj.getBounds();
            rectF.setEmpty();
            if (avpaxxgaxsbfwfxxj.GE1sqSYiEYQO2ew7WEZwTtUeS5()) {
                float f = avpaxxgaxsbfwfxxj.tpEo0fy9FaoJYrSFHRfIK6 + avpaxxgaxsbfwfxxj.ByTQIhgl7ezGvHXEd + avpaxxgaxsbfwfxxj.zOk739gUM7zIZC25HHUxoiyixWFjn + avpaxxgaxsbfwfxxj.HAPpjhiCsV9ONY23505HCBI9IX + avpaxxgaxsbfwfxxj.wR7sbzHKf9hYV1lxoS6nqyszepWvN;
                if (avpaxxgaxsbfwfxxj.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.TaDO7ogis3aEiWEtq;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private GXZVLd372jtPv6 getTextAppearance() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.r0dB0ojIy6g8mnk1.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.p59rPv72J9 != z) {
            this.p59rPv72J9 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.q1wNbhk2O6 != z) {
            this.q1wNbhk2O6 = z;
            refreshDrawableState();
        }
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        this.GI83zq0G8e7zkn = new RippleDrawable(kuNd5HLEtGyow6v2XZnS.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.ZLZeBXTMq0zDztBxtRTuCHrapQ.YdNRGRc4rly), getBackgroundDrawable(), null);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getClass();
        setBackground(this.GI83zq0G8e7zkn);
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
    }

    public final boolean V57tEvNfxZVVcOCAOih5PKr() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj == null) {
            return false;
        }
        Object obj = avpaxxgaxsbfwfxxj.vXWl0o6I4U59CgHs9;
        if (obj == null) {
            obj = null;
        } else if (obj instanceof pDEkAB1gLwlZIS) {
            obj = null;
        }
        return obj != null;
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        TextPaint paint = getPaint();
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            paint.drawableState = avpaxxgaxsbfwfxxj.getState();
        }
        GXZVLd372jtPv6 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.ZfQNn8hdWlEQ5cR94249PDsLR(getContext(), paint, this.q11o1hieEkZDhF1MGOZI26oZiDT);
        }
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj;
        if (!V57tEvNfxZVVcOCAOih5PKr() || (avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ) == null || !avpaxxgaxsbfwfxxj.hKs1wlZyvtUNaW1f5ABIGacfPcvX || this.M9e7PWhFYLD2lOGMker == null) {
            xb0r6yEzq0tw9m7nTWG5BFR8.q1wNbhk2O6(this, null);
            this.vBGA6pPLqSMuYGvprl270j7 = false;
        } else {
            xb0r6yEzq0tw9m7nTWG5BFR8.q1wNbhk2O6(this, this.f6ZQsR6bPLvvCDNXOUc);
            this.vBGA6pPLqSMuYGvprl270j7 = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            boolean r0 = r8.vBGA6pPLqSMuYGvprl270j7
            if (r0 != 0) goto L9
            boolean r9 = super.dispatchHoverEvent(r9)
            return r9
        L9:
            com.vdodsodjsdt.PkBeXXwxWaGrzNHNG1JbWG5uMRK r0 = r8.f6ZQsR6bPLvvCDNXOUc
            android.view.accessibility.AccessibilityManager r1 = r0.NSjgqmGjEzuugn2SsG1mZFP
            boolean r2 = r1.isEnabled()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L6b
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L6b
        L1c:
            int r1 = r9.getAction()
            r2 = 7
            r5 = 256(0x100, float:3.59E-43)
            r6 = 128(0x80, float:1.8E-43)
            if (r1 == r2) goto L42
            r2 = 9
            if (r1 == r2) goto L42
            r2 = 10
            if (r1 == r2) goto L30
            goto L6b
        L30:
            int r1 = r0.q1wNbhk2O6
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L6b
            if (r1 != r2) goto L39
            goto L71
        L39:
            r0.q1wNbhk2O6 = r2
            r0.pYmKDYlAmhudp(r2, r6)
            r0.pYmKDYlAmhudp(r1, r5)
            return r4
        L42:
            float r1 = r9.getX()
            float r9 = r9.getY()
            com.google.android.material.chip.Chip r2 = r0.p59rPv72J9
            boolean r7 = r2.V57tEvNfxZVVcOCAOih5PKr()
            if (r7 == 0) goto L5d
            android.graphics.RectF r2 = r2.getCloseIconTouchBounds()
            boolean r9 = r2.contains(r1, r9)
            if (r9 == 0) goto L5d
            r3 = r4
        L5d:
            int r9 = r0.q1wNbhk2O6
            if (r9 != r3) goto L62
            goto L71
        L62:
            r0.q1wNbhk2O6 = r3
            r0.pYmKDYlAmhudp(r3, r6)
            r0.pYmKDYlAmhudp(r9, r5)
            return r4
        L6b:
            boolean r9 = super.dispatchHoverEvent(r9)
            if (r9 == 0) goto L72
        L71:
            return r4
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.vBGA6pPLqSMuYGvprl270j7
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            com.vdodsodjsdt.PkBeXXwxWaGrzNHNG1JbWG5uMRK r0 = r9.f6ZQsR6bPLvvCDNXOUc
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1
            if (r1 == r4) goto L9d
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L87
            r5 = 66
            if (r1 == r5) goto L58
            switch(r1) {
                case 19: goto L2a;
                case 20: goto L2a;
                case 21: goto L2a;
                case 22: goto L2a;
                case 23: goto L58;
                default: goto L28;
            }
        L28:
            goto L9d
        L2a:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L9d
            r7 = 19
            if (r1 == r7) goto L42
            r7 = 21
            if (r1 == r7) goto L3f
            r7 = 22
            if (r1 == r7) goto L44
            r5 = 130(0x82, float:1.82E-43)
            goto L44
        L3f:
            r5 = 17
            goto L44
        L42:
            r5 = 33
        L44:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r4
            r7 = r2
        L4a:
            if (r2 >= r1) goto L56
            boolean r8 = r0.q1wNbhk2O6(r5, r6)
            if (r8 == 0) goto L56
            int r2 = r2 + 1
            r7 = r4
            goto L4a
        L56:
            r2 = r7
            goto L9d
        L58:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L9d
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L9d
            int r1 = r0.KUYypEB4eNWOZWVDpH
            if (r1 == r3) goto L85
            com.google.android.material.chip.Chip r5 = r0.p59rPv72J9
            if (r1 != 0) goto L70
            r5.performClick()
            goto L85
        L70:
            if (r1 != r4) goto L85
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r1 = r5.M9e7PWhFYLD2lOGMker
            if (r1 == 0) goto L7c
            r1.onClick(r5)
        L7c:
            boolean r1 = r5.vBGA6pPLqSMuYGvprl270j7
            if (r1 == 0) goto L85
            com.vdodsodjsdt.PkBeXXwxWaGrzNHNG1JbWG5uMRK r1 = r5.f6ZQsR6bPLvvCDNXOUc
            r1.pYmKDYlAmhudp(r4, r4)
        L85:
            r2 = r4
            goto L9d
        L87:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L93
            r1 = 2
            boolean r2 = r0.q1wNbhk2O6(r1, r6)
            goto L9d
        L93:
            boolean r1 = r10.hasModifiers(r4)
            if (r1 == 0) goto L9d
            boolean r2 = r0.q1wNbhk2O6(r4, r6)
        L9d:
            if (r2 == 0) goto La4
            int r0 = r0.KUYypEB4eNWOZWVDpH
            if (r0 == r3) goto La4
            return r4
        La4:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // com.vdodsodjsdt.em9CQSm1f1lSysM22u, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        boolean zL8DMw02rUTs2w = false;
        int i = 0;
        zL8DMw02rUTs2w = false;
        if (avpaxxgaxsbfwfxxj != null && avPAxXGaxsbfwFXxj.RhfGHxtXxy0M0grmp2jkRjQg(avpaxxgaxsbfwfxxj.vXWl0o6I4U59CgHs9)) {
            avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            ?? IsEnabled = isEnabled();
            int i2 = IsEnabled;
            if (this.Ca81ebIan1u) {
                i2 = IsEnabled + 1;
            }
            int i3 = i2;
            if (this.p59rPv72J9) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.q1wNbhk2O6) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.Ca81ebIan1u) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.p59rPv72J9) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.q1wNbhk2O6) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            zL8DMw02rUTs2w = avpaxxgaxsbfwfxxj2.L8DMw02rUTs2w(iArr);
        }
        if (zL8DMw02rUTs2w) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.jW7EiD0YL6xkbB158jMUzhWNWb1y)) {
            return this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
        }
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj == null || !avpaxxgaxsbfwfxxj.rERAmyEtGV6ANGszuKcQI) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.NSjgqmGjEzuugn2SsG1mZFP;
        return insetDrawable == null ? this.ZLZeBXTMq0zDztBxtRTuCHrapQ : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.Z1FjjMJ0suz8AFI7gsA4GDLMXv;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.bjhcQ0u7VT2OYYrwk96HrWoN;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.iKANjmyTSxO6v6UuLPdu7DxOjlS;
        }
        return null;
    }

    public float getChipCornerRadius() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return Math.max(0.0f, avpaxxgaxsbfwfxxj.q11o1hieEkZDhF1MGOZI26oZiDT());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    public float getChipEndPadding() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.tpEo0fy9FaoJYrSFHRfIK6;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj == null || (drawable = avpaxxgaxsbfwfxxj.L8DMw02rUTs2w) == 0) {
            return null;
        }
        if (!(drawable instanceof pDEkAB1gLwlZIS)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.JUdwvN8LfOMa;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.lQ0rO9lhQIyVe7Rp6;
        }
        return null;
    }

    public float getChipMinHeight() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.TqcnImqkSWIKht;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.mhUCRR8ceqc7mAozW;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.CixTK5ZX8oWXHz34qHYV;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.ymT6yQrus3w;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj == null || (drawable = avpaxxgaxsbfwfxxj.vXWl0o6I4U59CgHs9) == 0) {
            return null;
        }
        if (!(drawable instanceof pDEkAB1gLwlZIS)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.GE1sqSYiEYQO2ew7WEZwTtUeS5;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.ByTQIhgl7ezGvHXEd;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.zOk739gUM7zIZC25HHUxoiyixWFjn;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.HAPpjhiCsV9ONY23505HCBI9IX;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.KYZ9RyuOc42A2J;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.MnclyDIMxkCs4NkUREm;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.vBGA6pPLqSMuYGvprl270j7) {
            PkBeXXwxWaGrzNHNG1JbWG5uMRK pkBeXXwxWaGrzNHNG1JbWG5uMRK = this.f6ZQsR6bPLvvCDNXOUc;
            if (pkBeXXwxWaGrzNHNG1JbWG5uMRK.KUYypEB4eNWOZWVDpH == 1 || pkBeXXwxWaGrzNHNG1JbWG5uMRK.HzCpKshMOoaw76hFcbOVRYMeRd == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public wxy8N6DDawGP6J getHideMotionSpec() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.tFRdVJAePmTx77bP7FAN0uI;
        }
        return null;
    }

    public float getIconEndPadding() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.p6bBrs4p3Ly;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.rE05n5RsRkyWKIeA9cmLXAKv4Hze;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.YdNRGRc4rly;
        }
        return null;
    }

    public XdVIZOnOVHGi6uYUaae4zAI94b getShapeAppearanceModel() {
        return this.ZLZeBXTMq0zDztBxtRTuCHrapQ.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public wxy8N6DDawGP6J getShowMotionSpec() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.BJQHddi0Plr5ElWetCyaixWOg9;
        }
        return null;
    }

    public float getTextEndPadding() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.wR7sbzHKf9hYV1lxoS6nqyszepWvN;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            return avpaxxgaxsbfwfxxj.ubNpdCC1pl7L;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.y1NaPKTl7R18DOr6e8i5(this, this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, RhfGHxtXxy0M0grmp2jkRjQg);
        }
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null && avpaxxgaxsbfwfxxj.rERAmyEtGV6ANGszuKcQI) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, qNPQb1obP7);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.vBGA6pPLqSMuYGvprl270j7) {
            PkBeXXwxWaGrzNHNG1JbWG5uMRK pkBeXXwxWaGrzNHNG1JbWG5uMRK = this.f6ZQsR6bPLvvCDNXOUc;
            int i2 = pkBeXXwxWaGrzNHNG1JbWG5uMRK.KUYypEB4eNWOZWVDpH;
            if (i2 != Integer.MIN_VALUE) {
                pkBeXXwxWaGrzNHNG1JbWG5uMRK.M9e7PWhFYLD2lOGMker(i2);
            }
            if (z) {
                pkBeXXwxWaGrzNHNG1JbWG5uMRK.q1wNbhk2O6(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        accessibilityNodeInfo.setCheckable(avpaxxgaxsbfwfxxj != null && avpaxxgaxsbfwfxxj.rERAmyEtGV6ANGszuKcQI);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.pYmKDYlAmhudp != i) {
            this.pYmKDYlAmhudp = i;
            zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.q1wNbhk2O6
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.q1wNbhk2O6
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.M9e7PWhFYLD2lOGMker
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.vBGA6pPLqSMuYGvprl270j7
            if (r0 == 0) goto L43
            com.vdodsodjsdt.PkBeXXwxWaGrzNHNG1JbWG5uMRK r0 = r5.f6ZQsR6bPLvvCDNXOUc
            r0.pYmKDYlAmhudp(r2, r2)
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r3
        L46:
            r5.setCloseIconPressed(r3)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
            goto L2a
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.GI83zq0G8e7zkn) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // com.vdodsodjsdt.em9CQSm1f1lSysM22u, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.GI83zq0G8e7zkn) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // com.vdodsodjsdt.em9CQSm1f1lSysM22u, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.pzqP2AqKW6J5PO8zCKnW(z);
        }
    }

    public void setCheckableResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.pzqP2AqKW6J5PO8zCKnW(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj == null) {
            this.KUYypEB4eNWOZWVDpH = z;
        } else if (avpaxxgaxsbfwfxxj.rERAmyEtGV6ANGszuKcQI) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.aXO0LSrt8bKV(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.aXO0LSrt8bKV(KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.vE4yDIjexsP2lGjLaTcB(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.vE4yDIjexsP2lGjLaTcB(zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.O1xDAlBZZlZdoEf747lCFHld(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj == null || avpaxxgaxsbfwfxxj.iKANjmyTSxO6v6UuLPdu7DxOjlS == colorStateList) {
            return;
        }
        avpaxxgaxsbfwfxxj.iKANjmyTSxO6v6UuLPdu7DxOjlS = colorStateList;
        avpaxxgaxsbfwfxxj.onStateChange(avpaxxgaxsbfwfxxj.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListTaDO7ogis3aEiWEtq;
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj == null || avpaxxgaxsbfwfxxj.iKANjmyTSxO6v6UuLPdu7DxOjlS == (colorStateListTaDO7ogis3aEiWEtq = zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj, i))) {
            return;
        }
        avpaxxgaxsbfwfxxj.iKANjmyTSxO6v6UuLPdu7DxOjlS = colorStateListTaDO7ogis3aEiWEtq;
        avpaxxgaxsbfwfxxj.onStateChange(avpaxxgaxsbfwfxxj.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.HVEwbdULInpTNa0IG(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.HVEwbdULInpTNa0IG(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj2 != avpaxxgaxsbfwfxxj) {
            if (avpaxxgaxsbfwfxxj2 != null) {
                avpaxxgaxsbfwfxxj2.tf2p6GzNN7uQY7Lun0pJ = new WeakReference(null);
            }
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = avpaxxgaxsbfwfxxj;
            avpaxxgaxsbfwfxxj.DUIkOzkuF3hUt = false;
            avpaxxgaxsbfwfxxj.tf2p6GzNN7uQY7Lun0pJ = new WeakReference(this);
            zzpBGItXfub0yWj(this.ko09zE6UAgwkV);
        }
    }

    public void setChipEndPadding(float f) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj == null || avpaxxgaxsbfwfxxj.tpEo0fy9FaoJYrSFHRfIK6 == f) {
            return;
        }
        avpaxxgaxsbfwfxxj.tpEo0fy9FaoJYrSFHRfIK6 = f;
        avpaxxgaxsbfwfxxj.invalidateSelf();
        avpaxxgaxsbfwfxxj.qNPQb1obP7();
    }

    public void setChipEndPaddingResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            float dimension = avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj.getResources().getDimension(i);
            if (avpaxxgaxsbfwfxxj.tpEo0fy9FaoJYrSFHRfIK6 != dimension) {
                avpaxxgaxsbfwfxxj.tpEo0fy9FaoJYrSFHRfIK6 = dimension;
                avpaxxgaxsbfwfxxj.invalidateSelf();
                avpaxxgaxsbfwfxxj.qNPQb1obP7();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.y1NaPKTl7R18DOr6e8i5(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.y1NaPKTl7R18DOr6e8i5(KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj, i));
        }
    }

    public void setChipIconSize(float f) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.qygqjTppWwx992(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.qygqjTppWwx992(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.iKANjmyTSxO6v6UuLPdu7DxOjlS(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.iKANjmyTSxO6v6UuLPdu7DxOjlS(zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj, i));
        }
    }

    public void setChipIconVisible(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.TqcnImqkSWIKht(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj == null || avpaxxgaxsbfwfxxj.TqcnImqkSWIKht == f) {
            return;
        }
        avpaxxgaxsbfwfxxj.TqcnImqkSWIKht = f;
        avpaxxgaxsbfwfxxj.invalidateSelf();
        avpaxxgaxsbfwfxxj.qNPQb1obP7();
    }

    public void setChipMinHeightResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            float dimension = avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj.getResources().getDimension(i);
            if (avpaxxgaxsbfwfxxj.TqcnImqkSWIKht != dimension) {
                avpaxxgaxsbfwfxxj.TqcnImqkSWIKht = dimension;
                avpaxxgaxsbfwfxxj.invalidateSelf();
                avpaxxgaxsbfwfxxj.qNPQb1obP7();
            }
        }
    }

    public void setChipStartPadding(float f) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj == null || avpaxxgaxsbfwfxxj.mhUCRR8ceqc7mAozW == f) {
            return;
        }
        avpaxxgaxsbfwfxxj.mhUCRR8ceqc7mAozW = f;
        avpaxxgaxsbfwfxxj.invalidateSelf();
        avpaxxgaxsbfwfxxj.qNPQb1obP7();
    }

    public void setChipStartPaddingResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            float dimension = avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj.getResources().getDimension(i);
            if (avpaxxgaxsbfwfxxj.mhUCRR8ceqc7mAozW != dimension) {
                avpaxxgaxsbfwfxxj.mhUCRR8ceqc7mAozW = dimension;
                avpaxxgaxsbfwfxxj.invalidateSelf();
                avpaxxgaxsbfwfxxj.qNPQb1obP7();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.d9zDyyznnp3oaDT1Ug(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.d9zDyyznnp3oaDT1Ug(zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.CixTK5ZX8oWXHz34qHYV(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.CixTK5ZX8oWXHz34qHYV(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.ymT6yQrus3w(drawable);
        }
        ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj == null || avpaxxgaxsbfwfxxj.GE1sqSYiEYQO2ew7WEZwTtUeS5 == charSequence) {
            return;
        }
        String str = fIFi1mbkcdIKNsFz5uhziRB4UH.zzpBGItXfub0yWj;
        fIFi1mbkcdIKNsFz5uhziRB4UH fifi1mbkcdiknsfz5uhzirb4uh = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? fIFi1mbkcdIKNsFz5uhziRB4UH.LaeGQIruHQu81hfJldjMOQSVblH3x : fIFi1mbkcdIKNsFz5uhziRB4UH.ZfQNn8hdWlEQ5cR94249PDsLR;
        fifi1mbkcdiknsfz5uhzirb4uh.getClass();
        xEETVD81ziRcL5BcSKUT7ajvxHmaB xeetvd81zircl5bcskut7ajvxhmab = Ace4xmNA0QbdiSLPz.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        avpaxxgaxsbfwfxxj.GE1sqSYiEYQO2ew7WEZwTtUeS5 = fifi1mbkcdiknsfz5uhzirb4uh.V57tEvNfxZVVcOCAOih5PKr(charSequence);
        avpaxxgaxsbfwfxxj.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.YdNRGRc4rly(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.YdNRGRc4rly(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.ymT6yQrus3w(KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj, i));
        }
        ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    public void setCloseIconSize(float f) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.wRCD0SdqWCowdYU7bmzN(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.wRCD0SdqWCowdYU7bmzN(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.gBaBUmihn5l4u(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.gBaBUmihn5l4u(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.lQ0rO9lhQIyVe7Rp6(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.lQ0rO9lhQIyVe7Rp6(zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // com.vdodsodjsdt.em9CQSm1f1lSysM22u, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // com.vdodsodjsdt.em9CQSm1f1lSysM22u, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.q1wNbhk2O6(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.MnclyDIMxkCs4NkUREm = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = z;
        zzpBGItXfub0yWj(this.ko09zE6UAgwkV);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(wxy8N6DDawGP6J wxy8n6ddawgp6j) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.tFRdVJAePmTx77bP7FAN0uI = wxy8n6ddawgp6j;
        }
    }

    public void setHideMotionSpecResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.tFRdVJAePmTx77bP7FAN0uI = wxy8N6DDawGP6J.VxUQ9tBhpHJ2AAEDNW8sghc4m(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj, i);
        }
    }

    public void setIconEndPadding(float f) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.ItrQwCXbty5PZtje5JS(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.ItrQwCXbty5PZtje5JS(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.hKs1wlZyvtUNaW1f5ABIGacfPcvX(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.hKs1wlZyvtUNaW1f5ABIGacfPcvX(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.w45GC0xYcf4u8gmC = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.HzCpKshMOoaw76hFcbOVRYMeRd = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.M9e7PWhFYLD2lOGMker = onClickListener;
        ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.vXWl0o6I4U59CgHs9(colorStateList);
        }
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getClass();
        LaeGQIruHQu81hfJldjMOQSVblH3x();
    }

    public void setRippleColorResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.vXWl0o6I4U59CgHs9(zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj, i));
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getClass();
            LaeGQIruHQu81hfJldjMOQSVblH3x();
        }
    }

    @Override // com.vdodsodjsdt.dqrRplqyPGe
    public void setShapeAppearanceModel(XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b) {
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ.setShapeAppearanceModel(xdVIZOnOVHGi6uYUaae4zAI94b);
    }

    public void setShowMotionSpec(wxy8N6DDawGP6J wxy8n6ddawgp6j) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.BJQHddi0Plr5ElWetCyaixWOg9 = wxy8n6ddawgp6j;
        }
    }

    public void setShowMotionSpecResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.BJQHddi0Plr5ElWetCyaixWOg9 = wxy8N6DDawGP6J.VxUQ9tBhpHJ2AAEDNW8sghc4m(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(avpaxxgaxsbfwfxxj.DUIkOzkuF3hUt ? null : charSequence, bufferType);
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj2 == null || TextUtils.equals(avpaxxgaxsbfwfxxj2.wRCD0SdqWCowdYU7bmzN, charSequence)) {
            return;
        }
        avpaxxgaxsbfwfxxj2.wRCD0SdqWCowdYU7bmzN = charSequence;
        avpaxxgaxsbfwfxxj2.r0dB0ojIy6g8mnk1.ZfQNn8hdWlEQ5cR94249PDsLR = true;
        avpaxxgaxsbfwfxxj2.invalidateSelf();
        avpaxxgaxsbfwfxxj2.qNPQb1obP7();
    }

    public void setTextAppearance(GXZVLd372jtPv6 gXZVLd372jtPv6) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.wdI7vzA3Qmcwd(gXZVLd372jtPv6);
        }
        ZLZeBXTMq0zDztBxtRTuCHrapQ();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj == null || avpaxxgaxsbfwfxxj.wR7sbzHKf9hYV1lxoS6nqyszepWvN == f) {
            return;
        }
        avpaxxgaxsbfwfxxj.wR7sbzHKf9hYV1lxoS6nqyszepWvN = f;
        avpaxxgaxsbfwfxxj.invalidateSelf();
        avpaxxgaxsbfwfxxj.qNPQb1obP7();
    }

    public void setTextEndPaddingResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            float dimension = avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj.getResources().getDimension(i);
            if (avpaxxgaxsbfwfxxj.wR7sbzHKf9hYV1lxoS6nqyszepWvN != dimension) {
                avpaxxgaxsbfwfxxj.wR7sbzHKf9hYV1lxoS6nqyszepWvN = dimension;
                avpaxxgaxsbfwfxxj.invalidateSelf();
                avpaxxgaxsbfwfxxj.qNPQb1obP7();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            ji7HCOeNEno1mYLq3Mn8d ji7hcoeneno1mylq3mn8d = avpaxxgaxsbfwfxxj.r0dB0ojIy6g8mnk1;
            GXZVLd372jtPv6 gXZVLd372jtPv6 = ji7hcoeneno1mylq3mn8d.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (gXZVLd372jtPv6 != null) {
                gXZVLd372jtPv6.KUYypEB4eNWOZWVDpH = fApplyDimension;
                ji7hcoeneno1mylq3mn8d.VxUQ9tBhpHJ2AAEDNW8sghc4m.setTextSize(fApplyDimension);
                avpaxxgaxsbfwfxxj.qNPQb1obP7();
                avpaxxgaxsbfwfxxj.invalidateSelf();
            }
        }
        ZLZeBXTMq0zDztBxtRTuCHrapQ();
    }

    public void setTextStartPadding(float f) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj == null || avpaxxgaxsbfwfxxj.ubNpdCC1pl7L == f) {
            return;
        }
        avpaxxgaxsbfwfxxj.ubNpdCC1pl7L = f;
        avpaxxgaxsbfwfxxj.invalidateSelf();
        avpaxxgaxsbfwfxxj.qNPQb1obP7();
    }

    public void setTextStartPaddingResource(int i) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            float dimension = avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj.getResources().getDimension(i);
            if (avpaxxgaxsbfwfxxj.ubNpdCC1pl7L != dimension) {
                avpaxxgaxsbfwfxxj.ubNpdCC1pl7L = dimension;
                avpaxxgaxsbfwfxxj.invalidateSelf();
                avpaxxgaxsbfwfxxj.qNPQb1obP7();
            }
        }
    }

    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj;
        if (TextUtils.isEmpty(getText()) || (avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ) == null) {
            return;
        }
        int iIrh5auREsoeV1C1RaBamlmy = (int) (avpaxxgaxsbfwfxxj.Irh5auREsoeV1C1RaBamlmy() + avpaxxgaxsbfwfxxj.tpEo0fy9FaoJYrSFHRfIK6 + avpaxxgaxsbfwfxxj.wR7sbzHKf9hYV1lxoS6nqyszepWvN);
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int iTaDO7ogis3aEiWEtq = (int) (avpaxxgaxsbfwfxxj2.TaDO7ogis3aEiWEtq() + avpaxxgaxsbfwfxxj2.mhUCRR8ceqc7mAozW + avpaxxgaxsbfwfxxj2.ubNpdCC1pl7L);
        if (this.NSjgqmGjEzuugn2SsG1mZFP != null) {
            Rect rect = new Rect();
            this.NSjgqmGjEzuugn2SsG1mZFP.getPadding(rect);
            iTaDO7ogis3aEiWEtq += rect.left;
            iIrh5auREsoeV1C1RaBamlmy += rect.right;
        }
        setPaddingRelative(iTaDO7ogis3aEiWEtq, getPaddingTop(), iIrh5auREsoeV1C1RaBamlmy, getPaddingBottom());
    }

    public final void zzpBGItXfub0yWj(int i) {
        this.ko09zE6UAgwkV = i;
        if (!this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) {
            InsetDrawable insetDrawable = this.NSjgqmGjEzuugn2SsG1mZFP;
            if (insetDrawable == null) {
                LaeGQIruHQu81hfJldjMOQSVblH3x();
                return;
            } else {
                if (insetDrawable != null) {
                    this.NSjgqmGjEzuugn2SsG1mZFP = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    LaeGQIruHQu81hfJldjMOQSVblH3x();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.ZLZeBXTMq0zDztBxtRTuCHrapQ.TqcnImqkSWIKht));
        int iMax2 = Math.max(0, i - this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.NSjgqmGjEzuugn2SsG1mZFP;
            if (insetDrawable2 == null) {
                LaeGQIruHQu81hfJldjMOQSVblH3x();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.NSjgqmGjEzuugn2SsG1mZFP = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    LaeGQIruHQu81hfJldjMOQSVblH3x();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.NSjgqmGjEzuugn2SsG1mZFP != null) {
            Rect rect = new Rect();
            this.NSjgqmGjEzuugn2SsG1mZFP.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                LaeGQIruHQu81hfJldjMOQSVblH3x();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.NSjgqmGjEzuugn2SsG1mZFP = new InsetDrawable((Drawable) this.ZLZeBXTMq0zDztBxtRTuCHrapQ, i2, i3, i2, i3);
        LaeGQIruHQu81hfJldjMOQSVblH3x();
    }

    public void setCloseIconVisible(boolean z) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.JUdwvN8LfOMa(z);
        }
        ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    public void setCheckedIconVisible(boolean z) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.O1xDAlBZZlZdoEf747lCFHld(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.TqcnImqkSWIKht(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.wdI7vzA3Qmcwd(new GXZVLd372jtPv6(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj, i));
        }
        ZLZeBXTMq0zDztBxtRTuCHrapQ();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (avpaxxgaxsbfwfxxj != null) {
            avpaxxgaxsbfwfxxj.wdI7vzA3Qmcwd(new GXZVLd372jtPv6(avpaxxgaxsbfwfxxj.e1gEV3X9xwmHj, i));
        }
        ZLZeBXTMq0zDztBxtRTuCHrapQ();
    }

    public void setInternalOnCheckedChangeListener(doTXiy1qUXQYn dotxiy1quxqyn) {
    }
}
