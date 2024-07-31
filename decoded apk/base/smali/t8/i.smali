.class public Lt8/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lq8/h;


# instance fields
.field public a:Z

.field public b:Z

.field public c:Lq8/d;

.field public final d:Lt8/f;


# direct methods
.method public constructor <init>(Lt8/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lt8/i;->a:Z

    iput-boolean v0, p0, Lt8/i;->b:Z

    iput-object p1, p0, Lt8/i;->d:Lt8/f;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-boolean v0, p0, Lt8/i;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lt8/i;->a:Z

    return-void

    :cond_0
    new-instance v0, Lq8/c;

    const-string v1, "Cannot encode a second value in the ValueEncoderContext"

    invoke-direct {v0, v1}, Lq8/c;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Lq8/d;Z)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lt8/i;->a:Z

    iput-object p1, p0, Lt8/i;->c:Lq8/d;

    iput-boolean p2, p0, Lt8/i;->b:Z

    return-void
.end method

.method public d(Ljava/lang/String;)Lq8/h;
    .locals 3

    invoke-virtual {p0}, Lt8/i;->a()V

    iget-object v0, p0, Lt8/i;->d:Lt8/f;

    iget-object v1, p0, Lt8/i;->c:Lq8/d;

    iget-boolean v2, p0, Lt8/i;->b:Z

    invoke-virtual {v0, v1, p1, v2}, Lt8/f;->i(Lq8/d;Ljava/lang/Object;Z)Lq8/f;

    return-object p0
.end method

.method public f(Z)Lq8/h;
    .locals 3

    invoke-virtual {p0}, Lt8/i;->a()V

    iget-object v0, p0, Lt8/i;->d:Lt8/f;

    iget-object v1, p0, Lt8/i;->c:Lq8/d;

    iget-boolean v2, p0, Lt8/i;->b:Z

    invoke-virtual {v0, v1, p1, v2}, Lt8/f;->o(Lq8/d;ZZ)Lt8/f;

    return-object p0
.end method
