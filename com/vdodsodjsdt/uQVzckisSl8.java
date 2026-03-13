package com.vdodsodjsdt;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class uQVzckisSl8 extends MenuInflater {
    public static final Class[] LaeGQIruHQu81hfJldjMOQSVblH3x;
    public static final Class[] zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final Context V57tEvNfxZVVcOCAOih5PKr;
    public final Object[] VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public Object ZfQNn8hdWlEQ5cR94249PDsLR;
    public final Object[] zzpBGItXfub0yWj;

    static {
        Class[] clsArr = {Context.class};
        LaeGQIruHQu81hfJldjMOQSVblH3x = clsArr;
        zIvmSL0wzmmKGc3X39b2Gw2mUGE = clsArr;
    }

    public uQVzckisSl8(Context context) {
        super(context);
        this.V57tEvNfxZVVcOCAOih5PKr = context;
        Object[] objArr = {context};
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = objArr;
        this.zzpBGItXfub0yWj = objArr;
    }

    public static Object VxUQ9tBhpHJ2AAEDNW8sghc4m(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? VxUQ9tBhpHJ2AAEDNW8sghc4m(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof Stuu2Qyz6BSCKFEomt5b51vUnV1HQ)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.V57tEvNfxZVVcOCAOih5PKr.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof Stuu2Qyz6BSCKFEomt5b51vUnV1HQ) {
                    Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = (Stuu2Qyz6BSCKFEomt5b51vUnV1HQ) menu;
                    if (!stuu2Qyz6BSCKFEomt5b51vUnV1HQ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) {
                        stuu2Qyz6BSCKFEomt5b51vUnV1HQ.Irh5auREsoeV1C1RaBamlmy();
                        z = true;
                    }
                }
                zzpBGItXfub0yWj(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((Stuu2Qyz6BSCKFEomt5b51vUnV1HQ) menu).TaDO7ogis3aEiWEtq();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((Stuu2Qyz6BSCKFEomt5b51vUnV1HQ) menu).TaDO7ogis3aEiWEtq();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    public final void zzpBGItXfub0yWj(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        j73LL8QOMOPukrggAKAWxXkyyKn7G j73ll8qomopukrggakawxxkyykn7g = new j73LL8QOMOPukrggAKAWxXkyyKn7G(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                    z = z;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z2 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            j73ll8qomopukrggakawxxkyykn7g.zzpBGItXfub0yWj = 0;
                            j73ll8qomopukrggakawxxkyykn7g.V57tEvNfxZVVcOCAOih5PKr = 0;
                            j73ll8qomopukrggakawxxkyykn7g.ZfQNn8hdWlEQ5cR94249PDsLR = 0;
                            j73ll8qomopukrggakawxxkyykn7g.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
                            j73ll8qomopukrggakawxxkyykn7g.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
                            j73ll8qomopukrggakawxxkyykn7g.ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
                        } else if (name2.equals("item")) {
                            if (!j73ll8qomopukrggakawxxkyykn7g.NSjgqmGjEzuugn2SsG1mZFP) {
                                J97y3vhwLiUYt j97y3vhwLiUYt = j73ll8qomopukrggakawxxkyykn7g.RhfGHxtXxy0M0grmp2jkRjQg;
                                if (j97y3vhwLiUYt == null || !j97y3vhwLiUYt.zzpBGItXfub0yWj.hasSubMenu()) {
                                    j73ll8qomopukrggakawxxkyykn7g.NSjgqmGjEzuugn2SsG1mZFP = true;
                                    j73ll8qomopukrggakawxxkyykn7g.zzpBGItXfub0yWj(j73ll8qomopukrggakawxxkyykn7g.VxUQ9tBhpHJ2AAEDNW8sghc4m.add(j73ll8qomopukrggakawxxkyykn7g.zzpBGItXfub0yWj, j73ll8qomopukrggakawxxkyykn7g.GI83zq0G8e7zkn, j73ll8qomopukrggakawxxkyykn7g.M9e7PWhFYLD2lOGMker, j73ll8qomopukrggakawxxkyykn7g.HzCpKshMOoaw76hFcbOVRYMeRd));
                                } else {
                                    j73ll8qomopukrggakawxxkyykn7g.NSjgqmGjEzuugn2SsG1mZFP = true;
                                    j73ll8qomopukrggakawxxkyykn7g.zzpBGItXfub0yWj(j73ll8qomopukrggakawxxkyykn7g.VxUQ9tBhpHJ2AAEDNW8sghc4m.addSubMenu(j73ll8qomopukrggakawxxkyykn7g.zzpBGItXfub0yWj, j73ll8qomopukrggakawxxkyykn7g.GI83zq0G8e7zkn, j73ll8qomopukrggakawxxkyykn7g.M9e7PWhFYLD2lOGMker, j73ll8qomopukrggakawxxkyykn7g.HzCpKshMOoaw76hFcbOVRYMeRd).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                        z = z;
                    }
                }
                eventType = xmlPullParser2.next();
                i = 2;
                z = z;
                z2 = z2;
            } else {
                if (!z2) {
                    String name3 = xmlPullParser.getName();
                    boolean zEquals = name3.equals("group");
                    Context context = this.V57tEvNfxZVVcOCAOih5PKr;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AuEvIFo0QoYm1PHNG.h3jnZRsdwYJfY9UhQCkbvWciwvFHv);
                        j73ll8qomopukrggakawxxkyykn7g.zzpBGItXfub0yWj = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        j73ll8qomopukrggakawxxkyykn7g.V57tEvNfxZVVcOCAOih5PKr = typedArrayObtainStyledAttributes.getInt(3, 0);
                        j73ll8qomopukrggakawxxkyykn7g.ZfQNn8hdWlEQ5cR94249PDsLR = typedArrayObtainStyledAttributes.getInt(4, 0);
                        j73ll8qomopukrggakawxxkyykn7g.LaeGQIruHQu81hfJldjMOQSVblH3x = typedArrayObtainStyledAttributes.getInt(5, 0);
                        j73ll8qomopukrggakawxxkyykn7g.zIvmSL0wzmmKGc3X39b2Gw2mUGE = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        j73ll8qomopukrggakawxxkyykn7g.ZLZeBXTMq0zDztBxtRTuCHrapQ = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AuEvIFo0QoYm1PHNG.pYmKDYlAmhudp);
                            j73ll8qomopukrggakawxxkyykn7g.GI83zq0G8e7zkn = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            j73ll8qomopukrggakawxxkyykn7g.M9e7PWhFYLD2lOGMker = (typedArrayObtainStyledAttributes2.getInt(5, j73ll8qomopukrggakawxxkyykn7g.V57tEvNfxZVVcOCAOih5PKr) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, j73ll8qomopukrggakawxxkyykn7g.ZfQNn8hdWlEQ5cR94249PDsLR) & 65535);
                            j73ll8qomopukrggakawxxkyykn7g.HzCpKshMOoaw76hFcbOVRYMeRd = typedArrayObtainStyledAttributes2.getText(7);
                            j73ll8qomopukrggakawxxkyykn7g.KUYypEB4eNWOZWVDpH = typedArrayObtainStyledAttributes2.getText(8);
                            j73ll8qomopukrggakawxxkyykn7g.q1wNbhk2O6 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            j73ll8qomopukrggakawxxkyykn7g.p59rPv72J9 = string == null ? (char) 0 : string.charAt(0);
                            j73ll8qomopukrggakawxxkyykn7g.Ca81ebIan1u = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            j73ll8qomopukrggakawxxkyykn7g.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = string2 == null ? (char) 0 : string2.charAt(0);
                            j73ll8qomopukrggakawxxkyykn7g.pYmKDYlAmhudp = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                j73ll8qomopukrggakawxxkyykn7g.ko09zE6UAgwkV = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                j73ll8qomopukrggakawxxkyykn7g.ko09zE6UAgwkV = j73ll8qomopukrggakawxxkyykn7g.LaeGQIruHQu81hfJldjMOQSVblH3x;
                            }
                            j73ll8qomopukrggakawxxkyykn7g.jW7EiD0YL6xkbB158jMUzhWNWb1y = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            j73ll8qomopukrggakawxxkyykn7g.f6ZQsR6bPLvvCDNXOUc = typedArrayObtainStyledAttributes2.getBoolean(4, j73ll8qomopukrggakawxxkyykn7g.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                            j73ll8qomopukrggakawxxkyykn7g.vBGA6pPLqSMuYGvprl270j7 = typedArrayObtainStyledAttributes2.getBoolean(1, j73ll8qomopukrggakawxxkyykn7g.ZLZeBXTMq0zDztBxtRTuCHrapQ);
                            j73ll8qomopukrggakawxxkyykn7g.TaDO7ogis3aEiWEtq = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            j73ll8qomopukrggakawxxkyykn7g.w0Wu95l8dVNw5rZMRu = typedArrayObtainStyledAttributes2.getString(12);
                            j73ll8qomopukrggakawxxkyykn7g.Irh5auREsoeV1C1RaBamlmy = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            j73ll8qomopukrggakawxxkyykn7g.q11o1hieEkZDhF1MGOZI26oZiDT = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z3 = string3 != null;
                            if (z3 && j73ll8qomopukrggakawxxkyykn7g.Irh5auREsoeV1C1RaBamlmy == 0 && j73ll8qomopukrggakawxxkyykn7g.q11o1hieEkZDhF1MGOZI26oZiDT == null) {
                                j73ll8qomopukrggakawxxkyykn7g.RhfGHxtXxy0M0grmp2jkRjQg = (J97y3vhwLiUYt) j73ll8qomopukrggakawxxkyykn7g.VxUQ9tBhpHJ2AAEDNW8sghc4m(string3, zIvmSL0wzmmKGc3X39b2Gw2mUGE, this.zzpBGItXfub0yWj);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                j73ll8qomopukrggakawxxkyykn7g.RhfGHxtXxy0M0grmp2jkRjQg = null;
                            }
                            j73ll8qomopukrggakawxxkyykn7g.qNPQb1obP7 = typedArrayObtainStyledAttributes2.getText(17);
                            j73ll8qomopukrggakawxxkyykn7g.SuB3hEmTmbbRGAhtvOOmfKEon = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                j73ll8qomopukrggakawxxkyykn7g.aXO0LSrt8bKV = VGwRvGhOWf9duTP8Dxb9PtsLAe1z.zzpBGItXfub0yWj(typedArrayObtainStyledAttributes2.getInt(19, -1), j73ll8qomopukrggakawxxkyykn7g.aXO0LSrt8bKV);
                            } else {
                                j73ll8qomopukrggakawxxkyykn7g.aXO0LSrt8bKV = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                j73ll8qomopukrggakawxxkyykn7g.pzqP2AqKW6J5PO8zCKnW = colorStateList;
                            } else {
                                j73ll8qomopukrggakawxxkyykn7g.pzqP2AqKW6J5PO8zCKnW = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            j73ll8qomopukrggakawxxkyykn7g.NSjgqmGjEzuugn2SsG1mZFP = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            j73ll8qomopukrggakawxxkyykn7g.NSjgqmGjEzuugn2SsG1mZFP = true;
                            SubMenu subMenuAddSubMenu = j73ll8qomopukrggakawxxkyykn7g.VxUQ9tBhpHJ2AAEDNW8sghc4m.addSubMenu(j73ll8qomopukrggakawxxkyykn7g.zzpBGItXfub0yWj, j73ll8qomopukrggakawxxkyykn7g.GI83zq0G8e7zkn, j73ll8qomopukrggakawxxkyykn7g.M9e7PWhFYLD2lOGMker, j73ll8qomopukrggakawxxkyykn7g.HzCpKshMOoaw76hFcbOVRYMeRd);
                            j73ll8qomopukrggakawxxkyykn7g.zzpBGItXfub0yWj(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            zzpBGItXfub0yWj(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }
}
