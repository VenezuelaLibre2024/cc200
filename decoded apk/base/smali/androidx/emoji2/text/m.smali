.class public final Landroidx/emoji2/text/m;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/emoji2/text/m$a;
    }
.end annotation


# instance fields
.field public final a:Lw0/b;

.field public final b:[C

.field public final c:Landroidx/emoji2/text/m$a;

.field public final d:Landroid/graphics/Typeface;


# direct methods
.method public constructor <init>(Landroid/graphics/Typeface;Lw0/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/emoji2/text/m;->d:Landroid/graphics/Typeface;

    iput-object p2, p0, Landroidx/emoji2/text/m;->a:Lw0/b;

    new-instance p1, Landroidx/emoji2/text/m$a;

    const/16 v0, 0x400

    invoke-direct {p1, v0}, Landroidx/emoji2/text/m$a;-><init>(I)V

    iput-object p1, p0, Landroidx/emoji2/text/m;->c:Landroidx/emoji2/text/m$a;

    invoke-virtual {p2}, Lw0/b;->k()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    new-array p1, p1, [C

    iput-object p1, p0, Landroidx/emoji2/text/m;->b:[C

    invoke-virtual {p0, p2}, Landroidx/emoji2/text/m;->a(Lw0/b;)V

    return-void
.end method

.method public static b(Landroid/graphics/Typeface;Ljava/nio/ByteBuffer;)Landroidx/emoji2/text/m;
    .locals 1

    :try_start_0
    const-string v0, "EmojiCompat.MetadataRepo.create"

    invoke-static {v0}, Lg0/p;->a(Ljava/lang/String;)V

    new-instance v0, Landroidx/emoji2/text/m;

    invoke-static {p1}, Landroidx/emoji2/text/l;->b(Ljava/nio/ByteBuffer;)Lw0/b;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Landroidx/emoji2/text/m;-><init>(Landroid/graphics/Typeface;Lw0/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lg0/p;->b()V

    return-object v0

    :catchall_0
    move-exception p0

    invoke-static {}, Lg0/p;->b()V

    throw p0
.end method


# virtual methods
.method public final a(Lw0/b;)V
    .locals 5

    invoke-virtual {p1}, Lw0/b;->k()I

    move-result p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    new-instance v1, Landroidx/emoji2/text/g;

    invoke-direct {v1, p0, v0}, Landroidx/emoji2/text/g;-><init>(Landroidx/emoji2/text/m;I)V

    invoke-virtual {v1}, Landroidx/emoji2/text/g;->f()I

    move-result v2

    iget-object v3, p0, Landroidx/emoji2/text/m;->b:[C

    mul-int/lit8 v4, v0, 0x2

    invoke-static {v2, v3, v4}, Ljava/lang/Character;->toChars(I[CI)I

    invoke-virtual {p0, v1}, Landroidx/emoji2/text/m;->h(Landroidx/emoji2/text/g;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c()[C
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/m;->b:[C

    return-object v0
.end method

.method public d()Lw0/b;
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/m;->a:Lw0/b;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/m;->a:Lw0/b;

    invoke-virtual {v0}, Lw0/b;->l()I

    move-result v0

    return v0
.end method

.method public f()Landroidx/emoji2/text/m$a;
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/m;->c:Landroidx/emoji2/text/m$a;

    return-object v0
.end method

.method public g()Landroid/graphics/Typeface;
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/m;->d:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public h(Landroidx/emoji2/text/g;)V
    .locals 4

    const-string v0, "emoji metadata cannot be null"

    invoke-static {p1, v0}, Lj0/d;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroidx/emoji2/text/g;->c()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const-string v3, "invalid metadata codepoint length"

    invoke-static {v0, v3}, Lj0/d;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Landroidx/emoji2/text/m;->c:Landroidx/emoji2/text/m$a;

    invoke-virtual {p1}, Landroidx/emoji2/text/g;->c()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-virtual {v0, p1, v2, v3}, Landroidx/emoji2/text/m$a;->c(Landroidx/emoji2/text/g;II)V

    return-void
.end method