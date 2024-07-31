.class public final Lmb/b$a$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmb/b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ltd/g;)V
    .locals 0

    invoke-direct {p0}, Lmb/b$a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lmb/b$a;
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    const-string v4, "image"

    invoke-static {p1, v4, v3, v1, v0}, Lae/n;->s(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v4

    if-ne v4, v2, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    if-eqz v4, :cond_1

    sget-object p1, Lmb/b$a;->j:Lmb/b$a;

    goto :goto_3

    :cond_1
    if-eqz p1, :cond_2

    const-string v4, "video"

    invoke-static {p1, v4, v3, v1, v0}, Lae/n;->s(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v4

    if-ne v4, v2, :cond_2

    move v4, v2

    goto :goto_1

    :cond_2
    move v4, v3

    :goto_1
    if-eqz v4, :cond_3

    sget-object p1, Lmb/b$a;->k:Lmb/b$a;

    goto :goto_3

    :cond_3
    if-eqz p1, :cond_4

    const-string v4, "text"

    invoke-static {p1, v4, v3, v1, v0}, Lae/n;->s(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    if-ne p1, v2, :cond_4

    goto :goto_2

    :cond_4
    move v2, v3

    :goto_2
    if-eqz v2, :cond_5

    sget-object p1, Lmb/b$a;->l:Lmb/b$a;

    goto :goto_3

    :cond_5
    sget-object p1, Lmb/b$a;->m:Lmb/b$a;

    :goto_3
    return-object p1
.end method
