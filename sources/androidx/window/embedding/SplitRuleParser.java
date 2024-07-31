package androidx.window.embedding;

import ae.C0109o;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.window.C0400R;
import androidx.window.core.ExperimentalWindowApi;
import java.util.Set;
import p115hd.C2494h0;
import td.C4753m;

@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class SplitRuleParser {
    private final ComponentName buildClassName(String str, CharSequence charSequence) {
        if (charSequence != null) {
            if (!(charSequence.length() == 0)) {
                String obj = charSequence.toString();
                if (obj.charAt(0) == '.') {
                    return new ComponentName(str, C4753m.m18660m(str, obj));
                }
                int m437D = C0109o.m437D(obj, '/', 0, false, 6, null);
                if (m437D > 0) {
                    str = obj.substring(0, m437D);
                    C4753m.m18652e(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    obj = obj.substring(m437D + 1);
                    C4753m.m18652e(obj, "(this as java.lang.String).substring(startIndex)");
                }
                if (C4753m.m18648a(obj, "*") || C0109o.m437D(obj, '.', 0, false, 6, null) >= 0) {
                    return new ComponentName(str, obj);
                }
                return new ComponentName(str, str + '.' + obj);
            }
        }
        throw new IllegalArgumentException("Activity name must not be null");
    }

    private final ActivityFilter parseActivityFilter(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C0400R.styleable.ActivityFilter, 0, 0);
        String string = obtainStyledAttributes.getString(C0400R.styleable.ActivityFilter_activityName);
        String string2 = obtainStyledAttributes.getString(C0400R.styleable.ActivityFilter_activityAction);
        String packageName = context.getApplicationContext().getPackageName();
        C4753m.m18652e(packageName, "packageName");
        return new ActivityFilter(buildClassName(packageName, string), string2);
    }

    private final ActivityRule parseSplitActivityRule(Context context, XmlResourceParser xmlResourceParser) {
        return new ActivityRule(C2494h0.m9929b(), context.getTheme().obtainStyledAttributes(xmlResourceParser, C0400R.styleable.ActivityRule, 0, 0).getBoolean(C0400R.styleable.ActivityRule_alwaysExpand, false));
    }

    private final SplitPairFilter parseSplitPairFilter(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C0400R.styleable.SplitPairFilter, 0, 0);
        String string = obtainStyledAttributes.getString(C0400R.styleable.SplitPairFilter_primaryActivityName);
        String string2 = obtainStyledAttributes.getString(C0400R.styleable.SplitPairFilter_secondaryActivityName);
        String string3 = obtainStyledAttributes.getString(C0400R.styleable.SplitPairFilter_secondaryActivityAction);
        String packageName = context.getApplicationContext().getPackageName();
        C4753m.m18652e(packageName, "packageName");
        return new SplitPairFilter(buildClassName(packageName, string), buildClassName(packageName, string2), string3);
    }

    private final SplitPairRule parseSplitPairRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C0400R.styleable.SplitPairRule, 0, 0);
        float f10 = obtainStyledAttributes.getFloat(C0400R.styleable.SplitPairRule_splitRatio, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(C0400R.styleable.SplitPairRule_splitMinWidth, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(C0400R.styleable.SplitPairRule_splitMinSmallestWidth, 0.0f);
        int i10 = obtainStyledAttributes.getInt(C0400R.styleable.SplitPairRule_splitLayoutDirection, 3);
        return new SplitPairRule(C2494h0.m9929b(), obtainStyledAttributes.getBoolean(C0400R.styleable.SplitPairRule_finishPrimaryWithSecondary, false), obtainStyledAttributes.getBoolean(C0400R.styleable.SplitPairRule_finishSecondaryWithPrimary, true), obtainStyledAttributes.getBoolean(C0400R.styleable.SplitPairRule_clearTop, false), dimension, dimension2, f10, i10);
    }

    private final SplitPlaceholderRule parseSplitPlaceholderRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C0400R.styleable.SplitPlaceholderRule, 0, 0);
        String string = obtainStyledAttributes.getString(C0400R.styleable.SplitPlaceholderRule_placeholderActivityName);
        float f10 = obtainStyledAttributes.getFloat(C0400R.styleable.SplitPlaceholderRule_splitRatio, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(C0400R.styleable.SplitPlaceholderRule_splitMinWidth, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(C0400R.styleable.SplitPlaceholderRule_splitMinSmallestWidth, 0.0f);
        int i10 = obtainStyledAttributes.getInt(C0400R.styleable.SplitPlaceholderRule_splitLayoutDirection, 3);
        String packageName = context.getApplicationContext().getPackageName();
        C4753m.m18652e(packageName, "packageName");
        ComponentName buildClassName = buildClassName(packageName, string);
        Set m9929b = C2494h0.m9929b();
        Intent component = new Intent().setComponent(buildClassName);
        C4753m.m18652e(component, "Intent().setComponent(pl…eholderActivityClassName)");
        return new SplitPlaceholderRule(m9929b, component, dimension, dimension2, f10, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e5, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0049. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.Set<androidx.window.embedding.EmbeddingRule> parseSplitXml(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.SplitRuleParser.parseSplitXml(android.content.Context, int):java.util.Set");
    }

    public final Set<EmbeddingRule> parseSplitRules$window_release(Context context, int i10) {
        C4753m.m18653f(context, "context");
        return parseSplitXml(context, i10);
    }
}
