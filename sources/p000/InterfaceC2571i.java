package p000;

import gd.C2234h;
import gd.InterfaceC2233g;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.util.List;
import p000.InterfaceC2571i;
import p115hd.C2501m;
import sd.InterfaceC4569a;
import td.AbstractC4754n;
import td.C4753m;

/* renamed from: i */
/* loaded from: classes.dex */
public interface InterfaceC2571i {

    /* renamed from: a */
    public static final a f10086a = a.f10087a;

    /* renamed from: i$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f10087a = new a();

        /* renamed from: b */
        public static final InterfaceC2233g<C3197j> f10088b = C2234h.m8960a(C6184a.f10089h);

        /* renamed from: i$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C6184a extends AbstractC4754n implements InterfaceC4569a<C3197j> {

            /* renamed from: h */
            public static final C6184a f10089h = new C6184a();

            public C6184a() {
                super(0);
            }

            @Override // sd.InterfaceC4569a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3197j invoke() {
                return C3197j.f11028a;
            }
        }

        /* renamed from: e */
        public static final void m10273e(InterfaceC2571i interfaceC2571i, Object obj, BasicMessageChannel.Reply reply) {
            List m6507b;
            C4753m.m18653f(reply, "reply");
            C4753m.m18651d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            C4753m.m18651d(obj2, "null cannot be cast to non-null type <root>.ToggleMessage");
            try {
                interfaceC2571i.mo399a((C1792f) obj2);
                m6507b = C2501m.m9986b(null);
            } catch (Throwable th) {
                m6507b = C1633e.m6507b(th);
            }
            reply.reply(m6507b);
        }

        /* renamed from: f */
        public static final void m10274f(InterfaceC2571i interfaceC2571i, Object obj, BasicMessageChannel.Reply reply) {
            List m6507b;
            C4753m.m18653f(reply, "reply");
            try {
                m6507b = C2501m.m9986b(interfaceC2571i.isEnabled());
            } catch (Throwable th) {
                m6507b = C1633e.m6507b(th);
            }
            reply.reply(m6507b);
        }

        /* renamed from: c */
        public final MessageCodec<Object> m10275c() {
            return f10088b.getValue();
        }

        /* renamed from: d */
        public final void m10276d(BinaryMessenger binaryMessenger, final InterfaceC2571i interfaceC2571i) {
            C4753m.m18653f(binaryMessenger, "binaryMessenger");
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WakelockPlusApi.toggle", m10275c());
            if (interfaceC2571i != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: h
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        InterfaceC2571i.a.m10273e(InterfaceC2571i.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WakelockPlusApi.isEnabled", m10275c());
            if (interfaceC2571i != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: g
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        InterfaceC2571i.a.m10274f(InterfaceC2571i.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }
    }

    /* renamed from: a */
    void mo399a(C1792f c1792f);

    C0433b isEnabled();
}
