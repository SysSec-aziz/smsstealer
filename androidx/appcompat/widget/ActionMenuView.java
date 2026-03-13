package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.vdodsodjsdt.IN79WcIk5xB4t0GjRT43qPLs5;
import com.vdodsodjsdt.JaGiaIfgE4oZFS8GScUJb;
import com.vdodsodjsdt.KhgxllPUrJec7ES97XlUgbO1kpk7g;
import com.vdodsodjsdt.Skgk8FYn8b4TvRiBOsElZw4XkNLhQ;
import com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
import com.vdodsodjsdt.TbV4rkOPds9wwfLx;
import com.vdodsodjsdt.X9tkup2CAfSBHilrz1FF4Q;
import com.vdodsodjsdt.XbRgnR5SqPXup9z60vLrMOg;
import com.vdodsodjsdt.b0ZGtNoko2W8IH5Mo0D9yU;
import com.vdodsodjsdt.j6Xzcn6Ej3euYD;
import com.vdodsodjsdt.kI1rndchf6W0AJYmJtpW;
import com.vdodsodjsdt.mGtgDhtPVV;
import com.vdodsodjsdt.rkuo6pAmWq0N;
import com.vdodsodjsdt.t5olRUJo5JPX6WXwY17n2LzUoDWuf;
import com.vdodsodjsdt.vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ;
import com.vdodsodjsdt.x7RNBrm11qTEy;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends j6Xzcn6Ej3euYD implements KhgxllPUrJec7ES97XlUgbO1kpk7g, b0ZGtNoko2W8IH5Mo0D9yU {
    public kI1rndchf6W0AJYmJtpW Irh5auREsoeV1C1RaBamlmy;
    public final int RhfGHxtXxy0M0grmp2jkRjQg;
    public mGtgDhtPVV SuB3hEmTmbbRGAhtvOOmfKEon;
    public JaGiaIfgE4oZFS8GScUJb TaDO7ogis3aEiWEtq;
    public int f6ZQsR6bPLvvCDNXOUc;
    public Context jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public Stuu2Qyz6BSCKFEomt5b51vUnV1HQ ko09zE6UAgwkV;
    public boolean q11o1hieEkZDhF1MGOZI26oZiDT;
    public final int qNPQb1obP7;
    public boolean vBGA6pPLqSMuYGvprl270j7;
    public int w0Wu95l8dVNw5rZMRu;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.RhfGHxtXxy0M0grmp2jkRjQg = (int) (56.0f * f);
        this.qNPQb1obP7 = (int) (f * 4.0f);
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = context;
        this.f6ZQsR6bPLvvCDNXOUc = 0;
    }

    public static vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ HzCpKshMOoaw76hFcbOVRYMeRd(ViewGroup.LayoutParams layoutParams) {
        vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ vggktp17zbxtkwktz7oxqgj4z3xq;
        if (layoutParams == null) {
            return M9e7PWhFYLD2lOGMker();
        }
        if (layoutParams instanceof vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ) {
            vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ vggktp17zbxtkwktz7oxqgj4z3xq2 = (vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ) layoutParams;
            vggktp17zbxtkwktz7oxqgj4z3xq = new vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ(vggktp17zbxtkwktz7oxqgj4z3xq2);
            vggktp17zbxtkwktz7oxqgj4z3xq.VxUQ9tBhpHJ2AAEDNW8sghc4m = vggktp17zbxtkwktz7oxqgj4z3xq2.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        } else {
            vggktp17zbxtkwktz7oxqgj4z3xq = new vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ(layoutParams);
        }
        if (((LinearLayout.LayoutParams) vggktp17zbxtkwktz7oxqgj4z3xq).gravity <= 0) {
            ((LinearLayout.LayoutParams) vggktp17zbxtkwktz7oxqgj4z3xq).gravity = 16;
        }
        return vggktp17zbxtkwktz7oxqgj4z3xq;
    }

    public static vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ M9e7PWhFYLD2lOGMker() {
        vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ vggktp17zbxtkwktz7oxqgj4z3xq = new vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ(-2, -2);
        vggktp17zbxtkwktz7oxqgj4z3xq.VxUQ9tBhpHJ2AAEDNW8sghc4m = false;
        ((LinearLayout.LayoutParams) vggktp17zbxtkwktz7oxqgj4z3xq).gravity = 16;
        return vggktp17zbxtkwktz7oxqgj4z3xq;
    }

    public final boolean KUYypEB4eNWOZWVDpH(int i) {
        boolean zVxUQ9tBhpHJ2AAEDNW8sghc4m = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof X9tkup2CAfSBHilrz1FF4Q)) {
            zVxUQ9tBhpHJ2AAEDNW8sghc4m = ((X9tkup2CAfSBHilrz1FF4Q) childAt).VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        return (i <= 0 || !(childAt2 instanceof X9tkup2CAfSBHilrz1FF4Q)) ? zVxUQ9tBhpHJ2AAEDNW8sghc4m : ((X9tkup2CAfSBHilrz1FF4Q) childAt2).zzpBGItXfub0yWj() | zVxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    @Override // com.vdodsodjsdt.j6Xzcn6Ej3euYD
    /* JADX INFO: renamed from: NSjgqmGjEzuugn2SsG1mZFP */
    public final /* bridge */ /* synthetic */ XbRgnR5SqPXup9z60vLrMOg generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return HzCpKshMOoaw76hFcbOVRYMeRd(layoutParams);
    }

    @Override // com.vdodsodjsdt.KhgxllPUrJec7ES97XlUgbO1kpk7g
    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(rkuo6pAmWq0N rkuo6pamwq0n) {
        return this.ko09zE6UAgwkV.pYmKDYlAmhudp(rkuo6pamwq0n, null, 0);
    }

    @Override // com.vdodsodjsdt.j6Xzcn6Ej3euYD
    /* JADX INFO: renamed from: ZLZeBXTMq0zDztBxtRTuCHrapQ */
    public final XbRgnR5SqPXup9z60vLrMOg generateLayoutParams(AttributeSet attributeSet) {
        return new vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ(getContext(), attributeSet);
    }

    @Override // com.vdodsodjsdt.j6Xzcn6Ej3euYD, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // com.vdodsodjsdt.j6Xzcn6Ej3euYD, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return M9e7PWhFYLD2lOGMker();
    }

    @Override // com.vdodsodjsdt.j6Xzcn6Ej3euYD, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return HzCpKshMOoaw76hFcbOVRYMeRd(layoutParams);
    }

    public Menu getMenu() {
        if (this.ko09zE6UAgwkV == null) {
            Context context = getContext();
            Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = new Stuu2Qyz6BSCKFEomt5b51vUnV1HQ(context);
            this.ko09zE6UAgwkV = stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
            stuu2Qyz6BSCKFEomt5b51vUnV1HQ.LaeGQIruHQu81hfJldjMOQSVblH3x = new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(3, this);
            JaGiaIfgE4oZFS8GScUJb jaGiaIfgE4oZFS8GScUJb = new JaGiaIfgE4oZFS8GScUJb(context);
            this.TaDO7ogis3aEiWEtq = jaGiaIfgE4oZFS8GScUJb;
            jaGiaIfgE4oZFS8GScUJb.p59rPv72J9 = true;
            jaGiaIfgE4oZFS8GScUJb.Ca81ebIan1u = true;
            jaGiaIfgE4oZFS8GScUJb.ZLZeBXTMq0zDztBxtRTuCHrapQ = new IN79WcIk5xB4t0GjRT43qPLs5(18);
            this.ko09zE6UAgwkV.zzpBGItXfub0yWj(jaGiaIfgE4oZFS8GScUJb, this.jW7EiD0YL6xkbB158jMUzhWNWb1y);
            JaGiaIfgE4oZFS8GScUJb jaGiaIfgE4oZFS8GScUJb2 = this.TaDO7ogis3aEiWEtq;
            jaGiaIfgE4oZFS8GScUJb2.M9e7PWhFYLD2lOGMker = this;
            this.ko09zE6UAgwkV = jaGiaIfgE4oZFS8GScUJb2.LaeGQIruHQu81hfJldjMOQSVblH3x;
        }
        return this.ko09zE6UAgwkV;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        JaGiaIfgE4oZFS8GScUJb jaGiaIfgE4oZFS8GScUJb = this.TaDO7ogis3aEiWEtq;
        t5olRUJo5JPX6WXwY17n2LzUoDWuf t5olrujo5jpx6wxwy17n2lzuodwuf = jaGiaIfgE4oZFS8GScUJb.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (t5olrujo5jpx6wxwy17n2lzuodwuf != null) {
            return t5olrujo5jpx6wxwy17n2lzuodwuf.getDrawable();
        }
        if (jaGiaIfgE4oZFS8GScUJb.q1wNbhk2O6) {
            return jaGiaIfgE4oZFS8GScUJb.KUYypEB4eNWOZWVDpH;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f6ZQsR6bPLvvCDNXOUc;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        JaGiaIfgE4oZFS8GScUJb jaGiaIfgE4oZFS8GScUJb = this.TaDO7ogis3aEiWEtq;
        if (jaGiaIfgE4oZFS8GScUJb != null) {
            jaGiaIfgE4oZFS8GScUJb.LaeGQIruHQu81hfJldjMOQSVblH3x();
            if (this.TaDO7ogis3aEiWEtq.NSjgqmGjEzuugn2SsG1mZFP()) {
                this.TaDO7ogis3aEiWEtq.ZfQNn8hdWlEQ5cR94249PDsLR();
                this.TaDO7ogis3aEiWEtq.KUYypEB4eNWOZWVDpH();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        JaGiaIfgE4oZFS8GScUJb jaGiaIfgE4oZFS8GScUJb = this.TaDO7ogis3aEiWEtq;
        if (jaGiaIfgE4oZFS8GScUJb != null) {
            jaGiaIfgE4oZFS8GScUJb.ZfQNn8hdWlEQ5cR94249PDsLR();
            x7RNBrm11qTEy x7rnbrm11qtey = jaGiaIfgE4oZFS8GScUJb.TaDO7ogis3aEiWEtq;
            if (x7rnbrm11qtey == null || !x7rnbrm11qtey.zzpBGItXfub0yWj()) {
                return;
            }
            x7rnbrm11qtey.GI83zq0G8e7zkn.dismiss();
        }
    }

    @Override // com.vdodsodjsdt.j6Xzcn6Ej3euYD, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.q11o1hieEkZDhF1MGOZI26oZiDT) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = TbV4rkOPds9wwfLx.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ vggktp17zbxtkwktz7oxqgj4z3xq = (vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ) childAt.getLayoutParams();
                if (vggktp17zbxtkwktz7oxqgj4z3xq.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (KUYypEB4eNWOZWVDpH(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) vggktp17zbxtkwktz7oxqgj4z3xq).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) vggktp17zbxtkwktz7oxqgj4z3xq).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) vggktp17zbxtkwktz7oxqgj4z3xq).leftMargin) + ((LinearLayout.LayoutParams) vggktp17zbxtkwktz7oxqgj4z3xq).rightMargin;
                    KUYypEB4eNWOZWVDpH(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ vggktp17zbxtkwktz7oxqgj4z3xq2 = (vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !vggktp17zbxtkwktz7oxqgj4z3xq2.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) vggktp17zbxtkwktz7oxqgj4z3xq2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) vggktp17zbxtkwktz7oxqgj4z3xq2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ vggktp17zbxtkwktz7oxqgj4z3xq3 = (vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !vggktp17zbxtkwktz7oxqgj4z3xq3.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) vggktp17zbxtkwktz7oxqgj4z3xq3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) vggktp17zbxtkwktz7oxqgj4z3xq3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // com.vdodsodjsdt.j6Xzcn6Ej3euYD, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
        boolean z = this.q11o1hieEkZDhF1MGOZI26oZiDT;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.q11o1hieEkZDhF1MGOZI26oZiDT = z2;
        if (z != z2) {
            this.w0Wu95l8dVNw5rZMRu = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.q11o1hieEkZDhF1MGOZI26oZiDT && (stuu2Qyz6BSCKFEomt5b51vUnV1HQ = this.ko09zE6UAgwkV) != null && size != this.w0Wu95l8dVNw5rZMRu) {
            this.w0Wu95l8dVNw5rZMRu = size;
            stuu2Qyz6BSCKFEomt5b51vUnV1HQ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(true);
        }
        int childCount = getChildCount();
        if (!this.q11o1hieEkZDhF1MGOZI26oZiDT || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ vggktp17zbxtkwktz7oxqgj4z3xq = (vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) vggktp17zbxtkwktz7oxqgj4z3xq).rightMargin = 0;
                ((LinearLayout.LayoutParams) vggktp17zbxtkwktz7oxqgj4z3xq).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.RhfGHxtXxy0M0grmp2jkRjQg;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.qNPQb1obP7;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ vggktp17zbxtkwktz7oxqgj4z3xq2 = (vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ) childAt.getLayoutParams();
                vggktp17zbxtkwktz7oxqgj4z3xq2.zIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
                vggktp17zbxtkwktz7oxqgj4z3xq2.V57tEvNfxZVVcOCAOih5PKr = 0;
                vggktp17zbxtkwktz7oxqgj4z3xq2.zzpBGItXfub0yWj = 0;
                vggktp17zbxtkwktz7oxqgj4z3xq2.ZfQNn8hdWlEQ5cR94249PDsLR = false;
                ((LinearLayout.LayoutParams) vggktp17zbxtkwktz7oxqgj4z3xq2).leftMargin = 0;
                ((LinearLayout.LayoutParams) vggktp17zbxtkwktz7oxqgj4z3xq2).rightMargin = 0;
                vggktp17zbxtkwktz7oxqgj4z3xq2.LaeGQIruHQu81hfJldjMOQSVblH3x = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = vggktp17zbxtkwktz7oxqgj4z3xq2.VxUQ9tBhpHJ2AAEDNW8sghc4m ? 1 : i10;
                vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ vggktp17zbxtkwktz7oxqgj4z3xq3 = (vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                vggktp17zbxtkwktz7oxqgj4z3xq3.ZfQNn8hdWlEQ5cR94249PDsLR = !vggktp17zbxtkwktz7oxqgj4z3xq3.VxUQ9tBhpHJ2AAEDNW8sghc4m && z6;
                vggktp17zbxtkwktz7oxqgj4z3xq3.zzpBGItXfub0yWj = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (vggktp17zbxtkwktz7oxqgj4z3xq2.ZfQNn8hdWlEQ5cR94249PDsLR) {
                    i15++;
                }
                if (vggktp17zbxtkwktz7oxqgj4z3xq2.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (i15 > 0 && i23 > 0) {
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ vggktp17zbxtkwktz7oxqgj4z3xq4 = (vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (vggktp17zbxtkwktz7oxqgj4z3xq4.ZfQNn8hdWlEQ5cR94249PDsLR) {
                    int i28 = vggktp17zbxtkwktz7oxqgj4z3xq4.zzpBGItXfub0yWj;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ vggktp17zbxtkwktz7oxqgj4z3xq5 = (vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && vggktp17zbxtkwktz7oxqgj4z3xq5.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    vggktp17zbxtkwktz7oxqgj4z3xq5.zzpBGItXfub0yWj += r11;
                    vggktp17zbxtkwktz7oxqgj4z3xq5.zIvmSL0wzmmKGc3X39b2Gw2mUGE = r11;
                    i23--;
                } else if (vggktp17zbxtkwktz7oxqgj4z3xq5.zzpBGItXfub0yWj == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        i4 = iMax;
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ) getChildAt(0).getLayoutParams()).LaeGQIruHQu81hfJldjMOQSVblH3x) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ) getChildAt(i31).getLayoutParams()).LaeGQIruHQu81hfJldjMOQSVblH3x) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ vggktp17zbxtkwktz7oxqgj4z3xq6 = (vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        vggktp17zbxtkwktz7oxqgj4z3xq6.V57tEvNfxZVVcOCAOih5PKr = i32;
                        vggktp17zbxtkwktz7oxqgj4z3xq6.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
                        if (i33 == 0 && !vggktp17zbxtkwktz7oxqgj4z3xq6.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                            ((LinearLayout.LayoutParams) vggktp17zbxtkwktz7oxqgj4z3xq6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (vggktp17zbxtkwktz7oxqgj4z3xq6.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                        vggktp17zbxtkwktz7oxqgj4z3xq6.V57tEvNfxZVVcOCAOih5PKr = i32;
                        vggktp17zbxtkwktz7oxqgj4z3xq6.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
                        ((LinearLayout.LayoutParams) vggktp17zbxtkwktz7oxqgj4z3xq6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) vggktp17zbxtkwktz7oxqgj4z3xq6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) vggktp17zbxtkwktz7oxqgj4z3xq6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ vggktp17zbxtkwktz7oxqgj4z3xq7 = (vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ) childAt4.getLayoutParams();
                if (vggktp17zbxtkwktz7oxqgj4z3xq7.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((vggktp17zbxtkwktz7oxqgj4z3xq7.zzpBGItXfub0yWj * i22) + vggktp17zbxtkwktz7oxqgj4z3xq7.V57tEvNfxZVVcOCAOih5PKr, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.TaDO7ogis3aEiWEtq.jW7EiD0YL6xkbB158jMUzhWNWb1y = z;
    }

    public void setOnMenuItemClickListener(mGtgDhtPVV mgtgdhtpvv) {
        this.SuB3hEmTmbbRGAhtvOOmfKEon = mgtgdhtpvv;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        JaGiaIfgE4oZFS8GScUJb jaGiaIfgE4oZFS8GScUJb = this.TaDO7ogis3aEiWEtq;
        t5olRUJo5JPX6WXwY17n2LzUoDWuf t5olrujo5jpx6wxwy17n2lzuodwuf = jaGiaIfgE4oZFS8GScUJb.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (t5olrujo5jpx6wxwy17n2lzuodwuf != null) {
            t5olrujo5jpx6wxwy17n2lzuodwuf.setImageDrawable(drawable);
        } else {
            jaGiaIfgE4oZFS8GScUJb.q1wNbhk2O6 = true;
            jaGiaIfgE4oZFS8GScUJb.KUYypEB4eNWOZWVDpH = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.vBGA6pPLqSMuYGvprl270j7 = z;
    }

    public void setPopupTheme(int i) {
        if (this.f6ZQsR6bPLvvCDNXOUc != i) {
            this.f6ZQsR6bPLvvCDNXOUc = i;
            if (i == 0) {
                this.jW7EiD0YL6xkbB158jMUzhWNWb1y = getContext();
            } else {
                this.jW7EiD0YL6xkbB158jMUzhWNWb1y = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(JaGiaIfgE4oZFS8GScUJb jaGiaIfgE4oZFS8GScUJb) {
        this.TaDO7ogis3aEiWEtq = jaGiaIfgE4oZFS8GScUJb;
        jaGiaIfgE4oZFS8GScUJb.M9e7PWhFYLD2lOGMker = this;
        this.ko09zE6UAgwkV = jaGiaIfgE4oZFS8GScUJb.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // com.vdodsodjsdt.j6Xzcn6Ej3euYD
    /* JADX INFO: renamed from: zIvmSL0wzmmKGc3X39b2Gw2mUGE */
    public final /* bridge */ /* synthetic */ XbRgnR5SqPXup9z60vLrMOg generateDefaultLayoutParams() {
        return M9e7PWhFYLD2lOGMker();
    }

    @Override // com.vdodsodjsdt.b0ZGtNoko2W8IH5Mo0D9yU
    public final void zzpBGItXfub0yWj(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ) {
        this.ko09zE6UAgwkV = stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
    }

    @Override // com.vdodsodjsdt.j6Xzcn6Ej3euYD, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ(getContext(), attributeSet);
    }
}
