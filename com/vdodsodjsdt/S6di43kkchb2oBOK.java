package com.vdodsodjsdt;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class S6di43kkchb2oBOK {
    public final Object[] VxUQ9tBhpHJ2AAEDNW8sghc4m = new Object[2];
    public static final Class[] zzpBGItXfub0yWj = {Context.class, AttributeSet.class};
    public static final int[] V57tEvNfxZVVcOCAOih5PKr = {android.R.attr.onClick};
    public static final int[] ZfQNn8hdWlEQ5cR94249PDsLR = {android.R.attr.accessibilityHeading};
    public static final int[] LaeGQIruHQu81hfJldjMOQSVblH3x = {android.R.attr.accessibilityPaneTitle};
    public static final int[] zIvmSL0wzmmKGc3X39b2Gw2mUGE = {android.R.attr.screenReaderFocusable};
    public static final String[] ZLZeBXTMq0zDztBxtRTuCHrapQ = {"android.widget.", "android.view.", "android.webkit."};
    public static final sSTjsLE9Ugp7iXfnwi18Akn1Jt NSjgqmGjEzuugn2SsG1mZFP = new sSTjsLE9Ugp7iXfnwi18Akn1Jt(0);

    public lzuj2xiOHpZAdsoZ1vJvxA LaeGQIruHQu81hfJldjMOQSVblH3x(Context context, AttributeSet attributeSet) {
        return new lzuj2xiOHpZAdsoZ1vJvxA(context, attributeSet);
    }

    public em9CQSm1f1lSysM22u V57tEvNfxZVVcOCAOih5PKr(Context context, AttributeSet attributeSet) {
        return new em9CQSm1f1lSysM22u(context, attributeSet, R.attr.checkboxStyle);
    }

    public D12Nz0tOxlAcDuwq4Ka8reia VxUQ9tBhpHJ2AAEDNW8sghc4m(Context context, AttributeSet attributeSet) {
        return new D12Nz0tOxlAcDuwq4Ka8reia(context, attributeSet);
    }

    public VM6CSprlZdb ZfQNn8hdWlEQ5cR94249PDsLR(Context context, AttributeSet attributeSet) {
        return new VM6CSprlZdb(context, attributeSet);
    }

    public final View zIvmSL0wzmmKGc3X39b2Gw2mUGE(Context context, String str, String str2) {
        String strConcat;
        sSTjsLE9Ugp7iXfnwi18Akn1Jt sstjsle9ugp7ixfnwi18akn1jt = NSjgqmGjEzuugn2SsG1mZFP;
        Constructor constructor = (Constructor) sstjsle9ugp7ixfnwi18akn1jt.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(zzpBGItXfub0yWj);
            sstjsle9ugp7ixfnwi18akn1jt.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.VxUQ9tBhpHJ2AAEDNW8sghc4m);
    }

    public wD5hsovXMBOyLQTFAC8 zzpBGItXfub0yWj(Context context, AttributeSet attributeSet) {
        return new wD5hsovXMBOyLQTFAC8(context, attributeSet, R.attr.buttonStyle);
    }
}
