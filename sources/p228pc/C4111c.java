package p228pc;

import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: pc.c */
/* loaded from: classes2.dex */
public class C4111c extends AbstractC4109a {

    /* renamed from: a */
    public final Map<String, Object> f14825a;

    /* renamed from: b */
    public final a f14826b = new a();

    /* renamed from: c */
    public final boolean f14827c;

    /* renamed from: pc.c$a */
    /* loaded from: classes2.dex */
    public class a implements InterfaceC4114f {

        /* renamed from: a */
        public Object f14828a;

        /* renamed from: b */
        public String f14829b;

        /* renamed from: c */
        public String f14830c;

        /* renamed from: d */
        public Object f14831d;

        public a() {
        }

        @Override // p228pc.InterfaceC4114f
        public void error(String str, String str2, Object obj) {
            this.f14829b = str;
            this.f14830c = str2;
            this.f14831d = obj;
        }

        @Override // p228pc.InterfaceC4114f
        public void success(Object obj) {
            this.f14828a = obj;
        }
    }

    public C4111c(Map<String, Object> map, boolean z10) {
        this.f14825a = map;
        this.f14827c = z10;
    }

    @Override // p228pc.InterfaceC4113e
    /* renamed from: a */
    public <T> T mo15879a(String str) {
        return (T) this.f14825a.get(str);
    }

    @Override // p228pc.AbstractC4110b, p228pc.InterfaceC4113e
    /* renamed from: c */
    public boolean mo15871c() {
        return this.f14827c;
    }

    @Override // p228pc.InterfaceC4113e
    /* renamed from: f */
    public String mo15880f() {
        return (String) this.f14825a.get(Constants.METHOD);
    }

    @Override // p228pc.InterfaceC4113e
    /* renamed from: g */
    public boolean mo15881g(String str) {
        return this.f14825a.containsKey(str);
    }

    @Override // p228pc.AbstractC4109a
    /* renamed from: m */
    public InterfaceC4114f mo15869m() {
        return this.f14826b;
    }

    /* renamed from: n */
    public Map<String, Object> m15882n() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("code", this.f14826b.f14829b);
        hashMap2.put(Constants.MESSAGE, this.f14826b.f14830c);
        hashMap2.put("data", this.f14826b.f14831d);
        hashMap.put(ImagePickerCache.MAP_KEY_ERROR, hashMap2);
        return hashMap;
    }

    /* renamed from: o */
    public Map<String, Object> m15883o() {
        HashMap hashMap = new HashMap();
        hashMap.put("result", this.f14826b.f14828a);
        return hashMap;
    }

    /* renamed from: p */
    public void m15884p(MethodChannel.Result result) {
        a aVar = this.f14826b;
        result.error(aVar.f14829b, aVar.f14830c, aVar.f14831d);
    }

    /* renamed from: q */
    public void m15885q(List<Map<String, Object>> list) {
        if (mo15871c()) {
            return;
        }
        list.add(m15882n());
    }

    /* renamed from: r */
    public void m15886r(List<Map<String, Object>> list) {
        if (mo15871c()) {
            return;
        }
        list.add(m15883o());
    }
}
