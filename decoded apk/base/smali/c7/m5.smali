.class public final Lc7/m5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final synthetic e:Lc7/i5;


# direct methods
.method public constructor <init>(Lc7/i5;Ljava/lang/String;J)V
    .locals 2

    iput-object p1, p0, Lc7/m5;->e:Lc7/i5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    const-wide/16 v0, 0x0

    cmp-long p1, p3, v0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lh6/s;->a(Z)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":start"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lc7/m5;->a:Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":count"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lc7/m5;->b:Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ":value"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lc7/m5;->c:Ljava/lang/String;

    iput-wide p3, p0, Lc7/m5;->d:J

    return-void
.end method

.method public synthetic constructor <init>(Lc7/i5;Ljava/lang/String;JLc7/p5;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lc7/m5;-><init>(Lc7/i5;Ljava/lang/String;J)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/util/Pair;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lc7/m5;->e:Lc7/i5;

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/m5;->e:Lc7/i5;

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/m5;->c()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    invoke-virtual {p0}, Lc7/m5;->d()V

    move-wide v0, v2

    goto :goto_0

    :cond_0
    iget-object v4, p0, Lc7/m5;->e:Lc7/i5;

    invoke-virtual {v4}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v4

    invoke-interface {v4}, Lo6/d;->a()J

    move-result-wide v4

    sub-long/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    :goto_0
    iget-wide v4, p0, Lc7/m5;->d:J

    cmp-long v6, v0, v4

    const/4 v7, 0x0

    if-gez v6, :cond_1

    return-object v7

    :cond_1
    const/4 v6, 0x1

    shl-long/2addr v4, v6

    cmp-long v0, v0, v4

    if-lez v0, :cond_2

    invoke-virtual {p0}, Lc7/m5;->d()V

    return-object v7

    :cond_2
    iget-object v0, p0, Lc7/m5;->e:Lc7/i5;

    invoke-virtual {v0}, Lc7/i5;->D()Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lc7/m5;->c:Ljava/lang/String;

    invoke-interface {v0, v1, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lc7/m5;->e:Lc7/i5;

    invoke-virtual {v1}, Lc7/i5;->D()Landroid/content/SharedPreferences;

    move-result-object v1

    iget-object v4, p0, Lc7/m5;->b:Ljava/lang/String;

    invoke-interface {v1, v4, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    invoke-virtual {p0}, Lc7/m5;->d()V

    if-eqz v0, :cond_4

    cmp-long v1, v4, v2

    if-gtz v1, :cond_3

    goto :goto_1

    :cond_3
    new-instance v1, Landroid/util/Pair;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_4
    :goto_1
    sget-object v0, Lc7/i5;->B:Landroid/util/Pair;

    return-object v0
.end method

.method public final b(Ljava/lang/String;J)V
    .locals 7

    iget-object p2, p0, Lc7/m5;->e:Lc7/i5;

    invoke-virtual {p2}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/m5;->c()J

    move-result-wide p2

    const-wide/16 v0, 0x0

    cmp-long p2, p2, v0

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lc7/m5;->d()V

    :cond_0
    if-nez p1, :cond_1

    const-string p1, ""

    :cond_1
    iget-object p2, p0, Lc7/m5;->e:Lc7/i5;

    invoke-virtual {p2}, Lc7/i5;->D()Landroid/content/SharedPreferences;

    move-result-object p2

    iget-object p3, p0, Lc7/m5;->b:Ljava/lang/String;

    invoke-interface {p2, p3, v0, v1}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide p2

    cmp-long v0, p2, v0

    const-wide/16 v1, 0x1

    if-gtz v0, :cond_2

    iget-object p2, p0, Lc7/m5;->e:Lc7/i5;

    invoke-virtual {p2}, Lc7/i5;->D()Landroid/content/SharedPreferences;

    move-result-object p2

    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    iget-object p3, p0, Lc7/m5;->c:Ljava/lang/String;

    invoke-interface {p2, p3, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    iget-object p1, p0, Lc7/m5;->b:Ljava/lang/String;

    invoke-interface {p2, p1, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void

    :cond_2
    iget-object v0, p0, Lc7/m5;->e:Lc7/i5;

    invoke-virtual {v0}, Lc7/j7;->f()Lc7/qc;

    move-result-object v0

    invoke-virtual {v0}, Lc7/qc;->P0()Ljava/security/SecureRandom;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/SecureRandom;->nextLong()J

    move-result-wide v3

    const-wide v5, 0x7fffffffffffffffL

    and-long/2addr v3, v5

    add-long/2addr p2, v1

    div-long/2addr v5, p2

    cmp-long v0, v3, v5

    if-gez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lc7/m5;->e:Lc7/i5;

    invoke-virtual {v1}, Lc7/i5;->D()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    if-eqz v0, :cond_4

    iget-object v0, p0, Lc7/m5;->c:Ljava/lang/String;

    invoke-interface {v1, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :cond_4
    iget-object p1, p0, Lc7/m5;->b:Ljava/lang/String;

    invoke-interface {v1, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final c()J
    .locals 4

    iget-object v0, p0, Lc7/m5;->e:Lc7/i5;

    invoke-virtual {v0}, Lc7/i5;->D()Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lc7/m5;->a:Ljava/lang/String;

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final d()V
    .locals 4

    iget-object v0, p0, Lc7/m5;->e:Lc7/i5;

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/m5;->e:Lc7/i5;

    invoke-virtual {v0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->a()J

    move-result-wide v0

    iget-object v2, p0, Lc7/m5;->e:Lc7/i5;

    invoke-virtual {v2}, Lc7/i5;->D()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    iget-object v3, p0, Lc7/m5;->b:Ljava/lang/String;

    invoke-interface {v2, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    iget-object v3, p0, Lc7/m5;->c:Ljava/lang/String;

    invoke-interface {v2, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    iget-object v3, p0, Lc7/m5;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
