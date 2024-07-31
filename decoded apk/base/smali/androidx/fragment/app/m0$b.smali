.class public Landroidx/fragment/app/m0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/m0;->a(Landroidx/fragment/app/m0$e$c;Landroidx/fragment/app/m0$e$b;Landroidx/fragment/app/e0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Landroidx/fragment/app/m0$d;

.field public final synthetic i:Landroidx/fragment/app/m0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/m0;Landroidx/fragment/app/m0$d;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/m0$b;->i:Landroidx/fragment/app/m0;

    iput-object p2, p0, Landroidx/fragment/app/m0$b;->h:Landroidx/fragment/app/m0$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/m0$b;->i:Landroidx/fragment/app/m0;

    iget-object v0, v0, Landroidx/fragment/app/m0;->b:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/m0$b;->h:Landroidx/fragment/app/m0$d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroidx/fragment/app/m0$b;->i:Landroidx/fragment/app/m0;

    iget-object v0, v0, Landroidx/fragment/app/m0;->c:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/m0$b;->h:Landroidx/fragment/app/m0$d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
