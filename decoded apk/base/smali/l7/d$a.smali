.class public final Ll7/d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll7/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public final h:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final i:Ll7/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll7/c<",
            "-TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Future;Ll7/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "TV;>;",
            "Ll7/c<",
            "-TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll7/d$a;->h:Ljava/util/concurrent/Future;

    iput-object p2, p0, Ll7/d$a;->i:Ll7/c;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ll7/d$a;->h:Ljava/util/concurrent/Future;

    instance-of v1, v0, Lm7/a;

    if-eqz v1, :cond_0

    check-cast v0, Lm7/a;

    invoke-static {v0}, Lm7/b;->a(Lm7/a;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll7/d$a;->i:Ll7/c;

    invoke-interface {v1, v0}, Ll7/c;->a(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Ll7/d$a;->h:Ljava/util/concurrent/Future;

    invoke-static {v0}, Ll7/d;->b(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Ll7/d$a;->i:Ll7/c;

    invoke-interface {v1, v0}, Ll7/c;->onSuccess(Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    iget-object v1, p0, Ll7/d$a;->i:Ll7/c;

    invoke-interface {v1, v0}, Ll7/c;->a(Ljava/lang/Throwable;)V

    return-void

    :catch_2
    move-exception v0

    iget-object v1, p0, Ll7/d$a;->i:Ll7/c;

    invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v1, v0}, Ll7/c;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-static {p0}, Lh7/i;->b(Ljava/lang/Object;)Lh7/i$b;

    move-result-object v0

    iget-object v1, p0, Ll7/d$a;->i:Ll7/c;

    invoke-virtual {v0, v1}, Lh7/i$b;->c(Ljava/lang/Object;)Lh7/i$b;

    move-result-object v0

    invoke-virtual {v0}, Lh7/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
