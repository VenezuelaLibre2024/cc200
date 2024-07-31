package p148k0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;
import p133j0.C3205d;

/* renamed from: k0.c */
/* loaded from: classes.dex */
public final class C3309c {

    /* renamed from: a */
    public final f f11558a;

    /* renamed from: k0.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final c f11559a;

        public a(ClipData clipData, int i10) {
            this.f11559a = Build.VERSION.SDK_INT >= 31 ? new b(clipData, i10) : new d(clipData, i10);
        }

        /* renamed from: a */
        public C3309c m12184a() {
            return this.f11559a.mo12188a();
        }

        /* renamed from: b */
        public a m12185b(Bundle bundle) {
            this.f11559a.mo12189b(bundle);
            return this;
        }

        /* renamed from: c */
        public a m12186c(int i10) {
            this.f11559a.mo12191d(i10);
            return this;
        }

        /* renamed from: d */
        public a m12187d(Uri uri) {
            this.f11559a.mo12190c(uri);
            return this;
        }
    }

    /* renamed from: k0.c$b */
    /* loaded from: classes.dex */
    public static final class b implements c {

        /* renamed from: a */
        public final ContentInfo.Builder f11560a;

        public b(ClipData clipData, int i10) {
            this.f11560a = new ContentInfo.Builder(clipData, i10);
        }

        @Override // p148k0.C3309c.c
        /* renamed from: a */
        public C3309c mo12188a() {
            return new C3309c(new e(this.f11560a.build()));
        }

        @Override // p148k0.C3309c.c
        /* renamed from: b */
        public void mo12189b(Bundle bundle) {
            this.f11560a.setExtras(bundle);
        }

        @Override // p148k0.C3309c.c
        /* renamed from: c */
        public void mo12190c(Uri uri) {
            this.f11560a.setLinkUri(uri);
        }

        @Override // p148k0.C3309c.c
        /* renamed from: d */
        public void mo12191d(int i10) {
            this.f11560a.setFlags(i10);
        }
    }

    /* renamed from: k0.c$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        C3309c mo12188a();

        /* renamed from: b */
        void mo12189b(Bundle bundle);

        /* renamed from: c */
        void mo12190c(Uri uri);

        /* renamed from: d */
        void mo12191d(int i10);
    }

    /* renamed from: k0.c$d */
    /* loaded from: classes.dex */
    public static final class d implements c {

        /* renamed from: a */
        public ClipData f11561a;

        /* renamed from: b */
        public int f11562b;

        /* renamed from: c */
        public int f11563c;

        /* renamed from: d */
        public Uri f11564d;

        /* renamed from: e */
        public Bundle f11565e;

        public d(ClipData clipData, int i10) {
            this.f11561a = clipData;
            this.f11562b = i10;
        }

        @Override // p148k0.C3309c.c
        /* renamed from: a */
        public C3309c mo12188a() {
            return new C3309c(new g(this));
        }

        @Override // p148k0.C3309c.c
        /* renamed from: b */
        public void mo12189b(Bundle bundle) {
            this.f11565e = bundle;
        }

        @Override // p148k0.C3309c.c
        /* renamed from: c */
        public void mo12190c(Uri uri) {
            this.f11564d = uri;
        }

        @Override // p148k0.C3309c.c
        /* renamed from: d */
        public void mo12191d(int i10) {
            this.f11563c = i10;
        }
    }

    /* renamed from: k0.c$e */
    /* loaded from: classes.dex */
    public static final class e implements f {

        /* renamed from: a */
        public final ContentInfo f11566a;

        public e(ContentInfo contentInfo) {
            this.f11566a = (ContentInfo) C3205d.m11414j(contentInfo);
        }

        @Override // p148k0.C3309c.f
        /* renamed from: a */
        public ClipData mo12192a() {
            return this.f11566a.getClip();
        }

        @Override // p148k0.C3309c.f
        /* renamed from: b */
        public int mo12193b() {
            return this.f11566a.getFlags();
        }

        @Override // p148k0.C3309c.f
        /* renamed from: c */
        public ContentInfo mo12194c() {
            return this.f11566a;
        }

        @Override // p148k0.C3309c.f
        /* renamed from: d */
        public int mo12195d() {
            return this.f11566a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f11566a + "}";
        }
    }

    /* renamed from: k0.c$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        ClipData mo12192a();

        /* renamed from: b */
        int mo12193b();

        /* renamed from: c */
        ContentInfo mo12194c();

        /* renamed from: d */
        int mo12195d();
    }

    /* renamed from: k0.c$g */
    /* loaded from: classes.dex */
    public static final class g implements f {

        /* renamed from: a */
        public final ClipData f11567a;

        /* renamed from: b */
        public final int f11568b;

        /* renamed from: c */
        public final int f11569c;

        /* renamed from: d */
        public final Uri f11570d;

        /* renamed from: e */
        public final Bundle f11571e;

        public g(d dVar) {
            this.f11567a = (ClipData) C3205d.m11414j(dVar.f11561a);
            this.f11568b = C3205d.m11409e(dVar.f11562b, 0, 5, "source");
            this.f11569c = C3205d.m11413i(dVar.f11563c, 1);
            this.f11570d = dVar.f11564d;
            this.f11571e = dVar.f11565e;
        }

        @Override // p148k0.C3309c.f
        /* renamed from: a */
        public ClipData mo12192a() {
            return this.f11567a;
        }

        @Override // p148k0.C3309c.f
        /* renamed from: b */
        public int mo12193b() {
            return this.f11569c;
        }

        @Override // p148k0.C3309c.f
        /* renamed from: c */
        public ContentInfo mo12194c() {
            return null;
        }

        @Override // p148k0.C3309c.f
        /* renamed from: d */
        public int mo12195d() {
            return this.f11568b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f11567a.getDescription());
            sb2.append(", source=");
            sb2.append(C3309c.m12178e(this.f11568b));
            sb2.append(", flags=");
            sb2.append(C3309c.m12177a(this.f11569c));
            if (this.f11570d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f11570d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f11571e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }
    }

    public C3309c(f fVar) {
        this.f11558a = fVar;
    }

    /* renamed from: a */
    public static String m12177a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    /* renamed from: e */
    public static String m12178e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    /* renamed from: g */
    public static C3309c m12179g(ContentInfo contentInfo) {
        return new C3309c(new e(contentInfo));
    }

    /* renamed from: b */
    public ClipData m12180b() {
        return this.f11558a.mo12192a();
    }

    /* renamed from: c */
    public int m12181c() {
        return this.f11558a.mo12193b();
    }

    /* renamed from: d */
    public int m12182d() {
        return this.f11558a.mo12195d();
    }

    /* renamed from: f */
    public ContentInfo m12183f() {
        ContentInfo mo12194c = this.f11558a.mo12194c();
        Objects.requireNonNull(mo12194c);
        return mo12194c;
    }

    public String toString() {
        return this.f11558a.toString();
    }
}
