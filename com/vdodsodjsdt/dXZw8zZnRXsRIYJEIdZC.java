package com.vdodsodjsdt;

import android.animation.Animator;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.AbsSeekBar;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class dXZw8zZnRXsRIYJEIdZC implements xI49lv6n0OP7vk, D2N8rZ8PRRcNQ9RwMeZkr {
    public static final int[] LaeGQIruHQu81hfJldjMOQSVblH3x = {android.R.attr.indeterminateDrawable, android.R.attr.progressDrawable};
    public Object V57tEvNfxZVVcOCAOih5PKr;
    public Object ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ dXZw8zZnRXsRIYJEIdZC(Object obj, Object obj2) {
        this.V57tEvNfxZVVcOCAOih5PKr = obj;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj2;
    }

    public static int V57tEvNfxZVVcOCAOih5PKr(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public ztNFMw5IuWLfuP GI83zq0G8e7zkn(AhgUxI6t6E ahgUxI6t6E) {
        ztNFMw5IuWLfuP ztnfmw5iuwlfupV57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.pYmKDYlAmhudp(ahgUxI6t6E, "id");
        synchronized (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            ztnfmw5iuwlfupV57tEvNfxZVVcOCAOih5PKr = ((N1mT85AVNMY84KnH4) this.V57tEvNfxZVVcOCAOih5PKr).V57tEvNfxZVVcOCAOih5PKr(ahgUxI6t6E);
        }
        return ztnfmw5iuwlfupV57tEvNfxZVVcOCAOih5PKr;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    @Override // com.vdodsodjsdt.D2N8rZ8PRRcNQ9RwMeZkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.vdodsodjsdt.pmJH8rqWIwRth8COqq HzCpKshMOoaw76hFcbOVRYMeRd(android.view.View r20, com.vdodsodjsdt.pmJH8rqWIwRth8COqq r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.Object r3 = r0.V57tEvNfxZVVcOCAOih5PKr
            com.vdodsodjsdt.xEETVD81ziRcL5BcSKUT7ajvxHmaB r3 = (com.vdodsodjsdt.xEETVD81ziRcL5BcSKUT7ajvxHmaB) r3
            java.lang.Object r4 = r0.ZfQNn8hdWlEQ5cR94249PDsLR
            com.vdodsodjsdt.A98HZyzY3RCp6DiHu r4 = (com.vdodsodjsdt.A98HZyzY3RCp6DiHu) r4
            int r5 = r4.VxUQ9tBhpHJ2AAEDNW8sghc4m
            int r6 = r4.zzpBGItXfub0yWj
            int r4 = r4.V57tEvNfxZVVcOCAOih5PKr
            com.vdodsodjsdt.ueiyNUHTUsoj16g9F r7 = r2.VxUQ9tBhpHJ2AAEDNW8sghc4m
            r8 = 519(0x207, float:7.27E-43)
            com.vdodsodjsdt.MCkc9XaOBWJ3kr1ZFUGL46e9N r8 = r7.zIvmSL0wzmmKGc3X39b2Gw2mUGE(r8)
            r9 = 32
            com.vdodsodjsdt.MCkc9XaOBWJ3kr1ZFUGL46e9N r7 = r7.zIvmSL0wzmmKGc3X39b2Gw2mUGE(r9)
            java.lang.Object r9 = r3.zzpBGItXfub0yWj
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r9
            int r10 = r8.zzpBGItXfub0yWj
            int r11 = r8.V57tEvNfxZVVcOCAOih5PKr
            int r12 = r8.VxUQ9tBhpHJ2AAEDNW8sghc4m
            r9.Irh5auREsoeV1C1RaBamlmy = r10
            int r10 = r1.getLayoutDirection()
            r14 = 1
            if (r10 != r14) goto L37
            r10 = r14
            goto L38
        L37:
            r10 = 0
        L38:
            int r15 = r1.getPaddingBottom()
            int r16 = r1.getPaddingLeft()
            int r17 = r1.getPaddingRight()
            boolean r13 = r9.Ca81ebIan1u
            if (r13 == 0) goto L4f
            int r15 = r2.VxUQ9tBhpHJ2AAEDNW8sghc4m()
            r9.TaDO7ogis3aEiWEtq = r15
            int r15 = r15 + r4
        L4f:
            boolean r4 = r9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv
            if (r4 == 0) goto L5a
            if (r10 == 0) goto L57
            r4 = r6
            goto L58
        L57:
            r4 = r5
        L58:
            int r16 = r4 + r12
        L5a:
            r4 = r16
            boolean r14 = r9.pYmKDYlAmhudp
            if (r14 == 0) goto L66
            if (r10 == 0) goto L63
            goto L64
        L63:
            r5 = r6
        L64:
            int r17 = r5 + r11
        L66:
            r5 = r17
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            boolean r10 = r9.jW7EiD0YL6xkbB158jMUzhWNWb1y
            if (r10 == 0) goto L7b
            int r10 = r6.leftMargin
            if (r10 == r12) goto L7b
            r6.leftMargin = r12
            r18 = 1
            goto L7d
        L7b:
            r18 = 0
        L7d:
            boolean r10 = r9.f6ZQsR6bPLvvCDNXOUc
            if (r10 == 0) goto L89
            int r10 = r6.rightMargin
            if (r10 == r11) goto L89
            r6.rightMargin = r11
            r18 = 1
        L89:
            boolean r10 = r9.vBGA6pPLqSMuYGvprl270j7
            if (r10 == 0) goto L97
            int r10 = r6.topMargin
            int r8 = r8.zzpBGItXfub0yWj
            if (r10 == r8) goto L97
            r6.topMargin = r8
            r14 = 1
            goto L99
        L97:
            r14 = r18
        L99:
            if (r14 == 0) goto L9e
            r1.setLayoutParams(r6)
        L9e:
            int r6 = r1.getPaddingTop()
            r1.setPadding(r4, r6, r5, r15)
            boolean r1 = r3.VxUQ9tBhpHJ2AAEDNW8sghc4m
            if (r1 == 0) goto Lad
            int r3 = r7.ZfQNn8hdWlEQ5cR94249PDsLR
            r9.q1wNbhk2O6 = r3
        Lad:
            if (r13 != 0) goto Lb3
            if (r1 == 0) goto Lb2
            goto Lb3
        Lb2:
            return r2
        Lb3:
            r9.qygqjTppWwx992()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.dXZw8zZnRXsRIYJEIdZC.HzCpKshMOoaw76hFcbOVRYMeRd(android.view.View, com.vdodsodjsdt.pmJH8rqWIwRth8COqq):com.vdodsodjsdt.pmJH8rqWIwRth8COqq");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable KUYypEB4eNWOZWVDpH(Drawable drawable, boolean z) {
        if (drawable instanceof pDEkAB1gLwlZIS) {
            ((Srh0VR8VDnQnLLInSDVDJ9SIYs0) ((pDEkAB1gLwlZIS) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = KUYypEB4eNWOZWVDpH(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                    layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                    layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                    layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                    layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                    layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                    layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                    layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                    layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.ZfQNn8hdWlEQ5cR94249PDsLR) == null) {
                    this.ZfQNn8hdWlEQ5cR94249PDsLR = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public void LaeGQIruHQu81hfJldjMOQSVblH3x(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.V57tEvNfxZVVcOCAOih5PKr;
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7 = NrjuzzioPqfttNRptBDpZDzSYUrcM.qNPQb1obP7(absSeekBar.getContext(), attributeSet, LaeGQIruHQu81hfJldjMOQSVblH3x, i);
        Drawable drawableKo09zE6UAgwkV = nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.ko09zE6UAgwkV(0);
        if (drawableKo09zE6UAgwkV != null) {
            if (drawableKo09zE6UAgwkV instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableKo09zE6UAgwkV;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableKUYypEB4eNWOZWVDpH = KUYypEB4eNWOZWVDpH(animationDrawable.getFrame(i2), true);
                    drawableKUYypEB4eNWOZWVDpH.setLevel(10000);
                    animationDrawable2.addFrame(drawableKUYypEB4eNWOZWVDpH, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableKo09zE6UAgwkV = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableKo09zE6UAgwkV);
        }
        Drawable drawableKo09zE6UAgwkV2 = nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.ko09zE6UAgwkV(1);
        if (drawableKo09zE6UAgwkV2 != null) {
            absSeekBar.setProgressDrawable(KUYypEB4eNWOZWVDpH(drawableKo09zE6UAgwkV2, false));
        }
        nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.aXO0LSrt8bKV();
    }

    public List M9e7PWhFYLD2lOGMker(String str) {
        List listZfQNn8hdWlEQ5cR94249PDsLR;
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "workSpecId");
        synchronized (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            listZfQNn8hdWlEQ5cR94249PDsLR = ((N1mT85AVNMY84KnH4) this.V57tEvNfxZVVcOCAOih5PKr).ZfQNn8hdWlEQ5cR94249PDsLR(str);
        }
        return listZfQNn8hdWlEQ5cR94249PDsLR;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0209, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:20:0x0062, B:97:0x0209, B:28:0x0074, B:29:0x0082, B:31:0x0087, B:38:0x0097, B:46:0x00b1, B:41:0x00a0, B:44:0x00a9, B:47:0x00bf, B:51:0x00ce, B:53:0x00d6, B:54:0x00e0, B:63:0x0109, B:64:0x0110, B:65:0x0128, B:57:0x00e9, B:59:0x00f1, B:60:0x00ff, B:66:0x0129, B:68:0x0131, B:69:0x013f, B:72:0x0149, B:73:0x0154, B:74:0x016c, B:75:0x016d, B:78:0x0177, B:79:0x0182, B:80:0x019a, B:81:0x019b, B:83:0x01a3, B:84:0x01ac, B:87:0x01b6, B:88:0x01c0, B:89:0x01d8, B:90:0x01d9, B:93:0x01e3, B:94:0x01ed, B:95:0x0205, B:96:0x0206), top: B:105:0x0062 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void NSjgqmGjEzuugn2SsG1mZFP(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.dXZw8zZnRXsRIYJEIdZC.NSjgqmGjEzuugn2SsG1mZFP(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(AhgUxI6t6E ahgUxI6t6E) {
        boolean zContainsKey;
        synchronized (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            zContainsKey = ((N1mT85AVNMY84KnH4) this.V57tEvNfxZVVcOCAOih5PKr).VxUQ9tBhpHJ2AAEDNW8sghc4m.containsKey(ahgUxI6t6E);
        }
        return zContainsKey;
    }

    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(KoccBHOLe4XJgL koccBHOLe4XJgL, Menu menu) {
        ViewGroup viewGroup = ((BbqUXujjobWQwx4SY) this.ZfQNn8hdWlEQ5cR94249PDsLR).aXO0LSrt8bKV;
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        UFStPSj5DrcqcfR2RymfmG.V57tEvNfxZVVcOCAOih5PKr(viewGroup);
        nMRZPpfLCgJyuB nmrzppflcgjyub = (nMRZPpfLCgJyuB) this.V57tEvNfxZVVcOCAOih5PKr;
        ActionMode.Callback callback = (ActionMode.Callback) nmrzppflcgjyub.V57tEvNfxZVVcOCAOih5PKr;
        SDmkUyfx1vuePbUbc0umzhpT7GiW sDmkUyfx1vuePbUbc0umzhpT7GiWGI83zq0G8e7zkn = nmrzppflcgjyub.GI83zq0G8e7zkn(koccBHOLe4XJgL);
        sSTjsLE9Ugp7iXfnwi18Akn1Jt sstjsle9ugp7ixfnwi18akn1jt = (sSTjsLE9Ugp7iXfnwi18Akn1Jt) nmrzppflcgjyub.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        Menu gg9lyspqzqteocalcdou9 = (Menu) sstjsle9ugp7ixfnwi18akn1jt.get(menu);
        if (gg9lyspqzqteocalcdou9 == null) {
            gg9lyspqzqteocalcdou9 = new gG9lYsPQZqtEocAlcDOU9((Context) nmrzppflcgjyub.ZfQNn8hdWlEQ5cR94249PDsLR, (Stuu2Qyz6BSCKFEomt5b51vUnV1HQ) menu);
            sstjsle9ugp7ixfnwi18akn1jt.put(menu, gg9lyspqzqteocalcdou9);
        }
        return callback.onPrepareActionMode(sDmkUyfx1vuePbUbc0umzhpT7GiWGI83zq0G8e7zkn, gg9lyspqzqteocalcdou9);
    }

    public void ZfQNn8hdWlEQ5cR94249PDsLR() {
        ((SparseIntArray) this.V57tEvNfxZVVcOCAOih5PKr).clear();
    }

    @Override // com.vdodsodjsdt.xI49lv6n0OP7vk
    public void onCancel() {
        ((Animator) this.V57tEvNfxZVVcOCAOih5PKr).end();
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((RD86Fssz0iKbf0t61L) this.ZfQNn8hdWlEQ5cR94249PDsLR) + " has been canceled.");
        }
    }

    public ztNFMw5IuWLfuP q1wNbhk2O6(AhgUxI6t6E ahgUxI6t6E) {
        ztNFMw5IuWLfuP ztnfmw5iuwlfupLaeGQIruHQu81hfJldjMOQSVblH3x;
        synchronized (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            ztnfmw5iuwlfupLaeGQIruHQu81hfJldjMOQSVblH3x = ((N1mT85AVNMY84KnH4) this.V57tEvNfxZVVcOCAOih5PKr).LaeGQIruHQu81hfJldjMOQSVblH3x(ahgUxI6t6E);
        }
        return ztnfmw5iuwlfupLaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    public void zIvmSL0wzmmKGc3X39b2Gw2mUGE(KoccBHOLe4XJgL koccBHOLe4XJgL) {
        nMRZPpfLCgJyuB nmrzppflcgjyub = (nMRZPpfLCgJyuB) this.V57tEvNfxZVVcOCAOih5PKr;
        ((ActionMode.Callback) nmrzppflcgjyub.V57tEvNfxZVVcOCAOih5PKr).onDestroyActionMode(nmrzppflcgjyub.GI83zq0G8e7zkn(koccBHOLe4XJgL));
        BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY = (BbqUXujjobWQwx4SY) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (bbqUXujjobWQwx4SY.w0Wu95l8dVNw5rZMRu != null) {
            bbqUXujjobWQwx4SY.p59rPv72J9.getDecorView().removeCallbacks(bbqUXujjobWQwx4SY.RhfGHxtXxy0M0grmp2jkRjQg);
        }
        if (bbqUXujjobWQwx4SY.q11o1hieEkZDhF1MGOZI26oZiDT != null) {
            d9uIUa0qhR0HmxFMet d9uiua0qhr0hmxfmet = bbqUXujjobWQwx4SY.qNPQb1obP7;
            if (d9uiua0qhr0hmxfmet != null) {
                d9uiua0qhr0hmxfmet.zzpBGItXfub0yWj();
            }
            d9uIUa0qhR0HmxFMet d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m(bbqUXujjobWQwx4SY.q11o1hieEkZDhF1MGOZI26oZiDT);
            d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m(0.0f);
            bbqUXujjobWQwx4SY.qNPQb1obP7 = d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m;
            d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR(new JUf5e0Z4Cc(2, this));
        }
        bbqUXujjobWQwx4SY.Irh5auREsoeV1C1RaBamlmy = null;
        ViewGroup viewGroup = bbqUXujjobWQwx4SY.aXO0LSrt8bKV;
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        UFStPSj5DrcqcfR2RymfmG.V57tEvNfxZVVcOCAOih5PKr(viewGroup);
        bbqUXujjobWQwx4SY.y1NaPKTl7R18DOr6e8i5();
    }

    public ArrayList zzpBGItXfub0yWj(String str) {
        xgjEDGKy9VX5 xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m = xgjEDGKy9VX5.VxUQ9tBhpHJ2AAEDNW8sghc4m("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m.f6ZQsR6bPLvvCDNXOUc(str, 1);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.V57tEvNfxZVVcOCAOih5PKr;
        workDatabase_Impl.zzpBGItXfub0yWj();
        Cursor cursorQ1wNbhk2O6 = workDatabase_Impl.q1wNbhk2O6(xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m);
        try {
            ArrayList arrayList = new ArrayList(cursorQ1wNbhk2O6.getCount());
            while (cursorQ1wNbhk2O6.moveToNext()) {
                arrayList.add(cursorQ1wNbhk2O6.getString(0));
            }
            return arrayList;
        } finally {
            cursorQ1wNbhk2O6.close();
            xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m.M9e7PWhFYLD2lOGMker();
        }
    }

    public dXZw8zZnRXsRIYJEIdZC(AbsSeekBar absSeekBar) {
        this.V57tEvNfxZVVcOCAOih5PKr = absSeekBar;
    }

    public dXZw8zZnRXsRIYJEIdZC(N1mT85AVNMY84KnH4 n1mT85AVNMY84KnH4) {
        this.V57tEvNfxZVVcOCAOih5PKr = n1mT85AVNMY84KnH4;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new Object();
    }

    public dXZw8zZnRXsRIYJEIdZC(Animation animation) {
        this.V57tEvNfxZVVcOCAOih5PKr = animation;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = null;
    }

    public dXZw8zZnRXsRIYJEIdZC() {
        this.V57tEvNfxZVVcOCAOih5PKr = new SparseIntArray();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new SparseIntArray();
    }
}
