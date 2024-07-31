package io.flutter.plugins.googlemaps;

import android.content.Context;
import ca.C1001f;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p012aa.C0082c;
import p012aa.InterfaceC0080a;
import p012aa.InterfaceC0081b;
import p052da.C1607b;
import p336x6.C5629c;
import p367z6.C6020m;
import p367z6.C6022n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ClusterManagersController implements C5629c.b, C0082c.c<MarkerBuilder> {
    private C0082c.f<MarkerBuilder> clusterItemClickListener;
    private OnClusterItemRendered<MarkerBuilder> clusterItemRenderedListener;
    private final HashMap<String, C0082c<MarkerBuilder>> clusterManagerIdToManager = new HashMap<>();
    private final Context context;
    private C5629c googleMap;
    private C1607b markerManager;
    private final MethodChannel methodChannel;

    /* loaded from: classes2.dex */
    public static class ClusterRenderer<T extends MarkerBuilder> extends C1001f<T> {
        private final ClusterManagersController clusterManagersController;

        public ClusterRenderer(Context context, C5629c c5629c, C0082c<T> c0082c, ClusterManagersController clusterManagersController) {
            super(context, c5629c, c0082c);
            this.clusterManagersController = clusterManagersController;
        }

        @Override // ca.C1001f
        public void onBeforeClusterItemRendered(T t10, C6022n c6022n) {
            t10.update(c6022n);
        }

        @Override // ca.C1001f
        public void onClusterItemRendered(T t10, C6020m c6020m) {
            super.onClusterItemRendered((ClusterRenderer<T>) t10, c6020m);
            this.clusterManagersController.onClusterItemRendered(t10, c6020m);
        }
    }

    /* loaded from: classes2.dex */
    public interface OnClusterItemRendered<T extends InterfaceC0081b> {
        void onClusterItemRendered(T t10, C6020m c6020m);
    }

    public ClusterManagersController(MethodChannel methodChannel, Context context) {
        this.context = context;
        this.methodChannel = methodChannel;
    }

    private static String getClusterManagerId(Object obj) {
        return (String) ((Map) obj).get("clusterManagerId");
    }

    private void initListenersForClusterManager(C0082c<MarkerBuilder> c0082c, C0082c.c<MarkerBuilder> cVar, C0082c.f<MarkerBuilder> fVar) {
        c0082c.m347j(cVar);
        c0082c.m348k(fVar);
    }

    private void initListenersForClusterManagers() {
        Iterator<Map.Entry<String, C0082c<MarkerBuilder>>> it = this.clusterManagerIdToManager.entrySet().iterator();
        while (it.hasNext()) {
            initListenersForClusterManager(it.next().getValue(), this, this.clusterItemClickListener);
        }
    }

    private void removeClusterManager(Object obj) {
        C0082c<MarkerBuilder> remove = this.clusterManagerIdToManager.remove(obj);
        if (remove == null) {
            return;
        }
        initListenersForClusterManager(remove, null, null);
        remove.m340c();
        remove.m341d();
    }

    public void addClusterManager(Object obj) {
        String clusterManagerId = getClusterManagerId(obj);
        if (clusterManagerId == null) {
            throw new IllegalArgumentException("clusterManagerId was null");
        }
        C0082c<MarkerBuilder> c0082c = new C0082c<>(this.context, this.googleMap, this.markerManager);
        c0082c.m349l(new ClusterRenderer(this.context, this.googleMap, c0082c, this));
        initListenersForClusterManager(c0082c, this, this.clusterItemClickListener);
        this.clusterManagerIdToManager.put(clusterManagerId, c0082c);
    }

    public void addClusterManagers(List<Object> list) {
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            addClusterManager(it.next());
        }
    }

    public void addItem(MarkerBuilder markerBuilder) {
        C0082c<MarkerBuilder> c0082c = this.clusterManagerIdToManager.get(markerBuilder.clusterManagerId());
        if (c0082c != null) {
            c0082c.m339b(markerBuilder);
            c0082c.m341d();
        }
    }

    public void getClustersWithClusterManagerId(String str, MethodChannel.Result result) {
        C0082c<MarkerBuilder> c0082c = this.clusterManagerIdToManager.get(str);
        if (c0082c != null) {
            result.success(Convert.clustersToJson(str, c0082c.m342e().mo2546b(this.googleMap.m22647g().f4587i)));
            return;
        }
        result.error("Invalid clusterManagerId", "getClusters called with invalid clusterManagerId:" + str, null);
    }

    public void init(C5629c c5629c, C1607b c1607b) {
        this.markerManager = c1607b;
        this.googleMap = c5629c;
    }

    @Override // p336x6.C5629c.b
    public void onCameraIdle() {
        Iterator<Map.Entry<String, C0082c<MarkerBuilder>>> it = this.clusterManagerIdToManager.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onCameraIdle();
        }
    }

    @Override // p012aa.C0082c.c
    public boolean onClusterClick(InterfaceC0080a<MarkerBuilder> interfaceC0080a) {
        if (interfaceC0080a.mo337c() > 0) {
            this.methodChannel.invokeMethod("cluster#onTap", Convert.clusterToJson(((MarkerBuilder[]) interfaceC0080a.mo336b().toArray(new MarkerBuilder[0]))[0].clusterManagerId(), interfaceC0080a));
        }
        return false;
    }

    public void onClusterItemRendered(MarkerBuilder markerBuilder, C6020m c6020m) {
        OnClusterItemRendered<MarkerBuilder> onClusterItemRendered = this.clusterItemRenderedListener;
        if (onClusterItemRendered != null) {
            onClusterItemRendered.onClusterItemRendered(markerBuilder, c6020m);
        }
    }

    public void removeClusterManagers(List<Object> list) {
        for (Object obj : list) {
            if (obj != null) {
                removeClusterManager((String) obj);
            }
        }
    }

    public void removeItem(MarkerBuilder markerBuilder) {
        C0082c<MarkerBuilder> c0082c = this.clusterManagerIdToManager.get(markerBuilder.clusterManagerId());
        if (c0082c != null) {
            c0082c.m346i(markerBuilder);
            c0082c.m341d();
        }
    }

    public void setClusterItemClickListener(C0082c.f<MarkerBuilder> fVar) {
        this.clusterItemClickListener = fVar;
        initListenersForClusterManagers();
    }

    public void setClusterItemRenderedListener(OnClusterItemRendered<MarkerBuilder> onClusterItemRendered) {
        this.clusterItemRenderedListener = onClusterItemRendered;
    }
}
