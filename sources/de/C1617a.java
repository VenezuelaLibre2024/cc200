package de;

import android.os.Looper;
import java.util.List;
import p038ce.AbstractC1079n2;
import p116he.InterfaceC2562z;

/* renamed from: de.a */
/* loaded from: classes2.dex */
public final class C1617a implements InterfaceC2562z {
    @Override // p116he.InterfaceC2562z
    /* renamed from: a */
    public String mo6470a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // p116he.InterfaceC2562z
    /* renamed from: b */
    public AbstractC1079n2 mo6471b(List<? extends InterfaceC2562z> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            throw new IllegalStateException("The main looper is not available");
        }
        return new C1620d(C1622f.m6478a(mainLooper, true), null, 2, 0 == true ? 1 : 0);
    }

    @Override // p116he.InterfaceC2562z
    /* renamed from: c */
    public int mo6472c() {
        return 1073741823;
    }
}
