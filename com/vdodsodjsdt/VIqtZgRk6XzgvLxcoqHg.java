package com.vdodsodjsdt;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class VIqtZgRk6XzgvLxcoqHg implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DRNSD7OTZrolKY4iK67pQWIr {
    public Ef1B8CWnH64aorj LaeGQIruHQu81hfJldjMOQSVblH3x;
    public qzGH0ZhUGLEjFhdFH7Y V57tEvNfxZVVcOCAOih5PKr;
    public ylxoNpJFhOMaxIrmmRe8ax1obKNtn ZfQNn8hdWlEQ5cR94249PDsLR;

    @Override // com.vdodsodjsdt.DRNSD7OTZrolKY4iK67pQWIr
    public final boolean h3jnZRsdwYJfY9UhQCkbvWciwvFHv(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        qzGH0ZhUGLEjFhdFH7Y qzgh0zhuglejfhdfh7y = this.V57tEvNfxZVVcOCAOih5PKr;
        Ef1B8CWnH64aorj ef1B8CWnH64aorj = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (ef1B8CWnH64aorj.NSjgqmGjEzuugn2SsG1mZFP == null) {
            ef1B8CWnH64aorj.NSjgqmGjEzuugn2SsG1mZFP = new iU6FsG6uat0(ef1B8CWnH64aorj);
        }
        qzgh0zhuglejfhdfh7y.pYmKDYlAmhudp(ef1B8CWnH64aorj.NSjgqmGjEzuugn2SsG1mZFP.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.zzpBGItXfub0yWj(this.V57tEvNfxZVVcOCAOih5PKr, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        qzGH0ZhUGLEjFhdFH7Y qzgh0zhuglejfhdfh7y = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.ZfQNn8hdWlEQ5cR94249PDsLR.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.ZfQNn8hdWlEQ5cR94249PDsLR.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                qzgh0zhuglejfhdfh7y.V57tEvNfxZVVcOCAOih5PKr(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return qzgh0zhuglejfhdfh7y.performShortcut(i, keyEvent, 0);
    }

    @Override // com.vdodsodjsdt.DRNSD7OTZrolKY4iK67pQWIr
    public final void zzpBGItXfub0yWj(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ, boolean z) {
        ylxoNpJFhOMaxIrmmRe8ax1obKNtn ylxonpjfhomaxirmmre8ax1obkntn;
        if ((z || stuu2Qyz6BSCKFEomt5b51vUnV1HQ == this.V57tEvNfxZVVcOCAOih5PKr) && (ylxonpjfhomaxirmmre8ax1obkntn = this.ZfQNn8hdWlEQ5cR94249PDsLR) != null) {
            ylxonpjfhomaxirmmre8ax1obkntn.dismiss();
        }
    }
}
