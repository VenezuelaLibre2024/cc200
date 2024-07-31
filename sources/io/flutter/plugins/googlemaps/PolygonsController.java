package io.flutter.plugins.googlemaps;

import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p336x6.C5629c;
import p367z6.C6028q;
import p367z6.C6030r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class PolygonsController {
    private final float density;
    private C5629c googleMap;
    private final MethodChannel methodChannel;
    private final Map<String, PolygonController> polygonIdToController = new HashMap();
    private final Map<String, String> googleMapsPolygonIdToDartPolygonId = new HashMap();

    public PolygonsController(MethodChannel methodChannel, float f10) {
        this.methodChannel = methodChannel;
        this.density = f10;
    }

    private void addPolygon(Object obj) {
        if (obj == null) {
            return;
        }
        PolygonBuilder polygonBuilder = new PolygonBuilder(this.density);
        addPolygon(Convert.interpretPolygonOptions(obj, polygonBuilder), polygonBuilder.build(), polygonBuilder.consumeTapEvents());
    }

    private void addPolygon(String str, C6030r c6030r, boolean z10) {
        C6028q m22643c = this.googleMap.m22643c(c6030r);
        this.polygonIdToController.put(str, new PolygonController(m22643c, z10, this.density));
        this.googleMapsPolygonIdToDartPolygonId.put(m22643c.m24175a(), str);
    }

    private void changePolygon(Object obj) {
        if (obj == null) {
            return;
        }
        PolygonController polygonController = this.polygonIdToController.get(getPolygonId(obj));
        if (polygonController != null) {
            Convert.interpretPolygonOptions(obj, polygonController);
        }
    }

    private static String getPolygonId(Object obj) {
        return (String) ((Map) obj).get("polygonId");
    }

    public void addPolygons(List<Object> list) {
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                addPolygon(it.next());
            }
        }
    }

    public void changePolygons(List<Object> list) {
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                changePolygon(it.next());
            }
        }
    }

    public boolean onPolygonTap(String str) {
        String str2 = this.googleMapsPolygonIdToDartPolygonId.get(str);
        if (str2 == null) {
            return false;
        }
        this.methodChannel.invokeMethod("polygon#onTap", Convert.polygonIdToJson(str2));
        PolygonController polygonController = this.polygonIdToController.get(str2);
        if (polygonController != null) {
            return polygonController.consumeTapEvents();
        }
        return false;
    }

    public void removePolygons(List<Object> list) {
        if (list == null) {
            return;
        }
        for (Object obj : list) {
            if (obj != null) {
                PolygonController remove = this.polygonIdToController.remove((String) obj);
                if (remove != null) {
                    remove.remove();
                    this.googleMapsPolygonIdToDartPolygonId.remove(remove.getGoogleMapsPolygonId());
                }
            }
        }
    }

    public void setGoogleMap(C5629c c5629c) {
        this.googleMap = c5629c;
    }
}
