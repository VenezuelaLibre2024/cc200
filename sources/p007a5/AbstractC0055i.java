package p007a5;

import java.util.Collections;
import java.util.List;
import p276t4.InterfaceC4689a;

/* renamed from: a5.i */
/* loaded from: classes.dex */
public abstract class AbstractC0055i implements InterfaceC4689a<AbstractC0055i> {

    /* renamed from: a */
    public final String f190a;

    /* renamed from: b */
    public final List<String> f191b;

    /* renamed from: c */
    public final boolean f192c;

    public AbstractC0055i(String str, List<String> list, boolean z10) {
        this.f190a = str;
        this.f191b = Collections.unmodifiableList(list);
        this.f192c = z10;
    }
}
