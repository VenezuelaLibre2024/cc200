.class public Lib/m;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lhb/s;

.field public b:I

.field public c:Z

.field public d:Lib/q;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILhb/s;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lib/m;->c:Z

    new-instance v0, Lib/n;

    invoke-direct {v0}, Lib/n;-><init>()V

    iput-object v0, p0, Lib/m;->d:Lib/q;

    iput p1, p0, Lib/m;->b:I

    iput-object p2, p0, Lib/m;->a:Lhb/s;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Z)Lhb/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lhb/s;",
            ">;Z)",
            "Lhb/s;"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lib/m;->b(Z)Lhb/s;

    move-result-object p2

    iget-object v0, p0, Lib/m;->d:Lib/q;

    invoke-virtual {v0, p1, p2}, Lib/q;->b(Ljava/util/List;Lhb/s;)Lhb/s;

    move-result-object p1

    return-object p1
.end method

.method public b(Z)Lhb/s;
    .locals 1

    iget-object v0, p0, Lib/m;->a:Lhb/s;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {v0}, Lhb/s;->c()Lhb/s;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lib/m;->b:I

    return v0
.end method

.method public d(Lhb/s;)Landroid/graphics/Rect;
    .locals 2

    iget-object v0, p0, Lib/m;->d:Lib/q;

    iget-object v1, p0, Lib/m;->a:Lhb/s;

    invoke-virtual {v0, p1, v1}, Lib/q;->d(Lhb/s;Lhb/s;)Landroid/graphics/Rect;

    move-result-object p1

    return-object p1
.end method

.method public e(Lib/q;)V
    .locals 0

    iput-object p1, p0, Lib/m;->d:Lib/q;

    return-void
.end method
