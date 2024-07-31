.class public Ln/i0$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic h:Ln/i0;


# direct methods
.method public constructor <init>(Ln/i0;)V
    .locals 0

    iput-object p1, p0, Ln/i0$d;->h:Ln/i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Ln/i0$d;->h:Ln/i0;

    const/4 v1, 0x0

    iput-object v1, v0, Ln/i0;->u:Ln/i0$d;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Ln/i0$d;->h:Ln/i0;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Ln/i0$d;->h:Ln/i0;

    const/4 v1, 0x0

    iput-object v1, v0, Ln/i0;->u:Ln/i0$d;

    invoke-virtual {v0}, Ln/i0;->drawableStateChanged()V

    return-void
.end method
