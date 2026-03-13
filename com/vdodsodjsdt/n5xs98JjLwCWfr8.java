package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n5xs98JjLwCWfr8 extends ConstraintLayout {
    public int f6ZQsR6bPLvvCDNXOUc;
    public final lUqBmUbL53IL3VMM8GT8 jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public final EQz8nVyVxmIrHN6fNCQWutFG0b30O vBGA6pPLqSMuYGvprl270j7;

    public n5xs98JjLwCWfr8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O = new EQz8nVyVxmIrHN6fNCQWutFG0b30O();
        this.vBGA6pPLqSMuYGvprl270j7 = eQz8nVyVxmIrHN6fNCQWutFG0b30O;
        zkhxzzwmal5x8WuJs0rdzIuG zkhxzzwmal5x8wujs0rdziug = new zkhxzzwmal5x8WuJs0rdzIuG(0.5f);
        jFJXX88X4vgYX5CG85l5EyqW8AAH jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE = eQz8nVyVxmIrHN6fNCQWutFG0b30O.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.LaeGQIruHQu81hfJldjMOQSVblH3x = zkhxzzwmal5x8wujs0rdziug;
        jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.zIvmSL0wzmmKGc3X39b2Gw2mUGE = zkhxzzwmal5x8wujs0rdziug;
        jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.ZLZeBXTMq0zDztBxtRTuCHrapQ = zkhxzzwmal5x8wujs0rdziug;
        jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.NSjgqmGjEzuugn2SsG1mZFP = zkhxzzwmal5x8wujs0rdziug;
        eQz8nVyVxmIrHN6fNCQWutFG0b30O.setShapeAppearanceModel(jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m());
        this.vBGA6pPLqSMuYGvprl270j7.p59rPv72J9(ColorStateList.valueOf(-1));
        setBackground(this.vBGA6pPLqSMuYGvprl270j7);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, PGobtLpyfPC4TCnlq740.Irh5auREsoeV1C1RaBamlmy, R.attr.materialClockStyle, 0);
        this.f6ZQsR6bPLvvCDNXOUc = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = new lUqBmUbL53IL3VMM8GT8(11, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            lUqBmUbL53IL3VMM8GT8 luqbmubl53il3vmm8gt8 = this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
            handler.removeCallbacks(luqbmubl53il3vmm8gt8);
            handler.post(luqbmubl53il3vmm8gt8);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        q1wNbhk2O6();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            lUqBmUbL53IL3VMM8GT8 luqbmubl53il3vmm8gt8 = this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
            handler.removeCallbacks(luqbmubl53il3vmm8gt8);
            handler.post(luqbmubl53il3vmm8gt8);
        }
    }

    public abstract void q1wNbhk2O6();

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.vBGA6pPLqSMuYGvprl270j7.p59rPv72J9(ColorStateList.valueOf(i));
    }
}
