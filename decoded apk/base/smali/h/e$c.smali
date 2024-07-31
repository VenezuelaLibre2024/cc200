.class public Lh/e$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk0/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh/e;->U()Landroid/view/ViewGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lh/e;


# direct methods
.method public constructor <init>(Lh/e;)V
    .locals 0

    iput-object p1, p0, Lh/e$c;->a:Lh/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Lk0/l0;)Lk0/l0;
    .locals 4

    invoke-virtual {p2}, Lk0/l0;->k()I

    move-result v0

    iget-object v1, p0, Lh/e$c;->a:Lh/e;

    const/4 v2, 0x0

    invoke-virtual {v1, p2, v2}, Lh/e;->O0(Lk0/l0;Landroid/graphics/Rect;)I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, Lk0/l0;->i()I

    move-result v0

    invoke-virtual {p2}, Lk0/l0;->j()I

    move-result v2

    invoke-virtual {p2}, Lk0/l0;->h()I

    move-result v3

    invoke-virtual {p2, v0, v1, v2, v3}, Lk0/l0;->p(IIII)Lk0/l0;

    move-result-object p2

    :cond_0
    invoke-static {p1, p2}, Lk0/b0;->N(Landroid/view/View;Lk0/l0;)Lk0/l0;

    move-result-object p1

    return-object p1
.end method
