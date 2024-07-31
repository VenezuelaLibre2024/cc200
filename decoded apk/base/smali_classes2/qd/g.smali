.class public Lqd/g;
.super Ljava/io/IOException;
.source ""


# instance fields
.field public final h:Ljava/io/File;

.field public final i:Ljava/io/File;

.field public final j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2, p3}, Lqd/d;->a(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lqd/g;->h:Ljava/io/File;

    iput-object p2, p0, Lqd/g;->i:Ljava/io/File;

    iput-object p3, p0, Lqd/g;->j:Ljava/lang/String;

    return-void
.end method
