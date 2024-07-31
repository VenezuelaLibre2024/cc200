package p289u3;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;
import p264s3.C4403a3;
import p264s3.C4463m1;
import p275t3.C4674s1;

/* renamed from: u3.t */
/* loaded from: classes.dex */
public interface InterfaceC4837t {

    /* renamed from: u3.t$a */
    /* loaded from: classes.dex */
    public static final class a extends Exception {

        /* renamed from: h */
        public final C4463m1 f18140h;

        public a(String str, C4463m1 c4463m1) {
            super(str);
            this.f18140h = c4463m1;
        }

        public a(Throwable th, C4463m1 c4463m1) {
            super(th);
            this.f18140h = c4463m1;
        }
    }

    /* renamed from: u3.t$b */
    /* loaded from: classes.dex */
    public static final class b extends Exception {

        /* renamed from: h */
        public final int f18141h;

        /* renamed from: i */
        public final boolean f18142i;

        /* renamed from: j */
        public final C4463m1 f18143j;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(int r4, int r5, int r6, int r7, p264s3.C4463m1 r8, boolean r9, java.lang.Exception r10) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r2 = "Config("
                r0.append(r2)
                r0.append(r5)
                java.lang.String r5 = ", "
                r0.append(r5)
                r0.append(r6)
                r0.append(r5)
                r0.append(r7)
                java.lang.String r5 = ")"
                r0.append(r5)
                r0.append(r1)
                r0.append(r8)
                if (r9 == 0) goto L38
                java.lang.String r5 = " (recoverable)"
                goto L3a
            L38:
                java.lang.String r5 = ""
            L3a:
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r3.<init>(r5, r10)
                r3.f18141h = r4
                r3.f18142i = r9
                r3.f18143j = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p289u3.InterfaceC4837t.b.<init>(int, int, int, int, s3.m1, boolean, java.lang.Exception):void");
        }
    }

    /* renamed from: u3.t$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        default void mo19033a(Exception exc) {
        }

        /* renamed from: b */
        default void mo19034b(long j10) {
        }

        /* renamed from: c */
        default void mo19035c() {
        }

        /* renamed from: d */
        void mo19036d(int i10, long j10, long j11);

        /* renamed from: e */
        void mo19037e();

        /* renamed from: f */
        default void mo19038f() {
        }

        void onSkipSilenceEnabledChanged(boolean z10);
    }

    /* renamed from: u3.t$d */
    /* loaded from: classes.dex */
    public static final class d extends Exception {

        /* renamed from: h */
        public final long f18144h;

        /* renamed from: i */
        public final long f18145i;

        public d(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f18144h = j10;
            this.f18145i = j11;
        }
    }

    /* renamed from: u3.t$e */
    /* loaded from: classes.dex */
    public static final class e extends Exception {

        /* renamed from: h */
        public final int f18146h;

        /* renamed from: i */
        public final boolean f18147i;

        /* renamed from: j */
        public final C4463m1 f18148j;

        public e(int i10, C4463m1 c4463m1, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f18147i = z10;
            this.f18146h = i10;
            this.f18148j = c4463m1;
        }
    }

    /* renamed from: a */
    boolean mo18896a(C4463m1 c4463m1);

    /* renamed from: b */
    default void mo18897b(C4674s1 c4674s1) {
    }

    /* renamed from: c */
    boolean mo18899c();

    /* renamed from: d */
    void mo18901d(C4403a3 c4403a3);

    /* renamed from: e */
    void mo18903e(float f10);

    /* renamed from: f */
    default void mo18905f(AudioDeviceInfo audioDeviceInfo) {
    }

    void flush();

    /* renamed from: g */
    void mo18906g(C4840w c4840w);

    /* renamed from: h */
    C4403a3 mo18908h();

    /* renamed from: i */
    void mo18910i(C4813e c4813e);

    /* renamed from: j */
    void mo18912j();

    /* renamed from: k */
    boolean mo18914k();

    /* renamed from: l */
    void mo18915l(int i10);

    /* renamed from: m */
    long mo18916m(boolean z10);

    /* renamed from: n */
    void mo18918n();

    /* renamed from: o */
    default void m19152o(long j10) {
    }

    /* renamed from: p */
    void mo18921p();

    void pause();

    /* renamed from: q */
    void mo18923q(c cVar);

    /* renamed from: r */
    void mo18925r();

    void reset();

    /* renamed from: s */
    int mo18926s(C4463m1 c4463m1);

    /* renamed from: t */
    void mo18928t();

    /* renamed from: u */
    boolean mo18929u(ByteBuffer byteBuffer, long j10, int i10);

    /* renamed from: v */
    void mo18930v(C4463m1 c4463m1, int i10, int[] iArr);

    /* renamed from: w */
    void mo18931w();

    /* renamed from: x */
    void mo18932x(boolean z10);
}
