.class public final Lg6/b2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final h:Lg6/z1;

.field public final synthetic i:Lg6/c2;


# direct methods
.method public constructor <init>(Lg6/c2;Lg6/z1;)V
    .locals 0

    iput-object p1, p0, Lg6/b2;->i:Lg6/c2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lg6/b2;->h:Lg6/z1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, Lg6/b2;->i:Lg6/c2;

    iget-boolean v0, v0, Lg6/c2;->h:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lg6/b2;->h:Lg6/z1;

    invoke-virtual {v0}, Lg6/z1;->b()Le6/b;

    move-result-object v0

    invoke-virtual {v0}, Le6/b;->L()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lg6/b2;->i:Lg6/c2;

    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->mLifecycleFragment:Lg6/i;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0}, Le6/b;->K()Landroid/app/PendingIntent;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    iget-object v3, p0, Lg6/b2;->h:Lg6/z1;

    invoke-virtual {v3}, Lg6/z1;->a()I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v1, v0, v3, v4}, Lcom/google/android/gms/common/api/GoogleApiActivity;->a(Landroid/content/Context;Landroid/app/PendingIntent;IZ)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v2, v0, v1}, Lg6/i;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :cond_1
    iget-object v1, p0, Lg6/b2;->i:Lg6/c2;

    iget-object v2, v1, Lg6/c2;->k:Le6/e;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0}, Le6/b;->I()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v2, v1, v3, v4}, Le6/e;->b(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lg6/b2;->i:Lg6/c2;

    iget-object v2, v1, Lg6/c2;->k:Le6/e;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getActivity()Landroid/app/Activity;

    move-result-object v3

    iget-object v1, p0, Lg6/b2;->i:Lg6/c2;

    iget-object v4, v1, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->mLifecycleFragment:Lg6/i;

    invoke-virtual {v0}, Le6/b;->I()I

    move-result v5

    const/4 v6, 0x2

    iget-object v7, p0, Lg6/b2;->i:Lg6/c2;

    invoke-virtual/range {v2 .. v7}, Le6/e;->v(Landroid/app/Activity;Lg6/i;IILandroid/content/DialogInterface$OnCancelListener;)Z

    return-void

    :cond_2
    invoke-virtual {v0}, Le6/b;->I()I

    move-result v1

    const/16 v2, 0x12

    if-ne v1, v2, :cond_3

    iget-object v0, p0, Lg6/b2;->i:Lg6/c2;

    iget-object v1, v0, Lg6/c2;->k:Le6/e;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getActivity()Landroid/app/Activity;

    move-result-object v0

    iget-object v2, p0, Lg6/b2;->i:Lg6/c2;

    invoke-virtual {v1, v0, v2}, Le6/e;->q(Landroid/app/Activity;Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/Dialog;

    move-result-object v0

    iget-object v1, p0, Lg6/b2;->i:Lg6/c2;

    iget-object v2, v1, Lg6/c2;->k:Le6/e;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    new-instance v3, Lg6/a2;

    invoke-direct {v3, p0, v0}, Lg6/a2;-><init>(Lg6/b2;Landroid/app/Dialog;)V

    invoke-virtual {v2, v1, v3}, Le6/e;->r(Landroid/content/Context;Lg6/q0;)Lg6/r0;

    return-void

    :cond_3
    iget-object v1, p0, Lg6/b2;->i:Lg6/c2;

    iget-object v2, p0, Lg6/b2;->h:Lg6/z1;

    invoke-virtual {v2}, Lg6/z1;->a()I

    move-result v2

    invoke-static {v1, v0, v2}, Lg6/c2;->f(Lg6/c2;Le6/b;I)V

    return-void
.end method
