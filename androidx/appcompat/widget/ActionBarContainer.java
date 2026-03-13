package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.vdodsodjsdt.AuEvIFo0QoYm1PHNG;
import com.vdodsodjsdt.MM8e94lhjcTG;
import com.vdodsodjsdt.NcUzwSwM1i9CwI;
import com.vdodsodjsdt.R;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public final boolean GI83zq0G8e7zkn;
    public final int HzCpKshMOoaw76hFcbOVRYMeRd;
    public View LaeGQIruHQu81hfJldjMOQSVblH3x;
    public boolean M9e7PWhFYLD2lOGMker;
    public Drawable NSjgqmGjEzuugn2SsG1mZFP;
    public boolean V57tEvNfxZVVcOCAOih5PKr;
    public Drawable ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public View ZfQNn8hdWlEQ5cR94249PDsLR;
    public Drawable zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new NcUzwSwM1i9CwI(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AuEvIFo0QoYm1PHNG.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        boolean z = false;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = typedArrayObtainStyledAttributes.getDrawable(0);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = typedArrayObtainStyledAttributes.getDrawable(2);
        this.HzCpKshMOoaw76hFcbOVRYMeRd = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.GI83zq0G8e7zkn = true;
            this.NSjgqmGjEzuugn2SsG1mZFP = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.GI83zq0G8e7zkn ? !(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE != null || this.ZLZeBXTMq0zDztBxtRTuCHrapQ != null) : this.NSjgqmGjEzuugn2SsG1mZFP == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (drawable != null && drawable.isStateful()) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setState(getDrawableState());
        }
        Drawable drawable2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (drawable2 != null && drawable2.isStateful()) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ.setState(getDrawableState());
        }
        Drawable drawable3 = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.NSjgqmGjEzuugn2SsG1mZFP.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = findViewById(R.id.action_bar);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.V57tEvNfxZVVcOCAOih5PKr || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.GI83zq0G8e7zkn) {
            Drawable drawable = this.NSjgqmGjEzuugn2SsG1mZFP;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE == null) {
                z2 = false;
            } else if (this.ZfQNn8hdWlEQ5cR94249PDsLR.getVisibility() == 0) {
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setBounds(this.ZfQNn8hdWlEQ5cR94249PDsLR.getLeft(), this.ZfQNn8hdWlEQ5cR94249PDsLR.getTop(), this.ZfQNn8hdWlEQ5cR94249PDsLR.getRight(), this.ZfQNn8hdWlEQ5cR94249PDsLR.getBottom());
            } else {
                View view = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (view == null || view.getVisibility() != 0) {
                    this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setBounds(0, 0, 0, 0);
                } else {
                    this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setBounds(this.LaeGQIruHQu81hfJldjMOQSVblH3x.getLeft(), this.LaeGQIruHQu81hfJldjMOQSVblH3x.getTop(), this.LaeGQIruHQu81hfJldjMOQSVblH3x.getRight(), this.LaeGQIruHQu81hfJldjMOQSVblH3x.getBottom());
                }
            }
            this.M9e7PWhFYLD2lOGMker = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.HzCpKshMOoaw76hFcbOVRYMeRd) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        }
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (view != null) {
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setBounds(view.getLeft(), this.ZfQNn8hdWlEQ5cR94249PDsLR.getTop(), this.ZfQNn8hdWlEQ5cR94249PDsLR.getRight(), this.ZfQNn8hdWlEQ5cR94249PDsLR.getBottom());
            }
        }
        boolean z = false;
        if (!this.GI83zq0G8e7zkn ? !(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE != null || this.ZLZeBXTMq0zDztBxtRTuCHrapQ != null) : this.NSjgqmGjEzuugn2SsG1mZFP == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.NSjgqmGjEzuugn2SsG1mZFP);
        }
        this.NSjgqmGjEzuugn2SsG1mZFP = drawable;
        boolean z = this.GI83zq0G8e7zkn;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.NSjgqmGjEzuugn2SsG1mZFP) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE != null || this.ZLZeBXTMq0zDztBxtRTuCHrapQ != null) : this.NSjgqmGjEzuugn2SsG1mZFP == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        }
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.M9e7PWhFYLD2lOGMker && this.ZLZeBXTMq0zDztBxtRTuCHrapQ != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.GI83zq0G8e7zkn ? !(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE != null || this.ZLZeBXTMq0zDztBxtRTuCHrapQ != null) : this.NSjgqmGjEzuugn2SsG1mZFP == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.V57tEvNfxZVVcOCAOih5PKr = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        boolean z = this.GI83zq0G8e7zkn;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.ZLZeBXTMq0zDztBxtRTuCHrapQ && this.M9e7PWhFYLD2lOGMker) {
            return true;
        }
        return (drawable == this.NSjgqmGjEzuugn2SsG1mZFP && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(MM8e94lhjcTG mM8e94lhjcTG) {
    }
}
