package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.vdodsodjsdt.IRMVboVyQ4o8fsR;
import com.vdodsodjsdt.YLkEIT0m8eaMtut;
import com.vdodsodjsdt.powVRICeb3L1;
import com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends IRMVboVyQ4o8fsR implements Checkable {
    public static final int[] GI83zq0G8e7zkn = {R.attr.state_checked};
    public boolean NSjgqmGjEzuugn2SsG1mZFP;
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.vdodsodjsdt.R.attr.imageButtonStyle);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
        this.NSjgqmGjEzuugn2SsG1mZFP = true;
        xb0r6yEzq0tw9m7nTWG5BFR8.q1wNbhk2O6(this, new powVRICeb3L1(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), GI83zq0G8e7zkn) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof YLkEIT0m8eaMtut)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        YLkEIT0m8eaMtut yLkEIT0m8eaMtut = (YLkEIT0m8eaMtut) parcelable;
        super.onRestoreInstanceState(yLkEIT0m8eaMtut.V57tEvNfxZVVcOCAOih5PKr);
        setChecked(yLkEIT0m8eaMtut.LaeGQIruHQu81hfJldjMOQSVblH3x);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        YLkEIT0m8eaMtut yLkEIT0m8eaMtut = new YLkEIT0m8eaMtut(super.onSaveInstanceState());
        yLkEIT0m8eaMtut.LaeGQIruHQu81hfJldjMOQSVblH3x = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        return yLkEIT0m8eaMtut;
    }

    public void setCheckable(boolean z) {
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ != z) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.ZLZeBXTMq0zDztBxtRTuCHrapQ || this.zIvmSL0wzmmKGc3X39b2Gw2mUGE == z) {
            return;
        }
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.NSjgqmGjEzuugn2SsG1mZFP = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.NSjgqmGjEzuugn2SsG1mZFP) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
    }
}
