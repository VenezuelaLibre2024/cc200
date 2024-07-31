.class public Lx1/d$a;
.super Lx1/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx1/d;->n0(Landroid/view/View;FF)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Lx1/d;


# direct methods
.method public constructor <init>(Lx1/d;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lx1/d$a;->b:Lx1/d;

    iput-object p2, p0, Lx1/d$a;->a:Landroid/view/View;

    invoke-direct {p0}, Lx1/n;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lx1/m;)V
    .locals 2

    iget-object v0, p0, Lx1/d$a;->a:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lx1/c0;->g(Landroid/view/View;F)V

    iget-object v0, p0, Lx1/d$a;->a:Landroid/view/View;

    invoke-static {v0}, Lx1/c0;->a(Landroid/view/View;)V

    invoke-virtual {p1, p0}, Lx1/m;->T(Lx1/m$f;)Lx1/m;

    return-void
.end method
