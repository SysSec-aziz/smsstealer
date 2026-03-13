package com.vdodsodjsdt;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class gqbNFvdPpZQMgIePeLMi extends uLXxmkdsO6wfrm implements gVeEGsRwgJnjS {
    public static final Method O1xDAlBZZlZdoEf747lCFHld;
    public Skgk8FYn8b4TvRiBOsElZw4XkNLhQ vE4yDIjexsP2lGjLaTcB;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                O1xDAlBZZlZdoEf747lCFHld = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // com.vdodsodjsdt.gVeEGsRwgJnjS
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ, rkuo6pAmWq0N rkuo6pamwq0n) {
        Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ = this.vE4yDIjexsP2lGjLaTcB;
        if (skgk8FYn8b4TvRiBOsElZw4XkNLhQ != null) {
            skgk8FYn8b4TvRiBOsElZw4XkNLhQ.LaeGQIruHQu81hfJldjMOQSVblH3x(stuu2Qyz6BSCKFEomt5b51vUnV1HQ, rkuo6pamwq0n);
        }
    }

    @Override // com.vdodsodjsdt.gVeEGsRwgJnjS
    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ, MenuItem menuItem) {
        Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ = this.vE4yDIjexsP2lGjLaTcB;
        if (skgk8FYn8b4TvRiBOsElZw4XkNLhQ != null) {
            skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZLZeBXTMq0zDztBxtRTuCHrapQ(stuu2Qyz6BSCKFEomt5b51vUnV1HQ, menuItem);
        }
    }

    @Override // com.vdodsodjsdt.uLXxmkdsO6wfrm
    public final aVXgxTePUTvRAcd pYmKDYlAmhudp(Context context, boolean z) {
        PP95XwqvbwC pP95XwqvbwC = new PP95XwqvbwC(context, z);
        pP95XwqvbwC.setHoverListener(this);
        return pP95XwqvbwC;
    }
}
