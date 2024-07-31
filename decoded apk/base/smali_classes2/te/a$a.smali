.class public Lte/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lbf/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lte/a;->b(Lte/b;Lre/d0;)Lre/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public h:Z

.field public final synthetic i:Lbf/e;

.field public final synthetic j:Lte/b;

.field public final synthetic k:Lbf/d;

.field public final synthetic l:Lte/a;


# direct methods
.method public constructor <init>(Lte/a;Lbf/e;Lte/b;Lbf/d;)V
    .locals 0

    iput-object p1, p0, Lte/a$a;->l:Lte/a;

    iput-object p2, p0, Lte/a$a;->i:Lbf/e;

    iput-object p3, p0, Lte/a$a;->j:Lte/b;

    iput-object p4, p0, Lte/a$a;->k:Lbf/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public T(Lbf/c;J)J
    .locals 8

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, Lte/a$a;->i:Lbf/e;

    invoke-interface {v1, p1, p2, p3}, Lbf/t;->T(Lbf/c;J)J

    move-result-wide p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v1, -0x1

    cmp-long v3, p2, v1

    if-nez v3, :cond_1

    iget-boolean p1, p0, Lte/a$a;->h:Z

    if-nez p1, :cond_0

    iput-boolean v0, p0, Lte/a$a;->h:Z

    iget-object p1, p0, Lte/a$a;->k:Lbf/d;

    invoke-interface {p1}, Lbf/s;->close()V

    :cond_0
    return-wide v1

    :cond_1
    iget-object v0, p0, Lte/a$a;->k:Lbf/d;

    invoke-interface {v0}, Lbf/d;->b()Lbf/c;

    move-result-object v3

    invoke-virtual {p1}, Lbf/c;->g0()J

    move-result-wide v0

    sub-long v4, v0, p2

    move-object v2, p1

    move-wide v6, p2

    invoke-virtual/range {v2 .. v7}, Lbf/c;->w(Lbf/c;JJ)Lbf/c;

    iget-object p1, p0, Lte/a$a;->k:Lbf/d;

    invoke-interface {p1}, Lbf/d;->J()Lbf/d;

    return-wide p2

    :catch_0
    move-exception p1

    iget-boolean p2, p0, Lte/a$a;->h:Z

    if-nez p2, :cond_2

    iput-boolean v0, p0, Lte/a$a;->h:Z

    iget-object p2, p0, Lte/a$a;->j:Lte/b;

    invoke-interface {p2}, Lte/b;->a()V

    :cond_2
    throw p1
.end method

.method public c()Lbf/u;
    .locals 1

    iget-object v0, p0, Lte/a$a;->i:Lbf/e;

    invoke-interface {v0}, Lbf/t;->c()Lbf/u;

    move-result-object v0

    return-object v0
.end method

.method public close()V
    .locals 2

    iget-boolean v0, p0, Lte/a$a;->h:Z

    if-nez v0, :cond_0

    const/16 v0, 0x64

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, v0, v1}, Lse/e;->o(Lbf/t;ILjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lte/a$a;->h:Z

    iget-object v0, p0, Lte/a$a;->j:Lte/b;

    invoke-interface {v0}, Lte/b;->a()V

    :cond_0
    iget-object v0, p0, Lte/a$a;->i:Lbf/e;

    invoke-interface {v0}, Lbf/t;->close()V

    return-void
.end method
