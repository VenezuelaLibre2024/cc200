.class public Lk0/b0$m$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk0/b0$m;->u(Landroid/view/View;Lk0/v;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:Lk0/l0;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Lk0/v;


# direct methods
.method public constructor <init>(Landroid/view/View;Lk0/v;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lk0/b0$m$a;->b:Landroid/view/View;

    iput-object p2, p0, Lk0/b0$m$a;->c:Lk0/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lk0/b0$m$a;->a:Lk0/l0;

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 4

    invoke-static {p2, p1}, Lk0/l0;->w(Landroid/view/WindowInsets;Landroid/view/View;)Lk0/l0;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-ge v1, v2, :cond_0

    iget-object v3, p0, Lk0/b0$m$a;->b:Landroid/view/View;

    invoke-static {p2, v3}, Lk0/b0$m;->a(Landroid/view/WindowInsets;Landroid/view/View;)V

    iget-object p2, p0, Lk0/b0$m$a;->a:Lk0/l0;

    invoke-virtual {v0, p2}, Lk0/l0;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lk0/b0$m$a;->c:Lk0/v;

    invoke-interface {p2, p1, v0}, Lk0/v;->a(Landroid/view/View;Lk0/l0;)Lk0/l0;

    move-result-object p1

    invoke-virtual {p1}, Lk0/l0;->u()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object v0, p0, Lk0/b0$m$a;->a:Lk0/l0;

    iget-object p2, p0, Lk0/b0$m$a;->c:Lk0/v;

    invoke-interface {p2, p1, v0}, Lk0/v;->a(Landroid/view/View;Lk0/l0;)Lk0/l0;

    move-result-object p2

    if-lt v1, v2, :cond_1

    invoke-virtual {p2}, Lk0/l0;->u()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p1}, Lk0/b0;->T(Landroid/view/View;)V

    invoke-virtual {p2}, Lk0/l0;->u()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method
