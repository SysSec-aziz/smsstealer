package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class PLe0duizehnNHFlDQfVGVxW1I extends ImageView {
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final bLyH8EmzTL4BGbNNd4 V57tEvNfxZVVcOCAOih5PKr;
    public final EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb ZfQNn8hdWlEQ5cR94249PDsLR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PLe0duizehnNHFlDQfVGVxW1I(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Avr7DhLd4ui9.VxUQ9tBhpHJ2AAEDNW8sghc4m(context);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = false;
        Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.VxUQ9tBhpHJ2AAEDNW8sghc4m(this, getContext());
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = new bLyH8EmzTL4BGbNNd4(this);
        this.V57tEvNfxZVVcOCAOih5PKr = blyh8emztl4bgbnnd4;
        blyh8emztl4bgbnnd4.ZfQNn8hdWlEQ5cR94249PDsLR(attributeSet, i);
        EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb = new EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb(this);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb;
        eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.LaeGQIruHQu81hfJldjMOQSVblH3x(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (blyh8emztl4bgbnnd4 != null) {
            blyh8emztl4bgbnnd4.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb != null) {
            eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (blyh8emztl4bgbnnd4 != null) {
            return blyh8emztl4bgbnnd4.zzpBGItXfub0yWj();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (blyh8emztl4bgbnnd4 != null) {
            return blyh8emztl4bgbnnd4.V57tEvNfxZVVcOCAOih5PKr();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        nK7IfeTXa4 nk7ifetxa4;
        EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb == null || (nk7ifetxa4 = (nK7IfeTXa4) eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.ZfQNn8hdWlEQ5cR94249PDsLR) == null) {
            return null;
        }
        return (ColorStateList) nk7ifetxa4.V57tEvNfxZVVcOCAOih5PKr;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        nK7IfeTXa4 nk7ifetxa4;
        EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb == null || (nk7ifetxa4 = (nK7IfeTXa4) eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.ZfQNn8hdWlEQ5cR94249PDsLR) == null) {
            return null;
        }
        return (PorterDuff.Mode) nk7ifetxa4.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (blyh8emztl4bgbnnd4 != null) {
            blyh8emztl4bgbnnd4.LaeGQIruHQu81hfJldjMOQSVblH3x();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (blyh8emztl4bgbnnd4 != null) {
            blyh8emztl4bgbnnd4.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb != null) {
            eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb != null && drawable != null && !this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.zzpBGItXfub0yWj = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb != null) {
            eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                return;
            }
            ImageView imageView = (ImageView) eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.V57tEvNfxZVVcOCAOih5PKr;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.zzpBGItXfub0yWj);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb != null) {
            ImageView imageView = (ImageView) eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.V57tEvNfxZVVcOCAOih5PKr;
            if (i != 0) {
                Drawable drawableJW7EiD0YL6xkbB158jMUzhWNWb1y = KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(imageView.getContext(), i);
                if (drawableJW7EiD0YL6xkbB158jMUzhWNWb1y != null) {
                    VGwRvGhOWf9duTP8Dxb9PtsLAe1z.VxUQ9tBhpHJ2AAEDNW8sghc4m(drawableJW7EiD0YL6xkbB158jMUzhWNWb1y);
                }
                imageView.setImageDrawable(drawableJW7EiD0YL6xkbB158jMUzhWNWb1y);
            } else {
                imageView.setImageDrawable(null);
            }
            eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb != null) {
            eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (blyh8emztl4bgbnnd4 != null) {
            blyh8emztl4bgbnnd4.NSjgqmGjEzuugn2SsG1mZFP(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (blyh8emztl4bgbnnd4 != null) {
            blyh8emztl4bgbnnd4.GI83zq0G8e7zkn(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb != null) {
            if (((nK7IfeTXa4) eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.ZfQNn8hdWlEQ5cR94249PDsLR) == null) {
                eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.ZfQNn8hdWlEQ5cR94249PDsLR = new nK7IfeTXa4();
            }
            nK7IfeTXa4 nk7ifetxa4 = (nK7IfeTXa4) eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.ZfQNn8hdWlEQ5cR94249PDsLR;
            nk7ifetxa4.V57tEvNfxZVVcOCAOih5PKr = colorStateList;
            nk7ifetxa4.zzpBGItXfub0yWj = true;
            eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb != null) {
            if (((nK7IfeTXa4) eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.ZfQNn8hdWlEQ5cR94249PDsLR) == null) {
                eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.ZfQNn8hdWlEQ5cR94249PDsLR = new nK7IfeTXa4();
            }
            nK7IfeTXa4 nk7ifetxa4 = (nK7IfeTXa4) eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.ZfQNn8hdWlEQ5cR94249PDsLR;
            nk7ifetxa4.ZfQNn8hdWlEQ5cR94249PDsLR = mode;
            nk7ifetxa4.VxUQ9tBhpHJ2AAEDNW8sghc4m = true;
            eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
    }
}
