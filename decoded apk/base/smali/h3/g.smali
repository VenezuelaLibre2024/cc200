.class public abstract Lh3/g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh3/g$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lh3/g;
    .locals 4

    new-instance v0, Lh3/b;

    sget-object v1, Lh3/g$a;->j:Lh3/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lh3/b;-><init>(Lh3/g$a;J)V

    return-object v0
.end method

.method public static d()Lh3/g;
    .locals 4

    new-instance v0, Lh3/b;

    sget-object v1, Lh3/g$a;->k:Lh3/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lh3/b;-><init>(Lh3/g$a;J)V

    return-object v0
.end method

.method public static e(J)Lh3/g;
    .locals 2

    new-instance v0, Lh3/b;

    sget-object v1, Lh3/g$a;->h:Lh3/g$a;

    invoke-direct {v0, v1, p0, p1}, Lh3/b;-><init>(Lh3/g$a;J)V

    return-object v0
.end method

.method public static f()Lh3/g;
    .locals 4

    new-instance v0, Lh3/b;

    sget-object v1, Lh3/g$a;->i:Lh3/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lh3/b;-><init>(Lh3/g$a;J)V

    return-object v0
.end method


# virtual methods
.method public abstract b()J
.end method

.method public abstract c()Lh3/g$a;
.end method
