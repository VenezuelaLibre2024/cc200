.class public final Ll7/a$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public final h:Ll7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll7/a<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final i:Ll7/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll7/f<",
            "+TV;>;"
        }
    .end annotation
.end field


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Ll7/a$g;->h:Ll7/a;

    invoke-static {v0}, Ll7/a;->d(Ll7/a;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ll7/a$g;->i:Ll7/f;

    invoke-static {v0}, Ll7/a;->f(Ll7/f;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Ll7/a;->c()Ll7/a$b;

    move-result-object v1

    iget-object v2, p0, Ll7/a$g;->h:Ll7/a;

    invoke-virtual {v1, v2, p0, v0}, Ll7/a$b;->b(Ll7/a;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll7/a$g;->h:Ll7/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll7/a;->g(Ll7/a;Z)V

    :cond_1
    return-void
.end method
