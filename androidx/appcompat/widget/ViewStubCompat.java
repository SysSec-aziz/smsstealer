package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.vdodsodjsdt.AuEvIFo0QoYm1PHNG;
import com.vdodsodjsdt.nH9QmyhAyPKKDyD;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {
    public WeakReference LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public LayoutInflater zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.V57tEvNfxZVVcOCAOih5PKr = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AuEvIFo0QoYm1PHNG.RhfGHxtXxy0M0grmp2jkRjQg, 0, 0);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.V57tEvNfxZVVcOCAOih5PKr = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.V57tEvNfxZVVcOCAOih5PKr == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.V57tEvNfxZVVcOCAOih5PKr, viewGroup, false);
        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i != -1) {
            viewInflate.setId(i);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new WeakReference(viewInflate);
        return viewInflate;
    }

    public int getInflatedId() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public LayoutInflater getLayoutInflater() {
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    public int getLayoutResource() {
        return this.V57tEvNfxZVVcOCAOih5PKr;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(nH9QmyhAyPKKDyD nh9qmyhaypkkdyd) {
    }
}
