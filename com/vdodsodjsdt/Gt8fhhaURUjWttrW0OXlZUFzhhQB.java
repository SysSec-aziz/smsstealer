package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Gt8fhhaURUjWttrW0OXlZUFzhhQB {
    public ListAdapter Ca81ebIan1u;
    public NestedScrollView GI83zq0G8e7zkn;
    public ImageView HzCpKshMOoaw76hFcbOVRYMeRd;
    public TextView KUYypEB4eNWOZWVDpH;
    public AlertController$RecycleListView LaeGQIruHQu81hfJldjMOQSVblH3x;
    public Drawable M9e7PWhFYLD2lOGMker;
    public Button NSjgqmGjEzuugn2SsG1mZFP;
    public final yYf0flxEelWlUk5ldlDA TaDO7ogis3aEiWEtq;
    public final Window V57tEvNfxZVVcOCAOih5PKr;
    public final Context VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public Button ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public CharSequence ZfQNn8hdWlEQ5cR94249PDsLR;
    public final int f6ZQsR6bPLvvCDNXOUc;
    public final int jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public final int ko09zE6UAgwkV;
    public View p59rPv72J9;
    public final int pYmKDYlAmhudp;
    public TextView q1wNbhk2O6;
    public final boolean vBGA6pPLqSMuYGvprl270j7;
    public Button zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final ylxoNpJFhOMaxIrmmRe8ax1obKNtn zzpBGItXfub0yWj;
    public int h3jnZRsdwYJfY9UhQCkbvWciwvFHv = -1;
    public final wGfZDRl3Th9 Irh5auREsoeV1C1RaBamlmy = new wGfZDRl3Th9(1, this);

    public Gt8fhhaURUjWttrW0OXlZUFzhhQB(Context context, ylxoNpJFhOMaxIrmmRe8ax1obKNtn ylxonpjfhomaxirmmre8ax1obkntn, Window window) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = context;
        this.zzpBGItXfub0yWj = ylxonpjfhomaxirmmre8ax1obkntn;
        this.V57tEvNfxZVVcOCAOih5PKr = window;
        yYf0flxEelWlUk5ldlDA yyf0flxeelwluk5ldlda = new yYf0flxEelWlUk5ldlDA();
        yyf0flxeelwluk5ldlda.VxUQ9tBhpHJ2AAEDNW8sghc4m = new WeakReference(ylxonpjfhomaxirmmre8ax1obkntn);
        this.TaDO7ogis3aEiWEtq = yyf0flxeelwluk5ldlda;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AuEvIFo0QoYm1PHNG.LaeGQIruHQu81hfJldjMOQSVblH3x, R.attr.alertDialogStyle, 0);
        this.pYmKDYlAmhudp = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.ko09zE6UAgwkV = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f6ZQsR6bPLvvCDNXOUc = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.vBGA6pPLqSMuYGvprl270j7 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ylxonpjfhomaxirmmre8ax1obkntn.ZfQNn8hdWlEQ5cR94249PDsLR().zIvmSL0wzmmKGc3X39b2Gw2mUGE(1);
    }

    public static ViewGroup VxUQ9tBhpHJ2AAEDNW8sghc4m(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
