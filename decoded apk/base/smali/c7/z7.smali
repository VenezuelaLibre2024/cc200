.class public final synthetic Lc7/z7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic h:Lc7/w7;

.field public synthetic i:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lc7/w7;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/z7;->h:Lc7/w7;

    iput-object p2, p0, Lc7/z7;->i:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc7/z7;->h:Lc7/w7;

    iget-object v1, p0, Lc7/z7;->i:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Lc7/w7;->B(Landroid/os/Bundle;)V

    return-void
.end method
