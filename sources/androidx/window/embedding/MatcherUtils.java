package androidx.window.embedding;

import ae.C0108n;
import ae.C0109o;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import td.C4753m;

@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class MatcherUtils {
    public static final MatcherUtils INSTANCE = new MatcherUtils();
    public static final boolean sDebugMatchers = false;
    public static final String sMatchersTag = "SplitRuleResolution";

    private MatcherUtils() {
    }

    private final boolean wildcardMatch(String str, String str2) {
        if (!C0109o.m482v(str2, "*", false, 2, null)) {
            return false;
        }
        if (C4753m.m18648a(str2, "*")) {
            return true;
        }
        if (!(C0109o.m438E(str2, "*", 0, false, 6, null) == C0109o.m443J(str2, "*", 0, false, 6, null) && C0108n.m426l(str2, "*", false, 2, null))) {
            throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
        }
        String substring = str2.substring(0, str2.length() - 1);
        C4753m.m18652e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return C0108n.m433s(str, substring, false, 2, null);
    }

    public final boolean areActivityOrIntentComponentsMatching$window_release(Activity activity, ComponentName componentName) {
        ComponentName component;
        C4753m.m18653f(activity, "activity");
        C4753m.m18653f(componentName, "ruleComponent");
        if (areComponentsMatching$window_release(activity.getComponentName(), componentName)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return INSTANCE.areComponentsMatching$window_release(component, componentName);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean areComponentsMatching$window_release(android.content.ComponentName r7, android.content.ComponentName r8) {
        /*
            r6 = this;
            java.lang.String r0 = "ruleComponent"
            td.C4753m.m18653f(r8, r0)
            java.lang.String r0 = "*"
            r1 = 1
            r2 = 0
            if (r7 != 0) goto L22
            java.lang.String r7 = r8.getPackageName()
            boolean r7 = td.C4753m.m18648a(r7, r0)
            if (r7 == 0) goto L20
            java.lang.String r7 = r8.getClassName()
            boolean r7 = td.C4753m.m18648a(r7, r0)
            if (r7 == 0) goto L20
            goto L21
        L20:
            r1 = r2
        L21:
            return r1
        L22:
            java.lang.String r3 = r7.toString()
            java.lang.String r4 = "activityComponent.toString()"
            td.C4753m.m18652e(r3, r4)
            r4 = 2
            r5 = 0
            boolean r0 = ae.C0109o.m482v(r3, r0, r2, r4, r5)
            r0 = r0 ^ r1
            if (r0 == 0) goto L8f
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = r8.getPackageName()
            boolean r0 = td.C4753m.m18648a(r0, r3)
            if (r0 != 0) goto L5d
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = "activityComponent.packageName"
            td.C4753m.m18652e(r0, r3)
            java.lang.String r3 = r8.getPackageName()
            java.lang.String r4 = "ruleComponent.packageName"
            td.C4753m.m18652e(r3, r4)
            boolean r0 = r6.wildcardMatch(r0, r3)
            if (r0 == 0) goto L5b
            goto L5d
        L5b:
            r0 = r2
            goto L5e
        L5d:
            r0 = r1
        L5e:
            java.lang.String r3 = r7.getClassName()
            java.lang.String r4 = r8.getClassName()
            boolean r3 = td.C4753m.m18648a(r3, r4)
            if (r3 != 0) goto L87
            java.lang.String r7 = r7.getClassName()
            java.lang.String r3 = "activityComponent.className"
            td.C4753m.m18652e(r7, r3)
            java.lang.String r8 = r8.getClassName()
            java.lang.String r3 = "ruleComponent.className"
            td.C4753m.m18652e(r8, r3)
            boolean r7 = r6.wildcardMatch(r7, r8)
            if (r7 == 0) goto L85
            goto L87
        L85:
            r7 = r2
            goto L88
        L87:
            r7 = r1
        L88:
            if (r0 == 0) goto L8d
            if (r7 == 0) goto L8d
            goto L8e
        L8d:
            r1 = r2
        L8e:
            return r1
        L8f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Wildcard can only be part of the rule."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.MatcherUtils.areComponentsMatching$window_release(android.content.ComponentName, android.content.ComponentName):boolean");
    }
}
