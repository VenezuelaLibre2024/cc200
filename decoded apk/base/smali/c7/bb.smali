.class public final synthetic Lc7/bb;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic h:Lc7/za;

.field public synthetic i:I

.field public synthetic j:Lc7/v4;

.field public synthetic k:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Lc7/za;ILc7/v4;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/bb;->h:Lc7/za;

    iput p2, p0, Lc7/bb;->i:I

    iput-object p3, p0, Lc7/bb;->j:Lc7/v4;

    iput-object p4, p0, Lc7/bb;->k:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lc7/bb;->h:Lc7/za;

    iget v1, p0, Lc7/bb;->i:I

    iget-object v2, p0, Lc7/bb;->j:Lc7/v4;

    iget-object v3, p0, Lc7/bb;->k:Landroid/content/Intent;

    invoke-virtual {v0, v1, v2, v3}, Lc7/za;->d(ILc7/v4;Landroid/content/Intent;)V

    return-void
.end method
