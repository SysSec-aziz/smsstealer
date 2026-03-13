package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.vdodsodjsdt.Dmzo35pQOGmZtDTYIDW;
import com.vdodsodjsdt.PGobtLpyfPC4TCnlq740;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.VEiBffxXAuxzcvGdSzVpGCD;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.mlFPz0SY9o7oN;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {
    public static final /* synthetic */ int h3jnZRsdwYJfY9UhQCkbvWciwvFHv = 0;
    public int Ca81ebIan1u;
    public final RectF GI83zq0G8e7zkn;
    public float HzCpKshMOoaw76hFcbOVRYMeRd;
    public boolean KUYypEB4eNWOZWVDpH;
    public final ArrayList LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final int M9e7PWhFYLD2lOGMker;
    public final Paint NSjgqmGjEzuugn2SsG1mZFP;
    public final ValueAnimator V57tEvNfxZVVcOCAOih5PKr;
    public final float ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public boolean ZfQNn8hdWlEQ5cR94249PDsLR;
    public int p59rPv72J9;
    public double q1wNbhk2O6;
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.V57tEvNfxZVVcOCAOih5PKr = valueAnimator;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new ArrayList();
        Paint paint = new Paint();
        this.NSjgqmGjEzuugn2SsG1mZFP = paint;
        this.GI83zq0G8e7zkn = new RectF();
        this.Ca81ebIan1u = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, PGobtLpyfPC4TCnlq740.LaeGQIruHQu81hfJldjMOQSVblH3x, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        ej6unYlOWMDF.hKs1wlZyvtUNaW1f5ABIGacfPcvX(context, R.attr.motionDurationLong2, 200);
        ej6unYlOWMDF.vXWl0o6I4U59CgHs9(context, R.attr.motionEasingEmphasizedInterpolator, mlFPz0SY9o7oN.zzpBGItXfub0yWj);
        this.p59rPv72J9 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.M9e7PWhFYLD2lOGMker = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        zzpBGItXfub0yWj(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.RqDcm8dreu5TrBpvWoK1I
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ClockHandView.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new VEiBffxXAuxzcvGdSzVpGCD());
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(float f) {
        float f2 = f % 360.0f;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = f2;
        this.q1wNbhk2O6 = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m(this.Ca81ebIan1u);
        float fCos = (((float) Math.cos(this.q1wNbhk2O6)) * fVxUQ9tBhpHJ2AAEDNW8sghc4m) + width;
        float fSin = (fVxUQ9tBhpHJ2AAEDNW8sghc4m * ((float) Math.sin(this.q1wNbhk2O6))) + height;
        float f3 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        this.GI83zq0G8e7zkn.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        ArrayList arrayList = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ClockFaceView clockFaceView = (ClockFaceView) ((Dmzo35pQOGmZtDTYIDW) obj);
            if (Math.abs(clockFaceView.qygqjTppWwx992 - f2) > 0.001f) {
                clockFaceView.qygqjTppWwx992 = f2;
                clockFaceView.p59rPv72J9();
            }
        }
        invalidate();
    }

    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) {
        return i == 2 ? Math.round(this.p59rPv72J9 * 0.66f) : this.p59rPv72J9;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m(this.Ca81ebIan1u);
        float fCos = (((float) Math.cos(this.q1wNbhk2O6)) * fVxUQ9tBhpHJ2AAEDNW8sghc4m) + f;
        float f2 = height;
        float fSin = (fVxUQ9tBhpHJ2AAEDNW8sghc4m * ((float) Math.sin(this.q1wNbhk2O6))) + f2;
        Paint paint = this.NSjgqmGjEzuugn2SsG1mZFP;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, paint);
        double dSin = Math.sin(this.q1wNbhk2O6);
        paint.setStrokeWidth(this.M9e7PWhFYLD2lOGMker);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.q1wNbhk2O6) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f2, this.ZLZeBXTMq0zDztBxtRTuCHrapQ, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.V57tEvNfxZVVcOCAOih5PKr.isRunning()) {
            return;
        }
        zzpBGItXfub0yWj(this.HzCpKshMOoaw76hFcbOVRYMeRd);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.KUYypEB4eNWOZWVDpH = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.KUYypEB4eNWOZWVDpH;
            if (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
                this.Ca81ebIan1u = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) VxUQ9tBhpHJ2AAEDNW8sghc4m(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.KUYypEB4eNWOZWVDpH;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.HzCpKshMOoaw76hFcbOVRYMeRd != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            zzpBGItXfub0yWj(f);
            z3 = true;
        }
        this.KUYypEB4eNWOZWVDpH = z4 | z3;
        return true;
    }

    public final void zzpBGItXfub0yWj(float f) {
        this.V57tEvNfxZVVcOCAOih5PKr.cancel();
        V57tEvNfxZVVcOCAOih5PKr(f);
    }
}
