.class public abstract Ld3/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Ljava/lang/Object;)Ld3/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Ld3/d<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ld3/a;

    sget-object v1, Ld3/e;->h:Ld3/e;

    const/4 v2, 0x0

    invoke-direct {v0, v2, p0, v1, v2}, Ld3/a;-><init>(Ljava/lang/Integer;Ljava/lang/Object;Ld3/e;Ld3/f;)V

    return-object v0
.end method

.method public static f(Ljava/lang/Object;Ld3/f;)Ld3/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ld3/f;",
            ")",
            "Ld3/d<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ld3/a;

    sget-object v1, Ld3/e;->h:Ld3/e;

    const/4 v2, 0x0

    invoke-direct {v0, v2, p0, v1, p1}, Ld3/a;-><init>(Ljava/lang/Integer;Ljava/lang/Object;Ld3/e;Ld3/f;)V

    return-object v0
.end method

.method public static g(Ljava/lang/Object;)Ld3/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Ld3/d<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ld3/a;

    sget-object v1, Ld3/e;->j:Ld3/e;

    const/4 v2, 0x0

    invoke-direct {v0, v2, p0, v1, v2}, Ld3/a;-><init>(Ljava/lang/Integer;Ljava/lang/Object;Ld3/e;Ld3/f;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/lang/Integer;
.end method

.method public abstract b()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract c()Ld3/e;
.end method

.method public abstract d()Ld3/f;
.end method
