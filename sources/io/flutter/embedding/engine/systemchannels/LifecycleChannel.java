package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.StringCodec;
import java.util.Locale;

/* loaded from: classes2.dex */
public class LifecycleChannel {
    private static final String CHANNEL_NAME = "flutter/lifecycle";
    private static final String TAG = "LifecycleChannel";
    private final BasicMessageChannel<String> channel;
    private AppLifecycleState lastAndroidState;
    private AppLifecycleState lastFlutterState;
    private boolean lastFocus;

    /* renamed from: io.flutter.embedding.engine.systemchannels.LifecycleChannel$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C27571 {

        /* renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$LifecycleChannel$AppLifecycleState */
        public static final /* synthetic */ int[] f10623xddedd993;

        static {
            int[] iArr = new int[AppLifecycleState.values().length];
            f10623xddedd993 = iArr;
            try {
                iArr[AppLifecycleState.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10623xddedd993[AppLifecycleState.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10623xddedd993[AppLifecycleState.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10623xddedd993[AppLifecycleState.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10623xddedd993[AppLifecycleState.DETACHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum AppLifecycleState {
        DETACHED,
        RESUMED,
        INACTIVE,
        HIDDEN,
        PAUSED
    }

    public LifecycleChannel(DartExecutor dartExecutor) {
        this((BasicMessageChannel<String>) new BasicMessageChannel(dartExecutor, CHANNEL_NAME, StringCodec.INSTANCE));
    }

    public LifecycleChannel(BasicMessageChannel<String> basicMessageChannel) {
        this.lastAndroidState = null;
        this.lastFlutterState = null;
        this.lastFocus = true;
        this.channel = basicMessageChannel;
    }

    private void sendState(AppLifecycleState appLifecycleState, boolean z10) {
        AppLifecycleState appLifecycleState2 = this.lastAndroidState;
        if (appLifecycleState2 == appLifecycleState && z10 == this.lastFocus) {
            return;
        }
        if (appLifecycleState == null && appLifecycleState2 == null) {
            this.lastFocus = z10;
            return;
        }
        AppLifecycleState appLifecycleState3 = null;
        int i10 = C27571.f10623xddedd993[appLifecycleState.ordinal()];
        if (i10 == 1) {
            appLifecycleState3 = z10 ? AppLifecycleState.RESUMED : AppLifecycleState.INACTIVE;
        } else if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
            appLifecycleState3 = appLifecycleState;
        }
        this.lastAndroidState = appLifecycleState;
        this.lastFocus = z10;
        if (appLifecycleState3 == this.lastFlutterState) {
            return;
        }
        String str = "AppLifecycleState." + appLifecycleState3.name().toLowerCase(Locale.ROOT);
        Log.m11045v(TAG, "Sending " + str + " message.");
        this.channel.send(str);
        this.lastFlutterState = appLifecycleState3;
    }

    public void aWindowIsFocused() {
        sendState(this.lastAndroidState, true);
    }

    public void appIsDetached() {
        sendState(AppLifecycleState.DETACHED, this.lastFocus);
    }

    public void appIsInactive() {
        sendState(AppLifecycleState.INACTIVE, this.lastFocus);
    }

    public void appIsPaused() {
        sendState(AppLifecycleState.PAUSED, this.lastFocus);
    }

    public void appIsResumed() {
        sendState(AppLifecycleState.RESUMED, this.lastFocus);
    }

    public void noWindowsAreFocused() {
        sendState(this.lastAndroidState, false);
    }
}
