package com.vdodsodjsdt;

import android.content.res.ColorStateList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class fNlVNn0Im30 extends VM6CSprlZdb {
    public static final int[][] GI83zq0G8e7zkn = {new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public boolean NSjgqmGjEzuugn2SsG1mZFP;
    public ColorStateList ZLZeBXTMq0zDztBxtRTuCHrapQ;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
            int iVBGA6pPLqSMuYGvprl270j7 = zonOxHotd3BwAPJcwqr6I6uQNngg4.vBGA6pPLqSMuYGvprl270j7(this, R.attr.colorControlActivated);
            int iVBGA6pPLqSMuYGvprl270j72 = zonOxHotd3BwAPJcwqr6I6uQNngg4.vBGA6pPLqSMuYGvprl270j7(this, R.attr.colorOnSurface);
            int iVBGA6pPLqSMuYGvprl270j73 = zonOxHotd3BwAPJcwqr6I6uQNngg4.vBGA6pPLqSMuYGvprl270j7(this, R.attr.colorSurface);
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new ColorStateList(GI83zq0G8e7zkn, new int[]{zonOxHotd3BwAPJcwqr6I6uQNngg4.iKANjmyTSxO6v6UuLPdu7DxOjlS(iVBGA6pPLqSMuYGvprl270j73, iVBGA6pPLqSMuYGvprl270j7, 1.0f), zonOxHotd3BwAPJcwqr6I6uQNngg4.iKANjmyTSxO6v6UuLPdu7DxOjlS(iVBGA6pPLqSMuYGvprl270j73, iVBGA6pPLqSMuYGvprl270j72, 0.54f), zonOxHotd3BwAPJcwqr6I6uQNngg4.iKANjmyTSxO6v6UuLPdu7DxOjlS(iVBGA6pPLqSMuYGvprl270j73, iVBGA6pPLqSMuYGvprl270j72, 0.38f), zonOxHotd3BwAPJcwqr6I6uQNngg4.iKANjmyTSxO6v6UuLPdu7DxOjlS(iVBGA6pPLqSMuYGvprl270j73, iVBGA6pPLqSMuYGvprl270j72, 0.38f)});
        }
        return this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.NSjgqmGjEzuugn2SsG1mZFP && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.NSjgqmGjEzuugn2SsG1mZFP = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
