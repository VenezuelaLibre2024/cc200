package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.InterfaceC0161n;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient;
import io.flutter.Log;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import io.flutter.plugin.platform.PlatformPlugin;
import java.io.FileNotFoundException;
import java.util.List;
import p148k0.C3330m0;

/* loaded from: classes2.dex */
public class PlatformPlugin {
    public static final int DEFAULT_SYSTEM_UI = 1280;
    private static final String TAG = "PlatformPlugin";
    private final Activity activity;
    private PlatformChannel.SystemChromeStyle currentTheme;
    private int mEnabledOverlays;
    public final PlatformChannel.PlatformMessageHandler mPlatformMessageHandler;
    private final PlatformChannel platformChannel;
    private final PlatformPluginDelegate platformPluginDelegate;

    /* renamed from: io.flutter.plugin.platform.PlatformPlugin$1 */
    /* loaded from: classes2.dex */
    public class C27841 implements PlatformChannel.PlatformMessageHandler {
        public C27841() {
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
        public boolean clipboardHasStrings() {
            return PlatformPlugin.this.clipboardHasStrings();
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
        public CharSequence getClipboardData(PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
            return PlatformPlugin.this.getClipboardData(clipboardContentFormat);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
        public void playSystemSound(PlatformChannel.SoundType soundType) {
            PlatformPlugin.this.playSystemSound(soundType);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
        public void popSystemNavigator() {
            PlatformPlugin.this.popSystemNavigator();
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
        public void restoreSystemUiOverlays() {
            PlatformPlugin.this.restoreSystemChromeSystemUIOverlays();
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
        public void setApplicationSwitcherDescription(PlatformChannel.AppSwitcherDescription appSwitcherDescription) {
            PlatformPlugin.this.setSystemChromeApplicationSwitcherDescription(appSwitcherDescription);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
        public void setClipboardData(String str) {
            PlatformPlugin.this.setClipboardData(str);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
        public void setFrameworkHandlesBack(boolean z10) {
            PlatformPlugin.this.setFrameworkHandlesBack(z10);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
        public void setPreferredOrientations(int i10) {
            PlatformPlugin.this.setSystemChromePreferredOrientations(i10);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
        public void setSystemUiChangeListener() {
            PlatformPlugin.this.setSystemChromeChangeListener();
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
        public void setSystemUiOverlayStyle(PlatformChannel.SystemChromeStyle systemChromeStyle) {
            PlatformPlugin.this.setSystemChromeSystemUIOverlayStyle(systemChromeStyle);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
        public void showSystemOverlays(List<PlatformChannel.SystemUiOverlay> list) {
            PlatformPlugin.this.setSystemChromeEnabledSystemUIOverlays(list);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
        public void showSystemUiMode(PlatformChannel.SystemUiMode systemUiMode) {
            PlatformPlugin.this.setSystemChromeEnabledSystemUIMode(systemUiMode);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
        public void vibrateHapticFeedback(PlatformChannel.HapticFeedbackType hapticFeedbackType) {
            PlatformPlugin.this.vibrateHapticFeedback(hapticFeedbackType);
        }
    }

    /* renamed from: io.flutter.plugin.platform.PlatformPlugin$2 */
    /* loaded from: classes2.dex */
    public class ViewOnSystemUiVisibilityChangeListenerC27852 implements View.OnSystemUiVisibilityChangeListener {
        public final /* synthetic */ View val$decorView;

        public ViewOnSystemUiVisibilityChangeListenerC27852(View view) {
            this.val$decorView = view;
        }

        public /* synthetic */ void lambda$onSystemUiVisibilityChange$0(int i10) {
            PlatformChannel platformChannel;
            boolean z10;
            if ((i10 & 4) == 0) {
                platformChannel = PlatformPlugin.this.platformChannel;
                z10 = true;
            } else {
                platformChannel = PlatformPlugin.this.platformChannel;
                z10 = false;
            }
            platformChannel.systemChromeChanged(z10);
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i10) {
            this.val$decorView.post(new Runnable() { // from class: io.flutter.plugin.platform.a

                /* renamed from: i */
                public final /* synthetic */ int f10634i;

                public /* synthetic */ RunnableC2793a(int i102) {
                    r2 = i102;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PlatformPlugin.ViewOnSystemUiVisibilityChangeListenerC27852.this.lambda$onSystemUiVisibilityChange$0(r2);
                }
            });
        }
    }

    /* renamed from: io.flutter.plugin.platform.PlatformPlugin$3 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C27863 {

        /* renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness */
        public static final /* synthetic */ int[] f10630xfa6fb21b;

        /* renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType */
        public static final /* synthetic */ int[] f10631x98e77c60;

        /* renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay */
        public static final /* synthetic */ int[] f10632x4c113a23;

        static {
            int[] iArr = new int[PlatformChannel.Brightness.values().length];
            f10630xfa6fb21b = iArr;
            try {
                iArr[PlatformChannel.Brightness.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10630xfa6fb21b[PlatformChannel.Brightness.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[PlatformChannel.SystemUiOverlay.values().length];
            f10632x4c113a23 = iArr2;
            try {
                iArr2[PlatformChannel.SystemUiOverlay.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10632x4c113a23[PlatformChannel.SystemUiOverlay.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[PlatformChannel.HapticFeedbackType.values().length];
            f10631x98e77c60 = iArr3;
            try {
                iArr3[PlatformChannel.HapticFeedbackType.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10631x98e77c60[PlatformChannel.HapticFeedbackType.LIGHT_IMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10631x98e77c60[PlatformChannel.HapticFeedbackType.MEDIUM_IMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10631x98e77c60[PlatformChannel.HapticFeedbackType.HEAVY_IMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10631x98e77c60[PlatformChannel.HapticFeedbackType.SELECTION_CLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface PlatformPluginDelegate {
        boolean popSystemNavigator();

        default void setFrameworkHandlesBack(boolean z10) {
        }
    }

    public PlatformPlugin(Activity activity, PlatformChannel platformChannel) {
        this(activity, platformChannel, null);
    }

    public PlatformPlugin(Activity activity, PlatformChannel platformChannel, PlatformPluginDelegate platformPluginDelegate) {
        C27841 c27841 = new PlatformChannel.PlatformMessageHandler() { // from class: io.flutter.plugin.platform.PlatformPlugin.1
            public C27841() {
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public boolean clipboardHasStrings() {
                return PlatformPlugin.this.clipboardHasStrings();
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public CharSequence getClipboardData(PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
                return PlatformPlugin.this.getClipboardData(clipboardContentFormat);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void playSystemSound(PlatformChannel.SoundType soundType) {
                PlatformPlugin.this.playSystemSound(soundType);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void popSystemNavigator() {
                PlatformPlugin.this.popSystemNavigator();
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void restoreSystemUiOverlays() {
                PlatformPlugin.this.restoreSystemChromeSystemUIOverlays();
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setApplicationSwitcherDescription(PlatformChannel.AppSwitcherDescription appSwitcherDescription) {
                PlatformPlugin.this.setSystemChromeApplicationSwitcherDescription(appSwitcherDescription);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setClipboardData(String str) {
                PlatformPlugin.this.setClipboardData(str);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setFrameworkHandlesBack(boolean z10) {
                PlatformPlugin.this.setFrameworkHandlesBack(z10);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setPreferredOrientations(int i10) {
                PlatformPlugin.this.setSystemChromePreferredOrientations(i10);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setSystemUiChangeListener() {
                PlatformPlugin.this.setSystemChromeChangeListener();
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setSystemUiOverlayStyle(PlatformChannel.SystemChromeStyle systemChromeStyle) {
                PlatformPlugin.this.setSystemChromeSystemUIOverlayStyle(systemChromeStyle);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void showSystemOverlays(List<PlatformChannel.SystemUiOverlay> list) {
                PlatformPlugin.this.setSystemChromeEnabledSystemUIOverlays(list);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void showSystemUiMode(PlatformChannel.SystemUiMode systemUiMode) {
                PlatformPlugin.this.setSystemChromeEnabledSystemUIMode(systemUiMode);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void vibrateHapticFeedback(PlatformChannel.HapticFeedbackType hapticFeedbackType) {
                PlatformPlugin.this.vibrateHapticFeedback(hapticFeedbackType);
            }
        };
        this.mPlatformMessageHandler = c27841;
        this.activity = activity;
        this.platformChannel = platformChannel;
        platformChannel.setPlatformMessageHandler(c27841);
        this.platformPluginDelegate = platformPluginDelegate;
        this.mEnabledOverlays = DEFAULT_SYSTEM_UI;
    }

    public boolean clipboardHasStrings() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.activity.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    public CharSequence getClipboardData(PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
        ClipboardManager clipboardManager = (ClipboardManager) this.activity.getSystemService("clipboard");
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if (primaryClip == null) {
                return null;
            }
            if (clipboardContentFormat != null && clipboardContentFormat != PlatformChannel.ClipboardContentFormat.PLAIN_TEXT) {
                return null;
            }
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt.getUri() != null) {
                this.activity.getContentResolver().openTypedAssetFileDescriptor(itemAt.getUri(), "text/*", null);
            }
            return itemAt.coerceToText(this.activity);
        } catch (FileNotFoundException unused) {
            return null;
        } catch (SecurityException e10) {
            Log.m11048w(TAG, "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e10);
            return null;
        }
    }

    public void playSystemSound(PlatformChannel.SoundType soundType) {
        if (soundType == PlatformChannel.SoundType.CLICK) {
            this.activity.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void popSystemNavigator() {
        PlatformPluginDelegate platformPluginDelegate = this.platformPluginDelegate;
        if (platformPluginDelegate == null || !platformPluginDelegate.popSystemNavigator()) {
            Activity activity = this.activity;
            if (activity instanceof InterfaceC0161n) {
                ((InterfaceC0161n) activity).getOnBackPressedDispatcher().m585e();
            } else {
                activity.finish();
            }
        }
    }

    public void restoreSystemChromeSystemUIOverlays() {
        updateSystemUiOverlays();
    }

    public void setClipboardData(String str) {
        ((ClipboardManager) this.activity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    public void setFrameworkHandlesBack(boolean z10) {
        this.platformPluginDelegate.setFrameworkHandlesBack(z10);
    }

    public void setSystemChromeApplicationSwitcherDescription(PlatformChannel.AppSwitcherDescription appSwitcherDescription) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 21) {
            return;
        }
        if (i10 < 28 && i10 > 21) {
            this.activity.setTaskDescription(new ActivityManager.TaskDescription(appSwitcherDescription.label, (Bitmap) null, appSwitcherDescription.color));
        }
        if (i10 >= 28) {
            this.activity.setTaskDescription(new ActivityManager.TaskDescription(appSwitcherDescription.label, 0, appSwitcherDescription.color));
        }
    }

    public void setSystemChromeChangeListener() {
        View decorView = this.activity.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new ViewOnSystemUiVisibilityChangeListenerC27852(decorView));
    }

    public void setSystemChromeEnabledSystemUIMode(PlatformChannel.SystemUiMode systemUiMode) {
        int i10;
        if (systemUiMode == PlatformChannel.SystemUiMode.LEAN_BACK) {
            i10 = InAppWebViewChromeClient.FULLSCREEN_SYSTEM_UI_VISIBILITY;
        } else if (systemUiMode == PlatformChannel.SystemUiMode.IMMERSIVE && Build.VERSION.SDK_INT >= 19) {
            i10 = 3846;
        } else if (systemUiMode == PlatformChannel.SystemUiMode.IMMERSIVE_STICKY && Build.VERSION.SDK_INT >= 19) {
            i10 = 5894;
        } else if (systemUiMode != PlatformChannel.SystemUiMode.EDGE_TO_EDGE || Build.VERSION.SDK_INT < 29) {
            return;
        } else {
            i10 = 1792;
        }
        this.mEnabledOverlays = i10;
        updateSystemUiOverlays();
    }

    public void setSystemChromeEnabledSystemUIOverlays(List<PlatformChannel.SystemUiOverlay> list) {
        int i10 = (list.size() != 0 || Build.VERSION.SDK_INT < 19) ? InAppWebViewChromeClient.FULLSCREEN_SYSTEM_UI_VISIBILITY : 5894;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int i12 = C27863.f10632x4c113a23[list.get(i11).ordinal()];
            if (i12 == 1) {
                i10 &= -5;
            } else if (i12 == 2) {
                i10 = i10 & (-513) & (-3);
            }
        }
        this.mEnabledOverlays = i10;
        updateSystemUiOverlays();
    }

    public void setSystemChromePreferredOrientations(int i10) {
        this.activity.setRequestedOrientation(i10);
    }

    @TargetApi(21)
    public void setSystemChromeSystemUIOverlayStyle(PlatformChannel.SystemChromeStyle systemChromeStyle) {
        Window window = this.activity.getWindow();
        C3330m0 c3330m0 = new C3330m0(window, window.getDecorView());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        if (i10 >= 23) {
            PlatformChannel.Brightness brightness = systemChromeStyle.statusBarIconBrightness;
            if (brightness != null) {
                int i11 = C27863.f10630xfa6fb21b[brightness.ordinal()];
                if (i11 == 1) {
                    c3330m0.m12360b(true);
                } else if (i11 == 2) {
                    c3330m0.m12360b(false);
                }
            }
            Integer num = systemChromeStyle.statusBarColor;
            if (num != null) {
                window.setStatusBarColor(num.intValue());
            }
        }
        Boolean bool = systemChromeStyle.systemStatusBarContrastEnforced;
        if (bool != null && i10 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i10 >= 26) {
            PlatformChannel.Brightness brightness2 = systemChromeStyle.systemNavigationBarIconBrightness;
            if (brightness2 != null) {
                int i12 = C27863.f10630xfa6fb21b[brightness2.ordinal()];
                if (i12 == 1) {
                    c3330m0.m12359a(true);
                } else if (i12 == 2) {
                    c3330m0.m12359a(false);
                }
            }
            Integer num2 = systemChromeStyle.systemNavigationBarColor;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = systemChromeStyle.systemNavigationBarDividerColor;
        if (num3 != null && i10 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = systemChromeStyle.systemNavigationBarContrastEnforced;
        if (bool2 != null && i10 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.currentTheme = systemChromeStyle;
    }

    public void destroy() {
        this.platformChannel.setPlatformMessageHandler(null);
    }

    public void updateSystemUiOverlays() {
        this.activity.getWindow().getDecorView().setSystemUiVisibility(this.mEnabledOverlays);
        PlatformChannel.SystemChromeStyle systemChromeStyle = this.currentTheme;
        if (systemChromeStyle != null) {
            setSystemChromeSystemUIOverlayStyle(systemChromeStyle);
        }
    }

    public void vibrateHapticFeedback(PlatformChannel.HapticFeedbackType hapticFeedbackType) {
        int i10;
        View decorView = this.activity.getWindow().getDecorView();
        int i11 = C27863.f10631x98e77c60[hapticFeedbackType.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            if (i11 != 2) {
                i12 = 3;
                if (i11 != 3) {
                    i12 = 4;
                    if (i11 != 4) {
                        if (i11 != 5 || Build.VERSION.SDK_INT < 21) {
                            return;
                        }
                    } else if (Build.VERSION.SDK_INT < 23) {
                        return;
                    } else {
                        i10 = 6;
                    }
                }
            }
            decorView.performHapticFeedback(i12);
            return;
        }
        i10 = 0;
        decorView.performHapticFeedback(i10);
    }
}
