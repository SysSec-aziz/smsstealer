package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.vdodsodjsdt.EQz8nVyVxmIrHN6fNCQWutFG0b30O;
import com.vdodsodjsdt.F44whnLsbQ;
import com.vdodsodjsdt.FLWIoSaHb1q8TqFvEBgPyRGrzvi6;
import com.vdodsodjsdt.KfeOQNOupsCg6878zi4e;
import com.vdodsodjsdt.PGobtLpyfPC4TCnlq740;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.T3RbnymT8IuKvnwatFNeNL7H;
import com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] KYZ9RyuOc42A2J = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public boolean ItrQwCXbty5PZtje5JS;
    public Integer JUdwvN8LfOMa;
    public boolean hKs1wlZyvtUNaW1f5ABIGacfPcvX;
    public ImageView.ScaleType vXWl0o6I4U59CgHs9;
    public Boolean wdI7vzA3Qmcwd;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(sGipz63rTUmSj3uFDvOtzihao.bjhcQ0u7VT2OYYrwk96HrWoN(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayVE4yDIjexsP2lGjLaTcB = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.vE4yDIjexsP2lGjLaTcB(context2, attributeSet, PGobtLpyfPC4TCnlq740.TaDO7ogis3aEiWEtq, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayVE4yDIjexsP2lGjLaTcB.hasValue(2)) {
            setNavigationIconTint(typedArrayVE4yDIjexsP2lGjLaTcB.getColor(2, -1));
        }
        this.ItrQwCXbty5PZtje5JS = typedArrayVE4yDIjexsP2lGjLaTcB.getBoolean(4, false);
        this.hKs1wlZyvtUNaW1f5ABIGacfPcvX = typedArrayVE4yDIjexsP2lGjLaTcB.getBoolean(3, false);
        int i = typedArrayVE4yDIjexsP2lGjLaTcB.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = KYZ9RyuOc42A2J;
            if (i < scaleTypeArr.length) {
                this.vXWl0o6I4U59CgHs9 = scaleTypeArr[i];
            }
        }
        if (typedArrayVE4yDIjexsP2lGjLaTcB.hasValue(0)) {
            this.wdI7vzA3Qmcwd = Boolean.valueOf(typedArrayVE4yDIjexsP2lGjLaTcB.getBoolean(0, false));
        }
        typedArrayVE4yDIjexsP2lGjLaTcB.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : F44whnLsbQ.Irh5auREsoeV1C1RaBamlmy(background);
        if (colorStateListValueOf != null) {
            EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O = new EQz8nVyVxmIrHN6fNCQWutFG0b30O();
            eQz8nVyVxmIrHN6fNCQWutFG0b30O.p59rPv72J9(colorStateListValueOf);
            eQz8nVyVxmIrHN6fNCQWutFG0b30O.HzCpKshMOoaw76hFcbOVRYMeRd(context2);
            eQz8nVyVxmIrHN6fNCQWutFG0b30O.q1wNbhk2O6(getElevation());
            setBackground(eQz8nVyVxmIrHN6fNCQWutFG0b30O);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.vXWl0o6I4U59CgHs9;
    }

    public Integer getNavigationIconTint() {
        return this.JUdwvN8LfOMa;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof EQz8nVyVxmIrHN6fNCQWutFG0b30O) {
            FLWIoSaHb1q8TqFvEBgPyRGrzvi6.y1NaPKTl7R18DOr6e8i5(this, (EQz8nVyVxmIrHN6fNCQWutFG0b30O) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        T3RbnymT8IuKvnwatFNeNL7H t3RbnymT8IuKvnwatFNeNL7H = KfeOQNOupsCg6878zi4e.p59rPv72J9;
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.ItrQwCXbty5PZtje5JS || this.hKs1wlZyvtUNaW1f5ABIGacfPcvX) {
            ArrayList arrayListQNPQb1obP7 = KfeOQNOupsCg6878zi4e.qNPQb1obP7(this, getTitle());
            TextView textView = arrayListQNPQb1obP7.isEmpty() ? null : (TextView) Collections.min(arrayListQNPQb1obP7, t3RbnymT8IuKvnwatFNeNL7H);
            ArrayList arrayListQNPQb1obP72 = KfeOQNOupsCg6878zi4e.qNPQb1obP7(this, getSubtitle());
            TextView textView2 = arrayListQNPQb1obP72.isEmpty() ? null : (TextView) Collections.max(arrayListQNPQb1obP72, t3RbnymT8IuKvnwatFNeNL7H);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.ItrQwCXbty5PZtje5JS && textView != null) {
                    vBGA6pPLqSMuYGvprl270j7(textView, pair);
                }
                if (this.hKs1wlZyvtUNaW1f5ABIGacfPcvX && textView2 != null) {
                    vBGA6pPLqSMuYGvprl270j7(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.wdI7vzA3Qmcwd;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.vXWl0o6I4U59CgHs9;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof EQz8nVyVxmIrHN6fNCQWutFG0b30O) {
            ((EQz8nVyVxmIrHN6fNCQWutFG0b30O) background).q1wNbhk2O6(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.wdI7vzA3Qmcwd;
        if (bool == null || bool.booleanValue() != z) {
            this.wdI7vzA3Qmcwd = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.vXWl0o6I4U59CgHs9 != scaleType) {
            this.vXWl0o6I4U59CgHs9 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.JUdwvN8LfOMa != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.JUdwvN8LfOMa.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.JUdwvN8LfOMa = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.hKs1wlZyvtUNaW1f5ABIGacfPcvX != z) {
            this.hKs1wlZyvtUNaW1f5ABIGacfPcvX = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.ItrQwCXbty5PZtje5JS != z) {
            this.ItrQwCXbty5PZtje5JS = z;
            requestLayout();
        }
    }

    public final void vBGA6pPLqSMuYGvprl270j7(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
