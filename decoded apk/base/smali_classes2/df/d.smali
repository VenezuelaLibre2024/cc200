.class public final synthetic Ldf/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/media/SoundPool$OnLoadCompleteListener;


# instance fields
.field public final synthetic a:Ldf/g;


# direct methods
.method public synthetic constructor <init>(Ldf/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldf/d;->a:Ldf/g;

    return-void
.end method


# virtual methods
.method public final onLoadComplete(Landroid/media/SoundPool;II)V
    .locals 1

    iget-object v0, p0, Ldf/d;->a:Ldf/g;

    invoke-static {v0, p1, p2, p3}, Ldf/g;->b(Ldf/g;Landroid/media/SoundPool;II)V

    return-void
.end method
