.class public final Lae/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lzd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lzd/b<",
        "Lxd/f;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/CharSequence;

.field public final b:I

.field public final c:I

.field public final d:Lsd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/p<",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/Integer;",
            "Lgd/j<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;IILsd/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "II",
            "Lsd/p<",
            "-",
            "Ljava/lang/CharSequence;",
            "-",
            "Ljava/lang/Integer;",
            "Lgd/j<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getNextMatch"

    invoke-static {p4, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lae/d;->a:Ljava/lang/CharSequence;

    iput p2, p0, Lae/d;->b:I

    iput p3, p0, Lae/d;->c:I

    iput-object p4, p0, Lae/d;->d:Lsd/p;

    return-void
.end method

.method public static final synthetic a(Lae/d;)Lsd/p;
    .locals 0

    iget-object p0, p0, Lae/d;->d:Lsd/p;

    return-object p0
.end method

.method public static final synthetic b(Lae/d;)Ljava/lang/CharSequence;
    .locals 0

    iget-object p0, p0, Lae/d;->a:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public static final synthetic c(Lae/d;)I
    .locals 0

    iget p0, p0, Lae/d;->c:I

    return p0
.end method

.method public static final synthetic d(Lae/d;)I
    .locals 0

    iget p0, p0, Lae/d;->b:I

    return p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lxd/f;",
            ">;"
        }
    .end annotation

    new-instance v0, Lae/d$a;

    invoke-direct {v0, p0}, Lae/d$a;-><init>(Lae/d;)V

    return-object v0
.end method
