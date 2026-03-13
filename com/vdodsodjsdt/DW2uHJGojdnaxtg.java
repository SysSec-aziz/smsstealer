package com.vdodsodjsdt;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class DW2uHJGojdnaxtg extends zonOxHotd3BwAPJcwqr6I6uQNngg4 {
    public boolean jW7EiD0YL6xkbB158jMUzhWNWb1y = true;
    public final MczqQTEILYdz358JaZBNKUUlbTp ko09zE6UAgwkV;
    public final TextView pYmKDYlAmhudp;

    public DW2uHJGojdnaxtg(TextView textView) {
        this.pYmKDYlAmhudp = textView;
        this.ko09zE6UAgwkV = new MczqQTEILYdz358JaZBNKUUlbTp(textView);
    }

    @Override // com.vdodsodjsdt.zonOxHotd3BwAPJcwqr6I6uQNngg4
    public final InputFilter[] Irh5auREsoeV1C1RaBamlmy(InputFilter[] inputFilterArr) {
        if (!this.jW7EiD0YL6xkbB158jMUzhWNWb1y) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof MczqQTEILYdz358JaZBNKUUlbTp) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            MczqQTEILYdz358JaZBNKUUlbTp mczqQTEILYdz358JaZBNKUUlbTp = this.ko09zE6UAgwkV;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = mczqQTEILYdz358JaZBNKUUlbTp;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == mczqQTEILYdz358JaZBNKUUlbTp) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // com.vdodsodjsdt.zonOxHotd3BwAPJcwqr6I6uQNngg4
    public final void YdNRGRc4rly(boolean z) {
        if (z) {
            zOk739gUM7zIZC25HHUxoiyixWFjn();
        }
    }

    @Override // com.vdodsodjsdt.zonOxHotd3BwAPJcwqr6I6uQNngg4
    public final void wRCD0SdqWCowdYU7bmzN(boolean z) {
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = z;
        zOk739gUM7zIZC25HHUxoiyixWFjn();
        TextView textView = this.pYmKDYlAmhudp;
        textView.setFilters(Irh5auREsoeV1C1RaBamlmy(textView.getFilters()));
    }

    public final void zOk739gUM7zIZC25HHUxoiyixWFjn() {
        TextView textView = this.pYmKDYlAmhudp;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.jW7EiD0YL6xkbB158jMUzhWNWb1y) {
            if (!(transformationMethod instanceof enPHGkWtrcsrwH7YKAATggmsgYzh) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new enPHGkWtrcsrwH7YKAATggmsgYzh(transformationMethod);
            }
        } else if (transformationMethod instanceof enPHGkWtrcsrwH7YKAATggmsgYzh) {
            transformationMethod = ((enPHGkWtrcsrwH7YKAATggmsgYzh) transformationMethod).V57tEvNfxZVVcOCAOih5PKr;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
