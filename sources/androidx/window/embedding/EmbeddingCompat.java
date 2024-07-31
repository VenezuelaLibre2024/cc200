package androidx.window.embedding;

import android.util.Log;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.Set;
import td.C4747g;
import td.C4753m;

@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class EmbeddingCompat implements EmbeddingInterfaceCompat {
    public static final Companion Companion = new Companion(null);
    public static final boolean DEBUG = true;
    private static final String TAG = "EmbeddingCompat";
    private final EmbeddingAdapter adapter;
    private final ActivityEmbeddingComponent embeddingExtension;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C4747g c4747g) {
            this();
        }

        public final ActivityEmbeddingComponent embeddingComponent() {
            EmptyEmbeddingComponent emptyEmbeddingComponent;
            if (isEmbeddingAvailable()) {
                ActivityEmbeddingComponent activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
                if (activityEmbeddingComponent != null) {
                    return activityEmbeddingComponent;
                }
                emptyEmbeddingComponent = new EmptyEmbeddingComponent();
            } else {
                emptyEmbeddingComponent = new EmptyEmbeddingComponent();
            }
            return emptyEmbeddingComponent;
        }

        public final Integer getExtensionApiLevel() {
            String str;
            try {
                return Integer.valueOf(WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
            } catch (NoClassDefFoundError unused) {
                str = "Embedding extension version not found";
                Log.d(EmbeddingCompat.TAG, str);
                return null;
            } catch (UnsupportedOperationException unused2) {
                str = "Stub Extension";
                Log.d(EmbeddingCompat.TAG, str);
                return null;
            }
        }

        public final boolean isEmbeddingAvailable() {
            String str;
            try {
                return WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null;
            } catch (NoClassDefFoundError unused) {
                str = "Embedding extension version not found";
                Log.d(EmbeddingCompat.TAG, str);
                return false;
            } catch (UnsupportedOperationException unused2) {
                str = "Stub Extension";
                Log.d(EmbeddingCompat.TAG, str);
                return false;
            }
        }
    }

    public EmbeddingCompat() {
        this(Companion.embeddingComponent(), new EmbeddingAdapter());
    }

    public EmbeddingCompat(ActivityEmbeddingComponent activityEmbeddingComponent, EmbeddingAdapter embeddingAdapter) {
        C4753m.m18653f(activityEmbeddingComponent, "embeddingExtension");
        C4753m.m18653f(embeddingAdapter, "adapter");
        this.embeddingExtension = activityEmbeddingComponent;
        this.adapter = embeddingAdapter;
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setEmbeddingCallback(EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface) {
        C4753m.m18653f(embeddingCallbackInterface, "embeddingCallback");
        this.embeddingExtension.setSplitInfoCallback(new EmbeddingTranslatingCallback(embeddingCallbackInterface, this.adapter));
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setSplitRules(Set<? extends EmbeddingRule> set) {
        C4753m.m18653f(set, "rules");
        this.embeddingExtension.setEmbeddingRules(this.adapter.translate(set));
    }
}
