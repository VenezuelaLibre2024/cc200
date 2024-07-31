.class public final Lmd/b;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a([Ljava/lang/Enum;)Lmd/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Enum<",
            "TE;>;>([TE;)",
            "Lmd/a<",
            "TE;>;"
        }
    .end annotation

    const-string v0, "entries"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmd/c;

    new-instance v1, Lmd/b$a;

    invoke-direct {v1, p0}, Lmd/b$a;-><init>([Ljava/lang/Enum;)V

    invoke-direct {v0, v1}, Lmd/c;-><init>(Lsd/a;)V

    invoke-virtual {v0}, Lhd/a;->size()I

    return-object v0
.end method
