.class public Lh4/h0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh4/b0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh4/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final a:Lp5/z;

.field public final synthetic b:Lh4/h0;


# direct methods
.method public constructor <init>(Lh4/h0;)V
    .locals 1

    iput-object p1, p0, Lh4/h0$a;->b:Lh4/h0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lp5/z;

    const/4 v0, 0x4

    new-array v0, v0, [B

    invoke-direct {p1, v0}, Lp5/z;-><init>([B)V

    iput-object p1, p0, Lh4/h0$a;->a:Lp5/z;

    return-void
.end method


# virtual methods
.method public a(Lp5/a0;)V
    .locals 9

    invoke-virtual {p1}, Lp5/a0;->G()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lp5/a0;->G()I

    move-result v0

    and-int/lit16 v0, v0, 0x80

    if-nez v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x6

    invoke-virtual {p1, v0}, Lp5/a0;->U(I)V

    invoke-virtual {p1}, Lp5/a0;->a()I

    move-result v0

    const/4 v1, 0x4

    div-int/2addr v0, v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_4

    iget-object v4, p0, Lh4/h0$a;->a:Lp5/z;

    invoke-virtual {p1, v4, v1}, Lp5/a0;->k(Lp5/z;I)V

    iget-object v4, p0, Lh4/h0$a;->a:Lp5/z;

    const/16 v5, 0x10

    invoke-virtual {v4, v5}, Lp5/z;->h(I)I

    move-result v4

    iget-object v5, p0, Lh4/h0$a;->a:Lp5/z;

    const/4 v6, 0x3

    invoke-virtual {v5, v6}, Lp5/z;->r(I)V

    const/16 v5, 0xd

    if-nez v4, :cond_2

    iget-object v4, p0, Lh4/h0$a;->a:Lp5/z;

    invoke-virtual {v4, v5}, Lp5/z;->r(I)V

    goto :goto_1

    :cond_2
    iget-object v4, p0, Lh4/h0$a;->a:Lp5/z;

    invoke-virtual {v4, v5}, Lp5/z;->h(I)I

    move-result v4

    iget-object v5, p0, Lh4/h0$a;->b:Lh4/h0;

    invoke-static {v5}, Lh4/h0;->d(Lh4/h0;)Landroid/util/SparseArray;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_3

    iget-object v5, p0, Lh4/h0$a;->b:Lh4/h0;

    invoke-static {v5}, Lh4/h0;->d(Lh4/h0;)Landroid/util/SparseArray;

    move-result-object v5

    new-instance v6, Lh4/c0;

    new-instance v7, Lh4/h0$b;

    iget-object v8, p0, Lh4/h0$a;->b:Lh4/h0;

    invoke-direct {v7, v8, v4}, Lh4/h0$b;-><init>(Lh4/h0;I)V

    invoke-direct {v6, v7}, Lh4/c0;-><init>(Lh4/b0;)V

    invoke-virtual {v5, v4, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object v4, p0, Lh4/h0$a;->b:Lh4/h0;

    invoke-static {v4}, Lh4/h0;->k(Lh4/h0;)I

    :cond_3
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lh4/h0$a;->b:Lh4/h0;

    invoke-static {p1}, Lh4/h0;->l(Lh4/h0;)I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_5

    iget-object p1, p0, Lh4/h0$a;->b:Lh4/h0;

    invoke-static {p1}, Lh4/h0;->d(Lh4/h0;)Landroid/util/SparseArray;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->remove(I)V

    :cond_5
    return-void
.end method

.method public b(Lp5/j0;Lx3/m;Lh4/i0$d;)V
    .locals 0

    return-void
.end method
