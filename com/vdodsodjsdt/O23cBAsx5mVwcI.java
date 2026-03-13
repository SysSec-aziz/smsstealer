package com.vdodsodjsdt;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class O23cBAsx5mVwcI extends CluohSX0eAQHylXJOFOnCXEf0C {
    public int Ca81ebIan1u;
    public final int GI83zq0G8e7zkn;
    public int HzCpKshMOoaw76hFcbOVRYMeRd;
    public int KUYypEB4eNWOZWVDpH;
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final int M9e7PWhFYLD2lOGMker;
    public final Drawable NSjgqmGjEzuugn2SsG1mZFP;
    public final ValueAnimator RhfGHxtXxy0M0grmp2jkRjQg;
    public final RfOSIaL6qUBGKJY9MSCBP5ba SuB3hEmTmbbRGAhtvOOmfKEon;
    public final StateListDrawable V57tEvNfxZVVcOCAOih5PKr;
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final StateListDrawable ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final Drawable ZfQNn8hdWlEQ5cR94249PDsLR;
    public float h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public final RecyclerView jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public int p59rPv72J9;
    public float q1wNbhk2O6;
    public int qNPQb1obP7;
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final int zzpBGItXfub0yWj;
    public static final int[] pzqP2AqKW6J5PO8zCKnW = {android.R.attr.state_pressed};
    public static final int[] aXO0LSrt8bKV = new int[0];
    public int pYmKDYlAmhudp = 0;
    public int ko09zE6UAgwkV = 0;
    public boolean f6ZQsR6bPLvvCDNXOUc = false;
    public boolean vBGA6pPLqSMuYGvprl270j7 = false;
    public int TaDO7ogis3aEiWEtq = 0;
    public int Irh5auREsoeV1C1RaBamlmy = 0;
    public final int[] q11o1hieEkZDhF1MGOZI26oZiDT = new int[2];
    public final int[] w0Wu95l8dVNw5rZMRu = new int[2];

    public O23cBAsx5mVwcI(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.RhfGHxtXxy0M0grmp2jkRjQg = valueAnimatorOfFloat;
        this.qNPQb1obP7 = 0;
        RfOSIaL6qUBGKJY9MSCBP5ba rfOSIaL6qUBGKJY9MSCBP5ba = new RfOSIaL6qUBGKJY9MSCBP5ba(5, this);
        this.SuB3hEmTmbbRGAhtvOOmfKEon = rfOSIaL6qUBGKJY9MSCBP5ba;
        PUR5jUtiabkIyg91gBdvDKLAOI pUR5jUtiabkIyg91gBdvDKLAOI = new PUR5jUtiabkIyg91gBdvDKLAOI(this);
        this.V57tEvNfxZVVcOCAOih5PKr = stateListDrawable;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = drawable;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = stateListDrawable2;
        this.NSjgqmGjEzuugn2SsG1mZFP = drawable2;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = Math.max(i, drawable.getIntrinsicWidth());
        this.GI83zq0G8e7zkn = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.M9e7PWhFYLD2lOGMker = Math.max(i, drawable2.getIntrinsicWidth());
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i2;
        this.zzpBGItXfub0yWj = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new gvhxUKLGHl(this));
        valueAnimatorOfFloat.addUpdateListener(new UtURWB5bbAd9(1, this));
        RecyclerView recyclerView2 = this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
            wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = recyclerView2.p59rPv72J9;
            if (wbbbe1vadvo1dmsg1odnaysaytu != null) {
                wbbbe1vadvo1dmsg1odnaysaytu.V57tEvNfxZVVcOCAOih5PKr("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.ymT6yQrus3w();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
            recyclerView3.pYmKDYlAmhudp.remove(this);
            if (recyclerView3.ko09zE6UAgwkV == this) {
                recyclerView3.ko09zE6UAgwkV = null;
            }
            ArrayList arrayList2 = this.jW7EiD0YL6xkbB158jMUzhWNWb1y.bjhcQ0u7VT2OYYrwk96HrWoN;
            if (arrayList2 != null) {
                arrayList2.remove(pUR5jUtiabkIyg91gBdvDKLAOI);
            }
            this.jW7EiD0YL6xkbB158jMUzhWNWb1y.removeCallbacks(rfOSIaL6qUBGKJY9MSCBP5ba);
        }
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = recyclerView;
        recyclerView.ZLZeBXTMq0zDztBxtRTuCHrapQ(this);
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y.pYmKDYlAmhudp.add(this);
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y.NSjgqmGjEzuugn2SsG1mZFP(pUR5jUtiabkIyg91gBdvDKLAOI);
    }

    public static int LaeGQIruHQu81hfJldjMOQSVblH3x(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    public final boolean V57tEvNfxZVVcOCAOih5PKr(float f, float f2) {
        if (f2 < this.ko09zE6UAgwkV - this.GI83zq0G8e7zkn) {
            return false;
        }
        int i = this.Ca81ebIan1u;
        int i2 = this.p59rPv72J9;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        int i = this.qNPQb1obP7;
        ValueAnimator valueAnimator = this.RhfGHxtXxy0M0grmp2jkRjQg;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.qNPQb1obP7 = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR(float f, float f2) {
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int layoutDirection = this.jW7EiD0YL6xkbB158jMUzhWNWb1y.getLayoutDirection();
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.pYmKDYlAmhudp - i) {
            return false;
        }
        int i2 = this.KUYypEB4eNWOZWVDpH;
        int i3 = this.HzCpKshMOoaw76hFcbOVRYMeRd / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(int i) {
        RfOSIaL6qUBGKJY9MSCBP5ba rfOSIaL6qUBGKJY9MSCBP5ba = this.SuB3hEmTmbbRGAhtvOOmfKEon;
        StateListDrawable stateListDrawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i == 2 && this.TaDO7ogis3aEiWEtq != 2) {
            stateListDrawable.setState(pzqP2AqKW6J5PO8zCKnW);
            this.jW7EiD0YL6xkbB158jMUzhWNWb1y.removeCallbacks(rfOSIaL6qUBGKJY9MSCBP5ba);
        }
        if (i == 0) {
            this.jW7EiD0YL6xkbB158jMUzhWNWb1y.invalidate();
        } else {
            ZLZeBXTMq0zDztBxtRTuCHrapQ();
        }
        if (this.TaDO7ogis3aEiWEtq == 2 && i != 2) {
            stateListDrawable.setState(aXO0LSrt8bKV);
            this.jW7EiD0YL6xkbB158jMUzhWNWb1y.removeCallbacks(rfOSIaL6qUBGKJY9MSCBP5ba);
            this.jW7EiD0YL6xkbB158jMUzhWNWb1y.postDelayed(rfOSIaL6qUBGKJY9MSCBP5ba, 1200);
        } else if (i == 1) {
            this.jW7EiD0YL6xkbB158jMUzhWNWb1y.removeCallbacks(rfOSIaL6qUBGKJY9MSCBP5ba);
            this.jW7EiD0YL6xkbB158jMUzhWNWb1y.postDelayed(rfOSIaL6qUBGKJY9MSCBP5ba, 1500);
        }
        this.TaDO7ogis3aEiWEtq = i;
    }

    @Override // com.vdodsodjsdt.CluohSX0eAQHylXJOFOnCXEf0C
    public final void zzpBGItXfub0yWj(Canvas canvas, RecyclerView recyclerView) {
        int i = this.pYmKDYlAmhudp;
        RecyclerView recyclerView2 = this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
        if (i != recyclerView2.getWidth() || this.ko09zE6UAgwkV != recyclerView2.getHeight()) {
            this.pYmKDYlAmhudp = recyclerView2.getWidth();
            this.ko09zE6UAgwkV = recyclerView2.getHeight();
            zIvmSL0wzmmKGc3X39b2Gw2mUGE(0);
            return;
        }
        if (this.qNPQb1obP7 != 0) {
            if (this.f6ZQsR6bPLvvCDNXOUc) {
                int i2 = this.pYmKDYlAmhudp;
                int i3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                int i4 = i2 - i3;
                int i5 = this.KUYypEB4eNWOZWVDpH;
                int i6 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.V57tEvNfxZVVcOCAOih5PKr;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                int i9 = this.ko09zE6UAgwkV;
                Drawable drawable = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                drawable.setBounds(0, 0, i8, i9);
                WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.vBGA6pPLqSMuYGvprl270j7) {
                int i10 = this.ko09zE6UAgwkV;
                int i11 = this.GI83zq0G8e7zkn;
                int i12 = i10 - i11;
                int i13 = this.Ca81ebIan1u;
                int i14 = this.p59rPv72J9;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.pYmKDYlAmhudp;
                int i17 = this.M9e7PWhFYLD2lOGMker;
                Drawable drawable2 = this.NSjgqmGjEzuugn2SsG1mZFP;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }
}
