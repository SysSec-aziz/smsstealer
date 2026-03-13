package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class JgmHAQnVfjnEuZhzo2mto {
    public String LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public boolean VxUQ9tBhpHJ2AAEDNW8sghc4m = false;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public float ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public int zzpBGItXfub0yWj;

    public JgmHAQnVfjnEuZhzo2mto(JgmHAQnVfjnEuZhzo2mto jgmHAQnVfjnEuZhzo2mto, Object obj) {
        jgmHAQnVfjnEuZhzo2mto.getClass();
        this.zzpBGItXfub0yWj = jgmHAQnVfjnEuZhzo2mto.zzpBGItXfub0yWj;
        zzpBGItXfub0yWj(obj);
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), ehtgKpBkv4pNXGKK0RL6dwwx7f.ZfQNn8hdWlEQ5cR94249PDsLR);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i = 0;
        boolean z = false;
        Object objValueOf = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            int i3 = 1;
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i4 = 3;
                if (index == 3) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i4 = 4;
                    if (index == 2) {
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i4 = 5;
                            if (index == 5) {
                                objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                                } else {
                                    i3 = 8;
                                    if (index == 8) {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        objValueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i3;
                            }
                        }
                        i = 7;
                    }
                }
                i = i4;
            }
        }
        if (string != null && objValueOf != null) {
            JgmHAQnVfjnEuZhzo2mto jgmHAQnVfjnEuZhzo2mto = new JgmHAQnVfjnEuZhzo2mto();
            jgmHAQnVfjnEuZhzo2mto.zzpBGItXfub0yWj = i;
            jgmHAQnVfjnEuZhzo2mto.VxUQ9tBhpHJ2AAEDNW8sghc4m = z;
            jgmHAQnVfjnEuZhzo2mto.zzpBGItXfub0yWj(objValueOf);
            map.put(string, jgmHAQnVfjnEuZhzo2mto);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void zzpBGItXfub0yWj(Object obj) {
        switch (u9SlVAuoWhQUfJ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(this.zzpBGItXfub0yWj)) {
            case 0:
            case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                this.V57tEvNfxZVVcOCAOih5PKr = ((Integer) obj).intValue();
                break;
            case 1:
                this.ZfQNn8hdWlEQ5cR94249PDsLR = ((Float) obj).floatValue();
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = ((Integer) obj).intValue();
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = (String) obj;
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = ((Boolean) obj).booleanValue();
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                this.ZfQNn8hdWlEQ5cR94249PDsLR = ((Float) obj).floatValue();
                break;
        }
    }
}
