.class public final Ll0/a;
.super Landroid/text/style/ClickableSpan;
.source ""


# instance fields
.field public final h:I

.field public final i:Ll0/b;

.field public final j:I


# direct methods
.method public constructor <init>(ILl0/b;I)V
    .locals 0

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    iput p1, p0, Ll0/a;->h:I

    iput-object p2, p0, Ll0/a;->i:Ll0/b;

    iput p3, p0, Ll0/a;->j:I

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iget v0, p0, Ll0/a;->h:I

    const-string v1, "ACCESSIBILITY_CLICKABLE_SPAN_ID"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Ll0/a;->i:Ll0/b;

    iget v1, p0, Ll0/a;->j:I

    invoke-virtual {v0, v1, p1}, Ll0/b;->G(ILandroid/os/Bundle;)Z

    return-void
.end method
