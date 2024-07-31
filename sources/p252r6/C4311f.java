package p252r6;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: r6.f */
/* loaded from: classes.dex */
public final class C4311f implements InterfaceC4310e {

    /* renamed from: a */
    public final /* synthetic */ AbstractC4306a f15636a;

    public C4311f(AbstractC4306a abstractC4306a) {
        this.f15636a = abstractC4306a;
    }

    @Override // p252r6.InterfaceC4310e
    /* renamed from: a */
    public final void mo16573a(InterfaceC4308c interfaceC4308c) {
        LinkedList linkedList;
        LinkedList linkedList2;
        InterfaceC4308c interfaceC4308c2;
        this.f15636a.f15631a = interfaceC4308c;
        linkedList = this.f15636a.f15633c;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            InterfaceC4316k interfaceC4316k = (InterfaceC4316k) it.next();
            interfaceC4308c2 = this.f15636a.f15631a;
            interfaceC4316k.mo16575b(interfaceC4308c2);
        }
        linkedList2 = this.f15636a.f15633c;
        linkedList2.clear();
        this.f15636a.f15632b = null;
    }
}
