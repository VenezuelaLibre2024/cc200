package p116he;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import sd.InterfaceC4580l;

/* renamed from: he.v0 */
/* loaded from: classes2.dex */
public final class C2558v0 extends AbstractC2533j {

    /* renamed from: a */
    public static final C2558v0 f10017a = new C2558v0();

    /* renamed from: b */
    public static final ReentrantReadWriteLock f10018b = new ReentrantReadWriteLock();

    /* renamed from: c */
    public static final WeakHashMap<Class<? extends Throwable>, InterfaceC4580l<Throwable, Throwable>> f10019c = new WeakHashMap<>();

    @Override // p116he.AbstractC2533j
    /* renamed from: a */
    public InterfaceC4580l<Throwable, Throwable> mo10053a(Class<? extends Throwable> cls) {
        InterfaceC4580l<Throwable, Throwable> m10123b;
        ReentrantReadWriteLock reentrantReadWriteLock = f10018b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            InterfaceC4580l<Throwable, Throwable> interfaceC4580l = f10019c.get(cls);
            if (interfaceC4580l != null) {
                return interfaceC4580l;
            }
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i10 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i11 = 0; i11 < readHoldCount; i11++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, InterfaceC4580l<Throwable, Throwable>> weakHashMap = f10019c;
                InterfaceC4580l<Throwable, Throwable> interfaceC4580l2 = weakHashMap.get(cls);
                if (interfaceC4580l2 != null) {
                    return interfaceC4580l2;
                }
                m10123b = C2543o.m10123b(cls);
                weakHashMap.put(cls, m10123b);
                while (i10 < readHoldCount) {
                    readLock2.lock();
                    i10++;
                }
                writeLock.unlock();
                return m10123b;
            } finally {
                while (i10 < readHoldCount) {
                    readLock2.lock();
                    i10++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}
