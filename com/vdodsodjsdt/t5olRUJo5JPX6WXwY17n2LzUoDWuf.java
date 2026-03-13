package com.vdodsodjsdt;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class t5olRUJo5JPX6WXwY17n2LzUoDWuf extends PLe0duizehnNHFlDQfVGVxW1I implements X9tkup2CAfSBHilrz1FF4Q {
    public final /* synthetic */ JaGiaIfgE4oZFS8GScUJb zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5olRUJo5JPX6WXwY17n2LzUoDWuf(JaGiaIfgE4oZFS8GScUJb jaGiaIfgE4oZFS8GScUJb, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = jaGiaIfgE4oZFS8GScUJb;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        KfeOQNOupsCg6878zi4e.lQ0rO9lhQIyVe7Rp6(this, getContentDescription());
        setOnTouchListener(new rl8oDmZYMaZZC0(this, this));
    }

    @Override // com.vdodsodjsdt.X9tkup2CAfSBHilrz1FF4Q
    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.KUYypEB4eNWOZWVDpH();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }

    @Override // com.vdodsodjsdt.X9tkup2CAfSBHilrz1FF4Q
    public final boolean zzpBGItXfub0yWj() {
        return false;
    }
}
