.class public Ln/z$h$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln/z$h;->n(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Ln/z$h;


# direct methods
.method public constructor <init>(Ln/z$h;)V
    .locals 0

    iput-object p1, p0, Ln/z$h$b;->h:Ln/z$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    iget-object v0, p0, Ln/z$h$b;->h:Ln/z$h;

    iget-object v1, v0, Ln/z$h;->U:Ln/z;

    invoke-virtual {v0, v1}, Ln/z$h;->P(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ln/z$h$b;->h:Ln/z$h;

    invoke-virtual {v0}, Ln/k0;->dismiss()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ln/z$h$b;->h:Ln/z$h;

    invoke-virtual {v0}, Ln/z$h;->N()V

    iget-object v0, p0, Ln/z$h$b;->h:Ln/z$h;

    invoke-static {v0}, Ln/z$h;->M(Ln/z$h;)V

    :goto_0
    return-void
.end method
