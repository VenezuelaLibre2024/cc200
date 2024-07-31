package com.pichillilorenzo.flutter_inappwebview.in_app_browser;

import android.app.Activity;
import java.util.List;

/* loaded from: classes.dex */
public interface InAppBrowserDelegate {
    void didChangeProgress(int i10);

    void didChangeTitle(String str);

    void didFailNavigation(String str, int i10, String str2);

    void didFinishNavigation(String str);

    void didStartNavigation(String str);

    void didUpdateVisitedHistory(String str);

    Activity getActivity();

    List<ActivityResultListener> getActivityResultListeners();
}
