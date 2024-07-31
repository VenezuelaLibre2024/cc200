.class public final Lg6/b0;
.super Lg6/c2;
.source ""


# instance fields
.field public final l:Lu/b;

.field public final m:Lg6/f;


# direct methods
.method public constructor <init>(Lg6/i;Lg6/f;Le6/e;)V
    .locals 0
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-direct {p0, p1, p3}, Lg6/c2;-><init>(Lg6/i;Le6/e;)V

    new-instance p1, Lu/b;

    invoke-direct {p1}, Lu/b;-><init>()V

    iput-object p1, p0, Lg6/b0;->l:Lu/b;

    iput-object p2, p0, Lg6/b0;->m:Lg6/f;

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->mLifecycleFragment:Lg6/i;

    const-string p2, "ConnectionlessLifecycleHelper"

    invoke-interface {p1, p2, p0}, Lg6/i;->a(Ljava/lang/String;Lcom/google/android/gms/common/api/internal/LifecycleCallback;)V

    return-void
.end method

.method public static j(Landroid/app/Activity;Lg6/f;Lg6/b;)V
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getFragment(Landroid/app/Activity;)Lg6/i;

    move-result-object p0

    const-class v0, Lg6/b0;

    const-string v1, "ConnectionlessLifecycleHelper"

    invoke-interface {p0, v1, v0}, Lg6/i;->b(Ljava/lang/String;Ljava/lang/Class;)Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    move-result-object v0

    check-cast v0, Lg6/b0;

    if-nez v0, :cond_0

    new-instance v0, Lg6/b0;

    invoke-static {}, Le6/e;->m()Le6/e;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Lg6/b0;-><init>(Lg6/i;Lg6/f;Le6/e;)V

    :cond_0
    const-string p0, "ApiKey cannot be null"

    invoke-static {p2, p0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, v0, Lg6/b0;->l:Lu/b;

    invoke-virtual {p0, p2}, Lu/b;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v0}, Lg6/f;->d(Lg6/b0;)V

    return-void
.end method


# virtual methods
.method public final b(Le6/b;I)V
    .locals 1

    iget-object v0, p0, Lg6/b0;->m:Lg6/f;

    invoke-virtual {v0, p1, p2}, Lg6/f;->K(Le6/b;I)V

    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lg6/b0;->m:Lg6/f;

    invoke-virtual {v0}, Lg6/f;->b()V

    return-void
.end method

.method public final i()Lu/b;
    .locals 1

    iget-object v0, p0, Lg6/b0;->l:Lu/b;

    return-object v0
.end method

.method public final k()V
    .locals 1

    iget-object v0, p0, Lg6/b0;->l:Lu/b;

    invoke-virtual {v0}, Lu/b;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lg6/b0;->m:Lg6/f;

    invoke-virtual {v0, p0}, Lg6/f;->d(Lg6/b0;)V

    :cond_0
    return-void
.end method

.method public final onResume()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->onResume()V

    invoke-virtual {p0}, Lg6/b0;->k()V

    return-void
.end method

.method public final onStart()V
    .locals 0

    invoke-super {p0}, Lg6/c2;->onStart()V

    invoke-virtual {p0}, Lg6/b0;->k()V

    return-void
.end method

.method public final onStop()V
    .locals 1

    invoke-super {p0}, Lg6/c2;->onStop()V

    iget-object v0, p0, Lg6/b0;->m:Lg6/f;

    invoke-virtual {v0, p0}, Lg6/f;->e(Lg6/b0;)V

    return-void
.end method
