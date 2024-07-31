.class public Lg6/v$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg6/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Lf6/a$b;",
        "ResultT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Lg6/q;

.field public b:Z

.field public c:[Le6/d;

.field public d:I


# direct methods
.method public synthetic constructor <init>(Lg6/n1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lg6/v$a;->b:Z

    const/4 p1, 0x0

    iput p1, p0, Lg6/v$a;->d:I

    return-void
.end method

.method public static bridge synthetic f(Lg6/v$a;)Lg6/q;
    .locals 0

    iget-object p0, p0, Lg6/v$a;->a:Lg6/q;

    return-object p0
.end method


# virtual methods
.method public a()Lg6/v;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg6/v<",
            "TA;TResultT;>;"
        }
    .end annotation

    iget-object v0, p0, Lg6/v$a;->a:Lg6/q;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "execute parameter required"

    invoke-static {v0, v1}, Lh6/s;->b(ZLjava/lang/Object;)V

    new-instance v0, Lg6/m1;

    iget-object v1, p0, Lg6/v$a;->c:[Le6/d;

    iget-boolean v2, p0, Lg6/v$a;->b:Z

    iget v3, p0, Lg6/v$a;->d:I

    invoke-direct {v0, p0, v1, v2, v3}, Lg6/m1;-><init>(Lg6/v$a;[Le6/d;ZI)V

    return-object v0
.end method

.method public b(Lg6/q;)Lg6/v$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg6/q<",
            "TA;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "TResultT;>;>;)",
            "Lg6/v$a<",
            "TA;TResultT;>;"
        }
    .end annotation

    iput-object p1, p0, Lg6/v$a;->a:Lg6/q;

    return-object p0
.end method

.method public c(Z)Lg6/v$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lg6/v$a<",
            "TA;TResultT;>;"
        }
    .end annotation

    iput-boolean p1, p0, Lg6/v$a;->b:Z

    return-object p0
.end method

.method public varargs d([Le6/d;)Lg6/v$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Le6/d;",
            ")",
            "Lg6/v$a<",
            "TA;TResultT;>;"
        }
    .end annotation

    iput-object p1, p0, Lg6/v$a;->c:[Le6/d;

    return-object p0
.end method

.method public e(I)Lg6/v$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lg6/v$a<",
            "TA;TResultT;>;"
        }
    .end annotation

    iput p1, p0, Lg6/v$a;->d:I

    return-object p0
.end method
