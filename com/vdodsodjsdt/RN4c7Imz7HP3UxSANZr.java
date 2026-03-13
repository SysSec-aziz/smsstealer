package com.vdodsodjsdt;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class RN4c7Imz7HP3UxSANZr extends uLXxmkdsO6wfrm implements ILENsxnuzPXnxt {
    public final Rect HVEwbdULInpTNa0IG;
    public vIZaErdPxA2eRQPhj O1xDAlBZZlZdoEf747lCFHld;
    public final /* synthetic */ oMrLCrx6GRyjLa qygqjTppWwx992;
    public CharSequence vE4yDIjexsP2lGjLaTcB;
    public int y1NaPKTl7R18DOr6e8i5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RN4c7Imz7HP3UxSANZr(oMrLCrx6GRyjLa omrlcrx6gryjla, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.qygqjTppWwx992 = omrlcrx6gryjla;
        this.HVEwbdULInpTNa0IG = new Rect();
        this.pYmKDYlAmhudp = omrlcrx6gryjla;
        this.qNPQb1obP7 = true;
        this.SuB3hEmTmbbRGAhtvOOmfKEon.setFocusable(true);
        this.ko09zE6UAgwkV = new j3XuDMUgohiP2k5VzrxCbvGQR(0, this);
    }

    @Override // com.vdodsodjsdt.ILENsxnuzPXnxt
    public final CharSequence Ca81ebIan1u() {
        return this.vE4yDIjexsP2lGjLaTcB;
    }

    @Override // com.vdodsodjsdt.ILENsxnuzPXnxt
    public final void HzCpKshMOoaw76hFcbOVRYMeRd(int i) {
        this.y1NaPKTl7R18DOr6e8i5 = i;
    }

    @Override // com.vdodsodjsdt.uLXxmkdsO6wfrm, com.vdodsodjsdt.ILENsxnuzPXnxt
    public final void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(ListAdapter listAdapter) {
        super.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(listAdapter);
        this.O1xDAlBZZlZdoEf747lCFHld = (vIZaErdPxA2eRQPhj) listAdapter;
    }

    public final void jW7EiD0YL6xkbB158jMUzhWNWb1y() {
        int i;
        oMrLCrx6GRyjLa omrlcrx6gryjla = this.qygqjTppWwx992;
        Rect rect = omrlcrx6gryjla.M9e7PWhFYLD2lOGMker;
        PoHNXL5T4Q0 poHNXL5T4Q0 = this.SuB3hEmTmbbRGAhtvOOmfKEon;
        Drawable background = poHNXL5T4Q0.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z = TbV4rkOPds9wwfLx.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            i = omrlcrx6gryjla.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = omrlcrx6gryjla.getPaddingLeft();
        int paddingRight = omrlcrx6gryjla.getPaddingRight();
        int width = omrlcrx6gryjla.getWidth();
        int i2 = omrlcrx6gryjla.GI83zq0G8e7zkn;
        if (i2 == -2) {
            int iVxUQ9tBhpHJ2AAEDNW8sghc4m = omrlcrx6gryjla.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.O1xDAlBZZlZdoEf747lCFHld, poHNXL5T4Q0.getBackground());
            int i3 = (omrlcrx6gryjla.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iVxUQ9tBhpHJ2AAEDNW8sghc4m > i3) {
                iVxUQ9tBhpHJ2AAEDNW8sghc4m = i3;
            }
            ko09zE6UAgwkV(Math.max(iVxUQ9tBhpHJ2AAEDNW8sghc4m, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            ko09zE6UAgwkV((width - paddingLeft) - paddingRight);
        } else {
            ko09zE6UAgwkV(i2);
        }
        boolean z2 = TbV4rkOPds9wwfLx.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        this.NSjgqmGjEzuugn2SsG1mZFP = omrlcrx6gryjla.getLayoutDirection() == 1 ? (((width - paddingRight) - this.ZLZeBXTMq0zDztBxtRTuCHrapQ) - this.y1NaPKTl7R18DOr6e8i5) + i : paddingLeft + this.y1NaPKTl7R18DOr6e8i5 + i;
    }

    @Override // com.vdodsodjsdt.ILENsxnuzPXnxt
    public final void q1wNbhk2O6(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        PoHNXL5T4Q0 poHNXL5T4Q0 = this.SuB3hEmTmbbRGAhtvOOmfKEon;
        boolean zIsShowing = poHNXL5T4Q0.isShowing();
        jW7EiD0YL6xkbB158jMUzhWNWb1y();
        poHNXL5T4Q0.setInputMethodMode(2);
        ZfQNn8hdWlEQ5cR94249PDsLR();
        aVXgxTePUTvRAcd avxgxteputvracd = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        avxgxteputvracd.setChoiceMode(1);
        avxgxteputvracd.setTextDirection(i);
        avxgxteputvracd.setTextAlignment(i2);
        oMrLCrx6GRyjLa omrlcrx6gryjla = this.qygqjTppWwx992;
        int selectedItemPosition = omrlcrx6gryjla.getSelectedItemPosition();
        aVXgxTePUTvRAcd avxgxteputvracd2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (poHNXL5T4Q0.isShowing() && avxgxteputvracd2 != null) {
            avxgxteputvracd2.setListSelectionHidden(false);
            avxgxteputvracd2.setSelection(selectedItemPosition);
            if (avxgxteputvracd2.getChoiceMode() != 0) {
                avxgxteputvracd2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = omrlcrx6gryjla.getViewTreeObserver()) == null) {
            return;
        }
        oKfueTVJIz3 okfuetvjiz3 = new oKfueTVJIz3(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(okfuetvjiz3);
        poHNXL5T4Q0.setOnDismissListener(new BOEsqEEJyrQNBF3ZFn3adG1quol(this, okfuetvjiz3));
    }

    @Override // com.vdodsodjsdt.ILENsxnuzPXnxt
    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(CharSequence charSequence) {
        this.vE4yDIjexsP2lGjLaTcB = charSequence;
    }
}
