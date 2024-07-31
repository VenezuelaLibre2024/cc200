package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.g */
/* loaded from: classes.dex */
public final class C1173g implements DynamiteModule.InterfaceC1166b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1166b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC1166b.b mo5006a(Context context, String str, DynamiteModule.InterfaceC1166b.a aVar) {
        DynamiteModule.InterfaceC1166b.b bVar = new DynamiteModule.InterfaceC1166b.b();
        bVar.f4499a = aVar.mo5008b(context, str);
        int i10 = 1;
        int mo5007a = aVar.mo5007a(context, str, true);
        bVar.f4500b = mo5007a;
        int i11 = bVar.f4499a;
        if (i11 == 0) {
            if (mo5007a == 0) {
                i10 = 0;
                bVar.f4501c = i10;
                return bVar;
            }
            i11 = 0;
        }
        if (mo5007a < i11) {
            i10 = -1;
        }
        bVar.f4501c = i10;
        return bVar;
    }
}
