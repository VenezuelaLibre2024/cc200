.class public Landroidx/fragment/app/d$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/d;->x(Ljava/util/List;Ljava/util/List;ZLandroidx/fragment/app/m0$e;Landroidx/fragment/app/m0$e;)Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Landroidx/fragment/app/j0;

.field public final synthetic i:Landroid/view/View;

.field public final synthetic j:Landroid/graphics/Rect;

.field public final synthetic k:Landroidx/fragment/app/d;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/d;Landroidx/fragment/app/j0;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/d$h;->k:Landroidx/fragment/app/d;

    iput-object p2, p0, Landroidx/fragment/app/d$h;->h:Landroidx/fragment/app/j0;

    iput-object p3, p0, Landroidx/fragment/app/d$h;->i:Landroid/view/View;

    iput-object p4, p0, Landroidx/fragment/app/d$h;->j:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/d$h;->h:Landroidx/fragment/app/j0;

    iget-object v1, p0, Landroidx/fragment/app/d$h;->i:Landroid/view/View;

    iget-object v2, p0, Landroidx/fragment/app/d$h;->j:Landroid/graphics/Rect;

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/j0;->h(Landroid/view/View;Landroid/graphics/Rect;)V

    return-void
.end method
