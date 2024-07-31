.class public final Lfe/j$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfe/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfe/j;->a(Lfe/b;Ljd/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfe/c<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic h:Ltd/w;


# direct methods
.method public constructor <init>(Ltd/w;)V
    .locals 0

    iput-object p1, p0, Lfe/j$a;->h:Ltd/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public emit(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lfe/j$a;->h:Ltd/w;

    iput-object p1, p2, Ltd/w;->h:Ljava/lang/Object;

    new-instance p1, Lge/a;

    invoke-direct {p1, p0}, Lge/a;-><init>(Lfe/c;)V

    throw p1
.end method
