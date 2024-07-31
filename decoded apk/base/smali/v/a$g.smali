.class public final Lv/a$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv/a;
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
.field public final h:Lv/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv/a<",
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

    iget-object v0, p0, Lv/a$g;->h:Lv/a;

    iget-object v0, v0, Lv/a;->h:Ljava/lang/Object;

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lv/a$g;->i:Ll7/f;

    invoke-static {v0}, Lv/a;->p(Ll7/f;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lv/a;->m:Lv/a$b;

    iget-object v2, p0, Lv/a$g;->h:Lv/a;

    invoke-virtual {v1, v2, p0, v0}, Lv/a$b;->b(Lv/a;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lv/a$g;->h:Lv/a;

    invoke-static {v0}, Lv/a;->m(Lv/a;)V

    :cond_1
    return-void
.end method
