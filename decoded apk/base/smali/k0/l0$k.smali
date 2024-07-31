.class public Lk0/l0$k;
.super Lk0/l0$j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "k"
.end annotation


# static fields
.field public static final q:Lk0/l0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroid/view/WindowInsets;->CONSUMED:Landroid/view/WindowInsets;

    invoke-static {v0}, Lk0/l0;->v(Landroid/view/WindowInsets;)Lk0/l0;

    move-result-object v0

    sput-object v0, Lk0/l0$k;->q:Lk0/l0;

    return-void
.end method

.method public constructor <init>(Lk0/l0;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk0/l0$j;-><init>(Lk0/l0;Landroid/view/WindowInsets;)V

    return-void
.end method

.method public constructor <init>(Lk0/l0;Lk0/l0$k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk0/l0$j;-><init>(Lk0/l0;Lk0/l0$j;)V

    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public g(I)La0/b;
    .locals 1

    iget-object v0, p0, Lk0/l0$g;->c:Landroid/view/WindowInsets;

    invoke-static {p1}, Lk0/l0$n;->a(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, La0/b;->d(Landroid/graphics/Insets;)La0/b;

    move-result-object p1

    return-object p1
.end method

.method public p(I)Z
    .locals 1

    iget-object v0, p0, Lk0/l0$g;->c:Landroid/view/WindowInsets;

    invoke-static {p1}, Lk0/l0$n;->a(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets;->isVisible(I)Z

    move-result p1

    return p1
.end method
