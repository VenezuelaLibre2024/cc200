package com.google.android.gms.internal.auth;

import p079f6.AbstractC1846f;
import p079f6.AbstractC1848h;
import p108h6.C2394s;
import p366z5.C5992b;
import p366z5.InterfaceC5991a;

/* loaded from: classes.dex */
public final class zzbt implements InterfaceC5991a {
    public final AbstractC1848h<Object> getSpatulaHeader(AbstractC1846f abstractC1846f) {
        C2394s.m9619l(abstractC1846f);
        return abstractC1846f.mo7589b(new zzbs(this, abstractC1846f));
    }

    public final AbstractC1848h<Object> performProxyRequest(AbstractC1846f abstractC1846f, C5992b c5992b) {
        C2394s.m9619l(abstractC1846f);
        C2394s.m9619l(c5992b);
        return abstractC1846f.mo7589b(new zzbq(this, abstractC1846f, c5992b));
    }
}
