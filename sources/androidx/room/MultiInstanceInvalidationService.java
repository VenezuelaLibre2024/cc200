package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.InterfaceC0390b;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: h */
    public int f1825h = 0;

    /* renamed from: i */
    public final HashMap<Integer, String> f1826i = new HashMap<>();

    /* renamed from: j */
    public final RemoteCallbackList<InterfaceC0389a> f1827j = new RemoteCallbackListC0387a();

    /* renamed from: k */
    public final InterfaceC0390b.a f1828k = new BinderC0388b();

    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    /* loaded from: classes.dex */
    public class RemoteCallbackListC0387a extends RemoteCallbackList<InterfaceC0389a> {
        public RemoteCallbackListC0387a() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(InterfaceC0389a interfaceC0389a, Object obj) {
            MultiInstanceInvalidationService.this.f1826i.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    /* loaded from: classes.dex */
    public class BinderC0388b extends InterfaceC0390b.a {
        public BinderC0388b() {
        }

        @Override // androidx.room.InterfaceC0390b
        /* renamed from: G1 */
        public void mo1960G1(InterfaceC0389a interfaceC0389a, int i10) {
            synchronized (MultiInstanceInvalidationService.this.f1827j) {
                MultiInstanceInvalidationService.this.f1827j.unregister(interfaceC0389a);
                MultiInstanceInvalidationService.this.f1826i.remove(Integer.valueOf(i10));
            }
        }

        @Override // androidx.room.InterfaceC0390b
        /* renamed from: S */
        public int mo1961S(InterfaceC0389a interfaceC0389a, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f1827j) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i10 = multiInstanceInvalidationService.f1825h + 1;
                multiInstanceInvalidationService.f1825h = i10;
                if (multiInstanceInvalidationService.f1827j.register(interfaceC0389a, Integer.valueOf(i10))) {
                    MultiInstanceInvalidationService.this.f1826i.put(Integer.valueOf(i10), str);
                    return i10;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f1825h--;
                return 0;
            }
        }

        @Override // androidx.room.InterfaceC0390b
        /* renamed from: w1 */
        public void mo1962w1(int i10, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f1827j) {
                String str = MultiInstanceInvalidationService.this.f1826i.get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f1827j.beginBroadcast();
                for (int i11 = 0; i11 < beginBroadcast; i11++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f1827j.getBroadcastCookie(i11)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f1826i.get(Integer.valueOf(intValue));
                        if (i10 != intValue && str.equals(str2)) {
                            try {
                                MultiInstanceInvalidationService.this.f1827j.getBroadcastItem(i11).mo1963x(strArr);
                            } catch (RemoteException e10) {
                                Log.w("ROOM", "Error invoking a remote callback", e10);
                            }
                        }
                    } finally {
                        MultiInstanceInvalidationService.this.f1827j.finishBroadcast();
                    }
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f1828k;
    }
}
