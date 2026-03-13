package com.vdodsodjsdt;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class p4cHT74AOdMuKCh0msPuwJy8E extends DyKKpKofUua1vK {
    public static final String[] pzqP2AqKW6J5PO8zCKnW = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final aZVzfGHu4uUI7FwrtaZX aXO0LSrt8bKV = new aZVzfGHu4uUI7FwrtaZX(PointF.class, "topLeft", 0);
    public static final aZVzfGHu4uUI7FwrtaZX vE4yDIjexsP2lGjLaTcB = new aZVzfGHu4uUI7FwrtaZX(PointF.class, "bottomRight", 1);
    public static final aZVzfGHu4uUI7FwrtaZX O1xDAlBZZlZdoEf747lCFHld = new aZVzfGHu4uUI7FwrtaZX(PointF.class, "bottomRight", 2);
    public static final aZVzfGHu4uUI7FwrtaZX HVEwbdULInpTNa0IG = new aZVzfGHu4uUI7FwrtaZX(PointF.class, "topLeft", 3);
    public static final aZVzfGHu4uUI7FwrtaZX y1NaPKTl7R18DOr6e8i5 = new aZVzfGHu4uUI7FwrtaZX(PointF.class, "position", 4);

    public static void qygqjTppWwx992(wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez) {
        View view = wfav4z4xkzeqsmkhnrocm57sukrez.zzpBGItXfub0yWj;
        HashMap map = wfav4z4xkzeqsmkhnrocm57sukrez.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final Animator HzCpKshMOoaw76hFcbOVRYMeRd(ViewGroup viewGroup, wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez, wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez2) {
        int i;
        p4cHT74AOdMuKCh0msPuwJy8E p4cht74aodmukch0mspuwjy8e;
        Animator animatorVxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (wfav4z4xkzeqsmkhnrocm57sukrez != null) {
            HashMap map = wfav4z4xkzeqsmkhnrocm57sukrez.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (wfav4z4xkzeqsmkhnrocm57sukrez2 != null) {
                HashMap map2 = wfav4z4xkzeqsmkhnrocm57sukrez2.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = wfav4z4xkzeqsmkhnrocm57sukrez2.zzpBGItXfub0yWj;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i2 = rect.left;
                    int i3 = rect2.left;
                    int i4 = rect.top;
                    int i5 = rect2.top;
                    int i6 = rect.right;
                    int i7 = rect2.right;
                    int i8 = rect.bottom;
                    int i9 = rect2.bottom;
                    int i10 = i6 - i2;
                    int i11 = i8 - i4;
                    int i12 = i7 - i3;
                    int i13 = i9 - i5;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
                        i = 0;
                    } else {
                        i = (i2 == i3 && i4 == i5) ? 0 : 1;
                        if (i6 != i7 || i8 != i9) {
                            i++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i++;
                    }
                    int i14 = i;
                    if (i14 > 0) {
                        SHiEHYU4a1Haij.VxUQ9tBhpHJ2AAEDNW8sghc4m(view, i2, i4, i6, i8);
                        if (i14 != 2) {
                            p4cht74aodmukch0mspuwjy8e = this;
                            if (i2 == i3 && i4 == i5) {
                                p4cht74aodmukch0mspuwjy8e.q11o1hieEkZDhF1MGOZI26oZiDT.getClass();
                                animatorVxUQ9tBhpHJ2AAEDNW8sghc4m = XImmw7FhNwoLIrIx93g2DKJLpca.VxUQ9tBhpHJ2AAEDNW8sghc4m(view, O1xDAlBZZlZdoEf747lCFHld, VSncX8ksA0tswc2TMhzhOMdd.V57tEvNfxZVVcOCAOih5PKr(i6, i8, i7, i9));
                            } else {
                                p4cht74aodmukch0mspuwjy8e.q11o1hieEkZDhF1MGOZI26oZiDT.getClass();
                                animatorVxUQ9tBhpHJ2AAEDNW8sghc4m = XImmw7FhNwoLIrIx93g2DKJLpca.VxUQ9tBhpHJ2AAEDNW8sghc4m(view, HVEwbdULInpTNa0IG, VSncX8ksA0tswc2TMhzhOMdd.V57tEvNfxZVVcOCAOih5PKr(i2, i4, i3, i5));
                            }
                        } else if (i10 == i12 && i11 == i13) {
                            p4cht74aodmukch0mspuwjy8e = this;
                            p4cht74aodmukch0mspuwjy8e.q11o1hieEkZDhF1MGOZI26oZiDT.getClass();
                            animatorVxUQ9tBhpHJ2AAEDNW8sghc4m = XImmw7FhNwoLIrIx93g2DKJLpca.VxUQ9tBhpHJ2AAEDNW8sghc4m(view, y1NaPKTl7R18DOr6e8i5, VSncX8ksA0tswc2TMhzhOMdd.V57tEvNfxZVVcOCAOih5PKr(i2, i4, i3, i5));
                        } else {
                            p4cht74aodmukch0mspuwjy8e = this;
                            u4HHaUV5V5vyRiSk3wHoq u4hhauv5v5vyrisk3whoq = new u4HHaUV5V5vyRiSk3wHoq(view);
                            p4cht74aodmukch0mspuwjy8e.q11o1hieEkZDhF1MGOZI26oZiDT.getClass();
                            ObjectAnimator objectAnimatorVxUQ9tBhpHJ2AAEDNW8sghc4m = XImmw7FhNwoLIrIx93g2DKJLpca.VxUQ9tBhpHJ2AAEDNW8sghc4m(u4hhauv5v5vyrisk3whoq, aXO0LSrt8bKV, VSncX8ksA0tswc2TMhzhOMdd.V57tEvNfxZVVcOCAOih5PKr(i2, i4, i3, i5));
                            p4cht74aodmukch0mspuwjy8e.q11o1hieEkZDhF1MGOZI26oZiDT.getClass();
                            ObjectAnimator objectAnimatorVxUQ9tBhpHJ2AAEDNW8sghc4m2 = XImmw7FhNwoLIrIx93g2DKJLpca.VxUQ9tBhpHJ2AAEDNW8sghc4m(u4hhauv5v5vyrisk3whoq, vE4yDIjexsP2lGjLaTcB, VSncX8ksA0tswc2TMhzhOMdd.V57tEvNfxZVVcOCAOih5PKr(i6, i8, i7, i9));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorVxUQ9tBhpHJ2AAEDNW8sghc4m, objectAnimatorVxUQ9tBhpHJ2AAEDNW8sghc4m2);
                            animatorSet.addListener(new e1bMQt8MQ2EUOG0BEsNdG(u4hhauv5v5vyrisk3whoq));
                            animatorVxUQ9tBhpHJ2AAEDNW8sghc4m = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            FLWIoSaHb1q8TqFvEBgPyRGrzvi6.TqcnImqkSWIKht(viewGroup4, true);
                            p4cht74aodmukch0mspuwjy8e.Ca81ebIan1u().VxUQ9tBhpHJ2AAEDNW8sghc4m(new kxOfEmW5s9WmnXXd0bw(viewGroup4));
                        }
                        return animatorVxUQ9tBhpHJ2AAEDNW8sghc4m;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez) {
        qygqjTppWwx992(wfav4z4xkzeqsmkhnrocm57sukrez);
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez) {
        qygqjTppWwx992(wfav4z4xkzeqsmkhnrocm57sukrez);
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final String[] pYmKDYlAmhudp() {
        return pzqP2AqKW6J5PO8zCKnW;
    }
}
