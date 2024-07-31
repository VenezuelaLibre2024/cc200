.class public Lac/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lac/b;


# instance fields
.field public final a:J

.field public final b:Ljava/nio/ByteBuffer;

.field public final c:Landroid/media/MediaFormat;

.field public d:J


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lac/a;->d:J

    iput-wide p1, p0, Lac/a;->a:J

    const/16 p1, 0x2000

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p2

    iput-object p2, p0, Lac/a;->b:Ljava/nio/ByteBuffer;

    new-instance p2, Landroid/media/MediaFormat;

    invoke-direct {p2}, Landroid/media/MediaFormat;-><init>()V

    iput-object p2, p0, Lac/a;->c:Landroid/media/MediaFormat;

    const-string v0, "mime"

    const-string v1, "audio/raw"

    invoke-virtual {p2, v0, v1}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "bitrate"

    const v1, 0x158880

    invoke-virtual {p2, v0, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v0, "channel-count"

    const/4 v1, 0x2

    invoke-virtual {p2, v0, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v0, "max-input-size"

    invoke-virtual {p2, v0, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string p1, "sample-rate"

    const v0, 0xac44

    invoke-virtual {p2, p1, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public b(J)J
    .locals 0

    iput-wide p1, p0, Lac/a;->d:J

    return-wide p1
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lac/a;->a:J

    return-wide v0
.end method

.method public e(Lvb/d;)Landroid/media/MediaFormat;
    .locals 1

    sget-object v0, Lvb/d;->i:Lvb/d;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lac/a;->c:Landroid/media/MediaFormat;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public f(Lvb/d;)V
    .locals 0

    return-void
.end method

.method public g(Lvb/d;)V
    .locals 0

    return-void
.end method

.method public getOrientation()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public h()Z
    .locals 4

    iget-wide v0, p0, Lac/a;->d:J

    invoke-virtual {p0}, Lac/a;->d()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public i()J
    .locals 2

    iget-wide v0, p0, Lac/a;->d:J

    return-wide v0
.end method

.method public j(Lac/b$a;)V
    .locals 4

    iget-object v0, p0, Lac/a;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    iget-object v0, p0, Lac/a;->b:Ljava/nio/ByteBuffer;

    iput-object v0, p1, Lac/b$a;->a:Ljava/nio/ByteBuffer;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lac/b$a;->b:Z

    iget-wide v0, p0, Lac/a;->d:J

    iput-wide v0, p1, Lac/b$a;->c:J

    const/16 v2, 0x2000

    iput v2, p1, Lac/b$a;->d:I

    const-wide/32 v2, 0xb567

    add-long/2addr v0, v2

    iput-wide v0, p0, Lac/a;->d:J

    return-void
.end method

.method public k()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lac/a;->d:J

    return-void
.end method

.method public l(Lvb/d;)Z
    .locals 1

    sget-object v0, Lvb/d;->i:Lvb/d;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public m()[D
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
