.class public Lm2/a$b;
.super Lm2/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm2/a;->d(Ljava/lang/String;Ld2/i;)Lm2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic i:Ld2/i;

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ld2/i;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lm2/a$b;->i:Ld2/i;

    iput-object p2, p0, Lm2/a$b;->j:Ljava/lang/String;

    invoke-direct {p0}, Lm2/a;-><init>()V

    return-void
.end method


# virtual methods
.method public h()V
    .locals 4

    iget-object v0, p0, Lm2/a$b;->i:Ld2/i;

    invoke-virtual {v0}, Ld2/i;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lo1/e;->c()V

    :try_start_0
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->B()Ll2/q;

    move-result-object v1

    iget-object v2, p0, Lm2/a$b;->j:Ljava/lang/String;

    invoke-interface {v1, v2}, Ll2/q;->p(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lm2/a$b;->i:Ld2/i;

    invoke-virtual {p0, v3, v2}, Lm2/a;->a(Ld2/i;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lo1/e;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lo1/e;->g()V

    iget-object v0, p0, Lm2/a$b;->i:Ld2/i;

    invoke-virtual {p0, v0}, Lm2/a;->g(Ld2/i;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lo1/e;->g()V

    throw v1
.end method
