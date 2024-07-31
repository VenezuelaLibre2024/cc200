package p264s3;

import android.os.Bundle;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import p047d5.C1547b;
import p047d5.C1550e;
import p109h7.C2428k;
import p152k4.C3348a;
import p193n5.C3759z;
import p222p5.C4036l;
import p222p5.C4041n0;
import p236q5.C4192y;
import p264s3.InterfaceC4409b3;
import p264s3.InterfaceC4436h;
import p289u3.C4813e;

/* renamed from: s3.b3 */
/* loaded from: classes.dex */
public interface InterfaceC4409b3 {

    /* renamed from: s3.b3$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC4436h {

        /* renamed from: i */
        public static final b f16177i = new a().m17111e();

        /* renamed from: j */
        public static final String f16178j = C4041n0.m15478q0(0);

        /* renamed from: k */
        public static final InterfaceC4436h.a<b> f16179k = new InterfaceC4436h.a() { // from class: s3.c3
            @Override // p264s3.InterfaceC4436h.a
            /* renamed from: a */
            public final InterfaceC4436h mo6314a(Bundle bundle) {
                InterfaceC4409b3.b m17106c;
                m17106c = InterfaceC4409b3.b.m17106c(bundle);
                return m17106c;
            }
        };

        /* renamed from: h */
        public final C4036l f16180h;

        /* renamed from: s3.b3$b$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: b */
            public static final int[] f16181b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

            /* renamed from: a */
            public final C4036l.b f16182a = new C4036l.b();

            /* renamed from: a */
            public a m17107a(int i10) {
                this.f16182a.m15379a(i10);
                return this;
            }

            /* renamed from: b */
            public a m17108b(b bVar) {
                this.f16182a.m15380b(bVar.f16180h);
                return this;
            }

            /* renamed from: c */
            public a m17109c(int... iArr) {
                this.f16182a.m15381c(iArr);
                return this;
            }

            /* renamed from: d */
            public a m17110d(int i10, boolean z10) {
                this.f16182a.m15382d(i10, z10);
                return this;
            }

            /* renamed from: e */
            public b m17111e() {
                return new b(this.f16182a.m15383e());
            }
        }

        public b(C4036l c4036l) {
            this.f16180h = c4036l;
        }

        /* renamed from: c */
        public static b m17106c(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f16178j);
            if (integerArrayList == null) {
                return f16177i;
            }
            a aVar = new a();
            for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
                aVar.m17107a(integerArrayList.get(i10).intValue());
            }
            return aVar.m17111e();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f16180h.equals(((b) obj).f16180h);
            }
            return false;
        }

        public int hashCode() {
            return this.f16180h.hashCode();
        }
    }

    /* renamed from: s3.b3$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final C4036l f16183a;

        public c(C4036l c4036l) {
            this.f16183a = c4036l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f16183a.equals(((c) obj).f16183a);
            }
            return false;
        }

        public int hashCode() {
            return this.f16183a.hashCode();
        }
    }

    /* renamed from: s3.b3$d */
    /* loaded from: classes.dex */
    public interface d {
        default void onAudioAttributesChanged(C4813e c4813e) {
        }

        default void onAudioSessionIdChanged(int i10) {
        }

        default void onAvailableCommandsChanged(b bVar) {
        }

        default void onCues(C1550e c1550e) {
        }

        @Deprecated
        default void onCues(List<C1547b> list) {
        }

        default void onDeviceInfoChanged(C4471o c4471o) {
        }

        default void onDeviceVolumeChanged(int i10, boolean z10) {
        }

        default void onEvents(InterfaceC4409b3 interfaceC4409b3, c cVar) {
        }

        default void onIsLoadingChanged(boolean z10) {
        }

        default void onIsPlayingChanged(boolean z10) {
        }

        @Deprecated
        default void onLoadingChanged(boolean z10) {
        }

        default void onMaxSeekToPreviousPositionChanged(long j10) {
        }

        default void onMediaItemTransition(C4503u1 c4503u1, int i10) {
        }

        default void onMediaMetadataChanged(C4528z1 c4528z1) {
        }

        default void onMetadata(C3348a c3348a) {
        }

        default void onPlayWhenReadyChanged(boolean z10, int i10) {
        }

        default void onPlaybackParametersChanged(C4403a3 c4403a3) {
        }

        default void onPlaybackStateChanged(int i10) {
        }

        default void onPlaybackSuppressionReasonChanged(int i10) {
        }

        default void onPlayerError(C4519x2 c4519x2) {
        }

        default void onPlayerErrorChanged(C4519x2 c4519x2) {
        }

        @Deprecated
        default void onPlayerStateChanged(boolean z10, int i10) {
        }

        default void onPlaylistMetadataChanged(C4528z1 c4528z1) {
        }

        @Deprecated
        default void onPositionDiscontinuity(int i10) {
        }

        default void onPositionDiscontinuity(e eVar, e eVar2, int i10) {
        }

        default void onRenderedFirstFrame() {
        }

        default void onRepeatModeChanged(int i10) {
        }

        default void onSeekBackIncrementChanged(long j10) {
        }

        default void onSeekForwardIncrementChanged(long j10) {
        }

        @Deprecated
        default void onSeekProcessed() {
        }

        default void onShuffleModeEnabledChanged(boolean z10) {
        }

        default void onSkipSilenceEnabledChanged(boolean z10) {
        }

        default void onSurfaceSizeChanged(int i10, int i11) {
        }

        default void onTimelineChanged(AbstractC4505u3 abstractC4505u3, int i10) {
        }

        default void onTrackSelectionParametersChanged(C3759z c3759z) {
        }

        default void onTracksChanged(C4530z3 c4530z3) {
        }

        default void onVideoSizeChanged(C4192y c4192y) {
        }

        default void onVolumeChanged(float f10) {
        }
    }

    /* renamed from: s3.b3$e */
    /* loaded from: classes.dex */
    public static final class e implements InterfaceC4436h {

        /* renamed from: r */
        public static final String f16184r = C4041n0.m15478q0(0);

        /* renamed from: s */
        public static final String f16185s = C4041n0.m15478q0(1);

        /* renamed from: t */
        public static final String f16186t = C4041n0.m15478q0(2);

        /* renamed from: u */
        public static final String f16187u = C4041n0.m15478q0(3);

        /* renamed from: v */
        public static final String f16188v = C4041n0.m15478q0(4);

        /* renamed from: w */
        public static final String f16189w = C4041n0.m15478q0(5);

        /* renamed from: x */
        public static final String f16190x = C4041n0.m15478q0(6);

        /* renamed from: y */
        public static final InterfaceC4436h.a<e> f16191y = new InterfaceC4436h.a() { // from class: s3.d3
            @Override // p264s3.InterfaceC4436h.a
            /* renamed from: a */
            public final InterfaceC4436h mo6314a(Bundle bundle) {
                InterfaceC4409b3.e m17113b;
                m17113b = InterfaceC4409b3.e.m17113b(bundle);
                return m17113b;
            }
        };

        /* renamed from: h */
        public final Object f16192h;

        /* renamed from: i */
        @Deprecated
        public final int f16193i;

        /* renamed from: j */
        public final int f16194j;

        /* renamed from: k */
        public final C4503u1 f16195k;

        /* renamed from: l */
        public final Object f16196l;

        /* renamed from: m */
        public final int f16197m;

        /* renamed from: n */
        public final long f16198n;

        /* renamed from: o */
        public final long f16199o;

        /* renamed from: p */
        public final int f16200p;

        /* renamed from: q */
        public final int f16201q;

        public e(Object obj, int i10, C4503u1 c4503u1, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f16192h = obj;
            this.f16193i = i10;
            this.f16194j = i10;
            this.f16195k = c4503u1;
            this.f16196l = obj2;
            this.f16197m = i11;
            this.f16198n = j10;
            this.f16199o = j11;
            this.f16200p = i12;
            this.f16201q = i13;
        }

        /* renamed from: b */
        public static e m17113b(Bundle bundle) {
            int i10 = bundle.getInt(f16184r, 0);
            Bundle bundle2 = bundle.getBundle(f16185s);
            return new e(null, i10, bundle2 == null ? null : C4503u1.f16710v.mo6314a(bundle2), null, bundle.getInt(f16186t, 0), bundle.getLong(f16187u, 0L), bundle.getLong(f16188v, 0L), bundle.getInt(f16189w, -1), bundle.getInt(f16190x, -1));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f16194j == eVar.f16194j && this.f16197m == eVar.f16197m && this.f16198n == eVar.f16198n && this.f16199o == eVar.f16199o && this.f16200p == eVar.f16200p && this.f16201q == eVar.f16201q && C2428k.m9688a(this.f16192h, eVar.f16192h) && C2428k.m9688a(this.f16196l, eVar.f16196l) && C2428k.m9688a(this.f16195k, eVar.f16195k);
        }

        public int hashCode() {
            return C2428k.m9689b(this.f16192h, Integer.valueOf(this.f16194j), this.f16195k, this.f16196l, Integer.valueOf(this.f16197m), Long.valueOf(this.f16198n), Long.valueOf(this.f16199o), Integer.valueOf(this.f16200p), Integer.valueOf(this.f16201q));
        }
    }

    /* renamed from: A */
    int mo17072A();

    /* renamed from: B */
    void mo17073B(int i10);

    /* renamed from: C */
    boolean mo17074C();

    /* renamed from: D */
    int mo17075D();

    /* renamed from: E */
    int mo17076E();

    /* renamed from: F */
    AbstractC4505u3 mo17077F();

    /* renamed from: G */
    boolean mo17078G();

    /* renamed from: H */
    long mo17079H();

    /* renamed from: I */
    boolean mo17080I();

    /* renamed from: a */
    void mo17081a();

    /* renamed from: b */
    void mo17082b(long j10);

    /* renamed from: c */
    long mo17083c();

    /* renamed from: d */
    void mo17084d(C4403a3 c4403a3);

    /* renamed from: e */
    void mo17085e(float f10);

    /* renamed from: f */
    void mo17086f(Surface surface);

    /* renamed from: g */
    boolean mo17087g();

    /* renamed from: i */
    long mo17088i();

    /* renamed from: j */
    boolean mo17089j();

    /* renamed from: k */
    int mo17090k();

    /* renamed from: m */
    void mo17091m();

    /* renamed from: n */
    boolean mo17092n();

    /* renamed from: o */
    void mo17093o(d dVar);

    /* renamed from: p */
    int mo17094p();

    /* renamed from: q */
    C4519x2 mo17095q();

    /* renamed from: r */
    void mo17096r(boolean z10);

    void release();

    /* renamed from: s */
    long mo17097s();

    void stop();

    /* renamed from: t */
    long mo17098t();

    /* renamed from: u */
    boolean mo17099u();

    /* renamed from: v */
    int mo17100v();

    /* renamed from: x */
    C4530z3 mo17101x();

    /* renamed from: y */
    boolean mo17102y();

    /* renamed from: z */
    int mo17103z();
}
