package io.flutter.plugins.googlemaps;

import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p336x6.C5629c;
import p367z6.C6006f;
import p367z6.C6008g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class CirclesController {
    private final float density;
    private C5629c googleMap;
    private final MethodChannel methodChannel;
    private final Map<String, CircleController> circleIdToController = new HashMap();
    private final Map<String, String> googleMapsCircleIdToDartCircleId = new HashMap();

    public CirclesController(MethodChannel methodChannel, float f10) {
        this.methodChannel = methodChannel;
        this.density = f10;
    }

    private void addCircle(Object obj) {
        if (obj == null) {
            return;
        }
        CircleBuilder circleBuilder = new CircleBuilder(this.density);
        addCircle(Convert.interpretCircleOptions(obj, circleBuilder), circleBuilder.build(), circleBuilder.consumeTapEvents());
    }

    private void addCircle(String str, C6008g c6008g, boolean z10) {
        C6006f m22641a = this.googleMap.m22641a(c6008g);
        this.circleIdToController.put(str, new CircleController(m22641a, z10, this.density));
        this.googleMapsCircleIdToDartCircleId.put(m22641a.m24095a(), str);
    }

    private void changeCircle(Object obj) {
        if (obj == null) {
            return;
        }
        CircleController circleController = this.circleIdToController.get(getCircleId(obj));
        if (circleController != null) {
            Convert.interpretCircleOptions(obj, circleController);
        }
    }

    private static String getCircleId(Object obj) {
        return (String) ((Map) obj).get("circleId");
    }

    public void addCircles(List<Object> list) {
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                addCircle(it.next());
            }
        }
    }

    public void changeCircles(List<Object> list) {
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                changeCircle(it.next());
            }
        }
    }

    public boolean onCircleTap(String str) {
        String str2 = this.googleMapsCircleIdToDartCircleId.get(str);
        if (str2 == null) {
            return false;
        }
        this.methodChannel.invokeMethod("circle#onTap", Convert.circleIdToJson(str2));
        CircleController circleController = this.circleIdToController.get(str2);
        if (circleController != null) {
            return circleController.consumeTapEvents();
        }
        return false;
    }

    public void removeCircles(List<Object> list) {
        if (list == null) {
            return;
        }
        for (Object obj : list) {
            if (obj != null) {
                CircleController remove = this.circleIdToController.remove((String) obj);
                if (remove != null) {
                    remove.remove();
                    this.googleMapsCircleIdToDartCircleId.remove(remove.getGoogleMapsCircleId());
                }
            }
        }
    }

    public void setGoogleMap(C5629c c5629c) {
        this.googleMap = c5629c;
    }
}
