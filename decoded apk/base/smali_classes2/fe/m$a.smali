.class public final Lfe/m$a;
.super Lld/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfe/m;->a(Lfe/c;Ljd/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lld/f;
    c = "kotlinx.coroutines.flow.StateFlowImpl"
    f = "StateFlow.kt"
    l = {
        0x180,
        0x18c,
        0x191
    }
    m = "collect"
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Lfe/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfe/m<",
            "TT;>;"
        }
    .end annotation
.end field

.field public o:I


# direct methods
.method public constructor <init>(Lfe/m;Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfe/m<",
            "TT;>;",
            "Ljd/d<",
            "-",
            "Lfe/m$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfe/m$a;->n:Lfe/m;

    invoke-direct {p0, p2}, Lld/d;-><init>(Ljd/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lfe/m$a;->m:Ljava/lang/Object;

    iget p1, p0, Lfe/m$a;->o:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lfe/m$a;->o:I

    iget-object p1, p0, Lfe/m$a;->n:Lfe/m;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lfe/m;->a(Lfe/c;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
