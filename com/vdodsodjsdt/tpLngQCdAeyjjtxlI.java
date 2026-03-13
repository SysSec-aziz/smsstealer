package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class tpLngQCdAeyjjtxlI {
    public final Object LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final Serializable V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public Object ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final Object ZfQNn8hdWlEQ5cR94249PDsLR;
    public final Object zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final Object zzpBGItXfub0yWj;

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public tpLngQCdAeyjjtxlI(UL4JI0eLnaD84py2JT uL4JI0eLnaD84py2JT) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 1;
        sveu0WcbYc1gIe sveu0wcbyc1gie = (sveu0WcbYc1gIe) uL4JI0eLnaD84py2JT.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (sveu0wcbyc1gie == null) {
            throw new IllegalStateException("url == null");
        }
        this.zzpBGItXfub0yWj = sveu0wcbyc1gie;
        this.V57tEvNfxZVVcOCAOih5PKr = (String) uL4JI0eLnaD84py2JT.zzpBGItXfub0yWj;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = ((yxp1I6Gr2tLDD3dH0UsMPMDr7) uL4JI0eLnaD84py2JT.V57tEvNfxZVVcOCAOih5PKr).zzpBGItXfub0yWj();
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = (EOksdALzG1YtVRjkh) uL4JI0eLnaD84py2JT.ZfQNn8hdWlEQ5cR94249PDsLR;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = QtxmZgsffC8rBsc8wSUkFg2a.ymT6yQrus3w(uL4JI0eLnaD84py2JT.LaeGQIruHQu81hfJldjMOQSVblH3x);
    }

    public static LayerDrawable V57tEvNfxZVVcOCAOih5PKr(ZSO61OFnW5yAt zSO61OFnW5yAt, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableV57tEvNfxZVVcOCAOih5PKr = zSO61OFnW5yAt.V57tEvNfxZVVcOCAOih5PKr(context, R.drawable.abc_star_black_48dp);
        Drawable drawableV57tEvNfxZVVcOCAOih5PKr2 = zSO61OFnW5yAt.V57tEvNfxZVVcOCAOih5PKr(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableV57tEvNfxZVVcOCAOih5PKr instanceof BitmapDrawable) && drawableV57tEvNfxZVVcOCAOih5PKr.getIntrinsicWidth() == dimensionPixelSize && drawableV57tEvNfxZVVcOCAOih5PKr.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableV57tEvNfxZVVcOCAOih5PKr;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableV57tEvNfxZVVcOCAOih5PKr.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableV57tEvNfxZVVcOCAOih5PKr.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableV57tEvNfxZVVcOCAOih5PKr2 instanceof BitmapDrawable) && drawableV57tEvNfxZVVcOCAOih5PKr2.getIntrinsicWidth() == dimensionPixelSize && drawableV57tEvNfxZVVcOCAOih5PKr2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableV57tEvNfxZVVcOCAOih5PKr2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableV57tEvNfxZVVcOCAOih5PKr2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableV57tEvNfxZVVcOCAOih5PKr2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static void zIvmSL0wzmmKGc3X39b2Gw2mUGE(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = aMdFkGJAdbLdAI00ZfKC7DaJw3k2.zzpBGItXfub0yWj;
        }
        drawableMutate.setColorFilter(aMdFkGJAdbLdAI00ZfKC7DaJw3k2.V57tEvNfxZVVcOCAOih5PKr(i, mode));
    }

    public static ColorStateList zzpBGItXfub0yWj(Context context, int i) {
        int iV57tEvNfxZVVcOCAOih5PKr = Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.V57tEvNfxZVVcOCAOih5PKr(context, R.attr.colorControlHighlight);
        int iZzpBGItXfub0yWj = Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.zzpBGItXfub0yWj(context, R.attr.colorButtonNormal);
        int[] iArr = Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.zzpBGItXfub0yWj;
        int[] iArr2 = Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.ZfQNn8hdWlEQ5cR94249PDsLR;
        int iZzpBGItXfub0yWj2 = PyYsF2FE67iANgZ0fDkVtNG5uhA.zzpBGItXfub0yWj(iV57tEvNfxZVVcOCAOih5PKr, i);
        return new ColorStateList(new int[][]{iArr, iArr2, Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.V57tEvNfxZVVcOCAOih5PKr, Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.zIvmSL0wzmmKGc3X39b2Gw2mUGE}, new int[]{iZzpBGItXfub0yWj, iZzpBGItXfub0yWj2, PyYsF2FE67iANgZ0fDkVtNG5uhA.zzpBGItXfub0yWj(iV57tEvNfxZVVcOCAOih5PKr, i), i});
    }

    public UL4JI0eLnaD84py2JT LaeGQIruHQu81hfJldjMOQSVblH3x() {
        UL4JI0eLnaD84py2JT uL4JI0eLnaD84py2JT = new UL4JI0eLnaD84py2JT();
        Object linkedHashMap = XC6rwBjRUhvxaQ8TfYI.V57tEvNfxZVVcOCAOih5PKr;
        uL4JI0eLnaD84py2JT.LaeGQIruHQu81hfJldjMOQSVblH3x = linkedHashMap;
        uL4JI0eLnaD84py2JT.VxUQ9tBhpHJ2AAEDNW8sghc4m = (sveu0WcbYc1gIe) this.zzpBGItXfub0yWj;
        uL4JI0eLnaD84py2JT.zzpBGItXfub0yWj = (String) this.V57tEvNfxZVVcOCAOih5PKr;
        uL4JI0eLnaD84py2JT.ZfQNn8hdWlEQ5cR94249PDsLR = (EOksdALzG1YtVRjkh) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        Map map = (Map) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (!map.isEmpty()) {
            linkedHashMap = new LinkedHashMap(map);
        }
        uL4JI0eLnaD84py2JT.LaeGQIruHQu81hfJldjMOQSVblH3x = linkedHashMap;
        uL4JI0eLnaD84py2JT.V57tEvNfxZVVcOCAOih5PKr = ((EUSG2RPrSQzuno7qTyOhv0Az) this.ZfQNn8hdWlEQ5cR94249PDsLR).V57tEvNfxZVVcOCAOih5PKr();
        return uL4JI0eLnaD84py2JT;
    }

    public ColorStateList ZfQNn8hdWlEQ5cR94249PDsLR(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return zzpBGItXfub0yWj(context, Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.V57tEvNfxZVVcOCAOih5PKr(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return zzpBGItXfub0yWj(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return zzpBGItXfub0yWj(context, Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.V57tEvNfxZVVcOCAOih5PKr(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq(context, R.color.abc_tint_spinner);
            }
            if (VxUQ9tBhpHJ2AAEDNW8sghc4m((int[]) this.V57tEvNfxZVVcOCAOih5PKr, i)) {
                return Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.ZfQNn8hdWlEQ5cR94249PDsLR(context, R.attr.colorControlNormal);
            }
            if (VxUQ9tBhpHJ2AAEDNW8sghc4m((int[]) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, i)) {
                return zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq(context, R.color.abc_tint_default);
            }
            if (VxUQ9tBhpHJ2AAEDNW8sghc4m((int[]) this.ZLZeBXTMq0zDztBxtRTuCHrapQ, i)) {
                return zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListZfQNn8hdWlEQ5cR94249PDsLR = Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.ZfQNn8hdWlEQ5cR94249PDsLR(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListZfQNn8hdWlEQ5cR94249PDsLR == null || !colorStateListZfQNn8hdWlEQ5cR94249PDsLR.isStateful()) {
            iArr[0] = Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.zzpBGItXfub0yWj;
            iArr2[0] = Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.zzpBGItXfub0yWj(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.LaeGQIruHQu81hfJldjMOQSVblH3x;
            iArr2[1] = Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.V57tEvNfxZVVcOCAOih5PKr(context, R.attr.colorControlActivated);
            iArr[2] = Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            iArr2[2] = Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.V57tEvNfxZVVcOCAOih5PKr(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.zzpBGItXfub0yWj;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListZfQNn8hdWlEQ5cR94249PDsLR.getColorForState(iArr3, 0);
            iArr[1] = Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.LaeGQIruHQu81hfJldjMOQSVblH3x;
            iArr2[1] = Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.V57tEvNfxZVVcOCAOih5PKr(context, R.attr.colorControlActivated);
            iArr[2] = Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            iArr2[2] = colorStateListZfQNn8hdWlEQ5cR94249PDsLR.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public String toString() {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 1:
                Map map = (Map) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                StringBuilder sb = new StringBuilder(32);
                sb.append("Request{method=");
                sb.append((String) this.V57tEvNfxZVVcOCAOih5PKr);
                sb.append(", url=");
                sb.append((sveu0WcbYc1gIe) this.zzpBGItXfub0yWj);
                EUSG2RPrSQzuno7qTyOhv0Az eUSG2RPrSQzuno7qTyOhv0Az = (EUSG2RPrSQzuno7qTyOhv0Az) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (eUSG2RPrSQzuno7qTyOhv0Az.size() != 0) {
                    sb.append(", headers=[");
                    int i = 0;
                    for (Object obj : eUSG2RPrSQzuno7qTyOhv0Az) {
                        int i2 = i + 1;
                        if (i < 0) {
                            kzhIjSJtHYuLoiUgKqSRIck3W8.Z1FjjMJ0suz8AFI7gsA4GDLMXv();
                            throw null;
                        }
                        FgeGQUnjhbxnrwqkj fgeGQUnjhbxnrwqkj = (FgeGQUnjhbxnrwqkj) obj;
                        String str = (String) fgeGQUnjhbxnrwqkj.V57tEvNfxZVVcOCAOih5PKr;
                        String str2 = (String) fgeGQUnjhbxnrwqkj.ZfQNn8hdWlEQ5cR94249PDsLR;
                        if (i > 0) {
                            sb.append(", ");
                        }
                        sb.append(str);
                        sb.append(':');
                        if (jHlOQHj3hlCsydfI7r5ApVdQjYvKf.M9e7PWhFYLD2lOGMker(str)) {
                            str2 = "██";
                        }
                        sb.append(str2);
                        i = i2;
                    }
                    sb.append(']');
                }
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [int[], java.io.Serializable] */
    public tpLngQCdAeyjjtxlI() {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
        this.zzpBGItXfub0yWj = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.V57tEvNfxZVVcOCAOih5PKr = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }
}
