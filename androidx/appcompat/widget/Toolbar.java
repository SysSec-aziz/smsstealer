package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.vdodsodjsdt.AtPwsalF1WzOhkNOK;
import com.vdodsodjsdt.AuEvIFo0QoYm1PHNG;
import com.vdodsodjsdt.IRMVboVyQ4o8fsR;
import com.vdodsodjsdt.JaGiaIfgE4oZFS8GScUJb;
import com.vdodsodjsdt.KfeOQNOupsCg6878zi4e;
import com.vdodsodjsdt.NrjuzzioPqfttNRptBDpZDzSYUrcM;
import com.vdodsodjsdt.PLe0duizehnNHFlDQfVGVxW1I;
import com.vdodsodjsdt.QiHQb47dV2g7;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.RfOSIaL6qUBGKJY9MSCBP5ba;
import com.vdodsodjsdt.RiiHsqLLQiI2YifuMiu;
import com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
import com.vdodsodjsdt.TbV4rkOPds9wwfLx;
import com.vdodsodjsdt.UHvbXkh4dyB077F7trAwSu;
import com.vdodsodjsdt.UUakYZujlsyYLXc5G3llIUz5sLy1;
import com.vdodsodjsdt.XAXQThgWBTCG47D3pHtVQkVTIx;
import com.vdodsodjsdt.cAQcd4a4Z8bo0dKO;
import com.vdodsodjsdt.hMSqZXAdAtwr9Ih2G;
import com.vdodsodjsdt.kI1rndchf6W0AJYmJtpW;
import com.vdodsodjsdt.lzuj2xiOHpZAdsoZ1vJvxA;
import com.vdodsodjsdt.oD78NtkeSuRtaWUfMs1KgLg1WoWNL;
import com.vdodsodjsdt.qE1OfTIjlj6BdfNlBJklCURi;
import com.vdodsodjsdt.rkuo6pAmWq0N;
import com.vdodsodjsdt.tU00g8uTcx4Y28xqEO;
import com.vdodsodjsdt.uQVzckisSl8;
import com.vdodsodjsdt.wGfZDRl3Th9;
import com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public int Ca81ebIan1u;
    public JaGiaIfgE4oZFS8GScUJb CixTK5ZX8oWXHz34qHYV;
    public final CharSequence GI83zq0G8e7zkn;
    public final ArrayList HVEwbdULInpTNa0IG;
    public View HzCpKshMOoaw76hFcbOVRYMeRd;
    public int Irh5auREsoeV1C1RaBamlmy;
    public Context KUYypEB4eNWOZWVDpH;
    public boolean L8DMw02rUTs2w;
    public lzuj2xiOHpZAdsoZ1vJvxA LaeGQIruHQu81hfJldjMOQSVblH3x;
    public IRMVboVyQ4o8fsR M9e7PWhFYLD2lOGMker;
    public final Drawable NSjgqmGjEzuugn2SsG1mZFP;
    public final ArrayList O1xDAlBZZlZdoEf747lCFHld;
    public CharSequence RhfGHxtXxy0M0grmp2jkRjQg;
    public ColorStateList SuB3hEmTmbbRGAhtvOOmfKEon;
    public XAXQThgWBTCG47D3pHtVQkVTIx TaDO7ogis3aEiWEtq;
    public final kI1rndchf6W0AJYmJtpW TqcnImqkSWIKht;
    public ActionMenuView V57tEvNfxZVVcOCAOih5PKr;
    public boolean YdNRGRc4rly;
    public PLe0duizehnNHFlDQfVGVxW1I ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public lzuj2xiOHpZAdsoZ1vJvxA ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean aXO0LSrt8bKV;
    public oD78NtkeSuRtaWUfMs1KgLg1WoWNL d9zDyyznnp3oaDT1Ug;
    public int f6ZQsR6bPLvvCDNXOUc;
    public OnBackInvokedDispatcher gBaBUmihn5l4u;
    public final int h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public ArrayList iKANjmyTSxO6v6UuLPdu7DxOjlS;
    public int jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public int ko09zE6UAgwkV;
    public final RfOSIaL6qUBGKJY9MSCBP5ba lQ0rO9lhQIyVe7Rp6;
    public int p59rPv72J9;
    public final int pYmKDYlAmhudp;
    public ColorStateList pzqP2AqKW6J5PO8zCKnW;
    public int q11o1hieEkZDhF1MGOZI26oZiDT;
    public int q1wNbhk2O6;
    public CharSequence qNPQb1obP7;
    public final NrjuzzioPqfttNRptBDpZDzSYUrcM qygqjTppWwx992;
    public int vBGA6pPLqSMuYGvprl270j7;
    public boolean vE4yDIjexsP2lGjLaTcB;
    public final int w0Wu95l8dVNw5rZMRu;
    public OnBackInvokedCallback wRCD0SdqWCowdYU7bmzN;
    public final int[] y1NaPKTl7R18DOr6e8i5;
    public qE1OfTIjlj6BdfNlBJklCURi ymT6yQrus3w;
    public IRMVboVyQ4o8fsR zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static RiiHsqLLQiI2YifuMiu GI83zq0G8e7zkn(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof RiiHsqLLQiI2YifuMiu;
        if (z) {
            RiiHsqLLQiI2YifuMiu riiHsqLLQiI2YifuMiu = (RiiHsqLLQiI2YifuMiu) layoutParams;
            RiiHsqLLQiI2YifuMiu riiHsqLLQiI2YifuMiu2 = new RiiHsqLLQiI2YifuMiu(riiHsqLLQiI2YifuMiu);
            riiHsqLLQiI2YifuMiu2.zzpBGItXfub0yWj = 0;
            riiHsqLLQiI2YifuMiu2.zzpBGItXfub0yWj = riiHsqLLQiI2YifuMiu.zzpBGItXfub0yWj;
            return riiHsqLLQiI2YifuMiu2;
        }
        if (z) {
            RiiHsqLLQiI2YifuMiu riiHsqLLQiI2YifuMiu3 = new RiiHsqLLQiI2YifuMiu((RiiHsqLLQiI2YifuMiu) layoutParams);
            riiHsqLLQiI2YifuMiu3.zzpBGItXfub0yWj = 0;
            return riiHsqLLQiI2YifuMiu3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            RiiHsqLLQiI2YifuMiu riiHsqLLQiI2YifuMiu4 = new RiiHsqLLQiI2YifuMiu(layoutParams);
            riiHsqLLQiI2YifuMiu4.zzpBGItXfub0yWj = 0;
            return riiHsqLLQiI2YifuMiu4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        RiiHsqLLQiI2YifuMiu riiHsqLLQiI2YifuMiu5 = new RiiHsqLLQiI2YifuMiu(marginLayoutParams);
        riiHsqLLQiI2YifuMiu5.zzpBGItXfub0yWj = 0;
        ((ViewGroup.MarginLayoutParams) riiHsqLLQiI2YifuMiu5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) riiHsqLLQiI2YifuMiu5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) riiHsqLLQiI2YifuMiu5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) riiHsqLLQiI2YifuMiu5).bottomMargin = marginLayoutParams.bottomMargin;
        return riiHsqLLQiI2YifuMiu5;
    }

    public static int HzCpKshMOoaw76hFcbOVRYMeRd(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int KUYypEB4eNWOZWVDpH(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static RiiHsqLLQiI2YifuMiu NSjgqmGjEzuugn2SsG1mZFP() {
        RiiHsqLLQiI2YifuMiu riiHsqLLQiI2YifuMiu = new RiiHsqLLQiI2YifuMiu(-2, -2);
        riiHsqLLQiI2YifuMiu.zzpBGItXfub0yWj = 0;
        riiHsqLLQiI2YifuMiu.VxUQ9tBhpHJ2AAEDNW8sghc4m = 8388627;
        return riiHsqLLQiI2YifuMiu;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new uQVzckisSl8(getContext());
    }

    public final int Ca81ebIan1u(View view, int i, int i2, int[] iArr) {
        RiiHsqLLQiI2YifuMiu riiHsqLLQiI2YifuMiu = (RiiHsqLLQiI2YifuMiu) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) riiHsqLLQiI2YifuMiu).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM9e7PWhFYLD2lOGMker, iMax + measuredWidth, view.getMeasuredHeight() + iM9e7PWhFYLD2lOGMker);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) riiHsqLLQiI2YifuMiu).rightMargin + iMax;
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        ActionMenuView actionMenuView = this.V57tEvNfxZVVcOCAOih5PKr;
        if (actionMenuView.ko09zE6UAgwkV == null) {
            Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = (Stuu2Qyz6BSCKFEomt5b51vUnV1HQ) actionMenuView.getMenu();
            if (this.ymT6yQrus3w == null) {
                this.ymT6yQrus3w = new qE1OfTIjlj6BdfNlBJklCURi(this);
            }
            this.V57tEvNfxZVVcOCAOih5PKr.setExpandedActionViewsExclusive(true);
            stuu2Qyz6BSCKFEomt5b51vUnV1HQ.zzpBGItXfub0yWj(this.ymT6yQrus3w, this.KUYypEB4eNWOZWVDpH);
            f6ZQsR6bPLvvCDNXOUc();
        }
    }

    public final int M9e7PWhFYLD2lOGMker(View view, int i) {
        RiiHsqLLQiI2YifuMiu riiHsqLLQiI2YifuMiu = (RiiHsqLLQiI2YifuMiu) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = riiHsqLLQiI2YifuMiu.VxUQ9tBhpHJ2AAEDNW8sghc4m & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.w0Wu95l8dVNw5rZMRu & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) riiHsqLLQiI2YifuMiu).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) riiHsqLLQiI2YifuMiu).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) riiHsqLLQiI2YifuMiu).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final void V57tEvNfxZVVcOCAOih5PKr() {
        if (this.M9e7PWhFYLD2lOGMker == null) {
            IRMVboVyQ4o8fsR iRMVboVyQ4o8fsR = new IRMVboVyQ4o8fsR(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.M9e7PWhFYLD2lOGMker = iRMVboVyQ4o8fsR;
            iRMVboVyQ4o8fsR.setImageDrawable(this.NSjgqmGjEzuugn2SsG1mZFP);
            this.M9e7PWhFYLD2lOGMker.setContentDescription(this.GI83zq0G8e7zkn);
            RiiHsqLLQiI2YifuMiu riiHsqLLQiI2YifuMiuNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP();
            riiHsqLLQiI2YifuMiuNSjgqmGjEzuugn2SsG1mZFP.VxUQ9tBhpHJ2AAEDNW8sghc4m = (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv & 112) | 8388611;
            riiHsqLLQiI2YifuMiuNSjgqmGjEzuugn2SsG1mZFP.zzpBGItXfub0yWj = 2;
            this.M9e7PWhFYLD2lOGMker.setLayoutParams(riiHsqLLQiI2YifuMiuNSjgqmGjEzuugn2SsG1mZFP);
            this.M9e7PWhFYLD2lOGMker.setOnClickListener(new wGfZDRl3Th9(3, this));
        }
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(ArrayList arrayList, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                RiiHsqLLQiI2YifuMiu riiHsqLLQiI2YifuMiu = (RiiHsqLLQiI2YifuMiu) childAt.getLayoutParams();
                if (riiHsqLLQiI2YifuMiu.zzpBGItXfub0yWj == 0 && jW7EiD0YL6xkbB158jMUzhWNWb1y(childAt)) {
                    int i3 = riiHsqLLQiI2YifuMiu.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            RiiHsqLLQiI2YifuMiu riiHsqLLQiI2YifuMiu2 = (RiiHsqLLQiI2YifuMiu) childAt2.getLayoutParams();
            if (riiHsqLLQiI2YifuMiu2.zzpBGItXfub0yWj == 0 && jW7EiD0YL6xkbB158jMUzhWNWb1y(childAt2)) {
                int i5 = riiHsqLLQiI2YifuMiu2.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE == null) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new IRMVboVyQ4o8fsR(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            RiiHsqLLQiI2YifuMiu riiHsqLLQiI2YifuMiuNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP();
            riiHsqLLQiI2YifuMiuNSjgqmGjEzuugn2SsG1mZFP.VxUQ9tBhpHJ2AAEDNW8sghc4m = (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv & 112) | 8388611;
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setLayoutParams(riiHsqLLQiI2YifuMiuNSjgqmGjEzuugn2SsG1mZFP);
        }
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR() {
        if (this.TaDO7ogis3aEiWEtq == null) {
            XAXQThgWBTCG47D3pHtVQkVTIx xAXQThgWBTCG47D3pHtVQkVTIx = new XAXQThgWBTCG47D3pHtVQkVTIx();
            xAXQThgWBTCG47D3pHtVQkVTIx.VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
            xAXQThgWBTCG47D3pHtVQkVTIx.zzpBGItXfub0yWj = 0;
            xAXQThgWBTCG47D3pHtVQkVTIx.V57tEvNfxZVVcOCAOih5PKr = Integer.MIN_VALUE;
            xAXQThgWBTCG47D3pHtVQkVTIx.ZfQNn8hdWlEQ5cR94249PDsLR = Integer.MIN_VALUE;
            xAXQThgWBTCG47D3pHtVQkVTIx.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
            xAXQThgWBTCG47D3pHtVQkVTIx.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
            xAXQThgWBTCG47D3pHtVQkVTIx.ZLZeBXTMq0zDztBxtRTuCHrapQ = false;
            xAXQThgWBTCG47D3pHtVQkVTIx.NSjgqmGjEzuugn2SsG1mZFP = false;
            this.TaDO7ogis3aEiWEtq = xAXQThgWBTCG47D3pHtVQkVTIx;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof RiiHsqLLQiI2YifuMiu);
    }

    public final void f6ZQsR6bPLvvCDNXOUc() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherVxUQ9tBhpHJ2AAEDNW8sghc4m = QiHQb47dV2g7.VxUQ9tBhpHJ2AAEDNW8sghc4m(this);
            qE1OfTIjlj6BdfNlBJklCURi qe1oftijlj6bdfnlbjklcuri = this.ymT6yQrus3w;
            boolean z = (qe1oftijlj6bdfnlbjklcuri == null || qe1oftijlj6bdfnlbjklcuri.ZfQNn8hdWlEQ5cR94249PDsLR == null || onBackInvokedDispatcherVxUQ9tBhpHJ2AAEDNW8sghc4m == null || !isAttachedToWindow() || !this.L8DMw02rUTs2w) ? false : true;
            if (z && this.gBaBUmihn5l4u == null) {
                if (this.wRCD0SdqWCowdYU7bmzN == null) {
                    this.wRCD0SdqWCowdYU7bmzN = QiHQb47dV2g7.zzpBGItXfub0yWj(new cAQcd4a4Z8bo0dKO(this, 0));
                }
                QiHQb47dV2g7.V57tEvNfxZVVcOCAOih5PKr(onBackInvokedDispatcherVxUQ9tBhpHJ2AAEDNW8sghc4m, this.wRCD0SdqWCowdYU7bmzN);
                this.gBaBUmihn5l4u = onBackInvokedDispatcherVxUQ9tBhpHJ2AAEDNW8sghc4m;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.gBaBUmihn5l4u) == null) {
                return;
            }
            QiHQb47dV2g7.ZfQNn8hdWlEQ5cR94249PDsLR(onBackInvokedDispatcher, this.wRCD0SdqWCowdYU7bmzN);
            this.gBaBUmihn5l4u = null;
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return NSjgqmGjEzuugn2SsG1mZFP();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return GI83zq0G8e7zkn(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        IRMVboVyQ4o8fsR iRMVboVyQ4o8fsR = this.M9e7PWhFYLD2lOGMker;
        if (iRMVboVyQ4o8fsR != null) {
            return iRMVboVyQ4o8fsR.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        IRMVboVyQ4o8fsR iRMVboVyQ4o8fsR = this.M9e7PWhFYLD2lOGMker;
        if (iRMVboVyQ4o8fsR != null) {
            return iRMVboVyQ4o8fsR.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        XAXQThgWBTCG47D3pHtVQkVTIx xAXQThgWBTCG47D3pHtVQkVTIx = this.TaDO7ogis3aEiWEtq;
        if (xAXQThgWBTCG47D3pHtVQkVTIx != null) {
            return xAXQThgWBTCG47D3pHtVQkVTIx.ZLZeBXTMq0zDztBxtRTuCHrapQ ? xAXQThgWBTCG47D3pHtVQkVTIx.VxUQ9tBhpHJ2AAEDNW8sghc4m : xAXQThgWBTCG47D3pHtVQkVTIx.zzpBGItXfub0yWj;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.q11o1hieEkZDhF1MGOZI26oZiDT;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        XAXQThgWBTCG47D3pHtVQkVTIx xAXQThgWBTCG47D3pHtVQkVTIx = this.TaDO7ogis3aEiWEtq;
        if (xAXQThgWBTCG47D3pHtVQkVTIx != null) {
            return xAXQThgWBTCG47D3pHtVQkVTIx.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        }
        return 0;
    }

    public int getContentInsetRight() {
        XAXQThgWBTCG47D3pHtVQkVTIx xAXQThgWBTCG47D3pHtVQkVTIx = this.TaDO7ogis3aEiWEtq;
        if (xAXQThgWBTCG47D3pHtVQkVTIx != null) {
            return xAXQThgWBTCG47D3pHtVQkVTIx.zzpBGItXfub0yWj;
        }
        return 0;
    }

    public int getContentInsetStart() {
        XAXQThgWBTCG47D3pHtVQkVTIx xAXQThgWBTCG47D3pHtVQkVTIx = this.TaDO7ogis3aEiWEtq;
        if (xAXQThgWBTCG47D3pHtVQkVTIx != null) {
            return xAXQThgWBTCG47D3pHtVQkVTIx.ZLZeBXTMq0zDztBxtRTuCHrapQ ? xAXQThgWBTCG47D3pHtVQkVTIx.zzpBGItXfub0yWj : xAXQThgWBTCG47D3pHtVQkVTIx.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.Irh5auREsoeV1C1RaBamlmy;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
        ActionMenuView actionMenuView = this.V57tEvNfxZVVcOCAOih5PKr;
        return (actionMenuView == null || (stuu2Qyz6BSCKFEomt5b51vUnV1HQ = actionMenuView.ko09zE6UAgwkV) == null || !stuu2Qyz6BSCKFEomt5b51vUnV1HQ.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.q11o1hieEkZDhF1MGOZI26oZiDT, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.Irh5auREsoeV1C1RaBamlmy, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        PLe0duizehnNHFlDQfVGVxW1I pLe0duizehnNHFlDQfVGVxW1I = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (pLe0duizehnNHFlDQfVGVxW1I != null) {
            return pLe0duizehnNHFlDQfVGVxW1I.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        PLe0duizehnNHFlDQfVGVxW1I pLe0duizehnNHFlDQfVGVxW1I = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (pLe0duizehnNHFlDQfVGVxW1I != null) {
            return pLe0duizehnNHFlDQfVGVxW1I.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        LaeGQIruHQu81hfJldjMOQSVblH3x();
        return this.V57tEvNfxZVVcOCAOih5PKr.getMenu();
    }

    public View getNavButtonView() {
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    public CharSequence getNavigationContentDescription() {
        IRMVboVyQ4o8fsR iRMVboVyQ4o8fsR = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (iRMVboVyQ4o8fsR != null) {
            return iRMVboVyQ4o8fsR.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        IRMVboVyQ4o8fsR iRMVboVyQ4o8fsR = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (iRMVboVyQ4o8fsR != null) {
            return iRMVboVyQ4o8fsR.getDrawable();
        }
        return null;
    }

    public JaGiaIfgE4oZFS8GScUJb getOuterActionMenuPresenter() {
        return this.CixTK5ZX8oWXHz34qHYV;
    }

    public Drawable getOverflowIcon() {
        LaeGQIruHQu81hfJldjMOQSVblH3x();
        return this.V57tEvNfxZVVcOCAOih5PKr.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.KUYypEB4eNWOZWVDpH;
    }

    public int getPopupTheme() {
        return this.q1wNbhk2O6;
    }

    public CharSequence getSubtitle() {
        return this.qNPQb1obP7;
    }

    public final TextView getSubtitleTextView() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    public CharSequence getTitle() {
        return this.RhfGHxtXxy0M0grmp2jkRjQg;
    }

    public int getTitleMarginBottom() {
        return this.vBGA6pPLqSMuYGvprl270j7;
    }

    public int getTitleMarginEnd() {
        return this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
    }

    public int getTitleMarginStart() {
        return this.ko09zE6UAgwkV;
    }

    public int getTitleMarginTop() {
        return this.f6ZQsR6bPLvvCDNXOUc;
    }

    public final TextView getTitleTextView() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public hMSqZXAdAtwr9Ih2G getWrapper() {
        Drawable drawable;
        if (this.d9zDyyznnp3oaDT1Ug == null) {
            oD78NtkeSuRtaWUfMs1KgLg1WoWNL od78ntkesurtawufms1kglg1wownl = new oD78NtkeSuRtaWUfMs1KgLg1WoWNL();
            od78ntkesurtawufms1kglg1wownl.p59rPv72J9 = 0;
            od78ntkesurtawufms1kglg1wownl.VxUQ9tBhpHJ2AAEDNW8sghc4m = this;
            od78ntkesurtawufms1kglg1wownl.NSjgqmGjEzuugn2SsG1mZFP = getTitle();
            od78ntkesurtawufms1kglg1wownl.GI83zq0G8e7zkn = getSubtitle();
            od78ntkesurtawufms1kglg1wownl.ZLZeBXTMq0zDztBxtRTuCHrapQ = od78ntkesurtawufms1kglg1wownl.NSjgqmGjEzuugn2SsG1mZFP != null;
            od78ntkesurtawufms1kglg1wownl.zIvmSL0wzmmKGc3X39b2Gw2mUGE = getNavigationIcon();
            NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7 = NrjuzzioPqfttNRptBDpZDzSYUrcM.qNPQb1obP7(getContext(), null, AuEvIFo0QoYm1PHNG.VxUQ9tBhpHJ2AAEDNW8sghc4m, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.V57tEvNfxZVVcOCAOih5PKr;
            od78ntkesurtawufms1kglg1wownl.Ca81ebIan1u = nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.pYmKDYlAmhudp(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                od78ntkesurtawufms1kglg1wownl.ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
                od78ntkesurtawufms1kglg1wownl.NSjgqmGjEzuugn2SsG1mZFP = text;
                if ((od78ntkesurtawufms1kglg1wownl.zzpBGItXfub0yWj & 8) != 0) {
                    setTitle(text);
                    if (od78ntkesurtawufms1kglg1wownl.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                        xb0r6yEzq0tw9m7nTWG5BFR8.p59rPv72J9(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                od78ntkesurtawufms1kglg1wownl.GI83zq0G8e7zkn = text2;
                if ((od78ntkesurtawufms1kglg1wownl.zzpBGItXfub0yWj & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawablePYmKDYlAmhudp = nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.pYmKDYlAmhudp(20);
            if (drawablePYmKDYlAmhudp != null) {
                od78ntkesurtawufms1kglg1wownl.LaeGQIruHQu81hfJldjMOQSVblH3x = drawablePYmKDYlAmhudp;
                od78ntkesurtawufms1kglg1wownl.V57tEvNfxZVVcOCAOih5PKr();
            }
            Drawable drawablePYmKDYlAmhudp2 = nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.pYmKDYlAmhudp(17);
            if (drawablePYmKDYlAmhudp2 != null) {
                od78ntkesurtawufms1kglg1wownl.ZfQNn8hdWlEQ5cR94249PDsLR = drawablePYmKDYlAmhudp2;
                od78ntkesurtawufms1kglg1wownl.V57tEvNfxZVVcOCAOih5PKr();
            }
            if (od78ntkesurtawufms1kglg1wownl.zIvmSL0wzmmKGc3X39b2Gw2mUGE == null && (drawable = od78ntkesurtawufms1kglg1wownl.Ca81ebIan1u) != null) {
                od78ntkesurtawufms1kglg1wownl.zIvmSL0wzmmKGc3X39b2Gw2mUGE = drawable;
                if ((od78ntkesurtawufms1kglg1wownl.zzpBGItXfub0yWj & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            od78ntkesurtawufms1kglg1wownl.VxUQ9tBhpHJ2AAEDNW8sghc4m(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = od78ntkesurtawufms1kglg1wownl.V57tEvNfxZVVcOCAOih5PKr;
                if (view != null && (od78ntkesurtawufms1kglg1wownl.zzpBGItXfub0yWj & 16) != 0) {
                    removeView(view);
                }
                od78ntkesurtawufms1kglg1wownl.V57tEvNfxZVVcOCAOih5PKr = viewInflate;
                if (viewInflate != null && (od78ntkesurtawufms1kglg1wownl.zzpBGItXfub0yWj & 16) != 0) {
                    addView(viewInflate);
                }
                od78ntkesurtawufms1kglg1wownl.VxUQ9tBhpHJ2AAEDNW8sghc4m(od78ntkesurtawufms1kglg1wownl.zzpBGItXfub0yWj | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                ZfQNn8hdWlEQ5cR94249PDsLR();
                this.TaDO7ogis3aEiWEtq.VxUQ9tBhpHJ2AAEDNW8sghc4m(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.p59rPv72J9 = resourceId2;
                lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (lzuj2xiohpzadsoz1vjvxa != null) {
                    lzuj2xiohpzadsoz1vjvxa.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.Ca81ebIan1u = resourceId3;
                lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (lzuj2xiohpzadsoz1vjvxa2 != null) {
                    lzuj2xiohpzadsoz1vjvxa2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.aXO0LSrt8bKV();
            if (R.string.abc_action_bar_up_description != od78ntkesurtawufms1kglg1wownl.p59rPv72J9) {
                od78ntkesurtawufms1kglg1wownl.p59rPv72J9 = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = od78ntkesurtawufms1kglg1wownl.p59rPv72J9;
                    od78ntkesurtawufms1kglg1wownl.M9e7PWhFYLD2lOGMker = i != 0 ? getContext().getString(i) : null;
                    od78ntkesurtawufms1kglg1wownl.zzpBGItXfub0yWj();
                }
            }
            od78ntkesurtawufms1kglg1wownl.M9e7PWhFYLD2lOGMker = getNavigationContentDescription();
            setNavigationOnClickListener(new UHvbXkh4dyB077F7trAwSu(od78ntkesurtawufms1kglg1wownl));
            this.d9zDyyznnp3oaDT1Ug = od78ntkesurtawufms1kglg1wownl;
        }
        return this.d9zDyyznnp3oaDT1Ug;
    }

    public final int h3jnZRsdwYJfY9UhQCkbvWciwvFHv(View view, int i, int i2, int[] iArr) {
        RiiHsqLLQiI2YifuMiu riiHsqLLQiI2YifuMiu = (RiiHsqLLQiI2YifuMiu) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) riiHsqLLQiI2YifuMiu).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM9e7PWhFYLD2lOGMker, iMax, view.getMeasuredHeight() + iM9e7PWhFYLD2lOGMker);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) riiHsqLLQiI2YifuMiu).leftMargin);
    }

    public final boolean jW7EiD0YL6xkbB158jMUzhWNWb1y(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void ko09zE6UAgwkV(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f6ZQsR6bPLvvCDNXOUc();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.lQ0rO9lhQIyVe7Rp6);
        f6ZQsR6bPLvvCDNXOUc();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.vE4yDIjexsP2lGjLaTcB = false;
        }
        if (!this.vE4yDIjexsP2lGjLaTcB) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.vE4yDIjexsP2lGjLaTcB = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.vE4yDIjexsP2lGjLaTcB = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031a A[LOOP:3: B:117:0x0318->B:118:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        byte b;
        byte b2;
        int iHzCpKshMOoaw76hFcbOVRYMeRd;
        int iMax;
        int iCombineMeasuredStates;
        int iHzCpKshMOoaw76hFcbOVRYMeRd2;
        int iKUYypEB4eNWOZWVDpH;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = TbV4rkOPds9wwfLx.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            b2 = true;
            b = 0;
        } else {
            b = 1;
            b2 = false;
        }
        if (jW7EiD0YL6xkbB158jMUzhWNWb1y(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE)) {
            ko09zE6UAgwkV(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, i, 0, i2, this.pYmKDYlAmhudp);
            iHzCpKshMOoaw76hFcbOVRYMeRd = HzCpKshMOoaw76hFcbOVRYMeRd(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) + this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getMeasuredWidth();
            iMax = Math.max(0, KUYypEB4eNWOZWVDpH(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) + this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getMeasuredState());
        } else {
            iHzCpKshMOoaw76hFcbOVRYMeRd = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (jW7EiD0YL6xkbB158jMUzhWNWb1y(this.M9e7PWhFYLD2lOGMker)) {
            ko09zE6UAgwkV(this.M9e7PWhFYLD2lOGMker, i, 0, i2, this.pYmKDYlAmhudp);
            iHzCpKshMOoaw76hFcbOVRYMeRd = HzCpKshMOoaw76hFcbOVRYMeRd(this.M9e7PWhFYLD2lOGMker) + this.M9e7PWhFYLD2lOGMker.getMeasuredWidth();
            iMax = Math.max(iMax, KUYypEB4eNWOZWVDpH(this.M9e7PWhFYLD2lOGMker) + this.M9e7PWhFYLD2lOGMker.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.M9e7PWhFYLD2lOGMker.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iHzCpKshMOoaw76hFcbOVRYMeRd);
        int iMax4 = Math.max(0, currentContentInsetStart - iHzCpKshMOoaw76hFcbOVRYMeRd);
        byte b3 = b2;
        int[] iArr = this.y1NaPKTl7R18DOr6e8i5;
        iArr[b3 == true ? 1 : 0] = iMax4;
        if (jW7EiD0YL6xkbB158jMUzhWNWb1y(this.V57tEvNfxZVVcOCAOih5PKr)) {
            ko09zE6UAgwkV(this.V57tEvNfxZVVcOCAOih5PKr, i, iMax3, i2, this.pYmKDYlAmhudp);
            iHzCpKshMOoaw76hFcbOVRYMeRd2 = HzCpKshMOoaw76hFcbOVRYMeRd(this.V57tEvNfxZVVcOCAOih5PKr) + this.V57tEvNfxZVVcOCAOih5PKr.getMeasuredWidth();
            iMax = Math.max(iMax, KUYypEB4eNWOZWVDpH(this.V57tEvNfxZVVcOCAOih5PKr) + this.V57tEvNfxZVVcOCAOih5PKr.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.V57tEvNfxZVVcOCAOih5PKr.getMeasuredState());
        } else {
            iHzCpKshMOoaw76hFcbOVRYMeRd2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iHzCpKshMOoaw76hFcbOVRYMeRd2);
        iArr[b] = Math.max(0, currentContentInsetEnd - iHzCpKshMOoaw76hFcbOVRYMeRd2);
        if (jW7EiD0YL6xkbB158jMUzhWNWb1y(this.HzCpKshMOoaw76hFcbOVRYMeRd)) {
            iMax5 += pYmKDYlAmhudp(this.HzCpKshMOoaw76hFcbOVRYMeRd, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, KUYypEB4eNWOZWVDpH(this.HzCpKshMOoaw76hFcbOVRYMeRd) + this.HzCpKshMOoaw76hFcbOVRYMeRd.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.HzCpKshMOoaw76hFcbOVRYMeRd.getMeasuredState());
        }
        if (jW7EiD0YL6xkbB158jMUzhWNWb1y(this.ZLZeBXTMq0zDztBxtRTuCHrapQ)) {
            iMax5 += pYmKDYlAmhudp(this.ZLZeBXTMq0zDztBxtRTuCHrapQ, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, KUYypEB4eNWOZWVDpH(this.ZLZeBXTMq0zDztBxtRTuCHrapQ) + this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((RiiHsqLLQiI2YifuMiu) childAt.getLayoutParams()).zzpBGItXfub0yWj == 0 && jW7EiD0YL6xkbB158jMUzhWNWb1y(childAt)) {
                iMax5 += pYmKDYlAmhudp(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, KUYypEB4eNWOZWVDpH(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.f6ZQsR6bPLvvCDNXOUc + this.vBGA6pPLqSMuYGvprl270j7;
        int i7 = this.ko09zE6UAgwkV + this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
        if (jW7EiD0YL6xkbB158jMUzhWNWb1y(this.ZfQNn8hdWlEQ5cR94249PDsLR)) {
            pYmKDYlAmhudp(this.ZfQNn8hdWlEQ5cR94249PDsLR, i, i5 + i7, i2, i6, iArr);
            int iHzCpKshMOoaw76hFcbOVRYMeRd3 = HzCpKshMOoaw76hFcbOVRYMeRd(this.ZfQNn8hdWlEQ5cR94249PDsLR) + this.ZfQNn8hdWlEQ5cR94249PDsLR.getMeasuredWidth();
            iKUYypEB4eNWOZWVDpH = KUYypEB4eNWOZWVDpH(this.ZfQNn8hdWlEQ5cR94249PDsLR) + this.ZfQNn8hdWlEQ5cR94249PDsLR.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.ZfQNn8hdWlEQ5cR94249PDsLR.getMeasuredState());
            iMax2 = iHzCpKshMOoaw76hFcbOVRYMeRd3;
        } else {
            iKUYypEB4eNWOZWVDpH = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (jW7EiD0YL6xkbB158jMUzhWNWb1y(this.LaeGQIruHQu81hfJldjMOQSVblH3x)) {
            iMax2 = Math.max(iMax2, pYmKDYlAmhudp(this.LaeGQIruHQu81hfJldjMOQSVblH3x, i, i5 + i7, i2, i6 + iKUYypEB4eNWOZWVDpH, iArr));
            iKUYypEB4eNWOZWVDpH += KUYypEB4eNWOZWVDpH(this.LaeGQIruHQu81hfJldjMOQSVblH3x) + this.LaeGQIruHQu81hfJldjMOQSVblH3x.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.LaeGQIruHQu81hfJldjMOQSVblH3x.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iKUYypEB4eNWOZWVDpH);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.YdNRGRc4rly) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (jW7EiD0YL6xkbB158jMUzhWNWb1y(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof UUakYZujlsyYLXc5G3llIUz5sLy1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        UUakYZujlsyYLXc5G3llIUz5sLy1 uUakYZujlsyYLXc5G3llIUz5sLy1 = (UUakYZujlsyYLXc5G3llIUz5sLy1) parcelable;
        super.onRestoreInstanceState(uUakYZujlsyYLXc5G3llIUz5sLy1.V57tEvNfxZVVcOCAOih5PKr);
        ActionMenuView actionMenuView = this.V57tEvNfxZVVcOCAOih5PKr;
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = actionMenuView != null ? actionMenuView.ko09zE6UAgwkV : null;
        int i = uUakYZujlsyYLXc5G3llIUz5sLy1.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i != 0 && this.ymT6yQrus3w != null && stuu2Qyz6BSCKFEomt5b51vUnV1HQ != null && (menuItemFindItem = stuu2Qyz6BSCKFEomt5b51vUnV1HQ.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (uUakYZujlsyYLXc5G3llIUz5sLy1.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            RfOSIaL6qUBGKJY9MSCBP5ba rfOSIaL6qUBGKJY9MSCBP5ba = this.lQ0rO9lhQIyVe7Rp6;
            removeCallbacks(rfOSIaL6qUBGKJY9MSCBP5ba);
            post(rfOSIaL6qUBGKJY9MSCBP5ba);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        ZfQNn8hdWlEQ5cR94249PDsLR();
        XAXQThgWBTCG47D3pHtVQkVTIx xAXQThgWBTCG47D3pHtVQkVTIx = this.TaDO7ogis3aEiWEtq;
        boolean z = i == 1;
        if (z == xAXQThgWBTCG47D3pHtVQkVTIx.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            return;
        }
        xAXQThgWBTCG47D3pHtVQkVTIx.ZLZeBXTMq0zDztBxtRTuCHrapQ = z;
        if (!xAXQThgWBTCG47D3pHtVQkVTIx.NSjgqmGjEzuugn2SsG1mZFP) {
            xAXQThgWBTCG47D3pHtVQkVTIx.VxUQ9tBhpHJ2AAEDNW8sghc4m = xAXQThgWBTCG47D3pHtVQkVTIx.LaeGQIruHQu81hfJldjMOQSVblH3x;
            xAXQThgWBTCG47D3pHtVQkVTIx.zzpBGItXfub0yWj = xAXQThgWBTCG47D3pHtVQkVTIx.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            return;
        }
        if (z) {
            int i2 = xAXQThgWBTCG47D3pHtVQkVTIx.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (i2 == Integer.MIN_VALUE) {
                i2 = xAXQThgWBTCG47D3pHtVQkVTIx.LaeGQIruHQu81hfJldjMOQSVblH3x;
            }
            xAXQThgWBTCG47D3pHtVQkVTIx.VxUQ9tBhpHJ2AAEDNW8sghc4m = i2;
            int i3 = xAXQThgWBTCG47D3pHtVQkVTIx.V57tEvNfxZVVcOCAOih5PKr;
            if (i3 == Integer.MIN_VALUE) {
                i3 = xAXQThgWBTCG47D3pHtVQkVTIx.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            }
            xAXQThgWBTCG47D3pHtVQkVTIx.zzpBGItXfub0yWj = i3;
            return;
        }
        int i4 = xAXQThgWBTCG47D3pHtVQkVTIx.V57tEvNfxZVVcOCAOih5PKr;
        if (i4 == Integer.MIN_VALUE) {
            i4 = xAXQThgWBTCG47D3pHtVQkVTIx.LaeGQIruHQu81hfJldjMOQSVblH3x;
        }
        xAXQThgWBTCG47D3pHtVQkVTIx.VxUQ9tBhpHJ2AAEDNW8sghc4m = i4;
        int i5 = xAXQThgWBTCG47D3pHtVQkVTIx.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i5 == Integer.MIN_VALUE) {
            i5 = xAXQThgWBTCG47D3pHtVQkVTIx.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        }
        xAXQThgWBTCG47D3pHtVQkVTIx.zzpBGItXfub0yWj = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        JaGiaIfgE4oZFS8GScUJb jaGiaIfgE4oZFS8GScUJb;
        rkuo6pAmWq0N rkuo6pamwq0n;
        UUakYZujlsyYLXc5G3llIUz5sLy1 uUakYZujlsyYLXc5G3llIUz5sLy1 = new UUakYZujlsyYLXc5G3llIUz5sLy1(super.onSaveInstanceState());
        qE1OfTIjlj6BdfNlBJklCURi qe1oftijlj6bdfnlbjklcuri = this.ymT6yQrus3w;
        if (qe1oftijlj6bdfnlbjklcuri != null && (rkuo6pamwq0n = qe1oftijlj6bdfnlbjklcuri.ZfQNn8hdWlEQ5cR94249PDsLR) != null) {
            uUakYZujlsyYLXc5G3llIUz5sLy1.LaeGQIruHQu81hfJldjMOQSVblH3x = rkuo6pamwq0n.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        }
        ActionMenuView actionMenuView = this.V57tEvNfxZVVcOCAOih5PKr;
        uUakYZujlsyYLXc5G3llIUz5sLy1.zIvmSL0wzmmKGc3X39b2Gw2mUGE = (actionMenuView == null || (jaGiaIfgE4oZFS8GScUJb = actionMenuView.TaDO7ogis3aEiWEtq) == null || !jaGiaIfgE4oZFS8GScUJb.NSjgqmGjEzuugn2SsG1mZFP()) ? false : true;
        return uUakYZujlsyYLXc5G3llIUz5sLy1;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.aXO0LSrt8bKV = false;
        }
        if (!this.aXO0LSrt8bKV) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.aXO0LSrt8bKV = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.aXO0LSrt8bKV = false;
        return true;
    }

    public final boolean p59rPv72J9(View view) {
        return view.getParent() == this || this.HVEwbdULInpTNa0IG.contains(view);
    }

    public final int pYmKDYlAmhudp(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void q1wNbhk2O6() {
        ArrayList arrayList = this.iKANjmyTSxO6v6UuLPdu7DxOjlS;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.qygqjTppWwx992.V57tEvNfxZVVcOCAOih5PKr).iterator();
        while (it.hasNext()) {
            ((AtPwsalF1WzOhkNOK) it.next()).VxUQ9tBhpHJ2AAEDNW8sghc4m.HzCpKshMOoaw76hFcbOVRYMeRd();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.iKANjmyTSxO6v6UuLPdu7DxOjlS = currentMenuItems2;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.L8DMw02rUTs2w != z) {
            this.L8DMw02rUTs2w = z;
            f6ZQsR6bPLvvCDNXOUc();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.YdNRGRc4rly = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.q11o1hieEkZDhF1MGOZI26oZiDT) {
            this.q11o1hieEkZDhF1MGOZI26oZiDT = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.Irh5auREsoeV1C1RaBamlmy) {
            this.Irh5auREsoeV1C1RaBamlmy = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        ZLZeBXTMq0zDztBxtRTuCHrapQ();
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        LaeGQIruHQu81hfJldjMOQSVblH3x();
        this.V57tEvNfxZVVcOCAOih5PKr.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.q1wNbhk2O6 != i) {
            this.q1wNbhk2O6 = i;
            if (i == 0) {
                this.KUYypEB4eNWOZWVDpH = getContext();
            } else {
                this.KUYypEB4eNWOZWVDpH = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.vBGA6pPLqSMuYGvprl270j7 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.ko09zE6UAgwkV = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f6ZQsR6bPLvvCDNXOUc = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        if (this.V57tEvNfxZVVcOCAOih5PKr == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.V57tEvNfxZVVcOCAOih5PKr = actionMenuView;
            actionMenuView.setPopupTheme(this.q1wNbhk2O6);
            this.V57tEvNfxZVVcOCAOih5PKr.setOnMenuItemClickListener(this.TqcnImqkSWIKht);
            ActionMenuView actionMenuView2 = this.V57tEvNfxZVVcOCAOih5PKr;
            kI1rndchf6W0AJYmJtpW ki1rndchf6w0ajymjtpw = new kI1rndchf6W0AJYmJtpW(this);
            actionMenuView2.getClass();
            actionMenuView2.Irh5auREsoeV1C1RaBamlmy = ki1rndchf6w0ajymjtpw;
            RiiHsqLLQiI2YifuMiu riiHsqLLQiI2YifuMiuNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP();
            riiHsqLLQiI2YifuMiuNSjgqmGjEzuugn2SsG1mZFP.VxUQ9tBhpHJ2AAEDNW8sghc4m = (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv & 112) | 8388613;
            this.V57tEvNfxZVVcOCAOih5PKr.setLayoutParams(riiHsqLLQiI2YifuMiuNSjgqmGjEzuugn2SsG1mZFP);
            zzpBGItXfub0yWj(this.V57tEvNfxZVVcOCAOih5PKr, false);
        }
    }

    public final void zzpBGItXfub0yWj(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        RiiHsqLLQiI2YifuMiu riiHsqLLQiI2YifuMiuNSjgqmGjEzuugn2SsG1mZFP = layoutParams == null ? NSjgqmGjEzuugn2SsG1mZFP() : !checkLayoutParams(layoutParams) ? GI83zq0G8e7zkn(layoutParams) : (RiiHsqLLQiI2YifuMiu) layoutParams;
        riiHsqLLQiI2YifuMiuNSjgqmGjEzuugn2SsG1mZFP.zzpBGItXfub0yWj = 1;
        if (!z || this.HzCpKshMOoaw76hFcbOVRYMeRd == null) {
            addView(view, riiHsqLLQiI2YifuMiuNSjgqmGjEzuugn2SsG1mZFP);
        } else {
            view.setLayoutParams(riiHsqLLQiI2YifuMiuNSjgqmGjEzuugn2SsG1mZFP);
            this.HVEwbdULInpTNa0IG.add(view);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.w0Wu95l8dVNw5rZMRu = 8388627;
        this.O1xDAlBZZlZdoEf747lCFHld = new ArrayList();
        this.HVEwbdULInpTNa0IG = new ArrayList();
        this.y1NaPKTl7R18DOr6e8i5 = new int[2];
        this.qygqjTppWwx992 = new NrjuzzioPqfttNRptBDpZDzSYUrcM(new cAQcd4a4Z8bo0dKO(this, 1));
        this.iKANjmyTSxO6v6UuLPdu7DxOjlS = new ArrayList();
        this.TqcnImqkSWIKht = new kI1rndchf6W0AJYmJtpW(this);
        this.lQ0rO9lhQIyVe7Rp6 = new RfOSIaL6qUBGKJY9MSCBP5ba(14, this);
        Context context2 = getContext();
        int[] iArr = AuEvIFo0QoYm1PHNG.Irh5auREsoeV1C1RaBamlmy;
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7 = NrjuzzioPqfttNRptBDpZDzSYUrcM.qNPQb1obP7(context2, attributeSet, iArr, R.attr.toolbarStyle);
        xb0r6yEzq0tw9m7nTWG5BFR8.KUYypEB4eNWOZWVDpH(this, context, iArr, attributeSet, (TypedArray) nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.V57tEvNfxZVVcOCAOih5PKr, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.V57tEvNfxZVVcOCAOih5PKr;
        this.p59rPv72J9 = typedArray.getResourceId(28, 0);
        this.Ca81ebIan1u = typedArray.getResourceId(19, 0);
        this.w0Wu95l8dVNw5rZMRu = typedArray.getInteger(0, 8388627);
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.vBGA6pPLqSMuYGvprl270j7 = dimensionPixelOffset;
        this.f6ZQsR6bPLvvCDNXOUc = dimensionPixelOffset;
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = dimensionPixelOffset;
        this.ko09zE6UAgwkV = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.ko09zE6UAgwkV = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.jW7EiD0YL6xkbB158jMUzhWNWb1y = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f6ZQsR6bPLvvCDNXOUc = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.vBGA6pPLqSMuYGvprl270j7 = dimensionPixelOffset5;
        }
        this.pYmKDYlAmhudp = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        ZfQNn8hdWlEQ5cR94249PDsLR();
        XAXQThgWBTCG47D3pHtVQkVTIx xAXQThgWBTCG47D3pHtVQkVTIx = this.TaDO7ogis3aEiWEtq;
        xAXQThgWBTCG47D3pHtVQkVTIx.NSjgqmGjEzuugn2SsG1mZFP = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            xAXQThgWBTCG47D3pHtVQkVTIx.LaeGQIruHQu81hfJldjMOQSVblH3x = dimensionPixelSize;
            xAXQThgWBTCG47D3pHtVQkVTIx.VxUQ9tBhpHJ2AAEDNW8sghc4m = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            xAXQThgWBTCG47D3pHtVQkVTIx.zIvmSL0wzmmKGc3X39b2Gw2mUGE = dimensionPixelSize2;
            xAXQThgWBTCG47D3pHtVQkVTIx.zzpBGItXfub0yWj = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            xAXQThgWBTCG47D3pHtVQkVTIx.VxUQ9tBhpHJ2AAEDNW8sghc4m(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.Irh5auREsoeV1C1RaBamlmy = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.q11o1hieEkZDhF1MGOZI26oZiDT = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.NSjgqmGjEzuugn2SsG1mZFP = nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.pYmKDYlAmhudp(4);
        this.GI83zq0G8e7zkn = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.KUYypEB4eNWOZWVDpH = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawablePYmKDYlAmhudp = nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.pYmKDYlAmhudp(16);
        if (drawablePYmKDYlAmhudp != null) {
            setNavigationIcon(drawablePYmKDYlAmhudp);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawablePYmKDYlAmhudp2 = nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.pYmKDYlAmhudp(11);
        if (drawablePYmKDYlAmhudp2 != null) {
            setLogo(drawablePYmKDYlAmhudp2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.aXO0LSrt8bKV();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        RiiHsqLLQiI2YifuMiu riiHsqLLQiI2YifuMiu = new RiiHsqLLQiI2YifuMiu(context, attributeSet);
        riiHsqLLQiI2YifuMiu.VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AuEvIFo0QoYm1PHNG.zzpBGItXfub0yWj);
        riiHsqLLQiI2YifuMiu.VxUQ9tBhpHJ2AAEDNW8sghc4m = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        riiHsqLLQiI2YifuMiu.zzpBGItXfub0yWj = 0;
        return riiHsqLLQiI2YifuMiu;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            V57tEvNfxZVVcOCAOih5PKr();
        }
        IRMVboVyQ4o8fsR iRMVboVyQ4o8fsR = this.M9e7PWhFYLD2lOGMker;
        if (iRMVboVyQ4o8fsR != null) {
            iRMVboVyQ4o8fsR.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            V57tEvNfxZVVcOCAOih5PKr();
            this.M9e7PWhFYLD2lOGMker.setImageDrawable(drawable);
        } else {
            IRMVboVyQ4o8fsR iRMVboVyQ4o8fsR = this.M9e7PWhFYLD2lOGMker;
            if (iRMVboVyQ4o8fsR != null) {
                iRMVboVyQ4o8fsR.setImageDrawable(this.NSjgqmGjEzuugn2SsG1mZFP);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new PLe0duizehnNHFlDQfVGVxW1I(getContext(), null, 0);
            }
            if (!p59rPv72J9(this.ZLZeBXTMq0zDztBxtRTuCHrapQ)) {
                zzpBGItXfub0yWj(this.ZLZeBXTMq0zDztBxtRTuCHrapQ, true);
            }
        } else {
            PLe0duizehnNHFlDQfVGVxW1I pLe0duizehnNHFlDQfVGVxW1I = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            if (pLe0duizehnNHFlDQfVGVxW1I != null && p59rPv72J9(pLe0duizehnNHFlDQfVGVxW1I)) {
                removeView(this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
                this.HVEwbdULInpTNa0IG.remove(this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
            }
        }
        PLe0duizehnNHFlDQfVGVxW1I pLe0duizehnNHFlDQfVGVxW1I2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (pLe0duizehnNHFlDQfVGVxW1I2 != null) {
            pLe0duizehnNHFlDQfVGVxW1I2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new PLe0duizehnNHFlDQfVGVxW1I(getContext(), null, 0);
        }
        PLe0duizehnNHFlDQfVGVxW1I pLe0duizehnNHFlDQfVGVxW1I = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (pLe0duizehnNHFlDQfVGVxW1I != null) {
            pLe0duizehnNHFlDQfVGVxW1I.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ZLZeBXTMq0zDztBxtRTuCHrapQ();
        }
        IRMVboVyQ4o8fsR iRMVboVyQ4o8fsR = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (iRMVboVyQ4o8fsR != null) {
            iRMVboVyQ4o8fsR.setContentDescription(charSequence);
            KfeOQNOupsCg6878zi4e.lQ0rO9lhQIyVe7Rp6(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            ZLZeBXTMq0zDztBxtRTuCHrapQ();
            if (!p59rPv72J9(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE)) {
                zzpBGItXfub0yWj(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, true);
            }
        } else {
            IRMVboVyQ4o8fsR iRMVboVyQ4o8fsR = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (iRMVboVyQ4o8fsR != null && p59rPv72J9(iRMVboVyQ4o8fsR)) {
                removeView(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                this.HVEwbdULInpTNa0IG.remove(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
            }
        }
        IRMVboVyQ4o8fsR iRMVboVyQ4o8fsR2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (iRMVboVyQ4o8fsR2 != null) {
            iRMVboVyQ4o8fsR2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (lzuj2xiohpzadsoz1vjvxa != null && p59rPv72J9(lzuj2xiohpzadsoz1vjvxa)) {
                removeView(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
                this.HVEwbdULInpTNa0IG.remove(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
            }
        } else {
            if (this.LaeGQIruHQu81hfJldjMOQSVblH3x == null) {
                Context context = getContext();
                lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa2 = new lzuj2xiOHpZAdsoZ1vJvxA(context, null);
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = lzuj2xiohpzadsoz1vjvxa2;
                lzuj2xiohpzadsoz1vjvxa2.setSingleLine();
                this.LaeGQIruHQu81hfJldjMOQSVblH3x.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.Ca81ebIan1u;
                if (i != 0) {
                    this.LaeGQIruHQu81hfJldjMOQSVblH3x.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.pzqP2AqKW6J5PO8zCKnW;
                if (colorStateList != null) {
                    this.LaeGQIruHQu81hfJldjMOQSVblH3x.setTextColor(colorStateList);
                }
            }
            if (!p59rPv72J9(this.LaeGQIruHQu81hfJldjMOQSVblH3x)) {
                zzpBGItXfub0yWj(this.LaeGQIruHQu81hfJldjMOQSVblH3x, true);
            }
        }
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (lzuj2xiohpzadsoz1vjvxa3 != null) {
            lzuj2xiohpzadsoz1vjvxa3.setText(charSequence);
        }
        this.qNPQb1obP7 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.pzqP2AqKW6J5PO8zCKnW = colorStateList;
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (lzuj2xiohpzadsoz1vjvxa != null) {
            lzuj2xiohpzadsoz1vjvxa.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (lzuj2xiohpzadsoz1vjvxa != null && p59rPv72J9(lzuj2xiohpzadsoz1vjvxa)) {
                removeView(this.ZfQNn8hdWlEQ5cR94249PDsLR);
                this.HVEwbdULInpTNa0IG.remove(this.ZfQNn8hdWlEQ5cR94249PDsLR);
            }
        } else {
            if (this.ZfQNn8hdWlEQ5cR94249PDsLR == null) {
                Context context = getContext();
                lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa2 = new lzuj2xiOHpZAdsoZ1vJvxA(context, null);
                this.ZfQNn8hdWlEQ5cR94249PDsLR = lzuj2xiohpzadsoz1vjvxa2;
                lzuj2xiohpzadsoz1vjvxa2.setSingleLine();
                this.ZfQNn8hdWlEQ5cR94249PDsLR.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.p59rPv72J9;
                if (i != 0) {
                    this.ZfQNn8hdWlEQ5cR94249PDsLR.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.SuB3hEmTmbbRGAhtvOOmfKEon;
                if (colorStateList != null) {
                    this.ZfQNn8hdWlEQ5cR94249PDsLR.setTextColor(colorStateList);
                }
            }
            if (!p59rPv72J9(this.ZfQNn8hdWlEQ5cR94249PDsLR)) {
                zzpBGItXfub0yWj(this.ZfQNn8hdWlEQ5cR94249PDsLR, true);
            }
        }
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lzuj2xiohpzadsoz1vjvxa3 != null) {
            lzuj2xiohpzadsoz1vjvxa3.setText(charSequence);
        }
        this.RhfGHxtXxy0M0grmp2jkRjQg = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.SuB3hEmTmbbRGAhtvOOmfKEon = colorStateList;
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lzuj2xiohpzadsoz1vjvxa != null) {
            lzuj2xiohpzadsoz1vjvxa.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(tU00g8uTcx4Y28xqEO tu00g8utcx4y28xqeo) {
    }
}
