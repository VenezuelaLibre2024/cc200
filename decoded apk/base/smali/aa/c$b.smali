.class public Laa/c$b;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laa/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Float;",
        "Ljava/lang/Void;",
        "Ljava/util/Set<",
        "+",
        "Laa/a<",
        "TT;>;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Laa/c;


# direct methods
.method public constructor <init>(Laa/c;)V
    .locals 0

    iput-object p1, p0, Laa/c$b;->a:Laa/c;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Laa/c;Laa/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, Laa/c$b;-><init>(Laa/c;)V

    return-void
.end method


# virtual methods
.method public varargs a([Ljava/lang/Float;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Float;",
            ")",
            "Ljava/util/Set<",
            "+",
            "Laa/a<",
            "TT;>;>;"
        }
    .end annotation

    iget-object v0, p0, Laa/c$b;->a:Laa/c;

    invoke-virtual {v0}, Laa/c;->e()Lba/b;

    move-result-object v0

    invoke-interface {v0}, Lba/b;->f()V

    const/4 v1, 0x0

    :try_start_0
    aget-object p1, p1, v1

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-interface {v0, p1}, Lba/b;->b(F)Ljava/util/Set;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Lba/b;->e()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Lba/b;->e()V

    throw p1
.end method

.method public b(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Laa/a<",
            "TT;>;>;)V"
        }
    .end annotation

    iget-object v0, p0, Laa/c$b;->a:Laa/c;

    invoke-static {v0}, Laa/c;->a(Laa/c;)Lca/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lca/a;->onClustersChanged(Ljava/util/Set;)V

    return-void
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Float;

    invoke-virtual {p0, p1}, Laa/c$b;->a([Ljava/lang/Float;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, Laa/c$b;->b(Ljava/util/Set;)V

    return-void
.end method
