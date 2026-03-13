package com.vdodsodjsdt;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class hbsUcFELqptC4ZZnom4xRs0eGoz extends OzHnlNexFQgT2W4 {
    public long Ca81ebIan1u;
    public final PHkrA4TK1mlS6GdfRS6 GI83zq0G8e7zkn;
    public final T17x8JzYCitE HzCpKshMOoaw76hFcbOVRYMeRd;
    public boolean KUYypEB4eNWOZWVDpH;
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final ALdfH5RmRRhQ5l M9e7PWhFYLD2lOGMker;
    public AutoCompleteTextView NSjgqmGjEzuugn2SsG1mZFP;
    public final TimeInterpolator ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public AccessibilityManager h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public ValueAnimator ko09zE6UAgwkV;
    public boolean p59rPv72J9;
    public ValueAnimator pYmKDYlAmhudp;
    public boolean q1wNbhk2O6;
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vdodsodjsdt.T17x8JzYCitE] */
    public hbsUcFELqptC4ZZnom4xRs0eGoz(eswEmxJomeZU eswemxjomezu) {
        super(eswemxjomezu);
        this.GI83zq0G8e7zkn = new PHkrA4TK1mlS6GdfRS6(1, this);
        this.M9e7PWhFYLD2lOGMker = new ALdfH5RmRRhQ5l(this, 1);
        this.HzCpKshMOoaw76hFcbOVRYMeRd = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.vdodsodjsdt.T17x8JzYCitE
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                hbsUcFELqptC4ZZnom4xRs0eGoz hbsucfelqptc4zznom4xrs0egoz = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                AutoCompleteTextView autoCompleteTextView = hbsucfelqptc4zznom4xrs0egoz.NSjgqmGjEzuugn2SsG1mZFP;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                hbsucfelqptc4zznom4xrs0egoz.ZfQNn8hdWlEQ5cR94249PDsLR.setImportantForAccessibility(z ? 2 : 1);
            }
        };
        this.Ca81ebIan1u = Long.MAX_VALUE;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = ej6unYlOWMDF.hKs1wlZyvtUNaW1f5ABIGacfPcvX(eswemxjomezu.getContext(), R.attr.motionDurationShort3, 67);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = ej6unYlOWMDF.hKs1wlZyvtUNaW1f5ABIGacfPcvX(eswemxjomezu.getContext(), R.attr.motionDurationShort3, 50);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = ej6unYlOWMDF.vXWl0o6I4U59CgHs9(eswemxjomezu.getContext(), R.attr.motionEasingLinearInterpolator, mlFPz0SY9o7oN.VxUQ9tBhpHJ2AAEDNW8sghc4m);
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final boolean GI83zq0G8e7zkn(int i) {
        return i != 0;
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final boolean HzCpKshMOoaw76hFcbOVRYMeRd() {
        return this.p59rPv72J9;
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final void KUYypEB4eNWOZWVDpH(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.NSjgqmGjEzuugn2SsG1mZFP = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.vdodsodjsdt.G6zM1u2Qo8Da
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    hbsUcFELqptC4ZZnom4xRs0eGoz hbsucfelqptc4zznom4xrs0egoz = this.V57tEvNfxZVVcOCAOih5PKr;
                    long j = jUptimeMillis - hbsucfelqptc4zznom4xrs0egoz.Ca81ebIan1u;
                    if (j < 0 || j > 300) {
                        hbsucfelqptc4zznom4xrs0egoz.q1wNbhk2O6 = false;
                    }
                    hbsucfelqptc4zznom4xrs0egoz.f6ZQsR6bPLvvCDNXOUc();
                    hbsucfelqptc4zznom4xrs0egoz.q1wNbhk2O6 = true;
                    hbsucfelqptc4zznom4xrs0egoz.Ca81ebIan1u = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.NSjgqmGjEzuugn2SsG1mZFP.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.vdodsodjsdt.cPB4sPJsJCE6Fw7ds
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                hbsUcFELqptC4ZZnom4xRs0eGoz hbsucfelqptc4zznom4xrs0egoz = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                hbsucfelqptc4zznom4xrs0egoz.q1wNbhk2O6 = true;
                hbsucfelqptc4zznom4xrs0egoz.Ca81ebIan1u = SystemClock.uptimeMillis();
                hbsucfelqptc4zznom4xrs0egoz.jW7EiD0YL6xkbB158jMUzhWNWb1y(false);
            }
        });
        this.NSjgqmGjEzuugn2SsG1mZFP.setThreshold(0);
        TextInputLayout textInputLayout = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.isTouchExplorationEnabled()) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final View.OnFocusChangeListener LaeGQIruHQu81hfJldjMOQSVblH3x() {
        return this.M9e7PWhFYLD2lOGMker;
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final AccessibilityManager.TouchExplorationStateChangeListener NSjgqmGjEzuugn2SsG1mZFP() {
        return this.HzCpKshMOoaw76hFcbOVRYMeRd;
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final int V57tEvNfxZVVcOCAOih5PKr() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.isTouchExplorationEnabled() && this.NSjgqmGjEzuugn2SsG1mZFP.getInputType() != 0 && !this.ZfQNn8hdWlEQ5cR94249PDsLR.hasFocus()) {
            this.NSjgqmGjEzuugn2SsG1mZFP.dismissDropDown();
        }
        this.NSjgqmGjEzuugn2SsG1mZFP.post(new lUqBmUbL53IL3VMM8GT8(6, this));
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final int ZfQNn8hdWlEQ5cR94249PDsLR() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    public final void f6ZQsR6bPLvvCDNXOUc() {
        if (this.NSjgqmGjEzuugn2SsG1mZFP == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.Ca81ebIan1u;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.q1wNbhk2O6 = false;
        }
        if (this.q1wNbhk2O6) {
            this.q1wNbhk2O6 = false;
            return;
        }
        jW7EiD0YL6xkbB158jMUzhWNWb1y(!this.p59rPv72J9);
        if (!this.p59rPv72J9) {
            this.NSjgqmGjEzuugn2SsG1mZFP.dismissDropDown();
        } else {
            this.NSjgqmGjEzuugn2SsG1mZFP.requestFocus();
            this.NSjgqmGjEzuugn2SsG1mZFP.showDropDown();
        }
    }

    public final void jW7EiD0YL6xkbB158jMUzhWNWb1y(boolean z) {
        if (this.p59rPv72J9 != z) {
            this.p59rPv72J9 = z;
            this.ko09zE6UAgwkV.cancel();
            this.pYmKDYlAmhudp.start();
        }
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final void ko09zE6UAgwkV() {
        AutoCompleteTextView autoCompleteTextView = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.NSjgqmGjEzuugn2SsG1mZFP.setOnDismissListener(null);
        }
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final void p59rPv72J9(AccessibilityEvent accessibilityEvent) {
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.isEnabled() && this.NSjgqmGjEzuugn2SsG1mZFP.getInputType() == 0) {
            boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.p59rPv72J9 && !this.NSjgqmGjEzuugn2SsG1mZFP.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                f6ZQsR6bPLvvCDNXOUc();
                this.q1wNbhk2O6 = true;
                this.Ca81ebIan1u = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final void pYmKDYlAmhudp() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        valueAnimatorOfFloat.addUpdateListener(new evze9VEkYMa2p1GH(this));
        this.ko09zE6UAgwkV = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        valueAnimatorOfFloat2.addUpdateListener(new evze9VEkYMa2p1GH(this));
        this.pYmKDYlAmhudp = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new LJ0avg2f37zqC(2, this));
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = (AccessibilityManager) this.V57tEvNfxZVVcOCAOih5PKr.getSystemService("accessibility");
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final void q1wNbhk2O6(wzEak8ZKpNWHd4RKPYQ wzeak8zkpnwhd4rkpyq) {
        AccessibilityNodeInfo accessibilityNodeInfo = wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (this.NSjgqmGjEzuugn2SsG1mZFP.getInputType() == 0) {
            wzeak8zkpnwhd4rkpyq.GI83zq0G8e7zkn(Spinner.class.getName());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 ? accessibilityNodeInfo.isShowingHintText() : wzeak8zkpnwhd4rkpyq.LaeGQIruHQu81hfJldjMOQSVblH3x(4)) {
            if (i >= 26) {
                accessibilityNodeInfo.setHintText(null);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", null);
            }
        }
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final View.OnClickListener zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        return this.GI83zq0G8e7zkn;
    }
}
