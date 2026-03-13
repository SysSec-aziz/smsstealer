package com.vdodsodjsdt;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class PHkrA4TK1mlS6GdfRS6 implements View.OnClickListener {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ Object ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ PHkrA4TK1mlS6GdfRS6(int i, Object obj) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                dyLlvOXBIY6 dyllvoxbiy6 = (dyLlvOXBIY6) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                EditText editText = dyllvoxbiy6.GI83zq0G8e7zkn;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                dyllvoxbiy6.h3jnZRsdwYJfY9UhQCkbvWciwvFHv();
                return;
            case 1:
                ((hbsUcFELqptC4ZZnom4xRs0eGoz) this.ZfQNn8hdWlEQ5cR94249PDsLR).f6ZQsR6bPLvvCDNXOUc();
                return;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                ((w2TYlQMpBW0H) this.ZfQNn8hdWlEQ5cR94249PDsLR).HVEwbdULInpTNa0IG();
                throw null;
            default:
                ENPstRE1SQN0tJz7UtXAM eNPstRE1SQN0tJz7UtXAM = (ENPstRE1SQN0tJz7UtXAM) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                EditText editText2 = eNPstRE1SQN0tJz7UtXAM.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = eNPstRE1SQN0tJz7UtXAM.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    eNPstRE1SQN0tJz7UtXAM.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    eNPstRE1SQN0tJz7UtXAM.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    eNPstRE1SQN0tJz7UtXAM.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setSelection(selectionEnd);
                }
                eNPstRE1SQN0tJz7UtXAM.h3jnZRsdwYJfY9UhQCkbvWciwvFHv();
                return;
        }
    }
}
