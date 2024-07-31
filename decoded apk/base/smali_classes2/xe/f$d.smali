.class public Lxe/f$d;
.super Lse/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe/f;->n0(ILjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/util/List;

.field public final synthetic k:Lxe/f;


# direct methods
.method public varargs constructor <init>(Lxe/f;Ljava/lang/String;[Ljava/lang/Object;ILjava/util/List;)V
    .locals 0

    iput-object p1, p0, Lxe/f$d;->k:Lxe/f;

    iput p4, p0, Lxe/f$d;->i:I

    iput-object p5, p0, Lxe/f$d;->j:Ljava/util/List;

    invoke-direct {p0, p2, p3}, Lse/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 3

    iget-object v0, p0, Lxe/f$d;->k:Lxe/f;

    iget-object v0, v0, Lxe/f;->q:Lxe/l;

    iget v1, p0, Lxe/f$d;->i:I

    iget-object v2, p0, Lxe/f$d;->j:Ljava/util/List;

    invoke-interface {v0, v1, v2}, Lxe/l;->b(ILjava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lxe/f$d;->k:Lxe/f;

    iget-object v0, v0, Lxe/f;->D:Lxe/j;

    iget v1, p0, Lxe/f$d;->i:I

    sget-object v2, Lxe/b;->n:Lxe/b;

    invoke-virtual {v0, v1, v2}, Lxe/j;->K(ILxe/b;)V

    iget-object v0, p0, Lxe/f$d;->k:Lxe/f;

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v1, p0, Lxe/f$d;->k:Lxe/f;

    iget-object v1, v1, Lxe/f;->F:Ljava/util/Set;

    iget v2, p0, Lxe/f$d;->i:I

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
    :cond_0
    :goto_0
    return-void
.end method
