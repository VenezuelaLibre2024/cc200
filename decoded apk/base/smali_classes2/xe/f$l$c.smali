.class public Lxe/f$l$c;
.super Lse/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe/f$l;->l(ZLxe/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic i:Lxe/f$l;


# direct methods
.method public varargs constructor <init>(Lxe/f$l;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lxe/f$l$c;->i:Lxe/f$l;

    invoke-direct {p0, p2, p3}, Lse/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 2

    iget-object v0, p0, Lxe/f$l$c;->i:Lxe/f$l;

    iget-object v0, v0, Lxe/f$l;->j:Lxe/f;

    iget-object v1, v0, Lxe/f;->i:Lxe/f$j;

    invoke-virtual {v1, v0}, Lxe/f$j;->a(Lxe/f;)V

    return-void
.end method
