package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vdodsodjsdt.MGFy6Qt0zlAn2p6UHKfhjSOv;
import com.vdodsodjsdt.TxXBRRtCrcR759WKDq8m6Xg;
import com.vdodsodjsdt.jj77w443kpEYEOqOOio;
import com.vdodsodjsdt.m8WKJH6JbFg;
import com.vdodsodjsdt.qF22Y620JkFyombtDYw0h0h8Rxpja;
import com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends m8WKJH6JbFg {
    public boolean V57tEvNfxZVVcOCAOih5PKr;
    public TxXBRRtCrcR759WKDq8m6Xg VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public boolean zzpBGItXfub0yWj;
    public int ZfQNn8hdWlEQ5cR94249PDsLR = 2;
    public float LaeGQIruHQu81hfJldjMOQSVblH3x = 0.0f;
    public float zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0.5f;
    public final MGFy6Qt0zlAn2p6UHKfhjSOv ZLZeBXTMq0zDztBxtRTuCHrapQ = new MGFy6Qt0zlAn2p6UHKfhjSOv(this);

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            xb0r6yEzq0tw9m7nTWG5BFR8.M9e7PWhFYLD2lOGMker(view, 1048576);
            xb0r6yEzq0tw9m7nTWG5BFR8.NSjgqmGjEzuugn2SsG1mZFP(view, 0);
            if (ko09zE6UAgwkV(view)) {
                xb0r6yEzq0tw9m7nTWG5BFR8.HzCpKshMOoaw76hFcbOVRYMeRd(view, jj77w443kpEYEOqOOio.M9e7PWhFYLD2lOGMker, new qF22Y620JkFyombtDYw0h0h8Rxpja(this));
            }
        }
        return false;
    }

    public boolean ko09zE6UAgwkV(View view) {
        return true;
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final boolean pYmKDYlAmhudp(View view, MotionEvent motionEvent) {
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
            return false;
        }
        if (this.V57tEvNfxZVVcOCAOih5PKr && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.M9e7PWhFYLD2lOGMker(motionEvent);
        return true;
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zCa81ebIan1u = this.zzpBGItXfub0yWj;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zCa81ebIan1u = coordinatorLayout.Ca81ebIan1u(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.zzpBGItXfub0yWj = zCa81ebIan1u;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.zzpBGItXfub0yWj = false;
        }
        if (zCa81ebIan1u) {
            if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new TxXBRRtCrcR759WKDq8m6Xg(coordinatorLayout.getContext(), coordinatorLayout, this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
            }
            if (!this.V57tEvNfxZVVcOCAOih5PKr && this.VxUQ9tBhpHJ2AAEDNW8sghc4m.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
