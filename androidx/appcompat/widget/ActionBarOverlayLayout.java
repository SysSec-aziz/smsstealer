package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.vdodsodjsdt.AI25Q5ytBRj9HgDLuHhpxq2SM3iv6;
import com.vdodsodjsdt.DRNSD7OTZrolKY4iK67pQWIr;
import com.vdodsodjsdt.Fq3Bs0prQtLat6;
import com.vdodsodjsdt.JaGiaIfgE4oZFS8GScUJb;
import com.vdodsodjsdt.KfeOQNOupsCg6878zi4e;
import com.vdodsodjsdt.L6NsbfO6KnE8o1cSViY8X;
import com.vdodsodjsdt.L6YGERc84Mt1k8Qot;
import com.vdodsodjsdt.LJ0avg2f37zqC;
import com.vdodsodjsdt.LVSdrptRp9;
import com.vdodsodjsdt.MCkc9XaOBWJ3kr1ZFUGL46e9N;
import com.vdodsodjsdt.NsOvxcOeb6vgXelqa7wP4;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
import com.vdodsodjsdt.UFStPSj5DrcqcfR2RymfmG;
import com.vdodsodjsdt.b7tXVJgFVKMR70Bq4h4cKeMdWq;
import com.vdodsodjsdt.fi6bazFdEnPBJ;
import com.vdodsodjsdt.fteHovX23kcqjzpVgTB;
import com.vdodsodjsdt.gXZrMY3vlni2;
import com.vdodsodjsdt.hMSqZXAdAtwr9Ih2G;
import com.vdodsodjsdt.lJgFFp37ou;
import com.vdodsodjsdt.mYybSD3X3KfsAbnorz7K;
import com.vdodsodjsdt.oD78NtkeSuRtaWUfMs1KgLg1WoWNL;
import com.vdodsodjsdt.p57FoMnk3HKM7uLVmLF1zeLl;
import com.vdodsodjsdt.pJLDv0icdTgj6BPWve3wUpnLp;
import com.vdodsodjsdt.pmJH8rqWIwRth8COqq;
import com.vdodsodjsdt.qE1OfTIjlj6BdfNlBJklCURi;
import com.vdodsodjsdt.ueiyNUHTUsoj16g9F;
import com.vdodsodjsdt.ultdrl04kLWs4va76zZ2lRjrhe;
import com.vdodsodjsdt.v1CDeNphu4LTAZcrLaMzXpHTxfdgq;
import com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8;
import com.vdodsodjsdt.zpFfthyKuYf7mRmHTpn2uBU6EqB;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements b7tXVJgFVKMR70Bq4h4cKeMdWq, L6NsbfO6KnE8o1cSViY8X, fteHovX23kcqjzpVgTB {
    public static final Rect HVEwbdULInpTNa0IG;
    public static final pmJH8rqWIwRth8COqq O1xDAlBZZlZdoEf747lCFHld;
    public static final int[] vE4yDIjexsP2lGjLaTcB = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public final Rect Ca81ebIan1u;
    public boolean GI83zq0G8e7zkn;
    public boolean HzCpKshMOoaw76hFcbOVRYMeRd;
    public zpFfthyKuYf7mRmHTpn2uBU6EqB Irh5auREsoeV1C1RaBamlmy;
    public boolean KUYypEB4eNWOZWVDpH;
    public ContentFrameLayout LaeGQIruHQu81hfJldjMOQSVblH3x;
    public boolean M9e7PWhFYLD2lOGMker;
    public Drawable NSjgqmGjEzuugn2SsG1mZFP;
    public final LJ0avg2f37zqC RhfGHxtXxy0M0grmp2jkRjQg;
    public final ultdrl04kLWs4va76zZ2lRjrhe SuB3hEmTmbbRGAhtvOOmfKEon;
    public pmJH8rqWIwRth8COqq TaDO7ogis3aEiWEtq;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public hMSqZXAdAtwr9Ih2G ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public final v1CDeNphu4LTAZcrLaMzXpHTxfdgq aXO0LSrt8bKV;
    public pmJH8rqWIwRth8COqq f6ZQsR6bPLvvCDNXOUc;
    public final Rect h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public pmJH8rqWIwRth8COqq jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public final Rect ko09zE6UAgwkV;
    public int p59rPv72J9;
    public final Rect pYmKDYlAmhudp;
    public final mYybSD3X3KfsAbnorz7K pzqP2AqKW6J5PO8zCKnW;
    public OverScroller q11o1hieEkZDhF1MGOZI26oZiDT;
    public int q1wNbhk2O6;
    public final ultdrl04kLWs4va76zZ2lRjrhe qNPQb1obP7;
    public pmJH8rqWIwRth8COqq vBGA6pPLqSMuYGvprl270j7;
    public ViewPropertyAnimator w0Wu95l8dVNw5rZMRu;
    public ActionBarContainer zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    static {
        int i = Build.VERSION.SDK_INT;
        LVSdrptRp9 fq3Bs0prQtLat6 = i >= 34 ? new Fq3Bs0prQtLat6() : i >= 31 ? new fi6bazFdEnPBJ() : i >= 30 ? new pJLDv0icdTgj6BPWve3wUpnLp() : i >= 29 ? new p57FoMnk3HKM7uLVmLF1zeLl() : new NsOvxcOeb6vgXelqa7wP4();
        fq3Bs0prQtLat6.ZLZeBXTMq0zDztBxtRTuCHrapQ(MCkc9XaOBWJ3kr1ZFUGL46e9N.zzpBGItXfub0yWj(0, 1, 0, 1));
        O1xDAlBZZlZdoEf747lCFHld = fq3Bs0prQtLat6.zzpBGItXfub0yWj();
        HVEwbdULInpTNa0IG = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = 0;
        this.Ca81ebIan1u = new Rect();
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = new Rect();
        this.pYmKDYlAmhudp = new Rect();
        this.ko09zE6UAgwkV = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq = pmJH8rqWIwRth8COqq.zzpBGItXfub0yWj;
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = pmjh8rqwiwrth8coqq;
        this.f6ZQsR6bPLvvCDNXOUc = pmjh8rqwiwrth8coqq;
        this.vBGA6pPLqSMuYGvprl270j7 = pmjh8rqwiwrth8coqq;
        this.TaDO7ogis3aEiWEtq = pmjh8rqwiwrth8coqq;
        this.RhfGHxtXxy0M0grmp2jkRjQg = new LJ0avg2f37zqC(0, this);
        this.qNPQb1obP7 = new ultdrl04kLWs4va76zZ2lRjrhe(this, 0);
        this.SuB3hEmTmbbRGAhtvOOmfKEon = new ultdrl04kLWs4va76zZ2lRjrhe(this, 1);
        GI83zq0G8e7zkn(context);
        this.pzqP2AqKW6J5PO8zCKnW = new mYybSD3X3KfsAbnorz7K();
        v1CDeNphu4LTAZcrLaMzXpHTxfdgq v1cdenphu4ltazcrlamzxphtxfdgq = new v1CDeNphu4LTAZcrLaMzXpHTxfdgq(context);
        v1cdenphu4ltazcrlamzxphtxfdgq.setWillNotDraw(true);
        this.aXO0LSrt8bKV = v1cdenphu4ltazcrlamzxphtxfdgq;
        addView(v1cdenphu4ltazcrlamzxphtxfdgq);
    }

    public static boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(View view, Rect rect, boolean z) {
        boolean z2;
        AI25Q5ytBRj9HgDLuHhpxq2SM3iv6 aI25Q5ytBRj9HgDLuHhpxq2SM3iv6 = (AI25Q5ytBRj9HgDLuHhpxq2SM3iv6) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) aI25Q5ytBRj9HgDLuHhpxq2SM3iv6).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) aI25Q5ytBRj9HgDLuHhpxq2SM3iv6).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) aI25Q5ytBRj9HgDLuHhpxq2SM3iv6).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) aI25Q5ytBRj9HgDLuHhpxq2SM3iv6).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) aI25Q5ytBRj9HgDLuHhpxq2SM3iv6).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) aI25Q5ytBRj9HgDLuHhpxq2SM3iv6).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) aI25Q5ytBRj9HgDLuHhpxq2SM3iv6).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) aI25Q5ytBRj9HgDLuHhpxq2SM3iv6).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    public final void GI83zq0G8e7zkn(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(vE4yDIjexsP2lGjLaTcB);
        this.V57tEvNfxZVVcOCAOih5PKr = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.NSjgqmGjEzuugn2SsG1mZFP = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.q11o1hieEkZDhF1MGOZI26oZiDT = new OverScroller(context);
    }

    public final void HzCpKshMOoaw76hFcbOVRYMeRd() {
        hMSqZXAdAtwr9Ih2G wrapper;
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x == null) {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof hMSqZXAdAtwr9Ih2G) {
                wrapper = (hMSqZXAdAtwr9Ih2G) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = wrapper;
        }
    }

    public final void KUYypEB4eNWOZWVDpH(Menu menu, DRNSD7OTZrolKY4iK67pQWIr dRNSD7OTZrolKY4iK67pQWIr) {
        HzCpKshMOoaw76hFcbOVRYMeRd();
        oD78NtkeSuRtaWUfMs1KgLg1WoWNL od78ntkesurtawufms1kglg1wownl = (oD78NtkeSuRtaWUfMs1KgLg1WoWNL) this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        Toolbar toolbar = od78ntkesurtawufms1kglg1wownl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (od78ntkesurtawufms1kglg1wownl.q1wNbhk2O6 == null) {
            od78ntkesurtawufms1kglg1wownl.q1wNbhk2O6 = new JaGiaIfgE4oZFS8GScUJb(toolbar.getContext());
        }
        JaGiaIfgE4oZFS8GScUJb jaGiaIfgE4oZFS8GScUJb = od78ntkesurtawufms1kglg1wownl.q1wNbhk2O6;
        jaGiaIfgE4oZFS8GScUJb.ZLZeBXTMq0zDztBxtRTuCHrapQ = dRNSD7OTZrolKY4iK67pQWIr;
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = (Stuu2Qyz6BSCKFEomt5b51vUnV1HQ) menu;
        if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ == null && toolbar.V57tEvNfxZVVcOCAOih5PKr == null) {
            return;
        }
        toolbar.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ2 = toolbar.V57tEvNfxZVVcOCAOih5PKr.ko09zE6UAgwkV;
        if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ2 == stuu2Qyz6BSCKFEomt5b51vUnV1HQ) {
            return;
        }
        if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ2 != null) {
            stuu2Qyz6BSCKFEomt5b51vUnV1HQ2.ko09zE6UAgwkV(toolbar.CixTK5ZX8oWXHz34qHYV);
            stuu2Qyz6BSCKFEomt5b51vUnV1HQ2.ko09zE6UAgwkV(toolbar.ymT6yQrus3w);
        }
        if (toolbar.ymT6yQrus3w == null) {
            toolbar.ymT6yQrus3w = new qE1OfTIjlj6BdfNlBJklCURi(toolbar);
        }
        jaGiaIfgE4oZFS8GScUJb.jW7EiD0YL6xkbB158jMUzhWNWb1y = true;
        if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ != null) {
            stuu2Qyz6BSCKFEomt5b51vUnV1HQ.zzpBGItXfub0yWj(jaGiaIfgE4oZFS8GScUJb, toolbar.KUYypEB4eNWOZWVDpH);
            stuu2Qyz6BSCKFEomt5b51vUnV1HQ.zzpBGItXfub0yWj(toolbar.ymT6yQrus3w, toolbar.KUYypEB4eNWOZWVDpH);
        } else {
            jaGiaIfgE4oZFS8GScUJb.ZLZeBXTMq0zDztBxtRTuCHrapQ(toolbar.KUYypEB4eNWOZWVDpH, null);
            toolbar.ymT6yQrus3w.ZLZeBXTMq0zDztBxtRTuCHrapQ(toolbar.KUYypEB4eNWOZWVDpH, null);
            jaGiaIfgE4oZFS8GScUJb.LaeGQIruHQu81hfJldjMOQSVblH3x();
            toolbar.ymT6yQrus3w.LaeGQIruHQu81hfJldjMOQSVblH3x();
        }
        toolbar.V57tEvNfxZVVcOCAOih5PKr.setPopupTheme(toolbar.q1wNbhk2O6);
        toolbar.V57tEvNfxZVVcOCAOih5PKr.setPresenter(jaGiaIfgE4oZFS8GScUJb);
        toolbar.CixTK5ZX8oWXHz34qHYV = jaGiaIfgE4oZFS8GScUJb;
        toolbar.f6ZQsR6bPLvvCDNXOUc();
    }

    @Override // com.vdodsodjsdt.L6NsbfO6KnE8o1cSViY8X
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public final void M9e7PWhFYLD2lOGMker(int i) {
        HzCpKshMOoaw76hFcbOVRYMeRd();
        if (i == 2) {
            ((oD78NtkeSuRtaWUfMs1KgLg1WoWNL) this.ZLZeBXTMq0zDztBxtRTuCHrapQ).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((oD78NtkeSuRtaWUfMs1KgLg1WoWNL) this.ZLZeBXTMq0zDztBxtRTuCHrapQ).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void NSjgqmGjEzuugn2SsG1mZFP() {
        removeCallbacks(this.qNPQb1obP7);
        removeCallbacks(this.SuB3hEmTmbbRGAhtvOOmfKEon);
        ViewPropertyAnimator viewPropertyAnimator = this.w0Wu95l8dVNw5rZMRu;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // com.vdodsodjsdt.L6NsbfO6KnE8o1cSViY8X
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // com.vdodsodjsdt.fteHovX23kcqjzpVgTB
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        LaeGQIruHQu81hfJldjMOQSVblH3x(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AI25Q5ytBRj9HgDLuHhpxq2SM3iv6;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.NSjgqmGjEzuugn2SsG1mZFP != null) {
            if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getVisibility() == 0) {
                translationY = (int) (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getTranslationY() + this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.NSjgqmGjEzuugn2SsG1mZFP.setBounds(0, translationY, getWidth(), this.NSjgqmGjEzuugn2SsG1mZFP.getIntrinsicHeight() + translationY);
            this.NSjgqmGjEzuugn2SsG1mZFP.draw(canvas);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AI25Q5ytBRj9HgDLuHhpxq2SM3iv6(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AI25Q5ytBRj9HgDLuHhpxq2SM3iv6(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        mYybSD3X3KfsAbnorz7K myybsd3x3kfsabnorz7k = this.pzqP2AqKW6J5PO8zCKnW;
        return myybsd3x3kfsabnorz7k.zzpBGItXfub0yWj | myybsd3x3kfsabnorz7k.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public CharSequence getTitle() {
        HzCpKshMOoaw76hFcbOVRYMeRd();
        return ((oD78NtkeSuRtaWUfMs1KgLg1WoWNL) this.ZLZeBXTMq0zDztBxtRTuCHrapQ).VxUQ9tBhpHJ2AAEDNW8sghc4m.getTitle();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        HzCpKshMOoaw76hFcbOVRYMeRd();
        pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ = pmJH8rqWIwRth8COqq.ZLZeBXTMq0zDztBxtRTuCHrapQ(this, windowInsets);
        boolean zZLZeBXTMq0zDztBxtRTuCHrapQ = ZLZeBXTMq0zDztBxtRTuCHrapQ(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, new Rect(pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ.zzpBGItXfub0yWj(), pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ.ZfQNn8hdWlEQ5cR94249PDsLR(), pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ.V57tEvNfxZVVcOCAOih5PKr(), pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ.VxUQ9tBhpHJ2AAEDNW8sghc4m()), false);
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Rect rect = this.Ca81ebIan1u;
        lJgFFp37ou.zzpBGItXfub0yWj(this, pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        ueiyNUHTUsoj16g9F ueiynuhtusoj16g9f = pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqqKUYypEB4eNWOZWVDpH = ueiynuhtusoj16g9f.KUYypEB4eNWOZWVDpH(i, i2, i3, i4);
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = pmjh8rqwiwrth8coqqKUYypEB4eNWOZWVDpH;
        boolean z = true;
        if (!this.f6ZQsR6bPLvvCDNXOUc.equals(pmjh8rqwiwrth8coqqKUYypEB4eNWOZWVDpH)) {
            this.f6ZQsR6bPLvvCDNXOUc = this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
            zZLZeBXTMq0zDztBxtRTuCHrapQ = true;
        }
        Rect rect2 = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        if (rect2.equals(rect)) {
            z = zZLZeBXTMq0zDztBxtRTuCHrapQ;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return ueiynuhtusoj16g9f.VxUQ9tBhpHJ2AAEDNW8sghc4m().VxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr().VxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj().zIvmSL0wzmmKGc3X39b2Gw2mUGE();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        GI83zq0G8e7zkn(getContext());
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        UFStPSj5DrcqcfR2RymfmG.V57tEvNfxZVVcOCAOih5PKr(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NSjgqmGjEzuugn2SsG1mZFP();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                AI25Q5ytBRj9HgDLuHhpxq2SM3iv6 aI25Q5ytBRj9HgDLuHhpxq2SM3iv6 = (AI25Q5ytBRj9HgDLuHhpxq2SM3iv6) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) aI25Q5ytBRj9HgDLuHhpxq2SM3iv6).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) aI25Q5ytBRj9HgDLuHhpxq2SM3iv6).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.HzCpKshMOoaw76hFcbOVRYMeRd || !z) {
            return false;
        }
        this.q11o1hieEkZDhF1MGOZI26oZiDT.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.q11o1hieEkZDhF1MGOZI26oZiDT.getFinalY() > this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getHeight()) {
            NSjgqmGjEzuugn2SsG1mZFP();
            this.SuB3hEmTmbbRGAhtvOOmfKEon.run();
        } else {
            NSjgqmGjEzuugn2SsG1mZFP();
            this.qNPQb1obP7.run();
        }
        this.KUYypEB4eNWOZWVDpH = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.q1wNbhk2O6 + i2;
        this.q1wNbhk2O6 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        L6YGERc84Mt1k8Qot l6YGERc84Mt1k8Qot;
        gXZrMY3vlni2 gxzrmy3vlni2;
        this.pzqP2AqKW6J5PO8zCKnW.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.q1wNbhk2O6 = getActionBarHideOffset();
        NSjgqmGjEzuugn2SsG1mZFP();
        zpFfthyKuYf7mRmHTpn2uBU6EqB zpffthykuyf7mrmhtpn2ubu6eqb = this.Irh5auREsoeV1C1RaBamlmy;
        if (zpffthykuyf7mrmhtpn2ubu6eqb == null || (gxzrmy3vlni2 = (l6YGERc84Mt1k8Qot = (L6YGERc84Mt1k8Qot) zpffthykuyf7mrmhtpn2ubu6eqb).aXO0LSrt8bKV) == null) {
            return;
        }
        gxzrmy3vlni2.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        l6YGERc84Mt1k8Qot.aXO0LSrt8bKV = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getVisibility() != 0) {
            return false;
        }
        return this.HzCpKshMOoaw76hFcbOVRYMeRd;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.HzCpKshMOoaw76hFcbOVRYMeRd || this.KUYypEB4eNWOZWVDpH) {
            return;
        }
        if (this.q1wNbhk2O6 <= this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getHeight()) {
            NSjgqmGjEzuugn2SsG1mZFP();
            postDelayed(this.qNPQb1obP7, 600L);
        } else {
            NSjgqmGjEzuugn2SsG1mZFP();
            postDelayed(this.SuB3hEmTmbbRGAhtvOOmfKEon, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        HzCpKshMOoaw76hFcbOVRYMeRd();
        int i2 = this.p59rPv72J9 ^ i;
        this.p59rPv72J9 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        zpFfthyKuYf7mRmHTpn2uBU6EqB zpffthykuyf7mrmhtpn2ubu6eqb = this.Irh5auREsoeV1C1RaBamlmy;
        if (zpffthykuyf7mrmhtpn2ubu6eqb != null) {
            L6YGERc84Mt1k8Qot l6YGERc84Mt1k8Qot = (L6YGERc84Mt1k8Qot) zpffthykuyf7mrmhtpn2ubu6eqb;
            l6YGERc84Mt1k8Qot.RhfGHxtXxy0M0grmp2jkRjQg = !z2;
            if (z || !z2) {
                if (l6YGERc84Mt1k8Qot.qNPQb1obP7) {
                    l6YGERc84Mt1k8Qot.qNPQb1obP7 = false;
                    l6YGERc84Mt1k8Qot.ByTQIhgl7ezGvHXEd(true);
                }
            } else if (!l6YGERc84Mt1k8Qot.qNPQb1obP7) {
                l6YGERc84Mt1k8Qot.qNPQb1obP7 = true;
                l6YGERc84Mt1k8Qot.ByTQIhgl7ezGvHXEd(true);
            }
        }
        if ((i2 & 256) == 0 || this.Irh5auREsoeV1C1RaBamlmy == null) {
            return;
        }
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        UFStPSj5DrcqcfR2RymfmG.V57tEvNfxZVVcOCAOih5PKr(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        zpFfthyKuYf7mRmHTpn2uBU6EqB zpffthykuyf7mrmhtpn2ubu6eqb = this.Irh5auREsoeV1C1RaBamlmy;
        if (zpffthykuyf7mrmhtpn2ubu6eqb != null) {
            ((L6YGERc84Mt1k8Qot) zpffthykuyf7mrmhtpn2ubu6eqb).w0Wu95l8dVNw5rZMRu = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        NSjgqmGjEzuugn2SsG1mZFP();
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setTranslationY(-Math.max(0, Math.min(i, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getHeight())));
    }

    public void setActionBarVisibilityCallback(zpFfthyKuYf7mRmHTpn2uBU6EqB zpffthykuyf7mrmhtpn2ubu6eqb) {
        this.Irh5auREsoeV1C1RaBamlmy = zpffthykuyf7mrmhtpn2ubu6eqb;
        if (getWindowToken() != null) {
            ((L6YGERc84Mt1k8Qot) this.Irh5auREsoeV1C1RaBamlmy).w0Wu95l8dVNw5rZMRu = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            int i = this.p59rPv72J9;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                UFStPSj5DrcqcfR2RymfmG.V57tEvNfxZVVcOCAOih5PKr(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.M9e7PWhFYLD2lOGMker = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.HzCpKshMOoaw76hFcbOVRYMeRd) {
            this.HzCpKshMOoaw76hFcbOVRYMeRd = z;
            if (z) {
                return;
            }
            NSjgqmGjEzuugn2SsG1mZFP();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        HzCpKshMOoaw76hFcbOVRYMeRd();
        oD78NtkeSuRtaWUfMs1KgLg1WoWNL od78ntkesurtawufms1kglg1wownl = (oD78NtkeSuRtaWUfMs1KgLg1WoWNL) this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        od78ntkesurtawufms1kglg1wownl.ZfQNn8hdWlEQ5cR94249PDsLR = i != 0 ? KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(od78ntkesurtawufms1kglg1wownl.VxUQ9tBhpHJ2AAEDNW8sghc4m.getContext(), i) : null;
        od78ntkesurtawufms1kglg1wownl.V57tEvNfxZVVcOCAOih5PKr();
    }

    public void setLogo(int i) {
        HzCpKshMOoaw76hFcbOVRYMeRd();
        oD78NtkeSuRtaWUfMs1KgLg1WoWNL od78ntkesurtawufms1kglg1wownl = (oD78NtkeSuRtaWUfMs1KgLg1WoWNL) this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        od78ntkesurtawufms1kglg1wownl.LaeGQIruHQu81hfJldjMOQSVblH3x = i != 0 ? KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(od78ntkesurtawufms1kglg1wownl.VxUQ9tBhpHJ2AAEDNW8sghc4m.getContext(), i) : null;
        od78ntkesurtawufms1kglg1wownl.V57tEvNfxZVVcOCAOih5PKr();
    }

    public void setOverlayMode(boolean z) {
        this.GI83zq0G8e7zkn = z;
    }

    @Override // com.vdodsodjsdt.b7tXVJgFVKMR70Bq4h4cKeMdWq
    public void setWindowCallback(Window.Callback callback) {
        HzCpKshMOoaw76hFcbOVRYMeRd();
        ((oD78NtkeSuRtaWUfMs1KgLg1WoWNL) this.ZLZeBXTMq0zDztBxtRTuCHrapQ).HzCpKshMOoaw76hFcbOVRYMeRd = callback;
    }

    @Override // com.vdodsodjsdt.b7tXVJgFVKMR70Bq4h4cKeMdWq
    public void setWindowTitle(CharSequence charSequence) {
        HzCpKshMOoaw76hFcbOVRYMeRd();
        oD78NtkeSuRtaWUfMs1KgLg1WoWNL od78ntkesurtawufms1kglg1wownl = (oD78NtkeSuRtaWUfMs1KgLg1WoWNL) this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (od78ntkesurtawufms1kglg1wownl.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            return;
        }
        Toolbar toolbar = od78ntkesurtawufms1kglg1wownl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        od78ntkesurtawufms1kglg1wownl.NSjgqmGjEzuugn2SsG1mZFP = charSequence;
        if ((od78ntkesurtawufms1kglg1wownl.zzpBGItXfub0yWj & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (od78ntkesurtawufms1kglg1wownl.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                xb0r6yEzq0tw9m7nTWG5BFR8.p59rPv72J9(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // com.vdodsodjsdt.L6NsbfO6KnE8o1cSViY8X
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // com.vdodsodjsdt.L6NsbfO6KnE8o1cSViY8X
    public final void zzpBGItXfub0yWj(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new AI25Q5ytBRj9HgDLuHhpxq2SM3iv6(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        HzCpKshMOoaw76hFcbOVRYMeRd();
        oD78NtkeSuRtaWUfMs1KgLg1WoWNL od78ntkesurtawufms1kglg1wownl = (oD78NtkeSuRtaWUfMs1KgLg1WoWNL) this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        od78ntkesurtawufms1kglg1wownl.ZfQNn8hdWlEQ5cR94249PDsLR = drawable;
        od78ntkesurtawufms1kglg1wownl.V57tEvNfxZVVcOCAOih5PKr();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // com.vdodsodjsdt.L6NsbfO6KnE8o1cSViY8X
    public final void V57tEvNfxZVVcOCAOih5PKr(View view, int i, int i2, int[] iArr, int i3) {
    }
}
