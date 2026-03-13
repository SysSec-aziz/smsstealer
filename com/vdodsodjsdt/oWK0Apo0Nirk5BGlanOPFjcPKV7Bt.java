package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class oWK0Apo0Nirk5BGlanOPFjcPKV7Bt {
    public double GI83zq0G8e7zkn;
    public double LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final X2Ugfu9vdYrV03oOoksUGkmX M9e7PWhFYLD2lOGMker;
    public double NSjgqmGjEzuugn2SsG1mZFP;
    public boolean V57tEvNfxZVVcOCAOih5PKr;
    public double VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public double ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public double ZfQNn8hdWlEQ5cR94249PDsLR;
    public double zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public double zzpBGItXfub0yWj;

    public oWK0Apo0Nirk5BGlanOPFjcPKV7Bt() {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = Math.sqrt(1500.0d);
        this.zzpBGItXfub0yWj = 0.5d;
        this.V57tEvNfxZVVcOCAOih5PKr = false;
        this.GI83zq0G8e7zkn = Double.MAX_VALUE;
        this.M9e7PWhFYLD2lOGMker = new X2Ugfu9vdYrV03oOoksUGkmX();
    }

    public final X2Ugfu9vdYrV03oOoksUGkmX VxUQ9tBhpHJ2AAEDNW8sghc4m(double d, double d2, long j) {
        double dSin;
        double dCos;
        if (!this.V57tEvNfxZVVcOCAOih5PKr) {
            if (this.GI83zq0G8e7zkn == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.zzpBGItXfub0yWj;
            if (d3 > 1.0d) {
                double d4 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.zzpBGItXfub0yWj;
                double d6 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.NSjgqmGjEzuugn2SsG1mZFP = Math.sqrt(1.0d - (d3 * d3)) * this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            }
            this.V57tEvNfxZVVcOCAOih5PKr = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.GI83zq0G8e7zkn;
        double d9 = this.zzpBGItXfub0yWj;
        if (d9 > 1.0d) {
            double d10 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            double d11 = ((d10 * d8) - d2) / (d10 - this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
            double d12 = d8 - d11;
            dSin = (Math.pow(2.718281828459045d, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            double dPow = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow;
        } else if (d9 == 1.0d) {
            double d15 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double dPow2 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double dPow3 = Math.pow(2.718281828459045d, (-this.VxUQ9tBhpHJ2AAEDNW8sghc4m) * d7) * d17;
            double d18 = -this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow3 * d18);
            dSin = dPow2;
        } else {
            double d19 = 1.0d / this.NSjgqmGjEzuugn2SsG1mZFP;
            double d20 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            dSin = ((Math.sin(this.NSjgqmGjEzuugn2SsG1mZFP * d7) * d21) + (Math.cos(this.NSjgqmGjEzuugn2SsG1mZFP * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            double d23 = this.zzpBGItXfub0yWj;
            double d24 = (-d22) * dSin * d23;
            double dPow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.NSjgqmGjEzuugn2SsG1mZFP;
            double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.NSjgqmGjEzuugn2SsG1mZFP;
            dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow4) + d24;
        }
        float f = (float) (dSin + this.GI83zq0G8e7zkn);
        X2Ugfu9vdYrV03oOoksUGkmX x2Ugfu9vdYrV03oOoksUGkmX = this.M9e7PWhFYLD2lOGMker;
        x2Ugfu9vdYrV03oOoksUGkmX.VxUQ9tBhpHJ2AAEDNW8sghc4m = f;
        x2Ugfu9vdYrV03oOoksUGkmX.zzpBGItXfub0yWj = (float) dCos;
        return x2Ugfu9vdYrV03oOoksUGkmX;
    }

    public oWK0Apo0Nirk5BGlanOPFjcPKV7Bt(float f) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = Math.sqrt(1500.0d);
        this.zzpBGItXfub0yWj = 0.5d;
        this.V57tEvNfxZVVcOCAOih5PKr = false;
        this.M9e7PWhFYLD2lOGMker = new X2Ugfu9vdYrV03oOoksUGkmX();
        this.GI83zq0G8e7zkn = f;
    }
}
