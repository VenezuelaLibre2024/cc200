package p304v3;

import p222p5.C4041n0;

/* renamed from: v3.e */
/* loaded from: classes.dex */
public final class C5108e {

    /* renamed from: a */
    public int f19271a;

    /* renamed from: b */
    public int f19272b;

    /* renamed from: c */
    public int f19273c;

    /* renamed from: d */
    public int f19274d;

    /* renamed from: e */
    public int f19275e;

    /* renamed from: f */
    public int f19276f;

    /* renamed from: g */
    public int f19277g;

    /* renamed from: h */
    public int f19278h;

    /* renamed from: i */
    public int f19279i;

    /* renamed from: j */
    public int f19280j;

    /* renamed from: k */
    public long f19281k;

    /* renamed from: l */
    public int f19282l;

    /* renamed from: a */
    public void m20758a(long j10) {
        m20759b(j10, 1);
    }

    /* renamed from: b */
    public final void m20759b(long j10, int i10) {
        this.f19281k += j10;
        this.f19282l += i10;
    }

    /* renamed from: c */
    public synchronized void m20760c() {
    }

    public String toString() {
        return C4041n0.m15397C("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f19271a), Integer.valueOf(this.f19272b), Integer.valueOf(this.f19273c), Integer.valueOf(this.f19274d), Integer.valueOf(this.f19275e), Integer.valueOf(this.f19276f), Integer.valueOf(this.f19277g), Integer.valueOf(this.f19278h), Integer.valueOf(this.f19279i), Integer.valueOf(this.f19280j), Long.valueOf(this.f19281k), Integer.valueOf(this.f19282l));
    }
}
