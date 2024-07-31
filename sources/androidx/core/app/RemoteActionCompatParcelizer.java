package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import p362z1.AbstractC5943b;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC5943b abstractC5943b) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1153a = (IconCompat) abstractC5943b.m23831v(remoteActionCompat.f1153a, 1);
        remoteActionCompat.f1154b = abstractC5943b.m23821l(remoteActionCompat.f1154b, 2);
        remoteActionCompat.f1155c = abstractC5943b.m23821l(remoteActionCompat.f1155c, 3);
        remoteActionCompat.f1156d = (PendingIntent) abstractC5943b.m23827r(remoteActionCompat.f1156d, 4);
        remoteActionCompat.f1157e = abstractC5943b.m23817h(remoteActionCompat.f1157e, 5);
        remoteActionCompat.f1158f = abstractC5943b.m23817h(remoteActionCompat.f1158f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC5943b abstractC5943b) {
        abstractC5943b.m23833x(false, false);
        abstractC5943b.m23808M(remoteActionCompat.f1153a, 1);
        abstractC5943b.m23799D(remoteActionCompat.f1154b, 2);
        abstractC5943b.m23799D(remoteActionCompat.f1155c, 3);
        abstractC5943b.m23803H(remoteActionCompat.f1156d, 4);
        abstractC5943b.m23835z(remoteActionCompat.f1157e, 5);
        abstractC5943b.m23835z(remoteActionCompat.f1158f, 6);
    }
}
