package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vdodsodjsdt.AuEvIFo0QoYm1PHNG;
import com.vdodsodjsdt.JaGiaIfgE4oZFS8GScUJb;
import com.vdodsodjsdt.KfeOQNOupsCg6878zi4e;
import com.vdodsodjsdt.KoccBHOLe4XJgL;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.RqDcm8dreu5TrBpvWoK1I;
import com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
import com.vdodsodjsdt.TbV4rkOPds9wwfLx;
import com.vdodsodjsdt.b0ZGtNoko2W8IH5Mo0D9yU;
import com.vdodsodjsdt.d9uIUa0qhR0HmxFMet;
import com.vdodsodjsdt.wGfZDRl3Th9;
import com.vdodsodjsdt.x7RNBrm11qTEy;
import com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public View Ca81ebIan1u;
    public boolean GI83zq0G8e7zkn;
    public CharSequence HzCpKshMOoaw76hFcbOVRYMeRd;
    public CharSequence KUYypEB4eNWOZWVDpH;
    public ActionMenuView LaeGQIruHQu81hfJldjMOQSVblH3x;
    public boolean M9e7PWhFYLD2lOGMker;
    public d9uIUa0qhR0HmxFMet NSjgqmGjEzuugn2SsG1mZFP;
    public final int TaDO7ogis3aEiWEtq;
    public final RqDcm8dreu5TrBpvWoK1I V57tEvNfxZVVcOCAOih5PKr;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final Context ZfQNn8hdWlEQ5cR94249PDsLR;
    public final int f6ZQsR6bPLvvCDNXOUc;
    public LinearLayout h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public final int jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public TextView ko09zE6UAgwkV;
    public View p59rPv72J9;
    public TextView pYmKDYlAmhudp;
    public View q1wNbhk2O6;
    public boolean vBGA6pPLqSMuYGvprl270j7;
    public JaGiaIfgE4oZFS8GScUJb zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.V57tEvNfxZVVcOCAOih5PKr = new RqDcm8dreu5TrBpvWoK1I(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = context;
        } else {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AuEvIFo0QoYm1PHNG.ZfQNn8hdWlEQ5cR94249PDsLR, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(context, resourceId));
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f6ZQsR6bPLvvCDNXOUc = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.TaDO7ogis3aEiWEtq = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int ZLZeBXTMq0zDztBxtRTuCHrapQ(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public static int zIvmSL0wzmmKGc3X39b2Gw2mUGE(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public final d9uIUa0qhR0HmxFMet GI83zq0G8e7zkn(int i, long j) {
        d9uIUa0qhR0HmxFMet d9uiua0qhr0hmxfmet = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (d9uiua0qhr0hmxfmet != null) {
            d9uiua0qhr0hmxfmet.zzpBGItXfub0yWj();
        }
        RqDcm8dreu5TrBpvWoK1I rqDcm8dreu5TrBpvWoK1I = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i != 0) {
            d9uIUa0qhR0HmxFMet d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m(this);
            d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m(0.0f);
            d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr(j);
            rqDcm8dreu5TrBpvWoK1I.V57tEvNfxZVVcOCAOih5PKr.NSjgqmGjEzuugn2SsG1mZFP = d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m;
            rqDcm8dreu5TrBpvWoK1I.zzpBGItXfub0yWj = i;
            d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR(rqDcm8dreu5TrBpvWoK1I);
            return d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        d9uIUa0qhR0HmxFMet d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m2 = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m(this);
        d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m2.VxUQ9tBhpHJ2AAEDNW8sghc4m(1.0f);
        d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m2.V57tEvNfxZVVcOCAOih5PKr(j);
        rqDcm8dreu5TrBpvWoK1I.V57tEvNfxZVVcOCAOih5PKr.NSjgqmGjEzuugn2SsG1mZFP = d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m2;
        rqDcm8dreu5TrBpvWoK1I.zzpBGItXfub0yWj = i;
        d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m2.ZfQNn8hdWlEQ5cR94249PDsLR(rqDcm8dreu5TrBpvWoK1I);
        return d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m2;
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        removeAllViews();
        this.Ca81ebIan1u = null;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = null;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
        View view = this.p59rPv72J9;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: NSjgqmGjEzuugn2SsG1mZFP, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            d9uIUa0qhR0HmxFMet d9uiua0qhr0hmxfmet = this.NSjgqmGjEzuugn2SsG1mZFP;
            if (d9uiua0qhr0hmxfmet != null) {
                d9uiua0qhr0hmxfmet.zzpBGItXfub0yWj();
            }
            super.setVisibility(i);
        }
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(KoccBHOLe4XJgL koccBHOLe4XJgL) {
        View view = this.q1wNbhk2O6;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.TaDO7ogis3aEiWEtq, (ViewGroup) this, false);
            this.q1wNbhk2O6 = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.q1wNbhk2O6);
        }
        View viewFindViewById = this.q1wNbhk2O6.findViewById(R.id.action_mode_close_button);
        this.p59rPv72J9 = viewFindViewById;
        viewFindViewById.setOnClickListener(new wGfZDRl3Th9(0, koccBHOLe4XJgL));
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQV57tEvNfxZVVcOCAOih5PKr = koccBHOLe4XJgL.V57tEvNfxZVVcOCAOih5PKr();
        JaGiaIfgE4oZFS8GScUJb jaGiaIfgE4oZFS8GScUJb = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (jaGiaIfgE4oZFS8GScUJb != null) {
            jaGiaIfgE4oZFS8GScUJb.ZfQNn8hdWlEQ5cR94249PDsLR();
            x7RNBrm11qTEy x7rnbrm11qtey = jaGiaIfgE4oZFS8GScUJb.TaDO7ogis3aEiWEtq;
            if (x7rnbrm11qtey != null && x7rnbrm11qtey.zzpBGItXfub0yWj()) {
                x7rnbrm11qtey.GI83zq0G8e7zkn.dismiss();
            }
        }
        JaGiaIfgE4oZFS8GScUJb jaGiaIfgE4oZFS8GScUJb2 = new JaGiaIfgE4oZFS8GScUJb(getContext());
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = jaGiaIfgE4oZFS8GScUJb2;
        jaGiaIfgE4oZFS8GScUJb2.p59rPv72J9 = true;
        jaGiaIfgE4oZFS8GScUJb2.Ca81ebIan1u = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        stuu2Qyz6BSCKFEomt5b51vUnV1HQV57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, this.ZfQNn8hdWlEQ5cR94249PDsLR);
        JaGiaIfgE4oZFS8GScUJb jaGiaIfgE4oZFS8GScUJb3 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        b0ZGtNoko2W8IH5Mo0D9yU b0zgtnoko2w8ih5mo0d9yu = jaGiaIfgE4oZFS8GScUJb3.M9e7PWhFYLD2lOGMker;
        if (b0zgtnoko2w8ih5mo0d9yu == null) {
            b0ZGtNoko2W8IH5Mo0D9yU b0zgtnoko2w8ih5mo0d9yu2 = (b0ZGtNoko2W8IH5Mo0D9yU) jaGiaIfgE4oZFS8GScUJb3.zIvmSL0wzmmKGc3X39b2Gw2mUGE.inflate(jaGiaIfgE4oZFS8GScUJb3.NSjgqmGjEzuugn2SsG1mZFP, (ViewGroup) this, false);
            jaGiaIfgE4oZFS8GScUJb3.M9e7PWhFYLD2lOGMker = b0zgtnoko2w8ih5mo0d9yu2;
            b0zgtnoko2w8ih5mo0d9yu2.zzpBGItXfub0yWj(jaGiaIfgE4oZFS8GScUJb3.LaeGQIruHQu81hfJldjMOQSVblH3x);
            jaGiaIfgE4oZFS8GScUJb3.LaeGQIruHQu81hfJldjMOQSVblH3x();
        }
        b0ZGtNoko2W8IH5Mo0D9yU b0zgtnoko2w8ih5mo0d9yu3 = jaGiaIfgE4oZFS8GScUJb3.M9e7PWhFYLD2lOGMker;
        if (b0zgtnoko2w8ih5mo0d9yu != b0zgtnoko2w8ih5mo0d9yu3) {
            ((ActionMenuView) b0zgtnoko2w8ih5mo0d9yu3).setPresenter(jaGiaIfgE4oZFS8GScUJb3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) b0zgtnoko2w8ih5mo0d9yu3;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.LaeGQIruHQu81hfJldjMOQSVblH3x, layoutParams);
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR() {
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = linearLayout;
            this.pYmKDYlAmhudp = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.ko09zE6UAgwkV = (TextView) this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.findViewById(R.id.action_bar_subtitle);
            int i = this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
            if (i != 0) {
                this.pYmKDYlAmhudp.setTextAppearance(getContext(), i);
            }
            int i2 = this.f6ZQsR6bPLvvCDNXOUc;
            if (i2 != 0) {
                this.ko09zE6UAgwkV.setTextAppearance(getContext(), i2);
            }
        }
        this.pYmKDYlAmhudp.setText(this.HzCpKshMOoaw76hFcbOVRYMeRd);
        this.ko09zE6UAgwkV.setText(this.KUYypEB4eNWOZWVDpH);
        boolean zIsEmpty = TextUtils.isEmpty(this.HzCpKshMOoaw76hFcbOVRYMeRd);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.KUYypEB4eNWOZWVDpH);
        this.ko09zE6UAgwkV.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.getParent() == null) {
            addView(this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.NSjgqmGjEzuugn2SsG1mZFP != null ? this.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj : getVisibility();
    }

    public int getContentHeight() {
        return this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    public CharSequence getSubtitle() {
        return this.KUYypEB4eNWOZWVDpH;
    }

    public CharSequence getTitle() {
        return this.HzCpKshMOoaw76hFcbOVRYMeRd;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AuEvIFo0QoYm1PHNG.VxUQ9tBhpHJ2AAEDNW8sghc4m, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        JaGiaIfgE4oZFS8GScUJb jaGiaIfgE4oZFS8GScUJb = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (jaGiaIfgE4oZFS8GScUJb != null) {
            Configuration configuration2 = jaGiaIfgE4oZFS8GScUJb.ZfQNn8hdWlEQ5cR94249PDsLR.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            jaGiaIfgE4oZFS8GScUJb.ko09zE6UAgwkV = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = jaGiaIfgE4oZFS8GScUJb.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ != null) {
                stuu2Qyz6BSCKFEomt5b51vUnV1HQ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        JaGiaIfgE4oZFS8GScUJb jaGiaIfgE4oZFS8GScUJb = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (jaGiaIfgE4oZFS8GScUJb != null) {
            jaGiaIfgE4oZFS8GScUJb.ZfQNn8hdWlEQ5cR94249PDsLR();
            x7RNBrm11qTEy x7rnbrm11qtey = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.TaDO7ogis3aEiWEtq;
            if (x7rnbrm11qtey == null || !x7rnbrm11qtey.zzpBGItXfub0yWj()) {
                return;
            }
            x7rnbrm11qtey.GI83zq0G8e7zkn.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.M9e7PWhFYLD2lOGMker = false;
        }
        if (!this.M9e7PWhFYLD2lOGMker) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.M9e7PWhFYLD2lOGMker = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.M9e7PWhFYLD2lOGMker = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = TbV4rkOPds9wwfLx.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.q1wNbhk2O6;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.q1wNbhk2O6.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iZLZeBXTMq0zDztBxtRTuCHrapQ = ZLZeBXTMq0zDztBxtRTuCHrapQ(this.q1wNbhk2O6, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? iZLZeBXTMq0zDztBxtRTuCHrapQ - i6 : iZLZeBXTMq0zDztBxtRTuCHrapQ + i6;
        }
        LinearLayout linearLayout = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        if (linearLayout != null && this.Ca81ebIan1u == null && linearLayout.getVisibility() != 8) {
            paddingRight += ZLZeBXTMq0zDztBxtRTuCHrapQ(this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.Ca81ebIan1u;
        if (view2 != null) {
            ZLZeBXTMq0zDztBxtRTuCHrapQ(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (actionMenuView != null) {
            ZLZeBXTMq0zDztBxtRTuCHrapQ(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.q1wNbhk2O6;
        if (view != null) {
            int iZIvmSL0wzmmKGc3X39b2Gw2mUGE = zIvmSL0wzmmKGc3X39b2Gw2mUGE(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.q1wNbhk2O6.getLayoutParams();
            paddingLeft = iZIvmSL0wzmmKGc3X39b2Gw2mUGE - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = zIvmSL0wzmmKGc3X39b2Gw2mUGE(this.LaeGQIruHQu81hfJldjMOQSVblH3x, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        if (linearLayout != null && this.Ca81ebIan1u == null) {
            if (this.vBGA6pPLqSMuYGvprl270j7) {
                this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = zIvmSL0wzmmKGc3X39b2Gw2mUGE(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.Ca81ebIan1u;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.Ca81ebIan1u.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.GI83zq0G8e7zkn = false;
        }
        if (!this.GI83zq0G8e7zkn) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.GI83zq0G8e7zkn = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.GI83zq0G8e7zkn = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.Ca81ebIan1u;
        if (view2 != null) {
            removeView(view2);
        }
        this.Ca81ebIan1u = view;
        if (view != null && (linearLayout = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) != null) {
            removeView(linearLayout);
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.KUYypEB4eNWOZWVDpH = charSequence;
        ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    public void setTitle(CharSequence charSequence) {
        this.HzCpKshMOoaw76hFcbOVRYMeRd = charSequence;
        ZfQNn8hdWlEQ5cR94249PDsLR();
        xb0r6yEzq0tw9m7nTWG5BFR8.p59rPv72J9(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.vBGA6pPLqSMuYGvprl270j7) {
            requestLayout();
        }
        this.vBGA6pPLqSMuYGvprl270j7 = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
