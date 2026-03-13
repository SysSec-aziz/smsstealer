package com.vdodsodjsdt;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class aVXgxTePUTvRAcd extends ListView {
    public fMwhxJc7yMBVUZtrUxwbeH GI83zq0G8e7zkn;
    public final boolean HzCpKshMOoaw76hFcbOVRYMeRd;
    public boolean KUYypEB4eNWOZWVDpH;
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public boolean M9e7PWhFYLD2lOGMker;
    public int NSjgqmGjEzuugn2SsG1mZFP;
    public final Rect V57tEvNfxZVVcOCAOih5PKr;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public RfOSIaL6qUBGKJY9MSCBP5ba p59rPv72J9;
    public Jnf7ke6iPNQA q1wNbhk2O6;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public aVXgxTePUTvRAcd(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.V57tEvNfxZVVcOCAOih5PKr = new Rect();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = 0;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = z;
        setCacheColorHint(0);
    }

    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.V57tEvNfxZVVcOCAOih5PKr;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.p59rPv72J9 != null) {
            return;
        }
        super.drawableStateChanged();
        fMwhxJc7yMBVUZtrUxwbeH fmwhxjc7ymbvuztruxwbeh = this.GI83zq0G8e7zkn;
        if (fmwhxjc7ymbvuztruxwbeh != null) {
            fmwhxjc7ymbvuztruxwbeh.ZfQNn8hdWlEQ5cR94249PDsLR = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.KUYypEB4eNWOZWVDpH && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.HzCpKshMOoaw76hFcbOVRYMeRd || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.HzCpKshMOoaw76hFcbOVRYMeRd || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.HzCpKshMOoaw76hFcbOVRYMeRd || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.HzCpKshMOoaw76hFcbOVRYMeRd && this.M9e7PWhFYLD2lOGMker) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.p59rPv72J9 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.p59rPv72J9 == null) {
            RfOSIaL6qUBGKJY9MSCBP5ba rfOSIaL6qUBGKJY9MSCBP5ba = new RfOSIaL6qUBGKJY9MSCBP5ba(4, this);
            this.p59rPv72J9 = rfOSIaL6qUBGKJY9MSCBP5ba;
            post(rfOSIaL6qUBGKJY9MSCBP5ba);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !VMVKlMvIA9bBQiyI5bnb.ZfQNn8hdWlEQ5cR94249PDsLR) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        VMVKlMvIA9bBQiyI5bnb.VxUQ9tBhpHJ2AAEDNW8sghc4m.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        VMVKlMvIA9bBQiyI5bnb.zzpBGItXfub0yWj.invoke(this, Integer.valueOf(iPointToPosition));
                        VMVKlMvIA9bBQiyI5bnb.V57tEvNfxZVVcOCAOih5PKr.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.KUYypEB4eNWOZWVDpH && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.NSjgqmGjEzuugn2SsG1mZFP = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RfOSIaL6qUBGKJY9MSCBP5ba rfOSIaL6qUBGKJY9MSCBP5ba = this.p59rPv72J9;
        if (rfOSIaL6qUBGKJY9MSCBP5ba != null) {
            aVXgxTePUTvRAcd avxgxteputvracd = (aVXgxTePUTvRAcd) rfOSIaL6qUBGKJY9MSCBP5ba.ZfQNn8hdWlEQ5cR94249PDsLR;
            avxgxteputvracd.p59rPv72J9 = null;
            avxgxteputvracd.removeCallbacks(rfOSIaL6qUBGKJY9MSCBP5ba);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.M9e7PWhFYLD2lOGMker = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        fMwhxJc7yMBVUZtrUxwbeH fmwhxjc7ymbvuztruxwbeh;
        if (drawable != null) {
            fmwhxjc7ymbvuztruxwbeh = new fMwhxJc7yMBVUZtrUxwbeH();
            Drawable drawable2 = fmwhxjc7ymbvuztruxwbeh.V57tEvNfxZVVcOCAOih5PKr;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            fmwhxjc7ymbvuztruxwbeh.V57tEvNfxZVVcOCAOih5PKr = drawable;
            if (drawable != null) {
                drawable.setCallback(fmwhxjc7ymbvuztruxwbeh);
            }
            fmwhxjc7ymbvuztruxwbeh.ZfQNn8hdWlEQ5cR94249PDsLR = true;
        } else {
            fmwhxjc7ymbvuztruxwbeh = null;
        }
        this.GI83zq0G8e7zkn = fmwhxjc7ymbvuztruxwbeh;
        super.setSelector(fmwhxjc7ymbvuztruxwbeh);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR = rect.left;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = rect.top;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = rect.right;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = rect.bottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzpBGItXfub0yWj(android.view.MotionEvent r18, int r19) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.aVXgxTePUTvRAcd.zzpBGItXfub0yWj(android.view.MotionEvent, int):boolean");
    }
}
