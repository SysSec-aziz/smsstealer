package com.vdodsodjsdt;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class XrxS7UXDddQ4lx extends ej6unYlOWMDF {
    public final /* synthetic */ int KUYypEB4eNWOZWVDpH;

    public /* synthetic */ XrxS7UXDddQ4lx(int i) {
        this.KUYypEB4eNWOZWVDpH = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vdodsodjsdt.ej6unYlOWMDF
    public final void H2VFYNJEVGAX(dqrRplqyPGe dqrrplqypge, float f) {
        switch (this.KUYypEB4eNWOZWVDpH) {
            case 0:
                ((View) dqrrplqypge).setAlpha(f);
                break;
            case 1:
                ((View) dqrrplqypge).setScaleX(f);
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                ((View) dqrrplqypge).setScaleY(f);
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                ((View) dqrrplqypge).setRotation(f);
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                ((View) dqrrplqypge).setRotationX(f);
                break;
            default:
                ((View) dqrrplqypge).setRotationY(f);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vdodsodjsdt.ej6unYlOWMDF
    public final float vE4yDIjexsP2lGjLaTcB(dqrRplqyPGe dqrrplqypge) {
        switch (this.KUYypEB4eNWOZWVDpH) {
            case 0:
                return ((View) dqrrplqypge).getAlpha();
            case 1:
                return ((View) dqrrplqypge).getScaleX();
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                return ((View) dqrrplqypge).getScaleY();
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                return ((View) dqrrplqypge).getRotation();
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                return ((View) dqrrplqypge).getRotationX();
            default:
                return ((View) dqrrplqypge).getRotationY();
        }
    }
}
