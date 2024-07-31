.class public final Lr0/m$g$b$a$a;
.super Lld/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr0/m$g$b$a;->emit(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lld/f;
    c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2"
    f = "SingleProcessDataStore.kt"
    l = {
        0x89
    }
    m = "emit"
.end annotation


# instance fields
.field public synthetic h:Ljava/lang/Object;

.field public i:I

.field public final synthetic j:Lr0/m$g$b$a;


# direct methods
.method public constructor <init>(Lr0/m$g$b$a;Ljd/d;)V
    .locals 0

    iput-object p1, p0, Lr0/m$g$b$a$a;->j:Lr0/m$g$b$a;

    invoke-direct {p0, p2}, Lld/d;-><init>(Ljd/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lr0/m$g$b$a$a;->h:Ljava/lang/Object;

    iget p1, p0, Lr0/m$g$b$a$a;->i:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lr0/m$g$b$a$a;->i:I

    iget-object p1, p0, Lr0/m$g$b$a$a;->j:Lr0/m$g$b$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lr0/m$g$b$a;->emit(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
