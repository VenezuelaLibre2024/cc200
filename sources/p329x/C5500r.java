package p329x;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* renamed from: x.r */
/* loaded from: classes.dex */
public class C5500r {

    /* renamed from: a */
    public CharSequence f20572a;

    /* renamed from: b */
    public IconCompat f20573b;

    /* renamed from: c */
    public String f20574c;

    /* renamed from: d */
    public String f20575d;

    /* renamed from: e */
    public boolean f20576e;

    /* renamed from: f */
    public boolean f20577f;

    /* renamed from: x.r$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static C5500r m22114a(Person person) {
            return new b().m22121f(person.getName()).m22118c(person.getIcon() != null ? IconCompat.m1121c(person.getIcon()) : null).m22122g(person.getUri()).m22120e(person.getKey()).m22117b(person.isBot()).m22119d(person.isImportant()).m22116a();
        }

        /* renamed from: b */
        public static Person m22115b(C5500r c5500r) {
            return new Person.Builder().setName(c5500r.m22107e()).setIcon(c5500r.m22105c() != null ? c5500r.m22105c().m1144y() : null).setUri(c5500r.m22108f()).setKey(c5500r.m22106d()).setBot(c5500r.m22109g()).setImportant(c5500r.m22110h()).build();
        }
    }

    /* renamed from: x.r$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public CharSequence f20578a;

        /* renamed from: b */
        public IconCompat f20579b;

        /* renamed from: c */
        public String f20580c;

        /* renamed from: d */
        public String f20581d;

        /* renamed from: e */
        public boolean f20582e;

        /* renamed from: f */
        public boolean f20583f;

        /* renamed from: a */
        public C5500r m22116a() {
            return new C5500r(this);
        }

        /* renamed from: b */
        public b m22117b(boolean z10) {
            this.f20582e = z10;
            return this;
        }

        /* renamed from: c */
        public b m22118c(IconCompat iconCompat) {
            this.f20579b = iconCompat;
            return this;
        }

        /* renamed from: d */
        public b m22119d(boolean z10) {
            this.f20583f = z10;
            return this;
        }

        /* renamed from: e */
        public b m22120e(String str) {
            this.f20581d = str;
            return this;
        }

        /* renamed from: f */
        public b m22121f(CharSequence charSequence) {
            this.f20578a = charSequence;
            return this;
        }

        /* renamed from: g */
        public b m22122g(String str) {
            this.f20580c = str;
            return this;
        }
    }

    public C5500r(b bVar) {
        this.f20572a = bVar.f20578a;
        this.f20573b = bVar.f20579b;
        this.f20574c = bVar.f20580c;
        this.f20575d = bVar.f20581d;
        this.f20576e = bVar.f20582e;
        this.f20577f = bVar.f20583f;
    }

    /* renamed from: a */
    public static C5500r m22103a(Person person) {
        return a.m22114a(person);
    }

    /* renamed from: b */
    public static C5500r m22104b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new b().m22121f(bundle.getCharSequence("name")).m22118c(bundle2 != null ? IconCompat.m1120b(bundle2) : null).m22122g(bundle.getString("uri")).m22120e(bundle.getString(Constants.KEY)).m22117b(bundle.getBoolean("isBot")).m22119d(bundle.getBoolean("isImportant")).m22116a();
    }

    /* renamed from: c */
    public IconCompat m22105c() {
        return this.f20573b;
    }

    /* renamed from: d */
    public String m22106d() {
        return this.f20575d;
    }

    /* renamed from: e */
    public CharSequence m22107e() {
        return this.f20572a;
    }

    /* renamed from: f */
    public String m22108f() {
        return this.f20574c;
    }

    /* renamed from: g */
    public boolean m22109g() {
        return this.f20576e;
    }

    /* renamed from: h */
    public boolean m22110h() {
        return this.f20577f;
    }

    /* renamed from: i */
    public String m22111i() {
        String str = this.f20574c;
        if (str != null) {
            return str;
        }
        if (this.f20572a == null) {
            return "";
        }
        return "name:" + ((Object) this.f20572a);
    }

    /* renamed from: j */
    public Person m22112j() {
        return a.m22115b(this);
    }

    /* renamed from: k */
    public Bundle m22113k() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f20572a);
        IconCompat iconCompat = this.f20573b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.m1143x() : null);
        bundle.putString("uri", this.f20574c);
        bundle.putString(Constants.KEY, this.f20575d);
        bundle.putBoolean("isBot", this.f20576e);
        bundle.putBoolean("isImportant", this.f20577f);
        return bundle;
    }
}
