.class public final Lxe/f$k;
.super Lse/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "k"
.end annotation


# instance fields
.field public final i:Z

.field public final j:I

.field public final k:I

.field public final synthetic l:Lxe/f;


# direct methods
.method public constructor <init>(Lxe/f;ZII)V
    .locals 2

    iput-object p1, p0, Lxe/f$k;->l:Lxe/f;

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget-object p1, p1, Lxe/f;->k:Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x2

    aput-object p1, v0, v1

    const-string p1, "OkHttp %s ping %08x%08x"

    invoke-direct {p0, p1, v0}, Lse/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-boolean p2, p0, Lxe/f$k;->i:Z

    iput p3, p0, Lxe/f$k;->j:I

    iput p4, p0, Lxe/f$k;->k:I

    return-void
.end method


# virtual methods
.method public k()V
    .locals 4

    iget-object v0, p0, Lxe/f$k;->l:Lxe/f;

    iget-boolean v1, p0, Lxe/f$k;->i:Z

    iget v2, p0, Lxe/f$k;->j:I

    iget v3, p0, Lxe/f$k;->k:I

    invoke-virtual {v0, v1, v2, v3}, Lxe/f;->J0(ZII)V

    return-void
.end method
