package na;

import android.hardware.Camera;
import android.util.Log;

/* renamed from: na.a */
/* loaded from: classes.dex */
public final class C3782a {

    /* renamed from: a */
    public static final String f13630a = "na.a";

    /* renamed from: a */
    public static int m14390a(int i10) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w(f13630a, "No cameras!");
            return -1;
        }
        boolean z10 = i10 >= 0;
        if (!z10) {
            i10 = 0;
            while (i10 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i10, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i10++;
            }
        }
        return i10 < numberOfCameras ? i10 : z10 ? -1 : 0;
    }

    /* renamed from: b */
    public static Camera m14391b(int i10) {
        int m14390a = m14390a(i10);
        if (m14390a == -1) {
            return null;
        }
        return Camera.open(m14390a);
    }
}
