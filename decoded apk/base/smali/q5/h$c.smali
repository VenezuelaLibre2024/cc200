.class public final Lq5/h$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj4/l$c;
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq5/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final h:Landroid/os/Handler;

.field public final synthetic i:Lq5/h;


# direct methods
.method public constructor <init>(Lq5/h;Lj4/l;)V
    .locals 0

    iput-object p1, p0, Lq5/h$c;->i:Lq5/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0}, Lp5/n0;->x(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lq5/h$c;->h:Landroid/os/Handler;

    invoke-interface {p2, p0, p1}, Lj4/l;->j(Lj4/l$c;Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public a(Lj4/l;JJ)V
    .locals 2

    sget p1, Lp5/n0;->a:I

    const/16 p4, 0x1e

    if-ge p1, p4, :cond_0

    iget-object p1, p0, Lq5/h$c;->h:Landroid/os/Handler;

    const/4 p4, 0x0

    const/16 p5, 0x20

    shr-long v0, p2, p5

    long-to-int p5, v0

    long-to-int p2, p2

    invoke-static {p1, p4, p5, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object p1

    iget-object p2, p0, Lq5/h$c;->h:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2, p3}, Lq5/h$c;->b(J)V

    :goto_0
    return-void
.end method

.method public final b(J)V
    .locals 2

    iget-object v0, p0, Lq5/h$c;->i:Lq5/h;

    iget-object v1, v0, Lq5/h;->s1:Lq5/h$c;

    if-ne p0, v1, :cond_2

    invoke-static {v0}, Lq5/h;->z1(Lq5/h;)Lj4/l;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    cmp-long v0, p1, v0

    if-nez v0, :cond_1

    iget-object p1, p0, Lq5/h$c;->i:Lq5/h;

    invoke-static {p1}, Lq5/h;->A1(Lq5/h;)V

    goto :goto_0

    :cond_1
    :try_start_0
    iget-object v0, p0, Lq5/h$c;->i:Lq5/h;

    invoke-virtual {v0, p1, p2}, Lq5/h;->a2(J)V
    :try_end_0
    .catch Ls3/q; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lq5/h$c;->i:Lq5/h;

    invoke-static {p2, p1}, Lq5/h;->B1(Lq5/h;Ls3/q;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    iget v0, p1, Landroid/os/Message;->what:I

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget p1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v0, p1}, Lp5/n0;->V0(II)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lq5/h$c;->b(J)V

    const/4 p1, 0x1

    return p1
.end method
