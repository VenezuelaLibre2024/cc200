.class public Lac/f;
.super Lac/d;
.source ""


# instance fields
.field public k:Landroid/content/Context;

.field public l:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0}, Lac/d;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lac/f;->k:Landroid/content/Context;

    iput-object p2, p0, Lac/f;->l:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public a(Landroid/media/MediaExtractor;)V
    .locals 3

    iget-object v0, p0, Lac/f;->k:Landroid/content/Context;

    iget-object v1, p0, Lac/f;->l:Landroid/net/Uri;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/media/MediaExtractor;->setDataSource(Landroid/content/Context;Landroid/net/Uri;Ljava/util/Map;)V

    return-void
.end method

.method public c(Landroid/media/MediaMetadataRetriever;)V
    .locals 2

    iget-object v0, p0, Lac/f;->k:Landroid/content/Context;

    iget-object v1, p0, Lac/f;->l:Landroid/net/Uri;

    invoke-virtual {p1, v0, v1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    return-void
.end method
