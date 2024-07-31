.class public Lt2/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:Ls2/c;

.field public static b:Ls2/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt2/c;

    invoke-direct {v0}, Lt2/c;-><init>()V

    sput-object v0, Lt2/a;->a:Ls2/c;

    new-instance v0, Lt2/b;

    invoke-direct {v0}, Lt2/b;-><init>()V

    sput-object v0, Lt2/a;->b:Ls2/b;

    new-instance v0, Lt2/d;

    invoke-direct {v0}, Lt2/d;-><init>()V

    invoke-static {v0}, Ls2/a;->p(Ls2/d;)V

    return-void
.end method

.method public static a(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ls2/f;

    invoke-direct {v0, p0}, Ls2/f;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, Ls2/a;->f(Ls2/f;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Ls2/a;->o(Ljava/lang/String;)V

    return-void
.end method
