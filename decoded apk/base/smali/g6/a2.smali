.class public final Lg6/a2;
.super Lg6/q0;
.source ""


# instance fields
.field public final synthetic a:Landroid/app/Dialog;

.field public final synthetic b:Lg6/b2;


# direct methods
.method public constructor <init>(Lg6/b2;Landroid/app/Dialog;)V
    .locals 0

    iput-object p1, p0, Lg6/a2;->b:Lg6/b2;

    iput-object p2, p0, Lg6/a2;->a:Landroid/app/Dialog;

    invoke-direct {p0}, Lg6/q0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lg6/a2;->b:Lg6/b2;

    iget-object v0, v0, Lg6/b2;->i:Lg6/c2;

    invoke-static {v0}, Lg6/c2;->g(Lg6/c2;)V

    iget-object v0, p0, Lg6/a2;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg6/a2;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method
