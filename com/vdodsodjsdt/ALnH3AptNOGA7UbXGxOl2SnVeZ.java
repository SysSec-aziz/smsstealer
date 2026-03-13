package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ALnH3AptNOGA7UbXGxOl2SnVeZ {
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public boolean V57tEvNfxZVVcOCAOih5PKr;
    public Parcelable VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public boolean ZfQNn8hdWlEQ5cR94249PDsLR;
    public final Object zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public Object zzpBGItXfub0yWj;

    public /* synthetic */ ALnH3AptNOGA7UbXGxOl2SnVeZ(TextView textView) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = null;
        this.zzpBGItXfub0yWj = null;
        this.V57tEvNfxZVVcOCAOih5PKr = false;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = false;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = textView;
    }

    public void LaeGQIruHQu81hfJldjMOQSVblH3x(String str, UiKibUXaicctwiwbr8Jrmq2BMS uiKibUXaicctwiwbr8Jrmq2BMS) {
        Object obj;
        ej6unYlOWMDF.pYmKDYlAmhudp(uiKibUXaicctwiwbr8Jrmq2BMS, "provider");
        dMJzfWfinPaaf19pTno5S3Iet7AJ dmjzfwfinpaaf19ptno5s3iet7aj = (dMJzfWfinPaaf19pTno5S3Iet7AJ) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        BzqvZe2HlF1ngslPHZd bzqvZe2HlF1ngslPHZdVxUQ9tBhpHJ2AAEDNW8sghc4m = dmjzfwfinpaaf19ptno5s3iet7aj.VxUQ9tBhpHJ2AAEDNW8sghc4m(str);
        if (bzqvZe2HlF1ngslPHZdVxUQ9tBhpHJ2AAEDNW8sghc4m != null) {
            obj = bzqvZe2HlF1ngslPHZdVxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR;
        } else {
            BzqvZe2HlF1ngslPHZd bzqvZe2HlF1ngslPHZd = new BzqvZe2HlF1ngslPHZd(str, uiKibUXaicctwiwbr8Jrmq2BMS);
            dmjzfwfinpaaf19ptno5s3iet7aj.zIvmSL0wzmmKGc3X39b2Gw2mUGE++;
            BzqvZe2HlF1ngslPHZd bzqvZe2HlF1ngslPHZd2 = dmjzfwfinpaaf19ptno5s3iet7aj.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (bzqvZe2HlF1ngslPHZd2 == null) {
                dmjzfwfinpaaf19ptno5s3iet7aj.V57tEvNfxZVVcOCAOih5PKr = bzqvZe2HlF1ngslPHZd;
                dmjzfwfinpaaf19ptno5s3iet7aj.ZfQNn8hdWlEQ5cR94249PDsLR = bzqvZe2HlF1ngslPHZd;
            } else {
                bzqvZe2HlF1ngslPHZd2.LaeGQIruHQu81hfJldjMOQSVblH3x = bzqvZe2HlF1ngslPHZd;
                bzqvZe2HlF1ngslPHZd.zIvmSL0wzmmKGc3X39b2Gw2mUGE = bzqvZe2HlF1ngslPHZd2;
                dmjzfwfinpaaf19ptno5s3iet7aj.ZfQNn8hdWlEQ5cR94249PDsLR = bzqvZe2HlF1ngslPHZd;
            }
            obj = null;
        }
        if (((UiKibUXaicctwiwbr8Jrmq2BMS) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public Bundle V57tEvNfxZVVcOCAOih5PKr(String str) {
        if (!this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = null;
        return bundle2;
    }

    public void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        CompoundButton compoundButton = (CompoundButton) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.V57tEvNfxZVVcOCAOih5PKr || this.ZfQNn8hdWlEQ5cR94249PDsLR) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.V57tEvNfxZVVcOCAOih5PKr) {
                    drawableMutate.setTintList((ColorStateList) this.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                }
                if (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.zzpBGItXfub0yWj);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void ZfQNn8hdWlEQ5cR94249PDsLR(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        Context context = compoundButton.getContext();
        int[] iArr = AuEvIFo0QoYm1PHNG.q1wNbhk2O6;
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7 = NrjuzzioPqfttNRptBDpZDzSYUrcM.qNPQb1obP7(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.V57tEvNfxZVVcOCAOih5PKr;
        xb0r6yEzq0tw9m7nTWG5BFR8.KUYypEB4eNWOZWVDpH(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.V57tEvNfxZVVcOCAOih5PKr, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(VGwRvGhOWf9duTP8Dxb9PtsLAe1z.zzpBGItXfub0yWj(typedArray.getInt(3, -1), null));
            }
            nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.aXO0LSrt8bKV();
        } catch (Throwable th) {
            nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.aXO0LSrt8bKV();
            throw th;
        }
    }

    public void zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        if (!this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        TJtCCLr1LnbRdZiO8wmH979d1k tJtCCLr1LnbRdZiO8wmH979d1k = (TJtCCLr1LnbRdZiO8wmH979d1k) this.zzpBGItXfub0yWj;
        if (tJtCCLr1LnbRdZiO8wmH979d1k == null) {
            tJtCCLr1LnbRdZiO8wmH979d1k = new TJtCCLr1LnbRdZiO8wmH979d1k(this);
        }
        this.zzpBGItXfub0yWj = tJtCCLr1LnbRdZiO8wmH979d1k;
        try {
            dluX10UJjGB8n7ZcjSLLOxkct1.class.getDeclaredConstructor(null);
            TJtCCLr1LnbRdZiO8wmH979d1k tJtCCLr1LnbRdZiO8wmH979d1k2 = (TJtCCLr1LnbRdZiO8wmH979d1k) this.zzpBGItXfub0yWj;
            if (tJtCCLr1LnbRdZiO8wmH979d1k2 != null) {
                ((LinkedHashSet) tJtCCLr1LnbRdZiO8wmH979d1k2.zzpBGItXfub0yWj).add(dluX10UJjGB8n7ZcjSLLOxkct1.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + dluX10UJjGB8n7ZcjSLLOxkct1.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public void zzpBGItXfub0yWj() {
        xAJ9NPyiF2KDlwE xaj9npyif2kdlwe = (xAJ9NPyiF2KDlwE) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        Drawable checkMarkDrawable = xaj9npyif2kdlwe.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.V57tEvNfxZVVcOCAOih5PKr || this.ZfQNn8hdWlEQ5cR94249PDsLR) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.V57tEvNfxZVVcOCAOih5PKr) {
                    drawableMutate.setTintList((ColorStateList) this.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                }
                if (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.zzpBGItXfub0yWj);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(xaj9npyif2kdlwe.getDrawableState());
                }
                xaj9npyif2kdlwe.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public ALnH3AptNOGA7UbXGxOl2SnVeZ() {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new dMJzfWfinPaaf19pTno5S3Iet7AJ();
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
    }
}
