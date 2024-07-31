.class public final Lg6/m1;
.super Lg6/v;
.source ""


# instance fields
.field public final synthetic d:Lg6/v$a;


# direct methods
.method public constructor <init>(Lg6/v$a;[Le6/d;ZI)V
    .locals 0

    iput-object p1, p0, Lg6/m1;->d:Lg6/v$a;

    invoke-direct {p0, p2, p3, p4}, Lg6/v;-><init>([Le6/d;ZI)V

    return-void
.end method


# virtual methods
.method public final b(Lf6/a$b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    iget-object v0, p0, Lg6/m1;->d:Lg6/v$a;

    invoke-static {v0}, Lg6/v$a;->f(Lg6/v$a;)Lg6/q;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lg6/q;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
