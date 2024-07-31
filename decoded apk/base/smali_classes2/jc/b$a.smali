.class public Ljc/b$a;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljc/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljc/b;


# direct methods
.method public constructor <init>(Ljc/b;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Ljc/b$a;->a:Ljc/b;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    iget-object v0, p0, Ljc/b$a;->a:Ljc/b;

    invoke-static {v0}, Ljc/b;->a(Ljc/b;)Lkc/a;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Ljc/b$a;->a:Ljc/b;

    invoke-static {v0}, Ljc/b;->a(Ljc/b;)Lkc/a;

    move-result-object v0

    invoke-interface {v0}, Lkc/a;->c()V

    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Ljc/b$a;->a:Ljc/b;

    invoke-static {v0}, Ljc/b;->a(Ljc/b;)Lkc/a;

    move-result-object v0

    invoke-interface {v0}, Lkc/a;->f()V

    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xf

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Ljc/b$a;->a:Ljc/b;

    invoke-static {v0}, Ljc/b;->a(Ljc/b;)Lkc/a;

    move-result-object v0

    invoke-interface {v0}, Lkc/a;->b()V

    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x14

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ljc/b$a;->a:Ljc/b;

    invoke-static {v0}, Ljc/b;->a(Ljc/b;)Lkc/a;

    move-result-object v0

    invoke-interface {v0}, Lkc/a;->e()V

    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x7d

    if-ne v0, v1, :cond_5

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljc/c;

    iget-object v1, p0, Ljc/b$a;->a:Ljc/b;

    invoke-static {v1}, Ljc/b;->a(Ljc/b;)Lkc/a;

    move-result-object v1

    invoke-interface {v1, v0}, Lkc/a;->d(Ljc/c;)V

    :cond_5
    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0x87

    if-ne p1, v0, :cond_6

    iget-object p1, p0, Ljc/b$a;->a:Ljc/b;

    invoke-static {p1}, Ljc/b;->a(Ljc/b;)Lkc/a;

    move-result-object p1

    invoke-interface {p1}, Lkc/a;->a()V

    :cond_6
    return-void
.end method
