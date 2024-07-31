package p163l0;

import android.os.Build;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: l0.d */
/* loaded from: classes.dex */
public class C3402d {

    /* renamed from: l0.d$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static int m12695a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        /* renamed from: b */
        public static int m12696b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        /* renamed from: c */
        public static void m12697c(AccessibilityRecord accessibilityRecord, int i10) {
            accessibilityRecord.setMaxScrollX(i10);
        }

        /* renamed from: d */
        public static void m12698d(AccessibilityRecord accessibilityRecord, int i10) {
            accessibilityRecord.setMaxScrollY(i10);
        }
    }

    /* renamed from: a */
    public static void m12693a(AccessibilityRecord accessibilityRecord, int i10) {
        if (Build.VERSION.SDK_INT >= 15) {
            a.m12697c(accessibilityRecord, i10);
        }
    }

    /* renamed from: b */
    public static void m12694b(AccessibilityRecord accessibilityRecord, int i10) {
        if (Build.VERSION.SDK_INT >= 15) {
            a.m12698d(accessibilityRecord, i10);
        }
    }
}
