.class public final Lfe/a$a;
.super Lld/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfe/a;->a(Lfe/c;Ljd/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lld/f;
    c = "kotlinx.coroutines.flow.AbstractFlow"
    f = "Flow.kt"
    l = {
        0xe6
    }
    m = "collect"
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lfe/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfe/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public k:I


# direct methods
.method public constructor <init>(Lfe/a;Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfe/a<",
            "TT;>;",
            "Ljd/d<",
            "-",
            "Lfe/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfe/a$a;->j:Lfe/a;

    invoke-direct {p0, p2}, Lld/d;-><init>(Ljd/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lfe/a$a;->i:Ljava/lang/Object;

    iget p1, p0, Lfe/a$a;->k:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lfe/a$a;->k:I

    iget-object p1, p0, Lfe/a$a;->j:Lfe/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lfe/a;->a(Lfe/c;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
