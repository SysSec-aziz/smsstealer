package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import com.vdodsodjsdt.AuEvIFo0QoYm1PHNG;
import com.vdodsodjsdt.KfeOQNOupsCg6878zi4e;
import com.vdodsodjsdt.KhgxllPUrJec7ES97XlUgbO1kpk7g;
import com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
import com.vdodsodjsdt.X9tkup2CAfSBHilrz1FF4Q;
import com.vdodsodjsdt.YybP2G5tPcuz9Zghx;
import com.vdodsodjsdt.lzuj2xiOHpZAdsoZ1vJvxA;
import com.vdodsodjsdt.nqGaf1j5rr;
import com.vdodsodjsdt.rkuo6pAmWq0N;
import com.vdodsodjsdt.rl8oDmZYMaZZC0;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends lzuj2xiOHpZAdsoZ1vJvxA implements YybP2G5tPcuz9Zghx, View.OnClickListener, X9tkup2CAfSBHilrz1FF4Q {
    public nqGaf1j5rr Ca81ebIan1u;
    public CharSequence HzCpKshMOoaw76hFcbOVRYMeRd;
    public Drawable KUYypEB4eNWOZWVDpH;
    public rkuo6pAmWq0N M9e7PWhFYLD2lOGMker;
    public final int f6ZQsR6bPLvvCDNXOUc;
    public boolean h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public int jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public final int ko09zE6UAgwkV;
    public rl8oDmZYMaZZC0 p59rPv72J9;
    public boolean pYmKDYlAmhudp;
    public KhgxllPUrJec7ES97XlUgbO1kpk7g q1wNbhk2O6;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = ZLZeBXTMq0zDztBxtRTuCHrapQ();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AuEvIFo0QoYm1PHNG.V57tEvNfxZVVcOCAOih5PKr, 0, 0);
        this.ko09zE6UAgwkV = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f6ZQsR6bPLvvCDNXOUc = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = -1;
        setSaveEnabled(false);
    }

    public final void NSjgqmGjEzuugn2SsG1mZFP() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.HzCpKshMOoaw76hFcbOVRYMeRd);
        if (this.KUYypEB4eNWOZWVDpH != null && ((this.M9e7PWhFYLD2lOGMker.w0Wu95l8dVNw5rZMRu & 4) != 4 || (!this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv && !this.pYmKDYlAmhudp))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.HzCpKshMOoaw76hFcbOVRYMeRd : null);
        CharSequence charSequence = this.M9e7PWhFYLD2lOGMker.pYmKDYlAmhudp;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.M9e7PWhFYLD2lOGMker.LaeGQIruHQu81hfJldjMOQSVblH3x);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.M9e7PWhFYLD2lOGMker.ko09zE6UAgwkV;
        if (TextUtils.isEmpty(charSequence2)) {
            KfeOQNOupsCg6878zi4e.lQ0rO9lhQIyVe7Rp6(this, z3 ? null : this.M9e7PWhFYLD2lOGMker.LaeGQIruHQu81hfJldjMOQSVblH3x);
        } else {
            KfeOQNOupsCg6878zi4e.lQ0rO9lhQIyVe7Rp6(this, charSequence2);
        }
    }

    @Override // com.vdodsodjsdt.YybP2G5tPcuz9Zghx
    public final void V57tEvNfxZVVcOCAOih5PKr(rkuo6pAmWq0N rkuo6pamwq0n) {
        this.M9e7PWhFYLD2lOGMker = rkuo6pamwq0n;
        setIcon(rkuo6pamwq0n.getIcon());
        setTitle(rkuo6pamwq0n.getTitleCondensed());
        setId(rkuo6pamwq0n.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        setVisibility(rkuo6pamwq0n.isVisible() ? 0 : 8);
        setEnabled(rkuo6pamwq0n.isEnabled());
        if (rkuo6pamwq0n.hasSubMenu() && this.p59rPv72J9 == null) {
            this.p59rPv72J9 = new rl8oDmZYMaZZC0(this);
        }
    }

    @Override // com.vdodsodjsdt.X9tkup2CAfSBHilrz1FF4Q
    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // com.vdodsodjsdt.YybP2G5tPcuz9Zghx
    public rkuo6pAmWq0N getItemData() {
        return this.M9e7PWhFYLD2lOGMker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        KhgxllPUrJec7ES97XlUgbO1kpk7g khgxllPUrJec7ES97XlUgbO1kpk7g = this.q1wNbhk2O6;
        if (khgxllPUrJec7ES97XlUgbO1kpk7g != null) {
            khgxllPUrJec7ES97XlUgbO1kpk7g.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.M9e7PWhFYLD2lOGMker);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = ZLZeBXTMq0zDztBxtRTuCHrapQ();
        NSjgqmGjEzuugn2SsG1mZFP();
    }

    @Override // com.vdodsodjsdt.lzuj2xiOHpZAdsoZ1vJvxA, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.jW7EiD0YL6xkbB158jMUzhWNWb1y) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.ko09zE6UAgwkV;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.KUYypEB4eNWOZWVDpH == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.KUYypEB4eNWOZWVDpH.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        rl8oDmZYMaZZC0 rl8odmzymazzc0;
        if (this.M9e7PWhFYLD2lOGMker.hasSubMenu() && (rl8odmzymazzc0 = this.p59rPv72J9) != null && rl8odmzymazzc0.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.pYmKDYlAmhudp != z) {
            this.pYmKDYlAmhudp = z;
            rkuo6pAmWq0N rkuo6pamwq0n = this.M9e7PWhFYLD2lOGMker;
            if (rkuo6pamwq0n != null) {
                Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = rkuo6pamwq0n.p59rPv72J9;
                stuu2Qyz6BSCKFEomt5b51vUnV1HQ.HzCpKshMOoaw76hFcbOVRYMeRd = true;
                stuu2Qyz6BSCKFEomt5b51vUnV1HQ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.KUYypEB4eNWOZWVDpH = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f6ZQsR6bPLvvCDNXOUc;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        NSjgqmGjEzuugn2SsG1mZFP();
    }

    public void setItemInvoker(KhgxllPUrJec7ES97XlUgbO1kpk7g khgxllPUrJec7ES97XlUgbO1kpk7g) {
        this.q1wNbhk2O6 = khgxllPUrJec7ES97XlUgbO1kpk7g;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(nqGaf1j5rr nqgaf1j5rr) {
        this.Ca81ebIan1u = nqgaf1j5rr;
    }

    public void setTitle(CharSequence charSequence) {
        this.HzCpKshMOoaw76hFcbOVRYMeRd = charSequence;
        NSjgqmGjEzuugn2SsG1mZFP();
    }

    @Override // com.vdodsodjsdt.X9tkup2CAfSBHilrz1FF4Q
    public final boolean zzpBGItXfub0yWj() {
        return !TextUtils.isEmpty(getText()) && this.M9e7PWhFYLD2lOGMker.getIcon() == null;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }
}
