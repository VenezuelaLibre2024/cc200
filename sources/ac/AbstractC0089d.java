package ac;

import ac.InterfaceC0087b;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import java.io.IOException;
import java.util.HashSet;
import p311vb.EnumC5160d;
import p325wb.C5471d;
import p325wb.C5472e;
import p325wb.C5474g;

/* renamed from: ac.d */
/* loaded from: classes.dex */
public abstract class AbstractC0089d implements InterfaceC0087b {

    /* renamed from: j */
    public static final C5472e f311j = new C5472e(AbstractC0089d.class.getSimpleName());

    /* renamed from: c */
    public boolean f314c;

    /* renamed from: d */
    public boolean f315d;

    /* renamed from: a */
    public MediaMetadataRetriever f312a = new MediaMetadataRetriever();

    /* renamed from: b */
    public MediaExtractor f313b = new MediaExtractor();

    /* renamed from: e */
    public final C5474g<MediaFormat> f316e = new C5474g<>();

    /* renamed from: f */
    public final C5474g<Integer> f317f = new C5474g<>();

    /* renamed from: g */
    public final HashSet<EnumC5160d> f318g = new HashSet<>();

    /* renamed from: h */
    public final C5474g<Long> f319h = new C5474g<>(0L, 0L);

    /* renamed from: i */
    public long f320i = Long.MIN_VALUE;

    /* renamed from: a */
    public abstract void mo390a(MediaExtractor mediaExtractor);

    @Override // ac.InterfaceC0087b
    /* renamed from: b */
    public long mo378b(long j10) {
        m392n();
        long j11 = this.f320i;
        if (j11 <= 0) {
            j11 = this.f313b.getSampleTime();
        }
        boolean contains = this.f318g.contains(EnumC5160d.VIDEO);
        boolean contains2 = this.f318g.contains(EnumC5160d.AUDIO);
        C5472e c5472e = f311j;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Seeking to: ");
        long j12 = j10 + j11;
        sb2.append(j12 / 1000);
        sb2.append(" first: ");
        sb2.append(j11 / 1000);
        sb2.append(" hasVideo: ");
        sb2.append(contains);
        sb2.append(" hasAudio: ");
        sb2.append(contains2);
        c5472e.m21682b(sb2.toString());
        this.f313b.seekTo(j12, 2);
        if (contains && contains2) {
            while (this.f313b.getSampleTrackIndex() != this.f317f.m21699g().intValue()) {
                this.f313b.advance();
            }
            f311j.m21682b("Second seek to " + (this.f313b.getSampleTime() / 1000));
            MediaExtractor mediaExtractor = this.f313b;
            mediaExtractor.seekTo(mediaExtractor.getSampleTime(), 2);
        }
        return this.f313b.getSampleTime() - j11;
    }

    /* renamed from: c */
    public abstract void mo391c(MediaMetadataRetriever mediaMetadataRetriever);

    @Override // ac.InterfaceC0087b
    /* renamed from: d */
    public long mo379d() {
        m393o();
        try {
            return Long.parseLong(this.f312a.extractMetadata(9)) * 1000;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // ac.InterfaceC0087b
    /* renamed from: e */
    public MediaFormat mo380e(EnumC5160d enumC5160d) {
        if (this.f316e.m21694b(enumC5160d)) {
            return this.f316e.m21693a(enumC5160d);
        }
        m392n();
        int trackCount = this.f313b.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            MediaFormat trackFormat = this.f313b.getTrackFormat(i10);
            String string = trackFormat.getString("mime");
            EnumC5160d enumC5160d2 = EnumC5160d.VIDEO;
            if ((enumC5160d == enumC5160d2 && string.startsWith("video/")) || (enumC5160d == (enumC5160d2 = EnumC5160d.AUDIO) && string.startsWith("audio/"))) {
                this.f317f.m21700h(enumC5160d2, Integer.valueOf(i10));
                this.f316e.m21700h(enumC5160d2, trackFormat);
                return trackFormat;
            }
        }
        return null;
    }

    @Override // ac.InterfaceC0087b
    /* renamed from: f */
    public void mo381f(EnumC5160d enumC5160d) {
        this.f318g.remove(enumC5160d);
        if (this.f318g.isEmpty()) {
            m394p();
        }
    }

    @Override // ac.InterfaceC0087b
    /* renamed from: g */
    public void mo382g(EnumC5160d enumC5160d) {
        this.f318g.add(enumC5160d);
        this.f313b.selectTrack(this.f317f.m21697e(enumC5160d).intValue());
    }

    @Override // ac.InterfaceC0087b
    public int getOrientation() {
        m393o();
        try {
            return Integer.parseInt(this.f312a.extractMetadata(24));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // ac.InterfaceC0087b
    /* renamed from: h */
    public boolean mo383h() {
        m392n();
        return this.f313b.getSampleTrackIndex() < 0;
    }

    @Override // ac.InterfaceC0087b
    /* renamed from: i */
    public long mo384i() {
        if (this.f320i == Long.MIN_VALUE) {
            return 0L;
        }
        return Math.max(this.f319h.m21698f().longValue(), this.f319h.m21699g().longValue()) - this.f320i;
    }

    @Override // ac.InterfaceC0087b
    /* renamed from: j */
    public void mo385j(InterfaceC0087b.a aVar) {
        m392n();
        int sampleTrackIndex = this.f313b.getSampleTrackIndex();
        aVar.f309d = this.f313b.readSampleData(aVar.f306a, 0);
        aVar.f307b = (this.f313b.getSampleFlags() & 1) != 0;
        long sampleTime = this.f313b.getSampleTime();
        aVar.f308c = sampleTime;
        if (this.f320i == Long.MIN_VALUE) {
            this.f320i = sampleTime;
        }
        EnumC5160d enumC5160d = (this.f317f.m21695c() && this.f317f.m21698f().intValue() == sampleTrackIndex) ? EnumC5160d.AUDIO : (this.f317f.m21696d() && this.f317f.m21699g().intValue() == sampleTrackIndex) ? EnumC5160d.VIDEO : null;
        if (enumC5160d != null) {
            this.f319h.m21700h(enumC5160d, Long.valueOf(aVar.f308c));
            this.f313b.advance();
        } else {
            throw new RuntimeException("Unknown type: " + sampleTrackIndex);
        }
    }

    @Override // ac.InterfaceC0087b
    /* renamed from: k */
    public void mo386k() {
        this.f318g.clear();
        this.f320i = Long.MIN_VALUE;
        this.f319h.m21701i(0L);
        this.f319h.m21702j(0L);
        try {
            this.f313b.release();
        } catch (Exception unused) {
        }
        this.f313b = new MediaExtractor();
        this.f315d = false;
        try {
            this.f312a.release();
        } catch (Exception unused2) {
        }
        this.f312a = new MediaMetadataRetriever();
        this.f314c = false;
    }

    @Override // ac.InterfaceC0087b
    /* renamed from: l */
    public boolean mo387l(EnumC5160d enumC5160d) {
        m392n();
        return this.f313b.getSampleTrackIndex() == this.f317f.m21697e(enumC5160d).intValue();
    }

    @Override // ac.InterfaceC0087b
    /* renamed from: m */
    public double[] mo388m() {
        float[] m21679a;
        m393o();
        String extractMetadata = this.f312a.extractMetadata(23);
        if (extractMetadata == null || (m21679a = new C5471d().m21679a(extractMetadata)) == null) {
            return null;
        }
        return new double[]{m21679a[0], m21679a[1]};
    }

    /* renamed from: n */
    public final void m392n() {
        if (this.f315d) {
            return;
        }
        this.f315d = true;
        try {
            mo390a(this.f313b);
        } catch (IOException e10) {
            f311j.m21681a("Got IOException while trying to open MediaExtractor.", e10);
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: o */
    public final void m393o() {
        if (this.f314c) {
            return;
        }
        this.f314c = true;
        mo391c(this.f312a);
    }

    /* renamed from: p */
    public void m394p() {
        try {
            this.f313b.release();
        } catch (Exception e10) {
            f311j.m21689j("Could not release extractor:", e10);
        }
        try {
            this.f312a.release();
        } catch (Exception e11) {
            f311j.m21689j("Could not release metadata:", e11);
        }
    }
}
