.class public final Landroidx/fragment/app/m$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Landroidx/fragment/app/m$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/fragment/app/m$a;

    invoke-direct {v0}, Landroidx/fragment/app/m$a;-><init>()V

    sput-object v0, Landroidx/fragment/app/m$a;->a:Landroidx/fragment/app/m$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View$OnApplyWindowInsetsListener;Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 1

    const-string v0, "onApplyWindowInsetsListener"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "v"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "insets"

    invoke-static {p3, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2, p3}, Landroid/view/View$OnApplyWindowInsetsListener;->onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p1

    const-string p2, "onApplyWindowInsetsListe\u2026lyWindowInsets(v, insets)"

    invoke-static {p1, p2}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
