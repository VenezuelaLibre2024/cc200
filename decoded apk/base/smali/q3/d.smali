.class public final Lq3/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li3/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq3/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li3/b<",
        "Lq3/a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lq3/d;
    .locals 1

    invoke-static {}, Lq3/d$a;->a()Lq3/d;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lq3/a;
    .locals 2

    invoke-static {}, Lq3/b;->b()Lq3/a;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Li3/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq3/a;

    return-object v0
.end method


# virtual methods
.method public b()Lq3/a;
    .locals 1

    invoke-static {}, Lq3/d;->c()Lq3/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lq3/d;->b()Lq3/a;

    move-result-object v0

    return-object v0
.end method
