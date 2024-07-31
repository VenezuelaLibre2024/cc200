.class public final Lm9/c0$d;
.super Lld/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm9/c0;->j(Ljd/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lld/f;
    c = "com.google.firebase.sessions.SessionFirelogPublisherImpl"
    f = "SessionFirelogPublisher.kt"
    l = {
        0x5d
    }
    m = "shouldLogSession"
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lm9/c0;

.field public k:I


# direct methods
.method public constructor <init>(Lm9/c0;Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm9/c0;",
            "Ljd/d<",
            "-",
            "Lm9/c0$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lm9/c0$d;->j:Lm9/c0;

    invoke-direct {p0, p2}, Lld/d;-><init>(Ljd/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lm9/c0$d;->i:Ljava/lang/Object;

    iget p1, p0, Lm9/c0$d;->k:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lm9/c0$d;->k:I

    iget-object p1, p0, Lm9/c0$d;->j:Lm9/c0;

    invoke-static {p1, p0}, Lm9/c0;->f(Lm9/c0;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
