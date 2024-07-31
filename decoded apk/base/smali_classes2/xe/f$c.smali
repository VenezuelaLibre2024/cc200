.class public Lxe/f$c;
.super Lse/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe/f;->v0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic i:Lxe/f;


# direct methods
.method public varargs constructor <init>(Lxe/f;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lxe/f$c;->i:Lxe/f;

    invoke-direct {p0, p2, p3}, Lse/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 3

    iget-object v0, p0, Lxe/f$c;->i:Lxe/f;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2, v1}, Lxe/f;->J0(ZII)V

    return-void
.end method
