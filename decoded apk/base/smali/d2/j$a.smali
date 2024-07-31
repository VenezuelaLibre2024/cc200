.class public Ld2/j$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/j;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Ll7/f;

.field public final synthetic i:Ln2/c;

.field public final synthetic j:Ld2/j;


# direct methods
.method public constructor <init>(Ld2/j;Ll7/f;Ln2/c;)V
    .locals 0

    iput-object p1, p0, Ld2/j$a;->j:Ld2/j;

    iput-object p2, p0, Ld2/j$a;->h:Ll7/f;

    iput-object p3, p0, Ld2/j$a;->i:Ln2/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    :try_start_0
    iget-object v0, p0, Ld2/j$a;->h:Ll7/f;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object v0

    sget-object v1, Ld2/j;->A:Ljava/lang/String;

    const-string v2, "Starting work for %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Ld2/j$a;->j:Ld2/j;

    iget-object v4, v4, Ld2/j;->l:Ll2/p;

    iget-object v4, v4, Ll2/p;->c:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v3, v5, [Ljava/lang/Throwable;

    invoke-virtual {v0, v1, v2, v3}, Lc2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v0, p0, Ld2/j$a;->j:Ld2/j;

    iget-object v1, v0, Ld2/j;->m:Landroidx/work/ListenableWorker;

    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->o()Ll7/f;

    move-result-object v1

    iput-object v1, v0, Ld2/j;->y:Ll7/f;

    iget-object v0, p0, Ld2/j$a;->i:Ln2/c;

    iget-object v1, p0, Ld2/j$a;->j:Ld2/j;

    iget-object v1, v1, Ld2/j;->y:Ll7/f;

    invoke-virtual {v0, v1}, Ln2/c;->r(Ll7/f;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Ld2/j$a;->i:Ln2/c;

    invoke-virtual {v1, v0}, Ln2/c;->q(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method
