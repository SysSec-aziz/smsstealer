package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class uLXxmkdsO6wfrm implements pHKSskKTBV {
    public static final Method aXO0LSrt8bKV;
    public static final Method pzqP2AqKW6J5PO8zCKnW;
    public int GI83zq0G8e7zkn;
    public boolean HzCpKshMOoaw76hFcbOVRYMeRd;
    public boolean KUYypEB4eNWOZWVDpH;
    public aVXgxTePUTvRAcd LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int NSjgqmGjEzuugn2SsG1mZFP;
    public Rect RhfGHxtXxy0M0grmp2jkRjQg;
    public final PoHNXL5T4Q0 SuB3hEmTmbbRGAhtvOOmfKEon;
    public final Context V57tEvNfxZVVcOCAOih5PKr;
    public ListAdapter ZfQNn8hdWlEQ5cR94249PDsLR;
    public dhdHXTcVuVTGGrO4Qnb1Pk16PmuF h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public AdapterView.OnItemSelectedListener jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public AdapterView.OnItemClickListener ko09zE6UAgwkV;
    public View pYmKDYlAmhudp;
    public final Handler q11o1hieEkZDhF1MGOZI26oZiDT;
    public boolean q1wNbhk2O6;
    public boolean qNPQb1obP7;
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE = -2;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ = -2;
    public final int M9e7PWhFYLD2lOGMker = 1002;
    public int p59rPv72J9 = 0;
    public final int Ca81ebIan1u = Integer.MAX_VALUE;
    public final xXAKJ3PJCCrkt6iLyU f6ZQsR6bPLvvCDNXOUc = new xXAKJ3PJCCrkt6iLyU(this, 1);
    public final yV4xSSte4LNL7uLy9zrc8x vBGA6pPLqSMuYGvprl270j7 = new yV4xSSte4LNL7uLy9zrc8x(0, this);
    public final mHjO3Wy2eNesFRjVXo7uuDk TaDO7ogis3aEiWEtq = new mHjO3Wy2eNesFRjVXo7uuDk(this);
    public final xXAKJ3PJCCrkt6iLyU Irh5auREsoeV1C1RaBamlmy = new xXAKJ3PJCCrkt6iLyU(this, 0);
    public final Rect w0Wu95l8dVNw5rZMRu = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                pzqP2AqKW6J5PO8zCKnW = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                aXO0LSrt8bKV = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public uLXxmkdsO6wfrm(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.V57tEvNfxZVVcOCAOih5PKr = context;
        this.q11o1hieEkZDhF1MGOZI26oZiDT = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AuEvIFo0QoYm1PHNG.Ca81ebIan1u, i, 0);
        this.NSjgqmGjEzuugn2SsG1mZFP = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.GI83zq0G8e7zkn = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.HzCpKshMOoaw76hFcbOVRYMeRd = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        PoHNXL5T4Q0 poHNXL5T4Q0 = new PoHNXL5T4Q0(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AuEvIFo0QoYm1PHNG.jW7EiD0YL6xkbB158jMUzhWNWb1y, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            poHNXL5T4Q0.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        poHNXL5T4Q0.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.SuB3hEmTmbbRGAhtvOOmfKEon = poHNXL5T4Q0;
        poHNXL5T4Q0.setInputMethodMode(1);
    }

    public final void GI83zq0G8e7zkn(Drawable drawable) {
        this.SuB3hEmTmbbRGAhtvOOmfKEon.setBackgroundDrawable(drawable);
    }

    public final void KUYypEB4eNWOZWVDpH(int i) {
        this.NSjgqmGjEzuugn2SsG1mZFP = i;
    }

    public final void M9e7PWhFYLD2lOGMker(int i) {
        this.GI83zq0G8e7zkn = i;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = true;
    }

    @Override // com.vdodsodjsdt.pHKSskKTBV
    public final aVXgxTePUTvRAcd NSjgqmGjEzuugn2SsG1mZFP() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    public final Drawable V57tEvNfxZVVcOCAOih5PKr() {
        return this.SuB3hEmTmbbRGAhtvOOmfKEon.getBackground();
    }

    @Override // com.vdodsodjsdt.pHKSskKTBV
    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return this.SuB3hEmTmbbRGAhtvOOmfKEon.isShowing();
    }

    @Override // com.vdodsodjsdt.pHKSskKTBV
    public final void ZfQNn8hdWlEQ5cR94249PDsLR() {
        int i;
        int paddingBottom;
        aVXgxTePUTvRAcd avxgxteputvracd;
        aVXgxTePUTvRAcd avxgxteputvracd2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        Context context = this.V57tEvNfxZVVcOCAOih5PKr;
        PoHNXL5T4Q0 poHNXL5T4Q0 = this.SuB3hEmTmbbRGAhtvOOmfKEon;
        if (avxgxteputvracd2 == null) {
            aVXgxTePUTvRAcd avxgxteputvracdPYmKDYlAmhudp = pYmKDYlAmhudp(context, !this.qNPQb1obP7);
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = avxgxteputvracdPYmKDYlAmhudp;
            avxgxteputvracdPYmKDYlAmhudp.setAdapter(this.ZfQNn8hdWlEQ5cR94249PDsLR);
            this.LaeGQIruHQu81hfJldjMOQSVblH3x.setOnItemClickListener(this.ko09zE6UAgwkV);
            this.LaeGQIruHQu81hfJldjMOQSVblH3x.setFocusable(true);
            this.LaeGQIruHQu81hfJldjMOQSVblH3x.setFocusableInTouchMode(true);
            this.LaeGQIruHQu81hfJldjMOQSVblH3x.setOnItemSelectedListener(new SyNWrKBbLnV8zHku8(this));
            this.LaeGQIruHQu81hfJldjMOQSVblH3x.setOnScrollListener(this.TaDO7ogis3aEiWEtq);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
            if (onItemSelectedListener != null) {
                this.LaeGQIruHQu81hfJldjMOQSVblH3x.setOnItemSelectedListener(onItemSelectedListener);
            }
            poHNXL5T4Q0.setContentView(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        }
        Drawable background = poHNXL5T4Q0.getBackground();
        Rect rect = this.w0Wu95l8dVNw5rZMRu;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.HzCpKshMOoaw76hFcbOVRYMeRd) {
                this.GI83zq0G8e7zkn = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = UYRGrMkDIBoSgRpoE7IJFcc.VxUQ9tBhpHJ2AAEDNW8sghc4m(poHNXL5T4Q0, this.pYmKDYlAmhudp, this.GI83zq0G8e7zkn, poHNXL5T4Q0.getInputMethodMode() == 2);
        int i3 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (i3 == -1) {
            paddingBottom = iVxUQ9tBhpHJ2AAEDNW8sghc4m + i;
        } else {
            int i4 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            int iVxUQ9tBhpHJ2AAEDNW8sghc4m2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iVxUQ9tBhpHJ2AAEDNW8sghc4m);
            paddingBottom = iVxUQ9tBhpHJ2AAEDNW8sghc4m2 + (iVxUQ9tBhpHJ2AAEDNW8sghc4m2 > 0 ? this.LaeGQIruHQu81hfJldjMOQSVblH3x.getPaddingBottom() + this.LaeGQIruHQu81hfJldjMOQSVblH3x.getPaddingTop() + i : 0);
        }
        boolean z = poHNXL5T4Q0.getInputMethodMode() == 2;
        poHNXL5T4Q0.setWindowLayoutType(this.M9e7PWhFYLD2lOGMker);
        if (poHNXL5T4Q0.isShowing()) {
            if (this.pYmKDYlAmhudp.isAttachedToWindow()) {
                int width = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.pYmKDYlAmhudp.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    if (z) {
                        poHNXL5T4Q0.setWidth(this.ZLZeBXTMq0zDztBxtRTuCHrapQ == -1 ? -1 : 0);
                        poHNXL5T4Q0.setHeight(0);
                    } else {
                        poHNXL5T4Q0.setWidth(this.ZLZeBXTMq0zDztBxtRTuCHrapQ == -1 ? -1 : 0);
                        poHNXL5T4Q0.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                poHNXL5T4Q0.setOutsideTouchable(true);
                int i5 = width;
                View view = this.pYmKDYlAmhudp;
                int i6 = this.NSjgqmGjEzuugn2SsG1mZFP;
                int i7 = this.GI83zq0G8e7zkn;
                int i8 = i5 < 0 ? -1 : i5;
                if (i3 < 0) {
                    i3 = -1;
                }
                poHNXL5T4Q0.update(view, i6, i7, i8, i3);
                return;
            }
            return;
        }
        int width2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.pYmKDYlAmhudp.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        poHNXL5T4Q0.setWidth(width2);
        poHNXL5T4Q0.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = pzqP2AqKW6J5PO8zCKnW;
            if (method != null) {
                try {
                    method.invoke(poHNXL5T4Q0, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            rcftkmwgDg20tGgo.zzpBGItXfub0yWj(poHNXL5T4Q0, true);
        }
        poHNXL5T4Q0.setOutsideTouchable(true);
        poHNXL5T4Q0.setTouchInterceptor(this.vBGA6pPLqSMuYGvprl270j7);
        if (this.q1wNbhk2O6) {
            poHNXL5T4Q0.setOverlapAnchor(this.KUYypEB4eNWOZWVDpH);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = aXO0LSrt8bKV;
            if (method2 != null) {
                try {
                    method2.invoke(poHNXL5T4Q0, this.RhfGHxtXxy0M0grmp2jkRjQg);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            rcftkmwgDg20tGgo.VxUQ9tBhpHJ2AAEDNW8sghc4m(poHNXL5T4Q0, this.RhfGHxtXxy0M0grmp2jkRjQg);
        }
        poHNXL5T4Q0.showAsDropDown(this.pYmKDYlAmhudp, this.NSjgqmGjEzuugn2SsG1mZFP, this.GI83zq0G8e7zkn, this.p59rPv72J9);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.setSelection(-1);
        if ((!this.qNPQb1obP7 || this.LaeGQIruHQu81hfJldjMOQSVblH3x.isInTouchMode()) && (avxgxteputvracd = this.LaeGQIruHQu81hfJldjMOQSVblH3x) != null) {
            avxgxteputvracd.setListSelectionHidden(true);
            avxgxteputvracd.requestLayout();
        }
        if (this.qNPQb1obP7) {
            return;
        }
        this.q11o1hieEkZDhF1MGOZI26oZiDT.post(this.Irh5auREsoeV1C1RaBamlmy);
    }

    @Override // com.vdodsodjsdt.pHKSskKTBV
    public final void dismiss() {
        PoHNXL5T4Q0 poHNXL5T4Q0 = this.SuB3hEmTmbbRGAhtvOOmfKEon;
        poHNXL5T4Q0.dismiss();
        poHNXL5T4Q0.setContentView(null);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = null;
        this.q11o1hieEkZDhF1MGOZI26oZiDT.removeCallbacks(this.f6ZQsR6bPLvvCDNXOUc);
    }

    public void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(ListAdapter listAdapter) {
        dhdHXTcVuVTGGrO4Qnb1Pk16PmuF dhdhxtcvuvtggro4qnb1pk16pmuf = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        if (dhdhxtcvuvtggro4qnb1pk16pmuf == null) {
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = new dhdHXTcVuVTGGrO4Qnb1Pk16PmuF(this);
        } else {
            ListAdapter listAdapter2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dhdhxtcvuvtggro4qnb1pk16pmuf);
            }
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv);
        }
        aVXgxTePUTvRAcd avxgxteputvracd = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (avxgxteputvracd != null) {
            avxgxteputvracd.setAdapter(this.ZfQNn8hdWlEQ5cR94249PDsLR);
        }
    }

    public final void ko09zE6UAgwkV(int i) {
        Drawable background = this.SuB3hEmTmbbRGAhtvOOmfKEon.getBackground();
        if (background == null) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i;
            return;
        }
        Rect rect = this.w0Wu95l8dVNw5rZMRu;
        background.getPadding(rect);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = rect.left + rect.right + i;
    }

    public final int p59rPv72J9() {
        if (this.HzCpKshMOoaw76hFcbOVRYMeRd) {
            return this.GI83zq0G8e7zkn;
        }
        return 0;
    }

    public aVXgxTePUTvRAcd pYmKDYlAmhudp(Context context, boolean z) {
        return new aVXgxTePUTvRAcd(context, z);
    }

    public final int zzpBGItXfub0yWj() {
        return this.NSjgqmGjEzuugn2SsG1mZFP;
    }
}
