.class public Lub/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lub/a;->e(Lub/c;)Ljava/util/concurrent/Future;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lub/b;

.field public final synthetic b:Lub/c;

.field public final synthetic c:Lub/a;


# direct methods
.method public constructor <init>(Lub/a;Lub/b;Lub/c;)V
    .locals 0

    iput-object p1, p0, Lub/a$a;->c:Lub/a;

    iput-object p2, p0, Lub/a$a;->a:Lub/b;

    iput-object p3, p0, Lub/a$a;->b:Lub/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 5

    const/4 v0, 0x1

    :try_start_0
    new-instance v1, Lvb/a;

    new-instance v2, Lub/a$a$a;

    invoke-direct {v2, p0}, Lub/a$a$a;-><init>(Lub/a$a;)V

    invoke-direct {v1, v2}, Lvb/a;-><init>(Lvb/a$c;)V

    iget-object v2, p0, Lub/a$a;->b:Lub/c;

    invoke-virtual {v1, v2}, Lvb/a;->o(Lub/c;)V

    iget-object v1, p0, Lub/a$a;->a:Lub/b;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lub/b;->a(I)V
    :try_end_0
    .catch Lwb/h; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    instance-of v2, v1, Ljava/lang/InterruptedException;

    move-object v3, v1

    :cond_0
    :goto_0
    if-nez v2, :cond_1

    invoke-virtual {v3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/InterruptedException;

    if-eqz v4, :cond_0

    move v2, v0

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_2

    invoke-static {}, Lub/a;->b()Lwb/e;

    move-result-object v0

    const-string v1, "Transcode canceled."

    invoke-virtual {v0, v1, v3}, Lwb/e;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lub/a$a;->a:Lub/b;

    invoke-interface {v0}, Lub/b;->d()V

    goto :goto_1

    :cond_2
    instance-of v0, v1, Ljava/lang/RuntimeException;

    if-eqz v0, :cond_3

    invoke-static {}, Lub/a;->b()Lwb/e;

    move-result-object v0

    const-string v2, "Fatal error while transcoding, this might be invalid format or bug in engine or Android."

    invoke-virtual {v0, v2, v1}, Lwb/e;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lub/a$a;->a:Lub/b;

    invoke-interface {v0, v1}, Lub/b;->c(Ljava/lang/Throwable;)V

    throw v1

    :cond_3
    invoke-static {}, Lub/a;->b()Lwb/e;

    move-result-object v0

    const-string v2, "Unexpected error while transcoding"

    invoke-virtual {v0, v2, v1}, Lwb/e;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lub/a$a;->a:Lub/b;

    invoke-interface {v0, v1}, Lub/b;->c(Ljava/lang/Throwable;)V

    throw v1

    :catch_0
    invoke-static {}, Lub/a;->b()Lwb/e;

    move-result-object v1

    const-string v2, "Validator has decided that the input is fine and transcoding is not necessary."

    invoke-virtual {v1, v2}, Lwb/e;->b(Ljava/lang/String;)V

    iget-object v1, p0, Lub/a$a;->a:Lub/b;

    invoke-interface {v1, v0}, Lub/b;->a(I)V

    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lub/a$a;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
