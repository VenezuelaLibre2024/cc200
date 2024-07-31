.class public abstract Lv0/k;
.super Lv0/g;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv0/k$e;,
        Lv0/k$b;,
        Lv0/k$c;,
        Lv0/k$d;
    }
.end annotation


# static fields
.field public static final c:Ljava/util/logging/Logger;

.field public static final d:Z


# instance fields
.field public a:Lv0/l;

.field public b:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lv0/k;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lv0/k;->c:Ljava/util/logging/Logger;

    invoke-static {}, Lv0/r1;->C()Z

    move-result v0

    sput-boolean v0, Lv0/k;->d:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lv0/g;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lv0/k$a;)V
    .locals 0

    invoke-direct {p0}, Lv0/k;-><init>()V

    return-void
.end method

.method public static A(ILv0/e0;)I
    .locals 0

    invoke-static {p0}, Lv0/k;->V(I)I

    move-result p0

    invoke-static {p1}, Lv0/k;->B(Lv0/e0;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static B(Lv0/e0;)I
    .locals 0

    invoke-virtual {p0}, Lv0/e0;->b()I

    move-result p0

    invoke-static {p0}, Lv0/k;->C(I)I

    move-result p0

    return p0
.end method

.method public static C(I)I
    .locals 1

    invoke-static {p0}, Lv0/k;->X(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method

.method public static D(ILv0/r0;)I
    .locals 2

    const/4 v0, 0x1

    invoke-static {v0}, Lv0/k;->V(I)I

    move-result v0

    const/4 v1, 0x2

    mul-int/2addr v0, v1

    invoke-static {v1, p0}, Lv0/k;->W(II)I

    move-result p0

    add-int/2addr v0, p0

    const/4 p0, 0x3

    invoke-static {p0, p1}, Lv0/k;->E(ILv0/r0;)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public static E(ILv0/r0;)I
    .locals 0

    invoke-static {p0}, Lv0/k;->V(I)I

    move-result p0

    invoke-static {p1}, Lv0/k;->G(Lv0/r0;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static F(ILv0/r0;Lv0/g1;)I
    .locals 0

    invoke-static {p0}, Lv0/k;->V(I)I

    move-result p0

    invoke-static {p1, p2}, Lv0/k;->H(Lv0/r0;Lv0/g1;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static G(Lv0/r0;)I
    .locals 0

    invoke-interface {p0}, Lv0/r0;->g()I

    move-result p0

    invoke-static {p0}, Lv0/k;->C(I)I

    move-result p0

    return p0
.end method

.method public static H(Lv0/r0;Lv0/g1;)I
    .locals 0

    check-cast p0, Lv0/a;

    invoke-virtual {p0, p1}, Lv0/a;->m(Lv0/g1;)I

    move-result p0

    invoke-static {p0}, Lv0/k;->C(I)I

    move-result p0

    return p0
.end method

.method public static I(I)I
    .locals 1

    const/16 v0, 0x1000

    if-le p0, v0, :cond_0

    return v0

    :cond_0
    return p0
.end method

.method public static J(ILv0/h;)I
    .locals 2

    const/4 v0, 0x1

    invoke-static {v0}, Lv0/k;->V(I)I

    move-result v0

    const/4 v1, 0x2

    mul-int/2addr v0, v1

    invoke-static {v1, p0}, Lv0/k;->W(II)I

    move-result p0

    add-int/2addr v0, p0

    const/4 p0, 0x3

    invoke-static {p0, p1}, Lv0/k;->g(ILv0/h;)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public static K(I)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lv0/k;->X(I)I

    move-result p0

    return p0
.end method

.method public static L(II)I
    .locals 0

    invoke-static {p0}, Lv0/k;->V(I)I

    move-result p0

    invoke-static {p1}, Lv0/k;->M(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static M(I)I
    .locals 0

    const/4 p0, 0x4

    return p0
.end method

.method public static N(IJ)I
    .locals 0

    invoke-static {p0}, Lv0/k;->V(I)I

    move-result p0

    invoke-static {p1, p2}, Lv0/k;->O(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static O(J)I
    .locals 0

    const/16 p0, 0x8

    return p0
.end method

.method public static P(II)I
    .locals 0

    invoke-static {p0}, Lv0/k;->V(I)I

    move-result p0

    invoke-static {p1}, Lv0/k;->Q(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static Q(I)I
    .locals 0

    invoke-static {p0}, Lv0/k;->a0(I)I

    move-result p0

    invoke-static {p0}, Lv0/k;->X(I)I

    move-result p0

    return p0
.end method

.method public static R(IJ)I
    .locals 0

    invoke-static {p0}, Lv0/k;->V(I)I

    move-result p0

    invoke-static {p1, p2}, Lv0/k;->S(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static S(J)I
    .locals 0

    invoke-static {p0, p1}, Lv0/k;->b0(J)J

    move-result-wide p0

    invoke-static {p0, p1}, Lv0/k;->Z(J)I

    move-result p0

    return p0
.end method

.method public static T(ILjava/lang/String;)I
    .locals 0

    invoke-static {p0}, Lv0/k;->V(I)I

    move-result p0

    invoke-static {p1}, Lv0/k;->U(Ljava/lang/String;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static U(Ljava/lang/String;)I
    .locals 1

    :try_start_0
    invoke-static {p0}, Lv0/s1;->g(Ljava/lang/CharSequence;)I

    move-result p0
    :try_end_0
    .catch Lv0/s1$d; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Lv0/a0;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    array-length p0, p0

    :goto_0
    invoke-static {p0}, Lv0/k;->C(I)I

    move-result p0

    return p0
.end method

.method public static V(I)I
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lv0/t1;->c(II)I

    move-result p0

    invoke-static {p0}, Lv0/k;->X(I)I

    move-result p0

    return p0
.end method

.method public static W(II)I
    .locals 0

    invoke-static {p0}, Lv0/k;->V(I)I

    move-result p0

    invoke-static {p1}, Lv0/k;->X(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static X(I)I
    .locals 1

    and-int/lit8 v0, p0, -0x80

    if-nez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    and-int/lit16 v0, p0, -0x4000

    if-nez v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const/high16 v0, -0x200000

    and-int/2addr v0, p0

    if-nez v0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    const/high16 v0, -0x10000000

    and-int/2addr p0, v0

    if-nez p0, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    const/4 p0, 0x5

    return p0
.end method

.method public static Y(IJ)I
    .locals 0

    invoke-static {p0}, Lv0/k;->V(I)I

    move-result p0

    invoke-static {p1, p2}, Lv0/k;->Z(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static Z(J)I
    .locals 6

    const-wide/16 v0, -0x80

    and-long/2addr v0, p0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    cmp-long v0, p0, v2

    if-gez v0, :cond_1

    const/16 p0, 0xa

    return p0

    :cond_1
    const-wide v0, -0x800000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    const/4 v0, 0x6

    const/16 v1, 0x1c

    ushr-long/2addr p0, v1

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    :goto_0
    const-wide/32 v4, -0x200000

    and-long/2addr v4, p0

    cmp-long v1, v4, v2

    if-eqz v1, :cond_3

    add-int/lit8 v0, v0, 0x2

    const/16 v1, 0xe

    ushr-long/2addr p0, v1

    :cond_3
    const-wide/16 v4, -0x4000

    and-long/2addr p0, v4

    cmp-long p0, p0, v2

    if-eqz p0, :cond_4

    add-int/lit8 v0, v0, 0x1

    :cond_4
    return v0
.end method

.method public static a0(I)I
    .locals 1

    shl-int/lit8 v0, p0, 0x1

    shr-int/lit8 p0, p0, 0x1f

    xor-int/2addr p0, v0

    return p0
.end method

.method public static synthetic b()Z
    .locals 1

    sget-boolean v0, Lv0/k;->d:Z

    return v0
.end method

.method public static b0(J)J
    .locals 3

    const/4 v0, 0x1

    shl-long v0, p0, v0

    const/16 v2, 0x3f

    shr-long/2addr p0, v2

    xor-long/2addr p0, v0

    return-wide p0
.end method

.method public static d(IZ)I
    .locals 0

    invoke-static {p0}, Lv0/k;->V(I)I

    move-result p0

    invoke-static {p1}, Lv0/k;->e(Z)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static e(Z)I
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public static f([B)I
    .locals 0

    array-length p0, p0

    invoke-static {p0}, Lv0/k;->C(I)I

    move-result p0

    return p0
.end method

.method public static f0(Ljava/io/OutputStream;I)Lv0/k;
    .locals 1

    new-instance v0, Lv0/k$e;

    invoke-direct {v0, p0, p1}, Lv0/k$e;-><init>(Ljava/io/OutputStream;I)V

    return-object v0
.end method

.method public static g(ILv0/h;)I
    .locals 0

    invoke-static {p0}, Lv0/k;->V(I)I

    move-result p0

    invoke-static {p1}, Lv0/k;->h(Lv0/h;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static g0([B)Lv0/k;
    .locals 2

    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Lv0/k;->h0([BII)Lv0/k;

    move-result-object p0

    return-object p0
.end method

.method public static h(Lv0/h;)I
    .locals 0

    invoke-virtual {p0}, Lv0/h;->size()I

    move-result p0

    invoke-static {p0}, Lv0/k;->C(I)I

    move-result p0

    return p0
.end method

.method public static h0([BII)Lv0/k;
    .locals 1

    new-instance v0, Lv0/k$c;

    invoke-direct {v0, p0, p1, p2}, Lv0/k$c;-><init>([BII)V

    return-object v0
.end method

.method public static i(ID)I
    .locals 0

    invoke-static {p0}, Lv0/k;->V(I)I

    move-result p0

    invoke-static {p1, p2}, Lv0/k;->j(D)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static j(D)I
    .locals 0

    const/16 p0, 0x8

    return p0
.end method

.method public static k(II)I
    .locals 0

    invoke-static {p0}, Lv0/k;->V(I)I

    move-result p0

    invoke-static {p1}, Lv0/k;->l(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static l(I)I
    .locals 0

    invoke-static {p0}, Lv0/k;->w(I)I

    move-result p0

    return p0
.end method

.method public static m(II)I
    .locals 0

    invoke-static {p0}, Lv0/k;->V(I)I

    move-result p0

    invoke-static {p1}, Lv0/k;->n(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static n(I)I
    .locals 0

    const/4 p0, 0x4

    return p0
.end method

.method public static o(IJ)I
    .locals 0

    invoke-static {p0}, Lv0/k;->V(I)I

    move-result p0

    invoke-static {p1, p2}, Lv0/k;->p(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static p(J)I
    .locals 0

    const/16 p0, 0x8

    return p0
.end method

.method public static q(IF)I
    .locals 0

    invoke-static {p0}, Lv0/k;->V(I)I

    move-result p0

    invoke-static {p1}, Lv0/k;->r(F)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static r(F)I
    .locals 0

    const/4 p0, 0x4

    return p0
.end method

.method public static s(ILv0/r0;Lv0/g1;)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lv0/k;->V(I)I

    move-result p0

    mul-int/lit8 p0, p0, 0x2

    invoke-static {p1, p2}, Lv0/k;->u(Lv0/r0;Lv0/g1;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static t(Lv0/r0;)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-interface {p0}, Lv0/r0;->g()I

    move-result p0

    return p0
.end method

.method public static u(Lv0/r0;Lv0/g1;)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    check-cast p0, Lv0/a;

    invoke-virtual {p0, p1}, Lv0/a;->m(Lv0/g1;)I

    move-result p0

    return p0
.end method

.method public static v(II)I
    .locals 0

    invoke-static {p0}, Lv0/k;->V(I)I

    move-result p0

    invoke-static {p1}, Lv0/k;->w(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static w(I)I
    .locals 0

    if-ltz p0, :cond_0

    invoke-static {p0}, Lv0/k;->X(I)I

    move-result p0

    return p0

    :cond_0
    const/16 p0, 0xa

    return p0
.end method

.method public static x(IJ)I
    .locals 0

    invoke-static {p0}, Lv0/k;->V(I)I

    move-result p0

    invoke-static {p1, p2}, Lv0/k;->y(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static y(J)I
    .locals 0

    invoke-static {p0, p1}, Lv0/k;->Z(J)I

    move-result p0

    return p0
.end method

.method public static z(ILv0/e0;)I
    .locals 2

    const/4 v0, 0x1

    invoke-static {v0}, Lv0/k;->V(I)I

    move-result v0

    const/4 v1, 0x2

    mul-int/2addr v0, v1

    invoke-static {v1, p0}, Lv0/k;->W(II)I

    move-result p0

    add-int/2addr v0, p0

    const/4 p0, 0x3

    invoke-static {p0, p1}, Lv0/k;->A(ILv0/e0;)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method


# virtual methods
.method public final A0(ILv0/r0;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x3

    invoke-virtual {p0, p1, v0}, Lv0/k;->W0(II)V

    invoke-virtual {p0, p2}, Lv0/k;->C0(Lv0/r0;)V

    const/4 p2, 0x4

    invoke-virtual {p0, p1, p2}, Lv0/k;->W0(II)V

    return-void
.end method

.method public final B0(ILv0/r0;Lv0/g1;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x3

    invoke-virtual {p0, p1, v0}, Lv0/k;->W0(II)V

    invoke-virtual {p0, p2, p3}, Lv0/k;->D0(Lv0/r0;Lv0/g1;)V

    const/4 p2, 0x4

    invoke-virtual {p0, p1, p2}, Lv0/k;->W0(II)V

    return-void
.end method

.method public final C0(Lv0/r0;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-interface {p1, p0}, Lv0/r0;->e(Lv0/k;)V

    return-void
.end method

.method public final D0(Lv0/r0;Lv0/g1;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lv0/k;->a:Lv0/l;

    invoke-interface {p2, p1, v0}, Lv0/g1;->d(Ljava/lang/Object;Lv0/u1;)V

    return-void
.end method

.method public abstract E0(II)V
.end method

.method public abstract F0(I)V
.end method

.method public final G0(IJ)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lv0/k;->Z0(IJ)V

    return-void
.end method

.method public final H0(J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lv0/k;->a1(J)V

    return-void
.end method

.method public abstract I0(ILv0/r0;Lv0/g1;)V
.end method

.method public abstract J0(Lv0/r0;)V
.end method

.method public abstract K0(ILv0/r0;)V
.end method

.method public abstract L0(ILv0/h;)V
.end method

.method public final M0(II)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lv0/k;->u0(II)V

    return-void
.end method

.method public final N0(I)V
    .locals 0

    invoke-virtual {p0, p1}, Lv0/k;->v0(I)V

    return-void
.end method

.method public final O0(IJ)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lv0/k;->w0(IJ)V

    return-void
.end method

.method public final P0(J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lv0/k;->x0(J)V

    return-void
.end method

.method public final Q0(II)V
    .locals 0

    invoke-static {p2}, Lv0/k;->a0(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lv0/k;->X0(II)V

    return-void
.end method

.method public final R0(I)V
    .locals 0

    invoke-static {p1}, Lv0/k;->a0(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lv0/k;->Y0(I)V

    return-void
.end method

.method public final S0(IJ)V
    .locals 0

    invoke-static {p2, p3}, Lv0/k;->b0(J)J

    move-result-wide p2

    invoke-virtual {p0, p1, p2, p3}, Lv0/k;->Z0(IJ)V

    return-void
.end method

.method public final T0(J)V
    .locals 0

    invoke-static {p1, p2}, Lv0/k;->b0(J)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lv0/k;->a1(J)V

    return-void
.end method

.method public abstract U0(ILjava/lang/String;)V
.end method

.method public abstract V0(Ljava/lang/String;)V
.end method

.method public abstract W0(II)V
.end method

.method public abstract X0(II)V
.end method

.method public abstract Y0(I)V
.end method

.method public abstract Z0(IJ)V
.end method

.method public abstract a([BII)V
.end method

.method public abstract a1(J)V
.end method

.method public final c()V
    .locals 2

    invoke-virtual {p0}, Lv0/k;->i0()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract c0()V
.end method

.method public final d0(Ljava/lang/String;Lv0/s1$d;)V
    .locals 3

    sget-object v0, Lv0/k;->c:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v2, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"

    invoke-virtual {v0, v1, v2, p2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p2, Lv0/a0;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    :try_start_0
    array-length p2, p1

    invoke-virtual {p0, p2}, Lv0/k;->Y0(I)V

    const/4 p2, 0x0

    array-length v0, p1

    invoke-virtual {p0, p1, p2, v0}, Lv0/k;->a([BII)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lv0/k$d; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    throw p1

    :catch_1
    move-exception p1

    new-instance p2, Lv0/k$d;

    invoke-direct {p2, p1}, Lv0/k$d;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public e0()Z
    .locals 1

    iget-boolean v0, p0, Lv0/k;->b:Z

    return v0
.end method

.method public abstract i0()I
.end method

.method public abstract j0(B)V
.end method

.method public abstract k0(IZ)V
.end method

.method public final l0(Z)V
    .locals 0

    int-to-byte p1, p1

    invoke-virtual {p0, p1}, Lv0/k;->j0(B)V

    return-void
.end method

.method public final m0([B)V
    .locals 2

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lv0/k;->n0([BII)V

    return-void
.end method

.method public abstract n0([BII)V
.end method

.method public abstract o0(ILv0/h;)V
.end method

.method public abstract p0(Lv0/h;)V
.end method

.method public final q0(ID)V
    .locals 0

    invoke-static {p2, p3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p2

    invoke-virtual {p0, p1, p2, p3}, Lv0/k;->w0(IJ)V

    return-void
.end method

.method public final r0(D)V
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lv0/k;->x0(J)V

    return-void
.end method

.method public final s0(II)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lv0/k;->E0(II)V

    return-void
.end method

.method public final t0(I)V
    .locals 0

    invoke-virtual {p0, p1}, Lv0/k;->F0(I)V

    return-void
.end method

.method public abstract u0(II)V
.end method

.method public abstract v0(I)V
.end method

.method public abstract w0(IJ)V
.end method

.method public abstract x0(J)V
.end method

.method public final y0(IF)V
    .locals 0

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lv0/k;->u0(II)V

    return-void
.end method

.method public final z0(F)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    invoke-virtual {p0, p1}, Lv0/k;->v0(I)V

    return-void
.end method
