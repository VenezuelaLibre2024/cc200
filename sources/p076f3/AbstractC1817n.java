package p076f3;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

@AutoValue
/* renamed from: f3.n */
/* loaded from: classes.dex */
public abstract class AbstractC1817n {
    /* renamed from: a */
    public static AbstractC1817n m7382a(long j10) {
        return new C1811h(j10);
    }

    /* renamed from: b */
    public static AbstractC1817n m7383b(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? m7382a(Long.parseLong(jsonReader.nextString())) : m7382a(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo7367c();
}
