.class public Lm2/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final n:Ljava/lang/String;


# instance fields
.field public final h:Ln2/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln2/c<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Landroid/content/Context;

.field public final j:Ll2/p;

.field public final k:Landroidx/work/ListenableWorker;

.field public final l:Lc2/f;

.field public final m:Lo2/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkForegroundRunnable"

    invoke-static {v0}, Lc2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lm2/k;->n:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ll2/p;Landroidx/work/ListenableWorker;Lc2/f;Lo2/a;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "LambdaLast"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ln2/c;->t()Ln2/c;

    move-result-object v0

    iput-object v0, p0, Lm2/k;->h:Ln2/c;

    iput-object p1, p0, Lm2/k;->i:Landroid/content/Context;

    iput-object p2, p0, Lm2/k;->j:Ll2/p;

    iput-object p3, p0, Lm2/k;->k:Landroidx/work/ListenableWorker;

    iput-object p4, p0, Lm2/k;->l:Lc2/f;

    iput-object p5, p0, Lm2/k;->m:Lo2/a;

    return-void
.end method


# virtual methods
.method public a()Ll7/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll7/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm2/k;->h:Ln2/c;

    return-object v0
.end method

.method public run()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnsafeExperimentalUsageError"
        }
    .end annotation

    iget-object v0, p0, Lm2/k;->j:Ll2/p;

    iget-boolean v0, v0, Ll2/p;->q:Z

    if-eqz v0, :cond_1

    invoke-static {}, Lg0/a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ln2/c;->t()Ln2/c;

    move-result-object v0

    iget-object v1, p0, Lm2/k;->m:Lo2/a;

    invoke-interface {v1}, Lo2/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lm2/k$a;

    invoke-direct {v2, p0, v0}, Lm2/k$a;-><init>(Lm2/k;Ln2/c;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    new-instance v1, Lm2/k$b;

    invoke-direct {v1, p0, v0}, Lm2/k$b;-><init>(Lm2/k;Ln2/c;)V

    iget-object v2, p0, Lm2/k;->m:Lo2/a;

    invoke-interface {v2}, Lo2/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ln2/a;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lm2/k;->h:Ln2/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ln2/c;->p(Ljava/lang/Object;)Z

    return-void
.end method
