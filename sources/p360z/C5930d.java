package p360z;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: z.d */
/* loaded from: classes.dex */
public final class C5930d {

    /* renamed from: a */
    public final Shader f22038a;

    /* renamed from: b */
    public final ColorStateList f22039b;

    /* renamed from: c */
    public int f22040c;

    public C5930d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f22038a = shader;
        this.f22039b = colorStateList;
        this.f22040c = i10;
    }

    /* renamed from: a */
    public static C5930d m23706a(Resources resources, int i10, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return m23709d(C5932f.m23739b(resources, xml, asAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return m23708c(C5929c.m23699b(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    /* renamed from: b */
    public static C5930d m23707b(int i10) {
        return new C5930d(null, null, i10);
    }

    /* renamed from: c */
    public static C5930d m23708c(ColorStateList colorStateList) {
        return new C5930d(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    public static C5930d m23709d(Shader shader) {
        return new C5930d(shader, null, 0);
    }

    /* renamed from: g */
    public static C5930d m23710g(Resources resources, int i10, Resources.Theme theme) {
        try {
            return m23706a(resources, i10, theme);
        } catch (Exception e10) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
            return null;
        }
    }

    /* renamed from: e */
    public int m23711e() {
        return this.f22040c;
    }

    /* renamed from: f */
    public Shader m23712f() {
        return this.f22038a;
    }

    /* renamed from: h */
    public boolean m23713h() {
        return this.f22038a != null;
    }

    /* renamed from: i */
    public boolean m23714i() {
        ColorStateList colorStateList;
        return this.f22038a == null && (colorStateList = this.f22039b) != null && colorStateList.isStateful();
    }

    /* renamed from: j */
    public boolean m23715j(int[] iArr) {
        if (m23714i()) {
            ColorStateList colorStateList = this.f22039b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f22040c) {
                this.f22040c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m23716k(int i10) {
        this.f22040c = i10;
    }

    /* renamed from: l */
    public boolean m23717l() {
        return m23713h() || this.f22040c != 0;
    }
}
