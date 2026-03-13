package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class p4ej2wQUoGVPNvYl4WCI1bg3E {
    public int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public WBbGwHQ7q5Zp0OIijyR zzpBGItXfub0yWj;
    public int[][] V57tEvNfxZVVcOCAOih5PKr = new int[10][];
    public WBbGwHQ7q5Zp0OIijyR[] ZfQNn8hdWlEQ5cR94249PDsLR = new WBbGwHQ7q5Zp0OIijyR[10];

    public static p4ej2wQUoGVPNvYl4WCI1bg3E zzpBGItXfub0yWj(WBbGwHQ7q5Zp0OIijyR wBbGwHQ7q5Zp0OIijyR) {
        p4ej2wQUoGVPNvYl4WCI1bg3E p4ej2wquogvpnvyl4wci1bg3e = new p4ej2wQUoGVPNvYl4WCI1bg3E();
        p4ej2wquogvpnvyl4wci1bg3e.VxUQ9tBhpHJ2AAEDNW8sghc4m(StateSet.WILD_CARD, wBbGwHQ7q5Zp0OIijyR);
        return p4ej2wquogvpnvyl4wci1bg3e;
    }

    public final WBbGwHQ7q5Zp0OIijyR V57tEvNfxZVVcOCAOih5PKr(int[] iArr) {
        int i;
        int[][] iArr2 = this.V57tEvNfxZVVcOCAOih5PKr;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (i3 >= this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                i3 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            }
            i3++;
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.V57tEvNfxZVVcOCAOih5PKr;
            while (true) {
                if (i2 >= this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i2], iArr3)) {
                    i = i2;
                    break;
                }
                i2++;
            }
            i3 = i;
        }
        return i3 < 0 ? this.zzpBGItXfub0yWj : this.ZfQNn8hdWlEQ5cR94249PDsLR[i3];
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(int[] iArr, WBbGwHQ7q5Zp0OIijyR wBbGwHQ7q5Zp0OIijyR) {
        int i = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (i == 0 || iArr.length == 0) {
            this.zzpBGItXfub0yWj = wBbGwHQ7q5Zp0OIijyR;
        }
        int[][] iArr2 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.V57tEvNfxZVVcOCAOih5PKr = iArr3;
            WBbGwHQ7q5Zp0OIijyR[] wBbGwHQ7q5Zp0OIijyRArr = new WBbGwHQ7q5Zp0OIijyR[i2];
            System.arraycopy(this.ZfQNn8hdWlEQ5cR94249PDsLR, 0, wBbGwHQ7q5Zp0OIijyRArr, 0, i);
            this.ZfQNn8hdWlEQ5cR94249PDsLR = wBbGwHQ7q5Zp0OIijyRArr;
        }
        int[][] iArr4 = this.V57tEvNfxZVVcOCAOih5PKr;
        int i3 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        iArr4[i3] = iArr;
        this.ZfQNn8hdWlEQ5cR94249PDsLR[i3] = wBbGwHQ7q5Zp0OIijyR;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i3 + 1;
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = PGobtLpyfPC4TCnlq740.w0Wu95l8dVNw5rZMRu;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                WBbGwHQ7q5Zp0OIijyR wBbGwHQ7q5Zp0OIijyRV57tEvNfxZVVcOCAOih5PKr = XdVIZOnOVHGi6uYUaae4zAI94b.V57tEvNfxZVVcOCAOih5PKr(typedArrayObtainAttributes, 5, new ZOzTbMJxsw(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.cornerSize) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                VxUQ9tBhpHJ2AAEDNW8sghc4m(StateSet.trimStateSet(iArr2, i), wBbGwHQ7q5Zp0OIijyRV57tEvNfxZVVcOCAOih5PKr);
            }
        }
    }
}
