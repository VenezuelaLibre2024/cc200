package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p052da.C1607b;
import p367z6.C6020m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class MarkersController {
    private final ClusterManagersController clusterManagersController;
    private C1607b.a markerCollection;
    private final MethodChannel methodChannel;
    private final HashMap<String, MarkerBuilder> markerIdToMarkerBuilder = new HashMap<>();
    private final HashMap<String, MarkerController> markerIdToController = new HashMap<>();
    private final HashMap<String, String> googleMapsMarkerIdToDartMarkerId = new HashMap<>();

    public MarkersController(MethodChannel methodChannel, ClusterManagersController clusterManagersController) {
        this.methodChannel = methodChannel;
        this.clusterManagersController = clusterManagersController;
    }

    private void addMarker(MarkerBuilder markerBuilder) {
        if (markerBuilder == null) {
            return;
        }
        String markerId = markerBuilder.markerId();
        this.markerIdToMarkerBuilder.put(markerId, markerBuilder);
        if (markerBuilder.clusterManagerId() == null) {
            addMarkerToCollection(markerId, markerBuilder);
        } else {
            addMarkerBuilderForCluster(markerBuilder);
        }
    }

    private void addMarker(Object obj) {
        if (obj == null) {
            return;
        }
        String markerId = getMarkerId(obj);
        if (markerId == null) {
            throw new IllegalArgumentException("markerId was null");
        }
        MarkerBuilder markerBuilder = new MarkerBuilder(markerId, getClusterManagerId(obj));
        Convert.interpretMarkerOptions(obj, markerBuilder);
        addMarker(markerBuilder);
    }

    private void addMarkerBuilderForCluster(MarkerBuilder markerBuilder) {
        this.clusterManagersController.addItem(markerBuilder);
    }

    private void addMarkerToCollection(String str, MarkerBuilder markerBuilder) {
        createControllerForMarker(str, this.markerCollection.m6452i(markerBuilder.build()), markerBuilder.consumeTapEvents());
    }

    private void changeMarker(Object obj) {
        String markerId;
        MarkerBuilder markerBuilder;
        if (obj == null || (markerBuilder = this.markerIdToMarkerBuilder.get((markerId = getMarkerId(obj)))) == null) {
            return;
        }
        if (!Objects.equals(getClusterManagerId(obj), markerBuilder.clusterManagerId())) {
            removeMarker(markerId);
            addMarker(obj);
            return;
        }
        Convert.interpretMarkerOptions(obj, markerBuilder);
        MarkerController markerController = this.markerIdToController.get(markerId);
        if (markerController != null) {
            Convert.interpretMarkerOptions(obj, markerController);
        }
    }

    private void createControllerForMarker(String str, C6020m c6020m, boolean z10) {
        this.markerIdToController.put(str, new MarkerController(c6020m, z10));
        this.googleMapsMarkerIdToDartMarkerId.put(c6020m.m24122a(), str);
    }

    private static String getClusterManagerId(Object obj) {
        return (String) ((Map) obj).get("clusterManagerId");
    }

    private static String getMarkerId(Object obj) {
        return (String) ((Map) obj).get("markerId");
    }

    private void removeMarker(String str) {
        C1607b.a aVar;
        MarkerBuilder remove = this.markerIdToMarkerBuilder.remove(str);
        if (remove == null) {
            return;
        }
        MarkerController remove2 = this.markerIdToController.remove(str);
        if (remove.clusterManagerId() != null) {
            this.clusterManagersController.removeItem(remove);
        } else if (remove2 != null && (aVar = this.markerCollection) != null) {
            remove2.removeFromCollection(aVar);
        }
        if (remove2 != null) {
            this.googleMapsMarkerIdToDartMarkerId.remove(remove2.getGoogleMapsMarkerId());
        }
    }

    public void addMarkers(List<Object> list) {
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                addMarker(it.next());
            }
        }
    }

    public void changeMarkers(List<Object> list) {
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                changeMarker(it.next());
            }
        }
    }

    public void hideMarkerInfoWindow(String str, MethodChannel.Result result) {
        MarkerController markerController = this.markerIdToController.get(str);
        if (markerController == null) {
            result.error("Invalid markerId", "hideInfoWindow called with invalid markerId", null);
        } else {
            markerController.hideInfoWindow();
            result.success(null);
        }
    }

    public void isInfoWindowShown(String str, MethodChannel.Result result) {
        MarkerController markerController = this.markerIdToController.get(str);
        if (markerController != null) {
            result.success(Boolean.valueOf(markerController.isInfoWindowShown()));
        } else {
            result.error("Invalid markerId", "isInfoWindowShown called with invalid markerId", null);
        }
    }

    public void onClusterItemRendered(MarkerBuilder markerBuilder, C6020m c6020m) {
        if (this.markerIdToMarkerBuilder.get(markerBuilder.markerId()) == markerBuilder) {
            createControllerForMarker(markerBuilder.markerId(), c6020m, markerBuilder.consumeTapEvents());
        }
    }

    public void onInfoWindowTap(String str) {
        String str2 = this.googleMapsMarkerIdToDartMarkerId.get(str);
        if (str2 == null) {
            return;
        }
        this.methodChannel.invokeMethod("infoWindow#onTap", Convert.markerIdToJson(str2));
    }

    public boolean onMapsMarkerTap(String str) {
        String str2 = this.googleMapsMarkerIdToDartMarkerId.get(str);
        if (str2 == null) {
            return false;
        }
        return onMarkerTap(str2);
    }

    public void onMarkerDrag(String str, LatLng latLng) {
        String str2 = this.googleMapsMarkerIdToDartMarkerId.get(str);
        if (str2 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("markerId", str2);
        hashMap.put("position", Convert.latLngToJson(latLng));
        this.methodChannel.invokeMethod("marker#onDrag", hashMap);
    }

    public void onMarkerDragEnd(String str, LatLng latLng) {
        String str2 = this.googleMapsMarkerIdToDartMarkerId.get(str);
        if (str2 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("markerId", str2);
        hashMap.put("position", Convert.latLngToJson(latLng));
        this.methodChannel.invokeMethod("marker#onDragEnd", hashMap);
    }

    public void onMarkerDragStart(String str, LatLng latLng) {
        String str2 = this.googleMapsMarkerIdToDartMarkerId.get(str);
        if (str2 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("markerId", str2);
        hashMap.put("position", Convert.latLngToJson(latLng));
        this.methodChannel.invokeMethod("marker#onDragStart", hashMap);
    }

    public boolean onMarkerTap(String str) {
        this.methodChannel.invokeMethod("marker#onTap", Convert.markerIdToJson(str));
        MarkerController markerController = this.markerIdToController.get(str);
        if (markerController != null) {
            return markerController.consumeTapEvents();
        }
        return false;
    }

    public void removeMarkers(List<Object> list) {
        if (list == null) {
            return;
        }
        for (Object obj : list) {
            if (obj != null) {
                removeMarker((String) obj);
            }
        }
    }

    public void setCollection(C1607b.a aVar) {
        this.markerCollection = aVar;
    }

    public void showMarkerInfoWindow(String str, MethodChannel.Result result) {
        MarkerController markerController = this.markerIdToController.get(str);
        if (markerController == null) {
            result.error("Invalid markerId", "showInfoWindow called with invalid markerId", null);
        } else {
            markerController.showInfoWindow();
            result.success(null);
        }
    }
}
