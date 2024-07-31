package p096g6;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: g6.i */
/* loaded from: classes.dex */
public interface InterfaceC2030i {
    /* renamed from: a */
    void mo8156a(String str, LifecycleCallback lifecycleCallback);

    /* renamed from: b */
    <T extends LifecycleCallback> T mo8157b(String str, Class<T> cls);

    /* renamed from: c */
    Activity mo8158c();

    void startActivityForResult(Intent intent, int i10);
}
