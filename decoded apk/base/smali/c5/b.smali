.class public Lc5/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo5/g0$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc5/b$d;,
        Lc5/b$f;,
        Lc5/b$c;,
        Lc5/b$e;,
        Lc5/b$a;,
        Lc5/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo5/g0$a<",
        "Lc5/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lorg/xmlpull/v1/XmlPullParserFactory;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    move-result-object v0

    iput-object v0, p0, Lc5/b;->a:Lorg/xmlpull/v1/XmlPullParserFactory;
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Couldn\'t create XmlPullParserFactory instance"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public bridge synthetic a(Landroid/net/Uri;Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lc5/b;->b(Landroid/net/Uri;Ljava/io/InputStream;)Lc5/a;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/net/Uri;Ljava/io/InputStream;)Lc5/a;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lc5/b;->a:Lorg/xmlpull/v1/XmlPullParserFactory;

    invoke-virtual {v1}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v1

    invoke-interface {v1, p2, v0}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    new-instance p2, Lc5/b$e;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, v0, p1}, Lc5/b$e;-><init>(Lc5/b$a;Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Lc5/b$a;->f(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc5/a;
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-static {v0, p1}, Ls3/t2;->c(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object p1

    throw p1
.end method
