.class public Lxe/f$f;
.super Lse/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe/f;->h0(ILbf/e;IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lbf/c;

.field public final synthetic k:I

.field public final synthetic l:Z

.field public final synthetic m:Lxe/f;


# direct methods
.method public varargs constructor <init>(Lxe/f;Ljava/lang/String;[Ljava/lang/Object;ILbf/c;IZ)V
    .locals 0

    iput-object p1, p0, Lxe/f$f;->m:Lxe/f;

    iput p4, p0, Lxe/f$f;->i:I

    iput-object p5, p0, Lxe/f$f;->j:Lbf/c;

    iput p6, p0, Lxe/f$f;->k:I

    iput-boolean p7, p0, Lxe/f$f;->l:Z

    invoke-direct {p0, p2, p3}, Lse/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lxe/f$f;->m:Lxe/f;

    iget-object v0, v0, Lxe/f;->q:Lxe/l;

    iget v1, p0, Lxe/f$f;->i:I

    iget-object v2, p0, Lxe/f$f;->j:Lbf/c;

    iget v3, p0, Lxe/f$f;->k:I

    iget-boolean v4, p0, Lxe/f$f;->l:Z

    invoke-interface {v0, v1, v2, v3, v4}, Lxe/l;->d(ILbf/e;IZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lxe/f$f;->m:Lxe/f;

    iget-object v1, v1, Lxe/f;->D:Lxe/j;

    iget v2, p0, Lxe/f$f;->i:I

    sget-object v3, Lxe/b;->n:Lxe/b;

    invoke-virtual {v1, v2, v3}, Lxe/j;->K(ILxe/b;)V

    :cond_0
    if-nez v0, :cond_1

    iget-boolean v0, p0, Lxe/f$f;->l:Z

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p0, Lxe/f$f;->m:Lxe/f;

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v1, p0, Lxe/f$f;->m:Lxe/f;

    iget-object v1, v1, Lxe/f;->F:Ljava/util/Set;

    iget v2, p0, Lxe/f$f;->i:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_2
    :goto_0
    return-void
.end method
