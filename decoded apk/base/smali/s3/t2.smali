.class public Ls3/t2;
.super Ljava/io/IOException;
.source ""


# instance fields
.field public final h:Z

.field public final i:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-boolean p3, p0, Ls3/t2;->h:Z

    iput p4, p0, Ls3/t2;->i:I

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;
    .locals 2

    new-instance v0, Ls3/t2;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1, v1}, Ls3/t2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    return-object v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;
    .locals 3

    new-instance v0, Ls3/t2;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v1, v2}, Ls3/t2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;
    .locals 3

    new-instance v0, Ls3/t2;

    const/4 v1, 0x1

    const/4 v2, 0x4

    invoke-direct {v0, p0, p1, v1, v2}, Ls3/t2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    return-object v0
.end method

.method public static d(Ljava/lang/String;)Ls3/t2;
    .locals 4

    new-instance v0, Ls3/t2;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, p0, v1, v2, v3}, Ls3/t2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    return-object v0
.end method
