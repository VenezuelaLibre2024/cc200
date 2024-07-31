package p325wb;

import java.nio.ByteBuffer;

/* renamed from: wb.b */
/* loaded from: classes.dex */
public class C5469b {
    /* renamed from: a */
    public static byte m21675a(ByteBuffer byteBuffer) {
        return byteBuffer.get(0);
    }

    /* renamed from: b */
    public static String m21676b(byte b10) {
        if (b10 == 66) {
            return "Baseline Profile";
        }
        if (b10 == 77) {
            return "Main Profile";
        }
        if (b10 == 88) {
            return "Extended Profile";
        }
        if (b10 == 100) {
            return "High Profile";
        }
        return "Unknown Profile (" + ((int) b10) + ")";
    }
}
