.class public final synthetic Lxc/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lxc/d;


# direct methods
.method public synthetic constructor <init>(Lxc/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxc/b;->h:Lxc/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lxc/b;->h:Lxc/d;

    invoke-static {v0}, Lxc/d;->b(Lxc/d;)V

    return-void
.end method
