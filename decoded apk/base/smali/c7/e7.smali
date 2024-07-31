.class public final Lc7/e7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "[B>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lc7/g0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lc7/o6;


# direct methods
.method public constructor <init>(Lc7/o6;Lc7/g0;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/e7;->a:Lc7/g0;

    iput-object p3, p0, Lc7/e7;->b:Ljava/lang/String;

    iput-object p1, p0, Lc7/e7;->c:Lc7/o6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lc7/e7;->c:Lc7/o6;

    invoke-static {v0}, Lc7/o6;->c(Lc7/o6;)Lc7/yb;

    move-result-object v0

    invoke-virtual {v0}, Lc7/yb;->k0()V

    iget-object v0, p0, Lc7/e7;->c:Lc7/o6;

    invoke-static {v0}, Lc7/o6;->c(Lc7/o6;)Lc7/yb;

    move-result-object v0

    invoke-virtual {v0}, Lc7/yb;->f0()Lc7/o9;

    move-result-object v0

    iget-object v1, p0, Lc7/e7;->a:Lc7/g0;

    iget-object v2, p0, Lc7/e7;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lc7/o9;->t(Lc7/g0;Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method
