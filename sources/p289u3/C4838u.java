package p289u3;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import p222p5.C4041n0;

/* renamed from: u3.u */
/* loaded from: classes.dex */
public final class C4838u {

    /* renamed from: a */
    public final a f18149a;

    /* renamed from: b */
    public int f18150b;

    /* renamed from: c */
    public long f18151c;

    /* renamed from: d */
    public long f18152d;

    /* renamed from: e */
    public long f18153e;

    /* renamed from: f */
    public long f18154f;

    /* renamed from: u3.u$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final AudioTrack f18155a;

        /* renamed from: b */
        public final AudioTimestamp f18156b = new AudioTimestamp();

        /* renamed from: c */
        public long f18157c;

        /* renamed from: d */
        public long f18158d;

        /* renamed from: e */
        public long f18159e;

        public a(AudioTrack audioTrack) {
            this.f18155a = audioTrack;
        }

        /* renamed from: a */
        public long m19161a() {
            return this.f18159e;
        }

        /* renamed from: b */
        public long m19162b() {
            return this.f18156b.nanoTime / 1000;
        }

        /* renamed from: c */
        public boolean m19163c() {
            boolean timestamp = this.f18155a.getTimestamp(this.f18156b);
            if (timestamp) {
                long j10 = this.f18156b.framePosition;
                if (this.f18158d > j10) {
                    this.f18157c++;
                }
                this.f18158d = j10;
                this.f18159e = j10 + (this.f18157c << 32);
            }
            return timestamp;
        }
    }

    public C4838u(AudioTrack audioTrack) {
        if (C4041n0.f14513a >= 19) {
            this.f18149a = new a(audioTrack);
            m19159g();
        } else {
            this.f18149a = null;
            m19160h(3);
        }
    }

    /* renamed from: a */
    public void m19153a() {
        if (this.f18150b == 4) {
            m19159g();
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    public long m19154b() {
        a aVar = this.f18149a;
        if (aVar != null) {
            return aVar.m19161a();
        }
        return -1L;
    }

    @TargetApi(19)
    /* renamed from: c */
    public long m19155c() {
        a aVar = this.f18149a;
        if (aVar != null) {
            return aVar.m19162b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public boolean m19156d() {
        return this.f18150b == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (r0 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r0 == false) goto L26;
     */
    @android.annotation.TargetApi(19)
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m19157e(long r7) {
        /*
            r6 = this;
            u3.u$a r0 = r6.f18149a
            r1 = 0
            if (r0 == 0) goto L71
            long r2 = r6.f18153e
            long r2 = r7 - r2
            long r4 = r6.f18152d
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L10
            goto L71
        L10:
            r6.f18153e = r7
            boolean r0 = r0.m19163c()
            int r2 = r6.f18150b
            r3 = 3
            r4 = 1
            if (r2 == 0) goto L49
            r7 = 2
            if (r2 == r4) goto L33
            if (r2 == r7) goto L30
            if (r2 == r3) goto L2d
            r7 = 4
            if (r2 != r7) goto L27
            goto L70
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L2d:
            if (r0 == 0) goto L70
            goto L45
        L30:
            if (r0 != 0) goto L70
            goto L45
        L33:
            if (r0 == 0) goto L45
            u3.u$a r8 = r6.f18149a
            long r1 = r8.m19161a()
            long r3 = r6.f18154f
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 <= 0) goto L70
            r6.m19160h(r7)
            goto L70
        L45:
            r6.m19159g()
            goto L70
        L49:
            if (r0 == 0) goto L63
            u3.u$a r7 = r6.f18149a
            long r7 = r7.m19162b()
            long r2 = r6.f18151c
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto L71
            u3.u$a r7 = r6.f18149a
            long r7 = r7.m19161a()
            r6.f18154f = r7
            r6.m19160h(r4)
            goto L70
        L63:
            long r1 = r6.f18151c
            long r7 = r7 - r1
            r1 = 500000(0x7a120, double:2.47033E-318)
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L70
            r6.m19160h(r3)
        L70:
            r1 = r0
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p289u3.C4838u.m19157e(long):boolean");
    }

    /* renamed from: f */
    public void m19158f() {
        m19160h(4);
    }

    /* renamed from: g */
    public void m19159g() {
        if (this.f18149a != null) {
            m19160h(0);
        }
    }

    /* renamed from: h */
    public final void m19160h(int i10) {
        this.f18150b = i10;
        long j10 = 10000;
        if (i10 == 0) {
            this.f18153e = 0L;
            this.f18154f = -1L;
            this.f18151c = System.nanoTime() / 1000;
        } else if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                j10 = 10000000;
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException();
                }
                j10 = 500000;
            }
        }
        this.f18152d = j10;
    }
}
