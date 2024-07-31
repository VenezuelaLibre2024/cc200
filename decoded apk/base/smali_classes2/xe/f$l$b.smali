.class public Lxe/f$l$b;
.super Lse/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe/f$l;->i(ZLxe/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic i:Z

.field public final synthetic j:Lxe/m;

.field public final synthetic k:Lxe/f$l;


# direct methods
.method public varargs constructor <init>(Lxe/f$l;Ljava/lang/String;[Ljava/lang/Object;ZLxe/m;)V
    .locals 0

    iput-object p1, p0, Lxe/f$l$b;->k:Lxe/f$l;

    iput-boolean p4, p0, Lxe/f$l$b;->i:Z

    iput-object p5, p0, Lxe/f$l$b;->j:Lxe/m;

    invoke-direct {p0, p2, p3}, Lse/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 3

    iget-object v0, p0, Lxe/f$l$b;->k:Lxe/f$l;

    iget-boolean v1, p0, Lxe/f$l$b;->i:Z

    iget-object v2, p0, Lxe/f$l$b;->j:Lxe/m;

    invoke-virtual {v0, v1, v2}, Lxe/f$l;->l(ZLxe/m;)V

    return-void
.end method
