package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class JaGiaIfgE4oZFS8GScUJb implements xzFpmFD3R5K5fyU {
    public boolean Ca81ebIan1u;
    public t5olRUJo5JPX6WXwY17n2LzUoDWuf HzCpKshMOoaw76hFcbOVRYMeRd;
    public gZVesoHrfMaGvAvfBsRIr Irh5auREsoeV1C1RaBamlmy;
    public Drawable KUYypEB4eNWOZWVDpH;
    public Stuu2Qyz6BSCKFEomt5b51vUnV1HQ LaeGQIruHQu81hfJldjMOQSVblH3x;
    public b0ZGtNoko2W8IH5Mo0D9yU M9e7PWhFYLD2lOGMker;
    public x7RNBrm11qTEy TaDO7ogis3aEiWEtq;
    public final Context V57tEvNfxZVVcOCAOih5PKr;
    public DRNSD7OTZrolKY4iK67pQWIr ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public Context ZfQNn8hdWlEQ5cR94249PDsLR;
    public int h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public boolean jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public int ko09zE6UAgwkV;
    public boolean p59rPv72J9;
    public int pYmKDYlAmhudp;
    public EDKupHDxyEiMNR8pvhG4o q11o1hieEkZDhF1MGOZI26oZiDT;
    public boolean q1wNbhk2O6;
    public x7RNBrm11qTEy vBGA6pPLqSMuYGvprl270j7;
    public final LayoutInflater zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final int NSjgqmGjEzuugn2SsG1mZFP = R.layout.abc_action_menu_layout;
    public final int GI83zq0G8e7zkn = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray f6ZQsR6bPLvvCDNXOUc = new SparseBooleanArray();
    public final Skgk8FYn8b4TvRiBOsElZw4XkNLhQ w0Wu95l8dVNw5rZMRu = new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(2, this);

    public JaGiaIfgE4oZFS8GScUJb(Context context) {
        this.V57tEvNfxZVVcOCAOih5PKr = context;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = LayoutInflater.from(context);
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final boolean GI83zq0G8e7zkn() {
        int size;
        ArrayList arrayListKUYypEB4eNWOZWVDpH;
        int i;
        boolean z;
        JaGiaIfgE4oZFS8GScUJb jaGiaIfgE4oZFS8GScUJb = this;
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = jaGiaIfgE4oZFS8GScUJb.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ != null) {
            arrayListKUYypEB4eNWOZWVDpH = stuu2Qyz6BSCKFEomt5b51vUnV1HQ.KUYypEB4eNWOZWVDpH();
            size = arrayListKUYypEB4eNWOZWVDpH.size();
        } else {
            size = 0;
            arrayListKUYypEB4eNWOZWVDpH = null;
        }
        int i2 = jaGiaIfgE4oZFS8GScUJb.ko09zE6UAgwkV;
        int i3 = jaGiaIfgE4oZFS8GScUJb.pYmKDYlAmhudp;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) jaGiaIfgE4oZFS8GScUJb.M9e7PWhFYLD2lOGMker;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            rkuo6pAmWq0N rkuo6pamwq0n = (rkuo6pAmWq0N) arrayListKUYypEB4eNWOZWVDpH.get(i4);
            int i7 = rkuo6pamwq0n.w0Wu95l8dVNw5rZMRu;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (jaGiaIfgE4oZFS8GScUJb.jW7EiD0YL6xkbB158jMUzhWNWb1y && rkuo6pamwq0n.pzqP2AqKW6J5PO8zCKnW) {
                i2 = 0;
            }
            i4++;
        }
        if (jaGiaIfgE4oZFS8GScUJb.p59rPv72J9 && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = jaGiaIfgE4oZFS8GScUJb.f6ZQsR6bPLvvCDNXOUc;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            rkuo6pAmWq0N rkuo6pamwq0n2 = (rkuo6pAmWq0N) arrayListKUYypEB4eNWOZWVDpH.get(i9);
            int i11 = rkuo6pamwq0n2.w0Wu95l8dVNw5rZMRu;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = rkuo6pamwq0n2.zzpBGItXfub0yWj;
            if (z3) {
                View viewVxUQ9tBhpHJ2AAEDNW8sghc4m = jaGiaIfgE4oZFS8GScUJb.VxUQ9tBhpHJ2AAEDNW8sghc4m(rkuo6pamwq0n2, null, viewGroup);
                viewVxUQ9tBhpHJ2AAEDNW8sghc4m.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewVxUQ9tBhpHJ2AAEDNW8sghc4m.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                rkuo6pamwq0n2.zIvmSL0wzmmKGc3X39b2Gw2mUGE(z);
            } else if ((i11 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i12);
                boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                if (z5) {
                    View viewVxUQ9tBhpHJ2AAEDNW8sghc4m2 = jaGiaIfgE4oZFS8GScUJb.VxUQ9tBhpHJ2AAEDNW8sghc4m(rkuo6pamwq0n2, null, viewGroup);
                    viewVxUQ9tBhpHJ2AAEDNW8sghc4m2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewVxUQ9tBhpHJ2AAEDNW8sghc4m2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z5 &= i3 + i10 > 0;
                }
                if (z5 && i12 != 0) {
                    sparseBooleanArray.put(i12, true);
                } else if (z4) {
                    sparseBooleanArray.put(i12, false);
                    for (int i13 = 0; i13 < i9; i13++) {
                        rkuo6pAmWq0N rkuo6pamwq0n3 = (rkuo6pAmWq0N) arrayListKUYypEB4eNWOZWVDpH.get(i13);
                        if (rkuo6pamwq0n3.zzpBGItXfub0yWj == i12) {
                            if ((rkuo6pamwq0n3.q11o1hieEkZDhF1MGOZI26oZiDT & 32) == 32) {
                                i8++;
                            }
                            rkuo6pamwq0n3.zIvmSL0wzmmKGc3X39b2Gw2mUGE(false);
                        }
                    }
                }
                if (z5) {
                    i8--;
                }
                rkuo6pamwq0n2.zIvmSL0wzmmKGc3X39b2Gw2mUGE(z5);
            } else {
                rkuo6pamwq0n2.zIvmSL0wzmmKGc3X39b2Gw2mUGE(false);
                i9++;
                i = 2;
                jaGiaIfgE4oZFS8GScUJb = this;
                z = true;
            }
            i9++;
            i = 2;
            jaGiaIfgE4oZFS8GScUJb = this;
            z = true;
        }
        return z;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final void HzCpKshMOoaw76hFcbOVRYMeRd(DRNSD7OTZrolKY4iK67pQWIr dRNSD7OTZrolKY4iK67pQWIr) {
        throw null;
    }

    public final boolean KUYypEB4eNWOZWVDpH() {
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
        if (!this.p59rPv72J9 || NSjgqmGjEzuugn2SsG1mZFP() || (stuu2Qyz6BSCKFEomt5b51vUnV1HQ = this.LaeGQIruHQu81hfJldjMOQSVblH3x) == null || this.M9e7PWhFYLD2lOGMker == null || this.Irh5auREsoeV1C1RaBamlmy != null) {
            return false;
        }
        stuu2Qyz6BSCKFEomt5b51vUnV1HQ.GI83zq0G8e7zkn();
        if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ.M9e7PWhFYLD2lOGMker.isEmpty()) {
            return false;
        }
        gZVesoHrfMaGvAvfBsRIr gzvesohrfmagvavfbsrir = new gZVesoHrfMaGvAvfBsRIr(0, this, new x7RNBrm11qTEy(this, this.ZfQNn8hdWlEQ5cR94249PDsLR, this.LaeGQIruHQu81hfJldjMOQSVblH3x, this.HzCpKshMOoaw76hFcbOVRYMeRd));
        this.Irh5auREsoeV1C1RaBamlmy = gzvesohrfmagvavfbsrir;
        ((View) this.M9e7PWhFYLD2lOGMker).post(gzvesohrfmagvavfbsrir);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.M9e7PWhFYLD2lOGMker;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ != null) {
                stuu2Qyz6BSCKFEomt5b51vUnV1HQ.GI83zq0G8e7zkn();
                ArrayList arrayListKUYypEB4eNWOZWVDpH = this.LaeGQIruHQu81hfJldjMOQSVblH3x.KUYypEB4eNWOZWVDpH();
                int size = arrayListKUYypEB4eNWOZWVDpH.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    rkuo6pAmWq0N rkuo6pamwq0n = (rkuo6pAmWq0N) arrayListKUYypEB4eNWOZWVDpH.get(i2);
                    if ((rkuo6pamwq0n.q11o1hieEkZDhF1MGOZI26oZiDT & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        rkuo6pAmWq0N itemData = childAt instanceof YybP2G5tPcuz9Zghx ? ((YybP2G5tPcuz9Zghx) childAt).getItemData() : null;
                        View viewVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m(rkuo6pamwq0n, childAt, viewGroup);
                        if (rkuo6pamwq0n != itemData) {
                            viewVxUQ9tBhpHJ2AAEDNW8sghc4m.setPressed(false);
                            viewVxUQ9tBhpHJ2AAEDNW8sghc4m.jumpDrawablesToCurrentState();
                        }
                        if (viewVxUQ9tBhpHJ2AAEDNW8sghc4m != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewVxUQ9tBhpHJ2AAEDNW8sghc4m.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewVxUQ9tBhpHJ2AAEDNW8sghc4m);
                            }
                            ((ViewGroup) this.M9e7PWhFYLD2lOGMker).addView(viewVxUQ9tBhpHJ2AAEDNW8sghc4m, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.HzCpKshMOoaw76hFcbOVRYMeRd) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.M9e7PWhFYLD2lOGMker).requestLayout();
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ2 != null) {
            stuu2Qyz6BSCKFEomt5b51vUnV1HQ2.GI83zq0G8e7zkn();
            ArrayList arrayList2 = stuu2Qyz6BSCKFEomt5b51vUnV1HQ2.GI83zq0G8e7zkn;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                J97y3vhwLiUYt j97y3vhwLiUYt = ((rkuo6pAmWq0N) arrayList2.get(i3)).qNPQb1obP7;
            }
        }
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ3 != null) {
            stuu2Qyz6BSCKFEomt5b51vUnV1HQ3.GI83zq0G8e7zkn();
            arrayList = stuu2Qyz6BSCKFEomt5b51vUnV1HQ3.M9e7PWhFYLD2lOGMker;
        }
        if (this.p59rPv72J9 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((rkuo6pAmWq0N) arrayList.get(0)).pzqP2AqKW6J5PO8zCKnW;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.HzCpKshMOoaw76hFcbOVRYMeRd == null) {
                this.HzCpKshMOoaw76hFcbOVRYMeRd = new t5olRUJo5JPX6WXwY17n2LzUoDWuf(this, this.V57tEvNfxZVVcOCAOih5PKr);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.HzCpKshMOoaw76hFcbOVRYMeRd.getParent();
            if (viewGroup3 != this.M9e7PWhFYLD2lOGMker) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.HzCpKshMOoaw76hFcbOVRYMeRd);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.M9e7PWhFYLD2lOGMker;
                t5olRUJo5JPX6WXwY17n2LzUoDWuf t5olrujo5jpx6wxwy17n2lzuodwuf = this.HzCpKshMOoaw76hFcbOVRYMeRd;
                actionMenuView.getClass();
                vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ vggktp17zbxtkwktz7oxqgj4z3xqM9e7PWhFYLD2lOGMker = ActionMenuView.M9e7PWhFYLD2lOGMker();
                vggktp17zbxtkwktz7oxqgj4z3xqM9e7PWhFYLD2lOGMker.VxUQ9tBhpHJ2AAEDNW8sghc4m = true;
                actionMenuView.addView(t5olrujo5jpx6wxwy17n2lzuodwuf, vggktp17zbxtkwktz7oxqgj4z3xqM9e7PWhFYLD2lOGMker);
            }
        } else {
            t5olRUJo5JPX6WXwY17n2LzUoDWuf t5olrujo5jpx6wxwy17n2lzuodwuf2 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
            if (t5olrujo5jpx6wxwy17n2lzuodwuf2 != null) {
                Object parent = t5olrujo5jpx6wxwy17n2lzuodwuf2.getParent();
                Object obj = this.M9e7PWhFYLD2lOGMker;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.HzCpKshMOoaw76hFcbOVRYMeRd);
                }
            }
        }
        ((ActionMenuView) this.M9e7PWhFYLD2lOGMker).setOverflowReserved(this.p59rPv72J9);
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final boolean M9e7PWhFYLD2lOGMker(rkuo6pAmWq0N rkuo6pamwq0n) {
        return false;
    }

    public final boolean NSjgqmGjEzuugn2SsG1mZFP() {
        x7RNBrm11qTEy x7rnbrm11qtey = this.vBGA6pPLqSMuYGvprl270j7;
        return x7rnbrm11qtey != null && x7rnbrm11qtey.zzpBGItXfub0yWj();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final boolean V57tEvNfxZVVcOCAOih5PKr(qzGH0ZhUGLEjFhdFH7Y qzgh0zhuglejfhdfh7y) {
        boolean z;
        if (qzgh0zhuglejfhdfh7y.hasVisibleItems()) {
            qzGH0ZhUGLEjFhdFH7Y qzgh0zhuglejfhdfh7y2 = qzgh0zhuglejfhdfh7y;
            while (true) {
                Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = qzgh0zhuglejfhdfh7y2.RhfGHxtXxy0M0grmp2jkRjQg;
                if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ == this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                    break;
                }
                qzgh0zhuglejfhdfh7y2 = (qzGH0ZhUGLEjFhdFH7Y) stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
            }
            rkuo6pAmWq0N rkuo6pamwq0n = qzgh0zhuglejfhdfh7y2.qNPQb1obP7;
            ViewGroup viewGroup = (ViewGroup) this.M9e7PWhFYLD2lOGMker;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof YybP2G5tPcuz9Zghx) && ((YybP2G5tPcuz9Zghx) childAt).getItemData() == rkuo6pamwq0n) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                qzgh0zhuglejfhdfh7y.qNPQb1obP7.getClass();
                int size = qzgh0zhuglejfhdfh7y.zIvmSL0wzmmKGc3X39b2Gw2mUGE.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = qzgh0zhuglejfhdfh7y.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                x7RNBrm11qTEy x7rnbrm11qtey = new x7RNBrm11qTEy(this, this.ZfQNn8hdWlEQ5cR94249PDsLR, qzgh0zhuglejfhdfh7y, view);
                this.TaDO7ogis3aEiWEtq = x7rnbrm11qtey;
                x7rnbrm11qtey.ZLZeBXTMq0zDztBxtRTuCHrapQ = z;
                WiLYxtz85JCnc wiLYxtz85JCnc = x7rnbrm11qtey.GI83zq0G8e7zkn;
                if (wiLYxtz85JCnc != null) {
                    wiLYxtz85JCnc.Ca81ebIan1u(z);
                }
                x7RNBrm11qTEy x7rnbrm11qtey2 = this.TaDO7ogis3aEiWEtq;
                if (!x7rnbrm11qtey2.zzpBGItXfub0yWj()) {
                    if (x7rnbrm11qtey2.LaeGQIruHQu81hfJldjMOQSVblH3x == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    x7rnbrm11qtey2.ZfQNn8hdWlEQ5cR94249PDsLR(0, 0, false, false);
                }
                DRNSD7OTZrolKY4iK67pQWIr dRNSD7OTZrolKY4iK67pQWIr = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                if (dRNSD7OTZrolKY4iK67pQWIr != null) {
                    dRNSD7OTZrolKY4iK67pQWIr.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(qzgh0zhuglejfhdfh7y);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View VxUQ9tBhpHJ2AAEDNW8sghc4m(rkuo6pAmWq0N rkuo6pamwq0n, View view, ViewGroup viewGroup) {
        View actionView = rkuo6pamwq0n.getActionView();
        if (actionView == null || rkuo6pamwq0n.LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            YybP2G5tPcuz9Zghx yybP2G5tPcuz9Zghx = view instanceof YybP2G5tPcuz9Zghx ? (YybP2G5tPcuz9Zghx) view : (YybP2G5tPcuz9Zghx) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.inflate(this.GI83zq0G8e7zkn, viewGroup, false);
            yybP2G5tPcuz9Zghx.V57tEvNfxZVVcOCAOih5PKr(rkuo6pamwq0n);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) yybP2G5tPcuz9Zghx;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.M9e7PWhFYLD2lOGMker);
            if (this.q11o1hieEkZDhF1MGOZI26oZiDT == null) {
                this.q11o1hieEkZDhF1MGOZI26oZiDT = new EDKupHDxyEiMNR8pvhG4o(this);
            }
            actionMenuItemView.setPopupCallback(this.q11o1hieEkZDhF1MGOZI26oZiDT);
            actionView = (View) yybP2G5tPcuz9Zghx;
        }
        actionView.setVisibility(rkuo6pamwq0n.pzqP2AqKW6J5PO8zCKnW ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof vgGKTp17ZBXTKwktZ7oXqGJ4z3XQ)) {
            actionView.setLayoutParams(ActionMenuView.HzCpKshMOoaw76hFcbOVRYMeRd(layoutParams));
        }
        return actionView;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(Context context, Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = context;
        LayoutInflater.from(context);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
        Resources resources = context.getResources();
        if (!this.Ca81ebIan1u) {
            this.p59rPv72J9 = true;
        }
        int i = 2;
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.ko09zE6UAgwkV = i;
        int measuredWidth = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        if (this.p59rPv72J9) {
            if (this.HzCpKshMOoaw76hFcbOVRYMeRd == null) {
                t5olRUJo5JPX6WXwY17n2LzUoDWuf t5olrujo5jpx6wxwy17n2lzuodwuf = new t5olRUJo5JPX6WXwY17n2LzUoDWuf(this, this.V57tEvNfxZVVcOCAOih5PKr);
                this.HzCpKshMOoaw76hFcbOVRYMeRd = t5olrujo5jpx6wxwy17n2lzuodwuf;
                if (this.q1wNbhk2O6) {
                    t5olrujo5jpx6wxwy17n2lzuodwuf.setImageDrawable(this.KUYypEB4eNWOZWVDpH);
                    this.KUYypEB4eNWOZWVDpH = null;
                    this.q1wNbhk2O6 = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.HzCpKshMOoaw76hFcbOVRYMeRd.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.HzCpKshMOoaw76hFcbOVRYMeRd.getMeasuredWidth();
        } else {
            this.HzCpKshMOoaw76hFcbOVRYMeRd = null;
        }
        this.pYmKDYlAmhudp = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR() {
        Object obj;
        gZVesoHrfMaGvAvfBsRIr gzvesohrfmagvavfbsrir = this.Irh5auREsoeV1C1RaBamlmy;
        if (gzvesohrfmagvavfbsrir != null && (obj = this.M9e7PWhFYLD2lOGMker) != null) {
            ((View) obj).removeCallbacks(gzvesohrfmagvavfbsrir);
            this.Irh5auREsoeV1C1RaBamlmy = null;
            return true;
        }
        x7RNBrm11qTEy x7rnbrm11qtey = this.vBGA6pPLqSMuYGvprl270j7;
        if (x7rnbrm11qtey == null) {
            return false;
        }
        if (x7rnbrm11qtey.zzpBGItXfub0yWj()) {
            x7rnbrm11qtey.GI83zq0G8e7zkn.dismiss();
        }
        return true;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(rkuo6pAmWq0N rkuo6pamwq0n) {
        return false;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final void zzpBGItXfub0yWj(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ, boolean z) {
        ZfQNn8hdWlEQ5cR94249PDsLR();
        x7RNBrm11qTEy x7rnbrm11qtey = this.TaDO7ogis3aEiWEtq;
        if (x7rnbrm11qtey != null && x7rnbrm11qtey.zzpBGItXfub0yWj()) {
            x7rnbrm11qtey.GI83zq0G8e7zkn.dismiss();
        }
        DRNSD7OTZrolKY4iK67pQWIr dRNSD7OTZrolKY4iK67pQWIr = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (dRNSD7OTZrolKY4iK67pQWIr != null) {
            dRNSD7OTZrolKY4iK67pQWIr.zzpBGItXfub0yWj(stuu2Qyz6BSCKFEomt5b51vUnV1HQ, z);
        }
    }
}
