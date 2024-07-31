.class public abstract Le5/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld5/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le5/e$c;,
        Le5/e$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Le5/e$b;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Ld5/m;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/PriorityQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/PriorityQueue<",
            "Le5/e$b;",
            ">;"
        }
    .end annotation
.end field

.field public d:Le5/e$b;

.field public e:J

.field public f:J


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Le5/e;->a:Ljava/util/ArrayDeque;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/16 v2, 0xa

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Le5/e;->a:Ljava/util/ArrayDeque;

    new-instance v3, Le5/e$b;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Le5/e$b;-><init>(Le5/e$a;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v1, p0, Le5/e;->b:Ljava/util/ArrayDeque;

    :goto_1
    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Le5/e;->b:Ljava/util/ArrayDeque;

    new-instance v2, Le5/e$c;

    new-instance v3, Le5/d;

    invoke-direct {v3, p0}, Le5/d;-><init>(Le5/e;)V

    invoke-direct {v2, v3}, Le5/e$c;-><init>(Lv3/h$a;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/util/PriorityQueue;

    invoke-direct {v0}, Ljava/util/PriorityQueue;-><init>()V

    iput-object v0, p0, Le5/e;->c:Ljava/util/PriorityQueue;

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 0

    iput-wide p1, p0, Le5/e;->e:J

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Le5/e;->h()Ld5/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Le5/e;->g()Ld5/l;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ld5/l;

    invoke-virtual {p0, p1}, Le5/e;->l(Ld5/l;)V

    return-void
.end method

.method public abstract e()Ld5/h;
.end method

.method public abstract f(Ld5/l;)V
.end method

.method public flush()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Le5/e;->f:J

    iput-wide v0, p0, Le5/e;->e:J

    :goto_0
    iget-object v0, p0, Le5/e;->c:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Le5/e;->c:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le5/e$b;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le5/e$b;

    invoke-virtual {p0, v0}, Le5/e;->m(Le5/e$b;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le5/e;->d:Le5/e$b;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Le5/e;->m(Le5/e$b;)V

    const/4 v0, 0x0

    iput-object v0, p0, Le5/e;->d:Le5/e$b;

    :cond_1
    return-void
.end method

.method public g()Ld5/l;
    .locals 1

    iget-object v0, p0, Le5/e;->d:Le5/e$b;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp5/a;->f(Z)V

    iget-object v0, p0, Le5/e;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    iget-object v0, p0, Le5/e;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le5/e$b;

    iput-object v0, p0, Le5/e;->d:Le5/e$b;

    return-object v0
.end method

.method public h()Ld5/m;
    .locals 9

    iget-object v0, p0, Le5/e;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    :goto_0
    iget-object v0, p0, Le5/e;->c:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Le5/e;->c:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le5/e$b;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le5/e$b;

    iget-wide v2, v0, Lv3/g;->l:J

    iget-wide v4, p0, Le5/e;->e:J

    cmp-long v0, v2, v4

    if-gtz v0, :cond_3

    iget-object v0, p0, Le5/e;->c:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le5/e$b;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le5/e$b;

    invoke-virtual {v0}, Lv3/a;->q()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v1, p0, Le5/e;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld5/m;

    invoke-static {v1}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld5/m;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lv3/a;->i(I)V

    :goto_1
    invoke-virtual {p0, v0}, Le5/e;->m(Le5/e$b;)V

    return-object v1

    :cond_1
    invoke-virtual {p0, v0}, Le5/e;->f(Ld5/l;)V

    invoke-virtual {p0}, Le5/e;->k()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Le5/e;->e()Ld5/h;

    move-result-object v6

    iget-object v1, p0, Le5/e;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld5/m;

    invoke-static {v1}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld5/m;

    iget-wide v4, v0, Lv3/g;->l:J

    const-wide v7, 0x7fffffffffffffffL

    move-object v3, v1

    invoke-virtual/range {v3 .. v8}, Ld5/m;->w(JLd5/h;J)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v0}, Le5/e;->m(Le5/e$b;)V

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public final i()Ld5/m;
    .locals 1

    iget-object v0, p0, Le5/e;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld5/m;

    return-object v0
.end method

.method public final j()J
    .locals 2

    iget-wide v0, p0, Le5/e;->e:J

    return-wide v0
.end method

.method public abstract k()Z
.end method

.method public l(Ld5/l;)V
    .locals 4

    iget-object v0, p0, Le5/e;->d:Le5/e$b;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp5/a;->a(Z)V

    check-cast p1, Le5/e$b;

    invoke-virtual {p1}, Lv3/a;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Le5/e;->m(Le5/e$b;)V

    goto :goto_1

    :cond_1
    iget-wide v0, p0, Le5/e;->f:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Le5/e;->f:J

    invoke-static {p1, v0, v1}, Le5/e$b;->B(Le5/e$b;J)J

    iget-object v0, p0, Le5/e;->c:Ljava/util/PriorityQueue;

    invoke-virtual {v0, p1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    :goto_1
    const/4 p1, 0x0

    iput-object p1, p0, Le5/e;->d:Le5/e$b;

    return-void
.end method

.method public final m(Le5/e$b;)V
    .locals 1

    invoke-virtual {p1}, Lv3/g;->l()V

    iget-object v0, p0, Le5/e;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public n(Ld5/m;)V
    .locals 1

    invoke-virtual {p1}, Ld5/m;->l()V

    iget-object v0, p0, Le5/e;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public release()V
    .locals 0

    return-void
.end method
