package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class TQMQBENV49PLMwKLaeaEMWAtYlx extends ViewGroup.MarginLayoutParams {
    public final Rect Ca81ebIan1u;
    public int GI83zq0G8e7zkn;
    public View HzCpKshMOoaw76hFcbOVRYMeRd;
    public View KUYypEB4eNWOZWVDpH;
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int M9e7PWhFYLD2lOGMker;
    public int NSjgqmGjEzuugn2SsG1mZFP;
    public final int V57tEvNfxZVVcOCAOih5PKr;
    public m8WKJH6JbFg VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean p59rPv72J9;
    public boolean q1wNbhk2O6;
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public boolean zzpBGItXfub0yWj;

    public TQMQBENV49PLMwKLaeaEMWAtYlx() {
        super(-2, -2);
        this.zzpBGItXfub0yWj = false;
        this.V57tEvNfxZVVcOCAOih5PKr = 0;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = 0;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = -1;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
        this.NSjgqmGjEzuugn2SsG1mZFP = 0;
        this.Ca81ebIan1u = new Rect();
    }

    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) {
        if (i == 0) {
            return this.q1wNbhk2O6;
        }
        if (i != 1) {
            return false;
        }
        return this.p59rPv72J9;
    }

    public TQMQBENV49PLMwKLaeaEMWAtYlx(Context context, AttributeSet attributeSet) {
        m8WKJH6JbFg m8wkjh6jbfg;
        super(context, attributeSet);
        this.zzpBGItXfub0yWj = false;
        this.V57tEvNfxZVVcOCAOih5PKr = 0;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = 0;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = -1;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
        this.NSjgqmGjEzuugn2SsG1mZFP = 0;
        this.Ca81ebIan1u = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, IvKCorY7e5IBMBU.zzpBGItXfub0yWj);
        this.V57tEvNfxZVVcOCAOih5PKr = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.NSjgqmGjEzuugn2SsG1mZFP = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.zzpBGItXfub0yWj = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.TaDO7ogis3aEiWEtq;
            if (TextUtils.isEmpty(string)) {
                m8wkjh6jbfg = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.TaDO7ogis3aEiWEtq;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.q11o1hieEkZDhF1MGOZI26oZiDT;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.Irh5auREsoeV1C1RaBamlmy);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    m8wkjh6jbfg = (m8WKJH6JbFg) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e);
                }
            }
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = m8wkjh6jbfg;
        }
        typedArrayObtainStyledAttributes.recycle();
        m8WKJH6JbFg m8wkjh6jbfg2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (m8wkjh6jbfg2 != null) {
            m8wkjh6jbfg2.V57tEvNfxZVVcOCAOih5PKr(this);
        }
    }

    public TQMQBENV49PLMwKLaeaEMWAtYlx(TQMQBENV49PLMwKLaeaEMWAtYlx tQMQBENV49PLMwKLaeaEMWAtYlx) {
        super((ViewGroup.MarginLayoutParams) tQMQBENV49PLMwKLaeaEMWAtYlx);
        this.zzpBGItXfub0yWj = false;
        this.V57tEvNfxZVVcOCAOih5PKr = 0;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = 0;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = -1;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
        this.NSjgqmGjEzuugn2SsG1mZFP = 0;
        this.Ca81ebIan1u = new Rect();
    }

    public TQMQBENV49PLMwKLaeaEMWAtYlx(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.zzpBGItXfub0yWj = false;
        this.V57tEvNfxZVVcOCAOih5PKr = 0;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = 0;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = -1;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
        this.NSjgqmGjEzuugn2SsG1mZFP = 0;
        this.Ca81ebIan1u = new Rect();
    }

    public TQMQBENV49PLMwKLaeaEMWAtYlx(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.zzpBGItXfub0yWj = false;
        this.V57tEvNfxZVVcOCAOih5PKr = 0;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = 0;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = -1;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
        this.NSjgqmGjEzuugn2SsG1mZFP = 0;
        this.Ca81ebIan1u = new Rect();
    }
}
