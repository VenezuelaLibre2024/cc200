.class public final synthetic Lu3/z;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Landroid/media/AudioTrack;

.field public final synthetic i:Lp5/g;


# direct methods
.method public synthetic constructor <init>(Landroid/media/AudioTrack;Lp5/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu3/z;->h:Landroid/media/AudioTrack;

    iput-object p2, p0, Lu3/z;->i:Lp5/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu3/z;->h:Landroid/media/AudioTrack;

    iget-object v1, p0, Lu3/z;->i:Lp5/g;

    invoke-static {v0, v1}, Lu3/a0;->y(Landroid/media/AudioTrack;Lp5/g;)V

    return-void
.end method
