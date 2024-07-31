package ba;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p012aa.InterfaceC0081b;

/* renamed from: ba.a */
/* loaded from: classes.dex */
public abstract class AbstractC0524a<T extends InterfaceC0081b> implements InterfaceC0525b<T> {

    /* renamed from: a */
    public final ReadWriteLock f2347a = new ReentrantReadWriteLock();

    @Override // ba.InterfaceC0525b
    /* renamed from: e */
    public void mo2544e() {
        this.f2347a.writeLock().unlock();
    }

    @Override // ba.InterfaceC0525b
    /* renamed from: f */
    public void mo2545f() {
        this.f2347a.writeLock().lock();
    }
}
