package com.vdodsodjsdt;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class NcUzwSwM1i9CwI extends Drawable {
    public final ActionBarContainer VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public NcUzwSwM1i9CwI(ActionBarContainer actionBarContainer) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (actionBarContainer.GI83zq0G8e7zkn) {
            Drawable drawable = actionBarContainer.NSjgqmGjEzuugn2SsG1mZFP;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (drawable3 == null || !actionBarContainer.M9e7PWhFYLD2lOGMker) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (actionBarContainer.GI83zq0G8e7zkn) {
            if (actionBarContainer.NSjgqmGjEzuugn2SsG1mZFP != null) {
                actionBarContainer.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
