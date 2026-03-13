package com.vdodsodjsdt;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class SK2iudXiiGFYEIJZmC implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static SK2iudXiiGFYEIJZmC p59rPv72J9;
    public static SK2iudXiiGFYEIJZmC q1wNbhk2O6;
    public int GI83zq0G8e7zkn;
    public boolean HzCpKshMOoaw76hFcbOVRYMeRd;
    public boolean KUYypEB4eNWOZWVDpH;
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public JsnZMsYEp5ShmM4 M9e7PWhFYLD2lOGMker;
    public int NSjgqmGjEzuugn2SsG1mZFP;
    public final View V57tEvNfxZVVcOCAOih5PKr;
    public final Tj7nolT1QlRyGGNXyP27L0sOIW6a ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final CharSequence ZfQNn8hdWlEQ5cR94249PDsLR;
    public final Tj7nolT1QlRyGGNXyP27L0sOIW6a zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vdodsodjsdt.Tj7nolT1QlRyGGNXyP27L0sOIW6a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.vdodsodjsdt.Tj7nolT1QlRyGGNXyP27L0sOIW6a] */
    public SK2iudXiiGFYEIJZmC(View view, CharSequence charSequence) {
        final int i = 0;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new Runnable(this) { // from class: com.vdodsodjsdt.Tj7nolT1QlRyGGNXyP27L0sOIW6a
            public final /* synthetic */ SK2iudXiiGFYEIJZmC ZfQNn8hdWlEQ5cR94249PDsLR;

            {
                this.ZfQNn8hdWlEQ5cR94249PDsLR = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr(false);
                        break;
                    default:
                        this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new Runnable(this) { // from class: com.vdodsodjsdt.Tj7nolT1QlRyGGNXyP27L0sOIW6a
            public final /* synthetic */ SK2iudXiiGFYEIJZmC ZfQNn8hdWlEQ5cR94249PDsLR;

            {
                this.ZfQNn8hdWlEQ5cR94249PDsLR = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr(false);
                        break;
                    default:
                        this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                        break;
                }
            }
        };
        this.V57tEvNfxZVVcOCAOih5PKr = view;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = wQvZok2Lu79.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = Build.VERSION.SDK_INT >= 28 ? kHXwlw9VpxBho.HzCpKshMOoaw76hFcbOVRYMeRd(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.KUYypEB4eNWOZWVDpH = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void zzpBGItXfub0yWj(SK2iudXiiGFYEIJZmC sK2iudXiiGFYEIJZmC) {
        SK2iudXiiGFYEIJZmC sK2iudXiiGFYEIJZmC2 = q1wNbhk2O6;
        if (sK2iudXiiGFYEIJZmC2 != null) {
            sK2iudXiiGFYEIJZmC2.V57tEvNfxZVVcOCAOih5PKr.removeCallbacks(sK2iudXiiGFYEIJZmC2.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        }
        q1wNbhk2O6 = sK2iudXiiGFYEIJZmC;
        if (sK2iudXiiGFYEIJZmC != null) {
            sK2iudXiiGFYEIJZmC.V57tEvNfxZVVcOCAOih5PKr.postDelayed(sK2iudXiiGFYEIJZmC.zIvmSL0wzmmKGc3X39b2Gw2mUGE, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(boolean z) {
        int height;
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.V57tEvNfxZVVcOCAOih5PKr;
        if (view.isAttachedToWindow()) {
            zzpBGItXfub0yWj(null);
            SK2iudXiiGFYEIJZmC sK2iudXiiGFYEIJZmC = p59rPv72J9;
            if (sK2iudXiiGFYEIJZmC != null) {
                sK2iudXiiGFYEIJZmC.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            }
            p59rPv72J9 = this;
            this.HzCpKshMOoaw76hFcbOVRYMeRd = z;
            JsnZMsYEp5ShmM4 jsnZMsYEp5ShmM4 = new JsnZMsYEp5ShmM4(view.getContext());
            View view2 = (View) jsnZMsYEp5ShmM4.zzpBGItXfub0yWj;
            Context context = (Context) jsnZMsYEp5ShmM4.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            this.M9e7PWhFYLD2lOGMker = jsnZMsYEp5ShmM4;
            int width = this.NSjgqmGjEzuugn2SsG1mZFP;
            int i5 = this.GI83zq0G8e7zkn;
            boolean z3 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) jsnZMsYEp5ShmM4.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) jsnZMsYEp5ShmM4.V57tEvNfxZVVcOCAOih5PKr).setText(this.ZfQNn8hdWlEQ5cR94249PDsLR);
            int[] iArr = (int[]) jsnZMsYEp5ShmM4.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            int[] iArr2 = (int[]) jsnZMsYEp5ShmM4.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            Rect rect = (Rect) jsnZMsYEp5ShmM4.LaeGQIruHQu81hfJldjMOQSVblH3x;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i5 + dimensionPixelOffset2;
                i = i5 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            int i6 = width;
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i4 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = i;
                    z2 = z3;
                    i3 = 0;
                    i4 = 1;
                } else {
                    Resources resources = context.getResources();
                    i4 = 1;
                    i2 = i;
                    z2 = z3;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i3 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i7 = iArr2[i3] - iArr[i3];
                iArr2[i3] = i7;
                iArr2[i4] = iArr2[i4] - iArr[i4];
                layoutParams.x = (i7 + i6) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i8 = iArr2[i4];
                int i9 = ((i8 + i2) - dimensionPixelOffset3) - measuredHeight;
                int i10 = i8 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i9 >= 0) {
                        layoutParams.y = i9;
                    } else {
                        layoutParams.y = i10;
                    }
                } else if (measuredHeight + i10 <= rect.height()) {
                    layoutParams.y = i10;
                } else {
                    layoutParams.y = i9;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.HzCpKshMOoaw76hFcbOVRYMeRd) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                if ((view.getWindowSystemUiVisibility() & 1) == i4) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            Tj7nolT1QlRyGGNXyP27L0sOIW6a tj7nolT1QlRyGGNXyP27L0sOIW6a = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            view.removeCallbacks(tj7nolT1QlRyGGNXyP27L0sOIW6a);
            view.postDelayed(tj7nolT1QlRyGGNXyP27L0sOIW6a, j2);
        }
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        SK2iudXiiGFYEIJZmC sK2iudXiiGFYEIJZmC = p59rPv72J9;
        View view = this.V57tEvNfxZVVcOCAOih5PKr;
        if (sK2iudXiiGFYEIJZmC == this) {
            p59rPv72J9 = null;
            JsnZMsYEp5ShmM4 jsnZMsYEp5ShmM4 = this.M9e7PWhFYLD2lOGMker;
            if (jsnZMsYEp5ShmM4 != null) {
                View view2 = (View) jsnZMsYEp5ShmM4.zzpBGItXfub0yWj;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) jsnZMsYEp5ShmM4.VxUQ9tBhpHJ2AAEDNW8sghc4m).getSystemService("window")).removeView(view2);
                }
                this.M9e7PWhFYLD2lOGMker = null;
                this.KUYypEB4eNWOZWVDpH = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (q1wNbhk2O6 == this) {
            zzpBGItXfub0yWj(null);
        }
        view.removeCallbacks(this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            com.vdodsodjsdt.JsnZMsYEp5ShmM4 r4 = r3.M9e7PWhFYLD2lOGMker
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.HzCpKshMOoaw76hFcbOVRYMeRd
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.V57tEvNfxZVVcOCAOih5PKr
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            goto L6f
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.KUYypEB4eNWOZWVDpH = r4
            r3.VxUQ9tBhpHJ2AAEDNW8sghc4m()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            com.vdodsodjsdt.JsnZMsYEp5ShmM4 r4 = r3.M9e7PWhFYLD2lOGMker
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.KUYypEB4eNWOZWVDpH
            if (r1 != 0) goto L66
            int r1 = r3.NSjgqmGjEzuugn2SsG1mZFP
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.LaeGQIruHQu81hfJldjMOQSVblH3x
            if (r1 > r2) goto L66
            int r1 = r3.GI83zq0G8e7zkn
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.NSjgqmGjEzuugn2SsG1mZFP = r4
            r3.GI83zq0G8e7zkn = r5
            r3.KUYypEB4eNWOZWVDpH = r0
            zzpBGItXfub0yWj(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.SK2iudXiiGFYEIJZmC.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.NSjgqmGjEzuugn2SsG1mZFP = view.getWidth() / 2;
        this.GI83zq0G8e7zkn = view.getHeight() / 2;
        V57tEvNfxZVVcOCAOih5PKr(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
