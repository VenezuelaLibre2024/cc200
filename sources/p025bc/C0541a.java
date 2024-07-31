package p025bc;

import android.media.MediaFormat;
import java.util.Iterator;
import java.util.List;
import p079f6.C1841a;
import p311vb.EnumC5159c;
import p325wb.C5470c;
import p325wb.C5472e;

/* renamed from: bc.a */
/* loaded from: classes.dex */
public class C0541a implements InterfaceC0545e {

    /* renamed from: b */
    public static final C5472e f2405b = new C5472e(C0541a.class.getSimpleName());

    /* renamed from: a */
    public c f2406a;

    /* renamed from: bc.a$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public int f2407a = -1;

        /* renamed from: b */
        public int f2408b = -1;

        /* renamed from: c */
        public long f2409c = Long.MIN_VALUE;

        /* renamed from: d */
        public String f2410d = "audio/mp4a-latm";

        /* renamed from: a */
        public C0541a m2661a() {
            return new C0541a(m2663c());
        }

        /* renamed from: b */
        public b m2662b(int i10) {
            this.f2407a = i10;
            return this;
        }

        /* renamed from: c */
        public c m2663c() {
            c cVar = new c();
            cVar.f2411a = this.f2407a;
            cVar.f2412b = this.f2408b;
            cVar.f2414d = this.f2410d;
            cVar.f2413c = this.f2409c;
            return cVar;
        }

        /* renamed from: d */
        public b m2664d(int i10) {
            this.f2408b = i10;
            return this;
        }
    }

    /* renamed from: bc.a$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public int f2411a;

        /* renamed from: b */
        public int f2412b;

        /* renamed from: c */
        public long f2413c;

        /* renamed from: d */
        public String f2414d;

        public c() {
        }
    }

    public C0541a(c cVar) {
        this.f2406a = cVar;
    }

    /* renamed from: b */
    public static b m2657b() {
        return new b();
    }

    @Override // p025bc.InterfaceC0545e
    /* renamed from: a */
    public EnumC5159c mo2658a(List<MediaFormat> list, MediaFormat mediaFormat) {
        int m2659c = this.f2406a.f2411a == -1 ? m2659c(list) : this.f2406a.f2411a;
        int m2660d = this.f2406a.f2412b == -1 ? m2660d(list) : this.f2406a.f2412b;
        long integer = (list.size() == 1 && this.f2406a.f2411a == -1 && this.f2406a.f2412b == -1 && this.f2406a.f2413c == Long.MIN_VALUE && list.get(0).containsKey("bitrate")) ? list.get(0).getInteger("bitrate") : this.f2406a.f2413c == Long.MIN_VALUE ? C5470c.m21677a(m2659c, m2660d) : this.f2406a.f2413c;
        mediaFormat.setString("mime", this.f2406a.f2414d);
        mediaFormat.setInteger("sample-rate", m2660d);
        mediaFormat.setInteger("channel-count", m2659c);
        mediaFormat.setInteger("bitrate", (int) integer);
        if ("audio/mp4a-latm".equalsIgnoreCase(this.f2406a.f2414d)) {
            mediaFormat.setInteger("aac-profile", 2);
        }
        return EnumC5159c.COMPRESSING;
    }

    /* renamed from: c */
    public final int m2659c(List<MediaFormat> list) {
        Iterator<MediaFormat> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 = Math.max(i10, it.next().getInteger("channel-count"));
        }
        return i10;
    }

    /* renamed from: d */
    public final int m2660d(List<MediaFormat> list) {
        Iterator<MediaFormat> it = list.iterator();
        int i10 = C1841a.e.API_PRIORITY_OTHER;
        while (it.hasNext()) {
            i10 = Math.min(i10, it.next().getInteger("sample-rate"));
        }
        return i10;
    }
}
