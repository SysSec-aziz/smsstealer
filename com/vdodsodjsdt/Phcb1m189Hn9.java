package com.vdodsodjsdt;

import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Phcb1m189Hn9 extends ej6unYlOWMDF {
    public final int KUYypEB4eNWOZWVDpH;

    public Phcb1m189Hn9(int i) {
        this.KUYypEB4eNWOZWVDpH = i;
    }

    @Override // com.vdodsodjsdt.ej6unYlOWMDF
    public final void H2VFYNJEVGAX(dqrRplqyPGe dqrrplqypge, float f) {
        EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O = (EQz8nVyVxmIrHN6fNCQWutFG0b30O) dqrrplqypge;
        float[] fArr = eQz8nVyVxmIrHN6fNCQWutFG0b30O.aXO0LSrt8bKV;
        if (fArr != null) {
            int i = this.KUYypEB4eNWOZWVDpH;
            if (fArr[i] != f) {
                fArr[i] = f;
                Jc01di1Hsv jc01di1Hsv = eQz8nVyVxmIrHN6fNCQWutFG0b30O.O1xDAlBZZlZdoEf747lCFHld;
                if (jc01di1Hsv != null) {
                    float fNSjgqmGjEzuugn2SsG1mZFP = eQz8nVyVxmIrHN6fNCQWutFG0b30O.NSjgqmGjEzuugn2SsG1mZFP();
                    MaterialButton materialButton = (MaterialButton) jc01di1Hsv.ZfQNn8hdWlEQ5cR94249PDsLR;
                    int i2 = (int) (fNSjgqmGjEzuugn2SsG1mZFP * 0.11f);
                    if (materialButton.RhfGHxtXxy0M0grmp2jkRjQg != i2) {
                        materialButton.RhfGHxtXxy0M0grmp2jkRjQg = i2;
                        materialButton.M9e7PWhFYLD2lOGMker();
                        materialButton.invalidate();
                    }
                }
                eQz8nVyVxmIrHN6fNCQWutFG0b30O.invalidateSelf();
            }
        }
    }

    @Override // com.vdodsodjsdt.ej6unYlOWMDF
    public final float vE4yDIjexsP2lGjLaTcB(dqrRplqyPGe dqrrplqypge) {
        float[] fArr = ((EQz8nVyVxmIrHN6fNCQWutFG0b30O) dqrrplqypge).aXO0LSrt8bKV;
        if (fArr != null) {
            return fArr[this.KUYypEB4eNWOZWVDpH];
        }
        return 0.0f;
    }
}
