.class public Lbc/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lbc/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbc/a$b;,
        Lbc/a$c;
    }
.end annotation


# static fields
.field public static final b:Lwb/e;


# instance fields
.field public a:Lbc/a$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lbc/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lwb/e;

    invoke-direct {v1, v0}, Lwb/e;-><init>(Ljava/lang/String;)V

    sput-object v1, Lbc/a;->b:Lwb/e;

    return-void
.end method

.method public constructor <init>(Lbc/a$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbc/a;->a:Lbc/a$c;

    return-void
.end method

.method public static b()Lbc/a$b;
    .locals 1

    new-instance v0, Lbc/a$b;

    invoke-direct {v0}, Lbc/a$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/List;Landroid/media/MediaFormat;)Lvb/c;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/media/MediaFormat;",
            ">;",
            "Landroid/media/MediaFormat;",
            ")",
            "Lvb/c;"
        }
    .end annotation

    iget-object v0, p0, Lbc/a;->a:Lbc/a$c;

    invoke-static {v0}, Lbc/a$c;->a(Lbc/a$c;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1}, Lbc/a;->c(Ljava/util/List;)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbc/a;->a:Lbc/a$c;

    invoke-static {v0}, Lbc/a$c;->a(Lbc/a$c;)I

    move-result v0

    :goto_0
    iget-object v2, p0, Lbc/a;->a:Lbc/a$c;

    invoke-static {v2}, Lbc/a$c;->c(Lbc/a$c;)I

    move-result v2

    if-ne v2, v1, :cond_1

    invoke-virtual {p0, p1}, Lbc/a;->d(Ljava/util/List;)I

    move-result v2

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lbc/a;->a:Lbc/a$c;

    invoke-static {v2}, Lbc/a$c;->c(Lbc/a$c;)I

    move-result v2

    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x1

    const-wide/high16 v5, -0x8000000000000000L

    const-string v7, "bitrate"

    if-ne v3, v4, :cond_2

    iget-object v3, p0, Lbc/a;->a:Lbc/a$c;

    invoke-static {v3}, Lbc/a$c;->a(Lbc/a$c;)I

    move-result v3

    if-ne v3, v1, :cond_2

    iget-object v3, p0, Lbc/a;->a:Lbc/a$c;

    invoke-static {v3}, Lbc/a$c;->c(Lbc/a$c;)I

    move-result v3

    if-ne v3, v1, :cond_2

    iget-object v1, p0, Lbc/a;->a:Lbc/a$c;

    invoke-static {v1}, Lbc/a$c;->g(Lbc/a$c;)J

    move-result-wide v3

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/media/MediaFormat;

    invoke-virtual {v3, v7}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/MediaFormat;

    invoke-virtual {p1, v7}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p1

    int-to-long v3, p1

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lbc/a;->a:Lbc/a$c;

    invoke-static {p1}, Lbc/a$c;->g(Lbc/a$c;)J

    move-result-wide v3

    cmp-long p1, v3, v5

    if-nez p1, :cond_3

    invoke-static {v0, v2}, Lwb/c;->a(II)J

    move-result-wide v3

    goto :goto_2

    :cond_3
    iget-object p1, p0, Lbc/a;->a:Lbc/a$c;

    invoke-static {p1}, Lbc/a$c;->g(Lbc/a$c;)J

    move-result-wide v3

    :goto_2
    iget-object p1, p0, Lbc/a;->a:Lbc/a$c;

    invoke-static {p1}, Lbc/a$c;->e(Lbc/a$c;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "mime"

    invoke-virtual {p2, v1, p1}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "sample-rate"

    invoke-virtual {p2, p1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string p1, "channel-count"

    invoke-virtual {p2, p1, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    long-to-int p1, v3

    invoke-virtual {p2, v7, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget-object p1, p0, Lbc/a;->a:Lbc/a$c;

    invoke-static {p1}, Lbc/a$c;->e(Lbc/a$c;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "audio/mp4a-latm"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x2

    const-string v0, "aac-profile"

    invoke-virtual {p2, v0, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_4
    sget-object p1, Lvb/c;->k:Lvb/c;

    return-object p1
.end method

.method public final c(Ljava/util/List;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/media/MediaFormat;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/MediaFormat;

    const-string v2, "channel-count"

    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final d(Ljava/util/List;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/media/MediaFormat;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const v0, 0x7fffffff

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/MediaFormat;

    const-string v2, "sample-rate"

    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_0

    :cond_0
    return v0
.end method
