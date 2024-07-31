.class public Lzb/b$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzb/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Lvb/d;

.field public final b:I

.field public final c:J

.field public final d:I


# direct methods
.method public constructor <init>(Lvb/d;Landroid/media/MediaCodec$BufferInfo;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzb/b$b;->a:Lvb/d;

    iget p1, p2, Landroid/media/MediaCodec$BufferInfo;->size:I

    iput p1, p0, Lzb/b$b;->b:I

    iget-wide v0, p2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iput-wide v0, p0, Lzb/b$b;->c:J

    iget p1, p2, Landroid/media/MediaCodec$BufferInfo;->flags:I

    iput p1, p0, Lzb/b$b;->d:I

    return-void
.end method

.method public synthetic constructor <init>(Lvb/d;Landroid/media/MediaCodec$BufferInfo;Lzb/b$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lzb/b$b;-><init>(Lvb/d;Landroid/media/MediaCodec$BufferInfo;)V

    return-void
.end method

.method public static synthetic a(Lzb/b$b;)I
    .locals 0

    iget p0, p0, Lzb/b$b;->b:I

    return p0
.end method

.method public static synthetic b(Lzb/b$b;)J
    .locals 2

    iget-wide v0, p0, Lzb/b$b;->c:J

    return-wide v0
.end method

.method public static synthetic c(Lzb/b$b;)I
    .locals 0

    iget p0, p0, Lzb/b$b;->d:I

    return p0
.end method

.method public static synthetic d(Lzb/b$b;)Lvb/d;
    .locals 0

    iget-object p0, p0, Lzb/b$b;->a:Lvb/d;

    return-object p0
.end method
