.class public final Lt0/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lud/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lud/a<",
        "Landroid/content/Context;",
        "Lr0/f<",
        "Lu0/d;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ls0/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls0/b<",
            "Lu0/d;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lsd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/l<",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lr0/d<",
            "Lu0/d;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public final d:Lce/p0;

.field public final e:Ljava/lang/Object;

.field public volatile f:Lr0/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/f<",
            "Lu0/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ls0/b;Lsd/l;Lce/p0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ls0/b<",
            "Lu0/d;",
            ">;",
            "Lsd/l<",
            "-",
            "Landroid/content/Context;",
            "+",
            "Ljava/util/List<",
            "+",
            "Lr0/d<",
            "Lu0/d;",
            ">;>;>;",
            "Lce/p0;",
            ")V"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "produceMigrations"

    invoke-static {p3, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p4, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt0/c;->a:Ljava/lang/String;

    iput-object p2, p0, Lt0/c;->b:Ls0/b;

    iput-object p3, p0, Lt0/c;->c:Lsd/l;

    iput-object p4, p0, Lt0/c;->d:Lce/p0;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt0/c;->e:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic b(Lt0/c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lt0/c;->a:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lyd/h;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1, p2}, Lt0/c;->c(Landroid/content/Context;Lyd/h;)Lr0/f;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/content/Context;Lyd/h;)Lr0/f;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lyd/h<",
            "*>;)",
            "Lr0/f<",
            "Lu0/d;",
            ">;"
        }
    .end annotation

    const-string v0, "thisRef"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lt0/c;->f:Lr0/f;

    if-nez p2, :cond_1

    iget-object p2, p0, Lt0/c;->e:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Lt0/c;->f:Lr0/f;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, Lu0/c;->a:Lu0/c;

    iget-object v1, p0, Lt0/c;->b:Ls0/b;

    iget-object v2, p0, Lt0/c;->c:Lsd/l;

    const-string v3, "applicationContext"

    invoke-static {p1, v3}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, p1}, Lsd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    iget-object v3, p0, Lt0/c;->d:Lce/p0;

    new-instance v4, Lt0/c$a;

    invoke-direct {v4, p1, p0}, Lt0/c$a;-><init>(Landroid/content/Context;Lt0/c;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lu0/c;->a(Ls0/b;Ljava/util/List;Lce/p0;Lsd/a;)Lr0/f;

    move-result-object p1

    iput-object p1, p0, Lt0/c;->f:Lr0/f;

    :cond_0
    iget-object p1, p0, Lt0/c;->f:Lr0/f;

    invoke-static {p1}, Ltd/m;->c(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    move-object p2, p1

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1

    :cond_1
    :goto_0
    return-object p2
.end method
