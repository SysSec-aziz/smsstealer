package com.vdodsodjsdt;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ENPstRE1SQN0tJz7UtXAM extends OzHnlNexFQgT2W4 {
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final PHkrA4TK1mlS6GdfRS6 ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public EditText zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public ENPstRE1SQN0tJz7UtXAM(eswEmxJomeZU eswemxjomezu, int i) {
        super(eswemxjomezu);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = R.drawable.design_password_eye;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new PHkrA4TK1mlS6GdfRS6(3, this);
        if (i != 0) {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = i;
        }
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final boolean HzCpKshMOoaw76hFcbOVRYMeRd() {
        EditText editText = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final void KUYypEB4eNWOZWVDpH(EditText editText) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = editText;
        h3jnZRsdwYJfY9UhQCkbvWciwvFHv();
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final boolean M9e7PWhFYLD2lOGMker() {
        return true;
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final int V57tEvNfxZVVcOCAOih5PKr() {
        return R.string.password_toggle_content_description;
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final int ZfQNn8hdWlEQ5cR94249PDsLR() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final void ko09zE6UAgwkV() {
        EditText editText = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final void pYmKDYlAmhudp() {
        EditText editText = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final View.OnClickListener zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        return this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final void zzpBGItXfub0yWj() {
        h3jnZRsdwYJfY9UhQCkbvWciwvFHv();
    }
}
