.class public Lk0/b0$g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# direct methods
.method public static a(Landroid/view/View;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/view/View;->hasOnClickListeners()Z

    move-result p0

    return p0
.end method