package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.d */
/* loaded from: classes.dex */
public final class C1170d implements DynamiteModule.InterfaceC1166b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1166b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC1166b.b mo5006a(Context context, String str, DynamiteModule.InterfaceC1166b.a aVar) {
        DynamiteModule.InterfaceC1166b.b bVar = new DynamiteModule.InterfaceC1166b.b();
        int mo5007a = aVar.mo5007a(context, str, false);
        bVar.f4500b = mo5007a;
        bVar.f4501c = mo5007a != 0 ? 1 : 0;
        return bVar;
    }
}
