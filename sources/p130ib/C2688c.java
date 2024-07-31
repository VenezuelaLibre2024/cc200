package p130ib;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p130ib.C2694i;

/* renamed from: ib.c */
/* loaded from: classes.dex */
public final class C2688c {

    /* renamed from: a */
    public static final Pattern f10503a = Pattern.compile(";");

    @TargetApi(15)
    /* renamed from: a */
    public static List<Camera.Area> m10922a(int i10) {
        int i11 = -i10;
        return Collections.singletonList(new Camera.Area(new Rect(i11, i11, i10, i10), 1));
    }

    /* renamed from: b */
    public static String m10923b(String str, Collection<String> collection, String... strArr) {
        Log.i("CameraConfiguration", "Requesting " + str + " value from among: " + Arrays.toString(strArr));
        Log.i("CameraConfiguration", "Supported " + str + " values: " + collection);
        if (collection != null) {
            for (String str2 : strArr) {
                if (collection.contains(str2)) {
                    Log.i("CameraConfiguration", "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        Log.i("CameraConfiguration", "No supported values match");
        return null;
    }

    /* renamed from: c */
    public static void m10924c(Camera.Parameters parameters) {
        if ("barcode".equals(parameters.getSceneMode())) {
            Log.i("CameraConfiguration", "Barcode scene mode already set");
            return;
        }
        String m10923b = m10923b("scene mode", parameters.getSupportedSceneModes(), "barcode");
        if (m10923b != null) {
            parameters.setSceneMode(m10923b);
        }
    }

    /* renamed from: d */
    public static void m10925d(Camera.Parameters parameters, boolean z10) {
        String str;
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (minExposureCompensation != 0 || maxExposureCompensation != 0) {
            if (exposureCompensationStep > 0.0f) {
                int round = Math.round((z10 ? 0.0f : 1.5f) / exposureCompensationStep);
                float f10 = exposureCompensationStep * round;
                int max = Math.max(Math.min(round, maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() == max) {
                    str = "Exposure compensation already set to " + max + " / " + f10;
                    Log.i("CameraConfiguration", str);
                }
                Log.i("CameraConfiguration", "Setting exposure compensation to " + max + " / " + f10);
                parameters.setExposureCompensation(max);
                return;
            }
        }
        str = "Camera does not support exposure compensation";
        Log.i("CameraConfiguration", str);
    }

    /* renamed from: e */
    public static void m10926e(Camera.Parameters parameters) {
        m10927f(parameters, 10, 20);
    }

    /* renamed from: f */
    public static void m10927f(Camera.Parameters parameters, int i10, int i11) {
        String str;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        Log.i("CameraConfiguration", "Supported FPS ranges: " + m10935n(supportedPreviewFpsRange));
        if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
            return;
        }
        int[] iArr = null;
        Iterator<int[]> it = supportedPreviewFpsRange.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int[] next = it.next();
            int i12 = next[0];
            int i13 = next[1];
            if (i12 >= i10 * 1000 && i13 <= i11 * 1000) {
                iArr = next;
                break;
            }
        }
        if (iArr == null) {
            str = "No suitable FPS range?";
        } else {
            int[] iArr2 = new int[2];
            parameters.getPreviewFpsRange(iArr2);
            if (!Arrays.equals(iArr2, iArr)) {
                Log.i("CameraConfiguration", "Setting FPS range to " + Arrays.toString(iArr));
                parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                return;
            }
            str = "FPS range already set to " + Arrays.toString(iArr);
        }
        Log.i("CameraConfiguration", str);
    }

    /* renamed from: g */
    public static void m10928g(Camera.Parameters parameters, C2694i.a aVar, boolean z10) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String m10923b = (z10 || aVar == C2694i.a.AUTO) ? m10923b("focus mode", supportedFocusModes, "auto") : aVar == C2694i.a.CONTINUOUS ? m10923b("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto") : aVar == C2694i.a.INFINITY ? m10923b("focus mode", supportedFocusModes, "infinity") : aVar == C2694i.a.MACRO ? m10923b("focus mode", supportedFocusModes, "macro") : null;
        if (!z10 && m10923b == null) {
            m10923b = m10923b("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (m10923b != null) {
            if (!m10923b.equals(parameters.getFocusMode())) {
                parameters.setFocusMode(m10923b);
                return;
            }
            Log.i("CameraConfiguration", "Focus mode already set to " + m10923b);
        }
    }

    @TargetApi(15)
    /* renamed from: h */
    public static void m10929h(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() <= 0) {
            Log.i("CameraConfiguration", "Device does not support focus areas");
            return;
        }
        Log.i("CameraConfiguration", "Old focus areas: " + m10934m(parameters.getFocusAreas()));
        List<Camera.Area> m10922a = m10922a(400);
        Log.i("CameraConfiguration", "Setting focus area to : " + m10934m(m10922a));
        parameters.setFocusAreas(m10922a);
    }

    /* renamed from: i */
    public static void m10930i(Camera.Parameters parameters) {
        if ("negative".equals(parameters.getColorEffect())) {
            Log.i("CameraConfiguration", "Negative effect already set");
            return;
        }
        String m10923b = m10923b("color effect", parameters.getSupportedColorEffects(), "negative");
        if (m10923b != null) {
            parameters.setColorEffect(m10923b);
        }
    }

    @TargetApi(15)
    /* renamed from: j */
    public static void m10931j(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() <= 0) {
            Log.i("CameraConfiguration", "Device does not support metering areas");
            return;
        }
        Log.i("CameraConfiguration", "Old metering areas: " + parameters.getMeteringAreas());
        List<Camera.Area> m10922a = m10922a(400);
        Log.i("CameraConfiguration", "Setting metering area to : " + m10934m(m10922a));
        parameters.setMeteringAreas(m10922a);
    }

    /* renamed from: k */
    public static void m10932k(Camera.Parameters parameters, boolean z10) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String m10923b = z10 ? m10923b("flash mode", supportedFlashModes, "torch", "on") : m10923b("flash mode", supportedFlashModes, "off");
        if (m10923b != null) {
            if (m10923b.equals(parameters.getFlashMode())) {
                Log.i("CameraConfiguration", "Flash mode already set to " + m10923b);
                return;
            }
            Log.i("CameraConfiguration", "Setting flash mode to " + m10923b);
            parameters.setFlashMode(m10923b);
        }
    }

    @TargetApi(15)
    /* renamed from: l */
    public static void m10933l(Camera.Parameters parameters) {
        String str;
        if (!parameters.isVideoStabilizationSupported()) {
            str = "This device does not support video stabilization";
        } else {
            if (!parameters.getVideoStabilization()) {
                Log.i("CameraConfiguration", "Enabling video stabilization...");
                parameters.setVideoStabilization(true);
                return;
            }
            str = "Video stabilization already enabled";
        }
        Log.i("CameraConfiguration", str);
    }

    @TargetApi(15)
    /* renamed from: m */
    public static String m10934m(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Camera.Area area : iterable) {
            sb2.append(area.rect);
            sb2.append(':');
            sb2.append(area.weight);
            sb2.append(' ');
        }
        return sb2.toString();
    }

    /* renamed from: n */
    public static String m10935n(Collection<int[]> collection) {
        if (collection == null || collection.isEmpty()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            sb2.append(Arrays.toString(it.next()));
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
        return sb2.toString();
    }
}
