package androidx.window.core;

import java.math.BigInteger;
import sd.InterfaceC4569a;
import td.AbstractC4754n;

/* loaded from: classes.dex */
public final class Version$bigInteger$2 extends AbstractC4754n implements InterfaceC4569a<BigInteger> {
    public final /* synthetic */ Version this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Version$bigInteger$2(Version version) {
        super(0);
        this.this$0 = version;
    }

    @Override // sd.InterfaceC4569a
    public final BigInteger invoke() {
        return BigInteger.valueOf(this.this$0.getMajor()).shiftLeft(32).or(BigInteger.valueOf(this.this$0.getMinor())).shiftLeft(32).or(BigInteger.valueOf(this.this$0.getPatch()));
    }
}
