.class public final synthetic Lc7/n6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic h:Lc7/o6;

.field public synthetic i:Ljava/lang/String;

.field public synthetic j:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lc7/o6;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/n6;->h:Lc7/o6;

    iput-object p2, p0, Lc7/n6;->i:Ljava/lang/String;

    iput-object p3, p0, Lc7/n6;->j:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lc7/n6;->h:Lc7/o6;

    iget-object v1, p0, Lc7/n6;->i:Ljava/lang/String;

    iget-object v2, p0, Lc7/n6;->j:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2}, Lc7/o6;->g(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
