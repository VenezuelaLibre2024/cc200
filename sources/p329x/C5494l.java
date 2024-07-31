package p329x;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p119i0.C2573a;
import p313w.C5183b;
import p313w.C5184c;
import p313w.C5185d;
import p313w.C5186e;
import p313w.C5188g;
import p313w.C5189h;
import p329x.C5500r;
import p345y.C5782a;

/* renamed from: x.l */
/* loaded from: classes.dex */
public class C5494l {

    /* renamed from: x.l$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final Bundle f20429a;

        /* renamed from: b */
        public IconCompat f20430b;

        /* renamed from: c */
        public final C5502t[] f20431c;

        /* renamed from: d */
        public final C5502t[] f20432d;

        /* renamed from: e */
        public boolean f20433e;

        /* renamed from: f */
        public boolean f20434f;

        /* renamed from: g */
        public final int f20435g;

        /* renamed from: h */
        public final boolean f20436h;

        /* renamed from: i */
        @Deprecated
        public int f20437i;

        /* renamed from: j */
        public CharSequence f20438j;

        /* renamed from: k */
        public PendingIntent f20439k;

        /* renamed from: l */
        public boolean f20440l;

        /* renamed from: x.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C6213a {

            /* renamed from: a */
            public final IconCompat f20441a;

            /* renamed from: b */
            public final CharSequence f20442b;

            /* renamed from: c */
            public final PendingIntent f20443c;

            /* renamed from: d */
            public boolean f20444d;

            /* renamed from: e */
            public final Bundle f20445e;

            /* renamed from: f */
            public ArrayList<C5502t> f20446f;

            /* renamed from: g */
            public int f20447g;

            /* renamed from: h */
            public boolean f20448h;

            /* renamed from: i */
            public boolean f20449i;

            /* renamed from: j */
            public boolean f20450j;

            public C6213a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public C6213a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C5502t[] c5502tArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f20444d = true;
                this.f20448h = true;
                this.f20441a = iconCompat;
                this.f20442b = e.m21857k(charSequence);
                this.f20443c = pendingIntent;
                this.f20445e = bundle;
                this.f20446f = c5502tArr == null ? null : new ArrayList<>(Arrays.asList(c5502tArr));
                this.f20444d = z10;
                this.f20447g = i10;
                this.f20448h = z11;
                this.f20449i = z12;
                this.f20450j = z13;
            }

            /* renamed from: a */
            public C6213a m21825a(C5502t c5502t) {
                if (this.f20446f == null) {
                    this.f20446f = new ArrayList<>();
                }
                if (c5502t != null) {
                    this.f20446f.add(c5502t);
                }
                return this;
            }

            /* renamed from: b */
            public a m21826b() {
                m21827c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<C5502t> arrayList3 = this.f20446f;
                if (arrayList3 != null) {
                    Iterator<C5502t> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        C5502t next = it.next();
                        if (next.m22135l()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                C5502t[] c5502tArr = arrayList.isEmpty() ? null : (C5502t[]) arrayList.toArray(new C5502t[arrayList.size()]);
                return new a(this.f20441a, this.f20442b, this.f20443c, this.f20445e, arrayList2.isEmpty() ? null : (C5502t[]) arrayList2.toArray(new C5502t[arrayList2.size()]), c5502tArr, this.f20444d, this.f20447g, this.f20448h, this.f20449i, this.f20450j);
            }

            /* renamed from: c */
            public final void m21827c() {
                if (this.f20449i) {
                    Objects.requireNonNull(this.f20443c, "Contextual Actions must contain a valid PendingIntent");
                }
            }

            /* renamed from: d */
            public C6213a m21828d(boolean z10) {
                this.f20444d = z10;
                return this;
            }

            /* renamed from: e */
            public C6213a m21829e(boolean z10) {
                this.f20449i = z10;
                return this;
            }

            /* renamed from: f */
            public C6213a m21830f(boolean z10) {
                this.f20448h = z10;
                return this;
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.m1130l(null, "", i10) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C5502t[] c5502tArr, C5502t[] c5502tArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f20434f = true;
            this.f20430b = iconCompat;
            if (iconCompat != null && iconCompat.m1136q() == 2) {
                this.f20437i = iconCompat.m1134n();
            }
            this.f20438j = e.m21857k(charSequence);
            this.f20439k = pendingIntent;
            this.f20429a = bundle == null ? new Bundle() : bundle;
            this.f20431c = c5502tArr;
            this.f20432d = c5502tArr2;
            this.f20433e = z10;
            this.f20435g = i10;
            this.f20434f = z11;
            this.f20436h = z12;
            this.f20440l = z13;
        }

        /* renamed from: a */
        public PendingIntent m21813a() {
            return this.f20439k;
        }

        /* renamed from: b */
        public boolean m21814b() {
            return this.f20433e;
        }

        /* renamed from: c */
        public C5502t[] m21815c() {
            return this.f20432d;
        }

        /* renamed from: d */
        public Bundle m21816d() {
            return this.f20429a;
        }

        @Deprecated
        /* renamed from: e */
        public int m21817e() {
            return this.f20437i;
        }

        /* renamed from: f */
        public IconCompat m21818f() {
            int i10;
            if (this.f20430b == null && (i10 = this.f20437i) != 0) {
                this.f20430b = IconCompat.m1130l(null, "", i10);
            }
            return this.f20430b;
        }

        /* renamed from: g */
        public C5502t[] m21819g() {
            return this.f20431c;
        }

        /* renamed from: h */
        public int m21820h() {
            return this.f20435g;
        }

        /* renamed from: i */
        public boolean m21821i() {
            return this.f20434f;
        }

        /* renamed from: j */
        public CharSequence m21822j() {
            return this.f20438j;
        }

        /* renamed from: k */
        public boolean m21823k() {
            return this.f20440l;
        }

        /* renamed from: l */
        public boolean m21824l() {
            return this.f20436h;
        }
    }

    /* renamed from: x.l$b */
    /* loaded from: classes.dex */
    public static class b extends j {

        /* renamed from: e */
        public IconCompat f20451e;

        /* renamed from: f */
        public IconCompat f20452f;

        /* renamed from: g */
        public boolean f20453g;

        /* renamed from: h */
        public CharSequence f20454h;

        /* renamed from: i */
        public boolean f20455i;

        /* renamed from: x.l$b$a */
        /* loaded from: classes.dex */
        public static class a {
            /* renamed from: a */
            public static Notification.BigPictureStyle m21839a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                return bigPictureStyle.bigPicture(bitmap);
            }

            /* renamed from: b */
            public static Notification.BigPictureStyle m21840b(Notification.Builder builder) {
                return new Notification.BigPictureStyle(builder);
            }

            /* renamed from: c */
            public static Notification.BigPictureStyle m21841c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                return bigPictureStyle.setBigContentTitle(charSequence);
            }

            /* renamed from: d */
            public static void m21842d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            /* renamed from: e */
            public static void m21843e(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: x.l$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C6214b {
            /* renamed from: a */
            public static void m21844a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: x.l$b$c */
        /* loaded from: classes.dex */
        public static class c {
            /* renamed from: a */
            public static void m21845a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            /* renamed from: b */
            public static void m21846b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            /* renamed from: c */
            public static void m21847c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        /* renamed from: A */
        public static IconCompat m21831A(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable("android.picture");
            return parcelable != null ? m21832x(parcelable) : m21832x(bundle.getParcelable("android.pictureIcon"));
        }

        /* renamed from: x */
        public static IconCompat m21832x(Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 23 && (parcelable instanceof Icon)) {
                return IconCompat.m1121c((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.m1125g((Bitmap) parcelable);
            }
            return null;
        }

        /* renamed from: B */
        public b m21833B(CharSequence charSequence) {
            this.f20529b = e.m21857k(charSequence);
            return this;
        }

        /* renamed from: C */
        public b m21834C(CharSequence charSequence) {
            this.f20530c = e.m21857k(charSequence);
            this.f20531d = true;
            return this;
        }

        @Override // p329x.C5494l.j
        /* renamed from: b */
        public void mo10331b(InterfaceC5493k interfaceC5493k) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 16) {
                Notification.BigPictureStyle m21841c = a.m21841c(a.m21840b(interfaceC5493k.mo21811a()), this.f20529b);
                IconCompat iconCompat = this.f20451e;
                if (iconCompat != null) {
                    if (i10 >= 31) {
                        c.m21845a(m21841c, this.f20451e.m1145z(interfaceC5493k instanceof C5495m ? ((C5495m) interfaceC5493k).m22015f() : null));
                    } else if (iconCompat.m1136q() == 1) {
                        m21841c = a.m21839a(m21841c, this.f20451e.m1133m());
                    }
                }
                if (this.f20453g) {
                    IconCompat iconCompat2 = this.f20452f;
                    if (iconCompat2 != null) {
                        if (i10 >= 23) {
                            C6214b.m21844a(m21841c, this.f20452f.m1145z(interfaceC5493k instanceof C5495m ? ((C5495m) interfaceC5493k).m22015f() : null));
                        } else if (iconCompat2.m1136q() == 1) {
                            a.m21842d(m21841c, this.f20452f.m1133m());
                        }
                    }
                    a.m21842d(m21841c, null);
                }
                if (this.f20531d) {
                    a.m21843e(m21841c, this.f20530c);
                }
                if (i10 >= 31) {
                    c.m21847c(m21841c, this.f20455i);
                    c.m21846b(m21841c, this.f20454h);
                }
            }
        }

        @Override // p329x.C5494l.j
        /* renamed from: q */
        public String mo21835q() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @Override // p329x.C5494l.j
        /* renamed from: v */
        public void mo21836v(Bundle bundle) {
            super.mo21836v(bundle);
            if (bundle.containsKey("android.largeIcon.big")) {
                this.f20452f = m21832x(bundle.getParcelable("android.largeIcon.big"));
                this.f20453g = true;
            }
            this.f20451e = m21831A(bundle);
            this.f20455i = bundle.getBoolean("android.showBigPictureWhenCollapsed");
        }

        /* renamed from: y */
        public b m21837y(Bitmap bitmap) {
            this.f20452f = bitmap == null ? null : IconCompat.m1125g(bitmap);
            this.f20453g = true;
            return this;
        }

        /* renamed from: z */
        public b m21838z(Bitmap bitmap) {
            this.f20451e = bitmap == null ? null : IconCompat.m1125g(bitmap);
            return this;
        }
    }

    /* renamed from: x.l$c */
    /* loaded from: classes.dex */
    public static class c extends j {

        /* renamed from: e */
        public CharSequence f20456e;

        /* renamed from: x.l$c$a */
        /* loaded from: classes.dex */
        public static class a {
            /* renamed from: a */
            public static Notification.BigTextStyle m21852a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            /* renamed from: b */
            public static Notification.BigTextStyle m21853b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            /* renamed from: c */
            public static Notification.BigTextStyle m21854c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            /* renamed from: d */
            public static Notification.BigTextStyle m21855d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setSummaryText(charSequence);
            }
        }

        @Override // p329x.C5494l.j
        /* renamed from: a */
        public void mo21848a(Bundle bundle) {
            super.mo21848a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f20456e);
            }
        }

        @Override // p329x.C5494l.j
        /* renamed from: b */
        public void mo10331b(InterfaceC5493k interfaceC5493k) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle m21852a = a.m21852a(a.m21854c(a.m21853b(interfaceC5493k.mo21811a()), this.f20529b), this.f20456e);
                if (this.f20531d) {
                    a.m21855d(m21852a, this.f20530c);
                }
            }
        }

        @Override // p329x.C5494l.j
        /* renamed from: q */
        public String mo21835q() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override // p329x.C5494l.j
        /* renamed from: v */
        public void mo21836v(Bundle bundle) {
            super.mo21836v(bundle);
            this.f20456e = bundle.getCharSequence("android.bigText");
        }

        /* renamed from: x */
        public c m21849x(CharSequence charSequence) {
            this.f20456e = e.m21857k(charSequence);
            return this;
        }

        /* renamed from: y */
        public c m21850y(CharSequence charSequence) {
            this.f20529b = e.m21857k(charSequence);
            return this;
        }

        /* renamed from: z */
        public c m21851z(CharSequence charSequence) {
            this.f20530c = e.m21857k(charSequence);
            this.f20531d = true;
            return this;
        }
    }

    /* renamed from: x.l$d */
    /* loaded from: classes.dex */
    public static final class d {
        /* renamed from: a */
        public static Notification.BubbleMetadata m21856a(d dVar) {
            return null;
        }
    }

    /* renamed from: x.l$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: A */
        public boolean f20457A;

        /* renamed from: B */
        public boolean f20458B;

        /* renamed from: C */
        public boolean f20459C;

        /* renamed from: D */
        public String f20460D;

        /* renamed from: E */
        public Bundle f20461E;

        /* renamed from: F */
        public int f20462F;

        /* renamed from: G */
        public int f20463G;

        /* renamed from: H */
        public Notification f20464H;

        /* renamed from: I */
        public RemoteViews f20465I;

        /* renamed from: J */
        public RemoteViews f20466J;

        /* renamed from: K */
        public RemoteViews f20467K;

        /* renamed from: L */
        public String f20468L;

        /* renamed from: M */
        public int f20469M;

        /* renamed from: N */
        public String f20470N;

        /* renamed from: O */
        public long f20471O;

        /* renamed from: P */
        public int f20472P;

        /* renamed from: Q */
        public int f20473Q;

        /* renamed from: R */
        public boolean f20474R;

        /* renamed from: S */
        public d f20475S;

        /* renamed from: T */
        public Notification f20476T;

        /* renamed from: U */
        public boolean f20477U;

        /* renamed from: V */
        public Object f20478V;

        /* renamed from: W */
        @Deprecated
        public ArrayList<String> f20479W;

        /* renamed from: a */
        public Context f20480a;

        /* renamed from: b */
        public ArrayList<a> f20481b;

        /* renamed from: c */
        public ArrayList<C5500r> f20482c;

        /* renamed from: d */
        public ArrayList<a> f20483d;

        /* renamed from: e */
        public CharSequence f20484e;

        /* renamed from: f */
        public CharSequence f20485f;

        /* renamed from: g */
        public PendingIntent f20486g;

        /* renamed from: h */
        public PendingIntent f20487h;

        /* renamed from: i */
        public RemoteViews f20488i;

        /* renamed from: j */
        public Bitmap f20489j;

        /* renamed from: k */
        public CharSequence f20490k;

        /* renamed from: l */
        public int f20491l;

        /* renamed from: m */
        public int f20492m;

        /* renamed from: n */
        public boolean f20493n;

        /* renamed from: o */
        public boolean f20494o;

        /* renamed from: p */
        public boolean f20495p;

        /* renamed from: q */
        public j f20496q;

        /* renamed from: r */
        public CharSequence f20497r;

        /* renamed from: s */
        public CharSequence f20498s;

        /* renamed from: t */
        public CharSequence[] f20499t;

        /* renamed from: u */
        public int f20500u;

        /* renamed from: v */
        public int f20501v;

        /* renamed from: w */
        public boolean f20502w;

        /* renamed from: x */
        public String f20503x;

        /* renamed from: y */
        public boolean f20504y;

        /* renamed from: z */
        public String f20505z;

        /* renamed from: x.l$e$a */
        /* loaded from: classes.dex */
        public static class a {
            /* renamed from: a */
            public static AudioAttributes m21906a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            /* renamed from: b */
            public static AudioAttributes.Builder m21907b() {
                return new AudioAttributes.Builder();
            }

            /* renamed from: c */
            public static AudioAttributes.Builder m21908c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            /* renamed from: d */
            public static AudioAttributes.Builder m21909d(AudioAttributes.Builder builder, int i10) {
                return builder.setLegacyStreamType(i10);
            }

            /* renamed from: e */
            public static AudioAttributes.Builder m21910e(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        @Deprecated
        public e(Context context) {
            this(context, null);
        }

        public e(Context context, String str) {
            this.f20481b = new ArrayList<>();
            this.f20482c = new ArrayList<>();
            this.f20483d = new ArrayList<>();
            this.f20493n = true;
            this.f20457A = false;
            this.f20462F = 0;
            this.f20463G = 0;
            this.f20469M = 0;
            this.f20472P = 0;
            this.f20473Q = 0;
            Notification notification = new Notification();
            this.f20476T = notification;
            this.f20480a = context;
            this.f20468L = str;
            notification.when = System.currentTimeMillis();
            this.f20476T.audioStreamType = -1;
            this.f20492m = 0;
            this.f20479W = new ArrayList<>();
            this.f20474R = true;
        }

        /* renamed from: k */
        public static CharSequence m21857k(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: A */
        public e m21858A(int i10) {
            this.f20472P = i10;
            return this;
        }

        /* renamed from: B */
        public e m21859B(boolean z10) {
            this.f20504y = z10;
            return this;
        }

        /* renamed from: C */
        public e m21860C(Bitmap bitmap) {
            this.f20489j = m21891l(bitmap);
            return this;
        }

        /* renamed from: D */
        public e m21861D(int i10, int i11, int i12) {
            Notification notification = this.f20476T;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        /* renamed from: E */
        public e m21862E(boolean z10) {
            this.f20457A = z10;
            return this;
        }

        /* renamed from: F */
        public e m21863F(int i10) {
            this.f20491l = i10;
            return this;
        }

        /* renamed from: G */
        public e m21864G(boolean z10) {
            m21903x(2, z10);
            return this;
        }

        /* renamed from: H */
        public e m21865H(boolean z10) {
            m21903x(8, z10);
            return this;
        }

        /* renamed from: I */
        public e m21866I(int i10) {
            this.f20492m = i10;
            return this;
        }

        /* renamed from: J */
        public e m21867J(int i10, int i11, boolean z10) {
            this.f20500u = i10;
            this.f20501v = i11;
            this.f20502w = z10;
            return this;
        }

        /* renamed from: K */
        public e m21868K(String str) {
            this.f20470N = str;
            return this;
        }

        /* renamed from: L */
        public e m21869L(boolean z10) {
            this.f20493n = z10;
            return this;
        }

        /* renamed from: M */
        public e m21870M(boolean z10) {
            this.f20477U = z10;
            return this;
        }

        /* renamed from: N */
        public e m21871N(int i10) {
            this.f20476T.icon = i10;
            return this;
        }

        /* renamed from: O */
        public e m21872O(Uri uri) {
            Notification notification = this.f20476T;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                AudioAttributes.Builder m21910e = a.m21910e(a.m21908c(a.m21907b(), 4), 5);
                this.f20476T.audioAttributes = a.m21906a(m21910e);
            }
            return this;
        }

        /* renamed from: P */
        public e m21873P(j jVar) {
            if (this.f20496q != jVar) {
                this.f20496q = jVar;
                if (jVar != null) {
                    jVar.m22006w(this);
                }
            }
            return this;
        }

        /* renamed from: Q */
        public e m21874Q(CharSequence charSequence) {
            this.f20497r = m21857k(charSequence);
            return this;
        }

        /* renamed from: R */
        public e m21875R(CharSequence charSequence) {
            this.f20476T.tickerText = m21857k(charSequence);
            return this;
        }

        /* renamed from: S */
        public e m21876S(long j10) {
            this.f20471O = j10;
            return this;
        }

        /* renamed from: T */
        public e m21877T(boolean z10) {
            this.f20494o = z10;
            return this;
        }

        /* renamed from: U */
        public e m21878U(long[] jArr) {
            this.f20476T.vibrate = jArr;
            return this;
        }

        /* renamed from: V */
        public e m21879V(int i10) {
            this.f20463G = i10;
            return this;
        }

        /* renamed from: W */
        public e m21880W(long j10) {
            this.f20476T.when = j10;
            return this;
        }

        /* renamed from: a */
        public e m21881a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f20481b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public e m21882b(a aVar) {
            if (aVar != null) {
                this.f20481b.add(aVar);
            }
            return this;
        }

        /* renamed from: c */
        public Notification m21883c() {
            return new C5495m(this).m22013c();
        }

        /* renamed from: d */
        public RemoteViews m21884d() {
            return this.f20466J;
        }

        /* renamed from: e */
        public int m21885e() {
            return this.f20462F;
        }

        /* renamed from: f */
        public RemoteViews m21886f() {
            return this.f20465I;
        }

        /* renamed from: g */
        public Bundle m21887g() {
            if (this.f20461E == null) {
                this.f20461E = new Bundle();
            }
            return this.f20461E;
        }

        /* renamed from: h */
        public RemoteViews m21888h() {
            return this.f20467K;
        }

        /* renamed from: i */
        public int m21889i() {
            return this.f20492m;
        }

        /* renamed from: j */
        public long m21890j() {
            if (this.f20493n) {
                return this.f20476T.when;
            }
            return 0L;
        }

        /* renamed from: l */
        public final Bitmap m21891l(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f20480a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C5184c.f19573b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C5184c.f19572a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
        }

        /* renamed from: m */
        public e m21892m(boolean z10) {
            m21903x(16, z10);
            return this;
        }

        /* renamed from: n */
        public e m21893n(String str) {
            this.f20460D = str;
            return this;
        }

        /* renamed from: o */
        public e m21894o(String str) {
            this.f20468L = str;
            return this;
        }

        /* renamed from: p */
        public e m21895p(boolean z10) {
            this.f20495p = z10;
            m21887g().putBoolean("android.chronometerCountDown", z10);
            return this;
        }

        /* renamed from: q */
        public e m21896q(int i10) {
            this.f20462F = i10;
            return this;
        }

        /* renamed from: r */
        public e m21897r(boolean z10) {
            this.f20458B = z10;
            this.f20459C = true;
            return this;
        }

        /* renamed from: s */
        public e m21898s(PendingIntent pendingIntent) {
            this.f20486g = pendingIntent;
            return this;
        }

        /* renamed from: t */
        public e m21899t(CharSequence charSequence) {
            this.f20485f = m21857k(charSequence);
            return this;
        }

        /* renamed from: u */
        public e m21900u(CharSequence charSequence) {
            this.f20484e = m21857k(charSequence);
            return this;
        }

        /* renamed from: v */
        public e m21901v(int i10) {
            Notification notification = this.f20476T;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: w */
        public e m21902w(PendingIntent pendingIntent) {
            this.f20476T.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: x */
        public final void m21903x(int i10, boolean z10) {
            Notification notification;
            int i11;
            if (z10) {
                notification = this.f20476T;
                i11 = i10 | notification.flags;
            } else {
                notification = this.f20476T;
                i11 = (~i10) & notification.flags;
            }
            notification.flags = i11;
        }

        /* renamed from: y */
        public e m21904y(PendingIntent pendingIntent, boolean z10) {
            this.f20487h = pendingIntent;
            m21903x(128, z10);
            return this;
        }

        /* renamed from: z */
        public e m21905z(String str) {
            this.f20503x = str;
            return this;
        }
    }

    /* renamed from: x.l$f */
    /* loaded from: classes.dex */
    public static class f extends j {

        /* renamed from: e */
        public int f20506e;

        /* renamed from: f */
        public C5500r f20507f;

        /* renamed from: g */
        public PendingIntent f20508g;

        /* renamed from: h */
        public PendingIntent f20509h;

        /* renamed from: i */
        public PendingIntent f20510i;

        /* renamed from: j */
        public boolean f20511j;

        /* renamed from: k */
        public Integer f20512k;

        /* renamed from: l */
        public Integer f20513l;

        /* renamed from: m */
        public IconCompat f20514m;

        /* renamed from: n */
        public CharSequence f20515n;

        /* renamed from: x.l$f$a */
        /* loaded from: classes.dex */
        public static class a {
            /* renamed from: a */
            public static void m21918a(Notification.CallStyle callStyle, Notification.Builder builder) {
                callStyle.setBuilder(builder);
            }
        }

        /* renamed from: x.l$f$b */
        /* loaded from: classes.dex */
        public static class b {
            /* renamed from: a */
            public static Notification.Builder m21919a(Notification.Builder builder, Notification.Action action) {
                return builder.addAction(action);
            }

            /* renamed from: b */
            public static Notification.Action.Builder m21920b(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            /* renamed from: c */
            public static Notification.Action.Builder m21921c(Notification.Action.Builder builder, RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            /* renamed from: d */
            public static Notification.Action m21922d(Notification.Action.Builder builder) {
                return builder.build();
            }

            /* renamed from: e */
            public static Notification.Action.Builder m21923e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i10, charSequence, pendingIntent);
            }
        }

        /* renamed from: x.l$f$c */
        /* loaded from: classes.dex */
        public static class c {
            /* renamed from: a */
            public static Notification.Builder m21924a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            /* renamed from: b */
            public static Notification.Builder m21925b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        /* renamed from: x.l$f$d */
        /* loaded from: classes.dex */
        public static class d {
            /* renamed from: a */
            public static Notification.Action.Builder m21926a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            /* renamed from: b */
            public static void m21927b(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        /* renamed from: x.l$f$e */
        /* loaded from: classes.dex */
        public static class e {
            /* renamed from: a */
            public static Notification.Builder m21928a(Notification.Builder builder) {
                return builder.setActions(new Notification.Action[0]);
            }

            /* renamed from: b */
            public static Notification.Action.Builder m21929b(Notification.Action.Builder builder, boolean z10) {
                return builder.setAllowGeneratedReplies(z10);
            }
        }

        /* renamed from: x.l$f$f, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C6215f {
            /* renamed from: a */
            public static Notification.Builder m21930a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }
        }

        /* renamed from: x.l$f$g */
        /* loaded from: classes.dex */
        public static class g {
            /* renamed from: a */
            public static Notification.CallStyle m21931a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            /* renamed from: b */
            public static Notification.CallStyle m21932b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            /* renamed from: c */
            public static Notification.CallStyle m21933c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            /* renamed from: d */
            public static Notification.CallStyle m21934d(Notification.CallStyle callStyle, int i10) {
                return callStyle.setAnswerButtonColorHint(i10);
            }

            /* renamed from: e */
            public static Notification.Action.Builder m21935e(Notification.Action.Builder builder, boolean z10) {
                return builder.setAuthenticationRequired(z10);
            }

            /* renamed from: f */
            public static Notification.CallStyle m21936f(Notification.CallStyle callStyle, int i10) {
                return callStyle.setDeclineButtonColorHint(i10);
            }

            /* renamed from: g */
            public static Notification.CallStyle m21937g(Notification.CallStyle callStyle, boolean z10) {
                return callStyle.setIsVideo(z10);
            }

            /* renamed from: h */
            public static Notification.CallStyle m21938h(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            /* renamed from: i */
            public static Notification.CallStyle m21939i(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        /* renamed from: x */
        public static Notification.Action m21911x(a aVar) {
            Notification.Action.Builder m21923e;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                IconCompat m21818f = aVar.m21818f();
                m21923e = d.m21926a(m21818f == null ? null : m21818f.m1144y(), aVar.m21822j(), aVar.m21813a());
            } else {
                IconCompat m21818f2 = aVar.m21818f();
                m21923e = b.m21923e((m21818f2 == null || m21818f2.m1136q() != 2) ? 0 : m21818f2.m1134n(), aVar.m21822j(), aVar.m21813a());
            }
            Bundle bundle = aVar.m21816d() != null ? new Bundle(aVar.m21816d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m21814b());
            if (i10 >= 24) {
                e.m21929b(m21923e, aVar.m21814b());
            }
            if (i10 >= 31) {
                g.m21935e(m21923e, aVar.m21823k());
            }
            b.m21920b(m21923e, bundle);
            C5502t[] m21819g = aVar.m21819g();
            if (m21819g != null) {
                for (RemoteInput remoteInput : C5502t.m22125b(m21819g)) {
                    b.m21921c(m21923e, remoteInput);
                }
            }
            return b.m21922d(m21923e);
        }

        /* renamed from: A */
        public final boolean m21912A(a aVar) {
            return aVar != null && aVar.m21816d().getBoolean("key_action_priority");
        }

        /* renamed from: B */
        public final a m21913B(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(C5782a.getColor(this.f20528a.f20480a, i12));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f20528a.f20480a.getResources().getString(i11));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a m21826b = new a.C6213a(IconCompat.m1129k(this.f20528a.f20480a, i10), spannableStringBuilder, pendingIntent).m21826b();
            m21826b.m21816d().putBoolean("key_action_priority", true);
            return m21826b;
        }

        /* renamed from: C */
        public final a m21914C() {
            int i10 = C5185d.f19585d;
            int i11 = C5185d.f19583b;
            if (Build.VERSION.SDK_INT >= 21) {
                i10 = C5185d.f19584c;
                i11 = C5185d.f19582a;
            }
            PendingIntent pendingIntent = this.f20508g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z10 = this.f20511j;
            return m21913B(z10 ? i10 : i11, z10 ? C5189h.f19663b : C5189h.f19662a, this.f20512k, C5183b.f19569a, pendingIntent);
        }

        /* renamed from: D */
        public final a m21915D() {
            int i10;
            Integer num;
            int i11;
            int i12 = C5185d.f19587f;
            if (Build.VERSION.SDK_INT >= 21) {
                i12 = C5185d.f19586e;
            }
            int i13 = i12;
            PendingIntent pendingIntent = this.f20509h;
            if (pendingIntent == null) {
                i10 = C5189h.f19665d;
                num = this.f20513l;
                i11 = C5183b.f19570b;
                pendingIntent = this.f20510i;
            } else {
                i10 = C5189h.f19664c;
                num = this.f20513l;
                i11 = C5183b.f19570b;
            }
            return m21913B(i13, i10, num, i11, pendingIntent);
        }

        @Override // p329x.C5494l.j
        /* renamed from: a */
        public void mo21848a(Bundle bundle) {
            Parcelable m1143x;
            String str;
            Parcelable m22113k;
            String str2;
            super.mo21848a(bundle);
            bundle.putInt("android.callType", this.f20506e);
            bundle.putBoolean("android.callIsVideo", this.f20511j);
            C5500r c5500r = this.f20507f;
            if (c5500r != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    m22113k = c5500r.m22112j();
                    str2 = "android.callPerson";
                } else {
                    m22113k = c5500r.m22113k();
                    str2 = "android.callPersonCompat";
                }
                bundle.putParcelable(str2, m22113k);
            }
            IconCompat iconCompat = this.f20514m;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    m1143x = iconCompat.m1145z(this.f20528a.f20480a);
                    str = "android.verificationIcon";
                } else {
                    m1143x = iconCompat.m1143x();
                    str = "android.verificationIconCompat";
                }
                bundle.putParcelable(str, m1143x);
            }
            bundle.putCharSequence("android.verificationText", this.f20515n);
            bundle.putParcelable("android.answerIntent", this.f20508g);
            bundle.putParcelable("android.declineIntent", this.f20509h);
            bundle.putParcelable("android.hangUpIntent", this.f20510i);
            Integer num = this.f20512k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f20513l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // p329x.C5494l.j
        /* renamed from: b */
        public void mo10331b(InterfaceC5493k interfaceC5493k) {
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            r1 = null;
            Notification.CallStyle m21931a = null;
            charSequence = null;
            if (i10 >= 31) {
                int i11 = this.f20506e;
                if (i11 == 1) {
                    m21931a = g.m21931a(this.f20507f.m22112j(), this.f20509h, this.f20508g);
                } else if (i11 == 2) {
                    m21931a = g.m21932b(this.f20507f.m22112j(), this.f20510i);
                } else if (i11 == 3) {
                    m21931a = g.m21933c(this.f20507f.m22112j(), this.f20510i, this.f20508g);
                } else if (Log.isLoggable("NotifCompat", 3)) {
                    Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f20506e));
                }
                if (m21931a != null) {
                    e.m21928a(interfaceC5493k.mo21811a());
                    a.m21918a(m21931a, interfaceC5493k.mo21811a());
                    Integer num = this.f20512k;
                    if (num != null) {
                        g.m21934d(m21931a, num.intValue());
                    }
                    Integer num2 = this.f20513l;
                    if (num2 != null) {
                        g.m21936f(m21931a, num2.intValue());
                    }
                    g.m21939i(m21931a, this.f20515n);
                    IconCompat iconCompat = this.f20514m;
                    if (iconCompat != null) {
                        g.m21938h(m21931a, iconCompat.m1145z(this.f20528a.f20480a));
                    }
                    g.m21937g(m21931a, this.f20511j);
                    return;
                }
                return;
            }
            Notification.Builder mo21811a = interfaceC5493k.mo21811a();
            C5500r c5500r = this.f20507f;
            mo21811a.setContentTitle(c5500r != null ? c5500r.m22107e() : null);
            Bundle bundle = this.f20528a.f20461E;
            if (bundle != null && bundle.containsKey("android.text")) {
                charSequence = this.f20528a.f20461E.getCharSequence("android.text");
            }
            if (charSequence == null) {
                charSequence = m21917z();
            }
            mo21811a.setContentText(charSequence);
            C5500r c5500r2 = this.f20507f;
            if (c5500r2 != null) {
                if (i10 >= 23 && c5500r2.m22105c() != null) {
                    d.m21927b(mo21811a, this.f20507f.m22105c().m1145z(this.f20528a.f20480a));
                }
                if (i10 >= 28) {
                    C6215f.m21930a(mo21811a, this.f20507f.m22112j());
                } else if (i10 >= 21) {
                    c.m21924a(mo21811a, this.f20507f.m22108f());
                }
            }
            if (i10 >= 20) {
                ArrayList<a> m21916y = m21916y();
                if (i10 >= 24) {
                    e.m21928a(mo21811a);
                }
                Iterator<a> it = m21916y.iterator();
                while (it.hasNext()) {
                    b.m21919a(mo21811a, m21911x(it.next()));
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                c.m21925b(mo21811a, "call");
            }
        }

        @Override // p329x.C5494l.j
        /* renamed from: q */
        public String mo21835q() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
        @Override // p329x.C5494l.j
        /* renamed from: v */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo21836v(android.os.Bundle r4) {
            /*
                r3 = this;
                super.mo21836v(r4)
                java.lang.String r0 = "android.callType"
                int r0 = r4.getInt(r0)
                r3.f20506e = r0
                java.lang.String r0 = "android.callIsVideo"
                boolean r0 = r4.getBoolean(r0)
                r3.f20511j = r0
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto L2c
                java.lang.String r1 = "android.callPerson"
                boolean r2 = r4.containsKey(r1)
                if (r2 == 0) goto L2c
                android.os.Parcelable r1 = r4.getParcelable(r1)
                android.app.Person r1 = (android.app.Person) r1
                x.r r1 = p329x.C5500r.m22103a(r1)
                goto L3c
            L2c:
                java.lang.String r1 = "android.callPersonCompat"
                boolean r2 = r4.containsKey(r1)
                if (r2 == 0) goto L3e
                android.os.Bundle r1 = r4.getBundle(r1)
                x.r r1 = p329x.C5500r.m22104b(r1)
            L3c:
                r3.f20507f = r1
            L3e:
                r1 = 23
                if (r0 < r1) goto L55
                java.lang.String r0 = "android.verificationIcon"
                boolean r1 = r4.containsKey(r0)
                if (r1 == 0) goto L55
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.m1121c(r0)
                goto L65
            L55:
                java.lang.String r0 = "android.verificationIconCompat"
                boolean r1 = r4.containsKey(r0)
                if (r1 == 0) goto L67
                android.os.Bundle r0 = r4.getBundle(r0)
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.m1120b(r0)
            L65:
                r3.f20514m = r0
            L67:
                java.lang.String r0 = "android.verificationText"
                java.lang.CharSequence r0 = r4.getCharSequence(r0)
                r3.f20515n = r0
                java.lang.String r0 = "android.answerIntent"
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r3.f20508g = r0
                java.lang.String r0 = "android.declineIntent"
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r3.f20509h = r0
                java.lang.String r0 = "android.hangUpIntent"
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r3.f20510i = r0
                java.lang.String r0 = "android.answerColor"
                boolean r1 = r4.containsKey(r0)
                r2 = 0
                if (r1 == 0) goto L9f
                int r0 = r4.getInt(r0)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                goto La0
            L9f:
                r0 = r2
            La0:
                r3.f20512k = r0
                java.lang.String r0 = "android.declineColor"
                boolean r1 = r4.containsKey(r0)
                if (r1 == 0) goto Lb2
                int r4 = r4.getInt(r0)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            Lb2:
                r3.f20513l = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p329x.C5494l.f.mo21836v(android.os.Bundle):void");
        }

        /* renamed from: y */
        public ArrayList<a> m21916y() {
            a m21915D = m21915D();
            a m21914C = m21914C();
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(m21915D);
            int i10 = 2;
            ArrayList<a> arrayList2 = this.f20528a.f20481b;
            if (arrayList2 != null) {
                for (a aVar : arrayList2) {
                    if (aVar.m21824l()) {
                        arrayList.add(aVar);
                    } else if (!m21912A(aVar) && i10 > 1) {
                        arrayList.add(aVar);
                        i10--;
                    }
                    if (m21914C != null && i10 == 1) {
                        arrayList.add(m21914C);
                        i10--;
                    }
                }
            }
            if (m21914C != null && i10 >= 1) {
                arrayList.add(m21914C);
            }
            return arrayList;
        }

        /* renamed from: z */
        public final String m21917z() {
            Resources resources;
            int i10;
            int i11 = this.f20506e;
            if (i11 == 1) {
                resources = this.f20528a.f20480a.getResources();
                i10 = C5189h.f19666e;
            } else if (i11 == 2) {
                resources = this.f20528a.f20480a.getResources();
                i10 = C5189h.f19667f;
            } else {
                if (i11 != 3) {
                    return null;
                }
                resources = this.f20528a.f20480a.getResources();
                i10 = C5189h.f19668g;
            }
            return resources.getString(i10);
        }
    }

    /* renamed from: x.l$g */
    /* loaded from: classes.dex */
    public static class g extends j {

        /* renamed from: x.l$g$a */
        /* loaded from: classes.dex */
        public static class a {
            /* renamed from: a */
            public static void m21944a(RemoteViews remoteViews, int i10, CharSequence charSequence) {
                remoteViews.setContentDescription(i10, charSequence);
            }
        }

        /* renamed from: x.l$g$b */
        /* loaded from: classes.dex */
        public static class b {
            /* renamed from: a */
            public static Notification.Builder m21945a(Notification.Builder builder, Object obj) {
                return builder.setStyle((Notification.Style) obj);
            }
        }

        /* renamed from: x.l$g$c */
        /* loaded from: classes.dex */
        public static class c {
            /* renamed from: a */
            public static Notification.DecoratedCustomViewStyle m21946a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        /* renamed from: z */
        public static List<a> m21940z(List<a> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (a aVar : list) {
                if (!aVar.m21824l()) {
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }

        @Override // p329x.C5494l.j
        /* renamed from: b */
        public void mo10331b(InterfaceC5493k interfaceC5493k) {
            if (Build.VERSION.SDK_INT >= 24) {
                b.m21945a(interfaceC5493k.mo21811a(), c.m21946a());
            }
        }

        @Override // p329x.C5494l.j
        /* renamed from: q */
        public String mo21835q() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // p329x.C5494l.j
        /* renamed from: s */
        public RemoteViews mo10332s(InterfaceC5493k interfaceC5493k) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews m21884d = this.f20528a.m21884d();
            if (m21884d == null) {
                m21884d = this.f20528a.m21886f();
            }
            if (m21884d == null) {
                return null;
            }
            return m21942x(m21884d, true);
        }

        @Override // p329x.C5494l.j
        /* renamed from: t */
        public RemoteViews mo10333t(InterfaceC5493k interfaceC5493k) {
            if (Build.VERSION.SDK_INT < 24 && this.f20528a.m21886f() != null) {
                return m21942x(this.f20528a.m21886f(), false);
            }
            return null;
        }

        @Override // p329x.C5494l.j
        /* renamed from: u */
        public RemoteViews mo21941u(InterfaceC5493k interfaceC5493k) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews m21888h = this.f20528a.m21888h();
            RemoteViews m21886f = m21888h != null ? m21888h : this.f20528a.m21886f();
            if (m21888h == null) {
                return null;
            }
            return m21942x(m21886f, true);
        }

        /* renamed from: x */
        public final RemoteViews m21942x(RemoteViews remoteViews, boolean z10) {
            int min;
            boolean z11 = true;
            RemoteViews m21997c = m21997c(true, C5188g.f19661c, false);
            m21997c.removeAllViews(C5186e.f19604L);
            List<a> m21940z = m21940z(this.f20528a.f20481b);
            if (!z10 || m21940z == null || (min = Math.min(m21940z.size(), 3)) <= 0) {
                z11 = false;
            } else {
                for (int i10 = 0; i10 < min; i10++) {
                    m21997c.addView(C5186e.f19604L, m21943y(m21940z.get(i10)));
                }
            }
            int i11 = z11 ? 0 : 8;
            m21997c.setViewVisibility(C5186e.f19604L, i11);
            m21997c.setViewVisibility(C5186e.f19601I, i11);
            m21998d(m21997c, remoteViews);
            return m21997c;
        }

        /* renamed from: y */
        public final RemoteViews m21943y(a aVar) {
            boolean z10 = aVar.f20439k == null;
            RemoteViews remoteViews = new RemoteViews(this.f20528a.f20480a.getPackageName(), z10 ? C5188g.f19660b : C5188g.f19659a);
            IconCompat m21818f = aVar.m21818f();
            if (m21818f != null) {
                remoteViews.setImageViewBitmap(C5186e.f19602J, m22002m(m21818f, C5183b.f19571c));
            }
            remoteViews.setTextViewText(C5186e.f19603K, aVar.f20438j);
            if (!z10) {
                remoteViews.setOnClickPendingIntent(C5186e.f19600H, aVar.f20439k);
            }
            if (Build.VERSION.SDK_INT >= 15) {
                a.m21944a(remoteViews, C5186e.f19600H, aVar.f20438j);
            }
            return remoteViews;
        }
    }

    /* renamed from: x.l$h */
    /* loaded from: classes.dex */
    public static class h extends j {

        /* renamed from: e */
        public ArrayList<CharSequence> f20516e = new ArrayList<>();

        /* renamed from: x.l$h$a */
        /* loaded from: classes.dex */
        public static class a {
            /* renamed from: a */
            public static Notification.InboxStyle m21950a(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.addLine(charSequence);
            }

            /* renamed from: b */
            public static Notification.InboxStyle m21951b(Notification.Builder builder) {
                return new Notification.InboxStyle(builder);
            }

            /* renamed from: c */
            public static Notification.InboxStyle m21952c(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setBigContentTitle(charSequence);
            }

            /* renamed from: d */
            public static Notification.InboxStyle m21953d(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setSummaryText(charSequence);
            }
        }

        @Override // p329x.C5494l.j
        /* renamed from: b */
        public void mo10331b(InterfaceC5493k interfaceC5493k) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.InboxStyle m21952c = a.m21952c(a.m21951b(interfaceC5493k.mo21811a()), this.f20529b);
                if (this.f20531d) {
                    a.m21953d(m21952c, this.f20530c);
                }
                Iterator<CharSequence> it = this.f20516e.iterator();
                while (it.hasNext()) {
                    a.m21950a(m21952c, it.next());
                }
            }
        }

        @Override // p329x.C5494l.j
        /* renamed from: q */
        public String mo21835q() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        @Override // p329x.C5494l.j
        /* renamed from: v */
        public void mo21836v(Bundle bundle) {
            super.mo21836v(bundle);
            this.f20516e.clear();
            if (bundle.containsKey("android.textLines")) {
                Collections.addAll(this.f20516e, bundle.getCharSequenceArray("android.textLines"));
            }
        }

        /* renamed from: x */
        public h m21947x(CharSequence charSequence) {
            if (charSequence != null) {
                this.f20516e.add(e.m21857k(charSequence));
            }
            return this;
        }

        /* renamed from: y */
        public h m21948y(CharSequence charSequence) {
            this.f20529b = e.m21857k(charSequence);
            return this;
        }

        /* renamed from: z */
        public h m21949z(CharSequence charSequence) {
            this.f20530c = e.m21857k(charSequence);
            this.f20531d = true;
            return this;
        }
    }

    /* renamed from: x.l$i */
    /* loaded from: classes.dex */
    public static class i extends j {

        /* renamed from: e */
        public final List<e> f20517e = new ArrayList();

        /* renamed from: f */
        public final List<e> f20518f = new ArrayList();

        /* renamed from: g */
        public C5500r f20519g;

        /* renamed from: h */
        public CharSequence f20520h;

        /* renamed from: i */
        public Boolean f20521i;

        /* renamed from: x.l$i$a */
        /* loaded from: classes.dex */
        public static class a {
            /* renamed from: a */
            public static Notification.BigTextStyle m21966a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            /* renamed from: b */
            public static Notification.BigTextStyle m21967b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            /* renamed from: c */
            public static Notification.BigTextStyle m21968c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            /* renamed from: d */
            public static void m21969d(Notification.Style style, Notification.Builder builder) {
                style.setBuilder(builder);
            }
        }

        /* renamed from: x.l$i$b */
        /* loaded from: classes.dex */
        public static class b {
            /* renamed from: a */
            public static Notification.MessagingStyle m21970a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            /* renamed from: b */
            public static Notification.MessagingStyle m21971b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            /* renamed from: c */
            public static Notification.MessagingStyle m21972c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        /* renamed from: x.l$i$c */
        /* loaded from: classes.dex */
        public static class c {
            /* renamed from: a */
            public static Notification.MessagingStyle m21973a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        /* renamed from: x.l$i$d */
        /* loaded from: classes.dex */
        public static class d {
            /* renamed from: a */
            public static Notification.MessagingStyle m21974a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            /* renamed from: b */
            public static Notification.MessagingStyle m21975b(Notification.MessagingStyle messagingStyle, boolean z10) {
                return messagingStyle.setGroupConversation(z10);
            }
        }

        /* renamed from: x.l$i$e */
        /* loaded from: classes.dex */
        public static final class e {

            /* renamed from: a */
            public final CharSequence f20522a;

            /* renamed from: b */
            public final long f20523b;

            /* renamed from: c */
            public final C5500r f20524c;

            /* renamed from: d */
            public Bundle f20525d = new Bundle();

            /* renamed from: e */
            public String f20526e;

            /* renamed from: f */
            public Uri f20527f;

            /* renamed from: x.l$i$e$a */
            /* loaded from: classes.dex */
            public static class a {
                /* renamed from: a */
                public static Notification.MessagingStyle.Message m21988a(CharSequence charSequence, long j10, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, charSequence2);
                }

                /* renamed from: b */
                public static Notification.MessagingStyle.Message m21989b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            /* renamed from: x.l$i$e$b */
            /* loaded from: classes.dex */
            public static class b {
                /* renamed from: a */
                public static Notification.MessagingStyle.Message m21990a(CharSequence charSequence, long j10, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, person);
                }
            }

            public e(CharSequence charSequence, long j10, C5500r c5500r) {
                this.f20522a = charSequence;
                this.f20523b = j10;
                this.f20524c = c5500r;
            }

            /* renamed from: a */
            public static Bundle[] m21976a(List<e> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bundleArr[i10] = list.get(i10).m21987l();
                }
                return bundleArr;
            }

            /* renamed from: e */
            public static e m21977e(Bundle bundle) {
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        e eVar = new e(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.containsKey("person") ? C5500r.m22104b(bundle.getBundle("person")) : (!bundle.containsKey("sender_person") || Build.VERSION.SDK_INT < 28) ? bundle.containsKey("sender") ? new C5500r.b().m22121f(bundle.getCharSequence("sender")).m22116a() : null : C5500r.m22103a((Person) bundle.getParcelable("sender_person")));
                        if (bundle.containsKey(ImagePickerCache.MAP_KEY_TYPE) && bundle.containsKey("uri")) {
                            eVar.m21985j(bundle.getString(ImagePickerCache.MAP_KEY_TYPE), (Uri) bundle.getParcelable("uri"));
                        }
                        if (bundle.containsKey("extras")) {
                            eVar.m21981d().putAll(bundle.getBundle("extras"));
                        }
                        return eVar;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            /* renamed from: f */
            public static List<e> m21978f(Parcelable[] parcelableArr) {
                e m21977e;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (int i10 = 0; i10 < parcelableArr.length; i10++) {
                    if ((parcelableArr[i10] instanceof Bundle) && (m21977e = m21977e((Bundle) parcelableArr[i10])) != null) {
                        arrayList.add(m21977e);
                    }
                }
                return arrayList;
            }

            /* renamed from: b */
            public String m21979b() {
                return this.f20526e;
            }

            /* renamed from: c */
            public Uri m21980c() {
                return this.f20527f;
            }

            /* renamed from: d */
            public Bundle m21981d() {
                return this.f20525d;
            }

            /* renamed from: g */
            public C5500r m21982g() {
                return this.f20524c;
            }

            /* renamed from: h */
            public CharSequence m21983h() {
                return this.f20522a;
            }

            /* renamed from: i */
            public long m21984i() {
                return this.f20523b;
            }

            /* renamed from: j */
            public e m21985j(String str, Uri uri) {
                this.f20526e = str;
                this.f20527f = uri;
                return this;
            }

            /* renamed from: k */
            public Notification.MessagingStyle.Message m21986k() {
                Notification.MessagingStyle.Message m21988a;
                C5500r m21982g = m21982g();
                if (Build.VERSION.SDK_INT >= 28) {
                    m21988a = b.m21990a(m21983h(), m21984i(), m21982g != null ? m21982g.m22112j() : null);
                } else {
                    m21988a = a.m21988a(m21983h(), m21984i(), m21982g != null ? m21982g.m22107e() : null);
                }
                if (m21979b() != null) {
                    a.m21989b(m21988a, m21979b(), m21980c());
                }
                return m21988a;
            }

            /* renamed from: l */
            public final Bundle m21987l() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f20522a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f20523b);
                C5500r c5500r = this.f20524c;
                if (c5500r != null) {
                    bundle.putCharSequence("sender", c5500r.m22107e());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.f20524c.m22112j());
                    } else {
                        bundle.putBundle("person", this.f20524c.m22113k());
                    }
                }
                String str = this.f20526e;
                if (str != null) {
                    bundle.putString(ImagePickerCache.MAP_KEY_TYPE, str);
                }
                Uri uri = this.f20527f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f20525d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }
        }

        public i() {
        }

        public i(C5500r c5500r) {
            if (TextUtils.isEmpty(c5500r.m22107e())) {
                throw new IllegalArgumentException("User's name must not be empty.");
            }
            this.f20519g = c5500r;
        }

        /* renamed from: y */
        public static i m21954y(Notification notification) {
            j m21996p = j.m21996p(notification);
            if (m21996p instanceof i) {
                return (i) m21996p;
            }
            return null;
        }

        /* renamed from: A */
        public CharSequence m21955A() {
            return this.f20520h;
        }

        /* renamed from: B */
        public List<e> m21956B() {
            return this.f20517e;
        }

        /* renamed from: C */
        public C5500r m21957C() {
            return this.f20519g;
        }

        /* renamed from: D */
        public final boolean m21958D() {
            for (int size = this.f20517e.size() - 1; size >= 0; size--) {
                e eVar = this.f20517e.get(size);
                if (eVar.m21982g() != null && eVar.m21982g().m22107e() == null) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: E */
        public boolean m21959E() {
            e eVar = this.f20528a;
            if (eVar != null && eVar.f20480a.getApplicationInfo().targetSdkVersion < 28 && this.f20521i == null) {
                return this.f20520h != null;
            }
            Boolean bool = this.f20521i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        /* renamed from: F */
        public final TextAppearanceSpan m21960F(int i10) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i10), null);
        }

        /* renamed from: G */
        public final CharSequence m21961G(e eVar) {
            C2573a m10282c = C2573a.m10282c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean z10 = Build.VERSION.SDK_INT >= 21;
            int i10 = z10 ? -16777216 : -1;
            CharSequence m22107e = eVar.m21982g() == null ? "" : eVar.m21982g().m22107e();
            if (TextUtils.isEmpty(m22107e)) {
                m22107e = this.f20519g.m22107e();
                if (z10 && this.f20528a.m21885e() != 0) {
                    i10 = this.f20528a.m21885e();
                }
            }
            CharSequence m10287h = m10282c.m10287h(m22107e);
            spannableStringBuilder.append(m10287h);
            spannableStringBuilder.setSpan(m21960F(i10), spannableStringBuilder.length() - m10287h.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append(m10282c.m10287h(eVar.m21983h() != null ? eVar.m21983h() : ""));
            return spannableStringBuilder;
        }

        /* renamed from: H */
        public i m21962H(CharSequence charSequence) {
            this.f20520h = charSequence;
            return this;
        }

        /* renamed from: I */
        public i m21963I(boolean z10) {
            this.f20521i = Boolean.valueOf(z10);
            return this;
        }

        @Override // p329x.C5494l.j
        /* renamed from: a */
        public void mo21848a(Bundle bundle) {
            super.mo21848a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f20519g.m22107e());
            bundle.putBundle("android.messagingStyleUser", this.f20519g.m22113k());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f20520h);
            if (this.f20520h != null && this.f20521i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f20520h);
            }
            if (!this.f20517e.isEmpty()) {
                bundle.putParcelableArray("android.messages", e.m21976a(this.f20517e));
            }
            if (!this.f20518f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", e.m21976a(this.f20518f));
            }
            Boolean bool = this.f20521i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
        @Override // p329x.C5494l.j
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo10331b(p329x.InterfaceC5493k r8) {
            /*
                Method dump skipped, instructions count: 303
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p329x.C5494l.i.mo10331b(x.k):void");
        }

        @Override // p329x.C5494l.j
        /* renamed from: q */
        public String mo21835q() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        @Override // p329x.C5494l.j
        /* renamed from: v */
        public void mo21836v(Bundle bundle) {
            super.mo21836v(bundle);
            this.f20517e.clear();
            this.f20519g = bundle.containsKey("android.messagingStyleUser") ? C5500r.m22104b(bundle.getBundle("android.messagingStyleUser")) : new C5500r.b().m22121f(bundle.getString("android.selfDisplayName")).m22116a();
            CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
            this.f20520h = charSequence;
            if (charSequence == null) {
                this.f20520h = bundle.getCharSequence("android.hiddenConversationTitle");
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.f20517e.addAll(e.m21978f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
            if (parcelableArray2 != null) {
                this.f20518f.addAll(e.m21978f(parcelableArray2));
            }
            if (bundle.containsKey("android.isGroupConversation")) {
                this.f20521i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
            }
        }

        /* renamed from: x */
        public i m21964x(e eVar) {
            if (eVar != null) {
                this.f20517e.add(eVar);
                if (this.f20517e.size() > 25) {
                    this.f20517e.remove(0);
                }
            }
            return this;
        }

        /* renamed from: z */
        public final e m21965z() {
            for (int size = this.f20517e.size() - 1; size >= 0; size--) {
                e eVar = this.f20517e.get(size);
                if (eVar.m21982g() != null && !TextUtils.isEmpty(eVar.m21982g().m22107e())) {
                    return eVar;
                }
            }
            if (this.f20517e.isEmpty()) {
                return null;
            }
            return this.f20517e.get(r0.size() - 1);
        }
    }

    /* renamed from: x.l$j */
    /* loaded from: classes.dex */
    public static abstract class j {

        /* renamed from: a */
        public e f20528a;

        /* renamed from: b */
        public CharSequence f20529b;

        /* renamed from: c */
        public CharSequence f20530c;

        /* renamed from: d */
        public boolean f20531d = false;

        /* renamed from: x.l$j$a */
        /* loaded from: classes.dex */
        public static class a {
            /* renamed from: a */
            public static void m22007a(RemoteViews remoteViews, int i10, int i11, float f10) {
                remoteViews.setTextViewTextSize(i10, i11, f10);
            }

            /* renamed from: b */
            public static void m22008b(RemoteViews remoteViews, int i10, int i11, int i12, int i13, int i14) {
                remoteViews.setViewPadding(i10, i11, i12, i13, i14);
            }
        }

        /* renamed from: x.l$j$b */
        /* loaded from: classes.dex */
        public static class b {
            /* renamed from: a */
            public static void m22009a(RemoteViews remoteViews, int i10, boolean z10) {
                remoteViews.setChronometerCountDown(i10, z10);
            }
        }

        /* renamed from: f */
        public static float m21991f(float f10, float f11, float f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }

        /* renamed from: g */
        public static j m21992g(String str) {
            if (str == null) {
                return null;
            }
            char c10 = 65535;
            switch (str.hashCode()) {
                case -716705180:
                    if (str.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -171946061:
                    if (str.equals("androidx.core.app.NotificationCompat$BigPictureStyle")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 714386739:
                    if (str.equals("androidx.core.app.NotificationCompat$CallStyle")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 912942987:
                    if (str.equals("androidx.core.app.NotificationCompat$InboxStyle")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 919595044:
                    if (str.equals("androidx.core.app.NotificationCompat$BigTextStyle")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 2090799565:
                    if (str.equals("androidx.core.app.NotificationCompat$MessagingStyle")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return new g();
                case 1:
                    return new b();
                case 2:
                    return new f();
                case 3:
                    return new h();
                case 4:
                    return new c();
                case 5:
                    return new i();
                default:
                    return null;
            }
        }

        /* renamed from: h */
        public static j m21993h(String str) {
            int i10;
            if (str != null && (i10 = Build.VERSION.SDK_INT) >= 16) {
                if (str.equals(Notification.BigPictureStyle.class.getName())) {
                    return new b();
                }
                if (str.equals(Notification.BigTextStyle.class.getName())) {
                    return new c();
                }
                if (str.equals(Notification.InboxStyle.class.getName())) {
                    return new h();
                }
                if (i10 >= 24) {
                    if (str.equals(Notification.MessagingStyle.class.getName())) {
                        return new i();
                    }
                    if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                        return new g();
                    }
                }
            }
            return null;
        }

        /* renamed from: i */
        public static j m21994i(Bundle bundle) {
            j m21992g = m21992g(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
            return m21992g != null ? m21992g : (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) ? new i() : (bundle.containsKey("android.picture") || bundle.containsKey("android.pictureIcon")) ? new b() : bundle.containsKey("android.bigText") ? new c() : bundle.containsKey("android.textLines") ? new h() : bundle.containsKey("android.callType") ? new f() : m21993h(bundle.getString("android.template"));
        }

        /* renamed from: j */
        public static j m21995j(Bundle bundle) {
            j m21994i = m21994i(bundle);
            if (m21994i == null) {
                return null;
            }
            try {
                m21994i.mo21836v(bundle);
                return m21994i;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        /* renamed from: p */
        public static j m21996p(Notification notification) {
            Bundle m21812a = C5494l.m21812a(notification);
            if (m21812a == null) {
                return null;
            }
            return m21995j(m21812a);
        }

        /* renamed from: a */
        public void mo21848a(Bundle bundle) {
            if (this.f20531d) {
                bundle.putCharSequence("android.summaryText", this.f20530c);
            }
            CharSequence charSequence = this.f20529b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String mo21835q = mo21835q();
            if (mo21835q != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", mo21835q);
            }
        }

        /* renamed from: b */
        public abstract void mo10331b(InterfaceC5493k interfaceC5493k);

        /* JADX WARN: Removed duplicated region for block: B:44:0x016c  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x017e A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01a4  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01ef  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01fa  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0176  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.widget.RemoteViews m21997c(boolean r17, int r18, boolean r19) {
            /*
                Method dump skipped, instructions count: 511
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p329x.C5494l.j.m21997c(boolean, int, boolean):android.widget.RemoteViews");
        }

        /* renamed from: d */
        public void m21998d(RemoteViews remoteViews, RemoteViews remoteViews2) {
            m22005r(remoteViews);
            int i10 = C5186e.f19611S;
            remoteViews.removeAllViews(i10);
            remoteViews.addView(i10, remoteViews2.clone());
            remoteViews.setViewVisibility(i10, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                a.m22008b(remoteViews, C5186e.f19612T, 0, m21999e(), 0, 0);
            }
        }

        /* renamed from: e */
        public final int m21999e() {
            Resources resources = this.f20528a.f20480a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C5184c.f19580i);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C5184c.f19581j);
            float m21991f = (m21991f(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - m21991f) * dimensionPixelSize) + (m21991f * dimensionPixelSize2));
        }

        /* renamed from: k */
        public Bitmap m22000k(int i10, int i11) {
            return m22001l(i10, i11, 0);
        }

        /* renamed from: l */
        public final Bitmap m22001l(int i10, int i11, int i12) {
            return m22003n(IconCompat.m1129k(this.f20528a.f20480a, i10), i11, i12);
        }

        /* renamed from: m */
        public Bitmap m22002m(IconCompat iconCompat, int i10) {
            return m22003n(iconCompat, i10, 0);
        }

        /* renamed from: n */
        public final Bitmap m22003n(IconCompat iconCompat, int i10, int i11) {
            Drawable m1139t = iconCompat.m1139t(this.f20528a.f20480a);
            int intrinsicWidth = i11 == 0 ? m1139t.getIntrinsicWidth() : i11;
            if (i11 == 0) {
                i11 = m1139t.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i11, Bitmap.Config.ARGB_8888);
            m1139t.setBounds(0, 0, intrinsicWidth, i11);
            if (i10 != 0) {
                m1139t.mutate().setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            m1139t.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        /* renamed from: o */
        public final Bitmap m22004o(int i10, int i11, int i12, int i13) {
            int i14 = C5185d.f19590i;
            if (i13 == 0) {
                i13 = 0;
            }
            Bitmap m22001l = m22001l(i14, i13, i11);
            Canvas canvas = new Canvas(m22001l);
            Drawable mutate = this.f20528a.f20480a.getResources().getDrawable(i10).mutate();
            mutate.setFilterBitmap(true);
            int i15 = (i11 - i12) / 2;
            int i16 = i12 + i15;
            mutate.setBounds(i15, i15, i16, i16);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return m22001l;
        }

        /* renamed from: q */
        public String mo21835q() {
            return null;
        }

        /* renamed from: r */
        public final void m22005r(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(C5186e.f19644m0, 8);
            remoteViews.setViewVisibility(C5186e.f19640k0, 8);
            remoteViews.setViewVisibility(C5186e.f19638j0, 8);
        }

        /* renamed from: s */
        public RemoteViews mo10332s(InterfaceC5493k interfaceC5493k) {
            return null;
        }

        /* renamed from: t */
        public RemoteViews mo10333t(InterfaceC5493k interfaceC5493k) {
            return null;
        }

        /* renamed from: u */
        public RemoteViews mo21941u(InterfaceC5493k interfaceC5493k) {
            return null;
        }

        /* renamed from: v */
        public void mo21836v(Bundle bundle) {
            if (bundle.containsKey("android.summaryText")) {
                this.f20530c = bundle.getCharSequence("android.summaryText");
                this.f20531d = true;
            }
            this.f20529b = bundle.getCharSequence("android.title.big");
        }

        /* renamed from: w */
        public void m22006w(e eVar) {
            if (this.f20528a != eVar) {
                this.f20528a = eVar;
                if (eVar != null) {
                    eVar.m21873P(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m21812a(Notification notification) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19) {
            return notification.extras;
        }
        if (i10 >= 16) {
            return C5496n.m22063c(notification);
        }
        return null;
    }
}
