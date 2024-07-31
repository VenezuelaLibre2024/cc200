package io.flutter.util;

import p315w1.C5196a;

/* loaded from: classes2.dex */
public final class TraceSection {
    public static void begin(String str) {
        C5196a.m21035c(cropSectionName(str));
    }

    public static void beginAsyncSection(String str, int i10) {
        C5196a.m21033a(cropSectionName(str), i10);
    }

    private static String cropSectionName(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void end() {
        C5196a.m21038f();
    }

    public static void endAsyncSection(String str, int i10) {
        C5196a.m21036d(cropSectionName(str), i10);
    }
}
