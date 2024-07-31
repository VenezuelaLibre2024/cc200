.class public final Lr0/g;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lr0/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr0/g;

    invoke-direct {v0}, Lr0/g;-><init>()V

    sput-object v0, Lr0/g;->a:Lr0/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lr0/k;Ls0/b;Ljava/util/List;Lce/p0;Lsd/a;)Lr0/f;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lr0/k<",
            "TT;>;",
            "Ls0/b<",
            "TT;>;",
            "Ljava/util/List<",
            "+",
            "Lr0/d<",
            "TT;>;>;",
            "Lce/p0;",
            "Lsd/a<",
            "+",
            "Ljava/io/File;",
            ">;)",
            "Lr0/f<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "serializer"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "migrations"

    invoke-static {p3, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p4, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "produceFile"

    invoke-static {p5, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    new-instance p2, Ls0/a;

    invoke-direct {p2}, Ls0/a;-><init>()V

    :cond_0
    move-object v4, p2

    sget-object p2, Lr0/e;->a:Lr0/e$a;

    invoke-virtual {p2, p3}, Lr0/e$a;->b(Ljava/util/List;)Lsd/p;

    move-result-object p2

    invoke-static {p2}, Lhd/m;->b(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance p2, Lr0/m;

    move-object v0, p2

    move-object v1, p5

    move-object v2, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lr0/m;-><init>(Lsd/a;Lr0/k;Ljava/util/List;Lr0/b;Lce/p0;)V

    return-object p2
.end method
