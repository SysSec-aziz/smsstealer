package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class wL6lQKsoxy {
    public final p4ej2wQUoGVPNvYl4WCI1bg3E LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final p4ej2wQUoGVPNvYl4WCI1bg3E NSjgqmGjEzuugn2SsG1mZFP;
    public final int[][] V57tEvNfxZVVcOCAOih5PKr;
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final p4ej2wQUoGVPNvYl4WCI1bg3E ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final XdVIZOnOVHGi6uYUaae4zAI94b[] ZfQNn8hdWlEQ5cR94249PDsLR;
    public final p4ej2wQUoGVPNvYl4WCI1bg3E zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final XdVIZOnOVHGi6uYUaae4zAI94b zzpBGItXfub0yWj;

    public wL6lQKsoxy(oLPwQu4XgJ olpwqu4xgj) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = olpwqu4xgj.zzpBGItXfub0yWj;
        this.zzpBGItXfub0yWj = (XdVIZOnOVHGi6uYUaae4zAI94b) olpwqu4xgj.V57tEvNfxZVVcOCAOih5PKr;
        this.V57tEvNfxZVVcOCAOih5PKr = (int[][]) olpwqu4xgj.ZfQNn8hdWlEQ5cR94249PDsLR;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = (XdVIZOnOVHGi6uYUaae4zAI94b[]) olpwqu4xgj.LaeGQIruHQu81hfJldjMOQSVblH3x;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = (p4ej2wQUoGVPNvYl4WCI1bg3E) olpwqu4xgj.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = (p4ej2wQUoGVPNvYl4WCI1bg3E) olpwqu4xgj.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = (p4ej2wQUoGVPNvYl4WCI1bg3E) olpwqu4xgj.NSjgqmGjEzuugn2SsG1mZFP;
        this.NSjgqmGjEzuugn2SsG1mZFP = (p4ej2wQUoGVPNvYl4WCI1bg3E) olpwqu4xgj.GI83zq0G8e7zkn;
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(oLPwQu4XgJ olpwqu4xgj, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                int[] iArr = PGobtLpyfPC4TCnlq740.ko09zE6UAgwkV;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94bVxUQ9tBhpHJ2AAEDNW8sghc4m = XdVIZOnOVHGi6uYUaae4zAI94b.VxUQ9tBhpHJ2AAEDNW8sghc4m(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0), new ZOzTbMJxsw(0)).VxUQ9tBhpHJ2AAEDNW8sghc4m();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                olpwqu4xgj.zzpBGItXfub0yWj(StateSet.trimStateSet(iArr2, i), xdVIZOnOVHGi6uYUaae4zAI94bVxUQ9tBhpHJ2AAEDNW8sghc4m);
            }
        }
    }

    public static wL6lQKsoxy zzpBGItXfub0yWj(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        oLPwQu4XgJ olpwqu4xgj = new oLPwQu4XgJ(1);
        olpwqu4xgj.LaeGQIruHQu81hfJldjMOQSVblH3x();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            olpwqu4xgj.LaeGQIruHQu81hfJldjMOQSVblH3x();
        }
        try {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (xml.getName().equals("selector")) {
                VxUQ9tBhpHJ2AAEDNW8sghc4m(olpwqu4xgj, context, xml, attributeSetAsAttributeSet, context.getTheme());
            }
            xml.close();
            if (olpwqu4xgj.zzpBGItXfub0yWj == 0) {
                return null;
            }
            return new wL6lQKsoxy(olpwqu4xgj);
        } catch (Throwable th) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final XdVIZOnOVHGi6uYUaae4zAI94b V57tEvNfxZVVcOCAOih5PKr() {
        XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b = this.zzpBGItXfub0yWj;
        p4ej2wQUoGVPNvYl4WCI1bg3E p4ej2wquogvpnvyl4wci1bg3e = this.NSjgqmGjEzuugn2SsG1mZFP;
        p4ej2wQUoGVPNvYl4WCI1bg3E p4ej2wquogvpnvyl4wci1bg3e2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        p4ej2wQUoGVPNvYl4WCI1bg3E p4ej2wquogvpnvyl4wci1bg3e3 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        p4ej2wQUoGVPNvYl4WCI1bg3E p4ej2wquogvpnvyl4wci1bg3e4 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (p4ej2wquogvpnvyl4wci1bg3e4 == null && p4ej2wquogvpnvyl4wci1bg3e3 == null && p4ej2wquogvpnvyl4wci1bg3e2 == null && p4ej2wquogvpnvyl4wci1bg3e == null) {
            return xdVIZOnOVHGi6uYUaae4zAI94b;
        }
        jFJXX88X4vgYX5CG85l5EyqW8AAH jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE = xdVIZOnOVHGi6uYUaae4zAI94b.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        if (p4ej2wquogvpnvyl4wci1bg3e4 != null) {
            jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.LaeGQIruHQu81hfJldjMOQSVblH3x = p4ej2wquogvpnvyl4wci1bg3e4.zzpBGItXfub0yWj;
        }
        if (p4ej2wquogvpnvyl4wci1bg3e3 != null) {
            jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.zIvmSL0wzmmKGc3X39b2Gw2mUGE = p4ej2wquogvpnvyl4wci1bg3e3.zzpBGItXfub0yWj;
        }
        if (p4ej2wquogvpnvyl4wci1bg3e2 != null) {
            jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.NSjgqmGjEzuugn2SsG1mZFP = p4ej2wquogvpnvyl4wci1bg3e2.zzpBGItXfub0yWj;
        }
        if (p4ej2wquogvpnvyl4wci1bg3e != null) {
            jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.ZLZeBXTMq0zDztBxtRTuCHrapQ = p4ej2wquogvpnvyl4wci1bg3e.zzpBGItXfub0yWj;
        }
        return jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR() {
        p4ej2wQUoGVPNvYl4WCI1bg3E p4ej2wquogvpnvyl4wci1bg3e;
        p4ej2wQUoGVPNvYl4WCI1bg3E p4ej2wquogvpnvyl4wci1bg3e2;
        p4ej2wQUoGVPNvYl4WCI1bg3E p4ej2wquogvpnvyl4wci1bg3e3;
        p4ej2wQUoGVPNvYl4WCI1bg3E p4ej2wquogvpnvyl4wci1bg3e4;
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m > 1 || ((p4ej2wquogvpnvyl4wci1bg3e = this.LaeGQIruHQu81hfJldjMOQSVblH3x) != null && p4ej2wquogvpnvyl4wci1bg3e.VxUQ9tBhpHJ2AAEDNW8sghc4m > 1) || (((p4ej2wquogvpnvyl4wci1bg3e2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) != null && p4ej2wquogvpnvyl4wci1bg3e2.VxUQ9tBhpHJ2AAEDNW8sghc4m > 1) || (((p4ej2wquogvpnvyl4wci1bg3e3 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ) != null && p4ej2wquogvpnvyl4wci1bg3e3.VxUQ9tBhpHJ2AAEDNW8sghc4m > 1) || ((p4ej2wquogvpnvyl4wci1bg3e4 = this.NSjgqmGjEzuugn2SsG1mZFP) != null && p4ej2wquogvpnvyl4wci1bg3e4.VxUQ9tBhpHJ2AAEDNW8sghc4m > 1)));
    }
}
