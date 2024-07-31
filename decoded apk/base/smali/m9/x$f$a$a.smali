.class public final Lm9/x$f$a$a;
.super Lld/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm9/x$f$a;->emit(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lld/f;
    c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2"
    f = "SessionDatastore.kt"
    l = {
        0xe0
    }
    m = "emit"
.end annotation


# instance fields
.field public synthetic h:Ljava/lang/Object;

.field public i:I

.field public final synthetic j:Lm9/x$f$a;


# direct methods
.method public constructor <init>(Lm9/x$f$a;Ljd/d;)V
    .locals 0

    iput-object p1, p0, Lm9/x$f$a$a;->j:Lm9/x$f$a;

    invoke-direct {p0, p2}, Lld/d;-><init>(Ljd/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lm9/x$f$a$a;->h:Ljava/lang/Object;

    iget p1, p0, Lm9/x$f$a$a;->i:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lm9/x$f$a$a;->i:I

    iget-object p1, p0, Lm9/x$f$a$a;->j:Lm9/x$f$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lm9/x$f$a;->emit(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
