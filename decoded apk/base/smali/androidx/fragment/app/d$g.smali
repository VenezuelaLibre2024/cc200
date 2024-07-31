.class public Landroidx/fragment/app/d$g;
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
.field public final synthetic h:Landroidx/fragment/app/m0$e;

.field public final synthetic i:Landroidx/fragment/app/m0$e;

.field public final synthetic j:Z

.field public final synthetic k:Lu/a;

.field public final synthetic l:Landroidx/fragment/app/d;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/d;Landroidx/fragment/app/m0$e;Landroidx/fragment/app/m0$e;ZLu/a;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/d$g;->l:Landroidx/fragment/app/d;

    iput-object p2, p0, Landroidx/fragment/app/d$g;->h:Landroidx/fragment/app/m0$e;

    iput-object p3, p0, Landroidx/fragment/app/d$g;->i:Landroidx/fragment/app/m0$e;

    iput-boolean p4, p0, Landroidx/fragment/app/d$g;->j:Z

    iput-object p5, p0, Landroidx/fragment/app/d$g;->k:Lu/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/d$g;->h:Landroidx/fragment/app/m0$e;

    invoke-virtual {v0}, Landroidx/fragment/app/m0$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/d$g;->i:Landroidx/fragment/app/m0$e;

    invoke-virtual {v1}, Landroidx/fragment/app/m0$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v1

    iget-boolean v2, p0, Landroidx/fragment/app/d$g;->j:Z

    iget-object v3, p0, Landroidx/fragment/app/d$g;->k:Lu/a;

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Landroidx/fragment/app/h0;->a(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLu/a;Z)V

    return-void
.end method
