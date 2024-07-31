.class public final Lo9/g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo9/g$b;
    }
.end annotation


# static fields
.field public static final c:Lo9/g$b;

.field public static final d:Lu0/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu0/d$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final e:Lu0/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu0/d$a<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final f:Lu0/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu0/d$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final g:Lu0/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu0/d$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final h:Lu0/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu0/d$a<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field public final a:Lr0/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/f<",
            "Lu0/d;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lo9/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo9/g$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo9/g$b;-><init>(Ltd/g;)V

    sput-object v0, Lo9/g;->c:Lo9/g$b;

    const-string v0, "firebase_sessions_enabled"

    invoke-static {v0}, Lu0/f;->a(Ljava/lang/String;)Lu0/d$a;

    move-result-object v0

    sput-object v0, Lo9/g;->d:Lu0/d$a;

    const-string v0, "firebase_sessions_sampling_rate"

    invoke-static {v0}, Lu0/f;->b(Ljava/lang/String;)Lu0/d$a;

    move-result-object v0

    sput-object v0, Lo9/g;->e:Lu0/d$a;

    const-string v0, "firebase_sessions_restart_timeout"

    invoke-static {v0}, Lu0/f;->d(Ljava/lang/String;)Lu0/d$a;

    move-result-object v0

    sput-object v0, Lo9/g;->f:Lu0/d$a;

    const-string v0, "firebase_sessions_cache_duration"

    invoke-static {v0}, Lu0/f;->d(Ljava/lang/String;)Lu0/d$a;

    move-result-object v0

    sput-object v0, Lo9/g;->g:Lu0/d$a;

    const-string v0, "firebase_sessions_cache_updated_time"

    invoke-static {v0}, Lu0/f;->e(Ljava/lang/String;)Lu0/d$a;

    move-result-object v0

    sput-object v0, Lo9/g;->h:Lu0/d$a;

    return-void
.end method

.method public constructor <init>(Lr0/f;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr0/f<",
            "Lu0/d;",
            ">;)V"
        }
    .end annotation

    const-string v0, "dataStore"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo9/g;->a:Lr0/f;

    new-instance p1, Lo9/g$a;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lo9/g$a;-><init>(Lo9/g;Ljd/d;)V

    const/4 v1, 0x1

    invoke-static {v0, p1, v1, v0}, Lce/i;->f(Ljd/g;Lsd/p;ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic a(Lo9/g;)Lr0/f;
    .locals 0

    iget-object p0, p0, Lo9/g;->a:Lr0/f;

    return-object p0
.end method

.method public static final synthetic b(Lo9/g;Lu0/d$a;Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lo9/g;->h(Lu0/d$a;Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lo9/g;Lu0/d;)V
    .locals 0

    invoke-virtual {p0, p1}, Lo9/g;->l(Lu0/d;)V

    return-void
.end method


# virtual methods
.method public final d()Z
    .locals 6

    iget-object v0, p0, Lo9/g;->b:Lo9/e;

    const/4 v1, 0x0

    const-string v2, "sessionConfigs"

    if-nez v0, :cond_0

    invoke-static {v2}, Ltd/m;->t(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Lo9/e;->b()Ljava/lang/Long;

    move-result-object v0

    iget-object v3, p0, Lo9/g;->b:Lo9/e;

    if-nez v3, :cond_1

    invoke-static {v2}, Ltd/m;->t(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    invoke-virtual {v1}, Lo9/e;->a()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v2, v4

    const/16 v0, 0x3e8

    int-to-long v4, v0

    div-long/2addr v2, v4

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    cmp-long v0, v2, v0

    if-gez v0, :cond_2

    const/4 v0, 0x0

    return v0

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public final e()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lo9/g;->b:Lo9/e;

    if-nez v0, :cond_0

    const-string v0, "sessionConfigs"

    invoke-static {v0}, Ltd/m;->t(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lo9/e;->d()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lo9/g;->b:Lo9/e;

    if-nez v0, :cond_0

    const-string v0, "sessionConfigs"

    invoke-static {v0}, Ltd/m;->t(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lo9/e;->e()Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public final g()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lo9/g;->b:Lo9/e;

    if-nez v0, :cond_0

    const-string v0, "sessionConfigs"

    invoke-static {v0}, Ltd/m;->t(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lo9/e;->c()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final h(Lu0/d$a;Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lu0/d$a<",
            "TT;>;TT;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lo9/g$c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lo9/g$c;

    iget v1, v0, Lo9/g$c;->j:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo9/g$c;->j:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo9/g$c;

    invoke-direct {v0, p0, p3}, Lo9/g$c;-><init>(Lo9/g;Ljd/d;)V

    :goto_0
    iget-object p3, v0, Lo9/g$c;->h:Ljava/lang/Object;

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lo9/g$c;->j:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p3}, Lgd/l;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lgd/l;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p3, p0, Lo9/g;->a:Lr0/f;

    new-instance v2, Lo9/g$d;

    const/4 v4, 0x0

    invoke-direct {v2, p2, p1, p0, v4}, Lo9/g$d;-><init>(Ljava/lang/Object;Lu0/d$a;Lo9/g;Ljd/d;)V

    iput v3, v0, Lo9/g$c;->j:I

    invoke-static {p3, v2, v0}, Lu0/g;->a(Lr0/f;Lsd/p;Ljd/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Failed to update cache config value: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "SettingsCache"

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    :goto_2
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public final i(Ljava/lang/Double;Ljd/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Double;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lo9/g;->e:Lu0/d$a;

    invoke-virtual {p0, v0, p1, p2}, Lo9/g;->h(Lu0/d$a;Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public final j(Ljava/lang/Integer;Ljd/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lo9/g;->g:Lu0/d$a;

    invoke-virtual {p0, v0, p1, p2}, Lo9/g;->h(Lu0/d$a;Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public final k(Ljava/lang/Long;Ljd/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lo9/g;->h:Lu0/d$a;

    invoke-virtual {p0, v0, p1, p2}, Lo9/g;->h(Lu0/d$a;Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public final l(Lu0/d;)V
    .locals 7

    new-instance v6, Lo9/e;

    sget-object v0, Lo9/g;->d:Lu0/d$a;

    invoke-virtual {p1, v0}, Lu0/d;->b(Lu0/d$a;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Boolean;

    sget-object v0, Lo9/g;->e:Lu0/d$a;

    invoke-virtual {p1, v0}, Lu0/d;->b(Lu0/d$a;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Double;

    sget-object v0, Lo9/g;->f:Lu0/d$a;

    invoke-virtual {p1, v0}, Lu0/d;->b(Lu0/d$a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Integer;

    sget-object v0, Lo9/g;->g:Lu0/d$a;

    invoke-virtual {p1, v0}, Lu0/d;->b(Lu0/d$a;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    sget-object v0, Lo9/g;->h:Lu0/d$a;

    invoke-virtual {p1, v0}, Lu0/d;->b(Lu0/d$a;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ljava/lang/Long;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lo9/e;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V

    iput-object v6, p0, Lo9/g;->b:Lo9/e;

    return-void
.end method

.method public final m(Ljava/lang/Integer;Ljd/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lo9/g;->f:Lu0/d$a;

    invoke-virtual {p0, v0, p1, p2}, Lo9/g;->h(Lu0/d$a;Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public final n(Ljava/lang/Boolean;Ljd/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lo9/g;->d:Lu0/d$a;

    invoke-virtual {p0, v0, p1, p2}, Lo9/g;->h(Lu0/d$a;Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
