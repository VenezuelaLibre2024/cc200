.class public abstract Lg6/o;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Lf6/a$b;",
        "L:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lg6/j;

.field public final b:[Le6/d;

.field public final c:Z

.field public final d:I


# direct methods
.method public constructor <init>(Lg6/j;[Le6/d;ZI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg6/j<",
            "T",
            "L;",
            ">;[",
            "Le6/d;",
            "ZI)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/o;->a:Lg6/j;

    iput-object p2, p0, Lg6/o;->b:[Le6/d;

    iput-boolean p3, p0, Lg6/o;->c:Z

    iput p4, p0, Lg6/o;->d:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lg6/o;->a:Lg6/j;

    invoke-virtual {v0}, Lg6/j;->a()V

    return-void
.end method

.method public b()Lg6/j$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg6/j$a<",
            "T",
            "L;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg6/o;->a:Lg6/j;

    invoke-virtual {v0}, Lg6/j;->b()Lg6/j$a;

    move-result-object v0

    return-object v0
.end method

.method public c()[Le6/d;
    .locals 1

    iget-object v0, p0, Lg6/o;->b:[Le6/d;

    return-object v0
.end method

.method public abstract d(Lf6/a$b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lg6/o;->d:I

    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lg6/o;->c:Z

    return v0
.end method
