package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb {
    public Object V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public Object ZfQNn8hdWlEQ5cR94249PDsLR;
    public int zzpBGItXfub0yWj;

    public EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb(ZQ5iEBLmvObelGeRgKLPRxHbZEk zQ5iEBLmvObelGeRgKLPRxHbZEk, int i, String str) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 3;
        this.V57tEvNfxZVVcOCAOih5PKr = zQ5iEBLmvObelGeRgKLPRxHbZEk;
        this.zzpBGItXfub0yWj = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = str;
    }

    public static void V57tEvNfxZVVcOCAOih5PKr(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = ej6unYlOWMDF.ko09zE6UAgwkV(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x021b, code lost:
    
        r0 = new com.vdodsodjsdt.o6OxmOsCD9HJ6LF8UTncnTX9Cf21();
        r0.V57tEvNfxZVVcOCAOih5PKr = new int[]{r6, r5, r12};
        r0.ZfQNn8hdWlEQ5cR94249PDsLR = new float[]{0.0f, 0.5f, 1.0f};
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x022f, code lost:
    
        r0 = new com.vdodsodjsdt.o6OxmOsCD9HJ6LF8UTncnTX9Cf21();
        r0.V57tEvNfxZVVcOCAOih5PKr = new int[]{r6, r12};
        r15 = 2;
        r0.ZfQNn8hdWlEQ5cR94249PDsLR = new float[]{0.0f, 1.0f};
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0243, code lost:
    
        if (r11 == r14) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0245, code lost:
    
        if (r11 == r15) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0247, code lost:
    
        r16 = (int[]) r0.V57tEvNfxZVVcOCAOih5PKr;
        r17 = (float[]) r0.ZfQNn8hdWlEQ5cR94249PDsLR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0255, code lost:
    
        if (r10 == r14) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0257, code lost:
    
        if (r10 == r15) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0259, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0266, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0269, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x026c, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0270, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.V57tEvNfxZVVcOCAOih5PKr, (float[]) r0.ZfQNn8hdWlEQ5cR94249PDsLR);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0282, code lost:
    
        if (r25 <= 0.0f) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0284, code lost:
    
        r20 = (int[]) r0.V57tEvNfxZVVcOCAOih5PKr;
        r21 = (float[]) r0.ZfQNn8hdWlEQ5cR94249PDsLR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0293, code lost:
    
        if (r10 == 1) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0296, code lost:
    
        if (r10 == 2) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0298, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02a3, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02a6, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02a9, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02b5, code lost:
    
        return new com.vdodsodjsdt.EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb(r11, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02bd, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01da, code lost:
    
        if (r13.size() <= 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
    
        r0 = new com.vdodsodjsdt.o6OxmOsCD9HJ6LF8UTncnTX9Cf21();
        r1 = r13.size();
        r0.V57tEvNfxZVVcOCAOih5PKr = new int[r1];
        r0.ZfQNn8hdWlEQ5cR94249PDsLR = new float[r1];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ee, code lost:
    
        if (r2 >= r1) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f0, code lost:
    
        ((int[]) r0.V57tEvNfxZVVcOCAOih5PKr)[r2] = ((java.lang.Integer) r13.get(r2)).intValue();
        ((float[]) r0.ZfQNn8hdWlEQ5cR94249PDsLR)[r2] = ((java.lang.Float) r7.get(r2)).floatValue();
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0213, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0214, code lost:
    
        if (r0 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0216, code lost:
    
        r14 = 1;
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0219, code lost:
    
        if (r20 == false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.vdodsodjsdt.EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb zzpBGItXfub0yWj(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        /*
            Method dump skipped, instruction units count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.zzpBGItXfub0yWj(android.content.res.Resources, int, android.content.res.Resources$Theme):com.vdodsodjsdt.EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0083 A[EDGE_INSN: B:106:0x0083->B:37:0x0083 BREAK  A[LOOP:3: B:12:0x0022->B:109:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void GI83zq0G8e7zkn(com.vdodsodjsdt.Um0z2cMcEZpu6blUyqa58pl r13, int r14, int r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.GI83zq0G8e7zkn(com.vdodsodjsdt.Um0z2cMcEZpu6blUyqa58pl, int, int):void");
    }

    public void LaeGQIruHQu81hfJldjMOQSVblH3x(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.V57tEvNfxZVVcOCAOih5PKr;
        Context context = imageView.getContext();
        int[] iArr = AuEvIFo0QoYm1PHNG.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7 = NrjuzzioPqfttNRptBDpZDzSYUrcM.qNPQb1obP7(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.V57tEvNfxZVVcOCAOih5PKr;
        xb0r6yEzq0tw9m7nTWG5BFR8.KUYypEB4eNWOZWVDpH(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.V57tEvNfxZVVcOCAOih5PKr, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                VGwRvGhOWf9duTP8Dxb9PtsLAe1z.VxUQ9tBhpHJ2AAEDNW8sghc4m(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(VGwRvGhOWf9duTP8Dxb9PtsLAe1z.zzpBGItXfub0yWj(typedArray.getInt(3, -1), null));
            }
            nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.aXO0LSrt8bKV();
        } catch (Throwable th) {
            nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.aXO0LSrt8bKV();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void NSjgqmGjEzuugn2SsG1mZFP(com.vdodsodjsdt.Um0z2cMcEZpu6blUyqa58pl r9) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.NSjgqmGjEzuugn2SsG1mZFP(com.vdodsodjsdt.Um0z2cMcEZpu6blUyqa58pl):void");
    }

    public void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        nK7IfeTXa4 nk7ifetxa4;
        ImageView imageView = (ImageView) this.V57tEvNfxZVVcOCAOih5PKr;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            VGwRvGhOWf9duTP8Dxb9PtsLAe1z.VxUQ9tBhpHJ2AAEDNW8sghc4m(drawable);
        }
        if (drawable == null || (nk7ifetxa4 = (nK7IfeTXa4) this.ZfQNn8hdWlEQ5cR94249PDsLR) == null) {
            return;
        }
        aMdFkGJAdbLdAI00ZfKC7DaJw3k2.LaeGQIruHQu81hfJldjMOQSVblH3x(drawable, nk7ifetxa4, imageView.getDrawableState());
    }

    public void ZLZeBXTMq0zDztBxtRTuCHrapQ(Um0z2cMcEZpu6blUyqa58pl um0z2cMcEZpu6blUyqa58pl) throws IOException {
        S28Az6EscEakl8kzvM s28Az6EscEakl8kzvM = (S28Az6EscEakl8kzvM) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        Cursor cursorAXO0LSrt8bKV = um0z2cMcEZpu6blUyqa58pl.aXO0LSrt8bKV("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cursorAXO0LSrt8bKV.moveToFirst()) {
                if (cursorAXO0LSrt8bKV.getInt(0) == 0) {
                    z = true;
                }
            }
            cursorAXO0LSrt8bKV.close();
            S28Az6EscEakl8kzvM.VxUQ9tBhpHJ2AAEDNW8sghc4m(um0z2cMcEZpu6blUyqa58pl);
            if (!z) {
                xEETVD81ziRcL5BcSKUT7ajvxHmaB xeetvd81zircl5bcskut7ajvxhmabZzpBGItXfub0yWj = S28Az6EscEakl8kzvM.zzpBGItXfub0yWj(um0z2cMcEZpu6blUyqa58pl);
                if (!xeetvd81zircl5bcskut7ajvxhmabZzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) xeetvd81zircl5bcskut7ajvxhmabZzpBGItXfub0yWj.zzpBGItXfub0yWj));
                }
            }
            um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
            List list = s28Az6EscEakl8kzvM.VxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Ofbi2hz5bZSXx) it.next()).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                sGipz63rTUmSj3uFDvOtzihao.p59rPv72J9(cursorAXO0LSrt8bKV, th);
                throw th2;
            }
        }
    }

    public boolean ZfQNn8hdWlEQ5cR94249PDsLR() {
        ColorStateList colorStateList;
        return ((Shader) this.V57tEvNfxZVVcOCAOih5PKr) == null && (colorStateList = (ColorStateList) this.ZfQNn8hdWlEQ5cR94249PDsLR) != null && colorStateList.isStateful();
    }

    public String toString() {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                StringBuilder sb = new StringBuilder();
                if (((ZQ5iEBLmvObelGeRgKLPRxHbZEk) this.V57tEvNfxZVVcOCAOih5PKr) == ZQ5iEBLmvObelGeRgKLPRxHbZEk.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.zzpBGItXfub0yWj);
                sb.append(' ');
                sb.append((String) this.ZfQNn8hdWlEQ5cR94249PDsLR);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb(GqVneYMXyuJ8mHvjvRdtat gqVneYMXyuJ8mHvjvRdtat, S28Az6EscEakl8kzvM s28Az6EscEakl8kzvM) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 2;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 2;
        this.zzpBGItXfub0yWj = 23;
        this.V57tEvNfxZVVcOCAOih5PKr = gqVneYMXyuJ8mHvjvRdtat;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = s28Az6EscEakl8kzvM;
    }

    public EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb(ImageView imageView) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
        this.zzpBGItXfub0yWj = 0;
        this.V57tEvNfxZVVcOCAOih5PKr = imageView;
    }

    public EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb(Shader shader, ColorStateList colorStateList, int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 1;
        this.V57tEvNfxZVVcOCAOih5PKr = shader;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = colorStateList;
        this.zzpBGItXfub0yWj = i;
    }

    public void zIvmSL0wzmmKGc3X39b2Gw2mUGE(Um0z2cMcEZpu6blUyqa58pl um0z2cMcEZpu6blUyqa58pl) {
    }
}
