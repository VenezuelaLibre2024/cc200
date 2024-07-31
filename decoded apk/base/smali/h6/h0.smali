.class public final Lh6/h0;
.super Lh6/i0;
.source ""


# instance fields
.field public final synthetic h:Landroid/content/Intent;

.field public final synthetic i:Lg6/i;


# direct methods
.method public constructor <init>(Landroid/content/Intent;Lg6/i;I)V
    .locals 0

    iput-object p1, p0, Lh6/h0;->h:Landroid/content/Intent;

    iput-object p2, p0, Lh6/h0;->i:Lg6/i;

    invoke-direct {p0}, Lh6/i0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lh6/h0;->h:Landroid/content/Intent;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lh6/h0;->i:Lg6/i;

    const/4 v2, 0x2

    invoke-interface {v1, v0, v2}, Lg6/i;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method
