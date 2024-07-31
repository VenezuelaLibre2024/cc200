.class public Lxe/f$g;
.super Lse/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe/f;->r0(ILxe/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lxe/b;

.field public final synthetic k:Lxe/f;


# direct methods
.method public varargs constructor <init>(Lxe/f;Ljava/lang/String;[Ljava/lang/Object;ILxe/b;)V
    .locals 0

    iput-object p1, p0, Lxe/f$g;->k:Lxe/f;

    iput p4, p0, Lxe/f$g;->i:I

    iput-object p5, p0, Lxe/f$g;->j:Lxe/b;

    invoke-direct {p0, p2, p3}, Lse/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 3

    iget-object v0, p0, Lxe/f$g;->k:Lxe/f;

    iget-object v0, v0, Lxe/f;->q:Lxe/l;

    iget v1, p0, Lxe/f$g;->i:I

    iget-object v2, p0, Lxe/f$g;->j:Lxe/b;

    invoke-interface {v0, v1, v2}, Lxe/l;->a(ILxe/b;)V

    iget-object v0, p0, Lxe/f$g;->k:Lxe/f;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lxe/f$g;->k:Lxe/f;

    iget-object v1, v1, Lxe/f;->F:Ljava/util/Set;

    iget v2, p0, Lxe/f$g;->i:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
