.class public final Lu0/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lu0/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu0/c;

    invoke-direct {v0}, Lu0/c;-><init>()V

    sput-object v0, Lu0/c;->a:Lu0/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ls0/b;Ljava/util/List;Lce/p0;Lsd/a;)Lr0/f;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls0/b<",
            "Lu0/d;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lr0/d<",
            "Lu0/d;",
            ">;>;",
            "Lce/p0;",
            "Lsd/a<",
            "+",
            "Ljava/io/File;",
            ">;)",
            "Lr0/f<",
            "Lu0/d;",
            ">;"
        }
    .end annotation

    const-string v0, "migrations"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p3, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "produceFile"

    invoke-static {p4, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lr0/g;->a:Lr0/g;

    sget-object v2, Lu0/h;->a:Lu0/h;

    new-instance v6, Lu0/c$a;

    invoke-direct {v6, p4}, Lu0/c$a;-><init>(Lsd/a;)V

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-virtual/range {v1 .. v6}, Lr0/g;->a(Lr0/k;Ls0/b;Ljava/util/List;Lce/p0;Lsd/a;)Lr0/f;

    move-result-object p1

    new-instance p2, Lu0/b;

    invoke-direct {p2, p1}, Lu0/b;-><init>(Lr0/f;)V

    return-object p2
.end method
