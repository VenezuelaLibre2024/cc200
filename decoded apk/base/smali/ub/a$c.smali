.class public Lub/a$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lub/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lub/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:Landroid/os/Handler;

.field public b:Lub/b;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lub/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lub/a$c;->a:Landroid/os/Handler;

    iput-object p2, p0, Lub/a$c;->b:Lub/b;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Handler;Lub/b;Lub/a$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lub/a$c;-><init>(Landroid/os/Handler;Lub/b;)V

    return-void
.end method

.method public static synthetic e(Lub/a$c;)Lub/b;
    .locals 0

    iget-object p0, p0, Lub/a$c;->b:Lub/b;

    return-object p0
.end method


# virtual methods
.method public a(I)V
    .locals 2

    iget-object v0, p0, Lub/a$c;->a:Landroid/os/Handler;

    new-instance v1, Lub/a$c$b;

    invoke-direct {v1, p0, p1}, Lub/a$c$b;-><init>(Lub/a$c;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b(D)V
    .locals 2

    iget-object v0, p0, Lub/a$c;->a:Landroid/os/Handler;

    new-instance v1, Lub/a$c$d;

    invoke-direct {v1, p0, p1, p2}, Lub/a$c$d;-><init>(Lub/a$c;D)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public c(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lub/a$c;->a:Landroid/os/Handler;

    new-instance v1, Lub/a$c$c;

    invoke-direct {v1, p0, p1}, Lub/a$c$c;-><init>(Lub/a$c;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lub/a$c;->a:Landroid/os/Handler;

    new-instance v1, Lub/a$c$a;

    invoke-direct {v1, p0}, Lub/a$c$a;-><init>(Lub/a$c;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
