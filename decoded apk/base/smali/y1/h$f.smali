.class public abstract Ly1/h$f;
.super Ly1/h$e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly1/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "f"
.end annotation


# instance fields
.field public a:[La0/d$b;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly1/h$e;-><init>(Ly1/h$a;)V

    iput-object v0, p0, Ly1/h$f;->a:[La0/d$b;

    const/4 v0, 0x0

    iput v0, p0, Ly1/h$f;->c:I

    return-void
.end method

.method public constructor <init>(Ly1/h$f;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly1/h$e;-><init>(Ly1/h$a;)V

    iput-object v0, p0, Ly1/h$f;->a:[La0/d$b;

    const/4 v0, 0x0

    iput v0, p0, Ly1/h$f;->c:I

    iget-object v0, p1, Ly1/h$f;->b:Ljava/lang/String;

    iput-object v0, p0, Ly1/h$f;->b:Ljava/lang/String;

    iget v0, p1, Ly1/h$f;->d:I

    iput v0, p0, Ly1/h$f;->d:I

    iget-object p1, p1, Ly1/h$f;->a:[La0/d$b;

    invoke-static {p1}, La0/d;->f([La0/d$b;)[La0/d$b;

    move-result-object p1

    iput-object p1, p0, Ly1/h$f;->a:[La0/d$b;

    return-void
.end method


# virtual methods
.method public c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public d(Landroid/graphics/Path;)V
    .locals 1

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    iget-object v0, p0, Ly1/h$f;->a:[La0/d$b;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, La0/d$b;->e([La0/d$b;Landroid/graphics/Path;)V

    :cond_0
    return-void
.end method

.method public getPathData()[La0/d$b;
    .locals 1

    iget-object v0, p0, Ly1/h$f;->a:[La0/d$b;

    return-object v0
.end method

.method public getPathName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly1/h$f;->b:Ljava/lang/String;

    return-object v0
.end method

.method public setPathData([La0/d$b;)V
    .locals 1

    iget-object v0, p0, Ly1/h$f;->a:[La0/d$b;

    invoke-static {v0, p1}, La0/d;->b([La0/d$b;[La0/d$b;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, La0/d;->f([La0/d$b;)[La0/d$b;

    move-result-object p1

    iput-object p1, p0, Ly1/h$f;->a:[La0/d$b;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ly1/h$f;->a:[La0/d$b;

    invoke-static {v0, p1}, La0/d;->j([La0/d$b;[La0/d$b;)V

    :goto_0
    return-void
.end method
