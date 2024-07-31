.class public abstract Lg6/v;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg6/v$a;
    }
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
.field public final a:[Le6/d;

.field public final b:Z

.field public final c:I


# direct methods
.method public constructor <init>([Le6/d;ZI)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/v;->a:[Le6/d;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Lg6/v;->b:Z

    iput p3, p0, Lg6/v;->c:I

    return-void
.end method

.method public static a()Lg6/v$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lf6/a$b;",
            "ResultT:",
            "Ljava/lang/Object;",
            ">()",
            "Lg6/v$a<",
            "TA;TResultT;>;"
        }
    .end annotation

    new-instance v0, Lg6/v$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg6/v$a;-><init>(Lg6/n1;)V

    return-object v0
.end method


# virtual methods
.method public abstract b(Lf6/a$b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "TResultT;>;)V"
        }
    .end annotation
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lg6/v;->b:Z

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lg6/v;->c:I

    return v0
.end method

.method public final e()[Le6/d;
    .locals 1

    iget-object v0, p0, Lg6/v;->a:[Le6/d;

    return-object v0
.end method
