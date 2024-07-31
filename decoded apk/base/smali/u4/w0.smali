.class public abstract Lu4/w0;
.super Lu4/f;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lu4/f<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# static fields
.field public static final s:Ljava/lang/Void;


# instance fields
.field public final r:Lu4/t;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lu4/t;)V
    .locals 0

    invoke-direct {p0}, Lu4/f;-><init>()V

    iput-object p1, p0, Lu4/w0;->r:Lu4/t;

    return-void
.end method


# virtual methods
.method public final C(Lo5/m0;)V
    .locals 0

    invoke-super {p0, p1}, Lu4/f;->C(Lo5/m0;)V

    invoke-virtual {p0}, Lu4/w0;->V()V

    return-void
.end method

.method public bridge synthetic G(Ljava/lang/Object;Lu4/t$b;)Lu4/t$b;
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2}, Lu4/w0;->M(Ljava/lang/Void;Lu4/t$b;)Lu4/t$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic H(Ljava/lang/Object;J)J
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2, p3}, Lu4/w0;->P(Ljava/lang/Void;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic I(Ljava/lang/Object;I)I
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2}, Lu4/w0;->R(Ljava/lang/Void;I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic K(Ljava/lang/Object;Lu4/t;Ls3/u3;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2, p3}, Lu4/w0;->S(Ljava/lang/Void;Lu4/t;Ls3/u3;)V

    return-void
.end method

.method public final M(Ljava/lang/Void;Lu4/t$b;)Lu4/t$b;
    .locals 0

    invoke-virtual {p0, p2}, Lu4/w0;->N(Lu4/t$b;)Lu4/t$b;

    move-result-object p1

    return-object p1
.end method

.method public abstract N(Lu4/t$b;)Lu4/t$b;
.end method

.method public O(J)J
    .locals 0

    return-wide p1
.end method

.method public final P(Ljava/lang/Void;J)J
    .locals 0

    invoke-virtual {p0, p2, p3}, Lu4/w0;->O(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public Q(I)I
    .locals 0

    return p1
.end method

.method public final R(Ljava/lang/Void;I)I
    .locals 0

    invoke-virtual {p0, p2}, Lu4/w0;->Q(I)I

    move-result p1

    return p1
.end method

.method public final S(Ljava/lang/Void;Lu4/t;Ls3/u3;)V
    .locals 0

    invoke-virtual {p0, p3}, Lu4/w0;->T(Ls3/u3;)V

    return-void
.end method

.method public abstract T(Ls3/u3;)V
.end method

.method public final U()V
    .locals 2

    sget-object v0, Lu4/w0;->s:Ljava/lang/Void;

    iget-object v1, p0, Lu4/w0;->r:Lu4/t;

    invoke-virtual {p0, v0, v1}, Lu4/f;->L(Ljava/lang/Object;Lu4/t;)V

    return-void
.end method

.method public abstract V()V
.end method

.method public g()Ls3/u1;
    .locals 1

    iget-object v0, p0, Lu4/w0;->r:Lu4/t;

    invoke-interface {v0}, Lu4/t;->g()Ls3/u1;

    move-result-object v0

    return-object v0
.end method

.method public j()Z
    .locals 1

    iget-object v0, p0, Lu4/w0;->r:Lu4/t;

    invoke-interface {v0}, Lu4/t;->j()Z

    move-result v0

    return v0
.end method

.method public l()Ls3/u3;
    .locals 1

    iget-object v0, p0, Lu4/w0;->r:Lu4/t;

    invoke-interface {v0}, Lu4/t;->l()Ls3/u3;

    move-result-object v0

    return-object v0
.end method
