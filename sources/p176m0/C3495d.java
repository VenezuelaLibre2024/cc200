package p176m0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* renamed from: m0.d */
/* loaded from: classes.dex */
public final class C3495d {

    /* renamed from: a */
    public final c f12258a;

    /* renamed from: m0.d$a */
    /* loaded from: classes.dex */
    public static final class a implements c {

        /* renamed from: a */
        public final InputContentInfo f12259a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f12259a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public a(Object obj) {
            this.f12259a = (InputContentInfo) obj;
        }

        @Override // p176m0.C3495d.c
        /* renamed from: a */
        public Uri mo13008a() {
            return this.f12259a.getContentUri();
        }

        @Override // p176m0.C3495d.c
        /* renamed from: b */
        public void mo13009b() {
            this.f12259a.requestPermission();
        }

        @Override // p176m0.C3495d.c
        /* renamed from: c */
        public Uri mo13010c() {
            return this.f12259a.getLinkUri();
        }

        @Override // p176m0.C3495d.c
        /* renamed from: d */
        public Object mo13011d() {
            return this.f12259a;
        }

        @Override // p176m0.C3495d.c
        public ClipDescription getDescription() {
            return this.f12259a.getDescription();
        }
    }

    /* renamed from: m0.d$b */
    /* loaded from: classes.dex */
    public static final class b implements c {

        /* renamed from: a */
        public final Uri f12260a;

        /* renamed from: b */
        public final ClipDescription f12261b;

        /* renamed from: c */
        public final Uri f12262c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f12260a = uri;
            this.f12261b = clipDescription;
            this.f12262c = uri2;
        }

        @Override // p176m0.C3495d.c
        /* renamed from: a */
        public Uri mo13008a() {
            return this.f12260a;
        }

        @Override // p176m0.C3495d.c
        /* renamed from: b */
        public void mo13009b() {
        }

        @Override // p176m0.C3495d.c
        /* renamed from: c */
        public Uri mo13010c() {
            return this.f12262c;
        }

        @Override // p176m0.C3495d.c
        /* renamed from: d */
        public Object mo13011d() {
            return null;
        }

        @Override // p176m0.C3495d.c
        public ClipDescription getDescription() {
            return this.f12261b;
        }
    }

    /* renamed from: m0.d$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        Uri mo13008a();

        /* renamed from: b */
        void mo13009b();

        /* renamed from: c */
        Uri mo13010c();

        /* renamed from: d */
        Object mo13011d();

        ClipDescription getDescription();
    }

    public C3495d(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f12258a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    public C3495d(c cVar) {
        this.f12258a = cVar;
    }

    /* renamed from: f */
    public static C3495d m13002f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new C3495d(new a(obj));
        }
        return null;
    }

    /* renamed from: a */
    public Uri m13003a() {
        return this.f12258a.mo13008a();
    }

    /* renamed from: b */
    public ClipDescription m13004b() {
        return this.f12258a.getDescription();
    }

    /* renamed from: c */
    public Uri m13005c() {
        return this.f12258a.mo13010c();
    }

    /* renamed from: d */
    public void m13006d() {
        this.f12258a.mo13009b();
    }

    /* renamed from: e */
    public Object m13007e() {
        return this.f12258a.mo13011d();
    }
}
