.class public final Ld;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ld;

.field public static b:Lc;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld;

    invoke-direct {v0}, Ld;-><init>()V

    sput-object v0, Ld;->a:Ld;

    sget-object v0, Lc;->j:Lc;

    sput-object v0, Ld;->b:Lc;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic d(Ld;Lc;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Ld;->c(Lc;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "throwable"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc;->j:Lc;

    invoke-virtual {p0, v0, p1, p2}, Ld;->c(Lc;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 7

    const-string v0, "message"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lc;->i:Lc;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Ld;->d(Ld;Lc;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    return-void
.end method

.method public final c(Lc;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p1}, Lc;->c()I

    move-result p1

    sget-object v0, Ld;->b:Lc;

    invoke-virtual {v0}, Lc;->c()I

    move-result v0

    if-gt p1, v0, :cond_0

    const-string p1, "AudioPlayers"

    invoke-static {p1, p2, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method

.method public final e(Lc;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Ld;->b:Lc;

    return-void
.end method
