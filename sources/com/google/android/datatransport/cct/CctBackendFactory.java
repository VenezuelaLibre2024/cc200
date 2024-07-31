package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import p061e3.C1648d;
import p105h3.AbstractC2293h;
import p105h3.InterfaceC2289d;
import p105h3.InterfaceC2298m;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements InterfaceC2289d {
    @Override // p105h3.InterfaceC2289d
    public InterfaceC2298m create(AbstractC2293h abstractC2293h) {
        return new C1648d(abstractC2293h.mo9301b(), abstractC2293h.mo9304e(), abstractC2293h.mo9303d());
    }
}
