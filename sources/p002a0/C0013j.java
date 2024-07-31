package p002a0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import p102h0.C2279g;
import p360z.C5931e;

/* renamed from: a0.j */
/* loaded from: classes.dex */
public class C0013j extends C0014k {
    /* renamed from: m */
    public static int m72m(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p002a0.C0014k
    /* renamed from: b */
    public Typeface mo50b(Context context, C5931e.c cVar, Resources resources, int i10) {
        try {
            FontFamily.Builder builder = null;
            for (C5931e.d dVar : cVar.m23727a()) {
                try {
                    Font build = new Font.Builder(resources, dVar.m23729b()).setWeight(dVar.m23732e()).setSlant(dVar.m23733f() ? 1 : 0).setTtcIndex(dVar.m23730c()).setFontVariationSettings(dVar.m23731d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m75l(build2, i10).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p002a0.C0014k
    /* renamed from: c */
    public Typeface mo51c(Context context, CancellationSignal cancellationSignal, C2279g.b[] bVarArr, int i10) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C2279g.b bVar : bVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(bVar.m9273d(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(bVar.m9274e()).setSlant(bVar.m9275f() ? 1 : 0).setTtcIndex(bVar.m9272c()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                } else if (openFileDescriptor == null) {
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m75l(build2, i10).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p002a0.C0014k
    /* renamed from: d */
    public Typeface mo73d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p002a0.C0014k
    /* renamed from: e */
    public Typeface mo60e(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font build = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p002a0.C0014k
    /* renamed from: i */
    public C2279g.b mo74i(C2279g.b[] bVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* renamed from: l */
    public final Font m75l(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int m72m = m72m(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int m72m2 = m72m(fontStyle, font2.getStyle());
            if (m72m2 < m72m) {
                font = font2;
                m72m = m72m2;
            }
        }
        return font;
    }
}
