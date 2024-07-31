.class public final Landroidx/lifecycle/d0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final h:Landroidx/lifecycle/l;

.field public final i:Landroidx/lifecycle/f$a;

.field public j:Z


# direct methods
.method public constructor <init>(Landroidx/lifecycle/l;Landroidx/lifecycle/f$a;)V
    .locals 1

    const-string v0, "registry"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/d0$a;->h:Landroidx/lifecycle/l;

    iput-object p2, p0, Landroidx/lifecycle/d0$a;->i:Landroidx/lifecycle/f$a;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-boolean v0, p0, Landroidx/lifecycle/d0$a;->j:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/d0$a;->h:Landroidx/lifecycle/l;

    iget-object v1, p0, Landroidx/lifecycle/d0$a;->i:Landroidx/lifecycle/f$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/l;->h(Landroidx/lifecycle/f$a;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/d0$a;->j:Z

    :cond_0
    return-void
.end method
