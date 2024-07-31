package io.flutter.plugins.googlemaps;

import android.content.Context;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import p336x6.C5631e;
import p336x6.InterfaceC5633g;

/* loaded from: classes2.dex */
final class GoogleMapInitializer implements InterfaceC5633g, MethodChannel.MethodCallHandler {
    private static MethodChannel.Result initializationResult;
    private final Context context;
    private final MethodChannel methodChannel;
    private boolean rendererInitialized = false;

    /* renamed from: io.flutter.plugins.googlemaps.GoogleMapInitializer$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C30801 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$android$gms$maps$MapsInitializer$Renderer;

        static {
            int[] iArr = new int[C5631e.a.values().length];
            $SwitchMap$com$google$android$gms$maps$MapsInitializer$Renderer = iArr;
            try {
                iArr[C5631e.a.LATEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$gms$maps$MapsInitializer$Renderer[C5631e.a.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public GoogleMapInitializer(Context context, BinaryMessenger binaryMessenger) {
        this.context = context;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.dev/google_maps_android_initializer");
        this.methodChannel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    private void initializeWithPreferredRenderer(String str, MethodChannel.Result result) {
        C5631e.a aVar;
        if (this.rendererInitialized || initializationResult != null) {
            result.error("Renderer already initialized", "Renderer initialization called multiple times", null);
            return;
        }
        initializationResult = result;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1109880953:
                if (str.equals("latest")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1106578487:
                if (str.equals("legacy")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1544803905:
                if (str.equals("default")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                aVar = C5631e.a.LATEST;
                break;
            case 1:
                aVar = C5631e.a.LEGACY;
                break;
            case 2:
                initializeWithRendererRequest(null);
                return;
            default:
                initializationResult.error("Invalid renderer type", "Renderer initialization called with invalid renderer type", null);
                initializationResult = null;
                return;
        }
        initializeWithRendererRequest(aVar);
    }

    public void initializeWithRendererRequest(C5631e.a aVar) {
        C5631e.m22675b(this.context, aVar, this);
    }

    @Override // p336x6.InterfaceC5633g
    public void onMapsSdkInitialized(C5631e.a aVar) {
        MethodChannel.Result result;
        String str;
        this.rendererInitialized = true;
        if (initializationResult != null) {
            int i10 = C30801.$SwitchMap$com$google$android$gms$maps$MapsInitializer$Renderer[aVar.ordinal()];
            if (i10 == 1) {
                result = initializationResult;
                str = "latest";
            } else if (i10 != 2) {
                initializationResult.error("Unknown renderer type", "Initialized with unknown renderer type", null);
                initializationResult = null;
            } else {
                result = initializationResult;
                str = "legacy";
            }
            result.success(str);
            initializationResult = null;
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        if (str.equals("initializer#preferRenderer")) {
            initializeWithPreferredRenderer((String) methodCall.argument("value"), result);
        } else {
            result.notImplemented();
        }
    }
}
