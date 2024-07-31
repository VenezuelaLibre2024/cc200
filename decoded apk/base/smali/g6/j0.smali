.class public final Lg6/j0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh6/c$e;


# instance fields
.field public final synthetic a:Lg6/k0;


# direct methods
.method public constructor <init>(Lg6/k0;)V
    .locals 0

    iput-object p1, p0, Lg6/j0;->a:Lg6/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lg6/j0;->a:Lg6/k0;

    iget-object v0, v0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lg6/i0;

    invoke-direct {v1, p0}, Lg6/i0;-><init>(Lg6/j0;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
