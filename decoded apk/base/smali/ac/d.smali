.class public abstract Lac/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lac/b;


# static fields
.field public static final j:Lwb/e;


# instance fields
.field public a:Landroid/media/MediaMetadataRetriever;

.field public b:Landroid/media/MediaExtractor;

.field public c:Z

.field public d:Z

.field public final e:Lwb/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwb/g<",
            "Landroid/media/MediaFormat;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lwb/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwb/g<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lvb/d;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lwb/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwb/g<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public i:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lac/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lwb/e;

    invoke-direct {v1, v0}, Lwb/e;-><init>(Ljava/lang/String;)V

    sput-object v1, Lac/d;->j:Lwb/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    iput-object v0, p0, Lac/d;->a:Landroid/media/MediaMetadataRetriever;

    new-instance v0, Landroid/media/MediaExtractor;

    invoke-direct {v0}, Landroid/media/MediaExtractor;-><init>()V

    iput-object v0, p0, Lac/d;->b:Landroid/media/MediaExtractor;

    new-instance v0, Lwb/g;

    invoke-direct {v0}, Lwb/g;-><init>()V

    iput-object v0, p0, Lac/d;->e:Lwb/g;

    new-instance v0, Lwb/g;

    invoke-direct {v0}, Lwb/g;-><init>()V

    iput-object v0, p0, Lac/d;->f:Lwb/g;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lac/d;->g:Ljava/util/HashSet;

    new-instance v0, Lwb/g;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-direct {v0, v1, v1}, Lwb/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lac/d;->h:Lwb/g;

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lac/d;->i:J

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/media/MediaExtractor;)V
.end method

.method public b(J)J
    .locals 10

    invoke-virtual {p0}, Lac/d;->n()V

    iget-wide v0, p0, Lac/d;->i:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lac/d;->b:Landroid/media/MediaExtractor;

    invoke-virtual {v0}, Landroid/media/MediaExtractor;->getSampleTime()J

    move-result-wide v0

    :goto_0
    iget-object v2, p0, Lac/d;->g:Ljava/util/HashSet;

    sget-object v3, Lvb/d;->h:Lvb/d;

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, p0, Lac/d;->g:Ljava/util/HashSet;

    sget-object v4, Lvb/d;->i:Lvb/d;

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    sget-object v4, Lac/d;->j:Lwb/e;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Seeking to: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-long/2addr p1, v0

    const-wide/16 v6, 0x3e8

    div-long v8, p1, v6

    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, " first: "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    div-long v8, v0, v6

    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, " hasVideo: "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v8, " hasAudio: "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lwb/e;->b(Ljava/lang/String;)V

    iget-object v4, p0, Lac/d;->b:Landroid/media/MediaExtractor;

    const/4 v5, 0x2

    invoke-virtual {v4, p1, p2, v5}, Landroid/media/MediaExtractor;->seekTo(JI)V

    if-eqz v2, :cond_2

    if-eqz v3, :cond_2

    :goto_1
    iget-object p1, p0, Lac/d;->b:Landroid/media/MediaExtractor;

    invoke-virtual {p1}, Landroid/media/MediaExtractor;->getSampleTrackIndex()I

    move-result p1

    iget-object p2, p0, Lac/d;->f:Lwb/g;

    invoke-virtual {p2}, Lwb/g;->g()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-eq p1, p2, :cond_1

    iget-object p1, p0, Lac/d;->b:Landroid/media/MediaExtractor;

    invoke-virtual {p1}, Landroid/media/MediaExtractor;->advance()Z

    goto :goto_1

    :cond_1
    sget-object p1, Lac/d;->j:Lwb/e;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Second seek to "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lac/d;->b:Landroid/media/MediaExtractor;

    invoke-virtual {v2}, Landroid/media/MediaExtractor;->getSampleTime()J

    move-result-wide v2

    div-long/2addr v2, v6

    invoke-virtual {p2, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lwb/e;->b(Ljava/lang/String;)V

    iget-object p1, p0, Lac/d;->b:Landroid/media/MediaExtractor;

    invoke-virtual {p1}, Landroid/media/MediaExtractor;->getSampleTime()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3, v5}, Landroid/media/MediaExtractor;->seekTo(JI)V

    :cond_2
    iget-object p1, p0, Lac/d;->b:Landroid/media/MediaExtractor;

    invoke-virtual {p1}, Landroid/media/MediaExtractor;->getSampleTime()J

    move-result-wide p1

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public abstract c(Landroid/media/MediaMetadataRetriever;)V
.end method

.method public d()J
    .locals 4

    invoke-virtual {p0}, Lac/d;->o()V

    :try_start_0
    iget-object v0, p0, Lac/d;->a:Landroid/media/MediaMetadataRetriever;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    return-wide v0

    :catch_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public e(Lvb/d;)Landroid/media/MediaFormat;
    .locals 6

    iget-object v0, p0, Lac/d;->e:Lwb/g;

    invoke-virtual {v0, p1}, Lwb/g;->b(Lvb/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lac/d;->e:Lwb/g;

    invoke-virtual {v0, p1}, Lwb/g;->a(Lvb/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/MediaFormat;

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lac/d;->n()V

    iget-object v0, p0, Lac/d;->b:Landroid/media/MediaExtractor;

    invoke-virtual {v0}, Landroid/media/MediaExtractor;->getTrackCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    iget-object v2, p0, Lac/d;->b:Landroid/media/MediaExtractor;

    invoke-virtual {v2, v1}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    move-result-object v2

    const-string v3, "mime"

    invoke-virtual {v2, v3}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lvb/d;->h:Lvb/d;

    if-ne p1, v4, :cond_1

    const-string v5, "video/"

    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    :goto_1
    iget-object p1, p0, Lac/d;->f:Lwb/g;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v4, v0}, Lwb/g;->h(Lvb/d;Ljava/lang/Object;)V

    iget-object p1, p0, Lac/d;->e:Lwb/g;

    invoke-virtual {p1, v4, v2}, Lwb/g;->h(Lvb/d;Ljava/lang/Object;)V

    return-object v2

    :cond_1
    sget-object v4, Lvb/d;->i:Lvb/d;

    if-ne p1, v4, :cond_2

    const-string v5, "audio/"

    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public f(Lvb/d;)V
    .locals 1

    iget-object v0, p0, Lac/d;->g:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lac/d;->g:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lac/d;->p()V

    :cond_0
    return-void
.end method

.method public g(Lvb/d;)V
    .locals 2

    iget-object v0, p0, Lac/d;->g:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lac/d;->b:Landroid/media/MediaExtractor;

    iget-object v1, p0, Lac/d;->f:Lwb/g;

    invoke-virtual {v1, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/media/MediaExtractor;->selectTrack(I)V

    return-void
.end method

.method public getOrientation()I
    .locals 2

    invoke-virtual {p0}, Lac/d;->o()V

    iget-object v0, p0, Lac/d;->a:Landroid/media/MediaMetadataRetriever;

    const/16 v1, 0x18

    invoke-virtual {v0, v1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v0

    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method public h()Z
    .locals 1

    invoke-virtual {p0}, Lac/d;->n()V

    iget-object v0, p0, Lac/d;->b:Landroid/media/MediaExtractor;

    invoke-virtual {v0}, Landroid/media/MediaExtractor;->getSampleTrackIndex()I

    move-result v0

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public i()J
    .locals 4

    iget-wide v0, p0, Lac/d;->i:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lac/d;->h:Lwb/g;

    invoke-virtual {v0}, Lwb/g;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lac/d;->h:Lwb/g;

    invoke-virtual {v2}, Lwb/g;->g()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iget-wide v2, p0, Lac/d;->i:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public j(Lac/b$a;)V
    .locals 7

    invoke-virtual {p0}, Lac/d;->n()V

    iget-object v0, p0, Lac/d;->b:Landroid/media/MediaExtractor;

    invoke-virtual {v0}, Landroid/media/MediaExtractor;->getSampleTrackIndex()I

    move-result v0

    iget-object v1, p0, Lac/d;->b:Landroid/media/MediaExtractor;

    iget-object v2, p1, Lac/b$a;->a:Ljava/nio/ByteBuffer;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/media/MediaExtractor;->readSampleData(Ljava/nio/ByteBuffer;I)I

    move-result v1

    iput v1, p1, Lac/b$a;->d:I

    iget-object v1, p0, Lac/d;->b:Landroid/media/MediaExtractor;

    invoke-virtual {v1}, Landroid/media/MediaExtractor;->getSampleFlags()I

    move-result v1

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    move v3, v2

    :cond_0
    iput-boolean v3, p1, Lac/b$a;->b:Z

    iget-object v1, p0, Lac/d;->b:Landroid/media/MediaExtractor;

    invoke-virtual {v1}, Landroid/media/MediaExtractor;->getSampleTime()J

    move-result-wide v1

    iput-wide v1, p1, Lac/b$a;->c:J

    iget-wide v3, p0, Lac/d;->i:J

    const-wide/high16 v5, -0x8000000000000000L

    cmp-long v3, v3, v5

    if-nez v3, :cond_1

    iput-wide v1, p0, Lac/d;->i:J

    :cond_1
    iget-object v1, p0, Lac/d;->f:Lwb/g;

    invoke-virtual {v1}, Lwb/g;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lac/d;->f:Lwb/g;

    invoke-virtual {v1}, Lwb/g;->f()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v0, :cond_2

    sget-object v1, Lvb/d;->i:Lvb/d;

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lac/d;->f:Lwb/g;

    invoke-virtual {v1}, Lwb/g;->d()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lac/d;->f:Lwb/g;

    invoke-virtual {v1}, Lwb/g;->g()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v0, :cond_3

    sget-object v1, Lvb/d;->h:Lvb/d;

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_4

    iget-object v0, p0, Lac/d;->h:Lwb/g;

    iget-wide v2, p1, Lac/b$a;->c:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lwb/g;->h(Lvb/d;Ljava/lang/Object;)V

    iget-object p1, p0, Lac/d;->b:Landroid/media/MediaExtractor;

    invoke-virtual {p1}, Landroid/media/MediaExtractor;->advance()Z

    return-void

    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public k()V
    .locals 3

    iget-object v0, p0, Lac/d;->g:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lac/d;->i:J

    iget-object v0, p0, Lac/d;->h:Lwb/g;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwb/g;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lac/d;->h:Lwb/g;

    invoke-virtual {v0, v1}, Lwb/g;->j(Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Lac/d;->b:Landroid/media/MediaExtractor;

    invoke-virtual {v0}, Landroid/media/MediaExtractor;->release()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance v0, Landroid/media/MediaExtractor;

    invoke-direct {v0}, Landroid/media/MediaExtractor;-><init>()V

    iput-object v0, p0, Lac/d;->b:Landroid/media/MediaExtractor;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lac/d;->d:Z

    :try_start_1
    iget-object v1, p0, Lac/d;->a:Landroid/media/MediaMetadataRetriever;

    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    new-instance v1, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v1}, Landroid/media/MediaMetadataRetriever;-><init>()V

    iput-object v1, p0, Lac/d;->a:Landroid/media/MediaMetadataRetriever;

    iput-boolean v0, p0, Lac/d;->c:Z

    return-void
.end method

.method public l(Lvb/d;)Z
    .locals 2

    invoke-virtual {p0}, Lac/d;->n()V

    iget-object v0, p0, Lac/d;->b:Landroid/media/MediaExtractor;

    invoke-virtual {v0}, Landroid/media/MediaExtractor;->getSampleTrackIndex()I

    move-result v0

    iget-object v1, p0, Lac/d;->f:Lwb/g;

    invoke-virtual {v1, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public m()[D
    .locals 5

    invoke-virtual {p0}, Lac/d;->o()V

    iget-object v0, p0, Lac/d;->a:Landroid/media/MediaMetadataRetriever;

    const/16 v1, 0x17

    invoke-virtual {v0, v1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lwb/d;

    invoke-direct {v1}, Lwb/d;-><init>()V

    invoke-virtual {v1, v0}, Lwb/d;->a(Ljava/lang/String;)[F

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x2

    new-array v1, v1, [D

    const/4 v2, 0x0

    aget v3, v0, v2

    float-to-double v3, v3

    aput-wide v3, v1, v2

    const/4 v2, 0x1

    aget v0, v0, v2

    float-to-double v3, v0

    aput-wide v3, v1, v2

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final n()V
    .locals 3

    iget-boolean v0, p0, Lac/d;->d:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lac/d;->d:Z

    :try_start_0
    iget-object v0, p0, Lac/d;->b:Landroid/media/MediaExtractor;

    invoke-virtual {p0, v0}, Lac/d;->a(Landroid/media/MediaExtractor;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lac/d;->j:Lwb/e;

    const-string v2, "Got IOException while trying to open MediaExtractor."

    invoke-virtual {v1, v2, v0}, Lwb/e;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    :goto_0
    return-void
.end method

.method public final o()V
    .locals 1

    iget-boolean v0, p0, Lac/d;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lac/d;->c:Z

    iget-object v0, p0, Lac/d;->a:Landroid/media/MediaMetadataRetriever;

    invoke-virtual {p0, v0}, Lac/d;->c(Landroid/media/MediaMetadataRetriever;)V

    :cond_0
    return-void
.end method

.method public p()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lac/d;->b:Landroid/media/MediaExtractor;

    invoke-virtual {v0}, Landroid/media/MediaExtractor;->release()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lac/d;->j:Lwb/e;

    const-string v2, "Could not release extractor:"

    invoke-virtual {v1, v2, v0}, Lwb/e;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    :try_start_1
    iget-object v0, p0, Lac/d;->a:Landroid/media/MediaMetadataRetriever;

    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    sget-object v1, Lac/d;->j:Lwb/e;

    const-string v2, "Could not release metadata:"

    invoke-virtual {v1, v2, v0}, Lwb/e;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
