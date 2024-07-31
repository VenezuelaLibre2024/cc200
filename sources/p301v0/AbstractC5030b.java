package p301v0;

import p301v0.InterfaceC5079r0;

/* renamed from: v0.b */
/* loaded from: classes.dex */
public abstract class AbstractC5030b<MessageType extends InterfaceC5079r0> implements InterfaceC5099z0<MessageType> {

    /* renamed from: a */
    public static final C5072p f18867a = C5072p.m20419b();

    /* renamed from: c */
    public final MessageType m19806c(MessageType messagetype) {
        if (messagetype == null || messagetype.mo20527k()) {
            return messagetype;
        }
        throw m19807d(messagetype).m20373a().m19820i(messagetype);
    }

    /* renamed from: d */
    public final C5065m1 m19807d(MessageType messagetype) {
        return messagetype instanceof AbstractC5027a ? ((AbstractC5027a) messagetype).m19780o() : new C5065m1(messagetype);
    }

    @Override // p301v0.InterfaceC5099z0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType mo19805a(AbstractC5048h abstractC5048h, C5072p c5072p) {
        return m19806c(m19809f(abstractC5048h, c5072p));
    }

    /* renamed from: f */
    public MessageType m19809f(AbstractC5048h abstractC5048h, C5072p c5072p) {
        try {
            AbstractC5051i mo19963q = abstractC5048h.mo19963q();
            MessageType messagetype = (MessageType) mo20717b(mo19963q, c5072p);
            try {
                mo19963q.mo20000a(0);
                return messagetype;
            } catch (C5031b0 e10) {
                throw e10.m19820i(messagetype);
            }
        } catch (C5031b0 e11) {
            throw e11;
        }
    }
}
