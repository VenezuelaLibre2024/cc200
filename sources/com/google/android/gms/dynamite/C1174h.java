package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.h */
/* loaded from: classes.dex */
public final class C1174h implements DynamiteModule.InterfaceC1166b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1166b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC1166b.b mo5006a(Context context, String str, DynamiteModule.InterfaceC1166b.a aVar) {
        DynamiteModule.InterfaceC1166b.b bVar = new DynamiteModule.InterfaceC1166b.b();
        int mo5008b = aVar.mo5008b(context, str);
        bVar.f4499a = mo5008b;
        int i10 = 1;
        int i11 = 0;
        int mo5007a = mo5008b != 0 ? aVar.mo5007a(context, str, false) : aVar.mo5007a(context, str, true);
        bVar.f4500b = mo5007a;
        int i12 = bVar.f4499a;
        if (i12 != 0) {
            i11 = i12;
        } else if (mo5007a == 0) {
            i10 = 0;
            bVar.f4501c = i10;
            return bVar;
        }
        if (mo5007a < i11) {
            i10 = -1;
        }
        bVar.f4501c = i10;
        return bVar;
    }
}
