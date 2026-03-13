package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.vdodsodjsdt.AuEvIFo0QoYm1PHNG;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public boolean V57tEvNfxZVVcOCAOih5PKr;
    public boolean ZfQNn8hdWlEQ5cR94249PDsLR;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
        int[] iArr = AuEvIFo0QoYm1PHNG.HzCpKshMOoaw76hFcbOVRYMeRd;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        xb0r6yEzq0tw9m7nTWG5BFR8.KUYypEB4eNWOZWVDpH(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.V57tEvNfxZVVcOCAOih5PKr = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.V57tEvNfxZVVcOCAOih5PKr);
        }
    }

    private void setStacked(boolean z) {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR != z) {
            if (!z || this.V57tEvNfxZVVcOCAOih5PKr) {
                this.ZfQNn8hdWlEQ5cR94249PDsLR = z;
                setOrientation(z ? 1 : 0);
                setGravity(z ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int paddingBottom = 0;
        if (this.V57tEvNfxZVVcOCAOih5PKr) {
            if (size > this.LaeGQIruHQu81hfJldjMOQSVblH3x && this.ZfQNn8hdWlEQ5cR94249PDsLR) {
                setStacked(false);
            }
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = size;
        }
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (this.V57tEvNfxZVVcOCAOih5PKr && !this.ZfQNn8hdWlEQ5cR94249PDsLR && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            i3 = -1;
            if (i4 >= childCount) {
                i4 = -1;
                break;
            } else if (getChildAt(i4).getVisibility() == 0) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            View childAt = getChildAt(i4);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
                int i5 = i4 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i5 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i5).getVisibility() == 0) {
                        i3 = i5;
                        break;
                    }
                    i5++;
                }
                paddingBottom = i3 >= 0 ? getChildAt(i3).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.V57tEvNfxZVVcOCAOih5PKr != z) {
            this.V57tEvNfxZVVcOCAOih5PKr = z;
            if (!z && this.ZfQNn8hdWlEQ5cR94249PDsLR) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
