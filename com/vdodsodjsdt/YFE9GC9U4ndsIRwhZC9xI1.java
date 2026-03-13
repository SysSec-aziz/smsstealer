package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class YFE9GC9U4ndsIRwhZC9xI1 extends HnVNsdy3Lwin5xfqq {
    public int HzCpKshMOoaw76hFcbOVRYMeRd;
    public PJtsuaigmVZElwy04tnlV KUYypEB4eNWOZWVDpH;
    public int M9e7PWhFYLD2lOGMker;

    @Override // com.vdodsodjsdt.HnVNsdy3Lwin5xfqq
    public final void NSjgqmGjEzuugn2SsG1mZFP(IPwvkMKvXW4H2mJtQ4szs9vgoyzLD iPwvkMKvXW4H2mJtQ4szs9vgoyzLD, boolean z) {
        int i = this.M9e7PWhFYLD2lOGMker;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = i;
        if (z) {
            if (i == 5) {
                this.HzCpKshMOoaw76hFcbOVRYMeRd = 1;
            } else if (i == 6) {
                this.HzCpKshMOoaw76hFcbOVRYMeRd = 0;
            }
        } else if (i == 5) {
            this.HzCpKshMOoaw76hFcbOVRYMeRd = 0;
        } else if (i == 6) {
            this.HzCpKshMOoaw76hFcbOVRYMeRd = 1;
        }
        if (iPwvkMKvXW4H2mJtQ4szs9vgoyzLD instanceof PJtsuaigmVZElwy04tnlV) {
            ((PJtsuaigmVZElwy04tnlV) iPwvkMKvXW4H2mJtQ4szs9vgoyzLD).lxWWbfAOLs4jWzd7PSIiIJ = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.KUYypEB4eNWOZWVDpH.VOvSEdhaZyc0oOGQ8;
    }

    public int getMargin() {
        return this.KUYypEB4eNWOZWVDpH.h2b7InwIaORKN91X7whfQh4;
    }

    public int getType() {
        return this.M9e7PWhFYLD2lOGMker;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.KUYypEB4eNWOZWVDpH.VOvSEdhaZyc0oOGQ8 = z;
    }

    public void setDpMargin(int i) {
        this.KUYypEB4eNWOZWVDpH.h2b7InwIaORKN91X7whfQh4 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.KUYypEB4eNWOZWVDpH.h2b7InwIaORKN91X7whfQh4 = i;
    }

    public void setType(int i) {
        this.M9e7PWhFYLD2lOGMker = i;
    }
}
