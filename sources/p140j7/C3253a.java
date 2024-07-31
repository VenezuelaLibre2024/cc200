package p140j7;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* renamed from: j7.a */
/* loaded from: classes.dex */
public final class C3253a {

    /* renamed from: a */
    public static final BigInteger f11354a = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);

    /* renamed from: b */
    public static final double f11355b = Math.log(10.0d);

    /* renamed from: c */
    public static final double f11356c = Math.log(2.0d);

    /* renamed from: a */
    public static BigInteger m11752a(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }
}
