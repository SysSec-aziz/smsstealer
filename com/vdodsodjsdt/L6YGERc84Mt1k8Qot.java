package com.vdodsodjsdt;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class L6YGERc84Mt1k8Qot extends ej6unYlOWMDF implements zpFfthyKuYf7mRmHTpn2uBU6EqB {
    public ActionBarContainer Ca81ebIan1u;
    public final k6SrJsMjNVVXoHmfn HVEwbdULInpTNa0IG;
    public boolean Irh5auREsoeV1C1RaBamlmy;
    public Context KUYypEB4eNWOZWVDpH;
    public boolean O1xDAlBZZlZdoEf747lCFHld;
    public boolean RhfGHxtXxy0M0grmp2jkRjQg;
    public boolean SuB3hEmTmbbRGAhtvOOmfKEon;
    public dXZw8zZnRXsRIYJEIdZC TaDO7ogis3aEiWEtq;
    public gXZrMY3vlni2 aXO0LSrt8bKV;
    public o5aslAe0MSDYR693jbn f6ZQsR6bPLvvCDNXOUc;
    public hMSqZXAdAtwr9Ih2G h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public boolean jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public final View ko09zE6UAgwkV;
    public ActionBarOverlayLayout p59rPv72J9;
    public ActionBarContextView pYmKDYlAmhudp;
    public boolean pzqP2AqKW6J5PO8zCKnW;
    public final ArrayList q11o1hieEkZDhF1MGOZI26oZiDT;
    public Context q1wNbhk2O6;
    public boolean qNPQb1obP7;
    public final qF22Y620JkFyombtDYw0h0h8Rxpja qygqjTppWwx992;
    public o5aslAe0MSDYR693jbn vBGA6pPLqSMuYGvprl270j7;
    public boolean vE4yDIjexsP2lGjLaTcB;
    public int w0Wu95l8dVNw5rZMRu;
    public final k6SrJsMjNVVXoHmfn y1NaPKTl7R18DOr6e8i5;
    public static final AccelerateInterpolator iKANjmyTSxO6v6UuLPdu7DxOjlS = new AccelerateInterpolator();
    public static final DecelerateInterpolator TqcnImqkSWIKht = new DecelerateInterpolator();

    public L6YGERc84Mt1k8Qot(Activity activity, boolean z) {
        new ArrayList();
        this.q11o1hieEkZDhF1MGOZI26oZiDT = new ArrayList();
        this.w0Wu95l8dVNw5rZMRu = 0;
        this.RhfGHxtXxy0M0grmp2jkRjQg = true;
        this.pzqP2AqKW6J5PO8zCKnW = true;
        this.HVEwbdULInpTNa0IG = new k6SrJsMjNVVXoHmfn(this, 0);
        this.y1NaPKTl7R18DOr6e8i5 = new k6SrJsMjNVVXoHmfn(this, 1);
        this.qygqjTppWwx992 = new qF22Y620JkFyombtDYw0h0h8Rxpja(this);
        View decorView = activity.getWindow().getDecorView();
        ubNpdCC1pl7L(decorView);
        if (z) {
            return;
        }
        this.ko09zE6UAgwkV = decorView.findViewById(android.R.id.content);
    }

    public final void ByTQIhgl7ezGvHXEd(boolean z) {
        boolean z2 = this.qNPQb1obP7;
        boolean z3 = this.SuB3hEmTmbbRGAhtvOOmfKEon;
        qF22Y620JkFyombtDYw0h0h8Rxpja qf22y620jkfyombtdyw0h0h8rxpja = this.qygqjTppWwx992;
        View view = this.ko09zE6UAgwkV;
        if (!z3 && z2) {
            if (this.pzqP2AqKW6J5PO8zCKnW) {
                this.pzqP2AqKW6J5PO8zCKnW = false;
                gXZrMY3vlni2 gxzrmy3vlni2 = this.aXO0LSrt8bKV;
                if (gxzrmy3vlni2 != null) {
                    gxzrmy3vlni2.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                }
                int i = this.w0Wu95l8dVNw5rZMRu;
                k6SrJsMjNVVXoHmfn k6srjsmjnvvxohmfn = this.HVEwbdULInpTNa0IG;
                if (i != 0 || (!this.vE4yDIjexsP2lGjLaTcB && !z)) {
                    k6srjsmjnvvxohmfn.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                    return;
                }
                this.Ca81ebIan1u.setAlpha(1.0f);
                this.Ca81ebIan1u.setTransitioning(true);
                gXZrMY3vlni2 gxzrmy3vlni22 = new gXZrMY3vlni2();
                float f = -this.Ca81ebIan1u.getHeight();
                if (z) {
                    this.Ca81ebIan1u.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                d9uIUa0qhR0HmxFMet d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.Ca81ebIan1u);
                d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x(f);
                View view2 = (View) d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(qf22y620jkfyombtdyw0h0h8rxpja != null ? new evze9VEkYMa2p1GH(qf22y620jkfyombtdyw0h0h8rxpja, view2) : null);
                }
                boolean z4 = gxzrmy3vlni22.LaeGQIruHQu81hfJldjMOQSVblH3x;
                ArrayList arrayList = gxzrmy3vlni22.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                if (!z4) {
                    arrayList.add(d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m);
                }
                if (this.RhfGHxtXxy0M0grmp2jkRjQg && view != null) {
                    d9uIUa0qhR0HmxFMet d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m2 = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m(view);
                    d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m2.LaeGQIruHQu81hfJldjMOQSVblH3x(f);
                    if (!gxzrmy3vlni22.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                        arrayList.add(d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m2);
                    }
                }
                boolean z5 = gxzrmy3vlni22.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (!z5) {
                    gxzrmy3vlni22.V57tEvNfxZVVcOCAOih5PKr = iKANjmyTSxO6v6UuLPdu7DxOjlS;
                }
                if (!z5) {
                    gxzrmy3vlni22.zzpBGItXfub0yWj = 250L;
                }
                if (!z5) {
                    gxzrmy3vlni22.ZfQNn8hdWlEQ5cR94249PDsLR = k6srjsmjnvvxohmfn;
                }
                this.aXO0LSrt8bKV = gxzrmy3vlni22;
                gxzrmy3vlni22.zzpBGItXfub0yWj();
                return;
            }
            return;
        }
        if (this.pzqP2AqKW6J5PO8zCKnW) {
            return;
        }
        this.pzqP2AqKW6J5PO8zCKnW = true;
        gXZrMY3vlni2 gxzrmy3vlni23 = this.aXO0LSrt8bKV;
        if (gxzrmy3vlni23 != null) {
            gxzrmy3vlni23.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        this.Ca81ebIan1u.setVisibility(0);
        int i2 = this.w0Wu95l8dVNw5rZMRu;
        k6SrJsMjNVVXoHmfn k6srjsmjnvvxohmfn2 = this.y1NaPKTl7R18DOr6e8i5;
        if (i2 == 0 && (this.vE4yDIjexsP2lGjLaTcB || z)) {
            this.Ca81ebIan1u.setTranslationY(0.0f);
            float f2 = -this.Ca81ebIan1u.getHeight();
            if (z) {
                this.Ca81ebIan1u.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.Ca81ebIan1u.setTranslationY(f2);
            gXZrMY3vlni2 gxzrmy3vlni24 = new gXZrMY3vlni2();
            d9uIUa0qhR0HmxFMet d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m3 = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.Ca81ebIan1u);
            d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m3.LaeGQIruHQu81hfJldjMOQSVblH3x(0.0f);
            View view3 = (View) d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m3.VxUQ9tBhpHJ2AAEDNW8sghc4m.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(qf22y620jkfyombtdyw0h0h8rxpja != null ? new evze9VEkYMa2p1GH(qf22y620jkfyombtdyw0h0h8rxpja, view3) : null);
            }
            boolean z6 = gxzrmy3vlni24.LaeGQIruHQu81hfJldjMOQSVblH3x;
            ArrayList arrayList2 = gxzrmy3vlni24.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (!z6) {
                arrayList2.add(d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m3);
            }
            if (this.RhfGHxtXxy0M0grmp2jkRjQg && view != null) {
                view.setTranslationY(f2);
                d9uIUa0qhR0HmxFMet d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m4 = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m(view);
                d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m4.LaeGQIruHQu81hfJldjMOQSVblH3x(0.0f);
                if (!gxzrmy3vlni24.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                    arrayList2.add(d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m4);
                }
            }
            boolean z7 = gxzrmy3vlni24.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (!z7) {
                gxzrmy3vlni24.V57tEvNfxZVVcOCAOih5PKr = TqcnImqkSWIKht;
            }
            if (!z7) {
                gxzrmy3vlni24.zzpBGItXfub0yWj = 250L;
            }
            if (!z7) {
                gxzrmy3vlni24.ZfQNn8hdWlEQ5cR94249PDsLR = k6srjsmjnvvxohmfn2;
            }
            this.aXO0LSrt8bKV = gxzrmy3vlni24;
            gxzrmy3vlni24.zzpBGItXfub0yWj();
        } else {
            this.Ca81ebIan1u.setAlpha(1.0f);
            this.Ca81ebIan1u.setTranslationY(0.0f);
            if (this.RhfGHxtXxy0M0grmp2jkRjQg && view != null) {
                view.setTranslationY(0.0f);
            }
            k6srjsmjnvvxohmfn2.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.p59rPv72J9;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            UFStPSj5DrcqcfR2RymfmG.V57tEvNfxZVVcOCAOih5PKr(actionBarOverlayLayout);
        }
    }

    public final void HAPpjhiCsV9ONY23505HCBI9IX(boolean z) {
        if (z) {
            this.Ca81ebIan1u.setTabContainer(null);
            ((oD78NtkeSuRtaWUfMs1KgLg1WoWNL) this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv).getClass();
        } else {
            ((oD78NtkeSuRtaWUfMs1KgLg1WoWNL) this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv).getClass();
            this.Ca81ebIan1u.setTabContainer(null);
        }
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.getClass();
        ((oD78NtkeSuRtaWUfMs1KgLg1WoWNL) this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv).VxUQ9tBhpHJ2AAEDNW8sghc4m.setCollapsible(false);
        this.p59rPv72J9.setHasNonEmbeddedTabs(false);
    }

    public final Context p6bBrs4p3Ly() {
        if (this.q1wNbhk2O6 == null) {
            TypedValue typedValue = new TypedValue();
            this.KUYypEB4eNWOZWVDpH.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.q1wNbhk2O6 = new ContextThemeWrapper(this.KUYypEB4eNWOZWVDpH, i);
            } else {
                this.q1wNbhk2O6 = this.KUYypEB4eNWOZWVDpH;
            }
        }
        return this.q1wNbhk2O6;
    }

    public final void rE05n5RsRkyWKIeA9cmLXAKv4Hze(boolean z) {
        d9uIUa0qhR0HmxFMet d9uiua0qhr0hmxfmetGI83zq0G8e7zkn;
        d9uIUa0qhR0HmxFMet d9uiua0qhr0hmxfmetGI83zq0G8e7zkn2;
        if (z) {
            if (!this.SuB3hEmTmbbRGAhtvOOmfKEon) {
                this.SuB3hEmTmbbRGAhtvOOmfKEon = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.p59rPv72J9;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                ByTQIhgl7ezGvHXEd(false);
            }
        } else if (this.SuB3hEmTmbbRGAhtvOOmfKEon) {
            this.SuB3hEmTmbbRGAhtvOOmfKEon = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.p59rPv72J9;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            ByTQIhgl7ezGvHXEd(false);
        }
        if (!this.Ca81ebIan1u.isLaidOut()) {
            if (z) {
                ((oD78NtkeSuRtaWUfMs1KgLg1WoWNL) this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv).VxUQ9tBhpHJ2AAEDNW8sghc4m.setVisibility(4);
                this.pYmKDYlAmhudp.setVisibility(0);
                return;
            } else {
                ((oD78NtkeSuRtaWUfMs1KgLg1WoWNL) this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv).VxUQ9tBhpHJ2AAEDNW8sghc4m.setVisibility(0);
                this.pYmKDYlAmhudp.setVisibility(8);
                return;
            }
        }
        if (z) {
            oD78NtkeSuRtaWUfMs1KgLg1WoWNL od78ntkesurtawufms1kglg1wownl = (oD78NtkeSuRtaWUfMs1KgLg1WoWNL) this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
            d9uiua0qhr0hmxfmetGI83zq0G8e7zkn = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m(od78ntkesurtawufms1kglg1wownl.VxUQ9tBhpHJ2AAEDNW8sghc4m);
            d9uiua0qhr0hmxfmetGI83zq0G8e7zkn.VxUQ9tBhpHJ2AAEDNW8sghc4m(0.0f);
            d9uiua0qhr0hmxfmetGI83zq0G8e7zkn.V57tEvNfxZVVcOCAOih5PKr(100L);
            d9uiua0qhr0hmxfmetGI83zq0G8e7zkn.ZfQNn8hdWlEQ5cR94249PDsLR(new NapHG3z2CAjypFxeHgjJECwe3(od78ntkesurtawufms1kglg1wownl, 4));
            d9uiua0qhr0hmxfmetGI83zq0G8e7zkn2 = this.pYmKDYlAmhudp.GI83zq0G8e7zkn(0, 200L);
        } else {
            oD78NtkeSuRtaWUfMs1KgLg1WoWNL od78ntkesurtawufms1kglg1wownl2 = (oD78NtkeSuRtaWUfMs1KgLg1WoWNL) this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
            d9uIUa0qhR0HmxFMet d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m(od78ntkesurtawufms1kglg1wownl2.VxUQ9tBhpHJ2AAEDNW8sghc4m);
            d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m(1.0f);
            d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr(200L);
            d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR(new NapHG3z2CAjypFxeHgjJECwe3(od78ntkesurtawufms1kglg1wownl2, 0));
            d9uiua0qhr0hmxfmetGI83zq0G8e7zkn = this.pYmKDYlAmhudp.GI83zq0G8e7zkn(8, 100L);
            d9uiua0qhr0hmxfmetGI83zq0G8e7zkn2 = d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m;
        }
        gXZrMY3vlni2 gxzrmy3vlni2 = new gXZrMY3vlni2();
        ArrayList arrayList = gxzrmy3vlni2.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        arrayList.add(d9uiua0qhr0hmxfmetGI83zq0G8e7zkn);
        View view = (View) d9uiua0qhr0hmxfmetGI83zq0G8e7zkn.VxUQ9tBhpHJ2AAEDNW8sghc4m.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) d9uiua0qhr0hmxfmetGI83zq0G8e7zkn2.VxUQ9tBhpHJ2AAEDNW8sghc4m.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(d9uiua0qhr0hmxfmetGI83zq0G8e7zkn2);
        gxzrmy3vlni2.zzpBGItXfub0yWj();
    }

    public final void ubNpdCC1pl7L(View view) {
        hMSqZXAdAtwr9Ih2G wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.p59rPv72J9 = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(R.id.action_bar);
        if (callbackFindViewById instanceof hMSqZXAdAtwr9Ih2G) {
            wrapper = (hMSqZXAdAtwr9Ih2G) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = wrapper;
        this.pYmKDYlAmhudp = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.Ca81ebIan1u = actionBarContainer;
        hMSqZXAdAtwr9Ih2G hmsqzxadatwr9ih2g = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        if (hmsqzxadatwr9ih2g == null || this.pYmKDYlAmhudp == null || actionBarContainer == null) {
            throw new IllegalStateException(L6YGERc84Mt1k8Qot.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((oD78NtkeSuRtaWUfMs1KgLg1WoWNL) hmsqzxadatwr9ih2g).VxUQ9tBhpHJ2AAEDNW8sghc4m.getContext();
        this.KUYypEB4eNWOZWVDpH = context;
        if ((((oD78NtkeSuRtaWUfMs1KgLg1WoWNL) this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv).zzpBGItXfub0yWj & 4) != 0) {
            this.jW7EiD0YL6xkbB158jMUzhWNWb1y = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.getClass();
        HAPpjhiCsV9ONY23505HCBI9IX(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.KUYypEB4eNWOZWVDpH.obtainStyledAttributes(null, AuEvIFo0QoYm1PHNG.VxUQ9tBhpHJ2AAEDNW8sghc4m, R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.p59rPv72J9;
            if (!actionBarOverlayLayout2.GI83zq0G8e7zkn) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.O1xDAlBZZlZdoEf747lCFHld = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.Ca81ebIan1u;
            WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            lJgFFp37ou.GI83zq0G8e7zkn(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void wR7sbzHKf9hYV1lxoS6nqyszepWvN(boolean z) {
        if (this.jW7EiD0YL6xkbB158jMUzhWNWb1y) {
            return;
        }
        int i = z ? 4 : 0;
        oD78NtkeSuRtaWUfMs1KgLg1WoWNL od78ntkesurtawufms1kglg1wownl = (oD78NtkeSuRtaWUfMs1KgLg1WoWNL) this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        int i2 = od78ntkesurtawufms1kglg1wownl.zzpBGItXfub0yWj;
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = true;
        od78ntkesurtawufms1kglg1wownl.VxUQ9tBhpHJ2AAEDNW8sghc4m((i & 4) | (i2 & (-5)));
    }

    public L6YGERc84Mt1k8Qot(Dialog dialog) {
        new ArrayList();
        this.q11o1hieEkZDhF1MGOZI26oZiDT = new ArrayList();
        this.w0Wu95l8dVNw5rZMRu = 0;
        this.RhfGHxtXxy0M0grmp2jkRjQg = true;
        this.pzqP2AqKW6J5PO8zCKnW = true;
        this.HVEwbdULInpTNa0IG = new k6SrJsMjNVVXoHmfn(this, 0);
        this.y1NaPKTl7R18DOr6e8i5 = new k6SrJsMjNVVXoHmfn(this, 1);
        this.qygqjTppWwx992 = new qF22Y620JkFyombtDYw0h0h8Rxpja(this);
        ubNpdCC1pl7L(dialog.getWindow().getDecorView());
    }
}
