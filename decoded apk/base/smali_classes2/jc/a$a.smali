.class public Ljc/a$a;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljc/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Ljc/a;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic b:Ljc/a;


# direct methods
.method public constructor <init>(Ljc/a;Ljc/a;)V
    .locals 0

    iput-object p1, p0, Ljc/a$a;->b:Ljc/a;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ljc/a$a;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_3

    :cond_0
    iget-object v0, p0, Ljc/a$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljc/a;

    if-eqz v0, :cond_3

    :goto_0
    invoke-static {v0}, Ljc/a;->a(Ljc/a;)I

    move-result v2

    if-lez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-static {v0}, Ljc/a;->b(Ljc/a;)V

    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    iget v0, p1, Landroid/os/Message;->what:I

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Ljc/a$a;->b:Ljc/a;

    invoke-static {v0}, Ljc/a;->c(Ljc/a;)Lkc/a;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Ljc/a$a;->b:Ljc/a;

    invoke-static {v0}, Ljc/a;->c(Ljc/a;)Lkc/a;

    move-result-object v0

    invoke-interface {v0}, Lkc/a;->a()V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Ljc/a$a;->b:Ljc/a;

    invoke-static {v0}, Ljc/a;->d(Ljc/a;)V

    :cond_3
    :goto_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xf

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ljc/a$a;->b:Ljc/a;

    invoke-static {v0}, Ljc/a;->c(Ljc/a;)Lkc/a;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Ljc/a$a;->b:Ljc/a;

    invoke-static {v0}, Ljc/a;->c(Ljc/a;)Lkc/a;

    move-result-object v0

    invoke-interface {v0}, Lkc/a;->b()V

    :cond_4
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    return-void
.end method
