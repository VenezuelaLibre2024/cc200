package ac;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.util.Map;

/* renamed from: ac.f */
/* loaded from: classes.dex */
public class C0091f extends AbstractC0089d {

    /* renamed from: k */
    public Context f325k;

    /* renamed from: l */
    public Uri f326l;

    public C0091f(Context context, Uri uri) {
        this.f325k = context.getApplicationContext();
        this.f326l = uri;
    }

    @Override // ac.AbstractC0089d
    /* renamed from: a */
    public void mo390a(MediaExtractor mediaExtractor) {
        mediaExtractor.setDataSource(this.f325k, this.f326l, (Map<String, String>) null);
    }

    @Override // ac.AbstractC0089d
    /* renamed from: c */
    public void mo391c(MediaMetadataRetriever mediaMetadataRetriever) {
        mediaMetadataRetriever.setDataSource(this.f325k, this.f326l);
    }
}
