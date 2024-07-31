.class public Landroidx/work/impl/WorkDatabase$b;
.super Lo1/e$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/WorkDatabase;->u()Lo1/e$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lo1/e$b;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ls1/b;)V
    .locals 1

    invoke-super {p0, p1}, Lo1/e$b;->c(Ls1/b;)V

    invoke-interface {p1}, Ls1/b;->g()V

    :try_start_0
    invoke-static {}, Landroidx/work/impl/WorkDatabase;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ls1/b;->p(Ljava/lang/String;)V

    invoke-interface {p1}, Ls1/b;->N()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ls1/b;->Z()V

    return-void

    :catchall_0
    move-exception v0

    invoke-interface {p1}, Ls1/b;->Z()V

    throw v0
.end method
