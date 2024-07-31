package io.flutter.plugins.googlemaps;

import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p336x6.C5629c;
import p367z6.C6032s;
import p367z6.C6034t;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class PolylinesController {
    private final float density;
    private C5629c googleMap;
    private final MethodChannel methodChannel;
    private final Map<String, PolylineController> polylineIdToController = new HashMap();
    private final Map<String, String> googleMapsPolylineIdToDartPolylineId = new HashMap();

    public PolylinesController(MethodChannel methodChannel, float f10) {
        this.methodChannel = methodChannel;
        this.density = f10;
    }

    private void addPolyline(Object obj) {
        if (obj == null) {
            return;
        }
        PolylineBuilder polylineBuilder = new PolylineBuilder(this.density);
        addPolyline(Convert.interpretPolylineOptions(obj, polylineBuilder), polylineBuilder.build(), polylineBuilder.consumeTapEvents());
    }

    private void addPolyline(String str, C6034t c6034t, boolean z10) {
        C6032s m22644d = this.googleMap.m22644d(c6034t);
        this.polylineIdToController.put(str, new PolylineController(m22644d, z10, this.density));
        this.googleMapsPolylineIdToDartPolylineId.put(m22644d.m24205a(), str);
    }

    private void changePolyline(Object obj) {
        if (obj == null) {
            return;
        }
        PolylineController polylineController = this.polylineIdToController.get(getPolylineId(obj));
        if (polylineController != null) {
            Convert.interpretPolylineOptions(obj, polylineController);
        }
    }

    private static String getPolylineId(Object obj) {
        return (String) ((Map) obj).get("polylineId");
    }

    public void addPolylines(List<Object> list) {
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                addPolyline(it.next());
            }
        }
    }

    public void changePolylines(List<Object> list) {
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                changePolyline(it.next());
            }
        }
    }

    public boolean onPolylineTap(String str) {
        String str2 = this.googleMapsPolylineIdToDartPolylineId.get(str);
        if (str2 == null) {
            return false;
        }
        this.methodChannel.invokeMethod("polyline#onTap", Convert.polylineIdToJson(str2));
        PolylineController polylineController = this.polylineIdToController.get(str2);
        if (polylineController != null) {
            return polylineController.consumeTapEvents();
        }
        return false;
    }

    public void removePolylines(List<Object> list) {
        if (list == null) {
            return;
        }
        for (Object obj : list) {
            if (obj != null) {
                PolylineController remove = this.polylineIdToController.remove((String) obj);
                if (remove != null) {
                    remove.remove();
                    this.googleMapsPolylineIdToDartPolylineId.remove(remove.getGoogleMapsPolylineId());
                }
            }
        }
    }

    public void setGoogleMap(C5629c c5629c) {
        this.googleMap = c5629c;
    }
}
