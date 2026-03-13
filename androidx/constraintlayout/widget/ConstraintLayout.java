package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.vdodsodjsdt.FKbin58rR7b9yJzr1nTn5;
import com.vdodsodjsdt.HnVNsdy3Lwin5xfqq;
import com.vdodsodjsdt.IPwvkMKvXW4H2mJtQ4szs9vgoyzLD;
import com.vdodsodjsdt.RRGaoI3KRDaK8aVeyxQAcc;
import com.vdodsodjsdt.UlQZeuagqs4TIUmXokyaAXI;
import com.vdodsodjsdt.ZtjVvctVhW3SMibpO0L8oqBK;
import com.vdodsodjsdt.dXZw8zZnRXsRIYJEIdZC;
import com.vdodsodjsdt.ehtgKpBkv4pNXGKK0RL6dwwx7f;
import com.vdodsodjsdt.g8kevnL6UKpr15IYtcPJXuLo1L4;
import com.vdodsodjsdt.ipq3rabslQyfR54;
import com.vdodsodjsdt.lNG0v0TTGdvR;
import com.vdodsodjsdt.lgLPimJSSQ0NVW;
import com.vdodsodjsdt.nUshirpmbH6saVf9I;
import com.vdodsodjsdt.nyzrqxPnAGamYOnylXLZzssCn;
import com.vdodsodjsdt.rwLNq3eKZ2vnR0XP;
import com.vdodsodjsdt.uij8Ij9SZKI0vaNotiNzH;
import com.vdodsodjsdt.yVuHRiUaJhQPY;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static UlQZeuagqs4TIUmXokyaAXI ko09zE6UAgwkV;
    public HashMap Ca81ebIan1u;
    public int GI83zq0G8e7zkn;
    public int HzCpKshMOoaw76hFcbOVRYMeRd;
    public nUshirpmbH6saVf9I KUYypEB4eNWOZWVDpH;
    public final rwLNq3eKZ2vnR0XP LaeGQIruHQu81hfJldjMOQSVblH3x;
    public boolean M9e7PWhFYLD2lOGMker;
    public int NSjgqmGjEzuugn2SsG1mZFP;
    public final SparseArray V57tEvNfxZVVcOCAOih5PKr;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final ArrayList ZfQNn8hdWlEQ5cR94249PDsLR;
    public final SparseArray h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public int p59rPv72J9;
    public final lNG0v0TTGdvR pYmKDYlAmhudp;
    public dXZw8zZnRXsRIYJEIdZC q1wNbhk2O6;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V57tEvNfxZVVcOCAOih5PKr = new SparseArray();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new ArrayList(4);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new rwLNq3eKZ2vnR0XP();
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
        this.NSjgqmGjEzuugn2SsG1mZFP = Integer.MAX_VALUE;
        this.GI83zq0G8e7zkn = Integer.MAX_VALUE;
        this.M9e7PWhFYLD2lOGMker = true;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = 257;
        this.KUYypEB4eNWOZWVDpH = null;
        this.q1wNbhk2O6 = null;
        this.p59rPv72J9 = -1;
        this.Ca81ebIan1u = new HashMap();
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = new SparseArray();
        this.pYmKDYlAmhudp = new lNG0v0TTGdvR(this, this);
        GI83zq0G8e7zkn(attributeSet, 0);
    }

    public static ZtjVvctVhW3SMibpO0L8oqBK ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        ZtjVvctVhW3SMibpO0L8oqBK ztjVvctVhW3SMibpO0L8oqBK = new ZtjVvctVhW3SMibpO0L8oqBK(-2, -2);
        ztjVvctVhW3SMibpO0L8oqBK.VxUQ9tBhpHJ2AAEDNW8sghc4m = -1;
        ztjVvctVhW3SMibpO0L8oqBK.zzpBGItXfub0yWj = -1;
        ztjVvctVhW3SMibpO0L8oqBK.V57tEvNfxZVVcOCAOih5PKr = -1.0f;
        ztjVvctVhW3SMibpO0L8oqBK.ZfQNn8hdWlEQ5cR94249PDsLR = true;
        ztjVvctVhW3SMibpO0L8oqBK.LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
        ztjVvctVhW3SMibpO0L8oqBK.zIvmSL0wzmmKGc3X39b2Gw2mUGE = -1;
        ztjVvctVhW3SMibpO0L8oqBK.ZLZeBXTMq0zDztBxtRTuCHrapQ = -1;
        ztjVvctVhW3SMibpO0L8oqBK.NSjgqmGjEzuugn2SsG1mZFP = -1;
        ztjVvctVhW3SMibpO0L8oqBK.GI83zq0G8e7zkn = -1;
        ztjVvctVhW3SMibpO0L8oqBK.M9e7PWhFYLD2lOGMker = -1;
        ztjVvctVhW3SMibpO0L8oqBK.HzCpKshMOoaw76hFcbOVRYMeRd = -1;
        ztjVvctVhW3SMibpO0L8oqBK.KUYypEB4eNWOZWVDpH = -1;
        ztjVvctVhW3SMibpO0L8oqBK.q1wNbhk2O6 = -1;
        ztjVvctVhW3SMibpO0L8oqBK.p59rPv72J9 = -1;
        ztjVvctVhW3SMibpO0L8oqBK.Ca81ebIan1u = -1;
        ztjVvctVhW3SMibpO0L8oqBK.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = -1;
        ztjVvctVhW3SMibpO0L8oqBK.pYmKDYlAmhudp = 0;
        ztjVvctVhW3SMibpO0L8oqBK.ko09zE6UAgwkV = 0.0f;
        ztjVvctVhW3SMibpO0L8oqBK.jW7EiD0YL6xkbB158jMUzhWNWb1y = -1;
        ztjVvctVhW3SMibpO0L8oqBK.f6ZQsR6bPLvvCDNXOUc = -1;
        ztjVvctVhW3SMibpO0L8oqBK.vBGA6pPLqSMuYGvprl270j7 = -1;
        ztjVvctVhW3SMibpO0L8oqBK.TaDO7ogis3aEiWEtq = -1;
        ztjVvctVhW3SMibpO0L8oqBK.Irh5auREsoeV1C1RaBamlmy = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.q11o1hieEkZDhF1MGOZI26oZiDT = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.w0Wu95l8dVNw5rZMRu = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.RhfGHxtXxy0M0grmp2jkRjQg = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.qNPQb1obP7 = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.SuB3hEmTmbbRGAhtvOOmfKEon = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.pzqP2AqKW6J5PO8zCKnW = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.aXO0LSrt8bKV = 0;
        ztjVvctVhW3SMibpO0L8oqBK.vE4yDIjexsP2lGjLaTcB = 0.5f;
        ztjVvctVhW3SMibpO0L8oqBK.O1xDAlBZZlZdoEf747lCFHld = 0.5f;
        ztjVvctVhW3SMibpO0L8oqBK.HVEwbdULInpTNa0IG = null;
        ztjVvctVhW3SMibpO0L8oqBK.y1NaPKTl7R18DOr6e8i5 = -1.0f;
        ztjVvctVhW3SMibpO0L8oqBK.qygqjTppWwx992 = -1.0f;
        ztjVvctVhW3SMibpO0L8oqBK.iKANjmyTSxO6v6UuLPdu7DxOjlS = 0;
        ztjVvctVhW3SMibpO0L8oqBK.TqcnImqkSWIKht = 0;
        ztjVvctVhW3SMibpO0L8oqBK.d9zDyyznnp3oaDT1Ug = 0;
        ztjVvctVhW3SMibpO0L8oqBK.CixTK5ZX8oWXHz34qHYV = 0;
        ztjVvctVhW3SMibpO0L8oqBK.ymT6yQrus3w = 0;
        ztjVvctVhW3SMibpO0L8oqBK.YdNRGRc4rly = 0;
        ztjVvctVhW3SMibpO0L8oqBK.wRCD0SdqWCowdYU7bmzN = 0;
        ztjVvctVhW3SMibpO0L8oqBK.gBaBUmihn5l4u = 0;
        ztjVvctVhW3SMibpO0L8oqBK.L8DMw02rUTs2w = 1.0f;
        ztjVvctVhW3SMibpO0L8oqBK.lQ0rO9lhQIyVe7Rp6 = 1.0f;
        ztjVvctVhW3SMibpO0L8oqBK.JUdwvN8LfOMa = -1;
        ztjVvctVhW3SMibpO0L8oqBK.ItrQwCXbty5PZtje5JS = -1;
        ztjVvctVhW3SMibpO0L8oqBK.hKs1wlZyvtUNaW1f5ABIGacfPcvX = -1;
        ztjVvctVhW3SMibpO0L8oqBK.vXWl0o6I4U59CgHs9 = false;
        ztjVvctVhW3SMibpO0L8oqBK.wdI7vzA3Qmcwd = false;
        ztjVvctVhW3SMibpO0L8oqBK.KYZ9RyuOc42A2J = null;
        ztjVvctVhW3SMibpO0L8oqBK.zOk739gUM7zIZC25HHUxoiyixWFjn = 0;
        ztjVvctVhW3SMibpO0L8oqBK.GE1sqSYiEYQO2ew7WEZwTtUeS5 = true;
        ztjVvctVhW3SMibpO0L8oqBK.rERAmyEtGV6ANGszuKcQI = true;
        ztjVvctVhW3SMibpO0L8oqBK.H2VFYNJEVGAX = false;
        ztjVvctVhW3SMibpO0L8oqBK.Z1FjjMJ0suz8AFI7gsA4GDLMXv = false;
        ztjVvctVhW3SMibpO0L8oqBK.bjhcQ0u7VT2OYYrwk96HrWoN = false;
        ztjVvctVhW3SMibpO0L8oqBK.BJQHddi0Plr5ElWetCyaixWOg9 = -1;
        ztjVvctVhW3SMibpO0L8oqBK.tFRdVJAePmTx77bP7FAN0uI = -1;
        ztjVvctVhW3SMibpO0L8oqBK.mhUCRR8ceqc7mAozW = -1;
        ztjVvctVhW3SMibpO0L8oqBK.rE05n5RsRkyWKIeA9cmLXAKv4Hze = -1;
        ztjVvctVhW3SMibpO0L8oqBK.p6bBrs4p3Ly = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.ubNpdCC1pl7L = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.wR7sbzHKf9hYV1lxoS6nqyszepWvN = 0.5f;
        ztjVvctVhW3SMibpO0L8oqBK.e1gEV3X9xwmHj = new IPwvkMKvXW4H2mJtQ4szs9vgoyzLD();
        return ztjVvctVhW3SMibpO0L8oqBK;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static UlQZeuagqs4TIUmXokyaAXI getSharedValues() {
        if (ko09zE6UAgwkV == null) {
            UlQZeuagqs4TIUmXokyaAXI ulQZeuagqs4TIUmXokyaAXI = new UlQZeuagqs4TIUmXokyaAXI();
            new SparseIntArray();
            new HashMap();
            ko09zE6UAgwkV = ulQZeuagqs4TIUmXokyaAXI;
        }
        return ko09zE6UAgwkV;
    }

    public final void GI83zq0G8e7zkn(AttributeSet attributeSet, int i) {
        rwLNq3eKZ2vnR0XP rwlnq3ekz2vnr0xp = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        rwlnq3ekz2vnr0xp.BJQHddi0Plr5ElWetCyaixWOg9 = this;
        lNG0v0TTGdvR lng0v0ttgdvr = this.pYmKDYlAmhudp;
        rwlnq3ekz2vnr0xp.h2b7InwIaORKN91X7whfQh4 = lng0v0ttgdvr;
        rwlnq3ekz2vnr0xp.lxWWbfAOLs4jWzd7PSIiIJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE = lng0v0ttgdvr;
        this.V57tEvNfxZVVcOCAOih5PKr.put(getId(), this);
        this.KUYypEB4eNWOZWVDpH = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ehtgKpBkv4pNXGKK0RL6dwwx7f.zzpBGItXfub0yWj, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                } else if (index == 17) {
                    this.ZLZeBXTMq0zDztBxtRTuCHrapQ = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
                } else if (index == 14) {
                    this.NSjgqmGjEzuugn2SsG1mZFP = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.NSjgqmGjEzuugn2SsG1mZFP);
                } else if (index == 15) {
                    this.GI83zq0G8e7zkn = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.GI83zq0G8e7zkn);
                } else if (index == 113) {
                    this.HzCpKshMOoaw76hFcbOVRYMeRd = typedArrayObtainStyledAttributes.getInt(index, this.HzCpKshMOoaw76hFcbOVRYMeRd);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            M9e7PWhFYLD2lOGMker(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.q1wNbhk2O6 = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        nUshirpmbH6saVf9I nushirpmbh6savf9i = new nUshirpmbH6saVf9I();
                        this.KUYypEB4eNWOZWVDpH = nushirpmbh6savf9i;
                        nushirpmbh6savf9i.LaeGQIruHQu81hfJldjMOQSVblH3x(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.KUYypEB4eNWOZWVDpH = null;
                    }
                    this.p59rPv72J9 = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        rwlnq3ekz2vnr0xp.ScSj9HEorWkb3bIb1HyeKVoW = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        uij8Ij9SZKI0vaNotiNzH.pYmKDYlAmhudp = rwlnq3ekz2vnr0xp.vXWl0o6I4U59CgHs9(512);
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0368  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void HzCpKshMOoaw76hFcbOVRYMeRd(com.vdodsodjsdt.rwLNq3eKZ2vnR0XP r29, int r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 1762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.HzCpKshMOoaw76hFcbOVRYMeRd(com.vdodsodjsdt.rwLNq3eKZ2vnR0XP, int, int, int):void");
    }

    public final void KUYypEB4eNWOZWVDpH(IPwvkMKvXW4H2mJtQ4szs9vgoyzLD iPwvkMKvXW4H2mJtQ4szs9vgoyzLD, ZtjVvctVhW3SMibpO0L8oqBK ztjVvctVhW3SMibpO0L8oqBK, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.V57tEvNfxZVVcOCAOih5PKr.get(i);
        IPwvkMKvXW4H2mJtQ4szs9vgoyzLD iPwvkMKvXW4H2mJtQ4szs9vgoyzLD2 = (IPwvkMKvXW4H2mJtQ4szs9vgoyzLD) sparseArray.get(i);
        if (iPwvkMKvXW4H2mJtQ4szs9vgoyzLD2 == null || view == null || !(view.getLayoutParams() instanceof ZtjVvctVhW3SMibpO0L8oqBK)) {
            return;
        }
        ztjVvctVhW3SMibpO0L8oqBK.H2VFYNJEVGAX = true;
        if (i2 == 6) {
            ZtjVvctVhW3SMibpO0L8oqBK ztjVvctVhW3SMibpO0L8oqBK2 = (ZtjVvctVhW3SMibpO0L8oqBK) view.getLayoutParams();
            ztjVvctVhW3SMibpO0L8oqBK2.H2VFYNJEVGAX = true;
            ztjVvctVhW3SMibpO0L8oqBK2.e1gEV3X9xwmHj.vE4yDIjexsP2lGjLaTcB = true;
        }
        iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.GI83zq0G8e7zkn(6).zzpBGItXfub0yWj(iPwvkMKvXW4H2mJtQ4szs9vgoyzLD2.GI83zq0G8e7zkn(i2), ztjVvctVhW3SMibpO0L8oqBK.aXO0LSrt8bKV, ztjVvctVhW3SMibpO0L8oqBK.pzqP2AqKW6J5PO8zCKnW, true);
        iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.vE4yDIjexsP2lGjLaTcB = true;
        iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.GI83zq0G8e7zkn(3).M9e7PWhFYLD2lOGMker();
        iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.GI83zq0G8e7zkn(5).M9e7PWhFYLD2lOGMker();
    }

    public final void M9e7PWhFYLD2lOGMker(int i) {
        String str;
        Context context = getContext();
        dXZw8zZnRXsRIYJEIdZC dxzw8zznrxsriyjeidzc = new dXZw8zZnRXsRIYJEIdZC();
        dxzw8zznrxsriyjeidzc.V57tEvNfxZVVcOCAOih5PKr = new SparseArray();
        dxzw8zznrxsriyjeidzc.ZfQNn8hdWlEQ5cR94249PDsLR = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            RRGaoI3KRDaK8aVeyxQAcc rRGaoI3KRDaK8aVeyxQAcc = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                dxzw8zznrxsriyjeidzc.NSjgqmGjEzuugn2SsG1mZFP(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                RRGaoI3KRDaK8aVeyxQAcc rRGaoI3KRDaK8aVeyxQAcc2 = new RRGaoI3KRDaK8aVeyxQAcc(context, xml);
                                ((SparseArray) dxzw8zznrxsriyjeidzc.V57tEvNfxZVVcOCAOih5PKr).put(rRGaoI3KRDaK8aVeyxQAcc2.VxUQ9tBhpHJ2AAEDNW8sghc4m, rRGaoI3KRDaK8aVeyxQAcc2);
                                rRGaoI3KRDaK8aVeyxQAcc = rRGaoI3KRDaK8aVeyxQAcc2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                nyzrqxPnAGamYOnylXLZzssCn nyzrqxpnagamyonylxlzzsscn = new nyzrqxPnAGamYOnylXLZzssCn(context, xml);
                                if (rRGaoI3KRDaK8aVeyxQAcc != null) {
                                    ((ArrayList) rRGaoI3KRDaK8aVeyxQAcc.V57tEvNfxZVVcOCAOih5PKr).add(nyzrqxpnagamyonylxlzzsscn);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
        this.q1wNbhk2O6 = dxzw8zznrxsriyjeidzc;
    }

    public final IPwvkMKvXW4H2mJtQ4szs9vgoyzLD NSjgqmGjEzuugn2SsG1mZFP(View view) {
        if (view == this) {
            return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof ZtjVvctVhW3SMibpO0L8oqBK) {
            return ((ZtjVvctVhW3SMibpO0L8oqBK) view.getLayoutParams()).e1gEV3X9xwmHj;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof ZtjVvctVhW3SMibpO0L8oqBK) {
            return ((ZtjVvctVhW3SMibpO0L8oqBK) view.getLayoutParams()).e1gEV3X9xwmHj;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ZtjVvctVhW3SMibpO0L8oqBK;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((HnVNsdy3Lwin5xfqq) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.M9e7PWhFYLD2lOGMker = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return ZLZeBXTMq0zDztBxtRTuCHrapQ();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ZtjVvctVhW3SMibpO0L8oqBK ztjVvctVhW3SMibpO0L8oqBK = new ZtjVvctVhW3SMibpO0L8oqBK(context, attributeSet);
        ztjVvctVhW3SMibpO0L8oqBK.VxUQ9tBhpHJ2AAEDNW8sghc4m = -1;
        ztjVvctVhW3SMibpO0L8oqBK.zzpBGItXfub0yWj = -1;
        ztjVvctVhW3SMibpO0L8oqBK.V57tEvNfxZVVcOCAOih5PKr = -1.0f;
        ztjVvctVhW3SMibpO0L8oqBK.ZfQNn8hdWlEQ5cR94249PDsLR = true;
        ztjVvctVhW3SMibpO0L8oqBK.LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
        ztjVvctVhW3SMibpO0L8oqBK.zIvmSL0wzmmKGc3X39b2Gw2mUGE = -1;
        ztjVvctVhW3SMibpO0L8oqBK.ZLZeBXTMq0zDztBxtRTuCHrapQ = -1;
        ztjVvctVhW3SMibpO0L8oqBK.NSjgqmGjEzuugn2SsG1mZFP = -1;
        ztjVvctVhW3SMibpO0L8oqBK.GI83zq0G8e7zkn = -1;
        ztjVvctVhW3SMibpO0L8oqBK.M9e7PWhFYLD2lOGMker = -1;
        ztjVvctVhW3SMibpO0L8oqBK.HzCpKshMOoaw76hFcbOVRYMeRd = -1;
        ztjVvctVhW3SMibpO0L8oqBK.KUYypEB4eNWOZWVDpH = -1;
        ztjVvctVhW3SMibpO0L8oqBK.q1wNbhk2O6 = -1;
        ztjVvctVhW3SMibpO0L8oqBK.p59rPv72J9 = -1;
        ztjVvctVhW3SMibpO0L8oqBK.Ca81ebIan1u = -1;
        ztjVvctVhW3SMibpO0L8oqBK.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = -1;
        ztjVvctVhW3SMibpO0L8oqBK.pYmKDYlAmhudp = 0;
        ztjVvctVhW3SMibpO0L8oqBK.ko09zE6UAgwkV = 0.0f;
        ztjVvctVhW3SMibpO0L8oqBK.jW7EiD0YL6xkbB158jMUzhWNWb1y = -1;
        ztjVvctVhW3SMibpO0L8oqBK.f6ZQsR6bPLvvCDNXOUc = -1;
        ztjVvctVhW3SMibpO0L8oqBK.vBGA6pPLqSMuYGvprl270j7 = -1;
        ztjVvctVhW3SMibpO0L8oqBK.TaDO7ogis3aEiWEtq = -1;
        ztjVvctVhW3SMibpO0L8oqBK.Irh5auREsoeV1C1RaBamlmy = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.q11o1hieEkZDhF1MGOZI26oZiDT = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.w0Wu95l8dVNw5rZMRu = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.RhfGHxtXxy0M0grmp2jkRjQg = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.qNPQb1obP7 = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.SuB3hEmTmbbRGAhtvOOmfKEon = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.pzqP2AqKW6J5PO8zCKnW = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.aXO0LSrt8bKV = 0;
        ztjVvctVhW3SMibpO0L8oqBK.vE4yDIjexsP2lGjLaTcB = 0.5f;
        ztjVvctVhW3SMibpO0L8oqBK.O1xDAlBZZlZdoEf747lCFHld = 0.5f;
        ztjVvctVhW3SMibpO0L8oqBK.HVEwbdULInpTNa0IG = null;
        ztjVvctVhW3SMibpO0L8oqBK.y1NaPKTl7R18DOr6e8i5 = -1.0f;
        ztjVvctVhW3SMibpO0L8oqBK.qygqjTppWwx992 = -1.0f;
        ztjVvctVhW3SMibpO0L8oqBK.iKANjmyTSxO6v6UuLPdu7DxOjlS = 0;
        ztjVvctVhW3SMibpO0L8oqBK.TqcnImqkSWIKht = 0;
        ztjVvctVhW3SMibpO0L8oqBK.d9zDyyznnp3oaDT1Ug = 0;
        ztjVvctVhW3SMibpO0L8oqBK.CixTK5ZX8oWXHz34qHYV = 0;
        ztjVvctVhW3SMibpO0L8oqBK.ymT6yQrus3w = 0;
        ztjVvctVhW3SMibpO0L8oqBK.YdNRGRc4rly = 0;
        ztjVvctVhW3SMibpO0L8oqBK.wRCD0SdqWCowdYU7bmzN = 0;
        ztjVvctVhW3SMibpO0L8oqBK.gBaBUmihn5l4u = 0;
        ztjVvctVhW3SMibpO0L8oqBK.L8DMw02rUTs2w = 1.0f;
        ztjVvctVhW3SMibpO0L8oqBK.lQ0rO9lhQIyVe7Rp6 = 1.0f;
        ztjVvctVhW3SMibpO0L8oqBK.JUdwvN8LfOMa = -1;
        ztjVvctVhW3SMibpO0L8oqBK.ItrQwCXbty5PZtje5JS = -1;
        ztjVvctVhW3SMibpO0L8oqBK.hKs1wlZyvtUNaW1f5ABIGacfPcvX = -1;
        ztjVvctVhW3SMibpO0L8oqBK.vXWl0o6I4U59CgHs9 = false;
        ztjVvctVhW3SMibpO0L8oqBK.wdI7vzA3Qmcwd = false;
        ztjVvctVhW3SMibpO0L8oqBK.KYZ9RyuOc42A2J = null;
        ztjVvctVhW3SMibpO0L8oqBK.zOk739gUM7zIZC25HHUxoiyixWFjn = 0;
        ztjVvctVhW3SMibpO0L8oqBK.GE1sqSYiEYQO2ew7WEZwTtUeS5 = true;
        ztjVvctVhW3SMibpO0L8oqBK.rERAmyEtGV6ANGszuKcQI = true;
        ztjVvctVhW3SMibpO0L8oqBK.H2VFYNJEVGAX = false;
        ztjVvctVhW3SMibpO0L8oqBK.Z1FjjMJ0suz8AFI7gsA4GDLMXv = false;
        ztjVvctVhW3SMibpO0L8oqBK.bjhcQ0u7VT2OYYrwk96HrWoN = false;
        ztjVvctVhW3SMibpO0L8oqBK.BJQHddi0Plr5ElWetCyaixWOg9 = -1;
        ztjVvctVhW3SMibpO0L8oqBK.tFRdVJAePmTx77bP7FAN0uI = -1;
        ztjVvctVhW3SMibpO0L8oqBK.mhUCRR8ceqc7mAozW = -1;
        ztjVvctVhW3SMibpO0L8oqBK.rE05n5RsRkyWKIeA9cmLXAKv4Hze = -1;
        ztjVvctVhW3SMibpO0L8oqBK.p6bBrs4p3Ly = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.ubNpdCC1pl7L = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.wR7sbzHKf9hYV1lxoS6nqyszepWvN = 0.5f;
        ztjVvctVhW3SMibpO0L8oqBK.e1gEV3X9xwmHj = new IPwvkMKvXW4H2mJtQ4szs9vgoyzLD();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ehtgKpBkv4pNXGKK0RL6dwwx7f.zzpBGItXfub0yWj);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = FKbin58rR7b9yJzr1nTn5.VxUQ9tBhpHJ2AAEDNW8sghc4m.get(index);
            switch (i2) {
                case 1:
                    ztjVvctVhW3SMibpO0L8oqBK.hKs1wlZyvtUNaW1f5ABIGacfPcvX = typedArrayObtainStyledAttributes.getInt(index, ztjVvctVhW3SMibpO0L8oqBK.hKs1wlZyvtUNaW1f5ABIGacfPcvX);
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, ztjVvctVhW3SMibpO0L8oqBK.h3jnZRsdwYJfY9UhQCkbvWciwvFHv);
                    ztjVvctVhW3SMibpO0L8oqBK.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = resourceId;
                    if (resourceId == -1) {
                        ztjVvctVhW3SMibpO0L8oqBK.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                    ztjVvctVhW3SMibpO0L8oqBK.pYmKDYlAmhudp = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ztjVvctVhW3SMibpO0L8oqBK.pYmKDYlAmhudp);
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, ztjVvctVhW3SMibpO0L8oqBK.ko09zE6UAgwkV) % 360.0f;
                    ztjVvctVhW3SMibpO0L8oqBK.ko09zE6UAgwkV = f;
                    if (f < 0.0f) {
                        ztjVvctVhW3SMibpO0L8oqBK.ko09zE6UAgwkV = (360.0f - f) % 360.0f;
                    }
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                    ztjVvctVhW3SMibpO0L8oqBK.VxUQ9tBhpHJ2AAEDNW8sghc4m = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ztjVvctVhW3SMibpO0L8oqBK.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                    ztjVvctVhW3SMibpO0L8oqBK.zzpBGItXfub0yWj = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ztjVvctVhW3SMibpO0L8oqBK.zzpBGItXfub0yWj);
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                    ztjVvctVhW3SMibpO0L8oqBK.V57tEvNfxZVVcOCAOih5PKr = typedArrayObtainStyledAttributes.getFloat(index, ztjVvctVhW3SMibpO0L8oqBK.V57tEvNfxZVVcOCAOih5PKr);
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.BYTES_FIELD_NUMBER /* 8 */:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, ztjVvctVhW3SMibpO0L8oqBK.LaeGQIruHQu81hfJldjMOQSVblH3x);
                    ztjVvctVhW3SMibpO0L8oqBK.LaeGQIruHQu81hfJldjMOQSVblH3x = resourceId2;
                    if (resourceId2 == -1) {
                        ztjVvctVhW3SMibpO0L8oqBK.LaeGQIruHQu81hfJldjMOQSVblH3x = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, ztjVvctVhW3SMibpO0L8oqBK.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                    ztjVvctVhW3SMibpO0L8oqBK.zIvmSL0wzmmKGc3X39b2Gw2mUGE = resourceId3;
                    if (resourceId3 == -1) {
                        ztjVvctVhW3SMibpO0L8oqBK.zIvmSL0wzmmKGc3X39b2Gw2mUGE = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, ztjVvctVhW3SMibpO0L8oqBK.ZLZeBXTMq0zDztBxtRTuCHrapQ);
                    ztjVvctVhW3SMibpO0L8oqBK.ZLZeBXTMq0zDztBxtRTuCHrapQ = resourceId4;
                    if (resourceId4 == -1) {
                        ztjVvctVhW3SMibpO0L8oqBK.ZLZeBXTMq0zDztBxtRTuCHrapQ = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, ztjVvctVhW3SMibpO0L8oqBK.NSjgqmGjEzuugn2SsG1mZFP);
                    ztjVvctVhW3SMibpO0L8oqBK.NSjgqmGjEzuugn2SsG1mZFP = resourceId5;
                    if (resourceId5 == -1) {
                        ztjVvctVhW3SMibpO0L8oqBK.NSjgqmGjEzuugn2SsG1mZFP = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, ztjVvctVhW3SMibpO0L8oqBK.GI83zq0G8e7zkn);
                    ztjVvctVhW3SMibpO0L8oqBK.GI83zq0G8e7zkn = resourceId6;
                    if (resourceId6 == -1) {
                        ztjVvctVhW3SMibpO0L8oqBK.GI83zq0G8e7zkn = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, ztjVvctVhW3SMibpO0L8oqBK.M9e7PWhFYLD2lOGMker);
                    ztjVvctVhW3SMibpO0L8oqBK.M9e7PWhFYLD2lOGMker = resourceId7;
                    if (resourceId7 == -1) {
                        ztjVvctVhW3SMibpO0L8oqBK.M9e7PWhFYLD2lOGMker = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, ztjVvctVhW3SMibpO0L8oqBK.HzCpKshMOoaw76hFcbOVRYMeRd);
                    ztjVvctVhW3SMibpO0L8oqBK.HzCpKshMOoaw76hFcbOVRYMeRd = resourceId8;
                    if (resourceId8 == -1) {
                        ztjVvctVhW3SMibpO0L8oqBK.HzCpKshMOoaw76hFcbOVRYMeRd = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, ztjVvctVhW3SMibpO0L8oqBK.KUYypEB4eNWOZWVDpH);
                    ztjVvctVhW3SMibpO0L8oqBK.KUYypEB4eNWOZWVDpH = resourceId9;
                    if (resourceId9 == -1) {
                        ztjVvctVhW3SMibpO0L8oqBK.KUYypEB4eNWOZWVDpH = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, ztjVvctVhW3SMibpO0L8oqBK.q1wNbhk2O6);
                    ztjVvctVhW3SMibpO0L8oqBK.q1wNbhk2O6 = resourceId10;
                    if (resourceId10 == -1) {
                        ztjVvctVhW3SMibpO0L8oqBK.q1wNbhk2O6 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, ztjVvctVhW3SMibpO0L8oqBK.jW7EiD0YL6xkbB158jMUzhWNWb1y);
                    ztjVvctVhW3SMibpO0L8oqBK.jW7EiD0YL6xkbB158jMUzhWNWb1y = resourceId11;
                    if (resourceId11 == -1) {
                        ztjVvctVhW3SMibpO0L8oqBK.jW7EiD0YL6xkbB158jMUzhWNWb1y = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, ztjVvctVhW3SMibpO0L8oqBK.f6ZQsR6bPLvvCDNXOUc);
                    ztjVvctVhW3SMibpO0L8oqBK.f6ZQsR6bPLvvCDNXOUc = resourceId12;
                    if (resourceId12 == -1) {
                        ztjVvctVhW3SMibpO0L8oqBK.f6ZQsR6bPLvvCDNXOUc = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, ztjVvctVhW3SMibpO0L8oqBK.vBGA6pPLqSMuYGvprl270j7);
                    ztjVvctVhW3SMibpO0L8oqBK.vBGA6pPLqSMuYGvprl270j7 = resourceId13;
                    if (resourceId13 == -1) {
                        ztjVvctVhW3SMibpO0L8oqBK.vBGA6pPLqSMuYGvprl270j7 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, ztjVvctVhW3SMibpO0L8oqBK.TaDO7ogis3aEiWEtq);
                    ztjVvctVhW3SMibpO0L8oqBK.TaDO7ogis3aEiWEtq = resourceId14;
                    if (resourceId14 == -1) {
                        ztjVvctVhW3SMibpO0L8oqBK.TaDO7ogis3aEiWEtq = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    ztjVvctVhW3SMibpO0L8oqBK.Irh5auREsoeV1C1RaBamlmy = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ztjVvctVhW3SMibpO0L8oqBK.Irh5auREsoeV1C1RaBamlmy);
                    break;
                case 22:
                    ztjVvctVhW3SMibpO0L8oqBK.q11o1hieEkZDhF1MGOZI26oZiDT = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ztjVvctVhW3SMibpO0L8oqBK.q11o1hieEkZDhF1MGOZI26oZiDT);
                    break;
                case 23:
                    ztjVvctVhW3SMibpO0L8oqBK.w0Wu95l8dVNw5rZMRu = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ztjVvctVhW3SMibpO0L8oqBK.w0Wu95l8dVNw5rZMRu);
                    break;
                case 24:
                    ztjVvctVhW3SMibpO0L8oqBK.RhfGHxtXxy0M0grmp2jkRjQg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ztjVvctVhW3SMibpO0L8oqBK.RhfGHxtXxy0M0grmp2jkRjQg);
                    break;
                case 25:
                    ztjVvctVhW3SMibpO0L8oqBK.qNPQb1obP7 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ztjVvctVhW3SMibpO0L8oqBK.qNPQb1obP7);
                    break;
                case 26:
                    ztjVvctVhW3SMibpO0L8oqBK.SuB3hEmTmbbRGAhtvOOmfKEon = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ztjVvctVhW3SMibpO0L8oqBK.SuB3hEmTmbbRGAhtvOOmfKEon);
                    break;
                case 27:
                    ztjVvctVhW3SMibpO0L8oqBK.vXWl0o6I4U59CgHs9 = typedArrayObtainStyledAttributes.getBoolean(index, ztjVvctVhW3SMibpO0L8oqBK.vXWl0o6I4U59CgHs9);
                    break;
                case 28:
                    ztjVvctVhW3SMibpO0L8oqBK.wdI7vzA3Qmcwd = typedArrayObtainStyledAttributes.getBoolean(index, ztjVvctVhW3SMibpO0L8oqBK.wdI7vzA3Qmcwd);
                    break;
                case 29:
                    ztjVvctVhW3SMibpO0L8oqBK.vE4yDIjexsP2lGjLaTcB = typedArrayObtainStyledAttributes.getFloat(index, ztjVvctVhW3SMibpO0L8oqBK.vE4yDIjexsP2lGjLaTcB);
                    break;
                case 30:
                    ztjVvctVhW3SMibpO0L8oqBK.O1xDAlBZZlZdoEf747lCFHld = typedArrayObtainStyledAttributes.getFloat(index, ztjVvctVhW3SMibpO0L8oqBK.O1xDAlBZZlZdoEf747lCFHld);
                    break;
                case 31:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    ztjVvctVhW3SMibpO0L8oqBK.d9zDyyznnp3oaDT1Ug = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    ztjVvctVhW3SMibpO0L8oqBK.CixTK5ZX8oWXHz34qHYV = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        ztjVvctVhW3SMibpO0L8oqBK.ymT6yQrus3w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ztjVvctVhW3SMibpO0L8oqBK.ymT6yQrus3w);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, ztjVvctVhW3SMibpO0L8oqBK.ymT6yQrus3w) == -2) {
                            ztjVvctVhW3SMibpO0L8oqBK.ymT6yQrus3w = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        ztjVvctVhW3SMibpO0L8oqBK.wRCD0SdqWCowdYU7bmzN = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ztjVvctVhW3SMibpO0L8oqBK.wRCD0SdqWCowdYU7bmzN);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, ztjVvctVhW3SMibpO0L8oqBK.wRCD0SdqWCowdYU7bmzN) == -2) {
                            ztjVvctVhW3SMibpO0L8oqBK.wRCD0SdqWCowdYU7bmzN = -2;
                        }
                    }
                    break;
                case 35:
                    ztjVvctVhW3SMibpO0L8oqBK.L8DMw02rUTs2w = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, ztjVvctVhW3SMibpO0L8oqBK.L8DMw02rUTs2w));
                    ztjVvctVhW3SMibpO0L8oqBK.d9zDyyznnp3oaDT1Ug = 2;
                    break;
                case 36:
                    try {
                        ztjVvctVhW3SMibpO0L8oqBK.YdNRGRc4rly = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ztjVvctVhW3SMibpO0L8oqBK.YdNRGRc4rly);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, ztjVvctVhW3SMibpO0L8oqBK.YdNRGRc4rly) == -2) {
                            ztjVvctVhW3SMibpO0L8oqBK.YdNRGRc4rly = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        ztjVvctVhW3SMibpO0L8oqBK.gBaBUmihn5l4u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ztjVvctVhW3SMibpO0L8oqBK.gBaBUmihn5l4u);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, ztjVvctVhW3SMibpO0L8oqBK.gBaBUmihn5l4u) == -2) {
                            ztjVvctVhW3SMibpO0L8oqBK.gBaBUmihn5l4u = -2;
                        }
                    }
                    break;
                case 38:
                    ztjVvctVhW3SMibpO0L8oqBK.lQ0rO9lhQIyVe7Rp6 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, ztjVvctVhW3SMibpO0L8oqBK.lQ0rO9lhQIyVe7Rp6));
                    ztjVvctVhW3SMibpO0L8oqBK.CixTK5ZX8oWXHz34qHYV = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            nUshirpmbH6saVf9I.NSjgqmGjEzuugn2SsG1mZFP(ztjVvctVhW3SMibpO0L8oqBK, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            ztjVvctVhW3SMibpO0L8oqBK.y1NaPKTl7R18DOr6e8i5 = typedArrayObtainStyledAttributes.getFloat(index, ztjVvctVhW3SMibpO0L8oqBK.y1NaPKTl7R18DOr6e8i5);
                            break;
                        case 46:
                            ztjVvctVhW3SMibpO0L8oqBK.qygqjTppWwx992 = typedArrayObtainStyledAttributes.getFloat(index, ztjVvctVhW3SMibpO0L8oqBK.qygqjTppWwx992);
                            break;
                        case 47:
                            ztjVvctVhW3SMibpO0L8oqBK.iKANjmyTSxO6v6UuLPdu7DxOjlS = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            ztjVvctVhW3SMibpO0L8oqBK.TqcnImqkSWIKht = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            ztjVvctVhW3SMibpO0L8oqBK.JUdwvN8LfOMa = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ztjVvctVhW3SMibpO0L8oqBK.JUdwvN8LfOMa);
                            break;
                        case 50:
                            ztjVvctVhW3SMibpO0L8oqBK.ItrQwCXbty5PZtje5JS = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ztjVvctVhW3SMibpO0L8oqBK.ItrQwCXbty5PZtje5JS);
                            break;
                        case 51:
                            ztjVvctVhW3SMibpO0L8oqBK.KYZ9RyuOc42A2J = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, ztjVvctVhW3SMibpO0L8oqBK.p59rPv72J9);
                            ztjVvctVhW3SMibpO0L8oqBK.p59rPv72J9 = resourceId15;
                            if (resourceId15 == -1) {
                                ztjVvctVhW3SMibpO0L8oqBK.p59rPv72J9 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, ztjVvctVhW3SMibpO0L8oqBK.Ca81ebIan1u);
                            ztjVvctVhW3SMibpO0L8oqBK.Ca81ebIan1u = resourceId16;
                            if (resourceId16 == -1) {
                                ztjVvctVhW3SMibpO0L8oqBK.Ca81ebIan1u = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            ztjVvctVhW3SMibpO0L8oqBK.aXO0LSrt8bKV = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ztjVvctVhW3SMibpO0L8oqBK.aXO0LSrt8bKV);
                            break;
                        case 55:
                            ztjVvctVhW3SMibpO0L8oqBK.pzqP2AqKW6J5PO8zCKnW = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ztjVvctVhW3SMibpO0L8oqBK.pzqP2AqKW6J5PO8zCKnW);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    nUshirpmbH6saVf9I.ZLZeBXTMq0zDztBxtRTuCHrapQ(ztjVvctVhW3SMibpO0L8oqBK, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    nUshirpmbH6saVf9I.ZLZeBXTMq0zDztBxtRTuCHrapQ(ztjVvctVhW3SMibpO0L8oqBK, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    ztjVvctVhW3SMibpO0L8oqBK.zOk739gUM7zIZC25HHUxoiyixWFjn = typedArrayObtainStyledAttributes.getInt(index, ztjVvctVhW3SMibpO0L8oqBK.zOk739gUM7zIZC25HHUxoiyixWFjn);
                                    break;
                                case 67:
                                    ztjVvctVhW3SMibpO0L8oqBK.ZfQNn8hdWlEQ5cR94249PDsLR = typedArrayObtainStyledAttributes.getBoolean(index, ztjVvctVhW3SMibpO0L8oqBK.ZfQNn8hdWlEQ5cR94249PDsLR);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        ztjVvctVhW3SMibpO0L8oqBK.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        return ztjVvctVhW3SMibpO0L8oqBK;
    }

    public int getMaxHeight() {
        return this.GI83zq0G8e7zkn;
    }

    public int getMaxWidth() {
        return this.NSjgqmGjEzuugn2SsG1mZFP;
    }

    public int getMinHeight() {
        return this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    public int getMinWidth() {
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    public int getOptimizationLevel() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x.ScSj9HEorWkb3bIb1HyeKVoW;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        rwLNq3eKZ2vnR0XP rwlnq3ekz2vnr0xp = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (rwlnq3ekz2vnr0xp.M9e7PWhFYLD2lOGMker == null) {
            int id2 = getId();
            if (id2 != -1) {
                rwlnq3ekz2vnr0xp.M9e7PWhFYLD2lOGMker = getContext().getResources().getResourceEntryName(id2);
            } else {
                rwlnq3ekz2vnr0xp.M9e7PWhFYLD2lOGMker = "parent";
            }
        }
        if (rwlnq3ekz2vnr0xp.mhUCRR8ceqc7mAozW == null) {
            rwlnq3ekz2vnr0xp.mhUCRR8ceqc7mAozW = rwlnq3ekz2vnr0xp.M9e7PWhFYLD2lOGMker;
            Log.v("ConstraintLayout", " setDebugName " + rwlnq3ekz2vnr0xp.mhUCRR8ceqc7mAozW);
        }
        ArrayList arrayList = rwlnq3ekz2vnr0xp.AFOcXGdvoTMuqwiG8tD;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            IPwvkMKvXW4H2mJtQ4szs9vgoyzLD iPwvkMKvXW4H2mJtQ4szs9vgoyzLD = (IPwvkMKvXW4H2mJtQ4szs9vgoyzLD) obj;
            View view = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.BJQHddi0Plr5ElWetCyaixWOg9;
            if (view != null) {
                if (iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.M9e7PWhFYLD2lOGMker == null && (id = view.getId()) != -1) {
                    iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.M9e7PWhFYLD2lOGMker = getContext().getResources().getResourceEntryName(id);
                }
                if (iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.mhUCRR8ceqc7mAozW == null) {
                    iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.mhUCRR8ceqc7mAozW = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.M9e7PWhFYLD2lOGMker;
                    Log.v("ConstraintLayout", " setDebugName " + iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.mhUCRR8ceqc7mAozW);
                }
            }
        }
        rwlnq3ekz2vnr0xp.p59rPv72J9(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            ZtjVvctVhW3SMibpO0L8oqBK ztjVvctVhW3SMibpO0L8oqBK = (ZtjVvctVhW3SMibpO0L8oqBK) childAt.getLayoutParams();
            IPwvkMKvXW4H2mJtQ4szs9vgoyzLD iPwvkMKvXW4H2mJtQ4szs9vgoyzLD = ztjVvctVhW3SMibpO0L8oqBK.e1gEV3X9xwmHj;
            if (childAt.getVisibility() != 8 || ztjVvctVhW3SMibpO0L8oqBK.Z1FjjMJ0suz8AFI7gsA4GDLMXv || ztjVvctVhW3SMibpO0L8oqBK.bjhcQ0u7VT2OYYrwk96HrWoN || zIsInEditMode) {
                int iKo09zE6UAgwkV = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.ko09zE6UAgwkV();
                int iJW7EiD0YL6xkbB158jMUzhWNWb1y = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.jW7EiD0YL6xkbB158jMUzhWNWb1y();
                childAt.layout(iKo09zE6UAgwkV, iJW7EiD0YL6xkbB158jMUzhWNWb1y, iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.pYmKDYlAmhudp() + iKo09zE6UAgwkV, iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.HzCpKshMOoaw76hFcbOVRYMeRd() + iJW7EiD0YL6xkbB158jMUzhWNWb1y);
            }
        }
        ArrayList arrayList = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((HnVNsdy3Lwin5xfqq) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0552  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 1559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        IPwvkMKvXW4H2mJtQ4szs9vgoyzLD iPwvkMKvXW4H2mJtQ4szs9vgoyzLDNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP(view);
        if ((view instanceof yVuHRiUaJhQPY) && !(iPwvkMKvXW4H2mJtQ4szs9vgoyzLDNSjgqmGjEzuugn2SsG1mZFP instanceof lgLPimJSSQ0NVW)) {
            ZtjVvctVhW3SMibpO0L8oqBK ztjVvctVhW3SMibpO0L8oqBK = (ZtjVvctVhW3SMibpO0L8oqBK) view.getLayoutParams();
            lgLPimJSSQ0NVW lglpimjssq0nvw = new lgLPimJSSQ0NVW();
            ztjVvctVhW3SMibpO0L8oqBK.e1gEV3X9xwmHj = lglpimjssq0nvw;
            ztjVvctVhW3SMibpO0L8oqBK.Z1FjjMJ0suz8AFI7gsA4GDLMXv = true;
            lglpimjssq0nvw.lQ0rO9lhQIyVe7Rp6(ztjVvctVhW3SMibpO0L8oqBK.hKs1wlZyvtUNaW1f5ABIGacfPcvX);
        }
        if (view instanceof HnVNsdy3Lwin5xfqq) {
            HnVNsdy3Lwin5xfqq hnVNsdy3Lwin5xfqq = (HnVNsdy3Lwin5xfqq) view;
            hnVNsdy3Lwin5xfqq.GI83zq0G8e7zkn();
            ((ZtjVvctVhW3SMibpO0L8oqBK) view.getLayoutParams()).bjhcQ0u7VT2OYYrwk96HrWoN = true;
            ArrayList arrayList = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (!arrayList.contains(hnVNsdy3Lwin5xfqq)) {
                arrayList.add(hnVNsdy3Lwin5xfqq);
            }
        }
        this.V57tEvNfxZVVcOCAOih5PKr.put(view.getId(), view);
        this.M9e7PWhFYLD2lOGMker = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.V57tEvNfxZVVcOCAOih5PKr.remove(view.getId());
        IPwvkMKvXW4H2mJtQ4szs9vgoyzLD iPwvkMKvXW4H2mJtQ4szs9vgoyzLDNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP(view);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.AFOcXGdvoTMuqwiG8tD.remove(iPwvkMKvXW4H2mJtQ4szs9vgoyzLDNSjgqmGjEzuugn2SsG1mZFP);
        iPwvkMKvXW4H2mJtQ4szs9vgoyzLDNSjgqmGjEzuugn2SsG1mZFP.pzqP2AqKW6J5PO8zCKnW();
        this.ZfQNn8hdWlEQ5cR94249PDsLR.remove(view);
        this.M9e7PWhFYLD2lOGMker = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.M9e7PWhFYLD2lOGMker = true;
        super.requestLayout();
    }

    public void setConstraintSet(nUshirpmbH6saVf9I nushirpmbh6savf9i) {
        this.KUYypEB4eNWOZWVDpH = nushirpmbh6savf9i;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.V57tEvNfxZVVcOCAOih5PKr;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.GI83zq0G8e7zkn) {
            return;
        }
        this.GI83zq0G8e7zkn = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.NSjgqmGjEzuugn2SsG1mZFP) {
            return;
        }
        this.NSjgqmGjEzuugn2SsG1mZFP = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            return;
        }
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            return;
        }
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(ipq3rabslQyfR54 ipq3rabslqyfr54) {
        dXZw8zZnRXsRIYJEIdZC dxzw8zznrxsriyjeidzc = this.q1wNbhk2O6;
        if (dxzw8zznrxsriyjeidzc != null) {
            dxzw8zznrxsriyjeidzc.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.HzCpKshMOoaw76hFcbOVRYMeRd = i;
        rwLNq3eKZ2vnR0XP rwlnq3ekz2vnr0xp = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        rwlnq3ekz2vnr0xp.ScSj9HEorWkb3bIb1HyeKVoW = i;
        uij8Ij9SZKI0vaNotiNzH.pYmKDYlAmhudp = rwlnq3ekz2vnr0xp.vXWl0o6I4U59CgHs9(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.V57tEvNfxZVVcOCAOih5PKr = new SparseArray();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new ArrayList(4);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new rwLNq3eKZ2vnR0XP();
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
        this.NSjgqmGjEzuugn2SsG1mZFP = Integer.MAX_VALUE;
        this.GI83zq0G8e7zkn = Integer.MAX_VALUE;
        this.M9e7PWhFYLD2lOGMker = true;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = 257;
        this.KUYypEB4eNWOZWVDpH = null;
        this.q1wNbhk2O6 = null;
        this.p59rPv72J9 = -1;
        this.Ca81ebIan1u = new HashMap();
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = new SparseArray();
        this.pYmKDYlAmhudp = new lNG0v0TTGdvR(this, this);
        GI83zq0G8e7zkn(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ZtjVvctVhW3SMibpO0L8oqBK ztjVvctVhW3SMibpO0L8oqBK = new ZtjVvctVhW3SMibpO0L8oqBK(layoutParams);
        ztjVvctVhW3SMibpO0L8oqBK.VxUQ9tBhpHJ2AAEDNW8sghc4m = -1;
        ztjVvctVhW3SMibpO0L8oqBK.zzpBGItXfub0yWj = -1;
        ztjVvctVhW3SMibpO0L8oqBK.V57tEvNfxZVVcOCAOih5PKr = -1.0f;
        ztjVvctVhW3SMibpO0L8oqBK.ZfQNn8hdWlEQ5cR94249PDsLR = true;
        ztjVvctVhW3SMibpO0L8oqBK.LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
        ztjVvctVhW3SMibpO0L8oqBK.zIvmSL0wzmmKGc3X39b2Gw2mUGE = -1;
        ztjVvctVhW3SMibpO0L8oqBK.ZLZeBXTMq0zDztBxtRTuCHrapQ = -1;
        ztjVvctVhW3SMibpO0L8oqBK.NSjgqmGjEzuugn2SsG1mZFP = -1;
        ztjVvctVhW3SMibpO0L8oqBK.GI83zq0G8e7zkn = -1;
        ztjVvctVhW3SMibpO0L8oqBK.M9e7PWhFYLD2lOGMker = -1;
        ztjVvctVhW3SMibpO0L8oqBK.HzCpKshMOoaw76hFcbOVRYMeRd = -1;
        ztjVvctVhW3SMibpO0L8oqBK.KUYypEB4eNWOZWVDpH = -1;
        ztjVvctVhW3SMibpO0L8oqBK.q1wNbhk2O6 = -1;
        ztjVvctVhW3SMibpO0L8oqBK.p59rPv72J9 = -1;
        ztjVvctVhW3SMibpO0L8oqBK.Ca81ebIan1u = -1;
        ztjVvctVhW3SMibpO0L8oqBK.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = -1;
        ztjVvctVhW3SMibpO0L8oqBK.pYmKDYlAmhudp = 0;
        ztjVvctVhW3SMibpO0L8oqBK.ko09zE6UAgwkV = 0.0f;
        ztjVvctVhW3SMibpO0L8oqBK.jW7EiD0YL6xkbB158jMUzhWNWb1y = -1;
        ztjVvctVhW3SMibpO0L8oqBK.f6ZQsR6bPLvvCDNXOUc = -1;
        ztjVvctVhW3SMibpO0L8oqBK.vBGA6pPLqSMuYGvprl270j7 = -1;
        ztjVvctVhW3SMibpO0L8oqBK.TaDO7ogis3aEiWEtq = -1;
        ztjVvctVhW3SMibpO0L8oqBK.Irh5auREsoeV1C1RaBamlmy = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.q11o1hieEkZDhF1MGOZI26oZiDT = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.w0Wu95l8dVNw5rZMRu = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.RhfGHxtXxy0M0grmp2jkRjQg = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.qNPQb1obP7 = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.SuB3hEmTmbbRGAhtvOOmfKEon = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.pzqP2AqKW6J5PO8zCKnW = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.aXO0LSrt8bKV = 0;
        ztjVvctVhW3SMibpO0L8oqBK.vE4yDIjexsP2lGjLaTcB = 0.5f;
        ztjVvctVhW3SMibpO0L8oqBK.O1xDAlBZZlZdoEf747lCFHld = 0.5f;
        ztjVvctVhW3SMibpO0L8oqBK.HVEwbdULInpTNa0IG = null;
        ztjVvctVhW3SMibpO0L8oqBK.y1NaPKTl7R18DOr6e8i5 = -1.0f;
        ztjVvctVhW3SMibpO0L8oqBK.qygqjTppWwx992 = -1.0f;
        ztjVvctVhW3SMibpO0L8oqBK.iKANjmyTSxO6v6UuLPdu7DxOjlS = 0;
        ztjVvctVhW3SMibpO0L8oqBK.TqcnImqkSWIKht = 0;
        ztjVvctVhW3SMibpO0L8oqBK.d9zDyyznnp3oaDT1Ug = 0;
        ztjVvctVhW3SMibpO0L8oqBK.CixTK5ZX8oWXHz34qHYV = 0;
        ztjVvctVhW3SMibpO0L8oqBK.ymT6yQrus3w = 0;
        ztjVvctVhW3SMibpO0L8oqBK.YdNRGRc4rly = 0;
        ztjVvctVhW3SMibpO0L8oqBK.wRCD0SdqWCowdYU7bmzN = 0;
        ztjVvctVhW3SMibpO0L8oqBK.gBaBUmihn5l4u = 0;
        ztjVvctVhW3SMibpO0L8oqBK.L8DMw02rUTs2w = 1.0f;
        ztjVvctVhW3SMibpO0L8oqBK.lQ0rO9lhQIyVe7Rp6 = 1.0f;
        ztjVvctVhW3SMibpO0L8oqBK.JUdwvN8LfOMa = -1;
        ztjVvctVhW3SMibpO0L8oqBK.ItrQwCXbty5PZtje5JS = -1;
        ztjVvctVhW3SMibpO0L8oqBK.hKs1wlZyvtUNaW1f5ABIGacfPcvX = -1;
        ztjVvctVhW3SMibpO0L8oqBK.vXWl0o6I4U59CgHs9 = false;
        ztjVvctVhW3SMibpO0L8oqBK.wdI7vzA3Qmcwd = false;
        ztjVvctVhW3SMibpO0L8oqBK.KYZ9RyuOc42A2J = null;
        ztjVvctVhW3SMibpO0L8oqBK.zOk739gUM7zIZC25HHUxoiyixWFjn = 0;
        ztjVvctVhW3SMibpO0L8oqBK.GE1sqSYiEYQO2ew7WEZwTtUeS5 = true;
        ztjVvctVhW3SMibpO0L8oqBK.rERAmyEtGV6ANGszuKcQI = true;
        ztjVvctVhW3SMibpO0L8oqBK.H2VFYNJEVGAX = false;
        ztjVvctVhW3SMibpO0L8oqBK.Z1FjjMJ0suz8AFI7gsA4GDLMXv = false;
        ztjVvctVhW3SMibpO0L8oqBK.bjhcQ0u7VT2OYYrwk96HrWoN = false;
        ztjVvctVhW3SMibpO0L8oqBK.BJQHddi0Plr5ElWetCyaixWOg9 = -1;
        ztjVvctVhW3SMibpO0L8oqBK.tFRdVJAePmTx77bP7FAN0uI = -1;
        ztjVvctVhW3SMibpO0L8oqBK.mhUCRR8ceqc7mAozW = -1;
        ztjVvctVhW3SMibpO0L8oqBK.rE05n5RsRkyWKIeA9cmLXAKv4Hze = -1;
        ztjVvctVhW3SMibpO0L8oqBK.p6bBrs4p3Ly = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.ubNpdCC1pl7L = Integer.MIN_VALUE;
        ztjVvctVhW3SMibpO0L8oqBK.wR7sbzHKf9hYV1lxoS6nqyszepWvN = 0.5f;
        ztjVvctVhW3SMibpO0L8oqBK.e1gEV3X9xwmHj = new IPwvkMKvXW4H2mJtQ4szs9vgoyzLD();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) ztjVvctVhW3SMibpO0L8oqBK).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) ztjVvctVhW3SMibpO0L8oqBK).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) ztjVvctVhW3SMibpO0L8oqBK).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) ztjVvctVhW3SMibpO0L8oqBK).bottomMargin = marginLayoutParams.bottomMargin;
            ztjVvctVhW3SMibpO0L8oqBK.setMarginStart(marginLayoutParams.getMarginStart());
            ztjVvctVhW3SMibpO0L8oqBK.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof ZtjVvctVhW3SMibpO0L8oqBK)) {
            return ztjVvctVhW3SMibpO0L8oqBK;
        }
        ZtjVvctVhW3SMibpO0L8oqBK ztjVvctVhW3SMibpO0L8oqBK2 = (ZtjVvctVhW3SMibpO0L8oqBK) layoutParams;
        ztjVvctVhW3SMibpO0L8oqBK.VxUQ9tBhpHJ2AAEDNW8sghc4m = ztjVvctVhW3SMibpO0L8oqBK2.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        ztjVvctVhW3SMibpO0L8oqBK.zzpBGItXfub0yWj = ztjVvctVhW3SMibpO0L8oqBK2.zzpBGItXfub0yWj;
        ztjVvctVhW3SMibpO0L8oqBK.V57tEvNfxZVVcOCAOih5PKr = ztjVvctVhW3SMibpO0L8oqBK2.V57tEvNfxZVVcOCAOih5PKr;
        ztjVvctVhW3SMibpO0L8oqBK.ZfQNn8hdWlEQ5cR94249PDsLR = ztjVvctVhW3SMibpO0L8oqBK2.ZfQNn8hdWlEQ5cR94249PDsLR;
        ztjVvctVhW3SMibpO0L8oqBK.LaeGQIruHQu81hfJldjMOQSVblH3x = ztjVvctVhW3SMibpO0L8oqBK2.LaeGQIruHQu81hfJldjMOQSVblH3x;
        ztjVvctVhW3SMibpO0L8oqBK.zIvmSL0wzmmKGc3X39b2Gw2mUGE = ztjVvctVhW3SMibpO0L8oqBK2.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        ztjVvctVhW3SMibpO0L8oqBK.ZLZeBXTMq0zDztBxtRTuCHrapQ = ztjVvctVhW3SMibpO0L8oqBK2.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        ztjVvctVhW3SMibpO0L8oqBK.NSjgqmGjEzuugn2SsG1mZFP = ztjVvctVhW3SMibpO0L8oqBK2.NSjgqmGjEzuugn2SsG1mZFP;
        ztjVvctVhW3SMibpO0L8oqBK.GI83zq0G8e7zkn = ztjVvctVhW3SMibpO0L8oqBK2.GI83zq0G8e7zkn;
        ztjVvctVhW3SMibpO0L8oqBK.M9e7PWhFYLD2lOGMker = ztjVvctVhW3SMibpO0L8oqBK2.M9e7PWhFYLD2lOGMker;
        ztjVvctVhW3SMibpO0L8oqBK.HzCpKshMOoaw76hFcbOVRYMeRd = ztjVvctVhW3SMibpO0L8oqBK2.HzCpKshMOoaw76hFcbOVRYMeRd;
        ztjVvctVhW3SMibpO0L8oqBK.KUYypEB4eNWOZWVDpH = ztjVvctVhW3SMibpO0L8oqBK2.KUYypEB4eNWOZWVDpH;
        ztjVvctVhW3SMibpO0L8oqBK.q1wNbhk2O6 = ztjVvctVhW3SMibpO0L8oqBK2.q1wNbhk2O6;
        ztjVvctVhW3SMibpO0L8oqBK.p59rPv72J9 = ztjVvctVhW3SMibpO0L8oqBK2.p59rPv72J9;
        ztjVvctVhW3SMibpO0L8oqBK.Ca81ebIan1u = ztjVvctVhW3SMibpO0L8oqBK2.Ca81ebIan1u;
        ztjVvctVhW3SMibpO0L8oqBK.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = ztjVvctVhW3SMibpO0L8oqBK2.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        ztjVvctVhW3SMibpO0L8oqBK.pYmKDYlAmhudp = ztjVvctVhW3SMibpO0L8oqBK2.pYmKDYlAmhudp;
        ztjVvctVhW3SMibpO0L8oqBK.ko09zE6UAgwkV = ztjVvctVhW3SMibpO0L8oqBK2.ko09zE6UAgwkV;
        ztjVvctVhW3SMibpO0L8oqBK.jW7EiD0YL6xkbB158jMUzhWNWb1y = ztjVvctVhW3SMibpO0L8oqBK2.jW7EiD0YL6xkbB158jMUzhWNWb1y;
        ztjVvctVhW3SMibpO0L8oqBK.f6ZQsR6bPLvvCDNXOUc = ztjVvctVhW3SMibpO0L8oqBK2.f6ZQsR6bPLvvCDNXOUc;
        ztjVvctVhW3SMibpO0L8oqBK.vBGA6pPLqSMuYGvprl270j7 = ztjVvctVhW3SMibpO0L8oqBK2.vBGA6pPLqSMuYGvprl270j7;
        ztjVvctVhW3SMibpO0L8oqBK.TaDO7ogis3aEiWEtq = ztjVvctVhW3SMibpO0L8oqBK2.TaDO7ogis3aEiWEtq;
        ztjVvctVhW3SMibpO0L8oqBK.Irh5auREsoeV1C1RaBamlmy = ztjVvctVhW3SMibpO0L8oqBK2.Irh5auREsoeV1C1RaBamlmy;
        ztjVvctVhW3SMibpO0L8oqBK.q11o1hieEkZDhF1MGOZI26oZiDT = ztjVvctVhW3SMibpO0L8oqBK2.q11o1hieEkZDhF1MGOZI26oZiDT;
        ztjVvctVhW3SMibpO0L8oqBK.w0Wu95l8dVNw5rZMRu = ztjVvctVhW3SMibpO0L8oqBK2.w0Wu95l8dVNw5rZMRu;
        ztjVvctVhW3SMibpO0L8oqBK.RhfGHxtXxy0M0grmp2jkRjQg = ztjVvctVhW3SMibpO0L8oqBK2.RhfGHxtXxy0M0grmp2jkRjQg;
        ztjVvctVhW3SMibpO0L8oqBK.qNPQb1obP7 = ztjVvctVhW3SMibpO0L8oqBK2.qNPQb1obP7;
        ztjVvctVhW3SMibpO0L8oqBK.SuB3hEmTmbbRGAhtvOOmfKEon = ztjVvctVhW3SMibpO0L8oqBK2.SuB3hEmTmbbRGAhtvOOmfKEon;
        ztjVvctVhW3SMibpO0L8oqBK.pzqP2AqKW6J5PO8zCKnW = ztjVvctVhW3SMibpO0L8oqBK2.pzqP2AqKW6J5PO8zCKnW;
        ztjVvctVhW3SMibpO0L8oqBK.aXO0LSrt8bKV = ztjVvctVhW3SMibpO0L8oqBK2.aXO0LSrt8bKV;
        ztjVvctVhW3SMibpO0L8oqBK.vE4yDIjexsP2lGjLaTcB = ztjVvctVhW3SMibpO0L8oqBK2.vE4yDIjexsP2lGjLaTcB;
        ztjVvctVhW3SMibpO0L8oqBK.O1xDAlBZZlZdoEf747lCFHld = ztjVvctVhW3SMibpO0L8oqBK2.O1xDAlBZZlZdoEf747lCFHld;
        ztjVvctVhW3SMibpO0L8oqBK.HVEwbdULInpTNa0IG = ztjVvctVhW3SMibpO0L8oqBK2.HVEwbdULInpTNa0IG;
        ztjVvctVhW3SMibpO0L8oqBK.y1NaPKTl7R18DOr6e8i5 = ztjVvctVhW3SMibpO0L8oqBK2.y1NaPKTl7R18DOr6e8i5;
        ztjVvctVhW3SMibpO0L8oqBK.qygqjTppWwx992 = ztjVvctVhW3SMibpO0L8oqBK2.qygqjTppWwx992;
        ztjVvctVhW3SMibpO0L8oqBK.iKANjmyTSxO6v6UuLPdu7DxOjlS = ztjVvctVhW3SMibpO0L8oqBK2.iKANjmyTSxO6v6UuLPdu7DxOjlS;
        ztjVvctVhW3SMibpO0L8oqBK.TqcnImqkSWIKht = ztjVvctVhW3SMibpO0L8oqBK2.TqcnImqkSWIKht;
        ztjVvctVhW3SMibpO0L8oqBK.vXWl0o6I4U59CgHs9 = ztjVvctVhW3SMibpO0L8oqBK2.vXWl0o6I4U59CgHs9;
        ztjVvctVhW3SMibpO0L8oqBK.wdI7vzA3Qmcwd = ztjVvctVhW3SMibpO0L8oqBK2.wdI7vzA3Qmcwd;
        ztjVvctVhW3SMibpO0L8oqBK.d9zDyyznnp3oaDT1Ug = ztjVvctVhW3SMibpO0L8oqBK2.d9zDyyznnp3oaDT1Ug;
        ztjVvctVhW3SMibpO0L8oqBK.CixTK5ZX8oWXHz34qHYV = ztjVvctVhW3SMibpO0L8oqBK2.CixTK5ZX8oWXHz34qHYV;
        ztjVvctVhW3SMibpO0L8oqBK.ymT6yQrus3w = ztjVvctVhW3SMibpO0L8oqBK2.ymT6yQrus3w;
        ztjVvctVhW3SMibpO0L8oqBK.wRCD0SdqWCowdYU7bmzN = ztjVvctVhW3SMibpO0L8oqBK2.wRCD0SdqWCowdYU7bmzN;
        ztjVvctVhW3SMibpO0L8oqBK.YdNRGRc4rly = ztjVvctVhW3SMibpO0L8oqBK2.YdNRGRc4rly;
        ztjVvctVhW3SMibpO0L8oqBK.gBaBUmihn5l4u = ztjVvctVhW3SMibpO0L8oqBK2.gBaBUmihn5l4u;
        ztjVvctVhW3SMibpO0L8oqBK.L8DMw02rUTs2w = ztjVvctVhW3SMibpO0L8oqBK2.L8DMw02rUTs2w;
        ztjVvctVhW3SMibpO0L8oqBK.lQ0rO9lhQIyVe7Rp6 = ztjVvctVhW3SMibpO0L8oqBK2.lQ0rO9lhQIyVe7Rp6;
        ztjVvctVhW3SMibpO0L8oqBK.JUdwvN8LfOMa = ztjVvctVhW3SMibpO0L8oqBK2.JUdwvN8LfOMa;
        ztjVvctVhW3SMibpO0L8oqBK.ItrQwCXbty5PZtje5JS = ztjVvctVhW3SMibpO0L8oqBK2.ItrQwCXbty5PZtje5JS;
        ztjVvctVhW3SMibpO0L8oqBK.hKs1wlZyvtUNaW1f5ABIGacfPcvX = ztjVvctVhW3SMibpO0L8oqBK2.hKs1wlZyvtUNaW1f5ABIGacfPcvX;
        ztjVvctVhW3SMibpO0L8oqBK.GE1sqSYiEYQO2ew7WEZwTtUeS5 = ztjVvctVhW3SMibpO0L8oqBK2.GE1sqSYiEYQO2ew7WEZwTtUeS5;
        ztjVvctVhW3SMibpO0L8oqBK.rERAmyEtGV6ANGszuKcQI = ztjVvctVhW3SMibpO0L8oqBK2.rERAmyEtGV6ANGszuKcQI;
        ztjVvctVhW3SMibpO0L8oqBK.H2VFYNJEVGAX = ztjVvctVhW3SMibpO0L8oqBK2.H2VFYNJEVGAX;
        ztjVvctVhW3SMibpO0L8oqBK.Z1FjjMJ0suz8AFI7gsA4GDLMXv = ztjVvctVhW3SMibpO0L8oqBK2.Z1FjjMJ0suz8AFI7gsA4GDLMXv;
        ztjVvctVhW3SMibpO0L8oqBK.BJQHddi0Plr5ElWetCyaixWOg9 = ztjVvctVhW3SMibpO0L8oqBK2.BJQHddi0Plr5ElWetCyaixWOg9;
        ztjVvctVhW3SMibpO0L8oqBK.tFRdVJAePmTx77bP7FAN0uI = ztjVvctVhW3SMibpO0L8oqBK2.tFRdVJAePmTx77bP7FAN0uI;
        ztjVvctVhW3SMibpO0L8oqBK.mhUCRR8ceqc7mAozW = ztjVvctVhW3SMibpO0L8oqBK2.mhUCRR8ceqc7mAozW;
        ztjVvctVhW3SMibpO0L8oqBK.rE05n5RsRkyWKIeA9cmLXAKv4Hze = ztjVvctVhW3SMibpO0L8oqBK2.rE05n5RsRkyWKIeA9cmLXAKv4Hze;
        ztjVvctVhW3SMibpO0L8oqBK.p6bBrs4p3Ly = ztjVvctVhW3SMibpO0L8oqBK2.p6bBrs4p3Ly;
        ztjVvctVhW3SMibpO0L8oqBK.ubNpdCC1pl7L = ztjVvctVhW3SMibpO0L8oqBK2.ubNpdCC1pl7L;
        ztjVvctVhW3SMibpO0L8oqBK.wR7sbzHKf9hYV1lxoS6nqyszepWvN = ztjVvctVhW3SMibpO0L8oqBK2.wR7sbzHKf9hYV1lxoS6nqyszepWvN;
        ztjVvctVhW3SMibpO0L8oqBK.KYZ9RyuOc42A2J = ztjVvctVhW3SMibpO0L8oqBK2.KYZ9RyuOc42A2J;
        ztjVvctVhW3SMibpO0L8oqBK.zOk739gUM7zIZC25HHUxoiyixWFjn = ztjVvctVhW3SMibpO0L8oqBK2.zOk739gUM7zIZC25HHUxoiyixWFjn;
        ztjVvctVhW3SMibpO0L8oqBK.e1gEV3X9xwmHj = ztjVvctVhW3SMibpO0L8oqBK2.e1gEV3X9xwmHj;
        return ztjVvctVhW3SMibpO0L8oqBK;
    }
}
