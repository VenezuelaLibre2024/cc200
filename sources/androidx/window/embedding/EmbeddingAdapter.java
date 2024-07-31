package androidx.window.embedding;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import p115hd.C2503o;
import p115hd.C2510v;
import td.C4753m;

@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class EmbeddingAdapter {
    private final <F, S> F component1(Pair<F, S> pair) {
        C4753m.m18653f(pair, "<this>");
        return (F) pair.first;
    }

    private final <F, S> S component2(Pair<F, S> pair) {
        C4753m.m18653f(pair, "<this>");
        return (S) pair.second;
    }

    private final SplitInfo translate(androidx.window.extensions.embedding.SplitInfo splitInfo) {
        boolean z10;
        androidx.window.extensions.embedding.ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        C4753m.m18652e(primaryActivityStack, "splitInfo.primaryActivityStack");
        boolean z11 = false;
        try {
            z10 = primaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused) {
            z10 = false;
        }
        List activities = primaryActivityStack.getActivities();
        C4753m.m18652e(activities, "primaryActivityStack.activities");
        ActivityStack activityStack = new ActivityStack(activities, z10);
        androidx.window.extensions.embedding.ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        C4753m.m18652e(secondaryActivityStack, "splitInfo.secondaryActivityStack");
        try {
            z11 = secondaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused2) {
        }
        List activities2 = secondaryActivityStack.getActivities();
        C4753m.m18652e(activities2, "secondaryActivityStack.activities");
        return new SplitInfo(activityStack, new ActivityStack(activities2, z11), splitInfo.getSplitRatio());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: translateActivityIntentPredicates$lambda-3, reason: not valid java name */
    public static final boolean m24449translateActivityIntentPredicates$lambda3(EmbeddingAdapter embeddingAdapter, Set set, Pair pair) {
        C4753m.m18653f(embeddingAdapter, "this$0");
        C4753m.m18653f(set, "$splitPairFilters");
        C4753m.m18652e(pair, "(first, second)");
        Activity activity = (Activity) embeddingAdapter.component1(pair);
        Intent intent = (Intent) embeddingAdapter.component2(pair);
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((SplitPairFilter) it.next()).matchesActivityIntentPair(activity, intent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: translateActivityPairPredicates$lambda-1, reason: not valid java name */
    public static final boolean m24450translateActivityPairPredicates$lambda1(EmbeddingAdapter embeddingAdapter, Set set, Pair pair) {
        C4753m.m18653f(embeddingAdapter, "this$0");
        C4753m.m18653f(set, "$splitPairFilters");
        C4753m.m18652e(pair, "(first, second)");
        Activity activity = (Activity) embeddingAdapter.component1(pair);
        Activity activity2 = (Activity) embeddingAdapter.component2(pair);
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((SplitPairFilter) it.next()).matchesActivityPair(activity, activity2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: translateActivityPredicates$lambda-6, reason: not valid java name */
    public static final boolean m24451translateActivityPredicates$lambda6(Set set, Activity activity) {
        C4753m.m18653f(set, "$activityFilters");
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ActivityFilter activityFilter = (ActivityFilter) it.next();
            C4753m.m18652e(activity, "activity");
            if (activityFilter.matchesActivity(activity)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: translateIntentPredicates$lambda-8, reason: not valid java name */
    public static final boolean m24452translateIntentPredicates$lambda8(Set set, Intent intent) {
        C4753m.m18653f(set, "$activityFilters");
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ActivityFilter activityFilter = (ActivityFilter) it.next();
            C4753m.m18652e(intent, "intent");
            if (activityFilter.matchesIntent(intent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: translateParentMetricsPredicate$lambda-4, reason: not valid java name */
    public static final boolean m24453translateParentMetricsPredicate$lambda4(SplitRule splitRule, WindowMetrics windowMetrics) {
        C4753m.m18653f(splitRule, "$splitRule");
        C4753m.m18652e(windowMetrics, "windowMetrics");
        return splitRule.checkParentMetrics(windowMetrics);
    }

    public final List<SplitInfo> translate(List<? extends androidx.window.extensions.embedding.SplitInfo> list) {
        C4753m.m18653f(list, "splitInfoList");
        ArrayList arrayList = new ArrayList(C2503o.m9995k(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(translate((androidx.window.extensions.embedding.SplitInfo) it.next()));
        }
        return arrayList;
    }

    public final Set<androidx.window.extensions.embedding.EmbeddingRule> translate(Set<? extends EmbeddingRule> set) {
        androidx.window.extensions.embedding.SplitPairRule build;
        String str;
        C4753m.m18653f(set, "rules");
        ArrayList arrayList = new ArrayList(C2503o.m9995k(set, 10));
        for (EmbeddingRule embeddingRule : set) {
            if (embeddingRule instanceof SplitPairRule) {
                SplitPairRule splitPairRule = (SplitPairRule) embeddingRule;
                build = new SplitPairRule.Builder(translateActivityPairPredicates(splitPairRule.getFilters()), translateActivityIntentPredicates(splitPairRule.getFilters()), translateParentMetricsPredicate((SplitRule) embeddingRule)).setSplitRatio(splitPairRule.getSplitRatio()).setLayoutDirection(splitPairRule.getLayoutDirection()).setShouldFinishPrimaryWithSecondary(splitPairRule.getFinishPrimaryWithSecondary()).setShouldFinishSecondaryWithPrimary(splitPairRule.getFinishSecondaryWithPrimary()).setShouldClearTop(splitPairRule.getClearTop()).build();
                str = "SplitPairRuleBuilder(\n  …                 .build()";
            } else if (embeddingRule instanceof SplitPlaceholderRule) {
                SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) embeddingRule;
                build = new SplitPlaceholderRule.Builder(splitPlaceholderRule.getPlaceholderIntent(), translateActivityPredicates(splitPlaceholderRule.getFilters()), translateIntentPredicates(splitPlaceholderRule.getFilters()), translateParentMetricsPredicate((SplitRule) embeddingRule)).setSplitRatio(splitPlaceholderRule.getSplitRatio()).setLayoutDirection(splitPlaceholderRule.getLayoutDirection()).build();
                str = "SplitPlaceholderRuleBuil…                 .build()";
            } else {
                if (!(embeddingRule instanceof ActivityRule)) {
                    throw new IllegalArgumentException("Unsupported rule type");
                }
                ActivityRule activityRule = (ActivityRule) embeddingRule;
                build = new ActivityRule.Builder(translateActivityPredicates(activityRule.getFilters()), translateIntentPredicates(activityRule.getFilters())).setShouldAlwaysExpand(activityRule.getAlwaysExpand()).build();
                str = "ActivityRuleBuilder(\n   …                 .build()";
            }
            C4753m.m18652e(build, str);
            arrayList.add((androidx.window.extensions.embedding.EmbeddingRule) build);
        }
        return C2510v.m10012O(arrayList);
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Pair<Activity, Intent>> translateActivityIntentPredicates(final Set<SplitPairFilter> set) {
        C4753m.m18653f(set, "splitPairFilters");
        return new Predicate() { // from class: androidx.window.embedding.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m24449translateActivityIntentPredicates$lambda3;
                m24449translateActivityIntentPredicates$lambda3 = EmbeddingAdapter.m24449translateActivityIntentPredicates$lambda3(EmbeddingAdapter.this, set, (Pair) obj);
                return m24449translateActivityIntentPredicates$lambda3;
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Pair<Activity, Activity>> translateActivityPairPredicates(final Set<SplitPairFilter> set) {
        C4753m.m18653f(set, "splitPairFilters");
        return new Predicate() { // from class: androidx.window.embedding.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m24450translateActivityPairPredicates$lambda1;
                m24450translateActivityPairPredicates$lambda1 = EmbeddingAdapter.m24450translateActivityPairPredicates$lambda1(EmbeddingAdapter.this, set, (Pair) obj);
                return m24450translateActivityPairPredicates$lambda1;
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Activity> translateActivityPredicates(final Set<ActivityFilter> set) {
        C4753m.m18653f(set, "activityFilters");
        return new Predicate() { // from class: androidx.window.embedding.d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m24451translateActivityPredicates$lambda6;
                m24451translateActivityPredicates$lambda6 = EmbeddingAdapter.m24451translateActivityPredicates$lambda6(set, (Activity) obj);
                return m24451translateActivityPredicates$lambda6;
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Intent> translateIntentPredicates(final Set<ActivityFilter> set) {
        C4753m.m18653f(set, "activityFilters");
        return new Predicate() { // from class: androidx.window.embedding.e
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m24452translateIntentPredicates$lambda8;
                m24452translateIntentPredicates$lambda8 = EmbeddingAdapter.m24452translateIntentPredicates$lambda8(set, (Intent) obj);
                return m24452translateIntentPredicates$lambda8;
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<WindowMetrics> translateParentMetricsPredicate(final SplitRule splitRule) {
        C4753m.m18653f(splitRule, "splitRule");
        return new Predicate() { // from class: androidx.window.embedding.c
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m24453translateParentMetricsPredicate$lambda4;
                m24453translateParentMetricsPredicate$lambda4 = EmbeddingAdapter.m24453translateParentMetricsPredicate$lambda4(SplitRule.this, (WindowMetrics) obj);
                return m24453translateParentMetricsPredicate$lambda4;
            }
        };
    }
}
