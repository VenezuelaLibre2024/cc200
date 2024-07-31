package p117hf;

import ae.C0109o;
import android.media.AudioAttributes;
import android.media.MediaDataSource;
import android.media.SoundPool;
import android.os.Build;
import gd.C2245s;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.C1506d;
import p115hd.C2502n;
import p115hd.C2510v;
import p243qd.C4236c;
import td.C4747g;
import td.C4753m;

/* renamed from: hf.h */
/* loaded from: classes2.dex */
public final class C2570h extends AbstractC2565c {

    /* renamed from: l */
    public static final a f10072l;

    /* renamed from: m */
    public static final SoundPool f10073m;

    /* renamed from: n */
    public static final Map<Integer, C2570h> f10074n;

    /* renamed from: o */
    public static final Map<String, List<C2570h>> f10075o;

    /* renamed from: b */
    public final String f10076b;

    /* renamed from: c */
    public String f10077c;

    /* renamed from: d */
    public float f10078d;

    /* renamed from: e */
    public float f10079e;

    /* renamed from: f */
    public Integer f10080f;

    /* renamed from: g */
    public Integer f10081g;

    /* renamed from: h */
    public boolean f10082h;

    /* renamed from: i */
    public boolean f10083i;

    /* renamed from: j */
    public boolean f10084j;

    /* renamed from: k */
    public boolean f10085k;

    /* renamed from: hf.h$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }

        /* renamed from: b */
        public final SoundPool m10270b() {
            if (Build.VERSION.SDK_INT < 21) {
                return new SoundPool(100, 3, 0);
            }
            SoundPool build = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(Integer.MIN_VALUE).setUsage(14).build()).setMaxStreams(100).build();
            C4753m.m18652e(build, "{\n                val at…   .build()\n            }");
            return build;
        }
    }

    static {
        a aVar = new a(null);
        f10072l = aVar;
        SoundPool m10270b = aVar.m10270b();
        f10073m = m10270b;
        f10074n = Collections.synchronizedMap(new LinkedHashMap());
        f10075o = Collections.synchronizedMap(new LinkedHashMap());
        m10270b.setOnLoadCompleteListener(C2569g.f10071a);
    }

    public C2570h(String str) {
        C4753m.m18653f(str, "playerId");
        this.f10076b = str;
        this.f10078d = 1.0f;
        this.f10079e = 1.0f;
    }

    /* renamed from: s */
    public static final void m10260s(SoundPool soundPool, int i10, int i11) {
        C1506d.f5490a.m6106b("Loaded " + i10);
        Map<Integer, C2570h> map = f10074n;
        C2570h c2570h = map.get(Integer.valueOf(i10));
        if (c2570h != null) {
            map.remove(c2570h.f10080f);
            Map<String, List<C2570h>> map2 = f10075o;
            C4753m.m18652e(map2, "urlToPlayers");
            synchronized (map2) {
                List<C2570h> list = map2.get(c2570h.f10077c);
                if (list == null) {
                    list = C2502n.m9989e();
                }
                for (C2570h c2570h2 : list) {
                    C1506d c1506d = C1506d.f5490a;
                    c1506d.m6106b("Marking " + c2570h2 + " as loaded");
                    c2570h2.f10085k = false;
                    if (c2570h2.f10082h) {
                        c1506d.m6106b("Delayed start of " + c2570h2);
                        c2570h2.m10268z();
                    }
                }
                C2245s c2245s = C2245s.f8873a;
            }
        }
    }

    /* renamed from: A */
    public final UnsupportedOperationException m10261A(String str) {
        return new UnsupportedOperationException("LOW_LATENCY mode does not support: " + str);
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: a */
    public void mo10233a(boolean z10, boolean z11, boolean z12) {
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Integer mo10234b() {
        return (Integer) m10264v();
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: c */
    public /* bridge */ /* synthetic */ Integer mo10235c() {
        return (Integer) m10265w();
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: d */
    public String mo10236d() {
        return this.f10076b;
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: e */
    public boolean mo10237e() {
        return false;
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: g */
    public void mo10238g() {
        Integer num;
        if (this.f10082h && (num = this.f10081g) != null) {
            f10073m.pause(num.intValue());
        }
        this.f10082h = false;
        this.f10083i = true;
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: h */
    public void mo10239h() {
        if (!this.f10085k) {
            m10268z();
        }
        this.f10082h = true;
        this.f10083i = false;
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: i */
    public void mo10240i() {
        mo10248q();
        Integer num = this.f10080f;
        if (num != null) {
            int intValue = num.intValue();
            String str = this.f10077c;
            if (str == null) {
                return;
            }
            Map<String, List<C2570h>> map = f10075o;
            C4753m.m18652e(map, "urlToPlayers");
            synchronized (map) {
                List<C2570h> list = map.get(str);
                if (list == null) {
                    return;
                }
                if (C2510v.m10002E(list) == this) {
                    map.remove(str);
                    f10073m.unload(intValue);
                    f10074n.remove(Integer.valueOf(intValue));
                    this.f10080f = null;
                    C1506d.f5490a.m6106b("unloaded soundId " + intValue);
                    C2245s c2245s = C2245s.f8873a;
                } else {
                    list.remove(this);
                }
            }
        }
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: j */
    public void mo10241j(int i10) {
        throw m10261A("seek");
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: k */
    public void mo10242k(MediaDataSource mediaDataSource) {
        throw m10261A("setDataSource");
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: l */
    public void mo10243l(String str) {
        C4753m.m18653f(str, "playingRoute");
        throw m10261A("setPlayingRoute");
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: m */
    public void mo10244m(double d10) {
        this.f10079e = (float) d10;
        Integer num = this.f10081g;
        if (num == null || num == null) {
            return;
        }
        f10073m.setRate(num.intValue(), this.f10079e);
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: n */
    public void mo10245n(EnumC2566d enumC2566d) {
        Integer num;
        C4753m.m18653f(enumC2566d, "releaseMode");
        this.f10084j = enumC2566d == EnumC2566d.LOOP;
        if (!this.f10082h || (num = this.f10081g) == null) {
            return;
        }
        f10073m.setLoop(num.intValue(), m10267y());
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: o */
    public void mo10246o(String str, boolean z10) {
        C1506d c1506d;
        String str2;
        C4753m.m18653f(str, WebViewActivity.URL_EXTRA);
        String str3 = this.f10077c;
        if (str3 == null || !C4753m.m18648a(str3, str)) {
            if (this.f10080f != null) {
                mo10240i();
            }
            Map<String, List<C2570h>> map = f10075o;
            C4753m.m18652e(map, "urlToPlayers");
            synchronized (map) {
                this.f10077c = str;
                C4753m.m18652e(map, "urlToPlayers");
                List<C2570h> list = map.get(str);
                if (list == null) {
                    list = new ArrayList<>();
                    map.put(str, list);
                }
                List<C2570h> list2 = list;
                C2570h c2570h = (C2570h) C2510v.m10020s(list2);
                if (c2570h != null) {
                    this.f10085k = c2570h.f10085k;
                    this.f10080f = c2570h.f10080f;
                    c1506d = C1506d.f5490a;
                    str2 = "Reusing soundId " + this.f10080f + " for " + str + " is loading=" + this.f10085k + ' ' + this;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    this.f10085k = true;
                    this.f10080f = Integer.valueOf(f10073m.load(m10263u(str, z10), 1));
                    Map<Integer, C2570h> map2 = f10074n;
                    C4753m.m18652e(map2, "soundIdToPlayer");
                    map2.put(this.f10080f, this);
                    c1506d = C1506d.f5490a;
                    str2 = "time to call load() for " + str + ": " + (System.currentTimeMillis() - currentTimeMillis) + " player=" + this;
                }
                c1506d.m6106b(str2);
                list2.add(this);
            }
        }
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: p */
    public void mo10247p(double d10) {
        Integer num;
        this.f10078d = (float) d10;
        if (!this.f10082h || (num = this.f10081g) == null) {
            return;
        }
        int intValue = num.intValue();
        SoundPool soundPool = f10073m;
        float f10 = this.f10078d;
        soundPool.setVolume(intValue, f10, f10);
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: q */
    public void mo10248q() {
        if (this.f10082h) {
            Integer num = this.f10081g;
            if (num != null) {
                f10073m.stop(num.intValue());
            }
            this.f10082h = false;
        }
        this.f10083i = false;
    }

    /* renamed from: t */
    public final byte[] m10262t(URL url) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream openStream = url.openStream();
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                Integer valueOf = Integer.valueOf(openStream.read(bArr));
                if (!(valueOf.intValue() > 0)) {
                    valueOf = null;
                }
                if (valueOf == null) {
                    C2245s c2245s = C2245s.f8873a;
                    C4236c.m16274a(openStream, null);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    C4753m.m18652e(byteArray, "outputStream.toByteArray()");
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, valueOf.intValue());
            }
        } finally {
        }
    }

    /* renamed from: u */
    public final String m10263u(String str, boolean z10) {
        if (!z10) {
            return m10266x(str).getAbsolutePath();
        }
        if (str != null) {
            return C0109o.m457X(str, "file://");
        }
        return null;
    }

    /* renamed from: v */
    public Void m10264v() {
        throw m10261A("getDuration");
    }

    /* renamed from: w */
    public Void m10265w() {
        throw m10261A("getDuration");
    }

    /* renamed from: x */
    public final File m10266x(String str) {
        URL url = URI.create(str).toURL();
        C4753m.m18652e(url, "create(url).toURL()");
        byte[] m10262t = m10262t(url);
        File createTempFile = File.createTempFile("sound", "");
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        try {
            fileOutputStream.write(m10262t);
            createTempFile.deleteOnExit();
            C2245s c2245s = C2245s.f8873a;
            C4236c.m16274a(fileOutputStream, null);
            C4753m.m18652e(createTempFile, "tempFile");
            return createTempFile;
        } finally {
        }
    }

    /* renamed from: y */
    public final int m10267y() {
        return this.f10084j ? -1 : 0;
    }

    /* renamed from: z */
    public final void m10268z() {
        mo10244m(this.f10079e);
        if (this.f10083i) {
            Integer num = this.f10081g;
            if (num != null) {
                f10073m.resume(num.intValue());
            }
            this.f10083i = false;
            return;
        }
        Integer num2 = this.f10080f;
        if (num2 != null) {
            int intValue = num2.intValue();
            SoundPool soundPool = f10073m;
            float f10 = this.f10078d;
            this.f10081g = Integer.valueOf(soundPool.play(intValue, f10, f10, 0, m10267y(), 1.0f));
        }
    }
}
