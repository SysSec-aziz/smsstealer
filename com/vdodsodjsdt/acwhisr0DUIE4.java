package com.vdodsodjsdt;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class acwhisr0DUIE4 implements View.OnClickListener {
    public Method LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final View V57tEvNfxZVVcOCAOih5PKr;
    public final String ZfQNn8hdWlEQ5cR94249PDsLR;
    public Context zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public acwhisr0DUIE4(View view, String str) {
        this.V57tEvNfxZVVcOCAOih5PKr = view;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x == null) {
            View view2 = this.V57tEvNfxZVVcOCAOih5PKr;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder sbKUYypEB4eNWOZWVDpH = u9SlVAuoWhQUfJ.KUYypEB4eNWOZWVDpH("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbKUYypEB4eNWOZWVDpH.append(view2.getClass());
                    sbKUYypEB4eNWOZWVDpH.append(str);
                    throw new IllegalStateException(sbKUYypEB4eNWOZWVDpH.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.LaeGQIruHQu81hfJldjMOQSVblH3x = method;
                        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x.invoke(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
