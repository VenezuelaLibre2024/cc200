package p185m9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import gd.C2238l;
import gd.C2245s;
import id.C2704a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import p038ce.C1063k;
import p038ce.C1089q0;
import p038ce.InterfaceC1026c2;
import p038ce.InterfaceC1085p0;
import p115hd.C2502n;
import p115hd.C2510v;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import p161kd.C3385c;
import p173ld.AbstractC3478l;
import p173ld.InterfaceC3472f;
import p197n9.C3780a;
import p197n9.InterfaceC3781b;
import sd.InterfaceC4584p;
import td.C4747g;
import td.C4753m;

/* renamed from: m9.f0 */
/* loaded from: classes.dex */
public final class C3566f0 {

    /* renamed from: f */
    public static final b f12554f = new b(null);

    /* renamed from: a */
    public final InterfaceC3284g f12555a;

    /* renamed from: b */
    public Messenger f12556b;

    /* renamed from: c */
    public boolean f12557c;

    /* renamed from: d */
    public final LinkedBlockingDeque<Message> f12558d;

    /* renamed from: e */
    public final d f12559e;

    /* renamed from: m9.f0$a */
    /* loaded from: classes.dex */
    public static final class a extends Handler {

        /* renamed from: a */
        public final InterfaceC3284g f12560a;

        @InterfaceC3472f(m12916c = "com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1", m12917f = "SessionLifecycleClient.kt", m12918l = {C1417R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated}, m12919m = "invokeSuspend")
        /* renamed from: m9.f0$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C6194a extends AbstractC3478l implements InterfaceC4584p<InterfaceC1085p0, InterfaceC3281d<? super C2245s>, Object> {

            /* renamed from: h */
            public int f12561h;

            /* renamed from: i */
            public final /* synthetic */ String f12562i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6194a(String str, InterfaceC3281d<? super C6194a> interfaceC3281d) {
                super(2, interfaceC3281d);
                this.f12562i = str;
            }

            @Override // p173ld.AbstractC3467a
            public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
                return new C6194a(this.f12562i, interfaceC3281d);
            }

            @Override // sd.InterfaceC4584p
            public final Object invoke(InterfaceC1085p0 interfaceC1085p0, InterfaceC3281d<? super C2245s> interfaceC3281d) {
                return ((C6194a) create(interfaceC1085p0, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
            }

            @Override // p173ld.AbstractC3467a
            public final Object invokeSuspend(Object obj) {
                Object m12581c = C3385c.m12581c();
                int i10 = this.f12561h;
                if (i10 == 0) {
                    C2238l.m8975b(obj);
                    C3780a c3780a = C3780a.f13612a;
                    this.f12561h = 1;
                    obj = c3780a.m14383c(this);
                    if (obj == m12581c) {
                        return m12581c;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C2238l.m8975b(obj);
                }
                Collection<InterfaceC3781b> values = ((Map) obj).values();
                String str = this.f12562i;
                for (InterfaceC3781b interfaceC3781b : values) {
                    interfaceC3781b.mo6875a(new InterfaceC3781b.b(str));
                    Log.d("SessionLifecycleClient", "Notified " + interfaceC3781b.mo6877c() + " of new session " + str);
                }
                return C2245s.f8873a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3284g interfaceC3284g) {
            super(Looper.getMainLooper());
            C4753m.m18653f(interfaceC3284g, "backgroundDispatcher");
            this.f12560a = interfaceC3284g;
        }

        /* renamed from: a */
        public final void m13266a(String str) {
            Log.d("SessionLifecycleClient", "Session update received: " + str);
            C1063k.m4457d(C1089q0.m4557a(this.f12560a), null, null, new C6194a(str, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str;
            C4753m.m18653f(message, "msg");
            if (message.what == 3) {
                Bundle data = message.getData();
                if (data == null || (str = data.getString("SessionUpdateExtra")) == null) {
                    str = "";
                }
                m13266a(str);
                return;
            }
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + message);
            super.handleMessage(message);
        }
    }

    /* renamed from: m9.f0$b */
    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C4747g c4747g) {
            this();
        }
    }

    @InterfaceC3472f(m12916c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", m12917f = "SessionLifecycleClient.kt", m12918l = {151}, m12919m = "invokeSuspend")
    /* renamed from: m9.f0$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC3478l implements InterfaceC4584p<InterfaceC1085p0, InterfaceC3281d<? super C2245s>, Object> {

        /* renamed from: h */
        public int f12563h;

        /* renamed from: j */
        public final /* synthetic */ List<Message> f12565j;

        /* renamed from: m9.f0$c$a */
        /* loaded from: classes.dex */
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return C2704a.m11031a(Long.valueOf(((Message) t10).getWhen()), Long.valueOf(((Message) t11).getWhen()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<Message> list, InterfaceC3281d<? super c> interfaceC3281d) {
            super(2, interfaceC3281d);
            this.f12565j = list;
        }

        @Override // p173ld.AbstractC3467a
        public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
            return new c(this.f12565j, interfaceC3281d);
        }

        @Override // sd.InterfaceC4584p
        public final Object invoke(InterfaceC1085p0 interfaceC1085p0, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            return ((c) create(interfaceC1085p0, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            String str;
            Object m12581c = C3385c.m12581c();
            int i10 = this.f12563h;
            if (i10 == 0) {
                C2238l.m8975b(obj);
                C3780a c3780a = C3780a.f13612a;
                this.f12563h = 1;
                obj = c3780a.m14383c(this);
                if (obj == m12581c) {
                    return m12581c;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2238l.m8975b(obj);
            }
            Map map = (Map) obj;
            if (map.isEmpty()) {
                str = "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.";
            } else {
                Collection values = map.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((InterfaceC3781b) it.next()).mo6876b()) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                if (!z10) {
                    List m10003F = C2510v.m10003F(C2510v.m10016o(C2502n.m9992h(C3566f0.this.m13261l(this.f12565j, 2), C3566f0.this.m13261l(this.f12565j, 1))), new a());
                    C3566f0 c3566f0 = C3566f0.this;
                    Iterator it2 = m10003F.iterator();
                    while (it2.hasNext()) {
                        c3566f0.m13265p((Message) it2.next());
                    }
                    return C2245s.f8873a;
                }
                str = "Data Collection is disabled for all subscribers. Skipping this Event";
            }
            Log.d("SessionLifecycleClient", str);
            return C2245s.f8873a;
        }
    }

    /* renamed from: m9.f0$d */
    /* loaded from: classes.dex */
    public static final class d implements ServiceConnection {
        public d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("SessionLifecycleClient", "Connected to SessionLifecycleService. Queue size " + C3566f0.this.f12558d.size());
            C3566f0.this.f12556b = new Messenger(iBinder);
            C3566f0.this.f12557c = true;
            C3566f0 c3566f0 = C3566f0.this;
            c3566f0.m13264o(c3566f0.m13259j());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
            C3566f0.this.f12556b = null;
            C3566f0.this.f12557c = false;
        }
    }

    public C3566f0(InterfaceC3284g interfaceC3284g) {
        C4753m.m18653f(interfaceC3284g, "backgroundDispatcher");
        this.f12555a = interfaceC3284g;
        this.f12558d = new LinkedBlockingDeque<>(20);
        this.f12559e = new d();
    }

    /* renamed from: h */
    public final void m13257h() {
        m13263n(2);
    }

    /* renamed from: i */
    public final void m13258i() {
        InterfaceC3568g0.f12569a.m13271a().mo13270a(new Messenger(new a(this.f12555a)), this.f12559e);
    }

    /* renamed from: j */
    public final List<Message> m13259j() {
        ArrayList arrayList = new ArrayList();
        this.f12558d.drainTo(arrayList);
        return arrayList;
    }

    /* renamed from: k */
    public final void m13260k() {
        m13263n(1);
    }

    /* renamed from: l */
    public final Message m13261l(List<Message> list, int i10) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i10) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    /* renamed from: m */
    public final void m13262m(Message message) {
        StringBuilder sb2;
        if (this.f12558d.offer(message)) {
            sb2 = new StringBuilder();
            sb2.append("Queued message ");
            sb2.append(message.what);
            sb2.append(". Queue size ");
            sb2.append(this.f12558d.size());
        } else {
            sb2 = new StringBuilder();
            sb2.append("Failed to enqueue message ");
            sb2.append(message.what);
            sb2.append(". Dropping.");
        }
        Log.d("SessionLifecycleClient", sb2.toString());
    }

    /* renamed from: n */
    public final void m13263n(int i10) {
        List<Message> m13259j = m13259j();
        Message obtain = Message.obtain(null, i10, 0, 0);
        C4753m.m18652e(obtain, "obtain(null, messageCode, 0, 0)");
        m13259j.add(obtain);
        m13264o(m13259j);
    }

    /* renamed from: o */
    public final InterfaceC1026c2 m13264o(List<Message> list) {
        InterfaceC1026c2 m4457d;
        m4457d = C1063k.m4457d(C1089q0.m4557a(this.f12555a), null, null, new c(list, null), 3, null);
        return m4457d;
    }

    /* renamed from: p */
    public final void m13265p(Message message) {
        if (this.f12556b != null) {
            try {
                Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                Messenger messenger = this.f12556b;
                if (messenger != null) {
                    messenger.send(message);
                    return;
                }
                return;
            } catch (RemoteException e10) {
                Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e10);
            }
        }
        m13262m(message);
    }
}
