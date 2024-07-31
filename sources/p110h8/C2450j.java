package p110h8;

import android.util.Base64;
import android.util.JsonReader;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p098g8.AbstractC2135f0;
import p098g8.C2124a;
import p239q8.InterfaceC4202a;
import p269s8.C4553d;

/* renamed from: h8.j */
/* loaded from: classes.dex */
public class C2450j {

    /* renamed from: a */
    public static final InterfaceC4202a f9792a = new C4553d().m17993j(C2124a.f8225a).m17994k(true).m17992i();

    /* renamed from: h8.j$a */
    /* loaded from: classes.dex */
    public interface a<T> {
        /* renamed from: a */
        T mo9736a(JsonReader jsonReader);
    }

    /* renamed from: A */
    public static AbstractC2135f0.e.d.f m9737A(JsonReader jsonReader) {
        AbstractC2135f0.e.d.f.a m8676a = AbstractC2135f0.e.d.f.m8676a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("assignments")) {
                m8676a.mo8679b(m9759n(jsonReader, new a() { // from class: h8.b
                    @Override // p110h8.C2450j.a
                    /* renamed from: a */
                    public final Object mo9736a(JsonReader jsonReader2) {
                        AbstractC2135f0.e.d.AbstractC6180e m9771z;
                        m9771z = C2450j.m9771z(jsonReader2);
                        return m9771z;
                    }
                }));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m8676a.mo8678a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: B */
    public static AbstractC2135f0.e.d.a.b.AbstractC6172d m9738B(JsonReader jsonReader) {
        AbstractC2135f0.e.d.a.b.AbstractC6172d.AbstractC6173a m8597a = AbstractC2135f0.e.d.a.b.AbstractC6172d.m8597a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals("address")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals("code")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m8597a.mo8602b(jsonReader.nextLong());
                    break;
                case 1:
                    m8597a.mo8603c(jsonReader.nextString());
                    break;
                case 2:
                    m8597a.mo8604d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m8597a.mo8601a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: C */
    public static AbstractC2135f0.e.d.a.b.AbstractC6174e m9739C(JsonReader jsonReader) {
        AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6175a m8605a = AbstractC2135f0.e.d.a.b.AbstractC6174e.m8605a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m8605a.mo8610b(m9759n(jsonReader, C2444d.f9786a));
                    break;
                case 1:
                    m8605a.mo8612d(jsonReader.nextString());
                    break;
                case 2:
                    m8605a.mo8611c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m8605a.mo8609a();
    }

    /* renamed from: D */
    public static AbstractC2135f0.d.b m9740D(JsonReader jsonReader) {
        AbstractC2135f0.d.b.a m8462a = AbstractC2135f0.d.b.m8462a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("filename")) {
                m8462a.mo8467c(jsonReader.nextString());
            } else if (nextName.equals("contents")) {
                m8462a.mo8466b(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m8462a.mo8465a();
    }

    /* renamed from: E */
    public static AbstractC2135f0.d m9741E(JsonReader jsonReader) {
        AbstractC2135f0.d.a m8461a = AbstractC2135f0.d.m8461a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("files")) {
                m8461a.mo8448b(m9759n(jsonReader, new a() { // from class: h8.g
                    @Override // p110h8.C2450j.a
                    /* renamed from: a */
                    public final Object mo9736a(JsonReader jsonReader2) {
                        AbstractC2135f0.d.b m9740D;
                        m9740D = C2450j.m9740D(jsonReader2);
                        return m9740D;
                    }
                }));
            } else if (nextName.equals("orgId")) {
                m8461a.mo8449c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m8461a.mo8447a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: F */
    public static AbstractC2135f0.e.AbstractC6181e m9742F(JsonReader jsonReader) {
        AbstractC2135f0.e.AbstractC6181e.a m8680a = AbstractC2135f0.e.AbstractC6181e.m8680a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m8680a.mo8686b(jsonReader.nextString());
                    break;
                case 1:
                    m8680a.mo8687c(jsonReader.nextBoolean());
                    break;
                case 2:
                    m8680a.mo8689e(jsonReader.nextString());
                    break;
                case 3:
                    m8680a.mo8688d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m8680a.mo8685a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: G */
    public static AbstractC2135f0.e.d.a.c m9743G(JsonReader jsonReader) {
        AbstractC2135f0.e.d.a.c.AbstractC6178a m8625a = AbstractC2135f0.e.d.a.c.m8625a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1694598382:
                    if (nextName.equals("defaultProcess")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m8625a.mo8633d(jsonReader.nextInt());
                    break;
                case 1:
                    m8625a.mo8634e(jsonReader.nextString());
                    break;
                case 2:
                    m8625a.mo8631b(jsonReader.nextBoolean());
                    break;
                case 3:
                    m8625a.mo8632c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m8625a.mo8630a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: H */
    public static AbstractC2135f0 m9744H(JsonReader jsonReader) {
        AbstractC2135f0.b m8451b = AbstractC2135f0.m8451b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c10 = '\n';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m8451b.mo8389i(m9741E(jsonReader));
                    break;
                case 1:
                    m8451b.mo8391k(jsonReader.nextString());
                    break;
                case 2:
                    m8451b.mo8383c(jsonReader.nextString());
                    break;
                case 3:
                    m8451b.mo8382b(m9758m(jsonReader));
                    break;
                case 4:
                    m8451b.mo8384d(jsonReader.nextString());
                    break;
                case 5:
                    m8451b.mo8387g(jsonReader.nextString());
                    break;
                case 6:
                    m8451b.mo8388h(jsonReader.nextString());
                    break;
                case 7:
                    m8451b.mo8386f(jsonReader.nextString());
                    break;
                case '\b':
                    m8451b.mo8390j(jsonReader.nextInt());
                    break;
                case '\t':
                    m8451b.mo8385e(jsonReader.nextString());
                    break;
                case '\n':
                    m8451b.mo8392l(m9746J(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m8451b.mo8381a();
    }

    /* renamed from: I */
    public static AbstractC2135f0.e.d.AbstractC6180e.b m9745I(JsonReader jsonReader) {
        AbstractC2135f0.e.d.AbstractC6180e.b.a m8670a = AbstractC2135f0.e.d.AbstractC6180e.b.m8670a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("variantId")) {
                m8670a.mo8675c(jsonReader.nextString());
            } else if (nextName.equals("rolloutId")) {
                m8670a.mo8674b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m8670a.mo8673a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    /* renamed from: J */
    public static AbstractC2135f0.e m9746J(JsonReader jsonReader) {
        AbstractC2135f0.e.b m8468a = AbstractC2135f0.e.m8468a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals(Constants.IDENTIFIER)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals("device")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals(io.flutter.plugins.firebase.auth.Constants.USER)) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c10 = 11;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m8468a.mo8514m(jsonReader.nextLong());
                    break;
                case 1:
                    m8468a.mo8504c(jsonReader.nextString());
                    break;
                case 2:
                    m8468a.m8512k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    m8468a.mo8507f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 4:
                    m8468a.mo8506e(m9762q(jsonReader));
                    break;
                case 5:
                    m8468a.mo8508g(m9759n(jsonReader, new a() { // from class: h8.a
                        @Override // p110h8.C2450j.a
                        /* renamed from: a */
                        public final Object mo9736a(JsonReader jsonReader2) {
                            AbstractC2135f0.e.d m9763r;
                            m9763r = C2450j.m9763r(jsonReader2);
                            return m9763r;
                        }
                    }));
                    break;
                case 6:
                    m8468a.mo8513l(m9742F(jsonReader));
                    break;
                case 7:
                    m8468a.mo8503b(m9757l(jsonReader));
                    break;
                case '\b':
                    m8468a.mo8515n(m9747K(jsonReader));
                    break;
                case '\t':
                    m8468a.mo8509h(jsonReader.nextString());
                    break;
                case '\n':
                    m8468a.mo8505d(jsonReader.nextBoolean());
                    break;
                case 11:
                    m8468a.mo8510i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m8468a.mo8502a();
    }

    /* renamed from: K */
    public static AbstractC2135f0.e.f m9747K(JsonReader jsonReader) {
        AbstractC2135f0.e.f.a m8690a = AbstractC2135f0.e.f.m8690a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals(Constants.IDENTIFIER)) {
                m8690a.mo8368b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m8690a.mo8367a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: l */
    public static AbstractC2135f0.e.a m9757l(JsonReader jsonReader) {
        AbstractC2135f0.e.a.AbstractC6166a m8486a = AbstractC2135f0.e.a.m8486a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals(Constants.IDENTIFIER)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m8486a.mo8498e(jsonReader.nextString());
                    break;
                case 1:
                    m8486a.mo8495b(jsonReader.nextString());
                    break;
                case 2:
                    m8486a.mo8496c(jsonReader.nextString());
                    break;
                case 3:
                    m8486a.mo8500g(jsonReader.nextString());
                    break;
                case 4:
                    m8486a.mo8499f(jsonReader.nextString());
                    break;
                case 5:
                    m8486a.mo8497d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m8486a.mo8494a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: m */
    public static AbstractC2135f0.a m9758m(JsonReader jsonReader) {
        AbstractC2135f0.a.b m8458a = AbstractC2135f0.a.m8458a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals(Constants.TIMESTAMP)) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m8458a.mo8406b(m9759n(jsonReader, new a() { // from class: h8.c
                        @Override // p110h8.C2450j.a
                        /* renamed from: a */
                        public final Object mo9736a(JsonReader jsonReader2) {
                            AbstractC2135f0.a.AbstractC6164a m9760o;
                            m9760o = C2450j.m9760o(jsonReader2);
                            return m9760o;
                        }
                    }));
                    break;
                case 1:
                    m8458a.mo8408d(jsonReader.nextInt());
                    break;
                case 2:
                    m8458a.mo8410f(jsonReader.nextLong());
                    break;
                case 3:
                    m8458a.mo8412h(jsonReader.nextLong());
                    break;
                case 4:
                    m8458a.mo8413i(jsonReader.nextLong());
                    break;
                case 5:
                    m8458a.mo8409e(jsonReader.nextString());
                    break;
                case 6:
                    m8458a.mo8411g(jsonReader.nextInt());
                    break;
                case 7:
                    m8458a.mo8414j(jsonReader.nextString());
                    break;
                case '\b':
                    m8458a.mo8407c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m8458a.mo8405a();
    }

    /* renamed from: n */
    public static <T> List<T> m9759n(JsonReader jsonReader, a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.mo9736a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: o */
    public static AbstractC2135f0.a.AbstractC6164a m9760o(JsonReader jsonReader) {
        AbstractC2135f0.a.AbstractC6164a.AbstractC6165a m8459a = AbstractC2135f0.a.AbstractC6164a.m8459a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -609862170:
                    if (nextName.equals("libraryName")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 230943785:
                    if (nextName.equals(Constants.BUILD_ID)) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m8459a.mo8427d(jsonReader.nextString());
                    break;
                case 1:
                    m8459a.mo8425b(jsonReader.nextString());
                    break;
                case 2:
                    m8459a.mo8426c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m8459a.mo8424a();
    }

    /* renamed from: p */
    public static AbstractC2135f0.c m9761p(JsonReader jsonReader) {
        AbstractC2135f0.c.a m8460a = AbstractC2135f0.c.m8460a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals(Constants.KEY)) {
                m8460a.mo8440b(jsonReader.nextString());
            } else if (nextName.equals("value")) {
                m8460a.mo8441c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m8460a.mo8439a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: q */
    public static AbstractC2135f0.e.c m9762q(JsonReader jsonReader) {
        AbstractC2135f0.e.c.a m8516a = AbstractC2135f0.e.c.m8516a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m8516a.mo8534i(jsonReader.nextBoolean());
                    break;
                case 1:
                    m8516a.mo8530e(jsonReader.nextString());
                    break;
                case 2:
                    m8516a.mo8533h(jsonReader.nextLong());
                    break;
                case 3:
                    m8516a.mo8527b(jsonReader.nextInt());
                    break;
                case 4:
                    m8516a.mo8529d(jsonReader.nextLong());
                    break;
                case 5:
                    m8516a.mo8528c(jsonReader.nextInt());
                    break;
                case 6:
                    m8516a.mo8531f(jsonReader.nextString());
                    break;
                case 7:
                    m8516a.mo8535j(jsonReader.nextInt());
                    break;
                case '\b':
                    m8516a.mo8532g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m8516a.mo8526a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: r */
    public static AbstractC2135f0.e.d m9763r(JsonReader jsonReader) {
        AbstractC2135f0.e.d.b m8536a = AbstractC2135f0.e.d.m8536a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals(ImagePickerCache.MAP_KEY_TYPE)) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals(Constants.TIMESTAMP)) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m8536a.mo8637c(m9766u(jsonReader));
                    break;
                case 1:
                    m8536a.mo8639e(m9737A(jsonReader));
                    break;
                case 2:
                    m8536a.mo8636b(m9764s(jsonReader));
                    break;
                case 3:
                    m8536a.mo8638d(m9770y(jsonReader));
                    break;
                case 4:
                    m8536a.mo8641g(jsonReader.nextString());
                    break;
                case 5:
                    m8536a.mo8640f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m8536a.mo8635a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: s */
    public static AbstractC2135f0.e.d.a m9764s(JsonReader jsonReader) {
        AbstractC2135f0.e.d.a.AbstractC6167a m8544a = AbstractC2135f0.e.d.a.m8544a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1405314732:
                    if (nextName.equals("appProcessDetails")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1332194002:
                    if (nextName.equals("background")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1847730860:
                    if (nextName.equals("currentProcessDetails")) {
                        c10 = 6;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m8544a.mo8554b(m9759n(jsonReader, new a() { // from class: h8.e
                        @Override // p110h8.C2450j.a
                        /* renamed from: a */
                        public final Object mo9736a(JsonReader jsonReader2) {
                            AbstractC2135f0.e.d.a.c m9743G;
                            m9743G = C2450j.m9743G(jsonReader2);
                            return m9743G;
                        }
                    }));
                    break;
                case 1:
                    m8544a.mo8555c(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 2:
                    m8544a.mo8558f(m9767v(jsonReader));
                    break;
                case 3:
                    m8544a.mo8559g(m9759n(jsonReader, new a() { // from class: h8.i
                        @Override // p110h8.C2450j.a
                        /* renamed from: a */
                        public final Object mo9736a(JsonReader jsonReader2) {
                            AbstractC2135f0.c m9761p;
                            m9761p = C2450j.m9761p(jsonReader2);
                            return m9761p;
                        }
                    }));
                    break;
                case 4:
                    m8544a.mo8557e(m9759n(jsonReader, new a() { // from class: h8.i
                        @Override // p110h8.C2450j.a
                        /* renamed from: a */
                        public final Object mo9736a(JsonReader jsonReader2) {
                            AbstractC2135f0.c m9761p;
                            m9761p = C2450j.m9761p(jsonReader2);
                            return m9761p;
                        }
                    }));
                    break;
                case 5:
                    m8544a.mo8560h(jsonReader.nextInt());
                    break;
                case 6:
                    m8544a.mo8556d(m9743G(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m8544a.mo8553a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    /* renamed from: t */
    public static AbstractC2135f0.e.d.a.b.AbstractC6168a m9765t(JsonReader jsonReader) {
        AbstractC2135f0.e.d.a.b.AbstractC6168a.AbstractC6169a m8567a = AbstractC2135f0.e.d.a.b.AbstractC6168a.m8567a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m8567a.mo8575c(jsonReader.nextString());
                    break;
                case 1:
                    m8567a.mo8576d(jsonReader.nextLong());
                    break;
                case 2:
                    m8567a.m8578f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    m8567a.mo8574b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m8567a.mo8573a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: u */
    public static AbstractC2135f0.e.d.c m9766u(JsonReader jsonReader) {
        AbstractC2135f0.e.d.c.a m8642a = AbstractC2135f0.e.d.c.m8642a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m8642a.mo8650b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    m8642a.mo8651c(jsonReader.nextInt());
                    break;
                case 2:
                    m8642a.mo8653e(jsonReader.nextInt());
                    break;
                case 3:
                    m8642a.mo8652d(jsonReader.nextLong());
                    break;
                case 4:
                    m8642a.mo8655g(jsonReader.nextLong());
                    break;
                case 5:
                    m8642a.mo8654f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m8642a.mo8649a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: v */
    public static AbstractC2135f0.e.d.a.b m9767v(JsonReader jsonReader) {
        AbstractC2135f0.e.d.a.b.AbstractC6170b m8561a = AbstractC2135f0.e.d.a.b.m8561a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals(Constants.EXCEPTION)) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m8561a.mo8580b(m9758m(jsonReader));
                    break;
                case 1:
                    m8561a.mo8584f(m9759n(jsonReader, new a() { // from class: h8.f
                        @Override // p110h8.C2450j.a
                        /* renamed from: a */
                        public final Object mo9736a(JsonReader jsonReader2) {
                            AbstractC2135f0.e.d.a.b.AbstractC6174e m9739C;
                            m9739C = C2450j.m9739C(jsonReader2);
                            return m9739C;
                        }
                    }));
                    break;
                case 2:
                    m8561a.mo8583e(m9738B(jsonReader));
                    break;
                case 3:
                    m8561a.mo8581c(m9759n(jsonReader, new a() { // from class: h8.h
                        @Override // p110h8.C2450j.a
                        /* renamed from: a */
                        public final Object mo9736a(JsonReader jsonReader2) {
                            AbstractC2135f0.e.d.a.b.AbstractC6168a m9765t;
                            m9765t = C2450j.m9765t(jsonReader2);
                            return m9765t;
                        }
                    }));
                    break;
                case 4:
                    m8561a.mo8582d(m9768w(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m8561a.mo8579a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: w */
    public static AbstractC2135f0.e.d.a.b.c m9768w(JsonReader jsonReader) {
        AbstractC2135f0.e.d.a.b.c.AbstractC6171a m8585a = AbstractC2135f0.e.d.a.b.c.m8585a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals(Constants.REASON)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals(ImagePickerCache.MAP_KEY_TYPE)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m8585a.mo8593c(m9759n(jsonReader, C2444d.f9786a));
                    break;
                case 1:
                    m8585a.mo8595e(jsonReader.nextString());
                    break;
                case 2:
                    m8585a.mo8596f(jsonReader.nextString());
                    break;
                case 3:
                    m8585a.mo8592b(m9768w(jsonReader));
                    break;
                case 4:
                    m8585a.mo8594d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m8585a.mo8591a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: x */
    public static AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b m9769x(JsonReader jsonReader) {
        AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b.AbstractC6177a m8613a = AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b.m8613a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals(Constants.FILE)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m8613a.mo8622d(jsonReader.nextLong());
                    break;
                case 1:
                    m8613a.mo8624f(jsonReader.nextString());
                    break;
                case 2:
                    m8613a.mo8623e(jsonReader.nextLong());
                    break;
                case 3:
                    m8613a.mo8620b(jsonReader.nextString());
                    break;
                case 4:
                    m8613a.mo8621c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m8613a.mo8619a();
    }

    /* renamed from: y */
    public static AbstractC2135f0.e.d.AbstractC6179d m9770y(JsonReader jsonReader) {
        AbstractC2135f0.e.d.AbstractC6179d.a m8656a = AbstractC2135f0.e.d.AbstractC6179d.m8656a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                m8656a.mo8659b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m8656a.mo8658a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: z */
    public static AbstractC2135f0.e.d.AbstractC6180e m9771z(JsonReader jsonReader) {
        AbstractC2135f0.e.d.AbstractC6180e.a m8660a = AbstractC2135f0.e.d.AbstractC6180e.m8660a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1536268810:
                    if (nextName.equals("parameterKey")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1027290370:
                    if (nextName.equals("templateVersion")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1098747284:
                    if (nextName.equals("rolloutVariant")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1124454216:
                    if (nextName.equals("parameterValue")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m8660a.mo8666b(jsonReader.nextString());
                    break;
                case 1:
                    m8660a.mo8669e(jsonReader.nextLong());
                    break;
                case 2:
                    m8660a.mo8668d(m9745I(jsonReader));
                    break;
                case 3:
                    m8660a.mo8667c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m8660a.mo8665a();
    }

    /* renamed from: L */
    public AbstractC2135f0 m9772L(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                AbstractC2135f0 m9744H = m9744H(jsonReader);
                jsonReader.close();
                return m9744H;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    /* renamed from: M */
    public String m9773M(AbstractC2135f0 abstractC2135f0) {
        return f9792a.mo16195b(abstractC2135f0);
    }

    /* renamed from: j */
    public AbstractC2135f0.e.d m9774j(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                AbstractC2135f0.e.d m9763r = m9763r(jsonReader);
                jsonReader.close();
                return m9763r;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    /* renamed from: k */
    public String m9775k(AbstractC2135f0.e.d dVar) {
        return f9792a.mo16195b(dVar);
    }
}
