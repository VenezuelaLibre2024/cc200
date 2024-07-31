.class public final synthetic Lhf/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# instance fields
.field public final synthetic a:Lhf/f;


# direct methods
.method public synthetic constructor <init>(Lhf/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhf/e;->a:Lhf/f;

    return-void
.end method


# virtual methods
.method public final onAudioFocusChange(I)V
    .locals 1

    iget-object v0, p0, Lhf/e;->a:Lhf/f;

    invoke-static {v0, p1}, Lhf/f;->r(Lhf/f;I)V

    return-void
.end method
