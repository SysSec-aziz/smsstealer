package com.vdodsodjsdt;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class hEzujSQMPyLOvX implements hF6Qoen11a, RuzGhvSiqi5DE {
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public Cloneable NSjgqmGjEzuugn2SsG1mZFP;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public Object ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public Object ZfQNn8hdWlEQ5cR94249PDsLR;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public /* synthetic */ hEzujSQMPyLOvX() {
        this.V57tEvNfxZVVcOCAOih5PKr = 0;
    }

    @Override // com.vdodsodjsdt.RuzGhvSiqi5DE
    public int Ca81ebIan1u() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // com.vdodsodjsdt.RuzGhvSiqi5DE
    public ContentInfo KUYypEB4eNWOZWVDpH() {
        return null;
    }

    @Override // com.vdodsodjsdt.RuzGhvSiqi5DE
    public int M9e7PWhFYLD2lOGMker() {
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    public void VxUQ9tBhpHJ2AAEDNW8sghc4m(pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((oh4pE3JpiN2OEnGMPzOmHa7Yqe) it.next()).VxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr() & 8) != 0) {
                ((View) this.ZLZeBXTMq0zDztBxtRTuCHrapQ).setTranslationY(mlFPz0SY9o7oN.V57tEvNfxZVVcOCAOih5PKr(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, 0, r3.VxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj()));
                return;
            }
        }
    }

    @Override // com.vdodsodjsdt.RuzGhvSiqi5DE
    public ClipData ZfQNn8hdWlEQ5cR94249PDsLR() {
        return (ClipData) this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    @Override // com.vdodsodjsdt.hF6Qoen11a
    public u4GJTAMGthCvBFOcZhx3psAaG8l build() {
        return new u4GJTAMGthCvBFOcZhx3psAaG8l(new hEzujSQMPyLOvX(this));
    }

    @Override // com.vdodsodjsdt.hF6Qoen11a
    public void ko09zE6UAgwkV(int i) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i;
    }

    @Override // com.vdodsodjsdt.hF6Qoen11a
    public void p59rPv72J9(Uri uri) {
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = uri;
    }

    @Override // com.vdodsodjsdt.hF6Qoen11a
    public void setExtras(Bundle bundle) {
        this.NSjgqmGjEzuugn2SsG1mZFP = bundle;
    }

    public String toString() {
        String str;
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 1:
                Uri uri = (Uri) this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.ZfQNn8hdWlEQ5cR94249PDsLR).getDescription());
                sb.append(", source=");
                int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return u9SlVAuoWhQUfJ.HzCpKshMOoaw76hFcbOVRYMeRd(sb, ((Bundle) this.NSjgqmGjEzuugn2SsG1mZFP) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public hEzujSQMPyLOvX(hEzujSQMPyLOvX hezujsqmpylovx) {
        this.V57tEvNfxZVVcOCAOih5PKr = 1;
        ClipData clipData = (ClipData) hezujsqmpylovx.ZfQNn8hdWlEQ5cR94249PDsLR;
        clipData.getClass();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = clipData;
        int i = hezujsqmpylovx.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i;
        int i2 = hezujsqmpylovx.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if ((i2 & 1) == i2) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i2;
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = (Uri) hezujsqmpylovx.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            this.NSjgqmGjEzuugn2SsG1mZFP = (Bundle) hezujsqmpylovx.NSjgqmGjEzuugn2SsG1mZFP;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.lang.Cloneable] */
    public hEzujSQMPyLOvX(View view) {
        this.V57tEvNfxZVVcOCAOih5PKr = 2;
        this.NSjgqmGjEzuugn2SsG1mZFP = new int[2];
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = view;
    }
}
