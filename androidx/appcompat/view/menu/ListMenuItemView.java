package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.vdodsodjsdt.AuEvIFo0QoYm1PHNG;
import com.vdodsodjsdt.NrjuzzioPqfttNRptBDpZDzSYUrcM;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
import com.vdodsodjsdt.YybP2G5tPcuz9Zghx;
import com.vdodsodjsdt.rkuo6pAmWq0N;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements YybP2G5tPcuz9Zghx, AbsListView.SelectionBoundsAdjuster {
    public boolean Ca81ebIan1u;
    public ImageView GI83zq0G8e7zkn;
    public LinearLayout HzCpKshMOoaw76hFcbOVRYMeRd;
    public final Drawable KUYypEB4eNWOZWVDpH;
    public RadioButton LaeGQIruHQu81hfJldjMOQSVblH3x;
    public ImageView M9e7PWhFYLD2lOGMker;
    public TextView NSjgqmGjEzuugn2SsG1mZFP;
    public rkuo6pAmWq0N V57tEvNfxZVVcOCAOih5PKr;
    public CheckBox ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public ImageView ZfQNn8hdWlEQ5cR94249PDsLR;
    public final Drawable h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public boolean jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public LayoutInflater ko09zE6UAgwkV;
    public final Context p59rPv72J9;
    public final boolean pYmKDYlAmhudp;
    public final int q1wNbhk2O6;
    public TextView zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7 = NrjuzzioPqfttNRptBDpZDzSYUrcM.qNPQb1obP7(getContext(), attributeSet, AuEvIFo0QoYm1PHNG.ko09zE6UAgwkV, R.attr.listMenuViewStyle);
        this.KUYypEB4eNWOZWVDpH = nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.pYmKDYlAmhudp(5);
        TypedArray typedArray = (TypedArray) nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.V57tEvNfxZVVcOCAOih5PKr;
        this.q1wNbhk2O6 = typedArray.getResourceId(1, -1);
        this.Ca81ebIan1u = typedArray.getBoolean(7, false);
        this.p59rPv72J9 = context;
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.pYmKDYlAmhudp(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.pYmKDYlAmhudp = typedArrayObtainStyledAttributes.hasValue(0);
        nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.aXO0LSrt8bKV();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.ko09zE6UAgwkV == null) {
            this.ko09zE6UAgwkV = LayoutInflater.from(getContext());
        }
        return this.ko09zE6UAgwkV;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.GI83zq0G8e7zkn;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    @Override // com.vdodsodjsdt.YybP2G5tPcuz9Zghx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V57tEvNfxZVVcOCAOih5PKr(com.vdodsodjsdt.rkuo6pAmWq0N r11) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.V57tEvNfxZVVcOCAOih5PKr(com.vdodsodjsdt.rkuo6pAmWq0N):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.M9e7PWhFYLD2lOGMker;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.M9e7PWhFYLD2lOGMker.getLayoutParams();
        rect.top = this.M9e7PWhFYLD2lOGMker.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // com.vdodsodjsdt.YybP2G5tPcuz9Zghx
    public rkuo6pAmWq0N getItemData() {
        return this.V57tEvNfxZVVcOCAOih5PKr;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.KUYypEB4eNWOZWVDpH);
        TextView textView = (TextView) findViewById(R.id.title);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = textView;
        int i = this.q1wNbhk2O6;
        if (i != -1) {
            textView.setTextAppearance(this.p59rPv72J9, i);
        }
        this.NSjgqmGjEzuugn2SsG1mZFP = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.GI83zq0G8e7zkn = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv);
        }
        this.M9e7PWhFYLD2lOGMker = (ImageView) findViewById(R.id.group_divider);
        this.HzCpKshMOoaw76hFcbOVRYMeRd = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR != null && this.Ca81ebIan1u) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.ZfQNn8hdWlEQ5cR94249PDsLR.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.LaeGQIruHQu81hfJldjMOQSVblH3x == null && this.ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
            return;
        }
        if ((this.V57tEvNfxZVVcOCAOih5PKr.q11o1hieEkZDhF1MGOZI26oZiDT & 4) != 0) {
            if (this.LaeGQIruHQu81hfJldjMOQSVblH3x == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = radioButton;
                LinearLayout linearLayout = this.HzCpKshMOoaw76hFcbOVRYMeRd;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            view = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        } else {
            if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = checkBox;
                LinearLayout linearLayout2 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            view = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        }
        if (z) {
            compoundButton.setChecked(this.V57tEvNfxZVVcOCAOih5PKr.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.V57tEvNfxZVVcOCAOih5PKr.q11o1hieEkZDhF1MGOZI26oZiDT & 4) != 0) {
            if (this.LaeGQIruHQu81hfJldjMOQSVblH3x == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = radioButton;
                LinearLayout linearLayout = this.HzCpKshMOoaw76hFcbOVRYMeRd;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        } else {
            if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = checkBox;
                LinearLayout linearLayout2 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = z;
        this.Ca81ebIan1u = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.M9e7PWhFYLD2lOGMker;
        if (imageView != null) {
            imageView.setVisibility((this.pYmKDYlAmhudp || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = this.V57tEvNfxZVVcOCAOih5PKr.p59rPv72J9;
        boolean z = this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
        if (z || this.Ca81ebIan1u) {
            ImageView imageView = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (imageView == null && drawable == null && !this.Ca81ebIan1u) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.ZfQNn8hdWlEQ5cR94249PDsLR = imageView2;
                LinearLayout linearLayout = this.HzCpKshMOoaw76hFcbOVRYMeRd;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.Ca81ebIan1u) {
                this.ZfQNn8hdWlEQ5cR94249PDsLR.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.ZfQNn8hdWlEQ5cR94249PDsLR.getVisibility() != 0) {
                this.ZfQNn8hdWlEQ5cR94249PDsLR.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getVisibility() != 8) {
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setVisibility(8);
            }
        } else {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setText(charSequence);
            if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getVisibility() != 0) {
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setVisibility(0);
            }
        }
    }
}
