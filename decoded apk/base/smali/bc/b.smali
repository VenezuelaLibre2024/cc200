.class public Lbc/b;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a()Lbc/c;
    .locals 3

    const/16 v0, 0x2d0

    const/16 v1, 0x500

    invoke-static {v0, v1}, Lbc/c;->e(II)Lbc/c$b;

    move-result-object v0

    const-wide/32 v1, 0x1e8480

    invoke-virtual {v0, v1, v2}, Lbc/c$b;->a(J)Lbc/c$b;

    move-result-object v0

    const/16 v1, 0x1e

    invoke-virtual {v0, v1}, Lbc/c$b;->c(I)Lbc/c$b;

    move-result-object v0

    const/high16 v1, 0x40400000    # 3.0f

    invoke-virtual {v0, v1}, Lbc/c$b;->d(F)Lbc/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lbc/c$b;->b()Lbc/c;

    move-result-object v0

    return-object v0
.end method
