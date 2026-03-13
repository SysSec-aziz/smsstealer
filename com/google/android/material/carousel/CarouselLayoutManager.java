package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.vdodsodjsdt.HwNYcAGldMPcCAM0eNF;
import com.vdodsodjsdt.PGobtLpyfPC4TCnlq740;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.X2Ugfu9vdYrV03oOoksUGkmX;
import com.vdodsodjsdt.YAgT80hsfLW9PF5;
import com.vdodsodjsdt.YoYMmBKQmkacZj7lMi9c;
import com.vdodsodjsdt.bjZMVGssGHXYjIUZR;
import com.vdodsodjsdt.e20NJ5kD0wqGO3;
import com.vdodsodjsdt.k6vrdr35VlvNIA43ldVNBMoE;
import com.vdodsodjsdt.u9SlVAuoWhQUfJ;
import com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu;
import com.vdodsodjsdt.yhxKWuE1ZRi6a9VAU8HG9C;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends wbBBe1vAdVO1DmSg1odNaySAYTu implements HwNYcAGldMPcCAM0eNF {
    public final X2Ugfu9vdYrV03oOoksUGkmX h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public final View.OnLayoutChangeListener ko09zE6UAgwkV;
    public YAgT80hsfLW9PF5 pYmKDYlAmhudp;

    public CarouselLayoutManager() {
        X2Ugfu9vdYrV03oOoksUGkmX x2Ugfu9vdYrV03oOoksUGkmX = new X2Ugfu9vdYrV03oOoksUGkmX();
        new k6vrdr35VlvNIA43ldVNBMoE();
        this.ko09zE6UAgwkV = new View.OnLayoutChangeListener() { // from class: com.vdodsodjsdt.oiLm8geajbb7r5roL0KiDV
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
                    return;
                }
                view.post(new lUqBmUbL53IL3VMM8GT8(2, this.VxUQ9tBhpHJ2AAEDNW8sghc4m));
            }
        };
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = x2Ugfu9vdYrV03oOoksUGkmX;
        HAPpjhiCsV9ONY23505HCBI9IX();
        Hf6zp5JYLjGyFD2HXbpHA9(0);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int ByTQIhgl7ezGvHXEd(int i, yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        if (!PfK8qHOJoCLG() || TaDO7ogis3aEiWEtq() == 0 || i == 0) {
            return 0;
        }
        yhxkwue1zri6a9vau8hg9c.ZfQNn8hdWlEQ5cR94249PDsLR(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int Ca81ebIan1u(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        return 0;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void GE1sqSYiEYQO2ew7WEZwTtUeS5(int i, int i2) {
        SuB3hEmTmbbRGAhtvOOmfKEon();
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void H2VFYNJEVGAX(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        if (e20nj5kd0wqgo3.zzpBGItXfub0yWj() > 0) {
            if ((PfK8qHOJoCLG() ? this.p59rPv72J9 : this.Ca81ebIan1u) > 0.0f) {
                ScSj9HEorWkb3bIb1HyeKVoW();
                yhxkwue1zri6a9vau8hg9c.ZfQNn8hdWlEQ5cR94249PDsLR(0);
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        mhUCRR8ceqc7mAozW(yhxkwue1zri6a9vau8hg9c);
    }

    public final void Hf6zp5JYLjGyFD2HXbpHA9(int i) {
        YAgT80hsfLW9PF5 yAgT80hsfLW9PF5;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("invalid orientation:", i));
        }
        V57tEvNfxZVVcOCAOih5PKr(null);
        YAgT80hsfLW9PF5 yAgT80hsfLW9PF52 = this.pYmKDYlAmhudp;
        if (yAgT80hsfLW9PF52 == null || i != yAgT80hsfLW9PF52.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            if (i == 0) {
                yAgT80hsfLW9PF5 = new YAgT80hsfLW9PF5(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                yAgT80hsfLW9PF5 = new YAgT80hsfLW9PF5(this, 0);
            }
            this.pYmKDYlAmhudp = yAgT80hsfLW9PF5;
            HAPpjhiCsV9ONY23505HCBI9IX();
        }
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int HzCpKshMOoaw76hFcbOVRYMeRd(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        return 0;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void ItrQwCXbty5PZtje5JS(AccessibilityEvent accessibilityEvent) {
        super.ItrQwCXbty5PZtje5JS(accessibilityEvent);
        if (TaDO7ogis3aEiWEtq() > 0) {
            accessibilityEvent.setFromIndex(wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(vBGA6pPLqSMuYGvprl270j7(0)));
            accessibilityEvent.setToIndex(wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(vBGA6pPLqSMuYGvprl270j7(TaDO7ogis3aEiWEtq() - 1)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View JUdwvN8LfOMa(android.view.View r4, int r5, com.vdodsodjsdt.yhxKWuE1ZRi6a9VAU8HG9C r6, com.vdodsodjsdt.e20NJ5kD0wqGO3 r7) {
        /*
            r3 = this;
            int r6 = r3.TaDO7ogis3aEiWEtq()
            if (r6 != 0) goto L8
            goto L96
        L8:
            com.vdodsodjsdt.YAgT80hsfLW9PF5 r6 = r3.pYmKDYlAmhudp
            int r6 = r6.VxUQ9tBhpHJ2AAEDNW8sghc4m
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L46
            r2 = 2
            if (r5 == r2) goto L3c
            r2 = 17
            if (r5 == r2) goto L4b
            r2 = 33
            if (r5 == r2) goto L48
            r2 = 66
            if (r5 == r2) goto L3e
            r2 = 130(0x82, float:1.82E-43)
            if (r5 == r2) goto L3a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown focus request:"
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "CarouselLayoutManager"
            android.util.Log.d(r6, r5)
        L38:
            r5 = r7
            goto L54
        L3a:
            if (r6 != r1) goto L38
        L3c:
            r5 = r1
            goto L54
        L3e:
            if (r6 != 0) goto L38
            boolean r5 = r3.ScSj9HEorWkb3bIb1HyeKVoW()
            if (r5 == 0) goto L3c
        L46:
            r5 = r0
            goto L54
        L48:
            if (r6 != r1) goto L38
            goto L46
        L4b:
            if (r6 != 0) goto L38
            boolean r5 = r3.ScSj9HEorWkb3bIb1HyeKVoW()
            if (r5 == 0) goto L46
            goto L3c
        L54:
            if (r5 != r7) goto L57
            goto L96
        L57:
            r6 = 0
            if (r5 != r0) goto L8b
            int r4 = com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(r4)
            if (r4 != 0) goto L61
            goto L96
        L61:
            android.view.View r4 = r3.vBGA6pPLqSMuYGvprl270j7(r6)
            int r4 = com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(r4)
            int r4 = r4 - r1
            if (r4 < 0) goto L7a
            int r5 = r3.SuB3hEmTmbbRGAhtvOOmfKEon()
            if (r4 < r5) goto L73
            goto L7a
        L73:
            com.vdodsodjsdt.YAgT80hsfLW9PF5 r4 = r3.pYmKDYlAmhudp
            r4.VxUQ9tBhpHJ2AAEDNW8sghc4m()
            r4 = 0
            throw r4
        L7a:
            boolean r4 = r3.ScSj9HEorWkb3bIb1HyeKVoW()
            if (r4 == 0) goto L86
            int r4 = r3.TaDO7ogis3aEiWEtq()
            int r6 = r4 + (-1)
        L86:
            android.view.View r4 = r3.vBGA6pPLqSMuYGvprl270j7(r6)
            return r4
        L8b:
            int r4 = com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(r4)
            int r5 = r3.SuB3hEmTmbbRGAhtvOOmfKEon()
            int r5 = r5 - r1
            if (r4 != r5) goto L98
        L96:
            r4 = 0
            return r4
        L98:
            int r4 = r3.TaDO7ogis3aEiWEtq()
            int r4 = r4 - r1
            android.view.View r4 = r3.vBGA6pPLqSMuYGvprl270j7(r4)
            int r4 = com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(r4)
            int r4 = r4 + r1
            if (r4 < 0) goto Lb6
            int r5 = r3.SuB3hEmTmbbRGAhtvOOmfKEon()
            if (r4 < r5) goto Laf
            goto Lb6
        Laf:
            com.vdodsodjsdt.YAgT80hsfLW9PF5 r4 = r3.pYmKDYlAmhudp
            r4.VxUQ9tBhpHJ2AAEDNW8sghc4m()
            r4 = 0
            throw r4
        Lb6:
            boolean r4 = r3.ScSj9HEorWkb3bIb1HyeKVoW()
            if (r4 == 0) goto Lbd
            goto Lc3
        Lbd:
            int r4 = r3.TaDO7ogis3aEiWEtq()
            int r6 = r4 + (-1)
        Lc3:
            android.view.View r4 = r3.vBGA6pPLqSMuYGvprl270j7(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.JUdwvN8LfOMa(android.view.View, int, com.vdodsodjsdt.yhxKWuE1ZRi6a9VAU8HG9C, com.vdodsodjsdt.e20NJ5kD0wqGO3):android.view.View");
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int KUYypEB4eNWOZWVDpH(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        return 0;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void KYZ9RyuOc42A2J() {
        SuB3hEmTmbbRGAhtvOOmfKEon();
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void L8DMw02rUTs2w(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        X2Ugfu9vdYrV03oOoksUGkmX x2Ugfu9vdYrV03oOoksUGkmX = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        float dimension = x2Ugfu9vdYrV03oOoksUGkmX.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        x2Ugfu9vdYrV03oOoksUGkmX.VxUQ9tBhpHJ2AAEDNW8sghc4m = dimension;
        float dimension2 = x2Ugfu9vdYrV03oOoksUGkmX.zzpBGItXfub0yWj;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        x2Ugfu9vdYrV03oOoksUGkmX.zzpBGItXfub0yWj = dimension2;
        HAPpjhiCsV9ONY23505HCBI9IX();
        recyclerView.addOnLayoutChangeListener(this.ko09zE6UAgwkV);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x() {
        return !PfK8qHOJoCLG();
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int M9e7PWhFYLD2lOGMker(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        TaDO7ogis3aEiWEtq();
        return 0;
    }

    public final boolean PfK8qHOJoCLG() {
        return this.pYmKDYlAmhudp.VxUQ9tBhpHJ2AAEDNW8sghc4m == 0;
    }

    public final boolean ScSj9HEorWkb3bIb1HyeKVoW() {
        return PfK8qHOJoCLG() && pzqP2AqKW6J5PO8zCKnW() == 1;
    }

    @Override // com.vdodsodjsdt.HwNYcAGldMPcCAM0eNF
    public final PointF VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) {
        return null;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void Z1FjjMJ0suz8AFI7gsA4GDLMXv(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        if (TaDO7ogis3aEiWEtq() == 0) {
            return;
        }
        wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(vBGA6pPLqSMuYGvprl270j7(0));
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR() {
        return PfK8qHOJoCLG();
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final boolean d9zDyyznnp3oaDT1Ug() {
        return true;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int e1gEV3X9xwmHj(int i, yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        if (!LaeGQIruHQu81hfJldjMOQSVblH3x() || TaDO7ogis3aEiWEtq() == 0 || i == 0) {
            return 0;
        }
        yhxkwue1zri6a9vau8hg9c.ZfQNn8hdWlEQ5cR94249PDsLR(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final YoYMmBKQmkacZj7lMi9c ko09zE6UAgwkV() {
        return new YoYMmBKQmkacZj7lMi9c(-2, -2);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void lQ0rO9lhQIyVe7Rp6(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.ko09zE6UAgwkV);
    }

    public final float nNOZCSz1a7S(float f, float f2) {
        return ScSj9HEorWkb3bIb1HyeKVoW() ? f - f2 : f + f2;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int p59rPv72J9(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        return 0;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int q1wNbhk2O6(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        TaDO7ogis3aEiWEtq();
        return 0;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void w0Wu95l8dVNw5rZMRu(View view, Rect rect) {
        super.w0Wu95l8dVNw5rZMRu(view, rect);
        rect.centerY();
        if (PfK8qHOJoCLG()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final boolean wR7sbzHKf9hYV1lxoS6nqyszepWvN(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void wdI7vzA3Qmcwd(int i, int i2) {
        SuB3hEmTmbbRGAhtvOOmfKEon();
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void zyiF0wv9HozxGOIDt8PvVp(RecyclerView recyclerView, int i) {
        bjZMVGssGHXYjIUZR bjzmvgssghxyjiuzr = new bjZMVGssGHXYjIUZR(this, recyclerView.getContext());
        bjzmvgssghxyjiuzr.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        KMiA9Sqk243eQkFNNoS(bjzmvgssghxyjiuzr);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new k6vrdr35VlvNIA43ldVNBMoE();
        this.ko09zE6UAgwkV = new View.OnLayoutChangeListener() { // from class: com.vdodsodjsdt.oiLm8geajbb7r5roL0KiDV
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                if (i32 - i3 == i7 - i5 && i4 - i22 == i8 - i6) {
                    return;
                }
                view.post(new lUqBmUbL53IL3VMM8GT8(2, this.VxUQ9tBhpHJ2AAEDNW8sghc4m));
            }
        };
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = new X2Ugfu9vdYrV03oOoksUGkmX();
        HAPpjhiCsV9ONY23505HCBI9IX();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, PGobtLpyfPC4TCnlq740.zzpBGItXfub0yWj);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            HAPpjhiCsV9ONY23505HCBI9IX();
            Hf6zp5JYLjGyFD2HXbpHA9(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void tpEo0fy9FaoJYrSFHRfIK6(int i) {
    }
}
