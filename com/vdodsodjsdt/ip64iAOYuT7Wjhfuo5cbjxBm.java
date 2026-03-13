package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ip64iAOYuT7Wjhfuo5cbjxBm {
    public static final RectF KUYypEB4eNWOZWVDpH = new RectF();
    public static final ConcurrentHashMap q1wNbhk2O6 = new ConcurrentHashMap();
    public final TextView GI83zq0G8e7zkn;
    public final L2xGLj001m6N5u HzCpKshMOoaw76hFcbOVRYMeRd;
    public final Context M9e7PWhFYLD2lOGMker;
    public TextPaint NSjgqmGjEzuugn2SsG1mZFP;
    public int VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
    public boolean zzpBGItXfub0yWj = false;
    public float V57tEvNfxZVVcOCAOih5PKr = -1.0f;
    public float ZfQNn8hdWlEQ5cR94249PDsLR = -1.0f;
    public float LaeGQIruHQu81hfJldjMOQSVblH3x = -1.0f;
    public int[] zIvmSL0wzmmKGc3X39b2Gw2mUGE = new int[0];
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ = false;

    public ip64iAOYuT7Wjhfuo5cbjxBm(TextView textView) {
        this.GI83zq0G8e7zkn = textView;
        this.M9e7PWhFYLD2lOGMker = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.HzCpKshMOoaw76hFcbOVRYMeRd = new XHiV3K3itta0EklNKj7YR();
        } else {
            this.HzCpKshMOoaw76hFcbOVRYMeRd = new L2xGLj001m6N5u();
        }
    }

    public static Object LaeGQIruHQu81hfJldjMOQSVblH3x(Object obj, String str, Object obj2) {
        try {
            return ZfQNn8hdWlEQ5cR94249PDsLR(str).invoke(obj, null);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj2;
        }
    }

    public static Method ZfQNn8hdWlEQ5cR94249PDsLR(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = q1wNbhk2O6;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    public static int[] zzpBGItXfub0yWj(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final boolean GI83zq0G8e7zkn() {
        boolean z = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.length > 0;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = z;
        if (z) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 1;
            this.ZfQNn8hdWlEQ5cR94249PDsLR = r0[0];
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = r0[r1 - 1];
            this.V57tEvNfxZVVcOCAOih5PKr = -1.0f;
        }
        return z;
    }

    public final void HzCpKshMOoaw76hFcbOVRYMeRd(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 1;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = f;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = f2;
        this.V57tEvNfxZVVcOCAOih5PKr = f3;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = false;
    }

    public final boolean M9e7PWhFYLD2lOGMker() {
        return !(this.GI83zq0G8e7zkn instanceof LTYn6OpnC6Fo);
    }

    public final boolean NSjgqmGjEzuugn2SsG1mZFP() {
        if (M9e7PWhFYLD2lOGMker() && this.VxUQ9tBhpHJ2AAEDNW8sghc4m == 1) {
            if (!this.ZLZeBXTMq0zDztBxtRTuCHrapQ || this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.length == 0) {
                int iFloor = ((int) Math.floor((this.LaeGQIruHQu81hfJldjMOQSVblH3x - this.ZfQNn8hdWlEQ5cR94249PDsLR) / this.V57tEvNfxZVVcOCAOih5PKr)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.V57tEvNfxZVVcOCAOih5PKr) + this.ZfQNn8hdWlEQ5cR94249PDsLR);
                }
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = zzpBGItXfub0yWj(iArr);
            }
            this.zzpBGItXfub0yWj = true;
        } else {
            this.zzpBGItXfub0yWj = false;
        }
        return this.zzpBGItXfub0yWj;
    }

    public final int V57tEvNfxZVVcOCAOih5PKr(RectF rectF) {
        CharSequence transformation;
        int length = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 0;
        int i3 = 1;
        while (i3 <= i) {
            int i4 = (i3 + i) / 2;
            int i5 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i4];
            TextView textView = this.GI83zq0G8e7zkn;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.NSjgqmGjEzuugn2SsG1mZFP;
            if (textPaint == null) {
                this.NSjgqmGjEzuugn2SsG1mZFP = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.NSjgqmGjEzuugn2SsG1mZFP.set(textView.getPaint());
            this.NSjgqmGjEzuugn2SsG1mZFP.setTextSize(i5);
            StaticLayout staticLayoutVxUQ9tBhpHJ2AAEDNW8sghc4m = oOdNzSngZeOx3DSCxLZ.VxUQ9tBhpHJ2AAEDNW8sghc4m(charSequence, (Layout.Alignment) LaeGQIruHQu81hfJldjMOQSVblH3x(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.GI83zq0G8e7zkn, this.NSjgqmGjEzuugn2SsG1mZFP, this.HzCpKshMOoaw76hFcbOVRYMeRd);
            if ((maxLines == -1 || (staticLayoutVxUQ9tBhpHJ2AAEDNW8sghc4m.getLineCount() <= maxLines && staticLayoutVxUQ9tBhpHJ2AAEDNW8sghc4m.getLineEnd(staticLayoutVxUQ9tBhpHJ2AAEDNW8sghc4m.getLineCount() - 1) == charSequence.length())) && staticLayoutVxUQ9tBhpHJ2AAEDNW8sghc4m.getHeight() <= rectF.bottom) {
                int i6 = i4 + 1;
                i2 = i3;
                i3 = i6;
            } else {
                i2 = i4 - 1;
                i = i2;
            }
        }
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i2];
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        if (zIvmSL0wzmmKGc3X39b2Gw2mUGE()) {
            if (this.zzpBGItXfub0yWj) {
                if (this.GI83zq0G8e7zkn.getMeasuredHeight() <= 0 || this.GI83zq0G8e7zkn.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.HzCpKshMOoaw76hFcbOVRYMeRd.zzpBGItXfub0yWj(this.GI83zq0G8e7zkn) ? 1048576 : (this.GI83zq0G8e7zkn.getMeasuredWidth() - this.GI83zq0G8e7zkn.getTotalPaddingLeft()) - this.GI83zq0G8e7zkn.getTotalPaddingRight();
                int height = (this.GI83zq0G8e7zkn.getHeight() - this.GI83zq0G8e7zkn.getCompoundPaddingBottom()) - this.GI83zq0G8e7zkn.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = KUYypEB4eNWOZWVDpH;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fV57tEvNfxZVVcOCAOih5PKr = V57tEvNfxZVVcOCAOih5PKr(rectF);
                        if (fV57tEvNfxZVVcOCAOih5PKr != this.GI83zq0G8e7zkn.getTextSize()) {
                            ZLZeBXTMq0zDztBxtRTuCHrapQ(0, fV57tEvNfxZVVcOCAOih5PKr);
                        }
                    } finally {
                    }
                }
            }
            this.zzpBGItXfub0yWj = true;
        }
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(int i, float f) {
        Context context = this.M9e7PWhFYLD2lOGMker;
        float fApplyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.GI83zq0G8e7zkn;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.zzpBGItXfub0yWj = false;
                try {
                    Method methodZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR("nullLayouts");
                    if (methodZfQNn8hdWlEQ5cR94249PDsLR != null) {
                        methodZfQNn8hdWlEQ5cR94249PDsLR.invoke(textView, null);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        return M9e7PWhFYLD2lOGMker() && this.VxUQ9tBhpHJ2AAEDNW8sghc4m != 0;
    }
}
