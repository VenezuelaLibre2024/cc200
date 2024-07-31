package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.lifecycle.AbstractC0344f;

@Keep
/* loaded from: classes2.dex */
public class HiddenLifecycleReference {
    private final AbstractC0344f lifecycle;

    public HiddenLifecycleReference(AbstractC0344f abstractC0344f) {
        this.lifecycle = abstractC0344f;
    }

    public AbstractC0344f getLifecycle() {
        return this.lifecycle;
    }
}
