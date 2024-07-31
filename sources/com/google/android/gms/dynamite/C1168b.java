package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.b */
/* loaded from: classes.dex */
public final class C1168b implements DynamiteModule.InterfaceC1166b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1166b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC1166b.b mo5006a(Context context, String str, DynamiteModule.InterfaceC1166b.a aVar) {
        DynamiteModule.InterfaceC1166b.b bVar = new DynamiteModule.InterfaceC1166b.b();
        int mo5007a = aVar.mo5007a(context, str, true);
        bVar.f4500b = mo5007a;
        if (mo5007a != 0) {
            bVar.f4501c = 1;
        } else {
            int mo5008b = aVar.mo5008b(context, str);
            bVar.f4499a = mo5008b;
            if (mo5008b != 0) {
                bVar.f4501c = -1;
            }
        }
        return bVar;
    }
}
