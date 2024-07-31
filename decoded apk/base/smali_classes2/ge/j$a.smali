.class public final synthetic Lge/j$a;
.super Ltd/k;
.source ""

# interfaces
.implements Lsd/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lge/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltd/k;",
        "Lsd/q<",
        "Lfe/c<",
        "-",
        "Ljava/lang/Object;",
        ">;",
        "Ljava/lang/Object;",
        "Ljd/d<",
        "-",
        "Lgd/s;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final h:Lge/j$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lge/j$a;

    invoke-direct {v0}, Lge/j$a;-><init>()V

    sput-object v0, Lge/j$a;->h:Lge/j$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-class v2, Lfe/c;

    const/4 v1, 0x3

    const-string v3, "emit"

    const-string v4, "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ltd/k;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfe/c;

    check-cast p3, Ljd/d;

    invoke-virtual {p0, p1, p2, p3}, Lge/j$a;->c(Lfe/c;Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lfe/c;Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfe/c<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Object;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p1, p2, p3}, Lfe/c;->emit(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
