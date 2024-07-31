package androidx.window.layout;

import td.C4753m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class EmptyDecorator implements WindowInfoTrackerDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    @Override // androidx.window.layout.WindowInfoTrackerDecorator
    public WindowInfoTracker decorate(WindowInfoTracker windowInfoTracker) {
        C4753m.m18653f(windowInfoTracker, "tracker");
        return windowInfoTracker;
    }
}
