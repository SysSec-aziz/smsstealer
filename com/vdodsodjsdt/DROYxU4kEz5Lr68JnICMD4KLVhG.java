package com.vdodsodjsdt;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class DROYxU4kEz5Lr68JnICMD4KLVhG extends Dialog implements hCgEybj69le8, c6HqQbG2usib {
    public final androidx.activity.iVKrTMqOw0TqCeNN LaeGQIruHQu81hfJldjMOQSVblH3x;
    public androidx.lifecycle.iVKrTMqOw0TqCeNN V57tEvNfxZVVcOCAOih5PKr;
    public final Khx5NlXjnBf0cIn8cBMdY4O4mD ZfQNn8hdWlEQ5cR94249PDsLR;

    public DROYxU4kEz5Lr68JnICMD4KLVhG(Context context, int i) {
        super(context, i);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new Khx5NlXjnBf0cIn8cBMdY4O4mD(this);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new androidx.activity.iVKrTMqOw0TqCeNN(new lUqBmUbL53IL3VMM8GT8(5, this));
    }

    public static void zzpBGItXfub0yWj(DROYxU4kEz5Lr68JnICMD4KLVhG dROYxU4kEz5Lr68JnICMD4KLVhG) {
        super.onBackPressed();
    }

    @Override // com.vdodsodjsdt.hCgEybj69le8
    public final androidx.lifecycle.iVKrTMqOw0TqCeNN LaeGQIruHQu81hfJldjMOQSVblH3x() {
        androidx.lifecycle.iVKrTMqOw0TqCeNN ivkrtmqow0tqcenn = this.V57tEvNfxZVVcOCAOih5PKr;
        if (ivkrtmqow0tqcenn != null) {
            return ivkrtmqow0tqcenn;
        }
        androidx.lifecycle.iVKrTMqOw0TqCeNN ivkrtmqow0tqcenn2 = new androidx.lifecycle.iVKrTMqOw0TqCeNN(this);
        this.V57tEvNfxZVVcOCAOih5PKr = ivkrtmqow0tqcenn2;
        return ivkrtmqow0tqcenn2;
    }

    public final void V57tEvNfxZVVcOCAOih5PKr() {
        Window window = getWindow();
        ej6unYlOWMDF.p59rPv72J9(window);
        View decorView = window.getDecorView();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(decorView, "getDecorView(...)");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        ej6unYlOWMDF.p59rPv72J9(window2);
        View decorView2 = window2.getDecorView();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        ej6unYlOWMDF.p59rPv72J9(window3);
        View decorView3 = window3.getDecorView();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.vdodsodjsdt.c6HqQbG2usib
    public final ALnH3AptNOGA7UbXGxOl2SnVeZ VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return (ALnH3AptNOGA7UbXGxOl2SnVeZ) this.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ej6unYlOWMDF.pYmKDYlAmhudp(view, "view");
        V57tEvNfxZVVcOCAOih5PKr();
        super.addContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.V57tEvNfxZVVcOCAOih5PKr();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            androidx.activity.iVKrTMqOw0TqCeNN ivkrtmqow0tqcenn = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            ivkrtmqow0tqcenn.LaeGQIruHQu81hfJldjMOQSVblH3x = onBackInvokedDispatcher;
            ivkrtmqow0tqcenn.ZfQNn8hdWlEQ5cR94249PDsLR(ivkrtmqow0tqcenn.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj(bundle);
        androidx.lifecycle.iVKrTMqOw0TqCeNN ivkrtmqow0tqcenn2 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (ivkrtmqow0tqcenn2 == null) {
            ivkrtmqow0tqcenn2 = new androidx.lifecycle.iVKrTMqOw0TqCeNN(this);
            this.V57tEvNfxZVVcOCAOih5PKr = ivkrtmqow0tqcenn2;
        }
        ivkrtmqow0tqcenn2.ZfQNn8hdWlEQ5cR94249PDsLR(XOTOHmUA5NYhlyOBh7.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.iVKrTMqOw0TqCeNN ivkrtmqow0tqcenn = this.V57tEvNfxZVVcOCAOih5PKr;
        if (ivkrtmqow0tqcenn == null) {
            ivkrtmqow0tqcenn = new androidx.lifecycle.iVKrTMqOw0TqCeNN(this);
            this.V57tEvNfxZVVcOCAOih5PKr = ivkrtmqow0tqcenn;
        }
        ivkrtmqow0tqcenn.ZfQNn8hdWlEQ5cR94249PDsLR(XOTOHmUA5NYhlyOBh7.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        androidx.lifecycle.iVKrTMqOw0TqCeNN ivkrtmqow0tqcenn = this.V57tEvNfxZVVcOCAOih5PKr;
        if (ivkrtmqow0tqcenn == null) {
            ivkrtmqow0tqcenn = new androidx.lifecycle.iVKrTMqOw0TqCeNN(this);
            this.V57tEvNfxZVVcOCAOih5PKr = ivkrtmqow0tqcenn;
        }
        ivkrtmqow0tqcenn.ZfQNn8hdWlEQ5cR94249PDsLR(XOTOHmUA5NYhlyOBh7.ON_DESTROY);
        this.V57tEvNfxZVVcOCAOih5PKr = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        V57tEvNfxZVVcOCAOih5PKr();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        ej6unYlOWMDF.pYmKDYlAmhudp(view, "view");
        V57tEvNfxZVVcOCAOih5PKr();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ej6unYlOWMDF.pYmKDYlAmhudp(view, "view");
        V57tEvNfxZVVcOCAOih5PKr();
        super.setContentView(view, layoutParams);
    }
}
