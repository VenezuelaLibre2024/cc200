package androidx.window.layout;

import sd.InterfaceC4580l;
import td.C4751k;
import td.C4753m;

/* loaded from: classes.dex */
public /* synthetic */ class WindowMetricsCalculator$Companion$overrideDecorator$1 extends C4751k implements InterfaceC4580l<WindowMetricsCalculator, WindowMetricsCalculator> {
    public WindowMetricsCalculator$Companion$overrideDecorator$1(Object obj) {
        super(1, obj, WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
    }

    @Override // sd.InterfaceC4580l
    public final WindowMetricsCalculator invoke(WindowMetricsCalculator windowMetricsCalculator) {
        C4753m.m18653f(windowMetricsCalculator, "p0");
        return ((WindowMetricsCalculatorDecorator) this.receiver).decorate(windowMetricsCalculator);
    }
}
