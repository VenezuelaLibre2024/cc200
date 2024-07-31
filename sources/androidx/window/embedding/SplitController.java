package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import androidx.window.core.ExperimentalWindowApi;
import gd.C2245s;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p115hd.C2494h0;
import p115hd.C2510v;
import p133j0.InterfaceC3202a;
import td.C4747g;
import td.C4753m;

@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class SplitController {
    private static volatile SplitController globalInstance = null;
    public static final boolean sDebug = false;
    private final EmbeddingBackend embeddingBackend;
    private Set<? extends EmbeddingRule> staticSplitRules;
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock globalLock = new ReentrantLock();

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C4747g c4747g) {
            this();
        }

        public final SplitController getInstance() {
            if (SplitController.globalInstance == null) {
                ReentrantLock reentrantLock = SplitController.globalLock;
                reentrantLock.lock();
                try {
                    if (SplitController.globalInstance == null) {
                        Companion companion = SplitController.Companion;
                        SplitController.globalInstance = new SplitController(null);
                    }
                    C2245s c2245s = C2245s.f8873a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            SplitController splitController = SplitController.globalInstance;
            C4753m.m18650c(splitController);
            return splitController;
        }

        public final void initialize(Context context, int i10) {
            C4753m.m18653f(context, "context");
            Set<EmbeddingRule> parseSplitRules$window_release = new SplitRuleParser().parseSplitRules$window_release(context, i10);
            SplitController companion = getInstance();
            if (parseSplitRules$window_release == null) {
                parseSplitRules$window_release = C2494h0.m9929b();
            }
            companion.setStaticSplitRules(parseSplitRules$window_release);
        }
    }

    private SplitController() {
        this.embeddingBackend = ExtensionEmbeddingBackend.Companion.getInstance();
        this.staticSplitRules = C2494h0.m9929b();
    }

    public /* synthetic */ SplitController(C4747g c4747g) {
        this();
    }

    public static final SplitController getInstance() {
        return Companion.getInstance();
    }

    public static final void initialize(Context context, int i10) {
        Companion.initialize(context, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStaticSplitRules(Set<? extends EmbeddingRule> set) {
        this.staticSplitRules = set;
        this.embeddingBackend.setSplitRules(set);
    }

    public final void addSplitListener(Activity activity, Executor executor, InterfaceC3202a<List<SplitInfo>> interfaceC3202a) {
        C4753m.m18653f(activity, "activity");
        C4753m.m18653f(executor, "executor");
        C4753m.m18653f(interfaceC3202a, "consumer");
        this.embeddingBackend.registerSplitListenerForActivity(activity, executor, interfaceC3202a);
    }

    public final void clearRegisteredRules() {
        this.embeddingBackend.setSplitRules(this.staticSplitRules);
    }

    public final Set<EmbeddingRule> getSplitRules() {
        return C2510v.m10012O(this.embeddingBackend.getSplitRules());
    }

    public final boolean isSplitSupported() {
        return this.embeddingBackend.isSplitSupported();
    }

    public final void registerRule(EmbeddingRule embeddingRule) {
        C4753m.m18653f(embeddingRule, "rule");
        this.embeddingBackend.registerRule(embeddingRule);
    }

    public final void removeSplitListener(InterfaceC3202a<List<SplitInfo>> interfaceC3202a) {
        C4753m.m18653f(interfaceC3202a, "consumer");
        this.embeddingBackend.unregisterSplitListenerForActivity(interfaceC3202a);
    }

    public final void unregisterRule(EmbeddingRule embeddingRule) {
        C4753m.m18653f(embeddingRule, "rule");
        this.embeddingBackend.unregisterRule(embeddingRule);
    }
}
