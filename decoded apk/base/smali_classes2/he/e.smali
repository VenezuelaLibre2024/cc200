.class public final Lhe/e;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lhe/l0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhe/l0;

    const-string v1, "CLOSED"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lhe/e;->a:Lhe/l0;

    return-void
.end method

.method public static final synthetic a()Lhe/l0;
    .locals 1

    sget-object v0, Lhe/e;->a:Lhe/l0;

    return-object v0
.end method

.method public static final b(Lhe/f;)Lhe/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<N:",
            "Lhe/f<",
            "TN;>;>(TN;)TN;"
        }
    .end annotation

    :cond_0
    :goto_0
    invoke-static {p0}, Lhe/f;->a(Lhe/f;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lhe/e;->a()Lhe/l0;

    move-result-object v1

    if-ne v0, v1, :cond_1

    return-object p0

    :cond_1
    check-cast v0, Lhe/f;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lhe/f;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_2
    move-object p0, v0

    goto :goto_0
.end method

.method public static final c(Lhe/i0;JLsd/p;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Lhe/i0<",
            "TS;>;>(TS;J",
            "Lsd/p<",
            "-",
            "Ljava/lang/Long;",
            "-TS;+TS;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    :cond_0
    :goto_0
    iget-wide v0, p0, Lhe/i0;->j:J

    cmp-long v0, v0, p1

    if-ltz v0, :cond_2

    invoke-virtual {p0}, Lhe/i0;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p0}, Lhe/j0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_1
    invoke-static {p0}, Lhe/f;->a(Lhe/f;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lhe/e;->a()Lhe/l0;

    move-result-object v1

    if-ne v0, v1, :cond_3

    sget-object p0, Lhe/e;->a:Lhe/l0;

    invoke-static {p0}, Lhe/j0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_3
    check-cast v0, Lhe/f;

    check-cast v0, Lhe/i0;

    if-eqz v0, :cond_5

    :cond_4
    :goto_2
    move-object p0, v0

    goto :goto_0

    :cond_5
    iget-wide v0, p0, Lhe/i0;->j:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p3, v0, p0}, Lsd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhe/i0;

    invoke-virtual {p0, v0}, Lhe/f;->l(Lhe/f;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lhe/i0;->h()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lhe/f;->k()V

    goto :goto_2
.end method
