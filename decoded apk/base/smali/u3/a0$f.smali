.class public final Lu3/a0$f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu3/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field public a:Lu3/f;

.field public b:Lu3/h;

.field public c:Z

.field public d:Z

.field public e:I

.field public f:Lu3/a0$e;

.field public g:Ls3/r$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lu3/f;->c:Lu3/f;

    iput-object v0, p0, Lu3/a0$f;->a:Lu3/f;

    const/4 v0, 0x0

    iput v0, p0, Lu3/a0$f;->e:I

    sget-object v0, Lu3/a0$e;->a:Lu3/a0$e;

    iput-object v0, p0, Lu3/a0$f;->f:Lu3/a0$e;

    return-void
.end method

.method public static synthetic a(Lu3/a0$f;)Lu3/f;
    .locals 0

    iget-object p0, p0, Lu3/a0$f;->a:Lu3/f;

    return-object p0
.end method

.method public static synthetic b(Lu3/a0$f;)Lu3/h;
    .locals 0

    iget-object p0, p0, Lu3/a0$f;->b:Lu3/h;

    return-object p0
.end method

.method public static synthetic c(Lu3/a0$f;)Z
    .locals 0

    iget-boolean p0, p0, Lu3/a0$f;->c:Z

    return p0
.end method

.method public static synthetic d(Lu3/a0$f;)Z
    .locals 0

    iget-boolean p0, p0, Lu3/a0$f;->d:Z

    return p0
.end method

.method public static synthetic e(Lu3/a0$f;)I
    .locals 0

    iget p0, p0, Lu3/a0$f;->e:I

    return p0
.end method


# virtual methods
.method public f()Lu3/a0;
    .locals 2

    iget-object v0, p0, Lu3/a0$f;->b:Lu3/h;

    if-nez v0, :cond_0

    new-instance v0, Lu3/a0$h;

    const/4 v1, 0x0

    new-array v1, v1, [Lu3/g;

    invoke-direct {v0, v1}, Lu3/a0$h;-><init>([Lu3/g;)V

    iput-object v0, p0, Lu3/a0$f;->b:Lu3/h;

    :cond_0
    new-instance v0, Lu3/a0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lu3/a0;-><init>(Lu3/a0$f;Lu3/a0$a;)V

    return-object v0
.end method

.method public g(Lu3/f;)Lu3/a0$f;
    .locals 0

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lu3/a0$f;->a:Lu3/f;

    return-object p0
.end method

.method public h(Z)Lu3/a0$f;
    .locals 0

    iput-boolean p1, p0, Lu3/a0$f;->d:Z

    return-object p0
.end method

.method public i(Z)Lu3/a0$f;
    .locals 0

    iput-boolean p1, p0, Lu3/a0$f;->c:Z

    return-object p0
.end method

.method public j(I)Lu3/a0$f;
    .locals 0

    iput p1, p0, Lu3/a0$f;->e:I

    return-object p0
.end method
