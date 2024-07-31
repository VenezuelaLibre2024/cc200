package io.flutter.plugins.googlemaps;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0344f;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0354k;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugins.googlemaps.ClusterManagersController;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p012aa.C0082c;
import p052da.C1607b;
import p336x6.C5626a;
import p336x6.C5629c;
import p336x6.C5630d;
import p336x6.InterfaceC5632f;
import p367z6.C6006f;
import p367z6.C6018l;
import p367z6.C6020m;
import p367z6.C6028q;
import p367z6.C6032s;

/* loaded from: classes2.dex */
public class GoogleMapController implements DefaultLifecycleObserver, ActivityPluginBinding.OnSaveInstanceStateListener, GoogleMapOptionsSink, MethodChannel.MethodCallHandler, InterfaceC5632f, GoogleMapListener, C0082c.f<MarkerBuilder>, ClusterManagersController.OnClusterItemRendered<MarkerBuilder>, PlatformView {
    private static final String TAG = "GoogleMapController";
    private final CirclesController circlesController;
    private final ClusterManagersController clusterManagersController;
    private final Context context;
    public final float density;
    private C5629c googleMap;

    /* renamed from: id */
    private final int f10927id;
    private List<Object> initialCircles;
    private List<Object> initialClusterManagers;
    private String initialMapStyle;
    private List<Object> initialMarkers;
    public List<Float> initialPadding;
    private List<Object> initialPolygons;
    private List<Object> initialPolylines;
    private List<Map<String, ?>> initialTileOverlays;
    private String lastStyleError;
    private final LifecycleProvider lifecycleProvider;
    private MethodChannel.Result mapReadyResult;
    private C5630d mapView;
    private C1607b.a markerCollection;
    private C1607b markerManager;
    private final MarkersController markersController;
    private final MethodChannel methodChannel;
    private final GoogleMapOptions options;
    private final PolygonsController polygonsController;
    private final PolylinesController polylinesController;
    private final TileOverlaysController tileOverlaysController;
    private boolean trackCameraPosition = false;
    private boolean myLocationEnabled = false;
    private boolean myLocationButtonEnabled = false;
    private boolean zoomControlsEnabled = true;
    private boolean indoorEnabled = true;
    private boolean trafficEnabled = false;
    private boolean buildingsEnabled = true;
    private boolean disposed = false;

    /* renamed from: io.flutter.plugins.googlemaps.GoogleMapController$1 */
    /* loaded from: classes2.dex */
    public class TextureViewSurfaceTextureListenerC30781 implements TextureView.SurfaceTextureListener {
        public final /* synthetic */ TextureView.SurfaceTextureListener val$internalListener;
        public final /* synthetic */ C5630d val$mapView;

        public TextureViewSurfaceTextureListenerC30781(TextureView.SurfaceTextureListener surfaceTextureListener, C5630d c5630d) {
            r2 = surfaceTextureListener;
            r3 = c5630d;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            TextureView.SurfaceTextureListener surfaceTextureListener = r2;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            TextureView.SurfaceTextureListener surfaceTextureListener = r2;
            if (surfaceTextureListener != null) {
                return surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            TextureView.SurfaceTextureListener surfaceTextureListener = r2;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            TextureView.SurfaceTextureListener surfaceTextureListener = r2;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
            }
            r3.invalidate();
        }
    }

    /* renamed from: io.flutter.plugins.googlemaps.GoogleMapController$2 */
    /* loaded from: classes2.dex */
    public class C30792 implements C5629c.n {
        public final /* synthetic */ MethodChannel.Result val$_result;

        public C30792(MethodChannel.Result result) {
            r2 = result;
        }

        @Override // p336x6.C5629c.n
        public void onSnapshotReady(Bitmap bitmap) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bitmap.recycle();
            r2.success(byteArray);
        }
    }

    public GoogleMapController(int i10, Context context, BinaryMessenger binaryMessenger, LifecycleProvider lifecycleProvider, GoogleMapOptions googleMapOptions) {
        this.f10927id = i10;
        this.context = context;
        this.options = googleMapOptions;
        this.mapView = new C5630d(context, googleMapOptions);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.density = f10;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.dev/google_maps_android_" + i10);
        this.methodChannel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.lifecycleProvider = lifecycleProvider;
        ClusterManagersController clusterManagersController = new ClusterManagersController(methodChannel, context);
        this.clusterManagersController = clusterManagersController;
        this.markersController = new MarkersController(methodChannel, clusterManagersController);
        this.polygonsController = new PolygonsController(methodChannel, f10);
        this.polylinesController = new PolylinesController(methodChannel, f10);
        this.circlesController = new CirclesController(methodChannel, f10);
        this.tileOverlaysController = new TileOverlaysController(methodChannel);
    }

    public GoogleMapController(int i10, Context context, MethodChannel methodChannel, LifecycleProvider lifecycleProvider, GoogleMapOptions googleMapOptions, ClusterManagersController clusterManagersController, MarkersController markersController, PolygonsController polygonsController, PolylinesController polylinesController, CirclesController circlesController, TileOverlaysController tileOverlaysController) {
        this.f10927id = i10;
        this.context = context;
        this.methodChannel = methodChannel;
        this.options = googleMapOptions;
        this.mapView = new C5630d(context, googleMapOptions);
        this.density = context.getResources().getDisplayMetrics().density;
        this.lifecycleProvider = lifecycleProvider;
        this.clusterManagersController = clusterManagersController;
        this.markersController = markersController;
        this.polygonsController = polygonsController;
        this.polylinesController = polylinesController;
        this.circlesController = circlesController;
        this.tileOverlaysController = tileOverlaysController;
    }

    private void animateCamera(C5626a c5626a) {
        this.googleMap.m22646f(c5626a);
    }

    private int checkSelfPermission(String str) {
        if (str != null) {
            return this.context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    private void destroyMapViewIfNecessary() {
        C5630d c5630d = this.mapView;
        if (c5630d == null) {
            return;
        }
        c5630d.m22669c();
        this.mapView = null;
    }

    private static TextureView findTextureView(ViewGroup viewGroup) {
        TextureView findTextureView;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof TextureView) {
                return (TextureView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (findTextureView = findTextureView((ViewGroup) childAt)) != null) {
                return findTextureView;
            }
        }
        return null;
    }

    private CameraPosition getCameraPosition() {
        if (this.trackCameraPosition) {
            return this.googleMap.m22647g();
        }
        return null;
    }

    private boolean hasLocationPermission() {
        return checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 || checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    private void installInvalidator() {
        C5630d c5630d = this.mapView;
        if (c5630d == null) {
            return;
        }
        TextureView findTextureView = findTextureView(c5630d);
        if (findTextureView == null) {
            Log.i(TAG, "No TextureView found. Likely using the LEGACY renderer.");
        } else {
            Log.i(TAG, "Installing custom TextureView driven invalidator.");
            findTextureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: io.flutter.plugins.googlemaps.GoogleMapController.1
                public final /* synthetic */ TextureView.SurfaceTextureListener val$internalListener;
                public final /* synthetic */ C5630d val$mapView;

                public TextureViewSurfaceTextureListenerC30781(TextureView.SurfaceTextureListener surfaceTextureListener, C5630d c5630d2) {
                    r2 = surfaceTextureListener;
                    r3 = c5630d2;
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
                    TextureView.SurfaceTextureListener surfaceTextureListener = r2;
                    if (surfaceTextureListener != null) {
                        surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
                    }
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    TextureView.SurfaceTextureListener surfaceTextureListener = r2;
                    if (surfaceTextureListener != null) {
                        return surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
                    }
                    return true;
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
                    TextureView.SurfaceTextureListener surfaceTextureListener = r2;
                    if (surfaceTextureListener != null) {
                        surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
                    }
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                    TextureView.SurfaceTextureListener surfaceTextureListener = r2;
                    if (surfaceTextureListener != null) {
                        surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
                    }
                    r3.invalidate();
                }
            });
        }
    }

    private void moveCamera(C5626a c5626a) {
        this.googleMap.m22654n(c5626a);
    }

    private void setGoogleMapListener(GoogleMapListener googleMapListener) {
        C5629c c5629c = this.googleMap;
        if (c5629c == null) {
            Log.v(TAG, "Controller was disposed before GoogleMap was ready.");
            return;
        }
        c5629c.m22627A(googleMapListener);
        this.googleMap.m22666z(googleMapListener);
        this.googleMap.m22665y(googleMapListener);
        this.googleMap.m22635I(googleMapListener);
        this.googleMap.m22636J(googleMapListener);
        this.googleMap.m22628B(googleMapListener);
        this.googleMap.m22631E(googleMapListener);
        this.googleMap.m22632F(googleMapListener);
    }

    private void updateInitialCircles() {
        this.circlesController.addCircles(this.initialCircles);
    }

    private void updateInitialClusterManagers() {
        List<Object> list = this.initialClusterManagers;
        if (list != null) {
            this.clusterManagersController.addClusterManagers(list);
        }
    }

    private void updateInitialMarkers() {
        this.markersController.addMarkers(this.initialMarkers);
    }

    private void updateInitialPolygons() {
        this.polygonsController.addPolygons(this.initialPolygons);
    }

    private void updateInitialPolylines() {
        this.polylinesController.addPolylines(this.initialPolylines);
    }

    private void updateInitialTileOverlays() {
        this.tileOverlaysController.addTileOverlays(this.initialTileOverlays);
    }

    private boolean updateMapStyle(String str) {
        C6018l c6018l = (str == null || str.isEmpty()) ? null : new C6018l(str);
        C5629c c5629c = this.googleMap;
        Objects.requireNonNull(c5629c);
        boolean m22660t = c5629c.m22660t(c6018l);
        this.lastStyleError = m22660t ? null : "Unable to set the map style. Please check console logs for errors.";
        return m22660t;
    }

    @SuppressLint({"MissingPermission"})
    private void updateMyLocationSettings() {
        if (!hasLocationPermission()) {
            Log.e(TAG, "Cannot enable MyLocation layer as location permissions are not granted");
        } else {
            this.googleMap.m22664x(this.myLocationEnabled);
            this.googleMap.m22651k().m22689k(this.myLocationButtonEnabled);
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        if (this.disposed) {
            return;
        }
        this.disposed = true;
        this.methodChannel.setMethodCallHandler(null);
        setGoogleMapListener(null);
        setMarkerCollectionListener(null);
        setClusterItemClickListener(null);
        setClusterItemRenderedListener(null);
        destroyMapViewIfNecessary();
        AbstractC0344f lifecycle = this.lifecycleProvider.getLifecycle();
        if (lifecycle != null) {
            lifecycle.mo1802c(this);
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public View getView() {
        return this.mapView;
    }

    public void init() {
        this.lifecycleProvider.getLifecycle().mo1800a(this);
        this.mapView.m22667a(this);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, p336x6.C5629c.b
    public void onCameraIdle() {
        this.clusterManagersController.onCameraIdle();
        this.methodChannel.invokeMethod("camera#onIdle", Collections.singletonMap("map", Integer.valueOf(this.f10927id)));
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, p336x6.C5629c.c
    public void onCameraMove() {
        if (this.trackCameraPosition) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("position", Convert.cameraPositionToJson(this.googleMap.m22647g()));
            this.methodChannel.invokeMethod("camera#onMove", hashMap);
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, p336x6.C5629c.d
    public void onCameraMoveStarted(int i10) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("isGesture", Boolean.valueOf(i10 == 1));
        this.methodChannel.invokeMethod("camera#onMoveStarted", hashMap);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, p336x6.C5629c.e
    public void onCircleClick(C6006f c6006f) {
        this.circlesController.onCircleTap(c6006f.m24095a());
    }

    @Override // p012aa.C0082c.f
    public boolean onClusterItemClick(MarkerBuilder markerBuilder) {
        return this.markersController.onMarkerTap(markerBuilder.markerId());
    }

    @Override // io.flutter.plugins.googlemaps.ClusterManagersController.OnClusterItemRendered
    public void onClusterItemRendered(MarkerBuilder markerBuilder, C6020m c6020m) {
        this.markersController.onClusterItemRendered(markerBuilder, c6020m);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC0354k interfaceC0354k) {
        if (this.disposed) {
            return;
        }
        this.mapView.m22668b(null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(InterfaceC0354k interfaceC0354k) {
        interfaceC0354k.getLifecycle().mo1802c(this);
        if (this.disposed) {
            return;
        }
        destroyMapViewIfNecessary();
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, p336x6.C5629c.f
    public void onInfoWindowClick(C6020m c6020m) {
        this.markersController.onInfoWindowTap(c6020m.m24122a());
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, p336x6.C5629c.h
    public void onMapClick(LatLng latLng) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("position", Convert.latLngToJson(latLng));
        this.methodChannel.invokeMethod("map#onTap", hashMap);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, p336x6.C5629c.i
    public void onMapLongClick(LatLng latLng) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("position", Convert.latLngToJson(latLng));
        this.methodChannel.invokeMethod("map#onLongPress", hashMap);
    }

    @Override // p336x6.InterfaceC5632f
    public void onMapReady(C5629c c5629c) {
        this.googleMap = c5629c;
        c5629c.m22657q(this.indoorEnabled);
        this.googleMap.m22638L(this.trafficEnabled);
        this.googleMap.m22656p(this.buildingsEnabled);
        installInvalidator();
        MethodChannel.Result result = this.mapReadyResult;
        if (result != null) {
            result.success(null);
            this.mapReadyResult = null;
        }
        setGoogleMapListener(this);
        C1607b c1607b = new C1607b(c5629c);
        this.markerManager = c1607b;
        this.markerCollection = c1607b.m6445g();
        updateMyLocationSettings();
        this.markersController.setCollection(this.markerCollection);
        this.clusterManagersController.init(c5629c, this.markerManager);
        this.polygonsController.setGoogleMap(c5629c);
        this.polylinesController.setGoogleMap(c5629c);
        this.circlesController.setGoogleMap(c5629c);
        this.tileOverlaysController.setGoogleMap(c5629c);
        setMarkerCollectionListener(this);
        setClusterItemClickListener(this);
        setClusterItemRenderedListener(this);
        updateInitialClusterManagers();
        updateInitialMarkers();
        updateInitialPolygons();
        updateInitialPolylines();
        updateInitialCircles();
        updateInitialTileOverlays();
        List<Float> list = this.initialPadding;
        if (list != null && list.size() == 4) {
            setPadding(this.initialPadding.get(0).floatValue(), this.initialPadding.get(1).floatValue(), this.initialPadding.get(2).floatValue(), this.initialPadding.get(3).floatValue());
        }
        String str = this.initialMapStyle;
        if (str != null) {
            updateMapStyle(str);
            this.initialMapStyle = null;
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, p336x6.C5629c.j
    public boolean onMarkerClick(C6020m c6020m) {
        return this.markersController.onMapsMarkerTap(c6020m.m24122a());
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, p336x6.C5629c.k
    public void onMarkerDrag(C6020m c6020m) {
        this.markersController.onMarkerDrag(c6020m.m24122a(), c6020m.m24123b());
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, p336x6.C5629c.k
    public void onMarkerDragEnd(C6020m c6020m) {
        this.markersController.onMarkerDragEnd(c6020m.m24122a(), c6020m.m24123b());
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, p336x6.C5629c.k
    public void onMarkerDragStart(C6020m c6020m) {
        this.markersController.onMarkerDragStart(c6020m.m24122a(), c6020m.m24123b());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:109:0x01ea. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        boolean m22683e;
        Object obj;
        String str2 = methodCall.method;
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case -2068530537:
                if (str2.equals("map#getVisibleRegion")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1753225255:
                if (str2.equals("map#isScrollGesturesEnabled")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1675017333:
                if (str2.equals("map#isRotateGesturesEnabled")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1389285936:
                if (str2.equals("map#update")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1366519597:
                if (str2.equals("map#getScreenCoordinate")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1264573565:
                if (str2.equals("camera#animate")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1255039905:
                if (str2.equals("markers#isInfoWindowShown")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1253612063:
                if (str2.equals("map#getTileOverlayInfo")) {
                    c10 = 7;
                    break;
                }
                break;
            case -1102318061:
                if (str2.equals("polygons#update")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -689870081:
                if (str2.equals("clusterManager#getClusters")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -596474455:
                if (str2.equals("map#isTiltGesturesEnabled")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -577075523:
                if (str2.equals("map#isMyLocationButtonEnabled")) {
                    c10 = 11;
                    break;
                }
                break;
            case -508357782:
                if (str2.equals("markers#hideInfoWindow")) {
                    c10 = '\f';
                    break;
                }
                break;
            case -451921790:
                if (str2.equals("map#getZoomLevel")) {
                    c10 = '\r';
                    break;
                }
                break;
            case -191840212:
                if (str2.equals("clusterManagers#update")) {
                    c10 = 14;
                    break;
                }
                break;
            case -149616666:
                if (str2.equals("map#getStyleError")) {
                    c10 = 15;
                    break;
                }
                break;
            case 262112323:
                if (str2.equals("map#getMinMaxZoomLevels")) {
                    c10 = 16;
                    break;
                }
                break;
            case 282895827:
                if (str2.equals("map#isZoomGesturesEnabled")) {
                    c10 = 17;
                    break;
                }
                break;
            case 295004975:
                if (str2.equals("map#waitForMap")) {
                    c10 = 18;
                    break;
                }
                break;
            case 390939153:
                if (str2.equals("map#isMapToolbarEnabled")) {
                    c10 = 19;
                    break;
                }
                break;
            case 434031410:
                if (str2.equals("map#takeSnapshot")) {
                    c10 = 20;
                    break;
                }
                break;
            case 622947733:
                if (str2.equals("map#getLatLng")) {
                    c10 = 21;
                    break;
                }
                break;
            case 643972249:
                if (str2.equals("polylines#update")) {
                    c10 = 22;
                    break;
                }
                break;
            case 712945078:
                if (str2.equals("map#setStyle")) {
                    c10 = 23;
                    break;
                }
                break;
            case 972868051:
                if (str2.equals("map#isBuildingsEnabled")) {
                    c10 = 24;
                    break;
                }
                break;
            case 1098288608:
                if (str2.equals("map#isCompassEnabled")) {
                    c10 = 25;
                    break;
                }
                break;
            case 1172199911:
                if (str2.equals("map#isZoomControlsEnabled")) {
                    c10 = 26;
                    break;
                }
                break;
            case 1322988819:
                if (str2.equals("markers#update")) {
                    c10 = 27;
                    break;
                }
                break;
            case 1546082965:
                if (str2.equals("map#isTrafficEnabled")) {
                    c10 = 28;
                    break;
                }
                break;
            case 1564959387:
                if (str2.equals("tileOverlays#update")) {
                    c10 = 29;
                    break;
                }
                break;
            case 1708609913:
                if (str2.equals("tileOverlays#clearTileCache")) {
                    c10 = 30;
                    break;
                }
                break;
            case 1873569705:
                if (str2.equals("circles#update")) {
                    c10 = 31;
                    break;
                }
                break;
            case 1915657375:
                if (str2.equals("map#isLiteModeEnabled")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 1953391461:
                if (str2.equals("markers#showInfoWindow")) {
                    c10 = '!';
                    break;
                }
                break;
            case 2003557999:
                if (str2.equals("camera#move")) {
                    c10 = '\"';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                C5629c c5629c = this.googleMap;
                if (c5629c != null) {
                    obj = Convert.latLngBoundsToJson(c5629c.m22650j().m22677b().f22405l);
                    result.success(obj);
                    return;
                } else {
                    str = "getVisibleRegion called prior to map initialization";
                    result.error("GoogleMap uninitialized", str, null);
                    return;
                }
            case 1:
                m22683e = this.googleMap.m22651k().m22683e();
                obj = Boolean.valueOf(m22683e);
                result.success(obj);
                return;
            case 2:
                m22683e = this.googleMap.m22651k().m22682d();
                obj = Boolean.valueOf(m22683e);
                result.success(obj);
                return;
            case 3:
                Convert.interpretGoogleMapOptions(methodCall.argument("options"), this);
                obj = Convert.cameraPositionToJson(getCameraPosition());
                result.success(obj);
                return;
            case 4:
                if (this.googleMap != null) {
                    obj = Convert.pointToJson(this.googleMap.m22650j().m22678c(Convert.toLatLng(methodCall.arguments)));
                    result.success(obj);
                    return;
                } else {
                    str = "getScreenCoordinate called prior to map initialization";
                    result.error("GoogleMap uninitialized", str, null);
                    return;
                }
            case 5:
                animateCamera(Convert.toCameraUpdate(methodCall.argument("cameraUpdate"), this.density));
                result.success(null);
                return;
            case 6:
                this.markersController.isInfoWindowShown((String) methodCall.argument("markerId"), result);
                return;
            case 7:
                obj = this.tileOverlaysController.getTileOverlayInfo((String) methodCall.argument("tileOverlayId"));
                result.success(obj);
                return;
            case '\b':
                this.polygonsController.addPolygons((List) methodCall.argument("polygonsToAdd"));
                this.polygonsController.changePolygons((List) methodCall.argument("polygonsToChange"));
                this.polygonsController.removePolygons((List) methodCall.argument("polygonIdsToRemove"));
                result.success(null);
                return;
            case '\t':
                this.clusterManagersController.getClustersWithClusterManagerId((String) methodCall.argument("clusterManagerId"), result);
                return;
            case '\n':
                m22683e = this.googleMap.m22651k().m22684f();
                obj = Boolean.valueOf(m22683e);
                result.success(obj);
                return;
            case 11:
                m22683e = this.googleMap.m22651k().m22681c();
                obj = Boolean.valueOf(m22683e);
                result.success(obj);
                return;
            case '\f':
                this.markersController.hideMarkerInfoWindow((String) methodCall.argument("markerId"), result);
                return;
            case '\r':
                obj = Float.valueOf(this.googleMap.m22647g().f4587i);
                result.success(obj);
                return;
            case 14:
                List<Object> list = (List) methodCall.argument("clusterManagersToAdd");
                if (list != null) {
                    this.clusterManagersController.addClusterManagers(list);
                }
                List<Object> list2 = (List) methodCall.argument("clusterManagerIdsToRemove");
                if (list2 != null) {
                    this.clusterManagersController.removeClusterManagers(list2);
                }
                result.success(null);
                return;
            case 15:
                obj = this.lastStyleError;
                result.success(obj);
                return;
            case 16:
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(Float.valueOf(this.googleMap.m22649i()));
                arrayList.add(Float.valueOf(this.googleMap.m22648h()));
                obj = arrayList;
                result.success(obj);
                return;
            case 17:
                m22683e = this.googleMap.m22651k().m22686h();
                obj = Boolean.valueOf(m22683e);
                result.success(obj);
                return;
            case 18:
                if (this.googleMap != null) {
                    result.success(null);
                    return;
                } else {
                    this.mapReadyResult = result;
                    return;
                }
            case 19:
                m22683e = this.googleMap.m22651k().m22680b();
                obj = Boolean.valueOf(m22683e);
                result.success(obj);
                return;
            case 20:
                C5629c c5629c2 = this.googleMap;
                if (c5629c2 != null) {
                    c5629c2.m22639M(new C5629c.n() { // from class: io.flutter.plugins.googlemaps.GoogleMapController.2
                        public final /* synthetic */ MethodChannel.Result val$_result;

                        public C30792(MethodChannel.Result result2) {
                            r2 = result2;
                        }

                        @Override // p336x6.C5629c.n
                        public void onSnapshotReady(Bitmap bitmap) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            bitmap.recycle();
                            r2.success(byteArray);
                        }
                    });
                    return;
                } else {
                    str = "takeSnapshot";
                    result2.error("GoogleMap uninitialized", str, null);
                    return;
                }
            case 21:
                if (this.googleMap != null) {
                    obj = Convert.latLngToJson(this.googleMap.m22650j().m22676a(Convert.toPoint(methodCall.arguments)));
                    result2.success(obj);
                    return;
                } else {
                    str = "getLatLng called prior to map initialization";
                    result2.error("GoogleMap uninitialized", str, null);
                    return;
                }
            case 22:
                this.polylinesController.addPolylines((List) methodCall.argument("polylinesToAdd"));
                this.polylinesController.changePolylines((List) methodCall.argument("polylinesToChange"));
                this.polylinesController.removePolylines((List) methodCall.argument("polylineIdsToRemove"));
                result2.success(null);
                return;
            case 23:
                Object obj2 = methodCall.arguments;
                boolean updateMapStyle = updateMapStyle(obj2 instanceof String ? (String) obj2 : null);
                ArrayList arrayList2 = new ArrayList(2);
                arrayList2.add(Boolean.valueOf(updateMapStyle));
                if (!updateMapStyle) {
                    arrayList2.add(this.lastStyleError);
                }
                result2.success(arrayList2);
                return;
            case 24:
                m22683e = this.googleMap.m22652l();
                obj = Boolean.valueOf(m22683e);
                result2.success(obj);
                return;
            case 25:
                m22683e = this.googleMap.m22651k().m22679a();
                obj = Boolean.valueOf(m22683e);
                result2.success(obj);
                return;
            case 26:
                m22683e = this.googleMap.m22651k().m22685g();
                obj = Boolean.valueOf(m22683e);
                result2.success(obj);
                return;
            case 27:
                this.markersController.addMarkers((List) methodCall.argument("markersToAdd"));
                this.markersController.changeMarkers((List) methodCall.argument("markersToChange"));
                this.markersController.removeMarkers((List) methodCall.argument("markerIdsToRemove"));
                result2.success(null);
                return;
            case 28:
                m22683e = this.googleMap.m22653m();
                obj = Boolean.valueOf(m22683e);
                result2.success(obj);
                return;
            case 29:
                this.tileOverlaysController.addTileOverlays((List) methodCall.argument("tileOverlaysToAdd"));
                this.tileOverlaysController.changeTileOverlays((List) methodCall.argument("tileOverlaysToChange"));
                this.tileOverlaysController.removeTileOverlays((List) methodCall.argument("tileOverlayIdsToRemove"));
                result2.success(null);
                return;
            case C1417R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                this.tileOverlaysController.clearTileCache((String) methodCall.argument("tileOverlayId"));
                result2.success(null);
                return;
            case C1417R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                this.circlesController.addCircles((List) methodCall.argument("circlesToAdd"));
                this.circlesController.changeCircles((List) methodCall.argument("circlesToChange"));
                this.circlesController.removeCircles((List) methodCall.argument("circleIdsToRemove"));
                result2.success(null);
                return;
            case C1417R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                obj = this.options.m5072N();
                result2.success(obj);
                return;
            case C1417R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                this.markersController.showMarkerInfoWindow((String) methodCall.argument("markerId"), result2);
                return;
            case C1417R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                moveCamera(Convert.toCameraUpdate(methodCall.argument("cameraUpdate"), this.density));
                result2.success(null);
                return;
            default:
                result2.notImplemented();
                return;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(InterfaceC0354k interfaceC0354k) {
        if (this.disposed) {
            return;
        }
        this.mapView.m22670d();
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, p336x6.C5629c.l
    public void onPolygonClick(C6028q c6028q) {
        this.polygonsController.onPolygonTap(c6028q.m24175a());
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, p336x6.C5629c.m
    public void onPolylineClick(C6032s c6032s) {
        this.polylinesController.onPolylineTap(c6032s.m24205a());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding.OnSaveInstanceStateListener
    public void onRestoreInstanceState(Bundle bundle) {
        if (this.disposed) {
            return;
        }
        this.mapView.m22668b(bundle);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(InterfaceC0354k interfaceC0354k) {
        if (this.disposed) {
            return;
        }
        this.mapView.m22670d();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding.OnSaveInstanceStateListener
    public void onSaveInstanceState(Bundle bundle) {
        if (this.disposed) {
            return;
        }
        this.mapView.m22671e(bundle);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(InterfaceC0354k interfaceC0354k) {
        if (this.disposed) {
            return;
        }
        this.mapView.m22672f();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(InterfaceC0354k interfaceC0354k) {
        if (this.disposed) {
            return;
        }
        this.mapView.m22673g();
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setBuildingsEnabled(boolean z10) {
        this.buildingsEnabled = z10;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setCameraTargetBounds(LatLngBounds latLngBounds) {
        this.googleMap.m22659s(latLngBounds);
    }

    public void setClusterItemClickListener(C0082c.f<MarkerBuilder> fVar) {
        if (this.googleMap == null) {
            Log.v(TAG, "Controller was disposed before GoogleMap was ready.");
        } else {
            this.clusterManagersController.setClusterItemClickListener(fVar);
        }
    }

    public void setClusterItemRenderedListener(ClusterManagersController.OnClusterItemRendered<MarkerBuilder> onClusterItemRendered) {
        if (this.googleMap == null) {
            Log.v(TAG, "Controller was disposed before GoogleMap was ready.");
        } else {
            this.clusterManagersController.setClusterItemRenderedListener(onClusterItemRendered);
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setCompassEnabled(boolean z10) {
        this.googleMap.m22651k().m22687i(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setIndoorEnabled(boolean z10) {
        this.indoorEnabled = z10;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialCircles(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        this.initialCircles = arrayList != null ? new ArrayList(arrayList) : null;
        if (this.googleMap != null) {
            updateInitialCircles();
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialClusterManagers(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        this.initialClusterManagers = arrayList != null ? new ArrayList(arrayList) : null;
        if (this.googleMap != null) {
            updateInitialClusterManagers();
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialMarkers(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        this.initialMarkers = arrayList != null ? new ArrayList(arrayList) : null;
        if (this.googleMap != null) {
            updateInitialMarkers();
        }
    }

    public void setInitialPadding(float f10, float f11, float f12, float f13) {
        List<Float> list = this.initialPadding;
        if (list == null) {
            this.initialPadding = new ArrayList();
        } else {
            list.clear();
        }
        this.initialPadding.add(Float.valueOf(f10));
        this.initialPadding.add(Float.valueOf(f11));
        this.initialPadding.add(Float.valueOf(f12));
        this.initialPadding.add(Float.valueOf(f13));
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialPolygons(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        this.initialPolygons = arrayList != null ? new ArrayList(arrayList) : null;
        if (this.googleMap != null) {
            updateInitialPolygons();
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialPolylines(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        this.initialPolylines = arrayList != null ? new ArrayList(arrayList) : null;
        if (this.googleMap != null) {
            updateInitialPolylines();
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialTileOverlays(List<Map<String, ?>> list) {
        this.initialTileOverlays = list;
        if (this.googleMap != null) {
            updateInitialTileOverlays();
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setLiteModeEnabled(boolean z10) {
        this.options.m5078T(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMapStyle(String str) {
        if (this.googleMap == null) {
            this.initialMapStyle = str;
        } else {
            updateMapStyle(str);
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMapToolbarEnabled(boolean z10) {
        this.googleMap.m22651k().m22688j(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMapType(int i10) {
        this.googleMap.m22661u(i10);
    }

    public void setMarkerCollectionListener(GoogleMapListener googleMapListener) {
        if (this.googleMap == null) {
            Log.v(TAG, "Controller was disposed before GoogleMap was ready.");
            return;
        }
        this.markerCollection.m6456m(googleMapListener);
        this.markerCollection.m6457n(googleMapListener);
        this.markerCollection.m6454k(googleMapListener);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMinMaxZoomPreference(Float f10, Float f11) {
        this.googleMap.m22655o();
        if (f10 != null) {
            this.googleMap.m22663w(f10.floatValue());
        }
        if (f11 != null) {
            this.googleMap.m22662v(f11.floatValue());
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMyLocationButtonEnabled(boolean z10) {
        if (this.myLocationButtonEnabled == z10) {
            return;
        }
        this.myLocationButtonEnabled = z10;
        if (this.googleMap != null) {
            updateMyLocationSettings();
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMyLocationEnabled(boolean z10) {
        if (this.myLocationEnabled == z10) {
            return;
        }
        this.myLocationEnabled = z10;
        if (this.googleMap != null) {
            updateMyLocationSettings();
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setPadding(float f10, float f11, float f12, float f13) {
        C5629c c5629c = this.googleMap;
        if (c5629c == null) {
            setInitialPadding(f10, f11, f12, f13);
        } else {
            float f14 = this.density;
            c5629c.m22637K((int) (f11 * f14), (int) (f10 * f14), (int) (f13 * f14), (int) (f12 * f14));
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setRotateGesturesEnabled(boolean z10) {
        this.googleMap.m22651k().m22690l(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setScrollGesturesEnabled(boolean z10) {
        this.googleMap.m22651k().m22691m(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setTiltGesturesEnabled(boolean z10) {
        this.googleMap.m22651k().m22692n(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setTrackCameraPosition(boolean z10) {
        this.trackCameraPosition = z10;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setTrafficEnabled(boolean z10) {
        this.trafficEnabled = z10;
        C5629c c5629c = this.googleMap;
        if (c5629c == null) {
            return;
        }
        c5629c.m22638L(z10);
    }

    public void setView(C5630d c5630d) {
        this.mapView = c5630d;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setZoomControlsEnabled(boolean z10) {
        if (this.zoomControlsEnabled == z10) {
            return;
        }
        this.zoomControlsEnabled = z10;
        C5629c c5629c = this.googleMap;
        if (c5629c != null) {
            c5629c.m22651k().m22693o(z10);
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setZoomGesturesEnabled(boolean z10) {
        this.googleMap.m22651k().m22694p(z10);
    }
}
