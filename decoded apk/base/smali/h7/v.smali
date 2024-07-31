.class public final Lh7/v;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh7/v$c;,
        Lh7/v$b;,
        Lh7/v$a;
    }
.end annotation


# direct methods
.method public static a(Lh7/u;)Lh7/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lh7/u<",
            "TT;>;)",
            "Lh7/u<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lh7/v$b;

    if-nez v0, :cond_2

    instance-of v0, p0, Lh7/v$a;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p0, Ljava/io/Serializable;

    if-eqz v0, :cond_1

    new-instance v0, Lh7/v$a;

    invoke-direct {v0, p0}, Lh7/v$a;-><init>(Lh7/u;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lh7/v$b;

    invoke-direct {v0, p0}, Lh7/v$b;-><init>(Lh7/u;)V

    :goto_0
    return-object v0

    :cond_2
    :goto_1
    return-object p0
.end method

.method public static b(Ljava/lang/Object;)Lh7/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lh7/u<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lh7/v$c;

    invoke-direct {v0, p0}, Lh7/v$c;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
