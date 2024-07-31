.class public final Lzd/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lzd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lzd/b<",
        "TR;>;"
    }
.end annotation


# instance fields
.field public final a:Lzd/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzd/b<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Lsd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/l<",
            "TT;TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzd/b;Lsd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzd/b<",
            "+TT;>;",
            "Lsd/l<",
            "-TT;+TR;>;)V"
        }
    .end annotation

    const-string v0, "sequence"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transformer"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/j;->a:Lzd/b;

    iput-object p2, p0, Lzd/j;->b:Lsd/l;

    return-void
.end method

.method public static final synthetic a(Lzd/j;)Lzd/b;
    .locals 0

    iget-object p0, p0, Lzd/j;->a:Lzd/b;

    return-object p0
.end method

.method public static final synthetic b(Lzd/j;)Lsd/l;
    .locals 0

    iget-object p0, p0, Lzd/j;->b:Lsd/l;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TR;>;"
        }
    .end annotation

    new-instance v0, Lzd/j$a;

    invoke-direct {v0, p0}, Lzd/j$a;-><init>(Lzd/j;)V

    return-object v0
.end method
