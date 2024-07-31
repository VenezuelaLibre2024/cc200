.class public abstract Lg3/o;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg3/o$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lg3/o$a;
    .locals 1

    new-instance v0, Lg3/c$b;

    invoke-direct {v0}, Lg3/c$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Ld3/c;
.end method

.method public abstract c()Ld3/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld3/d<",
            "*>;"
        }
    .end annotation
.end method

.method public d()[B
    .locals 2

    invoke-virtual {p0}, Lg3/o;->e()Ld3/g;

    move-result-object v0

    invoke-virtual {p0}, Lg3/o;->c()Ld3/d;

    move-result-object v1

    invoke-virtual {v1}, Ld3/d;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ld3/g;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method public abstract e()Ld3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld3/g<",
            "*[B>;"
        }
    .end annotation
.end method

.method public abstract f()Lg3/p;
.end method

.method public abstract g()Ljava/lang/String;
.end method
