.class public final Lu3/e$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lu3/e$e;->a:I

    iput v0, p0, Lu3/e$e;->b:I

    const/4 v1, 0x1

    iput v1, p0, Lu3/e$e;->c:I

    iput v1, p0, Lu3/e$e;->d:I

    iput v0, p0, Lu3/e$e;->e:I

    return-void
.end method


# virtual methods
.method public a()Lu3/e;
    .locals 8

    new-instance v7, Lu3/e;

    iget v1, p0, Lu3/e$e;->a:I

    iget v2, p0, Lu3/e$e;->b:I

    iget v3, p0, Lu3/e$e;->c:I

    iget v4, p0, Lu3/e$e;->d:I

    iget v5, p0, Lu3/e$e;->e:I

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lu3/e;-><init>(IIIIILu3/e$a;)V

    return-object v7
.end method

.method public b(I)Lu3/e$e;
    .locals 0

    iput p1, p0, Lu3/e$e;->d:I

    return-object p0
.end method

.method public c(I)Lu3/e$e;
    .locals 0

    iput p1, p0, Lu3/e$e;->a:I

    return-object p0
.end method

.method public d(I)Lu3/e$e;
    .locals 0

    iput p1, p0, Lu3/e$e;->b:I

    return-object p0
.end method

.method public e(I)Lu3/e$e;
    .locals 0

    iput p1, p0, Lu3/e$e;->e:I

    return-object p0
.end method

.method public f(I)Lu3/e$e;
    .locals 0

    iput p1, p0, Lu3/e$e;->c:I

    return-object p0
.end method
