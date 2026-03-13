package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.vdodsodjsdt.D12Nz0tOxlAcDuwq4Ka8reia;
import com.vdodsodjsdt.F44whnLsbQ;
import com.vdodsodjsdt.FLWIoSaHb1q8TqFvEBgPyRGrzvi6;
import com.vdodsodjsdt.PGobtLpyfPC4TCnlq740;
import com.vdodsodjsdt.S6di43kkchb2oBOK;
import com.vdodsodjsdt.UdolbJMuTFGlV;
import com.vdodsodjsdt.VM6CSprlZdb;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.em9CQSm1f1lSysM22u;
import com.vdodsodjsdt.fNlVNn0Im30;
import com.vdodsodjsdt.hEYFkY0Pa5rIEBwb4kWhO0E74Dn;
import com.vdodsodjsdt.lzuj2xiOHpZAdsoZ1vJvxA;
import com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao;
import com.vdodsodjsdt.uP2FXc8U5ddoRJ;
import com.vdodsodjsdt.wD5hsovXMBOyLQTFAC8;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends S6di43kkchb2oBOK {
    @Override // com.vdodsodjsdt.S6di43kkchb2oBOK
    public final lzuj2xiOHpZAdsoZ1vJvxA LaeGQIruHQu81hfJldjMOQSVblH3x(Context context, AttributeSet attributeSet) {
        uP2FXc8U5ddoRJ up2fxc8u5ddorj = new uP2FXc8U5ddoRJ(sGipz63rTUmSj3uFDvOtzihao.bjhcQ0u7VT2OYYrwk96HrWoN(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = up2fxc8u5ddorj.getContext();
        if (ej6unYlOWMDF.ItrQwCXbty5PZtje5JS(context2, com.vdodsodjsdt.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = PGobtLpyfPC4TCnlq740.vBGA6pPLqSMuYGvprl270j7;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int iZLZeBXTMq0zDztBxtRTuCHrapQ = uP2FXc8U5ddoRJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iZLZeBXTMq0zDztBxtRTuCHrapQ == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, PGobtLpyfPC4TCnlq740.f6ZQsR6bPLvvCDNXOUc);
                    int iZLZeBXTMq0zDztBxtRTuCHrapQ2 = uP2FXc8U5ddoRJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(up2fxc8u5ddorj.getContext(), typedArrayObtainStyledAttributes3, 2, 4);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iZLZeBXTMq0zDztBxtRTuCHrapQ2 >= 0) {
                        up2fxc8u5ddorj.setLineHeight(iZLZeBXTMq0zDztBxtRTuCHrapQ2);
                    }
                }
            }
        }
        return up2fxc8u5ddorj;
    }

    @Override // com.vdodsodjsdt.S6di43kkchb2oBOK
    public final em9CQSm1f1lSysM22u V57tEvNfxZVVcOCAOih5PKr(Context context, AttributeSet attributeSet) {
        return new UdolbJMuTFGlV(context, attributeSet);
    }

    @Override // com.vdodsodjsdt.S6di43kkchb2oBOK
    public final D12Nz0tOxlAcDuwq4Ka8reia VxUQ9tBhpHJ2AAEDNW8sghc4m(Context context, AttributeSet attributeSet) {
        return new hEYFkY0Pa5rIEBwb4kWhO0E74Dn(context, attributeSet);
    }

    @Override // com.vdodsodjsdt.S6di43kkchb2oBOK
    public final VM6CSprlZdb ZfQNn8hdWlEQ5cR94249PDsLR(Context context, AttributeSet attributeSet) {
        fNlVNn0Im30 fnlvnn0im30 = new fNlVNn0Im30(sGipz63rTUmSj3uFDvOtzihao.bjhcQ0u7VT2OYYrwk96HrWoN(context, attributeSet, com.vdodsodjsdt.R.attr.radioButtonStyle, com.vdodsodjsdt.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = fnlvnn0im30.getContext();
        TypedArray typedArrayVE4yDIjexsP2lGjLaTcB = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.vE4yDIjexsP2lGjLaTcB(context2, attributeSet, PGobtLpyfPC4TCnlq740.pYmKDYlAmhudp, com.vdodsodjsdt.R.attr.radioButtonStyle, com.vdodsodjsdt.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayVE4yDIjexsP2lGjLaTcB.hasValue(0)) {
            fnlvnn0im30.setButtonTintList(F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context2, typedArrayVE4yDIjexsP2lGjLaTcB, 0));
        }
        fnlvnn0im30.NSjgqmGjEzuugn2SsG1mZFP = typedArrayVE4yDIjexsP2lGjLaTcB.getBoolean(1, false);
        typedArrayVE4yDIjexsP2lGjLaTcB.recycle();
        return fnlvnn0im30;
    }

    @Override // com.vdodsodjsdt.S6di43kkchb2oBOK
    public final wD5hsovXMBOyLQTFAC8 zzpBGItXfub0yWj(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }
}
