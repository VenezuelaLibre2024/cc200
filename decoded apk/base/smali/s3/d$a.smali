.class public Ls3/d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/os/Handler;

.field public final synthetic b:Ls3/d;


# direct methods
.method public constructor <init>(Ls3/d;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Ls3/d$a;->b:Ls3/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ls3/d$a;->a:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic a(Ls3/d$a;I)V
    .locals 0

    invoke-direct {p0, p1}, Ls3/d$a;->b(I)V

    return-void
.end method

.method private synthetic b(I)V
    .locals 1

    iget-object v0, p0, Ls3/d$a;->b:Ls3/d;

    invoke-static {v0, p1}, Ls3/d;->d(Ls3/d;I)V

    return-void
.end method


# virtual methods
.method public onAudioFocusChange(I)V
    .locals 2

    iget-object v0, p0, Ls3/d$a;->a:Landroid/os/Handler;

    new-instance v1, Ls3/c;

    invoke-direct {v1, p0, p1}, Ls3/c;-><init>(Ls3/d$a;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
