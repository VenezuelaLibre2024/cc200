package io.flutter.embedding.engine.plugins.service;

import android.app.Service;
import androidx.lifecycle.AbstractC0344f;

/* loaded from: classes2.dex */
public interface ServiceControlSurface {
    void attachToService(Service service, AbstractC0344f abstractC0344f, boolean z10);

    void detachFromService();

    void onMoveToBackground();

    void onMoveToForeground();
}
