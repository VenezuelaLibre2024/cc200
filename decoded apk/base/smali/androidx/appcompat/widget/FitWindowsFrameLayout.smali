.class public Landroidx/appcompat/widget/FitWindowsFrameLayout;
.super Landroid/widget/FrameLayout;
.source ""

# interfaces
.implements Landroidx/appcompat/widget/b;


# instance fields
.field public h:Landroidx/appcompat/widget/b$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public fitSystemWindows(Landroid/graphics/Rect;)Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/FitWindowsFrameLayout;->h:Landroidx/appcompat/widget/b$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Landroidx/appcompat/widget/b$a;->a(Landroid/graphics/Rect;)V

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->fitSystemWindows(Landroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public setOnFitSystemWindowsListener(Landroidx/appcompat/widget/b$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/FitWindowsFrameLayout;->h:Landroidx/appcompat/widget/b$a;

    return-void
.end method
