.class public Ln/z$a;
.super Ln/j0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln/z;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILandroid/content/res/Resources$Theme;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic q:Ln/z$h;

.field public final synthetic r:Ln/z;


# direct methods
.method public constructor <init>(Ln/z;Landroid/view/View;Ln/z$h;)V
    .locals 0

    iput-object p1, p0, Ln/z$a;->r:Ln/z;

    iput-object p3, p0, Ln/z$a;->q:Ln/z$h;

    invoke-direct {p0, p2}, Ln/j0;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public b()Lm/f;
    .locals 1

    iget-object v0, p0, Ln/z$a;->q:Ln/z$h;

    return-object v0
.end method

.method public c()Z
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation

    iget-object v0, p0, Ln/z$a;->r:Ln/z;

    invoke-virtual {v0}, Ln/z;->getInternalPopup()Ln/z$j;

    move-result-object v0

    invoke-interface {v0}, Ln/z$j;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ln/z$a;->r:Ln/z;

    invoke-virtual {v0}, Ln/z;->b()V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
