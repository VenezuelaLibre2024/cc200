.class public final Lzd/e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lzd/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzd/e;->b(Lsd/p;)Lzd/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lzd/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lsd/p;


# direct methods
.method public constructor <init>(Lsd/p;)V
    .locals 0

    iput-object p1, p0, Lzd/e$a;->a:Lsd/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lzd/e$a;->a:Lsd/p;

    invoke-static {v0}, Lzd/e;->a(Lsd/p;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
