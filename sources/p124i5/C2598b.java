package p124i5;

import android.text.TextUtils;
import p109h7.C2420c;
import p222p5.C4014a;

/* renamed from: i5.b */
/* loaded from: classes.dex */
public final class C2598b {

    /* renamed from: a */
    public final int f10201a;

    /* renamed from: b */
    public final int f10202b;

    /* renamed from: c */
    public final int f10203c;

    /* renamed from: d */
    public final int f10204d;

    /* renamed from: e */
    public final int f10205e;

    public C2598b(int i10, int i11, int i12, int i13, int i14) {
        this.f10201a = i10;
        this.f10202b = i11;
        this.f10203c = i12;
        this.f10204d = i13;
        this.f10205e = i14;
    }

    /* renamed from: a */
    public static C2598b m10394a(String str) {
        char c10;
        C4014a.m15195a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < split.length; i14++) {
            String m9665e = C2420c.m9665e(split[i14].trim());
            m9665e.hashCode();
            switch (m9665e.hashCode()) {
                case 100571:
                    if (m9665e.equals("end")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (m9665e.equals("text")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 109757538:
                    if (m9665e.equals("start")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109780401:
                    if (m9665e.equals("style")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    i11 = i14;
                    break;
                case 1:
                    i13 = i14;
                    break;
                case 2:
                    i10 = i14;
                    break;
                case 3:
                    i12 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i13 == -1) {
            return null;
        }
        return new C2598b(i10, i11, i12, i13, split.length);
    }
}
