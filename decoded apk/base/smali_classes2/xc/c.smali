.class public final synthetic Lxc/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lxc/d;

.field public final synthetic i:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lxc/d;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxc/c;->h:Lxc/d;

    iput-object p2, p0, Lxc/c;->i:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lxc/c;->h:Lxc/d;

    iget-object v1, p0, Lxc/c;->i:Ljava/util/List;

    invoke-static {v0, v1}, Lxc/d;->a(Lxc/d;Ljava/util/List;)V

    return-void
.end method
