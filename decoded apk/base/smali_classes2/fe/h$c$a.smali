.class public final Lfe/h$c$a;
.super Lld/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfe/h$c;->emit(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lld/f;
    c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2"
    f = "Errors.kt"
    l = {
        0x9e
    }
    m = "emit"
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lfe/h$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfe/h$c<",
            "TT;>;"
        }
    .end annotation
.end field

.field public k:I


# direct methods
.method public constructor <init>(Lfe/h$c;Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfe/h$c<",
            "-TT;>;",
            "Ljd/d<",
            "-",
            "Lfe/h$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfe/h$c$a;->j:Lfe/h$c;

    invoke-direct {p0, p2}, Lld/d;-><init>(Ljd/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lfe/h$c$a;->i:Ljava/lang/Object;

    iget p1, p0, Lfe/h$c$a;->k:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lfe/h$c$a;->k:I

    iget-object p1, p0, Lfe/h$c$a;->j:Lfe/h$c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lfe/h$c;->emit(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
