.class public final Lg6/d1;
.super Lg6/x;
.source ""


# instance fields
.field public final synthetic b:Lg6/p$a;


# direct methods
.method public constructor <init>(Lg6/p$a;Lg6/j$a;)V
    .locals 0

    iput-object p1, p0, Lg6/d1;->b:Lg6/p$a;

    invoke-direct {p0, p2}, Lg6/x;-><init>(Lg6/j$a;)V

    return-void
.end method


# virtual methods
.method public final b(Lf6/a$b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/a$b;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lg6/d1;->b:Lg6/p$a;

    invoke-static {v0}, Lg6/p$a;->g(Lg6/p$a;)Lg6/q;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lg6/q;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
