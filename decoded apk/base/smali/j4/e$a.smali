.class public Lj4/e$a;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj4/e;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lj4/e;


# direct methods
.method public constructor <init>(Lj4/e;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lj4/e$a;->a:Lj4/e;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    iget-object v0, p0, Lj4/e$a;->a:Lj4/e;

    invoke-static {v0, p1}, Lj4/e;->a(Lj4/e;Landroid/os/Message;)V

    return-void
.end method
