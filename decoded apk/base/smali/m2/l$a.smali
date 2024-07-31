.class public Lm2/l$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm2/l;->a(Landroid/content/Context;Ljava/util/UUID;Lc2/e;)Ll7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Ln2/c;

.field public final synthetic i:Ljava/util/UUID;

.field public final synthetic j:Lc2/e;

.field public final synthetic k:Landroid/content/Context;

.field public final synthetic l:Lm2/l;


# direct methods
.method public constructor <init>(Lm2/l;Ln2/c;Ljava/util/UUID;Lc2/e;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lm2/l$a;->l:Lm2/l;

    iput-object p2, p0, Lm2/l$a;->h:Ln2/c;

    iput-object p3, p0, Lm2/l$a;->i:Ljava/util/UUID;

    iput-object p4, p0, Lm2/l$a;->j:Lc2/e;

    iput-object p5, p0, Lm2/l$a;->k:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lm2/l$a;->h:Ln2/c;

    invoke-virtual {v0}, Ln2/a;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lm2/l$a;->i:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lm2/l$a;->l:Lm2/l;

    iget-object v1, v1, Lm2/l;->c:Ll2/q;

    invoke-interface {v1, v0}, Ll2/q;->m(Ljava/lang/String;)Lc2/s$a;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lc2/s$a;->b()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lm2/l$a;->l:Lm2/l;

    iget-object v1, v1, Lm2/l;->b:Lk2/a;

    iget-object v2, p0, Lm2/l$a;->j:Lc2/e;

    invoke-interface {v1, v0, v2}, Lk2/a;->b(Ljava/lang/String;Lc2/e;)V

    iget-object v1, p0, Lm2/l$a;->k:Landroid/content/Context;

    iget-object v2, p0, Lm2/l$a;->j:Lc2/e;

    invoke-static {v1, v0, v2}, Landroidx/work/impl/foreground/a;->a(Landroid/content/Context;Ljava/lang/String;Lc2/e;)Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, Lm2/l$a;->k:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    :cond_0
    const-string v0, "Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v0, p0, Lm2/l$a;->h:Ln2/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ln2/c;->p(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lm2/l$a;->h:Ln2/c;

    invoke-virtual {v1, v0}, Ln2/c;->q(Ljava/lang/Throwable;)Z

    :goto_1
    return-void
.end method
