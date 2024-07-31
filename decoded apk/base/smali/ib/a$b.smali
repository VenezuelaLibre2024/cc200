.class public Lib/a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lib/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lib/a;


# direct methods
.method public constructor <init>(Lib/a;)V
    .locals 0

    iput-object p1, p0, Lib/a$b;->a:Lib/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lib/a$b;)V
    .locals 0

    invoke-direct {p0}, Lib/a$b;->b()V

    return-void
.end method

.method private synthetic b()V
    .locals 2

    iget-object v0, p0, Lib/a$b;->a:Lib/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lib/a;->d(Lib/a;Z)Z

    iget-object v0, p0, Lib/a$b;->a:Lib/a;

    invoke-static {v0}, Lib/a;->e(Lib/a;)V

    return-void
.end method


# virtual methods
.method public onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 0

    iget-object p1, p0, Lib/a$b;->a:Lib/a;

    invoke-static {p1}, Lib/a;->c(Lib/a;)Landroid/os/Handler;

    move-result-object p1

    new-instance p2, Lib/b;

    invoke-direct {p2, p0}, Lib/b;-><init>(Lib/a$b;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
