.class public final synthetic Lw3/d0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/media/MediaDrm$OnEventListener;


# instance fields
.field public final synthetic a:Lw3/f0;

.field public final synthetic b:Lw3/b0$b;


# direct methods
.method public synthetic constructor <init>(Lw3/f0;Lw3/b0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw3/d0;->a:Lw3/f0;

    iput-object p2, p0, Lw3/d0;->b:Lw3/b0$b;

    return-void
.end method


# virtual methods
.method public final onEvent(Landroid/media/MediaDrm;[BII[B)V
    .locals 7

    iget-object v0, p0, Lw3/d0;->a:Lw3/f0;

    iget-object v1, p0, Lw3/d0;->b:Lw3/b0$b;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-static/range {v0 .. v6}, Lw3/f0;->o(Lw3/f0;Lw3/b0$b;Landroid/media/MediaDrm;[BII[B)V

    return-void
.end method
