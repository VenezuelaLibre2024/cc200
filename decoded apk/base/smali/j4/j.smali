.class public final Lj4/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj4/l$b;


# instance fields
.field public a:I

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lj4/j;->a:I

    return-void
.end method


# virtual methods
.method public a(Lj4/l$a;)Lj4/l;
    .locals 3

    sget v0, Lp5/n0;->a:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    iget v1, p0, Lj4/j;->a:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    if-nez v1, :cond_1

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    :cond_0
    iget-object v0, p1, Lj4/l$a;->c:Ls3/m1;

    iget-object v0, v0, Ls3/m1;->s:Ljava/lang/String;

    invoke-static {v0}, Lp5/v;->k(Ljava/lang/String;)I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Creating an asynchronous MediaCodec adapter for track type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lp5/n0;->k0(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "DMCodecAdapterFactory"

    invoke-static {v2, v1}, Lp5/r;->f(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lj4/b$b;

    iget-boolean v2, p0, Lj4/j;->b:Z

    invoke-direct {v1, v0, v2}, Lj4/b$b;-><init>(IZ)V

    invoke-virtual {v1, p1}, Lj4/b$b;->d(Lj4/l$a;)Lj4/b;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Lj4/x$b;

    invoke-direct {v0}, Lj4/x$b;-><init>()V

    invoke-virtual {v0, p1}, Lj4/x$b;->a(Lj4/l$a;)Lj4/l;

    move-result-object p1

    return-object p1
.end method
