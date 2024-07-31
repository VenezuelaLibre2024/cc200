package p179m3;

import android.content.Context;
import android.os.Build;
import p191n3.AbstractC3710g;
import p191n3.C3704a;
import p191n3.C3708e;
import p191n3.InterfaceC3728y;
import p204o3.InterfaceC3848d;
import p234q3.InterfaceC4157a;

/* renamed from: m3.h */
/* loaded from: classes.dex */
public abstract class AbstractC3521h {
    /* renamed from: a */
    public static InterfaceC3728y m13074a(Context context, InterfaceC3848d interfaceC3848d, AbstractC3710g abstractC3710g, InterfaceC4157a interfaceC4157a) {
        return Build.VERSION.SDK_INT >= 21 ? new C3708e(context, interfaceC3848d, abstractC3710g) : new C3704a(context, interfaceC3848d, interfaceC4157a, abstractC3710g);
    }
}
