.class public final Lbf/l;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/util/logging/Logger;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lbf/l;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lbf/l;->a:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lbf/s;)Lbf/d;
    .locals 1

    new-instance v0, Lbf/n;

    invoke-direct {v0, p0}, Lbf/n;-><init>(Lbf/s;)V

    return-object v0
.end method

.method public static b(Lbf/t;)Lbf/e;
    .locals 1

    new-instance v0, Lbf/o;

    invoke-direct {v0, p0}, Lbf/o;-><init>(Lbf/t;)V

    return-object v0
.end method

.method public static c(Ljava/lang/AssertionError;)Z
    .locals 1

    invoke-virtual {p0}, Ljava/lang/AssertionError;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;

    move-result-object p0

    const-string v0, "getsockname failed"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static d(Ljava/io/OutputStream;)Lbf/s;
    .locals 1

    new-instance v0, Lbf/u;

    invoke-direct {v0}, Lbf/u;-><init>()V

    invoke-static {p0, v0}, Lbf/l;->e(Ljava/io/OutputStream;Lbf/u;)Lbf/s;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ljava/io/OutputStream;Lbf/u;)Lbf/s;
    .locals 1

    if-eqz p0, :cond_1

    if-eqz p1, :cond_0

    new-instance v0, Lbf/l$a;

    invoke-direct {v0, p1, p0}, Lbf/l$a;-><init>(Lbf/u;Ljava/io/OutputStream;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "timeout == null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "out == null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static f(Ljava/net/Socket;)Lbf/s;
    .locals 1

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lbf/l;->j(Ljava/net/Socket;)Lbf/a;

    move-result-object v0

    invoke-virtual {p0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p0

    invoke-static {p0, v0}, Lbf/l;->e(Ljava/io/OutputStream;Lbf/u;)Lbf/s;

    move-result-object p0

    invoke-virtual {v0, p0}, Lbf/a;->r(Lbf/s;)Lbf/s;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "socket\'s output stream == null"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "socket == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static g(Ljava/io/InputStream;)Lbf/t;
    .locals 1

    new-instance v0, Lbf/u;

    invoke-direct {v0}, Lbf/u;-><init>()V

    invoke-static {p0, v0}, Lbf/l;->h(Ljava/io/InputStream;Lbf/u;)Lbf/t;

    move-result-object p0

    return-object p0
.end method

.method public static h(Ljava/io/InputStream;Lbf/u;)Lbf/t;
    .locals 1

    if-eqz p0, :cond_1

    if-eqz p1, :cond_0

    new-instance v0, Lbf/l$b;

    invoke-direct {v0, p1, p0}, Lbf/l$b;-><init>(Lbf/u;Ljava/io/InputStream;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "timeout == null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "in == null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static i(Ljava/net/Socket;)Lbf/t;
    .locals 1

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lbf/l;->j(Ljava/net/Socket;)Lbf/a;

    move-result-object v0

    invoke-virtual {p0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object p0

    invoke-static {p0, v0}, Lbf/l;->h(Ljava/io/InputStream;Lbf/u;)Lbf/t;

    move-result-object p0

    invoke-virtual {v0, p0}, Lbf/a;->s(Lbf/t;)Lbf/t;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "socket\'s input stream == null"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "socket == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static j(Ljava/net/Socket;)Lbf/a;
    .locals 1

    new-instance v0, Lbf/l$c;

    invoke-direct {v0, p0}, Lbf/l$c;-><init>(Ljava/net/Socket;)V

    return-object v0
.end method
