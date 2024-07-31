.class public Lx1/b;
.super Lx1/q;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx1/q;-><init>()V

    invoke-virtual {p0}, Lx1/b;->t0()V

    return-void
.end method


# virtual methods
.method public final t0()V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lx1/q;->q0(I)Lx1/q;

    new-instance v1, Lx1/d;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lx1/d;-><init>(I)V

    invoke-virtual {p0, v1}, Lx1/q;->i0(Lx1/m;)Lx1/q;

    move-result-object v1

    new-instance v2, Lx1/c;

    invoke-direct {v2}, Lx1/c;-><init>()V

    invoke-virtual {v1, v2}, Lx1/q;->i0(Lx1/m;)Lx1/q;

    move-result-object v1

    new-instance v2, Lx1/d;

    invoke-direct {v2, v0}, Lx1/d;-><init>(I)V

    invoke-virtual {v1, v2}, Lx1/q;->i0(Lx1/m;)Lx1/q;

    return-void
.end method
