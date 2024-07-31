package p352y6;

import android.os.IInterface;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p252r6.InterfaceC4307b;

/* renamed from: y6.a */
/* loaded from: classes.dex */
public interface InterfaceC5818a extends IInterface {
    /* renamed from: O */
    InterfaceC4307b mo23384O(LatLng latLng);

    /* renamed from: Q0 */
    InterfaceC4307b mo23385Q0(CameraPosition cameraPosition);

    /* renamed from: h */
    InterfaceC4307b mo23386h(LatLngBounds latLngBounds, int i10);

    /* renamed from: n1 */
    InterfaceC4307b mo23387n1(float f10);

    /* renamed from: r0 */
    InterfaceC4307b mo23388r0(float f10, int i10, int i11);

    /* renamed from: s1 */
    InterfaceC4307b mo23389s1(LatLng latLng, float f10);

    /* renamed from: u1 */
    InterfaceC4307b mo23390u1(float f10, float f11);

    InterfaceC4307b zoomBy(float f10);

    InterfaceC4307b zoomIn();

    InterfaceC4307b zoomOut();
}
