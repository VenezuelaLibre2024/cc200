.class public final synthetic Lj4/w;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/media/MediaCodec$OnFrameRenderedListener;


# instance fields
.field public final synthetic a:Lj4/x;

.field public final synthetic b:Lj4/l$c;


# direct methods
.method public synthetic constructor <init>(Lj4/x;Lj4/l$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj4/w;->a:Lj4/x;

    iput-object p2, p0, Lj4/w;->b:Lj4/l$c;

    return-void
.end method


# virtual methods
.method public final onFrameRendered(Landroid/media/MediaCodec;JJ)V
    .locals 7

    iget-object v0, p0, Lj4/w;->a:Lj4/x;

    iget-object v1, p0, Lj4/w;->b:Lj4/l$c;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-static/range {v0 .. v6}, Lj4/x;->o(Lj4/x;Lj4/l$c;Landroid/media/MediaCodec;JJ)V

    return-void
.end method
