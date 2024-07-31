package p012aa;

import android.content.Context;
import android.os.AsyncTask;
import ba.C0526c;
import ba.C0527d;
import ba.C0529f;
import ba.InterfaceC0525b;
import ba.InterfaceC0528e;
import ca.C1001f;
import ca.InterfaceC0996a;
import com.google.android.gms.maps.model.CameraPosition;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p012aa.InterfaceC0081b;
import p052da.C1607b;
import p336x6.C5629c;
import p367z6.C6020m;

/* renamed from: aa.c */
/* loaded from: classes.dex */
public class C0082c<T extends InterfaceC0081b> implements C5629c.b, C5629c.j, C5629c.f {

    /* renamed from: h */
    public final C1607b f271h;

    /* renamed from: i */
    public final C1607b.a f272i;

    /* renamed from: j */
    public final C1607b.a f273j;

    /* renamed from: l */
    public InterfaceC0996a<T> f275l;

    /* renamed from: m */
    public C5629c f276m;

    /* renamed from: n */
    public CameraPosition f277n;

    /* renamed from: q */
    public f<T> f280q;

    /* renamed from: r */
    public d<T> f281r;

    /* renamed from: s */
    public e<T> f282s;

    /* renamed from: t */
    public g<T> f283t;

    /* renamed from: u */
    public h<T> f284u;

    /* renamed from: v */
    public c<T> f285v;

    /* renamed from: p */
    public final ReadWriteLock f279p = new ReentrantReadWriteLock();

    /* renamed from: k */
    public InterfaceC0528e<T> f274k = new C0529f(new C0527d(new C0526c()));

    /* renamed from: o */
    public C0082c<T>.b f278o = new b();

    /* renamed from: aa.c$b */
    /* loaded from: classes.dex */
    public class b extends AsyncTask<Float, Void, Set<? extends InterfaceC0080a<T>>> {
        public b() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<? extends InterfaceC0080a<T>> doInBackground(Float... fArr) {
            InterfaceC0525b<T> m342e = C0082c.this.m342e();
            m342e.mo2545f();
            try {
                return m342e.mo2546b(fArr[0].floatValue());
            } finally {
                m342e.mo2544e();
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Set<? extends InterfaceC0080a<T>> set) {
            C0082c.this.f275l.onClustersChanged(set);
        }
    }

    /* renamed from: aa.c$c */
    /* loaded from: classes.dex */
    public interface c<T extends InterfaceC0081b> {
        boolean onClusterClick(InterfaceC0080a<T> interfaceC0080a);
    }

    /* renamed from: aa.c$d */
    /* loaded from: classes.dex */
    public interface d<T extends InterfaceC0081b> {
        /* renamed from: a */
        void m352a(InterfaceC0080a<T> interfaceC0080a);
    }

    /* renamed from: aa.c$e */
    /* loaded from: classes.dex */
    public interface e<T extends InterfaceC0081b> {
        /* renamed from: a */
        void m353a(InterfaceC0080a<T> interfaceC0080a);
    }

    /* renamed from: aa.c$f */
    /* loaded from: classes.dex */
    public interface f<T extends InterfaceC0081b> {
        boolean onClusterItemClick(T t10);
    }

    /* renamed from: aa.c$g */
    /* loaded from: classes.dex */
    public interface g<T extends InterfaceC0081b> {
        /* renamed from: a */
        void m354a(T t10);
    }

    /* renamed from: aa.c$h */
    /* loaded from: classes.dex */
    public interface h<T extends InterfaceC0081b> {
        /* renamed from: a */
        void m355a(T t10);
    }

    public C0082c(Context context, C5629c c5629c, C1607b c1607b) {
        this.f276m = c5629c;
        this.f271h = c1607b;
        this.f273j = c1607b.m6445g();
        this.f272i = c1607b.m6445g();
        this.f275l = new C1001f(context, c5629c, this);
        this.f275l.onAdd();
    }

    /* renamed from: b */
    public boolean m339b(T t10) {
        InterfaceC0525b<T> m342e = m342e();
        m342e.mo2545f();
        try {
            return m342e.mo2550i(t10);
        } finally {
            m342e.mo2544e();
        }
    }

    /* renamed from: c */
    public void m340c() {
        InterfaceC0525b<T> m342e = m342e();
        m342e.mo2545f();
        try {
            m342e.mo2547c();
        } finally {
            m342e.mo2544e();
        }
    }

    /* renamed from: d */
    public void m341d() {
        this.f279p.writeLock().lock();
        try {
            this.f278o.cancel(true);
            C0082c<T>.b bVar = new b();
            this.f278o = bVar;
            bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Float.valueOf(this.f276m.m22647g().f4587i));
        } finally {
            this.f279p.writeLock().unlock();
        }
    }

    /* renamed from: e */
    public InterfaceC0525b<T> m342e() {
        return this.f274k;
    }

    /* renamed from: f */
    public C1607b.a m343f() {
        return this.f273j;
    }

    /* renamed from: g */
    public C1607b.a m344g() {
        return this.f272i;
    }

    /* renamed from: h */
    public C1607b m345h() {
        return this.f271h;
    }

    /* renamed from: i */
    public boolean m346i(T t10) {
        InterfaceC0525b<T> m342e = m342e();
        m342e.mo2545f();
        try {
            return m342e.mo2548d(t10);
        } finally {
            m342e.mo2544e();
        }
    }

    /* renamed from: j */
    public void m347j(c<T> cVar) {
        this.f285v = cVar;
        this.f275l.setOnClusterClickListener(cVar);
    }

    /* renamed from: k */
    public void m348k(f<T> fVar) {
        this.f280q = fVar;
        this.f275l.setOnClusterItemClickListener(fVar);
    }

    /* renamed from: l */
    public void m349l(InterfaceC0996a<T> interfaceC0996a) {
        this.f275l.setOnClusterClickListener(null);
        this.f275l.setOnClusterItemClickListener(null);
        this.f273j.m6441b();
        this.f272i.m6441b();
        this.f275l.onRemove();
        this.f275l = interfaceC0996a;
        interfaceC0996a.onAdd();
        this.f275l.setOnClusterClickListener(this.f285v);
        this.f275l.setOnClusterInfoWindowClickListener(this.f281r);
        this.f275l.setOnClusterInfoWindowLongClickListener(this.f282s);
        this.f275l.setOnClusterItemClickListener(this.f280q);
        this.f275l.setOnClusterItemInfoWindowClickListener(this.f283t);
        this.f275l.setOnClusterItemInfoWindowLongClickListener(this.f284u);
        m341d();
    }

    @Override // p336x6.C5629c.b
    public void onCameraIdle() {
        InterfaceC0996a<T> interfaceC0996a = this.f275l;
        if (interfaceC0996a instanceof C5629c.b) {
            ((C5629c.b) interfaceC0996a).onCameraIdle();
        }
        this.f274k.mo2561a(this.f276m.m22647g());
        if (!this.f274k.mo2562h()) {
            CameraPosition cameraPosition = this.f277n;
            if (cameraPosition != null && cameraPosition.f4587i == this.f276m.m22647g().f4587i) {
                return;
            } else {
                this.f277n = this.f276m.m22647g();
            }
        }
        m341d();
    }

    @Override // p336x6.C5629c.f
    public void onInfoWindowClick(C6020m c6020m) {
        m345h().onInfoWindowClick(c6020m);
    }

    @Override // p336x6.C5629c.j
    public boolean onMarkerClick(C6020m c6020m) {
        return m345h().onMarkerClick(c6020m);
    }
}
