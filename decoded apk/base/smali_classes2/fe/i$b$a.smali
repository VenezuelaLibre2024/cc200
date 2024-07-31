.class public final Lfe/i$b$a;
.super Lld/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfe/i$b;->emit(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lld/f;
    c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1"
    f = "Limit.kt"
    l = {
        0x25,
        0x26,
        0x28
    }
    m = "emit"
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lfe/i$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfe/i$b<",
            "TT;>;"
        }
    .end annotation
.end field

.field public l:I


# direct methods
.method public constructor <init>(Lfe/i$b;Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfe/i$b<",
            "-TT;>;",
            "Ljd/d<",
            "-",
            "Lfe/i$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfe/i$b$a;->k:Lfe/i$b;

    invoke-direct {p0, p2}, Lld/d;-><init>(Ljd/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lfe/i$b$a;->j:Ljava/lang/Object;

    iget p1, p0, Lfe/i$b$a;->l:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lfe/i$b$a;->l:I

    iget-object p1, p0, Lfe/i$b$a;->k:Lfe/i$b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lfe/i$b;->emit(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
