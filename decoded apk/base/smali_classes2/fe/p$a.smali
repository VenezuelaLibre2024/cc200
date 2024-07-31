.class public final Lfe/p$a;
.super Lld/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfe/p;->a(Ljd/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lld/f;
    c = "kotlinx.coroutines.flow.SubscribedFlowCollector"
    f = "Share.kt"
    l = {
        0x1a3,
        0x1a7
    }
    m = "onSubscription"
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lfe/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfe/p<",
            "TT;>;"
        }
    .end annotation
.end field

.field public l:I


# direct methods
.method public constructor <init>(Lfe/p;Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfe/p<",
            "TT;>;",
            "Ljd/d<",
            "-",
            "Lfe/p$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfe/p$a;->k:Lfe/p;

    invoke-direct {p0, p2}, Lld/d;-><init>(Ljd/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lfe/p$a;->j:Ljava/lang/Object;

    iget p1, p0, Lfe/p$a;->l:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lfe/p$a;->l:I

    iget-object p1, p0, Lfe/p$a;->k:Lfe/p;

    invoke-virtual {p1, p0}, Lfe/p;->a(Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
