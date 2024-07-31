.class public final Landroidx/lifecycle/y;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Le1/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le1/a$b<",
            "Lr1/d;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Le1/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le1/a$b<",
            "Landroidx/lifecycle/i0;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Le1/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le1/a$b<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/y$b;

    invoke-direct {v0}, Landroidx/lifecycle/y$b;-><init>()V

    sput-object v0, Landroidx/lifecycle/y;->a:Le1/a$b;

    new-instance v0, Landroidx/lifecycle/y$c;

    invoke-direct {v0}, Landroidx/lifecycle/y$c;-><init>()V

    sput-object v0, Landroidx/lifecycle/y;->b:Le1/a$b;

    new-instance v0, Landroidx/lifecycle/y$a;

    invoke-direct {v0}, Landroidx/lifecycle/y$a;-><init>()V

    sput-object v0, Landroidx/lifecycle/y;->c:Le1/a$b;

    return-void
.end method

.method public static final a(Le1/a;)Landroidx/lifecycle/x;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/lifecycle/y;->a:Le1/a$b;

    invoke-virtual {p0, v0}, Le1/a;->a(Le1/a$b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr1/d;

    if-eqz v0, :cond_2

    sget-object v1, Landroidx/lifecycle/y;->b:Le1/a$b;

    invoke-virtual {p0, v1}, Le1/a;->a(Le1/a$b;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/i0;

    if-eqz v1, :cond_1

    sget-object v2, Landroidx/lifecycle/y;->c:Le1/a$b;

    invoke-virtual {p0, v2}, Le1/a;->a(Le1/a$b;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Bundle;

    sget-object v3, Landroidx/lifecycle/f0$c;->d:Le1/a$b;

    invoke-virtual {p0, v3}, Le1/a;->a(Le1/a$b;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_0

    invoke-static {v0, v1, p0, v2}, Landroidx/lifecycle/y;->b(Lr1/d;Landroidx/lifecycle/i0;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/x;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(Lr1/d;Landroidx/lifecycle/i0;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/x;
    .locals 1

    invoke-static {p0}, Landroidx/lifecycle/y;->d(Lr1/d;)Landroidx/lifecycle/z;

    move-result-object p0

    invoke-static {p1}, Landroidx/lifecycle/y;->e(Landroidx/lifecycle/i0;)Landroidx/lifecycle/a0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/a0;->f()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/x;

    if-nez v0, :cond_0

    sget-object v0, Landroidx/lifecycle/x;->f:Landroidx/lifecycle/x$a;

    invoke-virtual {p0, p2}, Landroidx/lifecycle/z;->b(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    invoke-virtual {v0, p0, p3}, Landroidx/lifecycle/x$a;->a(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/x;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/lifecycle/a0;->f()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public static final c(Lr1/d;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lr1/d;",
            ":",
            "Landroidx/lifecycle/i0;",
            ">(TT;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Landroidx/lifecycle/k;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/f;->b()Landroidx/lifecycle/f$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/f$b;->i:Landroidx/lifecycle/f$b;

    if-eq v0, v1, :cond_1

    sget-object v1, Landroidx/lifecycle/f$b;->j:Landroidx/lifecycle/f$b;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_3

    invoke-interface {p0}, Lr1/d;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v0

    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {v0, v1}, Landroidx/savedstate/a;->c(Ljava/lang/String;)Landroidx/savedstate/a$c;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Landroidx/lifecycle/z;

    invoke-interface {p0}, Lr1/d;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v2

    move-object v3, p0

    check-cast v3, Landroidx/lifecycle/i0;

    invoke-direct {v0, v2, v3}, Landroidx/lifecycle/z;-><init>(Landroidx/savedstate/a;Landroidx/lifecycle/i0;)V

    invoke-interface {p0}, Lr1/d;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Landroidx/savedstate/a;->h(Ljava/lang/String;Landroidx/savedstate/a$c;)V

    invoke-interface {p0}, Landroidx/lifecycle/k;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p0

    new-instance v1, Landroidx/lifecycle/SavedStateHandleAttacher;

    invoke-direct {v1, v0}, Landroidx/lifecycle/SavedStateHandleAttacher;-><init>(Landroidx/lifecycle/z;)V

    invoke-virtual {p0, v1}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/j;)V

    :cond_2
    return-void

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final d(Lr1/d;)Landroidx/lifecycle/z;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lr1/d;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object p0

    const-string v0, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {p0, v0}, Landroidx/savedstate/a;->c(Ljava/lang/String;)Landroidx/savedstate/a$c;

    move-result-object p0

    instance-of v0, p0, Landroidx/lifecycle/z;

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/lifecycle/z;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "enableSavedStateHandles() wasn\'t called prior to createSavedStateHandle() call"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final e(Landroidx/lifecycle/i0;)Landroidx/lifecycle/a0;
    .locals 4

    const-class v0, Landroidx/lifecycle/a0;

    const-string v1, "<this>"

    invoke-static {p0, v1}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Le1/c;

    invoke-direct {v1}, Le1/c;-><init>()V

    sget-object v2, Landroidx/lifecycle/y$d;->h:Landroidx/lifecycle/y$d;

    invoke-static {v0}, Ltd/x;->b(Ljava/lang/Class;)Lyd/c;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Le1/c;->a(Lyd/c;Lsd/l;)V

    invoke-virtual {v1}, Le1/c;->b()Landroidx/lifecycle/f0$b;

    move-result-object v1

    new-instance v2, Landroidx/lifecycle/f0;

    invoke-direct {v2, p0, v1}, Landroidx/lifecycle/f0;-><init>(Landroidx/lifecycle/i0;Landroidx/lifecycle/f0$b;)V

    const-string p0, "androidx.lifecycle.internal.SavedStateHandlesVM"

    invoke-virtual {v2, p0, v0}, Landroidx/lifecycle/f0;->b(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/e0;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/a0;

    return-object p0
.end method
