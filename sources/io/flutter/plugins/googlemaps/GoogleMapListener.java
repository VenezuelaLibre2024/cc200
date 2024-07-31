package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import p336x6.C5629c;
import p367z6.C6006f;
import p367z6.C6020m;
import p367z6.C6028q;
import p367z6.C6032s;

/* loaded from: classes2.dex */
interface GoogleMapListener extends C5629c.b, C5629c.c, C5629c.d, C5629c.f, C5629c.j, C5629c.l, C5629c.m, C5629c.e, C5629c.h, C5629c.i, C5629c.k {
    @Override // p336x6.C5629c.b
    /* synthetic */ void onCameraIdle();

    /* synthetic */ void onCameraMove();

    /* synthetic */ void onCameraMoveStarted(int i10);

    /* synthetic */ void onCircleClick(C6006f c6006f);

    /* synthetic */ void onInfoWindowClick(C6020m c6020m);

    /* synthetic */ void onMapClick(LatLng latLng);

    /* synthetic */ void onMapLongClick(LatLng latLng);

    /* synthetic */ boolean onMarkerClick(C6020m c6020m);

    /* synthetic */ void onMarkerDrag(C6020m c6020m);

    /* synthetic */ void onMarkerDragEnd(C6020m c6020m);

    /* synthetic */ void onMarkerDragStart(C6020m c6020m);

    /* synthetic */ void onPolygonClick(C6028q c6028q);

    /* synthetic */ void onPolylineClick(C6032s c6032s);
}
