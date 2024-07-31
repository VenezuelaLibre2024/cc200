package com.google.gson.internal;

import java.util.Objects;

/* renamed from: com.google.gson.internal.a */
/* loaded from: classes.dex */
public final class C1309a {
    /* renamed from: a */
    public static void m5635a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static <T> T m5636b(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }
}
