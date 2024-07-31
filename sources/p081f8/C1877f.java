package p081f8;

import io.flutter.plugins.firebase.analytics.Constants;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p023b8.C0515g;
import p066e8.C1733i;
import p141j8.C3262f;

/* renamed from: f8.f */
/* loaded from: classes.dex */
public class C1877f {

    /* renamed from: b */
    public static final Charset f7084b = Charset.forName("UTF-8");

    /* renamed from: a */
    public final C3262f f7085a;

    /* renamed from: f8.f$a */
    /* loaded from: classes.dex */
    public class a extends JSONObject {

        /* renamed from: a */
        public final /* synthetic */ String f7086a;

        public a(String str) {
            this.f7086a = str;
            put(Constants.USER_ID, str);
        }
    }

    public C1877f(C3262f c3262f) {
        this.f7085a = c3262f;
    }

    /* renamed from: e */
    public static Map<String, String> m7639e(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m7645o(jSONObject, next));
        }
        return hashMap;
    }

    /* renamed from: f */
    public static List<AbstractC1880i> m7640f(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                arrayList.add(AbstractC1880i.m7688a(string));
            } catch (Exception e10) {
                C0515g.m2482f().m2493l("Failed de-serializing rollouts state. " + string, e10);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static String m7641h(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    /* renamed from: l */
    public static String m7642l(List<AbstractC1880i> list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(AbstractC1880i.f7112a.mo16195b(list.get(i10))));
            } catch (JSONException e10) {
                C0515g.m2482f().m2493l("Exception parsing rollout assignment!", e10);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    /* renamed from: m */
    public static void m7643m(File file) {
        if (file.exists() && file.delete()) {
            C0515g.m2482f().m2488g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    /* renamed from: n */
    public static String m7644n(String str) {
        return new a(str).toString();
    }

    /* renamed from: o */
    public static String m7645o(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    /* renamed from: a */
    public File m7646a(String str) {
        return this.f7085a.m11809o(str, "internal-keys");
    }

    /* renamed from: b */
    public File m7647b(String str) {
        return this.f7085a.m11809o(str, "keys");
    }

    /* renamed from: c */
    public File m7648c(String str) {
        return this.f7085a.m11809o(str, "rollouts-state");
    }

    /* renamed from: d */
    public File m7649d(String str) {
        return this.f7085a.m11809o(str, "user-data");
    }

    /* renamed from: g */
    public final String m7650g(String str) {
        return m7645o(new JSONObject(str), Constants.USER_ID);
    }

    /* renamed from: i */
    public Map<String, String> m7651i(String str, boolean z10) {
        FileInputStream fileInputStream;
        Exception e10;
        File m7646a = z10 ? m7646a(str) : m7647b(str);
        if (!m7646a.exists() || m7646a.length() == 0) {
            m7643m(m7646a);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(m7646a);
        } catch (Exception e11) {
            fileInputStream = null;
            e10 = e11;
        } catch (Throwable th) {
            th = th;
            C1733i.m6818f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
        try {
            try {
                Map<String, String> m7639e = m7639e(C1733i.m6812A(fileInputStream));
                C1733i.m6818f(fileInputStream, "Failed to close user metadata file.");
                return m7639e;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                C1733i.m6818f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e12) {
            e10 = e12;
            C0515g.m2482f().m2493l("Error deserializing user metadata.", e10);
            m7643m(m7646a);
            C1733i.m6818f(fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        }
    }

    /* renamed from: j */
    public List<AbstractC1880i> m7652j(String str) {
        File m7648c = m7648c(str);
        if (!m7648c.exists() || m7648c.length() == 0) {
            m7643m(m7648c);
            return Collections.emptyList();
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(m7648c);
                try {
                    List<AbstractC1880i> m7640f = m7640f(C1733i.m6812A(fileInputStream2));
                    C0515g.m2482f().m2484b("Loaded rollouts state:\n" + m7640f + "\nfor session " + str);
                    C1733i.m6818f(fileInputStream2, "Failed to close rollouts state file.");
                    return m7640f;
                } catch (Exception e10) {
                    e = e10;
                    fileInputStream = fileInputStream2;
                    C0515g.m2482f().m2493l("Error deserializing rollouts state.", e);
                    m7643m(m7648c);
                    C1733i.m6818f(fileInputStream, "Failed to close rollouts state file.");
                    return Collections.emptyList();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    C1733i.m6818f(fileInputStream, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* renamed from: k */
    public String m7653k(String str) {
        FileInputStream fileInputStream;
        File m7649d = m7649d(str);
        FileInputStream fileInputStream2 = null;
        if (!m7649d.exists() || m7649d.length() == 0) {
            C0515g.m2482f().m2484b("No userId set for session " + str);
            m7643m(m7649d);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(m7649d);
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
            C1733i.m6818f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
        try {
            try {
                String m7650g = m7650g(C1733i.m6812A(fileInputStream));
                C0515g.m2482f().m2484b("Loaded userId " + m7650g + " for session " + str);
                C1733i.m6818f(fileInputStream, "Failed to close user metadata file.");
                return m7650g;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                C1733i.m6818f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            C0515g.m2482f().m2493l("Error deserializing user metadata.", e);
            m7643m(m7649d);
            C1733i.m6818f(fileInputStream, "Failed to close user metadata file.");
            return null;
        }
    }

    /* renamed from: p */
    public void m7654p(String str, Map<String, String> map) {
        m7655q(str, map, false);
    }

    /* renamed from: q */
    public void m7655q(String str, Map<String, String> map, boolean z10) {
        File m7646a = z10 ? m7646a(str) : m7647b(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String m7641h = m7641h(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(m7646a), f7084b));
                try {
                    bufferedWriter2.write(m7641h);
                    bufferedWriter2.flush();
                    C1733i.m6818f(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    C0515g.m2482f().m2493l("Error serializing key/value metadata.", e);
                    m7643m(m7646a);
                    C1733i.m6818f(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    C1733i.m6818f(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: r */
    public void m7656r(String str, List<AbstractC1880i> list) {
        File m7648c = m7648c(str);
        if (list.isEmpty()) {
            m7643m(m7648c);
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String m7642l = m7642l(list);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(m7648c), f7084b));
                try {
                    bufferedWriter2.write(m7642l);
                    bufferedWriter2.flush();
                    C1733i.m6818f(bufferedWriter2, "Failed to close rollouts state file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    C0515g.m2482f().m2493l("Error serializing rollouts state.", e);
                    m7643m(m7648c);
                    C1733i.m6818f(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    C1733i.m6818f(bufferedWriter, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: s */
    public void m7657s(String str, String str2) {
        File m7649d = m7649d(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String m7644n = m7644n(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(m7649d), f7084b));
                try {
                    bufferedWriter2.write(m7644n);
                    bufferedWriter2.flush();
                    C1733i.m6818f(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    C0515g.m2482f().m2493l("Error serializing user metadata.", e);
                    C1733i.m6818f(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    C1733i.m6818f(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }
}
