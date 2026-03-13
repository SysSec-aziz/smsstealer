package com.vdodsodjsdt;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class zExWRrZVrGf1BX extends KfeOQNOupsCg6878zi4e {
    public final /* synthetic */ int Ca81ebIan1u;
    public final SideSheetBehavior h3jnZRsdwYJfY9UhQCkbvWciwvFHv;

    public /* synthetic */ zExWRrZVrGf1BX(SideSheetBehavior sideSheetBehavior, int i) {
        this.Ca81ebIan1u = i;
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = sideSheetBehavior;
    }

    @Override // com.vdodsodjsdt.KfeOQNOupsCg6878zi4e
    public final int Irh5auREsoeV1C1RaBamlmy() {
        switch (this.Ca81ebIan1u) {
            case 0:
                return -this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.KUYypEB4eNWOZWVDpH;
            default:
                return f6ZQsR6bPLvvCDNXOUc();
        }
    }

    @Override // com.vdodsodjsdt.KfeOQNOupsCg6878zi4e
    public final boolean ItrQwCXbty5PZtje5JS(View view, float f) {
        switch (this.Ca81ebIan1u) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                float fAbs = Math.abs((f * sideSheetBehavior.HzCpKshMOoaw76hFcbOVRYMeRd) + left);
                sideSheetBehavior.getClass();
                if (fAbs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                float fAbs2 = Math.abs((f * sideSheetBehavior2.HzCpKshMOoaw76hFcbOVRYMeRd) + right);
                sideSheetBehavior2.getClass();
                if (fAbs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // com.vdodsodjsdt.KfeOQNOupsCg6878zi4e
    public final float LaeGQIruHQu81hfJldjMOQSVblH3x(int i) {
        switch (this.Ca81ebIan1u) {
            case 0:
                float fVBGA6pPLqSMuYGvprl270j7 = vBGA6pPLqSMuYGvprl270j7();
                return (i - fVBGA6pPLqSMuYGvprl270j7) / (f6ZQsR6bPLvvCDNXOUc() - fVBGA6pPLqSMuYGvprl270j7);
            default:
                float f = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.q1wNbhk2O6;
                return (f - i) / (f - f6ZQsR6bPLvvCDNXOUc());
        }
    }

    @Override // com.vdodsodjsdt.KfeOQNOupsCg6878zi4e
    public final int RhfGHxtXxy0M0grmp2jkRjQg() {
        switch (this.Ca81ebIan1u) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // com.vdodsodjsdt.KfeOQNOupsCg6878zi4e
    public final int TaDO7ogis3aEiWEtq() {
        switch (this.Ca81ebIan1u) {
            case 0:
                return this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.Ca81ebIan1u;
            default:
                return this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.q1wNbhk2O6;
        }
    }

    @Override // com.vdodsodjsdt.KfeOQNOupsCg6878zi4e
    public final int ZfQNn8hdWlEQ5cR94249PDsLR(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.Ca81ebIan1u) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // com.vdodsodjsdt.KfeOQNOupsCg6878zi4e
    public final boolean aXO0LSrt8bKV(View view) {
        switch (this.Ca81ebIan1u) {
            case 0:
                if (view.getRight() < (f6ZQsR6bPLvvCDNXOUc() - vBGA6pPLqSMuYGvprl270j7()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (f6ZQsR6bPLvvCDNXOUc() + this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.q1wNbhk2O6) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // com.vdodsodjsdt.KfeOQNOupsCg6878zi4e
    public final int f6ZQsR6bPLvvCDNXOUc() {
        switch (this.Ca81ebIan1u) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                return Math.max(0, sideSheetBehavior.p59rPv72J9 + sideSheetBehavior.Ca81ebIan1u);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                return Math.max(0, (sideSheetBehavior2.q1wNbhk2O6 - sideSheetBehavior2.KUYypEB4eNWOZWVDpH) - sideSheetBehavior2.Ca81ebIan1u);
        }
    }

    @Override // com.vdodsodjsdt.KfeOQNOupsCg6878zi4e
    public final boolean pzqP2AqKW6J5PO8zCKnW(float f) {
        switch (this.Ca81ebIan1u) {
            case 0:
                if (f > 0.0f) {
                }
                break;
            default:
                if (f < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // com.vdodsodjsdt.KfeOQNOupsCg6878zi4e
    public final int q11o1hieEkZDhF1MGOZI26oZiDT(View view) {
        switch (this.Ca81ebIan1u) {
            case 0:
                return view.getRight() + this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.Ca81ebIan1u;
            default:
                return view.getLeft() - this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.Ca81ebIan1u;
        }
    }

    @Override // com.vdodsodjsdt.KfeOQNOupsCg6878zi4e
    public final int vBGA6pPLqSMuYGvprl270j7() {
        switch (this.Ca81ebIan1u) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                return (-sideSheetBehavior.KUYypEB4eNWOZWVDpH) - sideSheetBehavior.Ca81ebIan1u;
            default:
                return this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.q1wNbhk2O6;
        }
    }

    @Override // com.vdodsodjsdt.KfeOQNOupsCg6878zi4e
    public final boolean vE4yDIjexsP2lGjLaTcB(float f, float f2) {
        switch (this.Ca81ebIan1u) {
            case 0:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500) {
                }
                break;
            default:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500) {
                }
                break;
        }
        return false;
    }

    @Override // com.vdodsodjsdt.KfeOQNOupsCg6878zi4e
    public final int w0Wu95l8dVNw5rZMRu(CoordinatorLayout coordinatorLayout) {
        switch (this.Ca81ebIan1u) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // com.vdodsodjsdt.KfeOQNOupsCg6878zi4e
    public final void zOk739gUM7zIZC25HHUxoiyixWFjn(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.Ca81ebIan1u) {
            case 0:
                if (i <= this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.q1wNbhk2O6) {
                    marginLayoutParams.leftMargin = i2;
                }
                break;
            default:
                int i3 = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.q1wNbhk2O6;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                }
                break;
        }
    }
}
