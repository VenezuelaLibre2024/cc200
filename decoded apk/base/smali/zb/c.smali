.class public Lzb/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lwb/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lzb/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lwb/e;

    invoke-direct {v1, v0}, Lwb/e;-><init>(Ljava/lang/String;)V

    sput-object v1, Lzb/c;->a:Lwb/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/media/MediaFormat;)V
    .locals 3

    const-string v0, "mime"

    invoke-virtual {p1, v0}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "audio/mp4a-latm"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lzb/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Audio codecs other than AAC is not supported, actual mime type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lzb/d;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Lvb/d;Landroid/media/MediaFormat;)V
    .locals 1

    sget-object v0, Lvb/d;->h:Lvb/d;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0, p2}, Lzb/c;->c(Landroid/media/MediaFormat;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lvb/d;->i:Lvb/d;

    if-ne p1, v0, :cond_1

    invoke-virtual {p0, p2}, Lzb/c;->a(Landroid/media/MediaFormat;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final c(Landroid/media/MediaFormat;)V
    .locals 3

    const-string v0, "mime"

    invoke-virtual {p1, v0}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "video/avc"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1}, Lwb/a;->a(Landroid/media/MediaFormat;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1}, Lwb/b;->a(Ljava/nio/ByteBuffer;)B

    move-result p1

    invoke-static {p1}, Lwb/b;->b(B)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x42

    const-string v2, "Output H.264 profile: "

    if-ne p1, v1, :cond_0

    sget-object p1, Lzb/c;->a:Lwb/e;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lwb/e;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object p1, Lzb/c;->a:Lwb/e;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". This might not be supported."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lwb/e;->i(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_1
    new-instance p1, Lzb/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Video codecs other than AVC is not supported, actual mime type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lzb/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method
