.class public final La1/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La1/d$a;,
        La1/d$b;,
        La1/d$c;
    }
.end annotation


# static fields
.field public static final a:La1/d;

.field public static b:La1/d$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, La1/d;

    invoke-direct {v0}, La1/d;-><init>()V

    sput-object v0, La1/d;->a:La1/d;

    sget-object v0, La1/d$c;->e:La1/d$c;

    sput-object v0, La1/d;->b:La1/d$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(La1/d$c;La1/n;)V
    .locals 0

    invoke-static {p0, p1}, La1/d;->e(La1/d$c;La1/n;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/String;La1/n;)V
    .locals 0

    invoke-static {p0, p1}, La1/d;->f(Ljava/lang/String;La1/n;)V

    return-void
.end method

.method public static final e(La1/d$c;La1/n;)V
    .locals 1

    const-string v0, "$policy"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$violation"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, La1/d$c;->b()La1/d$b;

    move-result-object p0

    invoke-interface {p0, p1}, La1/d$b;->a(La1/n;)V

    return-void
.end method

.method public static final f(Ljava/lang/String;La1/n;)V
    .locals 2

    const-string v0, "$violation"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Policy violation with PENALTY_DEATH in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "FragmentStrictMode"

    invoke-static {v0, p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    throw p1
.end method

.method public static final h(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V
    .locals 4

    const-string v0, "fragment"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previousFragmentId"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La1/a;

    invoke-direct {v0, p0, p1}, La1/a;-><init>(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    sget-object p1, La1/d;->a:La1/d;

    invoke-virtual {p1, v0}, La1/d;->g(La1/n;)V

    invoke-virtual {p1, p0}, La1/d;->c(Landroidx/fragment/app/Fragment;)La1/d$c;

    move-result-object v1

    invoke-virtual {v1}, La1/d$c;->a()Ljava/util/Set;

    move-result-object v2

    sget-object v3, La1/d$a;->j:La1/d$a;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1, v1, p0, v2}, La1/d;->r(La1/d$c;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {p1, v1, v0}, La1/d;->d(La1/d$c;La1/n;)V

    :cond_0
    return-void
.end method

.method public static final i(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V
    .locals 4

    const-string v0, "fragment"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La1/e;

    invoke-direct {v0, p0, p1}, La1/e;-><init>(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V

    sget-object p1, La1/d;->a:La1/d;

    invoke-virtual {p1, v0}, La1/d;->g(La1/n;)V

    invoke-virtual {p1, p0}, La1/d;->c(Landroidx/fragment/app/Fragment;)La1/d$c;

    move-result-object v1

    invoke-virtual {v1}, La1/d$c;->a()Ljava/util/Set;

    move-result-object v2

    sget-object v3, La1/d$a;->k:La1/d$a;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1, v1, p0, v2}, La1/d;->r(La1/d$c;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {p1, v1, v0}, La1/d;->d(La1/d$c;La1/n;)V

    :cond_0
    return-void
.end method

.method public static final j(Landroidx/fragment/app/Fragment;)V
    .locals 5

    const-string v0, "fragment"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La1/f;

    invoke-direct {v0, p0}, La1/f;-><init>(Landroidx/fragment/app/Fragment;)V

    sget-object v1, La1/d;->a:La1/d;

    invoke-virtual {v1, v0}, La1/d;->g(La1/n;)V

    invoke-virtual {v1, p0}, La1/d;->c(Landroidx/fragment/app/Fragment;)La1/d$c;

    move-result-object v2

    invoke-virtual {v2}, La1/d$c;->a()Ljava/util/Set;

    move-result-object v3

    sget-object v4, La1/d$a;->l:La1/d$a;

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v2, p0, v3}, La1/d;->r(La1/d$c;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {v1, v2, v0}, La1/d;->d(La1/d$c;La1/n;)V

    :cond_0
    return-void
.end method

.method public static final k(Landroidx/fragment/app/Fragment;)V
    .locals 5

    const-string v0, "fragment"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La1/g;

    invoke-direct {v0, p0}, La1/g;-><init>(Landroidx/fragment/app/Fragment;)V

    sget-object v1, La1/d;->a:La1/d;

    invoke-virtual {v1, v0}, La1/d;->g(La1/n;)V

    invoke-virtual {v1, p0}, La1/d;->c(Landroidx/fragment/app/Fragment;)La1/d$c;

    move-result-object v2

    invoke-virtual {v2}, La1/d$c;->a()Ljava/util/Set;

    move-result-object v3

    sget-object v4, La1/d$a;->n:La1/d$a;

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v2, p0, v3}, La1/d;->r(La1/d$c;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {v1, v2, v0}, La1/d;->d(La1/d$c;La1/n;)V

    :cond_0
    return-void
.end method

.method public static final l(Landroidx/fragment/app/Fragment;)V
    .locals 5

    const-string v0, "fragment"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La1/h;

    invoke-direct {v0, p0}, La1/h;-><init>(Landroidx/fragment/app/Fragment;)V

    sget-object v1, La1/d;->a:La1/d;

    invoke-virtual {v1, v0}, La1/d;->g(La1/n;)V

    invoke-virtual {v1, p0}, La1/d;->c(Landroidx/fragment/app/Fragment;)La1/d$c;

    move-result-object v2

    invoke-virtual {v2}, La1/d$c;->a()Ljava/util/Set;

    move-result-object v3

    sget-object v4, La1/d$a;->n:La1/d$a;

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v2, p0, v3}, La1/d;->r(La1/d$c;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {v1, v2, v0}, La1/d;->d(La1/d$c;La1/n;)V

    :cond_0
    return-void
.end method

.method public static final m(Landroidx/fragment/app/Fragment;)V
    .locals 5

    const-string v0, "fragment"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La1/j;

    invoke-direct {v0, p0}, La1/j;-><init>(Landroidx/fragment/app/Fragment;)V

    sget-object v1, La1/d;->a:La1/d;

    invoke-virtual {v1, v0}, La1/d;->g(La1/n;)V

    invoke-virtual {v1, p0}, La1/d;->c(Landroidx/fragment/app/Fragment;)La1/d$c;

    move-result-object v2

    invoke-virtual {v2}, La1/d$c;->a()Ljava/util/Set;

    move-result-object v3

    sget-object v4, La1/d$a;->l:La1/d$a;

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v2, p0, v3}, La1/d;->r(La1/d$c;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {v1, v2, v0}, La1/d;->d(La1/d$c;La1/n;)V

    :cond_0
    return-void
.end method

.method public static final n(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V
    .locals 3

    const-string v0, "violatingFragment"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targetFragment"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La1/k;

    invoke-direct {v0, p0, p1, p2}, La1/k;-><init>(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V

    sget-object p1, La1/d;->a:La1/d;

    invoke-virtual {p1, v0}, La1/d;->g(La1/n;)V

    invoke-virtual {p1, p0}, La1/d;->c(Landroidx/fragment/app/Fragment;)La1/d$c;

    move-result-object p2

    invoke-virtual {p2}, La1/d$c;->a()Ljava/util/Set;

    move-result-object v1

    sget-object v2, La1/d$a;->n:La1/d$a;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1, p2, p0, v1}, La1/d;->r(La1/d$c;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {p1, p2, v0}, La1/d;->d(La1/d$c;La1/n;)V

    :cond_0
    return-void
.end method

.method public static final o(Landroidx/fragment/app/Fragment;Z)V
    .locals 4

    const-string v0, "fragment"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La1/l;

    invoke-direct {v0, p0, p1}, La1/l;-><init>(Landroidx/fragment/app/Fragment;Z)V

    sget-object p1, La1/d;->a:La1/d;

    invoke-virtual {p1, v0}, La1/d;->g(La1/n;)V

    invoke-virtual {p1, p0}, La1/d;->c(Landroidx/fragment/app/Fragment;)La1/d$c;

    move-result-object v1

    invoke-virtual {v1}, La1/d$c;->a()Ljava/util/Set;

    move-result-object v2

    sget-object v3, La1/d$a;->m:La1/d$a;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1, v1, p0, v2}, La1/d;->r(La1/d$c;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {p1, v1, v0}, La1/d;->d(La1/d$c;La1/n;)V

    :cond_0
    return-void
.end method

.method public static final p(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V
    .locals 4

    const-string v0, "fragment"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "container"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La1/o;

    invoke-direct {v0, p0, p1}, La1/o;-><init>(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V

    sget-object p1, La1/d;->a:La1/d;

    invoke-virtual {p1, v0}, La1/d;->g(La1/n;)V

    invoke-virtual {p1, p0}, La1/d;->c(Landroidx/fragment/app/Fragment;)La1/d$c;

    move-result-object v1

    invoke-virtual {v1}, La1/d$c;->a()Ljava/util/Set;

    move-result-object v2

    sget-object v3, La1/d$a;->o:La1/d$a;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1, v1, p0, v2}, La1/d;->r(La1/d$c;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {p1, v1, v0}, La1/d;->d(La1/d$c;La1/n;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final c(Landroidx/fragment/app/Fragment;)La1/d$c;
    .locals 2

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/x;

    move-result-object v0

    const-string v1, "declaringFragment.parentFragmentManager"

    invoke-static {v0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/x;->B0()La1/d$c;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/x;->B0()La1/d$c;

    move-result-object p1

    invoke-static {p1}, Ltd/m;->c(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object p1, La1/d;->b:La1/d$c;

    return-object p1
.end method

.method public final d(La1/d$c;La1/n;)V
    .locals 4

    invoke-virtual {p2}, La1/n;->a()Landroidx/fragment/app/Fragment;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, La1/d$c;->a()Ljava/util/Set;

    move-result-object v2

    sget-object v3, La1/d$a;->h:La1/d$a;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Policy violation in "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "FragmentStrictMode"

    invoke-static {v3, v2, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    invoke-virtual {p1}, La1/d$c;->b()La1/d$b;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v2, La1/b;

    invoke-direct {v2, p1, p2}, La1/b;-><init>(La1/d$c;La1/n;)V

    invoke-virtual {p0, v0, v2}, La1/d;->q(Landroidx/fragment/app/Fragment;Ljava/lang/Runnable;)V

    :cond_1
    invoke-virtual {p1}, La1/d$c;->a()Ljava/util/Set;

    move-result-object p1

    sget-object v2, La1/d$a;->i:La1/d$a;

    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, La1/c;

    invoke-direct {p1, v1, p2}, La1/c;-><init>(Ljava/lang/String;La1/n;)V

    invoke-virtual {p0, v0, p1}, La1/d;->q(Landroidx/fragment/app/Fragment;Ljava/lang/Runnable;)V

    :cond_2
    return-void
.end method

.method public final g(La1/n;)V
    .locals 2

    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/x;->I0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StrictMode violation in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, La1/n;->a()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method

.method public final q(Landroidx/fragment/app/Fragment;Ljava/lang/Runnable;)V
    .locals 2

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/x;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/x;->v0()Landroidx/fragment/app/p;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/p;->g()Landroid/os/Handler;

    move-result-object p1

    const-string v0, "fragment.parentFragmentManager.host.handler"

    invoke-static {p1, v0}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    :goto_1
    return-void
.end method

.method public final r(La1/d$c;Ljava/lang/Class;Ljava/lang/Class;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La1/d$c;",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/fragment/app/Fragment;",
            ">;",
            "Ljava/lang/Class<",
            "+",
            "La1/n;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, La1/d$c;->c()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    const/4 p2, 0x1

    if-nez p1, :cond_0

    return p2

    :cond_0
    invoke-virtual {p3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, La1/n;

    invoke-static {v0, v1}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {p1, v0}, Lhd/v;->n(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-interface {p1, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, p2

    return p1
.end method
