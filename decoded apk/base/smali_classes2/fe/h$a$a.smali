.class public final Lfe/h$a$a;
.super Lld/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfe/h$a;->a(Lfe/c;Ljd/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lld/f;
    c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1"
    f = "Errors.kt"
    l = {
        0x72,
        0x73
    }
    m = "collect"
.end annotation


# instance fields
.field public synthetic h:Ljava/lang/Object;

.field public i:I

.field public final synthetic j:Lfe/h$a;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lfe/h$a;Ljd/d;)V
    .locals 0

    iput-object p1, p0, Lfe/h$a$a;->j:Lfe/h$a;

    invoke-direct {p0, p2}, Lld/d;-><init>(Ljd/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lfe/h$a$a;->h:Ljava/lang/Object;

    iget p1, p0, Lfe/h$a$a;->i:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lfe/h$a$a;->i:I

    iget-object p1, p0, Lfe/h$a$a;->j:Lfe/h$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lfe/h$a;->a(Lfe/c;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
