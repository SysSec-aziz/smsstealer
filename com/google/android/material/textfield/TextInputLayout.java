package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.vdodsodjsdt.Ace4xmNA0QbdiSLPz;
import com.vdodsodjsdt.EQz8nVyVxmIrHN6fNCQWutFG0b30O;
import com.vdodsodjsdt.EzcAu1qMbZ8VCMhJVRO7;
import com.vdodsodjsdt.F44whnLsbQ;
import com.vdodsodjsdt.FLWIoSaHb1q8TqFvEBgPyRGrzvi6;
import com.vdodsodjsdt.GXZVLd372jtPv6;
import com.vdodsodjsdt.H1cfFcamW7T7;
import com.vdodsodjsdt.I7ekItPvKv4lN;
import com.vdodsodjsdt.IN79WcIk5xB4t0GjRT43qPLs5;
import com.vdodsodjsdt.Jc01di1Hsv;
import com.vdodsodjsdt.KfeOQNOupsCg6878zi4e;
import com.vdodsodjsdt.MKLZoKw17XA;
import com.vdodsodjsdt.NrjuzzioPqfttNRptBDpZDzSYUrcM;
import com.vdodsodjsdt.ORBZw1rSo0ao2WcPyTXuENVqH;
import com.vdodsodjsdt.PGobtLpyfPC4TCnlq740;
import com.vdodsodjsdt.PyYsF2FE67iANgZ0fDkVtNG5uhA;
import com.vdodsodjsdt.RfOSIaL6qUBGKJY9MSCBP5ba;
import com.vdodsodjsdt.Skgk8FYn8b4TvRiBOsElZw4XkNLhQ;
import com.vdodsodjsdt.UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3;
import com.vdodsodjsdt.UZs7drcmMrcfQALnoIa;
import com.vdodsodjsdt.UtURWB5bbAd9;
import com.vdodsodjsdt.VGwRvGhOWf9duTP8Dxb9PtsLAe1z;
import com.vdodsodjsdt.W4Qt2NT8WTRWgps7H7wRotB1F;
import com.vdodsodjsdt.WBbGwHQ7q5Zp0OIijyR;
import com.vdodsodjsdt.XdVIZOnOVHGi6uYUaae4zAI94b;
import com.vdodsodjsdt.ZOzTbMJxsw;
import com.vdodsodjsdt.ZP4eo8ej66W7kmHDyh;
import com.vdodsodjsdt.Zx36ytjSPbRH1S3UCiHxPrB8TD;
import com.vdodsodjsdt.aMdFkGJAdbLdAI00ZfKC7DaJw3k2;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.eswEmxJomeZU;
import com.vdodsodjsdt.eulR6k1HTLasRolDlw0q9CWFl7ak;
import com.vdodsodjsdt.fIFi1mbkcdIKNsFz5uhziRB4UH;
import com.vdodsodjsdt.hEYFkY0Pa5rIEBwb4kWhO0E74Dn;
import com.vdodsodjsdt.hbsUcFELqptC4ZZnom4xRs0eGoz;
import com.vdodsodjsdt.jFJXX88X4vgYX5CG85l5EyqW8AAH;
import com.vdodsodjsdt.lPYuKA1O6JC;
import com.vdodsodjsdt.lUqBmUbL53IL3VMM8GT8;
import com.vdodsodjsdt.lzuj2xiOHpZAdsoZ1vJvxA;
import com.vdodsodjsdt.mlFPz0SY9o7oN;
import com.vdodsodjsdt.noQ5wqDlpHr6qq0OY4sYdJyOQ;
import com.vdodsodjsdt.ojJdkROPjZ;
import com.vdodsodjsdt.p9IyQAUniR;
import com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao;
import com.vdodsodjsdt.t7eI2PwFOa;
import com.vdodsodjsdt.uGIIbcq05l2iYyEa2AaeeYA;
import com.vdodsodjsdt.uLKh0h5Zrkfub;
import com.vdodsodjsdt.xEETVD81ziRcL5BcSKUT7ajvxHmaB;
import com.vdodsodjsdt.xPkmmA8xByE6WyLiH;
import com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8;
import com.vdodsodjsdt.xhZAU2F7Zp5;
import com.vdodsodjsdt.zonOxHotd3BwAPJcwqr6I6uQNngg4;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] PfK8qHOJoCLG = {new int[]{R.attr.state_pressed}, new int[0]};
    public int AFOcXGdvoTMuqwiG8tD;
    public int BDoqAMf0rlMRAnVghjC4qjG;
    public ColorDrawable BJQHddi0Plr5ElWetCyaixWOg9;
    public ColorStateList ByTQIhgl7ezGvHXEd;
    public int Ca81ebIan1u;
    public EQz8nVyVxmIrHN6fNCQWutFG0b30O CixTK5ZX8oWXHz34qHYV;
    public boolean DNP7yXLsojH0rPMHr8fUY14M;
    public boolean G479XgNG9rK8jPPbSXr;
    public final RectF GE1sqSYiEYQO2ew7WEZwTtUeS5;
    public int GI83zq0G8e7zkn;
    public ColorDrawable H2VFYNJEVGAX;
    public int HAPpjhiCsV9ONY23505HCBI9IX;
    public CharSequence HVEwbdULInpTNa0IG;
    public int HzCpKshMOoaw76hFcbOVRYMeRd;
    public lzuj2xiOHpZAdsoZ1vJvxA Irh5auREsoeV1C1RaBamlmy;
    public int ItrQwCXbty5PZtje5JS;
    public int JUdwvN8LfOMa;
    public boolean KMiA9Sqk243eQkFNNoS;
    public int KUYypEB4eNWOZWVDpH;
    public final Rect KYZ9RyuOc42A2J;
    public int L8DMw02rUTs2w;
    public final eswEmxJomeZU LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int M9e7PWhFYLD2lOGMker;
    public CharSequence NSjgqmGjEzuugn2SsG1mZFP;
    public boolean O1xDAlBZZlZdoEf747lCFHld;
    public boolean Pf1HsU8AK92buCoUaexm5AC;
    public Zx36ytjSPbRH1S3UCiHxPrB8TD RhfGHxtXxy0M0grmp2jkRjQg;
    public ColorStateList SuB3hEmTmbbRGAhtvOOmfKEon;
    public boolean TaDO7ogis3aEiWEtq;
    public StateListDrawable TqcnImqkSWIKht;
    public final FrameLayout V57tEvNfxZVVcOCAOih5PKr;
    public int VOvSEdhaZyc0oOGQ8;
    public XdVIZOnOVHGi6uYUaae4zAI94b YdNRGRc4rly;
    public int Z1FjjMJ0suz8AFI7gsA4GDLMXv;
    public EditText ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final xhZAU2F7Zp5 ZfQNn8hdWlEQ5cR94249PDsLR;
    public ColorStateList aXO0LSrt8bKV;
    public final LinkedHashSet bjhcQ0u7VT2OYYrwk96HrWoN;
    public boolean d9zDyyznnp3oaDT1Ug;
    public int e1gEV3X9xwmHj;
    public int f6ZQsR6bPLvvCDNXOUc;
    public final int gBaBUmihn5l4u;
    public boolean h2b7InwIaORKN91X7whfQh4;
    public boolean h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public int hKs1wlZyvtUNaW1f5ABIGacfPcvX;
    public EQz8nVyVxmIrHN6fNCQWutFG0b30O iKANjmyTSxO6v6UuLPdu7DxOjlS;
    public int jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public lzuj2xiOHpZAdsoZ1vJvxA ko09zE6UAgwkV;
    public int lQ0rO9lhQIyVe7Rp6;
    public int lxWWbfAOLs4jWzd7PSIiIJ;
    public Drawable mhUCRR8ceqc7mAozW;
    public boolean nNOZCSz1a7S;
    public boolean p59rPv72J9;
    public ColorStateList p6bBrs4p3Ly;
    public W4Qt2NT8WTRWgps7H7wRotB1F pYmKDYlAmhudp;
    public ColorStateList pzqP2AqKW6J5PO8zCKnW;
    public ColorStateList q11o1hieEkZDhF1MGOZI26oZiDT;
    public final uGIIbcq05l2iYyEa2AaeeYA q1wNbhk2O6;
    public Zx36ytjSPbRH1S3UCiHxPrB8TD qNPQb1obP7;
    public EQz8nVyVxmIrHN6fNCQWutFG0b30O qygqjTppWwx992;
    public final noQ5wqDlpHr6qq0OY4sYdJyOQ r0dB0ojIy6g8mnk1;
    public ColorStateList rE05n5RsRkyWKIeA9cmLXAKv4Hze;
    public Typeface rERAmyEtGV6ANGszuKcQI;
    public int tFRdVJAePmTx77bP7FAN0uI;
    public int tpEo0fy9FaoJYrSFHRfIK6;
    public int ubNpdCC1pl7L;
    public CharSequence vBGA6pPLqSMuYGvprl270j7;
    public ColorStateList vE4yDIjexsP2lGjLaTcB;
    public int vXWl0o6I4U59CgHs9;
    public int w0Wu95l8dVNw5rZMRu;
    public int wR7sbzHKf9hYV1lxoS6nqyszepWvN;
    public boolean wRCD0SdqWCowdYU7bmzN;
    public int wdI7vzA3Qmcwd;
    public boolean y1NaPKTl7R18DOr6e8i5;
    public EQz8nVyVxmIrHN6fNCQWutFG0b30O ymT6yQrus3w;
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final Rect zOk739gUM7zIZC25HHUxoiyixWFjn;
    public ValueAnimator zyiF0wv9HozxGOIDt8PvVp;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(sGipz63rTUmSj3uFDvOtzihao.bjhcQ0u7VT2OYYrwk96HrWoN(context, attributeSet, com.vdodsodjsdt.R.attr.textInputStyle, com.vdodsodjsdt.R.style.Widget_Design_TextInputLayout), attributeSet, com.vdodsodjsdt.R.attr.textInputStyle);
        this.GI83zq0G8e7zkn = -1;
        this.M9e7PWhFYLD2lOGMker = -1;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = -1;
        this.KUYypEB4eNWOZWVDpH = -1;
        this.q1wNbhk2O6 = new uGIIbcq05l2iYyEa2AaeeYA(this);
        this.pYmKDYlAmhudp = new ojJdkROPjZ(12);
        this.KYZ9RyuOc42A2J = new Rect();
        this.zOk739gUM7zIZC25HHUxoiyixWFjn = new Rect();
        this.GE1sqSYiEYQO2ew7WEZwTtUeS5 = new RectF();
        this.bjhcQ0u7VT2OYYrwk96HrWoN = new LinkedHashSet();
        noQ5wqDlpHr6qq0OY4sYdJyOQ noq5wqdlphr6qq0oy4sydjyoq = new noQ5wqDlpHr6qq0OY4sYdJyOQ(this);
        this.r0dB0ojIy6g8mnk1 = noq5wqdlphr6qq0oy4sydjyoq;
        this.nNOZCSz1a7S = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.V57tEvNfxZVVcOCAOih5PKr = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = mlFPz0SY9o7oN.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        noq5wqdlphr6qq0oy4sydjyoq.L8DMw02rUTs2w = linearInterpolator;
        noq5wqdlphr6qq0oy4sydjyoq.M9e7PWhFYLD2lOGMker(false);
        noq5wqdlphr6qq0oy4sydjyoq.gBaBUmihn5l4u = linearInterpolator;
        noq5wqdlphr6qq0oy4sydjyoq.M9e7PWhFYLD2lOGMker(false);
        if (noq5wqdlphr6qq0oy4sydjyoq.ZLZeBXTMq0zDztBxtRTuCHrapQ != 8388659) {
            noq5wqdlphr6qq0oy4sydjyoq.ZLZeBXTMq0zDztBxtRTuCHrapQ = 8388659;
            noq5wqdlphr6qq0oy4sydjyoq.M9e7PWhFYLD2lOGMker(false);
        }
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.LaeGQIruHQu81hfJldjMOQSVblH3x(context2, attributeSet, com.vdodsodjsdt.R.attr.textInputStyle, com.vdodsodjsdt.R.style.Widget_Design_TextInputLayout);
        int[] iArr = PGobtLpyfPC4TCnlq740.aXO0LSrt8bKV;
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.NSjgqmGjEzuugn2SsG1mZFP(context2, attributeSet, iArr, com.vdodsodjsdt.R.attr.textInputStyle, com.vdodsodjsdt.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.vdodsodjsdt.R.attr.textInputStyle, com.vdodsodjsdt.R.style.Widget_Design_TextInputLayout);
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM = new NrjuzzioPqfttNRptBDpZDzSYUrcM(context2, typedArrayObtainStyledAttributes);
        xhZAU2F7Zp5 xhzau2f7zp5 = new xhZAU2F7Zp5(this, nrjuzzioPqfttNRptBDpZDzSYUrcM);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = xhzau2f7zp5;
        this.O1xDAlBZZlZdoEf747lCFHld = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.Pf1HsU8AK92buCoUaexm5AC = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.G479XgNG9rK8jPPbSXr = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.YdNRGRc4rly = XdVIZOnOVHGi6uYUaae4zAI94b.zzpBGItXfub0yWj(context2, attributeSet, com.vdodsodjsdt.R.attr.textInputStyle, com.vdodsodjsdt.R.style.Widget_Design_TextInputLayout).VxUQ9tBhpHJ2AAEDNW8sghc4m();
        this.gBaBUmihn5l4u = context2.getResources().getDimensionPixelOffset(com.vdodsodjsdt.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.lQ0rO9lhQIyVe7Rp6 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = getResources().getDimensionPixelSize(com.vdodsodjsdt.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.ItrQwCXbty5PZtje5JS = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.vdodsodjsdt.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.hKs1wlZyvtUNaW1f5ABIGacfPcvX = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.vdodsodjsdt.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.JUdwvN8LfOMa = this.ItrQwCXbty5PZtje5JS;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        jFJXX88X4vgYX5CG85l5EyqW8AAH jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE = this.YdNRGRc4rly.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        if (dimension >= 0.0f) {
            jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.LaeGQIruHQu81hfJldjMOQSVblH3x = new ZOzTbMJxsw(dimension);
        }
        if (dimension2 >= 0.0f) {
            jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new ZOzTbMJxsw(dimension2);
        }
        if (dimension3 >= 0.0f) {
            jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.ZLZeBXTMq0zDztBxtRTuCHrapQ = new ZOzTbMJxsw(dimension3);
        }
        if (dimension4 >= 0.0f) {
            jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.NSjgqmGjEzuugn2SsG1mZFP = new ZOzTbMJxsw(dimension4);
        }
        this.YdNRGRc4rly = jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        ColorStateList colorStateListTaDO7ogis3aEiWEtq = F44whnLsbQ.TaDO7ogis3aEiWEtq(context2, nrjuzzioPqfttNRptBDpZDzSYUrcM, 7);
        if (colorStateListTaDO7ogis3aEiWEtq != null) {
            int defaultColor = colorStateListTaDO7ogis3aEiWEtq.getDefaultColor();
            this.tpEo0fy9FaoJYrSFHRfIK6 = defaultColor;
            this.wdI7vzA3Qmcwd = defaultColor;
            if (colorStateListTaDO7ogis3aEiWEtq.isStateful()) {
                this.e1gEV3X9xwmHj = colorStateListTaDO7ogis3aEiWEtq.getColorForState(new int[]{-16842910}, -1);
                this.AFOcXGdvoTMuqwiG8tD = colorStateListTaDO7ogis3aEiWEtq.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.BDoqAMf0rlMRAnVghjC4qjG = colorStateListTaDO7ogis3aEiWEtq.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.AFOcXGdvoTMuqwiG8tD = this.tpEo0fy9FaoJYrSFHRfIK6;
                ColorStateList colorStateListTaDO7ogis3aEiWEtq2 = zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq(context2, com.vdodsodjsdt.R.color.mtrl_filled_background_color);
                this.e1gEV3X9xwmHj = colorStateListTaDO7ogis3aEiWEtq2.getColorForState(new int[]{-16842910}, -1);
                this.BDoqAMf0rlMRAnVghjC4qjG = colorStateListTaDO7ogis3aEiWEtq2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.wdI7vzA3Qmcwd = 0;
            this.tpEo0fy9FaoJYrSFHRfIK6 = 0;
            this.e1gEV3X9xwmHj = 0;
            this.AFOcXGdvoTMuqwiG8tD = 0;
            this.BDoqAMf0rlMRAnVghjC4qjG = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListH3jnZRsdwYJfY9UhQCkbvWciwvFHv = nrjuzzioPqfttNRptBDpZDzSYUrcM.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(1);
            this.p6bBrs4p3Ly = colorStateListH3jnZRsdwYJfY9UhQCkbvWciwvFHv;
            this.rE05n5RsRkyWKIeA9cmLXAKv4Hze = colorStateListH3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        }
        ColorStateList colorStateListTaDO7ogis3aEiWEtq3 = F44whnLsbQ.TaDO7ogis3aEiWEtq(context2, nrjuzzioPqfttNRptBDpZDzSYUrcM, 14);
        this.HAPpjhiCsV9ONY23505HCBI9IX = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.ubNpdCC1pl7L = context2.getColor(com.vdodsodjsdt.R.color.mtrl_textinput_default_box_stroke_color);
        this.lxWWbfAOLs4jWzd7PSIiIJ = context2.getColor(com.vdodsodjsdt.R.color.mtrl_textinput_disabled_color);
        this.wR7sbzHKf9hYV1lxoS6nqyszepWvN = context2.getColor(com.vdodsodjsdt.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListTaDO7ogis3aEiWEtq3 != null) {
            setBoxStrokeColorStateList(colorStateListTaDO7ogis3aEiWEtq3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(F44whnLsbQ.TaDO7ogis3aEiWEtq(context2, nrjuzzioPqfttNRptBDpZDzSYUrcM, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(50, 0));
        }
        this.aXO0LSrt8bKV = nrjuzzioPqfttNRptBDpZDzSYUrcM.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(24);
        this.vE4yDIjexsP2lGjLaTcB = nrjuzzioPqfttNRptBDpZDzSYUrcM.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(57);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.f6ZQsR6bPLvvCDNXOUc = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.jW7EiD0YL6xkbB158jMUzhWNWb1y);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f6ZQsR6bPLvvCDNXOUc);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(nrjuzzioPqfttNRptBDpZDzSYUrcM.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(nrjuzzioPqfttNRptBDpZDzSYUrcM.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(51)) {
            setHintTextColor(nrjuzzioPqfttNRptBDpZDzSYUrcM.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(51));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(nrjuzzioPqfttNRptBDpZDzSYUrcM.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(nrjuzzioPqfttNRptBDpZDzSYUrcM.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(nrjuzzioPqfttNRptBDpZDzSYUrcM.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(59));
        }
        eswEmxJomeZU eswemxjomezu = new eswEmxJomeZU(this, nrjuzzioPqfttNRptBDpZDzSYUrcM);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = eswemxjomezu;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(typedArrayObtainStyledAttributes.getInt(49, 1));
        nrjuzzioPqfttNRptBDpZDzSYUrcM.aXO0LSrt8bKV();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(xhzau2f7zp5);
        frameLayout.addView(eswemxjomezu);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.qygqjTppWwx992;
        }
        int iVBGA6pPLqSMuYGvprl270j7 = zonOxHotd3BwAPJcwqr6I6uQNngg4.vBGA6pPLqSMuYGvprl270j7(this.ZLZeBXTMq0zDztBxtRTuCHrapQ, com.vdodsodjsdt.R.attr.colorControlHighlight);
        int i = this.L8DMw02rUTs2w;
        int[][] iArr = PfK8qHOJoCLG;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O = this.qygqjTppWwx992;
            int i2 = this.wdI7vzA3Qmcwd;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{zonOxHotd3BwAPJcwqr6I6uQNngg4.iKANjmyTSxO6v6UuLPdu7DxOjlS(iVBGA6pPLqSMuYGvprl270j7, i2, 0.1f), i2}), eQz8nVyVxmIrHN6fNCQWutFG0b30O, eQz8nVyVxmIrHN6fNCQWutFG0b30O);
        }
        Context context = getContext();
        EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O2 = this.qygqjTppWwx992;
        TypedValue typedValueWdI7vzA3Qmcwd = ej6unYlOWMDF.wdI7vzA3Qmcwd(com.vdodsodjsdt.R.attr.colorSurface, context, "TextInputLayout");
        int i3 = typedValueWdI7vzA3Qmcwd.resourceId;
        int color = i3 != 0 ? context.getColor(i3) : typedValueWdI7vzA3Qmcwd.data;
        EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O3 = new EQz8nVyVxmIrHN6fNCQWutFG0b30O(eQz8nVyVxmIrHN6fNCQWutFG0b30O2.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        int iIKANjmyTSxO6v6UuLPdu7DxOjlS = zonOxHotd3BwAPJcwqr6I6uQNngg4.iKANjmyTSxO6v6UuLPdu7DxOjlS(iVBGA6pPLqSMuYGvprl270j7, color, 0.1f);
        eQz8nVyVxmIrHN6fNCQWutFG0b30O3.p59rPv72J9(new ColorStateList(iArr, new int[]{iIKANjmyTSxO6v6UuLPdu7DxOjlS, 0}));
        eQz8nVyVxmIrHN6fNCQWutFG0b30O3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iIKANjmyTSxO6v6UuLPdu7DxOjlS, color});
        EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O4 = new EQz8nVyVxmIrHN6fNCQWutFG0b30O(eQz8nVyVxmIrHN6fNCQWutFG0b30O2.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        eQz8nVyVxmIrHN6fNCQWutFG0b30O4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, eQz8nVyVxmIrHN6fNCQWutFG0b30O3, eQz8nVyVxmIrHN6fNCQWutFG0b30O4), eQz8nVyVxmIrHN6fNCQWutFG0b30O2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.TqcnImqkSWIKht == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.TqcnImqkSWIKht = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.TqcnImqkSWIKht.addState(new int[0], NSjgqmGjEzuugn2SsG1mZFP(false));
        }
        return this.TqcnImqkSWIKht;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.iKANjmyTSxO6v6UuLPdu7DxOjlS == null) {
            this.iKANjmyTSxO6v6UuLPdu7DxOjlS = NSjgqmGjEzuugn2SsG1mZFP(true);
        }
        return this.iKANjmyTSxO6v6UuLPdu7DxOjlS;
    }

    public static void q1wNbhk2O6(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                q1wNbhk2O6((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = editText;
        int i = this.GI83zq0G8e7zkn;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.HzCpKshMOoaw76hFcbOVRYMeRd);
        }
        int i2 = this.M9e7PWhFYLD2lOGMker;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.KUYypEB4eNWOZWVDpH);
        }
        this.d9zDyyznnp3oaDT1Ug = false;
        HzCpKshMOoaw76hFcbOVRYMeRd();
        setTextInputAccessibilityDelegate(new I7ekItPvKv4lN(this));
        Typeface typeface = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getTypeface();
        noQ5wqDlpHr6qq0OY4sYdJyOQ noq5wqdlphr6qq0oy4sydjyoq = this.r0dB0ojIy6g8mnk1;
        noq5wqdlphr6qq0oy4sydjyoq.p59rPv72J9(typeface);
        float textSize = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getTextSize();
        if (noq5wqdlphr6qq0oy4sydjyoq.NSjgqmGjEzuugn2SsG1mZFP != textSize) {
            noq5wqdlphr6qq0oy4sydjyoq.NSjgqmGjEzuugn2SsG1mZFP = textSize;
            noq5wqdlphr6qq0oy4sydjyoq.M9e7PWhFYLD2lOGMker(false);
        }
        float letterSpacing = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getLetterSpacing();
        if (noq5wqdlphr6qq0oy4sydjyoq.wdI7vzA3Qmcwd != letterSpacing) {
            noq5wqdlphr6qq0oy4sydjyoq.wdI7vzA3Qmcwd = letterSpacing;
            noq5wqdlphr6qq0oy4sydjyoq.M9e7PWhFYLD2lOGMker(false);
        }
        int gravity = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (noq5wqdlphr6qq0oy4sydjyoq.ZLZeBXTMq0zDztBxtRTuCHrapQ != i3) {
            noq5wqdlphr6qq0oy4sydjyoq.ZLZeBXTMq0zDztBxtRTuCHrapQ = i3;
            noq5wqdlphr6qq0oy4sydjyoq.M9e7PWhFYLD2lOGMker(false);
        }
        if (noq5wqdlphr6qq0oy4sydjyoq.zIvmSL0wzmmKGc3X39b2Gw2mUGE != gravity) {
            noq5wqdlphr6qq0oy4sydjyoq.zIvmSL0wzmmKGc3X39b2Gw2mUGE = gravity;
            noq5wqdlphr6qq0oy4sydjyoq.M9e7PWhFYLD2lOGMker(false);
        }
        this.VOvSEdhaZyc0oOGQ8 = editText.getMinimumHeight();
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ.addTextChangedListener(new lPYuKA1O6JC(this, editText));
        if (this.rE05n5RsRkyWKIeA9cmLXAKv4Hze == null) {
            this.rE05n5RsRkyWKIeA9cmLXAKv4Hze = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getHintTextColors();
        }
        if (this.O1xDAlBZZlZdoEf747lCFHld) {
            if (TextUtils.isEmpty(this.HVEwbdULInpTNa0IG)) {
                CharSequence hint = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getHint();
                this.NSjgqmGjEzuugn2SsG1mZFP = hint;
                setHint(hint);
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ.setHint((CharSequence) null);
            }
            this.y1NaPKTl7R18DOr6e8i5 = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ko09zE6UAgwkV();
        }
        if (this.ko09zE6UAgwkV != null) {
            h3jnZRsdwYJfY9UhQCkbvWciwvFHv(this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getText());
        }
        f6ZQsR6bPLvvCDNXOUc();
        this.q1wNbhk2O6.zzpBGItXfub0yWj();
        this.ZfQNn8hdWlEQ5cR94249PDsLR.bringToFront();
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        eswemxjomezu.bringToFront();
        Iterator it = this.bjhcQ0u7VT2OYYrwk96HrWoN.iterator();
        while (it.hasNext()) {
            ((uLKh0h5Zrkfub) it.next()).VxUQ9tBhpHJ2AAEDNW8sghc4m(this);
        }
        eswemxjomezu.q1wNbhk2O6();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        Irh5auREsoeV1C1RaBamlmy(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.HVEwbdULInpTNa0IG)) {
            return;
        }
        this.HVEwbdULInpTNa0IG = charSequence;
        noQ5wqDlpHr6qq0OY4sYdJyOQ noq5wqdlphr6qq0oy4sydjyoq = this.r0dB0ojIy6g8mnk1;
        if (charSequence == null || !TextUtils.equals(noq5wqdlphr6qq0oy4sydjyoq.SuB3hEmTmbbRGAhtvOOmfKEon, charSequence)) {
            noq5wqdlphr6qq0oy4sydjyoq.SuB3hEmTmbbRGAhtvOOmfKEon = charSequence;
            noq5wqdlphr6qq0oy4sydjyoq.pzqP2AqKW6J5PO8zCKnW = null;
            noq5wqdlphr6qq0oy4sydjyoq.M9e7PWhFYLD2lOGMker(false);
        }
        if (this.h2b7InwIaORKN91X7whfQh4) {
            return;
        }
        KUYypEB4eNWOZWVDpH();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.TaDO7ogis3aEiWEtq == z) {
            return;
        }
        if (z) {
            lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = this.Irh5auREsoeV1C1RaBamlmy;
            if (lzuj2xiohpzadsoz1vjvxa != null) {
                this.V57tEvNfxZVVcOCAOih5PKr.addView(lzuj2xiohpzadsoz1vjvxa);
                this.Irh5auREsoeV1C1RaBamlmy.setVisibility(0);
            }
        } else {
            lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa2 = this.Irh5auREsoeV1C1RaBamlmy;
            if (lzuj2xiohpzadsoz1vjvxa2 != null) {
                lzuj2xiohpzadsoz1vjvxa2.setVisibility(8);
            }
            this.Irh5auREsoeV1C1RaBamlmy = null;
        }
        this.TaDO7ogis3aEiWEtq = z;
    }

    public final boolean Ca81ebIan1u() {
        uGIIbcq05l2iYyEa2AaeeYA ugiibcq05l2iyyea2aaeeya = this.q1wNbhk2O6;
        return (ugiibcq05l2iyyea2aaeeya.Ca81ebIan1u != 1 || ugiibcq05l2iyyea2aaeeya.ko09zE6UAgwkV == null || TextUtils.isEmpty(ugiibcq05l2iyyea2aaeeya.h3jnZRsdwYJfY9UhQCkbvWciwvFHv)) ? false : true;
    }

    public final int GI83zq0G8e7zkn(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getCompoundPaddingLeft() : this.LaeGQIruHQu81hfJldjMOQSVblH3x.V57tEvNfxZVVcOCAOih5PKr() : this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m()) + i;
    }

    public final void HzCpKshMOoaw76hFcbOVRYMeRd() {
        int i = this.L8DMw02rUTs2w;
        if (i == 0) {
            this.qygqjTppWwx992 = null;
            this.CixTK5ZX8oWXHz34qHYV = null;
            this.ymT6yQrus3w = null;
        } else if (i == 1) {
            this.qygqjTppWwx992 = new EQz8nVyVxmIrHN6fNCQWutFG0b30O(this.YdNRGRc4rly);
            this.CixTK5ZX8oWXHz34qHYV = new EQz8nVyVxmIrHN6fNCQWutFG0b30O();
            this.ymT6yQrus3w = new EQz8nVyVxmIrHN6fNCQWutFG0b30O();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.L8DMw02rUTs2w + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.O1xDAlBZZlZdoEf747lCFHld || (this.qygqjTppWwx992 instanceof eulR6k1HTLasRolDlw0q9CWFl7ak)) {
                this.qygqjTppWwx992 = new EQz8nVyVxmIrHN6fNCQWutFG0b30O(this.YdNRGRc4rly);
            } else {
                XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b = this.YdNRGRc4rly;
                int i2 = eulR6k1HTLasRolDlw0q9CWFl7ak.iKANjmyTSxO6v6UuLPdu7DxOjlS;
                if (xdVIZOnOVHGi6uYUaae4zAI94b == null) {
                    xdVIZOnOVHGi6uYUaae4zAI94b = new XdVIZOnOVHGi6uYUaae4zAI94b();
                }
                MKLZoKw17XA mKLZoKw17XA = new MKLZoKw17XA(xdVIZOnOVHGi6uYUaae4zAI94b, new RectF());
                eulR6k1HTLasRolDlw0q9CWFl7ak eulr6k1htlasroldlw0q9cwfl7ak = new eulR6k1HTLasRolDlw0q9CWFl7ak(mKLZoKw17XA);
                eulr6k1htlasroldlw0q9cwfl7ak.qygqjTppWwx992 = mKLZoKw17XA;
                this.qygqjTppWwx992 = eulr6k1htlasroldlw0q9cwfl7ak;
            }
            this.CixTK5ZX8oWXHz34qHYV = null;
            this.ymT6yQrus3w = null;
        }
        vBGA6pPLqSMuYGvprl270j7();
        RhfGHxtXxy0M0grmp2jkRjQg();
        if (this.L8DMw02rUTs2w == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.lQ0rO9lhQIyVe7Rp6 = getResources().getDimensionPixelSize(com.vdodsodjsdt.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (F44whnLsbQ.qygqjTppWwx992(getContext())) {
                this.lQ0rO9lhQIyVe7Rp6 = getResources().getDimensionPixelSize(com.vdodsodjsdt.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        if (this.L8DMw02rUTs2w != 0) {
            TaDO7ogis3aEiWEtq();
        }
        EditText editText = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.L8DMw02rUTs2w;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void Irh5auREsoeV1C1RaBamlmy(boolean z, boolean z2) {
        ColorStateList colorStateList;
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.rE05n5RsRkyWKIeA9cmLXAKv4Hze;
        noQ5wqDlpHr6qq0OY4sYdJyOQ noq5wqdlphr6qq0oy4sydjyoq = this.r0dB0ojIy6g8mnk1;
        if (colorStateList2 != null) {
            noq5wqdlphr6qq0oy4sydjyoq.HzCpKshMOoaw76hFcbOVRYMeRd(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.rE05n5RsRkyWKIeA9cmLXAKv4Hze;
            noq5wqdlphr6qq0oy4sydjyoq.HzCpKshMOoaw76hFcbOVRYMeRd(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.lxWWbfAOLs4jWzd7PSIiIJ) : this.lxWWbfAOLs4jWzd7PSIiIJ));
        } else if (Ca81ebIan1u()) {
            lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa2 = this.q1wNbhk2O6.ko09zE6UAgwkV;
            noq5wqdlphr6qq0oy4sydjyoq.HzCpKshMOoaw76hFcbOVRYMeRd(lzuj2xiohpzadsoz1vjvxa2 != null ? lzuj2xiohpzadsoz1vjvxa2.getTextColors() : null);
        } else if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv && (lzuj2xiohpzadsoz1vjvxa = this.ko09zE6UAgwkV) != null) {
            noq5wqdlphr6qq0oy4sydjyoq.HzCpKshMOoaw76hFcbOVRYMeRd(lzuj2xiohpzadsoz1vjvxa.getTextColors());
        } else if (z4 && (colorStateList = this.p6bBrs4p3Ly) != null && noq5wqdlphr6qq0oy4sydjyoq.HzCpKshMOoaw76hFcbOVRYMeRd != colorStateList) {
            noq5wqdlphr6qq0oy4sydjyoq.HzCpKshMOoaw76hFcbOVRYMeRd = colorStateList;
            noq5wqdlphr6qq0oy4sydjyoq.M9e7PWhFYLD2lOGMker(false);
        }
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        xhZAU2F7Zp5 xhzau2f7zp5 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (z3 || !this.G479XgNG9rK8jPPbSXr || (isEnabled() && z4)) {
            if (z2 || this.h2b7InwIaORKN91X7whfQh4) {
                ValueAnimator valueAnimator = this.zyiF0wv9HozxGOIDt8PvVp;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.zyiF0wv9HozxGOIDt8PvVp.cancel();
                }
                if (z && this.Pf1HsU8AK92buCoUaexm5AC) {
                    zzpBGItXfub0yWj(1.0f);
                } else {
                    noq5wqdlphr6qq0oy4sydjyoq.q1wNbhk2O6(1.0f);
                }
                this.h2b7InwIaORKN91X7whfQh4 = false;
                if (ZLZeBXTMq0zDztBxtRTuCHrapQ()) {
                    KUYypEB4eNWOZWVDpH();
                }
                EditText editText3 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                q11o1hieEkZDhF1MGOZI26oZiDT(editText3 != null ? editText3.getText() : null);
                xhzau2f7zp5.KUYypEB4eNWOZWVDpH = false;
                xhzau2f7zp5.LaeGQIruHQu81hfJldjMOQSVblH3x();
                eswemxjomezu.f6ZQsR6bPLvvCDNXOUc = false;
                eswemxjomezu.p59rPv72J9();
                return;
            }
            return;
        }
        if (z2 || !this.h2b7InwIaORKN91X7whfQh4) {
            ValueAnimator valueAnimator2 = this.zyiF0wv9HozxGOIDt8PvVp;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.zyiF0wv9HozxGOIDt8PvVp.cancel();
            }
            if (z && this.Pf1HsU8AK92buCoUaexm5AC) {
                zzpBGItXfub0yWj(0.0f);
            } else {
                noq5wqdlphr6qq0oy4sydjyoq.q1wNbhk2O6(0.0f);
            }
            if (ZLZeBXTMq0zDztBxtRTuCHrapQ() && !((eulR6k1HTLasRolDlw0q9CWFl7ak) this.qygqjTppWwx992).qygqjTppWwx992.ko09zE6UAgwkV.isEmpty() && ZLZeBXTMq0zDztBxtRTuCHrapQ()) {
                ((eulR6k1HTLasRolDlw0q9CWFl7ak) this.qygqjTppWwx992).f6ZQsR6bPLvvCDNXOUc(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.h2b7InwIaORKN91X7whfQh4 = true;
            lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa3 = this.Irh5auREsoeV1C1RaBamlmy;
            if (lzuj2xiohpzadsoz1vjvxa3 != null && this.TaDO7ogis3aEiWEtq) {
                lzuj2xiohpzadsoz1vjvxa3.setText((CharSequence) null);
                ORBZw1rSo0ao2WcPyTXuENVqH.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.V57tEvNfxZVVcOCAOih5PKr, this.qNPQb1obP7);
                this.Irh5auREsoeV1C1RaBamlmy.setVisibility(4);
            }
            xhzau2f7zp5.KUYypEB4eNWOZWVDpH = true;
            xhzau2f7zp5.LaeGQIruHQu81hfJldjMOQSVblH3x();
            eswemxjomezu.f6ZQsR6bPLvvCDNXOUc = true;
            eswemxjomezu.p59rPv72J9();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void KUYypEB4eNWOZWVDpH() {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.KUYypEB4eNWOZWVDpH():void");
    }

    public final int LaeGQIruHQu81hfJldjMOQSVblH3x() {
        if (this.O1xDAlBZZlZdoEf747lCFHld) {
            int i = this.L8DMw02rUTs2w;
            noQ5wqDlpHr6qq0OY4sYdJyOQ noq5wqdlphr6qq0oy4sydjyoq = this.r0dB0ojIy6g8mnk1;
            if (i == 0) {
                return (int) noq5wqdlphr6qq0oy4sydjyoq.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (noq5wqdlphr6qq0oy4sydjyoq.zIvmSL0wzmmKGc3X39b2Gw2mUGE() / 2.0f);
                }
                float fZIvmSL0wzmmKGc3X39b2Gw2mUGE = noq5wqdlphr6qq0oy4sydjyoq.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
                TextPaint textPaint = noq5wqdlphr6qq0oy4sydjyoq.wRCD0SdqWCowdYU7bmzN;
                textPaint.setTextSize(noq5wqdlphr6qq0oy4sydjyoq.GI83zq0G8e7zkn);
                textPaint.setTypeface(noq5wqdlphr6qq0oy4sydjyoq.jW7EiD0YL6xkbB158jMUzhWNWb1y);
                textPaint.setLetterSpacing(noq5wqdlphr6qq0oy4sydjyoq.vXWl0o6I4U59CgHs9);
                return Math.max(0, (int) (fZIvmSL0wzmmKGc3X39b2Gw2mUGE - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final int M9e7PWhFYLD2lOGMker(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getCompoundPaddingRight() : this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m() : this.LaeGQIruHQu81hfJldjMOQSVblH3x.V57tEvNfxZVVcOCAOih5PKr());
    }

    public final EQz8nVyVxmIrHN6fNCQWutFG0b30O NSjgqmGjEzuugn2SsG1mZFP(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.vdodsodjsdt.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        float popupElevation = editText instanceof hEYFkY0Pa5rIEBwb4kWhO0E74Dn ? ((hEYFkY0Pa5rIEBwb4kWhO0E74Dn) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.vdodsodjsdt.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.vdodsodjsdt.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ZP4eo8ej66W7kmHDyh zP4eo8ej66W7kmHDyh = new ZP4eo8ej66W7kmHDyh();
        ZP4eo8ej66W7kmHDyh zP4eo8ej66W7kmHDyh2 = new ZP4eo8ej66W7kmHDyh();
        ZP4eo8ej66W7kmHDyh zP4eo8ej66W7kmHDyh3 = new ZP4eo8ej66W7kmHDyh();
        ZP4eo8ej66W7kmHDyh zP4eo8ej66W7kmHDyh4 = new ZP4eo8ej66W7kmHDyh();
        int i = 0;
        IN79WcIk5xB4t0GjRT43qPLs5 iN79WcIk5xB4t0GjRT43qPLs5 = new IN79WcIk5xB4t0GjRT43qPLs5(i);
        IN79WcIk5xB4t0GjRT43qPLs5 iN79WcIk5xB4t0GjRT43qPLs52 = new IN79WcIk5xB4t0GjRT43qPLs5(i);
        IN79WcIk5xB4t0GjRT43qPLs5 iN79WcIk5xB4t0GjRT43qPLs53 = new IN79WcIk5xB4t0GjRT43qPLs5(i);
        IN79WcIk5xB4t0GjRT43qPLs5 iN79WcIk5xB4t0GjRT43qPLs54 = new IN79WcIk5xB4t0GjRT43qPLs5(i);
        ZOzTbMJxsw zOzTbMJxsw = new ZOzTbMJxsw(f);
        ZOzTbMJxsw zOzTbMJxsw2 = new ZOzTbMJxsw(f);
        ZOzTbMJxsw zOzTbMJxsw3 = new ZOzTbMJxsw(dimensionPixelOffset);
        ZOzTbMJxsw zOzTbMJxsw4 = new ZOzTbMJxsw(dimensionPixelOffset);
        XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b = new XdVIZOnOVHGi6uYUaae4zAI94b();
        xdVIZOnOVHGi6uYUaae4zAI94b.VxUQ9tBhpHJ2AAEDNW8sghc4m = zP4eo8ej66W7kmHDyh;
        xdVIZOnOVHGi6uYUaae4zAI94b.zzpBGItXfub0yWj = zP4eo8ej66W7kmHDyh2;
        xdVIZOnOVHGi6uYUaae4zAI94b.V57tEvNfxZVVcOCAOih5PKr = zP4eo8ej66W7kmHDyh3;
        xdVIZOnOVHGi6uYUaae4zAI94b.ZfQNn8hdWlEQ5cR94249PDsLR = zP4eo8ej66W7kmHDyh4;
        xdVIZOnOVHGi6uYUaae4zAI94b.LaeGQIruHQu81hfJldjMOQSVblH3x = zOzTbMJxsw;
        xdVIZOnOVHGi6uYUaae4zAI94b.zIvmSL0wzmmKGc3X39b2Gw2mUGE = zOzTbMJxsw2;
        xdVIZOnOVHGi6uYUaae4zAI94b.ZLZeBXTMq0zDztBxtRTuCHrapQ = zOzTbMJxsw4;
        xdVIZOnOVHGi6uYUaae4zAI94b.NSjgqmGjEzuugn2SsG1mZFP = zOzTbMJxsw3;
        xdVIZOnOVHGi6uYUaae4zAI94b.GI83zq0G8e7zkn = iN79WcIk5xB4t0GjRT43qPLs5;
        xdVIZOnOVHGi6uYUaae4zAI94b.M9e7PWhFYLD2lOGMker = iN79WcIk5xB4t0GjRT43qPLs52;
        xdVIZOnOVHGi6uYUaae4zAI94b.HzCpKshMOoaw76hFcbOVRYMeRd = iN79WcIk5xB4t0GjRT43qPLs53;
        xdVIZOnOVHGi6uYUaae4zAI94b.KUYypEB4eNWOZWVDpH = iN79WcIk5xB4t0GjRT43qPLs54;
        EditText editText2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof hEYFkY0Pa5rIEBwb4kWhO0E74Dn ? ((hEYFkY0Pa5rIEBwb4kWhO0E74Dn) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = EQz8nVyVxmIrHN6fNCQWutFG0b30O.HVEwbdULInpTNa0IG;
            TypedValue typedValueWdI7vzA3Qmcwd = ej6unYlOWMDF.wdI7vzA3Qmcwd(com.vdodsodjsdt.R.attr.colorSurface, context, EQz8nVyVxmIrHN6fNCQWutFG0b30O.class.getSimpleName());
            int i2 = typedValueWdI7vzA3Qmcwd.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? context.getColor(i2) : typedValueWdI7vzA3Qmcwd.data);
        }
        EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O = new EQz8nVyVxmIrHN6fNCQWutFG0b30O();
        eQz8nVyVxmIrHN6fNCQWutFG0b30O.HzCpKshMOoaw76hFcbOVRYMeRd(context);
        eQz8nVyVxmIrHN6fNCQWutFG0b30O.p59rPv72J9(dropDownBackgroundTintList);
        eQz8nVyVxmIrHN6fNCQWutFG0b30O.q1wNbhk2O6(popupElevation);
        eQz8nVyVxmIrHN6fNCQWutFG0b30O.setShapeAppearanceModel(xdVIZOnOVHGi6uYUaae4zAI94b);
        UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 = eQz8nVyVxmIrHN6fNCQWutFG0b30O.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.NSjgqmGjEzuugn2SsG1mZFP == null) {
            uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.NSjgqmGjEzuugn2SsG1mZFP = new Rect();
        }
        eQz8nVyVxmIrHN6fNCQWutFG0b30O.ZfQNn8hdWlEQ5cR94249PDsLR.NSjgqmGjEzuugn2SsG1mZFP.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        eQz8nVyVxmIrHN6fNCQWutFG0b30O.invalidateSelf();
        return eQz8nVyVxmIrHN6fNCQWutFG0b30O;
    }

    public final void RhfGHxtXxy0M0grmp2jkRjQg() {
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa;
        EditText editText;
        EditText editText2;
        if (this.qygqjTppWwx992 == null || this.L8DMw02rUTs2w == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.ZLZeBXTMq0zDztBxtRTuCHrapQ) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.vXWl0o6I4U59CgHs9 = this.lxWWbfAOLs4jWzd7PSIiIJ;
        } else if (Ca81ebIan1u()) {
            if (this.ByTQIhgl7ezGvHXEd != null) {
                w0Wu95l8dVNw5rZMRu(z2, z);
            } else {
                this.vXWl0o6I4U59CgHs9 = getErrorCurrentTextColors();
            }
        } else if (!this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv || (lzuj2xiohpzadsoz1vjvxa = this.ko09zE6UAgwkV) == null) {
            if (z2) {
                this.vXWl0o6I4U59CgHs9 = this.HAPpjhiCsV9ONY23505HCBI9IX;
            } else if (z) {
                this.vXWl0o6I4U59CgHs9 = this.wR7sbzHKf9hYV1lxoS6nqyszepWvN;
            } else {
                this.vXWl0o6I4U59CgHs9 = this.ubNpdCC1pl7L;
            }
        } else if (this.ByTQIhgl7ezGvHXEd != null) {
            w0Wu95l8dVNw5rZMRu(z2, z);
        } else {
            this.vXWl0o6I4U59CgHs9 = lzuj2xiohpzadsoz1vjvxa.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ko09zE6UAgwkV();
        }
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        TextInputLayout textInputLayout = eswemxjomezu.V57tEvNfxZVVcOCAOih5PKr;
        CheckableImageButton checkableImageButton = eswemxjomezu.GI83zq0G8e7zkn;
        TextInputLayout textInputLayout2 = eswemxjomezu.V57tEvNfxZVVcOCAOih5PKr;
        eswemxjomezu.KUYypEB4eNWOZWVDpH();
        ej6unYlOWMDF.lQ0rO9lhQIyVe7Rp6(textInputLayout2, eswemxjomezu.LaeGQIruHQu81hfJldjMOQSVblH3x, eswemxjomezu.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        ej6unYlOWMDF.lQ0rO9lhQIyVe7Rp6(textInputLayout2, checkableImageButton, eswemxjomezu.q1wNbhk2O6);
        if (eswemxjomezu.zzpBGItXfub0yWj() instanceof hbsUcFELqptC4ZZnom4xRs0eGoz) {
            if (!textInputLayout.Ca81ebIan1u() || checkableImageButton.getDrawable() == null) {
                ej6unYlOWMDF.ZLZeBXTMq0zDztBxtRTuCHrapQ(textInputLayout, checkableImageButton, eswemxjomezu.q1wNbhk2O6, eswemxjomezu.p59rPv72J9);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        xhZAU2F7Zp5 xhzau2f7zp5 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        ej6unYlOWMDF.lQ0rO9lhQIyVe7Rp6(xhzau2f7zp5.V57tEvNfxZVVcOCAOih5PKr, xhzau2f7zp5.zIvmSL0wzmmKGc3X39b2Gw2mUGE, xhzau2f7zp5.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        if (this.L8DMw02rUTs2w == 2) {
            int i = this.JUdwvN8LfOMa;
            if (z2 && isEnabled()) {
                this.JUdwvN8LfOMa = this.hKs1wlZyvtUNaW1f5ABIGacfPcvX;
            } else {
                this.JUdwvN8LfOMa = this.ItrQwCXbty5PZtje5JS;
            }
            if (this.JUdwvN8LfOMa != i && ZLZeBXTMq0zDztBxtRTuCHrapQ() && !this.h2b7InwIaORKN91X7whfQh4) {
                if (ZLZeBXTMq0zDztBxtRTuCHrapQ()) {
                    ((eulR6k1HTLasRolDlw0q9CWFl7ak) this.qygqjTppWwx992).f6ZQsR6bPLvvCDNXOUc(0.0f, 0.0f, 0.0f, 0.0f);
                }
                KUYypEB4eNWOZWVDpH();
            }
        }
        if (this.L8DMw02rUTs2w == 1) {
            if (!isEnabled()) {
                this.wdI7vzA3Qmcwd = this.e1gEV3X9xwmHj;
            } else if (z && !z2) {
                this.wdI7vzA3Qmcwd = this.BDoqAMf0rlMRAnVghjC4qjG;
            } else if (z2) {
                this.wdI7vzA3Qmcwd = this.AFOcXGdvoTMuqwiG8tD;
            } else {
                this.wdI7vzA3Qmcwd = this.tpEo0fy9FaoJYrSFHRfIK6;
            }
        }
        V57tEvNfxZVVcOCAOih5PKr();
    }

    public final void TaDO7ogis3aEiWEtq() {
        if (this.L8DMw02rUTs2w != 1) {
            FrameLayout frameLayout = this.V57tEvNfxZVVcOCAOih5PKr;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iLaeGQIruHQu81hfJldjMOQSVblH3x = LaeGQIruHQu81hfJldjMOQSVblH3x();
            if (iLaeGQIruHQu81hfJldjMOQSVblH3x != layoutParams.topMargin) {
                layoutParams.topMargin = iLaeGQIruHQu81hfJldjMOQSVblH3x;
                frameLayout.requestLayout();
            }
        }
    }

    public final void V57tEvNfxZVVcOCAOih5PKr() {
        int i;
        int i2;
        EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O = this.qygqjTppWwx992;
        if (eQz8nVyVxmIrHN6fNCQWutFG0b30O == null) {
            return;
        }
        XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b = eQz8nVyVxmIrHN6fNCQWutFG0b30O.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b2 = this.YdNRGRc4rly;
        if (xdVIZOnOVHGi6uYUaae4zAI94b != xdVIZOnOVHGi6uYUaae4zAI94b2) {
            eQz8nVyVxmIrHN6fNCQWutFG0b30O.setShapeAppearanceModel(xdVIZOnOVHGi6uYUaae4zAI94b2);
        }
        if (this.L8DMw02rUTs2w == 2 && (i = this.JUdwvN8LfOMa) > -1 && (i2 = this.vXWl0o6I4U59CgHs9) != 0) {
            EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O2 = this.qygqjTppWwx992;
            eQz8nVyVxmIrHN6fNCQWutFG0b30O2.ZfQNn8hdWlEQ5cR94249PDsLR.HzCpKshMOoaw76hFcbOVRYMeRd = i;
            eQz8nVyVxmIrHN6fNCQWutFG0b30O2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
            UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 = eQz8nVyVxmIrHN6fNCQWutFG0b30O2.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.LaeGQIruHQu81hfJldjMOQSVblH3x != colorStateListValueOf) {
                uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.LaeGQIruHQu81hfJldjMOQSVblH3x = colorStateListValueOf;
                eQz8nVyVxmIrHN6fNCQWutFG0b30O2.onStateChange(eQz8nVyVxmIrHN6fNCQWutFG0b30O2.getState());
            }
        }
        int iZzpBGItXfub0yWj = this.wdI7vzA3Qmcwd;
        if (this.L8DMw02rUTs2w == 1) {
            iZzpBGItXfub0yWj = PyYsF2FE67iANgZ0fDkVtNG5uhA.zzpBGItXfub0yWj(this.wdI7vzA3Qmcwd, zonOxHotd3BwAPJcwqr6I6uQNngg4.f6ZQsR6bPLvvCDNXOUc(getContext(), com.vdodsodjsdt.R.attr.colorSurface, 0));
        }
        this.wdI7vzA3Qmcwd = iZzpBGItXfub0yWj;
        this.qygqjTppWwx992.p59rPv72J9(ColorStateList.valueOf(iZzpBGItXfub0yWj));
        EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O3 = this.CixTK5ZX8oWXHz34qHYV;
        if (eQz8nVyVxmIrHN6fNCQWutFG0b30O3 != null && this.ymT6yQrus3w != null) {
            if (this.JUdwvN8LfOMa > -1 && this.vXWl0o6I4U59CgHs9 != 0) {
                eQz8nVyVxmIrHN6fNCQWutFG0b30O3.p59rPv72J9(this.ZLZeBXTMq0zDztBxtRTuCHrapQ.isFocused() ? ColorStateList.valueOf(this.ubNpdCC1pl7L) : ColorStateList.valueOf(this.vXWl0o6I4U59CgHs9));
                this.ymT6yQrus3w.p59rPv72J9(ColorStateList.valueOf(this.vXWl0o6I4U59CgHs9));
            }
            invalidate();
        }
        vBGA6pPLqSMuYGvprl270j7();
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ == null || this.L8DMw02rUTs2w != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.r0dB0ojIy6g8mnk1.zIvmSL0wzmmKGc3X39b2Gw2mUGE() + this.zIvmSL0wzmmKGc3X39b2Gw2mUGE), this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getPaddingEnd(), getResources().getDimensionPixelSize(com.vdodsodjsdt.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.vdodsodjsdt.R.dimen.material_filled_edittext_font_2_0_padding_top), this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getPaddingEnd(), getResources().getDimensionPixelSize(com.vdodsodjsdt.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (F44whnLsbQ.qygqjTppWwx992(getContext())) {
            EditText editText3 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.vdodsodjsdt.R.dimen.material_filled_edittext_font_1_3_padding_top), this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getPaddingEnd(), getResources().getDimensionPixelSize(com.vdodsodjsdt.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        return this.O1xDAlBZZlZdoEf747lCFHld && !TextUtils.isEmpty(this.HVEwbdULInpTNa0IG) && (this.qygqjTppWwx992 instanceof eulR6k1HTLasRolDlw0q9CWFl7ak);
    }

    public final Rect ZfQNn8hdWlEQ5cR94249PDsLR(Rect rect) {
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
            throw new IllegalStateException();
        }
        boolean z = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.zOk739gUM7zIZC25HHUxoiyixWFjn;
        rect2.bottom = i;
        int i2 = this.L8DMw02rUTs2w;
        if (i2 == 1) {
            rect2.left = GI83zq0G8e7zkn(rect.left, z);
            rect2.top = rect.top + this.lQ0rO9lhQIyVe7Rp6;
            rect2.right = M9e7PWhFYLD2lOGMker(rect.right, z);
            return rect2;
        }
        if (i2 != 2) {
            rect2.left = GI83zq0G8e7zkn(rect.left, z);
            rect2.top = getPaddingTop();
            rect2.right = M9e7PWhFYLD2lOGMker(rect.right, z);
            return rect2;
        }
        rect2.left = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getPaddingLeft() + rect.left;
        rect2.top = rect.top - LaeGQIruHQu81hfJldjMOQSVblH3x();
        rect2.right = rect.right - this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.V57tEvNfxZVVcOCAOih5PKr;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        TaDO7ogis3aEiWEtq();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.NSjgqmGjEzuugn2SsG1mZFP != null) {
            boolean z = this.y1NaPKTl7R18DOr6e8i5;
            this.y1NaPKTl7R18DOr6e8i5 = false;
            CharSequence hint = editText.getHint();
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ.setHint(this.NSjgqmGjEzuugn2SsG1mZFP);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ.setHint(hint);
                this.y1NaPKTl7R18DOr6e8i5 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.V57tEvNfxZVVcOCAOih5PKr;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.DNP7yXLsojH0rPMHr8fUY14M = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.DNP7yXLsojH0rPMHr8fUY14M = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.O1xDAlBZZlZdoEf747lCFHld;
        noQ5wqDlpHr6qq0OY4sYdJyOQ noq5wqdlphr6qq0oy4sydjyoq = this.r0dB0ojIy6g8mnk1;
        if (z) {
            TextPaint textPaint = noq5wqdlphr6qq0oy4sydjyoq.YdNRGRc4rly;
            RectF rectF = noq5wqdlphr6qq0oy4sydjyoq.LaeGQIruHQu81hfJldjMOQSVblH3x;
            int iSave = canvas2.save();
            if (noq5wqdlphr6qq0oy4sydjyoq.pzqP2AqKW6J5PO8zCKnW != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(noq5wqdlphr6qq0oy4sydjyoq.HVEwbdULInpTNa0IG);
                float f = noq5wqdlphr6qq0oy4sydjyoq.pYmKDYlAmhudp;
                float f2 = noq5wqdlphr6qq0oy4sydjyoq.ko09zE6UAgwkV;
                float f3 = noq5wqdlphr6qq0oy4sydjyoq.O1xDAlBZZlZdoEf747lCFHld;
                if (f3 != 1.0f) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if ((noq5wqdlphr6qq0oy4sydjyoq.bjhcQ0u7VT2OYYrwk96HrWoN > 1 || noq5wqdlphr6qq0oy4sydjyoq.BJQHddi0Plr5ElWetCyaixWOg9 > 1) && !noq5wqdlphr6qq0oy4sydjyoq.aXO0LSrt8bKV && noq5wqdlphr6qq0oy4sydjyoq.Ca81ebIan1u()) {
                    float lineStart = noq5wqdlphr6qq0oy4sydjyoq.pYmKDYlAmhudp - noq5wqdlphr6qq0oy4sydjyoq.zOk739gUM7zIZC25HHUxoiyixWFjn.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (noq5wqdlphr6qq0oy4sydjyoq.H2VFYNJEVGAX * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f5 = noq5wqdlphr6qq0oy4sydjyoq.y1NaPKTl7R18DOr6e8i5;
                        float f6 = noq5wqdlphr6qq0oy4sydjyoq.qygqjTppWwx992;
                        float f7 = noq5wqdlphr6qq0oy4sydjyoq.iKANjmyTSxO6v6UuLPdu7DxOjlS;
                        int i2 = noq5wqdlphr6qq0oy4sydjyoq.TqcnImqkSWIKht;
                        textPaint.setShadowLayer(f5, f6, f7, PyYsF2FE67iANgZ0fDkVtNG5uhA.ZfQNn8hdWlEQ5cR94249PDsLR(i2, (textPaint.getAlpha() * Color.alpha(i2)) / 255));
                    }
                    noq5wqdlphr6qq0oy4sydjyoq.zOk739gUM7zIZC25HHUxoiyixWFjn.draw(canvas2);
                    textPaint.setAlpha((int) (noq5wqdlphr6qq0oy4sydjyoq.rERAmyEtGV6ANGszuKcQI * f4));
                    if (i >= 31) {
                        float f8 = noq5wqdlphr6qq0oy4sydjyoq.y1NaPKTl7R18DOr6e8i5;
                        float f9 = noq5wqdlphr6qq0oy4sydjyoq.qygqjTppWwx992;
                        float f10 = noq5wqdlphr6qq0oy4sydjyoq.iKANjmyTSxO6v6UuLPdu7DxOjlS;
                        int i3 = noq5wqdlphr6qq0oy4sydjyoq.TqcnImqkSWIKht;
                        textPaint.setShadowLayer(f8, f9, f10, PyYsF2FE67iANgZ0fDkVtNG5uhA.ZfQNn8hdWlEQ5cR94249PDsLR(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = noq5wqdlphr6qq0oy4sydjyoq.zOk739gUM7zIZC25HHUxoiyixWFjn.getLineBaseline(0);
                    CharSequence charSequence = noq5wqdlphr6qq0oy4sydjyoq.Z1FjjMJ0suz8AFI7gsA4GDLMXv;
                    float f11 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(noq5wqdlphr6qq0oy4sydjyoq.y1NaPKTl7R18DOr6e8i5, noq5wqdlphr6qq0oy4sydjyoq.qygqjTppWwx992, noq5wqdlphr6qq0oy4sydjyoq.iKANjmyTSxO6v6UuLPdu7DxOjlS, noq5wqdlphr6qq0oy4sydjyoq.TqcnImqkSWIKht);
                    }
                    String strTrim = noq5wqdlphr6qq0oy4sydjyoq.Z1FjjMJ0suz8AFI7gsA4GDLMXv.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(noq5wqdlphr6qq0oy4sydjyoq.zOk739gUM7zIZC25HHUxoiyixWFjn.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                } else {
                    canvas2.translate(f, f2);
                    noq5wqdlphr6qq0oy4sydjyoq.zOk739gUM7zIZC25HHUxoiyixWFjn.draw(canvas2);
                }
                canvas2.restoreToCount(iSave);
            }
        }
        if (this.ymT6yQrus3w == null || (eQz8nVyVxmIrHN6fNCQWutFG0b30O = this.CixTK5ZX8oWXHz34qHYV) == null) {
            return;
        }
        eQz8nVyVxmIrHN6fNCQWutFG0b30O.draw(canvas2);
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ.isFocused()) {
            Rect bounds = this.ymT6yQrus3w.getBounds();
            Rect bounds2 = this.CixTK5ZX8oWXHz34qHYV.getBounds();
            float f12 = noq5wqdlphr6qq0oy4sydjyoq.zzpBGItXfub0yWj;
            int iCenterX = bounds2.centerX();
            bounds.left = mlFPz0SY9o7oN.V57tEvNfxZVVcOCAOih5PKr(iCenterX, bounds2.left, f12);
            bounds.right = mlFPz0SY9o7oN.V57tEvNfxZVVcOCAOih5PKr(iCenterX, bounds2.right, f12);
            this.ymT6yQrus3w.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.KMiA9Sqk243eQkFNNoS
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.KMiA9Sqk243eQkFNNoS = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            com.vdodsodjsdt.noQ5wqDlpHr6qq0OY4sYdJyOQ r3 = r4.r0dB0ojIy6g8mnk1
            if (r3 == 0) goto L2f
            r3.CixTK5ZX8oWXHz34qHYV = r1
            android.content.res.ColorStateList r1 = r3.HzCpKshMOoaw76hFcbOVRYMeRd
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.M9e7PWhFYLD2lOGMker
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.M9e7PWhFYLD2lOGMker(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.ZLZeBXTMq0zDztBxtRTuCHrapQ
            if (r3 == 0) goto L45
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L41
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L41
            goto L42
        L41:
            r0 = r2
        L42:
            r4.Irh5auREsoeV1C1RaBamlmy(r0, r2)
        L45:
            r4.f6ZQsR6bPLvvCDNXOUc()
            r4.RhfGHxtXxy0M0grmp2jkRjQg()
            if (r1 == 0) goto L50
            r4.invalidate()
        L50:
            r4.KMiA9Sqk243eQkFNNoS = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final void f6ZQsR6bPLvvCDNXOUc() {
        Drawable background;
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa;
        EditText editText = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (editText == null || this.L8DMw02rUTs2w != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = VGwRvGhOWf9duTP8Dxb9PtsLAe1z.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Drawable drawableMutate = background.mutate();
        if (Ca81ebIan1u()) {
            drawableMutate.setColorFilter(aMdFkGJAdbLdAI00ZfKC7DaJw3k2.V57tEvNfxZVVcOCAOih5PKr(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv && (lzuj2xiohpzadsoz1vjvxa = this.ko09zE6UAgwkV) != null) {
            drawableMutate.setColorFilter(aMdFkGJAdbLdAI00ZfKC7DaJw3k2.V57tEvNfxZVVcOCAOih5PKr(lzuj2xiohpzadsoz1vjvxa.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ.refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (editText == null) {
            return super.getBaseline();
        }
        return LaeGQIruHQu81hfJldjMOQSVblH3x() + getPaddingTop() + editText.getBaseline();
    }

    public EQz8nVyVxmIrHN6fNCQWutFG0b30O getBoxBackground() {
        int i = this.L8DMw02rUTs2w;
        if (i == 1 || i == 2) {
            return this.qygqjTppWwx992;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.wdI7vzA3Qmcwd;
    }

    public int getBoxBackgroundMode() {
        return this.L8DMw02rUTs2w;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.lQ0rO9lhQIyVe7Rp6;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.GE1sqSYiEYQO2ew7WEZwTtUeS5;
        return layoutDirection == 1 ? this.YdNRGRc4rly.NSjgqmGjEzuugn2SsG1mZFP.VxUQ9tBhpHJ2AAEDNW8sghc4m(rectF) : this.YdNRGRc4rly.ZLZeBXTMq0zDztBxtRTuCHrapQ.VxUQ9tBhpHJ2AAEDNW8sghc4m(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.GE1sqSYiEYQO2ew7WEZwTtUeS5;
        return layoutDirection == 1 ? this.YdNRGRc4rly.ZLZeBXTMq0zDztBxtRTuCHrapQ.VxUQ9tBhpHJ2AAEDNW8sghc4m(rectF) : this.YdNRGRc4rly.NSjgqmGjEzuugn2SsG1mZFP.VxUQ9tBhpHJ2AAEDNW8sghc4m(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.GE1sqSYiEYQO2ew7WEZwTtUeS5;
        return layoutDirection == 1 ? this.YdNRGRc4rly.LaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m(rectF) : this.YdNRGRc4rly.zIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.GE1sqSYiEYQO2ew7WEZwTtUeS5;
        return layoutDirection == 1 ? this.YdNRGRc4rly.zIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m(rectF) : this.YdNRGRc4rly.LaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m(rectF);
    }

    public int getBoxStrokeColor() {
        return this.HAPpjhiCsV9ONY23505HCBI9IX;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.ByTQIhgl7ezGvHXEd;
    }

    public int getBoxStrokeWidth() {
        return this.ItrQwCXbty5PZtje5JS;
    }

    public int getBoxStrokeWidthFocused() {
        return this.hKs1wlZyvtUNaW1f5ABIGacfPcvX;
    }

    public int getCounterMaxLength() {
        return this.Ca81ebIan1u;
    }

    public CharSequence getCounterOverflowDescription() {
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa;
        if (this.p59rPv72J9 && this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv && (lzuj2xiohpzadsoz1vjvxa = this.ko09zE6UAgwkV) != null) {
            return lzuj2xiohpzadsoz1vjvxa.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.pzqP2AqKW6J5PO8zCKnW;
    }

    public ColorStateList getCounterTextColor() {
        return this.SuB3hEmTmbbRGAhtvOOmfKEon;
    }

    public ColorStateList getCursorColor() {
        return this.aXO0LSrt8bKV;
    }

    public ColorStateList getCursorErrorColor() {
        return this.vE4yDIjexsP2lGjLaTcB;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.rE05n5RsRkyWKIeA9cmLXAKv4Hze;
    }

    public EditText getEditText() {
        return this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    public CharSequence getEndIconContentDescription() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x.GI83zq0G8e7zkn.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x.GI83zq0G8e7zkn.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x.Ca81ebIan1u;
    }

    public int getEndIconMode() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x.HzCpKshMOoaw76hFcbOVRYMeRd;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    }

    public CheckableImageButton getEndIconView() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x.GI83zq0G8e7zkn;
    }

    public CharSequence getError() {
        uGIIbcq05l2iYyEa2AaeeYA ugiibcq05l2iyyea2aaeeya = this.q1wNbhk2O6;
        if (ugiibcq05l2iyyea2aaeeya.pYmKDYlAmhudp) {
            return ugiibcq05l2iyyea2aaeeya.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.q1wNbhk2O6.f6ZQsR6bPLvvCDNXOUc;
    }

    public CharSequence getErrorContentDescription() {
        return this.q1wNbhk2O6.jW7EiD0YL6xkbB158jMUzhWNWb1y;
    }

    public int getErrorCurrentTextColors() {
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = this.q1wNbhk2O6.ko09zE6UAgwkV;
        if (lzuj2xiohpzadsoz1vjvxa != null) {
            return lzuj2xiohpzadsoz1vjvxa.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x.LaeGQIruHQu81hfJldjMOQSVblH3x.getDrawable();
    }

    public CharSequence getHelperText() {
        uGIIbcq05l2iYyEa2AaeeYA ugiibcq05l2iyyea2aaeeya = this.q1wNbhk2O6;
        if (ugiibcq05l2iyyea2aaeeya.q11o1hieEkZDhF1MGOZI26oZiDT) {
            return ugiibcq05l2iyyea2aaeeya.Irh5auREsoeV1C1RaBamlmy;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = this.q1wNbhk2O6.w0Wu95l8dVNw5rZMRu;
        if (lzuj2xiohpzadsoz1vjvxa != null) {
            return lzuj2xiohpzadsoz1vjvxa.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.O1xDAlBZZlZdoEf747lCFHld) {
            return this.HVEwbdULInpTNa0IG;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.r0dB0ojIy6g8mnk1.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
    }

    public final int getHintCurrentCollapsedTextColor() {
        noQ5wqDlpHr6qq0OY4sYdJyOQ noq5wqdlphr6qq0oy4sydjyoq = this.r0dB0ojIy6g8mnk1;
        return noq5wqdlphr6qq0oy4sydjyoq.ZLZeBXTMq0zDztBxtRTuCHrapQ(noq5wqdlphr6qq0oy4sydjyoq.HzCpKshMOoaw76hFcbOVRYMeRd);
    }

    public int getHintMaxLines() {
        return this.r0dB0ojIy6g8mnk1.bjhcQ0u7VT2OYYrwk96HrWoN;
    }

    public ColorStateList getHintTextColor() {
        return this.p6bBrs4p3Ly;
    }

    public W4Qt2NT8WTRWgps7H7wRotB1F getLengthCounter() {
        return this.pYmKDYlAmhudp;
    }

    public int getMaxEms() {
        return this.M9e7PWhFYLD2lOGMker;
    }

    public int getMaxWidth() {
        return this.KUYypEB4eNWOZWVDpH;
    }

    public int getMinEms() {
        return this.GI83zq0G8e7zkn;
    }

    public int getMinWidth() {
        return this.HzCpKshMOoaw76hFcbOVRYMeRd;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x.GI83zq0G8e7zkn.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x.GI83zq0G8e7zkn.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.TaDO7ogis3aEiWEtq) {
            return this.vBGA6pPLqSMuYGvprl270j7;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.w0Wu95l8dVNw5rZMRu;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.q11o1hieEkZDhF1MGOZI26oZiDT;
    }

    public CharSequence getPrefixText() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    public ColorStateList getPrefixTextColor() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.ZfQNn8hdWlEQ5cR94249PDsLR.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public XdVIZOnOVHGi6uYUaae4zAI94b getShapeAppearanceModel() {
        return this.YdNRGRc4rly;
    }

    public CharSequence getStartIconContentDescription() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.GI83zq0G8e7zkn;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.M9e7PWhFYLD2lOGMker;
    }

    public CharSequence getSuffixText() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x.ko09zE6UAgwkV;
    }

    public ColorStateList getSuffixTextColor() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x.jW7EiD0YL6xkbB158jMUzhWNWb1y.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x.jW7EiD0YL6xkbB158jMUzhWNWb1y;
    }

    public Typeface getTypeface() {
        return this.rERAmyEtGV6ANGszuKcQI;
    }

    public final void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(Editable editable) {
        ((ojJdkROPjZ) this.pYmKDYlAmhudp).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        int i = this.Ca81ebIan1u;
        if (i == -1) {
            this.ko09zE6UAgwkV.setText(String.valueOf(length));
            this.ko09zE6UAgwkV.setContentDescription(null);
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = false;
        } else {
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = length > i;
            Context context = getContext();
            this.ko09zE6UAgwkV.setContentDescription(context.getString(this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv ? com.vdodsodjsdt.R.string.character_counter_overflowed_content_description : com.vdodsodjsdt.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.Ca81ebIan1u)));
            if (z != this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) {
                pYmKDYlAmhudp();
            }
            String str = fIFi1mbkcdIKNsFz5uhziRB4UH.zzpBGItXfub0yWj;
            fIFi1mbkcdIKNsFz5uhziRB4UH fifi1mbkcdiknsfz5uhzirb4uh = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? fIFi1mbkcdIKNsFz5uhziRB4UH.LaeGQIruHQu81hfJldjMOQSVblH3x : fIFi1mbkcdIKNsFz5uhziRB4UH.ZfQNn8hdWlEQ5cR94249PDsLR;
            lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = this.ko09zE6UAgwkV;
            String string = getContext().getString(com.vdodsodjsdt.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.Ca81ebIan1u));
            fifi1mbkcdiknsfz5uhzirb4uh.getClass();
            xEETVD81ziRcL5BcSKUT7ajvxHmaB xeetvd81zircl5bcskut7ajvxhmab = Ace4xmNA0QbdiSLPz.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            lzuj2xiohpzadsoz1vjvxa.setText(string != null ? fifi1mbkcdiknsfz5uhzirb4uh.V57tEvNfxZVVcOCAOih5PKr(string).toString() : null);
        }
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ == null || z == this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) {
            return;
        }
        Irh5auREsoeV1C1RaBamlmy(false, false);
        RhfGHxtXxy0M0grmp2jkRjQg();
        f6ZQsR6bPLvvCDNXOUc();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean jW7EiD0YL6xkbB158jMUzhWNWb1y() {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.jW7EiD0YL6xkbB158jMUzhWNWb1y():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ko09zE6UAgwkV() {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.aXO0LSrt8bKV
            if (r0 == 0) goto L5
            goto L26
        L5:
            android.content.Context r0 = r4.getContext()
            r1 = 2130903297(0x7f030101, float:1.7413408E38)
            android.util.TypedValue r1 = com.vdodsodjsdt.ej6unYlOWMDF.JUdwvN8LfOMa(r0, r1)
            r2 = 0
            if (r1 != 0) goto L15
        L13:
            r0 = r2
            goto L26
        L15:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1e
            android.content.res.ColorStateList r0 = com.vdodsodjsdt.zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq(r0, r3)
            goto L26
        L1e:
            int r0 = r1.data
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L26:
            android.widget.EditText r1 = r4.ZLZeBXTMq0zDztBxtRTuCHrapQ
            if (r1 == 0) goto L51
            android.graphics.drawable.Drawable r1 = com.vdodsodjsdt.NeiBzdigGVkOo7gD.ZLZeBXTMq0zDztBxtRTuCHrapQ(r1)
            if (r1 != 0) goto L31
            goto L51
        L31:
            android.widget.EditText r1 = r4.ZLZeBXTMq0zDztBxtRTuCHrapQ
            android.graphics.drawable.Drawable r1 = com.vdodsodjsdt.NeiBzdigGVkOo7gD.ZLZeBXTMq0zDztBxtRTuCHrapQ(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.Ca81ebIan1u()
            if (r2 != 0) goto L49
            com.vdodsodjsdt.lzuj2xiOHpZAdsoZ1vJvxA r2 = r4.ko09zE6UAgwkV
            if (r2 == 0) goto L4e
            boolean r2 = r4.h3jnZRsdwYJfY9UhQCkbvWciwvFHv
            if (r2 == 0) goto L4e
        L49:
            android.content.res.ColorStateList r2 = r4.vE4yDIjexsP2lGjLaTcB
            if (r2 == 0) goto L4e
            r0 = r2
        L4e:
            r1.setTintList(r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.ko09zE6UAgwkV():void");
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.r0dB0ojIy6g8mnk1.GI83zq0G8e7zkn(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        eswemxjomezu.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.nNOZCSz1a7S = false;
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ != null && this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getMeasuredHeight() < (iMax = Math.max(eswemxjomezu.getMeasuredHeight(), this.ZfQNn8hdWlEQ5cR94249PDsLR.getMeasuredHeight()))) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ.setMinimumHeight(iMax);
            z = true;
        }
        boolean zJW7EiD0YL6xkbB158jMUzhWNWb1y = jW7EiD0YL6xkbB158jMUzhWNWb1y();
        if (z || zJW7EiD0YL6xkbB158jMUzhWNWb1y) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ.post(new lUqBmUbL53IL3VMM8GT8(13, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float fDescent;
        int i5;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (editText != null) {
            Rect rect = this.KYZ9RyuOc42A2J;
            EzcAu1qMbZ8VCMhJVRO7.VxUQ9tBhpHJ2AAEDNW8sghc4m(this, editText, rect);
            EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O = this.CixTK5ZX8oWXHz34qHYV;
            if (eQz8nVyVxmIrHN6fNCQWutFG0b30O != null) {
                int i6 = rect.bottom;
                eQz8nVyVxmIrHN6fNCQWutFG0b30O.setBounds(rect.left, i6 - this.ItrQwCXbty5PZtje5JS, rect.right, i6);
            }
            EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O2 = this.ymT6yQrus3w;
            if (eQz8nVyVxmIrHN6fNCQWutFG0b30O2 != null) {
                int i7 = rect.bottom;
                eQz8nVyVxmIrHN6fNCQWutFG0b30O2.setBounds(rect.left, i7 - this.hKs1wlZyvtUNaW1f5ABIGacfPcvX, rect.right, i7);
            }
            if (this.O1xDAlBZZlZdoEf747lCFHld) {
                float textSize = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getTextSize();
                noQ5wqDlpHr6qq0OY4sYdJyOQ noq5wqdlphr6qq0oy4sydjyoq = this.r0dB0ojIy6g8mnk1;
                float f = noq5wqdlphr6qq0oy4sydjyoq.NSjgqmGjEzuugn2SsG1mZFP;
                TextPaint textPaint = noq5wqdlphr6qq0oy4sydjyoq.wRCD0SdqWCowdYU7bmzN;
                if (f != textSize) {
                    noq5wqdlphr6qq0oy4sydjyoq.NSjgqmGjEzuugn2SsG1mZFP = textSize;
                    noq5wqdlphr6qq0oy4sydjyoq.M9e7PWhFYLD2lOGMker(false);
                }
                int gravity = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (noq5wqdlphr6qq0oy4sydjyoq.ZLZeBXTMq0zDztBxtRTuCHrapQ != i8) {
                    noq5wqdlphr6qq0oy4sydjyoq.ZLZeBXTMq0zDztBxtRTuCHrapQ = i8;
                    noq5wqdlphr6qq0oy4sydjyoq.M9e7PWhFYLD2lOGMker(false);
                }
                if (noq5wqdlphr6qq0oy4sydjyoq.zIvmSL0wzmmKGc3X39b2Gw2mUGE != gravity) {
                    noq5wqdlphr6qq0oy4sydjyoq.zIvmSL0wzmmKGc3X39b2Gw2mUGE = gravity;
                    noq5wqdlphr6qq0oy4sydjyoq.M9e7PWhFYLD2lOGMker(false);
                }
                Rect rectZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR(rect);
                int i9 = rectZfQNn8hdWlEQ5cR94249PDsLR.left;
                int i10 = rectZfQNn8hdWlEQ5cR94249PDsLR.top;
                int i11 = rectZfQNn8hdWlEQ5cR94249PDsLR.right;
                int i12 = rectZfQNn8hdWlEQ5cR94249PDsLR.bottom;
                Rect rect2 = noq5wqdlphr6qq0oy4sydjyoq.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (rect2.left != i9 || rect2.top != i10 || rect2.right != i11 || rect2.bottom != i12) {
                    rect2.set(i9, i10, i11, i12);
                    noq5wqdlphr6qq0oy4sydjyoq.ymT6yQrus3w = true;
                }
                if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(noq5wqdlphr6qq0oy4sydjyoq.NSjgqmGjEzuugn2SsG1mZFP);
                    textPaint.setTypeface(noq5wqdlphr6qq0oy4sydjyoq.TaDO7ogis3aEiWEtq);
                    textPaint.setLetterSpacing(noq5wqdlphr6qq0oy4sydjyoq.wdI7vzA3Qmcwd);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(noq5wqdlphr6qq0oy4sydjyoq.NSjgqmGjEzuugn2SsG1mZFP);
                    textPaint.setTypeface(noq5wqdlphr6qq0oy4sydjyoq.TaDO7ogis3aEiWEtq);
                    textPaint.setLetterSpacing(noq5wqdlphr6qq0oy4sydjyoq.wdI7vzA3Qmcwd);
                    fDescent = noq5wqdlphr6qq0oy4sydjyoq.KUYypEB4eNWOZWVDpH * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.zOk739gUM7zIZC25HHUxoiyixWFjn;
                rect3.left = compoundPaddingLeft;
                if (this.L8DMw02rUTs2w != 1 || this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getMinLines() > 1) {
                    if (this.L8DMw02rUTs2w != 0 || getHintMaxLines() == 1) {
                        i5 = 0;
                    } else {
                        textPaint.setTextSize(noq5wqdlphr6qq0oy4sydjyoq.NSjgqmGjEzuugn2SsG1mZFP);
                        textPaint.setTypeface(noq5wqdlphr6qq0oy4sydjyoq.TaDO7ogis3aEiWEtq);
                        textPaint.setLetterSpacing(noq5wqdlphr6qq0oy4sydjyoq.wdI7vzA3Qmcwd);
                        i5 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getCompoundPaddingTop() + rect.top) - i5;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.L8DMw02rUTs2w != 1 || this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getMinLines() > 1) ? rect.bottom - this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i13 = rect3.left;
                int i14 = rect3.top;
                int i15 = rect3.right;
                Rect rect4 = noq5wqdlphr6qq0oy4sydjyoq.V57tEvNfxZVVcOCAOih5PKr;
                if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom || true != noq5wqdlphr6qq0oy4sydjyoq.ubNpdCC1pl7L) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    noq5wqdlphr6qq0oy4sydjyoq.ymT6yQrus3w = true;
                    noq5wqdlphr6qq0oy4sydjyoq.ubNpdCC1pl7L = true;
                }
                noq5wqdlphr6qq0oy4sydjyoq.M9e7PWhFYLD2lOGMker(false);
                if (!ZLZeBXTMq0zDztBxtRTuCHrapQ() || this.h2b7InwIaORKN91X7whfQh4) {
                    return;
                }
                KUYypEB4eNWOZWVDpH();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.nNOZCSz1a7S;
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (!z) {
            eswemxjomezu.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.nNOZCSz1a7S = true;
        }
        if (this.Irh5auREsoeV1C1RaBamlmy != null && (editText = this.ZLZeBXTMq0zDztBxtRTuCHrapQ) != null) {
            this.Irh5auREsoeV1C1RaBamlmy.setGravity(editText.getGravity());
            this.Irh5auREsoeV1C1RaBamlmy.setPadding(this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getCompoundPaddingLeft(), this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getCompoundPaddingTop(), this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getCompoundPaddingRight(), this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getCompoundPaddingBottom());
        }
        eswemxjomezu.q1wNbhk2O6();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getMeasuredWidth() - this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getCompoundPaddingLeft()) - this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getCompoundPaddingRight();
        noQ5wqDlpHr6qq0OY4sYdJyOQ noq5wqdlphr6qq0oy4sydjyoq = this.r0dB0ojIy6g8mnk1;
        TextPaint textPaint = noq5wqdlphr6qq0oy4sydjyoq.wRCD0SdqWCowdYU7bmzN;
        textPaint.setTextSize(noq5wqdlphr6qq0oy4sydjyoq.GI83zq0G8e7zkn);
        textPaint.setTypeface(noq5wqdlphr6qq0oy4sydjyoq.jW7EiD0YL6xkbB158jMUzhWNWb1y);
        textPaint.setLetterSpacing(noq5wqdlphr6qq0oy4sydjyoq.vXWl0o6I4U59CgHs9);
        float f2 = measuredWidth;
        noq5wqdlphr6qq0oy4sydjyoq.rE05n5RsRkyWKIeA9cmLXAKv4Hze = noq5wqdlphr6qq0oy4sydjyoq.LaeGQIruHQu81hfJldjMOQSVblH3x(noq5wqdlphr6qq0oy4sydjyoq.BJQHddi0Plr5ElWetCyaixWOg9, textPaint, noq5wqdlphr6qq0oy4sydjyoq.SuB3hEmTmbbRGAhtvOOmfKEon, (noq5wqdlphr6qq0oy4sydjyoq.GI83zq0G8e7zkn / noq5wqdlphr6qq0oy4sydjyoq.NSjgqmGjEzuugn2SsG1mZFP) * f2, noq5wqdlphr6qq0oy4sydjyoq.aXO0LSrt8bKV).getHeight();
        textPaint.setTextSize(noq5wqdlphr6qq0oy4sydjyoq.NSjgqmGjEzuugn2SsG1mZFP);
        textPaint.setTypeface(noq5wqdlphr6qq0oy4sydjyoq.TaDO7ogis3aEiWEtq);
        textPaint.setLetterSpacing(noq5wqdlphr6qq0oy4sydjyoq.wdI7vzA3Qmcwd);
        noq5wqdlphr6qq0oy4sydjyoq.p6bBrs4p3Ly = noq5wqdlphr6qq0oy4sydjyoq.LaeGQIruHQu81hfJldjMOQSVblH3x(noq5wqdlphr6qq0oy4sydjyoq.bjhcQ0u7VT2OYYrwk96HrWoN, textPaint, noq5wqdlphr6qq0oy4sydjyoq.SuB3hEmTmbbRGAhtvOOmfKEon, f2, noq5wqdlphr6qq0oy4sydjyoq.aXO0LSrt8bKV).getHeight();
        EditText editText2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        Rect rect = this.KYZ9RyuOc42A2J;
        EzcAu1qMbZ8VCMhJVRO7.VxUQ9tBhpHJ2AAEDNW8sghc4m(this, editText2, rect);
        Rect rectZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR(rect);
        int i3 = rectZfQNn8hdWlEQ5cR94249PDsLR.left;
        int i4 = rectZfQNn8hdWlEQ5cR94249PDsLR.top;
        int i5 = rectZfQNn8hdWlEQ5cR94249PDsLR.right;
        int i6 = rectZfQNn8hdWlEQ5cR94249PDsLR.bottom;
        Rect rect2 = noq5wqdlphr6qq0oy4sydjyoq.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (rect2.left != i3 || rect2.top != i4 || rect2.right != i5 || rect2.bottom != i6) {
            rect2.set(i3, i4, i5, i6);
            noq5wqdlphr6qq0oy4sydjyoq.ymT6yQrus3w = true;
        }
        TaDO7ogis3aEiWEtq();
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
            return;
        }
        int i7 = noq5wqdlphr6qq0oy4sydjyoq.p6bBrs4p3Ly;
        if (i7 != -1) {
            f = i7;
        } else {
            TextPaint textPaint2 = noq5wqdlphr6qq0oy4sydjyoq.wRCD0SdqWCowdYU7bmzN;
            textPaint2.setTextSize(noq5wqdlphr6qq0oy4sydjyoq.NSjgqmGjEzuugn2SsG1mZFP);
            textPaint2.setTypeface(noq5wqdlphr6qq0oy4sydjyoq.TaDO7ogis3aEiWEtq);
            textPaint2.setLetterSpacing(noq5wqdlphr6qq0oy4sydjyoq.wdI7vzA3Qmcwd);
            f = -textPaint2.ascent();
        }
        if (this.vBGA6pPLqSMuYGvprl270j7 != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.Irh5auREsoeV1C1RaBamlmy.getPaint());
            textPaint3.setTextSize(this.Irh5auREsoeV1C1RaBamlmy.getTextSize());
            textPaint3.setTypeface(this.Irh5auREsoeV1C1RaBamlmy.getTypeface());
            textPaint3.setLetterSpacing(this.Irh5auREsoeV1C1RaBamlmy.getLetterSpacing());
            xPkmmA8xByE6WyLiH xpkmma8xbye6wylih = new xPkmmA8xByE6WyLiH(this.vBGA6pPLqSMuYGvprl270j7, textPaint3, measuredWidth);
            xpkmma8xbye6wylih.HzCpKshMOoaw76hFcbOVRYMeRd = getLayoutDirection() == 1;
            xpkmma8xbye6wylih.M9e7PWhFYLD2lOGMker = true;
            float lineSpacingExtra = this.Irh5auREsoeV1C1RaBamlmy.getLineSpacingExtra();
            float lineSpacingMultiplier = this.Irh5auREsoeV1C1RaBamlmy.getLineSpacingMultiplier();
            xpkmma8xbye6wylih.ZLZeBXTMq0zDztBxtRTuCHrapQ = lineSpacingExtra;
            xpkmma8xbye6wylih.NSjgqmGjEzuugn2SsG1mZFP = lineSpacingMultiplier;
            xpkmma8xbye6wylih.q1wNbhk2O6 = new Jc01di1Hsv(5, this);
            fZIvmSL0wzmmKGc3X39b2Gw2mUGE = (this.L8DMw02rUTs2w == 1 ? noq5wqdlphr6qq0oy4sydjyoq.zIvmSL0wzmmKGc3X39b2Gw2mUGE() + this.lQ0rO9lhQIyVe7Rp6 + this.zIvmSL0wzmmKGc3X39b2Gw2mUGE : 0.0f) + xpkmma8xbye6wylih.VxUQ9tBhpHJ2AAEDNW8sghc4m().getHeight();
        }
        float fMax = Math.max(f, fZIvmSL0wzmmKGc3X39b2Gw2mUGE);
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getMeasuredHeight() < fMax) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof t7eI2PwFOa)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        t7eI2PwFOa t7ei2pwfoa = (t7eI2PwFOa) parcelable;
        super.onRestoreInstanceState(t7ei2pwfoa.V57tEvNfxZVVcOCAOih5PKr);
        setError(t7ei2pwfoa.LaeGQIruHQu81hfJldjMOQSVblH3x);
        if (t7ei2pwfoa.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            post(new RfOSIaL6qUBGKJY9MSCBP5ba(13, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.wRCD0SdqWCowdYU7bmzN) {
            WBbGwHQ7q5Zp0OIijyR wBbGwHQ7q5Zp0OIijyR = this.YdNRGRc4rly.LaeGQIruHQu81hfJldjMOQSVblH3x;
            RectF rectF = this.GE1sqSYiEYQO2ew7WEZwTtUeS5;
            float fVxUQ9tBhpHJ2AAEDNW8sghc4m = wBbGwHQ7q5Zp0OIijyR.VxUQ9tBhpHJ2AAEDNW8sghc4m(rectF);
            float fVxUQ9tBhpHJ2AAEDNW8sghc4m2 = this.YdNRGRc4rly.zIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m(rectF);
            float fVxUQ9tBhpHJ2AAEDNW8sghc4m3 = this.YdNRGRc4rly.NSjgqmGjEzuugn2SsG1mZFP.VxUQ9tBhpHJ2AAEDNW8sghc4m(rectF);
            float fVxUQ9tBhpHJ2AAEDNW8sghc4m4 = this.YdNRGRc4rly.ZLZeBXTMq0zDztBxtRTuCHrapQ.VxUQ9tBhpHJ2AAEDNW8sghc4m(rectF);
            XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b = this.YdNRGRc4rly;
            FLWIoSaHb1q8TqFvEBgPyRGrzvi6 fLWIoSaHb1q8TqFvEBgPyRGrzvi6 = xdVIZOnOVHGi6uYUaae4zAI94b.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            FLWIoSaHb1q8TqFvEBgPyRGrzvi6 fLWIoSaHb1q8TqFvEBgPyRGrzvi62 = xdVIZOnOVHGi6uYUaae4zAI94b.zzpBGItXfub0yWj;
            FLWIoSaHb1q8TqFvEBgPyRGrzvi6 fLWIoSaHb1q8TqFvEBgPyRGrzvi63 = xdVIZOnOVHGi6uYUaae4zAI94b.ZfQNn8hdWlEQ5cR94249PDsLR;
            FLWIoSaHb1q8TqFvEBgPyRGrzvi6 fLWIoSaHb1q8TqFvEBgPyRGrzvi64 = xdVIZOnOVHGi6uYUaae4zAI94b.V57tEvNfxZVVcOCAOih5PKr;
            IN79WcIk5xB4t0GjRT43qPLs5 iN79WcIk5xB4t0GjRT43qPLs5 = new IN79WcIk5xB4t0GjRT43qPLs5(0);
            IN79WcIk5xB4t0GjRT43qPLs5 iN79WcIk5xB4t0GjRT43qPLs52 = new IN79WcIk5xB4t0GjRT43qPLs5(0);
            IN79WcIk5xB4t0GjRT43qPLs5 iN79WcIk5xB4t0GjRT43qPLs53 = new IN79WcIk5xB4t0GjRT43qPLs5(0);
            IN79WcIk5xB4t0GjRT43qPLs5 iN79WcIk5xB4t0GjRT43qPLs54 = new IN79WcIk5xB4t0GjRT43qPLs5(0);
            ZOzTbMJxsw zOzTbMJxsw = new ZOzTbMJxsw(fVxUQ9tBhpHJ2AAEDNW8sghc4m2);
            ZOzTbMJxsw zOzTbMJxsw2 = new ZOzTbMJxsw(fVxUQ9tBhpHJ2AAEDNW8sghc4m);
            ZOzTbMJxsw zOzTbMJxsw3 = new ZOzTbMJxsw(fVxUQ9tBhpHJ2AAEDNW8sghc4m4);
            ZOzTbMJxsw zOzTbMJxsw4 = new ZOzTbMJxsw(fVxUQ9tBhpHJ2AAEDNW8sghc4m3);
            XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b2 = new XdVIZOnOVHGi6uYUaae4zAI94b();
            xdVIZOnOVHGi6uYUaae4zAI94b2.VxUQ9tBhpHJ2AAEDNW8sghc4m = fLWIoSaHb1q8TqFvEBgPyRGrzvi62;
            xdVIZOnOVHGi6uYUaae4zAI94b2.zzpBGItXfub0yWj = fLWIoSaHb1q8TqFvEBgPyRGrzvi6;
            xdVIZOnOVHGi6uYUaae4zAI94b2.V57tEvNfxZVVcOCAOih5PKr = fLWIoSaHb1q8TqFvEBgPyRGrzvi63;
            xdVIZOnOVHGi6uYUaae4zAI94b2.ZfQNn8hdWlEQ5cR94249PDsLR = fLWIoSaHb1q8TqFvEBgPyRGrzvi64;
            xdVIZOnOVHGi6uYUaae4zAI94b2.LaeGQIruHQu81hfJldjMOQSVblH3x = zOzTbMJxsw;
            xdVIZOnOVHGi6uYUaae4zAI94b2.zIvmSL0wzmmKGc3X39b2Gw2mUGE = zOzTbMJxsw2;
            xdVIZOnOVHGi6uYUaae4zAI94b2.ZLZeBXTMq0zDztBxtRTuCHrapQ = zOzTbMJxsw4;
            xdVIZOnOVHGi6uYUaae4zAI94b2.NSjgqmGjEzuugn2SsG1mZFP = zOzTbMJxsw3;
            xdVIZOnOVHGi6uYUaae4zAI94b2.GI83zq0G8e7zkn = iN79WcIk5xB4t0GjRT43qPLs5;
            xdVIZOnOVHGi6uYUaae4zAI94b2.M9e7PWhFYLD2lOGMker = iN79WcIk5xB4t0GjRT43qPLs52;
            xdVIZOnOVHGi6uYUaae4zAI94b2.HzCpKshMOoaw76hFcbOVRYMeRd = iN79WcIk5xB4t0GjRT43qPLs53;
            xdVIZOnOVHGi6uYUaae4zAI94b2.KUYypEB4eNWOZWVDpH = iN79WcIk5xB4t0GjRT43qPLs54;
            this.wRCD0SdqWCowdYU7bmzN = z;
            setShapeAppearanceModel(xdVIZOnOVHGi6uYUaae4zAI94b2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        t7eI2PwFOa t7ei2pwfoa = new t7eI2PwFOa(super.onSaveInstanceState());
        if (Ca81ebIan1u()) {
            t7ei2pwfoa.LaeGQIruHQu81hfJldjMOQSVblH3x = getError();
        }
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        t7ei2pwfoa.zIvmSL0wzmmKGc3X39b2Gw2mUGE = eswemxjomezu.HzCpKshMOoaw76hFcbOVRYMeRd != 0 && eswemxjomezu.GI83zq0G8e7zkn.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        return t7ei2pwfoa;
    }

    public final void p59rPv72J9(lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa, int i) {
        try {
            lzuj2xiohpzadsoz1vjvxa.setTextAppearance(i);
            if (lzuj2xiohpzadsoz1vjvxa.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        lzuj2xiohpzadsoz1vjvxa.setTextAppearance(com.vdodsodjsdt.R.style.TextAppearance_AppCompat_Caption);
        lzuj2xiohpzadsoz1vjvxa.setTextColor(getContext().getColor(com.vdodsodjsdt.R.color.design_error));
    }

    public final void pYmKDYlAmhudp() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = this.ko09zE6UAgwkV;
        if (lzuj2xiohpzadsoz1vjvxa != null) {
            p59rPv72J9(lzuj2xiohpzadsoz1vjvxa, this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv ? this.jW7EiD0YL6xkbB158jMUzhWNWb1y : this.f6ZQsR6bPLvvCDNXOUc);
            if (!this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv && (colorStateList2 = this.SuB3hEmTmbbRGAhtvOOmfKEon) != null) {
                this.ko09zE6UAgwkV.setTextColor(colorStateList2);
            }
            if (!this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv || (colorStateList = this.pzqP2AqKW6J5PO8zCKnW) == null) {
                return;
            }
            this.ko09zE6UAgwkV.setTextColor(colorStateList);
        }
    }

    public final void q11o1hieEkZDhF1MGOZI26oZiDT(Editable editable) {
        ((ojJdkROPjZ) this.pYmKDYlAmhudp).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.V57tEvNfxZVVcOCAOih5PKr;
        if (length != 0 || this.h2b7InwIaORKN91X7whfQh4) {
            lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = this.Irh5auREsoeV1C1RaBamlmy;
            if (lzuj2xiohpzadsoz1vjvxa == null || !this.TaDO7ogis3aEiWEtq) {
                return;
            }
            lzuj2xiohpzadsoz1vjvxa.setText((CharSequence) null);
            ORBZw1rSo0ao2WcPyTXuENVqH.VxUQ9tBhpHJ2AAEDNW8sghc4m(frameLayout, this.qNPQb1obP7);
            this.Irh5auREsoeV1C1RaBamlmy.setVisibility(4);
            return;
        }
        if (this.Irh5auREsoeV1C1RaBamlmy == null || !this.TaDO7ogis3aEiWEtq || TextUtils.isEmpty(this.vBGA6pPLqSMuYGvprl270j7)) {
            return;
        }
        this.Irh5auREsoeV1C1RaBamlmy.setText(this.vBGA6pPLqSMuYGvprl270j7);
        ORBZw1rSo0ao2WcPyTXuENVqH.VxUQ9tBhpHJ2AAEDNW8sghc4m(frameLayout, this.RhfGHxtXxy0M0grmp2jkRjQg);
        this.Irh5auREsoeV1C1RaBamlmy.setVisibility(0);
        this.Irh5auREsoeV1C1RaBamlmy.bringToFront();
    }

    public void setBoxBackgroundColor(int i) {
        if (this.wdI7vzA3Qmcwd != i) {
            this.wdI7vzA3Qmcwd = i;
            this.tpEo0fy9FaoJYrSFHRfIK6 = i;
            this.AFOcXGdvoTMuqwiG8tD = i;
            this.BDoqAMf0rlMRAnVghjC4qjG = i;
            V57tEvNfxZVVcOCAOih5PKr();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.tpEo0fy9FaoJYrSFHRfIK6 = defaultColor;
        this.wdI7vzA3Qmcwd = defaultColor;
        this.e1gEV3X9xwmHj = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.AFOcXGdvoTMuqwiG8tD = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.BDoqAMf0rlMRAnVghjC4qjG = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        V57tEvNfxZVVcOCAOih5PKr();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.L8DMw02rUTs2w) {
            return;
        }
        this.L8DMw02rUTs2w = i;
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ != null) {
            HzCpKshMOoaw76hFcbOVRYMeRd();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.lQ0rO9lhQIyVe7Rp6 = i;
    }

    public void setBoxCornerFamily(int i) {
        jFJXX88X4vgYX5CG85l5EyqW8AAH jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE = this.YdNRGRc4rly.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        WBbGwHQ7q5Zp0OIijyR wBbGwHQ7q5Zp0OIijyR = this.YdNRGRc4rly.LaeGQIruHQu81hfJldjMOQSVblH3x;
        jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(i);
        jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.LaeGQIruHQu81hfJldjMOQSVblH3x = wBbGwHQ7q5Zp0OIijyR;
        WBbGwHQ7q5Zp0OIijyR wBbGwHQ7q5Zp0OIijyR2 = this.YdNRGRc4rly.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.zzpBGItXfub0yWj = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(i);
        jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.zIvmSL0wzmmKGc3X39b2Gw2mUGE = wBbGwHQ7q5Zp0OIijyR2;
        WBbGwHQ7q5Zp0OIijyR wBbGwHQ7q5Zp0OIijyR3 = this.YdNRGRc4rly.NSjgqmGjEzuugn2SsG1mZFP;
        jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.ZfQNn8hdWlEQ5cR94249PDsLR = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(i);
        jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.NSjgqmGjEzuugn2SsG1mZFP = wBbGwHQ7q5Zp0OIijyR3;
        WBbGwHQ7q5Zp0OIijyR wBbGwHQ7q5Zp0OIijyR4 = this.YdNRGRc4rly.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.V57tEvNfxZVVcOCAOih5PKr = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(i);
        jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.ZLZeBXTMq0zDztBxtRTuCHrapQ = wBbGwHQ7q5Zp0OIijyR4;
        this.YdNRGRc4rly = jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        V57tEvNfxZVVcOCAOih5PKr();
    }

    public void setBoxStrokeColor(int i) {
        if (this.HAPpjhiCsV9ONY23505HCBI9IX != i) {
            this.HAPpjhiCsV9ONY23505HCBI9IX = i;
            RhfGHxtXxy0M0grmp2jkRjQg();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.ubNpdCC1pl7L = colorStateList.getDefaultColor();
            this.lxWWbfAOLs4jWzd7PSIiIJ = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.wR7sbzHKf9hYV1lxoS6nqyszepWvN = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.HAPpjhiCsV9ONY23505HCBI9IX = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.HAPpjhiCsV9ONY23505HCBI9IX != colorStateList.getDefaultColor()) {
            this.HAPpjhiCsV9ONY23505HCBI9IX = colorStateList.getDefaultColor();
        }
        RhfGHxtXxy0M0grmp2jkRjQg();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.ByTQIhgl7ezGvHXEd != colorStateList) {
            this.ByTQIhgl7ezGvHXEd = colorStateList;
            RhfGHxtXxy0M0grmp2jkRjQg();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.ItrQwCXbty5PZtje5JS = i;
        RhfGHxtXxy0M0grmp2jkRjQg();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.hKs1wlZyvtUNaW1f5ABIGacfPcvX = i;
        RhfGHxtXxy0M0grmp2jkRjQg();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.p59rPv72J9 != z) {
            uGIIbcq05l2iYyEa2AaeeYA ugiibcq05l2iyyea2aaeeya = this.q1wNbhk2O6;
            if (z) {
                lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = new lzuj2xiOHpZAdsoZ1vJvxA(getContext(), null);
                this.ko09zE6UAgwkV = lzuj2xiohpzadsoz1vjvxa;
                lzuj2xiohpzadsoz1vjvxa.setId(com.vdodsodjsdt.R.id.textinput_counter);
                Typeface typeface = this.rERAmyEtGV6ANGszuKcQI;
                if (typeface != null) {
                    this.ko09zE6UAgwkV.setTypeface(typeface);
                }
                this.ko09zE6UAgwkV.setMaxLines(1);
                ugiibcq05l2iyyea2aaeeya.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.ko09zE6UAgwkV, 2);
                ((ViewGroup.MarginLayoutParams) this.ko09zE6UAgwkV.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.vdodsodjsdt.R.dimen.mtrl_textinput_counter_margin_start));
                pYmKDYlAmhudp();
                if (this.ko09zE6UAgwkV != null) {
                    EditText editText = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                    h3jnZRsdwYJfY9UhQCkbvWciwvFHv(editText != null ? editText.getText() : null);
                }
            } else {
                ugiibcq05l2iyyea2aaeeya.ZLZeBXTMq0zDztBxtRTuCHrapQ(this.ko09zE6UAgwkV, 2);
                this.ko09zE6UAgwkV = null;
            }
            this.p59rPv72J9 = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.Ca81ebIan1u != i) {
            if (i > 0) {
                this.Ca81ebIan1u = i;
            } else {
                this.Ca81ebIan1u = -1;
            }
            if (!this.p59rPv72J9 || this.ko09zE6UAgwkV == null) {
                return;
            }
            EditText editText = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            h3jnZRsdwYJfY9UhQCkbvWciwvFHv(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.jW7EiD0YL6xkbB158jMUzhWNWb1y != i) {
            this.jW7EiD0YL6xkbB158jMUzhWNWb1y = i;
            pYmKDYlAmhudp();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.pzqP2AqKW6J5PO8zCKnW != colorStateList) {
            this.pzqP2AqKW6J5PO8zCKnW = colorStateList;
            pYmKDYlAmhudp();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f6ZQsR6bPLvvCDNXOUc != i) {
            this.f6ZQsR6bPLvvCDNXOUc = i;
            pYmKDYlAmhudp();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.SuB3hEmTmbbRGAhtvOOmfKEon != colorStateList) {
            this.SuB3hEmTmbbRGAhtvOOmfKEon = colorStateList;
            pYmKDYlAmhudp();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.aXO0LSrt8bKV != colorStateList) {
            this.aXO0LSrt8bKV = colorStateList;
            ko09zE6UAgwkV();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.vE4yDIjexsP2lGjLaTcB != colorStateList) {
            this.vE4yDIjexsP2lGjLaTcB = colorStateList;
            if (Ca81ebIan1u() || (this.ko09zE6UAgwkV != null && this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv)) {
                ko09zE6UAgwkV();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.rE05n5RsRkyWKIeA9cmLXAKv4Hze = colorStateList;
        this.p6bBrs4p3Ly = colorStateList;
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ != null) {
            Irh5auREsoeV1C1RaBamlmy(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        q1wNbhk2O6(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.GI83zq0G8e7zkn.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.GI83zq0G8e7zkn.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        CharSequence text = i != 0 ? eswemxjomezu.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = eswemxjomezu.GI83zq0G8e7zkn;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        Drawable drawableJW7EiD0YL6xkbB158jMUzhWNWb1y = i != 0 ? KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(eswemxjomezu.getContext(), i) : null;
        TextInputLayout textInputLayout = eswemxjomezu.V57tEvNfxZVVcOCAOih5PKr;
        CheckableImageButton checkableImageButton = eswemxjomezu.GI83zq0G8e7zkn;
        checkableImageButton.setImageDrawable(drawableJW7EiD0YL6xkbB158jMUzhWNWb1y);
        if (drawableJW7EiD0YL6xkbB158jMUzhWNWb1y != null) {
            ej6unYlOWMDF.ZLZeBXTMq0zDztBxtRTuCHrapQ(textInputLayout, checkableImageButton, eswemxjomezu.q1wNbhk2O6, eswemxjomezu.p59rPv72J9);
            ej6unYlOWMDF.lQ0rO9lhQIyVe7Rp6(textInputLayout, checkableImageButton, eswemxjomezu.q1wNbhk2O6);
        }
    }

    public void setEndIconMinSize(int i) {
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i < 0) {
            eswemxjomezu.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != eswemxjomezu.Ca81ebIan1u) {
            eswemxjomezu.Ca81ebIan1u = i;
            CheckableImageButton checkableImageButton = eswemxjomezu.GI83zq0G8e7zkn;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = eswemxjomezu.LaeGQIruHQu81hfJldjMOQSVblH3x;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.ZLZeBXTMq0zDztBxtRTuCHrapQ(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        CheckableImageButton checkableImageButton = eswemxjomezu.GI83zq0G8e7zkn;
        View.OnLongClickListener onLongClickListener = eswemxjomezu.pYmKDYlAmhudp;
        checkableImageButton.setOnClickListener(onClickListener);
        ej6unYlOWMDF.rERAmyEtGV6ANGszuKcQI(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        eswemxjomezu.pYmKDYlAmhudp = onLongClickListener;
        CheckableImageButton checkableImageButton = eswemxjomezu.GI83zq0G8e7zkn;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        ej6unYlOWMDF.rERAmyEtGV6ANGszuKcQI(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        eswemxjomezu.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = scaleType;
        eswemxjomezu.GI83zq0G8e7zkn.setScaleType(scaleType);
        eswemxjomezu.LaeGQIruHQu81hfJldjMOQSVblH3x.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (eswemxjomezu.q1wNbhk2O6 != colorStateList) {
            eswemxjomezu.q1wNbhk2O6 = colorStateList;
            ej6unYlOWMDF.ZLZeBXTMq0zDztBxtRTuCHrapQ(eswemxjomezu.V57tEvNfxZVVcOCAOih5PKr, eswemxjomezu.GI83zq0G8e7zkn, colorStateList, eswemxjomezu.p59rPv72J9);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (eswemxjomezu.p59rPv72J9 != mode) {
            eswemxjomezu.p59rPv72J9 = mode;
            ej6unYlOWMDF.ZLZeBXTMq0zDztBxtRTuCHrapQ(eswemxjomezu.V57tEvNfxZVVcOCAOih5PKr, eswemxjomezu.GI83zq0G8e7zkn, eswemxjomezu.q1wNbhk2O6, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.NSjgqmGjEzuugn2SsG1mZFP(z);
    }

    public void setError(CharSequence charSequence) {
        uGIIbcq05l2iYyEa2AaeeYA ugiibcq05l2iyyea2aaeeya = this.q1wNbhk2O6;
        if (!ugiibcq05l2iyyea2aaeeya.pYmKDYlAmhudp) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            ugiibcq05l2iyyea2aaeeya.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
            return;
        }
        ugiibcq05l2iyyea2aaeeya.V57tEvNfxZVVcOCAOih5PKr();
        ugiibcq05l2iyyea2aaeeya.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = charSequence;
        ugiibcq05l2iyyea2aaeeya.ko09zE6UAgwkV.setText(charSequence);
        int i = ugiibcq05l2iyyea2aaeeya.p59rPv72J9;
        if (i != 1) {
            ugiibcq05l2iyyea2aaeeya.Ca81ebIan1u = 1;
        }
        ugiibcq05l2iyyea2aaeeya.GI83zq0G8e7zkn(i, ugiibcq05l2iyyea2aaeeya.Ca81ebIan1u, ugiibcq05l2iyyea2aaeeya.NSjgqmGjEzuugn2SsG1mZFP(ugiibcq05l2iyyea2aaeeya.ko09zE6UAgwkV, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        uGIIbcq05l2iYyEa2AaeeYA ugiibcq05l2iyyea2aaeeya = this.q1wNbhk2O6;
        ugiibcq05l2iyyea2aaeeya.f6ZQsR6bPLvvCDNXOUc = i;
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = ugiibcq05l2iyyea2aaeeya.ko09zE6UAgwkV;
        if (lzuj2xiohpzadsoz1vjvxa != null) {
            lzuj2xiohpzadsoz1vjvxa.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        uGIIbcq05l2iYyEa2AaeeYA ugiibcq05l2iyyea2aaeeya = this.q1wNbhk2O6;
        ugiibcq05l2iyyea2aaeeya.jW7EiD0YL6xkbB158jMUzhWNWb1y = charSequence;
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = ugiibcq05l2iyyea2aaeeya.ko09zE6UAgwkV;
        if (lzuj2xiohpzadsoz1vjvxa != null) {
            lzuj2xiohpzadsoz1vjvxa.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        uGIIbcq05l2iYyEa2AaeeYA ugiibcq05l2iyyea2aaeeya = this.q1wNbhk2O6;
        TextInputLayout textInputLayout = ugiibcq05l2iyyea2aaeeya.NSjgqmGjEzuugn2SsG1mZFP;
        if (ugiibcq05l2iyyea2aaeeya.pYmKDYlAmhudp == z) {
            return;
        }
        ugiibcq05l2iyyea2aaeeya.V57tEvNfxZVVcOCAOih5PKr();
        if (z) {
            lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = new lzuj2xiOHpZAdsoZ1vJvxA(ugiibcq05l2iyyea2aaeeya.ZLZeBXTMq0zDztBxtRTuCHrapQ, null);
            ugiibcq05l2iyyea2aaeeya.ko09zE6UAgwkV = lzuj2xiohpzadsoz1vjvxa;
            lzuj2xiohpzadsoz1vjvxa.setId(com.vdodsodjsdt.R.id.textinput_error);
            ugiibcq05l2iyyea2aaeeya.ko09zE6UAgwkV.setTextAlignment(5);
            Typeface typeface = ugiibcq05l2iyyea2aaeeya.SuB3hEmTmbbRGAhtvOOmfKEon;
            if (typeface != null) {
                ugiibcq05l2iyyea2aaeeya.ko09zE6UAgwkV.setTypeface(typeface);
            }
            int i = ugiibcq05l2iyyea2aaeeya.vBGA6pPLqSMuYGvprl270j7;
            ugiibcq05l2iyyea2aaeeya.vBGA6pPLqSMuYGvprl270j7 = i;
            lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa2 = ugiibcq05l2iyyea2aaeeya.ko09zE6UAgwkV;
            if (lzuj2xiohpzadsoz1vjvxa2 != null) {
                ugiibcq05l2iyyea2aaeeya.NSjgqmGjEzuugn2SsG1mZFP.p59rPv72J9(lzuj2xiohpzadsoz1vjvxa2, i);
            }
            ColorStateList colorStateList = ugiibcq05l2iyyea2aaeeya.TaDO7ogis3aEiWEtq;
            ugiibcq05l2iyyea2aaeeya.TaDO7ogis3aEiWEtq = colorStateList;
            lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa3 = ugiibcq05l2iyyea2aaeeya.ko09zE6UAgwkV;
            if (lzuj2xiohpzadsoz1vjvxa3 != null && colorStateList != null) {
                lzuj2xiohpzadsoz1vjvxa3.setTextColor(colorStateList);
            }
            CharSequence charSequence = ugiibcq05l2iyyea2aaeeya.jW7EiD0YL6xkbB158jMUzhWNWb1y;
            ugiibcq05l2iyyea2aaeeya.jW7EiD0YL6xkbB158jMUzhWNWb1y = charSequence;
            lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa4 = ugiibcq05l2iyyea2aaeeya.ko09zE6UAgwkV;
            if (lzuj2xiohpzadsoz1vjvxa4 != null) {
                lzuj2xiohpzadsoz1vjvxa4.setContentDescription(charSequence);
            }
            int i2 = ugiibcq05l2iyyea2aaeeya.f6ZQsR6bPLvvCDNXOUc;
            ugiibcq05l2iyyea2aaeeya.f6ZQsR6bPLvvCDNXOUc = i2;
            lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa5 = ugiibcq05l2iyyea2aaeeya.ko09zE6UAgwkV;
            if (lzuj2xiohpzadsoz1vjvxa5 != null) {
                lzuj2xiohpzadsoz1vjvxa5.setAccessibilityLiveRegion(i2);
            }
            ugiibcq05l2iyyea2aaeeya.ko09zE6UAgwkV.setVisibility(4);
            ugiibcq05l2iyyea2aaeeya.VxUQ9tBhpHJ2AAEDNW8sghc4m(ugiibcq05l2iyyea2aaeeya.ko09zE6UAgwkV, 0);
        } else {
            ugiibcq05l2iyyea2aaeeya.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
            ugiibcq05l2iyyea2aaeeya.ZLZeBXTMq0zDztBxtRTuCHrapQ(ugiibcq05l2iyyea2aaeeya.ko09zE6UAgwkV, 0);
            ugiibcq05l2iyyea2aaeeya.ko09zE6UAgwkV = null;
            textInputLayout.f6ZQsR6bPLvvCDNXOUc();
            textInputLayout.RhfGHxtXxy0M0grmp2jkRjQg();
        }
        ugiibcq05l2iyyea2aaeeya.pYmKDYlAmhudp = z;
    }

    public void setErrorIconDrawable(int i) {
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        eswemxjomezu.GI83zq0G8e7zkn(i != 0 ? KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(eswemxjomezu.getContext(), i) : null);
        ej6unYlOWMDF.lQ0rO9lhQIyVe7Rp6(eswemxjomezu.V57tEvNfxZVVcOCAOih5PKr, eswemxjomezu.LaeGQIruHQu81hfJldjMOQSVblH3x, eswemxjomezu.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        CheckableImageButton checkableImageButton = eswemxjomezu.LaeGQIruHQu81hfJldjMOQSVblH3x;
        View.OnLongClickListener onLongClickListener = eswemxjomezu.NSjgqmGjEzuugn2SsG1mZFP;
        checkableImageButton.setOnClickListener(onClickListener);
        ej6unYlOWMDF.rERAmyEtGV6ANGszuKcQI(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        eswemxjomezu.NSjgqmGjEzuugn2SsG1mZFP = onLongClickListener;
        CheckableImageButton checkableImageButton = eswemxjomezu.LaeGQIruHQu81hfJldjMOQSVblH3x;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        ej6unYlOWMDF.rERAmyEtGV6ANGszuKcQI(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (eswemxjomezu.zIvmSL0wzmmKGc3X39b2Gw2mUGE != colorStateList) {
            eswemxjomezu.zIvmSL0wzmmKGc3X39b2Gw2mUGE = colorStateList;
            ej6unYlOWMDF.ZLZeBXTMq0zDztBxtRTuCHrapQ(eswemxjomezu.V57tEvNfxZVVcOCAOih5PKr, eswemxjomezu.LaeGQIruHQu81hfJldjMOQSVblH3x, colorStateList, eswemxjomezu.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (eswemxjomezu.ZLZeBXTMq0zDztBxtRTuCHrapQ != mode) {
            eswemxjomezu.ZLZeBXTMq0zDztBxtRTuCHrapQ = mode;
            ej6unYlOWMDF.ZLZeBXTMq0zDztBxtRTuCHrapQ(eswemxjomezu.V57tEvNfxZVVcOCAOih5PKr, eswemxjomezu.LaeGQIruHQu81hfJldjMOQSVblH3x, eswemxjomezu.zIvmSL0wzmmKGc3X39b2Gw2mUGE, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        uGIIbcq05l2iYyEa2AaeeYA ugiibcq05l2iyyea2aaeeya = this.q1wNbhk2O6;
        ugiibcq05l2iyyea2aaeeya.vBGA6pPLqSMuYGvprl270j7 = i;
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = ugiibcq05l2iyyea2aaeeya.ko09zE6UAgwkV;
        if (lzuj2xiohpzadsoz1vjvxa != null) {
            ugiibcq05l2iyyea2aaeeya.NSjgqmGjEzuugn2SsG1mZFP.p59rPv72J9(lzuj2xiohpzadsoz1vjvxa, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        uGIIbcq05l2iYyEa2AaeeYA ugiibcq05l2iyyea2aaeeya = this.q1wNbhk2O6;
        ugiibcq05l2iyyea2aaeeya.TaDO7ogis3aEiWEtq = colorStateList;
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = ugiibcq05l2iyyea2aaeeya.ko09zE6UAgwkV;
        if (lzuj2xiohpzadsoz1vjvxa == null || colorStateList == null) {
            return;
        }
        lzuj2xiohpzadsoz1vjvxa.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.G479XgNG9rK8jPPbSXr != z) {
            this.G479XgNG9rK8jPPbSXr = z;
            Irh5auREsoeV1C1RaBamlmy(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        uGIIbcq05l2iYyEa2AaeeYA ugiibcq05l2iyyea2aaeeya = this.q1wNbhk2O6;
        if (zIsEmpty) {
            if (ugiibcq05l2iyyea2aaeeya.q11o1hieEkZDhF1MGOZI26oZiDT) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!ugiibcq05l2iyyea2aaeeya.q11o1hieEkZDhF1MGOZI26oZiDT) {
            setHelperTextEnabled(true);
        }
        ugiibcq05l2iyyea2aaeeya.V57tEvNfxZVVcOCAOih5PKr();
        ugiibcq05l2iyyea2aaeeya.Irh5auREsoeV1C1RaBamlmy = charSequence;
        ugiibcq05l2iyyea2aaeeya.w0Wu95l8dVNw5rZMRu.setText(charSequence);
        int i = ugiibcq05l2iyyea2aaeeya.p59rPv72J9;
        if (i != 2) {
            ugiibcq05l2iyyea2aaeeya.Ca81ebIan1u = 2;
        }
        ugiibcq05l2iyyea2aaeeya.GI83zq0G8e7zkn(i, ugiibcq05l2iyyea2aaeeya.Ca81ebIan1u, ugiibcq05l2iyyea2aaeeya.NSjgqmGjEzuugn2SsG1mZFP(ugiibcq05l2iyyea2aaeeya.w0Wu95l8dVNw5rZMRu, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        uGIIbcq05l2iYyEa2AaeeYA ugiibcq05l2iyyea2aaeeya = this.q1wNbhk2O6;
        ugiibcq05l2iyyea2aaeeya.qNPQb1obP7 = colorStateList;
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = ugiibcq05l2iyyea2aaeeya.w0Wu95l8dVNw5rZMRu;
        if (lzuj2xiohpzadsoz1vjvxa == null || colorStateList == null) {
            return;
        }
        lzuj2xiohpzadsoz1vjvxa.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        uGIIbcq05l2iYyEa2AaeeYA ugiibcq05l2iyyea2aaeeya = this.q1wNbhk2O6;
        TextInputLayout textInputLayout = ugiibcq05l2iyyea2aaeeya.NSjgqmGjEzuugn2SsG1mZFP;
        if (ugiibcq05l2iyyea2aaeeya.q11o1hieEkZDhF1MGOZI26oZiDT == z) {
            return;
        }
        ugiibcq05l2iyyea2aaeeya.V57tEvNfxZVVcOCAOih5PKr();
        if (z) {
            lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = new lzuj2xiOHpZAdsoZ1vJvxA(ugiibcq05l2iyyea2aaeeya.ZLZeBXTMq0zDztBxtRTuCHrapQ, null);
            ugiibcq05l2iyyea2aaeeya.w0Wu95l8dVNw5rZMRu = lzuj2xiohpzadsoz1vjvxa;
            lzuj2xiohpzadsoz1vjvxa.setId(com.vdodsodjsdt.R.id.textinput_helper_text);
            ugiibcq05l2iyyea2aaeeya.w0Wu95l8dVNw5rZMRu.setTextAlignment(5);
            Typeface typeface = ugiibcq05l2iyyea2aaeeya.SuB3hEmTmbbRGAhtvOOmfKEon;
            if (typeface != null) {
                ugiibcq05l2iyyea2aaeeya.w0Wu95l8dVNw5rZMRu.setTypeface(typeface);
            }
            ugiibcq05l2iyyea2aaeeya.w0Wu95l8dVNw5rZMRu.setVisibility(4);
            ugiibcq05l2iyyea2aaeeya.w0Wu95l8dVNw5rZMRu.setAccessibilityLiveRegion(1);
            int i = ugiibcq05l2iyyea2aaeeya.RhfGHxtXxy0M0grmp2jkRjQg;
            ugiibcq05l2iyyea2aaeeya.RhfGHxtXxy0M0grmp2jkRjQg = i;
            lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa2 = ugiibcq05l2iyyea2aaeeya.w0Wu95l8dVNw5rZMRu;
            if (lzuj2xiohpzadsoz1vjvxa2 != null) {
                lzuj2xiohpzadsoz1vjvxa2.setTextAppearance(i);
            }
            ColorStateList colorStateList = ugiibcq05l2iyyea2aaeeya.qNPQb1obP7;
            ugiibcq05l2iyyea2aaeeya.qNPQb1obP7 = colorStateList;
            lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa3 = ugiibcq05l2iyyea2aaeeya.w0Wu95l8dVNw5rZMRu;
            if (lzuj2xiohpzadsoz1vjvxa3 != null && colorStateList != null) {
                lzuj2xiohpzadsoz1vjvxa3.setTextColor(colorStateList);
            }
            ugiibcq05l2iyyea2aaeeya.VxUQ9tBhpHJ2AAEDNW8sghc4m(ugiibcq05l2iyyea2aaeeya.w0Wu95l8dVNw5rZMRu, 1);
            ugiibcq05l2iyyea2aaeeya.w0Wu95l8dVNw5rZMRu.setAccessibilityDelegate(new UZs7drcmMrcfQALnoIa(ugiibcq05l2iyyea2aaeeya));
        } else {
            ugiibcq05l2iyyea2aaeeya.V57tEvNfxZVVcOCAOih5PKr();
            int i2 = ugiibcq05l2iyyea2aaeeya.p59rPv72J9;
            if (i2 == 2) {
                ugiibcq05l2iyyea2aaeeya.Ca81ebIan1u = 0;
            }
            ugiibcq05l2iyyea2aaeeya.GI83zq0G8e7zkn(i2, ugiibcq05l2iyyea2aaeeya.Ca81ebIan1u, ugiibcq05l2iyyea2aaeeya.NSjgqmGjEzuugn2SsG1mZFP(ugiibcq05l2iyyea2aaeeya.w0Wu95l8dVNw5rZMRu, ""));
            ugiibcq05l2iyyea2aaeeya.ZLZeBXTMq0zDztBxtRTuCHrapQ(ugiibcq05l2iyyea2aaeeya.w0Wu95l8dVNw5rZMRu, 1);
            ugiibcq05l2iyyea2aaeeya.w0Wu95l8dVNw5rZMRu = null;
            textInputLayout.f6ZQsR6bPLvvCDNXOUc();
            textInputLayout.RhfGHxtXxy0M0grmp2jkRjQg();
        }
        ugiibcq05l2iyyea2aaeeya.q11o1hieEkZDhF1MGOZI26oZiDT = z;
    }

    public void setHelperTextTextAppearance(int i) {
        uGIIbcq05l2iYyEa2AaeeYA ugiibcq05l2iyyea2aaeeya = this.q1wNbhk2O6;
        ugiibcq05l2iyyea2aaeeya.RhfGHxtXxy0M0grmp2jkRjQg = i;
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = ugiibcq05l2iyyea2aaeeya.w0Wu95l8dVNw5rZMRu;
        if (lzuj2xiohpzadsoz1vjvxa != null) {
            lzuj2xiohpzadsoz1vjvxa.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.O1xDAlBZZlZdoEf747lCFHld) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.Pf1HsU8AK92buCoUaexm5AC = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.O1xDAlBZZlZdoEf747lCFHld) {
            this.O1xDAlBZZlZdoEf747lCFHld = z;
            if (z) {
                CharSequence hint = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.HVEwbdULInpTNa0IG)) {
                        setHint(hint);
                    }
                    this.ZLZeBXTMq0zDztBxtRTuCHrapQ.setHint((CharSequence) null);
                }
                this.y1NaPKTl7R18DOr6e8i5 = true;
            } else {
                this.y1NaPKTl7R18DOr6e8i5 = false;
                if (!TextUtils.isEmpty(this.HVEwbdULInpTNa0IG) && TextUtils.isEmpty(this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getHint())) {
                    this.ZLZeBXTMq0zDztBxtRTuCHrapQ.setHint(this.HVEwbdULInpTNa0IG);
                }
                setHintInternal(null);
            }
            if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ != null) {
                TaDO7ogis3aEiWEtq();
            }
        }
    }

    public void setHintMaxLines(int i) {
        noQ5wqDlpHr6qq0OY4sYdJyOQ noq5wqdlphr6qq0oy4sydjyoq = this.r0dB0ojIy6g8mnk1;
        if (i != noq5wqdlphr6qq0oy4sydjyoq.BJQHddi0Plr5ElWetCyaixWOg9) {
            noq5wqdlphr6qq0oy4sydjyoq.BJQHddi0Plr5ElWetCyaixWOg9 = i;
            noq5wqdlphr6qq0oy4sydjyoq.M9e7PWhFYLD2lOGMker(false);
        }
        if (i != noq5wqdlphr6qq0oy4sydjyoq.bjhcQ0u7VT2OYYrwk96HrWoN) {
            noq5wqdlphr6qq0oy4sydjyoq.bjhcQ0u7VT2OYYrwk96HrWoN = i;
            noq5wqdlphr6qq0oy4sydjyoq.M9e7PWhFYLD2lOGMker(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        noQ5wqDlpHr6qq0OY4sYdJyOQ noq5wqdlphr6qq0oy4sydjyoq = this.r0dB0ojIy6g8mnk1;
        TextInputLayout textInputLayout = noq5wqdlphr6qq0oy4sydjyoq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        GXZVLd372jtPv6 gXZVLd372jtPv6 = new GXZVLd372jtPv6(textInputLayout.getContext(), i);
        ColorStateList colorStateList = gXZVLd372jtPv6.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (colorStateList != null) {
            noq5wqdlphr6qq0oy4sydjyoq.HzCpKshMOoaw76hFcbOVRYMeRd = colorStateList;
        }
        float f = gXZVLd372jtPv6.KUYypEB4eNWOZWVDpH;
        if (f != 0.0f) {
            noq5wqdlphr6qq0oy4sydjyoq.GI83zq0G8e7zkn = f;
        }
        ColorStateList colorStateList2 = gXZVLd372jtPv6.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (colorStateList2 != null) {
            noq5wqdlphr6qq0oy4sydjyoq.hKs1wlZyvtUNaW1f5ABIGacfPcvX = colorStateList2;
        }
        noq5wqdlphr6qq0oy4sydjyoq.JUdwvN8LfOMa = gXZVLd372jtPv6.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        noq5wqdlphr6qq0oy4sydjyoq.ItrQwCXbty5PZtje5JS = gXZVLd372jtPv6.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        noq5wqdlphr6qq0oy4sydjyoq.lQ0rO9lhQIyVe7Rp6 = gXZVLd372jtPv6.NSjgqmGjEzuugn2SsG1mZFP;
        noq5wqdlphr6qq0oy4sydjyoq.vXWl0o6I4U59CgHs9 = gXZVLd372jtPv6.M9e7PWhFYLD2lOGMker;
        p9IyQAUniR p9iyqaunir = noq5wqdlphr6qq0oy4sydjyoq.RhfGHxtXxy0M0grmp2jkRjQg;
        if (p9iyqaunir != null) {
            p9iyqaunir.q1wNbhk2O6 = true;
        }
        Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ = new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(10, noq5wqdlphr6qq0oy4sydjyoq);
        gXZVLd372jtPv6.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        noq5wqdlphr6qq0oy4sydjyoq.RhfGHxtXxy0M0grmp2jkRjQg = new p9IyQAUniR(skgk8FYn8b4TvRiBOsElZw4XkNLhQ, gXZVLd372jtPv6.h3jnZRsdwYJfY9UhQCkbvWciwvFHv);
        gXZVLd372jtPv6.zzpBGItXfub0yWj(textInputLayout.getContext(), noq5wqdlphr6qq0oy4sydjyoq.RhfGHxtXxy0M0grmp2jkRjQg);
        noq5wqdlphr6qq0oy4sydjyoq.M9e7PWhFYLD2lOGMker(false);
        this.p6bBrs4p3Ly = noq5wqdlphr6qq0oy4sydjyoq.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ != null) {
            Irh5auREsoeV1C1RaBamlmy(false, false);
            TaDO7ogis3aEiWEtq();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.p6bBrs4p3Ly != colorStateList) {
            if (this.rE05n5RsRkyWKIeA9cmLXAKv4Hze == null) {
                noQ5wqDlpHr6qq0OY4sYdJyOQ noq5wqdlphr6qq0oy4sydjyoq = this.r0dB0ojIy6g8mnk1;
                if (noq5wqdlphr6qq0oy4sydjyoq.HzCpKshMOoaw76hFcbOVRYMeRd != colorStateList) {
                    noq5wqdlphr6qq0oy4sydjyoq.HzCpKshMOoaw76hFcbOVRYMeRd = colorStateList;
                    noq5wqdlphr6qq0oy4sydjyoq.M9e7PWhFYLD2lOGMker(false);
                }
            }
            this.p6bBrs4p3Ly = colorStateList;
            if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ != null) {
                Irh5auREsoeV1C1RaBamlmy(false, false);
            }
        }
    }

    public void setLengthCounter(W4Qt2NT8WTRWgps7H7wRotB1F w4Qt2NT8WTRWgps7H7wRotB1F) {
        this.pYmKDYlAmhudp = w4Qt2NT8WTRWgps7H7wRotB1F;
    }

    public void setMaxEms(int i) {
        this.M9e7PWhFYLD2lOGMker = i;
        EditText editText = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.KUYypEB4eNWOZWVDpH = i;
        EditText editText = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.GI83zq0G8e7zkn = i;
        EditText editText = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.HzCpKshMOoaw76hFcbOVRYMeRd = i;
        EditText editText = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        eswemxjomezu.GI83zq0G8e7zkn.setContentDescription(i != 0 ? eswemxjomezu.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        eswemxjomezu.GI83zq0G8e7zkn.setImageDrawable(i != 0 ? KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(eswemxjomezu.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (z && eswemxjomezu.HzCpKshMOoaw76hFcbOVRYMeRd != 1) {
            eswemxjomezu.ZLZeBXTMq0zDztBxtRTuCHrapQ(1);
        } else if (z) {
            eswemxjomezu.getClass();
        } else {
            eswemxjomezu.ZLZeBXTMq0zDztBxtRTuCHrapQ(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        eswemxjomezu.q1wNbhk2O6 = colorStateList;
        ej6unYlOWMDF.ZLZeBXTMq0zDztBxtRTuCHrapQ(eswemxjomezu.V57tEvNfxZVVcOCAOih5PKr, eswemxjomezu.GI83zq0G8e7zkn, colorStateList, eswemxjomezu.p59rPv72J9);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        eswemxjomezu.p59rPv72J9 = mode;
        ej6unYlOWMDF.ZLZeBXTMq0zDztBxtRTuCHrapQ(eswemxjomezu.V57tEvNfxZVVcOCAOih5PKr, eswemxjomezu.GI83zq0G8e7zkn, eswemxjomezu.q1wNbhk2O6, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.Irh5auREsoeV1C1RaBamlmy == null) {
            lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = new lzuj2xiOHpZAdsoZ1vJvxA(getContext(), null);
            this.Irh5auREsoeV1C1RaBamlmy = lzuj2xiohpzadsoz1vjvxa;
            lzuj2xiohpzadsoz1vjvxa.setId(com.vdodsodjsdt.R.id.textinput_placeholder);
            this.Irh5auREsoeV1C1RaBamlmy.setImportantForAccessibility(1);
            this.Irh5auREsoeV1C1RaBamlmy.setAccessibilityLiveRegion(1);
            Zx36ytjSPbRH1S3UCiHxPrB8TD zx36ytjSPbRH1S3UCiHxPrB8TDZIvmSL0wzmmKGc3X39b2Gw2mUGE = zIvmSL0wzmmKGc3X39b2Gw2mUGE();
            this.RhfGHxtXxy0M0grmp2jkRjQg = zx36ytjSPbRH1S3UCiHxPrB8TDZIvmSL0wzmmKGc3X39b2Gw2mUGE;
            zx36ytjSPbRH1S3UCiHxPrB8TDZIvmSL0wzmmKGc3X39b2Gw2mUGE.ZfQNn8hdWlEQ5cR94249PDsLR = 67L;
            this.qNPQb1obP7 = zIvmSL0wzmmKGc3X39b2Gw2mUGE();
            setPlaceholderTextAppearance(this.w0Wu95l8dVNw5rZMRu);
            setPlaceholderTextColor(this.q11o1hieEkZDhF1MGOZI26oZiDT);
            xb0r6yEzq0tw9m7nTWG5BFR8.q1wNbhk2O6(this.Irh5auREsoeV1C1RaBamlmy, new H1cfFcamW7T7(4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.TaDO7ogis3aEiWEtq) {
                setPlaceholderTextEnabled(true);
            }
            this.vBGA6pPLqSMuYGvprl270j7 = charSequence;
        }
        EditText editText = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        q11o1hieEkZDhF1MGOZI26oZiDT(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.w0Wu95l8dVNw5rZMRu = i;
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = this.Irh5auREsoeV1C1RaBamlmy;
        if (lzuj2xiohpzadsoz1vjvxa != null) {
            lzuj2xiohpzadsoz1vjvxa.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.q11o1hieEkZDhF1MGOZI26oZiDT != colorStateList) {
            this.q11o1hieEkZDhF1MGOZI26oZiDT = colorStateList;
            lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = this.Irh5auREsoeV1C1RaBamlmy;
            if (lzuj2xiohpzadsoz1vjvxa == null || colorStateList == null) {
                return;
            }
            lzuj2xiohpzadsoz1vjvxa.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        xhZAU2F7Zp5 xhzau2f7zp5 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        xhzau2f7zp5.getClass();
        xhzau2f7zp5.LaeGQIruHQu81hfJldjMOQSVblH3x = TextUtils.isEmpty(charSequence) ? null : charSequence;
        xhzau2f7zp5.ZfQNn8hdWlEQ5cR94249PDsLR.setText(charSequence);
        xhzau2f7zp5.LaeGQIruHQu81hfJldjMOQSVblH3x();
    }

    public void setPrefixTextAppearance(int i) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR.ZfQNn8hdWlEQ5cR94249PDsLR.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR.ZfQNn8hdWlEQ5cR94249PDsLR.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b) {
        EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O = this.qygqjTppWwx992;
        if (eQz8nVyVxmIrHN6fNCQWutFG0b30O == null || eQz8nVyVxmIrHN6fNCQWutFG0b30O.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m == xdVIZOnOVHGi6uYUaae4zAI94b) {
            return;
        }
        this.YdNRGRc4rly = xdVIZOnOVHGi6uYUaae4zAI94b;
        V57tEvNfxZVVcOCAOih5PKr();
    }

    public void setStartIconCheckable(boolean z) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        xhZAU2F7Zp5 xhzau2f7zp5 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i < 0) {
            xhzau2f7zp5.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != xhzau2f7zp5.GI83zq0G8e7zkn) {
            xhzau2f7zp5.GI83zq0G8e7zkn = i;
            CheckableImageButton checkableImageButton = xhzau2f7zp5.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        xhZAU2F7Zp5 xhzau2f7zp5 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        CheckableImageButton checkableImageButton = xhzau2f7zp5.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        View.OnLongClickListener onLongClickListener = xhzau2f7zp5.HzCpKshMOoaw76hFcbOVRYMeRd;
        checkableImageButton.setOnClickListener(onClickListener);
        ej6unYlOWMDF.rERAmyEtGV6ANGszuKcQI(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        xhZAU2F7Zp5 xhzau2f7zp5 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        xhzau2f7zp5.HzCpKshMOoaw76hFcbOVRYMeRd = onLongClickListener;
        CheckableImageButton checkableImageButton = xhzau2f7zp5.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        ej6unYlOWMDF.rERAmyEtGV6ANGszuKcQI(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        xhZAU2F7Zp5 xhzau2f7zp5 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        xhzau2f7zp5.M9e7PWhFYLD2lOGMker = scaleType;
        xhzau2f7zp5.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        xhZAU2F7Zp5 xhzau2f7zp5 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (xhzau2f7zp5.ZLZeBXTMq0zDztBxtRTuCHrapQ != colorStateList) {
            xhzau2f7zp5.ZLZeBXTMq0zDztBxtRTuCHrapQ = colorStateList;
            ej6unYlOWMDF.ZLZeBXTMq0zDztBxtRTuCHrapQ(xhzau2f7zp5.V57tEvNfxZVVcOCAOih5PKr, xhzau2f7zp5.zIvmSL0wzmmKGc3X39b2Gw2mUGE, colorStateList, xhzau2f7zp5.NSjgqmGjEzuugn2SsG1mZFP);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        xhZAU2F7Zp5 xhzau2f7zp5 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (xhzau2f7zp5.NSjgqmGjEzuugn2SsG1mZFP != mode) {
            xhzau2f7zp5.NSjgqmGjEzuugn2SsG1mZFP = mode;
            ej6unYlOWMDF.ZLZeBXTMq0zDztBxtRTuCHrapQ(xhzau2f7zp5.V57tEvNfxZVVcOCAOih5PKr, xhzau2f7zp5.zIvmSL0wzmmKGc3X39b2Gw2mUGE, xhzau2f7zp5.ZLZeBXTMq0zDztBxtRTuCHrapQ, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        eswemxjomezu.getClass();
        eswemxjomezu.ko09zE6UAgwkV = TextUtils.isEmpty(charSequence) ? null : charSequence;
        eswemxjomezu.jW7EiD0YL6xkbB158jMUzhWNWb1y.setText(charSequence);
        eswemxjomezu.p59rPv72J9();
    }

    public void setSuffixTextAppearance(int i) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.jW7EiD0YL6xkbB158jMUzhWNWb1y.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.jW7EiD0YL6xkbB158jMUzhWNWb1y.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(I7ekItPvKv4lN i7ekItPvKv4lN) {
        EditText editText = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (editText != null) {
            xb0r6yEzq0tw9m7nTWG5BFR8.q1wNbhk2O6(editText, i7ekItPvKv4lN);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.rERAmyEtGV6ANGszuKcQI) {
            this.rERAmyEtGV6ANGszuKcQI = typeface;
            this.r0dB0ojIy6g8mnk1.p59rPv72J9(typeface);
            uGIIbcq05l2iYyEa2AaeeYA ugiibcq05l2iyyea2aaeeya = this.q1wNbhk2O6;
            if (typeface != ugiibcq05l2iyyea2aaeeya.SuB3hEmTmbbRGAhtvOOmfKEon) {
                ugiibcq05l2iyyea2aaeeya.SuB3hEmTmbbRGAhtvOOmfKEon = typeface;
                lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = ugiibcq05l2iyyea2aaeeya.ko09zE6UAgwkV;
                if (lzuj2xiohpzadsoz1vjvxa != null) {
                    lzuj2xiohpzadsoz1vjvxa.setTypeface(typeface);
                }
                lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa2 = ugiibcq05l2iyyea2aaeeya.w0Wu95l8dVNw5rZMRu;
                if (lzuj2xiohpzadsoz1vjvxa2 != null) {
                    lzuj2xiohpzadsoz1vjvxa2.setTypeface(typeface);
                }
            }
            lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa3 = this.ko09zE6UAgwkV;
            if (lzuj2xiohpzadsoz1vjvxa3 != null) {
                lzuj2xiohpzadsoz1vjvxa3.setTypeface(typeface);
            }
        }
    }

    public final void vBGA6pPLqSMuYGvprl270j7() {
        EditText editText = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (editText == null || this.qygqjTppWwx992 == null) {
            return;
        }
        if ((this.d9zDyyznnp3oaDT1Ug || editText.getBackground() == null) && this.L8DMw02rUTs2w != 0) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ.setBackground(getEditTextBoxBackground());
            this.d9zDyyznnp3oaDT1Ug = true;
        }
    }

    public final void w0Wu95l8dVNw5rZMRu(boolean z, boolean z2) {
        int defaultColor = this.ByTQIhgl7ezGvHXEd.getDefaultColor();
        int colorForState = this.ByTQIhgl7ezGvHXEd.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.ByTQIhgl7ezGvHXEd.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.vXWl0o6I4U59CgHs9 = colorForState2;
        } else if (z2) {
            this.vXWl0o6I4U59CgHs9 = colorForState;
        } else {
            this.vXWl0o6I4U59CgHs9 = defaultColor;
        }
    }

    public final Zx36ytjSPbRH1S3UCiHxPrB8TD zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        Zx36ytjSPbRH1S3UCiHxPrB8TD zx36ytjSPbRH1S3UCiHxPrB8TD = new Zx36ytjSPbRH1S3UCiHxPrB8TD();
        zx36ytjSPbRH1S3UCiHxPrB8TD.LaeGQIruHQu81hfJldjMOQSVblH3x = ej6unYlOWMDF.hKs1wlZyvtUNaW1f5ABIGacfPcvX(getContext(), com.vdodsodjsdt.R.attr.motionDurationShort2, 87);
        zx36ytjSPbRH1S3UCiHxPrB8TD.zIvmSL0wzmmKGc3X39b2Gw2mUGE = ej6unYlOWMDF.vXWl0o6I4U59CgHs9(getContext(), com.vdodsodjsdt.R.attr.motionEasingLinearInterpolator, mlFPz0SY9o7oN.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        return zx36ytjSPbRH1S3UCiHxPrB8TD;
    }

    public final void zzpBGItXfub0yWj(float f) {
        noQ5wqDlpHr6qq0OY4sYdJyOQ noq5wqdlphr6qq0oy4sydjyoq = this.r0dB0ojIy6g8mnk1;
        if (noq5wqdlphr6qq0oy4sydjyoq.zzpBGItXfub0yWj == f) {
            return;
        }
        int i = 2;
        if (this.zyiF0wv9HozxGOIDt8PvVp == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.zyiF0wv9HozxGOIDt8PvVp = valueAnimator;
            valueAnimator.setInterpolator(ej6unYlOWMDF.vXWl0o6I4U59CgHs9(getContext(), com.vdodsodjsdt.R.attr.motionEasingEmphasizedInterpolator, mlFPz0SY9o7oN.zzpBGItXfub0yWj));
            this.zyiF0wv9HozxGOIDt8PvVp.setDuration(ej6unYlOWMDF.hKs1wlZyvtUNaW1f5ABIGacfPcvX(getContext(), com.vdodsodjsdt.R.attr.motionDurationMedium4, 167));
            this.zyiF0wv9HozxGOIDt8PvVp.addUpdateListener(new UtURWB5bbAd9(i, this));
        }
        this.zyiF0wv9HozxGOIDt8PvVp.setFloatValues(noq5wqdlphr6qq0oy4sydjyoq.zzpBGItXfub0yWj, f);
        this.zyiF0wv9HozxGOIDt8PvVp.start();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.ZfQNn8hdWlEQ5cR94249PDsLR.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.GI83zq0G8e7zkn.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.GI83zq0G8e7zkn.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.GI83zq0G8e7zkn(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.LaeGQIruHQu81hfJldjMOQSVblH3x.GI83zq0G8e7zkn;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        eswEmxJomeZU eswemxjomezu = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        TextInputLayout textInputLayout = eswemxjomezu.V57tEvNfxZVVcOCAOih5PKr;
        CheckableImageButton checkableImageButton = eswemxjomezu.GI83zq0G8e7zkn;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ej6unYlOWMDF.ZLZeBXTMq0zDztBxtRTuCHrapQ(textInputLayout, checkableImageButton, eswemxjomezu.q1wNbhk2O6, eswemxjomezu.p59rPv72J9);
            ej6unYlOWMDF.lQ0rO9lhQIyVe7Rp6(textInputLayout, checkableImageButton, eswemxjomezu.q1wNbhk2O6);
        }
    }
}
