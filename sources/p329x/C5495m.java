package p329x;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p285u.C4772b;
import p329x.C5494l;

/* renamed from: x.m */
/* loaded from: classes.dex */
public class C5495m implements InterfaceC5493k {

    /* renamed from: a */
    public final Context f20532a;

    /* renamed from: b */
    public final Notification.Builder f20533b;

    /* renamed from: c */
    public final C5494l.e f20534c;

    /* renamed from: d */
    public RemoteViews f20535d;

    /* renamed from: e */
    public RemoteViews f20536e;

    /* renamed from: f */
    public final List<Bundle> f20537f = new ArrayList();

    /* renamed from: g */
    public final Bundle f20538g = new Bundle();

    /* renamed from: h */
    public int f20539h;

    /* renamed from: i */
    public RemoteViews f20540i;

    /* renamed from: x.m$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static Notification m22017a(Notification.Builder builder) {
            return builder.build();
        }

        /* renamed from: b */
        public static Notification.Builder m22018b(Notification.Builder builder, int i10) {
            return builder.setPriority(i10);
        }

        /* renamed from: c */
        public static Notification.Builder m22019c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        /* renamed from: d */
        public static Notification.Builder m22020d(Notification.Builder builder, boolean z10) {
            return builder.setUsesChronometer(z10);
        }
    }

    /* renamed from: x.m$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static Notification.Builder m22021a(Notification.Builder builder, boolean z10) {
            return builder.setShowWhen(z10);
        }
    }

    /* renamed from: x.m$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        public static Notification.Builder m22022a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    /* renamed from: x.m$d */
    /* loaded from: classes.dex */
    public static class d {
        /* renamed from: a */
        public static Notification.Builder m22023a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        /* renamed from: b */
        public static Notification.Action.Builder m22024b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        /* renamed from: c */
        public static Notification.Action.Builder m22025c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        /* renamed from: d */
        public static Notification.Action m22026d(Notification.Action.Builder builder) {
            return builder.build();
        }

        /* renamed from: e */
        public static Notification.Action.Builder m22027e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i10, charSequence, pendingIntent);
        }

        /* renamed from: f */
        public static String m22028f(Notification notification) {
            return notification.getGroup();
        }

        /* renamed from: g */
        public static Notification.Builder m22029g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        /* renamed from: h */
        public static Notification.Builder m22030h(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        /* renamed from: i */
        public static Notification.Builder m22031i(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        /* renamed from: j */
        public static Notification.Builder m22032j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* renamed from: x.m$e */
    /* loaded from: classes.dex */
    public static class e {
        /* renamed from: a */
        public static Notification.Builder m22033a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        /* renamed from: b */
        public static Notification.Builder m22034b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        /* renamed from: c */
        public static Notification.Builder m22035c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        /* renamed from: d */
        public static Notification.Builder m22036d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        /* renamed from: e */
        public static Notification.Builder m22037e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        /* renamed from: f */
        public static Notification.Builder m22038f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    /* renamed from: x.m$f */
    /* loaded from: classes.dex */
    public static class f {
        /* renamed from: a */
        public static Notification.Action.Builder m22039a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        /* renamed from: b */
        public static Notification.Builder m22040b(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* renamed from: x.m$g */
    /* loaded from: classes.dex */
    public static class g {
        /* renamed from: a */
        public static Notification.Action.Builder m22041a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        /* renamed from: b */
        public static Notification.Builder m22042b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        /* renamed from: c */
        public static Notification.Builder m22043c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        /* renamed from: d */
        public static Notification.Builder m22044d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        /* renamed from: e */
        public static Notification.Builder m22045e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* renamed from: x.m$h */
    /* loaded from: classes.dex */
    public static class h {
        /* renamed from: a */
        public static Notification.Builder m22046a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        /* renamed from: b */
        public static Notification.Builder m22047b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        /* renamed from: c */
        public static Notification.Builder m22048c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        /* renamed from: d */
        public static Notification.Builder m22049d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        /* renamed from: e */
        public static Notification.Builder m22050e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        /* renamed from: f */
        public static Notification.Builder m22051f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        /* renamed from: g */
        public static Notification.Builder m22052g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    /* renamed from: x.m$i */
    /* loaded from: classes.dex */
    public static class i {
        /* renamed from: a */
        public static Notification.Builder m22053a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        /* renamed from: b */
        public static Notification.Action.Builder m22054b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    /* renamed from: x.m$j */
    /* loaded from: classes.dex */
    public static class j {
        /* renamed from: a */
        public static Notification.Builder m22055a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        /* renamed from: b */
        public static Notification.Builder m22056b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        /* renamed from: c */
        public static Notification.Action.Builder m22057c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        /* renamed from: d */
        public static Notification.Builder m22058d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* renamed from: x.m$k */
    /* loaded from: classes.dex */
    public static class k {
        /* renamed from: a */
        public static Notification.Action.Builder m22059a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        /* renamed from: b */
        public static Notification.Builder m22060b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    public C5495m(C5494l.e eVar) {
        int i10;
        Object obj;
        List<String> m22010e;
        Bundle bundle;
        String str;
        this.f20534c = eVar;
        Context context = eVar.f20480a;
        this.f20532a = context;
        int i11 = Build.VERSION.SDK_INT;
        this.f20533b = i11 >= 26 ? h.m22046a(context, eVar.f20468L) : new Notification.Builder(eVar.f20480a);
        Notification notification = eVar.f20476T;
        this.f20533b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f20488i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f20484e).setContentText(eVar.f20485f).setContentInfo(eVar.f20490k).setContentIntent(eVar.f20486g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f20487h, (notification.flags & 128) != 0).setLargeIcon(eVar.f20489j).setNumber(eVar.f20491l).setProgress(eVar.f20500u, eVar.f20501v, eVar.f20502w);
        if (i11 < 21) {
            this.f20533b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i11 >= 16) {
            a.m22018b(a.m22020d(a.m22019c(this.f20533b, eVar.f20497r), eVar.f20494o), eVar.f20492m);
            Iterator<C5494l.a> it = eVar.f20481b.iterator();
            while (it.hasNext()) {
                m22012b(it.next());
            }
            Bundle bundle2 = eVar.f20461E;
            if (bundle2 != null) {
                this.f20538g.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (eVar.f20457A) {
                    this.f20538g.putBoolean("android.support.localOnly", true);
                }
                String str2 = eVar.f20503x;
                if (str2 != null) {
                    this.f20538g.putString("android.support.groupKey", str2);
                    if (eVar.f20504y) {
                        bundle = this.f20538g;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f20538g;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = eVar.f20505z;
                if (str3 != null) {
                    this.f20538g.putString("android.support.sortKey", str3);
                }
            }
            this.f20535d = eVar.f20465I;
            this.f20536e = eVar.f20466J;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 17) {
            b.m22021a(this.f20533b, eVar.f20493n);
        }
        if (i12 >= 19 && i12 < 21 && (m22010e = m22010e(m22011g(eVar.f20482c), eVar.f20479W)) != null && !m22010e.isEmpty()) {
            this.f20538g.putStringArray("android.people", (String[]) m22010e.toArray(new String[m22010e.size()]));
        }
        if (i12 >= 20) {
            d.m22031i(this.f20533b, eVar.f20457A);
            d.m22029g(this.f20533b, eVar.f20503x);
            d.m22032j(this.f20533b, eVar.f20505z);
            d.m22030h(this.f20533b, eVar.f20504y);
            this.f20539h = eVar.f20472P;
        }
        if (i12 >= 21) {
            e.m22034b(this.f20533b, eVar.f20460D);
            e.m22035c(this.f20533b, eVar.f20462F);
            e.m22038f(this.f20533b, eVar.f20463G);
            e.m22036d(this.f20533b, eVar.f20464H);
            e.m22037e(this.f20533b, notification.sound, notification.audioAttributes);
            List m22010e2 = i12 < 28 ? m22010e(m22011g(eVar.f20482c), eVar.f20479W) : eVar.f20479W;
            if (m22010e2 != null && !m22010e2.isEmpty()) {
                Iterator it2 = m22010e2.iterator();
                while (it2.hasNext()) {
                    e.m22033a(this.f20533b, (String) it2.next());
                }
            }
            this.f20540i = eVar.f20467K;
            if (eVar.f20483d.size() > 0) {
                Bundle bundle3 = eVar.m21887g().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                for (int i13 = 0; i13 < eVar.f20483d.size(); i13++) {
                    bundle5.putBundle(Integer.toString(i13), C5496n.m22062b(eVar.f20483d.get(i13)));
                }
                bundle3.putBundle("invisible_actions", bundle5);
                bundle4.putBundle("invisible_actions", bundle5);
                eVar.m21887g().putBundle("android.car.EXTENSIONS", bundle3);
                this.f20538g.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 23 && (obj = eVar.f20478V) != null) {
            f.m22040b(this.f20533b, obj);
        }
        if (i14 >= 24) {
            c.m22022a(this.f20533b, eVar.f20461E);
            g.m22045e(this.f20533b, eVar.f20499t);
            RemoteViews remoteViews = eVar.f20465I;
            if (remoteViews != null) {
                g.m22043c(this.f20533b, remoteViews);
            }
            RemoteViews remoteViews2 = eVar.f20466J;
            if (remoteViews2 != null) {
                g.m22042b(this.f20533b, remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.f20467K;
            if (remoteViews3 != null) {
                g.m22044d(this.f20533b, remoteViews3);
            }
        }
        if (i14 >= 26) {
            h.m22047b(this.f20533b, eVar.f20469M);
            h.m22050e(this.f20533b, eVar.f20498s);
            h.m22051f(this.f20533b, eVar.f20470N);
            h.m22052g(this.f20533b, eVar.f20471O);
            h.m22049d(this.f20533b, eVar.f20472P);
            if (eVar.f20459C) {
                h.m22048c(this.f20533b, eVar.f20458B);
            }
            if (!TextUtils.isEmpty(eVar.f20468L)) {
                this.f20533b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i14 >= 28) {
            Iterator<C5500r> it3 = eVar.f20482c.iterator();
            while (it3.hasNext()) {
                i.m22053a(this.f20533b, it3.next().m22112j());
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 29) {
            j.m22055a(this.f20533b, eVar.f20474R);
            j.m22056b(this.f20533b, C5494l.d.m21856a(eVar.f20475S));
        }
        if (i15 >= 31 && (i10 = eVar.f20473Q) != 0) {
            k.m22060b(this.f20533b, i10);
        }
        if (eVar.f20477U) {
            if (this.f20534c.f20504y) {
                this.f20539h = 2;
            } else {
                this.f20539h = 1;
            }
            this.f20533b.setVibrate(null);
            this.f20533b.setSound(null);
            int i16 = notification.defaults & (-2);
            notification.defaults = i16;
            int i17 = i16 & (-3);
            notification.defaults = i17;
            this.f20533b.setDefaults(i17);
            if (i15 >= 26) {
                if (TextUtils.isEmpty(this.f20534c.f20503x)) {
                    d.m22029g(this.f20533b, "silent");
                }
                h.m22049d(this.f20533b, this.f20539h);
            }
        }
    }

    /* renamed from: e */
    public static List<String> m22010e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C4772b c4772b = new C4772b(list.size() + list2.size());
        c4772b.addAll(list);
        c4772b.addAll(list2);
        return new ArrayList(c4772b);
    }

    /* renamed from: g */
    public static List<String> m22011g(List<C5500r> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<C5500r> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m22111i());
        }
        return arrayList;
    }

    @Override // p329x.InterfaceC5493k
    /* renamed from: a */
    public Notification.Builder mo21811a() {
        return this.f20533b;
    }

    /* renamed from: b */
    public final void m22012b(C5494l.a aVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 20) {
            if (i10 >= 16) {
                this.f20537f.add(C5496n.m22066f(this.f20533b, aVar));
                return;
            }
            return;
        }
        IconCompat m21818f = aVar.m21818f();
        Notification.Action.Builder m22039a = i10 >= 23 ? f.m22039a(m21818f != null ? m21818f.m1144y() : null, aVar.m21822j(), aVar.m21813a()) : d.m22027e(m21818f != null ? m21818f.m1134n() : 0, aVar.m21822j(), aVar.m21813a());
        if (aVar.m21819g() != null) {
            for (RemoteInput remoteInput : C5502t.m22125b(aVar.m21819g())) {
                d.m22025c(m22039a, remoteInput);
            }
        }
        Bundle bundle = aVar.m21816d() != null ? new Bundle(aVar.m21816d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m21814b());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            g.m22041a(m22039a, aVar.m21814b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.m21820h());
        if (i11 >= 28) {
            i.m22054b(m22039a, aVar.m21820h());
        }
        if (i11 >= 29) {
            j.m22057c(m22039a, aVar.m21824l());
        }
        if (i11 >= 31) {
            k.m22059a(m22039a, aVar.m21823k());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.m21821i());
        d.m22024b(m22039a, bundle);
        d.m22023a(this.f20533b, d.m22026d(m22039a));
    }

    /* renamed from: c */
    public Notification m22013c() {
        Bundle m21812a;
        RemoteViews mo21941u;
        RemoteViews mo10332s;
        C5494l.j jVar = this.f20534c.f20496q;
        if (jVar != null) {
            jVar.mo10331b(this);
        }
        RemoteViews mo10333t = jVar != null ? jVar.mo10333t(this) : null;
        Notification m22014d = m22014d();
        if (mo10333t != null || (mo10333t = this.f20534c.f20465I) != null) {
            m22014d.contentView = mo10333t;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 16 && jVar != null && (mo10332s = jVar.mo10332s(this)) != null) {
            m22014d.bigContentView = mo10332s;
        }
        if (i10 >= 21 && jVar != null && (mo21941u = this.f20534c.f20496q.mo21941u(this)) != null) {
            m22014d.headsUpContentView = mo21941u;
        }
        if (i10 >= 16 && jVar != null && (m21812a = C5494l.m21812a(m22014d)) != null) {
            jVar.mo21848a(m21812a);
        }
        return m22014d;
    }

    /* renamed from: d */
    public Notification m22014d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return a.m22017a(this.f20533b);
        }
        if (i10 >= 24) {
            Notification m22017a = a.m22017a(this.f20533b);
            if (this.f20539h != 0) {
                if (d.m22028f(m22017a) != null && (m22017a.flags & 512) != 0 && this.f20539h == 2) {
                    m22016h(m22017a);
                }
                if (d.m22028f(m22017a) != null && (m22017a.flags & 512) == 0 && this.f20539h == 1) {
                    m22016h(m22017a);
                }
            }
            return m22017a;
        }
        if (i10 >= 21) {
            c.m22022a(this.f20533b, this.f20538g);
            Notification m22017a2 = a.m22017a(this.f20533b);
            RemoteViews remoteViews = this.f20535d;
            if (remoteViews != null) {
                m22017a2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f20536e;
            if (remoteViews2 != null) {
                m22017a2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f20540i;
            if (remoteViews3 != null) {
                m22017a2.headsUpContentView = remoteViews3;
            }
            if (this.f20539h != 0) {
                if (d.m22028f(m22017a2) != null && (m22017a2.flags & 512) != 0 && this.f20539h == 2) {
                    m22016h(m22017a2);
                }
                if (d.m22028f(m22017a2) != null && (m22017a2.flags & 512) == 0 && this.f20539h == 1) {
                    m22016h(m22017a2);
                }
            }
            return m22017a2;
        }
        if (i10 >= 20) {
            c.m22022a(this.f20533b, this.f20538g);
            Notification m22017a3 = a.m22017a(this.f20533b);
            RemoteViews remoteViews4 = this.f20535d;
            if (remoteViews4 != null) {
                m22017a3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f20536e;
            if (remoteViews5 != null) {
                m22017a3.bigContentView = remoteViews5;
            }
            if (this.f20539h != 0) {
                if (d.m22028f(m22017a3) != null && (m22017a3.flags & 512) != 0 && this.f20539h == 2) {
                    m22016h(m22017a3);
                }
                if (d.m22028f(m22017a3) != null && (m22017a3.flags & 512) == 0 && this.f20539h == 1) {
                    m22016h(m22017a3);
                }
            }
            return m22017a3;
        }
        if (i10 >= 19) {
            SparseArray<Bundle> m22061a = C5496n.m22061a(this.f20537f);
            if (m22061a != null) {
                this.f20538g.putSparseParcelableArray("android.support.actionExtras", m22061a);
            }
            c.m22022a(this.f20533b, this.f20538g);
            Notification m22017a4 = a.m22017a(this.f20533b);
            RemoteViews remoteViews6 = this.f20535d;
            if (remoteViews6 != null) {
                m22017a4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f20536e;
            if (remoteViews7 != null) {
                m22017a4.bigContentView = remoteViews7;
            }
            return m22017a4;
        }
        if (i10 < 16) {
            return this.f20533b.getNotification();
        }
        Notification m22017a5 = a.m22017a(this.f20533b);
        Bundle m21812a = C5494l.m21812a(m22017a5);
        Bundle bundle = new Bundle(this.f20538g);
        for (String str : this.f20538g.keySet()) {
            if (m21812a.containsKey(str)) {
                bundle.remove(str);
            }
        }
        m21812a.putAll(bundle);
        SparseArray<Bundle> m22061a2 = C5496n.m22061a(this.f20537f);
        if (m22061a2 != null) {
            C5494l.m21812a(m22017a5).putSparseParcelableArray("android.support.actionExtras", m22061a2);
        }
        RemoteViews remoteViews8 = this.f20535d;
        if (remoteViews8 != null) {
            m22017a5.contentView = remoteViews8;
        }
        RemoteViews remoteViews9 = this.f20536e;
        if (remoteViews9 != null) {
            m22017a5.bigContentView = remoteViews9;
        }
        return m22017a5;
    }

    /* renamed from: f */
    public Context m22015f() {
        return this.f20532a;
    }

    /* renamed from: h */
    public final void m22016h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i10 = notification.defaults & (-2);
        notification.defaults = i10;
        notification.defaults = i10 & (-3);
    }
}
