package com.vdodsodjsdt;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class N2LAiRuyxj3sEvVYMse9 {
    public int[] LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final ViewGroup V57tEvNfxZVVcOCAOih5PKr;
    public ViewParent VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public boolean ZfQNn8hdWlEQ5cR94249PDsLR;
    public ViewParent zzpBGItXfub0yWj;

    public N2LAiRuyxj3sEvVYMse9(ViewGroup viewGroup) {
        this.V57tEvNfxZVVcOCAOih5PKr = viewGroup;
    }

    public final ViewParent LaeGQIruHQu81hfJldjMOQSVblH3x(int i) {
        if (i == 0) {
            return this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        }
        if (i != 1) {
            return null;
        }
        return this.zzpBGItXfub0yWj;
    }

    public final void NSjgqmGjEzuugn2SsG1mZFP(int i) {
        ViewParent viewParentLaeGQIruHQu81hfJldjMOQSVblH3x = LaeGQIruHQu81hfJldjMOQSVblH3x(i);
        if (viewParentLaeGQIruHQu81hfJldjMOQSVblH3x != null) {
            boolean z = viewParentLaeGQIruHQu81hfJldjMOQSVblH3x instanceof L6NsbfO6KnE8o1cSViY8X;
            ViewGroup viewGroup = this.V57tEvNfxZVVcOCAOih5PKr;
            if (z) {
                ((L6NsbfO6KnE8o1cSViY8X) viewParentLaeGQIruHQu81hfJldjMOQSVblH3x).zzpBGItXfub0yWj(viewGroup, i);
            } else if (i == 0) {
                try {
                    viewParentLaeGQIruHQu81hfJldjMOQSVblH3x.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentLaeGQIruHQu81hfJldjMOQSVblH3x + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.zzpBGItXfub0yWj = null;
            }
        }
    }

    public final boolean V57tEvNfxZVVcOCAOih5PKr(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent viewParentLaeGQIruHQu81hfJldjMOQSVblH3x;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.ZfQNn8hdWlEQ5cR94249PDsLR || (viewParentLaeGQIruHQu81hfJldjMOQSVblH3x = LaeGQIruHQu81hfJldjMOQSVblH3x(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.V57tEvNfxZVVcOCAOih5PKr;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.LaeGQIruHQu81hfJldjMOQSVblH3x == null) {
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = new int[2];
            }
            iArr3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentLaeGQIruHQu81hfJldjMOQSVblH3x instanceof L6NsbfO6KnE8o1cSViY8X) {
            ((L6NsbfO6KnE8o1cSViY8X) viewParentLaeGQIruHQu81hfJldjMOQSVblH3x).V57tEvNfxZVVcOCAOih5PKr(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                viewParentLaeGQIruHQu81hfJldjMOQSVblH3x.onNestedPreScroll(viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentLaeGQIruHQu81hfJldjMOQSVblH3x + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(float f, float f2, boolean z) {
        ViewParent viewParentLaeGQIruHQu81hfJldjMOQSVblH3x;
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR && (viewParentLaeGQIruHQu81hfJldjMOQSVblH3x = LaeGQIruHQu81hfJldjMOQSVblH3x(0)) != null) {
            try {
                return viewParentLaeGQIruHQu81hfJldjMOQSVblH3x.onNestedFling(this.V57tEvNfxZVVcOCAOih5PKr, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentLaeGQIruHQu81hfJldjMOQSVblH3x + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(int i, int i2) {
        boolean zOnStartNestedScroll;
        if (!zIvmSL0wzmmKGc3X39b2Gw2mUGE(i2)) {
            if (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
                View view = this.V57tEvNfxZVVcOCAOih5PKr;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof L6NsbfO6KnE8o1cSViY8X;
                    if (z) {
                        zOnStartNestedScroll = ((L6NsbfO6KnE8o1cSViY8X) parent).zIvmSL0wzmmKGc3X39b2Gw2mUGE(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i2 == 0) {
                            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = parent;
                        } else if (i2 == 1) {
                            this.zzpBGItXfub0yWj = parent;
                        }
                        if (z) {
                            ((L6NsbfO6KnE8o1cSViY8X) parent).VxUQ9tBhpHJ2AAEDNW8sghc4m(view2, view, i, i2);
                        } else if (i2 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError e2) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentLaeGQIruHQu81hfJldjMOQSVblH3x;
        int i6;
        int i7;
        int[] iArr3;
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR && (viewParentLaeGQIruHQu81hfJldjMOQSVblH3x = LaeGQIruHQu81hfJldjMOQSVblH3x(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup = this.V57tEvNfxZVVcOCAOih5PKr;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.LaeGQIruHQu81hfJldjMOQSVblH3x == null) {
                        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new int[2];
                    }
                    int[] iArr4 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentLaeGQIruHQu81hfJldjMOQSVblH3x instanceof fteHovX23kcqjzpVgTB) {
                    ((fteHovX23kcqjzpVgTB) viewParentLaeGQIruHQu81hfJldjMOQSVblH3x).ZfQNn8hdWlEQ5cR94249PDsLR(viewGroup, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentLaeGQIruHQu81hfJldjMOQSVblH3x instanceof L6NsbfO6KnE8o1cSViY8X) {
                        ((L6NsbfO6KnE8o1cSViY8X) viewParentLaeGQIruHQu81hfJldjMOQSVblH3x).LaeGQIruHQu81hfJldjMOQSVblH3x(viewGroup, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            viewParentLaeGQIruHQu81hfJldjMOQSVblH3x.onNestedScroll(viewGroup, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentLaeGQIruHQu81hfJldjMOQSVblH3x + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(int i) {
        return LaeGQIruHQu81hfJldjMOQSVblH3x(i) != null;
    }

    public final boolean zzpBGItXfub0yWj(float f, float f2) {
        ViewParent viewParentLaeGQIruHQu81hfJldjMOQSVblH3x;
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR && (viewParentLaeGQIruHQu81hfJldjMOQSVblH3x = LaeGQIruHQu81hfJldjMOQSVblH3x(0)) != null) {
            try {
                return viewParentLaeGQIruHQu81hfJldjMOQSVblH3x.onNestedPreFling(this.V57tEvNfxZVVcOCAOih5PKr, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentLaeGQIruHQu81hfJldjMOQSVblH3x + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }
}
