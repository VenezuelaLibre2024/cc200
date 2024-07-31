package ca;

import java.util.Set;
import p012aa.C0082c;
import p012aa.InterfaceC0080a;
import p012aa.InterfaceC0081b;

/* renamed from: ca.a */
/* loaded from: classes.dex */
public interface InterfaceC0996a<T extends InterfaceC0081b> {
    void onAdd();

    void onClustersChanged(Set<? extends InterfaceC0080a<T>> set);

    void onRemove();

    void setOnClusterClickListener(C0082c.c<T> cVar);

    void setOnClusterInfoWindowClickListener(C0082c.d<T> dVar);

    void setOnClusterInfoWindowLongClickListener(C0082c.e<T> eVar);

    void setOnClusterItemClickListener(C0082c.f<T> fVar);

    void setOnClusterItemInfoWindowClickListener(C0082c.g<T> gVar);

    void setOnClusterItemInfoWindowLongClickListener(C0082c.h<T> hVar);
}
