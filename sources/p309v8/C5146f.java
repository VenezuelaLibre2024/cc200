package p309v8;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p090g0.C1957q;
import p142j9.InterfaceC3271i;
import p195n7.C3767g;
import p253r7.InterfaceC4318a;
import p309v8.InterfaceC5150j;
import p353y7.C5867c;
import p353y7.C5872e0;
import p353y7.C5885q;
import p353y7.InterfaceC5869d;
import p353y7.InterfaceC5875g;
import p354y8.InterfaceC5896b;

/* renamed from: v8.f */
/* loaded from: classes.dex */
public class C5146f implements InterfaceC5149i, InterfaceC5150j {

    /* renamed from: a */
    public final InterfaceC5896b<C5151k> f19401a;

    /* renamed from: b */
    public final Context f19402b;

    /* renamed from: c */
    public final InterfaceC5896b<InterfaceC3271i> f19403c;

    /* renamed from: d */
    public final Set<InterfaceC5147g> f19404d;

    /* renamed from: e */
    public final Executor f19405e;

    public C5146f(final Context context, final String str, Set<InterfaceC5147g> set, InterfaceC5896b<InterfaceC3271i> interfaceC5896b, Executor executor) {
        this((InterfaceC5896b<C5151k>) new InterfaceC5896b() { // from class: v8.e
            @Override // p354y8.InterfaceC5896b
            public final Object get() {
                C5151k m20826j;
                m20826j = C5146f.m20826j(context, str);
                return m20826j;
            }
        }, set, executor, interfaceC5896b, context);
    }

    public C5146f(InterfaceC5896b<C5151k> interfaceC5896b, Set<InterfaceC5147g> set, Executor executor, InterfaceC5896b<InterfaceC3271i> interfaceC5896b2, Context context) {
        this.f19401a = interfaceC5896b;
        this.f19404d = set;
        this.f19405e = executor;
        this.f19403c = interfaceC5896b2;
        this.f19402b = context;
    }

    /* renamed from: g */
    public static C5867c<C5146f> m20823g() {
        final C5872e0 m23504a = C5872e0.m23504a(InterfaceC4318a.class, Executor.class);
        return C5867c.m23455d(C5146f.class, InterfaceC5149i.class, InterfaceC5150j.class).m23473b(C5885q.m23551j(Context.class)).m23473b(C5885q.m23551j(C3767g.class)).m23473b(C5885q.m23555n(InterfaceC5147g.class)).m23473b(C5885q.m23553l(InterfaceC3271i.class)).m23473b(C5885q.m23552k(m23504a)).m23477f(new InterfaceC5875g() { // from class: v8.d
            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                C5146f m20824h;
                m20824h = C5146f.m20824h(C5872e0.this, interfaceC5869d);
                return m20824h;
            }
        }).m23475d();
    }

    /* renamed from: h */
    public static /* synthetic */ C5146f m20824h(C5872e0 c5872e0, InterfaceC5869d interfaceC5869d) {
        return new C5146f((Context) interfaceC5869d.get(Context.class), ((C3767g) interfaceC5869d.get(C3767g.class)).m14352s(), (Set<InterfaceC5147g>) interfaceC5869d.m23497f(InterfaceC5147g.class), (InterfaceC5896b<InterfaceC3271i>) interfaceC5869d.mo23494c(InterfaceC3271i.class), (Executor) interfaceC5869d.mo23492a(c5872e0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ String m20825i() {
        String byteArrayOutputStream;
        synchronized (this) {
            C5151k c5151k = this.f19401a.get();
            List<AbstractC5152l> m20835c = c5151k.m20835c();
            c5151k.m20834b();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < m20835c.size(); i10++) {
                AbstractC5152l abstractC5152l = m20835c.get(i10);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", abstractC5152l.mo20818c());
                jSONObject.put("dates", new JSONArray((Collection) abstractC5152l.mo20817b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                try {
                    gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                    gZIPOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                } finally {
                }
            } finally {
            }
        }
        return byteArrayOutputStream;
    }

    /* renamed from: j */
    public static /* synthetic */ C5151k m20826j(Context context, String str) {
        return new C5151k(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Void m20827k() {
        synchronized (this) {
            this.f19401a.get().m20843k(System.currentTimeMillis(), this.f19403c.get().mo11817a());
        }
        return null;
    }

    @Override // p309v8.InterfaceC5149i
    /* renamed from: a */
    public Task<String> mo20828a() {
        return C1957q.m7879a(this.f19402b) ^ true ? Tasks.forResult("") : Tasks.call(this.f19405e, new Callable() { // from class: v8.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String m20825i;
                m20825i = C5146f.this.m20825i();
                return m20825i;
            }
        });
    }

    @Override // p309v8.InterfaceC5150j
    /* renamed from: b */
    public synchronized InterfaceC5150j.a mo20829b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        C5151k c5151k = this.f19401a.get();
        if (!c5151k.m20841i(currentTimeMillis)) {
            return InterfaceC5150j.a.NONE;
        }
        c5151k.m20839g();
        return InterfaceC5150j.a.GLOBAL;
    }

    /* renamed from: l */
    public Task<Void> m20830l() {
        if (this.f19404d.size() > 0 && !(!C1957q.m7879a(this.f19402b))) {
            return Tasks.call(this.f19405e, new Callable() { // from class: v8.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void m20827k;
                    m20827k = C5146f.this.m20827k();
                    return m20827k;
                }
            });
        }
        return Tasks.forResult(null);
    }
}
