.class public final Lqe/c$a;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqe/c;-><init>(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;ILjava/util/HashMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltd/n;",
        "Lsd/a<",
        "Lgd/s;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic h:Lqe/c;


# direct methods
.method public constructor <init>(Lqe/c;)V
    .locals 0

    iput-object p1, p0, Lqe/c$a;->h:Lqe/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lqe/c$a;->h:Lqe/c;

    invoke-static {v0}, Lqe/c;->e(Lqe/c;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lqe/c$a;->h:Lqe/c;

    invoke-static {v0}, Lqe/c;->d(Lqe/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqe/c$a;->h:Lqe/c;

    invoke-static {v0}, Lqe/c;->b(Lqe/c;)Lqe/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/BarcodeView;->u()V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lqe/c$a;->a()V

    sget-object v0, Lgd/s;->a:Lgd/s;

    return-object v0
.end method
