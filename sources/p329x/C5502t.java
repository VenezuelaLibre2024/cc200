package p329x;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: x.t */
/* loaded from: classes.dex */
public final class C5502t {

    /* renamed from: a */
    public final String f20586a;

    /* renamed from: b */
    public final CharSequence f20587b;

    /* renamed from: c */
    public final CharSequence[] f20588c;

    /* renamed from: d */
    public final boolean f20589d;

    /* renamed from: e */
    public final int f20590e;

    /* renamed from: f */
    public final Bundle f20591f;

    /* renamed from: g */
    public final Set<String> f20592g;

    /* renamed from: x.t$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static ClipData m22136a(Intent intent) {
            return intent.getClipData();
        }

        /* renamed from: b */
        public static void m22137b(Intent intent, ClipData clipData) {
            intent.setClipData(clipData);
        }
    }

    /* renamed from: x.t$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static void m22138a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        /* renamed from: b */
        public static RemoteInput m22139b(C5502t c5502t) {
            Set<String> m22129d;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(c5502t.m22134j()).setLabel(c5502t.m22133i()).setChoices(c5502t.m22130e()).setAllowFreeFormInput(c5502t.m22128c()).addExtras(c5502t.m22132h());
            if (Build.VERSION.SDK_INT >= 26 && (m22129d = c5502t.m22129d()) != null) {
                Iterator<String> it = m22129d.iterator();
                while (it.hasNext()) {
                    c.m22144d(addExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                d.m22146b(addExtras, c5502t.m22131g());
            }
            return addExtras.build();
        }

        /* renamed from: c */
        public static Bundle m22140c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* renamed from: x.t$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        public static void m22141a(C5502t c5502t, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(C5502t.m22124a(c5502t), intent, map);
        }

        /* renamed from: b */
        public static Set<String> m22142b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        /* renamed from: c */
        public static Map<String, Uri> m22143c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        /* renamed from: d */
        public static RemoteInput.Builder m22144d(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    /* renamed from: x.t$d */
    /* loaded from: classes.dex */
    public static class d {
        /* renamed from: a */
        public static int m22145a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        /* renamed from: b */
        public static RemoteInput.Builder m22146b(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    /* renamed from: x.t$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        public final String f20593a;

        /* renamed from: d */
        public CharSequence f20596d;

        /* renamed from: e */
        public CharSequence[] f20597e;

        /* renamed from: b */
        public final Set<String> f20594b = new HashSet();

        /* renamed from: c */
        public final Bundle f20595c = new Bundle();

        /* renamed from: f */
        public boolean f20598f = true;

        /* renamed from: g */
        public int f20599g = 0;

        public e(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f20593a = str;
        }

        /* renamed from: a */
        public C5502t m22147a() {
            return new C5502t(this.f20593a, this.f20596d, this.f20597e, this.f20598f, this.f20599g, this.f20595c, this.f20594b);
        }

        /* renamed from: b */
        public e m22148b(String str, boolean z10) {
            if (z10) {
                this.f20594b.add(str);
            } else {
                this.f20594b.remove(str);
            }
            return this;
        }

        /* renamed from: c */
        public e m22149c(boolean z10) {
            this.f20598f = z10;
            return this;
        }

        /* renamed from: d */
        public e m22150d(CharSequence[] charSequenceArr) {
            this.f20597e = charSequenceArr;
            return this;
        }

        /* renamed from: e */
        public e m22151e(CharSequence charSequence) {
            this.f20596d = charSequence;
            return this;
        }
    }

    public C5502t(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set<String> set) {
        this.f20586a = str;
        this.f20587b = charSequence;
        this.f20588c = charSequenceArr;
        this.f20589d = z10;
        this.f20590e = i10;
        this.f20591f = bundle;
        this.f20592g = set;
        if (m22131g() == 2 && !m22128c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    /* renamed from: a */
    public static RemoteInput m22124a(C5502t c5502t) {
        return b.m22139b(c5502t);
    }

    /* renamed from: b */
    public static RemoteInput[] m22125b(C5502t[] c5502tArr) {
        if (c5502tArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[c5502tArr.length];
        for (int i10 = 0; i10 < c5502tArr.length; i10++) {
            remoteInputArr[i10] = m22124a(c5502tArr[i10]);
        }
        return remoteInputArr;
    }

    /* renamed from: f */
    public static Intent m22126f(Intent intent) {
        ClipData m22136a = a.m22136a(intent);
        if (m22136a == null) {
            return null;
        }
        ClipDescription description = m22136a.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals("android.remoteinput.results")) {
            return m22136a.getItemAt(0).getIntent();
        }
        return null;
    }

    /* renamed from: k */
    public static Bundle m22127k(Intent intent) {
        Intent m22126f;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 20) {
            return b.m22140c(intent);
        }
        if (i10 < 16 || (m22126f = m22126f(intent)) == null) {
            return null;
        }
        return (Bundle) m22126f.getExtras().getParcelable("android.remoteinput.resultsData");
    }

    /* renamed from: c */
    public boolean m22128c() {
        return this.f20589d;
    }

    /* renamed from: d */
    public Set<String> m22129d() {
        return this.f20592g;
    }

    /* renamed from: e */
    public CharSequence[] m22130e() {
        return this.f20588c;
    }

    /* renamed from: g */
    public int m22131g() {
        return this.f20590e;
    }

    /* renamed from: h */
    public Bundle m22132h() {
        return this.f20591f;
    }

    /* renamed from: i */
    public CharSequence m22133i() {
        return this.f20587b;
    }

    /* renamed from: j */
    public String m22134j() {
        return this.f20586a;
    }

    /* renamed from: l */
    public boolean m22135l() {
        return (m22128c() || (m22130e() != null && m22130e().length != 0) || m22129d() == null || m22129d().isEmpty()) ? false : true;
    }
}
