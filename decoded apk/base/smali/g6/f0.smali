.class public final Lg6/f0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg6/c$a;


# instance fields
.field public final synthetic a:Lg6/f;


# direct methods
.method public constructor <init>(Lg6/f;)V
    .locals 0

    iput-object p1, p0, Lg6/f0;->a:Lg6/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 3

    iget-object v0, p0, Lg6/f0;->a:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v1

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method