package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class GHjuTOKsU93p3o6Pd0TxhwLWCTN implements Window.Callback {
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final Window.Callback V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ BbqUXujjobWQwx4SY ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public boolean ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public GHjuTOKsU93p3o6Pd0TxhwLWCTN(BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY, Window.Callback callback) {
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = bbqUXujjobWQwx4SY;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.V57tEvNfxZVVcOCAOih5PKr = callback;
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(int i, Menu menu) {
        this.V57tEvNfxZVVcOCAOih5PKr.onPanelClosed(i, menu);
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(Window.Callback callback) {
        try {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = true;
            callback.onContentChanged();
        } finally {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = false;
        }
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(List list, Menu menu, int i) {
        KkUBiSOZKaLCskLxCT.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.V57tEvNfxZVVcOCAOih5PKr, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.V57tEvNfxZVVcOCAOih5PKr.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        Window.Callback callback = this.V57tEvNfxZVVcOCAOih5PKr;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.ZLZeBXTMq0zDztBxtRTuCHrapQ.f6ZQsR6bPLvvCDNXOUc(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.V57tEvNfxZVVcOCAOih5PKr
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r7.getKeyCode()
            com.vdodsodjsdt.BbqUXujjobWQwx4SY r2 = r6.ZLZeBXTMq0zDztBxtRTuCHrapQ
            r2.RhfGHxtXxy0M0grmp2jkRjQg()
            com.vdodsodjsdt.L6YGERc84Mt1k8Qot r3 = r2.pYmKDYlAmhudp
            r4 = 0
            if (r3 == 0) goto L3d
            com.vdodsodjsdt.o5aslAe0MSDYR693jbn r3 = r3.f6ZQsR6bPLvvCDNXOUc
            if (r3 != 0) goto L1d
        L1b:
            r0 = r4
            goto L39
        L1d:
            com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ r3 = r3.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            if (r3 == 0) goto L1b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L31
            r5 = r1
            goto L32
        L31:
            r5 = r4
        L32:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r7 = r1
            goto L6b
        L3d:
            com.vdodsodjsdt.Wi6Xv9fVcEv2ynXTQIkU r0 = r2.wRCD0SdqWCowdYU7bmzN
            if (r0 == 0) goto L52
            int r3 = r7.getKeyCode()
            boolean r0 = r2.vE4yDIjexsP2lGjLaTcB(r0, r3, r7)
            if (r0 == 0) goto L52
            com.vdodsodjsdt.Wi6Xv9fVcEv2ynXTQIkU r7 = r2.wRCD0SdqWCowdYU7bmzN
            if (r7 == 0) goto L3b
            r7.KUYypEB4eNWOZWVDpH = r1
            goto L3b
        L52:
            com.vdodsodjsdt.Wi6Xv9fVcEv2ynXTQIkU r0 = r2.wRCD0SdqWCowdYU7bmzN
            if (r0 != 0) goto L6a
            com.vdodsodjsdt.Wi6Xv9fVcEv2ynXTQIkU r0 = r2.w0Wu95l8dVNw5rZMRu(r4)
            r2.O1xDAlBZZlZdoEf747lCFHld(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.vE4yDIjexsP2lGjLaTcB(r0, r3, r7)
            r0.HzCpKshMOoaw76hFcbOVRYMeRd = r4
            if (r7 == 0) goto L6a
            goto L3b
        L6a:
            r7 = r4
        L6b:
            if (r7 == 0) goto L6e
            goto L6f
        L6e:
            return r4
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.GHjuTOKsU93p3o6Pd0TxhwLWCTN.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.V57tEvNfxZVVcOCAOih5PKr.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.V57tEvNfxZVVcOCAOih5PKr.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.V57tEvNfxZVVcOCAOih5PKr.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.V57tEvNfxZVVcOCAOih5PKr.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.V57tEvNfxZVVcOCAOih5PKr.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.V57tEvNfxZVVcOCAOih5PKr.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            this.V57tEvNfxZVVcOCAOih5PKr.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof Stuu2Qyz6BSCKFEomt5b51vUnV1HQ)) {
            return this.V57tEvNfxZVVcOCAOih5PKr.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.V57tEvNfxZVVcOCAOih5PKr.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.V57tEvNfxZVVcOCAOih5PKr.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.V57tEvNfxZVVcOCAOih5PKr.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        zzpBGItXfub0yWj(i, menu);
        if (i == 108) {
            BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            bbqUXujjobWQwx4SY.RhfGHxtXxy0M0grmp2jkRjQg();
            L6YGERc84Mt1k8Qot l6YGERc84Mt1k8Qot = bbqUXujjobWQwx4SY.pYmKDYlAmhudp;
            if (l6YGERc84Mt1k8Qot != null) {
                ArrayList arrayList = l6YGERc84Mt1k8Qot.q11o1hieEkZDhF1MGOZI26oZiDT;
                if (true != l6YGERc84Mt1k8Qot.Irh5auREsoeV1C1RaBamlmy) {
                    l6YGERc84Mt1k8Qot.Irh5auREsoeV1C1RaBamlmy = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            this.V57tEvNfxZVVcOCAOih5PKr.onPanelClosed(i, menu);
            return;
        }
        V57tEvNfxZVVcOCAOih5PKr(i, menu);
        BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (i != 108) {
            if (i == 0) {
                Wi6Xv9fVcEv2ynXTQIkU wi6Xv9fVcEv2ynXTQIkUW0Wu95l8dVNw5rZMRu = bbqUXujjobWQwx4SY.w0Wu95l8dVNw5rZMRu(i);
                if (wi6Xv9fVcEv2ynXTQIkUW0Wu95l8dVNw5rZMRu.q1wNbhk2O6) {
                    bbqUXujjobWQwx4SY.ko09zE6UAgwkV(wi6Xv9fVcEv2ynXTQIkUW0Wu95l8dVNw5rZMRu, false);
                    return;
                }
                return;
            }
            return;
        }
        bbqUXujjobWQwx4SY.RhfGHxtXxy0M0grmp2jkRjQg();
        L6YGERc84Mt1k8Qot l6YGERc84Mt1k8Qot = bbqUXujjobWQwx4SY.pYmKDYlAmhudp;
        if (l6YGERc84Mt1k8Qot != null) {
            ArrayList arrayList = l6YGERc84Mt1k8Qot.q11o1hieEkZDhF1MGOZI26oZiDT;
            if (l6YGERc84Mt1k8Qot.Irh5auREsoeV1C1RaBamlmy) {
                l6YGERc84Mt1k8Qot.Irh5auREsoeV1C1RaBamlmy = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        fAjsKPBQrkahKlke.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.V57tEvNfxZVVcOCAOih5PKr, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = menu instanceof Stuu2Qyz6BSCKFEomt5b51vUnV1HQ ? (Stuu2Qyz6BSCKFEomt5b51vUnV1HQ) menu : null;
        if (i == 0 && stuu2Qyz6BSCKFEomt5b51vUnV1HQ == null) {
            return false;
        }
        if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ != null) {
            stuu2Qyz6BSCKFEomt5b51vUnV1HQ.q11o1hieEkZDhF1MGOZI26oZiDT = true;
        }
        boolean zOnPreparePanel = this.V57tEvNfxZVVcOCAOih5PKr.onPreparePanel(i, view, menu);
        if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ != null) {
            stuu2Qyz6BSCKFEomt5b51vUnV1HQ.q11o1hieEkZDhF1MGOZI26oZiDT = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.w0Wu95l8dVNw5rZMRu(0).NSjgqmGjEzuugn2SsG1mZFP;
        if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ != null) {
            ZfQNn8hdWlEQ5cR94249PDsLR(list, stuu2Qyz6BSCKFEomt5b51vUnV1HQ, i);
        } else {
            ZfQNn8hdWlEQ5cR94249PDsLR(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return GFuBVFa0WZ2xXP3U.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.V57tEvNfxZVVcOCAOih5PKr, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.V57tEvNfxZVVcOCAOih5PKr.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.V57tEvNfxZVVcOCAOih5PKr.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (!bbqUXujjobWQwx4SY.SuB3hEmTmbbRGAhtvOOmfKEon || i != 0) {
            return GFuBVFa0WZ2xXP3U.zzpBGItXfub0yWj(this.V57tEvNfxZVVcOCAOih5PKr, callback, i);
        }
        Context context = bbqUXujjobWQwx4SY.q1wNbhk2O6;
        nMRZPpfLCgJyuB nmrzppflcgjyub = new nMRZPpfLCgJyuB(context, callback);
        KoccBHOLe4XJgL koccBHOLe4XJgL = bbqUXujjobWQwx4SY.Irh5auREsoeV1C1RaBamlmy;
        if (koccBHOLe4XJgL != null) {
            koccBHOLe4XJgL.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        dXZw8zZnRXsRIYJEIdZC dxzw8zznrxsriyjeidzc = new dXZw8zZnRXsRIYJEIdZC();
        dxzw8zznrxsriyjeidzc.ZfQNn8hdWlEQ5cR94249PDsLR = bbqUXujjobWQwx4SY;
        dxzw8zznrxsriyjeidzc.V57tEvNfxZVVcOCAOih5PKr = nmrzppflcgjyub;
        bbqUXujjobWQwx4SY.RhfGHxtXxy0M0grmp2jkRjQg();
        L6YGERc84Mt1k8Qot l6YGERc84Mt1k8Qot = bbqUXujjobWQwx4SY.pYmKDYlAmhudp;
        int i2 = 1;
        if (l6YGERc84Mt1k8Qot != null) {
            o5aslAe0MSDYR693jbn o5aslae0msdyr693jbn = l6YGERc84Mt1k8Qot.f6ZQsR6bPLvvCDNXOUc;
            if (o5aslae0msdyr693jbn != null) {
                o5aslae0msdyr693jbn.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            }
            l6YGERc84Mt1k8Qot.p59rPv72J9.setHideOnContentScrollEnabled(false);
            l6YGERc84Mt1k8Qot.pYmKDYlAmhudp.LaeGQIruHQu81hfJldjMOQSVblH3x();
            o5aslAe0MSDYR693jbn o5aslae0msdyr693jbn2 = new o5aslAe0MSDYR693jbn(l6YGERc84Mt1k8Qot, l6YGERc84Mt1k8Qot.pYmKDYlAmhudp.getContext(), dxzw8zznrxsriyjeidzc);
            Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = o5aslae0msdyr693jbn2.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            stuu2Qyz6BSCKFEomt5b51vUnV1HQ.Irh5auREsoeV1C1RaBamlmy();
            try {
                if (((nMRZPpfLCgJyuB) o5aslae0msdyr693jbn2.ZLZeBXTMq0zDztBxtRTuCHrapQ.V57tEvNfxZVVcOCAOih5PKr).ko09zE6UAgwkV(o5aslae0msdyr693jbn2, stuu2Qyz6BSCKFEomt5b51vUnV1HQ)) {
                    l6YGERc84Mt1k8Qot.f6ZQsR6bPLvvCDNXOUc = o5aslae0msdyr693jbn2;
                    o5aslae0msdyr693jbn2.ZLZeBXTMq0zDztBxtRTuCHrapQ();
                    l6YGERc84Mt1k8Qot.pYmKDYlAmhudp.V57tEvNfxZVVcOCAOih5PKr(o5aslae0msdyr693jbn2);
                    l6YGERc84Mt1k8Qot.rE05n5RsRkyWKIeA9cmLXAKv4Hze(true);
                } else {
                    o5aslae0msdyr693jbn2 = null;
                }
                bbqUXujjobWQwx4SY.Irh5auREsoeV1C1RaBamlmy = o5aslae0msdyr693jbn2;
            } finally {
                stuu2Qyz6BSCKFEomt5b51vUnV1HQ.TaDO7ogis3aEiWEtq();
            }
        }
        if (bbqUXujjobWQwx4SY.Irh5auREsoeV1C1RaBamlmy == null) {
            d9uIUa0qhR0HmxFMet d9uiua0qhr0hmxfmet = bbqUXujjobWQwx4SY.qNPQb1obP7;
            if (d9uiua0qhr0hmxfmet != null) {
                d9uiua0qhr0hmxfmet.zzpBGItXfub0yWj();
            }
            KoccBHOLe4XJgL koccBHOLe4XJgL2 = bbqUXujjobWQwx4SY.Irh5auREsoeV1C1RaBamlmy;
            if (koccBHOLe4XJgL2 != null) {
                koccBHOLe4XJgL2.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            }
            if (bbqUXujjobWQwx4SY.q11o1hieEkZDhF1MGOZI26oZiDT == null) {
                if (bbqUXujjobWQwx4SY.d9zDyyznnp3oaDT1Ug) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        KCzdBImvv2 kCzdBImvv2 = new KCzdBImvv2(context, 0);
                        kCzdBImvv2.getTheme().setTo(themeNewTheme);
                        context = kCzdBImvv2;
                    }
                    bbqUXujjobWQwx4SY.q11o1hieEkZDhF1MGOZI26oZiDT = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    bbqUXujjobWQwx4SY.w0Wu95l8dVNw5rZMRu = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    bbqUXujjobWQwx4SY.w0Wu95l8dVNw5rZMRu.setContentView(bbqUXujjobWQwx4SY.q11o1hieEkZDhF1MGOZI26oZiDT);
                    bbqUXujjobWQwx4SY.w0Wu95l8dVNw5rZMRu.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    bbqUXujjobWQwx4SY.q11o1hieEkZDhF1MGOZI26oZiDT.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    bbqUXujjobWQwx4SY.w0Wu95l8dVNw5rZMRu.setHeight(-2);
                    bbqUXujjobWQwx4SY.RhfGHxtXxy0M0grmp2jkRjQg = new BOLnrr2jCIFL4gTrjk5BSGxFMgD9(bbqUXujjobWQwx4SY, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) bbqUXujjobWQwx4SY.aXO0LSrt8bKV.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        bbqUXujjobWQwx4SY.RhfGHxtXxy0M0grmp2jkRjQg();
                        L6YGERc84Mt1k8Qot l6YGERc84Mt1k8Qot2 = bbqUXujjobWQwx4SY.pYmKDYlAmhudp;
                        Context contextP6bBrs4p3Ly = l6YGERc84Mt1k8Qot2 != null ? l6YGERc84Mt1k8Qot2.p6bBrs4p3Ly() : null;
                        if (contextP6bBrs4p3Ly != null) {
                            context = contextP6bBrs4p3Ly;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        bbqUXujjobWQwx4SY.q11o1hieEkZDhF1MGOZI26oZiDT = (ActionBarContextView) viewStubCompat.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                    }
                }
            }
            if (bbqUXujjobWQwx4SY.q11o1hieEkZDhF1MGOZI26oZiDT != null) {
                d9uIUa0qhR0HmxFMet d9uiua0qhr0hmxfmet2 = bbqUXujjobWQwx4SY.qNPQb1obP7;
                if (d9uiua0qhr0hmxfmet2 != null) {
                    d9uiua0qhr0hmxfmet2.zzpBGItXfub0yWj();
                }
                bbqUXujjobWQwx4SY.q11o1hieEkZDhF1MGOZI26oZiDT.LaeGQIruHQu81hfJldjMOQSVblH3x();
                Context context2 = bbqUXujjobWQwx4SY.q11o1hieEkZDhF1MGOZI26oZiDT.getContext();
                ActionBarContextView actionBarContextView = bbqUXujjobWQwx4SY.q11o1hieEkZDhF1MGOZI26oZiDT;
                CER2zks3MPiNaFN cER2zks3MPiNaFN = new CER2zks3MPiNaFN();
                cER2zks3MPiNaFN.LaeGQIruHQu81hfJldjMOQSVblH3x = context2;
                cER2zks3MPiNaFN.zIvmSL0wzmmKGc3X39b2Gw2mUGE = actionBarContextView;
                cER2zks3MPiNaFN.ZLZeBXTMq0zDztBxtRTuCHrapQ = dxzw8zznrxsriyjeidzc;
                Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ2 = new Stuu2Qyz6BSCKFEomt5b51vUnV1HQ(actionBarContextView.getContext());
                stuu2Qyz6BSCKFEomt5b51vUnV1HQ2.KUYypEB4eNWOZWVDpH = 1;
                cER2zks3MPiNaFN.M9e7PWhFYLD2lOGMker = stuu2Qyz6BSCKFEomt5b51vUnV1HQ2;
                stuu2Qyz6BSCKFEomt5b51vUnV1HQ2.LaeGQIruHQu81hfJldjMOQSVblH3x = cER2zks3MPiNaFN;
                if (nmrzppflcgjyub.ko09zE6UAgwkV(cER2zks3MPiNaFN, stuu2Qyz6BSCKFEomt5b51vUnV1HQ2)) {
                    cER2zks3MPiNaFN.ZLZeBXTMq0zDztBxtRTuCHrapQ();
                    bbqUXujjobWQwx4SY.q11o1hieEkZDhF1MGOZI26oZiDT.V57tEvNfxZVVcOCAOih5PKr(cER2zks3MPiNaFN);
                    bbqUXujjobWQwx4SY.Irh5auREsoeV1C1RaBamlmy = cER2zks3MPiNaFN;
                    if (bbqUXujjobWQwx4SY.pzqP2AqKW6J5PO8zCKnW && (viewGroup = bbqUXujjobWQwx4SY.aXO0LSrt8bKV) != null && viewGroup.isLaidOut()) {
                        bbqUXujjobWQwx4SY.q11o1hieEkZDhF1MGOZI26oZiDT.setAlpha(0.0f);
                        d9uIUa0qhR0HmxFMet d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m(bbqUXujjobWQwx4SY.q11o1hieEkZDhF1MGOZI26oZiDT);
                        d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m(1.0f);
                        bbqUXujjobWQwx4SY.qNPQb1obP7 = d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m;
                        d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR(new JUf5e0Z4Cc(i2, bbqUXujjobWQwx4SY));
                    } else {
                        bbqUXujjobWQwx4SY.q11o1hieEkZDhF1MGOZI26oZiDT.setAlpha(1.0f);
                        bbqUXujjobWQwx4SY.q11o1hieEkZDhF1MGOZI26oZiDT.setVisibility(0);
                        if (bbqUXujjobWQwx4SY.q11o1hieEkZDhF1MGOZI26oZiDT.getParent() instanceof View) {
                            View view = (View) bbqUXujjobWQwx4SY.q11o1hieEkZDhF1MGOZI26oZiDT.getParent();
                            WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                            UFStPSj5DrcqcfR2RymfmG.V57tEvNfxZVVcOCAOih5PKr(view);
                        }
                    }
                    if (bbqUXujjobWQwx4SY.w0Wu95l8dVNw5rZMRu != null) {
                        bbqUXujjobWQwx4SY.p59rPv72J9.getDecorView().post(bbqUXujjobWQwx4SY.RhfGHxtXxy0M0grmp2jkRjQg);
                    }
                } else {
                    bbqUXujjobWQwx4SY.Irh5auREsoeV1C1RaBamlmy = null;
                }
            }
            bbqUXujjobWQwx4SY.y1NaPKTl7R18DOr6e8i5();
            bbqUXujjobWQwx4SY.Irh5auREsoeV1C1RaBamlmy = bbqUXujjobWQwx4SY.Irh5auREsoeV1C1RaBamlmy;
        }
        bbqUXujjobWQwx4SY.y1NaPKTl7R18DOr6e8i5();
        KoccBHOLe4XJgL koccBHOLe4XJgL3 = bbqUXujjobWQwx4SY.Irh5auREsoeV1C1RaBamlmy;
        if (koccBHOLe4XJgL3 != null) {
            return nmrzppflcgjyub.GI83zq0G8e7zkn(koccBHOLe4XJgL3);
        }
        return null;
    }

    public final boolean zzpBGItXfub0yWj(int i, Menu menu) {
        return this.V57tEvNfxZVVcOCAOih5PKr.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.V57tEvNfxZVVcOCAOih5PKr.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
