package p025bc;

import android.media.MediaFormat;
import android.os.Build;
import cc.C1006a;
import cc.C1007b;
import cc.C1008c;
import cc.C1009d;
import cc.C1011f;
import cc.InterfaceC1010e;
import java.util.Iterator;
import java.util.List;
import p311vb.EnumC5159c;
import p325wb.C5470c;
import p325wb.C5472e;

/* renamed from: bc.c */
/* loaded from: classes.dex */
public class C0543c implements InterfaceC0545e {

    /* renamed from: b */
    public static final C5472e f2415b = new C5472e(C0543c.class.getSimpleName());

    /* renamed from: a */
    public final c f2416a;

    /* renamed from: bc.c$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public C1009d f2417a;

        /* renamed from: b */
        public int f2418b;

        /* renamed from: c */
        public long f2419c;

        /* renamed from: d */
        public float f2420d;

        /* renamed from: e */
        public String f2421e;

        public b() {
            this.f2417a = new C1009d();
            this.f2418b = 30;
            this.f2419c = Long.MIN_VALUE;
            this.f2420d = 3.0f;
            this.f2421e = "video/avc";
        }

        public b(InterfaceC1010e interfaceC1010e) {
            C1009d c1009d = new C1009d();
            this.f2417a = c1009d;
            this.f2418b = 30;
            this.f2419c = Long.MIN_VALUE;
            this.f2420d = 3.0f;
            this.f2421e = "video/avc";
            c1009d.m4246b(interfaceC1010e);
        }

        /* renamed from: a */
        public b m2681a(long j10) {
            this.f2419c = j10;
            return this;
        }

        /* renamed from: b */
        public C0543c m2682b() {
            return new C0543c(m2685e());
        }

        /* renamed from: c */
        public b m2683c(int i10) {
            this.f2418b = i10;
            return this;
        }

        /* renamed from: d */
        public b m2684d(float f10) {
            this.f2420d = f10;
            return this;
        }

        /* renamed from: e */
        public c m2685e() {
            c cVar = new c();
            cVar.f2422a = this.f2417a;
            cVar.f2424c = this.f2418b;
            cVar.f2423b = this.f2419c;
            cVar.f2425d = this.f2420d;
            cVar.f2426e = this.f2421e;
            return cVar;
        }
    }

    /* renamed from: bc.c$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public InterfaceC1010e f2422a;

        /* renamed from: b */
        public long f2423b;

        /* renamed from: c */
        public int f2424c;

        /* renamed from: d */
        public float f2425d;

        /* renamed from: e */
        public String f2426e;

        public c() {
        }
    }

    public C0543c(c cVar) {
        this.f2416a = cVar;
    }

    /* renamed from: b */
    public static b m2674b(int i10) {
        return new b(new C1006a(i10));
    }

    /* renamed from: c */
    public static b m2675c(int i10, int i11) {
        return new b(new C1006a(i10, i11));
    }

    /* renamed from: e */
    public static b m2676e(int i10, int i11) {
        return new b(new C1007b(i10, i11));
    }

    @Override // p025bc.InterfaceC0545e
    /* renamed from: a */
    public EnumC5159c mo2658a(List<MediaFormat> list, MediaFormat mediaFormat) {
        int m4248b;
        int m4247a;
        boolean m2677d = m2677d(list);
        C1008c m2679g = m2679g(list);
        int m4245d = m2679g.m4245d();
        int m4244c = m2679g.m4244c();
        C5472e c5472e = f2415b;
        c5472e.m21682b("Input width&height: " + m4245d + "x" + m4244c);
        try {
            C1011f mo4243a = this.f2416a.f2422a.mo4243a(m2679g);
            if (mo4243a instanceof C1008c) {
                C1008c c1008c = (C1008c) mo4243a;
                m4248b = c1008c.m4245d();
                m4247a = c1008c.m4244c();
            } else if (m4245d >= m4244c) {
                m4248b = mo4243a.m4247a();
                m4247a = mo4243a.m4248b();
            } else {
                m4248b = mo4243a.m4248b();
                m4247a = mo4243a.m4247a();
            }
            c5472e.m21682b("Output width&height: " + m4248b + "x" + m4247a);
            boolean z10 = m2679g.m4248b() <= mo4243a.m4248b();
            int m2680h = m2680h(list);
            int i10 = this.f2416a.f2424c;
            if (m2680h > 0) {
                i10 = Math.min(m2680h, i10);
            }
            boolean z11 = m2680h <= i10;
            int m2678f = m2678f(list);
            boolean z12 = ((float) m2678f) >= this.f2416a.f2425d;
            if (!(list.size() == 1) || !m2677d || !z10 || !z11 || !z12) {
                mediaFormat.setString("mime", this.f2416a.f2426e);
                mediaFormat.setInteger("width", m4248b);
                mediaFormat.setInteger("height", m4247a);
                mediaFormat.setInteger("rotation-degrees", 0);
                mediaFormat.setInteger("frame-rate", i10);
                if (Build.VERSION.SDK_INT >= 25) {
                    mediaFormat.setFloat("i-frame-interval", this.f2416a.f2425d);
                } else {
                    mediaFormat.setInteger("i-frame-interval", (int) Math.ceil(this.f2416a.f2425d));
                }
                mediaFormat.setInteger("color-format", 2130708361);
                mediaFormat.setInteger("bitrate", (int) (this.f2416a.f2423b == Long.MIN_VALUE ? C5470c.m21678b(m4248b, m4247a, i10) : this.f2416a.f2423b));
                return EnumC5159c.COMPRESSING;
            }
            c5472e.m21682b("Input minSize: " + m2679g.m4248b() + ", desired minSize: " + mo4243a.m4248b() + "\nInput frameRate: " + m2680h + ", desired frameRate: " + i10 + "\nInput iFrameInterval: " + m2678f + ", desired iFrameInterval: " + this.f2416a.f2425d);
            return EnumC5159c.PASS_THROUGH;
        } catch (Exception e10) {
            throw new RuntimeException("Resizer error:", e10);
        }
    }

    /* renamed from: d */
    public final boolean m2677d(List<MediaFormat> list) {
        Iterator<MediaFormat> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().getString("mime").equalsIgnoreCase(this.f2416a.f2426e)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int m2678f(List<MediaFormat> list) {
        int i10 = 0;
        int i11 = 0;
        for (MediaFormat mediaFormat : list) {
            if (mediaFormat.containsKey("i-frame-interval")) {
                i10++;
                i11 += mediaFormat.getInteger("i-frame-interval");
            }
        }
        if (i10 > 0) {
            return Math.round(i11 / i10);
        }
        return -1;
    }

    /* renamed from: g */
    public final C1008c m2679g(List<MediaFormat> list) {
        int size = list.size();
        float[] fArr = new float[size];
        boolean[] zArr = new boolean[size];
        float f10 = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            MediaFormat mediaFormat = list.get(i10);
            float integer = mediaFormat.getInteger("width");
            float integer2 = mediaFormat.getInteger("height");
            boolean z10 = (mediaFormat.containsKey("rotation-degrees") ? mediaFormat.getInteger("rotation-degrees") : 0) % 180 != 0;
            zArr[i10] = z10;
            fArr[i10] = z10 ? integer2 / integer : integer / integer2;
            f10 += fArr[i10];
        }
        float f11 = f10 / size;
        float f12 = Float.MAX_VALUE;
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            float abs = Math.abs(fArr[i12] - f11);
            if (abs < f12) {
                i11 = i12;
                f12 = abs;
            }
        }
        MediaFormat mediaFormat2 = list.get(i11);
        int integer3 = mediaFormat2.getInteger("width");
        int integer4 = mediaFormat2.getInteger("height");
        int i13 = zArr[i11] ? integer4 : integer3;
        if (!zArr[i11]) {
            integer3 = integer4;
        }
        return new C1008c(i13, integer3);
    }

    /* renamed from: h */
    public final int m2680h(List<MediaFormat> list) {
        int i10 = Integer.MAX_VALUE;
        for (MediaFormat mediaFormat : list) {
            if (mediaFormat.containsKey("frame-rate")) {
                i10 = Math.min(i10, mediaFormat.getInteger("frame-rate"));
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10;
    }
}
