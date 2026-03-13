package com.vdodsodjsdt;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ylxoNpJFhOMaxIrmmRe8ax1obKNtn extends DROYxU4kEz5Lr68JnICMD4KLVhG implements DialogInterface, oMWxlXM7wVUhp72H4IDfzeCn7FdZ {
    public final Gt8fhhaURUjWttrW0OXlZUFzhhQB NSjgqmGjEzuugn2SsG1mZFP;
    public final zuW9OMQ1HP7ARieXk ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public BbqUXujjobWQwx4SY zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    /* JADX WARN: Type inference failed for: r2v2, types: [com.vdodsodjsdt.zuW9OMQ1HP7ARieXk] */
    public ylxoNpJFhOMaxIrmmRe8ax1obKNtn(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iZLZeBXTMq0zDztBxtRTuCHrapQ = ZLZeBXTMq0zDztBxtRTuCHrapQ(contextThemeWrapper, i);
        if (iZLZeBXTMq0zDztBxtRTuCHrapQ == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iZLZeBXTMq0zDztBxtRTuCHrapQ;
        }
        super(contextThemeWrapper, i2);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new aXYnt93gqDsRGaAelKXtu81xI1QR() { // from class: com.vdodsodjsdt.zuW9OMQ1HP7ARieXk
            @Override // com.vdodsodjsdt.aXYnt93gqDsRGaAelKXtu81xI1QR
            public final boolean zzpBGItXfub0yWj(KeyEvent keyEvent) {
                return this.V57tEvNfxZVVcOCAOih5PKr.GI83zq0G8e7zkn(keyEvent);
            }
        };
        HqgfdHRFzXYO3mSc hqgfdHRFzXYO3mScZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR();
        if (iZLZeBXTMq0zDztBxtRTuCHrapQ == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iZLZeBXTMq0zDztBxtRTuCHrapQ = typedValue2.resourceId;
        }
        ((BbqUXujjobWQwx4SY) hqgfdHRFzXYO3mScZfQNn8hdWlEQ5cR94249PDsLR).vXWl0o6I4U59CgHs9 = iZLZeBXTMq0zDztBxtRTuCHrapQ;
        hqgfdHRFzXYO3mScZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr();
        this.NSjgqmGjEzuugn2SsG1mZFP = new Gt8fhhaURUjWttrW0OXlZUFzhhQB(getContext(), this, getWindow());
    }

    public static int ZLZeBXTMq0zDztBxtRTuCHrapQ(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final boolean GI83zq0G8e7zkn(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void NSjgqmGjEzuugn2SsG1mZFP(CharSequence charSequence) {
        super.setTitle(charSequence);
        ZfQNn8hdWlEQ5cR94249PDsLR().KUYypEB4eNWOZWVDpH(charSequence);
    }

    public final HqgfdHRFzXYO3mSc ZfQNn8hdWlEQ5cR94249PDsLR() {
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE == null) {
            ki0ZWFpNS2MqGdb ki0zwfpns2mqgdb = HqgfdHRFzXYO3mSc.V57tEvNfxZVVcOCAOih5PKr;
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new BbqUXujjobWQwx4SY(getContext(), getWindow(), this, this);
        }
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    @Override // com.vdodsodjsdt.DROYxU4kEz5Lr68JnICMD4KLVhG, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        V57tEvNfxZVVcOCAOih5PKr();
        BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY = (BbqUXujjobWQwx4SY) ZfQNn8hdWlEQ5cR94249PDsLR();
        bbqUXujjobWQwx4SY.TaDO7ogis3aEiWEtq();
        ((ViewGroup) bbqUXujjobWQwx4SY.aXO0LSrt8bKV.findViewById(android.R.id.content)).addView(view, layoutParams);
        bbqUXujjobWQwx4SY.Ca81ebIan1u.VxUQ9tBhpHJ2AAEDNW8sghc4m(bbqUXujjobWQwx4SY.p59rPv72J9.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        ZfQNn8hdWlEQ5cR94249PDsLR().ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return zonOxHotd3BwAPJcwqr6I6uQNngg4.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(this.ZLZeBXTMq0zDztBxtRTuCHrapQ, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY = (BbqUXujjobWQwx4SY) ZfQNn8hdWlEQ5cR94249PDsLR();
        bbqUXujjobWQwx4SY.TaDO7ogis3aEiWEtq();
        return bbqUXujjobWQwx4SY.p59rPv72J9.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY = (BbqUXujjobWQwx4SY) ZfQNn8hdWlEQ5cR94249PDsLR();
        if (bbqUXujjobWQwx4SY.pYmKDYlAmhudp != null) {
            bbqUXujjobWQwx4SY.RhfGHxtXxy0M0grmp2jkRjQg();
            bbqUXujjobWQwx4SY.pYmKDYlAmhudp.getClass();
            bbqUXujjobWQwx4SY.qNPQb1obP7(0);
        }
    }

    @Override // com.vdodsodjsdt.DROYxU4kEz5Lr68JnICMD4KLVhG, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        zIvmSL0wzmmKGc3X39b2Gw2mUGE(bundle);
        Gt8fhhaURUjWttrW0OXlZUFzhhQB gt8fhhaURUjWttrW0OXlZUFzhhQB = this.NSjgqmGjEzuugn2SsG1mZFP;
        gt8fhhaURUjWttrW0OXlZUFzhhQB.zzpBGItXfub0yWj.setContentView(gt8fhhaURUjWttrW0OXlZUFzhhQB.pYmKDYlAmhudp);
        Context context = gt8fhhaURUjWttrW0OXlZUFzhhQB.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Window window = gt8fhhaURUjWttrW0OXlZUFzhhQB.V57tEvNfxZVVcOCAOih5PKr;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupVxUQ9tBhpHJ2AAEDNW8sghc4m = Gt8fhhaURUjWttrW0OXlZUFzhhQB.VxUQ9tBhpHJ2AAEDNW8sghc4m(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupVxUQ9tBhpHJ2AAEDNW8sghc4m2 = Gt8fhhaURUjWttrW0OXlZUFzhhQB.VxUQ9tBhpHJ2AAEDNW8sghc4m(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupVxUQ9tBhpHJ2AAEDNW8sghc4m3 = Gt8fhhaURUjWttrW0OXlZUFzhhQB.VxUQ9tBhpHJ2AAEDNW8sghc4m(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        gt8fhhaURUjWttrW0OXlZUFzhhQB.GI83zq0G8e7zkn = nestedScrollView;
        nestedScrollView.setFocusable(false);
        gt8fhhaURUjWttrW0OXlZUFzhhQB.GI83zq0G8e7zkn.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupVxUQ9tBhpHJ2AAEDNW8sghc4m2.findViewById(android.R.id.message);
        gt8fhhaURUjWttrW0OXlZUFzhhQB.q1wNbhk2O6 = textView;
        if (textView != null) {
            textView.setVisibility(8);
            gt8fhhaURUjWttrW0OXlZUFzhhQB.GI83zq0G8e7zkn.removeView(gt8fhhaURUjWttrW0OXlZUFzhhQB.q1wNbhk2O6);
            if (gt8fhhaURUjWttrW0OXlZUFzhhQB.LaeGQIruHQu81hfJldjMOQSVblH3x != null) {
                ViewGroup viewGroup2 = (ViewGroup) gt8fhhaURUjWttrW0OXlZUFzhhQB.GI83zq0G8e7zkn.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(gt8fhhaURUjWttrW0OXlZUFzhhQB.GI83zq0G8e7zkn);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(gt8fhhaURUjWttrW0OXlZUFzhhQB.LaeGQIruHQu81hfJldjMOQSVblH3x, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupVxUQ9tBhpHJ2AAEDNW8sghc4m2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupVxUQ9tBhpHJ2AAEDNW8sghc4m3.findViewById(android.R.id.button1);
        gt8fhhaURUjWttrW0OXlZUFzhhQB.zIvmSL0wzmmKGc3X39b2Gw2mUGE = button;
        wGfZDRl3Th9 wgfzdrl3th9 = gt8fhhaURUjWttrW0OXlZUFzhhQB.Irh5auREsoeV1C1RaBamlmy;
        button.setOnClickListener(wgfzdrl3th9);
        if (TextUtils.isEmpty(null)) {
            gt8fhhaURUjWttrW0OXlZUFzhhQB.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setVisibility(8);
            i = 0;
        } else {
            gt8fhhaURUjWttrW0OXlZUFzhhQB.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setText((CharSequence) null);
            gt8fhhaURUjWttrW0OXlZUFzhhQB.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupVxUQ9tBhpHJ2AAEDNW8sghc4m3.findViewById(android.R.id.button2);
        gt8fhhaURUjWttrW0OXlZUFzhhQB.ZLZeBXTMq0zDztBxtRTuCHrapQ = button2;
        button2.setOnClickListener(wgfzdrl3th9);
        if (TextUtils.isEmpty(null)) {
            gt8fhhaURUjWttrW0OXlZUFzhhQB.ZLZeBXTMq0zDztBxtRTuCHrapQ.setVisibility(8);
        } else {
            gt8fhhaURUjWttrW0OXlZUFzhhQB.ZLZeBXTMq0zDztBxtRTuCHrapQ.setText((CharSequence) null);
            gt8fhhaURUjWttrW0OXlZUFzhhQB.ZLZeBXTMq0zDztBxtRTuCHrapQ.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupVxUQ9tBhpHJ2AAEDNW8sghc4m3.findViewById(android.R.id.button3);
        gt8fhhaURUjWttrW0OXlZUFzhhQB.NSjgqmGjEzuugn2SsG1mZFP = button3;
        button3.setOnClickListener(wgfzdrl3th9);
        if (TextUtils.isEmpty(null)) {
            gt8fhhaURUjWttrW0OXlZUFzhhQB.NSjgqmGjEzuugn2SsG1mZFP.setVisibility(8);
        } else {
            gt8fhhaURUjWttrW0OXlZUFzhhQB.NSjgqmGjEzuugn2SsG1mZFP.setText((CharSequence) null);
            gt8fhhaURUjWttrW0OXlZUFzhhQB.NSjgqmGjEzuugn2SsG1mZFP.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = gt8fhhaURUjWttrW0OXlZUFzhhQB.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = gt8fhhaURUjWttrW0OXlZUFzhhQB.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = gt8fhhaURUjWttrW0OXlZUFzhhQB.NSjgqmGjEzuugn2SsG1mZFP;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupVxUQ9tBhpHJ2AAEDNW8sghc4m3.setVisibility(8);
        }
        if (gt8fhhaURUjWttrW0OXlZUFzhhQB.p59rPv72J9 != null) {
            viewGroupVxUQ9tBhpHJ2AAEDNW8sghc4m.addView(gt8fhhaURUjWttrW0OXlZUFzhhQB.p59rPv72J9, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            gt8fhhaURUjWttrW0OXlZUFzhhQB.HzCpKshMOoaw76hFcbOVRYMeRd = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(gt8fhhaURUjWttrW0OXlZUFzhhQB.ZfQNn8hdWlEQ5cR94249PDsLR) || !gt8fhhaURUjWttrW0OXlZUFzhhQB.vBGA6pPLqSMuYGvprl270j7) {
                window.findViewById(R.id.title_template).setVisibility(8);
                gt8fhhaURUjWttrW0OXlZUFzhhQB.HzCpKshMOoaw76hFcbOVRYMeRd.setVisibility(8);
                viewGroupVxUQ9tBhpHJ2AAEDNW8sghc4m.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                gt8fhhaURUjWttrW0OXlZUFzhhQB.KUYypEB4eNWOZWVDpH = textView2;
                textView2.setText(gt8fhhaURUjWttrW0OXlZUFzhhQB.ZfQNn8hdWlEQ5cR94249PDsLR);
                Drawable drawable = gt8fhhaURUjWttrW0OXlZUFzhhQB.M9e7PWhFYLD2lOGMker;
                if (drawable != null) {
                    gt8fhhaURUjWttrW0OXlZUFzhhQB.HzCpKshMOoaw76hFcbOVRYMeRd.setImageDrawable(drawable);
                } else {
                    gt8fhhaURUjWttrW0OXlZUFzhhQB.KUYypEB4eNWOZWVDpH.setPadding(gt8fhhaURUjWttrW0OXlZUFzhhQB.HzCpKshMOoaw76hFcbOVRYMeRd.getPaddingLeft(), gt8fhhaURUjWttrW0OXlZUFzhhQB.HzCpKshMOoaw76hFcbOVRYMeRd.getPaddingTop(), gt8fhhaURUjWttrW0OXlZUFzhhQB.HzCpKshMOoaw76hFcbOVRYMeRd.getPaddingRight(), gt8fhhaURUjWttrW0OXlZUFzhhQB.HzCpKshMOoaw76hFcbOVRYMeRd.getPaddingBottom());
                    gt8fhhaURUjWttrW0OXlZUFzhhQB.HzCpKshMOoaw76hFcbOVRYMeRd.setVisibility(8);
                }
            }
        }
        boolean z = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupVxUQ9tBhpHJ2AAEDNW8sghc4m == null || viewGroupVxUQ9tBhpHJ2AAEDNW8sghc4m.getVisibility() == 8) ? 0 : 1;
        boolean z2 = viewGroupVxUQ9tBhpHJ2AAEDNW8sghc4m3.getVisibility() != 8;
        if (!z2 && (viewFindViewById = viewGroupVxUQ9tBhpHJ2AAEDNW8sghc4m2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = gt8fhhaURUjWttrW0OXlZUFzhhQB.GI83zq0G8e7zkn;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = gt8fhhaURUjWttrW0OXlZUFzhhQB.LaeGQIruHQu81hfJldjMOQSVblH3x != null ? viewGroupVxUQ9tBhpHJ2AAEDNW8sghc4m.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupVxUQ9tBhpHJ2AAEDNW8sghc4m2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = gt8fhhaURUjWttrW0OXlZUFzhhQB.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (alertController$RecycleListView != null && (!z2 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.V57tEvNfxZVVcOCAOih5PKr, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.ZfQNn8hdWlEQ5cR94249PDsLR);
        }
        if (!z) {
            View view = gt8fhhaURUjWttrW0OXlZUFzhhQB.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (view == null) {
                view = gt8fhhaURUjWttrW0OXlZUFzhhQB.GI83zq0G8e7zkn;
            }
            if (view != null) {
                int i3 = z2 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                rNOK825VfWyyIg17blujknX8.zzpBGItXfub0yWj(view, i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupVxUQ9tBhpHJ2AAEDNW8sghc4m2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupVxUQ9tBhpHJ2AAEDNW8sghc4m2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = gt8fhhaURUjWttrW0OXlZUFzhhQB.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (alertController$RecycleListView2 == null || (listAdapter = gt8fhhaURUjWttrW0OXlZUFzhhQB.Ca81ebIan1u) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = gt8fhhaURUjWttrW0OXlZUFzhhQB.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.NSjgqmGjEzuugn2SsG1mZFP.GI83zq0G8e7zkn;
        if (nestedScrollView == null || !nestedScrollView.GI83zq0G8e7zkn(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.NSjgqmGjEzuugn2SsG1mZFP.GI83zq0G8e7zkn;
        if (nestedScrollView == null || !nestedScrollView.GI83zq0G8e7zkn(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // com.vdodsodjsdt.DROYxU4kEz5Lr68JnICMD4KLVhG, android.app.Dialog
    public final void onStop() {
        super.onStop();
        BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY = (BbqUXujjobWQwx4SY) ZfQNn8hdWlEQ5cR94249PDsLR();
        bbqUXujjobWQwx4SY.RhfGHxtXxy0M0grmp2jkRjQg();
        L6YGERc84Mt1k8Qot l6YGERc84Mt1k8Qot = bbqUXujjobWQwx4SY.pYmKDYlAmhudp;
        if (l6YGERc84Mt1k8Qot != null) {
            l6YGERc84Mt1k8Qot.vE4yDIjexsP2lGjLaTcB = false;
            gXZrMY3vlni2 gxzrmy3vlni2 = l6YGERc84Mt1k8Qot.aXO0LSrt8bKV;
            if (gxzrmy3vlni2 != null) {
                gxzrmy3vlni2.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            }
        }
    }

    @Override // com.vdodsodjsdt.DROYxU4kEz5Lr68JnICMD4KLVhG, android.app.Dialog
    public final void setContentView(int i) {
        V57tEvNfxZVVcOCAOih5PKr();
        ZfQNn8hdWlEQ5cR94249PDsLR().ZLZeBXTMq0zDztBxtRTuCHrapQ(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        ZfQNn8hdWlEQ5cR94249PDsLR().KUYypEB4eNWOZWVDpH(getContext().getString(i));
    }

    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(Bundle bundle) {
        ZfQNn8hdWlEQ5cR94249PDsLR().VxUQ9tBhpHJ2AAEDNW8sghc4m();
        super.onCreate(bundle);
        ZfQNn8hdWlEQ5cR94249PDsLR().V57tEvNfxZVVcOCAOih5PKr();
    }

    @Override // com.vdodsodjsdt.DROYxU4kEz5Lr68JnICMD4KLVhG, android.app.Dialog
    public final void setContentView(View view) {
        V57tEvNfxZVVcOCAOih5PKr();
        ZfQNn8hdWlEQ5cR94249PDsLR().M9e7PWhFYLD2lOGMker(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        NSjgqmGjEzuugn2SsG1mZFP(charSequence);
        Gt8fhhaURUjWttrW0OXlZUFzhhQB gt8fhhaURUjWttrW0OXlZUFzhhQB = this.NSjgqmGjEzuugn2SsG1mZFP;
        gt8fhhaURUjWttrW0OXlZUFzhhQB.ZfQNn8hdWlEQ5cR94249PDsLR = charSequence;
        TextView textView = gt8fhhaURUjWttrW0OXlZUFzhhQB.KUYypEB4eNWOZWVDpH;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // com.vdodsodjsdt.DROYxU4kEz5Lr68JnICMD4KLVhG, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        V57tEvNfxZVVcOCAOih5PKr();
        ZfQNn8hdWlEQ5cR94249PDsLR().HzCpKshMOoaw76hFcbOVRYMeRd(view, layoutParams);
    }
}
