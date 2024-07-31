package p255r9;

import java.util.Collections;
import java.util.Map;
import p195n7.C3767g;
import p240q9.C4217h;

/* renamed from: r9.c */
/* loaded from: classes.dex */
public class C4326c extends AbstractC4328e {
    public C4326c(C4217h c4217h, C3767g c3767g, long j10) {
        super(c4217h, c3767g);
        if (j10 != 0) {
            super.m16587G("Range", "bytes=" + j10 + "-");
        }
    }

    @Override // p255r9.AbstractC4328e
    /* renamed from: e */
    public String mo16577e() {
        return "GET";
    }

    @Override // p255r9.AbstractC4328e
    /* renamed from: l */
    public Map<String, String> mo16578l() {
        return Collections.singletonMap("alt", "media");
    }
}
