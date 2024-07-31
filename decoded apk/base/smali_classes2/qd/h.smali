.class public final Lqd/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lzd/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqd/h$c;,
        Lqd/h$a;,
        Lqd/h$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lzd/b<",
        "Ljava/io/File;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/io/File;

.field public final b:Lqd/i;

.field public final c:Lsd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/l<",
            "Ljava/io/File;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lsd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/l<",
            "Ljava/io/File;",
            "Lgd/s;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lsd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/p<",
            "Ljava/io/File;",
            "Ljava/io/IOException;",
            "Lgd/s;",
            ">;"
        }
    .end annotation
.end field

.field public final f:I


# direct methods
.method public constructor <init>(Ljava/io/File;Lqd/i;)V
    .locals 10

    const-string v0, "start"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "direction"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x20

    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v9}, Lqd/h;-><init>(Ljava/io/File;Lqd/i;Lsd/l;Lsd/l;Lsd/p;IILtd/g;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lqd/i;Lsd/l;Lsd/l;Lsd/p;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lqd/i;",
            "Lsd/l<",
            "-",
            "Ljava/io/File;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lsd/l<",
            "-",
            "Ljava/io/File;",
            "Lgd/s;",
            ">;",
            "Lsd/p<",
            "-",
            "Ljava/io/File;",
            "-",
            "Ljava/io/IOException;",
            "Lgd/s;",
            ">;I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqd/h;->a:Ljava/io/File;

    iput-object p2, p0, Lqd/h;->b:Lqd/i;

    iput-object p3, p0, Lqd/h;->c:Lsd/l;

    iput-object p4, p0, Lqd/h;->d:Lsd/l;

    iput-object p5, p0, Lqd/h;->e:Lsd/p;

    iput p6, p0, Lqd/h;->f:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/File;Lqd/i;Lsd/l;Lsd/l;Lsd/p;IILtd/g;)V
    .locals 7

    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    sget-object p2, Lqd/i;->h:Lqd/i;

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_1

    const p6, 0x7fffffff

    :cond_1
    move v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lqd/h;-><init>(Ljava/io/File;Lqd/i;Lsd/l;Lsd/l;Lsd/p;I)V

    return-void
.end method

.method public static final synthetic a(Lqd/h;)Lqd/i;
    .locals 0

    iget-object p0, p0, Lqd/h;->b:Lqd/i;

    return-object p0
.end method

.method public static final synthetic b(Lqd/h;)I
    .locals 0

    iget p0, p0, Lqd/h;->f:I

    return p0
.end method

.method public static final synthetic c(Lqd/h;)Lsd/l;
    .locals 0

    iget-object p0, p0, Lqd/h;->c:Lsd/l;

    return-object p0
.end method

.method public static final synthetic d(Lqd/h;)Lsd/p;
    .locals 0

    iget-object p0, p0, Lqd/h;->e:Lsd/p;

    return-object p0
.end method

.method public static final synthetic e(Lqd/h;)Lsd/l;
    .locals 0

    iget-object p0, p0, Lqd/h;->d:Lsd/l;

    return-object p0
.end method

.method public static final synthetic f(Lqd/h;)Ljava/io/File;
    .locals 0

    iget-object p0, p0, Lqd/h;->a:Ljava/io/File;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    new-instance v0, Lqd/h$b;

    invoke-direct {v0, p0}, Lqd/h$b;-><init>(Lqd/h;)V

    return-object v0
.end method
