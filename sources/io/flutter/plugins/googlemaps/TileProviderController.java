package io.flutter.plugins.googlemaps;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.googlemaps.TileProviderController;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import p367z6.C5997a0;
import p367z6.InterfaceC6003d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class TileProviderController implements InterfaceC6003d0 {
    private static final String TAG = "TileProviderController";
    public final Handler handler = new Handler(Looper.getMainLooper());
    public final MethodChannel methodChannel;
    public final String tileOverlayId;

    /* loaded from: classes2.dex */
    public final class Worker implements MethodChannel.Result {
        private final CountDownLatch countDownLatch = new CountDownLatch(1);
        private Map<String, ?> result;

        /* renamed from: x */
        private final int f10928x;

        /* renamed from: y */
        private final int f10929y;
        private final int zoom;

        public Worker(int i10, int i11, int i12) {
            this.f10928x = i10;
            this.f10929y = i11;
            this.zoom = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$getTile$0() {
            TileProviderController tileProviderController = TileProviderController.this;
            tileProviderController.methodChannel.invokeMethod("tileOverlay#getTile", Convert.tileOverlayArgumentsToJson(tileProviderController.tileOverlayId, this.f10928x, this.f10929y, this.zoom), this);
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void error(String str, String str2, Object obj) {
            Log.e(TileProviderController.TAG, "Can't get tile: errorCode = " + str + ", errorMessage = " + str + ", date = " + obj);
            this.result = null;
            this.countDownLatch.countDown();
        }

        public C5997a0 getTile() {
            String format;
            TileProviderController.this.handler.post(new Runnable() { // from class: io.flutter.plugins.googlemaps.a
                @Override // java.lang.Runnable
                public final void run() {
                    TileProviderController.Worker.this.lambda$getTile$0();
                }
            });
            try {
                this.countDownLatch.await();
                try {
                    return Convert.interpretTile(this.result);
                } catch (Exception e10) {
                    e = e10;
                    format = "Can't parse tile data";
                    Log.e(TileProviderController.TAG, format, e);
                    return InterfaceC6003d0.f22396a;
                }
            } catch (InterruptedException e11) {
                e = e11;
                format = String.format("countDownLatch: can't get tile: x = %d, y= %d, zoom = %d", Integer.valueOf(this.f10928x), Integer.valueOf(this.f10929y), Integer.valueOf(this.zoom));
            }
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
            Log.e(TileProviderController.TAG, "Can't get tile: notImplemented");
            this.result = null;
            this.countDownLatch.countDown();
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(Object obj) {
            this.result = (Map) obj;
            this.countDownLatch.countDown();
        }
    }

    public TileProviderController(MethodChannel methodChannel, String str) {
        this.tileOverlayId = str;
        this.methodChannel = methodChannel;
    }

    @Override // p367z6.InterfaceC6003d0
    public C5997a0 getTile(int i10, int i11, int i12) {
        return new Worker(i10, i11, i12).getTile();
    }
}
