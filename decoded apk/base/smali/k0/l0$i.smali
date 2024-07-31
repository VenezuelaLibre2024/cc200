.class public Lk0/l0$i;
.super Lk0/l0$h;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation


# direct methods
.method public constructor <init>(Lk0/l0;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk0/l0$h;-><init>(Lk0/l0;Landroid/view/WindowInsets;)V

    return-void
.end method

.method public constructor <init>(Lk0/l0;Lk0/l0$i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk0/l0$h;-><init>(Lk0/l0;Lk0/l0$h;)V

    return-void
.end method


# virtual methods
.method public a()Lk0/l0;
    .locals 1

    iget-object v0, p0, Lk0/l0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeDisplayCutout()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, Lk0/l0;->v(Landroid/view/WindowInsets;)Lk0/l0;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lk0/l0$i;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lk0/l0$i;

    iget-object v1, p0, Lk0/l0$g;->c:Landroid/view/WindowInsets;

    iget-object v3, p1, Lk0/l0$g;->c:Landroid/view/WindowInsets;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lk0/l0$g;->g:La0/b;

    iget-object p1, p1, Lk0/l0$g;->g:La0/b;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public f()Lk0/d;
    .locals 1

    iget-object v0, p0, Lk0/l0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getDisplayCutout()Landroid/view/DisplayCutout;

    move-result-object v0

    invoke-static {v0}, Lk0/d;->e(Landroid/view/DisplayCutout;)Lk0/d;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lk0/l0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->hashCode()I

    move-result v0

    return v0
.end method
