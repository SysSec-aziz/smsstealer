package com.vdodsodjsdt;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class FvJSxCBFhRZxgWDJOOeqcs8r extends KfeOQNOupsCg6878zi4e {
    public final AtomicReferenceFieldUpdater Ca81ebIan1u;
    public final AtomicReferenceFieldUpdater h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public final AtomicReferenceFieldUpdater jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public final AtomicReferenceFieldUpdater ko09zE6UAgwkV;
    public final AtomicReferenceFieldUpdater pYmKDYlAmhudp;

    public FvJSxCBFhRZxgWDJOOeqcs8r(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.Ca81ebIan1u = atomicReferenceFieldUpdater;
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = atomicReferenceFieldUpdater2;
        this.pYmKDYlAmhudp = atomicReferenceFieldUpdater3;
        this.ko09zE6UAgwkV = atomicReferenceFieldUpdater4;
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = atomicReferenceFieldUpdater5;
    }

    @Override // com.vdodsodjsdt.KfeOQNOupsCg6878zi4e
    public final boolean GI83zq0G8e7zkn(mBO0VNMBTnz mbo0vnmbtnz, pjNHP1KyCckTb7 pjnhp1kyccktb7, pjNHP1KyCckTb7 pjnhp1kyccktb72) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.pYmKDYlAmhudp;
            if (atomicReferenceFieldUpdater.compareAndSet(mbo0vnmbtnz, pjnhp1kyccktb7, pjnhp1kyccktb72)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(mbo0vnmbtnz) == pjnhp1kyccktb7);
        return false;
    }

    @Override // com.vdodsodjsdt.KfeOQNOupsCg6878zi4e
    public final boolean NSjgqmGjEzuugn2SsG1mZFP(mBO0VNMBTnz mbo0vnmbtnz, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
            if (atomicReferenceFieldUpdater.compareAndSet(mbo0vnmbtnz, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(mbo0vnmbtnz) == obj);
        return false;
    }

    @Override // com.vdodsodjsdt.KfeOQNOupsCg6878zi4e
    public final void YdNRGRc4rly(pjNHP1KyCckTb7 pjnhp1kyccktb7, Thread thread) {
        this.Ca81ebIan1u.lazySet(pjnhp1kyccktb7, thread);
    }

    @Override // com.vdodsodjsdt.KfeOQNOupsCg6878zi4e
    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(mBO0VNMBTnz mbo0vnmbtnz, yOuYFVCVfzcehN7zbUPS9Gj0l8 youyfvcvfzcehn7zbups9gj0l8, yOuYFVCVfzcehN7zbUPS9Gj0l8 youyfvcvfzcehn7zbups9gj0l82) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.ko09zE6UAgwkV;
            if (atomicReferenceFieldUpdater.compareAndSet(mbo0vnmbtnz, youyfvcvfzcehn7zbups9gj0l8, youyfvcvfzcehn7zbups9gj0l82)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(mbo0vnmbtnz) == youyfvcvfzcehn7zbups9gj0l8);
        return false;
    }

    @Override // com.vdodsodjsdt.KfeOQNOupsCg6878zi4e
    public final void ymT6yQrus3w(pjNHP1KyCckTb7 pjnhp1kyccktb7, pjNHP1KyCckTb7 pjnhp1kyccktb72) {
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.lazySet(pjnhp1kyccktb7, pjnhp1kyccktb72);
    }
}
