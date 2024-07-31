package androidx.lifecycle;

import androidx.lifecycle.AbstractC0344f;
import androidx.lifecycle.C0336b;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements InterfaceC0350i {

    /* renamed from: h */
    public final Object f1671h;

    /* renamed from: i */
    public final C0336b.a f1672i;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1671h = obj;
        this.f1672i = C0336b.f1679c.m1776c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC0350i
    /* renamed from: a */
    public void mo571a(InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
        this.f1672i.m1780a(interfaceC0354k, aVar, this.f1671h);
    }
}
