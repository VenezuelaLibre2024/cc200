.class public final Lo3/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li3/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo3/j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li3/b<",
        "Lo3/e;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lo3/j;
    .locals 1

    invoke-static {}, Lo3/j$a;->a()Lo3/j;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lo3/e;
    .locals 2

    invoke-static {}, Lo3/f;->d()Lo3/e;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Li3/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo3/e;

    return-object v0
.end method


# virtual methods
.method public b()Lo3/e;
    .locals 1

    invoke-static {}, Lo3/j;->c()Lo3/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lo3/j;->b()Lo3/e;

    move-result-object v0

    return-object v0
.end method
